package net.mhaks.dustydecorations.datagen;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.block.custom.*;
import net.mhaks.dustydecorations.registration.RegistryObject;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public static final String[] PLUSHIE_NAME = { "alex", "ari", "efe", "kai", "makena", "noor", "steve", "sunny", "zuri" };

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ModConstants.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        customHorizontalBlockWithItem(ModBlocks.DUSTY_DECORATIONS_BARREL);

        banisterBlockWithFlatItem(ModBlocks.OAK_BANISTER);
        banisterBlockWithFlatItem(ModBlocks.SPRUCE_BANISTER);
        banisterBlockWithFlatItem(ModBlocks.BIRCH_BANISTER);
        banisterBlockWithFlatItem(ModBlocks.JUNGLE_BANISTER);
        banisterBlockWithFlatItem(ModBlocks.ACACIA_BANISTER);
        banisterBlockWithFlatItem(ModBlocks.DARK_OAK_BANISTER);
        banisterBlockWithFlatItem(ModBlocks.MANGROVE_BANISTER);
        banisterBlockWithFlatItem(ModBlocks.CHERRY_BANISTER);
        banisterBlockWithFlatItem(ModBlocks.BAMBOO_BANISTER);
        banisterBlockWithFlatItem(ModBlocks.DRY_BAMBOO_BANISTER);
        banisterBlockWithFlatItem(ModBlocks.CRIMSON_BANISTER);
        banisterBlockWithFlatItem(ModBlocks.WARPED_BANISTER);

        customHorizontalBlockWithItem(ModBlocks.OAK_LARGE_SHELF);
        customHorizontalBlockWithItem(ModBlocks.SPRUCE_LARGE_SHELF);
        customHorizontalBlockWithItem(ModBlocks.BIRCH_LARGE_SHELF);
        customHorizontalBlockWithItem(ModBlocks.JUNGLE_LARGE_SHELF);
        customHorizontalBlockWithItem(ModBlocks.ACACIA_LARGE_SHELF);
        customHorizontalBlockWithItem(ModBlocks.DARK_OAK_LARGE_SHELF);
        customHorizontalBlockWithItem(ModBlocks.MANGROVE_LARGE_SHELF);
        customHorizontalBlockWithItem(ModBlocks.CHERRY_LARGE_SHELF);
        customHorizontalBlockWithItem(ModBlocks.BAMBOO_LARGE_SHELF);
        customHorizontalBlockWithItem(ModBlocks.CRIMSON_LARGE_SHELF);
        customHorizontalBlockWithItem(ModBlocks.WARPED_LARGE_SHELF);

        customHorizontalBlockWithItem(ModBlocks.APPLE_BARREL);
        customHorizontalBlockWithItem(ModBlocks.SWEET_BERRIES_BARREL);
        customHorizontalBlockWithItem(ModBlocks.GLOW_BERRIES_BARREL);
        customHorizontalBlockWithItem(ModBlocks.CARROT_BARREL);
        customHorizontalBlockWithItem(ModBlocks.POTATO_BARREL);
        customHorizontalBlockWithItem(ModBlocks.BEETROOT_BARREL);
        customHorizontalBlockWithItem(ModBlocks.SEA_PICKLE_BARREL);
        customHorizontalBlockWithItem(ModBlocks.COD_BARREL);
        customHorizontalBlockWithItem(ModBlocks.SALMON_BARREL);
        customHorizontalBlockWithItem(ModBlocks.EMPTY_BARREL);

        wallpaperWithItem(ModBlocks.SUNFLOWER_WALLPAPER_BLOCK);
        blockWithItem(ModBlocks.REGAL_WALLPAPER_BLOCK);
        wallpaperWithItem(ModBlocks.VINE_WALLPAPER_BLOCK);
        blockWithItem(ModBlocks.MONSTER_WALLPAPER_BLOCK);
        blockWithItem(ModBlocks.SAILOR_WALLPAPER_BLOCK);
        blockWithItem(ModBlocks.COPPER_WALLPAPER_BLOCK);
        stellarWallpaperWithItem();
        blockWithItem(ModBlocks.PUMPKIN_WALLPAPER_BLOCK);
        blockWithItem(ModBlocks.SOUL_WALLPAPER_BLOCK);
        blockWithItem(ModBlocks.FOREST_FESTIVE_WALLPAPER_BLOCK);
        blockWithItem(ModBlocks.STRIPED_FESTIVE_WALLPAPER_BLOCK);
        blockWithItem(ModBlocks.SNOWMEN_WALLPAPER_BLOCK);
        blockWithItem(ModBlocks.SNOWFLAKE_WALLPAPER_BLOCK);

        customHorizontalBlockWithItem(ModBlocks.WHITE_WOOL_AWNING);
        customHorizontalBlockWithItem(ModBlocks.LIGHT_GRAY_WOOL_AWNING);
        customHorizontalBlockWithItem(ModBlocks.GRAY_WOOL_AWNING);
        customHorizontalBlockWithItem(ModBlocks.BLACK_WOOL_AWNING);
        customHorizontalBlockWithItem(ModBlocks.BROWN_WOOL_AWNING);
        customHorizontalBlockWithItem(ModBlocks.RED_WOOL_AWNING);
        customHorizontalBlockWithItem(ModBlocks.ORANGE_WOOL_AWNING);
        customHorizontalBlockWithItem(ModBlocks.YELLOW_WOOL_AWNING);
        customHorizontalBlockWithItem(ModBlocks.LIME_WOOL_AWNING);
        customHorizontalBlockWithItem(ModBlocks.GREEN_WOOL_AWNING);
        customHorizontalBlockWithItem(ModBlocks.CYAN_WOOL_AWNING);
        customHorizontalBlockWithItem(ModBlocks.LIGHT_BLUE_WOOL_AWNING);
        customHorizontalBlockWithItem(ModBlocks.BLUE_WOOL_AWNING);
        customHorizontalBlockWithItem(ModBlocks.PURPLE_WOOL_AWNING);
        customHorizontalBlockWithItem(ModBlocks.MAGENTA_WOOL_AWNING);
        customHorizontalBlockWithItem(ModBlocks.PINK_WOOL_AWNING);

        paperLanternWithFlatItem(ModBlocks.PAPER_LANTERN);
        paperLanternWithFlatItem(ModBlocks.SAKURA_PAPER_LANTERN);
        paperLanternWithFlatItem(ModBlocks.TAIGA_PAPER_LANTERN);
        paperLanternWithFlatItem(ModBlocks.ORCHID_PAPER_LANTERN);
        paperLanternWithFlatItem(ModBlocks.PANDA_PAPER_LANTERN);
        paperLanternWithFlatItem(ModBlocks.VILLAGER_PAPER_LANTERN);
        paperLanternWithFlatItem(ModBlocks.CREEPER_PAPER_LANTERN);
        paperLanternWithFlatItem(ModBlocks.CHICKEN_JOCKEY_PAPER_LANTERN);
        paperLanternWithFlatItem(ModBlocks.PILLAGER_PAPER_LANTERN);
        paperLanternWithFlatItem(ModBlocks.WARDEN_PAPER_LANTERN);

        blockWithItem(ModBlocks.CORRUGATED_METAL_BLOCK);
        blockWithItem(ModBlocks.CORRUGATED_METAL_GRATE);
        stairsBlock((StairBlock) ModBlocks.CORRUGATED_METAL_STAIRS.get(), blockTexture(ModBlocks.CORRUGATED_METAL_BLOCK.get()));
            blockItem(ModBlocks.CORRUGATED_METAL_STAIRS);
        slabBlock((SlabBlock) ModBlocks.CORRUGATED_METAL_SLAB.get(), blockTexture(ModBlocks.CORRUGATED_METAL_BLOCK.get()), blockTexture(ModBlocks.CORRUGATED_METAL_BLOCK.get()));
            blockItem(ModBlocks.CORRUGATED_METAL_SLAB);
        fenceBlock((FenceBlock) ModBlocks.CORRUGATED_METAL_FENCE.get(), blockTexture(ModBlocks.CORRUGATED_METAL_BLOCK.get()));
            fenceItem(ModBlocks.CORRUGATED_METAL_FENCE, ModBlocks.CORRUGATED_METAL_BLOCK);
        fenceGateBlock((FenceGateBlock) ModBlocks.CORRUGATED_METAL_FENCE_GATE.get(), blockTexture(ModBlocks.CORRUGATED_METAL_BLOCK.get()));
            blockItem(ModBlocks.CORRUGATED_METAL_FENCE_GATE);
        doorBlock((DoorBlock) ModBlocks.CORRUGATED_METAL_DOOR.get(), modLoc("block/" + ModBlocks.CORRUGATED_METAL_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + ModBlocks.CORRUGATED_METAL_DOOR.getId().getPath() + "_top"));
            flatItem(ModBlocks.CORRUGATED_METAL_DOOR);
        trapdoorBlock((TrapDoorBlock) ModBlocks.CORRUGATED_METAL_TRAPDOOR.get(), blockTexture(ModBlocks.CORRUGATED_METAL_BLOCK.get()), true);
            blockItem(ModBlocks.CORRUGATED_METAL_TRAPDOOR, "_bottom");
        pressurePlateBlock((PressurePlateBlock) ModBlocks.CORRUGATED_METAL_PRESSURE_PLATE.get(), blockTexture(ModBlocks.CORRUGATED_METAL_BLOCK.get()));
            blockItem(ModBlocks.CORRUGATED_METAL_PRESSURE_PLATE);
        buttonBlock((ButtonBlock) ModBlocks.CORRUGATED_METAL_BUTTON.get(), blockTexture(ModBlocks.CORRUGATED_METAL_BLOCK.get()));
            buttonItem(ModBlocks.CORRUGATED_METAL_BUTTON, ModBlocks.CORRUGATED_METAL_BLOCK);
        customHorizontalBlockWithItem(ModBlocks.CORRUGATED_METAL_ROOFING);

        blockWithItem(ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK);
        blockWithItem(ModBlocks.RUSTED_CORRUGATED_METAL_GRATE);
        stairsBlock((StairBlock) ModBlocks.RUSTED_CORRUGATED_METAL_STAIRS.get(), blockTexture(ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.get()));
            blockItem(ModBlocks.RUSTED_CORRUGATED_METAL_STAIRS);
        slabBlock((SlabBlock) ModBlocks.RUSTED_CORRUGATED_METAL_SLAB.get(), blockTexture(ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.get()), blockTexture(ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.get()));
            blockItem(ModBlocks.RUSTED_CORRUGATED_METAL_SLAB);
        fenceBlock((FenceBlock) ModBlocks.RUSTED_CORRUGATED_METAL_FENCE.get(), blockTexture(ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.get()));
            fenceItem(ModBlocks.RUSTED_CORRUGATED_METAL_FENCE, ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK);
        fenceGateBlock((FenceGateBlock) ModBlocks.RUSTED_CORRUGATED_METAL_FENCE_GATE.get(), blockTexture(ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.get()));
            blockItem(ModBlocks.RUSTED_CORRUGATED_METAL_FENCE_GATE);
        doorBlock((DoorBlock) ModBlocks.RUSTED_CORRUGATED_METAL_DOOR.get(), modLoc("block/" + ModBlocks.RUSTED_CORRUGATED_METAL_DOOR.getId().getPath() + "_bottom"), modLoc("block/" + ModBlocks.RUSTED_CORRUGATED_METAL_DOOR.getId().getPath() + "_top"));
            flatItem(ModBlocks.RUSTED_CORRUGATED_METAL_DOOR);
        trapdoorBlock((TrapDoorBlock) ModBlocks.RUSTED_CORRUGATED_METAL_TRAPDOOR.get(), blockTexture(ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.get()), true);
            blockItem(ModBlocks.RUSTED_CORRUGATED_METAL_TRAPDOOR, "_bottom");
        pressurePlateBlock((PressurePlateBlock) ModBlocks.RUSTED_CORRUGATED_METAL_PRESSURE_PLATE.get(), blockTexture(ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.get()));
            blockItem(ModBlocks.RUSTED_CORRUGATED_METAL_PRESSURE_PLATE);
        buttonBlock((ButtonBlock) ModBlocks.RUSTED_CORRUGATED_METAL_BUTTON.get(), blockTexture(ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.get()));
            buttonItem(ModBlocks.RUSTED_CORRUGATED_METAL_BUTTON, ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK);
        customHorizontalBlockWithItem(ModBlocks.RUSTED_CORRUGATED_METAL_ROOFING);

        transparentBlockWithItem(ModBlocks.CREAM_SEAGLASS);
        transparentBlockWithItem(ModBlocks.HAZEL_SEAGLASS);
        transparentBlockWithItem(ModBlocks.LIQUORICE_SEAGLASS);
        transparentBlockWithItem(ModBlocks.MOCHA_SEAGLASS);
        transparentBlockWithItem(ModBlocks.SCARLET_SEAGLASS);
        transparentBlockWithItem(ModBlocks.HONEY_SEAGLASS);
        transparentBlockWithItem(ModBlocks.MINT_SEAGLASS);
        transparentBlockWithItem(ModBlocks.TEAL_SEAGLASS);
        transparentBlockWithItem(ModBlocks.CERULEAN_SEAGLASS);
        transparentBlockWithItem(ModBlocks.TAUPE_SEAGLASS);

        seaglassPaneBlockWithFlatItem(ModBlocks.CREAM_SEAGLASS_PANE, ModBlocks.CREAM_SEAGLASS);
        seaglassPaneBlockWithFlatItem(ModBlocks.HAZEL_SEAGLASS_PANE, ModBlocks.HAZEL_SEAGLASS);
        seaglassPaneBlockWithFlatItem(ModBlocks.LIQUORICE_SEAGLASS_PANE, ModBlocks.LIQUORICE_SEAGLASS);
        seaglassPaneBlockWithFlatItem(ModBlocks.MOCHA_SEAGLASS_PANE, ModBlocks.MOCHA_SEAGLASS);
        seaglassPaneBlockWithFlatItem(ModBlocks.SCARLET_SEAGLASS_PANE, ModBlocks.SCARLET_SEAGLASS);
        seaglassPaneBlockWithFlatItem(ModBlocks.HONEY_SEAGLASS_PANE, ModBlocks.HONEY_SEAGLASS);
        seaglassPaneBlockWithFlatItem(ModBlocks.MINT_SEAGLASS_PANE, ModBlocks.MINT_SEAGLASS);
        seaglassPaneBlockWithFlatItem(ModBlocks.TEAL_SEAGLASS_PANE, ModBlocks.TEAL_SEAGLASS);
        seaglassPaneBlockWithFlatItem(ModBlocks.CERULEAN_SEAGLASS_PANE, ModBlocks.CERULEAN_SEAGLASS);
        seaglassPaneBlockWithFlatItem(ModBlocks.TAUPE_SEAGLASS_PANE, ModBlocks.TAUPE_SEAGLASS);

        transparentBlockWithItem(ModBlocks.CREAM_SEA_WINDOW);
        transparentBlockWithItem(ModBlocks.HAZEL_SEA_WINDOW);
        transparentBlockWithItem(ModBlocks.LIQUORICE_SEA_WINDOW);
        transparentBlockWithItem(ModBlocks.MOCHA_SEA_WINDOW);
        transparentBlockWithItem(ModBlocks.SCARLET_SEA_WINDOW);
        transparentBlockWithItem(ModBlocks.HONEY_SEA_WINDOW);
        transparentBlockWithItem(ModBlocks.MINT_SEA_WINDOW);
        transparentBlockWithItem(ModBlocks.TEAL_SEA_WINDOW);
        transparentBlockWithItem(ModBlocks.CERULEAN_SEA_WINDOW);
        transparentBlockWithItem(ModBlocks.TAUPE_SEA_WINDOW);

        seaWindowPaneBlockWithFlatItem(ModBlocks.CREAM_SEA_WINDOW_PANE, ModBlocks.CREAM_SEA_WINDOW);
        seaWindowPaneBlockWithFlatItem(ModBlocks.HAZEL_SEA_WINDOW_PANE, ModBlocks.HAZEL_SEA_WINDOW);
        seaWindowPaneBlockWithFlatItem(ModBlocks.LIQUORICE_SEA_WINDOW_PANE, ModBlocks.LIQUORICE_SEA_WINDOW);
        seaWindowPaneBlockWithFlatItem(ModBlocks.MOCHA_SEA_WINDOW_PANE, ModBlocks.MOCHA_SEA_WINDOW);
        seaWindowPaneBlockWithFlatItem(ModBlocks.SCARLET_SEA_WINDOW_PANE, ModBlocks.SCARLET_SEA_WINDOW);
        seaWindowPaneBlockWithFlatItem(ModBlocks.HONEY_SEA_WINDOW_PANE, ModBlocks.HONEY_SEA_WINDOW);
        seaWindowPaneBlockWithFlatItem(ModBlocks.MINT_SEA_WINDOW_PANE, ModBlocks.MINT_SEA_WINDOW);
        seaWindowPaneBlockWithFlatItem(ModBlocks.TEAL_SEA_WINDOW_PANE, ModBlocks.TEAL_SEA_WINDOW);
        seaWindowPaneBlockWithFlatItem(ModBlocks.CERULEAN_SEA_WINDOW_PANE, ModBlocks.CERULEAN_SEA_WINDOW);
        seaWindowPaneBlockWithFlatItem(ModBlocks.TAUPE_SEA_WINDOW_PANE, ModBlocks.TAUPE_SEA_WINDOW);

        seaglassLampWithBlockItem(ModBlocks.CREAM_SEAGLASS_LAMP);
        seaglassLampWithBlockItem(ModBlocks.HAZEL_SEAGLASS_LAMP);
        seaglassLampWithBlockItem(ModBlocks.LIQUORICE_SEAGLASS_LAMP);
        seaglassLampWithBlockItem(ModBlocks.MOCHA_SEAGLASS_LAMP);
        seaglassLampWithBlockItem(ModBlocks.SCARLET_SEAGLASS_LAMP);
        seaglassLampWithBlockItem(ModBlocks.HONEY_SEAGLASS_LAMP);
        seaglassLampWithBlockItem(ModBlocks.MINT_SEAGLASS_LAMP);
        seaglassLampWithBlockItem(ModBlocks.TEAL_SEAGLASS_LAMP);
        seaglassLampWithBlockItem(ModBlocks.CERULEAN_SEAGLASS_LAMP);
        seaglassLampWithBlockItem(ModBlocks.TAUPE_SEAGLASS_LAMP);

        customHorizontalBlockWithItem(ModBlocks.RUSTED_ANCHOR);
        customDirectionalBlockWithItem(ModBlocks.LIFE_PRESERVER);
        customHorizontalBlockWithFlatItem(ModBlocks.DISPLAYED_OARS);
        customHorizontalFaceBlockWithFlatBlockItem(ModBlocks.TREASURE_MAP);
        scatteredPapersWithFlatItem();
        flatItem(ModBlocks.POSTERS);
        customHorizontalBlockWithItem(ModBlocks.PAPER_STACK);
        glassBuoyWithItem();
        smallGlassBuoysWithItem();
        woodenBuoysWithItem();
        customAxisBlockWithItem(ModBlocks.ROPE);
        customHorizontalBlockWithItem(ModBlocks.COILED_ROPE);
        customHorizontalBlockWithItem(ModBlocks.HANGING_COD);
        customHorizontalBlockWithItem(ModBlocks.HANGING_SALMON);
        customHorizontalBlockWithItem(ModBlocks.HANGING_KNIVES);
        customHorizontalFaceBlockWithItem(ModBlocks.WEDGED_KNIFE);
        customHorizontalFaceBlockWithItem(ModBlocks.WEDGED_CLEAVER);
        customHorizontalBlockWithItem(ModBlocks.CUTTING_BOARD);
        customHorizontalBlockWithItem(ModBlocks.KNIFE_AND_CUTTING_BOARD);
        blockItem(ModBlocks.IRON_FRYING_PAN);
        blockItem(ModBlocks.COPPER_FRYING_PAN);
        customHorizontalBlockWithItem(ModBlocks.BIG_COOKING_POT);
        potsAndPansWithFlatItem();
        customBlock(ModBlocks.DECORATIVE_BOWL);
        jarsWithItem();
        honeyJarWithFlatItem();
        customHorizontalBlockWithFlatItem(ModBlocks.INK_AND_QUILL);
        clutteredSmallShelfWithItem();
        customHorizontalBlockWithItem(ModBlocks.EMPTY_SMALL_SHELF);
        smallBookshelfWithItem();
        booksWithItem();
        bookStackWithItem();
        customHorizontalBlockWithItem(ModBlocks.GLOBE);
        customHorizontalBlockWithItem(ModBlocks.VINTAGE_GLOBE);
        customHorizontalFaceBlockWithFlatItem(ModBlocks.BOVINE_SKULL);
        customHorizontalFaceBlockWithFlatItem(ModBlocks.EQUINE_SKULL);
        customHorizontalFaceBlockWithFlatItem(ModBlocks.CANINE_SKULL);
        customHorizontalFaceBlockWithFlatItem(ModBlocks.FISH_BONES);
        customHorizontalFaceBlockWithFlatBlockItem(ModBlocks.SMALL_SHARK_JAW);
        customHorizontalFaceBlockWithFlatItem(ModBlocks.BIG_SHARK_JAW);
        customHorizontalFaceBlockWithFlatBlockItem(ModBlocks.MEGALODON_TOOTH);
        fishingLuresWithFlatItem();
        goldCoinsBlockWithItem();
        goldCoinsLayerWithFlatItem();
        scatteredGoldCoinsWithFlatBlockItem();

        blockWithItem(ModBlocks.SANDSTONE_TILE_BLOCK);
        stairsBlock((StairBlock) ModBlocks.SANDSTONE_TILE_STAIRS.get(), blockTexture(ModBlocks.SANDSTONE_TILE_BLOCK.get()));
            blockItem(ModBlocks.SANDSTONE_TILE_STAIRS);
        slabBlock((SlabBlock) ModBlocks.SANDSTONE_TILE_SLAB.get(), blockTexture(ModBlocks.SANDSTONE_TILE_BLOCK.get()), blockTexture(ModBlocks.SANDSTONE_TILE_BLOCK.get()));
            blockItem(ModBlocks.SANDSTONE_TILE_SLAB);
        blockWithItem(ModBlocks.MOSAIC_SANDSTONE_TILE_BLOCK);

        blockWithItem(ModBlocks.BURLAP_BLOCK);
        stairsBlock((StairBlock) ModBlocks.BURLAP_STAIRS.get(), blockTexture(ModBlocks.BURLAP_BLOCK.get()));
            blockItem(ModBlocks.BURLAP_STAIRS);
        slabBlock((SlabBlock) ModBlocks.BURLAP_SLAB.get(), blockTexture(ModBlocks.BURLAP_BLOCK.get()), blockTexture(ModBlocks.BURLAP_BLOCK.get()));
            blockItem(ModBlocks.BURLAP_SLAB);
        customBlockWithItem(ModBlocks.BURLAP_CARPET);
        customHorizontalBlockWithItem(ModBlocks.BURLAP_AWNING);
        burlapSackWithItem();

        sailorFlagWithItem();
        sailorPennantFlag();

        scarecrowWithItem(ModBlocks.BEETROOT_SCARECROW);
        scarecrowWithItem(ModBlocks.PUMPKIN_SCARECROW);
        threeStackedHorizontalBlockWithItem(ModBlocks.GOURD);
        customHorizontalBlockWithItem(ModBlocks.HANGING_GOURDS);
        threeStackedHorizontalBlockWithItem(ModBlocks.CARVED_BEETROOT);
        threeStackedHorizontalBlockWithItem(ModBlocks.BEET_O_LANTERN);

        tallBlockWithItem(ModBlocks.BEETROOT_SCARECROW);
        tallBlockWithItem(ModBlocks.PUMPKIN_SCARECROW);

        customHorizontalBlockWithItem(ModBlocks.MINI_SNOWMAN);
        plushieWithItem();
        customHorizontalBlockWithItem(ModBlocks.NUTCRACKER);
        customGarlandWithItem(ModBlocks.FALL_GARLAND);
        customGarlandWithItem(ModBlocks.WINTER_GARLAND);
        customDirectionalBlockWithItem(ModBlocks.WINTER_WREATH);
        customGarlandWithItem(ModBlocks.FAIRY_LIGHTS);
        customHorizontalFaceBlockWithItem(ModBlocks.HOLIDAY_ORNAMENTS);

        customHorizontalBlockWithItem(ModBlocks.GIANT_ANCHOR);
        customHorizontalFaceBlockWithItem(ModBlocks.GIANT_CHAIN);

        blockWithItem(ModBlocks.PLAIN_CUSHION_BLOCK);
        stairsBlockWithItem(ModBlocks.PLAIN_CUSHION_STAIRS, blockTexture(ModBlocks.PLAIN_CUSHION_BLOCK.get()));
        slabBlockWithItem(ModBlocks.PLAIN_CUSHION_SLAB, blockTexture(ModBlocks.PLAIN_CUSHION_BLOCK.get()), blockTexture(ModBlocks.PLAIN_CUSHION_BLOCK.get()));
        blockWithItem(ModBlocks.WHITE_CUSHION_BLOCK);
        stairsBlockWithItem(ModBlocks.WHITE_CUSHION_STAIRS, blockTexture(ModBlocks.WHITE_CUSHION_BLOCK.get()));
        slabBlockWithItem(ModBlocks.WHITE_CUSHION_SLAB, blockTexture(ModBlocks.WHITE_CUSHION_BLOCK.get()), blockTexture(ModBlocks.WHITE_CUSHION_BLOCK.get()));
        blockWithItem(ModBlocks.LIGHT_GRAY_CUSHION_BLOCK);
        stairsBlockWithItem(ModBlocks.LIGHT_GRAY_CUSHION_STAIRS, blockTexture(ModBlocks.LIGHT_GRAY_CUSHION_BLOCK.get()));
        slabBlockWithItem(ModBlocks.LIGHT_GRAY_CUSHION_SLAB, blockTexture(ModBlocks.LIGHT_GRAY_CUSHION_BLOCK.get()), blockTexture(ModBlocks.LIGHT_GRAY_CUSHION_BLOCK.get()));
        blockWithItem(ModBlocks.GRAY_CUSHION_BLOCK);
        stairsBlockWithItem(ModBlocks.GRAY_CUSHION_STAIRS, blockTexture(ModBlocks.GRAY_CUSHION_BLOCK.get()));
        slabBlockWithItem(ModBlocks.GRAY_CUSHION_SLAB, blockTexture(ModBlocks.GRAY_CUSHION_BLOCK.get()), blockTexture(ModBlocks.GRAY_CUSHION_BLOCK.get()));
        blockWithItem(ModBlocks.BLACK_CUSHION_BLOCK);
        stairsBlockWithItem(ModBlocks.BLACK_CUSHION_STAIRS, blockTexture(ModBlocks.BLACK_CUSHION_BLOCK.get()));
        slabBlockWithItem(ModBlocks.BLACK_CUSHION_SLAB, blockTexture(ModBlocks.BLACK_CUSHION_BLOCK.get()), blockTexture(ModBlocks.BLACK_CUSHION_BLOCK.get()));
        blockWithItem(ModBlocks.BROWN_CUSHION_BLOCK);
        stairsBlockWithItem(ModBlocks.BROWN_CUSHION_STAIRS, blockTexture(ModBlocks.BROWN_CUSHION_BLOCK.get()));
        slabBlockWithItem(ModBlocks.BROWN_CUSHION_SLAB, blockTexture(ModBlocks.BROWN_CUSHION_BLOCK.get()), blockTexture(ModBlocks.BROWN_CUSHION_BLOCK.get()));
        blockWithItem(ModBlocks.RED_CUSHION_BLOCK);
        stairsBlockWithItem(ModBlocks.RED_CUSHION_STAIRS, blockTexture(ModBlocks.RED_CUSHION_BLOCK.get()));
        slabBlockWithItem(ModBlocks.RED_CUSHION_SLAB, blockTexture(ModBlocks.RED_CUSHION_BLOCK.get()), blockTexture(ModBlocks.RED_CUSHION_BLOCK.get()));
        blockWithItem(ModBlocks.ORANGE_CUSHION_BLOCK);
        stairsBlockWithItem(ModBlocks.ORANGE_CUSHION_STAIRS, blockTexture(ModBlocks.ORANGE_CUSHION_BLOCK.get()));
        slabBlockWithItem(ModBlocks.ORANGE_CUSHION_SLAB, blockTexture(ModBlocks.ORANGE_CUSHION_BLOCK.get()), blockTexture(ModBlocks.ORANGE_CUSHION_BLOCK.get()));
        blockWithItem(ModBlocks.YELLOW_CUSHION_BLOCK);
        stairsBlockWithItem(ModBlocks.YELLOW_CUSHION_STAIRS, blockTexture(ModBlocks.YELLOW_CUSHION_BLOCK.get()));
        slabBlockWithItem(ModBlocks.YELLOW_CUSHION_SLAB, blockTexture(ModBlocks.YELLOW_CUSHION_BLOCK.get()), blockTexture(ModBlocks.YELLOW_CUSHION_BLOCK.get()));
        blockWithItem(ModBlocks.LIME_CUSHION_BLOCK);
        stairsBlockWithItem(ModBlocks.LIME_CUSHION_STAIRS, blockTexture(ModBlocks.LIME_CUSHION_BLOCK.get()));
        slabBlockWithItem(ModBlocks.LIME_CUSHION_SLAB, blockTexture(ModBlocks.LIME_CUSHION_BLOCK.get()), blockTexture(ModBlocks.LIME_CUSHION_BLOCK.get()));
        blockWithItem(ModBlocks.GREEN_CUSHION_BLOCK);
        stairsBlockWithItem(ModBlocks.GREEN_CUSHION_STAIRS, blockTexture(ModBlocks.GREEN_CUSHION_BLOCK.get()));
        slabBlockWithItem(ModBlocks.GREEN_CUSHION_SLAB, blockTexture(ModBlocks.GREEN_CUSHION_BLOCK.get()), blockTexture(ModBlocks.GREEN_CUSHION_BLOCK.get()));
        blockWithItem(ModBlocks.CYAN_CUSHION_BLOCK);
        stairsBlockWithItem(ModBlocks.CYAN_CUSHION_STAIRS, blockTexture(ModBlocks.CYAN_CUSHION_BLOCK.get()));
        slabBlockWithItem(ModBlocks.CYAN_CUSHION_SLAB, blockTexture(ModBlocks.CYAN_CUSHION_BLOCK.get()), blockTexture(ModBlocks.CYAN_CUSHION_BLOCK.get()));
        blockWithItem(ModBlocks.LIGHT_BLUE_CUSHION_BLOCK);
        stairsBlockWithItem(ModBlocks.LIGHT_BLUE_CUSHION_STAIRS, blockTexture(ModBlocks.LIGHT_BLUE_CUSHION_BLOCK.get()));
        slabBlockWithItem(ModBlocks.LIGHT_BLUE_CUSHION_SLAB, blockTexture(ModBlocks.LIGHT_BLUE_CUSHION_BLOCK.get()), blockTexture(ModBlocks.LIGHT_BLUE_CUSHION_BLOCK.get()));
        blockWithItem(ModBlocks.BLUE_CUSHION_BLOCK);
        stairsBlockWithItem(ModBlocks.BLUE_CUSHION_STAIRS, blockTexture(ModBlocks.BLUE_CUSHION_BLOCK.get()));
        slabBlockWithItem(ModBlocks.BLUE_CUSHION_SLAB, blockTexture(ModBlocks.BLUE_CUSHION_BLOCK.get()), blockTexture(ModBlocks.BLUE_CUSHION_BLOCK.get()));
        blockWithItem(ModBlocks.PURPLE_CUSHION_BLOCK);
        stairsBlockWithItem(ModBlocks.PURPLE_CUSHION_STAIRS, blockTexture(ModBlocks.PURPLE_CUSHION_BLOCK.get()));
        slabBlockWithItem(ModBlocks.PURPLE_CUSHION_SLAB, blockTexture(ModBlocks.PURPLE_CUSHION_BLOCK.get()), blockTexture(ModBlocks.PURPLE_CUSHION_BLOCK.get()));
        blockWithItem(ModBlocks.MAGENTA_CUSHION_BLOCK);
        stairsBlockWithItem(ModBlocks.MAGENTA_CUSHION_STAIRS, blockTexture(ModBlocks.MAGENTA_CUSHION_BLOCK.get()));
        slabBlockWithItem(ModBlocks.MAGENTA_CUSHION_SLAB, blockTexture(ModBlocks.MAGENTA_CUSHION_BLOCK.get()), blockTexture(ModBlocks.MAGENTA_CUSHION_BLOCK.get()));
        blockWithItem(ModBlocks.PINK_CUSHION_BLOCK);
        stairsBlockWithItem(ModBlocks.PINK_CUSHION_STAIRS, blockTexture(ModBlocks.PINK_CUSHION_BLOCK.get()));
        slabBlockWithItem(ModBlocks.PINK_CUSHION_SLAB, blockTexture(ModBlocks.PINK_CUSHION_BLOCK.get()), blockTexture(ModBlocks.PINK_CUSHION_BLOCK.get()));

        customBlockWithItem(ModBlocks.SEASTONE_QUOIN);
        customBlockWithItem(ModBlocks.SMOOTH_STONE_QUOIN);
        customBlockWithItem(ModBlocks.POLISHED_GRANITE_QUOIN);
        customBlockWithItem(ModBlocks.POLISHED_DIORITE_QUOIN);
        customBlockWithItem(ModBlocks.POLISHED_ANDESITE_QUOIN);
        customBlockWithItem(ModBlocks.POLISHED_TUFF_QUOIN);
        customBlockWithItem(ModBlocks.PACKED_MUD_QUOIN);
        customBlockWithItem(ModBlocks.SANDSTONE_QUOIN);
        customBlockWithItem(ModBlocks.RED_SANDSTONE_QUOIN);
        customBlockWithItem(ModBlocks.POLISHED_BLACKSTONE_QUOIN);

        customHorizontalBlockWithItem(ModBlocks.SEASTONE_MURAL);
        customHorizontalBlockWithItem(ModBlocks.SMOOTH_STONE_MURAL);
        customHorizontalBlockWithItem(ModBlocks.GRANITE_MURAL);
        customHorizontalBlockWithItem(ModBlocks.DIORITE_MURAL);
        customHorizontalBlockWithItem(ModBlocks.ANDESITE_MURAL);

        cubeColumnWithItem(ModBlocks.SEASTONE_BLOCK);
        stairsBlockWithItem(ModBlocks.SEASTONE_STAIRS, getPath(ModBlocks.SEASTONE_BLOCK, "_side"), getPath(ModBlocks.SEASTONE_BLOCK, "_end"));
        slabBlockWithItem(ModBlocks.SEASTONE_SLAB, blockTexture(ModBlocks.SEASTONE_BLOCK.get()), getPath(ModBlocks.SEASTONE_BLOCK, "_side"), getPath(ModBlocks.SEASTONE_BLOCK, "_end"));
        wallBlockWithItem(ModBlocks.SEASTONE_WALL, ModBlocks.SEASTONE_BLOCK, "_side");
        blockWithItem(ModBlocks.SEASTONE_BRICKS);
        blockWithItem(ModBlocks.CHISELED_SEASTONE_BRICKS);
        stairsBlockWithItem(ModBlocks.SEASTONE_BRICK_STAIRS, blockTexture(ModBlocks.SEASTONE_BRICKS.get()));
        slabBlockWithItem(ModBlocks.SEASTONE_BRICK_SLAB, blockTexture(ModBlocks.SEASTONE_BRICKS.get()), blockTexture(ModBlocks.SEASTONE_BRICKS.get()));
        wallBlockWithItem(ModBlocks.SEASTONE_BRICK_WALL, ModBlocks.SEASTONE_BRICKS);
        blockWithItem(ModBlocks.SMOOTH_SEASTONE_BLOCK, getPath(ModBlocks.SEASTONE_BLOCK, "_end"));
        stairsBlockWithItem(ModBlocks.SMOOTH_SEASTONE_STAIRS, getPath(ModBlocks.SEASTONE_BLOCK, "_end"));
        slabBlockWithItem(ModBlocks.SMOOTH_SEASTONE_SLAB, blockTexture(ModBlocks.SEASTONE_BLOCK.get()), getPath(ModBlocks.SEASTONE_BLOCK, "_end"));
        wallBlockWithItem(ModBlocks.SMOOTH_SEASTONE_WALL, ModBlocks.SEASTONE_BLOCK, "_end");
        blockWithItem(ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICKS);
        stairsBlockWithItem(ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICK_STAIRS, blockTexture(ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICKS.get()));
        slabBlockWithItem(ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICK_SLAB, blockTexture(ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICKS.get()), blockTexture(ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICKS.get()));
        wallBlockWithItem(ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICK_WALL, ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICKS);
        blockWithItem(ModBlocks.SNOWY_COBBLESTONE_BLOCK);
        stairsBlockWithItem(ModBlocks.SNOWY_COBBLESTONE_STAIRS, blockTexture(ModBlocks.SNOWY_COBBLESTONE_BLOCK.get()));
        slabBlockWithItem(ModBlocks.SNOWY_COBBLESTONE_SLAB, blockTexture(ModBlocks.SNOWY_COBBLESTONE_BLOCK.get()), blockTexture(ModBlocks.SNOWY_COBBLESTONE_BLOCK.get()));
        wallBlockWithItem(ModBlocks.SNOWY_COBBLESTONE_WALL, ModBlocks.SNOWY_COBBLESTONE_BLOCK);
        blockWithItem(ModBlocks.SNOWY_STONE_BRICKS);
        stairsBlockWithItem(ModBlocks.SNOWY_STONE_BRICK_STAIRS, blockTexture(ModBlocks.SNOWY_STONE_BRICKS.get()));
        slabBlockWithItem(ModBlocks.SNOWY_STONE_BRICK_SLAB, blockTexture(ModBlocks.SNOWY_STONE_BRICKS.get()), blockTexture(ModBlocks.SNOWY_STONE_BRICKS.get()));
        wallBlockWithItem(ModBlocks.SNOWY_STONE_BRICK_WALL, ModBlocks.SNOWY_STONE_BRICKS);
        blockWithItem(ModBlocks.SMOOTH_STONE_BRICKS);
        stairsBlockWithItem(ModBlocks.SMOOTH_STONE_BRICK_STAIRS, blockTexture(ModBlocks.SMOOTH_STONE_BRICKS.get()));
        slabBlockWithItem(ModBlocks.SMOOTH_STONE_BRICK_SLAB, blockTexture(ModBlocks.SMOOTH_STONE_BRICKS.get()), blockTexture(ModBlocks.SMOOTH_STONE_BRICKS.get()));
        wallBlockWithItem(ModBlocks.SMOOTH_STONE_BRICK_WALL, ModBlocks.SMOOTH_STONE_BRICKS);


    }



    //  Create blockstates file and item model file for block with pre-made custom block model (e.g., Blockbench model)
    private void customHorizontalBlockWithItem(RegistryObject<Block, Block> block) {
        horizontalBlock(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath())));
        blockItem(block);
    }
    private void customHorizontalBlockWithFlatItem(RegistryObject<Block, Block> block) {
        horizontalBlock(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath())));
        flatItem(block);
    }
    private void customHorizontalBlockWithFlatBlockItem(RegistryObject<Block, Block> block) {
        horizontalBlock(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath())));
        flatBlockItem(block);
    }
    private void customHorizontalFaceBlockWithItem(RegistryObject<Block, Block> block) {
        horizontalFaceBlock(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath())));
        blockItem(block);
    }
    private void customHorizontalFaceBlockWithFlatBlockItem(RegistryObject<Block, Block> block) {
        horizontalFaceBlock(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath())));
        flatBlockItem(block);
    }
    private void customHorizontalFaceBlockWithFlatItem(RegistryObject<Block, Block> block) {
        horizontalFaceBlock(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath())));
        flatItem(block);
    }
    private void customDirectionalBlockWithItem(RegistryObject<Block, Block> block) {
        directionalBlock(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath())));
        blockItem(block);
    }
    private void customDirectionalBlockWithFlatItem(RegistryObject<Block, Block> block) {
        directionalBlock(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath())));
        itemModels().withExistingParent(block.getId().getPath(), mcLoc("item/generated")).texture("layer0", "block/" + block.getId().getPath());
    }
    private void customAxisBlockWithItem(RegistryObject<Block, Block> block) {
        ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath()));
        getVariantBuilder(block.get())
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Y).modelForState().modelFile(model).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z).modelForState().modelFile(model).rotationX(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.X).modelForState().modelFile(model).rotationX(90).rotationY(90).addModel();
        blockItem(block);
    }
    private void transparentBlockWithItem(RegistryObject<Block, Block> block) {
        simpleBlockWithItem(block.get(), models().cubeAll(block.getId().getPath(), blockTexture(block.get())).renderType("translucent"));
    }

    private void banisterBlockWithFlatItem(RegistryObject<Block, Block> block) {
        paneBlockWithRenderType((IronBarsBlock) block.get(), getPath(block), getPath(block, "_top"), "cutout");
        flatBlockItem(block);
    }
    private void seaglassPaneBlockWithFlatItem(RegistryObject<Block, Block> block, RegistryObject<Block, Block> textureBlock) {
        paneBlockWithRenderType((IronBarsBlock) block.get(), getPath(textureBlock), getPath(textureBlock), "translucent");
        itemModels().withExistingParent(block.getId().getPath(), mcLoc("item/generated")).texture("layer0", "block/" + textureBlock.getId().getPath());
    }
    private void seaWindowPaneBlockWithFlatItem(RegistryObject<Block, Block> block, RegistryObject<Block, Block> textureBlock) {
        paneBlockWithRenderType((IronBarsBlock) block.get(), getPath(textureBlock), modLoc("block/" + "sea_window" + "_top"), "translucent");
        itemModels().withExistingParent(block.getId().getPath(), mcLoc("item/generated")).texture("layer0", "block/" + textureBlock.getId().getPath());
    }
    private void wallpaperWithItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            switch (blockState.getValue(WallpaperBlock.TEXTURE)) {
                case 1 -> {
                    return new ConfiguredModel[] { new ConfiguredModel(models().cubeAll(block.getId().getPath() + "_1", modLoc("block/" + block.getId().getPath() + "/1"))) };
                }
                case 2 -> {
                    return new ConfiguredModel[] { new ConfiguredModel(models().cubeAll(block.getId().getPath() + "_2", modLoc("block/" + block.getId().getPath() + "/2"))) };
                }
                default -> {
                    return new ConfiguredModel[] { new ConfiguredModel(models().cubeAll(block.getId().getPath(), modLoc("block/" + block.getId().getPath() + "/0"))) };
                }
            }
        });
        simpleBlockItem(block.get(), models().cubeAll(block.getId().getPath(),  modLoc("block/" + block.getId().getPath() + "/0")));
    }
    private void stellarWallpaperWithItem() {
        getVariantBuilder(ModBlocks.STELLAR_WALLPAPER_BLOCK.get()).forAllStates(blockState -> {
            switch (blockState.getValue(WallpaperBlock.TEXTURE)) {
                case 1 -> {
                    return new ConfiguredModel[] { new ConfiguredModel(models().cubeAll(ModBlocks.STELLAR_WALLPAPER_BLOCK.getId().getPath() + "_1", modLoc("block/" + ModBlocks.STELLAR_WALLPAPER_BLOCK.getId().getPath() + "/1"))) };
                }
                case 2 -> {
                    return new ConfiguredModel[] { new ConfiguredModel(models().cubeAll(ModBlocks.STELLAR_WALLPAPER_BLOCK.getId().getPath() + "_2", modLoc("block/" + ModBlocks.STELLAR_WALLPAPER_BLOCK.getId().getPath() + "/2"))) };
                }
                case 3 -> {
                    return new ConfiguredModel[] { new ConfiguredModel(models().cubeAll(ModBlocks.STELLAR_WALLPAPER_BLOCK.getId().getPath() + "_3", modLoc("block/" + ModBlocks.STELLAR_WALLPAPER_BLOCK.getId().getPath() + "/3"))) };
                }
                default -> {
                    return new ConfiguredModel[] { new ConfiguredModel(models().cubeAll(ModBlocks.STELLAR_WALLPAPER_BLOCK.getId().getPath(), modLoc("block/" + ModBlocks.STELLAR_WALLPAPER_BLOCK.getId().getPath() + "/0"))) };
                }
            }
        });
        simpleBlockItem(ModBlocks.STELLAR_WALLPAPER_BLOCK.get(), models().cubeAll(ModBlocks.STELLAR_WALLPAPER_BLOCK.getId().getPath(),  modLoc("block/" + ModBlocks.STELLAR_WALLPAPER_BLOCK.getId().getPath() + "/0")));
    }
    private void paperLanternWithFlatItem(RegistryObject<Block, Block> block) {
        horizontalBlock(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath())));
        flatItem(block);
    }
    private void scatteredPapersWithFlatItem() {
        getVariantBuilder(ModBlocks.SCATTERED_PAPERS.get()).forAllStates(blockState -> {
            switch (blockState.getValue(ScatteredPapersBlock.TEXTURE)) {
                case 1 -> {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SCATTERED_PAPERS.getId().getPath() + "_1"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 2 -> {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SCATTERED_PAPERS.getId().getPath() + "_2"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 3 -> {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SCATTERED_PAPERS.getId().getPath() + "_3"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                default -> {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SCATTERED_PAPERS.getId().getPath()));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
            }
        });
        flatItem(ModBlocks.SCATTERED_PAPERS);
    }
    private void glassBuoyWithItem() {
        getVariantBuilder(ModBlocks.GLASS_BUOY.get()).forAllStates(blockState -> {
            switch (blockState.getValue(GlassBuoyBlock.TEXTURE)) {
                case 1 -> {
                    return ConfiguredModel.builder().modelFile(new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GLASS_BUOY.getId().getPath() + "_1"))).build();
                }
                case 2 -> {
                    return ConfiguredModel.builder().modelFile(new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GLASS_BUOY.getId().getPath() + "_2"))).build();
                }
                case 3 -> {
                    return ConfiguredModel.builder().modelFile(new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GLASS_BUOY.getId().getPath() + "_3"))).build();
                }
                default -> {
                    return ConfiguredModel.builder().modelFile(new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GLASS_BUOY.getId().getPath()))).build();
                }
            }
        });
        blockItem(ModBlocks.GLASS_BUOY);
    }
    private void smallGlassBuoysWithItem() {
        getVariantBuilder(ModBlocks.SMALL_GLASS_BUOYS.get()).forAllStates(blockState -> {
            switch (blockState.getValue(SmallGlassBuoysBlock.TEXTURE)) {
                case 1 -> {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SMALL_GLASS_BUOYS.getId().getPath() + "_1"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 2 -> {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SMALL_GLASS_BUOYS.getId().getPath() + "_2"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                default -> {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SMALL_GLASS_BUOYS.getId().getPath()));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
            }
        });
        blockItem(ModBlocks.SMALL_GLASS_BUOYS);
    }
    private void woodenBuoysWithItem() {
        getVariantBuilder(ModBlocks.WOODEN_BUOYS.get()).forAllStates(blockState -> {
            switch (blockState.getValue(WoodenBuoysBlock.TEXTURE)) {
                case 1 -> {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.WOODEN_BUOYS.getId().getPath() + "_1"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 2 -> {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.WOODEN_BUOYS.getId().getPath() + "_2"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                default -> {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.WOODEN_BUOYS.getId().getPath()));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
            }
        });
        blockItem(ModBlocks.WOODEN_BUOYS);
    }
    private void potsAndPansWithFlatItem() {
        getVariantBuilder(ModBlocks.POTS_AND_PANS.get()).forAllStates(blockState -> {
            switch (blockState.getValue(PotsAndPansBlock.STACKED_POTS)) {
                case 2: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.POTS_AND_PANS.getId().getPath() + "_2"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 3: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.POTS_AND_PANS.getId().getPath() + "_3"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 4: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.POTS_AND_PANS.getId().getPath() + "_4"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 1:
                default: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.POTS_AND_PANS.getId().getPath() + "_1"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
            }
        });
        flatItem(ModBlocks.POTS_AND_PANS);
    }
    private void jarsWithItem() {
        getVariantBuilder(ModBlocks.JARS.get()).forAllStates(blockState -> {
           switch (blockState.getValue(JarsBlock.TEXTURE)) {
               case 1 -> {
                   ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.JARS.getId().getPath() + "_1"));
                   Function<BlockState, ModelFile> modelFunc = ($ -> model);
                   return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
               }
               case 2 -> {
                   ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.JARS.getId().getPath() + "_2"));
                   Function<BlockState, ModelFile> modelFunc = ($ -> model);
                   return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
               }
               case 3 -> {
                   ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.JARS.getId().getPath() + "_3"));
                   Function<BlockState, ModelFile> modelFunc = ($ -> model);
                   return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
               }
               case 4 -> {
                   ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.JARS.getId().getPath() + "_4"));
                   Function<BlockState, ModelFile> modelFunc = ($ -> model);
                   return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
               }
               case 5 -> {
                   ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.JARS.getId().getPath() + "_5"));
                   Function<BlockState, ModelFile> modelFunc = ($ -> model);
                   return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
               }
               default -> {
                   ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.JARS.getId().getPath()));
                   Function<BlockState, ModelFile> modelFunc = ($ -> model);
                   return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
               }
           }
        });
        blockItem(ModBlocks.JARS);
    }
    private void honeyJarWithFlatItem() {
        getVariantBuilder(ModBlocks.HONEY_JAR.get()).forAllStates(blockState -> {
            switch (blockState.getValue(HoneyJarBlock.HONEY_JARS)) {
                case 2: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.HONEY_JAR.getId().getPath() + "_2"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 3: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.HONEY_JAR.getId().getPath() + "_3"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 1:
                default: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.HONEY_JAR.getId().getPath() + "_1"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
            }
        });
        flatItem(ModBlocks.HONEY_JAR);
    }
    private void clutteredSmallShelfWithItem() {
        getVariantBuilder(ModBlocks.CLUTTERED_SMALL_SHELF.get()).forAllStates(blockState -> {
            switch (blockState.getValue(ClutteredSmallShelfBlock.TEXTURE)) {
                case 1: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.CLUTTERED_SMALL_SHELF.getId().getPath() + "_1"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 2: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.CLUTTERED_SMALL_SHELF.getId().getPath() + "_2"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 3: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.CLUTTERED_SMALL_SHELF.getId().getPath() + "_3"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 4: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.CLUTTERED_SMALL_SHELF.getId().getPath() + "_4"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 5: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.CLUTTERED_SMALL_SHELF.getId().getPath() + "_5"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 0:
                default: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.CLUTTERED_SMALL_SHELF.getId().getPath()));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
            }
        });
        blockItem(ModBlocks.CLUTTERED_SMALL_SHELF);
    }
    private void smallBookshelfWithItem() {
        getVariantBuilder(ModBlocks.SMALL_BOOKSHELF.get()).forAllStates(blockState -> {
            switch (blockState.getValue(SmallBookshelfBlock.TEXTURE)) {
                case 1: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SMALL_BOOKSHELF.getId().getPath() + "_1"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 2: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SMALL_BOOKSHELF.getId().getPath() + "_2"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 0:
                default: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SMALL_BOOKSHELF.getId().getPath()));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
            }
        });
        blockItem(ModBlocks.SMALL_BOOKSHELF);
    }
    private void booksWithItem() {
        getVariantBuilder(ModBlocks.BOOKS.get()).forAllStates(blockState -> {
            switch (blockState.getValue(BooksBlock.TEXTURE)) {
                case 1: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.BOOKS.getId().getPath() + "_1"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 2: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.BOOKS.getId().getPath() + "_2"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 0:
                default: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.BOOKS.getId().getPath()));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
            }
        });
        blockItem(ModBlocks.BOOKS);
    }
    private void bookStackWithItem() {
        getVariantBuilder(ModBlocks.BOOK_STACK.get()).forAllStates(blockState -> {
            switch (blockState.getValue(BookStackBlock.TEXTURE)) {
                case 1: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.BOOK_STACK.getId().getPath() + "_1"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 2: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.BOOK_STACK.getId().getPath() + "_2"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 0:
                default: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.BOOK_STACK.getId().getPath()));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
            }
        });
        blockItem(ModBlocks.BOOK_STACK);
    }
    private void fishingLuresWithFlatItem() {
        getVariantBuilder(ModBlocks.FISHING_LURES.get()).forAllStates(blockState -> {
            switch (blockState.getValue(FishingLuresBlock.TEXTURE)) {
                case 1: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.FISHING_LURES.getId().getPath() + "_1"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile((ModelFile)modelFunc.apply(blockState)).rotationX(((AttachFace)blockState.getValue(BlockStateProperties.ATTACH_FACE)).ordinal() * 90).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180 + (blockState.getValue(BlockStateProperties.ATTACH_FACE) == AttachFace.CEILING ? 180 : 0)) % 360).build();
                }
                case 2: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.FISHING_LURES.getId().getPath() + "_2"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile((ModelFile)modelFunc.apply(blockState)).rotationX(((AttachFace)blockState.getValue(BlockStateProperties.ATTACH_FACE)).ordinal() * 90).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180 + (blockState.getValue(BlockStateProperties.ATTACH_FACE) == AttachFace.CEILING ? 180 : 0)) % 360).build();
                }
                case 3: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.FISHING_LURES.getId().getPath() + "_3"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile((ModelFile)modelFunc.apply(blockState)).rotationX(((AttachFace)blockState.getValue(BlockStateProperties.ATTACH_FACE)).ordinal() * 90).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180 + (blockState.getValue(BlockStateProperties.ATTACH_FACE) == AttachFace.CEILING ? 180 : 0)) % 360).build();
                }
                case 4: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.FISHING_LURES.getId().getPath() + "_4"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile((ModelFile)modelFunc.apply(blockState)).rotationX(((AttachFace)blockState.getValue(BlockStateProperties.ATTACH_FACE)).ordinal() * 90).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180 + (blockState.getValue(BlockStateProperties.ATTACH_FACE) == AttachFace.CEILING ? 180 : 0)) % 360).build();
                }
                case 0:
                default: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.FISHING_LURES.getId().getPath()));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile((ModelFile)modelFunc.apply(blockState)).rotationX(((AttachFace)blockState.getValue(BlockStateProperties.ATTACH_FACE)).ordinal() * 90).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180 + (blockState.getValue(BlockStateProperties.ATTACH_FACE) == AttachFace.CEILING ? 180 : 0)) % 360).build();
                }
            }
        });
        flatBlockItem(ModBlocks.FISHING_LURES, "/0");
    }
    private void goldCoinsBlockWithItem() {
        simpleBlockWithItem(ModBlocks.GOLD_COINS_BLOCK.get(),
                models().withExistingParent(ModBlocks.GOLD_COINS_BLOCK.getId().getPath(), mcLoc("block/cube_column"))
                        .texture("side", modLoc("block/" + ModBlocks.GOLD_COINS.getId().getPath() + "_side"))
                        .texture("end", modLoc("block/" + ModBlocks.GOLD_COINS.getId().getPath() + "_end"))
                        .texture("particle", modLoc("block/" + ModBlocks.GOLD_COINS.getId().getPath() + "_end")));
    }
    private void goldCoinsLayerWithFlatItem() {
        ModelFile[] model = new ModelFile[] {
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GOLD_COINS.getId().getPath() + "_2")),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GOLD_COINS.getId().getPath() + "_4")),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GOLD_COINS.getId().getPath() + "_6")),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GOLD_COINS.getId().getPath() + "_8")),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GOLD_COINS.getId().getPath() + "_10")),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GOLD_COINS.getId().getPath() + "_12")),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GOLD_COINS.getId().getPath() + "_14")),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GOLD_COINS_BLOCK.getId().getPath())),
        };
        getVariantBuilder(ModBlocks.GOLD_COINS.get())
                .partialState().with(GoldCoinsLayerBlock.LAYERS, 1).modelForState().modelFile(model[0]).addModel()
                .partialState().with(GoldCoinsLayerBlock.LAYERS, 2).modelForState().modelFile(model[1]).addModel()
                .partialState().with(GoldCoinsLayerBlock.LAYERS, 3).modelForState().modelFile(model[2]).addModel()
                .partialState().with(GoldCoinsLayerBlock.LAYERS, 4).modelForState().modelFile(model[3]).addModel()
                .partialState().with(GoldCoinsLayerBlock.LAYERS, 5).modelForState().modelFile(model[4]).addModel()
                .partialState().with(GoldCoinsLayerBlock.LAYERS, 6).modelForState().modelFile(model[5]).addModel()
                .partialState().with(GoldCoinsLayerBlock.LAYERS, 7).modelForState().modelFile(model[6]).addModel()
                .partialState().with(GoldCoinsLayerBlock.LAYERS, 8).modelForState().modelFile(model[7]).addModel();
        flatItem(ModBlocks.GOLD_COINS);
    }
    private void scatteredGoldCoinsWithFlatBlockItem() {
        getVariantBuilder(ModBlocks.SCATTERED_GOLD_COINS.get()).forAllStates(blockState -> {
            switch (blockState.getValue(ScatteredGoldCoinsBlock.TEXTURE)) {
                case 1: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SCATTERED_GOLD_COINS.getId().getPath() + "_1"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 2: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SCATTERED_GOLD_COINS.getId().getPath() + "_2"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 0:
                default: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SCATTERED_GOLD_COINS.getId().getPath()));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
            }
        });
        flatBlockItem(ModBlocks.SCATTERED_GOLD_COINS, "/0");
    }
    private void seaglassLampWithBlockItem(RegistryObject<Block, Block> block) {
        ModelFile on = new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath() + "_on"));
        ModelFile off = new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath() + "_off"));
        getVariantBuilder(block.get())
                .partialState().with(SeaglassLampBlock.LAMP_ON, true).addModels(new ConfiguredModel(on))
                .partialState().with(SeaglassLampBlock.LAMP_ON, false).addModels(new ConfiguredModel(off));
        blockItem(block, "_on");
    }
    private void burlapSackWithItem() {
        getVariantBuilder(ModBlocks.BURLAP_SACK.get()).forAllStates(blockState -> {
            switch (blockState.getValue(BurlapSackBlock.STACKED_SACKS)) {
                case 2: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.BURLAP_SACK.getId().getPath() + "_2"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 3: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.BURLAP_SACK.getId().getPath() + "_3"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 1:
                default: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.BURLAP_SACK.getId().getPath() + "_1"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
            }
        });
        blockItem(ModBlocks.BURLAP_SACK, "_1");
    }
    private void sailorFlagWithItem() {
        ModelFile[] models = new ModelFile[] {
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SAILOR_FLAG.getId().getPath())),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SAILOR_FLAG.getId().getPath() + "_1")),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SAILOR_FLAG.getId().getPath() + "_2")),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SAILOR_FLAG.getId().getPath() + "_3")),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SAILOR_FLAG.getId().getPath() + "_4")),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SAILOR_FLAG.getId().getPath() + "_5"))
        };
        getVariantBuilder(ModBlocks.SAILOR_FLAG.get())
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Y).with(SailorFlagBlock.TEXTURE, 0).modelForState().modelFile(models[0]).rotationX(180).rotationY(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z).with(SailorFlagBlock.TEXTURE, 0).modelForState().modelFile(models[0]).rotationX(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.X).with(SailorFlagBlock.TEXTURE, 0).modelForState().modelFile(models[0]).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Y).with(SailorFlagBlock.TEXTURE, 1).modelForState().modelFile(models[1]).rotationX(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z).with(SailorFlagBlock.TEXTURE, 1).modelForState().modelFile(models[1]).rotationX(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.X).with(SailorFlagBlock.TEXTURE, 1).modelForState().modelFile(models[1]).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Y).with(SailorFlagBlock.TEXTURE, 2).modelForState().modelFile(models[2]).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z).with(SailorFlagBlock.TEXTURE, 2).modelForState().modelFile(models[2]).rotationX(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.X).with(SailorFlagBlock.TEXTURE, 2).modelForState().modelFile(models[2]).rotationX(90).rotationY(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Y).with(SailorFlagBlock.TEXTURE, 3).modelForState().modelFile(models[3]).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z).with(SailorFlagBlock.TEXTURE, 3).modelForState().modelFile(models[3]).rotationX(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.X).with(SailorFlagBlock.TEXTURE, 3).modelForState().modelFile(models[3]).rotationX(90).rotationY(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Y).with(SailorFlagBlock.TEXTURE, 4).modelForState().modelFile(models[4]).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z).with(SailorFlagBlock.TEXTURE, 4).modelForState().modelFile(models[4]).rotationX(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.X).with(SailorFlagBlock.TEXTURE, 4).modelForState().modelFile(models[4]).rotationX(90).rotationY(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Y).with(SailorFlagBlock.TEXTURE, 5).modelForState().modelFile(models[5]).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z).with(SailorFlagBlock.TEXTURE, 5).modelForState().modelFile(models[5]).rotationX(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.X).with(SailorFlagBlock.TEXTURE, 5).modelForState().modelFile(models[5]).rotationX(90).rotationY(90).addModel();

//        Function<BlockState, ModelFile[]> modelFunc = ($ -> models);
//        return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
        blockItem(ModBlocks.SAILOR_FLAG);
    }
    private void sailorPennantFlag() {
        getVariantBuilder(ModBlocks.SAILOR_PENNANT_FLAG.get()).forAllStates(blockState -> {
            switch (blockState.getValue(FishingLuresBlock.TEXTURE)) {
                case 1: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SAILOR_PENNANT_FLAG.getId().getPath() + "_1"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile((ModelFile)modelFunc.apply(blockState)).rotationX(((AttachFace)blockState.getValue(BlockStateProperties.ATTACH_FACE)).ordinal() * 90).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180 + (blockState.getValue(BlockStateProperties.ATTACH_FACE) == AttachFace.CEILING ? 180 : 0)) % 360).build();
                }
                case 2: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SAILOR_PENNANT_FLAG.getId().getPath() + "_2"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile((ModelFile)modelFunc.apply(blockState)).rotationX(((AttachFace)blockState.getValue(BlockStateProperties.ATTACH_FACE)).ordinal() * 90).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180 + (blockState.getValue(BlockStateProperties.ATTACH_FACE) == AttachFace.CEILING ? 180 : 0)) % 360).build();
                }
                case 3: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SAILOR_PENNANT_FLAG.getId().getPath() + "_3"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile((ModelFile)modelFunc.apply(blockState)).rotationX(((AttachFace)blockState.getValue(BlockStateProperties.ATTACH_FACE)).ordinal() * 90).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180 + (blockState.getValue(BlockStateProperties.ATTACH_FACE) == AttachFace.CEILING ? 180 : 0)) % 360).build();
                }
                case 4: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SAILOR_PENNANT_FLAG.getId().getPath() + "_4"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile((ModelFile)modelFunc.apply(blockState)).rotationX(((AttachFace)blockState.getValue(BlockStateProperties.ATTACH_FACE)).ordinal() * 90).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180 + (blockState.getValue(BlockStateProperties.ATTACH_FACE) == AttachFace.CEILING ? 180 : 0)) % 360).build();
                }
                case 5: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SAILOR_PENNANT_FLAG.getId().getPath() + "_5"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile((ModelFile)modelFunc.apply(blockState)).rotationX(((AttachFace)blockState.getValue(BlockStateProperties.ATTACH_FACE)).ordinal() * 90).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180 + (blockState.getValue(BlockStateProperties.ATTACH_FACE) == AttachFace.CEILING ? 180 : 0)) % 360).build();
                }
                case 0:
                default: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.SAILOR_PENNANT_FLAG.getId().getPath()));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile((ModelFile)modelFunc.apply(blockState)).rotationX(((AttachFace)blockState.getValue(BlockStateProperties.ATTACH_FACE)).ordinal() * 90).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180 + (blockState.getValue(BlockStateProperties.ATTACH_FACE) == AttachFace.CEILING ? 180 : 0)) % 360).build();
                }
            }
        });
        blockItem(ModBlocks.SAILOR_PENNANT_FLAG);
    }
    private void customGarlandWithItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            switch (blockState.getValue(GarlandBlock.TEXTURE)) {
                case 2: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath() + "_2"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 1: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath() + "_1"));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
                case 0:
                default: {
                    ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath()));
                    Function<BlockState, ModelFile> modelFunc = ($ -> model);
                    return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
                }
            }
        });
        blockItem(block);
    }
    private void plushieWithItem() {
        getVariantBuilder(ModBlocks.PLUSHIE.get()).forAllStates(blockState -> {
            int texture = blockState.getValue(PlushieBlock.TEXTURE);
            ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + PLUSHIE_NAME[texture] + "_" + ModBlocks.PLUSHIE.getId().getPath()));
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
        });
        blockItem(PLUSHIE_NAME[0] + "_", ModBlocks.PLUSHIE);
    }

    private void tallBlockWithItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            ModelFile bottom = new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath() + "_bottom"));
            ModelFile top = new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath() + "_top"));
            int yRot = (((int) (blockState.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot())) + 180) % 360;
            ModelFile model = blockState.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.LOWER ? bottom : top ;
            return ConfiguredModel.builder().modelFile(model).rotationY(yRot).build();
        });
        blockItem(block);
    }
    private void threeStackedHorizontalBlockWithItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            int amount = blockState.getValue(ModConstants.AMOUNT_3);
            ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath() + "_" + amount));
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            return ConfiguredModel.builder()
                    .modelFile(modelFunc.apply(blockState))
                    .rotationY(((int) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + 180) % 360)
                    .build();
        });
        blockItem(block, "_" + ModConstants.MAX_AMOUNT_3);
    }



    private void customBlockWithItem(RegistryObject<Block, Block> block) {
        simpleBlockWithItem(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath())));
        blockItem(block);
    }
    private void customBlockWithItem(RegistryObject<Block, Block> block, String appendix) {
        simpleBlockWithItem(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath() + appendix)));
        blockItem(block, appendix);
    }
    private void customBlock(RegistryObject<Block, Block> block) {
        simpleBlockWithItem(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath())));
    }
    private void axisBlockWithItem(RegistryObject<Block, Block> block) {
        models().cubeColumn(block.getId().getPath(), modLoc("block/" + block.getId().getPath() + "_side"), modLoc("block/" + block.getId().getPath() + "_end"));
        blockItem(block);
    }
    private void cubeColumnWithItem(RegistryObject<Block, Block> block) {
        ModelFile model = models().cubeColumn(block.getId().getPath(), getPath(block, "_side"), getPath(block, "_end"));
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            return new ConfiguredModel[] { new ConfiguredModel(model) };
        });
        blockItem(ModBlocks.SEASTONE_BLOCK);
    }


    private void blockWithItem(RegistryObject<Block, Block> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
    private void blockWithItem(RegistryObject<Block, Block> block, ResourceLocation texture) {
        simpleBlockWithItem(block.get(), models().cubeAll(block.getId().getPath(), texture));
    }
    private void stairsBlockWithItem(RegistryObject<Block, Block> block, ResourceLocation texture) {
        stairsBlock((StairBlock) block.get(), texture, texture, texture);
        blockItem(block);
    }
    private void stairsBlockWithItem(RegistryObject<Block, Block> block, ResourceLocation side, ResourceLocation end) {
        stairsBlock((StairBlock) block.get(), side, end, end);
        blockItem(block);
    }
    public void slabBlockWithItem(RegistryObject<Block, Block> block, ResourceLocation doubleslab, ResourceLocation texture) {
        slabBlock((SlabBlock) block.get(), doubleslab, texture, texture, texture);
        blockItem(block);
    }
    public void slabBlockWithItem(RegistryObject<Block, Block> block, ResourceLocation doubleslab, ResourceLocation side, ResourceLocation end) {
        slabBlock((SlabBlock) block.get(), doubleslab, side, end, end);
        blockItem(block);
    }
    public void wallBlockWithItem(RegistryObject<Block, Block> block, RegistryObject<Block, Block> baseBlock) {
        wallBlock((WallBlock) block.get(), getPath(baseBlock));
        models().wallInventory(block.getId().getPath() + "_inventory", getPath(baseBlock));
        wallItem(block);
    }
    public void wallBlockWithItem(RegistryObject<Block, Block> block, RegistryObject<Block, Block> baseBlock, String texture) {
        wallBlock((WallBlock) block.get(), getPath(baseBlock, texture));
        models().wallInventory(block.getId().getPath() + "_inventory", getPath(baseBlock, texture));
        wallItem(block);
    }

    private void fenceItem(RegistryObject<Block, Block> block, RegistryObject<Block, Block> baseBlock) {
        itemModels().withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", modLoc("block/" + baseBlock.getId().getPath()));
    }
    private void buttonItem(RegistryObject<Block, Block> block, RegistryObject<Block, Block> baseBlock) {
        itemModels().withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture", modLoc("block/" + baseBlock.getId().getPath()));
    }
    private void wallItem(RegistryObject<Block, Block> block) {
        itemModels().withExistingParent(block.getId().getPath(), modLoc("block/" + block.getId().getPath() + "_inventory"));
    }

    private void blockItem(RegistryObject<Block, Block> block) {
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath())));
    }
    private void blockItem(RegistryObject<Block, Block> block, String appendix) {
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath() + appendix)));
    }
    private void blockItem(String prefix, RegistryObject<Block, Block> block) {
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + prefix + block.getId().getPath())));
    }
    private void flatItem(RegistryObject<Block, Block> block) {
        itemModels().withExistingParent(block.getId().getPath(), mcLoc("item/generated")).texture("layer0", "item/" + block.getId().getPath());
    }
    private void flatBlockItem(RegistryObject<Block, Block> block) {
        itemModels().withExistingParent(block.getId().getPath(), mcLoc("item/generated")).texture("layer0", "block/" + block.getId().getPath());
    }
    private void flatBlockItem(RegistryObject<Block, Block> block, String appendix) {
        itemModels().withExistingParent(block.getId().getPath(), mcLoc("item/generated")).texture("layer0", "block/" + block.getId().getPath() + appendix);
    }


    private ResourceLocation getPath(RegistryObject<Block, Block> block) {
        return ModelLocationUtils.getModelLocation(block.get());
    }
    private ResourceLocation getPath(RegistryObject<Block, Block> block, String suffix) {
        return ModelLocationUtils.getModelLocation(block.get(), suffix);
    }

}
