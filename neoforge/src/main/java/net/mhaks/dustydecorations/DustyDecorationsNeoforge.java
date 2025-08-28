package net.mhaks.dustydecorations;

import net.mhaks.dustydecorations.block.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
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
//        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_BANISTER.get(), RenderType.CUTOUT_MIPPED);
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

            ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_BANISTER.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_BANISTER.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_BANISTER.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_BANISTER.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_BANISTER.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_BANISTER.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.MANGROVE_BANISTER.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.CHERRY_BANISTER.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.BAMBOO_BANISTER.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.DRY_BAMBOO_BANISTER.get(), RenderType.cutoutMipped());
            ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_BANISTER.get(), RenderType.cutoutMipped());
        }
    }

}