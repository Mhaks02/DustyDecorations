package net.mhaks.dustydecorations.block;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.custom.*;
import net.mhaks.dustydecorations.block.custom.BarrelBlock;
import net.mhaks.dustydecorations.item.ModItems;
import net.mhaks.dustydecorations.registration.RegistrationProvider;
import net.mhaks.dustydecorations.registration.RegistryObject;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.material.PushReaction;

import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistrationProvider<Block> BLOCKS = RegistrationProvider.get(BuiltInRegistries.BLOCK, ModConstants.MOD_ID);

    public static final RegistryObject<Block, Block> OAK_BANISTER = registerBlock(
            "oak_banister",
            IronBarsBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1.0f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
    );
    public static final RegistryObject<Block, Block> SPRUCE_BANISTER = registerBlock(
            "spruce_banister",
            IronBarsBlock::new,
            () -> OAK_BANISTER.get()
    );
    public static final RegistryObject<Block, Block> BIRCH_BANISTER = registerBlock(
            "birch_banister",
            IronBarsBlock::new,
            () -> OAK_BANISTER.get()
    );
    public static final RegistryObject<Block, Block> JUNGLE_BANISTER = registerBlock(
            "jungle_banister",
            IronBarsBlock::new,
            () -> OAK_BANISTER.get()
    );
    public static final RegistryObject<Block, Block> ACACIA_BANISTER = registerBlock(
            "acacia_banister",
            IronBarsBlock::new,
            () -> OAK_BANISTER.get()
    );
    public static final RegistryObject<Block, Block> DARK_OAK_BANISTER = registerBlock(
            "dark_oak_banister",
            IronBarsBlock::new,
            () -> OAK_BANISTER.get()
    );
    public static final RegistryObject<Block, Block> MANGROVE_BANISTER = registerBlock(

            "mangrove_banister",
            IronBarsBlock::new,
            () -> OAK_BANISTER.get()
    );
    public static final RegistryObject<Block, Block> CHERRY_BANISTER = registerBlock(

            "cherry_banister",
            IronBarsBlock::new,
            () -> OAK_BANISTER.get()
    );
    public static final RegistryObject<Block, Block> BAMBOO_BANISTER = registerBlock(

            "bamboo_banister",
            IronBarsBlock::new,
            () -> OAK_BANISTER.get()
    );
    public static final RegistryObject<Block, Block> DRY_BAMBOO_BANISTER = registerBlock(

            "dry_bamboo_banister",
            IronBarsBlock::new,
            () -> OAK_BANISTER.get()
    );
    public static final RegistryObject<Block, Block> CRIMSON_BANISTER = registerBlock(

            "crimson_banister",
            IronBarsBlock::new,
            () -> OAK_BANISTER.get()
    );
    public static final RegistryObject<Block, Block> WARPED_BANISTER = registerBlock(

            "warped_banister",
            IronBarsBlock::new,
            () -> OAK_BANISTER.get()
    );

    public static final RegistryObject<Block, Block> OAK_LARGE_SHELF = registerBlock(
            "oak_large_shelf",
            LargeShelfBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
    );
    public static final RegistryObject<Block, Block> SPRUCE_LARGE_SHELF = registerBlock(
            "spruce_large_shelf",
            LargeShelfBlock::new,
            () -> OAK_LARGE_SHELF.get()
    );
    public static final RegistryObject<Block, Block> BIRCH_LARGE_SHELF = registerBlock(
            "birch_large_shelf",
            LargeShelfBlock::new,
            () -> OAK_LARGE_SHELF.get()
    );
    public static final RegistryObject<Block, Block> JUNGLE_LARGE_SHELF = registerBlock(
            "jungle_large_shelf",
            LargeShelfBlock::new,
            () -> OAK_LARGE_SHELF.get()
    );
    public static final RegistryObject<Block, Block> ACACIA_LARGE_SHELF = registerBlock(
            "acacia_large_shelf",
            LargeShelfBlock::new,
            () -> OAK_LARGE_SHELF.get()
    );
    public static final RegistryObject<Block, Block> DARK_OAK_LARGE_SHELF = registerBlock(
            "dark_oak_large_shelf",
            LargeShelfBlock::new,
            () -> OAK_LARGE_SHELF.get()
    );
    public static final RegistryObject<Block, Block> MANGROVE_LARGE_SHELF = registerBlock(
            "mangrove_large_shelf",
            LargeShelfBlock::new,
            () -> OAK_LARGE_SHELF.get()
    );
    public static final RegistryObject<Block, Block> CHERRY_LARGE_SHELF = registerBlock(
            "cherry_large_shelf",
            LargeShelfBlock::new,
            () -> OAK_LARGE_SHELF.get()
    );
    public static final RegistryObject<Block, Block> BAMBOO_LARGE_SHELF = registerBlock(
            "bamboo_large_shelf",
            LargeShelfBlock::new,
            () -> OAK_LARGE_SHELF.get()
    );
    public static final RegistryObject<Block, Block> CRIMSON_LARGE_SHELF = registerBlock(
            "crimson_large_shelf",
            LargeShelfBlock::new,
            () -> OAK_LARGE_SHELF.get()
    );
    public static final RegistryObject<Block, Block> WARPED_LARGE_SHELF = registerBlock(
            "warped_large_shelf",
            LargeShelfBlock::new,
            () -> OAK_LARGE_SHELF.get()
    );

    public static final RegistryObject<Block, Block> EMPTY_BARREL = registerBlock(
            "empty_barrel",
            EmptyBarrelBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(2.5f)
                    .sound(SoundType.WOOD)
    );
    public static final RegistryObject<Block, Block> APPLE_BARREL = registerBlock(
            "apple_barrel",
            BarrelBlock::new,
            () -> EMPTY_BARREL.get()
    );
    public static final RegistryObject<Block, Block> SWEET_BERRIES_BARREL = registerBlock(
            "sweet_berries_barrel",
            BarrelBlock::new,
            () -> EMPTY_BARREL.get()
    );
    public static final RegistryObject<Block, Block> GLOW_BERRIES_BARREL = registerBlock(
            "glow_berries_barrel",
            BarrelBlock::new,
            () -> EMPTY_BARREL.get()
    );
    public static final RegistryObject<Block, Block> CARROT_BARREL = registerBlock(
            "carrot_barrel",
            BarrelBlock::new,
            () -> EMPTY_BARREL.get()
    );
    public static final RegistryObject<Block, Block> POTATO_BARREL = registerBlock(
            "potato_barrel",
            BarrelBlock::new,
            () -> EMPTY_BARREL.get()
    );
    public static final RegistryObject<Block, Block> BEETROOT_BARREL = registerBlock(
            "beetroot_barrel",
            BarrelBlock::new,
            () -> EMPTY_BARREL.get()
    );
    public static final RegistryObject<Block, Block> SEA_PICKLE_BARREL = registerBlock(
            "sea_pickle_barrel",
            BarrelBlock::new,
            () -> EMPTY_BARREL.get()
    );
    public static final RegistryObject<Block, Block> COD_BARREL = registerBlock(
            "cod_barrel",
            BarrelBlock::new,
            () -> EMPTY_BARREL.get()
    );
    public static final RegistryObject<Block, Block> SALMON_BARREL = registerBlock(
            "salmon_barrel",
            BarrelBlock::new,
            () -> EMPTY_BARREL.get()
    );

    public static final RegistryObject<Block, Block> SUNFLOWER_WALLPAPER_BLOCK = registerBlock(
            "sunflower_wallpaper",
            WallpaperBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(0.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> REGAL_WALLPAPER_BLOCK = registerBlock(
            "regal_wallpaper",
            () -> SUNFLOWER_WALLPAPER_BLOCK.get()
    );
    public static final RegistryObject<Block, Block> VINE_WALLPAPER_BLOCK = registerBlock(
            "vine_wallpaper",
            WallpaperBlock::new,
            () -> SUNFLOWER_WALLPAPER_BLOCK.get()
    );
    public static final RegistryObject<Block, Block> MONSTER_WALLPAPER_BLOCK = registerBlock(
            "monster_wallpaper",
            () -> SUNFLOWER_WALLPAPER_BLOCK.get()
    );
    public static final RegistryObject<Block, Block> SAILOR_WALLPAPER_BLOCK = registerBlock(
            "sailor_wallpaper",
            () -> SUNFLOWER_WALLPAPER_BLOCK.get()
    );
    public static final RegistryObject<Block, Block> COPPER_WALLPAPER_BLOCK = registerBlock(
            "copper_wallpaper",
            () -> SUNFLOWER_WALLPAPER_BLOCK.get()
    );
    public static final RegistryObject<Block, Block> STELLAR_WALLPAPER_BLOCK = registerBlock(
            "stellar_wallpaper",
            StellarWallpaperBlock::new,
            () -> SUNFLOWER_WALLPAPER_BLOCK.get()
    );
    public static final RegistryObject<Block, Block> PUMPKIN_WALLPAPER_BLOCK = registerBlock(
            "pumpkin_wallpaper",
            () -> SUNFLOWER_WALLPAPER_BLOCK.get()
    );
    public static final RegistryObject<Block, Block> SOUL_WALLPAPER_BLOCK = registerBlock(
            "soul_wallpaper",
            () -> SUNFLOWER_WALLPAPER_BLOCK.get()
    );
    public static final RegistryObject<Block, Block> FOREST_FESTIVE_WALLPAPER_BLOCK = registerBlock(
            "forest_festive_wallpaper",
            () -> SUNFLOWER_WALLPAPER_BLOCK.get()
    );
    public static final RegistryObject<Block, Block> STRIPED_FESTIVE_WALLPAPER_BLOCK = registerBlock(
            "striped_festive_wallpaper",
            () -> SUNFLOWER_WALLPAPER_BLOCK.get()
    );
    public static final RegistryObject<Block, Block> SNOWMEN_WALLPAPER_BLOCK = registerBlock(
            "snowmen_wallpaper",
            () -> SUNFLOWER_WALLPAPER_BLOCK.get()
    );
    public static final RegistryObject<Block, Block> SNOWFLAKE_WALLPAPER_BLOCK = registerBlock(
            "snowflake_wallpaper",
            () -> SUNFLOWER_WALLPAPER_BLOCK.get()
    );

    public static final RegistryObject<Block, Block> WHITE_WOOL_AWNING = registerBlock(
            "white_wool_awning",
            WoolAwningBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> LIGHT_GRAY_WOOL_AWNING = registerBlock(
            "light_gray_wool_awning",
            WoolAwningBlock::new,
            () -> WHITE_WOOL_AWNING.get()
    );
    public static final RegistryObject<Block, Block> GRAY_WOOL_AWNING = registerBlock(
            "gray_wool_awning",
            WoolAwningBlock::new,
            () -> WHITE_WOOL_AWNING.get()
    );
    public static final RegistryObject<Block, Block> BLACK_WOOL_AWNING = registerBlock(
            "black_wool_awning",
            WoolAwningBlock::new,
            () -> WHITE_WOOL_AWNING.get()
    );
    public static final RegistryObject<Block, Block> BROWN_WOOL_AWNING = registerBlock(
            "brown_wool_awning",
            WoolAwningBlock::new,
            () -> WHITE_WOOL_AWNING.get()
    );
    public static final RegistryObject<Block, Block> RED_WOOL_AWNING = registerBlock(
            "red_wool_awning",
            WoolAwningBlock::new,
            () -> WHITE_WOOL_AWNING.get()
    );
    public static final RegistryObject<Block, Block> ORANGE_WOOL_AWNING = registerBlock(
            "orange_wool_awning",
            WoolAwningBlock::new,
            () -> WHITE_WOOL_AWNING.get()
    );
    public static final RegistryObject<Block, Block> YELLOW_WOOL_AWNING = registerBlock(
            "yellow_wool_awning",
            WoolAwningBlock::new,
            () -> WHITE_WOOL_AWNING.get()
    );
    public static final RegistryObject<Block, Block> LIME_WOOL_AWNING = registerBlock(
            "lime_wool_awning",
            WoolAwningBlock::new,
            () -> WHITE_WOOL_AWNING.get()
    );
    public static final RegistryObject<Block, Block> GREEN_WOOL_AWNING = registerBlock(
            "green_wool_awning",
            WoolAwningBlock::new,
            () -> WHITE_WOOL_AWNING.get()
    );
    public static final RegistryObject<Block, Block> CYAN_WOOL_AWNING = registerBlock(
            "cyan_wool_awning",
            WoolAwningBlock::new,
            () -> WHITE_WOOL_AWNING.get()
    );
    public static final RegistryObject<Block, Block> LIGHT_BLUE_WOOL_AWNING = registerBlock(
            "light_blue_wool_awning",
            WoolAwningBlock::new,
            () -> WHITE_WOOL_AWNING.get()
    );
    public static final RegistryObject<Block, Block> BLUE_WOOL_AWNING = registerBlock(
            "blue_wool_awning",
            WoolAwningBlock::new,
            () -> WHITE_WOOL_AWNING.get()
    );
    public static final RegistryObject<Block, Block> PURPLE_WOOL_AWNING = registerBlock(
            "purple_wool_awning",
            WoolAwningBlock::new,
            () -> WHITE_WOOL_AWNING.get()
    );
    public static final RegistryObject<Block, Block> MAGENTA_WOOL_AWNING = registerBlock(
            "magenta_wool_awning",
            WoolAwningBlock::new,
            () -> WHITE_WOOL_AWNING.get()
    );
    public static final RegistryObject<Block, Block> PINK_WOOL_AWNING = registerBlock(
            "pink_wool_awning",
            WoolAwningBlock::new,
            () -> WHITE_WOOL_AWNING.get()
    );

    //TODO: lantern sound?
    public static final RegistryObject<Block, Block> PAPER_LANTERN = registerBlock(
            "paper_lantern",
            PaperLanternBlock::new,
            BlockBehaviour.Properties.of()
                    .noOcclusion()
                    .noCollision()
                    .lightLevel(value -> 12)
                    .strength(.1f)
    );
    public static final RegistryObject<Block, Block> SAKURA_PAPER_LANTERN = registerBlock(
            "sakura_paper_lantern",
            PaperLanternBlock::new,
            () -> PAPER_LANTERN.get()
    );
    public static final RegistryObject<Block, Block> TAIGA_PAPER_LANTERN = registerBlock(
            "taiga_paper_lantern",
            PaperLanternBlock::new,
            () -> PAPER_LANTERN.get()
    );
    public static final RegistryObject<Block, Block> ORCHID_PAPER_LANTERN = registerBlock(
            "orchid_paper_lantern",
            PaperLanternBlock::new,
            () -> PAPER_LANTERN.get()
    );
    public static final RegistryObject<Block, Block> PANDA_PAPER_LANTERN = registerBlock(
            "panda_paper_lantern",
            PaperLanternBlock::new,
            () -> PAPER_LANTERN.get()
    );
    public static final RegistryObject<Block, Block> VILLAGER_PAPER_LANTERN = registerBlock(
            "villager_paper_lantern",
            PaperLanternBlock::new,
            () -> PAPER_LANTERN.get()
    );
    public static final RegistryObject<Block, Block> CREEPER_PAPER_LANTERN = registerBlock(
            "creeper_paper_lantern",
            PaperLanternBlock::new,
            () -> PAPER_LANTERN.get()
    );
    public static final RegistryObject<Block, Block> CHICKEN_JOCKEY_PAPER_LANTERN = registerBlock(
            "chicken_jockey_paper_lantern",
            PaperLanternBlock::new,
            () -> PAPER_LANTERN.get()
    );
    public static final RegistryObject<Block, Block> PILLAGER_PAPER_LANTERN = registerBlock(
            "pillager_paper_lantern",
            PaperLanternBlock::new,
            () -> PAPER_LANTERN.get()
    );
    public static final RegistryObject<Block, Block> WARDEN_PAPER_LANTERN = registerBlock(
            "warden_paper_lantern",
            PaperLanternBlock::new,
            () -> PAPER_LANTERN.get()
    );

    public static final RegistryObject<Block, Block> CORRUGATED_METAL_BLOCK = registerBlock(
            "corrugated_metal_block",
            properties -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.UNAFFECTED, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_GRATE = registerBlock(
            "corrugated_metal_grate",
            properties -> new WeatheringCopperGrateBlock(WeatheringCopper.WeatherState.UNAFFECTED, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_STAIRS = registerBlock(
            "corrugated_metal_stairs",
            properties -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.UNAFFECTED, ModBlocks.CORRUGATED_METAL_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_SLAB = registerBlock(
            "corrugated_metal_slab",
            properties -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.UNAFFECTED, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_FENCE = registerBlock(
            "corrugated_metal_fence",
            properties -> new WeatheringCopperFenceBlock(WeatheringCopper.WeatherState.UNAFFECTED, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_FENCE_GATE = registerBlock(
            "corrugated_metal_fence_gate",
            properties -> new WeatheringCorrugatedMetalFenceGateBlock(WeatheringCopper.WeatherState.UNAFFECTED, WoodType.ACACIA, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_DOOR = registerBlock(
            "corrugated_metal_door",
            properties -> new WeatheringCorrugatedMetalDoorBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockSetType.COPPER, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_TRAPDOOR = registerBlock(
            "corrugated_metal_trapdoor",
            properties -> new WeatheringCorrugatedMetalTrapdoorBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockSetType.COPPER, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_PRESSURE_PLATE = registerBlock(
            "corrugated_metal_pressure_plate",
            properties -> new WeatheringCopperPressurePlateBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockSetType.COPPER, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
    );
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_BUTTON = registerBlock(
            "corrugated_metal_button",
            properties -> new WeatheringCopperButtonBlock(WeatheringCopper.WeatherState.UNAFFECTED, BlockSetType.COPPER, 30, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
    );
    public static final RegistryObject<Block, Block> CORRUGATED_METAL_ROOFING = registerBlock(
            "corrugated_metal_roofing",
            properties -> new WeatheringCorrugatedMetalRoofingBlock(WeatheringCopper.WeatherState.UNAFFECTED, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
    );

    public static final RegistryObject<Block, Block> WAXED_CORRUGATED_METAL_BLOCK = registerBlock(
            "waxed_corrugated_metal_block",
            () -> CORRUGATED_METAL_BLOCK.get()
    );

    public static final RegistryObject<Block, Block> WAXED_CORRUGATED_METAL_GRATE = registerBlock(
            "waxed_corrugated_metal_grate",
            () -> CORRUGATED_METAL_GRATE.get()
    );

    public static final RegistryObject<Block, Block> WAXED_CORRUGATED_METAL_STAIRS = registerBlock(
            "waxed_corrugated_metal_stairs",
            properties -> new StairBlock(ModBlocks.CORRUGATED_METAL_BLOCK.get().defaultBlockState(), properties),
            () -> CORRUGATED_METAL_STAIRS.get()
    );

    public static final RegistryObject<Block, Block> WAXED_CORRUGATED_METAL_SLAB = registerBlock(
            "waxed_corrugated_metal_slab",
            SlabBlock::new,
            () -> CORRUGATED_METAL_SLAB.get()
    );

    public static final RegistryObject<Block, Block> WAXED_CORRUGATED_METAL_FENCE = registerBlock(
            "waxed_corrugated_metal_fence",
            FenceBlock::new,
            () -> CORRUGATED_METAL_FENCE.get()
    );

    public static final RegistryObject<Block, Block> WAXED_CORRUGATED_METAL_FENCE_GATE = registerBlock(
            "waxed_corrugated_metal_fence_gate",
            properties -> new CorrugatedMetalFenceGateBlock(WoodType.ACACIA, properties),
            () -> CORRUGATED_METAL_FENCE_GATE.get()
    );

    public static final RegistryObject<Block, Block> WAXED_CORRUGATED_METAL_DOOR = registerBlock(
            "waxed_corrugated_metal_door",
            properties -> new CorrugatedMetalDoorBlock(BlockSetType.COPPER, properties),
            () -> ModBlocks.CORRUGATED_METAL_DOOR.get()
    );

    public static final RegistryObject<Block, Block> WAXED_CORRUGATED_METAL_TRAPDOOR = registerBlock(
            "waxed_corrugated_metal_trapdoor",
            properties -> new CorrugatedMetalTrapdoorBlock(BlockSetType.COPPER, properties),
            () -> ModBlocks.CORRUGATED_METAL_TRAPDOOR.get()
    );

    public static final RegistryObject<Block, Block> WAXED_CORRUGATED_METAL_PRESSURE_PLATE = registerBlock(
            "waxed_corrugated_metal_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.COPPER, properties),
            () -> ModBlocks.CORRUGATED_METAL_PRESSURE_PLATE.get()
    );

    public static final RegistryObject<Block, Block> WAXED_CORRUGATED_METAL_BUTTON = registerBlock(
            "waxed_corrugated_metal_button",
            properties -> new ButtonBlock(BlockSetType.COPPER, 30, properties),
            () -> ModBlocks.CORRUGATED_METAL_BUTTON.get()
    );

    public static final RegistryObject<Block, Block> WAXED_CORRUGATED_METAL_ROOFING = registerBlock(
            "waxed_corrugated_metal_roofing",
            CorrugatedMetalRoofingBlock::new,
            () -> ModBlocks.CORRUGATED_METAL_ROOFING.get()
    );

    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_BLOCK = registerBlock(
            "rusted_corrugated_metal_block",
            properties -> new WeatheringCopperFullBlock(WeatheringCopper.WeatherState.EXPOSED, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_GRATE = registerBlock(
            "rusted_corrugated_metal_grate",
            properties -> new WeatheringCopperGrateBlock(WeatheringCopper.WeatherState.EXPOSED, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
    );
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_STAIRS = registerBlock(
            "rusted_corrugated_metal_stairs",
            properties -> new WeatheringCopperStairBlock(WeatheringCopper.WeatherState.EXPOSED, ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_SLAB = registerBlock(
            "rusted_corrugated_metal_slab",
            properties -> new WeatheringCopperSlabBlock(WeatheringCopper.WeatherState.EXPOSED, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_FENCE = registerBlock(
            "rusted_corrugated_metal_fence",
            properties -> new WeatheringCopperFenceBlock(WeatheringCopper.WeatherState.EXPOSED, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_FENCE_GATE = registerBlock(
            "rusted_corrugated_metal_fence_gate",
            properties -> new WeatheringCorrugatedMetalFenceGateBlock(WeatheringCopper.WeatherState.EXPOSED, WoodType.ACACIA, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_DOOR = registerBlock(
            "rusted_corrugated_metal_door",
            properties -> new WeatheringCorrugatedMetalDoorBlock(WeatheringCopper.WeatherState.EXPOSED, BlockSetType.COPPER, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_TRAPDOOR = registerBlock(
            "rusted_corrugated_metal_trapdoor",
            properties -> new WeatheringCorrugatedMetalTrapdoorBlock(WeatheringCopper.WeatherState.EXPOSED, BlockSetType.COPPER, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_PRESSURE_PLATE = registerBlock(
            "rusted_corrugated_metal_pressure_plate",
            properties -> new WeatheringCopperPressurePlateBlock(WeatheringCopper.WeatherState.EXPOSED, BlockSetType.COPPER, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
    );
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_BUTTON = registerBlock(
            "rusted_corrugated_metal_button",
            properties -> new WeatheringCopperButtonBlock(WeatheringCopper.WeatherState.EXPOSED, BlockSetType.COPPER, 30, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
    );
    public static final RegistryObject<Block, Block> RUSTED_CORRUGATED_METAL_ROOFING = registerBlock(
            "rusted_corrugated_metal_roofing",
            properties -> new WeatheringCorrugatedMetalRoofingBlock(WeatheringCopper.WeatherState.EXPOSED, properties),
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.COPPER)
                    .requiresCorrectToolForDrops()
    );

    public static final RegistryObject<Block, Block> WAXED_RUSTED_CORRUGATED_METAL_BLOCK = registerBlock(
            "waxed_rusted_corrugated_metal_block",
            () -> ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.get()
    );

    public static final RegistryObject<Block, Block> WAXED_RUSTED_CORRUGATED_METAL_GRATE = registerBlock(
            "waxed_rusted_corrugated_metal_grate",
            () -> ModBlocks.RUSTED_CORRUGATED_METAL_GRATE.get()
    );

    public static final RegistryObject<Block, Block> WAXED_RUSTED_CORRUGATED_METAL_STAIRS = registerBlock(
            "waxed_rusted_corrugated_metal_stairs",
            properties -> new StairBlock(ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.get().defaultBlockState(), properties),
            () -> ModBlocks.RUSTED_CORRUGATED_METAL_STAIRS.get()
    );

    public static final RegistryObject<Block, Block> WAXED_RUSTED_CORRUGATED_METAL_SLAB = registerBlock(
            "waxed_rusted_corrugated_metal_slab",
            SlabBlock::new,
            () -> ModBlocks.RUSTED_CORRUGATED_METAL_SLAB.get()
    );

    public static final RegistryObject<Block, Block> WAXED_RUSTED_CORRUGATED_METAL_FENCE = registerBlock(
            "waxed_rusted_corrugated_metal_fence",
            FenceBlock::new,
            () -> ModBlocks.RUSTED_CORRUGATED_METAL_FENCE.get()
    );

    public static final RegistryObject<Block, Block> WAXED_RUSTED_CORRUGATED_METAL_FENCE_GATE = registerBlock(
            "waxed_rusted_corrugated_metal_fence_gate",
            properties -> new CorrugatedMetalFenceGateBlock(WoodType.ACACIA, properties),
            () -> ModBlocks.RUSTED_CORRUGATED_METAL_FENCE_GATE.get()
    );

    public static final RegistryObject<Block, Block> WAXED_RUSTED_CORRUGATED_METAL_DOOR = registerBlock(
            "waxed_rusted_corrugated_metal_door",
            properties -> new CorrugatedMetalDoorBlock(BlockSetType.COPPER, properties),
            () -> ModBlocks.RUSTED_CORRUGATED_METAL_DOOR.get()
    );

    public static final RegistryObject<Block, Block> WAXED_RUSTED_CORRUGATED_METAL_TRAPDOOR = registerBlock(
            "waxed_rusted_corrugated_metal_trapdoor",
            properties -> new CorrugatedMetalTrapdoorBlock(BlockSetType.COPPER, properties),
            () -> ModBlocks.RUSTED_CORRUGATED_METAL_TRAPDOOR.get()
    );

    public static final RegistryObject<Block, Block> WAXED_RUSTED_CORRUGATED_METAL_PRESSURE_PLATE = registerBlock(
            "waxed_rusted_corrugated_metal_pressure_plate",
            properties -> new PressurePlateBlock(BlockSetType.COPPER, properties),
            () -> ModBlocks.RUSTED_CORRUGATED_METAL_PRESSURE_PLATE.get()
    );

    public static final RegistryObject<Block, Block> WAXED_RUSTED_CORRUGATED_METAL_BUTTON = registerBlock(
            "waxed_rusted_corrugated_metal_button",
            properties -> new ButtonBlock(BlockSetType.COPPER, 30, properties),
            () -> ModBlocks.RUSTED_CORRUGATED_METAL_BUTTON.get()
    );

    public static final RegistryObject<Block, Block> WAXED_RUSTED_CORRUGATED_METAL_ROOFING = registerBlock(
            "waxed_rusted_corrugated_metal_roofing",
            CorrugatedMetalRoofingBlock::new,
            () -> ModBlocks.RUSTED_CORRUGATED_METAL_ROOFING.get()
    );

    public static final RegistryObject<Block, Block> CREAM_SEAGLASS = registerBlock(
            "cream_seaglass",
            TransparentBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
    );
    public static final RegistryObject<Block, Block> HAZEL_SEAGLASS = registerBlock(
            "hazel_seaglass",
            TransparentBlock::new,
            () -> CREAM_SEAGLASS.get()
    );
    public static final RegistryObject<Block, Block> LIQUORICE_SEAGLASS = registerBlock(
            "liquorice_seaglass",
            TransparentBlock::new,
            () -> CREAM_SEAGLASS.get()
    );
    public static final RegistryObject<Block, Block> MOCHA_SEAGLASS = registerBlock(
            "mocha_seaglass",
            TransparentBlock::new,
            () -> CREAM_SEAGLASS.get()
    );
    public static final RegistryObject<Block, Block> SCARLET_SEAGLASS = registerBlock(
            "scarlet_seaglass",
            TransparentBlock::new,
            () -> CREAM_SEAGLASS.get()
    );
    public static final RegistryObject<Block, Block> HONEY_SEAGLASS = registerBlock(
            "honey_seaglass",
            TransparentBlock::new,
            () -> CREAM_SEAGLASS.get()
    );
    public static final RegistryObject<Block, Block> MINT_SEAGLASS = registerBlock(
            "mint_seaglass",
            TransparentBlock::new,
            () -> CREAM_SEAGLASS.get()
    );
    public static final RegistryObject<Block, Block> TEAL_SEAGLASS = registerBlock(
            "teal_seaglass",
            TransparentBlock::new,
            () -> CREAM_SEAGLASS.get()
    );
    public static final RegistryObject<Block, Block> CERULEAN_SEAGLASS = registerBlock(
            "cerulean_seaglass",
            TransparentBlock::new,
            () -> CREAM_SEAGLASS.get()
    );
    public static final RegistryObject<Block, Block> TAUPE_SEAGLASS = registerBlock(
            "taupe_seaglass",
            TransparentBlock::new,
            () -> CREAM_SEAGLASS.get()
    );

    public static final RegistryObject<Block, Block> CREAM_SEAGLASS_PANE = registerBlock(
            "cream_seaglass_pane",
            IronBarsBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
    );
    public static final RegistryObject<Block, Block> HAZEL_SEAGLASS_PANE = registerBlock(
            "hazel_seaglass_pane",
            IronBarsBlock::new,
            () -> CREAM_SEAGLASS_PANE.get()
    );
    public static final RegistryObject<Block, Block> LIQUORICE_SEAGLASS_PANE = registerBlock(
            "liquorice_seaglass_pane",
            IronBarsBlock::new,
            () -> CREAM_SEAGLASS_PANE.get()
    );
    public static final RegistryObject<Block, Block> MOCHA_SEAGLASS_PANE = registerBlock(
            "mocha_seaglass_pane",
            IronBarsBlock::new,
            () -> CREAM_SEAGLASS_PANE.get()
    );
    public static final RegistryObject<Block, Block> SCARLET_SEAGLASS_PANE = registerBlock(
            "scarlet_seaglass_pane",
            IronBarsBlock::new,
            () -> CREAM_SEAGLASS_PANE.get()
    );
    public static final RegistryObject<Block, Block> HONEY_SEAGLASS_PANE = registerBlock(
            "honey_seaglass_pane",
            IronBarsBlock::new,
            () -> CREAM_SEAGLASS_PANE.get()
    );
    public static final RegistryObject<Block, Block> MINT_SEAGLASS_PANE = registerBlock(
            "mint_seaglass_pane",
            IronBarsBlock::new,
            () -> CREAM_SEAGLASS_PANE.get()
    );
    public static final RegistryObject<Block, Block> TEAL_SEAGLASS_PANE = registerBlock(
            "teal_seaglass_pane",
            IronBarsBlock::new,
            () -> CREAM_SEAGLASS_PANE.get()
    );
    public static final RegistryObject<Block, Block> CERULEAN_SEAGLASS_PANE = registerBlock(
            "cerulean_seaglass_pane",
            IronBarsBlock::new,
            () -> CREAM_SEAGLASS_PANE.get()
    );
    public static final RegistryObject<Block, Block> TAUPE_SEAGLASS_PANE = registerBlock(
            "taupe_seaglass_pane",
            IronBarsBlock::new,
            () -> CREAM_SEAGLASS_PANE.get()
    );

    public static final RegistryObject<Block, Block> CREAM_SEA_WINDOW = registerBlock(
            "cream_sea_window",
            TransparentBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .noOcclusion()
    );
    public static final RegistryObject<Block, Block> HAZEL_SEA_WINDOW = registerBlock(
            "hazel_sea_window",
            TransparentBlock::new,
            () -> CREAM_SEA_WINDOW.get()
    );
    public static final RegistryObject<Block, Block> LIQUORICE_SEA_WINDOW = registerBlock(
            "liquorice_sea_window",
            TransparentBlock::new,
            () -> CREAM_SEA_WINDOW.get()
    );
    public static final RegistryObject<Block, Block> MOCHA_SEA_WINDOW = registerBlock(
            "mocha_sea_window",
            TransparentBlock::new,
            () -> CREAM_SEA_WINDOW.get()
    );
    public static final RegistryObject<Block, Block> SCARLET_SEA_WINDOW = registerBlock(
            "scarlet_sea_window",
            TransparentBlock::new,
            () -> CREAM_SEA_WINDOW.get()
    );
    public static final RegistryObject<Block, Block> HONEY_SEA_WINDOW = registerBlock(
            "honey_sea_window",
            TransparentBlock::new,
            () -> CREAM_SEA_WINDOW.get()
    );
    public static final RegistryObject<Block, Block> MINT_SEA_WINDOW = registerBlock(
            "mint_sea_window",
            TransparentBlock::new,
            () -> CREAM_SEA_WINDOW.get()
    );
    public static final RegistryObject<Block, Block> TEAL_SEA_WINDOW = registerBlock(
            "teal_sea_window",
            TransparentBlock::new,
            () -> CREAM_SEA_WINDOW.get()
    );
    public static final RegistryObject<Block, Block> CERULEAN_SEA_WINDOW = registerBlock(
            "cerulean_sea_window",
            TransparentBlock::new,
            () -> CREAM_SEA_WINDOW.get()
    );
    public static final RegistryObject<Block, Block> TAUPE_SEA_WINDOW = registerBlock(
            "taupe_sea_window",
            TransparentBlock::new,
            () -> CREAM_SEA_WINDOW.get()
    );

    public static final RegistryObject<Block, Block> CREAM_SEA_WINDOW_PANE = registerBlock(
            "cream_sea_window_pane",
            IronBarsBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
    );
    public static final RegistryObject<Block, Block> HAZEL_SEA_WINDOW_PANE = registerBlock(
            "hazel_sea_window_pane",
            IronBarsBlock::new,
            () -> CREAM_SEA_WINDOW_PANE.get()
    );
    public static final RegistryObject<Block, Block> LIQUORICE_SEA_WINDOW_PANE = registerBlock(
            "liquorice_sea_window_pane",
            IronBarsBlock::new,
            () -> CREAM_SEA_WINDOW_PANE.get()
    );
    public static final RegistryObject<Block, Block> MOCHA_SEA_WINDOW_PANE = registerBlock(
            "mocha_sea_window_pane",
            IronBarsBlock::new,
            () -> CREAM_SEA_WINDOW_PANE.get()
    );
    public static final RegistryObject<Block, Block> SCARLET_SEA_WINDOW_PANE = registerBlock(
            "scarlet_sea_window_pane",
            IronBarsBlock::new,
            () -> CREAM_SEA_WINDOW_PANE.get()
    );
    public static final RegistryObject<Block, Block> HONEY_SEA_WINDOW_PANE = registerBlock(
            "honey_sea_window_pane",
            IronBarsBlock::new,
            () -> CREAM_SEA_WINDOW_PANE.get()
    );
    public static final RegistryObject<Block, Block> MINT_SEA_WINDOW_PANE = registerBlock(
            "mint_sea_window_pane",
            IronBarsBlock::new,
            () -> CREAM_SEA_WINDOW_PANE.get()
    );
    public static final RegistryObject<Block, Block> TEAL_SEA_WINDOW_PANE = registerBlock(
            "teal_sea_window_pane",
            IronBarsBlock::new,
            () -> CREAM_SEA_WINDOW_PANE.get()
    );
    public static final RegistryObject<Block, Block> CERULEAN_SEA_WINDOW_PANE = registerBlock(
            "cerulean_sea_window_pane",
            IronBarsBlock::new,
            () -> CREAM_SEA_WINDOW_PANE.get()
    );
    public static final RegistryObject<Block, Block> TAUPE_SEA_WINDOW_PANE = registerBlock(
            "taupe_sea_window_pane",
            IronBarsBlock::new,
            () -> CREAM_SEA_WINDOW_PANE.get()
    );

    public static final RegistryObject<Block, Block> CREAM_SEAGLASS_LAMP = registerBlock(
            "cream_seaglass_lamp",
            SeaglassLampBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(0.3f)
                    .sound(SoundType.GLASS)
                    .lightLevel(state -> state.getValue(SeaglassLampBlock.LIT) ? 13 : 0)
    );
    public static final RegistryObject<Block, Block> HAZEL_SEAGLASS_LAMP = registerBlock(
            "hazel_seaglass_lamp",
            SeaglassLampBlock::new,
            () -> CREAM_SEAGLASS_LAMP.get()
    );
    public static final RegistryObject<Block, Block> LIQUORICE_SEAGLASS_LAMP = registerBlock(
            "liquorice_seaglass_lamp",
            SeaglassLampBlock::new,
            () -> CREAM_SEAGLASS_LAMP.get()
    );
    public static final RegistryObject<Block, Block> MOCHA_SEAGLASS_LAMP = registerBlock(
            "mocha_seaglass_lamp",
            SeaglassLampBlock::new,
            () -> CREAM_SEAGLASS_LAMP.get()
    );
    public static final RegistryObject<Block, Block> SCARLET_SEAGLASS_LAMP = registerBlock(
            "scarlet_seaglass_lamp",
            SeaglassLampBlock::new,
            () -> CREAM_SEAGLASS_LAMP.get()
    );
    public static final RegistryObject<Block, Block> HONEY_SEAGLASS_LAMP = registerBlock(
            "honey_seaglass_lamp",
            SeaglassLampBlock::new,
            () -> CREAM_SEAGLASS_LAMP.get()
    );
    public static final RegistryObject<Block, Block> MINT_SEAGLASS_LAMP = registerBlock(
            "mint_seaglass_lamp",
            SeaglassLampBlock::new,
            () -> CREAM_SEAGLASS_LAMP.get()
    );
    public static final RegistryObject<Block, Block> TEAL_SEAGLASS_LAMP = registerBlock(
            "teal_seaglass_lamp",
            SeaglassLampBlock::new,
            () -> CREAM_SEAGLASS_LAMP.get()
    );
    public static final RegistryObject<Block, Block> CERULEAN_SEAGLASS_LAMP = registerBlock(
            "cerulean_seaglass_lamp",
            SeaglassLampBlock::new,
            () -> CREAM_SEAGLASS_LAMP.get()
    );
    public static final RegistryObject<Block, Block> TAUPE_SEAGLASS_LAMP = registerBlock(
            "taupe_seaglass_lamp",
            SeaglassLampBlock::new,
            () -> CREAM_SEAGLASS_LAMP.get()
    );

    //TODO: custom brushing sounds maybe?
    public static final RegistryObject<Block, Block> SEAGLASS_SAND = registerBlock(
            "seaglass_sand",
            properties -> new BrushableBlock(Blocks.SAND, SoundEvents.BRUSH_SAND, SoundEvents.BRUSH_SAND_COMPLETED, properties),
            BlockBehaviour.Properties.of()
                    .sound(SoundType.SUSPICIOUS_SAND)
                    .strength(.25f)
                    .instrument(NoteBlockInstrument.SNARE)
                    .pushReaction(PushReaction.DESTROY)
    );
    public static final RegistryObject<Block, Block> SEAGLASS_GRAVEL = registerBlock(
            "seaglass_gravel",
            properties -> new BrushableBlock(Blocks.GRAVEL, SoundEvents.BRUSH_GRAVEL, SoundEvents.BRUSH_GRAVEL_COMPLETED, properties),
            BlockBehaviour.Properties.of()
                    .sound(SoundType.SUSPICIOUS_GRAVEL)
                    .strength(.25f)
                    .instrument(NoteBlockInstrument.SNARE)
                    .pushReaction(PushReaction.DESTROY)
    );

    //TODO: copper chain connect blockstate
    public static final RegistryObject<Block, Block> RUSTED_ANCHOR = registerBlock(
            "rusted_anchor",
            RustedAnchorBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(4f)
                    .sound(SoundType.METAL)
    );
    public static final RegistryObject<Block, Block> LIFE_PRESERVER = registerBlock(
            "life_preserver",
            LifePreserverBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.6f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> DISPLAYED_OARS = registerBlock(
            "displayed_oars",
            DisplayedOarsBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .sound(SoundType.CHISELED_BOOKSHELF)
                    .noOcclusion()
                    .noCollision()
    );
    //TODO: vérifier toprim / fullface etc...
    public static final RegistryObject<Block, Block> TREASURE_MAP = registerBlock(
            "treasure_map",
            TreasureMapBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.1f)
                    .sound(SoundType.WOOL)
                    .noCollision()
    );
    //TODO: scattered papers model offset
    public static final RegistryObject<Block, Block> SCATTERED_PAPERS = registerBlock(
            "scattered_papers",
            ScatteredPapersBlock::new,
            BlockBehaviour.Properties.of()
                    .instabreak()
                    .sound(SoundType.WOOL)
                    .noCollision()
    );
    public static final RegistryObject<Block, Block> POSTERS = registerBlock(
            "posters",
            PostersBlock::new,
            BlockBehaviour.Properties.of()
                    .instabreak()
                    .sound(SoundType.WOOL)
                    .noCollision()
    );
    public static final RegistryObject<Block, Block> PAPER_STACK = registerBlock(
            "paper_stack",
            PaperStackBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.1f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> GLASS_BUOY = registerBlock(
            "glass_buoy",
            GlassBuoyBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.GLASS)
    );
    public static final RegistryObject<Block, Block> SMALL_GLASS_BUOYS = registerBlock(
            "small_glass_buoys",
            SmallGlassBuoysBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.GLASS)
    );
    public static final RegistryObject<Block, Block> WOODEN_BUOYS = registerBlock(
            "wooden_buoys",
            WoodenBuoysBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.WOOD)
                    .noOcclusion()
    );
    //TODO: conditional blockstate to connect rope to coiled rope
    public static final RegistryObject<Block, Block> ROPE = registerBlock(
            "rope",
            ChainBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> COILED_ROPE = registerBlock(
            "coiled_rope",
            CoiledRopeBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> HANGING_COD = registerBlock(
            "hanging_cod",
            HangingFishBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.SLIME_BLOCK)
                    .noCollision()
    );
    public static final RegistryObject<Block, Block> HANGING_SALMON = registerBlock(
            "hanging_salmon",
            HangingFishBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.SLIME_BLOCK)
                    .noCollision()
    );
    public static final RegistryObject<Block, Block> HANGING_KNIVES = registerBlock(
            "hanging_knives",
            HangingKnivesBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .sound(SoundType.WOOD)
                    .noCollision()
    );
    public static final RegistryObject<Block, Block> WEDGED_KNIFE = registerBlock(
            "wedged_knife",
            WedgedKnifeBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.METAL)
                    .noCollision()
    );
    public static final RegistryObject<Block, Block> WEDGED_CLEAVER = registerBlock(
            "wedged_cleaver",
            WedgedKnifeBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.METAL)
                    .noCollision()
    );
    public static final RegistryObject<Block, Block> CUTTING_BOARD = registerBlock(
            "cutting_board",
            CuttingBoardBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.7f)
                    .sound(SoundType.WOOD)
    );
    public static final RegistryObject<Block, Block> KNIFE_AND_CUTTING_BOARD = registerBlock(
            "knife_and_cutting_board",
            CuttingBoardBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.7f)
                    .sound(SoundType.WOOD)
    );
    public static final RegistryObject<Block, Block> IRON_FRYING_PAN = registerBlock(
            "iron_frying_pan",
            FryingPanBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.METAL)
    );
    public static final RegistryObject<Block, Block> COPPER_FRYING_PAN = registerBlock(
            "copper_frying_pan",
            FryingPanBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.COPPER)
    );
    public static final RegistryObject<Block, Block> BIG_COOKING_POT = registerBlock(
            "big_cooking_pot",
            BigCookingPotBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.METAL)
    );
    public static final RegistryObject<Block, Block> POTS_AND_PANS = registerBlock(
            "pots_and_pans",
            PotsAndPansBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.METAL)
    );
    public static final RegistryObject<Block, Block> DECORATIVE_BOWL = registerBlockWithoutItem("decorative_bowl",
            DecorativeBowlBlock::new,
            BlockBehaviour.Properties.of()
                    .instabreak()
                    .sound(SoundType.WOOD)
    );
    public static final RegistryObject<Block, Block> JARS = registerBlock(
            "jars",
            JarsBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.GLASS)
    );
    public static final RegistryObject<Block, Block> HONEY_JAR = registerBlock(
            "honey_jar",
            HoneyJarBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.GLASS)
    );
    public static final RegistryObject<Block, Block> INK_AND_QUILL = registerBlock(
            "ink_and_quill",
            InkAndQuillBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.GLASS)
    );
    public static final RegistryObject<Block, Block> CLUTTERED_SMALL_SHELF = registerBlock(
            "cluttered_small_shelf",
            ClutteredSmallShelfBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .sound(SoundType.WOOD)
    );
    public static final RegistryObject<Block, Block> EMPTY_SMALL_SHELF = registerBlock(
            "empty_small_shelf",
            EmptySmallShelfBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .sound(SoundType.WOOD)
    );
    public static final RegistryObject<Block, Block> SMALL_BOOKSHELF = registerBlock(
            "small_bookshelf",
            SmallBookshelfBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .sound(SoundType.WOOD)
    );
    public static final RegistryObject<Block, Block> BOOKS = registerBlock(
            "books",
            BooksBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.5f)
                    .sound(SoundType.WOOD)
    );
    public static final RegistryObject<Block, Block> BOOK_STACK = registerBlock(
            "book_stack",
            BookStackBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.5f)
                    .sound(SoundType.WOOD)
    );
    public static final RegistryObject<Block, Block> GLOBE = registerBlock(
            "globe",
            GlobeBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.METAL)
    );
    public static final RegistryObject<Block, Block> VINTAGE_GLOBE = registerBlock(
            "vintage_globe",
            GlobeBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.METAL)
    );
    public static final RegistryObject<Block, Block> BOVINE_SKULL = registerBlock(
            "bovine_skull",
            BovineSkullBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.5f)
                    .sound(SoundType.BONE_BLOCK)
    );
    public static final RegistryObject<Block, Block> EQUINE_SKULL = registerBlock(
            "equine_skull",
            EquineSkullBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.5f)
                    .sound(SoundType.BONE_BLOCK)
    );
    public static final RegistryObject<Block, Block> CANINE_SKULL = registerBlock(
            "canine_skull",
            CanineSkullBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.5f)
                    .sound(SoundType.BONE_BLOCK)
    );
    public static final RegistryObject<Block, Block> FISH_BONES = registerBlock(
            "fish_bones",
            FishBonesBlock::new,
            BlockBehaviour.Properties.of()
                    .instabreak()
                    .sound(SoundType.BONE_BLOCK)
                    .noCollision()
    );
    public static final RegistryObject<Block, Block> SMALL_SHARK_JAW = registerBlock(
            "small_shark_jaw",
            SmallSharkJawBlock::new,
            BlockBehaviour.Properties.of()
                    .instabreak()
                    .sound(SoundType.BONE_BLOCK)
                    .noOcclusion()
                    .noCollision()
    );
    //TODO: trouver un moyen de changer les placement rules parce que là j'aime pas
    public static final RegistryObject<Block, Block> BIG_SHARK_JAW = registerBlock(
            "big_shark_jaw",
            BigSharkJawBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.3f)
                    .sound(SoundType.BONE_BLOCK)
                    .noOcclusion()
                    .noCollision()
    );
    public static final RegistryObject<Block, Block> MEGALODON_TOOTH = registerBlock(
            "megalodon_tooth",
            SmallSharkJawBlock::new,
            BlockBehaviour.Properties.of()
                    .instabreak()
                    .sound(SoundType.BONE_BLOCK)
                    .noOcclusion()
                    .noCollision()
    );
    public static final RegistryObject<Block, Block> FISHING_LURES = registerBlock(
            "fishing_lures",
            FishingLuresBlock::new,
            BlockBehaviour.Properties.of()
                    .instabreak()
                    .sound(SoundType.BONE_BLOCK)
                    .noOcclusion()
                    .noCollision()
    );

    public static final RegistryObject<Block, Block> STONE_MARINE_FOSSIL = registerBlock(
            "stone_marine_fossil",
            BlockBehaviour.Properties.of()
                    .sound(SoundType.STONE)
                    .strength(1.25f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> DEEPSLATE_MARINE_FOSSIL = registerBlock(
            "deepslate_marine_fossil",
            BlockBehaviour.Properties.of()
                    .sound(SoundType.DEEPSLATE)
                    .strength(2.5f)
                    .requiresCorrectToolForDrops()
    );

    //TODO: custom sounds
    public static final RegistryObject<Block, Block> GOLD_COINS_BLOCK = registerBlock(
            "gold_coins_block",
            BlockBehaviour.Properties.of()
                    .strength(6f)
                    .sound(SoundType.METAL)
    );
    public static final RegistryObject<Block, Block> GOLD_COINS_LAYER = registerBlock(
            "gold_coins",
            GoldCoinsLayerBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.6f)
                    .sound(SoundType.METAL)
                    .isViewBlocking((state, level, pos) -> state.getValue(GoldCoinsLayerBlock.LAYERS) >= 8)
    );
    public static final RegistryObject<Block, Block> SCATTERED_GOLD_COINS = registerBlock(
            "scattered_gold_coins",
            ScatteredGoldCoinsBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.METAL)
    );

    /* TODO: to be revised
    public static final RegistryObject<Block, Block> SANDSTONE_TILE_BLOCK = registerBlock(
            "sandstone_tile",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.TUFF)
            );
    public static final RegistryObject<Block, Block> SANDSTONE_TILE_STAIRS = registerBlock(
            "sandstone_tile_stairs",
            StairBlock(ModBlocks.SANDSTONE_TILE_BLOCK.get().defaultBlockState(),::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.TUFF)
            );
    public static final RegistryObject<Block, Block> SANDSTONE_TILE_SLAB = registerBlock(
            "sandstone_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.TUFF)
            );
    public static final RegistryObject<Block, Block> MOSAIC_SANDSTONE_TILE_BLOCK = registerBlock(
            "mosaic_sandstone_tile",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.TUFF)
            );
    */

    public static final RegistryObject<Block, Block> BIG_NAUTILUS_SHELL = registerBlock(
            "big_nautilus_shell",
            BigNautilusShellBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.BONE_BLOCK)
    );
    public static final RegistryObject<Block, Block> BIG_NAUTILUS_LANTERN = registerBlock(
            "big_nautilus_lantern",
            BigNautilusLanternBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.BONE_BLOCK)
                    .lightLevel(value -> 15)
    );
    //TODO: vanilla item placeable, like the decorative bowl?
    public static final RegistryObject<Block, Block> SMALL_NAUTILUS_SHELL = registerBlock(
            "small_nautilus_shell",
            SmallNautilusShellBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.BONE_BLOCK)
    );
    public static final RegistryObject<Block, Block> COLD_NAUTILUS_WIND_CHIME = registerBlock(
            "cold_nautilus_wind_chime",
            NautilusWindChimeBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1f)
                    .sound(SoundType.SMALL_AMETHYST_BUD)
    );

    public static final RegistryObject<Block, Block> BURLAP_BLOCK = registerBlock(
            "burlap_block",
            BlockBehaviour.Properties.of()
                    .strength(.6f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> BURLAP_STAIRS = registerBlock(
            "burlap_stairs",
            properties -> new StairBlock(BURLAP_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.6f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> BURLAP_SLAB = registerBlock(
            "burlap_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.6f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> BURLAP_CARPET = registerBlock(
            "burlap_carpet",
            CarpetBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> BURLAP_AWNING = registerBlock(
            "burlap_awning",
            WoolAwningBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
    );
    //TODO: shift-left click to break one "layer" at a time?
    public static final RegistryObject<Block, Block> BURLAP_SACK = registerBlock(
            "burlap_sack",
            BurlapSackBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
    );

    public static final RegistryObject<Block, Block> SAILOR_FLAG = registerBlock(
            "sailor_flag",
            SailorFlagBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOD)
    );
    public static final RegistryObject<Block, Block> SAILOR_PENNON = registerBlock(
            "sailor_pennon",
            SailorPennonBlock::new,
            BlockBehaviour.Properties.of()
                    .instabreak()
                    .sound(SoundType.WOOD)
                    .noOcclusion()
                    .noCollision()
    );
    //TODO: dynamic itemModel depending on amount of items in inventory? (might be a post-1.21.4 feature only)
    public static final RegistryObject<Block, Block> CERAMIC_POT = registerBlock(
            "ceramic_pot",
            CeramicPotBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.DECORATED_POT)
                    .noOcclusion()
    );
    public static final RegistryObject<Block, Block> GLAZED_CERAMIC_POT = registerBlock(
            "glazed_ceramic_pot",
            CeramicPotBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.DECORATED_POT)
                    .noOcclusion()
    );
    public static final RegistryObject<Block, Block> VINTAGE_CASH_REGISTER = registerBlock(
            "vintage_cash_register",
            VintageCashRegisterBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.5f)
                    .sound(SoundType.COPPER)
    );
    public static final RegistryObject<Block, Block> HANGING_SAUSAGES = registerBlock(
            "hanging_sausages",
            HangingSausagesBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.HONEY_BLOCK)
    );
    public static final RegistryObject<Block, Block> WRAPPED_MEAT = registerBlock(
            "wrapped_meat",
            WrappedMeatBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.SLIME_BLOCK)
                    .noOcclusion()
    );
    public static final RegistryObject<Block, Block> COWHIDE_RUG = registerBlock(
            "cowhide_rug",
            CowhideRugBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> MOOSHROOM_COWHIDE_RUG = registerBlock(
            "mooshroom_cowhide_rug",
            MooshroomCowhideRugBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
    );

    public static final RegistryObject<Block, Block> COPPER_LIGHT = registerBlock(
            "copper_light",
            properties -> new WeatheringCopperLightBlock(WeatheringCopper.WeatherState.UNAFFECTED, properties),
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.COPPER)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)
    );
    public static final RegistryObject<Block, Block> WAXED_COPPER_LIGHT = registerBlock(
            "waxed_copper_light",
            CopperLightBlock::new,
            () -> COPPER_LIGHT.get()
    );
    public static final RegistryObject<Block, Block> SHODDY_COPPER_LIGHT = registerBlock(
            "shoddy_copper_light",
            properties -> new WeatheringShoddyCopperLightBlock(WeatheringCopper.WeatherState.EXPOSED, properties),
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.COPPER)
                    .lightLevel(state -> state.getValue(BlockStateProperties.LIT) ? 15 : 0)
    );
    public static final RegistryObject<Block, Block> WAXED_SHODDY_COPPER_LIGHT = registerBlock(
            "waxed_shoddy_copper_light",
            ShoddyCopperLightBlock::new,
            () -> SHODDY_COPPER_LIGHT.get()
    );

    public static final RegistryObject<Block, Block> CAMERA_QUADROPOD = registerBlock(
            "camera_quadropod",
            CameraQuadropodBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.COPPER)
    );
    //TODO: use animation? (like the spyglass or something)
    public static final RegistryObject<Block, Block> CAMERA = registerBlock(
            "camera",
            CameraBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.COPPER)
    );
    public static final RegistryObject<Block, Block> MOVIE_CAMERA = registerBlock(
            "movie_camera",
            CameraBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.COPPER)
    );

    public static final RegistryObject<Block, Block> WICKER_BLOCK = registerBlock(
            "wicker",
            BlockBehaviour.Properties.of()
                    .strength(.5f)
                    .sound(SoundType.BAMBOO)
    );
    public static final RegistryObject<Block, Block> WICKER_STAIRS = registerBlock(
            "wicker_stairs",
            properties -> new StairBlock(WICKER_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.5f)
                    .sound(SoundType.BAMBOO)
    );
    public static final RegistryObject<Block, Block> WICKER_SLAB = registerBlock(
            "wicker_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.5f)
                    .sound(SoundType.BAMBOO)
    );
    public static final RegistryObject<Block, Block> WICKER_BASKET = registerBlock(
            "wicker_basket",
            WickerBasketBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.BAMBOO)
    );
    public static final RegistryObject<Block, Block> APPLE_WICKER_BASKET = registerBlock(
            "apple_wicker_basket",
            WickerBasketBlock::new,
            () -> WICKER_BASKET.get()
    );
    public static final RegistryObject<Block, Block> SWEET_BERRIES_WICKER_BASKET = registerBlock(
            "sweet_berries_wicker_basket",
            WickerBasketBlock::new,
            () -> WICKER_BASKET.get()
    );
    public static final RegistryObject<Block, Block> GLOW_BERRIES_WICKER_BASKET = registerBlock(
            "glow_berries_wicker_basket",
            WickerBasketBlock::new,
            () -> WICKER_BASKET.get()
    );
    public static final RegistryObject<Block, Block> CARROT_WICKER_BASKET = registerBlock(
            "carrot_wicker_basket",
            WickerBasketBlock::new,
            () -> WICKER_BASKET.get()
    );
    public static final RegistryObject<Block, Block> POTATO_WICKER_BASKET = registerBlock(
            "potato_wicker_basket",
            WickerBasketBlock::new,
            () -> WICKER_BASKET.get()
    );
    public static final RegistryObject<Block, Block> BEETROOT_WICKER_BASKET = registerBlock(
            "beetroot_wicker_basket",
            WickerBasketBlock::new,
            () -> WICKER_BASKET.get()
    );
    public static final RegistryObject<Block, Block> SEA_PICKLE_WICKER_BASKET = registerBlock(
            "sea_pickle_wicker_basket",
            WickerBasketBlock::new,
            () -> WICKER_BASKET.get()
    );
    public static final RegistryObject<Block, Block> COD_WICKER_BASKET = registerBlock(
            "cod_wicker_basket",
            WickerBasketBlock::new,
            () -> WICKER_BASKET.get()
    );
    public static final RegistryObject<Block, Block> SALMON_WICKER_BASKET = registerBlock(
            "salmon_wicker_basket",
            WickerBasketBlock::new,
            () -> WICKER_BASKET.get()
    );
    public static final RegistryObject<Block, Block> PINK_PETALS_WICKER_BASKET = registerBlock(
            "pink_petals_wicker_basket",
            WickerBasketBlock::new,
            () -> WICKER_BASKET.get()
    );
    public static final RegistryObject<Block, Block> LILAC_WICKER_BASKET = registerBlock(
            "lilac_wicker_basket",
            WickerBasketBlock::new,
            () -> WICKER_BASKET.get()
    );
    public static final RegistryObject<Block, Block> ROSE_BUSH_WICKER_BASKET = registerBlock(
            "rose_bush_wicker_basket",
            WickerBasketBlock::new,
            () -> WICKER_BASKET.get()
    );
    public static final RegistryObject<Block, Block> PEONY_WICKER_BASKET = registerBlock(
            "peony_wicker_basket",
            WickerBasketBlock::new,
            () -> WICKER_BASKET.get()
    );

    public static final RegistryObject<Block, Block> GOURD = registerBlock(
            "gourd",
            GourdBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOD)
    );
    public static final RegistryObject<Block, Block> HANGING_GOURDS = registerBlock(
            "hanging_gourds",
            HangingGourdsBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOD)
    );
    public static final RegistryObject<Block, Block> CARVED_BEETROOT = registerBlock(
            "carved_beetroot",
            CarvedBeetrootBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOD)
    );
    public static final RegistryObject<Block, Block> BEET_O_LANTERN = registerBlock(
            "beet_o_lantern",
            CarvedBeetrootBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOD)
                    .lightLevel(state -> 3 + 4 * state.getValue(CarvedBeetrootBlock.AMOUNT))
    );
    public static final RegistryObject<Block, Block> BEETROOT_SCARECROW = registerBlock(
            "beetroot_scarecrow",
            properties -> new ScarecrowBlock(ScarecrowBlock.Types.BEETROOT, properties),
            BlockBehaviour.Properties.of()
                    .strength(.4f)
                    .sound(SoundType.GRASS)
    );
    public static final RegistryObject<Block, Block> PUMPKIN_SCARECROW = registerBlock(
            "pumpkin_scarecrow",
            properties -> new ScarecrowBlock(ScarecrowBlock.Types.PUMPKIN, properties),
            BlockBehaviour.Properties.of()
                    .strength(.4f)
                    .sound(SoundType.GRASS)
    );
    //TODO: Snowman's shape
    public static final RegistryObject<Block, Block> MINI_SNOWMAN = registerBlock(
            "mini_snowman",
            MiniSnowmanBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.1f)
                    .sound(SoundType.SNOW)
    );
    public static final RegistryObject<Block, Block> PLUSHIE = registerBlock(
            "plushie",
            PlushieBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> NUTCRACKER = registerBlock(
            "nutcracker",
            NutcrackerBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.2f)
                    .sound(SoundType.WOOD)
    );
    public static final RegistryObject<Block, Block> FALL_GARLAND = registerBlock(
            "fall_garland",
            GarlandBlock::new,
            BlockBehaviour.Properties.of()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .noCollision()
    );
    public static final RegistryObject<Block, Block> WINTER_GARLAND = registerBlock(
            "winter_garland",
            GarlandBlock::new,
            BlockBehaviour.Properties.of()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .noCollision()
    );
    //TODO: canSurvive à revoir
    public static final RegistryObject<Block, Block> WINTER_WREATH = registerBlock(
            "winter_wreath",
            WinterWreathBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.1f)
                    .sound(SoundType.GRASS)
                    .noCollision()
    );
    public static final RegistryObject<Block, Block> FAIRY_LIGHTS = registerBlock(
            "fairy_lights",
            GarlandBlock::new,
            BlockBehaviour.Properties.of()
                    .instabreak()
                    .sound(SoundType.WOOD)
                    .noOcclusion()
                    .noCollision()
                    .lightLevel(value -> 6)
    );
    public static final RegistryObject<Block, Block> HOLIDAY_ORNAMENTS = registerBlock(
            "holiday_ornaments",
            HolidaysOrnamentsBlock::new,
            BlockBehaviour.Properties.of()
                    .instabreak()
                    .sound(SoundType.WOOD)
                    .noCollision()
    );
    public static final RegistryObject<Block, Block> GIANT_ANCHOR = registerBlock(
            "giant_anchor",
            GiantAnchorBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> GIANT_CHAIN = registerBlock(
            "giant_chain",
            GiantChainBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
    );

    public static final RegistryObject<Block, Block> SEASTONE_BLOCK = registerBlock(
            "seastone",
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SEASTONE_STAIRS = registerBlock(
            "seastone_stairs",
            properties -> new StairBlock(SEASTONE_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SEASTONE_SLAB = registerBlock(
            "seastone_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SEASTONE_WALL = registerBlock(
            "seastone_wall",
            WallBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SEASTONE_BRICKS = registerBlock(
            "seastone_bricks",
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> CHISELED_SEASTONE_BRICKS = registerBlock(
            "chiseled_seastone_bricks",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SEASTONE_BRICK_STAIRS = registerBlock(
            "seastone_brick_stairs",
            properties -> new StairBlock(SEASTONE_BRICKS.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SEASTONE_BRICK_SLAB = registerBlock(
            "seastone_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SEASTONE_BRICK_WALL = registerBlock(
            "seastone_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SMOOTH_SEASTONE_BLOCK = registerBlock(
            "smooth_seastone",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SMOOTH_SEASTONE_STAIRS = registerBlock(
            "smooth_seastone_stairs",
            properties -> new StairBlock(SMOOTH_SEASTONE_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SMOOTH_SEASTONE_SLAB = registerBlock(
            "smooth_seastone_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SMOOTH_SEASTONE_WALL = registerBlock(
            "smooth_seastone_wall",
            WallBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> CORAL_EMBEDDED_SEASTONE_BRICKS = registerBlock(
            "coral_embedded_seastone_bricks",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> CORAL_EMBEDDED_SEASTONE_BRICK_STAIRS = registerBlock(
            "coral_embedded_seastone_brick_stairs",
            properties -> new StairBlock(CORAL_EMBEDDED_SEASTONE_BRICKS.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> CORAL_EMBEDDED_SEASTONE_BRICK_SLAB = registerBlock(
            "coral_embedded_seastone_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> CORAL_EMBEDDED_SEASTONE_BRICK_WALL = registerBlock(
            "coral_embedded_seastone_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SNOWY_COBBLESTONE_BLOCK = registerBlock(
            "snowy_cobblestone",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SNOWY_COBBLESTONE_STAIRS = registerBlock(
            "snowy_cobblestone_stairs",
            properties -> new StairBlock(SNOWY_COBBLESTONE_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SNOWY_COBBLESTONE_SLAB = registerBlock(
            "snowy_cobblestone_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SNOWY_COBBLESTONE_WALL = registerBlock(
            "snowy_cobblestone_wall",
            WallBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SNOWY_STONE_BRICKS = registerBlock(
            "snowy_stone_bricks",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SNOWY_STONE_BRICK_STAIRS = registerBlock(
            "snowy_stone_brick_stairs",
            properties -> new StairBlock(SNOWY_STONE_BRICKS.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SNOWY_STONE_BRICK_SLAB = registerBlock(
            "snowy_stone_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SNOWY_STONE_BRICK_WALL = registerBlock(
            "snowy_stone_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SMOOTH_STONE_BRICKS = registerBlock(
            "smooth_stone_bricks",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SMOOTH_STONE_BRICK_STAIRS = registerBlock(
            "smooth_stone_brick_stairs",
            properties -> new StairBlock(SMOOTH_STONE_BRICKS.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SMOOTH_STONE_BRICK_SLAB = registerBlock(
            "smooth_stone_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SMOOTH_STONE_BRICK_WALL = registerBlock(
            "smooth_stone_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );

    public static final RegistryObject<Block, Block> PLAIN_CUSHION_BLOCK = registerBlock(
            "plain_cushion",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> PLAIN_CUSHION_STAIRS = registerBlock(
            "plain_cushion_stairs",
            properties -> new StairBlock(PLAIN_CUSHION_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> PLAIN_CUSHION_SLAB = registerBlock(
            "plain_cushion_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> WHITE_CUSHION_BLOCK = registerBlock(
            "white_cushion",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> WHITE_CUSHION_STAIRS = registerBlock(
            "white_cushion_stairs",
            properties -> new StairBlock(WHITE_CUSHION_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> WHITE_CUSHION_SLAB = registerBlock(
            "white_cushion_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> LIGHT_GRAY_CUSHION_BLOCK = registerBlock(
            "light_gray_cushion",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> LIGHT_GRAY_CUSHION_STAIRS = registerBlock(
            "light_gray_cushion_stairs",
            properties -> new StairBlock(LIGHT_GRAY_CUSHION_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> LIGHT_GRAY_CUSHION_SLAB = registerBlock(
            "light_gray_cushion_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> GRAY_CUSHION_BLOCK = registerBlock(
            "gray_cushion",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> GRAY_CUSHION_STAIRS = registerBlock(
            "gray_cushion_stairs",
            properties -> new StairBlock(GRAY_CUSHION_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> GRAY_CUSHION_SLAB = registerBlock(
            "gray_cushion_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> BLACK_CUSHION_BLOCK = registerBlock(
            "black_cushion",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> BLACK_CUSHION_STAIRS = registerBlock(
            "black_cushion_stairs",
            properties -> new StairBlock(BLACK_CUSHION_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> BLACK_CUSHION_SLAB = registerBlock(
            "black_cushion_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> BROWN_CUSHION_BLOCK = registerBlock(
            "brown_cushion",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> BROWN_CUSHION_STAIRS = registerBlock(
            "brown_cushion_stairs",
            properties -> new StairBlock(BROWN_CUSHION_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> BROWN_CUSHION_SLAB = registerBlock(
            "brown_cushion_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> RED_CUSHION_BLOCK = registerBlock(
            "red_cushion",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> RED_CUSHION_STAIRS = registerBlock(
            "red_cushion_stairs",
            properties -> new StairBlock(RED_CUSHION_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> RED_CUSHION_SLAB = registerBlock(
            "red_cushion_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> ORANGE_CUSHION_BLOCK = registerBlock(
            "orange_cushion",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> ORANGE_CUSHION_STAIRS = registerBlock(
            "orange_cushion_stairs",
            properties -> new StairBlock(ORANGE_CUSHION_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> ORANGE_CUSHION_SLAB = registerBlock(
            "orange_cushion_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> YELLOW_CUSHION_BLOCK = registerBlock(
            "yellow_cushion",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> YELLOW_CUSHION_STAIRS = registerBlock(
            "yellow_cushion_stairs",
            properties -> new StairBlock(YELLOW_CUSHION_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> YELLOW_CUSHION_SLAB = registerBlock(
            "yellow_cushion_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> LIME_CUSHION_BLOCK = registerBlock(
            "lime_cushion",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> LIME_CUSHION_STAIRS = registerBlock(
            "lime_cushion_stairs",
            properties -> new StairBlock(LIME_CUSHION_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> LIME_CUSHION_SLAB = registerBlock(
            "lime_cushion_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> GREEN_CUSHION_BLOCK = registerBlock(
            "green_cushion",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> GREEN_CUSHION_STAIRS = registerBlock(
            "green_cushion_stairs",
            properties -> new StairBlock(GREEN_CUSHION_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> GREEN_CUSHION_SLAB = registerBlock(
            "green_cushion_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> CYAN_CUSHION_BLOCK = registerBlock(
            "cyan_cushion",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> CYAN_CUSHION_STAIRS = registerBlock(
            "cyan_cushion_stairs",
            properties -> new StairBlock(CYAN_CUSHION_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> CYAN_CUSHION_SLAB = registerBlock(
            "cyan_cushion_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> LIGHT_BLUE_CUSHION_BLOCK = registerBlock(
            "light_blue_cushion",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> LIGHT_BLUE_CUSHION_STAIRS = registerBlock(
            "light_blue_cushion_stairs",
            properties -> new StairBlock(LIGHT_BLUE_CUSHION_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> LIGHT_BLUE_CUSHION_SLAB = registerBlock(
            "light_blue_cushion_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> BLUE_CUSHION_BLOCK = registerBlock(
            "blue_cushion",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> BLUE_CUSHION_STAIRS = registerBlock(
            "blue_cushion_stairs",
            properties -> new StairBlock(BLUE_CUSHION_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> BLUE_CUSHION_SLAB = registerBlock(
            "blue_cushion_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> PURPLE_CUSHION_BLOCK = registerBlock(
            "purple_cushion",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> PURPLE_CUSHION_STAIRS = registerBlock(
            "purple_cushion_stairs",
            properties -> new StairBlock(PURPLE_CUSHION_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> PURPLE_CUSHION_SLAB = registerBlock(
            "purple_cushion_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> MAGENTA_CUSHION_BLOCK = registerBlock(
            "magenta_cushion",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> MAGENTA_CUSHION_STAIRS = registerBlock(
            "magenta_cushion_stairs",
            properties -> new StairBlock(MAGENTA_CUSHION_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> MAGENTA_CUSHION_SLAB = registerBlock(
            "magenta_cushion_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> PINK_CUSHION_BLOCK = registerBlock(
            "pink_cushion",
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> PINK_CUSHION_STAIRS = registerBlock(
            "pink_cushion_stairs",
            properties -> new StairBlock(PINK_CUSHION_BLOCK.get().defaultBlockState(), properties),
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );
    public static final RegistryObject<Block, Block> PINK_CUSHION_SLAB = registerBlock(
            "pink_cushion_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .sound(SoundType.WOOL)
    );

    public static final RegistryObject<Block, Block> SEASTONE_QUOIN = registerBlock(
            "seastone_quoin",
            QuoinBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SMOOTH_STONE_QUOIN = registerBlock(
            "smooth_stone_quoin",
            QuoinBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> POLISHED_GRANITE_QUOIN = registerBlock(
            "polished_granite_quoin",
            QuoinBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> POLISHED_DIORITE_QUOIN = registerBlock(
            "polished_diorite_quoin",
            QuoinBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> POLISHED_ANDESITE_QUOIN = registerBlock(
            "polished_andesite_quoin",
            QuoinBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> POLISHED_TUFF_QUOIN = registerBlock(
            "polished_tuff_quoin",
            QuoinBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> PACKED_MUD_QUOIN = registerBlock(
            "packed_mud_quoin",
            QuoinBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SANDSTONE_QUOIN = registerBlock(
            "sandstone_quoin",
            QuoinBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> RED_SANDSTONE_QUOIN = registerBlock(
            "red_sandstone_quoin",
            QuoinBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(.8f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> POLISHED_BLACKSTONE_QUOIN = registerBlock(
            "polished_blackstone_quoin",
            QuoinBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .requiresCorrectToolForDrops()
    );

    public static final RegistryObject<Block, Block> SEASTONE_MURAL = registerBlock(
            "seastone_mural",
            VerticalSlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> SMOOTH_STONE_MURAL = registerBlock(
            "smooth_stone_mural",
            VerticalSlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(2f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> GRANITE_MURAL = registerBlock(
            "granite_mural",
            VerticalSlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> DIORITE_MURAL = registerBlock(
            "diorite_mural",
            VerticalSlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
    );
    public static final RegistryObject<Block, Block> ANDESITE_MURAL = registerBlock(
            "andesite_mural",
            VerticalSlabBlock::new,
            BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
    );


    public static final RegistryObject<Block, Block> DUSTY_DECORATIONS_BARREL = registerBlock(
            "dusty_decorations_barrel",
            BarrelBlock::new,
            () -> ModBlocks.APPLE_BARREL.get()
    );

//TODO: piston behaviours
//TODO: propagateSkyLight
//TODO: item lore
//TODO: make all VoxelShapes protected instead of private?
//TODO: Check les cullfaces de TOUS les models


    private static RegistryObject<Block, Block> registerBlock(String name, BlockBehaviour.Properties properties) {
        Function<BlockBehaviour.Properties, Block> factory = Block::new;
        RegistryObject<Block, Block> toRegister = BLOCKS.register(name, () -> factory.apply(properties.setId(ResourceKey.create(Registries.BLOCK, ModConstants.identifierOf(name)))));
        registerBlockItem(name, toRegister);
        return toRegister;
    }
    private static RegistryObject<Block, Block> registerBlock(String name, Supplier<Block> copyPropertiesFrom) {
        Function<BlockBehaviour.Properties, Block> factory = Block::new;
        RegistryObject<Block, Block> toRegister = BLOCKS.register(name, () -> factory.apply(copyPropertiesFrom.get().properties().setId(ResourceKey.create(Registries.BLOCK, ModConstants.identifierOf(name)))));
        registerBlockItem(name, toRegister);
        return toRegister;
    }
    private static RegistryObject<Block, Block> registerBlock(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties properties) {
        RegistryObject<Block, Block> toRegister = BLOCKS.register(name, () -> factory.apply(properties.setId(ResourceKey.create(Registries.BLOCK, ModConstants.identifierOf(name)))));
        registerBlockItem(name, toRegister);
        return toRegister;
    }
    private static RegistryObject<Block, Block> registerBlock(String name, Function<BlockBehaviour.Properties, Block> factory, Supplier<Block> copyPropertiesFrom) {
        RegistryObject<Block, Block> toRegister = BLOCKS.register(name, () -> factory.apply(copyPropertiesFrom.get().properties().setId(ResourceKey.create(Registries.BLOCK, ModConstants.identifierOf(name)))));
        registerBlockItem(name, toRegister);
        return toRegister;
    }
    private static RegistryObject<Block, Block> registerBlockWithoutItem(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties properties) {
        return BLOCKS.register(name, () -> factory.apply(properties.setId(ResourceKey.create(Registries.BLOCK, ModConstants.identifierOf(name)))));
    }

    private static <T extends Block> void registerBlockItem(String name, Supplier<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ModConstants.identifierOf(name))).useBlockDescriptionPrefix()));
    }


    public static void registerModBlocks() {
        ModConstants.LOGGER.info("Registering Mod Blocks for " + ModConstants.MOD_ID);
    }
}
