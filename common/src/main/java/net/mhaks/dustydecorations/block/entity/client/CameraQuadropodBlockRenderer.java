package net.mhaks.dustydecorations.block.entity.client;

import net.mhaks.dustydecorations.block.entity.custom.CameraQuadropodBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import software.bernie.geckolib.renderer.GeoBlockRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class CameraQuadropodBlockRenderer<R extends BlockEntityRenderState & GeoRenderState> extends GeoBlockRenderer<CameraQuadropodBlockEntity, R> {

    public CameraQuadropodBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new CameraQuadropodBlockModel());
    }
}