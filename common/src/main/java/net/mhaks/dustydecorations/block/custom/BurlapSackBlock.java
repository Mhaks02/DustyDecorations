package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.mhaks.dustydecorations.ModConstants;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class BurlapSackBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {
    public static final IntegerProperty STACKED_SACKS = ModConstants.AMOUNT_3;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final MapCodec<BurlapSackBlock> CODEC = simpleCodec(BurlapSackBlock::new);

    public BurlapSackBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(defaultBlockState()
                .setValue(STACKED_SACKS, 1)
                .setValue(WATERLOGGED, false)
                .setValue(FACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    private static final VoxelShape SHAPE_ONE_NORTH =
            Block.box(3, 0, 2, 14, 5, 15);
    private static final VoxelShape SHAPE_TWO_NORTH =
            Block.box(2, 0, 2, 14, 11, 15);
    private static final VoxelShape SHAPE_THREE_NORTH =
            Block.box(1, 0, 2, 14, 16, 15);

    private static final VoxelShape SHAPE_ONE_SOUTH =
            Block.box(2, 0, 1, 13, 5, 14);
    private static final VoxelShape SHAPE_TWO_SOUTH =
            Block.box(2, 0, 1, 14, 11, 14);
    private static final VoxelShape SHAPE_THREE_SOUTH =
            Block.box(2, 0, 1, 15, 16, 14);

    private static final VoxelShape SHAPE_ONE_EAST =
            Block.box(1, 0, 3, 14, 5, 14);
    private static final VoxelShape SHAPE_TWO_EAST =
            Block.box(1, 0, 2, 14, 11, 14);
    private static final VoxelShape SHAPE_THREE_EAST =
            Block.box(1, 0, 1, 14, 16, 14);

    private static final VoxelShape SHAPE_ONE_WEST =
            Block.box(2, 0, 2, 15, 5, 13);
    private static final VoxelShape SHAPE_TWO_WEST =
            Block.box(2, 0, 2, 15, 11, 14);
    private static final VoxelShape SHAPE_THREE_WEST =
            Block.box(2, 0, 2, 15, 16, 15);

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch (state.getValue(STACKED_SACKS)) {
            case 2:
                return switch (state.getValue(FACING)) {
                    case SOUTH -> SHAPE_TWO_SOUTH;
                    case EAST -> SHAPE_TWO_EAST;
                    case WEST -> SHAPE_TWO_WEST;
                    default -> SHAPE_TWO_NORTH;
                };
            case 3:
                return switch (state.getValue(FACING)) {
                    case SOUTH -> SHAPE_THREE_SOUTH;
                    case EAST -> SHAPE_THREE_EAST;
                    case WEST -> SHAPE_THREE_WEST;
                    default -> SHAPE_THREE_NORTH;
                };
            case 1:
            default:
                return switch (state.getValue(FACING)) {
                    case SOUTH -> SHAPE_ONE_SOUTH;
                    case EAST -> SHAPE_ONE_EAST;
                    case WEST -> SHAPE_ONE_WEST;
                    default -> SHAPE_ONE_NORTH;
                };
        }
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState blockState = context.getLevel().getBlockState(context.getClickedPos());
        if (blockState.is(this)) {
            return blockState.setValue(STACKED_SACKS, Math.min(3, blockState.getValue(STACKED_SACKS) + 1));
        } else {
            FluidState fluidState = context.getLevel().getFluidState(context.getClickedPos());
            boolean flag = fluidState.getType() == Fluids.WATER;
            return super.getStateForPlacement(context)
                    .setValue(FACING, context.getHorizontalDirection().getOpposite())
                    .setValue(WATERLOGGED, flag);
        }
    }

    @Override
    protected BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        return super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }

    @Override
    protected boolean canBeReplaced(BlockState state, BlockPlaceContext useContext) {
        return !useContext.isSecondaryUseActive()
                && useContext.getItemInHand().is(this.asItem())
                && state.getValue(STACKED_SACKS) < 3
                || super.canBeReplaced(state, useContext);
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, STACKED_SACKS);
    }
}
