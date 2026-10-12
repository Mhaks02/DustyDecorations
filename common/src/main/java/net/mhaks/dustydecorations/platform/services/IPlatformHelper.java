package net.mhaks.dustydecorations.platform.services;

import net.mhaks.dustydecorations.gui.menu.custom.VintageCashRegisterMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.MenuType;

import java.nio.file.Path;

public interface IPlatformHelper {

    /**
     * Gets the name of the current platform
     *
     * @return The name of the current platform.
     */
    String getPlatformName();

    /**
     * Checks if a mod with the given id is loaded.
     *
     * @param modId The mod to check if it is loaded.
     * @return True if the mod is loaded, false otherwise.
     */
    boolean isModLoaded(String modId);

    /**
     * Check if the game is currently in a development environment.
     *
     * @return True if in a development environment, false otherwise.
     */
    boolean isDevelopmentEnvironment();

    /**
     * Gets the name of the environment type as a string.
     *
     * @return The name of the environment type.
     */
    default String getEnvironmentName() {

        return isDevelopmentEnvironment() ? "development" : "production";
    }

    enum Side {
        CLIENT, SERVER;

        public boolean isClient() {
            return this == CLIENT;
        }
        public boolean isServer() {
            return this == SERVER;
        }

        public void ifClient(Runnable runnable) {
            if (isClient()) runnable.run();
        }
        public void ifServer(Runnable runnable) {
            if (isServer()) runnable.run();
        }
    }

    default Side getPhysicalSide() {
        throw new AssertionError();
    }

    Path getConfigDir();

    void openVintageCashRegisterMenu(MenuProvider provider, Player player, BlockPos blockPos);
    MenuType<VintageCashRegisterMenu> registerMenu();
}