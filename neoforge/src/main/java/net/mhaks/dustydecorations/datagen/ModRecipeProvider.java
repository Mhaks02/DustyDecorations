package net.mhaks.dustydecorations.datagen;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.item.ModItems;
import net.mhaks.dustydecorations.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import javax.annotation.Nullable;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final String MOD_ID = ModConstants.MOD_ID + ":";

    protected ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput recipeOutput) {
        super(registries, recipeOutput);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new ModRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "Dusty Decorations Recipes";
        }
    }

    @Override
    protected void buildRecipes() {

        banister(ModBlocks.OAK_BANISTER.get(), Blocks.OAK_FENCE, Blocks.OAK_PLANKS);
        banister(ModBlocks.SPRUCE_BANISTER.get(), Blocks.SPRUCE_FENCE, Blocks.SPRUCE_PLANKS);
        banister(ModBlocks.BIRCH_BANISTER.get(), Blocks.BIRCH_FENCE, Blocks.BIRCH_PLANKS);
        banister(ModBlocks.JUNGLE_BANISTER.get(), Blocks.JUNGLE_FENCE, Blocks.JUNGLE_PLANKS);
        banister(ModBlocks.ACACIA_BANISTER.get(), Blocks.ACACIA_FENCE, Blocks.ACACIA_PLANKS);
        banister(ModBlocks.DARK_OAK_BANISTER.get(), Blocks.DARK_OAK_FENCE, Blocks.DARK_OAK_PLANKS);
        banister(ModBlocks.MANGROVE_BANISTER.get(), Blocks.MANGROVE_FENCE, Blocks.MANGROVE_PLANKS);
        banister(ModBlocks.CHERRY_BANISTER.get(), Blocks.CHERRY_FENCE, Blocks.CHERRY_PLANKS);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_BANISTER.get(), 3)
                .pattern("BFB")
                .define('B', Items.BAMBOO_BLOCK)
                .define('F', Blocks.BAMBOO_FENCE)
                .unlockedBy("has_planks", has(Blocks.BAMBOO_PLANKS))
                .group("banisters")
                .save(this.output);
        banister(ModBlocks.DRY_BAMBOO_BANISTER.get(), Blocks.BAMBOO_FENCE, Blocks.BAMBOO_PLANKS);
        banister(ModBlocks.CRIMSON_BANISTER.get(), Blocks.CRIMSON_FENCE, Blocks.CRIMSON_PLANKS);
        banister(ModBlocks.WARPED_BANISTER.get(), Blocks.WARPED_FENCE, Blocks.WARPED_PLANKS);

        largeShelf(ModBlocks.OAK_LARGE_SHELF.get(), Blocks.OAK_PLANKS);
        largeShelf(ModBlocks.SPRUCE_LARGE_SHELF.get(), Blocks.SPRUCE_PLANKS);
        largeShelf(ModBlocks.BIRCH_LARGE_SHELF.get(), Blocks.BIRCH_PLANKS);
        largeShelf(ModBlocks.JUNGLE_LARGE_SHELF.get(), Blocks.JUNGLE_PLANKS);
        largeShelf(ModBlocks.ACACIA_LARGE_SHELF.get(), Blocks.ACACIA_PLANKS);
        largeShelf(ModBlocks.DARK_OAK_LARGE_SHELF.get(), Blocks.DARK_OAK_PLANKS);
        largeShelf(ModBlocks.MANGROVE_LARGE_SHELF.get(), Blocks.MANGROVE_PLANKS);
        largeShelf(ModBlocks.CHERRY_LARGE_SHELF.get(), Blocks.CHERRY_PLANKS);
        largeShelf(ModBlocks.BAMBOO_LARGE_SHELF.get(), Blocks.BAMBOO_PLANKS);
        largeShelf(ModBlocks.CRIMSON_LARGE_SHELF.get(), Blocks.CRIMSON_PLANKS);
        largeShelf(ModBlocks.WARPED_LARGE_SHELF.get(), Blocks.WARPED_PLANKS);

        shapeless(RecipeCategory.DECORATIONS, ModBlocks.EMPTY_BARREL.get())
                .requires(Blocks.BARREL)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .unlockedBy("has_wooden_slabs", has(ItemTags.WOODEN_SLABS))
                .save(this.output);
        barrel(ModBlocks.APPLE_BARREL.get(), Items.APPLE);
        barrel(ModBlocks.SWEET_BERRIES_BARREL.get(), Items.SWEET_BERRIES);
        barrel(ModBlocks.GLOW_BERRIES_BARREL.get(), Items.GLOW_BERRIES);
        barrel(ModBlocks.CARROT_BARREL.get(), Items.CARROT);
        barrel(ModBlocks.POTATO_BARREL.get(), Items.POTATO);
        barrel(ModBlocks.BEETROOT_BARREL.get(), Items.BEETROOT);
        barrel(ModBlocks.SEA_PICKLE_BARREL.get(), Items.SEA_PICKLE);
        barrel(ModBlocks.COD_BARREL.get(), Items.COD);
        barrel(ModBlocks.SALMON_BARREL.get(), Items.SALMON);
        //TODO: DUSTYDECO_BARREL?

        wallpaper(ModBlocks.SUNFLOWER_WALLPAPER_BLOCK.get(), Blocks.WHITE_WOOL, Items.SUNFLOWER);
        wallpaper(ModBlocks.REGAL_WALLPAPER_BLOCK.get(), Blocks.RED_WOOL, Items.GOLD_NUGGET);
        wallpaper(ModBlocks.VINE_WALLPAPER_BLOCK.get(), Blocks.LIME_WOOL, Blocks.VINE);
        wallpaper(ModBlocks.MONSTER_WALLPAPER_BLOCK.get(), Blocks.GREEN_WOOL, Items.ROTTEN_FLESH);
        wallpaper(ModBlocks.SAILOR_WALLPAPER_BLOCK.get(), Blocks.BLUE_WOOL, Items.BONE_MEAL);   //iron_nugget instead?
        wallpaper(ModBlocks.COPPER_WALLPAPER_BLOCK.get(), Blocks.CYAN_WOOL, Items.COPPER_INGOT);
        wallpaper(ModBlocks.STELLAR_WALLPAPER_BLOCK.get(), Blocks.BLACK_WOOL, Items.GLOWSTONE_DUST);
        wallpaper(ModBlocks.PUMPKIN_WALLPAPER_BLOCK.get(), Blocks.ORANGE_WOOL, Items.PUMPKIN_SEEDS);
        wallpaper(ModBlocks.SOUL_WALLPAPER_BLOCK.get(), Blocks.PURPLE_WOOL, Blocks.SOUL_SAND);
        wallpaper(ModBlocks.FOREST_FESTIVE_WALLPAPER_BLOCK.get(), Ingredient.of(Blocks.WHITE_WOOL, Blocks.GREEN_WOOL, Blocks.RED_WOOL), this.tag(ItemTags.SAPLINGS));
        wallpaper(ModBlocks.STRIPED_FESTIVE_WALLPAPER_BLOCK.get(), Ingredient.of(Blocks.WHITE_WOOL, Blocks.GREEN_WOOL, Blocks.RED_WOOL), Items.SUGAR);
        wallpaper(ModBlocks.SNOWMEN_WALLPAPER_BLOCK.get(), Blocks.LIGHT_BLUE_WOOL, Ingredient.of(Blocks.PUMPKIN, Blocks.JACK_O_LANTERN));
        wallpaper(ModBlocks.SNOWFLAKE_WALLPAPER_BLOCK.get(), Blocks.LIGHT_BLUE_WOOL, Items.SNOWBALL);

        woolAwning(ModBlocks.WHITE_WOOL_AWNING.get(), Blocks.WHITE_CARPET);
        woolAwning(ModBlocks.LIGHT_GRAY_WOOL_AWNING.get(), Blocks.LIGHT_GRAY_CARPET);
        woolAwning(ModBlocks.GRAY_WOOL_AWNING.get(), Blocks.GRAY_CARPET);
        woolAwning(ModBlocks.BLACK_WOOL_AWNING.get(), Blocks.BLACK_CARPET);
        woolAwning(ModBlocks.BROWN_WOOL_AWNING.get(), Blocks.BROWN_CARPET);
        woolAwning(ModBlocks.RED_WOOL_AWNING.get(), Blocks.RED_CARPET);
        woolAwning(ModBlocks.ORANGE_WOOL_AWNING.get(), Blocks.ORANGE_CARPET);
        woolAwning(ModBlocks.YELLOW_WOOL_AWNING.get(), Blocks.YELLOW_CARPET);
        woolAwning(ModBlocks.LIME_WOOL_AWNING.get(), Blocks.LIME_CARPET);
        woolAwning(ModBlocks.GREEN_WOOL_AWNING.get(), Blocks.GREEN_CARPET);
        woolAwning(ModBlocks.CYAN_WOOL_AWNING.get(), Blocks.CYAN_CARPET);
        woolAwning(ModBlocks.LIGHT_BLUE_WOOL_AWNING.get(), Blocks.LIGHT_BLUE_CARPET);
        woolAwning(ModBlocks.BLUE_WOOL_AWNING.get(), Blocks.BLUE_CARPET);
        woolAwning(ModBlocks.PURPLE_WOOL_AWNING.get(), Blocks.PURPLE_CARPET);
        woolAwning(ModBlocks.MAGENTA_WOOL_AWNING.get(), Blocks.MAGENTA_CARPET);
        woolAwning(ModBlocks.PINK_WOOL_AWNING.get(), Blocks.PINK_CARPET);
        //TODO: Universal dyeing?

        shaped(RecipeCategory.DECORATIONS, ModBlocks.PAPER_LANTERN.get())
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .define('#', Items.PAPER)
                .define('@', Blocks.TORCH)
                .unlockedBy("has_paper", has(Items.PAPER))
                .unlockedBy("has_torch", has(Blocks.TORCH))
                .save(this.output);
        paperLantern(ModBlocks.SAKURA_PAPER_LANTERN.get(), Blocks.CHERRY_SAPLING);
        paperLantern(ModBlocks.TAIGA_PAPER_LANTERN.get(), Blocks.SPRUCE_SAPLING);
        paperLantern(ModBlocks.ORCHID_PAPER_LANTERN.get(), Blocks.BLUE_ORCHID);
        paperLantern(ModBlocks.PANDA_PAPER_LANTERN.get(), Blocks.BAMBOO);
        paperLantern(ModBlocks.VILLAGER_PAPER_LANTERN.get(), Items.EMERALD);
        paperLantern(ModBlocks.CREEPER_PAPER_LANTERN.get(), Items.GUNPOWDER);
        paperLantern(ModBlocks.CHICKEN_JOCKEY_PAPER_LANTERN.get(), Ingredient.of(Items.CHICKEN, Items.COOKED_CHICKEN));
        paperLantern(ModBlocks.PILLAGER_PAPER_LANTERN.get(), Items.ARROW);    //iron_axe?
        paperLantern(ModBlocks.WARDEN_PAPER_LANTERN.get(), Items.ECHO_SHARD);

        nineBlockStorageRecipesRecipesWithCustomUnpacking(RecipeCategory.MISC, ModItems.CORRUGATED_METAL_SHEET.get(), RecipeCategory.BUILDING_BLOCKS, ModBlocks.CORRUGATED_METAL_BLOCK.get(), "corrugated_metal_sheet_from_corrugated_metal_block", null);
        grate(ModBlocks.CORRUGATED_METAL_GRATE.get(), ModBlocks.CORRUGATED_METAL_BLOCK.get());
        stairs(ModBlocks.CORRUGATED_METAL_STAIRS.get(), ModBlocks.CORRUGATED_METAL_BLOCK.get());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CORRUGATED_METAL_SLAB.get(), ModBlocks.CORRUGATED_METAL_BLOCK.get());
        shaped(RecipeCategory.REDSTONE, ModBlocks.CORRUGATED_METAL_FENCE_GATE.get())
                .pattern("@#@")
                .pattern("@#@")
                .define('@', ModItems.CORRUGATED_METAL_SHEET.get())
                .define('#', ModBlocks.CORRUGATED_METAL_BLOCK.get())
                .unlockedBy("has_corrugated_metal_sheet", has(ModItems.CORRUGATED_METAL_SHEET.get()))
                .unlockedBy("has_corrugated_metal_block", has(ModBlocks.CORRUGATED_METAL_BLOCK.get()))
                .save(this.output);
        shaped(RecipeCategory.MISC, ModBlocks.CORRUGATED_METAL_FENCE.get(), 6)
                .pattern("#@#")
                .pattern("#@#")
                .define('#', ModBlocks.CORRUGATED_METAL_BLOCK.get())
                .define('@', ModItems.CORRUGATED_METAL_SHEET.get())
                .unlockedBy("has_corrugated_metal_block", has(ModBlocks.CORRUGATED_METAL_BLOCK.get()))
                .unlockedBy("has_corrugated_metal_sheet", has(ModItems.CORRUGATED_METAL_SHEET.get()))
                .save(this.output);
        door(ModBlocks.CORRUGATED_METAL_DOOR.get(), ModItems.CORRUGATED_METAL_SHEET.get());
        twoByTwoPacker(RecipeCategory.REDSTONE, ModBlocks.CORRUGATED_METAL_TRAPDOOR.get(), ModItems.CORRUGATED_METAL_SHEET.get());
        pressurePlate(ModBlocks.CORRUGATED_METAL_PRESSURE_PLATE.get(), ModItems.CORRUGATED_METAL_SHEET.get());
        button(ModBlocks.CORRUGATED_METAL_BUTTON.get(), ModBlocks.CORRUGATED_METAL_BLOCK.get());
        stairs(ModBlocks.CORRUGATED_METAL_ROOFING.get(), ModItems.CORRUGATED_METAL_SHEET.get());

        //Might change that one to be the same as Seaglass Windows but without the plank.
        twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CREAM_SEAGLASS.get(), ModItems.CREAM_SEAGLASS_FRAGMENTS.get(), "seaglass");
        twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HAZEL_SEAGLASS.get(), ModItems.HAZEL_SEAGLASS_FRAGMENTS.get(), "seaglass");
        twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIQUORICE_SEAGLASS.get(), ModItems.LIQUORICE_SEAGLASS_FRAGMENTS.get(), "seaglass");
        twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOCHA_SEAGLASS.get(), ModItems.MOCHA_SEAGLASS_FRAGMENTS.get(), "seaglass");
        twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCARLET_SEAGLASS.get(), ModItems.SCARLET_SEAGLASS_FRAGMENTS.get(), "seaglass");
        twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.HONEY_SEAGLASS.get(), ModItems.HONEY_SEAGLASS_FRAGMENTS.get(), "seaglass");
        twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MINT_SEAGLASS.get(), ModItems.MINT_SEAGLASS_FRAGMENTS.get(), "seaglass");
        twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TEAL_SEAGLASS.get(), ModItems.TEAL_SEAGLASS_FRAGMENTS.get(), "seaglass");
        twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_SEAGLASS.get(), ModItems.CERULEAN_SEAGLASS_FRAGMENTS.get(), "seaglass");
        twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TAUPE_SEAGLASS.get(), ModItems.TAUPE_SEAGLASS_FRAGMENTS.get(), "seaglass");

        threeByTwoPacker(ModBlocks.CREAM_SEAGLASS_PANE.get(), ModBlocks.CREAM_SEAGLASS.get(), "seaglass_panes");
        threeByTwoPacker(ModBlocks.HAZEL_SEAGLASS_PANE.get(), ModBlocks.HAZEL_SEAGLASS.get(), "seaglass_panes");
        threeByTwoPacker(ModBlocks.LIQUORICE_SEAGLASS_PANE.get(), ModBlocks.LIQUORICE_SEAGLASS.get(), "seaglass_panes");
        threeByTwoPacker(ModBlocks.MOCHA_SEAGLASS_PANE.get(), ModBlocks.MOCHA_SEAGLASS.get(), "seaglass_panes");
        threeByTwoPacker(ModBlocks.SCARLET_SEAGLASS_PANE.get(), ModBlocks.SCARLET_SEAGLASS.get(), "seaglass_panes");
        threeByTwoPacker(ModBlocks.HONEY_SEAGLASS_PANE.get(), ModBlocks.HONEY_SEAGLASS.get(), "seaglass_panes");
        threeByTwoPacker(ModBlocks.MINT_SEAGLASS_PANE.get(), ModBlocks.MINT_SEAGLASS.get(), "seaglass_panes");
        threeByTwoPacker(ModBlocks.TEAL_SEAGLASS_PANE.get(), ModBlocks.TEAL_SEAGLASS.get(), "seaglass_panes");
        threeByTwoPacker(ModBlocks.CERULEAN_SEAGLASS_PANE.get(), ModBlocks.CERULEAN_SEAGLASS.get(), "seaglass_panes");
        threeByTwoPacker(ModBlocks.TAUPE_SEAGLASS_PANE.get(), ModBlocks.TAUPE_SEAGLASS.get(), "seaglass_panes");

        seaWindow(ModBlocks.CREAM_SEA_WINDOW.get(), ModItems.CREAM_SEAGLASS_FRAGMENTS.get());
        seaWindow(ModBlocks.HAZEL_SEA_WINDOW.get(), ModItems.HAZEL_SEAGLASS_FRAGMENTS.get());
        seaWindow(ModBlocks.LIQUORICE_SEA_WINDOW.get(), ModItems.LIQUORICE_SEAGLASS_FRAGMENTS.get());
        seaWindow(ModBlocks.MOCHA_SEA_WINDOW.get(), ModItems.MOCHA_SEAGLASS_FRAGMENTS.get());
        seaWindow(ModBlocks.SCARLET_SEA_WINDOW.get(), ModItems.SCARLET_SEAGLASS_FRAGMENTS.get());
        seaWindow(ModBlocks.HONEY_SEA_WINDOW.get(), ModItems.HONEY_SEAGLASS_FRAGMENTS.get());
        seaWindow(ModBlocks.MINT_SEA_WINDOW.get(), ModItems.MINT_SEAGLASS_FRAGMENTS.get());
        seaWindow(ModBlocks.TEAL_SEA_WINDOW.get(), ModItems.TEAL_SEAGLASS_FRAGMENTS.get());
        seaWindow(ModBlocks.CERULEAN_SEA_WINDOW.get(), ModItems.CERULEAN_SEAGLASS_FRAGMENTS.get());
        seaWindow(ModBlocks.TAUPE_SEA_WINDOW.get(), ModItems.TAUPE_SEAGLASS_FRAGMENTS.get());

        threeByTwoPacker(ModBlocks.CREAM_SEA_WINDOW_PANE.get(), ModBlocks.CREAM_SEA_WINDOW.get(), "sea_window_panes");
        threeByTwoPacker(ModBlocks.HAZEL_SEA_WINDOW_PANE.get(), ModBlocks.HAZEL_SEA_WINDOW.get(), "sea_window_panes");
        threeByTwoPacker(ModBlocks.LIQUORICE_SEA_WINDOW_PANE.get(), ModBlocks.LIQUORICE_SEA_WINDOW.get(), "sea_window_panes");
        threeByTwoPacker(ModBlocks.MOCHA_SEA_WINDOW_PANE.get(), ModBlocks.MOCHA_SEA_WINDOW.get(), "sea_window_panes");
        threeByTwoPacker(ModBlocks.SCARLET_SEA_WINDOW_PANE.get(), ModBlocks.SCARLET_SEA_WINDOW.get(), "sea_window_panes");
        threeByTwoPacker(ModBlocks.HONEY_SEA_WINDOW_PANE.get(), ModBlocks.HONEY_SEA_WINDOW.get(), "sea_window_panes");
        threeByTwoPacker(ModBlocks.MINT_SEA_WINDOW_PANE.get(), ModBlocks.MINT_SEA_WINDOW.get(), "sea_window_panes");
        threeByTwoPacker(ModBlocks.TEAL_SEA_WINDOW_PANE.get(), ModBlocks.TEAL_SEA_WINDOW.get(), "sea_window_panes");
        threeByTwoPacker(ModBlocks.CERULEAN_SEA_WINDOW_PANE.get(), ModBlocks.CERULEAN_SEA_WINDOW.get(), "sea_window_panes");
        threeByTwoPacker(ModBlocks.TAUPE_SEA_WINDOW_PANE.get(), ModBlocks.TAUPE_SEA_WINDOW.get(), "sea_window_panes");

        seaglassLamp(ModBlocks.CREAM_SEAGLASS_LAMP.get(), ModBlocks.CREAM_SEAGLASS.get());
        seaglassLamp(ModBlocks.HAZEL_SEAGLASS_LAMP.get(), ModBlocks.HAZEL_SEAGLASS.get());
        seaglassLamp(ModBlocks.LIQUORICE_SEAGLASS_LAMP.get(), ModBlocks.LIQUORICE_SEAGLASS.get());
        seaglassLamp(ModBlocks.MOCHA_SEAGLASS_LAMP.get(), ModBlocks.MOCHA_SEAGLASS.get());
        seaglassLamp(ModBlocks.SCARLET_SEAGLASS_LAMP.get(), ModBlocks.SCARLET_SEAGLASS.get());
        seaglassLamp(ModBlocks.HONEY_SEAGLASS_LAMP.get(), ModBlocks.HONEY_SEAGLASS.get());
        seaglassLamp(ModBlocks.MINT_SEAGLASS_LAMP.get(), ModBlocks.MINT_SEAGLASS.get());
        seaglassLamp(ModBlocks.TEAL_SEAGLASS_LAMP.get(), ModBlocks.TEAL_SEAGLASS.get());
        seaglassLamp(ModBlocks.CERULEAN_SEAGLASS_LAMP.get(), ModBlocks.CERULEAN_SEAGLASS.get());
        seaglassLamp(ModBlocks.TAUPE_SEAGLASS_LAMP.get(), ModBlocks.TAUPE_SEAGLASS.get());

        shaped(RecipeCategory.DECORATIONS, ModBlocks.RUSTED_ANCHOR.get())
                .pattern(" I ")
                .pattern(" # ")
                .pattern("###")
                .define('#', ModItems.CORRUGATED_METAL_SHEET.get())
                .define('I', Blocks.CHAIN)
                .unlockedBy("has_corrugated_metal_sheet", has(ModItems.CORRUGATED_METAL_SHEET.get()))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.LIFE_PRESERVER.get())
                .pattern("~#~")
                .pattern("# #")
                .pattern("~#~")
                .define('#', ItemTags.WOOL)
                .define('~', Tags.Items.ROPES)
                .unlockedBy("has_wool", has(ItemTags.WOOL))
                .unlockedBy("has_rope", has(Tags.Items.ROPES))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.DISPLAYED_OARS.get())
                .pattern("@ @")
                .pattern("~I~")
                .pattern("I I")
                .define('@', Items.WOODEN_SHOVEL)
                .define('~', Tags.Items.ROPES)
                .define('I', Items.STICK)
                .unlockedBy("has_shovel", has(ItemTags.SHOVELS))
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(this.output);
        shapeless(RecipeCategory.DECORATIONS, ModBlocks.TREASURE_MAP.get())
                .requires(Ingredient.of(Items.MAP, Items.FILLED_MAP))
                .requires(Items.RED_DYE)
                .unlockedBy("has_map", has(Items.MAP))
                .unlockedBy("has_red_dye", has(Items.RED_DYE))
                .save(this.output);
        shapeless(RecipeCategory.DECORATIONS, ModBlocks.SCATTERED_PAPERS.get(), 2)
                .requires(Items.PAPER, 3)
                .unlockedBy("has_paper", has(Items.PAPER))
                .save(this.output);
        twoByTwoPacker(RecipeCategory.DECORATIONS, ModBlocks.POSTERS.get(), 4, Items.PAPER, null);
        nineBlockStorageRecipes(RecipeCategory.MISC, Items.PAPER, RecipeCategory.DECORATIONS, ModBlocks.PAPER_STACK.get(),
                getSimpleRecipeName(ModBlocks.PAPER_STACK.get()), null, getConversionRecipeName(Items.PAPER, ModBlocks.PAPER_STACK.get()), null); //3 instead of 1 obtained?
        shaped(RecipeCategory.DECORATIONS, ModBlocks.GLASS_BUOY.get(), 4)
                .pattern("~#~")
                .pattern("# #")
                .pattern("~#~")
                .define('#', Tags.Items.GLASS_BLOCKS_TINTED)
                .define('~', Tags.Items.ROPES)
                .unlockedBy("has_stained_glass", has(Tags.Items.GLASS_BLOCKS_TINTED))
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .save(this.output);
        shapeless(RecipeCategory.DECORATIONS, ModBlocks.SMALL_GLASS_BUOYS.get())
                .requires(ModBlocks.GLASS_BUOY.get())
                .unlockedBy("has_stained_glass", has(Tags.Items.GLASS_BLOCKS_TINTED))
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy("has_glass_buoys", has(ModBlocks.GLASS_BUOY.get()))
                .save(this.output);
        shapeless(RecipeCategory.DECORATIONS, ModBlocks.GLASS_BUOY.get())
                .requires(ModBlocks.SMALL_GLASS_BUOYS.get())
                .unlockedBy("has_stained_glass", has(Tags.Items.GLASS_BLOCKS_TINTED))
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy("has_small_glass_buoys", has(ModBlocks.SMALL_GLASS_BUOYS.get()))
                .save(this.output, MOD_ID + getConversionRecipeName(ModBlocks.GLASS_BUOY.get(), ModBlocks.SMALL_GLASS_BUOYS.get()));
        shaped(RecipeCategory.DECORATIONS, ModBlocks.WOODEN_BUOYS.get(), 3)
                .pattern("~~~")
                .pattern("# #")
                .define('~', Tags.Items.ROPES)
                .define('#', ItemTags.PLANKS)
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.ROPE.get(), 8)
                .pattern("#~")
                .pattern("~#")
                .pattern("#~")
                .define('~', Tags.Items.ROPES)
                .define('#', Items.WHEAT)
                .unlockedBy("has_wheat", has(Items.WHEAT))
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.COILED_ROPE.get())
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .define('#', Tags.Items.ROPES)
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .save(this.output);
        hangingStuff(ModBlocks.HANGING_COD.get(), Items.COD);
        hangingStuff(ModBlocks.HANGING_SALMON.get(), Items.SALMON);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.HANGING_KNIVES.get())      //TODO: might be too expensive...
                .pattern("@^@")
                .pattern("###")
                .define('#', Ingredient.of(ModBlocks.WEDGED_KNIFE.get(), ModBlocks.WEDGED_CLEAVER.get()))
                .define('@', ItemTags.PLANKS)
                .define('^', Items.IRON_NUGGET)
                .unlockedBy("has_wedged_knife", has(ModBlocks.WEDGED_KNIFE.get()))      //TODO: create a c:knives tag or something
                .unlockedBy("has_wedged_cleaver", has(ModBlocks.WEDGED_CLEAVER.get()))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.WEDGED_KNIFE.get())
                .pattern("I")
                .pattern("#")
                .pattern("^")
                .define('I', Items.STICK)
                .define('#', Items.IRON_INGOT)
                .define('^', Items.IRON_NUGGET)
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .unlockedBy("has_iron_nugget", has(Items.IRON_INGOT))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.WEDGED_CLEAVER.get())
                .pattern("I ")
                .pattern("#^")
                .pattern("#^")
                .define('I', Items.STICK)
                .define('#', Items.IRON_INGOT)
                .define('^', Items.IRON_NUGGET)
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .unlockedBy("has_iron_nugget", has(Items.IRON_INGOT))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.CUTTING_BOARD.get())
                .pattern("I##")
                .define('I', Items.STICK)
                .define('#', Blocks.STRIPPED_OAK_LOG)
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_stripped_oak_log", has(Blocks.STRIPPED_OAK_LOG))
                .save(this.output);
        shapeless(RecipeCategory.DECORATIONS, ModBlocks.KNIFE_AND_CUTTING_BOARD.get())
                .requires(ModBlocks.CUTTING_BOARD.get())
                .requires(Ingredient.of(ModBlocks.WEDGED_KNIFE.get(), ModBlocks.WEDGED_CLEAVER.get()))
                .unlockedBy("has_cutting_board", has(ModBlocks.CUTTING_BOARD.get()))
                .unlockedBy("has_wedged_knife", has(ModBlocks.WEDGED_KNIFE.get()))
                .unlockedBy("has_wedged_cleaver", has(ModBlocks.WEDGED_CLEAVER.get()))
                .save(this.output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.IRON_FRYING_PAN.get())
                .pattern("~  ")
                .pattern("###")
                .define('#', Items.IRON_INGOT)
                .define('~', Items.IRON_NUGGET)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.COPPER_FRYING_PAN.get())
                .pattern("~  ")
                .pattern("###")
                .define('#', Items.COPPER_INGOT)
                .define('~', ModItems.COPPER_NUGGET.get())
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                .unlockedBy("has_copper_nugget", has(ModItems.COPPER_NUGGET.get()))
                .save(this.output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.BIG_COOKING_POT.get())
                .pattern("~ ~")
                .pattern("# #")
                .pattern("###")
                .define('~', Items.IRON_NUGGET)
                .define('#', Items.IRON_INGOT)
                .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(this.output);
        shapeless(RecipeCategory.DECORATIONS, ModBlocks.POTS_AND_PANS.get(), 4)
                .requires(ModBlocks.BIG_COOKING_POT.get())
                .requires(ModBlocks.IRON_FRYING_PAN.get())
                .requires(ModBlocks.COPPER_FRYING_PAN.get())
                .unlockedBy(getHasName(ModBlocks.BIG_COOKING_POT.get()), has(ModBlocks.BIG_COOKING_POT.get()))
                .unlockedBy(getHasName(ModBlocks.IRON_FRYING_PAN.get()), has(ModBlocks.IRON_FRYING_PAN.get()))
                .unlockedBy(getHasName(ModBlocks.COPPER_FRYING_PAN.get()), has(ModBlocks.COPPER_FRYING_PAN.get()))
                .save(this.output);
        shapeless(RecipeCategory.DECORATIONS, ModBlocks.DECORATIVE_BOWL.get())
                .requires(Items.BOWL)
                .unlockedBy("has_bowl", has(Items.BOWL))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.JARS.get(), 8)
                .pattern("@@")
                .pattern("##")
                .define('@', Tags.Items.GLASS_BLOCKS_CHEAP)
                .define('#', ItemTags.TERRACOTTA)
                .unlockedBy("has_terracotta", has(ItemTags.TERRACOTTA))
                .unlockedBy("has_glass", has(Tags.Items.GLASS_BLOCKS_CHEAP))
                .save(this.output);

        shapeless(RecipeCategory.DECORATIONS, ModBlocks.HONEY_JAR.get())
                .requires(Items.HONEY_BOTTLE)
                .unlockedBy("has_honey_bottle", has(Items.HONEY_BOTTLE))
                .save(this.output);
        shapeless(RecipeCategory.DECORATIONS, Items.HONEY_BOTTLE)
                .requires(ModBlocks.HONEY_JAR.get())
                .unlockedBy("has_honey_bottle", has(Items.HONEY_BOTTLE))
                .unlockedBy("has_honey_jar", has(ModBlocks.HONEY_JAR.get()))
                .save(this.output, MOD_ID + getConversionRecipeName(Items.HONEY_BOTTLE, ModBlocks.HONEY_JAR.get()));

        shaped(RecipeCategory.DECORATIONS, ModBlocks.INK_AND_QUILL.get())
                .pattern("F ")
                .pattern("BI")
                .pattern("# ")
                .define('F', Items.FEATHER)
                .define('B', Items.GLASS_BOTTLE)
                .define('I', Items.INK_SAC)
                .define('#', ModItems.COPPER_NUGGET.get())
                .unlockedBy("has_feather", has(Items.FEATHER))
                .unlockedBy("has_glass_bottle", has(Items.GLASS_BOTTLE))
                .unlockedBy("has_ink_sac", has(Items.INK_SAC))
                .unlockedBy("has_copper_nugget", has(ModItems.COPPER_NUGGET.get()))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.EMPTY_SMALL_SHELF.get(), 6)
                .pattern("###")
                .pattern("/~/")
                .define('#', ItemTags.PLANKS)
                .define('/', Items.STICK)
                .define('~', Items.IRON_NUGGET)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.CLUTTERED_SMALL_SHELF.get())
                .pattern("#")
                .pattern("~")
                .define('#', ModBlocks.JARS.get())
                .define('~', ModBlocks.EMPTY_SMALL_SHELF.get())
                .unlockedBy("has_jars", has(ModBlocks.JARS.get()))
                .unlockedBy("has_empty_small_shelf", has(ModBlocks.EMPTY_SMALL_SHELF.get()))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.SMALL_BOOKSHELF.get())
                .pattern("#")
                .pattern("~")
                .define('#', Items.BOOK)
                .define('~', ModBlocks.EMPTY_SMALL_SHELF.get())
                .unlockedBy("has_book", has(Items.BOOK))
                .unlockedBy("has_empty_small_shelf", has(ModBlocks.EMPTY_SMALL_SHELF.get()))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.BOOKS.get())
                .pattern("###")
                .define('#', Items.BOOK)
                .unlockedBy("has_book", has(Items.BOOK))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.BOOK_STACK.get())
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .define('#', Items.BOOK)
                .unlockedBy("has_book", has(Items.BOOK))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.GLOBE.get())
                .pattern(" @")
                .pattern("^#")
                .pattern(" ^")
                .define('@', Items.MAP)
                .define('^', Items.COPPER_INGOT)
                .define('#', Blocks.BLUE_WOOL)
                .unlockedBy("has_map", has(Items.MAP))
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                .unlockedBy("has_blue_wool", has(Blocks.BLUE_WOOL))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.VINTAGE_GLOBE.get())
                .pattern(" @")
                .pattern("^#")
                .pattern(" ^")
                .define('@', Items.MAP)
                .define('^', Items.GOLD_INGOT)
                .define('#', Blocks.BROWN_WOOL)
                .unlockedBy("has_map", has(Items.MAP))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .unlockedBy("has_brown_wool", has(Blocks.BROWN_WOOL))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.FISHING_LURES.get(), 4)
                .pattern("~#^")
                .pattern(" @ ")
                .define('~', Items.STRING)
                .define('^', Items.IRON_NUGGET)
                .define('#', Blocks.TRIPWIRE_HOOK)
                .define('@', ItemTags.WOOL)
                .unlockedBy("has_string", has(Items.STRING))
                .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                .unlockedBy("has_tripwire_hook", has(Blocks.TRIPWIRE_HOOK))
                .unlockedBy("has_wool", has(ItemTags.WOOL))
                .save(this.output);
        fourBlockStorageRecipesWithCustomUnpacking(RecipeCategory.MISC, Items.GOLD_NUGGET, RecipeCategory.DECORATIONS, ModBlocks.GOLD_COINS_BLOCK.get(), "gold_nuggets_from_gold_coins_block", "gold_nugget");
        shaped(RecipeCategory.DECORATIONS, ModBlocks.GOLD_COINS_LAYER.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.GOLD_COINS_BLOCK.get())
                .unlockedBy("has_gold_coins_block", has(ModBlocks.GOLD_COINS_BLOCK.get()))
                .save(this.output);
        fourBlockStorageRecipesWithCustomPacking(RecipeCategory.DECORATIONS, ModBlocks.SCATTERED_GOLD_COINS.get(), RecipeCategory.DECORATIONS, ModBlocks.GOLD_COINS_LAYER.get(), "gold_coins_layer_from_scattered_gold_coins", null);
        threeByThreePacker(RecipeCategory.DECORATIONS, ModBlocks.BIG_NAUTILUS_SHELL.get(), Items.NAUTILUS_SHELL);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.BIG_NAUTILUS_LANTERN.get())
                .pattern("#")
                .pattern("^")
                .define('#', ModBlocks.BIG_NAUTILUS_SHELL.get())
                .define('^', Blocks.LANTERN)
                .unlockedBy("has_big_nautilus_shell", has(ModBlocks.BIG_NAUTILUS_SHELL.get()))
                .unlockedBy("has_lantern", has(Blocks.LANTERN))
                .save(this.output);
        shapeless(RecipeCategory.DECORATIONS, ModBlocks.SMALL_NAUTILUS_SHELL.get())
                .requires(Items.NAUTILUS_SHELL)
                .unlockedBy("has_nautilus_shell", has(Items.NAUTILUS_SHELL))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.COLD_NAUTILUS_WIND_CHIME.get())
                .pattern(" ~ ")
                .pattern(" @ ")
                .pattern("###")
                .define('~', Tags.Items.ROPES)
                .define('@', Ingredient.of(Items.NAUTILUS_SHELL, ModBlocks.SMALL_NAUTILUS_SHELL.get()))
                .define('#', ModTags.Items.COLD_SEAGLASS_FRAGMENTS)
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy("has_nautilus_shell", has(Items.NAUTILUS_SHELL))
                .unlockedBy("has_cold_seaglass_fragments", has(ModTags.Items.COLD_SEAGLASS_FRAGMENTS))
                .save(this.output);

        shaped(RecipeCategory.MISC, ModItems.BURLAP.get(), 4)
                .pattern("#~")
                .pattern("~#")
                .define('#', Items.WHEAT)
                .define('~', Items.STRING)
                .unlockedBy("has_wheat", has(Items.WHEAT))
                .unlockedBy("has_string", has(Items.STRING))
                .save(this.output);
        nineBlockStorageRecipesRecipesWithCustomUnpacking(RecipeCategory.MISC, ModItems.BURLAP.get(), RecipeCategory.DECORATIONS, ModBlocks.BURLAP_BLOCK.get(), "burlap_from_block", null);
        stairs(ModBlocks.BURLAP_STAIRS.get(), ModBlocks.BURLAP_BLOCK.get());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BURLAP_SLAB.get(), ModBlocks.BURLAP_BLOCK.get());
        carpet(ModBlocks.BURLAP_CARPET.get(), ModBlocks.BURLAP_BLOCK.get());
        shaped(RecipeCategory.DECORATIONS, ModBlocks.BURLAP_SACK.get(), 2)
                .pattern(" #~")
                .pattern("#@#")
                .pattern("~# ")
                .define('#', ModItems.BURLAP.get())
                .define('~', Tags.Items.ROPES)
                .define('@', Items.WHEAT)
                .unlockedBy("has_burlap", has(ModItems.BURLAP.get()))
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy("has_wheat", has(Items.WHEAT))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.SAILOR_FLAG.get())
                .pattern("~~~")
                .pattern(" # ")
                .define('~', Tags.Items.ROPES)
                .define('#', ItemTags.WOOL)
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy("has_wool", has(ItemTags.WOOL))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.SAILOR_PENNON.get()) //todo: count? 2 maybe? or 4?
                .pattern("~")
                .pattern("#")
                .define('~', Tags.Items.ROPES)
                .define('#', ItemTags.WOOL)
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy("has_wool", has(ItemTags.WOOL))
                .save(this.output);
        twoByTwoPacker(RecipeCategory.DECORATIONS, ModBlocks.CERAMIC_POT.get(), 4, Blocks.FLOWER_POT, null);
        // copying vanilla recipe but might add an alternative craft like vanillatweaks' universal dyeing, locked behind config
        shapeless(RecipeCategory.DECORATIONS, ModBlocks.GLAZED_CERAMIC_POT.get())
                .requires(ModBlocks.CERAMIC_POT.get())
                .unlockedBy("has_ceramic_pot", has(ModBlocks.CERAMIC_POT.get()))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.VINTAGE_CASH_REGISTER.get())
                .pattern("***")
                .pattern("I@R")
                .pattern("###")
                .define('#', Items.COPPER_INGOT)
                .define('I', Items.GOLD_INGOT)
                .define('@', ModBlocks.GOLD_COINS_LAYER.get())
                .define('R', Items.REDSTONE)
                .define('*', Items.GOLD_NUGGET)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .unlockedBy("has_gold_coins", has(ModBlocks.GOLD_COINS_LAYER.get()))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .unlockedBy("has_gold_nugget", has(Items.GOLD_NUGGET))
                .save(this.output);
        hangingStuff(ModBlocks.HANGING_SAUSAGES.get(), ModItems.RAW_BRATWURST.get());
        shaped(RecipeCategory.DECORATIONS, ModBlocks.WRAPPED_MEAT.get(), 4)
                .pattern(" # ")
                .pattern("#@#")
                .pattern(" # ")
                .define('#', Items.PAPER)
                .define('@', Tags.Items.FOODS_RAW_MEAT)
                .unlockedBy("has_paper", has(Items.PAPER))
                .unlockedBy("has_raw_meat", has(Tags.Items.FOODS_RAW_MEAT))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.COWHIDE_RUG.get())
                .pattern(" # ")
                .pattern("###")
                .pattern("###")
                .define('#', Items.LEATHER)
                .unlockedBy("has_leather", has(Items.LEATHER))
                .save(this.output);
        shapeless(RecipeCategory.DECORATIONS, ModBlocks.MOOSHROOM_COWHIDE_RUG.get())
                .requires(ModBlocks.COWHIDE_RUG.get())
                .requires(Tags.Items.MUSHROOMS)
                .unlockedBy("has_leather", has(Items.LEATHER))
                .unlockedBy("has_mushroom", has(Tags.Items.MUSHROOMS))
                .save(this.output);
        shapeless(RecipeCategory.DECORATIONS, ModBlocks.COWHIDE_RUG.get())
                .requires(ModBlocks.MOOSHROOM_COWHIDE_RUG.get())
                .unlockedBy("has_mooshroom_cowhide_rug", has(ModBlocks.MOOSHROOM_COWHIDE_RUG.get()))
                .save(this.output, ResourceKey.create(Registries.RECIPE, ModConstants.identifierOf("cowhide_rug_from_mooshroom_cowhide_rug")));

        shaped(RecipeCategory.REDSTONE, ModBlocks.COPPER_LIGHT.get())
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .define('#', ModItems.COPPER_NUGGET.get())
                .define('@', Blocks.REDSTONE_TORCH)
                .unlockedBy("has_copper_nugget", has(ModItems.COPPER_NUGGET.get()))
                .unlockedBy("has_redstone_torch", has(Blocks.REDSTONE_TORCH))
                .save(this.output);
        wax(RecipeCategory.REDSTONE, ModBlocks.WAXED_COPPER_LIGHT.get(), ModBlocks.COPPER_LIGHT.get());
        wax(RecipeCategory.REDSTONE, ModBlocks.WAXED_SHODDY_COPPER_LIGHT.get(), ModBlocks.SHODDY_COPPER_LIGHT.get());

        shaped(RecipeCategory.DECORATIONS, ModBlocks.CAMERA_QUADROPOD.get())
                .pattern("#^#")
                .pattern("#^#")
                .define('#', Items.COPPER_INGOT)
                .define('^', Items.GOLD_NUGGET)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                .unlockedBy("has_gold_nugget", has(Items.GOLD_NUGGET))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.CAMERA.get())
                .pattern("###")
                .pattern("@^S")
                .pattern("###")
                .define('#', Items.COPPER_INGOT)
                .define('@', Items.GOLD_INGOT)
                .define('^', Items.GUNPOWDER)
                .define('S', Items.SPYGLASS)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .unlockedBy("has_gunpowder", has(Items.GUNPOWDER))
                .unlockedBy("has_spyglass", has(Items.SPYGLASS))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.MOVIE_CAMERA.get())
                .pattern("###")
                .pattern("@^S")
                .pattern("###")
                .define('#', Items.COPPER_INGOT)
                .define('@', Items.GOLD_INGOT)
                .define('^', Items.REDSTONE)
                .define('S', Items.SPYGLASS)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .unlockedBy("has_redstone", has(Items.REDSTONE))
                .unlockedBy("has_spyglass", has(Items.SPYGLASS))
                .save(this.output);

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WICKER_BLOCK.get(), 4)
                .pattern("#~")
                .pattern("~#")
                .define('#', Items.STICK)
                .define('~', Tags.Items.ROPES)
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .save(this.output);
        stairs(ModBlocks.WICKER_STAIRS.get(), ModBlocks.WICKER_BLOCK.get());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WICKER_SLAB.get(), ModBlocks.WICKER_BLOCK.get());
        shaped(RecipeCategory.DECORATIONS, ModBlocks.WICKER_BASKET.get(), 3)        //TODO: count?
                .pattern("# #")
                .pattern("###")
                .define('#', ModBlocks.WICKER_BLOCK.get())
                .unlockedBy("has_wicker_block", has(ModBlocks.WICKER_BLOCK.get()))
                .save(this.output);
        List<Item> wickerBaskets = List.of(
                ModBlocks.APPLE_WICKER_BASKET.get().asItem(),
                ModBlocks.SWEET_BERRIES_WICKER_BASKET.get().asItem(),
                ModBlocks.GLOW_BERRIES_WICKER_BASKET.get().asItem(),
                ModBlocks.CARROT_WICKER_BASKET.get().asItem(),
                ModBlocks.POTATO_WICKER_BASKET.get().asItem(),
                ModBlocks.BEETROOT_WICKER_BASKET.get().asItem(),
                ModBlocks.SEA_PICKLE_WICKER_BASKET.get().asItem(),
                ModBlocks.COD_WICKER_BASKET.get().asItem(),
                ModBlocks.SALMON_WICKER_BASKET.get().asItem(),
                ModBlocks.PINK_PETALS_WICKER_BASKET.get().asItem(),
                ModBlocks.LILAC_WICKER_BASKET.get().asItem(),
                ModBlocks.ROSE_BUSH_WICKER_BASKET.get().asItem(),
                ModBlocks.PEONY_WICKER_BASKET.get().asItem()
        );
        List<Item> wickerBasketsIngredients = List.of(
                Items.APPLE,
                Items.SWEET_BERRIES,
                Items.GLOW_BERRIES,
                Items.CARROT,
                Items.POTATO,
                Items.BEETROOT,
                Items.SEA_PICKLE,
                Items.COD,
                Items.SALMON,
                Items.PINK_PETALS,
                Items.LILAC,
                Items.ROSE_BUSH,
                Items.PEONY
        );
        wickerBaskets(wickerBaskets, wickerBasketsIngredients, "wicker_baskets");

        fourBlockStorageRecipes(RecipeCategory.DECORATIONS, ModBlocks.GOURD.get(), RecipeCategory.DECORATIONS, Blocks.PUMPKIN);
        hangingStuff(ModBlocks.HANGING_GOURDS.get(), ModBlocks.GOURD.get());
        fourBlockStorageRecipes(RecipeCategory.FOOD, Items.BEETROOT, RecipeCategory.DECORATIONS, ModBlocks.CARVED_BEETROOT.get());    //TODO: should not be craftable back into beetroots imo, should behave like carved pumpkins instead
        shaped(RecipeCategory.DECORATIONS, ModBlocks.BEET_O_LANTERN.get())
                .pattern("#")
                .pattern("I")
                .define('#', ModBlocks.CARVED_BEETROOT.get())
                .define('I', Blocks.TORCH)
                .unlockedBy("has_carved_beetroot", has(ModBlocks.CARVED_BEETROOT.get()))
//                .unlockedBy("has_beetroot")
                .unlockedBy("has_torch", has(Blocks.TORCH))
                .save(this.output);
        scarecrow(ModBlocks.BEETROOT_SCARECROW.get(), ModBlocks.CARVED_BEETROOT.get());
        scarecrow(ModBlocks.PUMPKIN_SCARECROW.get(), Blocks.CARVED_PUMPKIN);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.MINI_SNOWMAN.get())
                .pattern("-")
                .pattern("o")
                .pattern("#")
                .define('-', ItemTags.WOOL_CARPETS)
                .define('o', Items.SNOWBALL)
                .define('#', Blocks.SNOW_BLOCK)
                .unlockedBy("has_carpets", has(ItemTags.WOOL_CARPETS))
                .unlockedBy("has_snowball", has(Items.SNOWBALL))
                .unlockedBy("has_snow_block", has(Blocks.SNOW_BLOCK))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.PLUSHIE.get())
                .pattern(" - ")
                .pattern("@#@")
                .define('-', ItemTags.WOOL_CARPETS)
                .define('#', ItemTags.WOOL)
                .define('@', ModItems.BURLAP.get())
                .unlockedBy("has_carpets", has(ItemTags.WOOL_CARPETS))
                .unlockedBy("has_wool", has(ItemTags.WOOL))
                .unlockedBy("has_burlap", has(ModItems.BURLAP.get()))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.NUTCRACKER.get())
                .pattern(" @ ")
                .pattern("|I|")
                .pattern(" # ")
                .define('#', ItemTags.PLANKS)
                .define('I', Blocks.LEVER)
                .define('|', Items.STICK)
                .define('@', Blocks.BLACK_WOOL)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .unlockedBy("has_lever", has(Blocks.LEVER))
                .unlockedBy("has_black_wool", has(Blocks.BLACK_WOOL))
                .save(this.output);
        garland(ModBlocks.FALL_GARLAND.get(), this.tag(ItemTags.LEAVES), Items.PUMPKIN_SEEDS);
//                .define('#', Blocks.LEAF_LITTER)
//                .unlockedBy("has_leaf_litter", has(Blocks.LEAF_LITTER))
                //TODO: leaf_litter doesn't exist until 1.21.5
        garland(ModBlocks.WINTER_GARLAND.get(), Ingredient.of(Blocks.SPRUCE_LEAVES), Items.SWEET_BERRIES);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.WINTER_WREATH.get())
                .pattern(" # ")
                .pattern("#@#")
                .pattern(" # ")
                .define('#', ModBlocks.WINTER_GARLAND.get())
                .define('@', Blocks.SPRUCE_LEAVES)
                .unlockedBy("has_winter_garland", has(ModBlocks.WINTER_GARLAND.get()))
                .unlockedBy("has_spruce_leaves", has(Blocks.SPRUCE_LEAVES))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.FAIRY_LIGHTS.get(), 8)
                .pattern(" ~ ")
                .pattern("*^*")
                .define('~', Tags.Items.ROPES)
                .define('^', Items.GLOWSTONE_DUST)
                .define('*', Tags.Items.DYES)
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy("has_glowstone_dust", has(Items.GLOWSTONE_DUST))
                .unlockedBy("has_dyes", has(Tags.Items.DYES))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.HOLIDAY_ORNAMENTS.get(), 8)
                .pattern(" ~ ")
                .pattern("*#*")
                .pattern(" * ")
                .define('~', Tags.Items.ROPES)
                .define('*', Tags.Items.DYES)
                .define('#', ItemTags.WOOL)
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy("has_dyes", has(Tags.Items.DYES))
                .unlockedBy("has_wool", has(ItemTags.WOOL))
                .save(this.output);

        shaped(RecipeCategory.DECORATIONS, ModBlocks.GIANT_CHAIN.get())
                .pattern("NI")
                .pattern("IN")
                .pattern("NI")
                .define('N', Items.IRON_NUGGET)
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(this.output);
        shaped(RecipeCategory.DECORATIONS, ModBlocks.GIANT_ANCHOR.get())
                .pattern(" I ")
                .pattern("#I#")
                .pattern("I@I")
                .define('I', Items.IRON_INGOT)
                .define('#', Blocks.IRON_BARS)
                .define('@', Blocks.IRON_BLOCK)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .unlockedBy("has_iron_bars", has(Blocks.IRON_BARS))
                .unlockedBy("has_iron_block", has(Blocks.IRON_BLOCK))
                .save(this.output);

        stairs(ModBlocks.SEASTONE_STAIRS.get(), ModBlocks.SEASTONE_BLOCK.get());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEASTONE_SLAB.get(), ModBlocks.SEASTONE_BLOCK.get());
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEASTONE_WALL.get(), ModBlocks.SEASTONE_BLOCK.get());

        twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEASTONE_BRICKS.get(), 4, ModBlocks.SEASTONE_BLOCK.get(), null);
        stairs(ModBlocks.SEASTONE_BRICK_STAIRS.get(), ModBlocks.SEASTONE_BRICKS.get());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEASTONE_BRICK_SLAB.get(), ModBlocks.SEASTONE_BRICKS.get());
        chiseled(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_SEASTONE_BRICKS.get(), ModBlocks.SEASTONE_BRICK_SLAB.get());
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SEASTONE_BRICK_WALL.get(), ModBlocks.SEASTONE_BRICKS.get());

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.SEASTONE_BLOCK.get()), RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SEASTONE_BLOCK.get(), 0.1F, 200);
        stairs(ModBlocks.SMOOTH_SEASTONE_STAIRS.get(), ModBlocks.SMOOTH_SEASTONE_BLOCK.get());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SEASTONE_SLAB.get(), ModBlocks.SMOOTH_SEASTONE_BLOCK.get());
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_SEASTONE_WALL.get(), ModBlocks.SMOOTH_SEASTONE_BLOCK.get());

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICKS.get(), 8)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .define('#', ModBlocks.SEASTONE_BRICKS.get())
                .define('@', ModTags.Items.CORALS)
                .unlockedBy("has_seastone_bricks", has(ModBlocks.SEASTONE_BRICKS.get()))
                .unlockedBy("has_corals", has(ModTags.Items.CORALS))
                .save(this.output);
        stairs(ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICK_STAIRS.get(), ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICKS.get());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICK_SLAB.get(), ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICKS.get());
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICK_WALL.get(), ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICKS.get());

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOWY_COBBLESTONE_BLOCK.get(), 8)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .define('#', Blocks.COBBLESTONE)
                .define('@', Items.SNOWBALL)
                .unlockedBy("has_cobblestone", has(Blocks.COBBLESTONE))
                .unlockedBy("has_snowball", has(Items.SNOWBALL))
                .save(this.output);
        stairs(ModBlocks.SNOWY_COBBLESTONE_STAIRS.get(), ModBlocks.SNOWY_COBBLESTONE_BLOCK.get());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOWY_COBBLESTONE_SLAB.get(), ModBlocks.SNOWY_COBBLESTONE_BLOCK.get());
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOWY_COBBLESTONE_WALL.get(), ModBlocks.SNOWY_COBBLESTONE_BLOCK.get());

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOWY_STONE_BRICKS.get(), 8)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .define('#', Blocks.STONE_BRICKS)
                .define('@', Items.SNOWBALL)
                .unlockedBy("has_stone_bricks", has(Blocks.STONE_BRICKS))
                .unlockedBy("has_snowball", has(Items.SNOWBALL))
                .save(this.output);
        stairs(ModBlocks.SNOWY_STONE_BRICK_STAIRS.get(), ModBlocks.SNOWY_STONE_BRICKS.get());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOWY_STONE_BRICK_SLAB.get(), ModBlocks.SNOWY_STONE_BRICKS.get());
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SNOWY_STONE_BRICK_WALL.get(), ModBlocks.SNOWY_STONE_BRICKS.get());

        twoByTwoPacker(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICKS.get(), 4, Blocks.SMOOTH_STONE, null);
        stairs(ModBlocks.SMOOTH_STONE_BRICK_STAIRS.get(), ModBlocks.SMOOTH_STONE_BRICKS.get());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICK_SLAB.get(), ModBlocks.SMOOTH_STONE_BRICKS.get());
        wall(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SMOOTH_STONE_BRICK_WALL.get(), ModBlocks.SMOOTH_STONE_BRICKS.get());

        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PLAIN_CUSHION_BLOCK.get(), 8)
                .pattern("@#@")
                .pattern("#o#")
                .pattern("@#@")
                .define('@', ModBlocks.BURLAP_BLOCK.get())
                .define('#', Items.LEATHER)
                .define('o', Items.IRON_NUGGET)
                .unlockedBy("has_burlap_block", has(ModBlocks.BURLAP_BLOCK.get()))
                .unlockedBy("has_leather", has(Items.LEATHER))
                .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                .save(this.output);
        stairs(ModBlocks.PLAIN_CUSHION_STAIRS.get(), ModBlocks.PLAIN_CUSHION_BLOCK.get());
        slab(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PLAIN_CUSHION_SLAB.get(), ModBlocks.PLAIN_CUSHION_BLOCK.get());

        List<Item> dyes = List.of(
                Items.WHITE_DYE,
                Items.LIGHT_GRAY_DYE,
                Items.GRAY_DYE,
                Items.BLACK_DYE,
                Items.BROWN_DYE,
                Items.RED_DYE,
                Items.ORANGE_DYE,
                Items.YELLOW_DYE,
                Items.LIME_DYE,
                Items.GREEN_DYE,
                Items.CYAN_DYE,
                Items.LIGHT_BLUE_DYE,
                Items.BLUE_DYE,
                Items.PURPLE_DYE,
                Items.MAGENTA_DYE,
                Items.PINK_DYE
        );
        List<Item> cushions = List.of(
                ModBlocks.WHITE_CUSHION_BLOCK.get().asItem(),
                ModBlocks.LIGHT_GRAY_CUSHION_BLOCK.get().asItem(),
                ModBlocks.GRAY_CUSHION_BLOCK.get().asItem(),
                ModBlocks.BLACK_CUSHION_BLOCK.get().asItem(),
                ModBlocks.BROWN_CUSHION_BLOCK.get().asItem(),
                ModBlocks.RED_CUSHION_BLOCK.get().asItem(),
                ModBlocks.ORANGE_CUSHION_BLOCK.get().asItem(),
                ModBlocks.YELLOW_CUSHION_BLOCK.get().asItem(),
                ModBlocks.LIME_CUSHION_BLOCK.get().asItem(),
                ModBlocks.GREEN_CUSHION_BLOCK.get().asItem(),
                ModBlocks.CYAN_CUSHION_BLOCK.get().asItem(),
                ModBlocks.LIGHT_BLUE_CUSHION_BLOCK.get().asItem(),
                ModBlocks.BLUE_CUSHION_BLOCK.get().asItem(),
                ModBlocks.PURPLE_CUSHION_BLOCK.get().asItem(),
                ModBlocks.MAGENTA_CUSHION_BLOCK.get().asItem(),
                ModBlocks.PINK_CUSHION_BLOCK.get().asItem()
        );
        colorBlockWithDye(dyes, cushions, "cushions");
        //TODO: should add another craft (toggleable in the settings maybe), like the universal dyeing crafts from Vanilla Tweaks

        stairs(ModBlocks.WHITE_CUSHION_STAIRS.get(), ModBlocks.WHITE_CUSHION_BLOCK.get(), "cushion_stairs");
        slab(ModBlocks.WHITE_CUSHION_SLAB.get(), ModBlocks.WHITE_CUSHION_BLOCK.get(), "cushion_slabs");
        stairs(ModBlocks.LIGHT_GRAY_CUSHION_STAIRS.get(), ModBlocks.LIGHT_GRAY_CUSHION_BLOCK.get(), "cushion_stairs");
        slab(ModBlocks.LIGHT_GRAY_CUSHION_SLAB.get(), ModBlocks.LIGHT_GRAY_CUSHION_BLOCK.get(), "cushion_slabs");
        stairs(ModBlocks.GRAY_CUSHION_STAIRS.get(), ModBlocks.GRAY_CUSHION_BLOCK.get(), "cushion_stairs");
        slab(ModBlocks.GRAY_CUSHION_SLAB.get(), ModBlocks.GRAY_CUSHION_BLOCK.get(), "cushion_slabs");
        stairs(ModBlocks.BLACK_CUSHION_STAIRS.get(), ModBlocks.BLACK_CUSHION_BLOCK.get(), "cushion_stairs");
        slab(ModBlocks.BLACK_CUSHION_SLAB.get(), ModBlocks.BLACK_CUSHION_BLOCK.get(), "cushion_slabs");
        stairs(ModBlocks.BROWN_CUSHION_STAIRS.get(), ModBlocks.BROWN_CUSHION_BLOCK.get(), "cushion_stairs");
        slab(ModBlocks.BROWN_CUSHION_SLAB.get(), ModBlocks.BROWN_CUSHION_BLOCK.get(), "cushion_slabs");
        stairs(ModBlocks.RED_CUSHION_STAIRS.get(), ModBlocks.RED_CUSHION_BLOCK.get(), "cushion_stairs");
        slab(ModBlocks.RED_CUSHION_SLAB.get(), ModBlocks.RED_CUSHION_BLOCK.get(), "cushion_slabs");
        stairs(ModBlocks.ORANGE_CUSHION_STAIRS.get(), ModBlocks.ORANGE_CUSHION_BLOCK.get(), "cushion_stairs");
        slab(ModBlocks.ORANGE_CUSHION_SLAB.get(), ModBlocks.ORANGE_CUSHION_BLOCK.get(), "cushion_slabs");
        stairs(ModBlocks.YELLOW_CUSHION_STAIRS.get(), ModBlocks.YELLOW_CUSHION_BLOCK.get(), "cushion_stairs");
        slab(ModBlocks.YELLOW_CUSHION_SLAB.get(), ModBlocks.YELLOW_CUSHION_BLOCK.get(), "cushion_slabs");
        stairs(ModBlocks.LIME_CUSHION_STAIRS.get(), ModBlocks.LIME_CUSHION_BLOCK.get(), "cushion_stairs");
        slab(ModBlocks.LIME_CUSHION_SLAB.get(), ModBlocks.LIME_CUSHION_BLOCK.get(), "cushion_slabs");
        stairs(ModBlocks.GREEN_CUSHION_STAIRS.get(), ModBlocks.GREEN_CUSHION_BLOCK.get(), "cushion_stairs");
        slab(ModBlocks.GREEN_CUSHION_SLAB.get(), ModBlocks.GREEN_CUSHION_BLOCK.get(), "cushion_slabs");
        stairs(ModBlocks.CYAN_CUSHION_STAIRS.get(), ModBlocks.CYAN_CUSHION_BLOCK.get(), "cushion_stairs");
        slab(ModBlocks.CYAN_CUSHION_SLAB.get(), ModBlocks.CYAN_CUSHION_BLOCK.get(), "cushion_slabs");
        stairs(ModBlocks.LIGHT_BLUE_CUSHION_STAIRS.get(), ModBlocks.LIGHT_BLUE_CUSHION_BLOCK.get(), "cushion_stairs");
        slab(ModBlocks.LIGHT_BLUE_CUSHION_SLAB.get(), ModBlocks.LIGHT_BLUE_CUSHION_BLOCK.get(), "cushion_slabs");
        stairs(ModBlocks.BLUE_CUSHION_STAIRS.get(), ModBlocks.BLUE_CUSHION_BLOCK.get(), "cushion_stairs");
        slab(ModBlocks.BLUE_CUSHION_SLAB.get(), ModBlocks.BLUE_CUSHION_BLOCK.get(), "cushion_slabs");
        stairs(ModBlocks.PURPLE_CUSHION_STAIRS.get(), ModBlocks.PURPLE_CUSHION_BLOCK.get(), "cushion_stairs");
        slab(ModBlocks.PURPLE_CUSHION_SLAB.get(), ModBlocks.PURPLE_CUSHION_BLOCK.get(), "cushion_slabs");
        stairs(ModBlocks.MAGENTA_CUSHION_STAIRS.get(), ModBlocks.MAGENTA_CUSHION_BLOCK.get(), "cushion_stairs");
        slab(ModBlocks.MAGENTA_CUSHION_SLAB.get(), ModBlocks.MAGENTA_CUSHION_BLOCK.get(), "cushion_slabs");
        stairs(ModBlocks.PINK_CUSHION_STAIRS.get(), ModBlocks.PINK_CUSHION_BLOCK.get(), "cushion_stairs");
        slab(ModBlocks.PINK_CUSHION_SLAB.get(), ModBlocks.PINK_CUSHION_BLOCK.get(), "cushion_slabs");

        quoin(ModBlocks.SEASTONE_QUOIN.get(), ModBlocks.SMOOTH_SEASTONE_BLOCK.get());     //TODO: smooth_seastone_quoin
        quoin(ModBlocks.SMOOTH_STONE_QUOIN.get(), ModBlocks.SMOOTH_STONE_QUOIN.get());
        quoin(ModBlocks.POLISHED_GRANITE_QUOIN.get(), Blocks.POLISHED_GRANITE);
        quoin(ModBlocks.POLISHED_DIORITE_QUOIN.get(), Blocks.POLISHED_DIORITE);
        quoin(ModBlocks.POLISHED_ANDESITE_QUOIN.get(), Blocks.POLISHED_ANDESITE);
        quoin(ModBlocks.POLISHED_TUFF_QUOIN.get(), Blocks.POLISHED_TUFF);
        quoin(ModBlocks.PACKED_MUD_QUOIN.get(), Blocks.PACKED_MUD);
        quoin(ModBlocks.SANDSTONE_QUOIN.get(), Blocks.SMOOTH_SANDSTONE);  //TODO: smooth_sandstone_quoin
        quoin(ModBlocks.RED_SANDSTONE_QUOIN.get(), Blocks.SMOOTH_RED_SANDSTONE);  //TODO: smooth_red_sandstone_quoin
        quoin(ModBlocks.POLISHED_BLACKSTONE_QUOIN.get(), Blocks.POLISHED_BLACKSTONE);

        mural(ModBlocks.SEASTONE_MURAL.get(), ModBlocks.SEASTONE_BLOCK.get());
        mural(ModBlocks.SMOOTH_STONE_MURAL.get(), Blocks.SMOOTH_STONE);
        mural(ModBlocks.GRANITE_MURAL.get(), Blocks.POLISHED_GRANITE);
        mural(ModBlocks.DIORITE_MURAL.get(), Blocks.POLISHED_DIORITE);
        mural(ModBlocks.ANDESITE_MURAL.get(), Blocks.POLISHED_ANDESITE);

        nineBlockStorageRecipesWithCustomPacking(RecipeCategory.MISC, ModItems.COPPER_NUGGET.get(), RecipeCategory.MISC, Items.COPPER_INGOT, getConversionRecipeName(Items.COPPER_INGOT, ModItems.COPPER_NUGGET.get()), getItemName(Items.COPPER_INGOT));
        shaped(RecipeCategory.MISC, ModItems.CORRUGATED_METAL_SHEET.get(), 6)
                .pattern("#@#")
                .pattern("@#@")
                .define('#', Items.IRON_INGOT)
                .define('@', Items.COPPER_INGOT)
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                .save(this.output);


        //TODO: stonecutting recipes
//

//        List<ItemLike> BLOCK_SMELTABLES = List.of(
//                ModItems.<MY_ITEM>,
//                ModBlocks.<MY_BLOCK>,
//                ModBlocks.<MY_OTHER_BLOCK>);

//        shaped(RecipeCategory.MISC, ModBlocks.<MY_BLOCK>.get())
//                .pattern('BBB')
//                .pattern('BBB')
//                .pattern('BBB')
//                .define('B', ModItems.<MY_ITEM>.get())
//                .unlockedBy('has_item', has(ModItems.<MY_ITEM>))
//                .save(recipeOutput);

//        shapeless(RecipeCategory.MISC, ModItems.<MY_ITEM>.get(), 9)
//            .requires(ModBlocks.<MY_BLOCK>)
//            .unlockedBy('has_block', has(ModBlocks.<MY_BLOCK>))
//            .save(recipeOutput, "dustydecorations:block_from_block");

//        oreBlasting(recipeOutput, BLOCK_SMELTABLES, RecipeCategory.MISC, ModItems.<MY_ITEM>.get(), 0.25f, 200, "block");

    }

    protected void oreSmelting(List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected void oreBlasting(List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected <T extends AbstractCookingRecipe> void oreCooking(RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(this.output, MOD_ID + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

    protected void twoByTwoPacker(RecipeCategory recipeCategory, ItemLike result, ItemLike ingredient, @Nullable String group) {
        twoByTwoPacker(recipeCategory, result, 1, ingredient, group);
    }
    protected void twoByTwoPacker(RecipeCategory recipeCategory, ItemLike result, int count, ItemLike ingredient, @Nullable String group) {
        shaped(recipeCategory, result, count)
                .pattern("##")
                .pattern("##")
                .define('#', ingredient)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .group(group)
                .save(this.output);
    }

//    protected static void threeByThreePacker(RecipeCategory recipeCategory, ItemLike result, ItemLike ingredient, @Nullable String group) {
//        threeByThreePacker(recipeCategory, result, 1, ingredient, group);
//    }
//    protected static void threeByThreePacker(RecipeCategory recipeCategory, ItemLike result, int count, ItemLike ingredient, @Nullable String group) {
//        shaped(recipeCategory, result, count)
//                .pattern("###")
//                .pattern("###")
//                .pattern("###")
//                .define('#', ingredient)
//                .unlockedBy(getHasName(ingredient), has(ingredient))
//                .group(group)
//                .save(this.output);
//    }

    protected void threeByTwoPacker(ItemLike result, ItemLike ingredient, @Nullable String group) {
        shaped(RecipeCategory.BUILDING_BLOCKS, result, 16)
                .pattern("###")
                .pattern("###")
                .define('#', ingredient)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .group(group)
                .save(this.output);
    }

    //copied neoforge's nineBlockStorageRecipes()
    protected void fourBlockStorageRecipes(RecipeCategory unpackedCategory, ItemLike unpacked,
                                                  RecipeCategory packedCategory, ItemLike packed) {
        fourBlockStorageRecipes(unpackedCategory, unpacked, packedCategory, packed, getSimpleRecipeName(packed), null, getSimpleRecipeName(unpacked), null);
    }
    protected void fourBlockStorageRecipesWithCustomPacking(RecipeCategory unpackedCategory, ItemLike unpacked,
                                                                   RecipeCategory packedCategory, ItemLike packed, String packedName, String packedGroup) {
        fourBlockStorageRecipes(unpackedCategory, unpacked, packedCategory, packed, packedName, packedGroup, getSimpleRecipeName(unpacked), null);
    }
    protected void fourBlockStorageRecipesWithCustomUnpacking(RecipeCategory unpackedCategory, ItemLike unpacked,
                                                                     RecipeCategory packedCategory, ItemLike packed, String unpackedName, String unpackedGroup) {
        fourBlockStorageRecipes(unpackedCategory, unpacked, packedCategory, packed, getSimpleRecipeName(packed), null, unpackedName, unpackedGroup);
    }

    protected void fourBlockStorageRecipes(RecipeCategory unpackedCategory, ItemLike unpacked, RecipeCategory packedCategory, ItemLike packed,
                                                  String packedName, @Nullable String packedGroup, String unpackedName, @Nullable String unpackedGroup) {
        shapeless(unpackedCategory, unpacked, 4)
                .requires(packed)
                .group(unpackedGroup)
                .unlockedBy(getHasName(packed), has(packed))
                .save(this.output, ResourceKey.create(Registries.RECIPE, ModConstants.identifierOf(unpackedName)));
        shaped(packedCategory, packed)
                .define('#', unpacked)
                .pattern("##")
                .pattern("##")
                .group(packedGroup)
                .unlockedBy(getHasName(unpacked), has(unpacked))
                .save(this.output, ResourceKey.create(Registries.RECIPE, ModConstants.identifierOf(packedName)));
    }

    protected void nineBlockStorageRecipes(
            RecipeCategory unpackedCategory, ItemLike unpacked, RecipeCategory packedCategory, ItemLike packed
    ) {
        nineBlockStorageRecipes(
                unpackedCategory, unpacked, packedCategory, packed, getSimpleRecipeName(packed), null, getSimpleRecipeName(unpacked), null
        );
    }

    protected void nineBlockStorageRecipesWithCustomPacking(
            RecipeCategory unpackedCategory, ItemLike unpacked, RecipeCategory packedCategory, ItemLike packed, String packedName, String packedGroup
    ) {
        nineBlockStorageRecipes(unpackedCategory, unpacked, packedCategory, packed, packedName, packedGroup, getSimpleRecipeName(unpacked), null);
    }

    protected void nineBlockStorageRecipesRecipesWithCustomUnpacking(
            RecipeCategory unpackedCategory, ItemLike unpacked, RecipeCategory packedCategory, ItemLike packed, String unpackedName, String unpackedGroup
    ) {
        nineBlockStorageRecipes(unpackedCategory, unpacked, packedCategory, packed, getSimpleRecipeName(packed), null, unpackedName, unpackedGroup);
    }

    protected void nineBlockStorageRecipes(RecipeCategory unpackedCategory, ItemLike unpacked,
                                                  RecipeCategory packedCategory, ItemLike packed, String packedName, @Nullable String packedGroup, String unpackedName, @Nullable String unpackedGroup) {
        shapeless(unpackedCategory, unpacked, 9)
                .requires(packed)
                .group(unpackedGroup)
                .unlockedBy(getHasName(packed), has(packed))
                .save(this.output, ResourceKey.create(Registries.RECIPE, ModConstants.identifierOf(unpackedName)));
        shaped(packedCategory, packed)
                .define('#', unpacked)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .group(packedGroup)
                .unlockedBy(getHasName(unpacked), has(unpacked))
                .save(this.output, ResourceKey.create(Registries.RECIPE, ModConstants.identifierOf(packedName)));
    }


    protected void stairs(ItemLike stairs, ItemLike material) {
        stairBuilder(stairs, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(this.output);
    }
    protected void stairs(ItemLike stairs, ItemLike material, String group) {
        stairBuilder(stairs, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).group(group).save(this.output);
    }

    protected void slab(ItemLike slab, ItemLike material, String group) {
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, slab, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).group(group).save(this.output);
    }

    protected void fence(ItemLike fence, ItemLike material) {
        fenceBuilder(fence, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(this.output);
    }
    protected void fenceGate(ItemLike fenceGate, ItemLike material) {
        fenceGateBuilder(fenceGate, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(this.output);
    }

    protected void door(ItemLike door, ItemLike material) {
        doorBuilder(door, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(this.output);
    }
    protected void trapdoor(ItemLike door, ItemLike material) {
        trapdoorBuilder(door, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(this.output);
    }

    protected void button(ItemLike button, ItemLike material) {
        buttonBuilder(button, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(this.output);
    }

    protected void wax(RecipeCategory recipeCategory, ItemLike waxed, ItemLike waxable) {
        shapeless(recipeCategory, waxed)
                .requires(Items.HONEYCOMB)
                .requires(waxable)
                .unlockedBy("has_honeycomb", has(Items.HONEYCOMB))
                .unlockedBy(getHasName(waxable), has(waxable))
                .save(this.output, MOD_ID + getConversionRecipeName(waxed, Items.HONEYCOMB));
    }

    protected void banister(ItemLike banister, ItemLike fence, ItemLike hasPlanks) {
        shaped(RecipeCategory.DECORATIONS, banister, 6)
                .pattern("###")
                .define('#', fence)
                .unlockedBy("has_planks", has(hasPlanks))
                .group("banisters")
                .save(this.output);
    }

    protected void largeShelf(ItemLike largeShelf, ItemLike planks) {
        shaped(RecipeCategory.DECORATIONS, largeShelf, 3)
                .pattern("###")
                .pattern("@  ")
                .define('#', planks)
                .define('@', ModBlocks.EMPTY_SMALL_SHELF.get())
                .unlockedBy("has_planks", has(planks))
                .group("large_shelves")
                .save(this.output);
    }

    protected void barrel(ItemLike barrel, ItemLike ingredient) {
        shapeless(RecipeCategory.DECORATIONS, barrel)
                .requires(ingredient)
                .requires(Ingredient.of(Blocks.BARREL, ModBlocks.EMPTY_BARREL.get()))
                // has_barrel instead?
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .unlockedBy("has_wooden_slabs", has(ItemTags.WOODEN_SLABS))
                .unlockedBy(getHasName(ingredient), has(ingredient))
//                .group("barrels")
                .save(this.output);
    }

    protected void wallpaper(ItemLike wallpaper, ItemLike wool, ItemLike ingredient) {
        wallpaper(wallpaper, Ingredient.of(wool), Ingredient.of(ingredient));
    }
    protected void wallpaper(ItemLike wallpaper, Ingredient wool, ItemLike ingredient) {
        wallpaper(wallpaper, wool, Ingredient.of(ingredient));
    }
    protected void wallpaper(ItemLike wallpaper, ItemLike wool, Ingredient ingredient) {
        wallpaper(wallpaper, Ingredient.of(wool), ingredient);
    }
    protected void wallpaper(ItemLike wallpaper, Ingredient wool, Ingredient ingredient) {
        shaped(RecipeCategory.BUILDING_BLOCKS, wallpaper, 8)
                .pattern("~@")
                .pattern("~#")
                .define('~', Items.PAPER)
                .define('#', wool)
                .define('@', ingredient)
                .unlockedBy("has_wool", has(ItemTags.WOOL))
                .unlockedBy("has_paper", has(Items.PAPER))
                .save(this.output);
    }

    protected void woolAwning(ItemLike awning, ItemLike carpet) {
        shaped(RecipeCategory.DECORATIONS, awning)
                .pattern("## ")
                .pattern(" @#")
                .define('#', carpet)
                .define('@', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_wool", has(ItemTags.WOOL))
                .group("wool_awnings")
                .save(this.output);
    }

    protected void paperLantern(ItemLike paperLantern, ItemLike ingredient) {
        paperLantern(paperLantern, Ingredient.of(ingredient));
    }
    protected void paperLantern(ItemLike paperLantern, Ingredient ingredient) {
        shapeless(RecipeCategory.DECORATIONS, paperLantern)
                .requires(paperLantern)
                .requires(ingredient)
                .unlockedBy("has_paper_lantern", has(ModBlocks.PAPER_LANTERN.get()))
                .save(this.output);
    }

    protected void seaWindow(ItemLike seaWindow, ItemLike fragment) {
        shaped(RecipeCategory.BUILDING_BLOCKS, seaWindow, 4)
                .pattern(" # ")
                .pattern("#@#")
                .pattern(" # ")
                .define('#', fragment)
                .define('@', ItemTags.PLANKS)
                .unlockedBy(getHasName(fragment), has(fragment))
                .group("sea_windows")
                .save(this.output);
    }

    protected void seaglassLamp(ItemLike seaglassLamp, ItemLike seaglass) {
        shaped(RecipeCategory.DECORATIONS, seaglassLamp)
                .pattern(" # ")
                .pattern("#@#")
                .pattern(" I ")
                .define('#', seaglass)
                .define('@', Blocks.REDSTONE_LAMP)
                .define('I', Items.COPPER_INGOT)
                .unlockedBy(getHasName(seaglass), has(seaglass))
                .unlockedBy("has_redstone_lamp", has(Blocks.REDSTONE_LAMP))
                .group("seaglass_lamps")
                .save(this.output);
    }

    protected void wickerBaskets(List<Item> wickerBaskets, List<Item> wickerBasketsIngredients, String group) {
        for (int i = 0; i < wickerBaskets.size(); i++) {
            ItemLike item = wickerBasketsIngredients.get(i);
            ItemLike item1 = wickerBaskets.get(i);
            shapeless(RecipeCategory.DECORATIONS, item1)
                    .requires(item, 3)
                    .requires(ModBlocks.WICKER_BASKET.get())
                    .group(group)
                    .unlockedBy("has_needed_ingredient", has(item))
                    .save(this.output, ResourceKey.create(Registries.RECIPE, ModConstants.identifierOf(getItemName(item1))));
        }
    }

    protected void hangingStuff(ItemLike hangingObject, ItemLike object) {
        shaped(RecipeCategory.DECORATIONS, hangingObject)
                .pattern("~~~")
                .pattern("###")
                .define('~', Tags.Items.ROPES)
                .define('#', object)
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy(getHasName(object), has(object))
                .save(this.output);
    }

    protected void scarecrow(ItemLike scarecrow, ItemLike carvedHead) {
        shaped(RecipeCategory.DECORATIONS, scarecrow)
                .pattern("~@~")
                .pattern("^#^")
                .pattern(" I ")
                .define('~', ModItems.BURLAP.get())
                .define('@', carvedHead)
                .define('^', Items.WHEAT)
                .define('#', Blocks.HAY_BLOCK)
                .define('I', Items.STICK)
                .unlockedBy("has_burlap", has(ModItems.BURLAP.get()))
                .unlockedBy(getHasName(carvedHead), has(carvedHead))
                .unlockedBy("has_wheat", has(Items.WHEAT))
                .unlockedBy("has_hay_bale", has(Blocks.HAY_BLOCK))
                .save(this.output);
    }

    protected void garland(ItemLike garland, Ingredient leafBlock, ItemLike seasonalItem) {
        shaped(RecipeCategory.DECORATIONS, garland, 8)
                .pattern("#~#")
                .pattern("^#^")
                .define('~', Tags.Items.ROPES)
                .define('#', leafBlock)
                .define('^', seasonalItem)
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy("has_leaves", has(ItemTags.LEAVES))
                .unlockedBy(getHasName(seasonalItem), has(seasonalItem))
                .save(this.output);
    }

    //copied from Neoforge's RecipeProvider
    protected void colorBlockWithDye(List<Item> dyes, List<Item> dyeableItems, String group) {
        for (int i = 0; i < dyes.size(); i++) {
            Item item = dyes.get(i);
            Item item1 = dyeableItems.get(i);
            Stream<Item> stream = dyeableItems.stream().filter(item2 -> !item2.equals(item1));
            shapeless(RecipeCategory.BUILDING_BLOCKS, item1)
                    .requires(item)
                    .requires(Ingredient.of(dyeableItems.stream().filter(items -> !items.equals(item1))))
                    .group(group)
                    .unlockedBy("has_needed_dye", this.has(item))
                    .save(this.output, ResourceKey.create(Registries.RECIPE, ModConstants.identifierOf("dye_" + getItemName(item1))));
        }
    }

    protected void quoin(ItemLike quoin, ItemLike material) {
        shaped(RecipeCategory.BUILDING_BLOCKS, quoin, 4)
                .pattern("# ")
                .pattern("##")
                .pattern("# ")
                .define('#', material)
                .unlockedBy(getHasName(material), has(material))
                .save(this.output);
    }

    protected void mural(ItemLike mural, ItemLike material) {
        shaped(RecipeCategory.BUILDING_BLOCKS, mural, 6)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .define('#', material)
                .unlockedBy(getHasName(mural), has(material))
                .save(this.output);
    }

}
