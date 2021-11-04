package com.sajevius.betterlands.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

public class TerracottaPavementBlock extends Block {
    public TerracottaPavementBlock(Properties properties) {
        super(properties);
    }

    @Override
    public float getSpeedFactor() {
        return 1.4F;
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return true;
    }
}
