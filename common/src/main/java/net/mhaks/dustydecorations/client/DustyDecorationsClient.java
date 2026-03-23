package net.mhaks.dustydecorations.client;

import net.mhaks.dustydecorations.block.entity.ModBlockEntityTypes;
import net.mhaks.dustydecorations.block.entity.client.CameraQuadropodBlockRenderer;
import net.mhaks.dustydecorations.block.entity.client.NautilusWindChimeBlockRenderer;
import net.mhaks.dustydecorations.block.entity.client.PaperLanternBlockRenderer;
import net.mhaks.dustydecorations.block.entity.client.ScarecrowBlockRenderer;
import net.mhaks.dustydecorations.entity.ModEntityTypes;
import net.mhaks.dustydecorations.entity.client.NautilusGolemRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

import java.util.function.BiConsumer;

public class DustyDecorationsClient {

    public static void registerRenderers(BiConsumer<EntityType<? extends Entity>, EntityRendererProvider> entityRenderers, BiConsumer<BlockEntityType<? extends BlockEntity>, BlockEntityRendererProvider> blockEntityRenderers) {

        entityRenderers.accept(ModEntityTypes.NAUTILUS_GOLEM.get(), NautilusGolemRenderer::new);

        blockEntityRenderers.accept(ModBlockEntityTypes.PAPER_LANTERN_BLOCK_ENTITY.get(), PaperLanternBlockRenderer::new);
        blockEntityRenderers.accept(ModBlockEntityTypes.CAMERA_QUADROPOD_BLOCK_ENTITY.get(), CameraQuadropodBlockRenderer::new);
        blockEntityRenderers.accept(ModBlockEntityTypes.SCARECROW_BLOCK_ENTITY.get(), ScarecrowBlockRenderer::new);
        blockEntityRenderers.accept(ModBlockEntityTypes.NAUTILUS_WIND_CHIME_BLOCK_ENTITY.get(), NautilusWindChimeBlockRenderer::new);

    }

}
