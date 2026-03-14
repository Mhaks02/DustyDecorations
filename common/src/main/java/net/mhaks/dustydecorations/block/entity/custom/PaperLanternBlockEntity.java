package net.mhaks.dustydecorations.block.entity.custom;

import net.mhaks.dustydecorations.block.entity.ModBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.*;
import software.bernie.geckolib.util.GeckoLibUtil;
import software.bernie.geckolib.util.RenderUtil;

public class PaperLanternBlockEntity extends BlockEntity implements GeoBlockEntity {
    private final AnimatableInstanceCache CACHE = GeckoLibUtil.createInstanceCache(this);

    public PaperLanternBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntityTypes.PAPER_LANTERN_BLOCK_ENTITY.get(), pos, blockState);
    }

    public PaperLanternBlockEntity(BlockEntityType type, BlockPos pos, BlockState blockState) {
        super(type, pos, blockState);
    }


    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    private PlayState predicate(AnimationState<PaperLanternBlockEntity> paperLanternBlockEntityAnimationState) {
        paperLanternBlockEntityAnimationState.getController().setAnimation(RawAnimation.begin().then("idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return CACHE;
    }

    @Override
    public double getTick(Object blockEntity) {
        return RenderUtil.getCurrentTick();
    }
}
