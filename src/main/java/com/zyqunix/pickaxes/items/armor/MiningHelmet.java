package com.zyqunix.pickaxes.items.armor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.text.TextComponentString;

public class MiningHelmet extends ItemArmor {
    private boolean echoEnabled = false;

    public MiningHelmet(ArmorMaterial material, int renderIndex, EntityEquipmentSlot slot) {
        super(material, renderIndex, slot);
    }

    public void toggleEcho(EntityPlayer player) {
        echoEnabled = !echoEnabled;
        String message = echoEnabled ? "echo on" : "echo off";
        if (!player.world.isRemote) {
            player.sendMessage(new TextComponentString(message));
        }
    }
}
