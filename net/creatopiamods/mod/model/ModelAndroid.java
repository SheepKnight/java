
package net.creatopiamods.mod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelAndroid extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Rleg;
    ModelRenderer LLeg;
    ModelRenderer Rotor;
    ModelRenderer LArm;
    ModelRenderer RArm;
  
  public ModelAndroid()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, 0F, 0F, 7, 7, 7);
      Body.setRotationPoint(-4F, 14F, -3F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Rleg = new ModelRenderer(this, 56, 0);
      Rleg.addBox(0F, 0F, 0F, 2, 3, 2);
      Rleg.setRotationPoint(-4F, 21F, 0F);
      Rleg.setTextureSize(64, 32);
      Rleg.mirror = true;
      setRotation(Rleg, 0F, 0F, 0F);
      LLeg = new ModelRenderer(this, 56, 5);
      LLeg.addBox(0F, 0F, 0F, 2, 3, 2);
      LLeg.setRotationPoint(1F, 21F, 0F);
      LLeg.setTextureSize(64, 32);
      LLeg.mirror = true;
      setRotation(LLeg, 0F, 0F, 0F);
      Rotor = new ModelRenderer(this, 34, 0);
      Rotor.addBox(0F, 0F, 0F, 5, 5, 0);
      Rotor.setRotationPoint(-3F, 9F, 2F);
      Rotor.setTextureSize(64, 32);
      Rotor.mirror = true;
      setRotation(Rotor, 0F, 0F, 0F);
      LArm = new ModelRenderer(this, 52, 4);
      LArm.addBox(0F, 0F, 0F, 1, 3, 1);
      LArm.setRotationPoint(3F, 17F, 0F);
      LArm.setTextureSize(64, 32);
      LArm.mirror = true;
      setRotation(LArm, 0F, 0F, -0.2617994F);
      RArm = new ModelRenderer(this, 52, 0);
      RArm.addBox(0F, 0F, 0F, 1, 3, 1);
      RArm.setRotationPoint(-5F, 17F, 0F);
      RArm.setTextureSize(64, 32);
      RArm.mirror = true;
      setRotation(RArm, 0F, 0F, 0.2617994F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Body.render(f5);
    Rleg.render(f5);
    LLeg.render(f5);
    Rotor.render(f5);
    LArm.render(f5);
    RArm.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    
    this.RArm.rotateAngleX = MathHelper.cos(f3 * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
    this.LArm.rotateAngleX = MathHelper.cos(f4 * 0.6662F) * 2.0F * f1 * 0.5F;
    this.RArm.rotateAngleZ = 0.0F;
    this.LArm.rotateAngleZ = 0.0F;
    this.Rleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    this.LLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
    this.Rleg.rotateAngleY = 0.0F;
    this.LLeg.rotateAngleY = 0.0F;
    this.Rotor.rotateAngleY =0.5F;
    
  }

}
