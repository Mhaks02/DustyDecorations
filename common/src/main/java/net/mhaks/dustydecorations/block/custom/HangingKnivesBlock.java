package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class HangingKnivesBlock extends HorizontalDirectionalBlock {
    public static final MapCodec<HangingKnivesBlock> CODEC = simpleCodec(HangingKnivesBlock::new);

    public HangingKnivesBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(defaultBlockState()
                .setValue(FACING, Direction.NORTH));
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }
    
    private static final VoxelShape SHAPE_N =
            Block.box(0, 2, 14, 16, 15, 16);
    
    private static final VoxelShape SHAPE_S =
            Block.box(0, 2, 0, 16, 15, 2);

    private static final VoxelShape SHAPE_E =
            Block.box(0, 2, 0, 2, 15, 16);

    private static final VoxelShape SHAPE_W =
            Block.box(14, 2, 0, 16, 15, 16);

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch (state.getValue(FACING)) {
            case SOUTH -> {
                return SHAPE_S;
            }
            case EAST -> {
                return SHAPE_E;
            }
            case WEST -> {
                return SHAPE_W;
            }
            default -> {
                return SHAPE_N;
            }
        }
    }

    //TODO: est-ce qu'on veut pas autre chose que isFaceSturdy?
    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        Direction direction = state.getValue(FACING);
        BlockPos blockPos = pos.offset(direction.getOpposite().getNormal());
        BlockState blockState = level.getBlockState(blockPos);
        return blockState.isFaceSturdy(level, blockPos, direction);
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction[] directions;
        BlockState blockState = this.defaultBlockState();
        Level level = context.getLevel();
        BlockPos blockPos = context.getClickedPos();
        for (Direction direction : directions = context.getNearestLookingDirections()) {
            Direction direction2;
            if (!direction.getAxis().isHorizontal() || !(blockState = blockState.setValue(FACING, direction2 = direction.getOpposite())).canSurvive(level, blockPos))
                continue;
            return blockState;
        }
        return null;
    }

    @Override
    protected BlockState updateShape(BlockState state, Direction direction, BlockState neighborState, LevelAccessor level, BlockPos pos, BlockPos neighborPos) {
        if (direction.getOpposite() == state.getValue(FACING) && !state.canSurvive(level, pos)) {
            return Blocks.AIR.defaultBlockState();
        }
        return state;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
