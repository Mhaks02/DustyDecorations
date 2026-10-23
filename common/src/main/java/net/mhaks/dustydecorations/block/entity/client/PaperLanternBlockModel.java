package net.mhaks.dustydecorations.block.entity.client;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.entity.custom.PaperLanternBlockEntity;
import net.minecraft.resources.Identifier;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class PaperLanternBlockModel extends GeoModel<PaperLanternBlockEntity> {
    @Override
    public Identifier getModelResource(GeoRenderState renderState) {
        return ModConstants.identifierOf("block/paper_lantern");
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        Identifier texture = Identifier.tryParse(renderState.getGeckolibData(DataTickets.BLOCKSTATE).getBlockHolder().getRegisteredName());
        return ModConstants.identifierOf("textures/block/" + texture.getPath() + ".png");
    }

    @Override
    public Identifier getAnimationResource(PaperLanternBlockEntity animatable) {
        return ModConstants.identifierOf("block/paper_lantern");
    }
}
