package net.mhaks.dustydecorations.block.entity.custom;

import net.mhaks.dustydecorations.block.entity.ModBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

public class NautilusWindChimeBlockEntity extends BlockEntity implements GeoBlockEntity {
    private final AnimatableInstanceCache CACHE = GeckoLibUtil.createInstanceCache(this);

    public NautilusWindChimeBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntityTypes.NAUTILUS_WIND_CHIME_BLOCK_ENTITY.get(), pos, blockState);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "controller",
                state -> state.setAndContinue(RawAnimation.begin().thenPlay("idle"))));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return CACHE;
    }
}
