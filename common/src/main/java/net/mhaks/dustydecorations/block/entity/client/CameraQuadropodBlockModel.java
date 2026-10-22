package net.mhaks.dustydecorations.block.entity.client;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.entity.custom.CameraQuadropodBlockEntity;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.renderer.base.GeoRenderState;

public class CameraQuadropodBlockModel extends GeoModel<CameraQuadropodBlockEntity> {

    @Override
    public Identifier getModelResource(GeoRenderState renderState) {
        BlockState blockState = renderState.getGeckolibData(DataTickets.BLOCKSTATE);
        return switch (blockState.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF)) {
            case UPPER -> switch (blockState.getValue(ModConstants.ATTACHED_CAMERA)) {
                case NONE -> ModConstants.identifierOf("camera_quadropod_top");
                case CAMERA -> ModConstants.identifierOf("camera_on_quadropod");
                case MOVIE_CAMERA -> ModConstants.identifierOf("movie_camera_on_quadropod");
            };
            case LOWER -> ModConstants.identifierOf("camera_quadropod");
        };
    }

    @Override
    public Identifier getTextureResource(GeoRenderState renderState) {
        BlockState blockState = renderState.getGeckolibData(DataTickets.BLOCKSTATE);
        return switch (blockState.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF)) {
            case UPPER -> switch (blockState.getValue(ModConstants.ATTACHED_CAMERA)) {
                case NONE -> ModConstants.identifierOf("textures/block/camera_quadropod.png");
                case CAMERA -> ModConstants.identifierOf("textures/block/camera.png");
                case MOVIE_CAMERA -> ModConstants.identifierOf("textures/block/movie_camera.png");
            };
            case LOWER -> ModConstants.identifierOf("textures/block/camera_quadropod.png");
        };
    }

    @Override
    public Identifier getAnimationResource(CameraQuadropodBlockEntity animatable) {
        BlockState blockState = animatable.getBlockState();
        DoubleBlockHalf half = blockState.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF);
        ModConstants.AttachedCamera camera = blockState.getValue(ModConstants.ATTACHED_CAMERA);
        return (half == DoubleBlockHalf.UPPER && camera == ModConstants.AttachedCamera.MOVIE_CAMERA)
                ? ModConstants.identifierOf("movie_camera_on_quadropod")
                : null;
    }
}
