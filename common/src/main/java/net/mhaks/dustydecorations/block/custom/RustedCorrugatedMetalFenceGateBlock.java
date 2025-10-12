package net.mhaks.dustydecorations.block.custom;

import net.mhaks.dustydecorations.sound.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class RustedCorrugatedMetalFenceGateBlock extends FenceGateBlock implements SimpleWaterloggedBlock {
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public RustedCorrugatedMetalFenceGateBlock(WoodType type, Properties properties) {
        super(type, properties);
        registerDefaultState(defaultBlockState()
                .setValue(WATERLOGGED, false));
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (state.getValue(OPEN)) {
            state = state.setValue(OPEN, Boolean.valueOf(false));
            level.setBlock(pos, state, Block.UPDATE_CLIENTS | Block.UPDATE_IMMEDIATE);
        } else {
            Direction direction = player.getDirection();
            if (state.getValue(FACING) == direction.getOpposite()) {
                state = state.setValue(FACING, direction);
            }

            state = state.setValue(OPEN, Boolean.valueOf(true));
            level.setBlock(pos, state, Block.UPDATE_CLIENTS | Block.UPDATE_IMMEDIATE);
        }

        boolean flag = state.getValue(OPEN);
        playOpenCloseSound(player, level, pos, flag);
        level.gameEvent(player, flag ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
        return InteractionResult.sidedSuccess(level.isClientSide);
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState()
                .setValue(FACING, context.getHorizontalDirection().getOpposite())
                .setValue(WATERLOGGED, context.getLevel().getFluidState(context.getClickedPos()).is(Fluids.WATER));
    }

    @Override
    protected BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        return super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }

    @Override
    protected void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        if (!level.isClientSide) {
            boolean flag = level.hasNeighborSignal(pos);
            if (state.getValue(POWERED) != flag) {
                level.setBlock(pos, state.setValue(POWERED, Boolean.valueOf(flag)).setValue(OPEN, Boolean.valueOf(flag)), 2);
                if (state.getValue(OPEN) != flag) {
                    playOpenCloseSound(null, level, pos, flag);
                    level.gameEvent(null, flag ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
                }
            }
        }
    }

    private void playOpenCloseSound(Player player, Level level, BlockPos pos, boolean flag) {
        level.playSound(player, pos, flag ? ModSounds.CORRUGATED_METAL_OPEN.get() : ModSounds.CORRUGATED_METAL_CLOSE.get(),
                SoundSource.BLOCKS, 1.0f, level.getRandom().nextFloat() * 0.1f + 1.4f);
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        return state.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, OPEN, POWERED, IN_WALL, WATERLOGGED);
    }
}
