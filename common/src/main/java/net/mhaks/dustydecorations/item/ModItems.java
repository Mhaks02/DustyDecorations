package net.mhaks.dustydecorations.item;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.registration.RegistrationProvider;
import net.mhaks.dustydecorations.registration.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class ModItems {
    public static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(BuiltInRegistries.ITEM, ModConstants.MOD_ID);

//    public static final RegistryObject<Item, Item> TEST_ITEM_LOL = ITEMS.register("test_item_lol",
//            () -> new Item(new Item.Properties()
//            ));

//    public static final RegistryObject<Item, Item> OTHER_TEST_ITEM = ITEMS.register("other_test_item",
//            () -> new Item(new Item.Properties()
//            ));

    public static final RegistryObject<Item, Item> DECORATIVE_BOWL = ITEMS.register("decorative_bowl",
            () -> new BlockItem(ModBlocks.DECORATIVE_BOWL.get(), new Item.Properties()));


    private static RegistryObject<Item, Item> registerItem(String name, Supplier<Item> item) {
        return ITEMS.register(name, item);
    }

    public static void registerModItems() {
        ModConstants.LOGGER.info("Registering Mod Items for " + ModConstants.MOD_ID);
    }

}
