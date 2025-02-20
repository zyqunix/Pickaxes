package com.zyqunix.pickaxes.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraft.entity.projectile.EntityArrow;

public class P250 extends ToolSword {
    private int bullets = 12;

    public P250(String name, ToolMaterial material) {
        super(name, material);
        setCreativeTab(CreativeTabs.COMBAT);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        if (!world.isRemote) {
            if (player.isSneaking()) {
                bullets = 12;
                player.sendMessage(new TextComponentString("Gun reloaded!"));
            } else {
                if (bullets > 0) {
                    bullets--;
                    Vec3d look = player.getLookVec();
                    double speed = 5.0D;
                    EntityArrow bullet = new EntityArrow(world, player) {
                        @Override
                        protected ItemStack getArrowStack() {
                            return new ItemStack(net.minecraft.init.Items.ARROW);
                        }
                    };
                    bullet.shoot(look.x, look.y, look.z, (float) speed, 0);
                    bullet.setDamage(4.0D);
                    bullet.setInvisible(true);
                    world.spawnEntity(bullet);
                    player.sendMessage(new TextComponentString("Bullets left: " + bullets));
                } else {
                    player.sendMessage(new TextComponentString("Out of bullets!"));
                }
            }
        }
        return new ActionResult<>(EnumActionResult.SUCCESS, player.getHeldItem(hand));
    }
}
