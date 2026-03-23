package net.mhaks.dustydecorations.entity.client;

import net.mhaks.dustydecorations.entity.custom.NautilusGolemEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;

public class NautilusGolemRenderer extends GeoEntityRenderer<NautilusGolemEntity> {
    public NautilusGolemRenderer(EntityRendererProvider.Context context) {
        super(context, new NautilusGolemModel());

        addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }
}
