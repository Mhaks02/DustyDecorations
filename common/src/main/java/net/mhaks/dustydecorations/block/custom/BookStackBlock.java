package net.mhaks.dustydecorations.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class BookStackBlock extends HorizontalDirectionalBlock {
    public static final IntegerProperty TEXTURE = IntegerProperty.create("texture", 0, 2);
    public static final MapCodec<BookStackBlock> CODEC = simpleCodec(BookStackBlock::new);

    public BookStackBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    private static final VoxelShape SHAPE_N =
            Shapes.or(
                    Block.box(1, 0, 3, 15, 2, 13),
                    Block.box(0.5, 2, 2.5, 13.5, 5, 13.5),
                    Block.box(1.5, 5, 3.25, 15.5, 6, 13.25),
                    Block.box(0.75, 6, 2, 13.75, 8, 12),
                    Block.box(2.25, 8, 4.5, 14.25, 10, 13.5),
                    Block.box(2, 10, 2.25, 15, 11, 13.25),
                    Block.box(1.25, 11, 3.5, 12.25, 13, 13.5),
                    Block.box(1.5, 13, 3.75, 13.5, 16, 12.75));

    private static final VoxelShape SHAPE_S =
            Shapes.or(
                    Block.box(1, 0, 3, 15, 2, 13),
                    Block.box(2.5, 2, 2.5, 15.5, 5, 13.5),
                    Block.box(0.5, 5, 2.75, 14.5, 6, 12.75),
                    Block.box(2.25, 6, 4, 15.25, 8, 14),
                    Block.box(1.75, 8, 2.5, 13.75, 10, 11.5),
                    Block.box(1, 10, 2.75, 14, 11, 13.75),
                    Block.box(3.75, 11, 2.5, 14.75, 13, 12.5),
                    Block.box(2.5, 13, 3.25, 14.5, 16, 12.25));

    private static final VoxelShape SHAPE_E =
            Shapes.or(
                    Block.box(3, 0, 1, 13, 2, 15),
                    Block.box(2.5, 2, 0.5, 13.5, 5, 13.5),
                    Block.box(2.75, 5, 1.5, 12.75, 6, 15.5),
                    Block.box(4, 6, 0.75, 14, 8, 13.75),
                    Block.box(2.5, 8, 2.25, 11.5, 10, 14.25),
                    Block.box(2.75, 10, 2, 13.75, 11, 15),
                    Block.box(2.5, 11, 1.25, 12.5, 13, 12.25),
                    Block.box(3.25, 13, 1.5, 12.25, 16, 13.5));

    private static final VoxelShape SHAPE_W =
            Shapes.or(
                    Block.box(3, 0, 1, 13, 2, 15),
                    Block.box(2.5, 2, 2.5, 13.5, 5, 15.5),
                    Block.box(3.25, 5, 0.5, 13.25, 6, 14.5),
                    Block.box(2, 6, 2.25, 12, 8, 15.25),
                    Block.box(4.5, 8, 1.75, 13.5, 10, 13.75),
                    Block.box(2.25, 10, 1, 13.25, 11, 14),
                    Block.box(3.5, 11, 3.75, 13.5, 13, 14.75),
                    Block.box(3.75, 13, 2.5, 12.75, 16, 14.5));

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        switch (state.getValue(FACING)) {
            case NORTH -> {
                return SHAPE_N;
            }
            case EAST -> {
                return SHAPE_E;
            }
            case WEST -> {
                return SHAPE_W;
            }
            default -> {
                return SHAPE_S;
            }
        }
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState()
                .setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
        super.onPlace(state, level, pos, oldState, movedByPiston);
        this.registerDefaultState(defaultBlockState()
                .setValue(TEXTURE, RandomSource.create().nextInt(0, 3)));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, TEXTURE);
    }
}
