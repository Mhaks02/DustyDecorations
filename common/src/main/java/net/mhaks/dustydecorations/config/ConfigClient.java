package net.mhaks.dustydecorations.config;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.platform.Services;
import net.neoforged.neoforge.common.ModConfigSpec;

public class ConfigClient {
    public static final int CURRENT_SCHEMA_VERSION = 1;

    static {
        if (!Services.PLATFORM.getPhysicalSide().isClient()) {
            String message = "Tried to load a client config on a dedicated server!";
            ModConstants.LOGGER.error(message);
            if (Services.PLATFORM.isDevelopmentEnvironment()) {
                throw new AssertionError(message);
            }
        }
    }

    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    public static final ModConfigSpec.IntValue CONFIG_SCHEMA_VERSION =
            BUILDER.comment("Config schema version. Used to detect when the migration warning screen should be shown.\n"
                            + "Do not edit manually!")
                    .defineInRange("configSchemaVersion", 0, 0, Integer.MAX_VALUE);

    public static final ModConfigSpec SPEC = BUILDER.build();


}
