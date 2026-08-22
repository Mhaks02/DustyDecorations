package net.mhaks.dustydecorations.datagen;

import net.mhaks.dustydecorations.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DataMapProvider;
import net.neoforged.neoforge.registries.datamaps.builtin.NeoForgeDataMaps;
import net.neoforged.neoforge.registries.datamaps.builtin.Oxidizable;
import net.neoforged.neoforge.registries.datamaps.builtin.Waxable;

import java.util.concurrent.CompletableFuture;

public class ModDataMapProvider extends DataMapProvider {
    protected ModDataMapProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(packOutput, lookupProvider);
    }

    @Override
    protected void gather(HolderLookup.Provider provider) {
//        this.builder(NeoForgeDataMaps.FURNACE_FUELS)
//                .add(ModItems.<MY_ITEM>.getId(), new FurnaceFuel(1200), false);

        this.builder(NeoForgeDataMaps.OXIDIZABLES)
                .add(ModBlocks.CORRUGATED_METAL_BLOCK.getId(), new Oxidizable(ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_GRATE.getId(), new Oxidizable(ModBlocks.RUSTED_CORRUGATED_METAL_GRATE.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_STAIRS.getId(), new Oxidizable(ModBlocks.RUSTED_CORRUGATED_METAL_STAIRS.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_SLAB.getId(), new Oxidizable(ModBlocks.RUSTED_CORRUGATED_METAL_SLAB.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_FENCE.getId(), new Oxidizable(ModBlocks.RUSTED_CORRUGATED_METAL_FENCE.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_FENCE_GATE.getId(), new Oxidizable(ModBlocks.RUSTED_CORRUGATED_METAL_FENCE_GATE.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_DOOR.getId(), new Oxidizable(ModBlocks.RUSTED_CORRUGATED_METAL_DOOR.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_TRAPDOOR.getId(), new Oxidizable(ModBlocks.RUSTED_CORRUGATED_METAL_TRAPDOOR.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_PRESSURE_PLATE.getId(), new Oxidizable(ModBlocks.RUSTED_CORRUGATED_METAL_PRESSURE_PLATE.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_BUTTON.getId(), new Oxidizable(ModBlocks.RUSTED_CORRUGATED_METAL_BUTTON.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_ROOFING.getId(), new Oxidizable(ModBlocks.RUSTED_CORRUGATED_METAL_ROOFING.get()), false)

                .add(ModBlocks.COPPER_LIGHT.getId(), new Oxidizable(ModBlocks.SHODDY_COPPER_LIGHT.get()), false)
        ;
        this.builder(NeoForgeDataMaps.WAXABLES)
                .add(ModBlocks.CORRUGATED_METAL_BLOCK.getId(), new Waxable(ModBlocks.WAXED_CORRUGATED_METAL_BLOCK.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_GRATE.getId(), new Waxable(ModBlocks.WAXED_CORRUGATED_METAL_GRATE.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_STAIRS.getId(), new Waxable(ModBlocks.WAXED_CORRUGATED_METAL_STAIRS.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_SLAB.getId(), new Waxable(ModBlocks.WAXED_CORRUGATED_METAL_SLAB.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_FENCE.getId(), new Waxable(ModBlocks.WAXED_CORRUGATED_METAL_FENCE.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_FENCE_GATE.getId(), new Waxable(ModBlocks.WAXED_CORRUGATED_METAL_FENCE_GATE.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_DOOR.getId(), new Waxable(ModBlocks.WAXED_CORRUGATED_METAL_DOOR.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_TRAPDOOR.getId(), new Waxable(ModBlocks.WAXED_CORRUGATED_METAL_TRAPDOOR.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_PRESSURE_PLATE.getId(), new Waxable(ModBlocks.WAXED_CORRUGATED_METAL_PRESSURE_PLATE.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_BUTTON.getId(), new Waxable(ModBlocks.WAXED_CORRUGATED_METAL_BUTTON.get()), false)
                .add(ModBlocks.CORRUGATED_METAL_ROOFING.getId(), new Waxable(ModBlocks.WAXED_CORRUGATED_METAL_ROOFING.get()), false)

                .add(ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.getId(), new Waxable(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_BLOCK.get()), false)
                .add(ModBlocks.RUSTED_CORRUGATED_METAL_GRATE.getId(), new Waxable(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_GRATE.get()), false)
                .add(ModBlocks.RUSTED_CORRUGATED_METAL_STAIRS.getId(), new Waxable(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_STAIRS.get()), false)
                .add(ModBlocks.RUSTED_CORRUGATED_METAL_SLAB.getId(), new Waxable(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_SLAB.get()), false)
                .add(ModBlocks.RUSTED_CORRUGATED_METAL_FENCE.getId(), new Waxable(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_FENCE.get()), false)
                .add(ModBlocks.RUSTED_CORRUGATED_METAL_FENCE_GATE.getId(), new Waxable(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_FENCE_GATE.get()), false)
                .add(ModBlocks.RUSTED_CORRUGATED_METAL_DOOR.getId(), new Waxable(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_DOOR.get()), false)
                .add(ModBlocks.RUSTED_CORRUGATED_METAL_TRAPDOOR.getId(), new Waxable(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_TRAPDOOR.get()), false)
                .add(ModBlocks.RUSTED_CORRUGATED_METAL_PRESSURE_PLATE.getId(), new Waxable(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_PRESSURE_PLATE.get()), false)
                .add(ModBlocks.RUSTED_CORRUGATED_METAL_BUTTON.getId(), new Waxable(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_BUTTON.get()), false)
                .add(ModBlocks.RUSTED_CORRUGATED_METAL_ROOFING.getId(), new Waxable(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_ROOFING.get()), false)

                .add(ModBlocks.COPPER_LIGHT.getId(), new Waxable(ModBlocks.WAXED_COPPER_LIGHT.get()), false)
                .add(ModBlocks.SHODDY_COPPER_LIGHT.getId(), new Waxable(ModBlocks.WAXED_SHODDY_COPPER_LIGHT.get()), false)
                ;

    }

}
