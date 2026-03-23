package net.mhaks.dustydecorations.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.AbstractGolem;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.animation.AnimationController;
import software.bernie.geckolib.animation.PlayState;
import software.bernie.geckolib.animation.RawAnimation;
import software.bernie.geckolib.util.GeckoLibUtil;

public class NautilusGolemEntity extends AbstractGolem implements GeoEntity {
    private final AnimatableInstanceCache CACHE = GeckoLibUtil.createInstanceCache(this);
    protected static final EntityDataAccessor<Byte> DATA_FLAGS_ID = SynchedEntityData.defineId(NautilusGolemEntity.class, EntityDataSerializers.BYTE);

    public NautilusGolemEntity(EntityType<? extends AbstractGolem> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.0, Ingredient.of(Blocks.DARK_OAK_PLANKS.asItem()), false));
        this.goalSelector.addGoal(4, new FollowBoatGoal(this));
        this.goalSelector.addGoal(5, new RandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 6.0f));
        this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
//        this.goalSelector.addGoal(15, new AvoidEntityGoal<>(this, ElderGuardian.class, 12.0f, 1.2, 1.2));
//        this.goalSelector.addGoal(15, new AvoidEntityGoal<>(this, WitherBoss.class, 12.0f, 1.2, 1.2));
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this).setAlertOthers());
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal<>(this, Mob.class, 5, true, false, this::attackPredicate));
    }

    private boolean attackPredicate(LivingEntity livingEntity) {
        if (livingEntity instanceof Enemy
                && (livingEntity instanceof Guardian
                || livingEntity instanceof Zombie
                || livingEntity instanceof ZombieVillager
                || livingEntity instanceof Skeleton
                || livingEntity instanceof WitherSkeleton
                || livingEntity instanceof Witch)) {
            return true;
        } else {
            return false;
        }
    }

    public static AttributeSupplier.Builder createAttributes() {
        return AbstractGolem.createLivingAttributes()
                .add(Attributes.MOVEMENT_SPEED, 0.25)
                .add(Attributes.MAX_HEALTH, 55)
                .add(Attributes.ARMOR, 2)
                .add(Attributes.ATTACK_DAMAGE, 3)
                .add(Attributes.FOLLOW_RANGE, 16)
                .add(Attributes.ATTACK_KNOCKBACK, 0.5);
    }

    @Override
    protected void defineSynchedData(SynchedEntityData.Builder builder) {
        super.defineSynchedData(builder);
        builder.define(DATA_FLAGS_ID, (byte) 0);
    }

    @Override
    protected EntityDimensions getDefaultDimensions(Pose pose) {
        return super.getDefaultDimensions(pose);
    }

    //    @Override
//    public boolean canAttackType(EntityType<?> type) {
//        return super.canAttackType(type);
//    }

    //TODO: extra methods
//    @Override
//    protected int decreaseAirSupply(int currentAir) {
//        return super.decreaseAirSupply(currentAir);
//    }

    @Override
    public void aiStep() {
        super.aiStep();
        this.updateSwingTime();
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.CHERRY_WOOD_STEP, 0.15f, 1.0f);
    }

    @Override
    protected @Nullable SoundEvent getHurtSound(DamageSource damageSource) {
        return SoundEvents.LANTERN_BREAK;
    }

    @Override
    protected @Nullable SoundEvent getDeathSound() {
        return SoundEvents.LANTERN_FALL;
    }

    @Override
    protected InteractionResult mobInteract(Player player, InteractionHand hand) {
        ItemStack itemStack = player.getItemInHand(hand);
        if (!itemStack.is(Items.DARK_OAK_PLANKS)) {
            return InteractionResult.PASS;
        } else {
            float health = this.getHealth();
            this.heal(4.5f);
            if (this.getHealth() == health) {
                return InteractionResult.PASS;
            } else {
                float pitch = 1.4f + (this.random.nextFloat() - this.random.nextFloat()) * 0.2f;
                itemStack.consume(1, player);
                this.playSound(SoundEvents.IRON_GOLEM_REPAIR, 0.7f, pitch);
                for (int i = 0; i < 5; i++) {
                    double d0 = this.random.nextGaussian() * 0.02;
                    double d1 = this.random.nextGaussian() * 0.02;
                    double d2 = this.random.nextGaussian() * 0.02;
                    this.level().addParticle(ParticleTypes.HAPPY_VILLAGER, this.getRandomX(1.0), this.getRandomY() + 1.0, this.getRandomZ(1.0), d0, d1, d2);
                }
                return InteractionResult.sidedSuccess(this.level().isClientSide);
            }
        }
    }

    //    @Override
//    public void baseTick() {
//        super.baseTick();
//    }

//    @Override
//    public boolean doHurtTarget(Entity entity) {
//        return super.doHurtTarget(entity);
//    }

    @Override
    public void addAdditionalSaveData(CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.putBoolean("PlayerCreated", this.isPlayerCreated());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag compound) {
        super.readAdditionalSaveData(compound);
        this.setPlayerCreated(compound.getBoolean("PlayerCreated"));
    }

    public boolean isPlayerCreated() {
        return (this.entityData.get(DATA_FLAGS_ID) & 1) != 0;
    }

    public void setPlayerCreated(boolean playerCreated) {
        byte b0 = this.entityData.get(DATA_FLAGS_ID);
        if (playerCreated) {
            this.entityData.set(DATA_FLAGS_ID, (byte) (b0 | 1));
        } else {
            this.entityData.set(DATA_FLAGS_ID, (byte) (b0 & -2));
        }
    }

    protected static final RawAnimation IDLE_ANIM = RawAnimation.begin().thenPlay("idle");
    protected static final RawAnimation WALK_ANIM = RawAnimation.begin().thenPlay("walk");
    protected static final RawAnimation SWIM_ANIM = RawAnimation.begin().thenPlay("swim");
    protected static final RawAnimation ATTACK_ANIM = RawAnimation.begin().thenPlay("attack");
    protected static final RawAnimation FALL_ANIM = RawAnimation.begin().thenPlay("fall");

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "idle/walk", state -> {
            if (state.isMoving()) {
                return state.setAndContinue(WALK_ANIM);
            }
            return state.setAndContinue(IDLE_ANIM);
        }));
        controllers.add(new AnimationController<>(this, "swim", state -> {
            if (NautilusGolemEntity.this.isInWater()) {
                return state.setAndContinue(SWIM_ANIM);
            }
            return PlayState.STOP;
        }));
        controllers.add(new AnimationController<>(this, "fall", state -> {
            if (NautilusGolemEntity.this.isFallFlying()) {
                return state.setAndContinue(FALL_ANIM);
            }
            return PlayState.STOP;
        }));
        controllers.add(new AnimationController<>(this, "attack", state -> {
            if (NautilusGolemEntity.this.swinging) {
                return state.setAndContinue(ATTACK_ANIM);
            }
            state.resetCurrentAnimation();
            return PlayState.STOP;
        }));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return CACHE;
    }
}
