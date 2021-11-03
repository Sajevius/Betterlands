package com.sajevius.betterlands.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.Random;

public class GlossyTerracottaBlock extends Block {
    public static final BooleanProperty EXTRA_SLIPPERY = BooleanProperty.create("extra_slippery"); // experimental

    public GlossyTerracottaBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(EXTRA_SLIPPERY, Boolean.valueOf(false)));
    }

    @Override
    public float getFriction() {
        return 0.95F;
    }

    @Override
    public float getSpeedFactor() {
        BlockState state = this.defaultBlockState();
        if(state.getValue(EXTRA_SLIPPERY) == true) {
            return 1.6F; // experimental
        } else return 1.0F;
    }

    @Override
    public void tick(BlockState state, ServerWorld world, BlockPos pos, Random rand) {
        if(world.isRaining() && world.canSeeSky(pos)) {
            world.setBlock(pos, state.cycle(EXTRA_SLIPPERY), 2);
        }
        // experimental
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return false;
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> state) {
        state.add(EXTRA_SLIPPERY);
        // experimental
    }
}
