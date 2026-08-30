package net.mhaks.dustydecorations.worldgen.feature.custom;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

import java.util.List;

public class SusSeaglassConfiguration implements FeatureConfiguration {
    public static final Codec<SusSeaglassConfiguration> CODEC = RecordCodecBuilder.create(
            susSeaglassConfigurationInstance -> susSeaglassConfigurationInstance.group(
                    Codec.list(TargetBlockState.CODEC).fieldOf("targets").forGetter(o -> o.targetStates)
            ).apply(susSeaglassConfigurationInstance, SusSeaglassConfiguration::new)
    );
    public final List<TargetBlockState> targetStates;

    public SusSeaglassConfiguration(List<TargetBlockState> targetStates) {
        this.targetStates = targetStates;
    }

    public SusSeaglassConfiguration(RuleTest target, BlockState state) {
        this(ImmutableList.of(new SusSeaglassConfiguration.TargetBlockState(target, state)));
    }

    public static class TargetBlockState {
        public static final Codec<TargetBlockState> CODEC = RecordCodecBuilder.create(
                targetBlockStateInstance -> targetBlockStateInstance.group(
                        RuleTest.CODEC.fieldOf("target").forGetter(o -> o.target),
                        BlockState.CODEC.fieldOf("state").forGetter(o -> o.state)
                ).apply(targetBlockStateInstance, TargetBlockState::new)
        );
        public final RuleTest target;
        public final BlockState state;

        public TargetBlockState(RuleTest target, BlockState state) {
            this.target = target;
            this.state = state;
        }
    }
}
