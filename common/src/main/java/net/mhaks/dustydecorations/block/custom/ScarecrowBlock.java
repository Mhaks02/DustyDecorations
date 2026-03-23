package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import net.mhaks.dustydecorations.block.entity.custom.ScarecrowBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.StringRepresentable;
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
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.Map;

public class ScarecrowBlock extends BaseEntityBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;
    private final ScarecrowBlock.Type type;
    public static final MapCodec<ScarecrowBlock> CODEC = RecordCodecBuilder.mapCodec(
            scarecrowBlockInstance -> scarecrowBlockInstance.group(ScarecrowBlock.Type.CODEC.fieldOf("kind").forGetter(ScarecrowBlock::getType), propertiesCodec()).apply(scarecrowBlockInstance, ScarecrowBlock::new)
    );

    public ScarecrowBlock(Type type, Properties properties) {
        super(properties);
        this.type = type;
        this.registerDefaultState(defaultBlockState()
                .setValue(HALF, DoubleBlockHalf.LOWER)
                .setValue(FACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
    }

    protected static final VoxelShape PUMPKIN_X_BOTTOM_AABB = Block.box(6, 0, 4, 10,16, 12);
    protected static final VoxelShape PUMPKIN_Z_BOTTOM_AABB = Block.box(4, 0, 6, 12, 16, 10);
    protected static final VoxelShape PUMPKIN_X_TOP_AABB = Shapes.or(Block.box(6, 0, 4, 10, 5, 12), Block.box(4, 5, 4, 12, 16, 12));
    protected static final VoxelShape PUMPKIN_Z_TOP_AABB = Shapes.or(Block.box(4, 0, 6, 12, 5, 10), Block.box(4, 5, 4, 12, 16, 12));
    protected static final VoxelShape PUMPKIN_X_TOP_BOTTOM_AABB = Shapes.or(PUMPKIN_X_TOP_AABB, PUMPKIN_X_BOTTOM_AABB.move(0, -1, 0));
    protected static final VoxelShape PUMPKIN_Z_TOP_BOTTOM_AABB = Shapes.or(PUMPKIN_Z_TOP_AABB, PUMPKIN_Z_BOTTOM_AABB.move(0, -1, 0));
    protected static final VoxelShape PUMPKIN_X_BOTTOM_UP_AABB = Shapes.or(PUMPKIN_X_BOTTOM_AABB, PUMPKIN_X_TOP_AABB.move(0, 1, 0));
    protected static final VoxelShape PUMPKIN_Z_BOTTOM_UP_AABB = Shapes.or(PUMPKIN_Z_BOTTOM_AABB, PUMPKIN_Z_TOP_AABB.move(0, 1, 0));

    protected static final VoxelShape BEETROOT_X_BOTTOM_AABB = Block.box(6, 0, 4, 10,16, 12);
    protected static final VoxelShape BEETROOT_Z_BOTTOM_AABB = Block.box(4, 0, 6, 12, 16, 10);
    protected static final VoxelShape BEETROOT_X_TOP_AABB = Shapes.or(Block.box(6, 0, 4, 10, 4, 12), Block.box(4, 4, 4, 12, 16, 12));
    protected static final VoxelShape BEETROOT_Z_TOP_AABB = Shapes.or(Block.box(4, 0, 6, 12, 4, 10), Block.box(4, 4, 4, 12, 16, 12));
    protected static final VoxelShape BEETROOT_X_TOP_BOTTOM_AABB = Shapes.or(BEETROOT_X_TOP_AABB, BEETROOT_X_BOTTOM_AABB.move(0, -1, 0));
    protected static final VoxelShape BEETROOT_Z_TOP_BOTTOM_AABB = Shapes.or(BEETROOT_Z_TOP_AABB, BEETROOT_Z_BOTTOM_AABB.move(0, -1, 0));
    protected static final VoxelShape BEETROOT_X_BOTTOM_UP_AABB = Shapes.or(BEETROOT_X_BOTTOM_AABB, BEETROOT_X_TOP_AABB.move(0, 1, 0));
    protected static final VoxelShape BEETROOT_Z_BOTTOM_UP_AABB = Shapes.or(BEETROOT_Z_BOTTOM_AABB, BEETROOT_Z_TOP_AABB.move(0, 1, 0));

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch (this.getType()) {
            case Types.BEETROOT:
                return switch (state.getValue(HALF)) {
                    case LOWER -> state.getValue(FACING).getAxis() == Direction.Axis.X ? BEETROOT_X_BOTTOM_UP_AABB : BEETROOT_Z_BOTTOM_UP_AABB;
                    case UPPER -> state.getValue(FACING).getAxis() == Direction.Axis.X ? BEETROOT_X_TOP_BOTTOM_AABB : BEETROOT_Z_TOP_BOTTOM_AABB;
                    };
            case Types.PUMPKIN:
            default:
                return switch (state.getValue(HALF)) {
                    case LOWER -> state.getValue(FACING).getAxis() == Direction.Axis.X ? PUMPKIN_X_BOTTOM_UP_AABB : PUMPKIN_Z_BOTTOM_UP_AABB;
                    case UPPER -> state.getValue(FACING).getAxis() == Direction.Axis.X ? PUMPKIN_X_TOP_BOTTOM_AABB : PUMPKIN_Z_TOP_BOTTOM_AABB;
                    };
        }
    }

    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState blockState = this.defaultBlockState()
                .setValue(FACING, context.getHorizontalDirection().getOpposite());
        return context.getClickedPos().getY() < context.getLevel().getMaxBuildHeight() - 1 && context.getLevel().getBlockState(context.getClickedPos().above()).canBeReplaced(context)
                ? blockState
                : null;
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

    @Override
    public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
        level.setBlock(pos.above(), state.setValue(HALF, DoubleBlockHalf.UPPER), 3);
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        BlockPos blockPos = pos.below();
        BlockState blockState = level.getBlockState(blockPos);
        return state.getValue(HALF) == DoubleBlockHalf.LOWER ? canSupportCenter(level, blockPos, Direction.UP) : blockState.is(this);
    }

    @Override
    protected BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor level, BlockPos currentPos, BlockPos facingPos) {
        DoubleBlockHalf doubleBlockHalf = state.getValue(HALF);
        if (facing.getAxis() != Direction.Axis.Y || doubleBlockHalf == DoubleBlockHalf.LOWER != (facing == Direction.UP)) {
            return doubleBlockHalf == DoubleBlockHalf.LOWER && facing == Direction.DOWN && !state.canSurvive(level, currentPos)
                    ? Blocks.AIR.defaultBlockState()
                    : super.updateShape(state, facing, facingState, level, currentPos, facingPos);
        } else {
            return facingState.getBlock() instanceof ScarecrowBlock && facingState.getValue(HALF) != doubleBlockHalf
                    ? facingState.setValue(HALF, doubleBlockHalf)
                    : Blocks.AIR.defaultBlockState();
        }
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
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, HALF);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ScarecrowBlockEntity(pos, state);
    }

    public ScarecrowBlock.Type getType() {
        return this.type;
    }

    public interface Type extends StringRepresentable {
        Map<String, Type> TYPES = new Object2ObjectArrayMap<>();
        Codec<ScarecrowBlock.Type> CODEC = Codec.stringResolver(StringRepresentable::getSerializedName, TYPES::get);
    }

    public enum Types implements ScarecrowBlock.Type {
        BEETROOT("beetroot"),
        PUMPKIN("pumpkin");

        private final String name;

        Types(String name) {
            this.name = name;
            TYPES.put(name, this);
        }

        @Override
        public String getSerializedName() {
            return this.name;
        }
    }
}
