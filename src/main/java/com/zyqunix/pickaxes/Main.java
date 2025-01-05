package com.zyqunix.pickaxes;

import com.zyqunix.pickaxes.init.ModRecipes;
import com.zyqunix.pickaxes.proxy.CommonProxy;
import com.zyqunix.pickaxes.util.Reference;

import com.zyqunix.pickaxes.world.ModWorldGen;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

    @Instance
    public static Main instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        ModRecipes.init();
    }

    @EventHandler
    public static void Postinit(FMLPostInitializationEvent event) {

    }
}
