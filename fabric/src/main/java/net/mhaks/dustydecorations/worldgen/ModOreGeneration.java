package net.mhaks.dustydecorations.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.mhaks.dustydecorations.worldgen.feature.ModPlacedFeatures;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_BEACH), GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.SUS_SEAGLASS_SAND);
        BiomeModifications.addFeature(BiomeSelectors.tag(BiomeTags.IS_BEACH), GenerationStep.Decoration.UNDERGROUND_ORES, ModPlacedFeatures.SUS_SEAGLASS_GRAVEL);
    }
}
