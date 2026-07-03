package net.mhaks.dustydecorations.datagen;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.item.ModItems;
import net.mhaks.dustydecorations.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import javax.annotation.Nullable;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        banister(recipeOutput, ModBlocks.OAK_BANISTER.get(), Blocks.OAK_FENCE, Blocks.OAK_PLANKS);
        banister(recipeOutput, ModBlocks.SPRUCE_BANISTER.get(), Blocks.SPRUCE_FENCE, Blocks.SPRUCE_PLANKS);
        banister(recipeOutput, ModBlocks.BIRCH_BANISTER.get(), Blocks.BIRCH_FENCE, Blocks.BIRCH_PLANKS);
        banister(recipeOutput, ModBlocks.JUNGLE_BANISTER.get(), Blocks.JUNGLE_FENCE, Blocks.JUNGLE_PLANKS);
        banister(recipeOutput, ModBlocks.ACACIA_BANISTER.get(), Blocks.ACACIA_FENCE, Blocks.ACACIA_PLANKS);
        banister(recipeOutput, ModBlocks.DARK_OAK_BANISTER.get(), Blocks.DARK_OAK_FENCE, Blocks.DARK_OAK_PLANKS);
        banister(recipeOutput, ModBlocks.MANGROVE_BANISTER.get(), Blocks.MANGROVE_FENCE, Blocks.MANGROVE_PLANKS);
        banister(recipeOutput, ModBlocks.CHERRY_BANISTER.get(), Blocks.CHERRY_FENCE, Blocks.CHERRY_PLANKS);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BAMBOO_BANISTER.get(), 3)
                .pattern("BFB")
                .define('B', Items.BAMBOO_BLOCK)
                .define('F', Blocks.BAMBOO_FENCE)
                .unlockedBy("has_planks", has(Blocks.BAMBOO_PLANKS))
                .group("banisters")
                .save(recipeOutput);
        banister(recipeOutput, ModBlocks.DRY_BAMBOO_BANISTER.get(), Blocks.BAMBOO_FENCE, Blocks.BAMBOO_PLANKS);
        banister(recipeOutput, ModBlocks.CRIMSON_BANISTER.get(), Blocks.CRIMSON_FENCE, Blocks.CRIMSON_PLANKS);
        banister(recipeOutput, ModBlocks.WARPED_BANISTER.get(), Blocks.WARPED_FENCE, Blocks.WARPED_PLANKS);

        largeShelf(recipeOutput, ModBlocks.OAK_LARGE_SHELF.get(), Blocks.OAK_PLANKS);
        largeShelf(recipeOutput, ModBlocks.SPRUCE_LARGE_SHELF.get(), Blocks.SPRUCE_PLANKS);
        largeShelf(recipeOutput, ModBlocks.BIRCH_LARGE_SHELF.get(), Blocks.BIRCH_PLANKS);
        largeShelf(recipeOutput, ModBlocks.JUNGLE_LARGE_SHELF.get(), Blocks.JUNGLE_PLANKS);
        largeShelf(recipeOutput, ModBlocks.ACACIA_LARGE_SHELF.get(), Blocks.ACACIA_PLANKS);
        largeShelf(recipeOutput, ModBlocks.DARK_OAK_LARGE_SHELF.get(), Blocks.DARK_OAK_PLANKS);
        largeShelf(recipeOutput, ModBlocks.MANGROVE_LARGE_SHELF.get(), Blocks.MANGROVE_PLANKS);
        largeShelf(recipeOutput, ModBlocks.CHERRY_LARGE_SHELF.get(), Blocks.CHERRY_PLANKS);
        largeShelf(recipeOutput, ModBlocks.BAMBOO_LARGE_SHELF.get(), Blocks.BAMBOO_PLANKS);
        largeShelf(recipeOutput, ModBlocks.CRIMSON_LARGE_SHELF.get(), Blocks.CRIMSON_PLANKS);
        largeShelf(recipeOutput, ModBlocks.WARPED_LARGE_SHELF.get(), Blocks.WARPED_PLANKS);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.EMPTY_BARREL.get())
                .requires(Blocks.BARREL)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .unlockedBy("has_wooden_slabs", has(ItemTags.WOODEN_SLABS))
                .save(recipeOutput);
        barrel(recipeOutput, ModBlocks.APPLE_BARREL.get(), Items.APPLE);
        barrel(recipeOutput, ModBlocks.SWEET_BERRIES_BARREL.get(), Items.SWEET_BERRIES);
        barrel(recipeOutput, ModBlocks.GLOW_BERRIES_BARREL.get(), Items.GLOW_BERRIES);
        barrel(recipeOutput, ModBlocks.CARROT_BARREL.get(), Items.CARROT);
        barrel(recipeOutput, ModBlocks.POTATO_BARREL.get(), Items.POTATO);
        barrel(recipeOutput, ModBlocks.BEETROOT_BARREL.get(), Items.BEETROOT);
        barrel(recipeOutput, ModBlocks.SEA_PICKLE_BARREL.get(), Items.SEA_PICKLE);
        barrel(recipeOutput, ModBlocks.COD_BARREL.get(), Items.COD);
        barrel(recipeOutput, ModBlocks.SALMON_BARREL.get(), Items.SALMON);
        wallpaper(recipeOutput, ModBlocks.SUNFLOWER_WALLPAPER_BLOCK.get(), Blocks.WHITE_WOOL, Items.SUNFLOWER);
        wallpaper(recipeOutput, ModBlocks.REGAL_WALLPAPER_BLOCK.get(), Blocks.RED_WOOL, Items.GOLD_NUGGET);
        wallpaper(recipeOutput, ModBlocks.VINE_WALLPAPER_BLOCK.get(), Blocks.LIME_WOOL, Blocks.VINE);
        wallpaper(recipeOutput, ModBlocks.MONSTER_WALLPAPER_BLOCK.get(), Blocks.GREEN_WOOL, Items.ROTTEN_FLESH);
        wallpaper(recipeOutput, ModBlocks.SAILOR_WALLPAPER_BLOCK.get(), Blocks.BLUE_WOOL, Items.BONE_MEAL);   //iron_nugget instead?
        wallpaper(recipeOutput, ModBlocks.COPPER_WALLPAPER_BLOCK.get(), Blocks.CYAN_WOOL, Items.COPPER_INGOT);
        wallpaper(recipeOutput, ModBlocks.STELLAR_WALLPAPER_BLOCK.get(), Blocks.BLACK_WOOL, Items.GLOWSTONE_DUST);
        wallpaper(recipeOutput, ModBlocks.PUMPKIN_WALLPAPER_BLOCK.get(), Blocks.ORANGE_WOOL, Items.PUMPKIN_SEEDS);
        wallpaper(recipeOutput, ModBlocks.SOUL_WALLPAPER_BLOCK.get(), Blocks.PURPLE_WOOL, Blocks.SOUL_SAND);
        wallpaper(recipeOutput, ModBlocks.FOREST_FESTIVE_WALLPAPER_BLOCK.get(), Ingredient.of(Blocks.WHITE_WOOL, Blocks.GREEN_WOOL, Blocks.RED_WOOL), Ingredient.of(ItemTags.SAPLINGS));
        wallpaper(recipeOutput, ModBlocks.STRIPED_FESTIVE_WALLPAPER_BLOCK.get(), Ingredient.of(Blocks.WHITE_WOOL, Blocks.GREEN_WOOL, Blocks.RED_WOOL), Items.SUGAR);
        wallpaper(recipeOutput, ModBlocks.SNOWMEN_WALLPAPER_BLOCK.get(), Blocks.LIGHT_BLUE_WOOL, Ingredient.of(Blocks.PUMPKIN, Blocks.JACK_O_LANTERN));
        wallpaper(recipeOutput, ModBlocks.SNOWFLAKE_WALLPAPER_BLOCK.get(), Blocks.LIGHT_BLUE_WOOL, Items.SNOWBALL);

        woolAwning(recipeOutput, ModBlocks.WHITE_WOOL_AWNING.get(), Blocks.WHITE_CARPET);
        woolAwning(recipeOutput, ModBlocks.LIGHT_GRAY_WOOL_AWNING.get(), Blocks.LIGHT_GRAY_CARPET);
        woolAwning(recipeOutput, ModBlocks.GRAY_WOOL_AWNING.get(), Blocks.GRAY_CARPET);
        woolAwning(recipeOutput, ModBlocks.BLACK_WOOL_AWNING.get(), Blocks.BLACK_CARPET);
        woolAwning(recipeOutput, ModBlocks.BROWN_WOOL_AWNING.get(), Blocks.BROWN_CARPET);
        woolAwning(recipeOutput, ModBlocks.RED_WOOL_AWNING.get(), Blocks.RED_CARPET);
        woolAwning(recipeOutput, ModBlocks.ORANGE_WOOL_AWNING.get(), Blocks.ORANGE_CARPET);
        woolAwning(recipeOutput, ModBlocks.YELLOW_WOOL_AWNING.get(), Blocks.YELLOW_CARPET);
        woolAwning(recipeOutput, ModBlocks.LIME_WOOL_AWNING.get(), Blocks.LIME_CARPET);
        woolAwning(recipeOutput, ModBlocks.GREEN_WOOL_AWNING.get(), Blocks.GREEN_CARPET);
        woolAwning(recipeOutput, ModBlocks.CYAN_WOOL_AWNING.get(), Blocks.CYAN_CARPET);
        woolAwning(recipeOutput, ModBlocks.LIGHT_BLUE_WOOL_AWNING.get(), Blocks.LIGHT_BLUE_CARPET);
        woolAwning(recipeOutput, ModBlocks.BLUE_WOOL_AWNING.get(), Blocks.BLUE_CARPET);
        woolAwning(recipeOutput, ModBlocks.PURPLE_WOOL_AWNING.get(), Blocks.PURPLE_CARPET);
        woolAwning(recipeOutput, ModBlocks.MAGENTA_WOOL_AWNING.get(), Blocks.MAGENTA_CARPET);
        woolAwning(recipeOutput, ModBlocks.PINK_WOOL_AWNING.get(), Blocks.PINK_CARPET);
        //TODO: Universal dyeing?

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.PAPER_LANTERN.get())
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .define('#', Items.PAPER)
                .define('@', Blocks.TORCH)
                .unlockedBy("has_paper", has(Items.PAPER))
                .unlockedBy("has_torch", has(Blocks.TORCH))
                .save(recipeOutput);
        paperLantern(recipeOutput, ModBlocks.SAKURA_PAPER_LANTERN.get(), Blocks.CHERRY_SAPLING);
        paperLantern(recipeOutput, ModBlocks.TAIGA_PAPER_LANTERN.get(), Blocks.SPRUCE_SAPLING);
        paperLantern(recipeOutput, ModBlocks.ORCHID_PAPER_LANTERN.get(), Blocks.BLUE_ORCHID);
        paperLantern(recipeOutput, ModBlocks.PANDA_PAPER_LANTERN.get(), Blocks.BAMBOO);
        paperLantern(recipeOutput, ModBlocks.VILLAGER_PAPER_LANTERN.get(), Items.EMERALD);
        paperLantern(recipeOutput, ModBlocks.CREEPER_PAPER_LANTERN.get(), Items.GUNPOWDER);
        paperLantern(recipeOutput, ModBlocks.CHICKEN_JOCKEY_PAPER_LANTERN.get(), Ingredient.of(Items.CHICKEN, Items.COOKED_CHICKEN));
        paperLantern(recipeOutput, ModBlocks.PILLAGER_PAPER_LANTERN.get(), Items.ARROW);    //iron_axe?
        paperLantern(recipeOutput, ModBlocks.WARDEN_PAPER_LANTERN.get(), Items.ECHO_SHARD);

        //Might change that one to be the same as Seaglass Windows but without the plank.
        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CREAM_SEAGLASS.get(), ModItems.CREAM_SEAGLASS_FRAGMENTS.get(), "seaglass");
        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HAZEL_SEAGLASS.get(), ModItems.HAZEL_SEAGLASS_FRAGMENTS.get(), "seaglass");
        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIQUORICE_SEAGLASS.get(), ModItems.LIQUORICE_SEAGLASS_FRAGMENTS.get(), "seaglass");
        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOCHA_SEAGLASS.get(), ModItems.MOCHA_SEAGLASS_FRAGMENTS.get(), "seaglass");
        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SCARLET_SEAGLASS.get(), ModItems.SCARLET_SEAGLASS_FRAGMENTS.get(), "seaglass");
        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.HONEY_SEAGLASS.get(), ModItems.HONEY_SEAGLASS_FRAGMENTS.get(), "seaglass");
        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MINT_SEAGLASS.get(), ModItems.MINT_SEAGLASS_FRAGMENTS.get(), "seaglass");
        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TEAL_SEAGLASS.get(), ModItems.TEAL_SEAGLASS_FRAGMENTS.get(), "seaglass");
        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CERULEAN_SEAGLASS.get(), ModItems.CERULEAN_SEAGLASS_FRAGMENTS.get(), "seaglass");
        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.TAUPE_SEAGLASS.get(), ModItems.TAUPE_SEAGLASS_FRAGMENTS.get(), "seaglass");

        threeByTwoPacker(recipeOutput, ModBlocks.CREAM_SEAGLASS_PANE.get(), ModBlocks.CREAM_SEAGLASS.get(), "seaglass_panes");
        threeByTwoPacker(recipeOutput, ModBlocks.HAZEL_SEAGLASS_PANE.get(), ModBlocks.HAZEL_SEAGLASS.get(), "seaglass_panes");
        threeByTwoPacker(recipeOutput, ModBlocks.LIQUORICE_SEAGLASS_PANE.get(), ModBlocks.LIQUORICE_SEAGLASS.get(), "seaglass_panes");
        threeByTwoPacker(recipeOutput, ModBlocks.MOCHA_SEAGLASS_PANE.get(), ModBlocks.MOCHA_SEAGLASS.get(), "seaglass_panes");
        threeByTwoPacker(recipeOutput, ModBlocks.SCARLET_SEAGLASS_PANE.get(), ModBlocks.SCARLET_SEAGLASS.get(), "seaglass_panes");
        threeByTwoPacker(recipeOutput, ModBlocks.HONEY_SEAGLASS_PANE.get(), ModBlocks.HONEY_SEAGLASS.get(), "seaglass_panes");
        threeByTwoPacker(recipeOutput, ModBlocks.MINT_SEAGLASS_PANE.get(), ModBlocks.MINT_SEAGLASS.get(), "seaglass_panes");
        threeByTwoPacker(recipeOutput, ModBlocks.TEAL_SEAGLASS_PANE.get(), ModBlocks.TEAL_SEAGLASS.get(), "seaglass_panes");
        threeByTwoPacker(recipeOutput, ModBlocks.CERULEAN_SEAGLASS_PANE.get(), ModBlocks.CERULEAN_SEAGLASS.get(), "seaglass_panes");
        threeByTwoPacker(recipeOutput, ModBlocks.TAUPE_SEAGLASS_PANE.get(), ModBlocks.TAUPE_SEAGLASS.get(), "seaglass_panes");

        seaWindow(recipeOutput, ModBlocks.CREAM_SEA_WINDOW.get(), ModItems.CREAM_SEAGLASS_FRAGMENTS.get());
        seaWindow(recipeOutput, ModBlocks.HAZEL_SEA_WINDOW.get(), ModItems.HAZEL_SEAGLASS_FRAGMENTS.get());
        seaWindow(recipeOutput, ModBlocks.LIQUORICE_SEA_WINDOW.get(), ModItems.LIQUORICE_SEAGLASS_FRAGMENTS.get());
        seaWindow(recipeOutput, ModBlocks.MOCHA_SEA_WINDOW.get(), ModItems.MOCHA_SEAGLASS_FRAGMENTS.get());
        seaWindow(recipeOutput, ModBlocks.SCARLET_SEA_WINDOW.get(), ModItems.SCARLET_SEAGLASS_FRAGMENTS.get());
        seaWindow(recipeOutput, ModBlocks.HONEY_SEA_WINDOW.get(), ModItems.HONEY_SEAGLASS_FRAGMENTS.get());
        seaWindow(recipeOutput, ModBlocks.MINT_SEA_WINDOW.get(), ModItems.MINT_SEAGLASS_FRAGMENTS.get());
        seaWindow(recipeOutput, ModBlocks.TEAL_SEA_WINDOW.get(), ModItems.TEAL_SEAGLASS_FRAGMENTS.get());
        seaWindow(recipeOutput, ModBlocks.CERULEAN_SEA_WINDOW.get(), ModItems.CERULEAN_SEAGLASS_FRAGMENTS.get());
        seaWindow(recipeOutput, ModBlocks.TAUPE_SEA_WINDOW.get(), ModItems.TAUPE_SEAGLASS_FRAGMENTS.get());

        threeByTwoPacker(recipeOutput, ModBlocks.CREAM_SEA_WINDOW_PANE.get(), ModBlocks.CREAM_SEA_WINDOW.get(), "sea_window_panes");
        threeByTwoPacker(recipeOutput, ModBlocks.HAZEL_SEA_WINDOW_PANE.get(), ModBlocks.HAZEL_SEA_WINDOW.get(), "sea_window_panes");
        threeByTwoPacker(recipeOutput, ModBlocks.LIQUORICE_SEA_WINDOW_PANE.get(), ModBlocks.LIQUORICE_SEA_WINDOW.get(), "sea_window_panes");
        threeByTwoPacker(recipeOutput, ModBlocks.MOCHA_SEA_WINDOW_PANE.get(), ModBlocks.MOCHA_SEA_WINDOW.get(), "sea_window_panes");
        threeByTwoPacker(recipeOutput, ModBlocks.SCARLET_SEA_WINDOW_PANE.get(), ModBlocks.SCARLET_SEA_WINDOW.get(), "sea_window_panes");
        threeByTwoPacker(recipeOutput, ModBlocks.HONEY_SEA_WINDOW_PANE.get(), ModBlocks.HONEY_SEA_WINDOW.get(), "sea_window_panes");
        threeByTwoPacker(recipeOutput, ModBlocks.MINT_SEA_WINDOW_PANE.get(), ModBlocks.MINT_SEA_WINDOW.get(), "sea_window_panes");
        threeByTwoPacker(recipeOutput, ModBlocks.TEAL_SEA_WINDOW_PANE.get(), ModBlocks.TEAL_SEA_WINDOW.get(), "sea_window_panes");
        threeByTwoPacker(recipeOutput, ModBlocks.CERULEAN_SEA_WINDOW_PANE.get(), ModBlocks.CERULEAN_SEA_WINDOW.get(), "sea_window_panes");
        threeByTwoPacker(recipeOutput, ModBlocks.TAUPE_SEA_WINDOW_PANE.get(), ModBlocks.TAUPE_SEA_WINDOW.get(), "sea_window_panes");

        seaglassLamp(recipeOutput, ModBlocks.CREAM_SEAGLASS_LAMP.get(), ModBlocks.CREAM_SEAGLASS.get());
        seaglassLamp(recipeOutput, ModBlocks.HAZEL_SEAGLASS_LAMP.get(), ModBlocks.HAZEL_SEAGLASS.get());
        seaglassLamp(recipeOutput, ModBlocks.LIQUORICE_SEAGLASS_LAMP.get(), ModBlocks.LIQUORICE_SEAGLASS.get());
        seaglassLamp(recipeOutput, ModBlocks.MOCHA_SEAGLASS_LAMP.get(), ModBlocks.MOCHA_SEAGLASS.get());
        seaglassLamp(recipeOutput, ModBlocks.SCARLET_SEAGLASS_LAMP.get(), ModBlocks.SCARLET_SEAGLASS.get());
        seaglassLamp(recipeOutput, ModBlocks.HONEY_SEAGLASS_LAMP.get(), ModBlocks.HONEY_SEAGLASS.get());
        seaglassLamp(recipeOutput, ModBlocks.MINT_SEAGLASS_LAMP.get(), ModBlocks.MINT_SEAGLASS.get());
        seaglassLamp(recipeOutput, ModBlocks.TEAL_SEAGLASS_LAMP.get(), ModBlocks.TEAL_SEAGLASS.get());
        seaglassLamp(recipeOutput, ModBlocks.CERULEAN_SEAGLASS_LAMP.get(), ModBlocks.CERULEAN_SEAGLASS.get());
        seaglassLamp(recipeOutput, ModBlocks.TAUPE_SEAGLASS_LAMP.get(), ModBlocks.TAUPE_SEAGLASS.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.RUSTED_ANCHOR.get())
                .pattern(" I ")
                .pattern(" # ")
                .pattern("###")
                .define('#', ModItems.CORRUGATED_METAL_INGOT.get())
                .define('I', Blocks.CHAIN)
                .unlockedBy("has_corrugated_metal_ingot", has(ModItems.CORRUGATED_METAL_INGOT.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.LIFE_PRESERVER.get())
                .pattern("~#~")
                .pattern("# #")
                .pattern("~#~")
                .define('#', ItemTags.WOOL)
                .define('~', Tags.Items.ROPES)
                .unlockedBy("has_wool", has(ItemTags.WOOL))
                .unlockedBy("has_rope", has(Tags.Items.ROPES))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.DISPLAYED_OARS.get())
                .pattern("@ @")
                .pattern("~I~")
                .pattern("I I")
                .define('@', Items.WOODEN_SHOVEL)
                .define('~', Tags.Items.ROPES)
                .define('I', Items.STICK)
                .unlockedBy("has_shovel", has(ItemTags.SHOVELS))
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy("has_stick", has(Items.STICK))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.TREASURE_MAP.get())
                .requires(Ingredient.of(Items.MAP, Items.FILLED_MAP))
                .requires(Items.RED_DYE)
                .unlockedBy("has_map", has(Items.MAP))
                .unlockedBy("has_red_dye", has(Items.RED_DYE))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.SCATTERED_PAPERS.get(), 2)
                .requires(Items.PAPER, 3)
                .unlockedBy("has_paper", has(Items.PAPER))
                .save(recipeOutput);
        twoByTwoPacker(recipeOutput, RecipeCategory.DECORATIONS, ModBlocks.POSTERS.get(), 4, Items.PAPER, null);
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.MISC, Items.PAPER, RecipeCategory.DECORATIONS, ModBlocks.PAPER_STACK.get(),
                getSimpleRecipeName(ModBlocks.PAPER_STACK.get()), null, getConversionRecipeName(Items.PAPER, ModBlocks.PAPER_STACK.get()), null); //3 instead of 1 obtained?
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GLASS_BUOY.get())
                .pattern("~ ~")
                .pattern(" # ")
                .pattern("~ ~")
                .define('#', Tags.Items.GLASS_BLOCKS_TINTED)
                .define('~', Tags.Items.ROPES)
                .unlockedBy("has_stained_glass", has(Tags.Items.GLASS_BLOCKS_TINTED))
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .save(recipeOutput);
//        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SMALL_GLASS_BUOYS.get()) //TODO
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WOODEN_BUOYS.get(), 3)
                .pattern("~~~")
                .pattern("# #")
                .define('~', Tags.Items.ROPES)
                .define('#', ItemTags.PLANKS)
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.ROPE.get(), 8)
                .pattern("#~")
                .pattern("~#")
                .pattern("#~")
                .define('~', Tags.Items.ROPES)
                .define('#', Items.WHEAT)
                .unlockedBy("has_wheat", has(Items.WHEAT))
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.COILED_ROPE.get())
                .pattern("###")
                .pattern("# #")
                .pattern("###")
                .define('#', Tags.Items.ROPES)
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .save(recipeOutput);
        hangingStuff(recipeOutput, ModBlocks.HANGING_COD.get(), Items.COD);
        hangingStuff(recipeOutput, ModBlocks.HANGING_SALMON.get(), Items.SALMON);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.HANGING_KNIVES.get())      //TODO: might be too expensive...
                .pattern("@^@")
                .pattern("###")
                .define('#', Ingredient.of(ModBlocks.WEDGED_KNIFE.get(), ModBlocks.WEDGED_CLEAVER.get()))
                .define('@', ItemTags.PLANKS)
                .define('^', Items.IRON_NUGGET)
                .unlockedBy("has_wedged_knife", has(ModBlocks.WEDGED_KNIFE.get()))      //TODO: create a c:knives tag or something
                .unlockedBy("has_wedged_cleaver", has(ModBlocks.WEDGED_CLEAVER.get()))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WEDGED_KNIFE.get())
                .pattern("I")
                .pattern("#")
                .pattern("^")
                .define('I', Items.STICK)
                .define('#', Items.IRON_INGOT)
                .define('^', Items.IRON_NUGGET)
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .unlockedBy("has_iron_nugget", has(Items.IRON_INGOT))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WEDGED_CLEAVER.get())
                .pattern("I ")
                .pattern("#^")
                .pattern("#^")
                .define('I', Items.STICK)
                .define('#', Items.IRON_INGOT)
                .define('^', Items.IRON_NUGGET)
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .unlockedBy("has_iron_nugget", has(Items.IRON_INGOT))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CUTTING_BOARD.get())
                .pattern("I##")
                .define('I', Items.STICK)
                .define('#', Blocks.STRIPPED_OAK_LOG)
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_stripped_oak_log", has(Blocks.STRIPPED_OAK_LOG))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.KNIFE_AND_CUTTING_BOARD.get())
                .requires(ModBlocks.CUTTING_BOARD.get())
                .requires(Ingredient.of(ModBlocks.WEDGED_KNIFE.get(), ModBlocks.WEDGED_CLEAVER.get()))
                .unlockedBy("has_cutting_board", has(ModBlocks.CUTTING_BOARD.get()))
                .unlockedBy("has_wedged_knife", has(ModBlocks.WEDGED_KNIFE.get()))
                .unlockedBy("has_wedged_cleaver", has(ModBlocks.WEDGED_CLEAVER.get()))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIG_COOKING_POT.get())
                .pattern("~ ~")
                .pattern("# #")
                .pattern("###")
                .define('~', Items.IRON_NUGGET)
                .define('#', Items.IRON_INGOT)
                .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                .unlockedBy("has_iron_ingot", has(Items.IRON_INGOT))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.POTS_AND_PANS.get(), 4)
                .requires(ModBlocks.BIG_COOKING_POT.get())
                .requires(ModBlocks.IRON_FRYING_PAN.get())
                .requires(ModBlocks.COPPER_FRYING_PAN.get())
                .unlockedBy(getHasName(ModBlocks.BIG_COOKING_POT.get()), has(ModBlocks.BIG_COOKING_POT.get()))
                .unlockedBy(getHasName(ModBlocks.IRON_FRYING_PAN.get()), has(ModBlocks.IRON_FRYING_PAN.get()))
                .unlockedBy(getHasName(ModBlocks.COPPER_FRYING_PAN.get()), has(ModBlocks.COPPER_FRYING_PAN.get()))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.DECORATIVE_BOWL.get())
                .requires(Items.BOWL)
                .unlockedBy("has_bowl", has(Items.BOWL))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.JARS.get(), 8)
                .pattern("@@")
                .pattern("##")
                .define('@', Tags.Items.GLASS_BLOCKS_CHEAP)
                .define('#', ItemTags.TERRACOTTA)
                .unlockedBy("has_terracotta", has(ItemTags.TERRACOTTA))
                .unlockedBy("has_glass", has(Tags.Items.GLASS_BLOCKS_CHEAP))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.INK_AND_QUILL.get())
                .pattern("F ")
                .pattern("BI")
                .pattern("# ")
                .define('F', Items.FEATHER)
                .define('B', Items.GLASS_BOTTLE)
                .define('I', Items.INK_SAC)
                .define('#', Items.COPPER_INGOT)        //  should be nugget from 1.21.9 and on
                .unlockedBy("has_feather", has(Items.FEATHER))
                .unlockedBy("has_glass_bottle", has(Items.GLASS_BOTTLE))
                .unlockedBy("has_ink_sac", has(Items.INK_SAC))
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))    //  idem
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.EMPTY_SMALL_SHELF.get(), 6)
                .pattern("###")
                .pattern("/~/")
                .define('#', ItemTags.PLANKS)
                .define('/', Items.STICK)
                .define('~', Items.IRON_NUGGET)
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_iron_nugget", has(Items.IRON_NUGGET))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CLUTTERED_SMALL_SHELF.get())
                .pattern("#")
                .pattern("~")
                .define('#', ModBlocks.JARS.get())
                .define('~', ModBlocks.EMPTY_SMALL_SHELF.get())
                .unlockedBy("has_jars", has(ModBlocks.JARS.get()))
                .unlockedBy("has_empty_small_shelf", has(ModBlocks.EMPTY_SMALL_SHELF.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SMALL_BOOKSHELF.get())
                .pattern("#")
                .pattern("~")
                .define('#', Items.BOOK)
                .define('~', ModBlocks.EMPTY_SMALL_SHELF.get())
                .unlockedBy("has_book", has(Items.BOOK))
                .unlockedBy("has_empty_small_shelf", has(ModBlocks.EMPTY_SMALL_SHELF.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BOOKS.get())
                .pattern("###")
                .define('#', Items.BOOK)
                .unlockedBy("has_book", has(Items.BOOK))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BOOK_STACK.get())
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .define('#', Items.BOOK)
                .unlockedBy("has_book", has(Items.BOOK))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GLOBE.get())
                .pattern(" @")
                .pattern("^#")
                .pattern(" ^")
                .define('@', Items.MAP)
                .define('^', Items.COPPER_INGOT)
                .define('#', Blocks.BLUE_WOOL)
                .unlockedBy("has_map", has(Items.MAP))
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                .unlockedBy("has_blue_wool", has(Blocks.BLUE_WOOL))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.VINTAGE_GLOBE.get())
                .pattern(" @")
                .pattern("^#")
                .pattern(" ^")
                .define('@', Items.MAP)
                .define('^', Items.GOLD_INGOT)
                .define('#', Blocks.BROWN_WOOL)
                .unlockedBy("has_map", has(Items.MAP))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .unlockedBy("has_brown_wool", has(Blocks.BROWN_WOOL))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.FISHING_LURES.get(), 4)
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
                .save(recipeOutput);
        fourBlockStorageRecipesWithCustomUnpacking(recipeOutput, RecipeCategory.MISC, Items.GOLD_NUGGET, RecipeCategory.DECORATIONS, ModBlocks.GOLD_COINS_BLOCK.get(), "gold_nuggets_from_gold_coins_block", "gold_nugget");
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.GOLD_COINS_LAYER.get(), 6)
                .pattern("###")
                .define('#', ModBlocks.GOLD_COINS_BLOCK.get())
                .unlockedBy("has_gold_coins_block", has(ModBlocks.GOLD_COINS_BLOCK.get()))
                .save(recipeOutput);
        fourBlockStorageRecipesWithCustomPacking(recipeOutput, RecipeCategory.DECORATIONS, ModBlocks.SCATTERED_GOLD_COINS.get(), RecipeCategory.DECORATIONS, ModBlocks.GOLD_COINS_LAYER.get(), "gold_coins_layer_from_scattered_gold_coins", null);
        threeByThreePacker(recipeOutput, RecipeCategory.DECORATIONS, ModBlocks.BIG_NAUTILUS_SHELL.get(), Items.NAUTILUS_SHELL);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BIG_NAUTILUS_LANTERN.get())
                .pattern("#")
                .pattern("^")
                .define('#', ModBlocks.BIG_NAUTILUS_SHELL.get())
                .define('^', Blocks.LANTERN)
                .unlockedBy("has_big_nautilus_shell", has(ModBlocks.BIG_NAUTILUS_SHELL.get()))
                .unlockedBy("has_lantern", has(Blocks.LANTERN))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.SMALL_NAUTILUS_SHELL.get())
                .requires(Items.NAUTILUS_SHELL)
                .unlockedBy("has_nautilus_shell", has(Items.NAUTILUS_SHELL))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.COLD_NAUTILUS_WIND_CHIME.get())
                .pattern(" ~ ")
                .pattern(" @ ")
                .pattern("###")
                .define('~', Tags.Items.ROPES)
                .define('@', Ingredient.of(Items.NAUTILUS_SHELL, ModBlocks.SMALL_NAUTILUS_SHELL.get()))
                .define('#', ModTags.Items.COLD_SEAGLASS_FRAGMENTS)
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy("has_nautilus_shell", has(Items.NAUTILUS_SHELL))
                .unlockedBy("has_cold_seaglass_fragments", has(ModTags.Items.COLD_SEAGLASS_FRAGMENTS))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BURLAP.get(), 4)
                .pattern("#~")
                .pattern("~#")
                .define('#', Items.WHEAT)
                .define('~', Items.STRING)
                .unlockedBy("has_wheat", has(Items.WHEAT))
                .unlockedBy("has_string", has(Items.STRING))
                .save(recipeOutput);
        nineBlockStorageRecipes(recipeOutput, RecipeCategory.MISC, ModItems.BURLAP.get(), RecipeCategory.DECORATIONS, ModBlocks.BURLAP_BLOCK.get());
        stairs(recipeOutput, ModBlocks.BURLAP_STAIRS.get(), ModBlocks.BURLAP_BLOCK.get());
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BURLAP_SLAB.get(), ModBlocks.BURLAP_BLOCK.get());
        carpet(recipeOutput, ModBlocks.BURLAP_CARPET.get(), ModBlocks.BURLAP_BLOCK.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.BURLAP_SACK.get(), 2)
                .pattern(" #~")
                .pattern("#@#")
                .pattern("~# ")
                .define('#', ModItems.BURLAP.get())
                .define('~', Tags.Items.ROPES)
                .define('@', Items.WHEAT)
                .unlockedBy("has_burlap", has(ModItems.BURLAP.get()))
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy("has_wheat", has(Items.WHEAT))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SAILOR_FLAG.get())
                .pattern("~~~")
                .pattern(" # ")
                .define('~', Tags.Items.ROPES)
                .define('#', ItemTags.WOOL)
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy("has_wool", has(ItemTags.WOOL))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.SAILOR_PENNANT_FLAG.get()) //todo: count? 2 maybe? or 4?
                .pattern("~")
                .pattern("#")
                .define('~', Tags.Items.ROPES)
                .define('#', ItemTags.WOOL)
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy("has_wool", has(ItemTags.WOOL))
                .save(recipeOutput);
        twoByTwoPacker(recipeOutput, RecipeCategory.DECORATIONS, ModBlocks.CERAMIC_POT.get(), 4, Blocks.FLOWER_POT, null);
        // copying vanilla recipe but might add an alternative craft like vanillatweaks' universal dyeing, locked behind config
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.GLAZED_CERAMIC_POT.get())
                .requires(ModBlocks.CERAMIC_POT.get())
                .unlockedBy("has_ceramic_pot", has(ModBlocks.CERAMIC_POT.get()))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.VINTAGE_CASH_REGISTER.get())
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
                .save(recipeOutput);
        hangingStuff(recipeOutput, ModBlocks.HANGING_SAUSAGES.get(), ModItems.RAW_BRATWURST.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WRAPPED_MEAT.get(), 4)
                .pattern(" # ")
                .pattern("#@#")
                .pattern(" # ")
                .define('#', Items.PAPER)
                .define('@', Tags.Items.FOODS_RAW_MEAT)
                .unlockedBy("has_paper", has(Items.PAPER))
                .unlockedBy("has_raw_meat", has(Tags.Items.FOODS_RAW_MEAT))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.COWHIDE_RUG.get())
                .pattern(" # ")
                .pattern("###")
                .pattern("###")
                .define('#', Items.LEATHER)
                .unlockedBy("has_leather", has(Items.LEATHER))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.MOOSHROOM_COWHIDE_RUG.get())
                .requires(ModBlocks.COWHIDE_RUG.get())
                .requires(Tags.Items.MUSHROOMS)
                .unlockedBy("has_leather", has(Items.LEATHER))
                .unlockedBy("has_mushroom", has(Tags.Items.MUSHROOMS))
                .save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModBlocks.COWHIDE_RUG.get())
                .requires(ModBlocks.MOOSHROOM_COWHIDE_RUG.get())
                .unlockedBy("has_mooshroom_cowhide_rug", has(ModBlocks.MOOSHROOM_COWHIDE_RUG.get()))
                .save(recipeOutput, "cowhide_rug_from_mooshroom_cowhide_rug");

        //TODO: copper_nugget doesn't exist yet
//        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.COPPER_LIGHT.get())
//                .pattern("###")
//                .pattern("#@#")
//                .pattern("###")
//                .define('#', Items.COPPER_NUGGET)
//                .define('@', Blocks.REDSTONE_TORCH)
//                .unlockedBy("has_copper_nugget", has(Items.COPPER_NUGGET))
//                .unlockedBy("has_redstone_torch", has(Blocks.REDSTONE_TORCH))
//                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.COPPER_LIGHT.get())
                .pattern(" # ")
                .pattern("#@#")
                .pattern(" # ")
                .define('#', Items.COPPER_INGOT)
                .define('@', Blocks.REDSTONE_TORCH)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                .unlockedBy("has_redstone_torch", has(Blocks.REDSTONE_TORCH))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CAMERA_QUADROPOD.get())
                .pattern("#^#")
                .pattern("#^#")
                .define('#', Items.COPPER_INGOT)
                .define('^', Items.GOLD_NUGGET)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT))
                .unlockedBy("has_gold_nugget", has(Items.GOLD_NUGGET))
                .unlockedBy("has_gold_ingot", has(Items.GOLD_INGOT))
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.CAMERA.get())
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
                .save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.MOVIE_CAMERA.get())
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
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WICKER_BLOCK.get(), 4)
                .pattern("#~")
                .pattern("~#")
                .define('#', Items.STICK)
                .define('~', Tags.Items.ROPES)
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .save(recipeOutput);
        stairs(recipeOutput, ModBlocks.WICKER_STAIRS.get(), ModBlocks.WICKER_BLOCK.get());
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WICKER_SLAB.get(), ModBlocks.WICKER_BLOCK.get());
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModBlocks.WICKER_BASKET.get(), 3)        //TODO: count?
                .pattern("# #")
                .pattern("###")
                .define('#', ModBlocks.WICKER_BLOCK.get())
                .unlockedBy("has_wicker_block", has(ModBlocks.WICKER_BLOCK.get()))
                .save(recipeOutput);
        //TODO: baskets


//        List<ItemLike> BLOCK_SMELTABLES = List.of(
//                ModItems.<MY_ITEM>,
//                ModBlocks.<MY_BLOCK>,
//                ModBlocks.<MY_OTHER_BLOCK>);

//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.<MY_BLOCK>.get())
//                .pattern('BBB')
//                .pattern('BBB')
//                .pattern('BBB')
//                .define('B', ModItems.<MY_ITEM>.get())
//                .unlockedBy('has_item', has(ModItems.<MY_ITEM>))
//                .save(recipeOutput);

//        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.<MY_ITEM>.get(), 9)
//            .requires(ModBlocks.<MY_BLOCK>)
//            .unlockedBy('has_block', has(ModBlocks.<MY_BLOCK>))
//            .save(recipeOutput, "dustydecorations:block_from_block");

//        oreBlasting(recipeOutput, BLOCK_SMELTABLES, RecipeCategory.MISC, ModItems.<MY_ITEM>.get(), 0.25f, 200, "block");

    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, ModConstants.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

    protected static void twoByTwoPacker(RecipeOutput recipeOutput, RecipeCategory recipeCategory, ItemLike result, ItemLike ingredient, @Nullable String group) {
        twoByTwoPacker(recipeOutput, recipeCategory, result, 1, ingredient, group);
    }
    protected static void twoByTwoPacker(RecipeOutput recipeOutput, RecipeCategory recipeCategory, ItemLike result, int count, ItemLike ingredient, @Nullable String group) {
        ShapedRecipeBuilder.shaped(recipeCategory, result, count)
                .pattern("##")
                .pattern("##")
                .define('#', ingredient)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .group(group)
                .save(recipeOutput);
    }

    protected static void threeByTwoPacker(RecipeOutput recipeOutput, ItemLike result, ItemLike ingredient, @Nullable String group) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result, 16)
                .pattern("###")
                .pattern("###")
                .define('#', ingredient)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .group(group)
                .save(recipeOutput);
    }

    //copied neoforge's nineBlockStorageRecipes()
    protected static void fourBlockStorageRecipes(RecipeOutput recipeOutput, RecipeCategory unpackedCategory, ItemLike unpacked,
                                                  RecipeCategory packedCategory, ItemLike packed) {
        fourBlockStorageRecipes(recipeOutput, unpackedCategory, unpacked, packedCategory, packed, getSimpleRecipeName(packed), null, getSimpleRecipeName(unpacked), null);
    }
    protected static void fourBlockStorageRecipesWithCustomPacking(RecipeOutput recipeOutput, RecipeCategory unpackedCategory, ItemLike unpacked,
                                                                   RecipeCategory packedCategory, ItemLike packed, String packedName, String packedGroup) {
        fourBlockStorageRecipes(recipeOutput, unpackedCategory, unpacked, packedCategory, packed, packedName, packedGroup, getSimpleRecipeName(unpacked), null);
    }
    protected static void fourBlockStorageRecipesWithCustomUnpacking(RecipeOutput recipeOutput, RecipeCategory unpackedCategory, ItemLike unpacked,
                                                                     RecipeCategory packedCategory, ItemLike packed, String unpackedName, String unpackedGroup) {
        fourBlockStorageRecipes(recipeOutput, unpackedCategory, unpacked, packedCategory, packed, getSimpleRecipeName(packed), null, unpackedName, unpackedGroup);
    }

    protected static void fourBlockStorageRecipes(RecipeOutput recipeOutput, RecipeCategory unpackedCategory, ItemLike unpacked, RecipeCategory packedCategory, ItemLike packed,
                                                  String packedName, @Nullable String packedGroup, String unpackedName, @Nullable String unpackedGroup) {
        ShapelessRecipeBuilder.shapeless(unpackedCategory, unpacked, 4)
                .requires(packed)
                .group(unpackedGroup)
                .unlockedBy(getHasName(packed), has(packed))
                .save(recipeOutput, ResourceLocation.parse(unpackedName));
        ShapedRecipeBuilder.shaped(packedCategory, packed)
                .define('#', unpacked)
                .pattern("##")
                .pattern("##")
                .group(packedGroup)
                .unlockedBy(getHasName(unpacked), has(unpacked))
                .save(recipeOutput, ResourceLocation.parse(packedName));
    }

    protected static void stairs(RecipeOutput recipeOutput, ItemLike stairs, ItemLike material) {
        stairBuilder(stairs, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).save(recipeOutput);
    }
    protected static void stairs(RecipeOutput recipeOutput, ItemLike stairs, ItemLike material, String group) {
        stairBuilder(stairs, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).group(group).save(recipeOutput);
    }

    protected static void slab(RecipeOutput recipeOutput, ItemLike slab, ItemLike material, String group) {
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, slab, Ingredient.of(material)).unlockedBy(getHasName(material), has(material)).group(group).save(recipeOutput);
    }

    protected static void banister(RecipeOutput recipeOutput, ItemLike banister, ItemLike fence, ItemLike hasPlanks) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, banister, 6)
                .pattern("###")
                .define('#', fence)
                .unlockedBy("has_planks", has(hasPlanks))
                .group("banisters")
                .save(recipeOutput);
    }

    protected static void largeShelf(RecipeOutput recipeOutput, ItemLike largeShelf, ItemLike planks) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, largeShelf, 3)
                .pattern("###")
                .pattern("@  ")
                .define('#', planks)
                .define('@', ModBlocks.EMPTY_SMALL_SHELF.get())
                .unlockedBy("has_planks", has(planks))
                .group("large_shelves")
                .save(recipeOutput);
    }

    protected static void barrel(RecipeOutput recipeOutput, ItemLike barrel, ItemLike ingredient) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, barrel)
                .requires(ingredient)
                .requires(Ingredient.of(Blocks.BARREL, ModBlocks.EMPTY_BARREL.get()))
                // has_barrel instead?
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .unlockedBy("has_wooden_slabs", has(ItemTags.WOODEN_SLABS))
                .unlockedBy(getHasName(ingredient), has(ingredient))
//                .group("barrels")
                .save(recipeOutput);
    }

    protected static void wallpaper(RecipeOutput recipeOutput, ItemLike wallpaper, ItemLike wool, ItemLike ingredient) {
        wallpaper(recipeOutput, wallpaper, Ingredient.of(wool), Ingredient.of(ingredient));
    }
    protected static void wallpaper(RecipeOutput recipeOutput, ItemLike wallpaper, Ingredient wool, ItemLike ingredient) {
        wallpaper(recipeOutput, wallpaper, wool, Ingredient.of(ingredient));
    }
    protected static void wallpaper(RecipeOutput recipeOutput, ItemLike wallpaper, ItemLike wool, Ingredient ingredient) {
        wallpaper(recipeOutput, wallpaper, Ingredient.of(wool), ingredient);
    }
    protected static void wallpaper(RecipeOutput recipeOutput, ItemLike wallpaper, Ingredient wool, Ingredient ingredient) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, wallpaper, 8)
                .pattern("~@")
                .pattern("~#")
                .define('~', Items.PAPER)
                .define('#', wool)
                .define('@', ingredient)
                .unlockedBy("has_wool", has(ItemTags.WOOL))
                .unlockedBy("has_paper", has(Items.PAPER))
                .save(recipeOutput);
    }

    protected static void woolAwning(RecipeOutput recipeOutput, ItemLike awning, ItemLike carpet) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, awning)
                .pattern("## ")
                .pattern(" @#")
                .define('#', carpet)
                .define('@', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .unlockedBy("has_wool", has(ItemTags.WOOL))
                .group("wool_awnings")
                .save(recipeOutput);
    }

    protected static void paperLantern(RecipeOutput recipeOutput, ItemLike paperLantern, ItemLike ingredient) {
        paperLantern(recipeOutput, paperLantern, Ingredient.of(ingredient));
    }
    protected static void paperLantern(RecipeOutput recipeOutput, ItemLike paperLantern, Ingredient ingredient) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, paperLantern)
                .requires(paperLantern)
                .requires(ingredient)
                .unlockedBy("has_paper_lantern", has(ModBlocks.PAPER_LANTERN.get()))
                .save(recipeOutput);
    }

    protected static void seaWindow(RecipeOutput recipeOutput, ItemLike seaWindow, ItemLike fragment) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, seaWindow, 4)
                .pattern(" # ")
                .pattern("#@#")
                .pattern(" # ")
                .define('#', fragment)
                .define('@', ItemTags.PLANKS)
                .unlockedBy(getHasName(fragment), has(fragment))
                .group("sea_windows")
                .save(recipeOutput);
    }

    protected static void seaglassLamp(RecipeOutput recipeOutput, ItemLike seaglassLamp, ItemLike seaglass) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, seaglassLamp)
                .pattern(" # ")
                .pattern("#@#")
                .pattern(" I ")
                .define('#', seaglass)
                .define('@', Blocks.REDSTONE_LAMP)
                .define('I', Items.COPPER_INGOT)
                .unlockedBy(getHasName(seaglass), has(seaglass))
                .unlockedBy("has_redstone_lamp", has(Blocks.REDSTONE_LAMP))
                .group("seaglass_lamps")
                .save(recipeOutput);
    }

    protected static void hangingStuff(RecipeOutput recipeOutput, ItemLike hangingObject, ItemLike object) {
        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, hangingObject)
                .pattern("~~~")
                .pattern("###")
                .define('~', Tags.Items.ROPES)
                .define('#', object)
                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .unlockedBy(getHasName(object), has(object))
                .save(recipeOutput);
    }

                .unlockedBy("has_ropes", has(Tags.Items.ROPES))
                .save(recipeOutput);
    }

}
