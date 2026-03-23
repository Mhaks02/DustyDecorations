package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
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
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class BarrelBlock extends HorizontalDirectionalBlock {
    public static final MapCodec<BarrelBlock> CODEC = simpleCodec(BarrelBlock::new);

    public BarrelBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(defaultBlockState()
                .setValue(FACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    private static final VoxelShape SHAPE_N = Shapes.or(
            Block.box(0, 0, 0, 16, 14, 16),
            Block.box(0, 14, 0, 2, 16, 16),
            Block.box(14, 14, 0, 16, 16, 16),
            Block.box(2, 14, 14, 14, 16, 16),
            Block.box(2, 14, 0, 14, 16, 2)
    );

    private static final VoxelShape SHAPE_S = Shapes.or(
            Block.box(0, 0, 0, 16, 14, 16),
            Block.box(14, 14, 0, 16, 16, 16),
            Block.box(0, 14, 0, 2, 16, 16),
            Block.box(2, 14, 0, 14, 16, 2),
            Block.box(2, 14, 14, 14, 16, 16)
    );

    private static final VoxelShape SHAPE_E = Shapes.or(
            Block.box(0, 0, 0, 16, 14, 16),
            Block.box(0, 14, 0, 16, 16, 2),
            Block.box(0, 14, 14, 16, 16, 16),
            Block.box(0, 14, 2, 2, 16, 14),
            Block.box(14, 14, 2, 16, 16, 14)
    );

    private static final VoxelShape SHAPE_W = Shapes.or(
            Block.box(0, 0, 0, 16, 14, 16),
            Block.box(0, 14, 14, 16, 16, 16),
            Block.box(0, 14, 0, 16, 16, 2),
            Block.box(14, 14, 2, 16, 16, 14),
            Block.box(0, 14, 2, 2, 16, 14)
    );

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
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
        }
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState()
                .setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
