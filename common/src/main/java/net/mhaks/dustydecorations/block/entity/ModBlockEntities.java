package net.mhaks.dustydecorations.block.entity;

import net.mhaks.dustydecorations.DustyDecorationsConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.block.entity.custom.PaperLanternBlockEntity;
import net.mhaks.dustydecorations.registration.RegistrationProvider;
import net.mhaks.dustydecorations.registration.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final RegistrationProvider<BlockEntityType<?>> BLOCK_ENTITIES = RegistrationProvider.get(BuiltInRegistries.BLOCK_ENTITY_TYPE, DustyDecorationsConstants.MOD_ID);

    public static final RegistryObject<BlockEntityType<?>, BlockEntityType<PaperLanternBlockEntity>> PAPER_LANTERN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("paper_lantern_block_entity",
                    () -> BlockEntityType.Builder.of(
                            PaperLanternBlockEntity::new,
                            ModBlocks.PAPER_LANTERN.get(),
                            ModBlocks.SAKURA_PAPER_LANTERN.get()
                    ).build(null));


    public static void registerModBlockEntities() {
        DustyDecorationsConstants.LOGGER.info("Registering Mod Block Entities for " + DustyDecorationsConstants.MOD_ID);

    }
}
