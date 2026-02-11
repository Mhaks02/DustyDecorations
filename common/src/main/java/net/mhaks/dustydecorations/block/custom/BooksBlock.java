package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
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
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class BooksBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {
    public static final IntegerProperty TEXTURE = IntegerProperty.create("texture", 0, 2);
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final MapCodec<BooksBlock> CODEC = simpleCodec(BooksBlock::new);

    public BooksBlock(Properties properties) {
        super(properties);
        registerDefaultState(defaultBlockState()
                .setValue(WATERLOGGED, false)
                .setValue(TEXTURE, 0));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    public static final VoxelShape SHAPE_NORTH = Stream.of(
            Block.box(12, 0, 7.75, 16, 10, 15.75),
            Block.box(8, 0, 8, 12, 8, 16),
            Block.box(4, 0, 7.5, 8, 12, 15.5),
            Block.box(0, 0, 8, 4, 9, 16)
    ).reduce((voxelShape, voxelShape2) -> Shapes.join(voxelShape, voxelShape2, BooleanOp.OR)).get();

    public static final VoxelShape SHAPE_SOUTH = Stream.of(
            Block.box(0, 0, 0.25, 4, 10, 8.25),
            Block.box(4, 0, 0, 8, 8, 8),
            Block.box(8, 0, 0.5, 12, 12, 8.5),
            Block.box(12, 0, 0, 16, 9, 8)
    ).reduce((voxelShape, voxelShape2) -> Shapes.join(voxelShape, voxelShape2, BooleanOp.OR)).get();

    public static final VoxelShape SHAPE_EAST = Stream.of(
            Block.box(0.25, 0, 12, 8.25, 10, 16),
            Block.box(0, 0, 8, 8, 8, 12),
            Block.box(0.5, 0, 4, 8.5, 12, 8),
            Block.box(0, 0, 0, 8, 9, 4)
    ).reduce((voxelShape, voxelShape2) -> Shapes.join(voxelShape, voxelShape2, BooleanOp.OR)).get();

    public static final VoxelShape SHAPE_WEST = Stream.of(
            Block.box(7.75, 0, 0, 15.75, 10, 4),
            Block.box(8, 0, 4, 16, 8, 8),
            Block.box(7.5, 0, 8, 15.5, 12, 12),
            Block.box(8, 0, 12, 16, 9, 16)
    ).reduce((voxelShape, voxelShape2) -> Shapes.join(voxelShape, voxelShape2, BooleanOp.OR)).get();


    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch (state.getValue(FACING)) {
            case NORTH -> {
                return SHAPE_NORTH;
            }
            case EAST -> {
                return SHAPE_EAST;
            }
            case WEST -> {
                return SHAPE_WEST;
            }
            default -> {
                return SHAPE_SOUTH;
            }
        }
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState()
                .setValue(FACING, context.getHorizontalDirection().getOpposite())
                .setValue(WATERLOGGED, context.getLevel().getFluidState(context.getClickedPos()).is(Fluids.WATER));
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
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
        super.onPlace(state, level, pos, oldState, movedByPiston);
        registerDefaultState(defaultBlockState()
                .setValue(TEXTURE, RandomSource.create().nextInt(0, 3)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, TEXTURE);
    }
}
