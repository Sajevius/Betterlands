package com.sajevius.betterlands.init;

import com.sajevius.betterlands.Betterlands;
import com.sajevius.betterlands.item.BetterlandsSpawnEggItem;
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
    public static final RegistryObject<Item> PINK_GLOSSY_TERRACOTTA = ITEMS.register("pink_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.PINK_GLOSSY_TERRACOTTA.get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> GRAY_GLOSSY_TERRACOTTA = ITEMS.register("gray_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.GRAY_GLOSSY_TERRACOTTA.get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> LIGHT_GRAY_GLOSSY_TERRACOTTA = ITEMS.register("light_gray_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.LIGHT_GRAY_GLOSSY_TERRACOTTA.get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> CYAN_GLOSSY_TERRACOTTA = ITEMS.register("cyan_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.CYAN_GLOSSY_TERRACOTTA.get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> PURPLE_GLOSSY_TERRACOTTA = ITEMS.register("purple_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.PURPLE_GLOSSY_TERRACOTTA.get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> BLUE_GLOSSY_TERRACOTTA = ITEMS.register("blue_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.BLUE_GLOSSY_TERRACOTTA.get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> BROWN_GLOSSY_TERRACOTTA = ITEMS.register("brown_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.BROWN_GLOSSY_TERRACOTTA.get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> GREEN_GLOSSY_TERRACOTTA = ITEMS.register("green_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.GREEN_GLOSSY_TERRACOTTA.get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> RED_GLOSSY_TERRACOTTA = ITEMS.register("red_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.RED_GLOSSY_TERRACOTTA.get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> BLACK_GLOSSY_TERRACOTTA = ITEMS.register("black_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.BLACK_GLOSSY_TERRACOTTA.get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));

    public static final RegistryObject<Item> GILA_MONSTER_SPAWN_EGG = ITEMS.register("gila_monster_spawn_egg", () -> new BetterlandsSpawnEggItem(BetterlandsEntities.GILA_MONSTER, 0x504A42, 0xEEA442, new Item.Properties().tab(Betterlands.ITEM_GROUP)));
}
