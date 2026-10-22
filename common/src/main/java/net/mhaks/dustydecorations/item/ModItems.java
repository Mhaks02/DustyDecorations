package net.mhaks.dustydecorations.item;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.entity.ModEntityTypes;
import net.mhaks.dustydecorations.registration.RegistrationProvider;
import net.mhaks.dustydecorations.registration.RegistryObject;
import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.*;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class ModItems {
    public static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(BuiltInRegistries.ITEM, ModConstants.MOD_ID);


    public static final RegistryObject<Item, Item> DECORATIVE_BOWL = registerItem("decorative_bowl",
            properties -> new BlockItem(ModBlocks.DECORATIVE_BOWL.get(), properties),
            new Item.Properties()
    );

    public static final RegistryObject<Item, Item> CREAM_SEAGLASS_FRAGMENTS = registerItem("cream_seaglass_fragments");
    public static final RegistryObject<Item, Item> HAZEL_SEAGLASS_FRAGMENTS = registerItem("hazel_seaglass_fragments");
    public static final RegistryObject<Item, Item> LIQUORICE_SEAGLASS_FRAGMENTS = registerItem("liquorice_seaglass_fragments");
    public static final RegistryObject<Item, Item> MOCHA_SEAGLASS_FRAGMENTS = registerItem("mocha_seaglass_fragments");
    public static final RegistryObject<Item, Item> SCARLET_SEAGLASS_FRAGMENTS = registerItem("scarlet_seaglass_fragments");
    public static final RegistryObject<Item, Item> HONEY_SEAGLASS_FRAGMENTS = registerItem("honey_seaglass_fragments");
    public static final RegistryObject<Item, Item> TEAL_SEAGLASS_FRAGMENTS = registerItem("teal_seaglass_fragments");
    public static final RegistryObject<Item, Item> MINT_SEAGLASS_FRAGMENTS = registerItem("mint_seaglass_fragments");
    public static final RegistryObject<Item, Item> CERULEAN_SEAGLASS_FRAGMENTS = registerItem("cerulean_seaglass_fragments");
    public static final RegistryObject<Item, Item> TAUPE_SEAGLASS_FRAGMENTS = registerItem("taupe_seaglass_fragments");

    public static final RegistryObject<Item, Item> CORRUGATED_METAL_SHEET = registerItem("corrugated_metal_sheet");

    public static final RegistryObject<Item, Item> BURLAP = registerItem("burlap");

    public static final RegistryObject<Item, Item> RAW_BRATWURST = registerItem("raw_bratwurst_sausage",
            new Item.Properties()
                    .food(ModFoods.RAW_BRATWURST)
    );
    public static final RegistryObject<Item, Item> SMOKED_BRATWURST = registerItem("smoked_bratwurst_sausage",
            new Item.Properties()
                    .food(ModFoods.SMOKED_BRATWURST)
    );
    public static final RegistryObject<Item, Item> BRATWURST_HOT_DOG = registerItem("bratwurst_hot_dog",
            new Item.Properties()
                    .food(ModFoods.BRATWURST_HOT_DOG)
    );

    public static final RegistryObject<Item, Item> NAUTILUS_GOLEM_SPAWN_EGG = registerItem("nautilus_golem_spawn_egg",
            SpawnEggItem::new,
            new Item.Properties()
                    .spawnEgg(ModEntityTypes.NAUTILUS_GOLEM.get())
    );


    private static RegistryObject<Item, Item> registerItem(String name) {
        Function<Item.Properties, Item> factory = Item::new;
        Item.Properties properties = new Item.Properties();
        return ITEMS.register(name, () -> factory.apply(properties.setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf(name)))));
    }
    private static RegistryObject<Item, Item> registerItem(String name, Item.Properties properties) {
        Function<Item.Properties, Item> factory = Item::new;
        return ITEMS.register(name, () -> factory.apply(properties.setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf(name)))));
    }
    private static RegistryObject<Item, Item> registerItem(String name, Function<Item.Properties, Item> factory, Item.Properties properties) {
        return ITEMS.register(name, () -> factory.apply(properties.setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf(name)))));
    }

    public static void registerModItems() {
        ModConstants.LOGGER.info("Registering Mod Items for " + ModConstants.MOD_ID);
    }

}
