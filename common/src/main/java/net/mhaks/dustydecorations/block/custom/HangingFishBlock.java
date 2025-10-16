package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class HangingFishBlock extends HorizontalDirectionalBlock {
    public static final MapCodec<HangingFishBlock> CODEC = simpleCodec(HangingFishBlock::new);

    public HangingFishBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    private static final VoxelShape SHAPE_Z =
            Block.box(0, 0, 7, 16, 16, 9);

    private static final VoxelShape SHAPE_X =
            Block.box(7, 0, 0, 9, 16, 16);

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch (state.getValue(FACING)) {
            case NORTH -> {
                return SHAPE_Z;
            }
            case EAST, WEST -> {
                return SHAPE_X;
            }
            default -> {
                return SHAPE_Z;
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
