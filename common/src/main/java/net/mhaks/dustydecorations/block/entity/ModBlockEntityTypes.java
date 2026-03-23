package net.mhaks.dustydecorations.block.entity;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.block.entity.custom.*;
import net.mhaks.dustydecorations.registration.RegistrationProvider;
import net.mhaks.dustydecorations.registration.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModBlockEntityTypes {
    public static final RegistrationProvider<BlockEntityType<?>> BLOCK_ENTITIES = RegistrationProvider.get(BuiltInRegistries.BLOCK_ENTITY_TYPE, ModConstants.MOD_ID);

    public static final RegistryObject<BlockEntityType<?>, BlockEntityType<PaperLanternBlockEntity>> PAPER_LANTERN_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("paper_lantern_block_entity",
                    () -> BlockEntityType.Builder.of(
                            PaperLanternBlockEntity::new,
                            ModBlocks.PAPER_LANTERN.get(),
                            ModBlocks.SAKURA_PAPER_LANTERN.get(),
                            ModBlocks.TAIGA_PAPER_LANTERN.get(),
                            ModBlocks.ORCHID_PAPER_LANTERN.get(),
                            ModBlocks.PANDA_PAPER_LANTERN.get(),
                            ModBlocks.VILLAGER_PAPER_LANTERN.get(),
                            ModBlocks.CREEPER_PAPER_LANTERN.get(),
                            ModBlocks.CHICKEN_JOCKEY_PAPER_LANTERN.get(),
                            ModBlocks.PILLAGER_PAPER_LANTERN.get(),
                            ModBlocks.WARDEN_PAPER_LANTERN.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<?>, BlockEntityType<CameraQuadropodBlockEntity>> CAMERA_QUADROPOD_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("camera_quadropod_block_entity",
                    () -> BlockEntityType.Builder.of(
                            CameraQuadropodBlockEntity::new,
                            ModBlocks.CAMERA_QUADROPOD.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<?>, BlockEntityType<ScarecrowBlockEntity>> SCARECROW_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("scarecrow_block_entity",
                    () -> BlockEntityType.Builder.of(
                            ScarecrowBlockEntity::new,
                            ModBlocks.BEETROOT_SCARECROW.get(),
                            ModBlocks.PUMPKIN_SCARECROW.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<?>, BlockEntityType<VintageCashRegisterBlockEntity>> VINTAGE_CASH_REGISTER_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("vintage_cash_register_block_entity",
                    () -> BlockEntityType.Builder.of(
                            VintageCashRegisterBlockEntity::new,
                            ModBlocks.VINTAGE_CASH_REGISTER.get()
                    ).build(null));

    public static final RegistryObject<BlockEntityType<?>, BlockEntityType<NautilusWindChimeBlockEntity>> NAUTILUS_WIND_CHIME_BLOCK_ENTITY =
            BLOCK_ENTITIES.register("nautilus_wind_chime_block_entity",
                    () -> BlockEntityType.Builder.of(
                            NautilusWindChimeBlockEntity::new,
                            ModBlocks.COLD_NAUTILUS_WIND_CHIME.get()
                    ).build(null));


    public static void registerModBlockEntities() {
        ModConstants.LOGGER.info("Registering Mod Block Entities for " + ModConstants.MOD_ID);

    }
}
