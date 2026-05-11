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
                .pattern("PPP")
                .pattern("S  ")
                .define('P', planks)
                .define('S', ModBlocks.EMPTY_SMALL_SHELF.get())
                .unlockedBy("has_planks", has(planks))
                .group("large_shelves")
                .save(recipeOutput);
    }

    protected static void barrel(RecipeOutput recipeOutput, ItemLike barrel, ItemLike ingredient) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, barrel)
                .requires(ingredient)
                .requires(Ingredient.of(Blocks.BARREL, ModBlocks.EMPTY_BARREL.get()))
                .unlockedBy("has_planks", has(ItemTags.PLANKS))
                .unlockedBy("has_wooden_slabs", has(ItemTags.WOODEN_SLABS))
                .unlockedBy("has_apple", has(ingredient))
                .group("barrels")
                .save(recipeOutput);
    }

}
