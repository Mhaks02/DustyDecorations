package net.mhaks.dustydecorations.block.entity.client;

import net.mhaks.dustydecorations.block.entity.custom.NautilusWindChimeBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.world.level.block.entity.BlockEntityType;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class NautilusWindChimeBlockRenderer extends GeoBlockRenderer<NautilusWindChimeBlockEntity> {
    public NautilusWindChimeBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new NautilusWindChimeBlockModel());
    }
}
