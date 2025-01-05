package com.zyqunix.pickaxes.init;

import com.zyqunix.pickaxes.items.ItemBase;
import com.zyqunix.pickaxes.items.tools.ToolPickaxe;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.common.util.EnumHelper;

import java.util.ArrayList;
import java.util.List;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    // Materials
    public static final Item.ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 830, 5.0f, 4.0f,15);
    public static final Item.ToolMaterial MATERIAL_COBALT = EnumHelper.addToolMaterial("material_cobalt", 3, 960, 6.0f, 4.0f,10);

    // Items
    public static final Item CRYSTALLIZED_RUBY = new ItemBase("crystallized_ruby");

    public static final Item RUBY = new ItemBase("ruby");
    public static final Item COBALT_INGOT = new ItemBase("cobalt_ingot");

    // Tools
    public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
    public static final ItemPickaxe COBALT_PICKAXE = new ToolPickaxe("cobalt_pickaxe", MATERIAL_COBALT);
}
