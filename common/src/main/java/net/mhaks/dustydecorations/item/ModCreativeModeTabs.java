package net.mhaks.dustydecorations.item;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.registration.RegistrationProvider;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final RegistrationProvider<CreativeModeTab> CREATIVE_TABS = RegistrationProvider.get(BuiltInRegistries.CREATIVE_MODE_TAB, ModConstants.MOD_ID);

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
                        output.accept(ModBlocks.CRIMSON_BANISTER.get());
                        output.accept(ModBlocks.WARPED_BANISTER.get());

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

                        output.accept(ModBlocks.SUNFLOWER_WALLPAPER_BLOCK.get());
                        output.accept(ModBlocks.REGAL_WALLPAPER_BLOCK.get());
                        output.accept(ModBlocks.VINE_WALLPAPER_BLOCK.get());
                        output.accept(ModBlocks.MONSTER_WALLPAPER_BLOCK.get());
                        output.accept(ModBlocks.SAILOR_WALLPAPER_BLOCK.get());
                        output.accept(ModBlocks.COPPER_WALLPAPER_BLOCK.get());
                        output.accept(ModBlocks.STELLAR_WALLPAPER_BLOCK.get());
                        output.accept(ModBlocks.PUMPKIN_WALLPAPER_BLOCK.get());
                        output.accept(ModBlocks.SOUL_WALLPAPER_BLOCK.get());
                        output.accept(ModBlocks.FOREST_FESTIVE_WALLPAPER_BLOCK.get());
                        output.accept(ModBlocks.STRIPED_FESTIVE_WALLPAPER_BLOCK.get());
                        output.accept(ModBlocks.SNOWMEN_WALLPAPER_BLOCK.get());
                        output.accept(ModBlocks.SNOWFLAKE_WALLPAPER_BLOCK.get());

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

                        output.accept(ModBlocks.CORRUGATED_METAL_BLOCK.get());
                        output.accept(ModBlocks.CORRUGATED_METAL_GRATE.get());
                        output.accept(ModBlocks.CORRUGATED_METAL_STAIRS.get());
                        output.accept(ModBlocks.CORRUGATED_METAL_SLAB.get());
                        output.accept(ModBlocks.CORRUGATED_METAL_FENCE.get());
                        output.accept(ModBlocks.CORRUGATED_METAL_FENCE_GATE.get());
                        output.accept(ModBlocks.CORRUGATED_METAL_DOOR.get());
                        output.accept(ModBlocks.CORRUGATED_METAL_TRAPDOOR.get());
                        output.accept(ModBlocks.CORRUGATED_METAL_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.CORRUGATED_METAL_BUTTON.get());
                        output.accept(ModBlocks.CORRUGATED_METAL_ROOFING.get());

                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_GRATE.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_STAIRS.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_SLAB.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_FENCE.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_FENCE_GATE.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_DOOR.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_TRAPDOOR.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_BUTTON.get());
                        output.accept(ModBlocks.RUSTED_CORRUGATED_METAL_ROOFING.get());

                        output.accept(ModBlocks.HAZEL_SEAGLASS.get());
                        output.accept(ModBlocks.MOCHA_SEAGLASS.get());
                        output.accept(ModBlocks.SCARLET_SEAGLASS.get());
                        output.accept(ModBlocks.HONEY_SEAGLASS.get());
                        output.accept(ModBlocks.MINT_SEAGLASS.get());
                        output.accept(ModBlocks.TEAL_SEAGLASS.get());
                        output.accept(ModBlocks.CERULEAN_SEAGLASS.get());
                        output.accept(ModBlocks.TAUPE_SEAGLASS.get());

                        output.accept(ModBlocks.HAZEL_SEAGLASS_PANE.get());
                        output.accept(ModBlocks.MOCHA_SEAGLASS_PANE.get());
                        output.accept(ModBlocks.SCARLET_SEAGLASS_PANE.get());
                        output.accept(ModBlocks.HONEY_SEAGLASS_PANE.get());
                        output.accept(ModBlocks.MINT_SEAGLASS_PANE.get());
                        output.accept(ModBlocks.TEAL_SEAGLASS_PANE.get());
                        output.accept(ModBlocks.CERULEAN_SEAGLASS_PANE.get());
                        output.accept(ModBlocks.TAUPE_SEAGLASS_PANE.get());

                        output.accept(ModBlocks.CREAM_SEA_WINDOW.get());
                        output.accept(ModBlocks.HAZEL_SEA_WINDOW.get());
                        output.accept(ModBlocks.MOCHA_SEA_WINDOW.get());
                        output.accept(ModBlocks.SCARLET_SEA_WINDOW.get());
                        output.accept(ModBlocks.HONEY_SEA_WINDOW.get());
                        output.accept(ModBlocks.MINT_SEA_WINDOW.get());
                        output.accept(ModBlocks.TEAL_SEA_WINDOW.get());
                        output.accept(ModBlocks.CERULEAN_SEA_WINDOW.get());
                        output.accept(ModBlocks.TAUPE_SEA_WINDOW.get());

                        output.accept(ModBlocks.CREAM_SEA_WINDOW_PANE.get());
                        output.accept(ModBlocks.HAZEL_SEA_WINDOW_PANE.get());
                        output.accept(ModBlocks.MOCHA_SEA_WINDOW_PANE.get());
                        output.accept(ModBlocks.SCARLET_SEA_WINDOW_PANE.get());
                        output.accept(ModBlocks.HONEY_SEA_WINDOW_PANE.get());
                        output.accept(ModBlocks.MINT_SEA_WINDOW_PANE.get());
                        output.accept(ModBlocks.TEAL_SEA_WINDOW_PANE.get());
                        output.accept(ModBlocks.CERULEAN_SEA_WINDOW_PANE.get());
                        output.accept(ModBlocks.TAUPE_SEA_WINDOW_PANE.get());

                        output.accept(ModBlocks.RUSTED_ANCHOR.get());
                        output.accept(ModBlocks.LIFE_PRESERVER.get());
                        output.accept(ModBlocks.DISPLAYED_OARS.get());
                        output.accept(ModBlocks.TREASURE_MAP.get());
                        output.accept(ModBlocks.SCATTERED_PAPERS.get());
                        output.accept(ModBlocks.POSTERS.get());
                        output.accept(ModBlocks.PAPER_STACK.get());
                        output.accept(ModBlocks.GLASS_BUOY.get());
                        output.accept(ModBlocks.SMALL_GLASS_BUOYS.get());
                        output.accept(ModBlocks.WOODEN_BUOYS.get());
                        output.accept(ModBlocks.ROPE.get());
                        output.accept(ModBlocks.COILED_ROPE.get());
                        output.accept(ModBlocks.HANGING_COD.get());
                        output.accept(ModBlocks.HANGING_SALMON.get());
                        output.accept(ModBlocks.HANGING_KNIVES.get());
                        output.accept(ModBlocks.WEDGED_KNIFE.get());
                        output.accept(ModBlocks.WEDGED_CLEAVER.get());
                        output.accept(ModBlocks.CUTTING_BOARD.get());
                        output.accept(ModBlocks.KNIFE_AND_CUTTING_BOARD.get());
                        output.accept(ModBlocks.IRON_FRYING_PAN.get());
                        output.accept(ModBlocks.COPPER_FRYING_PAN.get());
                        output.accept(ModBlocks.BIG_COOKING_POT.get());
                        output.accept(ModBlocks.POTS_AND_PANS.get());
                        output.accept(Items.BOWL);
                        output.accept(ModBlocks.JARS.get());
                        output.accept(ModBlocks.HONEY_JAR.get());
                        output.accept(ModBlocks.INK_AND_QUILL.get());
                        output.accept(ModBlocks.CLUTTERED_SMALL_SHELF.get());
                        output.accept(ModBlocks.EMPTY_SMALL_SHELF.get());
                        output.accept(ModBlocks.SMALL_BOOKSHELF.get());
                        output.accept(ModBlocks.BOOKS.get());
                        output.accept(ModBlocks.BOOK_STACK.get());
                        output.accept(ModBlocks.GLOBE.get());
                        output.accept(ModBlocks.VINTAGE_GLOBE.get());
                        output.accept(ModBlocks.BOVINE_SKULL.get());
                        output.accept(ModBlocks.EQUINE_SKULL.get());
                        output.accept(ModBlocks.CANINE_SKULL.get());
                        output.accept(ModBlocks.FISH_BONES.get());
                        output.accept(ModBlocks.SMALL_SHARK_JAW.get());
                        output.accept(ModBlocks.BIG_SHARK_JAW.get());
                        output.accept(ModBlocks.MEGALODON_TOOTH.get());
                        output.accept(ModBlocks.FISHING_LURES.get());
                        output.accept(ModBlocks.GOLD_COINS_BLOCK.get());
                        output.accept(ModBlocks.GOLD_COINS.get());
                        output.accept(ModBlocks.SCATTERED_GOLD_COINS.get());
                        output.accept(ModBlocks.SANDSTONE_TILE_BLOCK.get());
                        output.accept(ModBlocks.SANDSTONE_TILE_STAIRS.get());
                        output.accept(ModBlocks.SANDSTONE_TILE_SLAB.get());
                        output.accept(ModBlocks.MOSAIC_SANDSTONE_TILE_BLOCK.get());
                        output.accept(ModBlocks.BIG_NAUTILUS_SHELL.get());
                        output.accept(ModBlocks.BIG_NAUTILUS_SHELL_LANTERN.get());

                    }).build());
    

    public static void registerModCreativeModeTabs() {
        ModConstants.LOGGER.info("Registering Mod Creative Tabs for " + ModConstants.MOD_ID);
    }

}
