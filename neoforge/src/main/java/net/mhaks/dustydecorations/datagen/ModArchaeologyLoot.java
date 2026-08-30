package net.mhaks.dustydecorations.datagen;

import net.mhaks.dustydecorations.block.entity.ModBlockEntityTypes;
import net.mhaks.dustydecorations.item.ModItems;
import net.mhaks.dustydecorations.loot.ModLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.NestedLootTable;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.function.BiConsumer;

public record ModArchaeologyLoot(HolderLookup.Provider registries) implements LootTableSubProvider {

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> output) {
        output.accept(
                ModLootTables.SUS_SEAGLASS,
                LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .setRolls(ConstantValue.exactly(1.0F))
                                .add(LootItem.lootTableItem(ModItems.CREAM_SEAGLASS_FRAGMENTS.get()))
                                .add(LootItem.lootTableItem(ModItems.HAZEL_SEAGLASS_FRAGMENTS.get()))
                                .add(LootItem.lootTableItem(ModItems.LIQUORICE_SEAGLASS_FRAGMENTS.get()))
                                .add(LootItem.lootTableItem(ModItems.MOCHA_SEAGLASS_FRAGMENTS.get()))
                                .add(LootItem.lootTableItem(ModItems.SCARLET_SEAGLASS_FRAGMENTS.get()))
                                .add(LootItem.lootTableItem(ModItems.HONEY_SEAGLASS_FRAGMENTS.get()))
                                .add(LootItem.lootTableItem(ModItems.TEAL_SEAGLASS_FRAGMENTS.get()))
                                .add(LootItem.lootTableItem(ModItems.MINT_SEAGLASS_FRAGMENTS.get()))
                                .add(LootItem.lootTableItem(ModItems.CERULEAN_SEAGLASS_FRAGMENTS.get()))
                                .add(LootItem.lootTableItem(ModItems.TAUPE_SEAGLASS_FRAGMENTS.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 12.0F)))
                        ));
    }
}
