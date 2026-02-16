package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class GiantChainBlock extends FaceAttachedHorizontalDirectionalBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final MapCodec<GiantChainBlock> CODEC = simpleCodec(GiantChainBlock::new);

    public GiantChainBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(defaultBlockState()
                .setValue(WATERLOGGED, false));
    }

    @Override
    protected MapCodec<? extends FaceAttachedHorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    protected static final VoxelShape VERTICAL_EAST_WEST_LEFT_PART = Block.box(6, 2, 4, 10, 14, 6);
    protected static final VoxelShape VERTICAL_EAST_WEST_RIGHT_PART = Block.box(6, 2, 10, 10, 14, 12);
    protected static final VoxelShape VERTICAL_EAST_WEST_LOWER_MIDDLE_PART = Block.box(6, 2, 6, 10, 6, 10);
    protected static final VoxelShape VERTICAL_EAST_WEST_UPPER_MIDDLE_PART = Block.box(6, 10, 6, 10, 14, 10);
    protected static final VoxelShape VERTICAL_EAST_WEST_CENTRAL_LOOP = Shapes.or(VERTICAL_EAST_WEST_LEFT_PART, VERTICAL_EAST_WEST_RIGHT_PART, VERTICAL_EAST_WEST_LOWER_MIDDLE_PART, VERTICAL_EAST_WEST_UPPER_MIDDLE_PART);
    protected static final VoxelShape VERTICAL_EAST_WEST_LOWER_FRONT_PART = Block.box(4, 0, 6, 6, 6, 10);
    protected static final VoxelShape VERTICAL_EAST_WEST_LOWER_BACK_PART = Block.box(10, 0, 6, 12, 6, 10);
    protected static final VoxelShape VERTICAL_EAST_WEST_LOWER_HALF_LOOP = Shapes.or(VERTICAL_EAST_WEST_LOWER_FRONT_PART, VERTICAL_EAST_WEST_LOWER_BACK_PART);
    protected static final VoxelShape VERTICAL_EAST_WEST_UPPER_FRONT_PART = Block.box(4, 10, 6, 6, 16, 10);
    protected static final VoxelShape VERTICAL_EAST_WEST_UPPER_BACK_PART = Block.box(10, 10, 6, 12, 16, 10);
    protected static final VoxelShape VERTICAL_EAST_WEST_UPPER_HALF_LOOP = Shapes.or(VERTICAL_EAST_WEST_UPPER_FRONT_PART, VERTICAL_EAST_WEST_UPPER_BACK_PART);
    protected static final VoxelShape VERTICAL_EAST_WEST_SHAPE = Shapes.or(VERTICAL_EAST_WEST_CENTRAL_LOOP, VERTICAL_EAST_WEST_LOWER_HALF_LOOP, VERTICAL_EAST_WEST_UPPER_HALF_LOOP);

    protected static final VoxelShape VERTICAL_NORTH_SOUTH_LEFT_PART = Block.box(10, 2, 6, 12, 14, 10);
    protected static final VoxelShape VERTICAL_NORTH_SOUTH_RIGHT_PART = Block.box(4, 2, 6, 6, 14, 10);
    protected static final VoxelShape VERTICAL_NORTH_SOUTH_LOWER_MIDDLE_PART = Block.box(6, 2, 6, 10, 6, 10);
    protected static final VoxelShape VERTICAL_NORTH_SOUTH_UPPER_MIDDLE_PART = Block.box(6, 10, 6, 10, 14, 10);
    protected static final VoxelShape VERTICAL_NORTH_SOUTH_CENTRAL_LOOP = Shapes.or(VERTICAL_NORTH_SOUTH_LEFT_PART, VERTICAL_NORTH_SOUTH_RIGHT_PART, VERTICAL_NORTH_SOUTH_LOWER_MIDDLE_PART, VERTICAL_NORTH_SOUTH_UPPER_MIDDLE_PART);
    protected static final VoxelShape VERTICAL_NORTH_SOUTH_LOWER_FRONT_PART = Block.box(6, 0, 4, 10, 6, 6);
    protected static final VoxelShape VERTICAL_NORTH_SOUTH_LOWER_BACK_PART = Block.box(6, 0, 10, 10, 6, 12);
    protected static final VoxelShape VERTICAL_NORTH_SOUTH_LOWER_HALF_LOOP = Shapes.or(VERTICAL_NORTH_SOUTH_LOWER_FRONT_PART, VERTICAL_NORTH_SOUTH_LOWER_BACK_PART);
    protected static final VoxelShape VERTICAL_NORTH_SOUTH_UPPER_FRONT_PART = Block.box(6, 10, 4, 10, 16, 6);
    protected static final VoxelShape VERTICAL_NORTH_SOUTH_UPPER_BACK_PART = Block.box(6, 10, 10, 10, 16, 12);
    protected static final VoxelShape VERTICAL_NORTH_SOUTH_UPPER_HALF_LOOP = Shapes.or(VERTICAL_NORTH_SOUTH_UPPER_FRONT_PART, VERTICAL_NORTH_SOUTH_UPPER_BACK_PART);
    protected static final VoxelShape VERTICAL_NORTH_SOUTH_SHAPE = Shapes.or(VERTICAL_NORTH_SOUTH_CENTRAL_LOOP, VERTICAL_NORTH_SOUTH_LOWER_HALF_LOOP, VERTICAL_NORTH_SOUTH_UPPER_HALF_LOOP);

    protected static final VoxelShape HORIZONTAL_EAST_WEST_LEFT_PART = Block.box(2, 6, 4, 14, 10, 6);
    protected static final VoxelShape HORIZONTAL_EAST_WEST_RIGHT_PART = Block.box(2, 6, 10, 14, 10, 12);
    protected static final VoxelShape HORIZONTAL_EAST_WEST_LOWER_MIDDLE_PART = Block.box(2, 6, 6, 6, 10, 10);
    protected static final VoxelShape HORIZONTAL_EAST_WEST_UPPER_MIDDLE_PART = Block.box(10, 6, 6, 14,10, 10);
    protected static final VoxelShape HORIZONTAL_EAST_WEST_CENTRAL_LOOP = Shapes.or(HORIZONTAL_EAST_WEST_LEFT_PART, HORIZONTAL_EAST_WEST_RIGHT_PART, HORIZONTAL_EAST_WEST_LOWER_MIDDLE_PART, HORIZONTAL_EAST_WEST_UPPER_MIDDLE_PART);
    protected static final VoxelShape HORIZONTAL_EAST_WEST_LOWER_FRONT_PART = Block.box(0, 10, 6, 6, 12, 10);
    protected static final VoxelShape HORIZONTAL_EAST_WEST_LOWER_BACK_PART = Block.box(0, 4, 6, 6, 6, 10);
    protected static final VoxelShape HORIZONTAL_EAST_WEST_LOWER_HALF_LOOP = Shapes.or(HORIZONTAL_EAST_WEST_LOWER_FRONT_PART, HORIZONTAL_EAST_WEST_LOWER_BACK_PART);
    protected static final VoxelShape HORIZONTAL_EAST_WEST_UPPER_FRONT_PART = Block.box(10, 10, 6, 16, 12, 10);
    protected static final VoxelShape HORIZONTAL_EAST_WEST_UPPER_BACK_PART = Block.box(10, 4, 6, 16, 6, 10);
    protected static final VoxelShape HORIZONTAL_EAST_WEST_UPPER_HALF_LOOP = Shapes.or(HORIZONTAL_EAST_WEST_UPPER_FRONT_PART, HORIZONTAL_EAST_WEST_UPPER_BACK_PART);
    protected static final VoxelShape HORIZONTAL_EAST_WEST_SHAPE = Shapes.or(HORIZONTAL_EAST_WEST_CENTRAL_LOOP, HORIZONTAL_EAST_WEST_LOWER_HALF_LOOP, HORIZONTAL_EAST_WEST_UPPER_HALF_LOOP);

    protected static final VoxelShape HORIZONTAL_NORTH_SOUTH_LEFT_PART = Block.box(10,6, 2, 12, 10, 14);
    protected static final VoxelShape HORIZONTAL_NORTH_SOUTH_RIGHT_PART = Block.box(4, 6, 2, 6, 10, 14);
    protected static final VoxelShape HORIZONTAL_NORTH_SOUTH_LOWER_MIDDLE_PART = Block.box(6, 6, 2, 10, 10, 6);
    protected static final VoxelShape HORIZONTAL_NORTH_SOUTH_UPPER_MIDDLE_PART = Block.box(6, 6, 10, 10, 10, 14);
    protected static final VoxelShape HORIZONTAL_NORTH_SOUTH_CENTRAL_LOOP = Shapes.or(HORIZONTAL_NORTH_SOUTH_LEFT_PART, HORIZONTAL_NORTH_SOUTH_RIGHT_PART, HORIZONTAL_NORTH_SOUTH_LOWER_MIDDLE_PART, HORIZONTAL_NORTH_SOUTH_UPPER_MIDDLE_PART);
    protected static final VoxelShape HORIZONTAL_NORTH_SOUTH_LOWER_FRONT_PART = Block.box(6, 10, 0, 10, 12, 6);
    protected static final VoxelShape HORIZONTAL_NORTH_SOUTH_LOWER_BACK_PART = Block.box(6, 4, 0, 10, 6, 6);
    protected static final VoxelShape HORIZONTAL_NORTH_SOUTH_LOWER_HALF_LOOP = Shapes.or(HORIZONTAL_NORTH_SOUTH_LOWER_FRONT_PART, HORIZONTAL_NORTH_SOUTH_LOWER_BACK_PART);
    protected static final VoxelShape HORIZONTAL_NORTH_SOUTH_UPPER_FRONT_PART = Block.box(6, 10, 10, 10, 12, 16);
    protected static final VoxelShape HORIZONTAL_NORTH_SOUTH_UPPER_BACK_PART = Block.box(6, 4, 10, 10, 6, 16);
    protected static final VoxelShape HORIZONTAL_NORTH_SOUTH_UPPER_HALF_LOOP = Shapes.or(HORIZONTAL_NORTH_SOUTH_UPPER_FRONT_PART, HORIZONTAL_NORTH_SOUTH_UPPER_BACK_PART);
    protected static final VoxelShape HORIZONTAL_NORTH_SOUTH_SHAPE = Shapes.or(HORIZONTAL_NORTH_SOUTH_CENTRAL_LOOP, HORIZONTAL_NORTH_SOUTH_LOWER_HALF_LOOP, HORIZONTAL_NORTH_SOUTH_UPPER_HALF_LOOP);

    protected VoxelShape getVoxelShape(BlockState state) {
        Direction direction = state.getValue(FACING);
        switch ((AttachFace) state.getValue(FACE)) {
            case FLOOR, CEILING:
                if (direction != Direction.NORTH && direction != Direction.SOUTH) {
                    return VERTICAL_EAST_WEST_SHAPE;
                }
                return VERTICAL_NORTH_SOUTH_SHAPE;
            case WALL:
                if (direction == Direction.NORTH || direction == Direction.SOUTH) {
                    return HORIZONTAL_NORTH_SOUTH_SHAPE;
                }
                return HORIZONTAL_EAST_WEST_SHAPE;
            default:
                return VERTICAL_EAST_WEST_SHAPE;
        }
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return this.getVoxelShape(state);
    }

    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return this.getVoxelShape(state);
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        return true;
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        for (Direction direction : context.getNearestLookingDirections()) {
            BlockState blockstate;
            if (direction.getAxis() == Direction.Axis.Y) {
                BlockState block = direction == Direction.UP ? context.getLevel().getBlockState(context.getClickedPos().above()) : context.getLevel().getBlockState(context.getClickedPos().below());
                blockstate = this.defaultBlockState()
                        .setValue(FACE, block.is(this) ? block.getValue(FACE) : direction == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR)
                        .setValue(FACING, block.is(this) ? block.getValue(FACING) : context.getHorizontalDirection())
                        .setValue(WATERLOGGED, context.getLevel().getFluidState(context.getClickedPos()).is(Fluids.WATER));
            } else {
                BlockState block = direction.getAxis() == Direction.Axis.X ? context.getLevel().getBlockState(context.getClickedPos().east()) : context.getLevel().getBlockState(context.getClickedPos().south());
                blockstate = this.defaultBlockState()
                        .setValue(FACE, AttachFace.WALL)
                        .setValue(FACING, block.is(this) ? block.getValue(FACING) : direction.getOpposite())
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
        return super.updateShape(state, facing, facingState, level, currentPos, facingPos);
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    protected BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    protected BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, FACE, WATERLOGGED);
    }
}
