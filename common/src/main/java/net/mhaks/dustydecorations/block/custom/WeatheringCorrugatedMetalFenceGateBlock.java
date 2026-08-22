package net.mhaks.dustydecorations.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class WeatheringCorrugatedMetalFenceGateBlock extends CorrugatedMetalFenceGateBlock implements WeatheringCopper {
    public final WeatherState weatherState;

    public WeatheringCorrugatedMetalFenceGateBlock(WeatherState weatherState, WoodType type, Properties properties) {
        super(type, properties);
        this.weatherState = weatherState;
    }

    @Override
    protected boolean isRandomlyTicking(BlockState state) {
        return WeatheringCopper.getNext(state.getBlock()).isPresent();
    }

    @Override
    protected void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        this.changeOverTime(state, level, pos, random);
    }

    @Override
    public WeatherState getAge() {
        return this.weatherState;
    }
}
