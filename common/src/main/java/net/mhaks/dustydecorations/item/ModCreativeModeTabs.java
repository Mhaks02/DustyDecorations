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

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final RegistrationProvider<CreativeModeTab> CREATIVE_TABS = RegistrationProvider.get(BuiltInRegistries.CREATIVE_MODE_TAB, DustyDecorationsConstants.MOD_ID);

    public static final Supplier<CreativeModeTab> TEST_TAB = CREATIVE_TABS.register("test_tab",
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

                        output.accept(ModBlocks.OAK_LARGE_SHELF.get());
                        output.accept(ModBlocks.SPRUCE_LARGE_SHELF.get());
                        output.accept(ModBlocks.BIRCH_LARGE_SHELF.get());
                        output.accept(ModBlocks.JUNGLE_LARGE_SHELF.get());
                        output.accept(ModBlocks.ACACIA_LARGE_SHELF.get());
                        output.accept(ModBlocks.DARK_OAK_LARGE_SHELF.get());
                        output.accept(ModBlocks.MANGROVE_LARGE_SHELF.get());
                        output.accept(ModBlocks.CHERRY_LARGE_SHELF.get());
                        output.accept(ModBlocks.BAMBOO_LARGE_SHELF.get());
                        output.accept(ModBlocks.CRIMSON_LARGE_SHELF.get());
                        output.accept(ModBlocks.WARPED_LARGE_SHELF.get());

                        output.accept(ModBlocks.APPLE_BARREL.get());
                        output.accept(ModBlocks.SWEET_BERRIES_BARREL.get());
                        output.accept(ModBlocks.GLOW_BERRIES_BARREL.get());
                        output.accept(ModBlocks.CARROT_BARREL.get());
                        output.accept(ModBlocks.POTATO_BARREL.get());
                        output.accept(ModBlocks.BEETROOT_BARREL.get());
                        output.accept(ModBlocks.SEA_PICKLE_BARREL.get());
                        output.accept(ModBlocks.COD_BARREL.get());
                        output.accept(ModBlocks.SALMON_BARREL.get());
                        output.accept(ModBlocks.EMPTY_BARREL.get());

                        output.accept(ModBlocks.SUNFLOWER_WALLPAPER.get());
                        output.accept(ModBlocks.REGAL_WALLPAPER.get());
                        output.accept(ModBlocks.VINE_WALLPAPER.get());
                        output.accept(ModBlocks.MONSTER_WALLPAPER.get());
                        output.accept(ModBlocks.SAILOR_WALLPAPER.get());

                        output.accept(ModBlocks.WHITE_WOOL_AWNING.get());
                        output.accept(ModBlocks.LIGHT_GRAY_WOOL_AWNING.get());
                        output.accept(ModBlocks.GRAY_WOOL_AWNING.get());
                        output.accept(ModBlocks.BLACK_WOOL_AWNING.get());
                        output.accept(ModBlocks.BROWN_WOOL_AWNING.get());
                        output.accept(ModBlocks.RED_WOOL_AWNING.get());
                        output.accept(ModBlocks.ORANGE_WOOL_AWNING.get());
                        output.accept(ModBlocks.YELLOW_WOOL_AWNING.get());
                        output.accept(ModBlocks.LIME_WOOL_AWNING.get());
                        output.accept(ModBlocks.GREEN_WOOL_AWNING.get());
                        output.accept(ModBlocks.CYAN_WOOL_AWNING.get());
                        output.accept(ModBlocks.LIGHT_BLUE_WOOL_AWNING.get());
                        output.accept(ModBlocks.BLUE_WOOL_AWNING.get());
                        output.accept(ModBlocks.PURPLE_WOOL_AWNING.get());
                        output.accept(ModBlocks.MAGENTA_WOOL_AWNING.get());
                        output.accept(ModBlocks.PINK_WOOL_AWNING.get());

                        output.accept(ModBlocks.PAPER_LANTERN.get());
                        output.accept(ModBlocks.SAKURA_PAPER_LANTERN.get());
                        output.accept(ModBlocks.TAIGA_PAPER_LANTERN.get());
                        output.accept(ModBlocks.ORCHID_PAPER_LANTERN.get());
                        output.accept(ModBlocks.PANDA_PAPER_LANTERN.get());
                        output.accept(ModBlocks.VILLAGER_PAPER_LANTERN.get());
                        output.accept(ModBlocks.CREEPER_PAPER_LANTERN.get());
                        output.accept(ModBlocks.CHICKEN_JOCKEY_PAPER_LANTERN.get());
                        output.accept(ModBlocks.PILLAGER_PAPER_LANTERN.get());
                        output.accept(ModBlocks.WARDEN_PAPER_LANTERN.get());

                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_STAIRS.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_SLAB.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_FENCE.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_FENCE_GATE.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_DOOR.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_TRAPDOOR.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_BUTTON.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_ROOFING.get());

                        output.accept(ModBlocks.HAZEL_SEA_GLASS.get());
                        output.accept(ModBlocks.MOCHA_SEA_GLASS.get());
                        output.accept(ModBlocks.SCARLET_SEA_GLASS.get());
                        output.accept(ModBlocks.HONEY_SEA_GLASS.get());
                        output.accept(ModBlocks.MINT_SEA_GLASS.get());
                        output.accept(ModBlocks.TEAL_SEA_GLASS.get());
                        output.accept(ModBlocks.CERULEAN_SEA_GLASS.get());
                        output.accept(ModBlocks.TAUPE_SEA_GLASS.get());

                        output.accept(ModBlocks.HAZEL_SEA_GLASS_PANE.get());
                        output.accept(ModBlocks.MOCHA_SEA_GLASS_PANE.get());
                        output.accept(ModBlocks.SCARLET_SEA_GLASS_PANE.get());
                        output.accept(ModBlocks.HONEY_SEA_GLASS_PANE.get());
                        output.accept(ModBlocks.MINT_SEA_GLASS_PANE.get());
                        output.accept(ModBlocks.TEAL_SEA_GLASS_PANE.get());
                        output.accept(ModBlocks.CERULEAN_SEA_GLASS_PANE.get());
                        output.accept(ModBlocks.TAUPE_SEA_GLASS_PANE.get());


                    }).build());
    

    public static void registerModCreativeModeTabs() {
        DustyDecorationsConstants.LOGGER.info("Registering Mod Creative Tabs for " + DustyDecorationsConstants.MOD_ID);
    }

}
