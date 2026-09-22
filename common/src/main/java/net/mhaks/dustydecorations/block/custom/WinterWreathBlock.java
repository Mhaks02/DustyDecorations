package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.stream.Stream;

public class WinterWreathBlock extends HorizontalDirectionalBlock {
    public static final DirectionProperty FACING = BlockStateProperties.FACING;
    public static final MapCodec<WinterWreathBlock> CODEC = simpleCodec(WinterWreathBlock::new);

    public WinterWreathBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    protected static final VoxelShape NEG_SPACE_Z = Block.box(5, 5, 0, 11, 11, 16);
    protected static final VoxelShape NEG_SPACE_X = Block.box(0, 5, 5, 16, 11, 11);
    protected static final VoxelShape FLOOR_AABB = Shapes.join(Block.box(2, 0, 2, 14, 2, 14), Block.box(5, 0, 5, 11, 16, 11), BooleanOp.ONLY_FIRST);
    protected static final VoxelShape NORTH_AABB = Shapes.join(Block.box(2, 2, 14, 14, 14, 16), NEG_SPACE_Z, BooleanOp.ONLY_FIRST);
    protected static final VoxelShape SOUTH_AABB = Shapes.join(Block.box(2, 2, 0, 14, 14, 2), NEG_SPACE_Z, BooleanOp.ONLY_FIRST);
    protected static final VoxelShape EAST_AABB = Shapes.join(Block.box(0, 2, 2, 2, 14, 14), NEG_SPACE_X, BooleanOp.ONLY_FIRST);
    protected static final VoxelShape WEST_AABB = Shapes.join(Block.box(14, 2, 2, 16, 14, 14), NEG_SPACE_X, BooleanOp.ONLY_FIRST);

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch (state.getValue(FACING)) {
            case NORTH:
                return NORTH_AABB;
            case EAST:
                return EAST_AABB;
            case WEST:
                return WEST_AABB;
            case UP:
                return FLOOR_AABB;
            case SOUTH:
            default:
                return SOUTH_AABB;
        }
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        Direction direction = state.getValue(FACING);
        BlockPos blockPos = pos.offset(direction.getOpposite().getNormal());
        BlockState blockState = level.getBlockState(blockPos);
        return !blockState.getBlockSupportShape(level, pos).getFaceShape(direction).isEmpty();
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState()
                .setValue(FACING, context.getClickedFace());
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
