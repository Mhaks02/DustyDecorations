package net.mhaks.dustydecorations.block;

import net.mhaks.dustydecorations.DustyDecorationsConstants;
import net.mhaks.dustydecorations.block.custom.*;
import net.mhaks.dustydecorations.block.custom.BarrelBlock;
import net.mhaks.dustydecorations.block.custom.PaperLanternBlock;
import net.mhaks.dustydecorations.item.ModItems;
import net.mhaks.dustydecorations.registration.RegistrationProvider;
import net.mhaks.dustydecorations.registration.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistrationProvider<Block> BLOCKS = RegistrationProvider.get(BuiltInRegistries.BLOCK, DustyDecorationsConstants.MOD_ID);

    public static final RegistryObject<Block, Block> OAK_BANISTER = registerBlock("oak_banister",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> SPRUCE_BANISTER = registerBlock("spruce_banister",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> BIRCH_BANISTER = registerBlock("birch_banister",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> JUNGLE_BANISTER = registerBlock("jungle_banister",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> ACACIA_BANISTER = registerBlock("acacia_banister",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> DARK_OAK_BANISTER = registerBlock("dark_oak_banister",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> MANGROVE_BANISTER = registerBlock("mangrove_banister",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> CHERRY_BANISTER = registerBlock("cherry_banister",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> BAMBOO_BANISTER = registerBlock("bamboo_banister",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> DRY_BAMBOO_BANISTER = registerBlock("dry_bamboo_banister",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));

    public static final RegistryObject<Block, Block> OAK_LARGE_SHELF = registerBlock("oak_large_shelf",
            () -> new LargeShelfBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> SPRUCE_LARGE_SHELF = registerBlock("spruce_large_shelf",
            () -> new LargeShelfBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> BIRCH_LARGE_SHELF = registerBlock("birch_large_shelf",
            () -> new LargeShelfBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> JUNGLE_LARGE_SHELF = registerBlock("jungle_large_shelf",
            () -> new LargeShelfBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> ACACIA_LARGE_SHELF = registerBlock("acacia_large_shelf",
            () -> new LargeShelfBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> DARK_OAK_LARGE_SHELF = registerBlock("dark_oak_large_shelf",
            () -> new LargeShelfBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> MANGROVE_LARGE_SHELF = registerBlock("mangrove_large_shelf",
            () -> new LargeShelfBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> CHERRY_LARGE_SHELF = registerBlock("cherry_large_shelf",
            () -> new LargeShelfBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> BAMBOO_LARGE_SHELF = registerBlock("bamboo_large_shelf",
            () -> new LargeShelfBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> CRIMSON_LARGE_SHELF = registerBlock("crimson_large_shelf",
            () -> new LargeShelfBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> WARPED_LARGE_SHELF = registerBlock("warped_large_shelf",
            () -> new LargeShelfBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));

    public static final RegistryObject<Block, Block> APPLE_BARREL = registerBlock("apple_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> SWEET_BERRIES_BARREL = registerBlock("sweet_berries_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> GLOW_BERRIES_BARREL = registerBlock("glow_berries_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> CARROT_BARREL = registerBlock("carrot_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> POTATO_BARREL = registerBlock("potato_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> BEETROOT_BARREL = registerBlock("beetroot_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> SEA_PICKLE_BARREL = registerBlock("sea_pickle_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> COD_BARREL = registerBlock("cod_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> SALMON_BARREL = registerBlock("salmon_barrel",
            () -> new BarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> EMPTY_BARREL = registerBlock("empty_barrel",
            () -> new EmptyBarrelBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
            ));

    public static final RegistryObject<Block, Block> SUNFLOWER_WALLPAPER = registerBlock("sunflower_wallpaper",
            () -> new WallpaperBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> REGAL_WALLPAPER = registerBlock("regal_wallpaper",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> VINE_WALLPAPER = registerBlock("vine_wallpaper",
            () -> new WallpaperBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> MONSTER_WALLPAPER = registerBlock("monster_wallpaper",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> SAILOR_WALLPAPER = registerBlock("sailor_wallpaper",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
            ));

    public static final RegistryObject<Block, Block> WHITE_WOOL_AWNING = registerBlock("white_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> LIGHT_GRAY_WOOL_AWNING = registerBlock("light_gray_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> GRAY_WOOL_AWNING = registerBlock("gray_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> BLACK_WOOL_AWNING = registerBlock("black_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> BROWN_WOOL_AWNING = registerBlock("brown_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> RED_WOOL_AWNING = registerBlock("red_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> ORANGE_WOOL_AWNING = registerBlock("orange_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> YELLOW_WOOL_AWNING = registerBlock("yellow_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> LIME_WOOL_AWNING = registerBlock("lime_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> GREEN_WOOL_AWNING = registerBlock("green_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> CYAN_WOOL_AWNING = registerBlock("cyan_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> LIGHT_BLUE_WOOL_AWNING = registerBlock("light_blue_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> BLUE_WOOL_AWNING = registerBlock("blue_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> PURPLE_WOOL_AWNING = registerBlock("purple_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> MAGENTA_WOOL_AWNING = registerBlock("magenta_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> PINK_WOOL_AWNING = registerBlock("pink_wool_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));

    //TODO lantern sound, strength, instabreak?, etc...
    //TODO LIGHT EMISSION
    public static final RegistryObject<Block, Block> PAPER_LANTERN = registerBlock("paper_lantern",
            () -> new PaperLanternBlock(BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .noCollission()
                    .lightLevel(value -> 12)
            ));
    public static final RegistryObject<Block, Block> SAKURA_PAPER_LANTERN = registerBlock("sakura_paper_lantern",
            () -> new PaperLanternBlock(BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .noCollission()
                    .lightLevel(value -> 12)
            ));
    public static final RegistryObject<Block, Block> TAIGA_PAPER_LANTERN = registerBlock("taiga_paper_lantern",
            () -> new PaperLanternBlock(BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .noCollission()
                    .lightLevel(value -> 12)
            ));
    public static final RegistryObject<Block, Block> ORCHID_PAPER_LANTERN = registerBlock("orchid_paper_lantern",
            () -> new PaperLanternBlock(BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .noCollission()
                    .lightLevel(value -> 12)
            ));
    public static final RegistryObject<Block, Block> PANDA_PAPER_LANTERN = registerBlock("panda_paper_lantern",
            () -> new PaperLanternBlock(BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .noCollission()
                    .lightLevel(value -> 12)
            ));
    public static final RegistryObject<Block, Block> VILLAGER_PAPER_LANTERN = registerBlock("villager_paper_lantern",
            () -> new PaperLanternBlock(BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .noCollission()
                    .lightLevel(value -> 12)
            ));
    public static final RegistryObject<Block, Block> CREEPER_PAPER_LANTERN = registerBlock("creeper_paper_lantern",
            () -> new PaperLanternBlock(BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .noCollission()
                    .lightLevel(value -> 12)
            ));
    public static final RegistryObject<Block, Block> CHICKEN_JOCKEY_PAPER_LANTERN = registerBlock("chicken_jockey_paper_lantern",
            () -> new PaperLanternBlock(BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .noCollission()
                    .lightLevel(value -> 12)
            ));
    public static final RegistryObject<Block, Block> PILLAGER_PAPER_LANTERN = registerBlock("pillager_paper_lantern",
            () -> new PaperLanternBlock(BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .noCollission()
                    .lightLevel(value -> 12)
            ));
    public static final RegistryObject<Block, Block> WARDEN_PAPER_LANTERN = registerBlock("warden_paper_lantern",
            () -> new PaperLanternBlock(BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .noCollission()
                    .lightLevel(value -> 12)
            ));



    public static final RegistryObject<Block, Block> CORRUGATED_METAL_BLOCK = registerBlock("corrugated_metal_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_STAIRS = registerBlock("corrugated_metal_stairs",
            () -> new StairBlock(ModBlocks.CORRUGATED_METAL_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_SLAB = registerBlock("corrugated_metal_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_FENCE = registerBlock("corrugated_metal_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            )); //TODO fence tags
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_FENCE_GATE = registerBlock("corrugated_metal_fence_gate",
            () -> new CorrugatedMetalFenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_DOOR = registerBlock("corrugated_metal_door",
            () -> new CorrugatedMetalDoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_TRAPDOOR = registerBlock("corrugated_metal_trapdoor",
            () -> new CorrugatedMetalTrapdoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_PRESSURE_PLATE = registerBlock("corrugated_metal_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.COPPER, BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_BUTTON = registerBlock("corrugated_metal_button",
            () -> new ButtonBlock(BlockSetType.COPPER, 30, BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_ROOFING = registerBlock("corrugated_metal_roofing",
            () -> new CorrugatedMetalRoofingBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));


//TODO piston behaviours, check all strengths and hardness

    private static RegistryObject<Block, Block> registerBlock(String name, Supplier<Block> block) {
        RegistryObject<Block, Block> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, Supplier<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void registerModBlocks() {
        DustyDecorationsConstants.LOGGER.info("Registering Mod Blocks for " + DustyDecorationsConstants.MOD_ID);
    }
}
