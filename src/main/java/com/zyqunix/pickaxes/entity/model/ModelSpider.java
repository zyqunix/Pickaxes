package com.zyqunix.pickaxes.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelSpider - Either Mojang or a mod author
 * Created using Tabula 7.1.0
 */
public class ModelSpider extends ModelBase {
    public ModelRenderer FrontRightLeg;
    public ModelRenderer Head;
    public ModelRenderer Back;
    public ModelRenderer BackLeftLeg;
    public ModelRenderer FrontLeftLeg;
    public ModelRenderer BackRightLeg;

    public ModelSpider() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.FrontRightLeg = new ModelRenderer(this, 18, 0);
        this.FrontRightLeg.setRotationPoint(-4.0F, 18.0F, -1.4F);
        this.FrontRightLeg.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(FrontRightLeg, 0.0F, -0.9773843811168246F, -0.5811946409141118F);
        this.Head = new ModelRenderer(this, 32, 4);
        this.Head.setRotationPoint(0.0F, 18.0F, -3.0F);
        this.Head.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 8, 0.0F);
        this.BackLeftLeg = new ModelRenderer(this, 18, 0);
        this.BackLeftLeg.setRotationPoint(4.0F, 18.0F, 3.3F);
        this.BackLeftLeg.addBox(-1.0F, -1.0F, 0.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(BackLeftLeg, 0.0F, -0.8115781021773633F, 0.5811946409141118F);
        this.BackRightLeg = new ModelRenderer(this, 18, 0);
        this.BackRightLeg.setRotationPoint(-4.0F, 18.0F, 3.3F);
        this.BackRightLeg.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(BackRightLeg, 0.0F, 0.8028514559173915F, -0.5811946409141118F);
        this.FrontLeftLeg = new ModelRenderer(this, 18, 0);
        this.FrontLeftLeg.setRotationPoint(4.0F, 18.0F, -1.4F);
        this.FrontLeftLeg.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(FrontLeftLeg, 0.0F, 0.9773843811168246F, 0.5811946409141118F);
        this.Back = new ModelRenderer(this, 0, 12);
        this.Back.setRotationPoint(0.0F, 18.0F, 3.9F);
        this.Back.addBox(-5.0F, -4.0F, -7.0F, 10, 8, 13, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.FrontRightLeg.render(f5);
        this.Head.render(f5);
        this.BackLeftLeg.render(f5);
        this.BackRightLeg.render(f5);
        this.FrontLeftLeg.render(f5);
        this.Back.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
