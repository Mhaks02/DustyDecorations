package net.mhaks.dustydecorations.config.alert;

import net.mhaks.dustydecorations.config.ConfigClient;
import net.mhaks.dustydecorations.platform.Services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ConfigMigrationManager {
    private static boolean oldConfigExisted = true;
    private static boolean configExisted = true;
    private static boolean promptShownThisSession = false;

    public static boolean needsMigrationPrompt() {
        if (oldConfigExisted) return true;
        if (!configExisted) return false;
        return ConfigClient.CONFIG_SCHEMA_VERSION.get() < ConfigClient.CURRENT_SCHEMA_VERSION;
    }

    public static void markUnderstood() {
        ConfigClient.CONFIG_SCHEMA_VERSION.set(ConfigClient.CURRENT_SCHEMA_VERSION);
        ConfigClient.SPEC.save();
        promptShownThisSession = true;
    }

    public static boolean wasPromptShown() {
        return promptShownThisSession;
    }

    public static void setOldConfigExisted(boolean value) {
        oldConfigExisted = value;
    }
    public static void setConfigExisted(boolean value) {
        configExisted = value;
    }

    public static void deleteOldConfig() {
        Path oldConfig = Services.PLATFORM.getConfigDir().toAbsolutePath().resolve("Dusty Decorations Config.toml");
        if (Files.exists(oldConfig)) {
            try {
                Files.delete(oldConfig);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
