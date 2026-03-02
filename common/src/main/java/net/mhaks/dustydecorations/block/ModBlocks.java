package net.mhaks.dustydecorations.block;

import net.mhaks.dustydecorations.ModConstants;
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
    public static final RegistrationProvider<Block> BLOCKS = RegistrationProvider.get(BuiltInRegistries.BLOCK, ModConstants.MOD_ID);

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
    public static final RegistryObject<Block, Block> CRIMSON_BANISTER = registerBlock("crimson_banister",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(1.0f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> WARPED_BANISTER = registerBlock("warped_banister",
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

    //TODO: VoxelShapes can be simplified with a Shapes.join with BooleanOP.ONLY_FIRST I think
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

    public static final RegistryObject<Block, Block> SUNFLOWER_WALLPAPER_BLOCK = registerBlock("sunflower_wallpaper",
            () -> new WallpaperBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> REGAL_WALLPAPER_BLOCK = registerBlock("regal_wallpaper",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> VINE_WALLPAPER_BLOCK = registerBlock("vine_wallpaper",
            () -> new WallpaperBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> MONSTER_WALLPAPER_BLOCK = registerBlock("monster_wallpaper",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> SAILOR_WALLPAPER_BLOCK = registerBlock("sailor_wallpaper",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> COPPER_WALLPAPER_BLOCK = registerBlock("copper_wallpaper",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> STELLAR_WALLPAPER_BLOCK = registerBlock("stellar_wallpaper",
            () -> new WallpaperBlock(BlockBehaviour.Properties.of()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> PUMPKIN_WALLPAPER_BLOCK = registerBlock("pumpkin_wallpaper",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> SOUL_WALLPAPER_BLOCK = registerBlock("soul_wallpaper",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> FOREST_FESTIVE_WALLPAPER_BLOCK = registerBlock("forest_festive_wallpaper",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> STRIPED_FESTIVE_WALLPAPER_BLOCK = registerBlock("striped_festive_wallpaper",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> SNOWMEN_WALLPAPER_BLOCK = registerBlock("snowmen_wallpaper",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> SNOWFLAKE_WALLPAPER_BLOCK = registerBlock("snowflake_wallpaper",
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

    //TODO: lantern sound, strength, instabreak?, etc...
    // TODO: CHANGE ANIMATION TO NEW ONE
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
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_GRATE = registerBlock("corrugated_metal_grate",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()
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
            )); //TODO: fence tags
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_FENCE_GATE = registerBlock("corrugated_metal_fence_gate",
            () -> new RustedCorrugatedMetalFenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_DOOR = registerBlock("corrugated_metal_door",
            () -> new RustedCorrugatedMetalDoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_TRAPDOOR = registerBlock("corrugated_metal_trapdoor",
            () -> new RustedCorrugatedMetalTrapdoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.of()
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

    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_BLOCK = registerBlock("rusted_corrugated_metal_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_GRATE = registerBlock("rusted_corrugated_metal_grate",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_STAIRS = registerBlock("rusted_corrugated_metal_stairs",
            () -> new StairBlock(ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_SLAB = registerBlock("rusted_corrugated_metal_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_FENCE = registerBlock("rusted_corrugated_metal_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            )); //TODO: fence tags
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_FENCE_GATE = registerBlock("rusted_corrugated_metal_fence_gate",
            () -> new RustedCorrugatedMetalFenceGateBlock(WoodType.ACACIA, BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_DOOR = registerBlock("rusted_corrugated_metal_door",
            () -> new RustedCorrugatedMetalDoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_TRAPDOOR = registerBlock("rusted_corrugated_metal_trapdoor",
            () -> new RustedCorrugatedMetalTrapdoorBlock(BlockSetType.COPPER, BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_PRESSURE_PLATE = registerBlock("rusted_corrugated_metal_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.COPPER, BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_BUTTON = registerBlock("rusted_corrugated_metal_button",
            () -> new ButtonBlock(BlockSetType.COPPER, 30, BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_ROOFING = registerBlock("rusted_corrugated_metal_roofing",
            () -> new CorrugatedMetalRoofingBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
            ));

    //TODO: propagateSkyLightDown or something
    public static final RegistryObject<Block, Block> CREAM_SEAGLASS = registerBlock("cream_seaglass",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> HAZEL_SEAGLASS = registerBlock("hazel_seaglass",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> LIQUORICE_SEAGLASS = registerBlock("liquorice_seaglass",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> MOCHA_SEAGLASS = registerBlock("mocha_seaglass",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> SCARLET_SEAGLASS = registerBlock("scarlet_seaglass",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> HONEY_SEAGLASS = registerBlock("honey_seaglass",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> MINT_SEAGLASS = registerBlock("mint_seaglass",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> TEAL_SEAGLASS = registerBlock("teal_seaglass",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> CERULEAN_SEAGLASS = registerBlock("cerulean_seaglass",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> TAUPE_SEAGLASS = registerBlock("taupe_seaglass",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));

    public static final RegistryObject<Block, Block> CREAM_SEAGLASS_PANE = registerBlock("cream_seaglass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
            ));
    public static final RegistryObject<Block, Block> HAZEL_SEAGLASS_PANE = registerBlock("hazel_seaglass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
            ));
    public static final RegistryObject<Block, Block> LIQUORICE_SEAGLASS_PANE = registerBlock("liquorice_seaglass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
            ));
    public static final RegistryObject<Block, Block> MOCHA_SEAGLASS_PANE = registerBlock("mocha_seaglass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
            ));
    public static final RegistryObject<Block, Block> SCARLET_SEAGLASS_PANE = registerBlock("scarlet_seaglass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
            ));
    public static final RegistryObject<Block, Block> HONEY_SEAGLASS_PANE = registerBlock("honey_seaglass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
            ));
    public static final RegistryObject<Block, Block> MINT_SEAGLASS_PANE = registerBlock("mint_seaglass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
            ));
    public static final RegistryObject<Block, Block> TEAL_SEAGLASS_PANE = registerBlock("teal_seaglass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
            ));
    public static final RegistryObject<Block, Block> CERULEAN_SEAGLASS_PANE = registerBlock("cerulean_seaglass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
            ));
    public static final RegistryObject<Block, Block> TAUPE_SEAGLASS_PANE = registerBlock("taupe_seaglass_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
            ));

    public static final RegistryObject<Block, Block> CREAM_SEA_WINDOW = registerBlock("cream_sea_window",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> HAZEL_SEA_WINDOW = registerBlock("hazel_sea_window",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> LIQUORICE_SEA_WINDOW = registerBlock("liquorice_sea_window",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> MOCHA_SEA_WINDOW = registerBlock("mocha_sea_window",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> SCARLET_SEA_WINDOW = registerBlock("scarlet_sea_window",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> HONEY_SEA_WINDOW = registerBlock("honey_sea_window",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> MINT_SEA_WINDOW = registerBlock("mint_sea_window",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> TEAL_SEA_WINDOW = registerBlock("teal_sea_window",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> CERULEAN_SEA_WINDOW = registerBlock("cerulean_sea_window",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> TAUPE_SEA_WINDOW = registerBlock("taupe_sea_window",
            () -> new TransparentBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
            ));

    public static final RegistryObject<Block, Block> CREAM_SEA_WINDOW_PANE = registerBlock("cream_sea_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
            ));
    public static final RegistryObject<Block, Block> HAZEL_SEA_WINDOW_PANE = registerBlock("hazel_sea_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
            ));
    public static final RegistryObject<Block, Block> LIQUORICE_SEA_WINDOW_PANE = registerBlock("liquorice_sea_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
            ));
    public static final RegistryObject<Block, Block> MOCHA_SEA_WINDOW_PANE = registerBlock("mocha_sea_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
            ));
    public static final RegistryObject<Block, Block> SCARLET_SEA_WINDOW_PANE = registerBlock("scarlet_sea_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
            ));
    public static final RegistryObject<Block, Block> HONEY_SEA_WINDOW_PANE = registerBlock("honey_sea_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
            ));
    public static final RegistryObject<Block, Block> MINT_SEA_WINDOW_PANE = registerBlock("mint_sea_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
            ));
    public static final RegistryObject<Block, Block> TEAL_SEA_WINDOW_PANE = registerBlock("teal_sea_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
            ));
    public static final RegistryObject<Block, Block> CERULEAN_SEA_WINDOW_PANE = registerBlock("cerulean_sea_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
            ));
    public static final RegistryObject<Block, Block> TAUPE_SEA_WINDOW_PANE = registerBlock("taupe_sea_window_pane",
            () -> new IronBarsBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
            ));

    public static final RegistryObject<Block, Block> CREAM_SEAGLASS_LAMP = registerBlock("cream_seaglass_lamp",
            () -> new SeaglassLampBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> state.getValue(SeaglassLampBlock.LIT) ? 13 : 0)
            ));
    public static final RegistryObject<Block, Block> HAZEL_SEAGLASS_LAMP = registerBlock("hazel_seaglass_lamp",
            () -> new SeaglassLampBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> state.getValue(SeaglassLampBlock.LIT) ? 13 : 0)
            ));
    public static final RegistryObject<Block, Block> LIQUORICE_SEAGLASS_LAMP = registerBlock("liquorice_seaglass_lamp",
            () -> new SeaglassLampBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> state.getValue(SeaglassLampBlock.LIT) ? 13 : 0)
            ));
    public static final RegistryObject<Block, Block> MOCHA_SEAGLASS_LAMP = registerBlock("mocha_seaglass_lamp",
            () -> new SeaglassLampBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .lightLevel(state -> state.getValue(SeaglassLampBlock.LIT) ? 13 : 0)
            ));
    public static final RegistryObject<Block, Block> SCARLET_SEAGLASS_LAMP = registerBlock("scarlet_seaglass_lamp",
            () -> new SeaglassLampBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .lightLevel(state -> state.getValue(SeaglassLampBlock.LIT) ? 13 : 0)
            ));
    public static final RegistryObject<Block, Block> HONEY_SEAGLASS_LAMP = registerBlock("honey_seaglass_lamp",
            () -> new SeaglassLampBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .lightLevel(state -> state.getValue(SeaglassLampBlock.LIT) ? 13 : 0)
            ));
    public static final RegistryObject<Block, Block> MINT_SEAGLASS_LAMP = registerBlock("mint_seaglass_lamp",
            () -> new SeaglassLampBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .lightLevel(state -> state.getValue(SeaglassLampBlock.LIT) ? 13 : 0)
            ));
    public static final RegistryObject<Block, Block> TEAL_SEAGLASS_LAMP = registerBlock("teal_seaglass_lamp",
            () -> new SeaglassLampBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .lightLevel(state -> state.getValue(SeaglassLampBlock.LIT) ? 13 : 0)
            ));
    public static final RegistryObject<Block, Block> CERULEAN_SEAGLASS_LAMP = registerBlock("cerulean_seaglass_lamp",
            () -> new SeaglassLampBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .lightLevel(state -> state.getValue(SeaglassLampBlock.LIT) ? 13 : 0)
            ));
    public static final RegistryObject<Block, Block> TAUPE_SEAGLASS_LAMP = registerBlock("taupe_seaglass_lamp",
            () -> new SeaglassLampBlock(BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .lightLevel(state -> state.getValue(SeaglassLampBlock.LIT) ? 13 : 0)
            ));

    //TODO: la hitbox est pas dingue tbh
    public static final RegistryObject<Block, Block> RUSTED_ANCHOR = registerBlock("rusted_anchor",
            () -> new RustedAnchorBlock(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.METAL)
            ));
    public static final RegistryObject<Block, Block> LIFE_PRESERVER = registerBlock("life_preserver",
            () -> new LifePreserverBlock(BlockBehaviour.Properties.of()
                    .strength(.6f)
                    .sound(SoundType.WOOL)
            ));
    //TODO: 3.5 pixels thickness au lieu de 4
    public static final RegistryObject<Block, Block> DISPLAYED_OARS = registerBlock("displayed_oars",
            () -> new DisplayedOarsBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .sound(SoundType.CHISELED_BOOKSHELF)
                    .noOcclusion()
                    .noCollission()
            ));
    //TODO: vérifier toprim / fullface etc...
    public static final RegistryObject<Block, Block> TREASURE_MAP = registerBlock("treasure_map",
            () -> new TreasureMapBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
                    .noCollission()
            ));
    //TODO: scattered papers model offset
    public static final RegistryObject<Block, Block> SCATTERED_PAPERS = registerBlock("scattered_papers",
            () -> new ScatteredPapersBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
                    .noCollission()
            ));
    //TODO: determine if it's better to randomise the textures or to be able to choose by breaking and placing
    public static final RegistryObject<Block, Block> POSTERS = registerBlock("posters",
            () -> new PostersBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
                    .noCollission()
            ));
    public static final RegistryObject<Block, Block> PAPER_STACK = registerBlock("paper_stack",
            () -> new PaperStackBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> GLASS_BUOY = registerBlock("glass_buoy",
            () -> new GlassBuoyBlock(BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.GLASS)
            ));
    public static final RegistryObject<Block, Block> SMALL_GLASS_BUOYS = registerBlock("small_glass_buoys",
            () -> new SmallGlassBuoysBlock(BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.GLASS)
            ));
    public static final RegistryObject<Block, Block> WOODEN_BUOYS = registerBlock("wooden_buoys",
            () -> new WoodenBuoysBlock(BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.WOOD)
            ));
    //TODO: conditional blockstate to connect rope to coiled rope
    public static final RegistryObject<Block, Block> ROPE = registerBlock("rope",
            () -> new ChainBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> COILED_ROPE = registerBlock("coiled_rope",
            () -> new CoiledRopeBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> HANGING_COD = registerBlock("hanging_cod",
            () -> new HangingFishBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.SLIME_BLOCK)
                    .noCollission()
            ));
    public static final RegistryObject<Block, Block> HANGING_SALMON = registerBlock("hanging_salmon",
            () -> new HangingFishBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.SLIME_BLOCK)
                    .noCollission()
            ));
    public static final RegistryObject<Block, Block> HANGING_KNIVES = registerBlock("hanging_knives",
            () -> new HangingKnivesBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .sound(SoundType.WOOD)
                    .noCollission()
            ));
    public static final RegistryObject<Block, Block> WEDGED_KNIFE = registerBlock("wedged_knife",
            () -> new WedgedKnifeBlock(BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.METAL)
                    .noCollission()
            ));
    public static final RegistryObject<Block, Block> WEDGED_CLEAVER = registerBlock("wedged_cleaver",
            () -> new WedgedKnifeBlock(BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.METAL)
                    .noCollission()
            ));
    public static final RegistryObject<Block, Block> CUTTING_BOARD = registerBlock("cutting_board",
            () -> new CuttingBoardBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> KNIFE_AND_CUTTING_BOARD = registerBlock("knife_and_cutting_board",
            () -> new CuttingBoardBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .sound(SoundType.WOOD)
            ));
    //TODO: particles have wood texture i need to change that
    public static final RegistryObject<Block, Block> IRON_FRYING_PAN = registerBlock("iron_frying_pan",
            () -> new FryingPanBlock(BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.METAL)
            ));
    public static final RegistryObject<Block, Block> COPPER_FRYING_PAN = registerBlock("copper_frying_pan",
            () -> new FryingPanBlock(BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> BIG_COOKING_POT = registerBlock("big_cooking_pot",
            () -> new BigCookingPotBlock(BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.METAL)
            ));
    //TODO: different voxelshapes for each blockstate
    public static final RegistryObject<Block, Block> POTS_AND_PANS = registerBlock("pots_and_pans",
            () -> new PotsAndPansBlock(BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.METAL)
                ));
    public static final RegistryObject<Block, Block> DECORATIVE_BOWL = registerBlockWithoutItem("decorative_bowl",
            () -> new DecorativeBowlBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .sound(SoundType.WOOD)
            ));
    //TODO: different voxelshapes for each blockstate
    public static final RegistryObject<Block, Block> JARS = registerBlock("jars",
            () -> new JarsBlock(BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.GLASS)
            ));
    public static final RegistryObject<Block, Block> HONEY_JAR = registerBlock("honey_jar",
            () -> new HoneyJarBlock(BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.GLASS)
            ));
    public static final RegistryObject<Block, Block> INK_AND_QUILL = registerBlock("ink_and_quill",
            () -> new InkAndQuillBlock(BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.GLASS)
            ));
    public static final RegistryObject<Block, Block> CLUTTERED_SMALL_SHELF = registerBlock("cluttered_small_shelf",
            () -> new ClutteredSmallShelfBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> EMPTY_SMALL_SHELF = registerBlock("empty_small_shelf",
            () -> new EmptySmallShelfBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> SMALL_BOOKSHELF = registerBlock("small_bookshelf",
            () -> new SmallBookshelfBlock(BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> BOOKS = registerBlock("books",
            () -> new BooksBlock(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> BOOK_STACK = registerBlock("book_stack",
            () -> new BookStackBlock(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> GLOBE = registerBlock("globe",
            () -> new GlobeBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.METAL)
            ));
    public static final RegistryObject<Block, Block> VINTAGE_GLOBE = registerBlock("vintage_globe",
            () -> new GlobeBlock(BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.METAL)
            ));
    public static final RegistryObject<Block, Block> BOVINE_SKULL = registerBlock("bovine_skull",
            () -> new BovineSkullBlock(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.BONE_BLOCK)
            ));
    public static final RegistryObject<Block, Block> EQUINE_SKULL = registerBlock("equine_skull",
            () -> new EquineSkullBlock(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.BONE_BLOCK)
            ));
    public static final RegistryObject<Block, Block> CANINE_SKULL = registerBlock("canine_skull",
            () -> new CanineSkullBlock(BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.BONE_BLOCK)
            ));
    public static final RegistryObject<Block, Block> FISH_BONES = registerBlock("fish_bones",
            () -> new FishBonesBlock(BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.BONE_BLOCK)
                    .noCollission()
            ));
    public static final RegistryObject<Block, Block> SMALL_SHARK_JAW = registerBlock("small_shark_jaw",
            () -> new SmallSharkJawBlock(BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.BONE_BLOCK)
                    .noOcclusion()
                    .noCollission()
            ));
    //TODO: trouver un moyen de changer les placement rules parce que là j'aime pas
    public static final RegistryObject<Block, Block> BIG_SHARK_JAW = registerBlock("big_shark_jaw",
            () -> new BigSharkJawBlock(BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.BONE_BLOCK)
                    .noOcclusion()
                    .noCollission()
            ));
    public static final RegistryObject<Block, Block> MEGALODON_TOOTH = registerBlock("megalodon_tooth",
            () -> new SmallSharkJawBlock(BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.BONE_BLOCK)
                    .noOcclusion()
                    .noCollission()
            ));
    public static final RegistryObject<Block, Block> FISHING_LURES = registerBlock("fishing_lures",
            () -> new FishingLuresBlock(BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.BONE_BLOCK)
                    .noOcclusion()
                    .noCollission()
            ));

    //TODO: custom sounds
    public static final RegistryObject<Block, Block> GOLD_COINS_BLOCK = registerBlock("gold_coins_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(6f)
                    .sound(SoundType.METAL)
            ));
    public static final RegistryObject<Block, Block> GOLD_COINS = registerBlock("gold_coins",
            () -> new GoldCoinsLayerBlock(BlockBehaviour.Properties.of()
                    .strength(.6f)
                    .sound(SoundType.METAL)
                    .isViewBlocking((state, level, pos) -> state.getValue(GoldCoinsLayerBlock.LAYERS) >= 8)
            ));
    public static final RegistryObject<Block, Block> SCATTERED_GOLD_COINS = registerBlock("scattered_gold_coins",
            () -> new ScatteredGoldCoinsBlock(BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.METAL)
            ));

    public static final RegistryObject<Block, Block> SANDSTONE_TILE_BLOCK = registerBlock("sandstone_tile",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.TUFF)
            ));
    public static final RegistryObject<Block, Block> SANDSTONE_TILE_STAIRS = registerBlock("sandstone_tile_stairs",
            () -> new StairBlock(ModBlocks.SANDSTONE_TILE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.TUFF)
            ));
    public static final RegistryObject<Block, Block> SANDSTONE_TILE_SLAB = registerBlock("sandstone_tile_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.TUFF)
            ));
    public static final RegistryObject<Block, Block> MOSAIC_SANDSTONE_TILE_BLOCK = registerBlock("mosaic_sandstone_tile",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.TUFF)
            ));

    public static final RegistryObject<Block, Block> BIG_NAUTILUS_SHELL = registerBlock("big_nautilus_shell",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.25f)
                    .sound(SoundType.BONE_BLOCK)
            ));
    public static final RegistryObject<Block, Block> BIG_NAUTILUS_SHELL_LANTERN = registerBlock("big_nautilus_shell_lantern",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(2.25f)
                    .sound(SoundType.BONE_BLOCK)
                    .lightLevel(value -> 15)
            ));

    public static final RegistryObject<Block, Block> BURLAP_BLOCK = registerBlock("burlap",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.5f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> BURLAP_STAIRS = registerBlock("burlap_stairs",
            () -> new StairBlock(BURLAP_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.5f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> BURLAP_SLAB = registerBlock("burlap_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.5f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> BURLAP_CARPET = registerBlock("burlap_carpet",
            () -> new CarpetBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> BURLAP_AWNING = registerBlock("burlap_awning",
            () -> new WoolAwningBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    //TODO: shift-left click to break one "layer" at a time?
    public static final RegistryObject<Block, Block> BURLAP_SACK = registerBlock("burlap_sack",
            () -> new BurlapSackBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));

    public static final RegistryObject<Block, Block> SAILOR_FLAG = registerBlock("sailor_flag",
            () -> new SailorFlagBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> SAILOR_PENNANT_FLAG = registerBlock("sailor_pennant_flag",
            () -> new FishingLuresBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
                    .noCollission()
            ));
    //TODO: dynamic itemModel depending on amount of items in inventory? (might be a post-1.21.4 feature only)
    public static final RegistryObject<Block, Block> CERAMIC_POT = registerBlock("ceramic_pot",
            () -> new CeramicPotBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.DECORATED_POT)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> GLAZED_CERAMIC_POT = registerBlock("glazed_ceramic_pot",
            () -> new CeramicPotBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.DECORATED_POT)
                    .noOcclusion()
            ));
    public static final RegistryObject<Block, Block> HANGING_SAUSAGES = registerBlock("hanging_sausages",
            () -> new HangingSausagesBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.HONEY_BLOCK)
            ));
    public static final RegistryObject<Block, Block> WRAPPED_MEAT = registerBlock("wrapped_meat",
            () -> new WrappedMeatBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.SLIME_BLOCK)
                    .noOcclusion()
            ));
    //TODO: lightLevel
    public static final RegistryObject<Block, Block> COPPER_LIGHT = registerBlock("copper_light",
            () -> new WeatheringCopperLightBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> WAXED_COPPER_LIGHT = registerBlock("waxed_copper_light",
            () -> new CopperLightBlock(BlockBehaviour.Properties.ofFullCopy(COPPER_LIGHT.get())
            ));
    public static final RegistryObject<Block, Block> SHODDY_COPPER_LIGHT = registerBlock("shoddy_copper_light",
            () -> new WeatheringShoddyCopperLightBlock(WeatheringCopper.WeatherState.EXPOSED, BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.COPPER)
            ));
    public static final RegistryObject<Block, Block> WAXED_SHODDY_COPPER_LIGHT = registerBlock("waxed_shoddy_copper_light",
            () -> new ShoddyCopperLightBlock(BlockBehaviour.Properties.ofFullCopy(SHODDY_COPPER_LIGHT.get())
            ));

    public static final RegistryObject<Block, Block> WICKER_BLOCK = registerBlock("wicker",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.BAMBOO)
            ));
    public static final RegistryObject<Block, Block> WICKER_STAIRS = registerBlock("wicker_stairs",
            () -> new StairBlock(WICKER_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.BAMBOO)
            ));
    public static final RegistryObject<Block, Block> WICKER_SLAB = registerBlock("wicker_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.BAMBOO)
            ));
    public static final RegistryObject<Block, Block> WICKER_BASKET = registerBlock("wicker_basket",
            () -> new WickerBasketBlock(BlockBehaviour.Properties.of()
                    .strength(.4f)
                    .sound(SoundType.BAMBOO)
            ));
    public static final RegistryObject<Block, Block> APPLE_WICKER_BASKET = registerBlock("apple_wicker_basket",
            () -> new WickerBasketBlock(BlockBehaviour.Properties.ofFullCopy(WICKER_BASKET.get())
            ));
    public static final RegistryObject<Block, Block> SWEET_BERRIES_WICKER_BASKET = registerBlock("sweet_berries_wicker_basket",
            () -> new WickerBasketBlock(BlockBehaviour.Properties.ofFullCopy(WICKER_BASKET.get())
            ));
    public static final RegistryObject<Block, Block> GLOW_BERRIES_WICKER_BASKET = registerBlock("glow_berries_wicker_basket",
            () -> new WickerBasketBlock(BlockBehaviour.Properties.ofFullCopy(WICKER_BASKET.get())
            ));
    public static final RegistryObject<Block, Block> CARROT_WICKER_BASKET = registerBlock("carrot_wicker_basket",
            () -> new WickerBasketBlock(BlockBehaviour.Properties.ofFullCopy(WICKER_BASKET.get())
            ));
    public static final RegistryObject<Block, Block> POTATO_WICKER_BASKET = registerBlock("potato_wicker_basket",
            () -> new WickerBasketBlock(BlockBehaviour.Properties.ofFullCopy(WICKER_BASKET.get())
            ));
    public static final RegistryObject<Block, Block> BEETROOT_WICKER_BASKET = registerBlock("beetroot_wicker_basket",
            () -> new WickerBasketBlock(BlockBehaviour.Properties.ofFullCopy(WICKER_BASKET.get())
            ));
    public static final RegistryObject<Block, Block> PICKLE_WICKER_BASKET = registerBlock("pickle_wicker_basket",
            () -> new WickerBasketBlock(BlockBehaviour.Properties.ofFullCopy(WICKER_BASKET.get())
            ));
    public static final RegistryObject<Block, Block> COD_WICKER_BASKET = registerBlock("cod_wicker_basket",
            () -> new WickerBasketBlock(BlockBehaviour.Properties.ofFullCopy(WICKER_BASKET.get())
            ));
    public static final RegistryObject<Block, Block> SALMON_WICKER_BASKET = registerBlock("salmon_wicker_basket",
            () -> new WickerBasketBlock(BlockBehaviour.Properties.ofFullCopy(WICKER_BASKET.get())
            ));
    public static final RegistryObject<Block, Block> PINK_PETALS_WICKER_BASKET = registerBlock("pink_petals_wicker_basket",
            () -> new WickerBasketBlock(BlockBehaviour.Properties.ofFullCopy(WICKER_BASKET.get())
            ));
    public static final RegistryObject<Block, Block> LILAC_WICKER_BASKET = registerBlock("lilac_wicker_basket",
            () -> new WickerBasketBlock(BlockBehaviour.Properties.ofFullCopy(WICKER_BASKET.get())
            ));
    public static final RegistryObject<Block, Block> ROSE_BUSH_WICKER_BASKET = registerBlock("rose_bush_wicker_basket",
            () -> new WickerBasketBlock(BlockBehaviour.Properties.ofFullCopy(WICKER_BASKET.get())
            ));
    public static final RegistryObject<Block, Block> PEONY_WICKER_BASKET = registerBlock("peony_wicker_basket",
            () -> new WickerBasketBlock(BlockBehaviour.Properties.ofFullCopy(WICKER_BASKET.get())
            ));

    public static final RegistryObject<Block, Block> GOURD = registerBlock("gourd",
            () -> new GourdBlock(BlockBehaviour.Properties.of()
                    .strength(.4f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> HANGING_GOURDS = registerBlock("hanging_gourds",
            () -> new HangingGourdsBlock(BlockBehaviour.Properties.of()
                    .strength(.4f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> CARVED_BEETROOT = registerBlock("carved_beetroot",
            () -> new CarvedBeetrootBlock(BlockBehaviour.Properties.of()
                    .strength(.4f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> BEET_O_LANTERN = registerBlock("beet_o_lantern",
            () -> new CarvedBeetrootBlock(BlockBehaviour.Properties.of()
                    .strength(.4f)
                    .sound(SoundType.WOOD)
                    .lightLevel(state -> 3 + 4 * state.getValue(CarvedBeetrootBlock.AMOUNT))
            ));
    public static final RegistryObject<Block, Block> BEETROOT_SCARECROW = registerBlock("beetroot_scarecrow",
            () -> new ScarecrowBlock(ScarecrowBlock.Types.BEETROOT, BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.GRASS)
            ));
    public static final RegistryObject<Block, Block> PUMPKIN_SCARECROW = registerBlock("pumpkin_scarecrow",
            () -> new ScarecrowBlock(ScarecrowBlock.Types.PUMPKIN, BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.GRASS)
            ));
    //TODO: Snowman's shape
    public static final RegistryObject<Block, Block> MINI_SNOWMAN = registerBlock("mini_snowman",
            () -> new MiniSnowmanBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.SNOW)
            ));
    public static final RegistryObject<Block, Block> PLUSHIE = registerBlock("plushie",
            () -> new PlushieBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> NUTCRACKER = registerBlock("nutcracker",
            () -> new NutcrackerBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOD)
            ));
    public static final RegistryObject<Block, Block> FALL_GARLAND = registerBlock("fall_garland",
            () -> new GarlandBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .noCollission()
            ));
    public static final RegistryObject<Block, Block> WINTER_GARLAND = registerBlock("winter_garland",
            () -> new GarlandBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .noCollission()
            ));
    public static final RegistryObject<Block, Block> WINTER_WREATH = registerBlock("winter_wreath",
            () -> new WinterWreathBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.GRASS)
                    .noCollission()
            ));
    public static final RegistryObject<Block, Block> FAIRY_LIGHTS = registerBlock("fairy_lights",
            () -> new GarlandBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
                    .noCollission()
                    .lightLevel(value -> 6)
            ));
    public static final RegistryObject<Block, Block> HOLIDAY_ORNAMENTS = registerBlock("holiday_ornaments",
            () -> new FishingLuresBlock(BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOD)
                    .noCollission()
            ));
    public static final RegistryObject<Block, Block> GIANT_ANCHOR = registerBlock("giant_anchor",
            () -> new GiantAnchorBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.METAL)
            ));
    //TODO: special blockstate when above anchor?
    public static final RegistryObject<Block, Block> GIANT_CHAIN = registerBlock("giant_chain",
            () -> new GiantChainBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.METAL)
            ));

    public static final RegistryObject<Block, Block> SEASTONE_BLOCK = registerBlock("seastone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SEASTONE_STAIRS = registerBlock("seastone_stairs",
            () -> new StairBlock(SEASTONE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SEASTONE_SLAB = registerBlock("seastone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SEASTONE_WALL = registerBlock("seastone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SEASTONE_BRICKS = registerBlock("seastone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> CHISELED_SEASTONE_BRICKS = registerBlock("chiseled_seastone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SEASTONE_BRICK_STAIRS = registerBlock("seastone_brick_stairs",
            () -> new StairBlock(SEASTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SEASTONE_BRICK_SLAB = registerBlock("seastone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SEASTONE_BRICK_WALL = registerBlock("seastone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SMOOTH_SEASTONE_BLOCK = registerBlock("smooth_seastone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SMOOTH_SEASTONE_STAIRS = registerBlock("smooth_seastone_stairs",
            () -> new StairBlock(SMOOTH_SEASTONE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SMOOTH_SEASTONE_SLAB = registerBlock("smooth_seastone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SMOOTH_SEASTONE_WALL = registerBlock("smooth_seastone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> CORAL_EMBEDDED_SEASTONE_BRICKS = registerBlock("coral_embedded_seastone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> CORAL_EMBEDDED_SEASTONE_BRICK_STAIRS = registerBlock("coral_embedded_seastone_brick_stairs",
            () -> new StairBlock(CORAL_EMBEDDED_SEASTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> CORAL_EMBEDDED_SEASTONE_BRICK_SLAB = registerBlock("coral_embedded_seastone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> CORAL_EMBEDDED_SEASTONE_BRICK_WALL = registerBlock("coral_embedded_seastone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SNOWY_COBBLESTONE_BLOCK = registerBlock("snowy_cobblestone",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SNOWY_COBBLESTONE_STAIRS = registerBlock("snowy_cobblestone_stairs",
            () -> new StairBlock(SNOWY_COBBLESTONE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SNOWY_COBBLESTONE_SLAB = registerBlock("snowy_cobblestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SNOWY_COBBLESTONE_WALL = registerBlock("smooth_seastone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SNOWY_STONE_BRICKS = registerBlock("snowy_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SNOWY_STONE_BRICK_STAIRS = registerBlock("snowy_stone_brick_stairs",
            () -> new StairBlock(SNOWY_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SNOWY_STONE_BRICK_SLAB = registerBlock("snowy_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SNOWY_STONE_BRICK_WALL = registerBlock("snowy_stone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SMOOTH_STONE_BRICKS = registerBlock("smooth_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SMOOTH_STONE_BRICK_STAIRS = registerBlock("smooth_stone_brick_stairs",
            () -> new StairBlock(SMOOTH_STONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SMOOTH_STONE_BRICK_SLAB = registerBlock("smooth_stone_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SMOOTH_STONE_BRICK_WALL = registerBlock("smooth_tone_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));

    public static final RegistryObject<Block, Block> PLAIN_CUSHION_BLOCK = registerBlock("plain_cushion",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> PLAIN_CUSHION_STAIRS = registerBlock("plain_cushion_stairs",
            () -> new StairBlock(PLAIN_CUSHION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> PLAIN_CUSHION_SLAB = registerBlock("plain_cushion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> WHITE_CUSHION_BLOCK = registerBlock("white_cushion",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> WHITE_CUSHION_STAIRS = registerBlock("white_cushion_stairs",
            () -> new StairBlock(WHITE_CUSHION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> WHITE_CUSHION_SLAB = registerBlock("white_cushion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> LIGHT_GRAY_CUSHION_BLOCK = registerBlock("light_gray_cushion",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> LIGHT_GRAY_CUSHION_STAIRS = registerBlock("light_gray_cushion_stairs",
            () -> new StairBlock(LIGHT_GRAY_CUSHION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> LIGHT_GRAY_CUSHION_SLAB = registerBlock("light_gray_cushion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> GRAY_CUSHION_BLOCK = registerBlock("gray_cushion",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> GRAY_CUSHION_STAIRS = registerBlock("gray_cushion_stairs",
            () -> new StairBlock(GRAY_CUSHION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> GRAY_CUSHION_SLAB = registerBlock("gray_cushion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> BLACK_CUSHION_BLOCK = registerBlock("black_cushion",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> BLACK_CUSHION_STAIRS = registerBlock("black_cushion_stairs",
            () -> new StairBlock(BLACK_CUSHION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> BLACK_CUSHION_SLAB = registerBlock("black_cushion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> BROWN_CUSHION_BLOCK = registerBlock("brown_cushion",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> BROWN_CUSHION_STAIRS = registerBlock("brown_cushion_stairs",
            () -> new StairBlock(BROWN_CUSHION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> BROWN_CUSHION_SLAB = registerBlock("brown_cushion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> RED_CUSHION_BLOCK = registerBlock("red_cushion",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> RED_CUSHION_STAIRS = registerBlock("red_cushion_stairs",
            () -> new StairBlock(RED_CUSHION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> RED_CUSHION_SLAB = registerBlock("red_cushion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> ORANGE_CUSHION_BLOCK = registerBlock("orange_cushion",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> ORANGE_CUSHION_STAIRS = registerBlock("orange_cushion_stairs",
            () -> new StairBlock(ORANGE_CUSHION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> ORANGE_CUSHION_SLAB = registerBlock("orange_cushion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> YELLOW_CUSHION_BLOCK = registerBlock("yellow_cushion",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> YELLOW_CUSHION_STAIRS = registerBlock("yellow_cushion_stairs",
            () -> new StairBlock(YELLOW_CUSHION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> YELLOW_CUSHION_SLAB = registerBlock("yellow_cushion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> LIME_CUSHION_BLOCK = registerBlock("lime_cushion",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> LIME_CUSHION_STAIRS = registerBlock("lime_cushion_stairs",
            () -> new StairBlock(LIME_CUSHION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> LIME_CUSHION_SLAB = registerBlock("lime_cushion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> GREEN_CUSHION_BLOCK = registerBlock("green_cushion",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> GREEN_CUSHION_STAIRS = registerBlock("green_cushion_stairs",
            () -> new StairBlock(GREEN_CUSHION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> GREEN_CUSHION_SLAB = registerBlock("green_cushion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> CYAN_CUSHION_BLOCK = registerBlock("cyan_cushion",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> CYAN_CUSHION_STAIRS = registerBlock("cyan_cushion_stairs",
            () -> new StairBlock(CYAN_CUSHION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> CYAN_CUSHION_SLAB = registerBlock("cyan_cushion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> LIGHT_BLUE_CUSHION_BLOCK = registerBlock("light_blue_cushion",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> LIGHT_BLUE_CUSHION_STAIRS = registerBlock("light_blue_cushion_stairs",
            () -> new StairBlock(LIGHT_BLUE_CUSHION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> LIGHT_BLUE_CUSHION_SLAB = registerBlock("light_blue_cushion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> BLUE_CUSHION_BLOCK = registerBlock("blue_cushion",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> BLUE_CUSHION_STAIRS = registerBlock("blue_cushion_stairs",
            () -> new StairBlock(BLUE_CUSHION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> BLUE_CUSHION_SLAB = registerBlock("blue_cushion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> PURPLE_CUSHION_BLOCK = registerBlock("purple_cushion",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> PURPLE_CUSHION_STAIRS = registerBlock("purple_cushion_stairs",
            () -> new StairBlock(PURPLE_CUSHION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> PURPLE_CUSHION_SLAB = registerBlock("purple_cushion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> MAGENTA_CUSHION_BLOCK = registerBlock("magenta_cushion",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> MAGENTA_CUSHION_STAIRS = registerBlock("magenta_cushion_stairs",
            () -> new StairBlock(MAGENTA_CUSHION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> MAGENTA_CUSHION_SLAB = registerBlock("magenta_cushion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> PINK_CUSHION_BLOCK = registerBlock("pink_cushion",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> PINK_CUSHION_STAIRS = registerBlock("pink_cushion_stairs",
            () -> new StairBlock(PINK_CUSHION_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));
    public static final RegistryObject<Block, Block> PINK_CUSHION_SLAB = registerBlock("pink_cushion_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
            ));

    public static final RegistryObject<Block, Block> SEASTONE_QUOIN = registerBlock("seastone_quoin",
            () -> new QuoinBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SMOOTH_STONE_QUOIN = registerBlock("smooth_stone_quoin",
            () -> new QuoinBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> POLISHED_GRANITE_QUOIN = registerBlock("polished_granite_quoin",
            () -> new QuoinBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> POLISHED_DIORITE_QUOIN = registerBlock("polished_diorite_quoin",
            () -> new QuoinBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> POLISHED_ANDESITE_QUOIN = registerBlock("polished_andesite_quoin",
            () -> new QuoinBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> POLISHED_TUFF_QUOIN = registerBlock("polished_tuff_quoin",
            () -> new QuoinBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> PACKED_MUD_QUOIN = registerBlock("packed_mud_quoin",
            () -> new QuoinBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SANDSTONE_QUOIN = registerBlock("sandstone_quoin",
            () -> new QuoinBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> RED_SANDSTONE_QUOIN = registerBlock("red_sandstone_quoin",
            () -> new QuoinBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> POLISHED_BLACKSTONE_QUOIN = registerBlock("polished_blackstone_quoin",
            () -> new QuoinBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));

    public static final RegistryObject<Block, Block> SEASTONE_MURAL = registerBlock("seastone_mural",
            () -> new VerticalSlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> SMOOTH_STONE_MURAL = registerBlock("smooth_stone_mural",
            () -> new VerticalSlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> GRANITE_MURAL = registerBlock("granite_mural",
            () -> new VerticalSlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> DIORITE_MURAL = registerBlock("diorite_mural",
            () -> new VerticalSlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));
    public static final RegistryObject<Block, Block> ANDESITE_MURAL = registerBlock("andesite_mural",
            () -> new VerticalSlabBlock(BlockBehaviour.Properties.of()
                    .strength(.8f)
            ));



//TODO: piston behaviours, check all strengths and hardness, propagateSkyLight, item lore
    public static final RegistryObject<Block, Block> DUSTY_DECORATIONS_BARREL = registerBlock("dusty_decorations_barrel",
        () -> new BarrelBlock(BlockBehaviour.Properties.ofFullCopy(ModBlocks.APPLE_BARREL.get())));

    private static RegistryObject<Block, Block> registerBlock(String name, Supplier<Block> block) {
        RegistryObject<Block, Block> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static RegistryObject<Block, Block> registerBlockWithoutItem(String name, Supplier<Block> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> void registerBlockItem(String name, Supplier<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void registerModBlocks() {
        ModConstants.LOGGER.info("Registering Mod Blocks for " + ModConstants.MOD_ID);
    }
}
