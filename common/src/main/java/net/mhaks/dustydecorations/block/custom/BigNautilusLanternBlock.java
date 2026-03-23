package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.mhaks.dustydecorations.entity.ModEntityTypes;
import net.mhaks.dustydecorations.entity.custom.NautilusGolemEntity;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.pattern.BlockInWorld;
import net.minecraft.world.level.block.state.pattern.BlockPattern;
import net.minecraft.world.level.block.state.pattern.BlockPatternBuilder;
import net.minecraft.world.level.block.state.predicate.BlockStatePredicate;
import org.jetbrains.annotations.Nullable;

public class BigNautilusLanternBlock extends HorizontalDirectionalBlock {
    public static final MapCodec<BigNautilusLanternBlock> CODEC = simpleCodec(BigNautilusLanternBlock::new);
    private BlockPattern nautilusGolemFull;
    private BlockPattern nautilusGolemBase;

    public BigNautilusLanternBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(defaultBlockState()
                .setValue(FACING, Direction.NORTH));
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState()
                .setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
        if (!oldState.is(state.getBlock())) {
            this.trySpawnGolem(level, pos);
        }
    }

    private void trySpawnGolem(Level level, BlockPos blockPos) {
        BlockPattern.BlockPatternMatch blockPattern$blockPatternMatch = this.getOrCreateNautilusGolemFull().find(level, blockPos);
        if (blockPattern$blockPatternMatch != null) {
            NautilusGolemEntity nautilusGolem = ModEntityTypes.NAUTILUS_GOLEM.get().create(level);
            if (nautilusGolem != null) {
                spawnGolemInWorld(level, blockPattern$blockPatternMatch, nautilusGolem, blockPattern$blockPatternMatch.getBlock(0, 1, 0).getPos());
            }
        }
    }

    private static void spawnGolemInWorld(Level level, BlockPattern.BlockPatternMatch patternMatch, Entity golem, BlockPos blockPos) {
        clearPatternBlocks(level, patternMatch);
        golem.moveTo((double) blockPos.getX() + 0.5, (double) blockPos.getY() + 0.05, (double) blockPos.getZ() + 0.5, 0.0f, 0.0f);
        level.addFreshEntity(golem);

        for (ServerPlayer serverPlayer : level.getEntitiesOfClass(ServerPlayer.class, golem.getBoundingBox().inflate(5.0))) {
            CriteriaTriggers.SUMMONED_ENTITY.trigger(serverPlayer, golem);
        }
        updatePatternBlocks(level, patternMatch);
    }

    public static void clearPatternBlocks(Level level, BlockPattern.BlockPatternMatch patternMatch) {
        for (int i = 0; i < patternMatch.getWidth(); i++) {
            for (int j = 0; j < patternMatch.getHeight(); j++) {
                BlockInWorld blockInWorld = patternMatch.getBlock(i, j, 0);
                level.setBlock(blockInWorld.getPos(), Blocks.AIR.defaultBlockState(), 2);
                level.levelEvent(2001, blockInWorld.getPos(), Block.getId(blockInWorld.getState()));
            }
        }
    }

    public static void updatePatternBlocks(Level level, BlockPattern.BlockPatternMatch patternMatch) {
        for (int i = 0; i < patternMatch.getWidth(); i++) {
            for (int j = 0; j < patternMatch.getHeight(); j++) {
                BlockInWorld blockInWorld = patternMatch.getBlock(i, j, 0);
                level.blockUpdated(blockInWorld.getPos(), Blocks.AIR);
            }
        }
    }

    private BlockPattern getOrCreateNautilusGolemFull() {
        if (this.nautilusGolemFull == null) {
            this.nautilusGolemFull = BlockPatternBuilder.start()
                    .aisle("^~", "#x")
                    .where('^', BlockInWorld.hasState(BlockStatePredicate.forBlock(ModBlocks.BIG_NAUTILUS_LANTERN.get())))
                    .where('x', BlockInWorld.hasState(BlockStatePredicate.forBlock(ModBlocks.DISPLAYED_OARS.get())))
                    .where('#', BlockInWorld.hasState(BlockStatePredicate.forBlock(Blocks.DARK_OAK_PLANKS)))
                    .where('~', blockInWorld -> blockInWorld.getState().isAir())
                    .build();
        }
        return this.nautilusGolemFull;
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
