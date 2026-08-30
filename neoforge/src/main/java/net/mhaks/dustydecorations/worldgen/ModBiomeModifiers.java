package net.mhaks.dustydecorations.worldgen;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.worldgen.feature.ModPlacedFeatures;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ModBiomeModifiers {

    public static final ResourceKey<BiomeModifier> SUS_SEAGLASS_SAND = registerKey("sus_seaglass_sand");
    public static final ResourceKey<BiomeModifier> SUS_SEAGLASS_GRAVEL = registerKey("sus_seaglass_gravel");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(SUS_SEAGLASS_SAND, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_BEACH),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SUS_SEAGLASS_SAND)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        context.register(SUS_SEAGLASS_GRAVEL, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_BEACH),
                HolderSet.direct(placedFeatures.getOrThrow(ModPlacedFeatures.SUS_SEAGLASS_GRAVEL)),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(ModConstants.MOD_ID, name));
    }
}
