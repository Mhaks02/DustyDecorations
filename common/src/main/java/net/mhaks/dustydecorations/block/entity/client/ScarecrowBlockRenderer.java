package net.mhaks.dustydecorations.block.entity.client;

import net.mhaks.dustydecorations.block.entity.custom.PaperLanternBlockEntity;
import net.mhaks.dustydecorations.block.entity.custom.ScarecrowBlockEntity;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public class ScarecrowBlockRenderer extends GeoBlockRenderer<ScarecrowBlockEntity> {
    public ScarecrowBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(new ScarecrowBlockModel());
    }
}