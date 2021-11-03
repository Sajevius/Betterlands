package com.sajevius.betterlands;

import com.sajevius.betterlands.client.renderer.GilaMonsterRenderer;
import com.sajevius.betterlands.init.BetterlandsEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Betterlands.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BetterlandsClient {
    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
    }
}
