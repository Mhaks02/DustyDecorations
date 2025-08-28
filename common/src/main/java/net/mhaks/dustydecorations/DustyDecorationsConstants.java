package net.mhaks.dustydecorations;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DustyDecorationsConstants {

	public static final String MOD_ID = "dustydecorations";
	public static final String MOD_NAME = "DustyDecorations";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);
    public static ResourceLocation identifierOf(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}