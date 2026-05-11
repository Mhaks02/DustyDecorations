package net.mhaks.dustydecorations.datagen;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

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
        ShapedRecipeBuilder.shaped(recipeCategory, result, count)   //1 instead?
                .pattern("##")
                .pattern("##")
                .define('#', ingredient)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .group(group)
                .save(recipeOutput);
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

                .save(recipeOutput);
    }

}
