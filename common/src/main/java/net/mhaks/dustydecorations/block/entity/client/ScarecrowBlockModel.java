package net.mhaks.dustydecorations.block.entity.client;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.custom.ScarecrowBlock;
import net.mhaks.dustydecorations.block.entity.custom.CameraQuadropodBlockEntity;
import net.mhaks.dustydecorations.block.entity.custom.ScarecrowBlockEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import software.bernie.geckolib.model.GeoModel;

public class ScarecrowBlockModel extends GeoModel<ScarecrowBlockEntity> {

    @Override
    public ResourceLocation getModelResource(ScarecrowBlockEntity animatable) {
        ScarecrowBlock.Type scarecrow$type = ((ScarecrowBlock) animatable.getBlockState().getBlock()).getType();
        if (scarecrow$type == ScarecrowBlock.Types.BEETROOT) {
            return animatable.getBlockState().getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.UPPER
                    ? ModConstants.identifierOf("geo/beetroot_scarecrow_top.geo.json")
                    : ModConstants.identifierOf("geo/beetroot_scarecrow_bottom.geo.json");
        }
        if (scarecrow$type == ScarecrowBlock.Types.PUMPKIN) {
            return animatable.getBlockState().getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.UPPER
                    ? ModConstants.identifierOf("geo/pumpkin_scarecrow_top.geo.json")
                    : ModConstants.identifierOf("geo/pumpkin_scarecrow_bottom.geo.json");
        }
        return null;
    }

    @Override
    public ResourceLocation getTextureResource(ScarecrowBlockEntity animatable) {
        String texture = ResourceLocation.tryParse(animatable.getBlockState().getBlockHolder().getRegisteredName()).getPath();
        return ModConstants.identifierOf("textures/block/" + texture + ".png");
    }

    @Override
    public ResourceLocation getAnimationResource(ScarecrowBlockEntity animatable) {
        ScarecrowBlock.Type scarecrow$type = ((ScarecrowBlock) animatable.getBlockState().getBlock()).getType();
        return scarecrow$type == ScarecrowBlock.Types.BEETROOT
                ? ModConstants.identifierOf("animations/beetroot_scarecrow.animation.json")
                : ModConstants.identifierOf("animations/pumpkin_scarecrow.animation.json");
    }
}
