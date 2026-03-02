package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.mhaks.dustydecorations.ModConstants;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
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

public class WrappedMeatBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final MapCodec<WrappedMeatBlock> CODEC = simpleCodec(WrappedMeatBlock::new);
    public static final IntegerProperty AMOUNT = ModConstants.AMOUNT_4;
    public final int MAX_AMOUNT = 4;

    public WrappedMeatBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(defaultBlockState()
                .setValue(FACING, Direction.NORTH)
                .setValue(WATERLOGGED, false)
                .setValue(AMOUNT, 1));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    protected static final VoxelShape SHAPE_ONE_Z = Block.box(4, 0, 3, 12, 6, 13);
    protected static final VoxelShape SHAPE_ONE_X = Block.box(3, 0, 4, 13, 6, 12);

    protected static final VoxelShape SHAPE_TWO = Block.box(1, 0, 1, 15, 8, 15);

    protected static final VoxelShape SHAPE_THREE_Z = Block.box(0, 0, 1, 16, 15, 14);
    protected static final VoxelShape SHAPE_THREE_X = Block.box(2, 0, 0, 15, 15, 16);

    protected static final VoxelShape SHAPE_FOUR_Z = Block.box(0, 0, 1, 16, 16, 15);
    protected static final VoxelShape SHAPE_FOUR_X = Block.box(1, 0, 0, 15, 16, 16);

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(AMOUNT)) {
            case 2 -> SHAPE_TWO;
            case 3 -> state.getValue(FACING).getAxis() == Direction.Axis.X ? SHAPE_THREE_X : SHAPE_THREE_Z;
            case 4 -> state.getValue(FACING).getAxis() == Direction.Axis.X ? SHAPE_FOUR_X : SHAPE_FOUR_Z;
            default -> state.getValue(FACING).getAxis() == Direction.Axis.X ? SHAPE_ONE_X : SHAPE_ONE_Z;
        };
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState blockState = level.getBlockState(pos);
        if (blockState.is(this)) {
            return blockState.setValue(AMOUNT, Math.min(MAX_AMOUNT, blockState.getValue(AMOUNT) + 1));
        } else {
            return super.getStateForPlacement(context)
                    .setValue(FACING, context.getHorizontalDirection().getOpposite())
                    .setValue(WATERLOGGED, level.getFluidState(pos).is(Fluids.WATER));
        }
    }

    @Override
    protected boolean canBeReplaced(BlockState state, BlockPlaceContext useContext) {
        return !useContext.isSecondaryUseActive()
                && useContext.getItemInHand().is(this.asItem())
                && state.getValue(AMOUNT) < MAX_AMOUNT
                || super.canBeReplaced(state, useContext);
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
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) :super.getFluidState(state);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, AMOUNT);
    }
}
