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
import java.util.function.Supplier;

public class ModItems {
    public static final RegistrationProvider<Item> ITEMS = RegistrationProvider.get(BuiltInRegistries.ITEM, ModConstants.MOD_ID);


    public static final RegistryObject<Item, Item> DECORATIVE_BOWL = registerItem("decorative_bowl",
            () -> new BlockItem(ModBlocks.DECORATIVE_BOWL.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf("decorative_bowl")))
            ));

    public static final RegistryObject<Item, Item> CREAM_SEAGLASS_FRAGMENTS = registerItem("cream_seaglass_fragments",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf("cream_seaglass_fragments")))
            ));
    public static final RegistryObject<Item, Item> HAZEL_SEAGLASS_FRAGMENTS = registerItem("hazel_seaglass_fragments",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf("hazel_seaglass_fragments")))
            ));
    public static final RegistryObject<Item, Item> LIQUORICE_SEAGLASS_FRAGMENTS = registerItem("liquorice_seaglass_fragments",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf("liquorice_seaglass_fragments")))
            ));
    public static final RegistryObject<Item, Item> MOCHA_SEAGLASS_FRAGMENTS = registerItem("mocha_seaglass_fragments",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf("mocha_seaglass_fragments")))
            ));
    public static final RegistryObject<Item, Item> SCARLET_SEAGLASS_FRAGMENTS = registerItem("scarlet_seaglass_fragments",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf("scarlet_seaglass_fragments")))
            ));
    public static final RegistryObject<Item, Item> HONEY_SEAGLASS_FRAGMENTS = registerItem("honey_seaglass_fragments",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf("honey_seaglass_fragments")))
            ));
    public static final RegistryObject<Item, Item> TEAL_SEAGLASS_FRAGMENTS = registerItem("teal_seaglass_fragments",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf("teal_seaglass_fragments")))
            ));
    public static final RegistryObject<Item, Item> MINT_SEAGLASS_FRAGMENTS = registerItem("mint_seaglass_fragments",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf("mint_seaglass_fragments")))
            ));
    public static final RegistryObject<Item, Item> CERULEAN_SEAGLASS_FRAGMENTS = registerItem("cerulean_seaglass_fragments",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf("cerulean_seaglass_fragments")))
            ));
    public static final RegistryObject<Item, Item> TAUPE_SEAGLASS_FRAGMENTS = registerItem("taupe_seaglass_fragments",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf("taupe_seaglass_fragments")))
            ));

    public static final RegistryObject<Item, Item> CORRUGATED_METAL_SHEET = registerItem("corrugated_metal_sheet",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf("corrugated_metal_sheet")))
            ));

    public static final RegistryObject<Item, Item> BURLAP = registerItem("burlap",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf("burlap")))
            ));

    public static final RegistryObject<Item, Item> RAW_BRATWURST = registerItem("raw_bratwurst_sausage",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf("raw_bratwurst_sausage")))
                    .food(ModFoods.RAW_BRATWURST)
            ));
    public static final RegistryObject<Item, Item> SMOKED_BRATWURST = registerItem("smoked_bratwurst_sausage",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf("smoked_bratwurst_sausage")))
                    .food(ModFoods.SMOKED_BRATWURST)
            ));
    public static final RegistryObject<Item, Item> BRATWURST_HOT_DOG = registerItem("bratwurst_hot_dog",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf("bratwurst_hot_dog")))
                    .food(ModFoods.BRATWURST_HOT_DOG)
            ));

    public static final RegistryObject<Item, Item> NAUTILUS_GOLEM_SPAWN_EGG = registerItem("nautilus_golem_spawn_egg",
            () -> new SpawnEggItem(ModEntityTypes.NAUTILUS_GOLEM.get(), -2504281, -14266757,
                    new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf("nautilus_golem_spawn_egg")))
            ));

    //TODO: to be removed after 1.21.9
    public static final RegistryObject<Item, Item> COPPER_NUGGET = registerItem("copper_nugget",
            () -> new Item(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf("copper_nugget")))) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    tooltipComponents.add(Component.translatable("tooltip.dustydecorations.copper_nugget").withStyle(style -> style.withColor(ChatFormatting.GRAY)));
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });


    private static RegistryObject<Item, Item> registerItem(String name, Supplier<Item> item) {
        return ITEMS.register(name, item);
    }

    public static void registerModItems() {
        ModConstants.LOGGER.info("Registering Mod Items for " + ModConstants.MOD_ID);
    }

}
