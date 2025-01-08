package com.zyqunix.pickaxes.items.armor;

import com.zyqunix.pickaxes.Main;
import com.zyqunix.pickaxes.init.ModItems;
import com.zyqunix.pickaxes.util.IHasModel;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class MiningHelmet extends ItemArmor implements IHasModel{

    public MiningHelmet(ArmorMaterial material, int renderIndex, EntityEquipmentSlot equipmentSlot) {
        super(material, renderIndex, equipmentSlot);
        String name = "mining_helmet";
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ModItems.ITEMS.add(this);
    }


    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (!world.isRemote) {
            if (!player.isPotionActive(MobEffects.HASTE)) {
                player.addPotionEffect(new PotionEffect(MobEffects.HASTE, 40, 0, true, false));
            }
        }
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        tooltip.add(TextFormatting.GREEN + "Grants Haste when worn.");
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "Inventory");
    }
}
