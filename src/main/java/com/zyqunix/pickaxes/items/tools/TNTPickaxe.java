package com.zyqunix.pickaxes.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class TNTPickaxe extends ToolPickaxe {

    public TNTPickaxe(String name, ToolMaterial material) {
        super(name, material);
        setCreativeTab(CreativeTabs.TOOLS);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        if (!world.isRemote) {
            BlockPos pos = player.getPosition().offset(player.getHorizontalFacing());
            EntityTNTPrimed primedTNT = new EntityTNTPrimed(world, pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, player);
            world.spawnEntity(primedTNT);

            player.sendMessage(new TextComponentString("TNT spawned!"));
        }
        return new ActionResult<>(EnumActionResult.SUCCESS, player.getHeldItem(hand));
    }


}
