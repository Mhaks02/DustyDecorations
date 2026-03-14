package net.mhaks.dustydecorations.block.entity.client;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.entity.custom.CameraQuadropodBlockEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import software.bernie.geckolib.model.GeoModel;

public class CameraQuadropodBlockModel extends GeoModel<CameraQuadropodBlockEntity> {

    @Override
    public ResourceLocation getModelResource(CameraQuadropodBlockEntity animatable) {
        BlockState blockState = animatable.getBlockState();
        return switch (blockState.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF)) {
            case UPPER -> switch (blockState.getValue(ModConstants.ATTACHED_CAMERA)) {
                case NONE -> ModConstants.identifierOf("geo/camera_quadropod_top.geo.json");
                case CAMERA -> ModConstants.identifierOf("geo/camera_on_quadropod.geo.json");
                case MOVIE_CAMERA -> ModConstants.identifierOf("geo/movie_camera_on_quadropod.geo.json");
            };
            case LOWER -> ModConstants.identifierOf("geo/camera_quadropod.geo.json");
        };
    }

    @Override
    public ResourceLocation getTextureResource(CameraQuadropodBlockEntity animatable) {
        BlockState blockState = animatable.getBlockState();
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
    public ResourceLocation getAnimationResource(CameraQuadropodBlockEntity animatable) {
        BlockState blockState = animatable.getBlockState();
        DoubleBlockHalf half = blockState.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF);
        ModConstants.AttachedCamera camera = blockState.getValue(ModConstants.ATTACHED_CAMERA);
        return (half == DoubleBlockHalf.UPPER && camera == ModConstants.AttachedCamera.MOVIE_CAMERA)
                ? ModConstants.identifierOf("animations/movie_camera_on_quadropod.animation.json")
                : null;
    }
}
