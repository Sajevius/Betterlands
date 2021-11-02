package com.sajevius.betterlands;


import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.sajevius.betterlands.init.BetterlandsBlocks;
import com.sajevius.betterlands.init.BetterlandsItems;
import com.sajevius.betterlands.util.BetterlandsItemGroup;

@Mod(Betterlands.MODID)
public class Betterlands {
    public static Betterlands instance;

    public static final String MODID = "betterlands";
    private static final Logger LOGGER = LogManager.getLogger();
    public static final BetterlandsItemGroup ITEM_GROUP = new BetterlandsItemGroup();

    public Betterlands() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        instance = this;

        BetterlandsBlocks.BLOCKS.register(bus);
        BetterlandsItems.ITEMS.register(bus);

        bus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Setting up Betterlands v1.0.0!");
    }
}
