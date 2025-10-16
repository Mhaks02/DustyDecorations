package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FaceAttachedHorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TreasureMapBlock extends FaceAttachedHorizontalDirectionalBlock {
    public static final MapCodec<TreasureMapBlock> CODEC = simpleCodec(TreasureMapBlock::new);

    public TreasureMapBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends FaceAttachedHorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    private static final VoxelShape CEILING_AABB_X =
            Block.box(3, 15, 0, 13, 16, 16);
    private static final VoxelShape CEILING_AABB_Z =
            Block.box(0, 15, 3, 16, 16, 13);
    private static final VoxelShape FLOOR_AABB_X =
            Block.box(3, 0, 0, 13, 1, 16);
    private static final VoxelShape FLOOR_AABB_Z =
            Block.box(0, 0, 3, 16, 1, 13);
    private static final VoxelShape NORTH_AABB =
            Block.box(0, 3, 15, 16, 13, 16);
    private static final VoxelShape SOUTH_AABB =
            Block.box(0, 3, 0, 16, 13, 1);
    private static final VoxelShape WEST_AABB =
            Block.box(15, 3, 0, 16, 13, 16);
    private static final VoxelShape EAST_AABB =
            Block.box(0, 3, 0, 1, 13, 16);

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch (state.getValue(FACE)) {
            case FLOOR:
                if (state.getValue(FACING).getAxis() == Direction.Axis.X) {
                    return FLOOR_AABB_X;
                }
                return FLOOR_AABB_Z;
            case WALL:
                return switch (state.getValue(FACING)) {
                    case NORTH, UP, DOWN -> NORTH_AABB;
                    case SOUTH -> SOUTH_AABB;
                    case EAST -> EAST_AABB;
                    case WEST -> WEST_AABB;
                };
            case CEILING:
            default:
                if (state.getValue(FACING).getAxis() == Direction.Axis.X) {
                    return CEILING_AABB_X;
                } else {
                    return CEILING_AABB_Z;
                }
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, FACE);
    }
}
