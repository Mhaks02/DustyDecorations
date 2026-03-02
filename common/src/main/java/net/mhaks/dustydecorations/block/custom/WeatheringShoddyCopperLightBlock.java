package net.mhaks.dustydecorations.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

public class WeatheringShoddyCopperLightBlock extends ShoddyCopperLightBlock implements WeatheringCopper {
    public final WeatherState weatherState;

    public WeatheringShoddyCopperLightBlock(WeatherState weatherState, Properties properties) {
        super(properties);
        this.weatherState = weatherState;
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        super.randomTick(state, level, pos, random);
        if (WeatheringCopper.getNext(state.getBlock()).isPresent()) {
            this.changeOverTime(state, level, pos, random);
        }
    }

    @Override
    public WeatherState getAge() {
        return weatherState;
    }
}
