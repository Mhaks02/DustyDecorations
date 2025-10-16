package net.mhaks.dustydecorations.datagen;

import net.mhaks.dustydecorations.item.ModItems;
import net.mhaks.dustydecorations.ModConstants;
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
    }
}
