package net.mhaks.dustydecorations;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.config.alert.MigrationScreen;
import net.mhaks.dustydecorations.gui.menu.ModMenuTypes;
import net.mhaks.dustydecorations.gui.screen.custom.VintageCashRegisterScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;

public class DustyDecorationsClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ScreenEvents.AFTER_INIT.register((client, screen, scaledWidth, scaledHeight) -> MigrationScreen.openWarningScreen(screen));

        DustyDecorationsClient.registerRenderers(EntityRendererRegistry::register, BlockEntityRenderers::register);

        MenuScreens.register(ModMenuTypes.VINTAGE_CASH_REGISTER_MENU.get(), VintageCashRegisterScreen::new);

        BlockRenderLayerMap.putBlock(ModBlocks.OAK_BANISTER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.OAK_BANISTER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.SPRUCE_BANISTER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BIRCH_BANISTER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.JUNGLE_BANISTER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.ACACIA_BANISTER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.DARK_OAK_BANISTER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MANGROVE_BANISTER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CHERRY_BANISTER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BAMBOO_BANISTER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.DRY_BAMBOO_BANISTER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CRIMSON_BANISTER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.WARPED_BANISTER.get(), ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlocks.WHITE_WOOL_AWNING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.LIGHT_GRAY_WOOL_AWNING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.GRAY_WOOL_AWNING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BLACK_WOOL_AWNING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BROWN_WOOL_AWNING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.RED_WOOL_AWNING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.ORANGE_WOOL_AWNING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.YELLOW_WOOL_AWNING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.LIME_WOOL_AWNING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.GREEN_WOOL_AWNING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CYAN_WOOL_AWNING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.LIGHT_BLUE_WOOL_AWNING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BLUE_WOOL_AWNING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.PURPLE_WOOL_AWNING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MAGENTA_WOOL_AWNING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.PINK_WOOL_AWNING.get(), ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlocks.CORRUGATED_METAL_GRATE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.RUSTED_CORRUGATED_METAL_GRATE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.WAXED_CORRUGATED_METAL_GRATE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_GRATE.get(), ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlocks.CREAM_SEAGLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.HAZEL_SEAGLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.MOCHA_SEAGLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.LIQUORICE_SEAGLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.SCARLET_SEAGLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.HONEY_SEAGLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.MOCHA_SEAGLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.TEAL_SEAGLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.CERULEAN_SEAGLASS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.TAUPE_SEAGLASS.get(), ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(ModBlocks.CREAM_SEAGLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.HAZEL_SEAGLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.LIQUORICE_SEAGLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.MOCHA_SEAGLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.SCARLET_SEAGLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.HONEY_SEAGLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.MOCHA_SEAGLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.TEAL_SEAGLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.CERULEAN_SEAGLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.TAUPE_SEAGLASS_PANE.get(), ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(ModBlocks.CREAM_SEA_WINDOW.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.HAZEL_SEA_WINDOW.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.LIQUORICE_SEA_WINDOW.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.MOCHA_SEA_WINDOW.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.SCARLET_SEA_WINDOW.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.HONEY_SEA_WINDOW.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.MOCHA_SEA_WINDOW.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.TEAL_SEA_WINDOW.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.CERULEAN_SEA_WINDOW.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.TAUPE_SEA_WINDOW.get(), ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(ModBlocks.CREAM_SEA_WINDOW_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.HAZEL_SEA_WINDOW_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.LIQUORICE_SEA_WINDOW_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.MOCHA_SEA_WINDOW_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.SCARLET_SEA_WINDOW_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.HONEY_SEA_WINDOW_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.MOCHA_SEA_WINDOW_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.TEAL_SEA_WINDOW_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.CERULEAN_SEA_WINDOW_PANE.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.TAUPE_SEA_WINDOW_PANE.get(), ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(ModBlocks.CREAM_SEAGLASS_LAMP.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.HAZEL_SEAGLASS_LAMP.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.LIQUORICE_SEAGLASS_LAMP.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.MOCHA_SEAGLASS_LAMP.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.SCARLET_SEAGLASS_LAMP.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.HONEY_SEAGLASS_LAMP.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.MOCHA_SEAGLASS_LAMP.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.TEAL_SEAGLASS_LAMP.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.CERULEAN_SEAGLASS_LAMP.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.TAUPE_SEAGLASS_LAMP.get(), ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(ModBlocks.RUSTED_ANCHOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.LIFE_PRESERVER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.TREASURE_MAP.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.POSTERS.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.GLASS_BUOY.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.SMALL_GLASS_BUOYS.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.WOODEN_BUOYS.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.ROPE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.HANGING_COD.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.HANGING_SALMON.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.HANGING_KNIVES.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.WEDGED_KNIFE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.WEDGED_CLEAVER.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.KNIFE_AND_CUTTING_BOARD.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.JARS.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.INK_AND_QUILL.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CLUTTERED_SMALL_SHELF.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.GLOBE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.VINTAGE_GLOBE.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BOVINE_SKULL.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.EQUINE_SKULL.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CANINE_SKULL.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.FISH_BONES.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.SMALL_SHARK_JAW.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BIG_SHARK_JAW.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MEGALODON_TOOTH.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.FISHING_LURES.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.SCATTERED_GOLD_COINS.get(), ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlocks.BURLAP_CARPET.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BURLAP_AWNING.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BURLAP_SACK.get(), ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlocks.SAILOR_FLAG.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.SAILOR_PENNON.get(), ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlocks.VINTAGE_CASH_REGISTER.get(), ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlocks.HANGING_SAUSAGES.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.WRAPPED_MEAT.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.COWHIDE_RUG.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MOOSHROOM_COWHIDE_RUG.get(), ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlocks.COPPER_LIGHT.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.WAXED_COPPER_LIGHT.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.SHODDY_COPPER_LIGHT.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.WAXED_SHODDY_COPPER_LIGHT.get(), ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(ModBlocks.CAMERA_QUADROPOD.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.CAMERA.get(), ChunkSectionLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(ModBlocks.MOVIE_CAMERA.get(), ChunkSectionLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(ModBlocks.WICKER_BASKET.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.APPLE_WICKER_BASKET.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.SWEET_BERRIES_WICKER_BASKET.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.GLOW_BERRIES_WICKER_BASKET.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CARROT_WICKER_BASKET.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.POTATO_WICKER_BASKET.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BEETROOT_WICKER_BASKET.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.SEA_PICKLE_WICKER_BASKET.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.COD_WICKER_BASKET.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.SALMON_WICKER_BASKET.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.PINK_PETALS_WICKER_BASKET.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.LILAC_WICKER_BASKET.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.ROSE_BUSH_WICKER_BASKET.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.PEONY_WICKER_BASKET.get(), ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlocks.GOURD.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.HANGING_GOURDS.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CARVED_BEETROOT.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BEET_O_LANTERN.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BEETROOT_SCARECROW.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.PUMPKIN_SCARECROW.get(), ChunkSectionLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(ModBlocks.MINI_SNOWMAN.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.FALL_GARLAND.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.WINTER_GARLAND.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.WINTER_WREATH.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.FAIRY_LIGHTS.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.HOLIDAY_ORNAMENTS.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.GIANT_ANCHOR.get(), ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.GIANT_CHAIN.get(), ChunkSectionLayer.CUTOUT);

    }
}
