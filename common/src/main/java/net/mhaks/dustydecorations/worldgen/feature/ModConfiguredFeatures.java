package net.mhaks.dustydecorations.worldgen.feature;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.worldgen.feature.custom.SusSeaglassConfiguration;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> SUS_SEAGLASS_SAND = registerKey("sus_seaglass_sand");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SUS_SEAGLASS_GRAVEL = registerKey("sus_seaglass_gravel");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest sandReplaceables = new BlockMatchTest(Blocks.SAND);
        RuleTest gravelReplaceables = new BlockMatchTest(Blocks.GRAVEL);

        register(context, SUS_SEAGLASS_SAND, ModFeature.SUS_SEAGLASS.get(), new SusSeaglassConfiguration(sandReplaceables, ModBlocks.SEAGLASS_SAND.get().defaultBlockState()));
        register(context, SUS_SEAGLASS_GRAVEL, ModFeature.SUS_SEAGLASS.get(), new SusSeaglassConfiguration(gravelReplaceables, ModBlocks.SEAGLASS_GRAVEL.get().defaultBlockState()));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(ModConstants.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
