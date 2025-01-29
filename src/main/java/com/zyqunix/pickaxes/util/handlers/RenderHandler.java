package com.zyqunix.pickaxes.util.handlers;

import com.zyqunix.pickaxes.entity.EntityScreecher;
import com.zyqunix.pickaxes.entity.render.RenderScreecher;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
    public static void registerEntityRenders() {
        RenderingRegistry.registerEntityRenderingHandler(EntityScreecher.class, new IRenderFactory<EntityScreecher>() {
            @Override
            public Render<? super EntityScreecher> createRenderFor(RenderManager renderManager) {
                return new RenderScreecher(renderManager);
            }
        });
    }
}
