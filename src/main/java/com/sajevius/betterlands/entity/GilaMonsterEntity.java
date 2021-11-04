package com.sajevius.betterlands.entity;

import net.minecraft.entity.*;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class GilaMonsterEntity extends CreatureEntity {
    public GilaMonsterEntity(EntityType<? extends GilaMonsterEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 16.0D)
                .add(Attributes.ATTACK_KNOCKBACK, 1)
                .add(Attributes.ATTACK_SPEED, 4)
                .add(Attributes.FOLLOW_RANGE, 16.0D)
                .add(Attributes.ARMOR, 1)
                .add(Attributes.MOVEMENT_SPEED, 0.3D)
                .add(Attributes.ATTACK_DAMAGE, 2);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(3, new SwimGoal(this));
        this.goalSelector.addGoal(3, new LookAtGoal(this, PlayerEntity.class, 24.0F));
        this.goalSelector.addGoal(5, new LookRandomlyGoal(this));
        this.goalSelector.addGoal(3, new RandomWalkingGoal(this, 0.3F));
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 0.8D, true));

        this.targetSelector.addGoal(1, new HurtByTargetGoal(this).setAlertOthers(GilaMonsterEntity.class));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, RabbitEntity.class, true));
    }

    @Override
    public boolean doHurtTarget(Entity entity) {
        boolean flag = super.doHurtTarget(entity);
        if(flag && entity instanceof LivingEntity) {
            float f = this.level.getCurrentDifficultyAt(this.blockPosition()).getEffectiveDifficulty();
            ((LivingEntity) entity).addEffect(new EffectInstance(Effects.POISON, 140 * (int)f));
        }
        return flag;
    }

    @Override
    protected void doPush(Entity entity) {
        if(entity instanceof LivingEntity && (!(entity instanceof GilaMonsterEntity) && !(entity instanceof CreeperEntity))) {
            this.setTarget((LivingEntity)entity);
        }
    }
}
