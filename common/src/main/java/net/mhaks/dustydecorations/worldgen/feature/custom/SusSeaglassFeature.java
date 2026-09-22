package net.mhaks.dustydecorations.worldgen.feature.custom;

import com.mojang.serialization.Codec;
import net.mhaks.dustydecorations.loot.ModLootTables;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.material.Fluids;

public class SusSeaglassFeature extends Feature<SusSeaglassConfiguration> {

    public SusSeaglassFeature(Codec<SusSeaglassConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<SusSeaglassConfiguration> context) {
        int i = 0;
        SusSeaglassConfiguration seaglassConfiguration = context.config();
        RandomSource randomSource = context.random();
        WorldGenLevel worldGenLevel = context.level();
        BlockPos blockPos = context.origin();

        for (int k = 0; k < 8; k++) {
            int x = randomSource.nextInt(4) - randomSource.nextInt(4);
            int z = randomSource.nextInt(4) - randomSource.nextInt(4);
            int y = worldGenLevel.getHeight(Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, blockPos.getX() + x, blockPos.getZ() + z);
            int seaY = worldGenLevel.getSeaLevel();

            BlockPos blockPos1 = new BlockPos(blockPos.getX() + x, y - 1, blockPos.getZ() + z);
            BlockState blockState1 = worldGenLevel.getBlockState(blockPos1);

            BlockPos blockPos2 = new BlockPos(blockPos.getX() + x, seaY - 2, blockPos.getZ() + z);
            BlockState blockState2 = worldGenLevel.getBlockState(blockPos2);

            for (SusSeaglassConfiguration.TargetBlockState targetBlockState : seaglassConfiguration.targetStates) {
                if (canPlace(blockState1, randomSource, targetBlockState)) {
                    if (isAdjacentToWater(worldGenLevel, blockPos1)) {
//                        worldGenLevel.setBlock(new BlockPos(blockPos1.getX(), blockPos1.getY() + 5, blockPos1.getZ()), Blocks.ACACIA_LOG.defaultBlockState(), 3); //for easier testing
                        placeSusSeaglass(worldGenLevel, blockPos1, targetBlockState.state);
                    }
                }
                if (canPlace(blockState2, randomSource, targetBlockState)) {
                    if (isBelowWater(worldGenLevel, blockPos2) /*might be an unnecessary check but idk it works donc osef*/) {
//                        worldGenLevel.setBlock(new BlockPos(blockPos2.getX(), blockPos2.getY() + 5, blockPos2.getZ()), Blocks.ACACIA_LOG.defaultBlockState(), 3); //for easier testing
                        placeSusSeaglass(worldGenLevel, blockPos2, targetBlockState.state);
                    }
                }
            }
        }
        return i > 0;
    }

    private static boolean canPlace(BlockState state, RandomSource randomSource, SusSeaglassConfiguration.TargetBlockState targetBlockState) {
        return targetBlockState.target.test(state, randomSource);
    }

    private static boolean isAdjacentToWater(WorldGenLevel level, BlockPos blockPos) {
        BlockPos.MutableBlockPos mutableBlockPos = new BlockPos.MutableBlockPos();
        for (Direction direction : Direction.values()) {
            mutableBlockPos.setWithOffset(blockPos, direction);
            if (level.getBlockState(mutableBlockPos).getFluidState().is(Fluids.WATER)) {
                return true;
            }
        }
        return false;
    }
    private static boolean isBelowWater(WorldGenLevel level, BlockPos blockPos) {
        BlockPos.MutableBlockPos mutableBlockPos = new BlockPos.MutableBlockPos(blockPos.getX(), blockPos.getY() + 1, blockPos.getZ());
        return level.getBlockState(mutableBlockPos).getFluidState().is(Fluids.WATER);
    }

    private static void placeSusSeaglass(WorldGenLevel level, BlockPos blockPos, BlockState blockState) {
        level.setBlock(blockPos, blockState, 3);
        level.getBlockEntity(blockPos, BlockEntityType.BRUSHABLE_BLOCK)
                .ifPresent(brushableBlockEntity -> brushableBlockEntity.setLootTable(ModLootTables.SUS_SEAGLASS, blockPos.asLong()));
    }
}
