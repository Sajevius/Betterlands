package com.sajevius.betterlands.util;

import com.sajevius.betterlands.Betterlands;
import com.sajevius.betterlands.init.BetterlandsItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class BetterlandsItemGroup extends ItemGroup {
    public BetterlandsItemGroup() {
        super("betterlands");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(BetterlandsItems.LARGE_HORN.get());
    }
}
