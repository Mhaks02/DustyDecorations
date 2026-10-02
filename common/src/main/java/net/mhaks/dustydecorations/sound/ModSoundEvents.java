package net.mhaks.dustydecorations.sound;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.registration.RegistrationProvider;
import net.mhaks.dustydecorations.registration.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.SoundType;

public class ModSoundEvents {
    public static final RegistrationProvider<SoundEvent> SOUND_EVENTS = RegistrationProvider.get(BuiltInRegistries.SOUND_EVENT, ModConstants.MOD_ID);

    public static final RegistryObject<SoundEvent, SoundEvent> CORRUGATED_METAL_OPEN = registerSoundEvent("corrugated_metal_open");
    public static final RegistryObject<SoundEvent, SoundEvent> CORRUGATED_METAL_CLOSE = registerSoundEvent("corrugated_metal_close");

    public static final RegistryObject<SoundEvent, SoundEvent> VINTAGE_CASH_REGISTER_OPEN = registerSoundEvent("vintage_cash_register_open");
    public static final RegistryObject<SoundEvent, SoundEvent> VINTAGE_CASH_REGISTER_CLOSE = registerSoundEvent("vintage_cash_register_close");

    public static final RegistryObject<SoundEvent, SoundEvent> COPPER_LIGHT_ON = registerSoundEvent("copper_light_on");
    public static final RegistryObject<SoundEvent, SoundEvent> COPPER_LIGHT_OFF = registerSoundEvent("copper_light_off");
    public static final RegistryObject<SoundEvent, SoundEvent> COPPER_LIGHT_HUM = registerSoundEvent("copper_light_hum");

    public static final RegistryObject<SoundEvent, SoundEvent> SEAGLASS_LAMP_TOGGLE = registerSoundEvent("seaglass_lamp_toggle");

    public static final RegistryObject<SoundEvent, SoundEvent> NAUTILUS_WIND_CHIME = registerSoundEvent("nautilus_wind_chime");

    //TODO: snowy soundtype & movie camera

//    public static final RegistryObject<SoundType, SoundType> CORRUGATED_METAL_SOUNDS = new SoundType(1f, 1f, )

    private static RegistryObject<SoundEvent, SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(ModConstants.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }

    public static void registerModSounds() {
        ModConstants.LOGGER.info("Registering Mod Sounds for " + ModConstants.MOD_ID);
    }

}
