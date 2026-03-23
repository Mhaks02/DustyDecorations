package net.mhaks.dustydecorations.block.custom;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class StellarWallpaperBlock extends Block {
    public static final IntegerProperty TEXTURE = ModConstants.TEXTURE_4;

    public StellarWallpaperBlock(Properties properties) {
        super(properties);
        registerDefaultState(defaultBlockState()
                .setValue(TEXTURE, 0));
    }

    @Override
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
        this.registerDefaultState(defaultBlockState()
                .setValue(TEXTURE, RandomSource.create().nextInt(0, 4)));
        super.onPlace(state, level, pos, oldState, movedByPiston);
    }


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(TEXTURE);
    }
}
