package net.mhaks.dustydecorations.entity.client;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.entity.custom.NautilusGolemEntity;
import net.minecraft.resources.Identifier;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class NautilusGolemModel extends GeoModel<NautilusGolemEntity> {

    @Override
    public Identifier getModelResource(GeoRenderState renderState) {
        return ModConstants.identifierOf("geo/entity/nautilus_golem.geo.json");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        return ModConstants.identifierOf("textures/entity/nautilus_golem.png");
    }

    @Override
    public Identifier getAnimationResource(NautilusGolemEntity animatable) {
        return ModConstants.identifierOf("animations/entity/nautilus_golem.animation.json");
    }

}
