package com.Applhau.BorutoMod.render.models.armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class CustomHelmet extends ModelBiped
{
	public ModelRenderer shape15;

    public CustomHelmet()
    {
        this.textureWidth = 128;
        this.textureHeight = 128;
        
        this.shape15 = new ModelRenderer(this, 82, 0);
        this.shape15.setRotationPoint(-4.0F, -8.0F, -4.0F);
        this.shape15.addBox(-1.0F, -5.0F, -1.0F, 10, 5, 12, 0.0F);
        
        this.bipedHead.addChild(shape15);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
    	this.shape15.render(f5);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) 
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
