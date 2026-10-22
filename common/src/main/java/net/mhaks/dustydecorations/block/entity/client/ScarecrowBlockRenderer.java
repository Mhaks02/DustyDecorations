package net.mhaks.dustydecorations.block.entity.client;

import net.mhaks.dustydecorations.block.entity.custom.ScarecrowBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import software.bernie.geckolib.renderer.GeoBlockRenderer;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class ScarecrowBlockRenderer<R extends BlockEntityRenderState & GeoRenderState> extends GeoBlockRenderer<ScarecrowBlockEntity, R> {

    public ScarecrowBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new ScarecrowBlockModel());
    }
}