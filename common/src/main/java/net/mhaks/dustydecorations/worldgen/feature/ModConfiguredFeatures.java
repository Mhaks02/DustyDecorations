package net.mhaks.dustydecorations.worldgen.feature;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.worldgen.feature.custom.SusSeaglassConfiguration;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ModConfiguredFeatures {

    public static final ResourceKey<ConfiguredFeature<?, ?>> SUS_SEAGLASS_SAND = registerKey("sus_seaglass_sand");
    public static final ResourceKey<ConfiguredFeature<?, ?>> SUS_SEAGLASS_GRAVEL = registerKey("sus_seaglass_gravel");

    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_MARINE_FOSSIL = registerKey("ore_marine_fossil");
    public static final ResourceKey<ConfiguredFeature<?, ?>> ORE_MARINE_FOSSIL_BURIED = registerKey("ore_marine_fossil_buried");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest sandReplaceables = new BlockMatchTest(Blocks.SAND);
        RuleTest gravelReplaceables = new BlockMatchTest(Blocks.GRAVEL);
        List<OreConfiguration.TargetBlockState> list = List.of(
                OreConfiguration.target(stoneReplaceables, ModBlocks.STONE_MARINE_FOSSIL.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ModBlocks.DEEPSLATE_MARINE_FOSSIL.get().defaultBlockState())
        );

        register(context, SUS_SEAGLASS_SAND, ModFeature.SUS_SEAGLASS.get(), new SusSeaglassConfiguration(sandReplaceables, ModBlocks.SEAGLASS_SAND.get().defaultBlockState()));
        register(context, SUS_SEAGLASS_GRAVEL, ModFeature.SUS_SEAGLASS.get(), new SusSeaglassConfiguration(gravelReplaceables, ModBlocks.SEAGLASS_GRAVEL.get().defaultBlockState()));

        register(context, ORE_MARINE_FOSSIL, Feature.ORE, new OreConfiguration(list, 12));
        register(context, ORE_MARINE_FOSSIL_BURIED, Feature.ORE, new OreConfiguration(list, 8, .5F));

    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(ModConstants.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
