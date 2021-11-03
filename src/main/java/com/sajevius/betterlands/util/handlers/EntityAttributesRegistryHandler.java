package com.sajevius.betterlands.util.handlers;

import com.sajevius.betterlands.Betterlands;
import com.sajevius.betterlands.entity.GilaMonsterEntity;
import com.sajevius.betterlands.init.BetterlandsEntities;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Betterlands.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityAttributesRegistryHandler {
    @SubscribeEvent
    public static void registerEntityAttributes(EntityAttributeCreationEvent event) {
        event.put(BetterlandsEntities.GILA_MONSTER.get(), GilaMonsterEntity.setCustomAttributes().build());
    }
}
