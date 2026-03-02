package net.mhaks.dustydecorations;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModConstants {

	public static final String MOD_ID = "dustydecorations";
	public static final String MOD_NAME = "DustyDecorations";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);
    public static ResourceLocation identifierOf(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
    public static IntegerProperty AMOUNT_3 = IntegerProperty.create("amount", 1, 3);
    public static IntegerProperty AMOUNT_4 = IntegerProperty.create("amount", 1, 4);
    public static final int MAX_AMOUNT_3 = 3;
    public static final int MAX_AMOUNT_4 = 4;
}