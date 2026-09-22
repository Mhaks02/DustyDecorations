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

public class CanineSkullBlock extends FaceAttachedHorizontalDirectionalBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final MapCodec<CanineSkullBlock> CODEC = simpleCodec(CanineSkullBlock::new);

    public CanineSkullBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(defaultBlockState()
                .setValue(WATERLOGGED, false));
    }

    @Override
    protected MapCodec<? extends FaceAttachedHorizontalDirectionalBlock> codec() {
        return CODEC;
    }

//    private static final VoxelShape CEILING_NORTH_AABB =
//            Shapes.or(
//                    Block.box(5, 10, 8, 11, 15, 12),
//                    Block.box(6.5, 13, 4, 9.5, 16, 8));
//    private static final VoxelShape CEILING_SOUTH_AABB =
//            Shapes.or(
//                    Block.box(5, 10, 4, 11, 15, 8),
//                    Block.box(6.5, 13, 8, 9.5, 16, 12));
//    private static final VoxelShape CEILING_EAST_AABB =
//            Shapes.or(
//                    Block.box(4, 10, 5, 8, 15, 11),
//                    Block.box(8, 13, 6.5, 12, 16, 9.5));
//    private static final VoxelShape CEILING_WEST_AABB =
//            Shapes.or(
//                    Block.box(8, 10, 5, 12, 15, 11), 
//                    Block.box(4, 13, 6.5, 8, 16, 9.5));

    private static final VoxelShape FLOOR_NORTH_AABB =
            Shapes.or(Block.box(5, 1, 8, 11, 6, 12),
                    Block.box(6.5, 0, 4, 9.5, 3, 8));
    private static final VoxelShape FLOOR_SOUTH_AABB =
            Shapes.or(Block.box(5, 1, 4, 11, 6, 8),
                    Block.box(6.5, 0, 8, 9.5, 3, 12));
    private static final VoxelShape FLOOR_EAST_AABB =
            Shapes.or(Block.box(4, 1, 5, 8, 6, 11),
                    Block.box(8, 0, 6.5, 12, 3, 9.5));
    private static final VoxelShape FLOOR_WEST_AABB =
            Shapes.or(Block.box(8, 1, 5, 12, 6, 11),
                    Block.box(4, 0, 6.5, 8, 3, 9.5));

    private static final VoxelShape WALL_NORTH_AABB =
            Shapes.or(Block.box(5, 8, 10, 11, 12, 15),
                    Block.box(6.5, 4, 13, 9.5, 8, 16));
    private static final VoxelShape WALL_SOUTH_AABB =
            Shapes.or(Block.box(5, 8, 1, 11, 12, 6),
                    Block.box(6.5, 4, 0, 9.5, 8, 3));
    private static final VoxelShape WALL_EAST_AABB =
            Shapes.or(Block.box(1, 8, 5, 6, 12, 11),
                    Block.box(0, 4, 6.5, 3, 8, 9.5));
    private static final VoxelShape WALL_WEST_AABB =
            Shapes.or(Block.box(10, 8, 5, 15, 12, 11),
                    Block.box(13, 4, 6.5, 16, 8, 9.5));

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
