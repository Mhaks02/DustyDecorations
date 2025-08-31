package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LargeShelfBlock extends HorizontalDirectionalBlock implements SimpleWaterloggedBlock {
    public static BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final MapCodec<LargeShelfBlock> CODEC = LargeShelfBlock.simpleCodec(LargeShelfBlock::new);

    public LargeShelfBlock(Properties properties) {
        super(properties);
        registerDefaultState(defaultBlockState()
                .setValue(WATERLOGGED, false));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return null;
    }

    private static final VoxelShape SHAPE =
            Block.box(0, 12, 0, 16, 16, 16);

    public static VoxelShape getSHAPE() {
        return SHAPE;
    }
}
