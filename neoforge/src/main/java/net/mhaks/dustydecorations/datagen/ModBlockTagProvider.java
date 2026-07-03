package net.mhaks.dustydecorations.datagen;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ModConstants.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
//        tag(BlockTags.MINEABLE_WITH_AXE)
//                .add(ModBlocks.OAK_BANISTER.get())
//                .add() etc... ;

        tag(BlockTags.WALLS)
                .add(ModBlocks.SEASTONE_WALL.get())
                .add(ModBlocks.SEASTONE_BRICK_WALL.get())
                .add(ModBlocks.SMOOTH_SEASTONE_WALL.get())
                .add(ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICK_WALL.get())
                .add(ModBlocks.SNOWY_COBBLESTONE_WALL.get())
                .add(ModBlocks.SNOWY_STONE_BRICK_WALL.get())
                .add(ModBlocks.SMOOTH_STONE_BRICK_WALL.get())
        ;
        tag(Tags.Blocks.ROPES)
                .add(ModBlocks.ROPE.get())
        ;
    }
}
