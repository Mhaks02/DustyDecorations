package net.mhaks.dustydecorations.platform;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerFactory;
import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.fabricmc.loader.api.FabricLoader;
import net.mhaks.dustydecorations.gui.menu.custom.VintageCashRegisterMenu;
import net.mhaks.dustydecorations.platform.services.IPlatformHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import org.jetbrains.annotations.Nullable;

public class FabricPlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    @Override
    public void openVintageCashRegisterMenu(MenuProvider provider, Player player, BlockPos blockPos) {
        ExtendedScreenHandlerFactory<BlockPos> type = new ExtendedScreenHandlerFactory<>() {
            @Override
            public BlockPos getScreenOpeningData(ServerPlayer player) {
                return blockPos;
            }

            @Override
            public Component getDisplayName() {
                return provider.getDisplayName();
//                return Component.translatable("container.dustydecorations.vintage_cash_register");
            }

            @Override
            public @Nullable AbstractContainerMenu createMenu(int i, Inventory inventory, Player player) {
                return new VintageCashRegisterMenu(i, inventory, blockPos);
            }
        };
        player.openMenu(type);
    }

    @Override
    public MenuType<VintageCashRegisterMenu> registerMenu() {
        return new ExtendedScreenHandlerType<>(VintageCashRegisterMenu::new, BlockPos.STREAM_CODEC);
    }
}
