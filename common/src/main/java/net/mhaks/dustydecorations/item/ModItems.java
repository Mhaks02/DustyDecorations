package net.mhaks.dustydecorations.item;

import net.mhaks.dustydecorations.DustyDecorationsConstants;
import net.mhaks.dustydecorations.registration.RegistrationProvider;
import net.mhaks.dustydecorations.registration.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(BuiltInRegistries.ITEM, DustyDecorationsConstants.MOD_ID);

//    public static final RegistryObject<Item, Item> TEST_ITEM_LOL = ITEMS.register("test_item_lol",
//            () -> new Item(new Item.Properties()
//            ));

//    public static final RegistryObject<Item, Item> OTHER_TEST_ITEM = ITEMS.register("other_test_item",
//            () -> new Item(new Item.Properties()
//            ));




    public static void registerModItems() {
        DustyDecorationsConstants.LOGGER.info("Registering Mod Items for " + DustyDecorationsConstants.MOD_ID);
    }

}
