package net.mhaks.dustydecorations.datagen;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.item.ModItems;
import net.mhaks.dustydecorations.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, ModConstants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
//        tag(ModItems.<MY_ITEM>.get());

        tag(ModTags.Items.NAUTILUS_SHELLS)
                .add(Items.NAUTILUS_SHELL)
                .add(ModBlocks.SMALL_NAUTILUS_SHELL.get().asItem());

        tag(ModTags.Items.COLD_SEAGLASS_FRAGMENTS)
                .add(ModItems.CREAM_SEAGLASS_FRAGMENTS.get())
                .add(ModItems.HAZEL_SEAGLASS_FRAGMENTS.get())
                .add(ModItems.MINT_SEAGLASS_FRAGMENTS.get())
                .add(ModItems.TEAL_SEAGLASS_FRAGMENTS.get());

        tag(Tags.Items.FOODS_RAW_MEAT)
                .add(ModItems.RAW_BRATWURST.get());
        tag(Tags.Items.FOODS_COOKED_MEAT)
                .add(ModItems.SMOKED_BRATWURST.get())
                .add(ModItems.BRATWURST_HOT_DOG.get());

        tag(ModTags.Items.CORALS)
                .add(Blocks.BRAIN_CORAL_FAN.asItem())
                .add(Blocks.BUBBLE_CORAL_FAN.asItem())
                .add(Blocks.FIRE_CORAL_FAN.asItem())
                .add(Blocks.HORN_CORAL_FAN.asItem())
                .add(Blocks.TUBE_CORAL_FAN.asItem())
                .add(Blocks.BRAIN_CORAL.asItem())
                .add(Blocks.BUBBLE_CORAL.asItem())
                .add(Blocks.FIRE_CORAL.asItem())
                .add(Blocks.HORN_CORAL.asItem())
                .add(Blocks.TUBE_CORAL.asItem());

    }
}
