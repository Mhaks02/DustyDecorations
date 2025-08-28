package net.mhaks.dustydecorations.item;

import net.mhaks.dustydecorations.DustyDecorationsConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.registration.RegistrationProvider;
import net.mhaks.dustydecorations.registration.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class ModCreativeModeTabs {
    public static final RegistrationProvider<CreativeModeTab> CREATIVE_TABS = RegistrationProvider.get(BuiltInRegistries.CREATIVE_MODE_TAB, DustyDecorationsConstants.MOD_ID);

    public static final RegistryObject<CreativeModeTab, CreativeModeTab> TEST_TAB = CREATIVE_TABS.register("test_tab",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .icon(() -> new ItemStack(Blocks.ACACIA_BUTTON))
                    .title(Component.translatable("creativetab.dustydecorations.test_tab"))
                    .displayItems((parameters, output) -> {

                        output.accept(ModBlocks.OAK_BANISTER.get());
                        output.accept(ModBlocks.SPRUCE_BANISTER.get());
                        output.accept(ModBlocks.BIRCH_BANISTER.get());
                        output.accept(ModBlocks.JUNGLE_BANISTER.get());
                        output.accept(ModBlocks.ACACIA_BANISTER.get());
                        output.accept(ModBlocks.DARK_OAK_BANISTER.get());
                        output.accept(ModBlocks.MANGROVE_BANISTER.get());
                        output.accept(ModBlocks.CHERRY_BANISTER.get());
                        output.accept(ModBlocks.BAMBOO_BANISTER.get());
                        output.accept(ModBlocks.DRY_BAMBOO_BANISTER.get());

                    }).build());
    

    public static void registerModCreativeModeTabs() {
        DustyDecorationsConstants.LOGGER.info("Registering Mod Creative Tabs for " + DustyDecorationsConstants.MOD_ID);
    }

}
