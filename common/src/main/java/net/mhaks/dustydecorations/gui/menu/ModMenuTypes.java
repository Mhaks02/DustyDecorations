package net.mhaks.dustydecorations.gui.menu;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.gui.menu.custom.VintageCashRegisterMenu;
import net.mhaks.dustydecorations.platform.Services;
import net.mhaks.dustydecorations.registration.RegistrationProvider;
import net.mhaks.dustydecorations.registration.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.inventory.MenuType;

public class ModMenuTypes/*<T extends AbstractContainerMenu> implements FeatureElement*/ {
    public static final RegistrationProvider<MenuType<?>> MENUS = RegistrationProvider.get(BuiltInRegistries.MENU, ModConstants.MOD_ID);

    public static final RegistryObject<MenuType<?>, MenuType<VintageCashRegisterMenu>> VINTAGE_CASH_REGISTER_MENU = MENUS.register("vintage_cash_register", Services.PLATFORM::registerMenu);


    public static void registerModMenuTypes() {
        ModConstants.LOGGER.info("Registering Mod Menu Types for " + ModConstants.MOD_ID);
    }
}
