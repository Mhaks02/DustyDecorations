package net.mhaks.dustydecorations;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.entity.ModEntityTypes;
import net.mhaks.dustydecorations.entity.custom.NautilusGolemEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;

public class DustyDecorationsFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        // This method is invoked by the Fabric mod loader when it is ready
        // to load your mod. You can access Fabric and Common code in this
        // project.

        // Use Fabric to bootstrap the Common mod.
        ModConstants.LOGGER.info("Hello Fabric world!");
        DustyDecorations.init();

        ModWorldGeneration.generateWorldGen();


        BlockEntityType.BRUSHABLE_BLOCK.addSupportedBlock(ModBlocks.SEAGLASS_SAND.get());
        BlockEntityType.BRUSHABLE_BLOCK.addSupportedBlock(ModBlocks.SEAGLASS_GRAVEL.get());

        FabricDefaultAttributeRegistry.register(ModEntityTypes.NAUTILUS_GOLEM.get(), NautilusGolemEntity.createAttributes());


        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CORRUGATED_METAL_BLOCK.get(), ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.get());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CORRUGATED_METAL_GRATE.get(), ModBlocks.RUSTED_CORRUGATED_METAL_GRATE.get());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CORRUGATED_METAL_STAIRS.get(), ModBlocks.RUSTED_CORRUGATED_METAL_STAIRS.get());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CORRUGATED_METAL_SLAB.get(), ModBlocks.RUSTED_CORRUGATED_METAL_SLAB.get());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CORRUGATED_METAL_FENCE.get(), ModBlocks.RUSTED_CORRUGATED_METAL_FENCE.get());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CORRUGATED_METAL_FENCE_GATE.get(), ModBlocks.RUSTED_CORRUGATED_METAL_FENCE_GATE.get());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CORRUGATED_METAL_DOOR.get(), ModBlocks.RUSTED_CORRUGATED_METAL_DOOR.get());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CORRUGATED_METAL_TRAPDOOR.get(), ModBlocks.RUSTED_CORRUGATED_METAL_TRAPDOOR.get());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CORRUGATED_METAL_PRESSURE_PLATE.get(), ModBlocks.RUSTED_CORRUGATED_METAL_PRESSURE_PLATE.get());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CORRUGATED_METAL_BUTTON.get(), ModBlocks.RUSTED_CORRUGATED_METAL_BUTTON.get());
        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.CORRUGATED_METAL_ROOFING.get(), ModBlocks.RUSTED_CORRUGATED_METAL_ROOFING.get());

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CORRUGATED_METAL_BLOCK.get(), ModBlocks.WAXED_CORRUGATED_METAL_BLOCK.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CORRUGATED_METAL_GRATE.get(), ModBlocks.WAXED_CORRUGATED_METAL_GRATE.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CORRUGATED_METAL_STAIRS.get(), ModBlocks.WAXED_CORRUGATED_METAL_STAIRS.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CORRUGATED_METAL_SLAB.get(), ModBlocks.WAXED_CORRUGATED_METAL_SLAB.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CORRUGATED_METAL_FENCE.get(), ModBlocks.WAXED_CORRUGATED_METAL_FENCE.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CORRUGATED_METAL_FENCE_GATE.get(), ModBlocks.WAXED_CORRUGATED_METAL_FENCE_GATE.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CORRUGATED_METAL_DOOR.get(), ModBlocks.WAXED_CORRUGATED_METAL_DOOR.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CORRUGATED_METAL_TRAPDOOR.get(), ModBlocks.WAXED_CORRUGATED_METAL_TRAPDOOR.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CORRUGATED_METAL_PRESSURE_PLATE.get(), ModBlocks.WAXED_CORRUGATED_METAL_PRESSURE_PLATE.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CORRUGATED_METAL_BUTTON.get(), ModBlocks.WAXED_CORRUGATED_METAL_BUTTON.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.CORRUGATED_METAL_ROOFING.get(), ModBlocks.WAXED_CORRUGATED_METAL_ROOFING.get());

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.get(), ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_BLOCK.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUSTED_CORRUGATED_METAL_GRATE.get(), ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_GRATE.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUSTED_CORRUGATED_METAL_STAIRS.get(), ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_STAIRS.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUSTED_CORRUGATED_METAL_SLAB.get(), ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_SLAB.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUSTED_CORRUGATED_METAL_FENCE.get(), ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_FENCE.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUSTED_CORRUGATED_METAL_FENCE_GATE.get(), ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_FENCE_GATE.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUSTED_CORRUGATED_METAL_DOOR.get(), ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_DOOR.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUSTED_CORRUGATED_METAL_TRAPDOOR.get(), ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_TRAPDOOR.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUSTED_CORRUGATED_METAL_PRESSURE_PLATE.get(), ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_PRESSURE_PLATE.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUSTED_CORRUGATED_METAL_BUTTON.get(), ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_BUTTON.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.RUSTED_CORRUGATED_METAL_ROOFING.get(), ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_ROOFING.get());

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_LIGHT.get(), ModBlocks.SHODDY_COPPER_LIGHT.get());

        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_LIGHT.get(), ModBlocks.WAXED_COPPER_LIGHT.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.SHODDY_COPPER_LIGHT.get(), ModBlocks.WAXED_SHODDY_COPPER_LIGHT.get());

    }
}
