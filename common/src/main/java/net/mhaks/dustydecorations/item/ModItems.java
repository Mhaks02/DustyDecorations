package net.mhaks.dustydecorations.item;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.entity.ModEntityTypes;
import net.mhaks.dustydecorations.registration.RegistrationProvider;
import net.mhaks.dustydecorations.registration.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;

import java.util.function.Supplier;

public class ModItems {
    public static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(BuiltInRegistries.ITEM, ModConstants.MOD_ID);

//    public static final RegistryObject<Item, Item> TEST_ITEM_LOL = ITEMS.register("test_item_lol",
//            () -> new Item(new Item.Properties()
//            ));

//    public static final RegistryObject<Item, Item> OTHER_TEST_ITEM = ITEMS.register("other_test_item",
//            () -> new Item(new Item.Properties()
//            ));

    public static final RegistryObject<Item, Item> DECORATIVE_BOWL = registerItem("decorative_bowl",
            () -> new BlockItem(ModBlocks.DECORATIVE_BOWL.get(), new Item.Properties()));

    public static final RegistryObject<Item, Item> CREAM_SEAGLASS_FRAGMENTS = registerItem("cream_seaglass_fragments",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item, Item> HAZEL_SEAGLASS_FRAGMENTS = registerItem("hazel_seaglass_fragments",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item, Item> LIQUORICE_SEAGLASS_FRAGMENTS = registerItem("liquorice_seaglass_fragments",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item, Item> MOCHA_SEAGLASS_FRAGMENTS = registerItem("mocha_seaglass_fragments",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item, Item> SCARLET_SEAGLASS_FRAGMENTS = registerItem("scarlet_seaglass_fragments",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item, Item> HONEY_SEAGLASS_FRAGMENTS = registerItem("honey_seaglass_fragments",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item, Item> TEAL_SEAGLASS_FRAGMENTS = registerItem("teal_seaglass_fragments",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item, Item> MINT_SEAGLASS_FRAGMENTS = registerItem("mint_seaglass_fragments",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item, Item> CERULEAN_SEAGLASS_FRAGMENTS = registerItem("cerulean_seaglass_fragments",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item, Item> TAUPE_SEAGLASS_FRAGMENTS = registerItem("taupe_seaglass_fragments",
            () -> new Item(new Item.Properties()
            ));

    public static final RegistryObject<Item, Item> CORRUGATED_METAL_INGOT = registerItem("corrugated_metal_ingot",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item, Item> CORRUGATED_METAL_NUGGET = registerItem("corrugated_metal_nugget",
            () -> new Item(new Item.Properties()
            ));

    public static final RegistryObject<Item, Item> BURLAP = registerItem("burlap",
            () -> new Item(new Item.Properties()
            ));

    public static final RegistryObject<Item, Item> RAW_BRATWURST = registerItem("raw_bratwurst_sausage",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item, Item> SMOKED_BRATWURST = registerItem("smoked_bratwurst_sausage",
            () -> new Item(new Item.Properties()
            ));
    public static final RegistryObject<Item, Item> BRATWURST_HOT_DOG = registerItem("bratwurst_hot_dog",
            () -> new Item(new Item.Properties()
            ));

    public static final RegistryObject<Item, Item> NAUTILUS_GOLEM_SPAWN_EGG = registerItem("nautilus_golem_spawn_egg",
            () -> new SpawnEggItem(ModEntityTypes.NAUTILUS_GOLEM.get(), -2504281, -14266757, new Item.Properties()
            ));


    private static RegistryObject<Item, Item> registerItem(String name, Supplier<Item> item) {
        return ITEMS.register(name, item);
    }

    public static void registerModItems() {
        ModConstants.LOGGER.info("Registering Mod Items for " + ModConstants.MOD_ID);
    }

}
