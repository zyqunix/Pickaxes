package com.zyqunix.pickaxes.entity.render;

import com.zyqunix.pickaxes.entity.EntityScreecher;
import com.zyqunix.pickaxes.entity.model.ModelScreecher;
import com.zyqunix.pickaxes.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScreecher extends RenderLiving<EntityScreecher> {
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/screecher.png");

    public RenderScreecher(RenderManager manager) {
        super(manager, new ModelScreecher(), 0.5f);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityScreecher entity) {
        return TEXTURES;
    }

    @Override
    protected void applyRotations(EntityScreecher p_77043_1_, float p_77043_2_, float p_77043_3_, float p_77043_4_) {
        super.applyRotations(p_77043_1_, p_77043_2_, p_77043_3_, p_77043_4_);
    }
}
