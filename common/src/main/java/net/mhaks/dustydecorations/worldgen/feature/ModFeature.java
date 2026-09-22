package net.mhaks.dustydecorations.worldgen.feature;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.registration.RegistrationProvider;
import net.mhaks.dustydecorations.registration.RegistryObject;
import net.mhaks.dustydecorations.worldgen.feature.custom.SusSeaglassConfiguration;
import net.mhaks.dustydecorations.worldgen.feature.custom.SusSeaglassFeature;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;

public class ModFeature<FC extends FeatureConfiguration> {
    public static final RegistrationProvider<Feature<?>> FEATURES = RegistrationProvider.get(BuiltInRegistries.FEATURE, ModConstants.MOD_ID);

    public static final RegistryObject<Feature<?>, SusSeaglassFeature> SUS_SEAGLASS = FEATURES.register("sus_seaglass",
            () -> new SusSeaglassFeature(SusSeaglassConfiguration.CODEC));


    public static void registerModFeature() {
        ModConstants.LOGGER.info("Registering Mod Features for " + ModConstants.MOD_ID);
    }
}
