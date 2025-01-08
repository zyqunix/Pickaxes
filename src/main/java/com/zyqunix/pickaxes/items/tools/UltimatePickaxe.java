package com.zyqunix.pickaxes.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class UltimatePickaxe extends ToolPickaxe {
    private int aoeSize = 3;

    public UltimatePickaxe(String name, ToolMaterial material) {
        super(name, material);
        setCreativeTab(CreativeTabs.TOOLS);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
        if (!world.isRemote) {
            if (player.isSneaking()) {
                // Cycle AOE size: 3x3 -> 5x5 -> 7x7 -> 3x3
                aoeSize = (aoeSize == 7) ? 3 : aoeSize + 2;
                player.sendMessage(new TextComponentString("AOE size set to " + aoeSize + "x" + aoeSize));
            }
        }
        return new ActionResult<>(EnumActionResult.SUCCESS, player.getHeldItem(hand));
    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player) {
        World world = player.world;

        if (!world.isRemote) {
            EnumFacing facing = player.getHorizontalFacing();

            for (int x = -aoeSize / 2; x <= aoeSize / 2; x++) {
                for (int y = -aoeSize / 2; y <= aoeSize / 2; y++) {
                    for (int z = -aoeSize / 2; z <= aoeSize / 2; z++) {
                        BlockPos targetPos = pos.add(x, y, z);
                        if (world.isAirBlock(targetPos)) continue;

                        world.destroyBlock(targetPos, true);
                    }
                }
            }
        }
        return super.onBlockStartBreak(itemstack, pos, player);
    }
}
