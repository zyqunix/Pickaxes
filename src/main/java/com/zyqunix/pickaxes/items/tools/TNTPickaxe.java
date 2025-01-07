package com.zyqunix.pickaxes.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class TNTPickaxe extends ToolPickaxe {

    public TNTPickaxe(String name, ToolMaterial material) {
        super(name, material);
        setCreativeTab(CreativeTabs.TOOLS);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        ItemStack item = player.getHeldItem(hand);

        float explosionStrength = 5.0f;
        world.createExplosion(null, player.posX, player.posY, player.posZ, explosionStrength, true);

        /*
        Vec3d aim = player.getLookVec();

        EntityLargeFireball fireball = new EntityLargeFireball(world, player, 1, 1, 1);
        fireball.setPosition(player.posX + aim.x * 1.5D, player.posY + 1 + aim.y * 1.5D, player.posZ + aim.z * 1.5D);
        fireball.accelerationX = aim.x * 0.1;
        fireball.accelerationY = aim.y * 0.1;
        fireball.accelerationZ = aim.z * 0.1;
        fireball.explosionPower = 5;
        fireball.extinguish();

        world.spawnEntity(fireball);

        EntityTNTPrimed tnt = new EntityTNTPrimed(world, 1, 1, 1, player);
        tnt.setPosition(player.posX + aim.x * 1.5D, player.posY + aim.y * 1.5D, player.posZ + aim.z * 1.5D);
        tnt.setFuse(80);
         */

        item.damageItem(5, player);
        return new ActionResult<>(EnumActionResult.SUCCESS, item);
    }
}
