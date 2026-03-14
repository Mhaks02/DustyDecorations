package net.mhaks.dustydecorations;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.mhaks.dustydecorations.block.entity.ModBlockEntityTypes;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.block.entity.client.CameraQuadropodBlockRenderer;
import net.mhaks.dustydecorations.block.entity.client.PaperLanternBlockRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;

public class DustyDecorationsClientFabric implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OAK_BANISTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPRUCE_BANISTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BIRCH_BANISTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JUNGLE_BANISTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ACACIA_BANISTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DARK_OAK_BANISTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MANGROVE_BANISTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHERRY_BANISTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BAMBOO_BANISTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DRY_BAMBOO_BANISTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRIMSON_BANISTER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WARPED_BANISTER.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_WOOL_AWNING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_GRAY_WOOL_AWNING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAY_WOOL_AWNING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLACK_WOOL_AWNING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BROWN_WOOL_AWNING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_WOOL_AWNING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_WOOL_AWNING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_WOOL_AWNING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIME_WOOL_AWNING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_WOOL_AWNING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CYAN_WOOL_AWNING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIGHT_BLUE_WOOL_AWNING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_WOOL_AWNING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PURPLE_WOOL_AWNING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MAGENTA_WOOL_AWNING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_WOOL_AWNING.get(), RenderType.cutout());

        BlockEntityRenderers.register(ModBlockEntities.PAPER_LANTERN_BLOCK_ENTITY.get(), PaperLanternBlockRenderer::new);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CORRUGATED_METAL_GRATE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUSTED_CORRUGATED_METAL_GRATE.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CREAM_SEAGLASS.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HAZEL_SEAGLASS.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOCHA_SEAGLASS.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIQUORICE_SEAGLASS.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SCARLET_SEAGLASS.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HONEY_SEAGLASS.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOCHA_SEAGLASS.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TEAL_SEAGLASS.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CERULEAN_SEAGLASS.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TAUPE_SEAGLASS.get(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CREAM_SEAGLASS_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HAZEL_SEAGLASS_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIQUORICE_SEAGLASS_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOCHA_SEAGLASS_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SCARLET_SEAGLASS_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HONEY_SEAGLASS_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOCHA_SEAGLASS_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TEAL_SEAGLASS_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CERULEAN_SEAGLASS_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TAUPE_SEAGLASS_PANE.get(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CREAM_SEA_WINDOW.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HAZEL_SEA_WINDOW.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIQUORICE_SEA_WINDOW.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOCHA_SEA_WINDOW.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SCARLET_SEA_WINDOW.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HONEY_SEA_WINDOW.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOCHA_SEA_WINDOW.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TEAL_SEA_WINDOW.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CERULEAN_SEA_WINDOW.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TAUPE_SEA_WINDOW.get(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CREAM_SEA_WINDOW_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HAZEL_SEA_WINDOW_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIQUORICE_SEA_WINDOW_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOCHA_SEA_WINDOW_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SCARLET_SEA_WINDOW_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HONEY_SEA_WINDOW_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOCHA_SEA_WINDOW_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TEAL_SEA_WINDOW_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CERULEAN_SEA_WINDOW_PANE.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TAUPE_SEA_WINDOW_PANE.get(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CREAM_SEAGLASS_LAMP.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HAZEL_SEAGLASS_LAMP.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIQUORICE_SEAGLASS_LAMP.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOCHA_SEAGLASS_LAMP.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SCARLET_SEAGLASS_LAMP.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HONEY_SEAGLASS_LAMP.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOCHA_SEAGLASS_LAMP.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TEAL_SEAGLASS_LAMP.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CERULEAN_SEAGLASS_LAMP.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TAUPE_SEAGLASS_LAMP.get(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RUSTED_ANCHOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIFE_PRESERVER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TREASURE_MAP.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POSTERS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLASS_BUOY.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SMALL_GLASS_BUOYS.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WOODEN_BUOYS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ROPE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HANGING_COD.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HANGING_SALMON.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HANGING_KNIVES.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WEDGED_KNIFE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WEDGED_CLEAVER.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.KNIFE_AND_CUTTING_BOARD.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.JARS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.INK_AND_QUILL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CLUTTERED_SMALL_SHELF.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOBE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.VINTAGE_GLOBE.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BOVINE_SKULL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.EQUINE_SKULL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CANINE_SKULL.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FISH_BONES.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SMALL_SHARK_JAW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BIG_SHARK_JAW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MEGALODON_TOOTH.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FISHING_LURES.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SCATTERED_GOLD_COINS.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BURLAP_CARPET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BURLAP_AWNING.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BURLAP_SACK.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAILOR_FLAG.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SAILOR_PENNANT_FLAG.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HANGING_SAUSAGES.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WRAPPED_MEAT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COPPER_LIGHT.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WAXED_COPPER_LIGHT.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHODDY_COPPER_LIGHT.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WAXED_SHODDY_COPPER_LIGHT.get(), RenderType.translucent());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CAMERA_QUADROPOD.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CAMERA.get(), RenderType.translucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOVIE_CAMERA.get(), RenderType.translucent());

        BlockEntityRenderers.register(ModBlockEntityTypes.CAMERA_QUADROPOD_BLOCK_ENTITY.get(), CameraQuadropodBlockRenderer::new);

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WICKER_BASKET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.APPLE_WICKER_BASKET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SWEET_BERRIES_WICKER_BASKET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOW_BERRIES_WICKER_BASKET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CARROT_WICKER_BASKET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTATO_WICKER_BASKET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BEETROOT_WICKER_BASKET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PICKLE_WICKER_BASKET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COD_WICKER_BASKET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SALMON_WICKER_BASKET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_PETALS_WICKER_BASKET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LILAC_WICKER_BASKET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ROSE_BUSH_WICKER_BASKET.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PEONY_WICKER_BASKET.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GOURD.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HANGING_GOURDS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CARVED_BEETROOT.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BEET_O_LANTERN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BEETROOT_SCARECROW.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PUMPKIN_SCARECROW.get(), RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MINI_SNOWMAN.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FALL_GARLAND.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WINTER_GARLAND.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WINTER_WREATH.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FAIRY_LIGHTS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HOLIDAY_ORNAMENTS.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GIANT_ANCHOR.get(), RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GIANT_CHAIN.get(), RenderType.cutout());

    }
}
