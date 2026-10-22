package net.mhaks.dustydecorations.block.entity.custom;

import net.mhaks.dustydecorations.block.custom.VintageCashRegisterBlock;
import net.mhaks.dustydecorations.block.entity.ModBlockEntityTypes;
import net.mhaks.dustydecorations.gui.menu.custom.VintageCashRegisterMenu;
import net.mhaks.dustydecorations.sound.ModSoundEvents;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.core.Vec3i;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Container;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.ContainerUser;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.entity.ContainerOpenersCounter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import org.jetbrains.annotations.Nullable;

public class VintageCashRegisterBlockEntity extends BaseContainerBlockEntity {
    public static final int SIZE = 9;
    private NonNullList<ItemStack> items = NonNullList.withSize(SIZE, ItemStack.EMPTY);
    private ItemStack contents;

    private final ContainerOpenersCounter openersCounter = new ContainerOpenersCounter() {
        @Override
        protected void onOpen(Level level, BlockPos pos, BlockState state) {
            VintageCashRegisterBlockEntity.this.playSound(state, ModSoundEvents.VINTAGE_CASH_REGISTER_OPEN.get());
        }

        @Override
        protected void onClose(Level level, BlockPos pos, BlockState state) {
            VintageCashRegisterBlockEntity.this.playSound(state, ModSoundEvents.VINTAGE_CASH_REGISTER_CLOSE.get());
        }

        @Override
        protected void openerCountChanged(Level level, BlockPos pos, BlockState state, int count, int openCount) {
        }

        @Override
        public boolean isOwnContainer(Player player) {
            if (player.containerMenu instanceof VintageCashRegisterMenu) {
                Container container = ((VintageCashRegisterMenu) player.containerMenu).getCashRegister();
                return container == VintageCashRegisterBlockEntity.this;
            } else {
                return false;
            }
        }
    };

    public VintageCashRegisterBlockEntity(BlockPos pos, BlockState blockState) {
        super(ModBlockEntityTypes.VINTAGE_CASH_REGISTER_BLOCK_ENTITY.get(), pos, blockState);
    }


    @Override
    public int getContainerSize() {
        return SIZE;
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("container.dustydecorations.vintage_cash_register");
    }

    @Override
    protected NonNullList<ItemStack> getItems() {
        return this.items;
    }

    @Override
    protected void setItems(NonNullList<ItemStack> items) {
        this.items = items;
    }

    @Override
    public @Nullable Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        return saveWithoutMetadata(registries);
    }

    @Override
    protected void loadAdditional(ValueInput p_422403_) {
        super.loadAdditional(p_422403_);
        this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        ContainerHelper.loadAllItems(p_422403_, this.items);
    }

    @Override
    protected void saveAdditional(ValueOutput p_422073_) {
        super.saveAdditional(p_422073_);
        ContainerHelper.saveAllItems(p_422073_, this.items);
    }

    @Override
    protected AbstractContainerMenu createMenu(int containerId, Inventory inventory) {
        return new VintageCashRegisterMenu(containerId, inventory, this);
    }

    @Override
    public void startOpen(ContainerUser user) {
        if (!this.remove && !user.getLivingEntity().isSpectator()) {
            this.openersCounter.incrementOpeners(user.getLivingEntity(), this.getLevel(), this.getBlockPos(), this.getBlockState(), user.getContainerInteractionRange());
        }
    }

    @Override
    public void stopOpen(ContainerUser user) {
        if (!this.remove && !user.getLivingEntity().isSpectator()) {
            this.openersCounter.decrementOpeners(user.getLivingEntity(), this.getLevel(), this.getBlockPos(), this.getBlockState());
        }
    }

    public void recheckOpen() {
        if (!this.remove) {
            this.openersCounter.recheckOpeners(this.getLevel(), this.getBlockPos(), this.getBlockState());
        }
    }

    void playSound(BlockState state, SoundEvent sound) {
        Vec3i vec3i = state.getValue(VintageCashRegisterBlock.FACING).getUnitVec3i();
        double d0 = (double) this.worldPosition.getX() + 0.5 + (double) vec3i.getX() / 2.0;
        double d1 = (double) this.worldPosition.getY() + 0.5 + (double) vec3i.getY() / 2.0;
        double d2 = (double) this.worldPosition.getZ() + 0.5 + (double) vec3i.getZ() / 2.0;
        this.level.playSound(null, d0, d1, d2, sound, SoundSource.BLOCKS, 0.5f, this.level.random.nextFloat() * 0.1F + 0.9F);
    }

}
