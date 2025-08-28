package net.mhaks.dustydecorations.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.Condition;
import net.minecraft.data.models.blockstates.MultiPartGenerator;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

import static net.minecraft.data.models.model.TextureMapping.getBlockTexture;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

//    public static final BlockFamily TEST_FAMILY =
//            new BlockFamily.Builder(ModBlocks.ACACIA_BANISTER.get())
//                    .slab(ModBlocks.BIRCH_BANISTER.get())
//                    .stairs(ModBlocks.CHERRY_BANISTER.get())
//                    .getFamily();

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
//        blockStateModelGenerator.createTrivialCube(ModBlocks.TEST_BLOCK.get());       // all six sides = same texture
//        blockStateModelGenerator.createTrivialBlock(ModBlocks.TEST_BLOCK.get(), TexturedModel.COLUMN_ALT);        // all four horizontal sides = "test_block.png" + top and bottom = "test_block_top"
//        blockStateModelGenerator.family(ModBlocks.TEST_BLOCK.get())       // parents + children share same texture + generates cubeAll model for parent
//                .stairs(ModBlocks.TEST_BLOCK_STAIRS.get())
//                .slab(ModBlocks.TEST_BLOCK_SLAB.get())
//                .button(ModBlocks.TEST_BLOCK_BUTTON.get())
//        ;
//        blockStateModelGenerator.family(ModBlocks.ACACIA_BANISTER.get()).generateFor(TEST_FAMILY);        // same as above but appending a BlockFamily created above instead

        CustomBlockModelGenerators.createPane(blockStateModelGenerator, ModBlocks.OAK_BANISTER.get());
        CustomBlockModelGenerators.createPane(blockStateModelGenerator, ModBlocks.SPRUCE_BANISTER.get());
        CustomBlockModelGenerators.createPane(blockStateModelGenerator, ModBlocks.BIRCH_BANISTER.get());
        CustomBlockModelGenerators.createPane(blockStateModelGenerator, ModBlocks.JUNGLE_BANISTER.get());
        CustomBlockModelGenerators.createPane(blockStateModelGenerator, ModBlocks.ACACIA_BANISTER.get());
        CustomBlockModelGenerators.createPane(blockStateModelGenerator, ModBlocks.DARK_OAK_BANISTER.get());
        CustomBlockModelGenerators.createPane(blockStateModelGenerator, ModBlocks.MANGROVE_BANISTER.get());
        CustomBlockModelGenerators.createPane(blockStateModelGenerator, ModBlocks.CHERRY_BANISTER.get());
        CustomBlockModelGenerators.createPane(blockStateModelGenerator, ModBlocks.BAMBOO_BANISTER.get());
        CustomBlockModelGenerators.createPane(blockStateModelGenerator, ModBlocks.DRY_BAMBOO_BANISTER.get());

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
//        itemModelGenerator.generateFlatItem(ModItems.TEST_ITEM_LOL.get(), ModelTemplates.FLAT_ITEM);
    }

    public static class CustomBlockModelGenerators {

        public static void createPane(BlockModelGenerators generator, Block paneBlock) {
            TextureMapping textureMapping = new TextureMapping()
                    .put(TextureSlot.PANE, getBlockTexture(paneBlock))
                    .put(TextureSlot.EDGE, getBlockTexture(paneBlock, "_top"));
            ResourceLocation pane_post = ModelTemplates.STAINED_GLASS_PANE_POST.create(paneBlock, textureMapping, generator.modelOutput);
            ResourceLocation pane_side = ModelTemplates.STAINED_GLASS_PANE_SIDE.create(paneBlock, textureMapping, generator.modelOutput);
            ResourceLocation pane_side_alt = ModelTemplates.STAINED_GLASS_PANE_SIDE_ALT.create(paneBlock, textureMapping, generator.modelOutput);
            ResourceLocation pane_noside = ModelTemplates.STAINED_GLASS_PANE_NOSIDE.create(paneBlock, textureMapping, generator.modelOutput);
            ResourceLocation pane_noside_alt = ModelTemplates.STAINED_GLASS_PANE_NOSIDE_ALT.create(paneBlock, textureMapping, generator.modelOutput);
            Item item = paneBlock.asItem();
            ModelTemplates.FLAT_ITEM.create(ModelLocationUtils.getModelLocation(item), TextureMapping.layer0(paneBlock), generator.modelOutput);
            generator.blockStateOutput.accept(MultiPartGenerator.multiPart(paneBlock)
                    .with(Variant.variant().with(VariantProperties.MODEL, pane_post))
                    .with(Condition.condition().term(BlockStateProperties.NORTH, true),
                            Variant.variant().with(VariantProperties.MODEL, pane_side))
                    .with(Condition.condition().term(BlockStateProperties.EAST, true),
                            Variant.variant().with(VariantProperties.MODEL, pane_side).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                    .with(Condition.condition().term(BlockStateProperties.SOUTH, true),
                            Variant.variant().with(VariantProperties.MODEL, pane_side_alt)).with(Condition.condition().term(BlockStateProperties.WEST, true),
                            Variant.variant().with(VariantProperties.MODEL, pane_side_alt).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                    .with(Condition.condition().term(BlockStateProperties.NORTH, false),
                            Variant.variant().with(VariantProperties.MODEL, pane_noside))
                    .with(Condition.condition().term(BlockStateProperties.EAST, false),
                            Variant.variant().with(VariantProperties.MODEL, pane_noside_alt))
                    .with(Condition.condition().term(BlockStateProperties.SOUTH, false),
                            Variant.variant().with(VariantProperties.MODEL, pane_noside_alt)
                                    .with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90)).with(Condition.condition().term(BlockStateProperties.WEST, false),
                            Variant.variant().with(VariantProperties.MODEL, pane_noside).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)));
        }
    }


}
