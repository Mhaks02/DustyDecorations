package net.mhaks.dustydecorations.block.entity.custom;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.entity.ModBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.util.GeckoLibUtil;

public class CameraQuadropodBlockEntity extends BlockEntity implements GeoBlockEntity {
    private final AnimatableInstanceCache CACHE = GeckoLibUtil.createInstanceCache(this);

    public CameraQuadropodBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntityTypes.CAMERA_QUADROPOD_BLOCK_ENTITY.get(), pos, blockState);
    }

    //TODO: easing in and out would be cool
    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "controller", 0, state -> {

            if (this.getBlockState().getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.UPPER
                    && this.getBlockState().getValue(ModConstants.ATTACHED_CAMERA) == ModConstants.AttachedCamera.MOVIE_CAMERA) {
                if (this.getBlockState().getValue(BlockStateProperties.LIT)) {
                    return state.setAndContinue(RawAnimation.begin().thenPlay("rolling"));
                } else {
                    state.resetCurrentAnimation();
                    return PlayState.STOP;
                }
            }
            return PlayState.STOP;
        }));
    }

    @Override
    public double getBoneResetTime() {
        return 20;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return CACHE;
    }
}
