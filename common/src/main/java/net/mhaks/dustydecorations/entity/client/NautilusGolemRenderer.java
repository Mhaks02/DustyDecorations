package net.mhaks.dustydecorations.entity.client;

import net.mhaks.dustydecorations.entity.custom.NautilusGolemEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.base.BoneSnapshots;
import software.bernie.geckolib.renderer.base.GeoRenderState;
import software.bernie.geckolib.renderer.base.RenderPassInfo;
import software.bernie.geckolib.renderer.layer.builtin.AutoGlowingGeoLayer;

public class NautilusGolemRenderer<R extends LivingEntityRenderState & GeoRenderState> extends GeoEntityRenderer<NautilusGolemEntity, R> {
    public NautilusGolemRenderer(EntityRendererProvider.Context context) {
        super(context, new NautilusGolemModel());

        withRenderLayer(new AutoGlowingGeoLayer<>(this));
    }

    @Override
    public void adjustModelBonesForRender(RenderPassInfo<R> renderPassInfo, BoneSnapshots snapshots) {
        DefaultAnimations.hardcodedHeadRotation(renderPassInfo, snapshots, "head");
    }
}
