package com.sajevius.betterlands.init;

import com.sajevius.betterlands.Betterlands;
import com.sajevius.betterlands.entity.GilaMonsterEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BetterlandsEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, Betterlands.MODID);

    public static final RegistryObject<EntityType<GilaMonsterEntity>> GILA_MONSTER = ENTITIES.register("gila_monster", () -> EntityType.Builder.of(GilaMonsterEntity::new, EntityClassification.MONSTER).sized(1F, 1F).updateInterval(3).build(new ResourceLocation(Betterlands.MODID, "gila_monster").toString()));
}
