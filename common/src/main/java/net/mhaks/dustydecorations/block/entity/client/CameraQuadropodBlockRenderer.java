package net.mhaks.dustydecorations.block.entity.client;

import net.mhaks.dustydecorations.block.entity.custom.CameraQuadropodBlockEntity;
import net.mhaks.dustydecorations.block.entity.custom.PaperLanternBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class CameraQuadropodBlockRenderer extends GeoBlockRenderer<CameraQuadropodBlockEntity> {
    public CameraQuadropodBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new CameraQuadropodBlockModel());
    }
}