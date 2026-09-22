package net.mhaks.dustydecorations.platform;

import net.mhaks.dustydecorations.gui.menu.custom.VintageCashRegisterMenu;
import net.mhaks.dustydecorations.platform.services.IPlatformHelper;
import net.minecraft.core.BlockPos;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

public class NeoForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {

        return "NeoForge";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return !FMLLoader.isProduction();
    }

    @Override
    public void openVintageCashRegisterMenu(MenuProvider provider, Player player, BlockPos blockPos) {
        player.openMenu(provider, registryFriendlyByteBuf -> BlockPos.STREAM_CODEC.encode(registryFriendlyByteBuf, blockPos));
    }

    @Override
    public MenuType<VintageCashRegisterMenu> registerMenu() {
        return IMenuTypeExtension.create(VintageCashRegisterMenu::new);
    }
}