package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class PaperStackBlock extends HorizontalDirectionalBlock {
    public static final MapCodec<PaperStackBlock> CODEC = simpleCodec(PaperStackBlock::new);

    public PaperStackBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(defaultBlockState()
                .setValue(FACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    private static final VoxelShape SHAPE_N =
            Block.box(4, 0, 2, 12, 16, 14);

    private static final VoxelShape SHAPE_S =
            Block.box(4, 0, 2, 12, 16, 14);

    private static final VoxelShape SHAPE_E =
            Block.box(2, 0, 4, 14, 16, 12);

    private static final VoxelShape SHAPE_W =
            Block.box(2, 0, 4, 14, 16, 12);

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
