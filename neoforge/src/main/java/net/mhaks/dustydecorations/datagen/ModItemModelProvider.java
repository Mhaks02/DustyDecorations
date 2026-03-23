package net.mhaks.dustydecorations.datagen;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ModConstants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//        basicItem(ModItems.<MY_ITEM>.get());
        basicItem(ModItems.CREAM_SEAGLASS_FRAGMENTS.get());
        basicItem(ModItems.HAZEL_SEAGLASS_FRAGMENTS.get());
        basicItem(ModItems.LIQUORICE_SEAGLASS_FRAGMENTS.get());
        basicItem(ModItems.MOCHA_SEAGLASS_FRAGMENTS.get());
        basicItem(ModItems.SCARLET_SEAGLASS_FRAGMENTS.get());
        basicItem(ModItems.HONEY_SEAGLASS_FRAGMENTS.get());
        basicItem(ModItems.TEAL_SEAGLASS_FRAGMENTS.get());
        basicItem(ModItems.MINT_SEAGLASS_FRAGMENTS.get());
        basicItem(ModItems.CERULEAN_SEAGLASS_FRAGMENTS.get());
        basicItem(ModItems.TAUPE_SEAGLASS_FRAGMENTS.get());

        basicItem(ModItems.BURLAP.get());
        basicItem(ModItems.RAW_BRATWURST.get());
        basicItem(ModItems.SMOKED_BRATWURST.get());
        basicItem(ModItems.BRATWURST_HOT_DOG.get());

        spawnEggItem(ModItems.NAUTILUS_GOLEM_SPAWN_EGG.get());


    }
}
