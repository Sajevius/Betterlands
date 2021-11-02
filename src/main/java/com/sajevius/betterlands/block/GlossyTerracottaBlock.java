package com.sajevius.betterlands.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

public class GlossyTerracottaBlock extends Block {
    public GlossyTerracottaBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isRandomlyTicking(BlockState state) {
        return true;
    }

    @Override
    public float getSpeedFactor() {
        return 1.1F;
    }
}
