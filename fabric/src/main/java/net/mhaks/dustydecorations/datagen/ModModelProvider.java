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


    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
//        itemModelGenerator.generateFlatItem(ModItems.TEST_ITEM_LOL.get(), ModelTemplates.FLAT_ITEM);
    }

}
