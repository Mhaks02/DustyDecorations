package net.mhaks.dustydecorations;

import net.mhaks.dustydecorations.block.entity.ModBlockEntities;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.block.entity.client.PaperLanternBlockRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

@Mod(DustyDecorationsConstants.MOD_ID)
public class DustyDecorationsNeoforge {

    public DustyDecorationsNeoforge(IEventBus eventBus, ModContainer modContainer) {
        // This method is invoked by the NeoForge mod loader when it is ready
        // to load your mod. You can access NeoForge and Common code in this
        // project.

        // Use NeoForge to bootstrap the Common mod.
        DustyDecorationsConstants.LOGGER.info("Hello NeoForge world!");
        DustyDecorations.init();


    }

    @EventBusSubscriber(modid = DustyDecorationsConstants.MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            DustyDecorationsConstants.LOGGER.info("HELLO FROM CLIENT SETUP");
            DustyDecorationsConstants.LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_BANISTER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_BANISTER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_BANISTER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_BANISTER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_BANISTER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_BANISTER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MANGROVE_BANISTER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHERRY_BANISTER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BAMBOO_BANISTER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRY_BAMBOO_BANISTER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_BANISTER.get(), RenderType.cutout());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WHITE_WOOL_AWNING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_GRAY_WOOL_AWNING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GRAY_WOOL_AWNING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLACK_WOOL_AWNING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BROWN_WOOL_AWNING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.RED_WOOL_AWNING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ORANGE_WOOL_AWNING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.YELLOW_WOOL_AWNING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIME_WOOL_AWNING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GREEN_WOOL_AWNING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CYAN_WOOL_AWNING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIGHT_BLUE_WOOL_AWNING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BLUE_WOOL_AWNING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PURPLE_WOOL_AWNING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MAGENTA_WOOL_AWNING.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.PINK_WOOL_AWNING.get(), RenderType.cutout());

            BlockEntityRenderers.register(ModBlockEntities.PAPER_LANTERN_BLOCK_ENTITY.get(), PaperLanternBlockRenderer::new);

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HAZEL_SEA_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MOCHA_SEA_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SCARLET_SEA_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HONEY_SEA_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MOCHA_SEA_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TEAL_SEA_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CERULEAN_SEA_GLASS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TAUPE_SEA_GLASS.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HAZEL_SEA_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MOCHA_SEA_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SCARLET_SEA_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HONEY_SEA_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MOCHA_SEA_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TEAL_SEA_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CERULEAN_SEA_GLASS_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TAUPE_SEA_GLASS_PANE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HAZEL_SEA_WINDOW.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MOCHA_SEA_WINDOW.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SCARLET_SEA_WINDOW.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HONEY_SEA_WINDOW.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MOCHA_SEA_WINDOW.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TEAL_SEA_WINDOW.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CERULEAN_SEA_WINDOW.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TAUPE_SEA_WINDOW.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HAZEL_SEA_WINDOW_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MOCHA_SEA_WINDOW_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SCARLET_SEA_WINDOW_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HONEY_SEA_WINDOW_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MOCHA_SEA_WINDOW_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TEAL_SEA_WINDOW_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CERULEAN_SEA_WINDOW_PANE.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TAUPE_SEA_WINDOW_PANE.get(), RenderType.translucent());

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.RUSTED_ANCHOR.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.LIFE_PRESERVER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.TREASURE_MAP.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.POSTERS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLASS_BUOY.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SMALL_GLASS_BUOYS.get(), RenderType.translucent());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOODEN_BUOYS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ROPE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HANGING_COD.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HANGING_SALMON.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.HANGING_KNIVES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WEDGED_KNIFE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.WEDGED_CLEAVER.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.KNIFE_AND_CUTTING_BOARD.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.JARS.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.INK_AND_QUILL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CLUTTERED_SMALL_SHELF.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.GLOBE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.VINTAGE_GLOBE.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BOVINE_SKULL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.EQUINE_SKULL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CANINE_SKULL.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FISH_BONES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SMALL_SHARK_JAW.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIG_SHARK_JAW.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MEGALODON_TOOTH.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.FISHING_LURES.get(), RenderType.cutout());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SCATTERED_GOLD_COINS.get(), RenderType.cutout());

        }
    }

}