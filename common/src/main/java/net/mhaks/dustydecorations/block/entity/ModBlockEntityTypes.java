package net.mhaks.dustydecorations.block.entity;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.block.entity.custom.*;
import net.mhaks.dustydecorations.registration.RegistrationProvider;
import net.mhaks.dustydecorations.registration.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.Set;

public class ModBlockEntityTypes {
    public static final RegistrationProvider<BlockEntityType<?>> BLOCK_ENTITIES = RegistrationProvider.get(BuiltInRegistries.BLOCK_ENTITY_TYPE, ModConstants.MOD_ID);

    public static final RegistryObject<BlockEntityType<?>, BlockEntityType<?>> PAPER_LANTERN_BLOCK_ENTITY =
            register("paper_lantern_block_entity",
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
            );

    public static final RegistryObject<BlockEntityType<?>, BlockEntityType<?>> CAMERA_QUADROPOD_BLOCK_ENTITY =
            register("camera_quadropod_block_entity",
                    CameraQuadropodBlockEntity::new,
                    ModBlocks.CAMERA_QUADROPOD.get()
                    );

    public static final RegistryObject<BlockEntityType<?>, BlockEntityType<?>> SCARECROW_BLOCK_ENTITY =
            register("scarecrow_block_entity",
                    ScarecrowBlockEntity::new,
                    ModBlocks.BEETROOT_SCARECROW.get(),
                    ModBlocks.PUMPKIN_SCARECROW.get()
                    );

    public static final RegistryObject<BlockEntityType<?>, BlockEntityType<?>> VINTAGE_CASH_REGISTER_BLOCK_ENTITY =
            register("vintage_cash_register_block_entity",
                    VintageCashRegisterBlockEntity::new,
                    ModBlocks.VINTAGE_CASH_REGISTER.get()
            );

    public static final RegistryObject<BlockEntityType<?>, BlockEntityType<?>> NAUTILUS_WIND_CHIME_BLOCK_ENTITY =
            register("nautilus_wind_chime_block_entity",
                    NautilusWindChimeBlockEntity::new,
                    ModBlocks.COLD_NAUTILUS_WIND_CHIME.get()
            );


    private static RegistryObject<BlockEntityType<?>, BlockEntityType<?>> register(String name,  BlockEntityType.BlockEntitySupplier<?> factory, Block... validBlocks) {
        return BLOCK_ENTITIES.register(name,() -> new BlockEntityType<>(factory, Set.of(validBlocks)));
    }

    public static void registerModBlockEntities() {
        ModConstants.LOGGER.info("Registering Mod Block Entities for " + ModConstants.MOD_ID);

    }
}
