package net.mhaks.dustydecorations;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.stats.StatFormatter;
import net.minecraft.stats.Stats;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModConstants {

	public static final String MOD_ID = "dustydecorations";
	public static final String MOD_NAME = "DustyDecorations";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_NAME);
    public static ResourceLocation identifierOf(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public static IntegerProperty TEXTURE_2 = IntegerProperty.create("texture", 0, 1);
    public static IntegerProperty TEXTURE_3 = IntegerProperty.create("texture", 0, 2);
    public static IntegerProperty TEXTURE_4 = IntegerProperty.create("texture", 0, 3);
    public static IntegerProperty TEXTURE_5 = IntegerProperty.create("texture", 0, 4);
    public static IntegerProperty TEXTURE_6 = IntegerProperty.create("texture", 0, 5);
    public static IntegerProperty TEXTURE_7 = IntegerProperty.create("texture", 0, 6);
    public static IntegerProperty TEXTURE_9 = IntegerProperty.create("texture", 0, 8);

    public static IntegerProperty MODEL_6 = IntegerProperty.create("amount", 0, 5);

    public static IntegerProperty AMOUNT_3 = IntegerProperty.create("amount", 1, 3);
    public static IntegerProperty AMOUNT_4 = IntegerProperty.create("amount", 1, 4);
    public static final int MAX_AMOUNT_3 = 3;
    public static final int MAX_AMOUNT_4 = 4;
    public static EnumProperty<AttachedCamera> ATTACHED_CAMERA = EnumProperty.create("attached_camera", AttachedCamera.class);

    public enum AttachedCamera implements StringRepresentable {
        NONE("none"),
        CAMERA("camera"),
        MOVIE_CAMERA("movie_camera");

        private final String name;

        private AttachedCamera(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.getSerializedName();
        }

        @Override
        public String getSerializedName() {
            return this.name;
        }
    }

//    public static final ResourceLocation OPEN_CASH_REGISTER = makeCustomStat("open_cash_register", StatFormatter.DEFAULT);
//
//    private static ResourceLocation makeCustomStat(String key, StatFormatter formatter) {
//        ResourceLocation resourcelocation = identifierOf(key);
//        Registry.register(BuiltInRegistries.CUSTOM_STAT, key, resourcelocation);
//        Stats.CUSTOM.get(resourcelocation, formatter);
//        return resourcelocation;
//    }


}