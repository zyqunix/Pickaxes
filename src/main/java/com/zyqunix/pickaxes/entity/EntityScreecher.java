package com.zyqunix.pickaxes.entity;

import com.zyqunix.pickaxes.init.ModItems;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityScreecher extends EntityCaveSpider {
    public EntityScreecher(World worldIn) {
        super(worldIn);
        this.setSize(1F, 0.7F);
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, ModItems.CRYSTALLIZED_RUBY, false));
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(4.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.2D);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return super.getAmbientSound();
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return super.getHurtSound(source);
    }

    @Override
    protected SoundEvent getDeathSound() {
        return super.getDeathSound();
    }

    public float getEyeHeight() {
        return 0.25F;
    }
}