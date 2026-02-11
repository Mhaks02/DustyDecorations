package net.mhaks.dustydecorations.block.custom;

import net.mhaks.dustydecorations.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class WallpaperBlock extends Block {
    public static final IntegerProperty TEXTURE = IntegerProperty.create("texture", 0, 3);

    public WallpaperBlock(Properties properties) {
        super(properties);
        registerDefaultState(defaultBlockState()
                .setValue(TEXTURE, 0));
    }

    @Override
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
        if (state.is(ModBlocks.STELLAR_WALLPAPER_BLOCK.get())) {
            this.registerDefaultState(defaultBlockState()
                    .setValue(TEXTURE, RandomSource.create().nextInt(0, 4)));
        }
        if (state.is(ModBlocks.SUNFLOWER_WALLPAPER_BLOCK.get()) || state.is(ModBlocks.VINE_WALLPAPER_BLOCK.get())) {
            this.registerDefaultState(defaultBlockState()
                    .setValue(TEXTURE, RandomSource.create().nextInt(0, 3)));
        }
        super.onPlace(state, level, pos, oldState, movedByPiston);
    }


    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(TEXTURE);
    }
}
