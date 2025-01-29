package com.zyqunix.pickaxes.entity;

import com.zyqunix.pickaxes.init.ModItems;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;

public class EntityScreecher extends EntityCaveSpider {
    private boolean tamed = false;

    public EntityScreecher(World worldIn) {
        super(worldIn);
        this.setSize(1F, 0.7F);
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, ModItems.CRYSTALLIZED_RUBY, false));
        this.targetTasks.addTask(1, new EntityAINearestAttackableTarget<>(this, EntityPlayer.class, true));
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(4.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.3D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(2.0D);
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (!tamed && this.getAttackTarget() instanceof EntityPlayer) {
            EntityPlayer player = (EntityPlayer) this.getAttackTarget();
            this.setPosition(player.posX, player.posY + player.getEyeHeight(), player.posZ);
            if (!player.isSneaking() && !player.isSpectator()) {
                player.attackEntityFrom(DamageSource.causeMobDamage(this), 1.0F);
            }
        }
    }

    @Override
    public boolean processInteract(EntityPlayer player, EnumHand hand) {
        ItemStack itemstack = player.getHeldItem(hand);
        if (!tamed && itemstack.getItem() == ModItems.CRYSTALLIZED_RUBY) {
            if (!player.capabilities.isCreativeMode) {
                itemstack.shrink(1);
            }
            this.tamed = true;
            this.setAttackTarget(null);
            this.targetTasks.addTask(1, new EntityAINearestAttackableTarget<>(this, EntityLiving.class, 10, true, false, entity -> entity.isCreatureType(EnumCreatureType.MONSTER, false)));
            return true;
        }
        return super.processInteract(player, hand);
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_SPIDER_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_SPIDER_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_SPIDER_DEATH;
    }

    public float getEyeHeight() {
        return 0.25F;
    }
}
