package net.mhaks.dustydecorations;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.mhaks.dustydecorations.block.entity.ModBlockEntities;
import net.mhaks.dustydecorations.block.ModBlocks;
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
    }
}
