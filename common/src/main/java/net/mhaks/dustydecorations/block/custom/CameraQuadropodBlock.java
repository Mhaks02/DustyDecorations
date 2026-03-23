package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.block.entity.custom.CameraQuadropodBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class CameraQuadropodBlock extends BaseEntityBlock {
    public static final MapCodec<CameraQuadropodBlock> CODEC = simpleCodec(CameraQuadropodBlock::new);
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
    public static final EnumProperty<ModConstants.AttachedCamera> CAMERA = ModConstants.ATTACHED_CAMERA;
    public static final BooleanProperty LIT = BlockStateProperties.LIT;

    public CameraQuadropodBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(defaultBlockState()
                .setValue(CAMERA, ModConstants.AttachedCamera.NONE)
                .setValue(HALF, DoubleBlockHalf.LOWER)
                .setValue(LIT, false)
                .setValue(FACING, Direction.NORTH));
    }

    protected static final VoxelShape QUADROPOD_BOTTOM = Block.box(3, 0, 3, 13, 16, 13);
    protected static final VoxelShape QUADROPOD_TOP = Block.box(3, 0, 3, 13, 5, 13);
    protected static final VoxelShape QUADROPOD_X_AXIS_BOTTOM = Block.box(3, 0, 4, 13, 16, 12);
    protected static final VoxelShape QUADROPOD_Z_AXIS_BOTTOM = Block.box(4, 0, 3, 12, 16, 13);

    protected static final VoxelShape CAMERA_X_AXIS = Block.box(3, 0, 4, 13, 12.5, 12);
    protected static final VoxelShape CAMERA_Z_AXIS = Block.box(4, 0, 3, 12, 12.5, 13);

    protected static final VoxelShape QUADROPOD_BOTTOM_TOP = Shapes.or(QUADROPOD_BOTTOM, QUADROPOD_TOP.move(0, 1, 0));
    protected static final VoxelShape QUADROPOD_TOP_BOTTOM = Shapes.or(QUADROPOD_TOP, QUADROPOD_BOTTOM.move(0, -1, 0));

    protected static final VoxelShape CAMERA_X_AXIS_BOTTOM_TOP = Shapes.or(QUADROPOD_X_AXIS_BOTTOM, CAMERA_X_AXIS.move(0, 1, 0));
    protected static final VoxelShape CAMERA_X_AXIS_TOP_BOTTOM = Shapes.or(CAMERA_X_AXIS, QUADROPOD_X_AXIS_BOTTOM.move(0, -1, 0));
    protected static final VoxelShape CAMERA_Z_AXIS_BOTTOM_TOP = Shapes.or(QUADROPOD_Z_AXIS_BOTTOM, CAMERA_Z_AXIS.move(0, 1, 0));
    protected static final VoxelShape CAMERA_Z_AXIS_TOP_BOTTOM = Shapes.or(CAMERA_Z_AXIS, QUADROPOD_Z_AXIS_BOTTOM.move(0, -1, 0));

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(HALF)) {
            case LOWER -> switch (state.getValue(CAMERA)) {
                case NONE -> QUADROPOD_BOTTOM_TOP;
                case CAMERA, MOVIE_CAMERA -> state.getValue(FACING).getAxis() == Direction.Axis.X ? CAMERA_X_AXIS_BOTTOM_TOP : CAMERA_Z_AXIS_BOTTOM_TOP;
            };
            case UPPER -> switch (state.getValue(CAMERA)) {
                case NONE -> QUADROPOD_TOP_BOTTOM;
                case CAMERA, MOVIE_CAMERA -> state.getValue(FACING).getAxis() == Direction.Axis.X ? CAMERA_X_AXIS_TOP_BOTTOM : CAMERA_Z_AXIS_TOP_BOTTOM;
            };
        };
    }

    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos blockPos = pos.below();
        BlockState blockState = level.getBlockState(blockPos);
        return state.getValue(HALF) != DoubleBlockHalf.UPPER || blockState.is(this);
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
            BlockState blockState = this.defaultBlockState()
                    .setValue(FACING, context.getHorizontalDirection())
                    .setValue(CAMERA, ModConstants.AttachedCamera.NONE)
                    .setValue(LIT, false);
            return context.getClickedPos().getY() < context.getLevel().getMaxBuildHeight() - 1 && context.getLevel().getBlockState(context.getClickedPos().above()).canBeReplaced(context)
                    ? blockState
                    : null;
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (state.getValue(CAMERA) == ModConstants.AttachedCamera.NONE) {
            if (stack.is(ModBlocks.CAMERA.get().asItem()) && !level.isClientSide) {
                level.setBlockAndUpdate(pos, state.setValue(CAMERA, ModConstants.AttachedCamera.CAMERA).setValue(FACING, player.getDirection()));
            }
            if (stack.is(ModBlocks.MOVIE_CAMERA.get().asItem()) && !level.isClientSide) {
                level.setBlockAndUpdate(pos, state.setValue(CAMERA, ModConstants.AttachedCamera.MOVIE_CAMERA).setValue(FACING, player.getDirection()));
            }
            return ItemInteractionResult.sidedSuccess(level.isClientSide);
        } else {
            return super.useItemOn(stack, state, level, pos, player, hand, hitResult);
        }
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        level.setBlock(pos.above(), state.setValue(HALF, DoubleBlockHalf.UPPER), 3);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (state.getValue(CAMERA) == ModConstants.AttachedCamera.MOVIE_CAMERA) {
            if (!level.isClientSide) {
                level.setBlockAndUpdate(pos, state.cycle(LIT));
            }
            return InteractionResult.sidedSuccess(level.isClientSide);
        } else {
            return InteractionResult.PASS;
        }
    }

    @Override
    protected BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        DoubleBlockHalf half = state.getValue(HALF);
        if (direction.getAxis() != Direction.Axis.Y || half == DoubleBlockHalf.LOWER != (direction == Direction.UP)) {
            return half == DoubleBlockHalf.LOWER && direction == Direction.DOWN && !state.canSurvive(level, pos)
                    ? Blocks.AIR.defaultBlockState()
                    : super.updateShape(state, direction, neighborState, level, pos, neighborPos);
        } else {
            return neighborState.getBlock() instanceof CameraQuadropodBlock && neighborState.getValue(HALF) != half
                    ? neighborState.setValue(HALF, half)
                    : Blocks.AIR.defaultBlockState();
        }
    }

    @Override
    public BlockState playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (!level.isClientSide) {
            if (player.isCreative()) {
                preventDropFromBottomPart(level, pos, state, player);
            }
        }
        return super.playerWillDestroy(level, pos, state, player);
    }

    public static void preventDropFromBottomPart(Level level, BlockPos pos, BlockState state, Player player) {
        DoubleBlockHalf doubleblockhalf = state.getValue(HALF);
        if (doubleblockhalf == DoubleBlockHalf.UPPER) {
            BlockPos blockpos = pos.below();
            BlockState blockstate = level.getBlockState(blockpos);
            if (blockstate.is(state.getBlock()) && blockstate.getValue(HALF) == DoubleBlockHalf.LOWER) {
                BlockState blockstate1 = blockstate.getFluidState().is(Fluids.WATER) ? Blocks.WATER.defaultBlockState() : Blocks.AIR.defaultBlockState();
                level.setBlock(blockpos, blockstate1, 35);
                level.levelEvent(player, 2001, blockpos, Block.getId(blockstate));
            }
        }
    }

    @Override
    protected BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    @Override
    protected BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, HALF, CAMERA, LIT);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new CameraQuadropodBlockEntity(pos, state);
    }
}
