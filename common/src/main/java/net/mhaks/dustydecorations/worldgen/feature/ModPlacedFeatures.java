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

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, SUS_SEAGLASS_SAND, configuredFeatures.getOrThrow(ModConfiguredFeatures.SUS_SEAGLASS_SAND), List.of(
                CountPlacement.of(2), RarityFilter.onAverageOnceEvery(3), InSquarePlacement.spread(), BiomeFilter.biome(), HeightRangePlacement.uniform(VerticalAnchor.absolute(60), VerticalAnchor.absolute(63))
        ));
        register(context, SUS_SEAGLASS_GRAVEL, configuredFeatures.getOrThrow(ModConfiguredFeatures.SUS_SEAGLASS_GRAVEL), List.of(
                CountPlacement.of(2), RarityFilter.onAverageOnceEvery(3), InSquarePlacement.spread(), BiomeFilter.biome(), HeightRangePlacement.uniform(VerticalAnchor.absolute(60), VerticalAnchor.absolute(63))
        ));

    }

    public static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(ModConstants.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
            List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
