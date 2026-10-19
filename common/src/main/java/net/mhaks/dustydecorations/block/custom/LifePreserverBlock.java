package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class LifePreserverBlock extends DirectionalBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final MapCodec<LifePreserverBlock> CODEC = simpleCodec(LifePreserverBlock::new);
    
    public LifePreserverBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(defaultBlockState()
                .setValue(WATERLOGGED, false)
                .setValue(FACING, Direction.UP));
    }

    @Override
    protected MapCodec<? extends DirectionalBlock> codec() {
        return CODEC;
    }

    protected static final VoxelShape NEG_SPACE_Z = Block.box(5, 5, 0, 11, 11, 16);
    protected static final VoxelShape NEG_SPACE_X = Block.box(0, 5, 5, 16, 11, 11);
    protected static final VoxelShape NEG_SPACE_Y = Block.box(5, 0, 5, 11, 16, 11);
    private static final VoxelShape SHAPE_N = Shapes.join(Block.box(2, 2, 13, 14, 14, 16), NEG_SPACE_Z, BooleanOp.ONLY_FIRST);
    private static final VoxelShape SHAPE_S = Shapes.join(Block.box(2, 2, 0, 14, 14, 3), NEG_SPACE_Z, BooleanOp.ONLY_FIRST);
    private static final VoxelShape SHAPE_E = Shapes.join(Block.box(0, 2, 2, 3, 14, 14), NEG_SPACE_X, BooleanOp.ONLY_FIRST);
    private static final VoxelShape SHAPE_W = Shapes.join(Block.box(13, 2, 2, 16, 14, 14), NEG_SPACE_X, BooleanOp.ONLY_FIRST);
    private static final VoxelShape SHAPE_UP = Shapes.join(Block.box(2, 0, 2, 14, 3, 14), NEG_SPACE_Y, BooleanOp.ONLY_FIRST);
    private static final VoxelShape SHAPE_DOWN = Shapes.join(Block.box(2, 13, 2, 14, 16, 14), NEG_SPACE_Y, BooleanOp.ONLY_FIRST);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch (state.getValue(FACING)) {
            case NORTH -> {
                return SHAPE_N;
            }
            case SOUTH -> {
                return SHAPE_S;
            }
            case EAST -> {
                return SHAPE_E;
            }
            case WEST -> {
                return SHAPE_W;
            }
            case DOWN -> {
                return SHAPE_DOWN;
            }
            default -> {
                return SHAPE_UP;
            }
        }
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        Level levelAccess = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        return this.defaultBlockState()
                .setValue(FACING, context.getClickedFace())
                .setValue(WATERLOGGED, levelAccess.getFluidState(blockPos).getType() == Fluids.WATER);
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    protected BlockState updateShape(BlockState state, LevelReader level, ScheduledTickAccess scheduledTickAccess, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, RandomSource random) {
        if (state.getValue(WATERLOGGED)) {
            scheduledTickAccess.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        return super.updateShape(state, level, scheduledTickAccess, pos, direction, neighborPos, neighborState, random);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, WATERLOGGED);
    }
}
