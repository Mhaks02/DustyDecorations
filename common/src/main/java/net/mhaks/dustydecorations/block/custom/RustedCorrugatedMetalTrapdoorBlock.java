package net.mhaks.dustydecorations.block.custom;

import net.mhaks.dustydecorations.sound.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class RustedCorrugatedMetalTrapdoorBlock extends TrapDoorBlock {
    private final BlockSetType blockSetType;

    public RustedCorrugatedMetalTrapdoorBlock(BlockSetType type, Properties properties) {
        super(type, properties);
        blockSetType = type;
        registerDefaultState(defaultBlockState()
                .setValue(WATERLOGGED, false));
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (!this.blockSetType.canOpenByHand()) {
            return InteractionResult.PASS;
        } else {
            this.toggle(state, level, pos, player);
            return InteractionResult.sidedSuccess(level.isClientSide);
        }
    }

    private void toggle(BlockState state, Level level, BlockPos pos, @Nullable Player player) {
        BlockState blockstate = state.cycle(OPEN);
        level.setBlock(pos, blockstate, Block.UPDATE_CLIENTS);
        if (blockstate.getValue(WATERLOGGED)) {
            level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        this.playOpenCloseSound(player, level, pos, blockstate.getValue(OPEN));
    }

    private void playOpenCloseSound(Player player, Level level, BlockPos blockPos, boolean isOpened) {
        level.playSound(player, blockPos,
                isOpened ? ModSounds.CORRUGATED_METAL_OPEN.get() : ModSounds.CORRUGATED_METAL_CLOSE.get(),
                SoundSource.BLOCKS, 1.0f, level.getRandom().nextFloat() * 0.1f + 1.0f
        );
        level.gameEvent(player, isOpened ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, blockPos);
    }

    @Override
    protected void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (!level.isClientSide) {
            boolean flag = level.hasNeighborSignal(pos);
            if (flag != state.getValue(POWERED)) {
                if (state.getValue(OPEN) != flag) {
                    state = state.setValue(OPEN, Boolean.valueOf(flag));
                    this.playOpenCloseSound(null, level, pos, flag);
                }

                level.setBlock(pos, state.setValue(POWERED, Boolean.valueOf(flag)), 2);
                if (state.getValue(WATERLOGGED)) {
                    level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
                }
            }
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, OPEN, HALF, POWERED, WATERLOGGED);
    }
}
