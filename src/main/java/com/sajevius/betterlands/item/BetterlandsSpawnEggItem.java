package com.sajevius.betterlands.item;

import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.common.util.NonNullSupplier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BetterlandsSpawnEggItem extends SpawnEggItem {
    public static List<BetterlandsSpawnEggItem> SPAWN_EGGS = new ArrayList<>();
    private final Lazy<? extends EntityType<?>> entityType;

    public BetterlandsSpawnEggItem(final NonNullSupplier<? extends EntityType<?>> entityType, int eggPrimary, int eggSecondary, Properties properties) {
        super(null, 0xFFFFFF, 0xFF0000, properties);
        this.entityType = Lazy.of(entityType::get);
        SPAWN_EGGS.add(this);
    }

    public BetterlandsSpawnEggItem(final RegistryObject<? extends EntityType<?>> entityTypeSupplier, final int eggPrimary, final int eggSecondary, Properties properties) {
        super(null, eggPrimary, eggSecondary, properties);
        this.entityType = Lazy.of(entityTypeSupplier);
        SPAWN_EGGS.add(this);
    }

    public static void registerEggs() {
        final Map<EntityType<?>, SpawnEggItem> EGGS = ObfuscationReflectionHelper.getPrivateValue(SpawnEggItem.class, null, "field_195987_b");
        DefaultDispenseItemBehavior dispenseBehavior = new DefaultDispenseItemBehavior() {
            public ItemStack dispenseStack(IBlockSource source, ItemStack stack) {
                Direction direction = source.getBlockState().getValue(DispenserBlock.FACING);
                EntityType<?> entityToSpawn = ((SpawnEggItem) stack.getItem()).getType(stack.getTag());
                entityToSpawn.spawn(source.getLevel(), stack, null, source.getPos().offset(Vector3i.ZERO.relative(direction, 1)), SpawnReason.DISPENSER, direction != Direction.UP, false);
                stack.shrink(1);
                return stack;
            }
        };
        for (final SpawnEggItem egg : SPAWN_EGGS) {
            EGGS.put(egg.getType(null), egg);
            DispenserBlock.registerBehavior(egg, dispenseBehavior);
        }
        SPAWN_EGGS.clear();
    }

    @Override
    public EntityType<?> getType(@Nullable final CompoundNBT nbt) {
        return entityType.get();
    }
}
