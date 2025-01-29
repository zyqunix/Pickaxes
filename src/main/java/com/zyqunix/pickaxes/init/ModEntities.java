package com.zyqunix.pickaxes.init;

import com.zyqunix.pickaxes.Main;
import com.zyqunix.pickaxes.entity.EntityScreecher;
import com.zyqunix.pickaxes.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntities {
    public static void registerEntities() {
        registerEntity("screecher", EntityScreecher.class, Reference.ENTITY_SCREECHER, 25, 9401672, 11702616);
    }

    public static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
        EntityRegistry.registerModEntity(
                new ResourceLocation(Reference.MOD_ID + ":" + name),
                entity,
                name,
                id,
                Main.instance,
                range,
                1,
                true,
                color1,
                color2
        );
    }
}