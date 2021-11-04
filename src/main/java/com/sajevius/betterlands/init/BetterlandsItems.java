package com.sajevius.betterlands.init;

import com.sajevius.betterlands.Betterlands;
import com.sajevius.betterlands.item.BetterlandsSpawnEggItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BetterlandsItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Betterlands.MODID);

    public static final RegistryObject<Item> LARGE_HORN = ITEMS.register("large_horn", () -> new Item(new Item.Properties().stacksTo(64).tab(Betterlands.ITEM_GROUP)));

    public static final RegistryObject<Item> GLOSSY_TERRACOTTA = ITEMS.register("glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.GLOSSY_TERRACOTTA.get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> WHITE_GLOSSY_TERRACOTTA = ITEMS.register("white_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.COLORED_GLOSSY_TERRACOTTA.get(0).get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> ORANGE_GLOSSY_TERRACOTTA = ITEMS.register("orange_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.COLORED_GLOSSY_TERRACOTTA.get(1).get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> MAGENTA_GLOSSY_TERRACOTTA = ITEMS.register("magenta_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.COLORED_GLOSSY_TERRACOTTA.get(2).get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> LIGHT_BLUE_GLOSSY_TERRACOTTA = ITEMS.register("light_blue_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.COLORED_GLOSSY_TERRACOTTA.get(3).get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> YELLOW_GLOSSY_TERRACOTTA = ITEMS.register("yellow_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.COLORED_GLOSSY_TERRACOTTA.get(4).get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> LIME_GLOSSY_TERRACOTTA = ITEMS.register("lime_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.COLORED_GLOSSY_TERRACOTTA.get(5).get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> PINK_GLOSSY_TERRACOTTA = ITEMS.register("pink_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.COLORED_GLOSSY_TERRACOTTA.get(6).get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> GRAY_GLOSSY_TERRACOTTA = ITEMS.register("gray_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.COLORED_GLOSSY_TERRACOTTA.get(7).get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> LIGHT_GRAY_GLOSSY_TERRACOTTA = ITEMS.register("light_gray_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.COLORED_GLOSSY_TERRACOTTA.get(8).get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> CYAN_GLOSSY_TERRACOTTA = ITEMS.register("cyan_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.COLORED_GLOSSY_TERRACOTTA.get(9).get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> PURPLE_GLOSSY_TERRACOTTA = ITEMS.register("purple_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.COLORED_GLOSSY_TERRACOTTA.get(10).get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> BLUE_GLOSSY_TERRACOTTA = ITEMS.register("blue_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.COLORED_GLOSSY_TERRACOTTA.get(11).get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> BROWN_GLOSSY_TERRACOTTA = ITEMS.register("brown_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.COLORED_GLOSSY_TERRACOTTA.get(12).get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> GREEN_GLOSSY_TERRACOTTA = ITEMS.register("green_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.COLORED_GLOSSY_TERRACOTTA.get(13).get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> RED_GLOSSY_TERRACOTTA = ITEMS.register("red_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.COLORED_GLOSSY_TERRACOTTA.get(14).get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));
    public static final RegistryObject<Item> BLACK_GLOSSY_TERRACOTTA = ITEMS.register("black_glossy_terracotta", () -> new BlockItem(BetterlandsBlocks.COLORED_GLOSSY_TERRACOTTA.get(15).get(), new Item.Properties().tab(Betterlands.ITEM_GROUP)));

    public static final RegistryObject<Item> GILA_MONSTER_SPAWN_EGG = ITEMS.register("gila_monster_spawn_egg", () -> new BetterlandsSpawnEggItem(BetterlandsEntities.GILA_MONSTER, 0x504A42, 0xEEA442, new Item.Properties().tab(Betterlands.ITEM_GROUP)));
}
