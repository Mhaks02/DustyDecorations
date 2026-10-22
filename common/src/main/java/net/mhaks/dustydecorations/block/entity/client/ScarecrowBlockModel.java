package net.mhaks.dustydecorations.block.entity.client;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.custom.ScarecrowBlock;
import net.mhaks.dustydecorations.block.entity.custom.ScarecrowBlockEntity;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class ScarecrowBlockModel extends GeoModel<ScarecrowBlockEntity> {

    @Override
    public Identifier getModelResource(GeoRenderState renderState) {
        BlockState blockState = renderState.getGeckolibData(DataTickets.BLOCKSTATE);
        ScarecrowBlock.Type scarecrow$type = ((ScarecrowBlock) blockState.getBlock()).getType();
        if (scarecrow$type == ScarecrowBlock.Types.BEETROOT) {
            return blockState.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.UPPER
                    ? ModConstants.identifierOf("beetroot_scarecrow_top")
                    : ModConstants.identifierOf("beetroot_scarecrow_bottom");
        }
        if (scarecrow$type == ScarecrowBlock.Types.PUMPKIN) {
            return blockState.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.UPPER
                    ? ModConstants.identifierOf("pumpkin_scarecrow_top")
                    : ModConstants.identifierOf("pumpkin_scarecrow_bottom");
        }
        return null;
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        BlockState blockState = renderState.getGeckolibData(DataTickets.BLOCKSTATE);
        String texture = Identifier.tryParse(blockState.getBlockHolder().getRegisteredName()).getPath();
        return ModConstants.identifierOf("textures/block/" + texture + ".png");
    }

    @Override
    public Identifier getAnimationResource(ScarecrowBlockEntity animatable) {
        ScarecrowBlock.Type scarecrow$type = ((ScarecrowBlock) animatable.getBlockState().getBlock()).getType();
        return scarecrow$type == ScarecrowBlock.Types.BEETROOT
                ? ModConstants.identifierOf("beetroot_scarecrow")
                : ModConstants.identifierOf("pumpkin_scarecrow");
    }
}
