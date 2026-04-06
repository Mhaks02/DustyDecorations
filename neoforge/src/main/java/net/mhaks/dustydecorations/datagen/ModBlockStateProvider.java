package net.mhaks.dustydecorations.datagen;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
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
    private static final String BLOCK_FOLDER = "block/";
    private static final String ITEM_FOLDER = "item/";
    private static final ResourceLocation GENERATED = ResourceLocation.tryParse("item/generated");

    private static final ResourceLocation CUTOUT = ResourceLocation.tryParse("cutout");
    private static final ResourceLocation TRANSLUCENT = ResourceLocation.tryParse("translucent");

    private static final String FLAT = "flat";
    private static final String TOP = "_top";
    private static final String BOTTOM = "_bottom";
    private static final String END = "_end";
    private static final String FRONT = "_front";
    private static final String BACK = "_back";
    private static final String LEFT = "_left";
    private static final String RIGHT = "_right";
    private static final String SIDE = "_side";
    private static final String UPPER = "_upper";
    private static final String LOWER = "_lower";
    private static final String ON = "_on";
    private static final String OFF = "_off";

    private static final String[] PLUSHIE_NAME = { "alex", "ari", "efe", "kai", "makena", "noor", "steve", "sunny", "zuri" };


    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ModConstants.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        customHorizontalBlockAndItem(ModBlocks.DUSTY_DECORATIONS_BARREL);

        banisterBlockAndFlatItem(ModBlocks.OAK_BANISTER);
        banisterBlockAndFlatItem(ModBlocks.SPRUCE_BANISTER);
        banisterBlockAndFlatItem(ModBlocks.BIRCH_BANISTER);
        banisterBlockAndFlatItem(ModBlocks.JUNGLE_BANISTER);
        banisterBlockAndFlatItem(ModBlocks.ACACIA_BANISTER);
        banisterBlockAndFlatItem(ModBlocks.DARK_OAK_BANISTER);
        banisterBlockAndFlatItem(ModBlocks.MANGROVE_BANISTER);
        banisterBlockAndFlatItem(ModBlocks.CHERRY_BANISTER);
        banisterBlockAndFlatItem(ModBlocks.BAMBOO_BANISTER);
        banisterBlockAndFlatItem(ModBlocks.DRY_BAMBOO_BANISTER);
        banisterBlockAndFlatItem(ModBlocks.CRIMSON_BANISTER);
        banisterBlockAndFlatItem(ModBlocks.WARPED_BANISTER);

        largeShelfBlockAndItem(ModBlocks.OAK_LARGE_SHELF);
        largeShelfBlockAndItem(ModBlocks.SPRUCE_LARGE_SHELF);
        largeShelfBlockAndItem(ModBlocks.BIRCH_LARGE_SHELF);
        largeShelfBlockAndItem(ModBlocks.JUNGLE_LARGE_SHELF);
        largeShelfBlockAndItem(ModBlocks.ACACIA_LARGE_SHELF);
        largeShelfBlockAndItem(ModBlocks.DARK_OAK_LARGE_SHELF);
        largeShelfBlockAndItem(ModBlocks.MANGROVE_LARGE_SHELF);
        largeShelfBlockAndItem(ModBlocks.CHERRY_LARGE_SHELF);
        largeShelfBlockAndItem(ModBlocks.BAMBOO_LARGE_SHELF);
        largeShelfBlockAndItem(ModBlocks.CRIMSON_LARGE_SHELF);
        largeShelfBlockAndItem(ModBlocks.WARPED_LARGE_SHELF);

        //TODO: template model?
        customHorizontalBlockAndItem(ModBlocks.APPLE_BARREL);
        customHorizontalBlockAndItem(ModBlocks.SWEET_BERRIES_BARREL);
        customHorizontalBlockAndItem(ModBlocks.GLOW_BERRIES_BARREL);
        customHorizontalBlockAndItem(ModBlocks.CARROT_BARREL);
        customHorizontalBlockAndItem(ModBlocks.POTATO_BARREL);
        customHorizontalBlockAndItem(ModBlocks.BEETROOT_BARREL);
        customHorizontalBlockAndItem(ModBlocks.SEA_PICKLE_BARREL);
        customHorizontalBlockAndItem(ModBlocks.COD_BARREL);
        customHorizontalBlockAndItem(ModBlocks.SALMON_BARREL);
        customHorizontalBlockAndItem(ModBlocks.EMPTY_BARREL);

        threeTexturesBlockAndItem(ModBlocks.SUNFLOWER_WALLPAPER_BLOCK);
        blockAndItem(ModBlocks.REGAL_WALLPAPER_BLOCK);
        threeTexturesBlockAndItem(ModBlocks.VINE_WALLPAPER_BLOCK);
        blockAndItem(ModBlocks.MONSTER_WALLPAPER_BLOCK);
        blockAndItem(ModBlocks.SAILOR_WALLPAPER_BLOCK);
        blockAndItem(ModBlocks.COPPER_WALLPAPER_BLOCK);
        fourTexturesBlockAndItem(ModBlocks.STELLAR_WALLPAPER_BLOCK);
        blockAndItem(ModBlocks.PUMPKIN_WALLPAPER_BLOCK);
        blockAndItem(ModBlocks.SOUL_WALLPAPER_BLOCK);
        blockAndItem(ModBlocks.FOREST_FESTIVE_WALLPAPER_BLOCK);
        blockAndItem(ModBlocks.STRIPED_FESTIVE_WALLPAPER_BLOCK);
        blockAndItem(ModBlocks.SNOWMEN_WALLPAPER_BLOCK);
        blockAndItem(ModBlocks.SNOWFLAKE_WALLPAPER_BLOCK);

        woolAwningAndItem(ModBlocks.WHITE_WOOL_AWNING);
        woolAwningAndItem(ModBlocks.LIGHT_GRAY_WOOL_AWNING);
        woolAwningAndItem(ModBlocks.GRAY_WOOL_AWNING);
        woolAwningAndItem(ModBlocks.BLACK_WOOL_AWNING);
        woolAwningAndItem(ModBlocks.BROWN_WOOL_AWNING);
        woolAwningAndItem(ModBlocks.RED_WOOL_AWNING);
        woolAwningAndItem(ModBlocks.ORANGE_WOOL_AWNING);
        woolAwningAndItem(ModBlocks.YELLOW_WOOL_AWNING);
        woolAwningAndItem(ModBlocks.LIME_WOOL_AWNING);
        woolAwningAndItem(ModBlocks.GREEN_WOOL_AWNING);
        woolAwningAndItem(ModBlocks.CYAN_WOOL_AWNING);
        woolAwningAndItem(ModBlocks.LIGHT_BLUE_WOOL_AWNING);
        woolAwningAndItem(ModBlocks.BLUE_WOOL_AWNING);
        woolAwningAndItem(ModBlocks.PURPLE_WOOL_AWNING);
        woolAwningAndItem(ModBlocks.MAGENTA_WOOL_AWNING);
        woolAwningAndItem(ModBlocks.PINK_WOOL_AWNING);

        paperLanternAndFlatItem(ModBlocks.PAPER_LANTERN);
        paperLanternAndFlatItem(ModBlocks.SAKURA_PAPER_LANTERN);
        paperLanternAndFlatItem(ModBlocks.TAIGA_PAPER_LANTERN);
        paperLanternAndFlatItem(ModBlocks.ORCHID_PAPER_LANTERN);
        paperLanternAndFlatItem(ModBlocks.PANDA_PAPER_LANTERN);
        paperLanternAndFlatItem(ModBlocks.VILLAGER_PAPER_LANTERN);
        paperLanternAndFlatItem(ModBlocks.CREEPER_PAPER_LANTERN);
        paperLanternAndFlatItem(ModBlocks.CHICKEN_JOCKEY_PAPER_LANTERN);
        paperLanternAndFlatItem(ModBlocks.PILLAGER_PAPER_LANTERN);
        paperLanternAndFlatItem(ModBlocks.WARDEN_PAPER_LANTERN);

        blockAndItem(ModBlocks.CORRUGATED_METAL_BLOCK);
        cutoutBlockAndItem(ModBlocks.CORRUGATED_METAL_GRATE);
        stairsBlockAndItem(ModBlocks.CORRUGATED_METAL_STAIRS, ModBlocks.CORRUGATED_METAL_BLOCK);
        slabBlockAndItem(ModBlocks.CORRUGATED_METAL_SLAB, ModBlocks.CORRUGATED_METAL_BLOCK);
        fenceBlockAndItem(ModBlocks.CORRUGATED_METAL_FENCE, ModBlocks.CORRUGATED_METAL_BLOCK);
        fenceGateBlockAndItem(ModBlocks.CORRUGATED_METAL_FENCE_GATE, ModBlocks.CORRUGATED_METAL_BLOCK);
        doorBlockAndItem(ModBlocks.CORRUGATED_METAL_DOOR);
        trapdoorBlockAndItem(ModBlocks.CORRUGATED_METAL_TRAPDOOR, ModBlocks.CORRUGATED_METAL_BLOCK);
        pressurePlateAndItem(ModBlocks.CORRUGATED_METAL_PRESSURE_PLATE, ModBlocks.CORRUGATED_METAL_BLOCK);
        buttonBlockAndItem(ModBlocks.CORRUGATED_METAL_BUTTON, ModBlocks.CORRUGATED_METAL_BLOCK);
        customHorizontalBlockAndItem(ModBlocks.CORRUGATED_METAL_ROOFING);

        blockAndItem(ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK);
        cutoutBlockAndItem(ModBlocks.RUSTED_CORRUGATED_METAL_GRATE);
        stairsBlockAndItem(ModBlocks.RUSTED_CORRUGATED_METAL_STAIRS, ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK);
        slabBlockAndItem(ModBlocks.RUSTED_CORRUGATED_METAL_SLAB, ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK);
        fenceBlockAndItem(ModBlocks.RUSTED_CORRUGATED_METAL_FENCE, ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK);
        fenceGateBlockAndItem(ModBlocks.RUSTED_CORRUGATED_METAL_FENCE_GATE, ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK);
        doorBlockAndItem(ModBlocks.RUSTED_CORRUGATED_METAL_DOOR);
        trapdoorBlockAndItem(ModBlocks.RUSTED_CORRUGATED_METAL_TRAPDOOR, ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK);
        pressurePlateAndItem(ModBlocks.RUSTED_CORRUGATED_METAL_PRESSURE_PLATE, ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK);
        buttonBlockAndItem(ModBlocks.RUSTED_CORRUGATED_METAL_BUTTON, ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK);
        customHorizontalBlockAndItem(ModBlocks.RUSTED_CORRUGATED_METAL_ROOFING);

        translucentBlockAndItem(ModBlocks.CREAM_SEAGLASS);
        translucentBlockAndItem(ModBlocks.HAZEL_SEAGLASS);
        translucentBlockAndItem(ModBlocks.LIQUORICE_SEAGLASS);
        translucentBlockAndItem(ModBlocks.MOCHA_SEAGLASS);
        translucentBlockAndItem(ModBlocks.SCARLET_SEAGLASS);
        translucentBlockAndItem(ModBlocks.HONEY_SEAGLASS);
        translucentBlockAndItem(ModBlocks.MINT_SEAGLASS);
        translucentBlockAndItem(ModBlocks.TEAL_SEAGLASS);
        translucentBlockAndItem(ModBlocks.CERULEAN_SEAGLASS);
        translucentBlockAndItem(ModBlocks.TAUPE_SEAGLASS);

        glassPaneBlockAndFlatItem(ModBlocks.CREAM_SEAGLASS_PANE, ModBlocks.CREAM_SEAGLASS);
        glassPaneBlockAndFlatItem(ModBlocks.HAZEL_SEAGLASS_PANE, ModBlocks.HAZEL_SEAGLASS);
        glassPaneBlockAndFlatItem(ModBlocks.LIQUORICE_SEAGLASS_PANE, ModBlocks.LIQUORICE_SEAGLASS);
        glassPaneBlockAndFlatItem(ModBlocks.MOCHA_SEAGLASS_PANE, ModBlocks.MOCHA_SEAGLASS);
        glassPaneBlockAndFlatItem(ModBlocks.SCARLET_SEAGLASS_PANE, ModBlocks.SCARLET_SEAGLASS);
        glassPaneBlockAndFlatItem(ModBlocks.HONEY_SEAGLASS_PANE, ModBlocks.HONEY_SEAGLASS);
        glassPaneBlockAndFlatItem(ModBlocks.MINT_SEAGLASS_PANE, ModBlocks.MINT_SEAGLASS);
        glassPaneBlockAndFlatItem(ModBlocks.TEAL_SEAGLASS_PANE, ModBlocks.TEAL_SEAGLASS);
        glassPaneBlockAndFlatItem(ModBlocks.CERULEAN_SEAGLASS_PANE, ModBlocks.CERULEAN_SEAGLASS);
        glassPaneBlockAndFlatItem(ModBlocks.TAUPE_SEAGLASS_PANE, ModBlocks.TAUPE_SEAGLASS);

        translucentBlockAndItem(ModBlocks.CREAM_SEA_WINDOW);
        translucentBlockAndItem(ModBlocks.HAZEL_SEA_WINDOW);
        translucentBlockAndItem(ModBlocks.LIQUORICE_SEA_WINDOW);
        translucentBlockAndItem(ModBlocks.MOCHA_SEA_WINDOW);
        translucentBlockAndItem(ModBlocks.SCARLET_SEA_WINDOW);
        translucentBlockAndItem(ModBlocks.HONEY_SEA_WINDOW);
        translucentBlockAndItem(ModBlocks.MINT_SEA_WINDOW);
        translucentBlockAndItem(ModBlocks.TEAL_SEA_WINDOW);
        translucentBlockAndItem(ModBlocks.CERULEAN_SEA_WINDOW);
        translucentBlockAndItem(ModBlocks.TAUPE_SEA_WINDOW);

        seaWindowPaneBlockAndFlatItem(ModBlocks.CREAM_SEA_WINDOW_PANE, ModBlocks.CREAM_SEA_WINDOW);
        seaWindowPaneBlockAndFlatItem(ModBlocks.HAZEL_SEA_WINDOW_PANE, ModBlocks.HAZEL_SEA_WINDOW);
        seaWindowPaneBlockAndFlatItem(ModBlocks.LIQUORICE_SEA_WINDOW_PANE, ModBlocks.LIQUORICE_SEA_WINDOW);
        seaWindowPaneBlockAndFlatItem(ModBlocks.MOCHA_SEA_WINDOW_PANE, ModBlocks.MOCHA_SEA_WINDOW);
        seaWindowPaneBlockAndFlatItem(ModBlocks.SCARLET_SEA_WINDOW_PANE, ModBlocks.SCARLET_SEA_WINDOW);
        seaWindowPaneBlockAndFlatItem(ModBlocks.HONEY_SEA_WINDOW_PANE, ModBlocks.HONEY_SEA_WINDOW);
        seaWindowPaneBlockAndFlatItem(ModBlocks.MINT_SEA_WINDOW_PANE, ModBlocks.MINT_SEA_WINDOW);
        seaWindowPaneBlockAndFlatItem(ModBlocks.TEAL_SEA_WINDOW_PANE, ModBlocks.TEAL_SEA_WINDOW);
        seaWindowPaneBlockAndFlatItem(ModBlocks.CERULEAN_SEA_WINDOW_PANE, ModBlocks.CERULEAN_SEA_WINDOW);
        seaWindowPaneBlockAndFlatItem(ModBlocks.TAUPE_SEA_WINDOW_PANE, ModBlocks.TAUPE_SEA_WINDOW);

        seaglassLamp(ModBlocks.CREAM_SEAGLASS_LAMP);
        seaglassLamp(ModBlocks.HAZEL_SEAGLASS_LAMP);
        seaglassLamp(ModBlocks.LIQUORICE_SEAGLASS_LAMP);
        seaglassLamp(ModBlocks.MOCHA_SEAGLASS_LAMP);
        seaglassLamp(ModBlocks.SCARLET_SEAGLASS_LAMP);
        seaglassLamp(ModBlocks.HONEY_SEAGLASS_LAMP);
        seaglassLamp(ModBlocks.MINT_SEAGLASS_LAMP);
        seaglassLamp(ModBlocks.TEAL_SEAGLASS_LAMP);
        seaglassLamp(ModBlocks.CERULEAN_SEAGLASS_LAMP);
        seaglassLamp(ModBlocks.TAUPE_SEAGLASS_LAMP);

        blockAndItem(ModBlocks.SEAGLASS_SAND);
        blockAndItem(ModBlocks.SEAGLASS_GRAVEL);

        customHorizontalBlockAndItem(ModBlocks.RUSTED_ANCHOR);
        customDirectionalBlockAndItem(ModBlocks.LIFE_PRESERVER);
        customHorizontalBlockAndFlatItem(ModBlocks.DISPLAYED_OARS);
        customHorizontalFaceBlockAndFlatBlockItem(ModBlocks.TREASURE_MAP);
        scatteredPapersAndFlatItem();
        //TODO
        flatItem(ModBlocks.POSTERS);
        customHorizontalBlockAndItem(ModBlocks.PAPER_STACK);
        fourTexturesCustomBlockAndItem(ModBlocks.GLASS_BUOY);
        threeTexturesCustomHorizontalBlockAndItem(ModBlocks.SMALL_GLASS_BUOYS);
        threeTexturesCustomHorizontalBlockAndItem(ModBlocks.WOODEN_BUOYS);
        customAxisBlockAndItem(ModBlocks.ROPE);
        customHorizontalBlockAndItem(ModBlocks.COILED_ROPE);
        customHorizontalBlockAndItem(ModBlocks.HANGING_COD);
        customHorizontalBlockAndItem(ModBlocks.HANGING_SALMON);
        customHorizontalBlockAndItem(ModBlocks.HANGING_KNIVES);
        customHorizontalFaceBlockAndItem(ModBlocks.WEDGED_KNIFE);
        customHorizontalFaceBlockAndItem(ModBlocks.WEDGED_CLEAVER);
        customHorizontalBlockAndItem(ModBlocks.CUTTING_BOARD);
        customHorizontalBlockAndItem(ModBlocks.KNIFE_AND_CUTTING_BOARD);
        //TODO
        blockItem(ModBlocks.IRON_FRYING_PAN);
        blockItem(ModBlocks.COPPER_FRYING_PAN);
        customHorizontalBlockAndItem(ModBlocks.BIG_COOKING_POT);
        fourStackedHorizontalBlockAndItem(ModBlocks.POTS_AND_PANS);
        customBlockNoItem(ModBlocks.DECORATIVE_BOWL);
        sixModelsCustomHorizontalBlockAndItem(ModBlocks.JARS);
        threeStackedHorizontalBlockAndFlatItem(ModBlocks.HONEY_JAR);
        customHorizontalBlockAndFlatItem(ModBlocks.INK_AND_QUILL);
        sixModelsCustomHorizontalBlockAndItem(ModBlocks.CLUTTERED_SMALL_SHELF);
        customHorizontalBlockAndItem(ModBlocks.EMPTY_SMALL_SHELF);
        threeTexturesCustomHorizontalBlockAndItem(ModBlocks.SMALL_BOOKSHELF);
        threeTexturesCustomHorizontalBlockAndItem(ModBlocks.BOOKS);
        threeTexturesCustomHorizontalBlockAndItem(ModBlocks.BOOK_STACK);
        customHorizontalBlockAndItem(ModBlocks.GLOBE);
        customHorizontalBlockAndItem(ModBlocks.VINTAGE_GLOBE);
        customHorizontalFaceBlockAndFlatItem(ModBlocks.BOVINE_SKULL);
        customHorizontalFaceBlockAndFlatItem(ModBlocks.EQUINE_SKULL);
        customHorizontalFaceBlockAndFlatItem(ModBlocks.CANINE_SKULL);
        customHorizontalFaceBlockAndFlatItem(ModBlocks.FISH_BONES);
        customHorizontalFaceBlockAndFlatBlockItem(ModBlocks.SMALL_SHARK_JAW);
        customHorizontalFaceBlockAndFlatItem(ModBlocks.BIG_SHARK_JAW);
        customHorizontalFaceBlockAndFlatBlockItem(ModBlocks.MEGALODON_TOOTH);
        fourTexturesCustomHorizontalFaceBlockAndFlatBlockItem(ModBlocks.FISHING_LURES);
        blockAndItem(ModBlocks.STONE_MARINE_FOSSIL);
        blockAndItem(ModBlocks.DEEPSLATE_MARINE_FOSSIL);

        cubeColumnAndItem(ModBlocks.GOLD_COINS_BLOCK, ModBlocks.GOLD_COINS_LAYER);
        goldCoinsLayerAndFlatItem();
        threeTexturesCustomHorizontalBlockAndFlatBlockItem(ModBlocks.SCATTERED_GOLD_COINS);

        blockAndItem(ModBlocks.SANDSTONE_TILE_BLOCK);
        stairsBlockAndItem(ModBlocks.SANDSTONE_TILE_STAIRS, ModBlocks.SANDSTONE_TILE_BLOCK);
        slabBlockAndItem(ModBlocks.SANDSTONE_TILE_SLAB, ModBlocks.SANDSTONE_TILE_BLOCK);
        blockAndItem(ModBlocks.MOSAIC_SANDSTONE_TILE_BLOCK);

        nautilusShell(ModBlocks.BIG_NAUTILUS_SHELL);
        nautilusShell(ModBlocks.BIG_NAUTILUS_LANTERN);
        customHorizontalBlockAndItem(ModBlocks.SMALL_NAUTILUS_SHELL);
        customHorizontalBlockAndFlatItem(ModBlocks.COLD_NAUTILUS_WIND_CHIME);

        blockAndItem(ModBlocks.BURLAP_BLOCK);
        stairsBlockAndItem(ModBlocks.BURLAP_STAIRS, ModBlocks.BURLAP_BLOCK);
        slabBlockAndItem(ModBlocks.BURLAP_SLAB, ModBlocks.BURLAP_BLOCK);
        customSimpleBlockAndItem(ModBlocks.BURLAP_CARPET);
        customHorizontalBlockAndItem(ModBlocks.BURLAP_AWNING);
        threeStackedHorizontalBlockAndItem(ModBlocks.BURLAP_SACK);

        sailorFlagWithItem();
        fiveTexturesCustomHorizontalBlockAndFlatBlockItem(ModBlocks.SAILOR_PENNANT_FLAG);

        fourStackedHorizontalBlockAndItem(ModBlocks.CERAMIC_POT);
        fourStackedHorizontalBlockAndItem(ModBlocks.GLAZED_CERAMIC_POT);

        customHorizontalBlockAndItem(ModBlocks.VINTAGE_CASH_REGISTER);

        customHorizontalBlockAndItem(ModBlocks.HANGING_SAUSAGES);
        fourStackedHorizontalBlockAndItem(ModBlocks.WRAPPED_MEAT);
        threeTexturesCustomHorizontalBlockAndFlatItem(ModBlocks.COWHIDE_RUG);
        twoTexturesCustomHorizontalBlockAndFlatItem(ModBlocks.MOOSHROOM_COWHIDE_RUG);

        customLampAndBlockItem(ModBlocks.COPPER_LIGHT);
        customLampAndBlockItem(ModBlocks.WAXED_COPPER_LIGHT);
        customLampAndBlockItem(ModBlocks.SHODDY_COPPER_LIGHT);
        customLampAndBlockItem(ModBlocks.WAXED_SHODDY_COPPER_LIGHT);

        cameraQuadropodAndItem();
        customHorizontalBlockAndItem(ModBlocks.CAMERA);
        customHorizontalBlockAndItem(ModBlocks.MOVIE_CAMERA);

        blockAndItem(ModBlocks.WICKER_BLOCK);
        stairsBlockAndItem(ModBlocks.WICKER_STAIRS, ModBlocks.WICKER_BLOCK);
        slabBlockAndItem(ModBlocks.WICKER_SLAB, ModBlocks.WICKER_BLOCK);
        customHorizontalBlockAndItem(ModBlocks.WICKER_BASKET);
        wickerBasketProduce(ModBlocks.APPLE_WICKER_BASKET);
        wickerBasketProduce(ModBlocks.SWEET_BERRIES_WICKER_BASKET);
        wickerBasketProduce(ModBlocks.GLOW_BERRIES_WICKER_BASKET);
        wickerBasketProduce(ModBlocks.CARROT_WICKER_BASKET);
        wickerBasketProduce(ModBlocks.POTATO_WICKER_BASKET);
        wickerBasketProduce(ModBlocks.BEETROOT_WICKER_BASKET);
        wickerBasketProduce(ModBlocks.SEA_PICKLE_WICKER_BASKET);
        wickerBasketProduce(ModBlocks.COD_WICKER_BASKET);
        wickerBasketProduce(ModBlocks.SALMON_WICKER_BASKET);
        wickerBasketFlowers(ModBlocks.PINK_PETALS_WICKER_BASKET);
        wickerBasketFlowers(ModBlocks.LILAC_WICKER_BASKET);
        wickerBasketFlowers(ModBlocks.ROSE_BUSH_WICKER_BASKET);
        wickerBasketFlowers(ModBlocks.PEONY_WICKER_BASKET);

        threeStackedHorizontalBlockAndItem(ModBlocks.GOURD);
        customHorizontalBlockAndItem(ModBlocks.HANGING_GOURDS);
        threeStackedHorizontalBlockAndItem(ModBlocks.CARVED_BEETROOT);
        threeStackedHorizontalBlockAndItem(ModBlocks.BEET_O_LANTERN);

        customHorizontalTallBlockAndItem(ModBlocks.BEETROOT_SCARECROW);
        customHorizontalTallBlockAndItem(ModBlocks.PUMPKIN_SCARECROW);

        customHorizontalBlockAndItem(ModBlocks.MINI_SNOWMAN);
        plushiesAndItem();
        customHorizontalBlockAndItem(ModBlocks.NUTCRACKER);
        threeTexturesCustomHorizontalBlockAndFlatItem(ModBlocks.FALL_GARLAND);
        threeTexturesCustomHorizontalBlockAndFlatItem(ModBlocks.WINTER_GARLAND);
        customDirectionalBlockAndFlatItem(ModBlocks.WINTER_WREATH);
        customHorizontalBlockAndFlatItem(ModBlocks.FAIRY_LIGHTS);
        customHorizontalFaceBlockAndItem(ModBlocks.HOLIDAY_ORNAMENTS);

        customHorizontalTallBlockAndItem(ModBlocks.GIANT_ANCHOR);
        giantChainAndItem();

        blockAndItem(ModBlocks.PLAIN_CUSHION_BLOCK);
        stairsBlockAndItem(ModBlocks.PLAIN_CUSHION_STAIRS, ModBlocks.PLAIN_CUSHION_BLOCK);
        slabBlockAndItem(ModBlocks.PLAIN_CUSHION_SLAB, ModBlocks.PLAIN_CUSHION_BLOCK);
        blockAndItem(ModBlocks.WHITE_CUSHION_BLOCK);
        stairsBlockAndItem(ModBlocks.WHITE_CUSHION_STAIRS, ModBlocks.WHITE_CUSHION_BLOCK);
        slabBlockAndItem(ModBlocks.WHITE_CUSHION_SLAB, ModBlocks.WHITE_CUSHION_BLOCK);
        blockAndItem(ModBlocks.LIGHT_GRAY_CUSHION_BLOCK);
        stairsBlockAndItem(ModBlocks.LIGHT_GRAY_CUSHION_STAIRS, ModBlocks.LIGHT_GRAY_CUSHION_BLOCK);
        slabBlockAndItem(ModBlocks.LIGHT_GRAY_CUSHION_SLAB, ModBlocks.LIGHT_GRAY_CUSHION_BLOCK);
        blockAndItem(ModBlocks.GRAY_CUSHION_BLOCK);
        stairsBlockAndItem(ModBlocks.GRAY_CUSHION_STAIRS, ModBlocks.GRAY_CUSHION_BLOCK);
        slabBlockAndItem(ModBlocks.GRAY_CUSHION_SLAB, ModBlocks.GRAY_CUSHION_BLOCK);
        blockAndItem(ModBlocks.BLACK_CUSHION_BLOCK);
        stairsBlockAndItem(ModBlocks.BLACK_CUSHION_STAIRS, ModBlocks.BLACK_CUSHION_BLOCK);
        slabBlockAndItem(ModBlocks.BLACK_CUSHION_SLAB, ModBlocks.BLACK_CUSHION_BLOCK);
        blockAndItem(ModBlocks.BROWN_CUSHION_BLOCK);
        stairsBlockAndItem(ModBlocks.BROWN_CUSHION_STAIRS, ModBlocks.BROWN_CUSHION_BLOCK);
        slabBlockAndItem(ModBlocks.BROWN_CUSHION_SLAB, ModBlocks.BROWN_CUSHION_BLOCK);
        blockAndItem(ModBlocks.RED_CUSHION_BLOCK);
        stairsBlockAndItem(ModBlocks.RED_CUSHION_STAIRS, ModBlocks.RED_CUSHION_BLOCK);
        slabBlockAndItem(ModBlocks.RED_CUSHION_SLAB, ModBlocks.RED_CUSHION_BLOCK);
        blockAndItem(ModBlocks.ORANGE_CUSHION_BLOCK);
        stairsBlockAndItem(ModBlocks.ORANGE_CUSHION_STAIRS, ModBlocks.ORANGE_CUSHION_BLOCK);
        slabBlockAndItem(ModBlocks.ORANGE_CUSHION_SLAB, ModBlocks.ORANGE_CUSHION_BLOCK);
        blockAndItem(ModBlocks.YELLOW_CUSHION_BLOCK);
        stairsBlockAndItem(ModBlocks.YELLOW_CUSHION_STAIRS, ModBlocks.YELLOW_CUSHION_BLOCK);
        slabBlockAndItem(ModBlocks.YELLOW_CUSHION_SLAB, ModBlocks.YELLOW_CUSHION_BLOCK);
        blockAndItem(ModBlocks.LIME_CUSHION_BLOCK);
        stairsBlockAndItem(ModBlocks.LIME_CUSHION_STAIRS, ModBlocks.LIME_CUSHION_BLOCK);
        slabBlockAndItem(ModBlocks.LIME_CUSHION_SLAB, ModBlocks.LIME_CUSHION_BLOCK);
        blockAndItem(ModBlocks.GREEN_CUSHION_BLOCK);
        stairsBlockAndItem(ModBlocks.GREEN_CUSHION_STAIRS, ModBlocks.GREEN_CUSHION_BLOCK);
        slabBlockAndItem(ModBlocks.GREEN_CUSHION_SLAB, ModBlocks.GREEN_CUSHION_BLOCK);
        blockAndItem(ModBlocks.CYAN_CUSHION_BLOCK);
        stairsBlockAndItem(ModBlocks.CYAN_CUSHION_STAIRS, ModBlocks.CYAN_CUSHION_BLOCK);
        slabBlockAndItem(ModBlocks.CYAN_CUSHION_SLAB, ModBlocks.CYAN_CUSHION_BLOCK);
        blockAndItem(ModBlocks.LIGHT_BLUE_CUSHION_BLOCK);
        stairsBlockAndItem(ModBlocks.LIGHT_BLUE_CUSHION_STAIRS, ModBlocks.LIGHT_BLUE_CUSHION_BLOCK);
        slabBlockAndItem(ModBlocks.LIGHT_BLUE_CUSHION_SLAB, ModBlocks.LIGHT_BLUE_CUSHION_BLOCK);
        blockAndItem(ModBlocks.BLUE_CUSHION_BLOCK);
        stairsBlockAndItem(ModBlocks.BLUE_CUSHION_STAIRS, ModBlocks.BLUE_CUSHION_BLOCK);
        slabBlockAndItem(ModBlocks.BLUE_CUSHION_SLAB, ModBlocks.BLUE_CUSHION_BLOCK);
        blockAndItem(ModBlocks.PURPLE_CUSHION_BLOCK);
        stairsBlockAndItem(ModBlocks.PURPLE_CUSHION_STAIRS, ModBlocks.PURPLE_CUSHION_BLOCK);
        slabBlockAndItem(ModBlocks.PURPLE_CUSHION_SLAB, ModBlocks.PURPLE_CUSHION_BLOCK);
        blockAndItem(ModBlocks.MAGENTA_CUSHION_BLOCK);
        stairsBlockAndItem(ModBlocks.MAGENTA_CUSHION_STAIRS, ModBlocks.MAGENTA_CUSHION_BLOCK);
        slabBlockAndItem(ModBlocks.MAGENTA_CUSHION_SLAB, ModBlocks.MAGENTA_CUSHION_BLOCK);
        blockAndItem(ModBlocks.PINK_CUSHION_BLOCK);
        stairsBlockAndItem(ModBlocks.PINK_CUSHION_STAIRS, ModBlocks.PINK_CUSHION_BLOCK);
        slabBlockAndItem(ModBlocks.PINK_CUSHION_SLAB, ModBlocks.PINK_CUSHION_BLOCK);

        customSimpleBlockAndItem(ModBlocks.SEASTONE_QUOIN);
        customSimpleBlockAndItem(ModBlocks.SMOOTH_STONE_QUOIN);
        customSimpleBlockAndItem(ModBlocks.POLISHED_GRANITE_QUOIN);
        customSimpleBlockAndItem(ModBlocks.POLISHED_DIORITE_QUOIN);
        customSimpleBlockAndItem(ModBlocks.POLISHED_ANDESITE_QUOIN);
        customSimpleBlockAndItem(ModBlocks.POLISHED_TUFF_QUOIN);
        customSimpleBlockAndItem(ModBlocks.PACKED_MUD_QUOIN);
        customSimpleBlockAndItem(ModBlocks.SANDSTONE_QUOIN);
        customSimpleBlockAndItem(ModBlocks.RED_SANDSTONE_QUOIN);
        customSimpleBlockAndItem(ModBlocks.POLISHED_BLACKSTONE_QUOIN);

        customHorizontalBlockAndItem(ModBlocks.SEASTONE_MURAL);
        customHorizontalBlockAndItem(ModBlocks.SMOOTH_STONE_MURAL);
        customHorizontalBlockAndItem(ModBlocks.GRANITE_MURAL);
        customHorizontalBlockAndItem(ModBlocks.DIORITE_MURAL);
        customHorizontalBlockAndItem(ModBlocks.ANDESITE_MURAL);

        cubeColumnAndItem(ModBlocks.SEASTONE_BLOCK);
        stairsBlockAndItem(ModBlocks.SEASTONE_STAIRS, ModBlocks.SEASTONE_BLOCK, ModBlocks.SEASTONE_BLOCK);
        slabBlockAndItem(ModBlocks.SEASTONE_SLAB, ModBlocks.SEASTONE_BLOCK, ModBlocks.SEASTONE_BLOCK, ModBlocks.SEASTONE_BLOCK);
        wallBlockAndItem(ModBlocks.SEASTONE_WALL, ModBlocks.SEASTONE_BLOCK, "_side");
        blockAndItem(ModBlocks.SEASTONE_BRICKS);
        blockAndItem(ModBlocks.CHISELED_SEASTONE_BRICKS);
        stairsBlockAndItem(ModBlocks.SEASTONE_BRICK_STAIRS, ModBlocks.SEASTONE_BRICKS);
        slabBlockAndItem(ModBlocks.SEASTONE_BRICK_SLAB, ModBlocks.SEASTONE_BRICKS);
        wallBlockAndItem(ModBlocks.SEASTONE_BRICK_WALL, ModBlocks.SEASTONE_BRICKS);
        blockAndItem(ModBlocks.SMOOTH_SEASTONE_BLOCK, ModBlocks.SEASTONE_BLOCK, "_end");
        stairsBlockAndItem(ModBlocks.SMOOTH_SEASTONE_STAIRS, ModBlocks.SEASTONE_BLOCK, "_end");
        slabBlockAndItem(ModBlocks.SMOOTH_SEASTONE_SLAB, ModBlocks.SEASTONE_BLOCK, "_end");
        wallBlockAndItem(ModBlocks.SMOOTH_SEASTONE_WALL, ModBlocks.SEASTONE_BLOCK, "_end");
        blockAndItem(ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICKS);
        stairsBlockAndItem(ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICK_STAIRS, ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICKS);
        slabBlockAndItem(ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICK_SLAB, ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICKS);
        wallBlockAndItem(ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICK_WALL, ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICKS);
        blockAndItem(ModBlocks.SNOWY_COBBLESTONE_BLOCK);
        stairsBlockAndItem(ModBlocks.SNOWY_COBBLESTONE_STAIRS, ModBlocks.SNOWY_COBBLESTONE_BLOCK);
        slabBlockAndItem(ModBlocks.SNOWY_COBBLESTONE_SLAB, ModBlocks.SNOWY_COBBLESTONE_BLOCK);
        wallBlockAndItem(ModBlocks.SNOWY_COBBLESTONE_WALL, ModBlocks.SNOWY_COBBLESTONE_BLOCK);
        blockAndItem(ModBlocks.SNOWY_STONE_BRICKS);
        stairsBlockAndItem(ModBlocks.SNOWY_STONE_BRICK_STAIRS, ModBlocks.SNOWY_STONE_BRICKS);
        slabBlockAndItem(ModBlocks.SNOWY_STONE_BRICK_SLAB, ModBlocks.SNOWY_STONE_BRICKS);
        wallBlockAndItem(ModBlocks.SNOWY_STONE_BRICK_WALL, ModBlocks.SNOWY_STONE_BRICKS);
        blockAndItem(ModBlocks.SMOOTH_STONE_BRICKS);
        stairsBlockAndItem(ModBlocks.SMOOTH_STONE_BRICK_STAIRS, ModBlocks.SMOOTH_STONE_BRICKS);
        slabBlockAndItem(ModBlocks.SMOOTH_STONE_BRICK_SLAB, ModBlocks.SMOOTH_STONE_BRICKS);
        wallBlockAndItem(ModBlocks.SMOOTH_STONE_BRICK_WALL, ModBlocks.SMOOTH_STONE_BRICKS);

    }


    //Create blockstates file and item model file for block with pre-made custom block model (e.g., Blockbench model)
    private void customHorizontalBlockAndItem(RegistryObject<Block, Block> block) {
        horizontalBlock(block.get(), new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + block.getId().getPath())));
        blockItem(block);
    }
    private void customHorizontalBlockAndFlatItem(RegistryObject<Block, Block> block) {
        horizontalBlock(block.get(), new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + block.getId().getPath())));
        flatItem(block);
    }
    private void customHorizontalFaceBlockAndItem(RegistryObject<Block, Block> block) {
        horizontalFaceBlock(block.get(), new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + block.getId().getPath())));
        blockItem(block);
    }
    private void customHorizontalFaceBlockAndFlatBlockItem(RegistryObject<Block, Block> block) {
        horizontalFaceBlock(block.get(), new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + block.getId().getPath())));
        flatBlockItem(block);
    }
    private void customHorizontalFaceBlockAndFlatItem(RegistryObject<Block, Block> block) {
        horizontalFaceBlock(block.get(), new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + block.getId().getPath())));
        flatItem(block);
    }
    private void customDirectionalBlockAndItem(RegistryObject<Block, Block> block) {
        directionalBlock(block.get(), new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + block.getId().getPath())));
        blockItem(block);
    }
    private void customDirectionalBlockAndFlatItem(RegistryObject<Block, Block> block) {
        directionalBlock(block.get(), new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + block.getId().getPath())));
        flatItem(block);
    }
    private void customAxisBlockAndItem(RegistryObject<Block, Block> block) {
        ModelFile model = new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + block.getId().getPath()));
        getVariantBuilder(block.get())
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Y).modelForState().modelFile(model).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.Z).modelForState().modelFile(model).rotationX(90).addModel()
                .partialState().with(RotatedPillarBlock.AXIS, Direction.Axis.X).modelForState().modelFile(model).rotationX(90).rotationY(90).addModel();
        blockItem(block);
    }
    private void translucentBlockAndItem(RegistryObject<Block, Block> block) {
        simpleBlockWithItem(block.get(), models().cubeAll(block.getId().getPath(), blockTexture(block.get())).renderType(TRANSLUCENT));
    }
    private void cutoutBlockAndItem(RegistryObject<Block, Block> block) {
        simpleBlockWithItem(block.get(), models().cubeAll(block.getId().getPath(), blockTexture(block.get())).renderType(CUTOUT));
    }


    private void twoTexturesCustomHorizontalBlockAndFlatItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            String blockPath = block.getId().getPath();
            int i = blockState.getValue(ModConstants.TEXTURE_2);
            ModelFile model = models().withExistingParent(BLOCK_FOLDER + blockPath + "_" + i, modLoc(BLOCK_FOLDER + "template_" + blockPath))
                    .texture("0", BLOCK_FOLDER + blockPath + "/" + i);
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
        });
        flatItem(block);
    }

    private void threeTexturesBlockAndItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            String blockPath = block.getId().getPath();
            int i = blockState.getValue(ModConstants.TEXTURE_3);
            return new ConfiguredModel[] { new ConfiguredModel(models().cubeAll(blockPath + "_" + i, modLoc(BLOCK_FOLDER + blockPath + "/" + i))) };
        });
        blockItem(block, "_0");
    }
    private void threeTexturesCustomHorizontalBlockAndItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            String blockPath = block.getId().getPath();
            int i = blockState.getValue(ModConstants.TEXTURE_3);
            ModelFile model = models().withExistingParent(BLOCK_FOLDER + blockPath + "_" + i, modLoc(BLOCK_FOLDER + "template_" + blockPath))
                    .texture("0", BLOCK_FOLDER + blockPath + "/" + i);
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
        });
        blockItem(block, "_0");
    }
    private void threeTexturesCustomHorizontalBlockAndFlatItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            String blockPath = block.getId().getPath();
            int i = blockState.getValue(ModConstants.TEXTURE_3);
            ModelFile model = models().withExistingParent(BLOCK_FOLDER + blockPath + "_" + i, modLoc(BLOCK_FOLDER + "template_" + blockPath))
                    .texture("0", BLOCK_FOLDER + blockPath + "/" + i);
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
        });
        flatItem(block);
    }
    private void threeTexturesCustomHorizontalBlockAndFlatBlockItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            String blockPath = block.getId().getPath();
            int i = blockState.getValue(ModConstants.TEXTURE_3);
            ModelFile model = models().withExistingParent(BLOCK_FOLDER + blockPath + "_" + i, modLoc(BLOCK_FOLDER + "template_" + blockPath))
                    .texture("0", BLOCK_FOLDER + blockPath + "/" + i);
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
        });
        flatBlockItem(block, "/0");
    }

    private void fourTexturesBlockAndItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            String blockPath = block.getId().getPath();
            int i = blockState.getValue(ModConstants.TEXTURE_4);
            return new ConfiguredModel[] { new ConfiguredModel(models().cubeAll(blockPath + "_" + i, modLoc(BLOCK_FOLDER + blockPath + "/" + i))) };
        });
        blockItem(block, "_0");
    }
    private void fourTexturesCustomBlockAndItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            String blockPath = block.getId().getPath();
            int i = blockState.getValue(ModConstants.TEXTURE_4);
            ModelFile model = models().withExistingParent(BLOCK_FOLDER + blockPath + "_" + i, modLoc("template_" + blockPath))
                    .texture("0", BLOCK_FOLDER + blockPath + "/" + i);
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).build();
        });
        blockItem(block, "_0");
    }
    private void fourTexturesCustomHorizontalFaceBlockAndFlatBlockItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            String blockPath = block.getId().getPath();
            int i = blockState.getValue(ModConstants.TEXTURE_4);
            ModelFile model = models().withExistingParent(BLOCK_FOLDER + blockPath + "_" + i, modLoc("template_" + blockPath))
                    .texture("0", BLOCK_FOLDER + blockPath + "/" + i);
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationX(((AttachFace)blockState.getValue(BlockStateProperties.ATTACH_FACE)).ordinal() * 90)
                    .rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180 + (blockState.getValue(BlockStateProperties.ATTACH_FACE) == AttachFace.CEILING ? 180 : 0)) % 360).build();
        });
        flatBlockItem(block, "/0");
    }

    private void fiveTexturesCustomHorizontalBlockAndFlatBlockItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            String blockPath = block.getId().getPath();
            int i = blockState.getValue(ModConstants.TEXTURE_5);
            ModelFile model = models().withExistingParent(BLOCK_FOLDER + blockPath + "_" + i, modLoc(BLOCK_FOLDER + "template_" + blockPath))
                    .texture("0", BLOCK_FOLDER + blockPath + "/" + i);
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
        });
        flatBlockItem(block, "/0");
    }

    private void sixTexturesCustomHorizontalBlockAndItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            String blockPath = block.getId().getPath();
            int i = blockState.getValue(ModConstants.TEXTURE_6);
            ModelFile model = models().withExistingParent(BLOCK_FOLDER + blockPath + "_" + i, modLoc(BLOCK_FOLDER + "template_" + blockPath))
                    .texture("0", BLOCK_FOLDER + blockPath + "/" + i);
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
        });
        blockItem(block, "_0");
    }

    private void sixModelsCustomHorizontalBlockAndItem(RegistryObject<Block, Block> block) {
        String blockPath = block.getId().getPath();
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            int i = blockState.getValue(ModConstants.MODEL_6);
            ModelFile model = models().getExistingFile(modLoc(BLOCK_FOLDER + blockPath + "_" + i));
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
        });
        blockItem(block, "_0");
    }

    private void banisterBlockAndFlatItem(RegistryObject<Block, Block> banister) {
        paneBlockWithRenderType((IronBarsBlock) banister.get(), getBlockPath(banister), getBlockPath(banister, TOP), CUTOUT);
        flatBlockItem(banister);
    }
    private void largeShelfBlockAndItem(RegistryObject<Block, Block> shelf) {
        String blockPath = shelf.getId().getPath();
        String plankType = blockPath.substring(0, blockPath.length() - 11) + "planks";
        ModelFile model = models().withExistingParent(BLOCK_FOLDER + blockPath, modLoc(BLOCK_FOLDER + "template_large_shelf"))
                .texture("planks", mcLoc(BLOCK_FOLDER + plankType));
        Function<BlockState, ModelFile> modelFunc = ($ -> model);
        getVariantBuilder(shelf.get()).forAllStates(blockState -> ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build());
        blockItem(shelf);
    }
    private void glassPaneBlockAndFlatItem(RegistryObject<Block, Block> block, RegistryObject<Block, Block> textureBlock) {
        paneBlockWithRenderType((IronBarsBlock) block.get(), getBlockPath(textureBlock), getBlockPath(textureBlock), TRANSLUCENT);
        itemModels().withExistingParent(block.getId().getPath(), GENERATED).texture("layer0", BLOCK_FOLDER + textureBlock.getId().getPath());
    }
    private void seaWindowPaneBlockAndFlatItem(RegistryObject<Block, Block> block, RegistryObject<Block, Block> textureBlock) {
        paneBlockWithRenderType((IronBarsBlock) block.get(), getBlockPath(textureBlock), modLoc(BLOCK_FOLDER + "sea_window" + TOP), TRANSLUCENT);
        itemModels().withExistingParent(block.getId().getPath(), GENERATED).texture("layer0", BLOCK_FOLDER + textureBlock.getId().getPath());
    }
    private void goldCoinsLayerAndFlatItem() {
        ModelFile[] model = new ModelFile[] {
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GOLD_COINS_LAYER.getId().getPath() + "_2")),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GOLD_COINS_LAYER.getId().getPath() + "_4")),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GOLD_COINS_LAYER.getId().getPath() + "_6")),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GOLD_COINS_LAYER.getId().getPath() + "_8")),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GOLD_COINS_LAYER.getId().getPath() + "_10")),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GOLD_COINS_LAYER.getId().getPath() + "_12")),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GOLD_COINS_LAYER.getId().getPath() + "_14")),
                new ModelFile.UncheckedModelFile(modLoc("block/" + ModBlocks.GOLD_COINS_BLOCK.getId().getPath())),
        };
        getVariantBuilder(ModBlocks.GOLD_COINS_LAYER.get())
                .partialState().with(GoldCoinsLayerBlock.LAYERS, 1).modelForState().modelFile(model[0]).addModel()
                .partialState().with(GoldCoinsLayerBlock.LAYERS, 2).modelForState().modelFile(model[1]).addModel()
                .partialState().with(GoldCoinsLayerBlock.LAYERS, 3).modelForState().modelFile(model[2]).addModel()
                .partialState().with(GoldCoinsLayerBlock.LAYERS, 4).modelForState().modelFile(model[3]).addModel()
                .partialState().with(GoldCoinsLayerBlock.LAYERS, 5).modelForState().modelFile(model[4]).addModel()
                .partialState().with(GoldCoinsLayerBlock.LAYERS, 6).modelForState().modelFile(model[5]).addModel()
                .partialState().with(GoldCoinsLayerBlock.LAYERS, 7).modelForState().modelFile(model[6]).addModel()
                .partialState().with(GoldCoinsLayerBlock.LAYERS, 8).modelForState().modelFile(model[7]).addModel();
        flatItem(ModBlocks.GOLD_COINS_LAYER);
    }
    private void customLampAndBlockItem(RegistryObject<Block, Block> block) {
        ModelFile on = new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + block.getId().getPath() + ON));
        ModelFile off = new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + block.getId().getPath() + OFF));
        getVariantBuilder(block.get())
                .partialState().with(BlockStateProperties.LIT, true).addModels(new ConfiguredModel(on))
                .partialState().with(BlockStateProperties.LIT, false).addModels(new ConfiguredModel(off));
        blockItem(block, ON);
    }
    private void seaglassLamp(RegistryObject<Block, Block> seaglassLamp) {
        String seaglassLampPath = seaglassLamp.getId().getPath();
        ModelFile on = models().withExistingParent(BLOCK_FOLDER + seaglassLampPath + ON, modLoc(BLOCK_FOLDER + "template_seaglass_lamp_on"))
                .texture("lamp", modLoc(BLOCK_FOLDER + seaglassLampPath))
                .renderType(TRANSLUCENT);
        ModelFile off = models().withExistingParent(BLOCK_FOLDER + seaglassLampPath + OFF, modLoc(BLOCK_FOLDER + "template_seaglass_lamp_off"))
                .texture("lamp", modLoc(BLOCK_FOLDER + seaglassLampPath))
                .renderType(TRANSLUCENT);

        getVariantBuilder(seaglassLamp.get())
                .partialState().with(BlockStateProperties.LIT, true).addModels(new ConfiguredModel(on))
                .partialState().with(BlockStateProperties.LIT, false).addModels(new ConfiguredModel(off));
        blockItem(seaglassLamp, ON);
    }
    private void scatteredPapersAndFlatItem() {
        String blockPath = ModBlocks.SCATTERED_PAPERS.getId().getPath();
        getVariantBuilder(ModBlocks.SCATTERED_PAPERS.get()).forAllStates(blockState -> {
            int i = blockState.getValue(ModConstants.TEXTURE_4);
            ModelFile model = new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + blockPath + "_" + i));
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int)((Direction)blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
        });
        flatItem(ModBlocks.SCATTERED_PAPERS);
    }
    private void sailorFlagWithItem() {
        String blockPath = ModBlocks.SAILOR_FLAG.getId().getPath();
        getVariantBuilder(ModBlocks.SAILOR_FLAG.get()).forAllStates(blockState -> {
            int i = blockState.getValue(ModConstants.TEXTURE_5);
            ModelFile model = models().withExistingParent(BLOCK_FOLDER + blockPath + "_" + i, modLoc(BLOCK_FOLDER + "template_" + blockPath))
                    .texture("0", BLOCK_FOLDER + blockPath + "/" + i);
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            int yRot = ((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360;
            return switch(blockState.getValue(RotatedPillarBlock.AXIS)) {
                case Y -> ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(yRot).build();
                case Z -> ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationX(90).build();
                case X -> ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationX(90).rotationY(90).build();
            };
        });
        blockItem(ModBlocks.SAILOR_FLAG, "_0");
    }
    private void plushiesAndItem() {
        getVariantBuilder(ModBlocks.PLUSHIE.get()).forAllStates(blockState -> {
            int i = blockState.getValue(ModConstants.TEXTURE_9);
            ModelFile model = models().withExistingParent(BLOCK_FOLDER + PLUSHIE_NAME[i] + "_plushie", modLoc(BLOCK_FOLDER + "template_plushie"))
                    .texture("0", BLOCK_FOLDER + "plushie/" + PLUSHIE_NAME[i]);
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            return ConfiguredModel.builder().modelFile(modelFunc.apply(blockState)).rotationY(((int) ((Direction) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360).build();
        });
        blockItem(PLUSHIE_NAME[0] + "_", ModBlocks.PLUSHIE);
    }
    //
    private void customHorizontalTallBlockAndItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            ModelFile bottom = new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath() + "_bottom"));
            ModelFile top = new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath() + "_top"));
            int yRot = (((int) (blockState.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot())) + 180) % 360;
            ModelFile model = blockState.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.LOWER ? bottom : top ;
            return ConfiguredModel.builder().modelFile(model).rotationY(yRot).build();
        });
        blockItem(block);
    }
    private void giantChainAndItem() {
        String giantChainPath = ModBlocks.GIANT_CHAIN.getId().getPath();
        ModelFile model = new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + giantChainPath));
        ModelFile anchor_model = new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + giantChainPath + "_above_anchor"));
        getVariantBuilder(ModBlocks.GIANT_CHAIN.get()).forAllStates(state -> {
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            Function<BlockState, ModelFile> anchorModelFunc = ($ -> anchor_model);
            return !state.getValue(GiantChainBlock.ABOVE_ANCHOR)
                    ? ConfiguredModel.builder()
                    .modelFile(modelFunc.apply(state))
                    .rotationX(state.getValue(BlockStateProperties.ATTACH_FACE).ordinal() * 90)
                    .rotationY((((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + 180) + (state.getValue(BlockStateProperties.ATTACH_FACE) == AttachFace.CEILING ? 180 : 0)) % 360).build()
                    : ConfiguredModel.builder()
                    .modelFile(anchorModelFunc.apply(state))
                    .rotationY((((int) state.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + 180) + (state.getValue(BlockStateProperties.ATTACH_FACE) == AttachFace.CEILING ? 180 : 0)) % 360).build();
        });
        blockItem(ModBlocks.GIANT_CHAIN);
    }

    private void threeStackedHorizontalBlockAndItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            String blockPath = block.getId().getPath();
            int amount = blockState.getValue(ModConstants.AMOUNT_3);
            ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + blockPath + "_" + amount));
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            return ConfiguredModel.builder()
                    .modelFile(modelFunc.apply(blockState))
                    .rotationY(((int) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + 180) % 360)
                    .build();
        });
        blockItem(block, "_" + ModConstants.MAX_AMOUNT_3);
    }
    private void threeStackedHorizontalBlockAndFlatItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            String blockPath = block.getId().getPath();
            int amount = blockState.getValue(ModConstants.AMOUNT_3);
            ModelFile model = new ModelFile.UncheckedModelFile(modLoc("block/" + blockPath + "_" + amount));
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            return ConfiguredModel.builder()
                    .modelFile(modelFunc.apply(blockState))
                    .rotationY(((int) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + 180) % 360)
                    .build();
        });
        flatItem(block);
    }
    private void fourStackedHorizontalBlockAndItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            int amount = blockState.getValue(ModConstants.AMOUNT_4);
            ModelFile model = new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + block.getId().getPath() + "_" + amount));
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            return ConfiguredModel.builder()
                    .modelFile(modelFunc.apply(blockState))
                    .rotationY(((int) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + 180) % 360)
                    .build();
        });
        blockItem(block, "_" + ModConstants.MAX_AMOUNT_4);
    }
    private void fourStackedHorizontalBlockAndFlatItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            int amount = blockState.getValue(ModConstants.AMOUNT_4);
            ModelFile model = new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + block.getId().getPath() + "_" + amount));
            Function<BlockState, ModelFile> modelFunc = ($ -> model);
            return ConfiguredModel.builder()
                    .modelFile(modelFunc.apply(blockState))
                    .rotationY(((int) blockState.getValue(BlockStateProperties.HORIZONTAL_FACING).toYRot() + 180) % 360)
                    .build();
        });
        flatItem(block);
    }
    private void woolAwningAndItem(RegistryObject<Block, Block> awning) {
        String awningPath = awning.getId().getPath();
        String wool = awningPath.substring(0, awningPath.length() - 7);
        ModelFile model = models().withExistingParent(BLOCK_FOLDER + awningPath, modLoc(BLOCK_FOLDER + "template_wool_awning"))
                .texture("awning", modLoc(BLOCK_FOLDER + awningPath))
                .texture("particle", mcLoc(BLOCK_FOLDER + wool))
                .renderType(CUTOUT);
        horizontalBlock(awning.get(), model);
        blockItem(awning);
    }
    private void paperLanternAndFlatItem(RegistryObject<Block, Block> paperLantern) {
//        String lanternPath = paperLantern.getId().getPath();
        horizontalBlock(paperLantern.get(), models().getExistingFile(getBlockPath(paperLantern)));
        flatItem(paperLantern);
    }
    private void wickerBasketProduce(RegistryObject<Block, Block> basket) {
        String basketPath = basket.getId().getPath();
        ModelFile model = models().withExistingParent(BLOCK_FOLDER + basketPath, modLoc(BLOCK_FOLDER + "template_wicker_basket_produce"))
                .texture("produce", modLoc(BLOCK_FOLDER + basketPath));
        horizontalBlock(basket.get(), model);
        blockItem(basket);
    }
    private void wickerBasketFlowers(RegistryObject<Block, Block> basket) {
        String basketPath = basket.getId().getPath();
        ModelFile model = models().withExistingParent(BLOCK_FOLDER + basketPath, modLoc(BLOCK_FOLDER + "template_wicker_basket_flowers"))
                .texture("flowers", modLoc(BLOCK_FOLDER + basketPath));
        horizontalBlock(basket.get(), model);
        blockItem(basket);
    }
    private void cameraQuadropodAndItem() {
        getVariantBuilder(ModBlocks.CAMERA_QUADROPOD.get()).forAllStates(blockState -> {
            String quadropodPath = ModBlocks.CAMERA_QUADROPOD.getId().getPath();

            ModelFile quadropod_bottom = new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + quadropodPath));
            ModelFile quadropod_top = models().withExistingParent(BLOCK_FOLDER + quadropodPath + TOP, mcLoc(BLOCK_FOLDER + "block"))
                    .texture("particle", modLoc(BLOCK_FOLDER + quadropodPath));

            ModelFile camera_top = new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + "camera_on_quadropod"));
            ModelFile movieCamera_top = new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + "movie_camera_on_quadropod"));

            int yRot = ((int) (blockState.getValue(BlockStateProperties.HORIZONTAL_FACING)).toYRot() + 180) % 360;
            ModelFile quadropod = blockState.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.LOWER ? quadropod_bottom : quadropod_top;
            ModelFile camera = blockState.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.LOWER ? quadropod_bottom : camera_top;
            ModelFile movieCamera = blockState.getValue(BlockStateProperties.DOUBLE_BLOCK_HALF) == DoubleBlockHalf.LOWER ? quadropod_bottom : movieCamera_top;
            Function<BlockState, ModelFile> quadropodFunc = ($ -> quadropod);
            Function<BlockState, ModelFile> cameraFunc = ($ -> camera);
            Function<BlockState, ModelFile> movieCameraFunc = ($ -> movieCamera);
            return switch (blockState.getValue(ModConstants.ATTACHED_CAMERA)) {
                case NONE -> ConfiguredModel.builder().modelFile(quadropodFunc.apply(blockState)).rotationY(yRot).build();
                case CAMERA -> ConfiguredModel.builder().modelFile(cameraFunc.apply(blockState)).rotationY(yRot).build();
                case MOVIE_CAMERA -> ConfiguredModel.builder().modelFile(movieCameraFunc.apply(blockState)).rotationY(yRot).build();
            };
        });
        blockItem(ModBlocks.CAMERA_QUADROPOD);
    }
    private void nautilusShell(RegistryObject<Block, Block> block) {
        String nautilusPath = ModBlocks.BIG_NAUTILUS_SHELL.getId().getPath();
        ModelFile model = models().withExistingParent(BLOCK_FOLDER + block.getId().getPath(), mcLoc("cube"))
                .texture("down", modLoc(BLOCK_FOLDER + nautilusPath + BOTTOM))
                .texture("up", BLOCK_FOLDER + nautilusPath + TOP)
                .texture("north", block.get() == ModBlocks.BIG_NAUTILUS_SHELL.get() ? BLOCK_FOLDER + nautilusPath + FRONT : BLOCK_FOLDER + nautilusPath + "_lantern")
                .texture("south", BLOCK_FOLDER + nautilusPath + TOP)
                .texture("east", BLOCK_FOLDER + nautilusPath + RIGHT)
                .texture("west", BLOCK_FOLDER + nautilusPath + LEFT)
                .texture("particle", BLOCK_FOLDER + nautilusPath + RIGHT);
        horizontalBlock(block.get(), model);
        blockItem(block);
    }



    private void customSimpleBlockAndItem(RegistryObject<Block, Block> block) {
        simpleBlockWithItem(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath())));
        blockItem(block);
    }
    private void customSimpleBlockAndItem(RegistryObject<Block, Block> block, String appendix) {
        simpleBlockWithItem(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath() + appendix)));
        blockItem(block, appendix);
    }
    private void customBlockNoItem(RegistryObject<Block, Block> block) {
        simpleBlockWithItem(block.get(), new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + block.getId().getPath())));
    }
    //    private void axisBlockWithItem(RegistryObject<Block, Block> block) {
//        models().cubeColumn(block.getId().getPath(), modLoc("block/" + block.getId().getPath() + "_side"), modLoc("block/" + block.getId().getPath() + "_end"));
//        blockItem(block);
//    }
    private void cubeColumnAndItem(RegistryObject<Block, Block> block) {
        ModelFile model = models().cubeColumn(block.getId().getPath(), getBlockPath(block, "_side"), getBlockPath(block, "_end"));
        getVariantBuilder(block.get()).forAllStates(blockState -> new ConfiguredModel[] { new ConfiguredModel(model) });
        blockItem(block);
    }
    private void cubeColumnAndItem(RegistryObject<Block, Block> block, RegistryObject<Block, Block> sideEndTexture) {
        ModelFile model = models().cubeColumn(block.getId().getPath(), getBlockPath(sideEndTexture, "_side"), getBlockPath(sideEndTexture, "_end"));
        getVariantBuilder(block.get()).forAllStates(blockState -> new ConfiguredModel[] { new ConfiguredModel(model) });
        blockItem(block);
    }


    private void blockAndItem(RegistryObject<Block, Block> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
    private void blockAndItem(RegistryObject<Block, Block> block, RegistryObject<Block, Block> blockTexture) {
        simpleBlockWithItem(block.get(), models().cubeAll(block.getId().getPath(), blockTexture(blockTexture.get())));
    }
    private void blockAndItem(RegistryObject<Block, Block> block, RegistryObject<Block, Block> blockTexture, String textureSuffix) {
        simpleBlockWithItem(block.get(), models().cubeAll(block.getId().getPath(), getBlockPath(blockTexture, textureSuffix)));
    }
    private void stairsBlockAndItem(RegistryObject<Block, Block> stairBlock, RegistryObject<Block, Block> allSidesTexture) {
        ResourceLocation texture = blockTexture(allSidesTexture.get());
        stairsBlock((StairBlock) stairBlock.get(), texture, texture, texture);
        blockItem(stairBlock);
    }
    private void stairsBlockAndItem(RegistryObject<Block, Block> stairBlock, RegistryObject<Block, Block> allSidesTexture, String suffix) {
        ResourceLocation texture = getBlockPath(allSidesTexture, suffix);
        stairsBlock((StairBlock) stairBlock.get(), texture, texture, texture);
        blockItem(stairBlock);
    }
    private void stairsBlockAndItem(RegistryObject<Block, Block> stairBlock, RegistryObject<Block, Block> sideTexture, RegistryObject<Block, Block> endTexture) {
        ResourceLocation side = getBlockPath(sideTexture, SIDE);
        ResourceLocation end = getBlockPath(endTexture, END);
        stairsBlock((StairBlock) stairBlock.get(), side, end, end);
        blockItem(stairBlock);
    }
    private void slabBlockAndItem(RegistryObject<Block, Block> slabBlock, RegistryObject<Block, Block> doubleSlabSideEndTexture) {
        ResourceLocation texture = blockTexture(doubleSlabSideEndTexture.get());
        slabBlock((SlabBlock) slabBlock.get(), texture, texture, texture, texture);
        blockItem(slabBlock);
    }
    private void slabBlockAndItem(RegistryObject<Block, Block> slabBlock, RegistryObject<Block, Block> doubleSlabSideEndTexture, String suffix) {
        ResourceLocation doubleSlab = blockTexture(doubleSlabSideEndTexture.get());
        ResourceLocation texture = getBlockPath(doubleSlabSideEndTexture, suffix);
        slabBlock((SlabBlock) slabBlock.get(), doubleSlab, texture, texture, texture);
        blockItem(slabBlock);
    }
    private void slabBlockAndItem(RegistryObject<Block, Block> slabBlock, RegistryObject<Block, Block> doubleSlabTexture, RegistryObject<Block, Block> sideEndTexture) {
        ResourceLocation doubleSlab = blockTexture(doubleSlabTexture.get());
        ResourceLocation texture = blockTexture(sideEndTexture.get());
        slabBlock((SlabBlock) slabBlock.get(), doubleSlab, texture, texture, texture);
        blockItem(slabBlock);
    }
    private void slabBlockAndItem(RegistryObject<Block, Block> slabBlock, RegistryObject<Block, Block> doubleSlabTexture, RegistryObject<Block, Block> sideTexture, RegistryObject<Block, Block> endTexture) {
        ResourceLocation doubleSlab = blockTexture(doubleSlabTexture.get());
        ResourceLocation side = getBlockPath(sideTexture, SIDE);
        ResourceLocation end = getBlockPath(endTexture, END);
        slabBlock((SlabBlock) slabBlock.get(), doubleSlab, side, end, end);
        blockItem(slabBlock);
    }
    private void wallBlockAndItem(RegistryObject<Block, Block> wallBlock, RegistryObject<Block, Block> blockTexture) {
        wallBlock((WallBlock) wallBlock.get(), getBlockPath(blockTexture));
//        wallInventory(wallBlock, blockTexture);
        wallItem(wallBlock);
    }
    private void wallBlockAndItem(RegistryObject<Block, Block> wallBlock, RegistryObject<Block, Block> blockTexture, String texture) {
        wallBlock((WallBlock) wallBlock.get(), getBlockPath(blockTexture, texture));
//        wallInventory(wallBlock, blockTexture, texture);
        wallItem(wallBlock);
    }
    private void fenceBlockAndItem(RegistryObject<Block, Block> fenceBlock, RegistryObject<Block, Block> blockTexture) {
        String fencePath = fenceBlock.getId().getPath();
        fenceBlock((FenceBlock) fenceBlock.get(), getBlockPath(blockTexture));
        itemModels().withExistingParent(fencePath, mcLoc(BLOCK_FOLDER + "fence_inventory"))
                .texture("texture", getBlockPath(blockTexture));
    }
    private void fenceGateBlockAndItem(RegistryObject<Block, Block> fenceGateBlock, RegistryObject<Block, Block> blockTexture) {
        fenceGateBlock((FenceGateBlock) fenceGateBlock.get(), getBlockPath(blockTexture));
        blockItem(fenceGateBlock);
    }
    private void doorBlockAndItem(RegistryObject<Block, Block> doorBlock) {
        String doorPath = doorBlock.getId().getPath();
        doorBlock((DoorBlock) doorBlock.get(), modLoc(BLOCK_FOLDER + doorPath + BOTTOM), modLoc(BLOCK_FOLDER + doorPath + TOP));
        flatItem(doorBlock);
    }
    private void trapdoorBlockAndItem(RegistryObject<Block, Block> trapdoorBlock, RegistryObject<Block, Block> blockTexture) {
        trapdoorBlock((TrapDoorBlock) trapdoorBlock.get(), getBlockPath(blockTexture), true);
        blockItem(trapdoorBlock, BOTTOM);
    }
    private void pressurePlateAndItem(RegistryObject<Block, Block> pressurePlateBlock, RegistryObject<Block, Block> blockTexture) {
        pressurePlateBlock((PressurePlateBlock) pressurePlateBlock.get(), getBlockPath(blockTexture));
        blockItem(pressurePlateBlock);
    }
    private void buttonBlockAndItem(RegistryObject<Block, Block> buttonBlock, RegistryObject<Block, Block> blockTexture) {
        buttonBlock((ButtonBlock) buttonBlock.get(), getBlockPath(blockTexture));
        itemModels().withExistingParent(buttonBlock.getId().getPath(), mcLoc(BLOCK_FOLDER + "button_inventory"))
                .texture("texture", modLoc(BLOCK_FOLDER + blockTexture.getId().getPath()));
    }

    private void fenceItem(RegistryObject<Block, Block> block, RegistryObject<Block, Block> blockTexture) {
        itemModels().withExistingParent(block.getId().getPath(), mcLoc(BLOCK_FOLDER + "fence_inventory"))
                .texture("texture", modLoc(BLOCK_FOLDER + blockTexture.getId().getPath()));
    }
    private void buttonItem(RegistryObject<Block, Block> block, RegistryObject<Block, Block> blockTexture) {
        itemModels().withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture", modLoc(BLOCK_FOLDER + blockTexture.getId().getPath()));
    }
    private void wallItem(RegistryObject<Block, Block> block) {
        String blockPath = block.getId().getPath();
//        itemModels().withExistingParent(blockPath, modLoc(BLOCK_FOLDER + blockPath + "_inventory"));
        itemModels().withExistingParent(blockPath, mcLoc(BLOCK_FOLDER + "wall_inventory"));
    }
    private void wallInventory(RegistryObject<Block, Block> block, RegistryObject<Block, Block> blockTexture) {
        models().wallInventory(block.getId().getPath() + "_inventory", getBlockPath(blockTexture));
    }
    private void wallInventory(RegistryObject<Block, Block> block, RegistryObject<Block, Block> blockTexture, String texture) {
        models().wallInventory(block.getId().getPath() + "_inventory", getBlockPath(blockTexture, texture));
    }

    private void blockItem(RegistryObject<Block, Block> block) {
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath())));
    }
    private void blockItem(RegistryObject<Block, Block> block, String appendix) {
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath() + appendix)));
    }
    private void blockItem(String prefix, RegistryObject<Block, Block> block) {
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(modLoc(BLOCK_FOLDER + prefix + block.getId().getPath())));
    }

    private void flatItem(RegistryObject<Block, Block> block) {
        itemModels().withExistingParent(block.getId().getPath(), GENERATED).texture("layer0", ITEM_FOLDER + block.getId().getPath());
    }

    private void flatBlockItem(RegistryObject<Block, Block> block) {
        itemModels().withExistingParent(block.getId().getPath(), GENERATED).texture("layer0", BLOCK_FOLDER + block.getId().getPath());
    }
    private void flatBlockItem(RegistryObject<Block, Block> block, String appendix) {
        itemModels().withExistingParent(block.getId().getPath(), GENERATED).texture("layer0", BLOCK_FOLDER + block.getId().getPath() + appendix);
    }


    private ResourceLocation getBlockPath(RegistryObject<Block, Block> block) {
        return ModelLocationUtils.getModelLocation(block.get());
    }
    private ResourceLocation getBlockPath(RegistryObject<Block, Block> block, String suffix) {
        return ModelLocationUtils.getModelLocation(block.get(), suffix);
    }

}
