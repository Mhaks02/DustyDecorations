package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.mhaks.dustydecorations.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class GarlandBlock extends HorizontalDirectionalBlock {
    public static final IntegerProperty TEXTURE = IntegerProperty.create("texture", 0, 2);
    public static final MapCodec<GarlandBlock> CODEC = simpleCodec(GarlandBlock::new);

    public GarlandBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    protected static final VoxelShape WALL_NORTH_AABB =
            Block.box(0, 8, 15, 16, 16, 16);
    protected static final VoxelShape WALL_SOUTH_AABB =
            Block.box(0, 8, 0, 16, 16, 1);
    protected static final VoxelShape WALL_EAST_AABB =
            Block.box(0, 8, 0, 1, 16, 16);
    protected static final VoxelShape WALL_WEST_AABB =
            Block.box(15, 8, 0, 16, 16, 16);

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch (state.getValue(FACING)) {
            case NORTH:
                return WALL_NORTH_AABB;
            case EAST:
                return WALL_EAST_AABB;
            case WEST:
                return WALL_WEST_AABB;
            case SOUTH:
            default:
                return WALL_SOUTH_AABB;
        }
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction[] directions;
        BlockState blockState = this.defaultBlockState();
        for (Direction direction : directions = context.getNearestLookingDirections()) {
            Direction direction2;
            if (!direction.getAxis().isHorizontal() || !(blockState = blockState.setValue(FACING, direction2 = direction.getOpposite())).canSurvive(context.getLevel(), context.getClickedPos()))
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
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
        if (state.is(ModBlocks.FALL_GARLAND.get()) || state.is(ModBlocks.WINTER_GARLAND.get())) {
            this.registerDefaultState(defaultBlockState()
                    .setValue(TEXTURE, RandomSource.create().nextInt(0, 3)));
        }
        super.onPlace(state, level, pos, oldState, movedByPiston);
    }

    @Override
    protected boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        Direction direction = state.getValue(FACING);
        BlockPos blockPos = pos.offset(direction.getOpposite().getNormal());
        BlockState blockState = level.getBlockState(blockPos);
        return blockState.isFaceSturdy(level, blockPos, direction);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, TEXTURE);
    }
}
