package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
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

public class EquineSkullBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {
    public static final EnumProperty<AttachFace> FACE = BlockStateProperties.ATTACH_FACE;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final MapCodec<EquineSkullBlock> CODEC = simpleCodec(EquineSkullBlock::new);

    public EquineSkullBlock(Properties properties) {
        super(properties);
        registerDefaultState(defaultBlockState()
                .setValue(WATERLOGGED, false));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

//    private static final VoxelShape CEILING_NORTH_AABB =
//            Shapes.or(
//                    Block.box(5, 11, 7, 11, 16, 14),
//                    Block.box(6, 11, 0, 10, 16, 7),
//                    Block.box(6, 11, 3, 10, 13, 7));
//    private static final VoxelShape CEILING_SOUTH_AABB =
//            Shapes.or(
//                    Block.box(5, 11, 2, 11, 16, 9),
//                    Block.box(6, 11, 9, 10, 16, 16),
//                    Block.box(6, 11, 9, 10, 13, 13));
//    private static final VoxelShape CEILING_EAST_AABB =
//            Shapes.or(
//                    Block.box(2, 11, 5, 9, 16, 11),
//                    Block.box(9, 11, 6, 16, 16, 10),
//                    Block.box(9, 11, 6, 13, 13, 10));
//    private static final VoxelShape CEILING_WEST_AABB =
//            Shapes.or(
//                    Block.box(7, 11, 5, 14, 16, 11),
//                    Block.box(0, 11, 6, 7, 16, 10),
//                    Block.box(3, 11, 6, 7, 13, 10));

    private static final VoxelShape FLOOR_NORTH_AABB =
            Shapes.or(
                    Block.box(5, 0, 7, 11, 5, 14),
                    Block.box(6, 0, 0, 10, 5, 7),
                    Block.box(6, 3, 3, 10, 5, 7));
    private static final VoxelShape FLOOR_SOUTH_AABB =
            Shapes.or(
                    Block.box(5, 0, 2, 11, 5, 9),
                    Block.box(6, 0, 9, 10, 5, 16),
                    Block.box(6, 3, 9, 10, 5, 13));
    private static final VoxelShape FLOOR_EAST_AABB =
            Shapes.or(
                    Block.box(2, 0, 5, 9, 5, 11),
                    Block.box(9, 0, 6, 16, 5, 10),
                    Block.box(9, 3, 6, 13, 5, 10));
    private static final VoxelShape FLOOR_WEST_AABB =
            Shapes.or(
                    Block.box(7, 0, 5, 14, 5, 11),
                    Block.box(0, 0, 6, 7, 5, 10),
                    Block.box(3, 3, 6, 7, 5, 10));

    private static final VoxelShape WALL_NORTH_AABB =
            Shapes.or(
                    Block.box(5, 7, 11, 11, 14, 16),
                    Block.box(6, 0, 11, 10, 7, 16),
                    Block.box(6, 3, 11, 10, 7, 13));
    private static final VoxelShape WALL_SOUTH_AABB =
            Shapes.or(
                    Block.box(5, 7, 0, 11, 14, 5),
                    Block.box(6, 0, 0, 10, 7, 5),
                    Block.box(6, 3, 3, 10, 7, 5));
    private static final VoxelShape WALL_EAST_AABB =
            Shapes.or(
                    Block.box(0, 7, 5, 5, 14, 11),
                    Block.box(0, 0, 6, 5, 7, 10),
                    Block.box(3, 3, 6, 5, 7, 10));
    private static final VoxelShape WALL_WEST_AABB =
            Shapes.or(
                    Block.box(11, 7, 5, 16, 14, 11),
                    Block.box(11, 0, 6, 16, 7, 10),
                    Block.box(11, 3, 6, 13, 7, 10));

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch (state.getValue(FACE)) {
            case WALL:
                return switch (state.getValue(FACING)) {
                    case NORTH, UP, DOWN -> WALL_NORTH_AABB;
                    case EAST -> WALL_EAST_AABB;
                    case WEST -> WALL_WEST_AABB;
                    default -> WALL_SOUTH_AABB;
                };
            case FLOOR:
            default:
                return switch (state.getValue(FACING)) {
                    case NORTH, UP, DOWN -> FLOOR_NORTH_AABB;
                    case EAST -> FLOOR_EAST_AABB;
                    case WEST -> FLOOR_WEST_AABB;
                    default -> FLOOR_SOUTH_AABB;
                };
        }
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        for (Direction direction : context.getNearestLookingDirections()) {
            BlockState blockstate;
            if (direction.getAxis() == Direction.Axis.Y) {
                blockstate = this.defaultBlockState()
                        .setValue(FACE, AttachFace.FLOOR)
                        .setValue(FACING, context.getHorizontalDirection().getOpposite())
                        .setValue(WATERLOGGED, context.getLevel().getFluidState(context.getClickedPos()).is(Fluids.WATER));
            } else {
                blockstate = this.defaultBlockState()
                        .setValue(FACE, AttachFace.WALL)
                        .setValue(FACING, context.getClickedFace())
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
