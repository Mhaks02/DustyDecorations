package net.mhaks.dustydecorations.block.entity.client;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.entity.custom.PaperLanternBlockEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class PaperLanternBlockModel extends GeoModel<PaperLanternBlockEntity> {

    @Override
    public ResourceLocation getModelResource(PaperLanternBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(ModConstants.MOD_ID, "geo/paper_lantern.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PaperLanternBlockEntity animatable) {
        ResourceLocation texture = ResourceLocation.tryParse(animatable.getBlockState().getBlockHolder().getRegisteredName());
        return ResourceLocation.fromNamespaceAndPath(ModConstants.MOD_ID, "textures/block/" + texture.getPath() + ".png");
    }

    @Override
    public ResourceLocation getAnimationResource(PaperLanternBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(ModConstants.MOD_ID, "animations/paper_lantern.animation.json");
    }

}
