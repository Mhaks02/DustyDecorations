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
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ModConstants.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
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

        TransparentBlockWithItem(ModBlocks.CREAM_SEAGLASS);
        TransparentBlockWithItem(ModBlocks.HAZEL_SEAGLASS);
        TransparentBlockWithItem(ModBlocks.LIQUORICE_SEAGLASS);
        TransparentBlockWithItem(ModBlocks.MOCHA_SEAGLASS);
        TransparentBlockWithItem(ModBlocks.SCARLET_SEAGLASS);
        TransparentBlockWithItem(ModBlocks.HONEY_SEAGLASS);
        TransparentBlockWithItem(ModBlocks.MINT_SEAGLASS);
        TransparentBlockWithItem(ModBlocks.TEAL_SEAGLASS);
        TransparentBlockWithItem(ModBlocks.CERULEAN_SEAGLASS);
        TransparentBlockWithItem(ModBlocks.TAUPE_SEAGLASS);

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

        TransparentBlockWithItem(ModBlocks.CREAM_SEA_WINDOW);
        TransparentBlockWithItem(ModBlocks.HAZEL_SEA_WINDOW);
        TransparentBlockWithItem(ModBlocks.LIQUORICE_SEA_WINDOW);
        TransparentBlockWithItem(ModBlocks.MOCHA_SEA_WINDOW);
        TransparentBlockWithItem(ModBlocks.SCARLET_SEA_WINDOW);
        TransparentBlockWithItem(ModBlocks.HONEY_SEA_WINDOW);
        TransparentBlockWithItem(ModBlocks.MINT_SEA_WINDOW);
        TransparentBlockWithItem(ModBlocks.TEAL_SEA_WINDOW);
        TransparentBlockWithItem(ModBlocks.CERULEAN_SEA_WINDOW);
        TransparentBlockWithItem(ModBlocks.TAUPE_SEA_WINDOW);

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


    }



    private void blockWithItem(RegistryObject<Block, Block> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
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
    private void TransparentBlockWithItem(RegistryObject<Block, Block> block) {
        simpleBlockWithItem(block.get(), models().cubeAll(block.getId().getPath(), blockTexture(block.get())).renderType("translucent"));
    }

    private void banisterBlockWithFlatItem(RegistryObject<Block, Block> block) {
        paneBlockWithRenderType((IronBarsBlock) block.get(), getPath(block), getPath(block, "_top"), "cutout");
        flatBlockItem(block);
    }
    private void SeaGlassPaneBlockWithFlatItem(RegistryObject<Block, Block> block, RegistryObject<Block, Block> textureBlock) {
        paneBlockWithRenderType((IronBarsBlock) block.get(), getPath(textureBlock), getPath(textureBlock), "translucent");
        itemModels().withExistingParent(block.getId().getPath(), mcLoc("item/generated")).texture("layer0", "block/" + textureBlock.getId().getPath());
    }
    private void SeaWindowPaneBlockWithFlatItem(RegistryObject<Block, Block> block, RegistryObject<Block, Block> textureBlock) {
        paneBlockWithRenderType((IronBarsBlock) block.get(), getPath(textureBlock), modLoc("block/" + "sea_window" + "_top"), "translucent");
        itemModels().withExistingParent(block.getId().getPath(), mcLoc("item/generated")).texture("layer0", "block/" + textureBlock.getId().getPath());
    }
    private void wallpaperWithItem(RegistryObject<Block, Block> block) {
        getVariantBuilder(block.get()).forAllStates(blockState -> {
            switch (blockState.getValue(WallpaperBlock.MODEL_WEIGHT)) {
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
    private void paperLanternWithFlatItem(RegistryObject<Block, Block> block) {
        horizontalBlock(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath())));
        flatItem(block);
    }
    private void scatteredPapersWithFlatItem() {
        getVariantBuilder(ModBlocks.SCATTERED_PAPERS.get()).forAllStates(blockState -> {
            switch (blockState.getValue(ScatteredPapersBlock.MODEL_WEIGHT)) {
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
            switch (blockState.getValue(GlassBuoyBlock.MODEL_WEIGHT)) {
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
            switch (blockState.getValue(SmallGlassBuoysBlock.MODEL_WEIGHT)) {
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
            switch (blockState.getValue(WoodenBuoysBlock.MODEL_WEIGHT)) {
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
           switch (blockState.getValue(JarsBlock.MODEL_WEIGHT)) {
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
            switch (blockState.getValue(ClutteredSmallShelfBlock.MODEL_WEIGHT)) {
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
            switch (blockState.getValue(SmallBookshelfBlock.MODEL_WEIGHT)) {
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
            switch (blockState.getValue(BooksBlock.MODEL_WEIGHT)) {
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
            switch (blockState.getValue(BookStackBlock.MODEL_WEIGHT)) {
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
            switch (blockState.getValue(FishingLuresBlock.MODEL_WEIGHT)) {
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
            switch (blockState.getValue(ScatteredGoldCoinsBlock.MODEL_WEIGHT)) {
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


    private void fenceItem(RegistryObject<Block, Block> block, RegistryObject<Block, Block> baseBlock) {
        itemModels().withExistingParent(block.getId().getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", modLoc("block/" + baseBlock.getId().getPath()));
    }
    private void buttonItem(RegistryObject<Block, Block> block, RegistryObject<Block, Block> baseBlock) {
        itemModels().withExistingParent(block.getId().getPath(), mcLoc("block/button_inventory"))
                .texture("texture", modLoc("block/" + baseBlock.getId().getPath()));
    }

    private void blockItem(RegistryObject<Block, Block> block) {
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath())));
    }
    private void blockItem(RegistryObject<Block, Block> block, String appendix) {
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile(modLoc("block/" + block.getId().getPath() + appendix)));
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
