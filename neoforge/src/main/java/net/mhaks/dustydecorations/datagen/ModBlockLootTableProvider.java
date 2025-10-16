package net.mhaks.dustydecorations.datagen;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        ModConstants.LOGGER.info("Generating!!");
        dropSelf(ModBlocks.OAK_BANISTER.get());
        dropSelf(ModBlocks.SPRUCE_BANISTER.get());
        dropSelf(ModBlocks.BIRCH_BANISTER.get());
        dropSelf(ModBlocks.JUNGLE_BANISTER.get());
        dropSelf(ModBlocks.ACACIA_BANISTER.get());
        dropSelf(ModBlocks.DARK_OAK_BANISTER.get());
        dropSelf(ModBlocks.MANGROVE_BANISTER.get());
        dropSelf(ModBlocks.CHERRY_BANISTER.get());
        dropSelf(ModBlocks.BAMBOO_BANISTER.get());
        dropSelf(ModBlocks.DRY_BAMBOO_BANISTER.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        ModConstants.LOGGER.info("Getting known blocks!");
        return ModBlocks.BLOCKS.getEntries().stream().map(blockRegistryObject -> (Block) blockRegistryObject.get()).toList();
    }

}
