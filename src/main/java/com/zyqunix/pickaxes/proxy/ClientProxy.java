package com.zyqunix.pickaxes.proxy;

import com.zyqunix.pickaxes.util.handlers.KeyInputHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

import java.util.Objects;

public class ClientProxy extends CommonProxy {

    public void registerItemRenderer(Item item, int meta, String id) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), id));
    }

    @Override
    public void init() {
        KeyInputHandler.registerKeys(); // Register keybindings in the client proxy
    }
}
