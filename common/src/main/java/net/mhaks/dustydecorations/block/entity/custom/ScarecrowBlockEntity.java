package net.mhaks.dustydecorations.block.entity.custom;

import net.mhaks.dustydecorations.block.entity.ModBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import software.bernie.geckolib.animatable.GeoBlockEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.util.GeckoLibUtil;

public class ScarecrowBlockEntity extends BlockEntity implements GeoBlockEntity {
    private final AnimatableInstanceCache CACHE = GeckoLibUtil.createInstanceCache(this);

    public ScarecrowBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntityTypes.SCARECROW_BLOCK_ENTITY.get(), pos, blockState);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return CACHE;
    }
}
