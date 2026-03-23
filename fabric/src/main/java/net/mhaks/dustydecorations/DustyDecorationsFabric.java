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

        OxidizableBlocksRegistry.registerOxidizableBlockPair(ModBlocks.COPPER_LIGHT.get(), ModBlocks.SHODDY_COPPER_LIGHT.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.COPPER_LIGHT.get(), ModBlocks.WAXED_COPPER_LIGHT.get());
        OxidizableBlocksRegistry.registerWaxableBlockPair(ModBlocks.SHODDY_COPPER_LIGHT.get(), ModBlocks.WAXED_SHODDY_COPPER_LIGHT.get());

        FabricDefaultAttributeRegistry.register(ModEntityTypes.NAUTILUS_GOLEM.get(), NautilusGolemEntity.createAttributes());
    }
}
