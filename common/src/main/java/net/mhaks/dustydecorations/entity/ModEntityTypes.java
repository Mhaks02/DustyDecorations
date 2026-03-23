package net.mhaks.dustydecorations.entity;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.entity.custom.NautilusGolemEntity;
import net.mhaks.dustydecorations.registration.RegistrationProvider;
import net.mhaks.dustydecorations.registration.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobCategory;

public class ModEntityTypes {
    public static final RegistrationProvider<EntityType<?>> ENTITIES = RegistrationProvider.get(BuiltInRegistries.ENTITY_TYPE, ModConstants.MOD_ID);

    public static final RegistryObject<EntityType<?>, EntityType<NautilusGolemEntity>> NAUTILUS_GOLEM = ENTITIES.register("nautilus_golem",
            () -> EntityType.Builder.of(NautilusGolemEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 1.75f)
//                    .immuneTo()
                    .eyeHeight(1.2f)
                    .clientTrackingRange(10)
                    .build("nautilus_golem")
    );

    public static void registerModEntityTypes() {
        ModConstants.LOGGER.info("Registering Mod Entities for " + ModConstants.MOD_ID);
    }
}
