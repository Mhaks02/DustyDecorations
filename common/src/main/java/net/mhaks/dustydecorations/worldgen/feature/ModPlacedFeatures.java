package net.mhaks.dustydecorations.worldgen.feature;

import net.mhaks.dustydecorations.ModConstants;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> SUS_SEAGLASS_SAND = registerKey("sus_seaglass_sand");
    public static final ResourceKey<PlacedFeature> SUS_SEAGLASS_GRAVEL = registerKey("sus_seaglass_gravel");

    public static final ResourceKey<PlacedFeature> ORE_MARINE_FOSSIL = registerKey("ore_marine_fossil");
    public static final ResourceKey<PlacedFeature> ORE_MARINE_FOSSIL_BURIED = registerKey("ore_marine_fossil_buried");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, SUS_SEAGLASS_SAND, configuredFeatures.getOrThrow(ModConfiguredFeatures.SUS_SEAGLASS_SAND), List.of(
                CountPlacement.of(2), RarityFilter.onAverageOnceEvery(3), InSquarePlacement.spread(), BiomeFilter.biome(), HeightRangePlacement.uniform(VerticalAnchor.absolute(60), VerticalAnchor.absolute(63))
        ));
        register(context, SUS_SEAGLASS_GRAVEL, configuredFeatures.getOrThrow(ModConfiguredFeatures.SUS_SEAGLASS_GRAVEL), List.of(
                CountPlacement.of(2), RarityFilter.onAverageOnceEvery(3), InSquarePlacement.spread(), BiomeFilter.biome(), HeightRangePlacement.uniform(VerticalAnchor.absolute(60), VerticalAnchor.absolute(63))
        ));

        register(context, ORE_MARINE_FOSSIL, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORE_MARINE_FOSSIL), commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(32))));
        register(context, ORE_MARINE_FOSSIL_BURIED, configuredFeatures.getOrThrow(ModConfiguredFeatures.ORE_MARINE_FOSSIL_BURIED), commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.absolute(64))));
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier countPlacement, PlacementModifier heightRange) {
        return List.of(countPlacement, InSquarePlacement.spread(), heightRange, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int count, PlacementModifier heightRange) {
        return orePlacement(CountPlacement.of(count), heightRange);
    }

    private static List<PlacementModifier> rareOrePlacement(int chance, PlacementModifier heightRange) {
        return orePlacement(RarityFilter.onAverageOnceEvery(chance), heightRange);
    }

    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(ModConstants.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
            List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
