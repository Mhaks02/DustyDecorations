package net.mhaks.dustydecorations.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.mhaks.dustydecorations.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput exporter) {
//        List<ItemLike> ITEM_SMELTABLES = List.of(ModItems.TEST_ITEM_LOL.get(), ModItems.OTHER_TEST_ITEM.get());

//        oreSmelting(exporter, ITEM_SMELTABLES, RecipeCategory.MISC, ModItems.TEST_ITEM_LOL.get(), 0.25f, 200, "item_smeltables");
//        oreBlasting(exporter, ITEM_SMELTABLES, RecipeCategory.MISC, ModItems.TEST_ITEM_LOL.get(), 0.25f, 200, "item_smeltables");

//        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.OTHER_TEST_ITEM.get(), 9)
//                .pattern()
//                .define()
//                .unlockedBy(has)
//                .save(exporter);

    }
}
