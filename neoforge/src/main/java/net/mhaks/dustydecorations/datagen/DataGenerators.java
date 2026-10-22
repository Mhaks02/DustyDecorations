package net.mhaks.dustydecorations.datagen;

import net.mhaks.dustydecorations.ModConstants;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = ModConstants.MOD_ID)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        ModConstants.LOGGER.info("GatherClientData event is indeed eventing");
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new ModModelProvider(packOutput));
        generator.addProvider(true, new ModRecipeProvider.Runner(packOutput, lookupProvider));

        BlockTagsProvider blockTagsProvider = new ModBlockTagProvider(packOutput, lookupProvider);
        generator.addProvider(true, blockTagsProvider);
        generator.addProvider(true, new ModItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter()));

        generator.addProvider(true, new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK),
                        new LootTableProvider.SubProviderEntry(ModArchaeologyLoot::new, LootContextParamSets.ARCHAEOLOGY)), lookupProvider));

        generator.addProvider(true, new ModDataMapProvider(packOutput, lookupProvider));

        generator.addProvider(true, new ModDatapackProvider(packOutput, lookupProvider));

    }

//    @SubscribeEvent
//    public static void gatherServerData(GatherDataEvent.Server event) {
//        ModConstants.LOGGER.info("GatherServerData event is indeed eventing");
//        DataGenerator generator = event.getGenerator();
//        PackOutput packOutput = generator.getPackOutput();
//        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
//
//        generator.addProvider(true, new ModModelProvider(packOutput));
//        generator.addProvider(true, new ModRecipeProvider.Runner(packOutput, lookupProvider));
//
//        BlockTagsProvider blockTagsProvider = new ModBlockTagProvider(packOutput, lookupProvider);
//        generator.addProvider(true, blockTagsProvider);
//        generator.addProvider(true, new ModItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter()));
//
//        generator.addProvider(true, new LootTableProvider(packOutput, Collections.emptySet(),
//                List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK),
//                        new LootTableProvider.SubProviderEntry(ModArchaeologyLoot::new, LootContextParamSets.ARCHAEOLOGY)), lookupProvider));
//
//        generator.addProvider(true, new ModDataMapProvider(packOutput, lookupProvider));
//
//        generator.addProvider(true, new ModDatapackProvider(packOutput, lookupProvider));
//
//    }

}
