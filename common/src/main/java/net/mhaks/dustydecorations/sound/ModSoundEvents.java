package net.mhaks.dustydecorations.sound;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.registration.RegistrationProvider;
import net.mhaks.dustydecorations.registration.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

public class ModSoundEvents {
    public static final RegistrationProvider<SoundEvent> SOUND_EVENTS = RegistrationProvider.get(BuiltInRegistries.SOUND_EVENT, ModConstants.MOD_ID);

    //TODO: actually add the sound assets lol
    public static final RegistryObject<SoundEvent, SoundEvent> CORRUGATED_METAL_OPEN = registerSoundEvent("corrugated_metal_open");
    public static final RegistryObject<SoundEvent, SoundEvent> CORRUGATED_METAL_CLOSE = registerSoundEvent("corrugated_metal_close");

//    public static final RegistryObject<SoundType, SoundType> CORRUGATED_METAL_SOUNDS = new SoundType(1f, 1f, )

    private static RegistryObject<SoundEvent, SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(ModConstants.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void registerModSounds() {
        ModConstants.LOGGER.info("Registering Mod Sounds for " + ModConstants.MOD_ID);
    }

}
