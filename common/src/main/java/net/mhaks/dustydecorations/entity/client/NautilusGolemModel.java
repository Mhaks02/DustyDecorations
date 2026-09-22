package net.mhaks.dustydecorations.entity.client;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.entity.custom.NautilusGolemEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.animation.AnimationState;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class NautilusGolemModel extends GeoModel<NautilusGolemEntity> {

    @Override
    public ResourceLocation getModelResource(NautilusGolemEntity animatable) {
        return ModConstants.identifierOf("geo/entity/nautilus_golem.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NautilusGolemEntity animatable) {
        return ModConstants.identifierOf("textures/entity/nautilus_golem.png");
    }

    @Override
    public ResourceLocation getAnimationResource(NautilusGolemEntity animatable) {
        return ModConstants.identifierOf("animations/entity/nautilus_golem.animation.json");
    }


    @Override
    public void setCustomAnimations(NautilusGolemEntity animatable, long instanceId, AnimationState<NautilusGolemEntity> animationState) {
        GeoBone head = getAnimationProcessor().getBone("Head");

        if (head != null) {
            EntityModelData entityModelData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityModelData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityModelData.netHeadYaw() * Mth.DEG_TO_RAD);
        }
    }
}
