package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class WedgedKnifeBlock extends FaceAttachedHorizontalDirectionalBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final MapCodec<WedgedKnifeBlock> CODEC = simpleCodec(WedgedKnifeBlock::new);
    
    public WedgedKnifeBlock(Properties properties) {
        super(properties);
        registerDefaultState(defaultBlockState()
                .setValue(WATERLOGGED, false));
    }

    @Override
    protected MapCodec<? extends FaceAttachedHorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    private static final VoxelShape NORTH_AABB =
            Block.box(3, 4, 8, 6, 13, 16);
    private static final VoxelShape SOUTH_AABB =
            Block.box(10, 4, 0, 13, 13, 8);
    private static final VoxelShape EAST_AABB =
            Block.box(0, 4, 3, 9, 13, 6);
    private static final VoxelShape WEST_AABB =
            Block.box(8, 4, 10, 16, 13, 13);
    private static final VoxelShape FLOOR_AABB_SOUTH =
            Block.box(10, 0, 3, 13, 8, 12);
    private static final VoxelShape FLOOR_AABB_NORTH =
            Block.box(3, 0, 4, 6, 8, 13);
    private static final VoxelShape FLOOR_AABB_EAST =
            Block.box(3, 0, 3, 12, 8, 6);
    private static final VoxelShape FLOOR_AABB_WEST =
            Block.box(4, 0, 10, 13, 8, 13);
    private static final VoxelShape CEILING_AABB_SOUTH =
            Block.box(3, 8, 3, 6, 16, 12);
    private static final VoxelShape CEILING_AABB_NORTH =
            Block.box(10, 8, 4, 13, 16, 13);
    private static final VoxelShape CEILING_AABB_EAST =
            Block.box(3, 8, 10, 12, 16, 13);
    private static final VoxelShape CEILING_AABB_WEST =
            Block.box(4, 8, 3, 13, 16, 6);

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch (state.getValue(FACE)) {
            case FLOOR:
                if (state.getValue(FACING).getAxis() == Direction.Axis.X) {
                    switch (state.getValue(FACING).getAxisDirection()) {
                        case POSITIVE -> {
                            return FLOOR_AABB_EAST;
                        }
                        case NEGATIVE -> {
                            return FLOOR_AABB_WEST;
                        }
                    }
                }
                if (state.getValue(FACING).getAxisDirection() == Direction.AxisDirection.NEGATIVE) {
                    return FLOOR_AABB_NORTH;
                }
                return FLOOR_AABB_SOUTH;
            case WALL:
                return switch (state.getValue(FACING)) {
                    case NORTH, UP, DOWN -> NORTH_AABB;
                    case SOUTH -> SOUTH_AABB;
                    case EAST -> EAST_AABB;
                    case WEST -> WEST_AABB;
                };
            case CEILING:
            default:
                if (state.getValue(FACING).getAxis() == Direction.Axis.X) {
                    switch (state.getValue(FACING).getAxisDirection()) {
                        case POSITIVE -> {
                            return CEILING_AABB_EAST;
                        }
                        case NEGATIVE -> {
                            return CEILING_AABB_WEST;
                        }
                    }
                }
                if (state.getValue(FACING).getAxisDirection() == Direction.AxisDirection.NEGATIVE) {
                    return CEILING_AABB_NORTH;
                }
                return CEILING_AABB_SOUTH;
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
    protected BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor level, BlockPos currentPos, BlockPos facingPos) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        return getConnectedDirection(state).getOpposite() == facing && !state.canSurvive(level, currentPos)
                ? Blocks.AIR.defaultBlockState()
                : super.updateShape(state, facing, facingState, level, currentPos, facingPos);
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
