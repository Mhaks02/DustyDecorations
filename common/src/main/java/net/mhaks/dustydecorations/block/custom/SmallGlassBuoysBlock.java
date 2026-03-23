package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.mhaks.dustydecorations.ModConstants;
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

public class SmallGlassBuoysBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final IntegerProperty TEXTURE = ModConstants.TEXTURE_3;
    public static final MapCodec<SmallGlassBuoysBlock> CODEC = simpleCodec(SmallGlassBuoysBlock::new);

    public SmallGlassBuoysBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(defaultBlockState()
                .setValue(WATERLOGGED, false)
                .setValue(TEXTURE, 0)
                .setValue(FACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    private static final VoxelShape SHAPE_N = Shapes.or(
            Block.box(0, 0, 2, 16, 8, 14),
            Block.box(3, 8, 5, 12, 16, 14)
    );
    private static final VoxelShape SHAPE_S = Shapes.or(
            Block.box(0, 0, 2, 16, 8, 14),
            Block.box(4, 8, 2, 13, 16, 11)
    );
    private static final VoxelShape SHAPE_E = Shapes.or(
            Block.box(2, 0, 0, 14, 8, 16),
            Block.box(2, 8, 3, 11, 16, 12)
    );
    private static final VoxelShape SHAPE_W = Shapes.or(
            Block.box(2, 0, 0, 14, 8, 16),
            Block.box(5, 8, 4, 14, 16, 13)
    );

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch (state.getValue(FACING)) {
            case SOUTH -> {
                return SHAPE_S;
            }
            case EAST -> {
                return SHAPE_E;
            }
            case WEST -> {
                return SHAPE_W;
            }
            default -> {
                return SHAPE_N;
            }
        }    }

    @Override
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
        super.onPlace(state, level, pos, oldState, movedByPiston);
        this.registerDefaultState(defaultBlockState()
                .setValue(TEXTURE, RandomSource.create().nextInt(0, 3)));
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState()
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
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED, TEXTURE);
    }
}
