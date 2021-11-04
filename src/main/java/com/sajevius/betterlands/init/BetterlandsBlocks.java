package com.sajevius.betterlands.init;

import com.google.common.collect.Lists;
import com.sajevius.betterlands.Betterlands;
import com.sajevius.betterlands.block.GlossyTerracottaBlock;
import com.sajevius.betterlands.util.TerracottaColorLists;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class BetterlandsBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Betterlands.MODID);

    public static final List<RegistryObject<Block>> COLORED_GLOSSY_TERRACOTTA = initializeGlossyTerracottaBlocks();
    public static final RegistryObject<Block> GLOSSY_TERRACOTTA = BLOCKS.register("glossy_terracotta", () -> new GlossyTerracottaBlock(AbstractBlock.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(1.25F, 4.2f)));

    /** A method for mass-registering all 16 color variants of glossy terracotta blocks.
     * This has a return type of `List<RegistryObject<Block>>` so you can call this in any instance of
     * `List<RegistryObject<Block>>` class.
     * That list of registry objects will then also be registered alongside other individual
     * registry objects specified in this class once `BLOCKS` is registered in the mod's main class through
     * the Forge event bus.
     */
    public static List<RegistryObject<Block>> initializeGlossyTerracottaBlocks() {
        //Class blockClass = block.getClass();
        List<Block> TERRACOTTA_BLOCKS = Lists.newArrayList(); // Creates a List to store all the base blocks of terracotta blocks to register.
        List<RegistryObject<Block>> UNADDED_BLOCKS = Lists.newArrayList(); // Creates a List to store all registry objects for needed terracotta blocks
        /** Creates new objects from GlossyTerracottaBlock based on factors like material color,
         * which is dynamically obtained through each for loop iteration by searching the List under
         * `TerracottaColorLists` class using an index number equal to the dynamic value of int `i`.
         */
        for(int i = 0; i < TerracottaColorLists.color_names.size(); ++i) {
            TERRACOTTA_BLOCKS.add(new GlossyTerracottaBlock(AbstractBlock.Properties.of(Material.STONE, TerracottaColorLists.materialColors.get(i)).strength(1.25f, 4.2f).requiresCorrectToolForDrops()));
        }
        /** Similar to the previous for loop, except this one
         * creates registry objects dynamically, based on the block objects listed
         * under the `TERRACOTTA_BLOCKS` list.
         */
        for(int i = 0; i < TERRACOTTA_BLOCKS.size(); ++i) {
            int finalI = i;
            UNADDED_BLOCKS.add(BLOCKS.register(TerracottaColorLists.color_names.get(i) + "_glossy_terracotta", () -> TERRACOTTA_BLOCKS.get(finalI)));
        }
        return UNADDED_BLOCKS;
    }
}