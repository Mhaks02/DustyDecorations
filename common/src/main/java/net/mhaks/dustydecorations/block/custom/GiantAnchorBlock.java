package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class GiantAnchorBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
    public static final MapCodec<GiantAnchorBlock> CODEC = simpleCodec(GiantAnchorBlock::new);

    public GiantAnchorBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(defaultBlockState()
                .setValue(WATERLOGGED, false)
                .setValue(HALF, DoubleBlockHalf.LOWER)
                .setValue(FACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    protected static final VoxelShape X_AXIS_BASE = Shapes.or(
            Block.box(5, 0, 0, 11, 4, 16), Block.box(5, 4, 3, 11, 9, 13), Block.box(6, 9, 4, 10, 16, 12));
    protected static final VoxelShape Z_AXIS_BASE = Shapes.or(
            Block.box(0, 0, 5, 16, 4, 11), Block.box(3, 4, 5, 13, 9, 11), Block.box(4, 9, 6, 12, 16, 10));
    protected static final VoxelShape X_AXIS_SHAFT = Shapes.join(Block.box(6, 0, 4, 10, 16, 12), Block.box(0, 10, 6, 16, 14, 10), BooleanOp.ONLY_FIRST);
    protected static final VoxelShape Z_AXIS_SHAFT = Shapes.join(Block.box(4, 0, 6, 12, 16, 10), Block.box(6, 10, 0, 10, 14, 16), BooleanOp.ONLY_FIRST);

    protected static final VoxelShape X_AXIS_LOWER_AABB = Shapes.or(X_AXIS_BASE, X_AXIS_SHAFT.move(0, 1, 0));
    protected static final VoxelShape X_AXIS_UPPER_AABB = Shapes.or(X_AXIS_BASE.move(0, -1, 0), X_AXIS_SHAFT);
    protected static final VoxelShape Z_AXIS_LOWER_AABB = Shapes.or(Z_AXIS_BASE, Z_AXIS_SHAFT.move(0, 1, 0));
    protected static final VoxelShape Z_AXIS_UPPER_AABB = Shapes.or(Z_AXIS_BASE.move(0, -1, 0), Z_AXIS_SHAFT);


    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Direction.Axis facingAxis = state.getValue(FACING).getAxis();
        return switch (state.getValue(HALF)) {
            case LOWER -> facingAxis == Direction.Axis.X ? X_AXIS_LOWER_AABB : Z_AXIS_LOWER_AABB;
            case UPPER -> facingAxis == Direction.Axis.X ? X_AXIS_UPPER_AABB : Z_AXIS_UPPER_AABB;
        };
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        LevelAccessor level = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        BlockState blockState = this.defaultBlockState()
                .setValue(FACING, context.getHorizontalDirection().getOpposite())
                .setValue(WATERLOGGED, context.getLevel().getFluidState(context.getClickedPos()).is(Fluids.WATER));
        return blockPos.getY() < level.getMaxBuildHeight() - 1 && level.getBlockState(blockPos.above()).canBeReplaced(context)
                ? blockState
                : null;
    }

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        level.setBlock(pos.above(), state.setValue(HALF, DoubleBlockHalf.UPPER), 3);
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos blockPos = pos.below();
        BlockState blockState = level.getBlockState(blockPos);
        return state.getValue(HALF) == DoubleBlockHalf.LOWER || blockState.is(this);
    }

    @Override
    public BlockState playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (!level.isClientSide && player.isCreative()) {
            ScarecrowBlock.preventDropFromBottomPart(level, pos, state, player);
        }
        return super.playerWillDestroy(level, pos, state, player);
    }

    @Override
    protected BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        DoubleBlockHalf doubleBlockHalf = state.getValue(HALF);
        if (direction.getAxis() != Direction.Axis.Y || doubleBlockHalf == DoubleBlockHalf.LOWER != (direction == Direction.UP)) {
            return doubleBlockHalf == DoubleBlockHalf.LOWER && direction == Direction.DOWN && !state.canSurvive(level, pos)
                    ? Blocks.AIR.defaultBlockState()
                    : super.updateShape(state, direction, neighborState, level, pos, neighborPos);
        } else {
            return neighborState.getBlock() instanceof GiantAnchorBlock && neighborState.getValue(HALF) != doubleBlockHalf
                    ? neighborState.setValue(HALF, doubleBlockHalf)
                    : Blocks.AIR.defaultBlockState();
        }
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, HALF);
    }
}
