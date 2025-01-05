package com.zyqunix.pickaxes.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

    public static void init() {
        // GameRegistry.addSmelting(input {ModType.ITEM/BLOCK, new {type}Stack(Mod{Type}.Output, count), xp as float);

        GameRegistry.addSmelting(ModItems.RUBY, new ItemStack(ModItems.CRYSTALLIZED_RUBY, 1), 1.5f);
        GameRegistry.addSmelting(ModBlocks.RUBY_BLOCK, new ItemStack(ModItems.CRYSTALLIZED_RUBY, 9), 13.5f);

        GameRegistry.addSmelting(ModBlocks.COBALT_ORE, new ItemStack(ModItems.COBALT_INGOT, 1), 1.5f);
        GameRegistry.addSmelting(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY, 1), 1.5f);
    }
}
