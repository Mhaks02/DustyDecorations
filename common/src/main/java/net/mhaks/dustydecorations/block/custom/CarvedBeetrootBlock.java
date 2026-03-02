package net.mhaks.dustydecorations.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class CarvedBeetrootBlock extends GourdBlock{

    public CarvedBeetrootBlock(Properties properties) {
        super(properties);
    }

    protected static final VoxelShape SHAPE_ONE_NORTH = Block.box(4.5, 0, 5, 11.5, 9, 12);
    protected static final VoxelShape SHAPE_ONE_SOUTH = Block.box(4.5, 0, 4, 11.5, 9, 11);
    protected static final VoxelShape SHAPE_ONE_EAST = Block.box(4, 0, 4.5, 11, 9, 11.5);
    protected static final VoxelShape SHAPE_ONE_WEST = Block.box(5, 0, 4.5,12, 9, 11.5);

    protected static final VoxelShape SHAPE_TWO_NORTH_SOUTH = Block.box(0.5, 0, 3.5, 15.5, 9, 12.5);
    protected static final VoxelShape SHAPE_TWO_EAST_WEST = Block.box(3.5, 0, 0.5, 12.5, 9, 15.5);

    protected static final VoxelShape SHAPE_THREE_NORTH_SOUTH = Block.box(0.5, 0, 3.5, 15.5, 13, 12.5);
    protected static final VoxelShape SHAPE_THREE_EAST_WEST = Block.box(3.5, 0, 0.5, 12.5, 13, 15.5);

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(AMOUNT)) {
            case 2 -> switch (state.getValue(FACING)) {
                case EAST, WEST -> SHAPE_TWO_EAST_WEST;
                default -> SHAPE_TWO_NORTH_SOUTH;
            };
            case 3 -> switch (state.getValue(FACING)) {
                case EAST, WEST -> SHAPE_THREE_EAST_WEST;
                default -> SHAPE_THREE_NORTH_SOUTH;
            };
            default -> switch (state.getValue(FACING)) {
                case NORTH -> SHAPE_ONE_NORTH;
                case EAST -> SHAPE_ONE_EAST;
                case WEST -> SHAPE_ONE_WEST;
                default -> SHAPE_ONE_SOUTH;
            };
        };
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        return super.getStateForPlacement(context);
    }

    @Override
    protected boolean canBeReplaced(BlockState state, BlockPlaceContext useContext) {
        return super.canBeReplaced(state, useContext);
    }

    @Override
    protected BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        return super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        return super.getFluidState(state);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, AMOUNT);
    }
}
