package com.sajevius.betterlands.init;

import com.sajevius.betterlands.Betterlands;
import com.sajevius.betterlands.block.GlossyTerracottaBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BetterlandsBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Betterlands.MODID);

    public static final RegistryObject<Block> GLOSSY_TERRACOTTA = BLOCKS.register("glossy_terracotta", () -> new GlossyTerracottaBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(1.25F, 4.2f)));
    public static final RegistryObject<Block> WHITE_GLOSSY_TERRACOTTA = BLOCKS.register("white_glossy_terracotta", () -> new GlossyTerracottaBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_WHITE).requiresCorrectToolForDrops().strength(1.25f, 4.2f)));
    public static final RegistryObject<Block> ORANGE_GLOSSY_TERRACOTTA = BLOCKS.register("orange_glossy_terracotta", () -> new GlossyTerracottaBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_ORANGE).requiresCorrectToolForDrops().strength(1.25f, 4.2f)));
    public static final RegistryObject<Block> MAGENTA_GLOSSY_TERRACOTTA = BLOCKS.register("magenta_glossy_terracotta", () -> new GlossyTerracottaBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_MAGENTA).requiresCorrectToolForDrops().strength(1.25f, 4.2f)));
    public static final RegistryObject<Block> LIGHT_BLUE_GLOSSY_TERRACOTTA = BLOCKS.register("light_blue_glossy_terracotta", () -> new GlossyTerracottaBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_LIGHT_BLUE).requiresCorrectToolForDrops().strength(1.25f, 4.2f)));
    public static final RegistryObject<Block> YELLOW_GLOSSY_TERRACOTTA = BLOCKS.register("yellow_glossy_terracotta", () -> new GlossyTerracottaBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_YELLOW).requiresCorrectToolForDrops().strength(1.25f, 4.2f)));
    public static final RegistryObject<Block> LIME_GLOSSY_TERRACOTTA = BLOCKS.register("lime_glossy_terracotta", () -> new GlossyTerracottaBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.TERRACOTTA_LIGHT_GREEN).requiresCorrectToolForDrops().strength(1.25f, 4.2f)));
}
