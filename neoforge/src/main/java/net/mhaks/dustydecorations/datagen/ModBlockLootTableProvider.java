package net.mhaks.dustydecorations.datagen;

import net.mhaks.dustydecorations.ModConstants;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.block.custom.*;
import net.mhaks.dustydecorations.item.ModItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.AlternativesEntry;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemEntityPropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.List;
import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        ModConstants.LOGGER.info("Generating!!");
        dropSelf(ModBlocks.OAK_BANISTER.get());
        dropSelf(ModBlocks.SPRUCE_BANISTER.get());
        dropSelf(ModBlocks.BIRCH_BANISTER.get());
        dropSelf(ModBlocks.JUNGLE_BANISTER.get());
        dropSelf(ModBlocks.ACACIA_BANISTER.get());
        dropSelf(ModBlocks.DARK_OAK_BANISTER.get());
        dropSelf(ModBlocks.MANGROVE_BANISTER.get());
        dropSelf(ModBlocks.CHERRY_BANISTER.get());
        dropSelf(ModBlocks.BAMBOO_BANISTER.get());
        dropSelf(ModBlocks.DRY_BAMBOO_BANISTER.get());
        dropSelf(ModBlocks.CRIMSON_BANISTER.get());
        dropSelf(ModBlocks.WARPED_BANISTER.get());

        dropSelf(ModBlocks.OAK_LARGE_SHELF.get());
        dropSelf(ModBlocks.SPRUCE_LARGE_SHELF.get());
        dropSelf(ModBlocks.BIRCH_LARGE_SHELF.get());
        dropSelf(ModBlocks.JUNGLE_LARGE_SHELF.get());
        dropSelf(ModBlocks.ACACIA_LARGE_SHELF.get());
        dropSelf(ModBlocks.DARK_OAK_LARGE_SHELF.get());
        dropSelf(ModBlocks.MANGROVE_LARGE_SHELF.get());
        dropSelf(ModBlocks.CHERRY_LARGE_SHELF.get());
        dropSelf(ModBlocks.BAMBOO_LARGE_SHELF.get());
        dropSelf(ModBlocks.CRIMSON_LARGE_SHELF.get());
        dropSelf(ModBlocks.WARPED_LARGE_SHELF.get());

        dropSelf(ModBlocks.EMPTY_BARREL.get());
        dropSelf(ModBlocks.APPLE_BARREL.get());
        dropSelf(ModBlocks.SWEET_BERRIES_BARREL.get());
        dropSelf(ModBlocks.GLOW_BERRIES_BARREL.get());
        dropSelf(ModBlocks.CARROT_BARREL.get());
        dropSelf(ModBlocks.POTATO_BARREL.get());
        dropSelf(ModBlocks.BEETROOT_BARREL.get());
        dropSelf(ModBlocks.SEA_PICKLE_BARREL.get());
        dropSelf(ModBlocks.COD_BARREL.get());
        dropSelf(ModBlocks.SALMON_BARREL.get());

        dropSelf(ModBlocks.SUNFLOWER_WALLPAPER_BLOCK.get());
        dropSelf(ModBlocks.REGAL_WALLPAPER_BLOCK.get());
        dropSelf(ModBlocks.VINE_WALLPAPER_BLOCK.get());
        dropSelf(ModBlocks.MONSTER_WALLPAPER_BLOCK.get());
        dropSelf(ModBlocks.SAILOR_WALLPAPER_BLOCK.get());
        dropSelf(ModBlocks.COPPER_WALLPAPER_BLOCK.get());
        dropSelf(ModBlocks.STELLAR_WALLPAPER_BLOCK.get());
        dropSelf(ModBlocks.PUMPKIN_WALLPAPER_BLOCK.get());
        dropSelf(ModBlocks.SOUL_WALLPAPER_BLOCK.get());
        dropSelf(ModBlocks.FOREST_FESTIVE_WALLPAPER_BLOCK.get());
        dropSelf(ModBlocks.STRIPED_FESTIVE_WALLPAPER_BLOCK.get());
        dropSelf(ModBlocks.SNOWMEN_WALLPAPER_BLOCK.get());
        dropSelf(ModBlocks.SNOWFLAKE_WALLPAPER_BLOCK.get());

        dropSelf(ModBlocks.WHITE_WOOL_AWNING.get());
        dropSelf(ModBlocks.LIGHT_GRAY_WOOL_AWNING.get());
        dropSelf(ModBlocks.GRAY_WOOL_AWNING.get());
        dropSelf(ModBlocks.BLACK_WOOL_AWNING.get());
        dropSelf(ModBlocks.BROWN_WOOL_AWNING.get());
        dropSelf(ModBlocks.RED_WOOL_AWNING.get());
        dropSelf(ModBlocks.ORANGE_WOOL_AWNING.get());
        dropSelf(ModBlocks.YELLOW_WOOL_AWNING.get());
        dropSelf(ModBlocks.LIME_WOOL_AWNING.get());
        dropSelf(ModBlocks.GREEN_WOOL_AWNING.get());
        dropSelf(ModBlocks.CYAN_WOOL_AWNING.get());
        dropSelf(ModBlocks.LIGHT_BLUE_WOOL_AWNING.get());
        dropSelf(ModBlocks.BLUE_WOOL_AWNING.get());
        dropSelf(ModBlocks.PURPLE_WOOL_AWNING.get());
        dropSelf(ModBlocks.MAGENTA_WOOL_AWNING.get());
        dropSelf(ModBlocks.PINK_WOOL_AWNING.get());

        dropSelf(ModBlocks.PAPER_LANTERN.get());
        dropSelf(ModBlocks.SAKURA_PAPER_LANTERN.get());
        dropSelf(ModBlocks.TAIGA_PAPER_LANTERN.get());
        dropSelf(ModBlocks.ORCHID_PAPER_LANTERN.get());
        dropSelf(ModBlocks.PANDA_PAPER_LANTERN.get());
        dropSelf(ModBlocks.VILLAGER_PAPER_LANTERN.get());
        dropSelf(ModBlocks.CREEPER_PAPER_LANTERN.get());
        dropSelf(ModBlocks.CHICKEN_JOCKEY_PAPER_LANTERN.get());
        dropSelf(ModBlocks.PILLAGER_PAPER_LANTERN.get());
        dropSelf(ModBlocks.WARDEN_PAPER_LANTERN.get());

        dropSelf(ModBlocks.CORRUGATED_METAL_BLOCK.get());
        dropSelf(ModBlocks.CORRUGATED_METAL_GRATE.get());
        dropSelf(ModBlocks.CORRUGATED_METAL_STAIRS.get());
        add(ModBlocks.CORRUGATED_METAL_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.CORRUGATED_METAL_FENCE.get());
        dropSelf(ModBlocks.CORRUGATED_METAL_FENCE_GATE.get());
        add(ModBlocks.CORRUGATED_METAL_DOOR.get(), this::createDoorTable);
        dropSelf(ModBlocks.CORRUGATED_METAL_TRAPDOOR.get());
        dropSelf(ModBlocks.CORRUGATED_METAL_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.CORRUGATED_METAL_BUTTON.get());
        dropSelf(ModBlocks.CORRUGATED_METAL_ROOFING.get());

        dropSelf(ModBlocks.WAXED_CORRUGATED_METAL_BLOCK.get());
        dropSelf(ModBlocks.WAXED_CORRUGATED_METAL_GRATE.get());
        dropSelf(ModBlocks.WAXED_CORRUGATED_METAL_STAIRS.get());
        add(ModBlocks.WAXED_CORRUGATED_METAL_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.WAXED_CORRUGATED_METAL_FENCE.get());
        dropSelf(ModBlocks.WAXED_CORRUGATED_METAL_FENCE_GATE.get());
        add(ModBlocks.WAXED_CORRUGATED_METAL_DOOR.get(), this::createDoorTable);
        dropSelf(ModBlocks.WAXED_CORRUGATED_METAL_TRAPDOOR.get());
        dropSelf(ModBlocks.WAXED_CORRUGATED_METAL_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.WAXED_CORRUGATED_METAL_BUTTON.get());
        dropSelf(ModBlocks.WAXED_CORRUGATED_METAL_ROOFING.get());

        dropSelf(ModBlocks.RUSTED_CORRUGATED_METAL_BLOCK.get());
        dropSelf(ModBlocks.RUSTED_CORRUGATED_METAL_GRATE.get());
        dropSelf(ModBlocks.RUSTED_CORRUGATED_METAL_STAIRS.get());
        add(ModBlocks.RUSTED_CORRUGATED_METAL_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.RUSTED_CORRUGATED_METAL_FENCE.get());
        dropSelf(ModBlocks.RUSTED_CORRUGATED_METAL_FENCE_GATE.get());
        add(ModBlocks.RUSTED_CORRUGATED_METAL_DOOR.get(), this::createDoorTable);
        dropSelf(ModBlocks.RUSTED_CORRUGATED_METAL_TRAPDOOR.get());
        dropSelf(ModBlocks.RUSTED_CORRUGATED_METAL_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.RUSTED_CORRUGATED_METAL_BUTTON.get());
        dropSelf(ModBlocks.RUSTED_CORRUGATED_METAL_ROOFING.get());

        dropSelf(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_BLOCK.get());
        dropSelf(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_GRATE.get());
        dropSelf(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_STAIRS.get());
        add(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_FENCE.get());
        dropSelf(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_FENCE_GATE.get());
        add(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_DOOR.get(), this::createDoorTable);
        dropSelf(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_TRAPDOOR.get());
        dropSelf(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_PRESSURE_PLATE.get());
        dropSelf(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_BUTTON.get());
        dropSelf(ModBlocks.WAXED_RUSTED_CORRUGATED_METAL_ROOFING.get());

        dropWhenSilkTouch(ModBlocks.CREAM_SEAGLASS.get());
        dropWhenSilkTouch(ModBlocks.HAZEL_SEAGLASS.get());
        dropWhenSilkTouch(ModBlocks.LIQUORICE_SEAGLASS.get());
        dropWhenSilkTouch(ModBlocks.MOCHA_SEAGLASS.get());
        dropWhenSilkTouch(ModBlocks.SCARLET_SEAGLASS.get());
        dropWhenSilkTouch(ModBlocks.HONEY_SEAGLASS.get());
        dropWhenSilkTouch(ModBlocks.MINT_SEAGLASS.get());
        dropWhenSilkTouch(ModBlocks.TEAL_SEAGLASS.get());
        dropWhenSilkTouch(ModBlocks.CERULEAN_SEAGLASS.get());
        dropWhenSilkTouch(ModBlocks.TAUPE_SEAGLASS.get());

        dropWhenSilkTouch(ModBlocks.CREAM_SEAGLASS_PANE.get());
        dropWhenSilkTouch(ModBlocks.HAZEL_SEAGLASS_PANE.get());
        dropWhenSilkTouch(ModBlocks.LIQUORICE_SEAGLASS_PANE.get());
        dropWhenSilkTouch(ModBlocks.MOCHA_SEAGLASS_PANE.get());
        dropWhenSilkTouch(ModBlocks.SCARLET_SEAGLASS_PANE.get());
        dropWhenSilkTouch(ModBlocks.HONEY_SEAGLASS_PANE.get());
        dropWhenSilkTouch(ModBlocks.MINT_SEAGLASS_PANE.get());
        dropWhenSilkTouch(ModBlocks.TEAL_SEAGLASS_PANE.get());
        dropWhenSilkTouch(ModBlocks.CERULEAN_SEAGLASS_PANE.get());
        dropWhenSilkTouch(ModBlocks.TAUPE_SEAGLASS_PANE.get());

        dropWhenSilkTouch(ModBlocks.CREAM_SEA_WINDOW.get());
        dropWhenSilkTouch(ModBlocks.HAZEL_SEA_WINDOW.get());
        dropWhenSilkTouch(ModBlocks.LIQUORICE_SEA_WINDOW.get());
        dropWhenSilkTouch(ModBlocks.MOCHA_SEA_WINDOW.get());
        dropWhenSilkTouch(ModBlocks.SCARLET_SEA_WINDOW.get());
        dropWhenSilkTouch(ModBlocks.HONEY_SEA_WINDOW.get());
        dropWhenSilkTouch(ModBlocks.MINT_SEA_WINDOW.get());
        dropWhenSilkTouch(ModBlocks.TEAL_SEA_WINDOW.get());
        dropWhenSilkTouch(ModBlocks.CERULEAN_SEA_WINDOW.get());
        dropWhenSilkTouch(ModBlocks.TAUPE_SEA_WINDOW.get());

        dropWhenSilkTouch(ModBlocks.CREAM_SEA_WINDOW_PANE.get());
        dropWhenSilkTouch(ModBlocks.HAZEL_SEA_WINDOW_PANE.get());
        dropWhenSilkTouch(ModBlocks.LIQUORICE_SEA_WINDOW_PANE.get());
        dropWhenSilkTouch(ModBlocks.MOCHA_SEA_WINDOW_PANE.get());
        dropWhenSilkTouch(ModBlocks.SCARLET_SEA_WINDOW_PANE.get());
        dropWhenSilkTouch(ModBlocks.HONEY_SEA_WINDOW_PANE.get());
        dropWhenSilkTouch(ModBlocks.MINT_SEA_WINDOW_PANE.get());
        dropWhenSilkTouch(ModBlocks.TEAL_SEA_WINDOW_PANE.get());
        dropWhenSilkTouch(ModBlocks.CERULEAN_SEA_WINDOW_PANE.get());
        dropWhenSilkTouch(ModBlocks.TAUPE_SEA_WINDOW_PANE.get());

        dropSelf(ModBlocks.CREAM_SEAGLASS_LAMP.get());
        dropSelf(ModBlocks.HAZEL_SEAGLASS_LAMP.get());
        dropSelf(ModBlocks.LIQUORICE_SEAGLASS_LAMP.get());
        dropSelf(ModBlocks.MOCHA_SEAGLASS_LAMP.get());
        dropSelf(ModBlocks.SCARLET_SEAGLASS_LAMP.get());
        dropSelf(ModBlocks.HONEY_SEAGLASS_LAMP.get());
        dropSelf(ModBlocks.MINT_SEAGLASS_LAMP.get());
        dropSelf(ModBlocks.TEAL_SEAGLASS_LAMP.get());
        dropSelf(ModBlocks.CERULEAN_SEAGLASS_LAMP.get());
        dropSelf(ModBlocks.TAUPE_SEAGLASS_LAMP.get());

        createSusSeaglassDrop(ModBlocks.SEAGLASS_SAND.get());
        createSusSeaglassDrop(ModBlocks.SEAGLASS_GRAVEL.get());

        dropSelf(ModBlocks.RUSTED_ANCHOR.get());
        dropSelf(ModBlocks.LIFE_PRESERVER.get());
        dropSelf(ModBlocks.DISPLAYED_OARS.get());
        dropSelf(ModBlocks.TREASURE_MAP.get());
        dropSelf(ModBlocks.SCATTERED_PAPERS.get());
        dropSelf(ModBlocks.POSTERS.get());
        dropSelf(ModBlocks.PAPER_STACK.get());
        dropSelf(ModBlocks.GLASS_BUOY.get());
        dropSelf(ModBlocks.SMALL_GLASS_BUOYS.get());
        dropSelf(ModBlocks.WOODEN_BUOYS.get());
        dropSelf(ModBlocks.ROPE.get());
        dropSelf(ModBlocks.COILED_ROPE.get());
        dropSelf(ModBlocks.HANGING_COD.get());
        dropSelf(ModBlocks.HANGING_SALMON.get());
        dropSelf(ModBlocks.HANGING_KNIVES.get());
        dropSelf(ModBlocks.WEDGED_KNIFE.get());
        dropSelf(ModBlocks.WEDGED_CLEAVER.get());
        dropSelf(ModBlocks.CUTTING_BOARD.get());
        dropSelf(ModBlocks.KNIFE_AND_CUTTING_BOARD.get());
        dropSelf(ModBlocks.IRON_FRYING_PAN.get());
        dropSelf(ModBlocks.COPPER_FRYING_PAN.get());
        dropSelf(ModBlocks.BIG_COOKING_POT.get());

        add(ModBlocks.POTS_AND_PANS.get(), block -> LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(block))
                        .apply(List.of(2, 3, 4),
                                integer -> SetItemCountFunction.setCount(ConstantValue.exactly((float) integer))
                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                                        .hasProperty(PotsAndPansBlock.STACKED_POTS, integer)
                                                )
                                        )
                        )
                )
        );

        dropOther(ModBlocks.DECORATIVE_BOWL.get(), Items.BOWL);
        dropSelf(ModBlocks.JARS.get());

        add(ModBlocks.HONEY_JAR.get(), block -> LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(block))
                        .apply(List.of(2, 3),
                                integer -> SetItemCountFunction.setCount(ConstantValue.exactly((float) integer))
                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                                        .hasProperty(HoneyJarBlock.HONEY_JARS, integer)
                                                )
                                        )
                        )
                )
        );

        dropSelf(ModBlocks.INK_AND_QUILL.get());
        dropSelf(ModBlocks.CLUTTERED_SMALL_SHELF.get());
        dropSelf(ModBlocks.EMPTY_SMALL_SHELF.get());
        dropSelf(ModBlocks.SMALL_BOOKSHELF.get());
        dropSelf(ModBlocks.BOOKS.get());
        dropSelf(ModBlocks.BOOK_STACK.get());
        dropSelf(ModBlocks.GLOBE.get());
        dropSelf(ModBlocks.VINTAGE_GLOBE.get());

        dropSelf(ModBlocks.BOVINE_SKULL.get());
        dropSelf(ModBlocks.EQUINE_SKULL.get());
        dropSelf(ModBlocks.CANINE_SKULL.get());
        dropSelf(ModBlocks.FISH_BONES.get());
        dropSelf(ModBlocks.SMALL_SHARK_JAW.get());
        dropSelf(ModBlocks.BIG_SHARK_JAW.get());
        dropSelf(ModBlocks.MEGALODON_TOOTH.get());
        dropSelf(ModBlocks.FISHING_LURES.get());

        //TODO
        add(ModBlocks.STONE_MARINE_FOSSIL.get(), noDrop());
        add(ModBlocks.DEEPSLATE_MARINE_FOSSIL.get(), noDrop());

        dropSelf(ModBlocks.GOLD_COINS_BLOCK.get());
        add(ModBlocks.GOLD_COINS_LAYER.get(),
                block -> LootTable.lootTable()
                        .withPool(LootPool.lootPool()
                                .when(LootItemEntityPropertyCondition.entityPresent(LootContext.EntityTarget.THIS))
                                .add(AlternativesEntry.alternatives(
                                                GoldCoinsLayerBlock.LAYERS.getPossibleValues(),
                                                integer -> integer == 8
                                                        ? LootItem.lootTableItem(ModBlocks.GOLD_COINS_BLOCK.get())
                                                        : LootItem.lootTableItem(ModBlocks.GOLD_COINS_LAYER.get())
                                                          .apply(SetItemCountFunction.setCount(ConstantValue.exactly((float) integer)))
                                                          .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                                                               .hasProperty(GoldCoinsLayerBlock.LAYERS, integer)
                                                                )
                                                          )
                                        )
                                )
                        )
        );
        dropSelf(ModBlocks.SCATTERED_GOLD_COINS.get());

        dropSelf(ModBlocks.BIG_NAUTILUS_SHELL.get());
        dropSelf(ModBlocks.BIG_NAUTILUS_LANTERN.get());
        dropSelf(ModBlocks.SMALL_NAUTILUS_SHELL.get());
        dropSelf(ModBlocks.COLD_NAUTILUS_WIND_CHIME.get());

        dropSelf(ModBlocks.BURLAP_BLOCK.get());
        dropSelf(ModBlocks.BURLAP_STAIRS.get());
        add(ModBlocks.BURLAP_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.BURLAP_CARPET.get());
        dropSelf(ModBlocks.BURLAP_AWNING.get());
        add(ModBlocks.BURLAP_SACK.get(), block -> LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(block))
                        .apply(List.of(2, 3),
                                integer -> SetItemCountFunction.setCount(ConstantValue.exactly((float) integer))
                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BurlapSackBlock.STACKED_SACKS, integer)))
                        )
                )
        );

        dropSelf(ModBlocks.SAILOR_FLAG.get());
        dropSelf(ModBlocks.SAILOR_PENNANT_FLAG.get());

        add(ModBlocks.CERAMIC_POT.get(), block -> LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(block))
                        .apply(List.of(2, 3, 4),
                                integer -> SetItemCountFunction.setCount(ConstantValue.exactly((float) integer))
                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CeramicPotBlock.AMOUNT, integer)))
                        )
                )
        );
        add(ModBlocks.GLAZED_CERAMIC_POT.get(), block -> LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(block))
                        .apply(List.of(2, 3, 4),
                                integer -> SetItemCountFunction.setCount(ConstantValue.exactly((float) integer))
                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                                        .hasProperty(CeramicPotBlock.AMOUNT, integer)
                                                )
                                        )
                        )
                )
        );
        dropSelf(ModBlocks.VINTAGE_CASH_REGISTER.get());
        dropSelf(ModBlocks.HANGING_SAUSAGES.get());
        add(ModBlocks.WRAPPED_MEAT.get(), block -> LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(block))
                        .apply(List.of(2, 3),
                                integer -> SetItemCountFunction.setCount(ConstantValue.exactly((float) integer))
                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                                .setProperties(StatePropertiesPredicate.Builder.properties()
                                                        .hasProperty(WrappedMeatBlock.AMOUNT, integer)
                                                )
                                        )
                        )
                )
        );
        dropSelf(ModBlocks.COWHIDE_RUG.get());
        dropSelf(ModBlocks.MOOSHROOM_COWHIDE_RUG.get());
        dropSelf(ModBlocks.COPPER_LIGHT.get());
        dropSelf(ModBlocks.WAXED_COPPER_LIGHT.get());
        dropSelf(ModBlocks.SHODDY_COPPER_LIGHT.get());
        dropSelf(ModBlocks.WAXED_SHODDY_COPPER_LIGHT.get());

        add(ModBlocks.CAMERA_QUADROPOD.get(), block -> applyExplosionDecay(block, LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(LootItem.lootTableItem(ModBlocks.CAMERA_QUADROPOD.get())
                                .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))
                                .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CameraQuadropodBlock.HALF, DoubleBlockHalf.LOWER))))
                )
                .withPool(LootPool.lootPool()
                        .add(AlternativesEntry.alternatives(
                                LootItem.lootTableItem(ModBlocks.CAMERA.get())
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))
                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CameraQuadropodBlock.CAMERA, ModConstants.AttachedCamera.CAMERA))),
                                LootItem.lootTableItem(ModBlocks.MOVIE_CAMERA.get())
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(1.0F)))
                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CameraQuadropodBlock.CAMERA, ModConstants.AttachedCamera.MOVIE_CAMERA)))
                        ).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CameraQuadropodBlock.HALF, DoubleBlockHalf.LOWER)))))
                )
        );
        dropSelf(ModBlocks.CAMERA.get());
        dropSelf(ModBlocks.MOVIE_CAMERA.get());

        dropSelf(ModBlocks.WICKER_BLOCK.get());
        dropSelf(ModBlocks.WICKER_STAIRS.get());
        add(ModBlocks.WICKER_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.WICKER_BASKET.get());

        //TODO: wicker baskets
        dropSelf(ModBlocks.APPLE_WICKER_BASKET.get());
        dropSelf(ModBlocks.SWEET_BERRIES_WICKER_BASKET.get());
        dropSelf(ModBlocks.GLOW_BERRIES_WICKER_BASKET.get());
        dropSelf(ModBlocks.CARROT_WICKER_BASKET.get());
        dropSelf(ModBlocks.POTATO_WICKER_BASKET.get());
        dropSelf(ModBlocks.BEETROOT_WICKER_BASKET.get());
        dropSelf(ModBlocks.SEA_PICKLE_WICKER_BASKET.get());
        dropSelf(ModBlocks.COD_WICKER_BASKET.get());
        dropSelf(ModBlocks.SALMON_WICKER_BASKET.get());
        dropSelf(ModBlocks.PINK_PETALS_WICKER_BASKET.get());
        dropSelf(ModBlocks.LILAC_WICKER_BASKET.get());
        dropSelf(ModBlocks.ROSE_BUSH_WICKER_BASKET.get());
        dropSelf(ModBlocks.PEONY_WICKER_BASKET.get());

        dropSelf(ModBlocks.GOURD.get());
        dropSelf(ModBlocks.HANGING_GOURDS.get());
        dropSelf(ModBlocks.CARVED_BEETROOT.get());
        dropSelf(ModBlocks.BEET_O_LANTERN.get());
        add(ModBlocks.BEETROOT_SCARECROW.get(), block -> this.createSinglePropConditionTable(block, ScarecrowBlock.HALF, DoubleBlockHalf.LOWER));
        add(ModBlocks.PUMPKIN_SCARECROW.get(), block -> this.createSinglePropConditionTable(block, ScarecrowBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.MINI_SNOWMAN.get());
        dropSelf(ModBlocks.PLUSHIE.get());
        dropSelf(ModBlocks.NUTCRACKER.get());
        dropSelf(ModBlocks.FALL_GARLAND.get());
        dropSelf(ModBlocks.WINTER_GARLAND.get());
        dropSelf(ModBlocks.WINTER_WREATH.get());
        dropSelf(ModBlocks.FAIRY_LIGHTS.get());
        dropSelf(ModBlocks.HOLIDAY_ORNAMENTS.get());

        add(ModBlocks.GIANT_ANCHOR.get(), block -> this.createSinglePropConditionTable(block, GiantAnchorBlock.HALF, DoubleBlockHalf.LOWER));
        dropSelf(ModBlocks.GIANT_CHAIN.get());

        dropSelf(ModBlocks.SEASTONE_BLOCK.get());
        dropSelf(ModBlocks.SEASTONE_STAIRS.get());
        add(ModBlocks.SEASTONE_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.SEASTONE_WALL.get());

        dropSelf(ModBlocks.SEASTONE_BRICKS.get());
        dropSelf(ModBlocks.CHISELED_SEASTONE_BRICKS.get());
        dropSelf(ModBlocks.SEASTONE_BRICK_STAIRS.get());
        add(ModBlocks.SEASTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.SEASTONE_BRICK_WALL.get());

        dropSelf(ModBlocks.SMOOTH_SEASTONE_BLOCK.get());
        dropSelf(ModBlocks.SMOOTH_SEASTONE_STAIRS.get());
        add(ModBlocks.SMOOTH_SEASTONE_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.SMOOTH_SEASTONE_WALL.get());

        dropSelf(ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICKS.get());
        dropSelf(ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICK_STAIRS.get());
        add(ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICK_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.CORAL_EMBEDDED_SEASTONE_BRICK_WALL.get());

        dropSelf(ModBlocks.SNOWY_COBBLESTONE_BLOCK.get());
        dropSelf(ModBlocks.SNOWY_COBBLESTONE_STAIRS.get());
        add(ModBlocks.SNOWY_COBBLESTONE_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.SNOWY_COBBLESTONE_WALL.get());

        dropSelf(ModBlocks.SNOWY_STONE_BRICKS.get());
        dropSelf(ModBlocks.SNOWY_STONE_BRICK_STAIRS.get());
        add(ModBlocks.SNOWY_STONE_BRICK_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.SNOWY_STONE_BRICK_WALL.get());

        dropSelf(ModBlocks.SMOOTH_STONE_BRICKS.get());
        dropSelf(ModBlocks.SMOOTH_STONE_BRICK_STAIRS.get());
        add(ModBlocks.SMOOTH_STONE_BRICK_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.SMOOTH_STONE_BRICK_WALL.get());

        dropSelf(ModBlocks.PLAIN_CUSHION_BLOCK.get());
        dropSelf(ModBlocks.PLAIN_CUSHION_STAIRS.get());
        add(ModBlocks.PLAIN_CUSHION_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.WHITE_CUSHION_BLOCK.get());
        dropSelf(ModBlocks.WHITE_CUSHION_STAIRS.get());
        add(ModBlocks.WHITE_CUSHION_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.LIGHT_GRAY_CUSHION_BLOCK.get());
        dropSelf(ModBlocks.LIGHT_GRAY_CUSHION_STAIRS.get());
        add(ModBlocks.LIGHT_GRAY_CUSHION_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.GRAY_CUSHION_BLOCK.get());
        dropSelf(ModBlocks.GRAY_CUSHION_STAIRS.get());
        add(ModBlocks.GRAY_CUSHION_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.BLACK_CUSHION_BLOCK.get());
        dropSelf(ModBlocks.BLACK_CUSHION_STAIRS.get());
        add(ModBlocks.BLACK_CUSHION_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.BROWN_CUSHION_BLOCK.get());
        dropSelf(ModBlocks.BROWN_CUSHION_STAIRS.get());
        add(ModBlocks.BROWN_CUSHION_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.RED_CUSHION_BLOCK.get());
        dropSelf(ModBlocks.RED_CUSHION_STAIRS.get());
        add(ModBlocks.RED_CUSHION_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.ORANGE_CUSHION_BLOCK.get());
        dropSelf(ModBlocks.ORANGE_CUSHION_STAIRS.get());
        add(ModBlocks.ORANGE_CUSHION_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.YELLOW_CUSHION_BLOCK.get());
        dropSelf(ModBlocks.YELLOW_CUSHION_STAIRS.get());
        add(ModBlocks.YELLOW_CUSHION_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.LIME_CUSHION_BLOCK.get());
        dropSelf(ModBlocks.LIME_CUSHION_STAIRS.get());
        add(ModBlocks.LIME_CUSHION_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.GREEN_CUSHION_BLOCK.get());
        dropSelf(ModBlocks.GREEN_CUSHION_STAIRS.get());
        add(ModBlocks.GREEN_CUSHION_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.CYAN_CUSHION_BLOCK.get());
        dropSelf(ModBlocks.CYAN_CUSHION_STAIRS.get());
        add(ModBlocks.CYAN_CUSHION_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.LIGHT_BLUE_CUSHION_BLOCK.get());
        dropSelf(ModBlocks.LIGHT_BLUE_CUSHION_STAIRS.get());
        add(ModBlocks.LIGHT_BLUE_CUSHION_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.BLUE_CUSHION_BLOCK.get());
        dropSelf(ModBlocks.BLUE_CUSHION_STAIRS.get());
        add(ModBlocks.BLUE_CUSHION_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.PURPLE_CUSHION_BLOCK.get());
        dropSelf(ModBlocks.PURPLE_CUSHION_STAIRS.get());
        add(ModBlocks.PURPLE_CUSHION_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.MAGENTA_CUSHION_BLOCK.get());
        dropSelf(ModBlocks.MAGENTA_CUSHION_STAIRS.get());
        add(ModBlocks.MAGENTA_CUSHION_SLAB.get(), this::createSlabItemTable);
        dropSelf(ModBlocks.PINK_CUSHION_BLOCK.get());
        dropSelf(ModBlocks.PINK_CUSHION_STAIRS.get());
        add(ModBlocks.PINK_CUSHION_SLAB.get(), this::createSlabItemTable);

        dropSelf(ModBlocks.SEASTONE_QUOIN.get());
        dropSelf(ModBlocks.SMOOTH_STONE_QUOIN.get());
        dropSelf(ModBlocks.POLISHED_GRANITE_QUOIN.get());
        dropSelf(ModBlocks.POLISHED_DIORITE_QUOIN.get());
        dropSelf(ModBlocks.POLISHED_ANDESITE_QUOIN.get());
        dropSelf(ModBlocks.POLISHED_TUFF_QUOIN.get());
        dropSelf(ModBlocks.PACKED_MUD_QUOIN.get());
        dropSelf(ModBlocks.SANDSTONE_QUOIN.get());
        dropSelf(ModBlocks.RED_SANDSTONE_QUOIN.get());
        dropSelf(ModBlocks.POLISHED_BLACKSTONE_QUOIN.get());

        dropSelf(ModBlocks.SEASTONE_MURAL.get());
        dropSelf(ModBlocks.SMOOTH_STONE_MURAL.get());
        dropSelf(ModBlocks.GRANITE_MURAL.get());
        dropSelf(ModBlocks.DIORITE_MURAL.get());
        dropSelf(ModBlocks.ANDESITE_MURAL.get());


        add(ModBlocks.DUSTY_DECORATIONS_BARREL.get(), noDrop());

    }

    protected void createSusSeaglassDrop(Block susSeaglass) {
        add(susSeaglass,
                LootTable.lootTable().withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(7.0F))
                        .add(LootItem.lootTableItem(ModItems.CREAM_SEAGLASS_FRAGMENTS.get()))
                        .add(LootItem.lootTableItem(ModItems.HAZEL_SEAGLASS_FRAGMENTS.get()))
                        .add(LootItem.lootTableItem(ModItems.LIQUORICE_SEAGLASS_FRAGMENTS.get()))
                        .add(LootItem.lootTableItem(ModItems.MOCHA_SEAGLASS_FRAGMENTS.get()))
                        .add(LootItem.lootTableItem(ModItems.SCARLET_SEAGLASS_FRAGMENTS.get()))
                        .add(LootItem.lootTableItem(ModItems.HONEY_SEAGLASS_FRAGMENTS.get()))
                        .add(LootItem.lootTableItem(ModItems.TEAL_SEAGLASS_FRAGMENTS.get()))
                        .add(LootItem.lootTableItem(ModItems.MINT_SEAGLASS_FRAGMENTS.get()))
                        .add(LootItem.lootTableItem(ModItems.CERULEAN_SEAGLASS_FRAGMENTS.get()))
                        .add(LootItem.lootTableItem(ModItems.TAUPE_SEAGLASS_FRAGMENTS.get()))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(0.0F, 3.0F)))
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        ModConstants.LOGGER.info("Getting known blocks!");
        return ModBlocks.BLOCKS.getEntries().stream().map(blockRegistryObject -> (Block) blockRegistryObject.get()).toList();
    }

}
