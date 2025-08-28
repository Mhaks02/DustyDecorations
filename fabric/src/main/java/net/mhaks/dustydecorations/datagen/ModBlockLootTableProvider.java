package net.mhaks.dustydecorations.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModBlockLootTableProvider extends FabricBlockLootTableProvider {
    public ModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
//        dropSelf(ModBlocks.TEST_BLOCK.get());
//        createOreDrop(ModBlocks.TEST_BLOCK.get(), ModItems.OTHER_TEST_ITEM.get());
//        add(ModBlocks.TEST_BLOCK.get(), createOreDrop(ModBlocks.TEST_BLOCK.get(), ModItems.TEST_ITEM_LOL.get()));

    }


//    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
//        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
//    }
//
//    @Override
//    protected void generate() {
//        dropSelf(ModBlocks.TEST_BLOCK.get());
//
////        add(ModBlocks.TEST_BLOCK.get(),
////                block -> createOreDrop(ModBlocks.TEST_BLOCK.get(), ModItems.TEST_ITEM_LOL.get()));
//    }

//    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
//        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
//        return this.createSilkTouchDispatchTable(pBlock,
//                this.applyExplosionDecay(pBlock, LootItem.lootTableItem(item)
//                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
//                        .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))));
//    }
}
