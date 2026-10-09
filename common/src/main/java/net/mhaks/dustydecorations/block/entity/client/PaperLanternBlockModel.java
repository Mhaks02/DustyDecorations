package net.mhaks.dustydecorations.block.entity.client;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.entity.custom.NautilusWindChimeBlockEntity;
import net.mhaks.dustydecorations.block.entity.custom.PaperLanternBlockEntity;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;

public class PaperLanternBlockModel extends GeoModel<PaperLanternBlockEntity> {

    @Override
    public ResourceLocation getModelResource(PaperLanternBlockEntity animatable, @Nullable GeoRenderer<PaperLanternBlockEntity> renderer) {
        return ResourceLocation.fromNamespaceAndPath(ModConstants.MOD_ID, "geo/block/paper_lantern.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(PaperLanternBlockEntity animatable, @Nullable GeoRenderer<PaperLanternBlockEntity> renderer) {
        ResourceLocation texture = ResourceLocation.tryParse(animatable.getBlockState().getBlockHolder().getRegisteredName());
        return ResourceLocation.fromNamespaceAndPath(ModConstants.MOD_ID, "textures/block/" + texture.getPath() + ".png");
    }

    @Override
    public ResourceLocation getAnimationResource(PaperLanternBlockEntity animatable) {
        return ResourceLocation.fromNamespaceAndPath(ModConstants.MOD_ID, "animations/block/paper_lantern.animation.json");
    }

}
