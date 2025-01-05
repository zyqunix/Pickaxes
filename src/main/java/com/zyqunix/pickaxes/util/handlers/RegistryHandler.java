package com.zyqunix.pickaxes.util.handlers;

import com.zyqunix.pickaxes.init.ModBlocks;
import com.zyqunix.pickaxes.init.ModItems;
import com.zyqunix.pickaxes.items.tools.TNTPickaxe;
import com.zyqunix.pickaxes.util.IHasModel;
import com.zyqunix.pickaxes.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        // Ensure all items in ModItems.ITEMS are registered first
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));

        // Register the TNTPickaxe item with a unique registry name
        event.getRegistry().registerAll(
            new TNTPickaxe("tnt_pickaxe").setRegistryName(Reference.MOD_ID, "tnt_pickaxe")
        );
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        // Ensure all blocks in ModBlocks.BLOCKS are registered first
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        // Register item models
        for (Item item : ModItems.ITEMS) {
            if (item instanceof IHasModel) {
                ((IHasModel)item).registerModels();
            }
        }

        // Register block models
        for (Block block : ModBlocks.BLOCKS) {
            if (block instanceof IHasModel) {
                ((IHasModel)block).registerModels();
            }
        }
    }
}
