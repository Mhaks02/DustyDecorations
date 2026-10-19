package net.mhaks.dustydecorations.block.entity.client;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.entity.custom.NautilusWindChimeBlockEntity;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.GeoRenderer;

public class NautilusWindChimeBlockModel extends GeoModel<NautilusWindChimeBlockEntity> {
    @Override
    public ResourceLocation getModelResource(NautilusWindChimeBlockEntity animatable, @Nullable GeoRenderer<NautilusWindChimeBlockEntity> renderer) {
        return ModConstants.identifierOf("geo/block/nautilus_wind_chime.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NautilusWindChimeBlockEntity animatable, @Nullable GeoRenderer<NautilusWindChimeBlockEntity> renderer) {
        ResourceLocation texture = ResourceLocation.tryParse(animatable.getBlockState().getBlockHolder().getRegisteredName());
        return ModConstants.identifierOf("textures/block/" + texture.getPath() + ".png");
    }

    @Override
    public ResourceLocation getAnimationResource(NautilusWindChimeBlockEntity animatable) {
        return ModConstants.identifierOf("animations/block/nautilus_wind_chime.animation.json");
    }
}
