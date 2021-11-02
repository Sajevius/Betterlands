package com.sajevius.betterlands.init;

import com.sajevius.betterlands.Betterlands;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BetterlandsItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Betterlands.MODID);

    public static final RegistryObject<Item> LARGE_HORN = ITEMS.register("large_horn", () -> new Item(new Item.Properties().stacksTo(64).tab(Betterlands.ITEM_GROUP)));

    public static final RegistryObject<Item> GLOSSY_TERRACOTTA = ITEMS.register("glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.GLOSSY_TERRACOTTA.get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> WHITE_GLOSSY_TERRACOTTA = ITEMS.register("white_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.WHITE_GLOSSY_TERRACOTTA.get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> ORANGE_GLOSSY_TERRACOTTA = ITEMS.register("orange_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.ORANGE_GLOSSY_TERRACOTTA.get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> MAGENTA_GLOSSY_TERRACOTTA = ITEMS.register("magenta_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.MAGENTA_GLOSSY_TERRACOTTA.get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> LIGHT_BLUE_GLOSSY_TERRACOTTA = ITEMS.register("light_blue_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.LIGHT_BLUE_GLOSSY_TERRACOTTA.get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> YELLOW_GLOSSY_TERRACOTTA = ITEMS.register("yellow_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.YELLOW_GLOSSY_TERRACOTTA.get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> LIME_GLOSSY_TERRACOTTA = ITEMS.register("lime_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.LIME_GLOSSY_TERRACOTTA.get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));

}
