package net.mhaks.dustydecorations.datagen;

import net.mhaks.dustydecorations.DustyDecorationsConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.registration.RegistryObject;
import net.minecraft.data.PackOutput;
import net.minecraft.data.models.model.ModelLocationUtils;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.IronBarsBlock;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DustyDecorationsConstants.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        banisterWithItem(ModBlocks.OAK_BANISTER);
        banisterWithItem(ModBlocks.SPRUCE_BANISTER);
        banisterWithItem(ModBlocks.BIRCH_BANISTER);
        banisterWithItem(ModBlocks.JUNGLE_BANISTER);
        banisterWithItem(ModBlocks.ACACIA_BANISTER);
        banisterWithItem(ModBlocks.DARK_OAK_BANISTER);
        banisterWithItem(ModBlocks.MANGROVE_BANISTER);
        banisterWithItem(ModBlocks.CHERRY_BANISTER);
        banisterWithItem(ModBlocks.BAMBOO_BANISTER);
        banisterWithItem(ModBlocks.DRY_BAMBOO_BANISTER);

        customBlockWithItem(ModBlocks.OAK_LARGE_SHELF);
        customBlockWithItem(ModBlocks.SPRUCE_LARGE_SHELF);
        customBlockWithItem(ModBlocks.BIRCH_LARGE_SHELF);
        customBlockWithItem(ModBlocks.JUNGLE_LARGE_SHELF);
        customBlockWithItem(ModBlocks.ACACIA_LARGE_SHELF);
        customBlockWithItem(ModBlocks.DARK_OAK_LARGE_SHELF);
        customBlockWithItem(ModBlocks.MANGROVE_LARGE_SHELF);
        customBlockWithItem(ModBlocks.CHERRY_LARGE_SHELF);
        customBlockWithItem(ModBlocks.BAMBOO_LARGE_SHELF);
        customBlockWithItem(ModBlocks.CRIMSON_LARGE_SHELF);
        customBlockWithItem(ModBlocks.WARPED_LARGE_SHELF);

    }



    private void blockWithItem(RegistryObject<Block, Block> block) {
        simpleBlockWithItem(block.get(), cubeAll(block.get()));
    }
    private void banisterWithItem(RegistryObject<Block, Block> block) {
        paneBlockWithRenderType((IronBarsBlock) block.get(), getPath(block), getPath(block, "_top"), "cutout");
        itemModels().withExistingParent(block.getId().getPath(), mcLoc("item/generated")).texture("layer0", "block/" + block.getId().getPath());
    }
//  Creates blockstates file and item model file for block with pre-made custom block model (e.g., Blockbench model)
    private void customBlockWithItem(RegistryObject<Block, Block> block) {
        horizontalBlock(block.get(), new ModelFile.UncheckedModelFile("dustydecorations:block/" + block.getId().getPath()), 180);
        blockItem(block);
    }

    private void blockItem(RegistryObject<Block, Block> block) {
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile("dustydecorations:block/" + block.getId().getPath()));
    }
    private void blockItem(RegistryObject<Block, Block> block, String appendix) {
        simpleBlockItem(block.get(), new ModelFile.UncheckedModelFile("dustydecorations:block/" + block.getId().getPath() + appendix));
    }


    private ResourceLocation getPath(RegistryObject<Block, Block> block) {
        return ModelLocationUtils.getModelLocation(block.get());
    }
    private ResourceLocation getPath(RegistryObject<Block, Block> block, String suffix) {
        return ModelLocationUtils.getModelLocation(block.get(), suffix);
    }

}
