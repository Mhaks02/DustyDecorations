package net.mhaks.dustydecorations.block.entity.custom;

import net.mhaks.dustydecorations.block.entity.ModBlockEntityTypes;
import net.mhaks.dustydecorations.gui.menu.custom.VintageCashRegisterMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.NonNullList;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.world.ContainerHelper;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BaseContainerBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class VintageCashRegisterBlockEntity extends BaseContainerBlockEntity {
    public static final int SIZE = 9;
    private NonNullList<ItemStack> items = NonNullList.withSize(SIZE, ItemStack.EMPTY);
    private ItemStack contents;

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
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        this.items = NonNullList.withSize(this.getContainerSize(), ItemStack.EMPTY);
        ContainerHelper.loadAllItems(tag, this.items, registries);
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        ContainerHelper.saveAllItems(tag, this.items, registries);
    }

        @Override
    protected AbstractContainerMenu createMenu(int containerId, Inventory inventory) {
        return new VintageCashRegisterMenu(containerId, inventory, this);
    }

}
