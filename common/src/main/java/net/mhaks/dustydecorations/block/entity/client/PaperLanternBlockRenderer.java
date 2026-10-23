package net.mhaks.dustydecorations.block.entity.client;

import net.mhaks.dustydecorations.block.entity.custom.PaperLanternBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import software.bernie.geckolib.renderer.GeoBlockRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class PaperLanternBlockRenderer<R extends BlockEntityRenderState & GeoRenderState> extends GeoBlockRenderer<PaperLanternBlockEntity, R> {

    public PaperLanternBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new PaperLanternBlockModel());
    }
}