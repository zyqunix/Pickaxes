package com.zyqunix.pickaxes.init;

import com.zyqunix.pickaxes.items.ItemBase;
import com.zyqunix.pickaxes.items.armor.ArmorBase;
import com.zyqunix.pickaxes.items.tools.TNTPickaxe;
import com.zyqunix.pickaxes.items.tools.ToolPickaxe;
import com.zyqunix.pickaxes.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    // Materials
    public static final Item.ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 830, 5.0f, 4.0f, 15);
    public static final Item.ToolMaterial MATERIAL_COBALT = EnumHelper.addToolMaterial("material_cobalt", 3, 960, 6.0f, 4.0f, 10);
    public static final Item.ToolMaterial MATERIAL_TNT = EnumHelper.addToolMaterial("material_tnt", 3, 100, 5.0f, 4.0f, 10);
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_MINING = EnumHelper.addArmorMaterial("armor_material_mining", Reference.MOD_ID + ":mining_armor", 14, new int[]{1, 2, 3, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f);

    // Items
    public static final Item CRYSTALLIZED_RUBY = new ItemBase("crystallized_ruby");

    public static final Item RUBY = new ItemBase("ruby");
    public static final Item COBALT_INGOT = new ItemBase("cobalt_ingot");

    // Tools
    public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
    public static final ItemPickaxe COBALT_PICKAXE = new ToolPickaxe("cobalt_pickaxe", MATERIAL_COBALT);
    public static final ItemPickaxe TNT_PICKAXE = new TNTPickaxe("tnt_pickaxe", MATERIAL_TNT);

    // Armor
    public static final Item MINING_HELMET = new ArmorBase("mining_helmet", ARMOR_MATERIAL_MINING, 1, EntityEquipmentSlot.HEAD);
    public static final Item MINING_CHESTPLATE = new ArmorBase("mining_chestplate", ARMOR_MATERIAL_MINING, 1, EntityEquipmentSlot.CHEST);
    public static final Item MINING_PANTS = new ArmorBase("mining_pants", ARMOR_MATERIAL_MINING, 1, EntityEquipmentSlot.LEGS);
    public static final Item MINING_BOOTS = new ArmorBase("mining_boots", ARMOR_MATERIAL_MINING, 1, EntityEquipmentSlot.FEET);
}
