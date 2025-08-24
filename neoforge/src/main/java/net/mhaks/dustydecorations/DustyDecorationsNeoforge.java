package net.mhaks.dustydecorations;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class DustyDecorationsNeoforge {

    public DustyDecorationsNeoforge(IEventBus eventBus) {

        // This method is invoked by the NeoForge mod loader when it is ready
        // to load your mod. You can access NeoForge and Common code in this
        // project.

        // Use NeoForge to bootstrap the Common mod.
        Constants.LOGGER.info("Hello NeoForge world!");
        DustyDecorations.init();

    }
}