package net.mhaks.dustydecorations.datagen;

import com.mojang.math.Quadrant;
import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.registration.RegistryObject;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.MultiVariant;
import net.minecraft.client.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.client.data.models.blockstates.PropertyDispatch;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.block.model.VariantMutator;
import net.minecraft.core.Direction;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import java.util.Optional;
import java.util.stream.Stream;

public class ModModelProvider extends ModelProvider {
    private static final String BLOCK_FOLDER = "block/";
    private static final String ITEM_FOLDER = "item/";

    private static final String TOP = "_top";

    private static final String CUTOUT = "minecraft:cutout";

    public static final VariantMutator NOP = p_405027_ -> p_405027_;
    public static final VariantMutator UV_LOCK = VariantMutator.UV_LOCK.withValue(true);
    public static final VariantMutator X_ROT_90 = VariantMutator.X_ROT.withValue(Quadrant.R90);
    public static final VariantMutator X_ROT_180 = VariantMutator.X_ROT.withValue(Quadrant.R180);
    public static final VariantMutator X_ROT_270 = VariantMutator.X_ROT.withValue(Quadrant.R270);
    public static final VariantMutator Y_ROT_90 = VariantMutator.Y_ROT.withValue(Quadrant.R90);
    public static final VariantMutator Y_ROT_180 = VariantMutator.Y_ROT.withValue(Quadrant.R180);
    public static final VariantMutator Y_ROT_270 = VariantMutator.Y_ROT.withValue(Quadrant.R270);
    public static final PropertyDispatch<VariantMutator> ROTATION_HORIZONTAL_FACING = PropertyDispatch.modify(BlockStateProperties.HORIZONTAL_FACING)
            .select(Direction.EAST, Y_ROT_90)
            .select(Direction.SOUTH, Y_ROT_180)
            .select(Direction.WEST, Y_ROT_270)
            .select(Direction.NORTH, NOP);

    private static final TextureSlot PLANKS = TextureSlot.create("planks");

    private static final String[] PLUSHIE_NAME = { "alex", "ari", "efe", "kai", "makena", "noor", "steve", "sunny", "zuri" };

    public ModModelProvider(PackOutput output) {
        super(output, ModConstants.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        /* BLOCKS */

        createCustomHorizontalBlock(blockModels, ModBlocks.DUSTY_DECORATIONS_BARREL);

        createBanister(blockModels, ModBlocks.OAK_BANISTER);
        createBanister(blockModels, ModBlocks.SPRUCE_BANISTER);
        createBanister(blockModels, ModBlocks.BIRCH_BANISTER);
        createBanister(blockModels, ModBlocks.JUNGLE_BANISTER);
        createBanister(blockModels, ModBlocks.ACACIA_BANISTER);
        createBanister(blockModels, ModBlocks.DARK_OAK_BANISTER);
        createBanister(blockModels, ModBlocks.MANGROVE_BANISTER);
        createBanister(blockModels, ModBlocks.CHERRY_BANISTER);
        createBanister(blockModels, ModBlocks.BAMBOO_BANISTER);
        createBanister(blockModels, ModBlocks.DRY_BAMBOO_BANISTER);
        createBanister(blockModels, ModBlocks.CRIMSON_BANISTER);
        createBanister(blockModels, ModBlocks.WARPED_BANISTER);

        createLargeShelf(blockModels, ModBlocks.OAK_LARGE_SHELF);
        createLargeShelf(blockModels, ModBlocks.SPRUCE_LARGE_SHELF);
        createLargeShelf(blockModels, ModBlocks.BIRCH_LARGE_SHELF);
        createLargeShelf(blockModels, ModBlocks.JUNGLE_LARGE_SHELF);
        createLargeShelf(blockModels, ModBlocks.ACACIA_LARGE_SHELF);
        createLargeShelf(blockModels, ModBlocks.DARK_OAK_LARGE_SHELF);
        createLargeShelf(blockModels, ModBlocks.MANGROVE_LARGE_SHELF);
        createLargeShelf(blockModels, ModBlocks.CHERRY_LARGE_SHELF);
        createLargeShelf(blockModels, ModBlocks.BAMBOO_LARGE_SHELF);
        createLargeShelf(blockModels, ModBlocks.CRIMSON_LARGE_SHELF);
        createLargeShelf(blockModels, ModBlocks.WARPED_LARGE_SHELF);

        createCustomHorizontalBlock(blockModels, ModBlocks.APPLE_BARREL);
        createCustomHorizontalBlock(blockModels, ModBlocks.SWEET_BERRIES_BARREL);
        createCustomHorizontalBlock(blockModels, ModBlocks.GLOW_BERRIES_BARREL);
        createCustomHorizontalBlock(blockModels, ModBlocks.CARROT_BARREL);
        createCustomHorizontalBlock(blockModels, ModBlocks.POTATO_BARREL);
        createCustomHorizontalBlock(blockModels, ModBlocks.BEETROOT_BARREL);
        createCustomHorizontalBlock(blockModels, ModBlocks.SEA_PICKLE_BARREL);
        createCustomHorizontalBlock(blockModels, ModBlocks.COD_BARREL);
        createCustomHorizontalBlock(blockModels, ModBlocks.SALMON_BARREL);
        createCustomHorizontalBlock(blockModels, ModBlocks.EMPTY_BARREL);

        createSimpleBlockThreeTextures(blockModels, ModBlocks.SUNFLOWER_WALLPAPER_BLOCK);
        createSimpleBlock(blockModels, ModBlocks.REGAL_WALLPAPER_BLOCK);
        createSimpleBlockThreeTextures(blockModels, ModBlocks.VINE_WALLPAPER_BLOCK);
        createSimpleBlock(blockModels, ModBlocks.MONSTER_WALLPAPER_BLOCK);
        createSimpleBlock(blockModels, ModBlocks.SAILOR_WALLPAPER_BLOCK);
        createSimpleBlock(blockModels, ModBlocks.COPPER_WALLPAPER_BLOCK);
        createSimpleBlockFourTextures(blockModels, ModBlocks.STELLAR_WALLPAPER_BLOCK);
        createSimpleBlock(blockModels, ModBlocks.PUMPKIN_WALLPAPER_BLOCK);
        createSimpleBlock(blockModels, ModBlocks.SOUL_WALLPAPER_BLOCK);
        createSimpleBlock(blockModels, ModBlocks.FOREST_FESTIVE_WALLPAPER_BLOCK);
        createSimpleBlock(blockModels, ModBlocks.STRIPED_FESTIVE_WALLPAPER_BLOCK);
        createSimpleBlock(blockModels, ModBlocks.SNOWMEN_WALLPAPER_BLOCK);
        createSimpleBlock(blockModels, ModBlocks.SNOWFLAKE_WALLPAPER_BLOCK);

        createWoolAwning(blockModels, ModBlocks.WHITE_WOOL_AWNING);
        createWoolAwning(blockModels, ModBlocks.LIGHT_GRAY_WOOL_AWNING);
        createWoolAwning(blockModels, ModBlocks.GRAY_WOOL_AWNING);
        createWoolAwning(blockModels, ModBlocks.BLACK_WOOL_AWNING);
        createWoolAwning(blockModels, ModBlocks.BROWN_WOOL_AWNING);
        createWoolAwning(blockModels, ModBlocks.RED_WOOL_AWNING);
        createWoolAwning(blockModels, ModBlocks.ORANGE_WOOL_AWNING);
        createWoolAwning(blockModels, ModBlocks.YELLOW_WOOL_AWNING);
        createWoolAwning(blockModels, ModBlocks.LIME_WOOL_AWNING);
        createWoolAwning(blockModels, ModBlocks.GREEN_WOOL_AWNING);
        createWoolAwning(blockModels, ModBlocks.CYAN_WOOL_AWNING);
        createWoolAwning(blockModels, ModBlocks.LIGHT_BLUE_WOOL_AWNING);
        createWoolAwning(blockModels, ModBlocks.BLUE_WOOL_AWNING);
        createWoolAwning(blockModels, ModBlocks.PURPLE_WOOL_AWNING);
        createWoolAwning(blockModels, ModBlocks.MAGENTA_WOOL_AWNING);
        createWoolAwning(blockModels, ModBlocks.PINK_WOOL_AWNING);

        createCustomHorizontalBlockFlatItem(blockModels, ModBlocks.PAPER_LANTERN);
        createCustomHorizontalBlockFlatItem(blockModels, ModBlocks.SAKURA_PAPER_LANTERN);
        createCustomHorizontalBlockFlatItem(blockModels, ModBlocks.TAIGA_PAPER_LANTERN);
        createCustomHorizontalBlockFlatItem(blockModels, ModBlocks.ORCHID_PAPER_LANTERN);
        createCustomHorizontalBlockFlatItem(blockModels, ModBlocks.PANDA_PAPER_LANTERN);
        createCustomHorizontalBlockFlatItem(blockModels, ModBlocks.VILLAGER_PAPER_LANTERN);
        createCustomHorizontalBlockFlatItem(blockModels, ModBlocks.CREEPER_PAPER_LANTERN);
        createCustomHorizontalBlockFlatItem(blockModels, ModBlocks.CHICKEN_JOCKEY_PAPER_LANTERN);
        createCustomHorizontalBlockFlatItem(blockModels, ModBlocks.PILLAGER_PAPER_LANTERN);
        createCustomHorizontalBlockFlatItem(blockModels, ModBlocks.WARDEN_PAPER_LANTERN);

         /* ITEMS */



//        basicItem(ModItems.CREAM_SEAGLASS_FRAGMENTS.get());
//        basicItem(ModItems.HAZEL_SEAGLASS_FRAGMENTS.get());
//        basicItem(ModItems.LIQUORICE_SEAGLASS_FRAGMENTS.get());
//        basicItem(ModItems.MOCHA_SEAGLASS_FRAGMENTS.get());
//        basicItem(ModItems.SCARLET_SEAGLASS_FRAGMENTS.get());
//        basicItem(ModItems.HONEY_SEAGLASS_FRAGMENTS.get());
//        basicItem(ModItems.TEAL_SEAGLASS_FRAGMENTS.get());
//        basicItem(ModItems.MINT_SEAGLASS_FRAGMENTS.get());
//        basicItem(ModItems.CERULEAN_SEAGLASS_FRAGMENTS.get());
//        basicItem(ModItems.TAUPE_SEAGLASS_FRAGMENTS.get());
//
//        basicItem(ModItems.CORRUGATED_METAL_SHEET.get());
//
//        basicItem(ModItems.BURLAP.get());
//        basicItem(ModItems.RAW_BRATWURST.get());
//        basicItem(ModItems.SMOKED_BRATWURST.get());
//        basicItem(ModItems.BRATWURST_HOT_DOG.get());
//
//        spawnEggItem(ModItems.NAUTILUS_GOLEM_SPAWN_EGG.get());


    }


    private void createBanister(BlockModelGenerators blockModels, RegistryObject<Block, Block> banister) {
        TextureMapping textureMapping = new TextureMapping().put(TextureSlot.BARS, getBlockTexture(banister)).put(TextureSlot.EDGE, getBlockTexture(banister, TOP));
        blockModels.createBars(banister.get(),
                ModelTemplates.BARS_POST_ENDS.extend().renderType(CUTOUT).build().create(banister.get(), textureMapping, blockModels.modelOutput),
                ModelTemplates.BARS_POST.extend().renderType(CUTOUT).build().create(banister.get(), textureMapping, blockModels.modelOutput),
                ModelTemplates.BARS_CAP.extend().renderType(CUTOUT).build().create(banister.get(), textureMapping, blockModels.modelOutput),
                ModelTemplates.BARS_CAP_ALT.extend().renderType(CUTOUT).build().create(banister.get(), textureMapping, blockModels.modelOutput),
                ModelTemplates.BARS_POST_SIDE.extend().renderType(CUTOUT).build().create(banister.get(), textureMapping, blockModels.modelOutput),
                ModelTemplates.BARS_POST_SIDE_ALT.extend().renderType(CUTOUT).build().create(banister.get(), textureMapping, blockModels.modelOutput)
        );
        blockModels.registerSimpleFlatItemModel(banister.get());
    }

    private void createLargeShelf(BlockModelGenerators blockModels, RegistryObject<Block, Block> largeShelf) {
        String shelfPath = largeShelf.getId().getPath();
        String plankType = shelfPath.substring(0, shelfPath.length() - 11) + "planks";
        ModelTemplate LARGE_SHELF = new ModelTemplate(Optional.of(ModConstants.identifierOf(BLOCK_FOLDER + "template_large_shelf")), Optional.empty(), PLANKS);
        LARGE_SHELF.create(largeShelf.get(), new TextureMapping()
                .put(PLANKS, mcLocation(BLOCK_FOLDER + plankType)),
                blockModels.modelOutput);
        createCustomHorizontalBlock(blockModels, largeShelf);
    }

    private void createWoolAwning(BlockModelGenerators blockModels, RegistryObject<Block, Block> woolAwning) {
        TextureSlot AWNING = TextureSlot.create("awning");
        String awningPath = woolAwning.getId().getPath();
        String wool = awningPath.substring(0, awningPath.length() - 7);
        ModelTemplate WOOL_AWNING = createModelTemplate("template_wool_awning", AWNING, TextureSlot.PARTICLE);
        WOOL_AWNING.create(woolAwning.get(), new TextureMapping()
                .put(AWNING, modLocation(BLOCK_FOLDER + awningPath))
                .put(TextureSlot.PARTICLE, mcLocation(BLOCK_FOLDER + wool)),
                blockModels.modelOutput);
        createCustomHorizontalBlock(blockModels, woolAwning);
    }



    // Copied from BlockModelGenerators class and adapted to use mod namespace
    public static ModelTemplate createModelTemplate(TextureSlot... requiredSlots) {
        return new ModelTemplate(Optional.empty(), Optional.empty(), requiredSlots);
    }
    public static ModelTemplate createModelTemplate(String name, TextureSlot... requiredSlots) {
        return new ModelTemplate(Optional.of(ModConstants.identifierOf(BLOCK_FOLDER + name)), Optional.empty(), requiredSlots);
    }
    public static ModelTemplate createItem(String name, TextureSlot... requiredSlots) {
        return new ModelTemplate(Optional.of(ModConstants.identifierOf(ITEM_FOLDER + name)), Optional.empty(), requiredSlots);
    }

    private Identifier getModelLoc(RegistryObject<Block, Block> block) {
        return ModelLocationUtils.getModelLocation(block.get());
    }
    private Identifier getModelLoc(RegistryObject<Block, Block> block, String suffix) {
        return ModelLocationUtils.getModelLocation(block.get(), suffix);
    }
    private Identifier getBlockTexture(RegistryObject<Block, Block> block) {
        return BuiltInRegistries.BLOCK.getKey(block.get()).withPrefix(BLOCK_FOLDER);
    }
    private Identifier getBlockTexture(RegistryObject<Block, Block> block, String suffix) {
        return BuiltInRegistries.BLOCK.getKey(block.get()).withPath(path -> "block/" + path + suffix);
    }

    private void createSimpleBlock(BlockModelGenerators blockModels, RegistryObject<Block, Block> block) {
        blockModels.createTrivialCube(block.get());
        blockModels.registerSimpleItemModel(block.get(), getModelLoc(block));
    }
    private void createCustomHorizontalBlock(BlockModelGenerators blockModels, RegistryObject<Block, Block> block) {
        blockModels.createNonTemplateHorizontalBlock(block.get());
        blockModels.registerSimpleItemModel(block.get(), getModelLoc(block));
    }

    private void createCustomHorizontalBlockFlatItem(BlockModelGenerators blockModels, RegistryObject<Block, Block> block) {
        blockModels.createNonTemplateHorizontalBlock(block.get());
        blockModels.registerSimpleFlatItemModel(block.get().asItem());
    }

    private void createSimpleBlockThreeTextures(BlockModelGenerators blockModels, RegistryObject<Block, Block> block) {
        TextureMapping textureMapping = TextureMapping.cube(getBlockTexture(block, "/0"));
        TextureMapping textureMapping1 = TextureMapping.cube(getBlockTexture(block, "/1"));
        TextureMapping textureMapping2 = TextureMapping.cube(getBlockTexture(block, "/2"));
        MultiVariant multiVariant = BlockModelGenerators.plainVariant(ModelTemplates.CUBE_ALL.createWithSuffix(block.get(), "_0", textureMapping, blockModels.modelOutput));
        MultiVariant multiVariant1 = BlockModelGenerators.plainVariant(ModelTemplates.CUBE_ALL.createWithSuffix(block.get(), "_1", textureMapping1, blockModels.modelOutput));
        MultiVariant multiVariant2 = BlockModelGenerators.plainVariant(ModelTemplates.CUBE_ALL.createWithSuffix(block.get(), "_2", textureMapping2, blockModels.modelOutput));
        blockModels.blockStateOutput.accept(MultiVariantGenerator.dispatch(block.get())
                .with(PropertyDispatch.initial(ModConstants.TEXTURE_3)
                        .select(0, multiVariant)
                        .select(1, multiVariant1)
                        .select(2, multiVariant2)
                ));
        blockModels.registerSimpleItemModel(block.get(), getModelLoc(block, "_0"));
    }
    private void createSimpleBlockFourTextures(BlockModelGenerators blockModels, RegistryObject<Block, Block> block) {
        TextureMapping textureMapping = TextureMapping.cube(getBlockTexture(block, "/0"));
        TextureMapping textureMapping1 = TextureMapping.cube(getBlockTexture(block, "/1"));
        TextureMapping textureMapping2 = TextureMapping.cube(getBlockTexture(block, "/2"));
        TextureMapping textureMapping3 = TextureMapping.cube(getBlockTexture(block, "/3"));
        MultiVariant multiVariant = BlockModelGenerators.plainVariant(ModelTemplates.CUBE_ALL.createWithSuffix(block.get(), "_0", textureMapping, blockModels.modelOutput));
        MultiVariant multiVariant1 = BlockModelGenerators.plainVariant(ModelTemplates.CUBE_ALL.createWithSuffix(block.get(), "_1", textureMapping1, blockModels.modelOutput));
        MultiVariant multiVariant2 = BlockModelGenerators.plainVariant(ModelTemplates.CUBE_ALL.createWithSuffix(block.get(), "_2", textureMapping2, blockModels.modelOutput));
        MultiVariant multiVariant3 = BlockModelGenerators.plainVariant(ModelTemplates.CUBE_ALL.createWithSuffix(block.get(), "_3", textureMapping2, blockModels.modelOutput));
        blockModels.blockStateOutput.accept(MultiVariantGenerator.dispatch(block.get())
                .with(PropertyDispatch.initial(ModConstants.TEXTURE_4)
                        .select(0, multiVariant)
                        .select(1, multiVariant1)
                        .select(2, multiVariant2)
                        .select(3, multiVariant3)
                ));
        blockModels.registerSimpleItemModel(block.get(), getModelLoc(block, "_0"));
    }

    @Override
    protected Stream<? extends Holder<Block>> getKnownBlocks() {
        return Stream.empty();
    }
    @Override
    protected Stream<? extends Holder<Item>> getKnownItems() {
        return Stream.empty();
    }
}
