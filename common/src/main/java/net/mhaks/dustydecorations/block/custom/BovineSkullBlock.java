package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class BovineSkullBlock extends FaceAttachedHorizontalDirectionalBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final MapCodec<BovineSkullBlock> CODEC = simpleCodec(BovineSkullBlock::new);

    public BovineSkullBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(defaultBlockState()
                .setValue(WATERLOGGED, false)
                .setValue(FACING, Direction.NORTH)
                .setValue(FACE, AttachFace.WALL));
    }

    @Override
    protected MapCodec<? extends FaceAttachedHorizontalDirectionalBlock> codec() {
        return CODEC;
    }

//    private static final VoxelShape CEILING_NORTH_AABB =
//            Shapes.or(Block.box(3.5, 11, 6, 12.5, 16, 14), Block.box(5.5, 12, 4, 10.5, 16, 6), Block.box(5.5, 12, 0, 10.5, 15, 4), Block.box(-0.5, 11, 11, 3.5, 13, 13), Block.box(12.5, 11, 11, 16.5, 13, 13), Block.box(-0.5, 7, 11, 1.5, 11, 13), Block.box(14.5, 7, 11, 16.5, 11, 13));
//    private static final VoxelShape CEILING_SOUTH_AABB =
//            Shapes.or(Block.box(3.5, 11, 2, 12.5, 16, 10), Block.box(5.5, 12, 10, 10.5, 16, 12), Block.box(5.5, 12, 12, 10.5, 15, 16), Block.box(12.5, 11, 3, 16.5, 13, 5), Block.box(-0.5, 11, 3, 3.5, 13, 5), Block.box(14.5, 7, 3, 16.5, 11, 5), Block.box(-0.5, 7, 3, 1.5, 11, 5));
//    private static final VoxelShape CEILING_EAST_AABB =
//            Shapes.or(Block.box(2, 11, 3.5, 10, 16, 12.5), Block.box(10, 12, 5.5, 12, 16, 10.5), Block.box(12, 12, 5.5, 16, 15, 10.5), Block.box(3, 11, -0.5, 5, 13, 3.5), Block.box(3, 11, 12.5, 5, 13, 16.5), Block.box(3, 7, -0.5, 5, 11, 1.5), Block.box(3, 7, 14.5, 5, 11, 16.5));
//    private static final VoxelShape CEILING_WEST_AABB =
//            Shapes.or(Block.box(6, 11, 3.5, 14, 16, 12.5), Block.box(4, 12, 5.5, 6, 16, 10.5), Block.box(0, 12, 5.5, 4, 15, 10.5), Block.box(11, 11, 12.5, 13, 13, 16.5), Block.box(11, 11, -0.5, 13, 13, 3.5), Block.box(11, 7, 14.5, 13, 11, 16.5), Block.box(11, 7, -0.5, 13, 11, 1.5));

    private static final VoxelShape FLOOR_NORTH_AABB =
            Shapes.or(Block.box(3.5, 0, 6, 12.5, 5, 14),
                    Block.box(5.5, 0, 4, 10.5, 4, 6),
                    Block.box(5.5, 1, 0, 10.5, 4, 4),
                    Block.box(12.5, 3, 11, 16.5, 5, 13),
                    Block.box(-0.5, 3, 11, 3.5, 5, 13),
                    Block.box(14.5, 5, 11, 16.5, 9, 13),
                    Block.box(-0.5, 5, 11, 1.5, 9, 13));
    private static final VoxelShape FLOOR_SOUTH_AABB =
            Shapes.or(Block.box(3.5, 0, 2, 12.5, 5, 10),
                    Block.box(5.5, 0, 10, 10.5, 4, 12),
                    Block.box(5.5, 1, 12, 10.5, 4, 16),
                    Block.box(-0.5, 3, 3, 3.5, 5, 5),
                    Block.box(12.5, 3, 3, 16.5, 5, 5),
                    Block.box(-0.5, 5, 3, 1.5, 9, 5),
                    Block.box(14.5, 5, 3, 16.5, 9, 5));
    private static final VoxelShape FLOOR_EAST_AABB =
            Shapes.or(Block.box(2, 0, 3.5, 10, 5, 12.5),
                    Block.box(10, 0, 5.5, 12, 4, 10.5),
                    Block.box(12, 1, 5.5, 16, 4, 10.5),
                    Block.box(3, 3, 12.5, 5, 5, 16.5),
                    Block.box(3, 3, -0.5, 5, 5, 3.5),
                    Block.box(3, 5, 14.5, 5, 9, 16.5),
                    Block.box(3, 5, -0.5, 5, 9, 1.5));
    private static final VoxelShape FLOOR_WEST_AABB =
            Shapes.or(Block.box(6, 0, 3.5, 14, 5, 12.5),
                    Block.box(4, 0, 5.5, 6, 4, 10.5),
                    Block.box(0, 1, 5.5, 4, 4, 10.5),
                    Block.box(11, 3, -0.5, 13, 5, 3.5),
                    Block.box(11, 3, 12.5, 13, 5, 16.5),
                    Block.box(11, 5, -0.5, 13, 9, 1.5),
                    Block.box(11, 5, 14.5, 13, 9, 16.5));

    private static final VoxelShape WALL_NORTH_AABB =
            Shapes.or(Block.box(3.5, 6, 11, 12.5, 14, 16),
                    Block.box(5.5, 4, 12, 10.5, 6, 16),
                    Block.box(5.5, 0, 12, 10.5, 4, 15),
                    Block.box(12.5, 11, 11, 16.5, 13, 13),
                    Block.box(-0.5, 11, 11, 3.5, 13, 13),
                    Block.box(14.5, 11, 7, 16.5, 13, 11),
                    Block.box(-0.5, 11, 7, 1.5, 13, 11));
    private static final VoxelShape WALL_SOUTH_AABB =
            Shapes.or(Block.box(3.5, 6, 0, 12.5, 14, 5),
                    Block.box(5.5, 4, 0, 10.5, 6, 4),
                    Block.box(5.5, 0, 1, 10.5, 4, 4),
                    Block.box(-0.5, 11, 3, 3.5, 13, 5),
                    Block.box(12.5, 11, 3, 16.5, 13, 5),
                    Block.box(-0.5, 11, 5, 1.5, 13, 9),
                    Block.box(14.5, 11, 5, 16.5, 13, 9));
    private static final VoxelShape WALL_EAST_AABB =
            Shapes.or(Block.box(0, 6, 3.5, 5, 14, 12.5),
                    Block.box(0, 4, 5.5, 4, 6, 10.5),
                    Block.box(1, 0, 5.5, 4, 4, 10.5),
                    Block.box(3, 11, 12.5, 5, 13, 16.5),
                    Block.box(3, 11, -0.5, 5, 13, 3.5),
                    Block.box(5, 11, 14.5, 9, 13, 16.5),
                    Block.box(5, 11, -0.5, 9, 13, 1.5));
    private static final VoxelShape WALL_WEST_AABB =
            Shapes.or(Block.box(11, 6, 3.5, 16, 14, 12.5),
                    Block.box(12, 4, 5.5, 16, 6, 10.5),
                    Block.box(12, 0, 5.5, 15, 4, 10.5),
                    Block.box(11, 11, -0.5, 13, 13, 3.5),
                    Block.box(11, 11, 12.5, 13, 13, 16.5),
                    Block.box(7, 11, -0.5, 11, 13, 1.5),
                    Block.box(7, 11, 14.5, 11, 13, 16.5));

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch (state.getValue(FACE)) {
            case WALL:
                return switch (state.getValue(FACING)) {
                    case SOUTH -> WALL_SOUTH_AABB;
                    case EAST -> WALL_EAST_AABB;
                    case WEST -> WALL_WEST_AABB;
                    default -> WALL_NORTH_AABB;
                };
            case FLOOR:
            default:
                return switch (state.getValue(FACING)) {
                    case SOUTH -> FLOOR_SOUTH_AABB;
                    case EAST -> FLOOR_EAST_AABB;
                    case WEST -> FLOOR_WEST_AABB;
                    default -> FLOOR_NORTH_AABB;
                };
        }
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {

        for (Direction direction : context.getNearestLookingDirections()) {
            BlockState blockstate;
            if (direction.getAxis() == Direction.Axis.Y) {
                blockstate = this.defaultBlockState()
                        .setValue(FACE, direction == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR)
                        .setValue(FACING, context.getHorizontalDirection().getOpposite())
                        .setValue(WATERLOGGED, context.getLevel().getFluidState(context.getClickedPos()).is(Fluids.WATER));
            } else {
                blockstate = this.defaultBlockState()
                        .setValue(FACE, AttachFace.WALL)
                        .setValue(FACING, direction.getOpposite())
                        .setValue(WATERLOGGED, context.getLevel().getFluidState(context.getClickedPos()).is(Fluids.WATER));
            }
            if (blockstate.canSurvive(context.getLevel(), context.getClickedPos())) {
                return blockstate;
            }
        }
        return null;
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        return state.getValue(FACE) != AttachFace.CEILING;
    }

    @Override
    protected BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        return super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, FACE, WATERLOGGED);
    }
}
