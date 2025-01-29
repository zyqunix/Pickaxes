package com.zyqunix.pickaxes.entity;

import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityScreecher extends EntityCaveSpider {
    public EntityScreecher(World worldIn) {
        super(worldIn);
        this.setSize(0.7F, 0.5F);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        // Set custom attributes
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