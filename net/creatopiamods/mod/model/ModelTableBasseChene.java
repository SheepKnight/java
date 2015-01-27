
package net.creatopiamods.mod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTableBasseChene extends ModelBase
{
  //fields
    ModelRenderer plateau;
    ModelRenderer pied1;
    ModelRenderer pied4;
    ModelRenderer pied3;
    ModelRenderer pied2;
  
  public ModelTableBasseChene()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      plateau = new ModelRenderer(this, 0, 15);
      plateau.addBox(0F, 0F, 0F, 16, 1, 16);
      plateau.setRotationPoint(-8F, 16F, -8F);
      plateau.setTextureSize(64, 32);
      plateau.mirror = true;
      setRotation(plateau, 0F, 0F, 0F);
      pied1 = new ModelRenderer(this, 8, 0);
      pied1.addBox(0F, 0F, 0F, 2, 7, 2);
      pied1.setRotationPoint(6F, 17F, -8F);
      pied1.setTextureSize(64, 32);
      pied1.mirror = true;
      setRotation(pied1, 0F, 0F, 0F);
      pied4 = new ModelRenderer(this, 16, 0);
      pied4.addBox(0F, 0F, 0F, 2, 7, 2);
      pied4.setRotationPoint(-8F, 17F, -8F);
      pied4.setTextureSize(64, 32);
      pied4.mirror = true;
      setRotation(pied4, 0F, 0F, 0F);
      pied3 = new ModelRenderer(this, 24, 0);
      pied3.addBox(0F, 0F, 0F, 2, 7, 2);
      pied3.setRotationPoint(-8F, 17F, 6F);
      pied3.setTextureSize(64, 32);
      pied3.mirror = true;
      setRotation(pied3, 0F, 0F, 0F);
      pied2 = new ModelRenderer(this, 0, 0);
      pied2.addBox(0F, 0F, 0F, 2, 7, 2);
      pied2.setRotationPoint(6F, 17F, 6F);
      pied2.setTextureSize(64, 32);
      pied2.mirror = true;
      setRotation(pied2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    plateau.render(f5);
    pied1.render(f5);
    pied4.render(f5);
    pied3.render(f5);
    pied2.render(f5);
  }
  
  public void renderModel(float f) {
	  plateau.render(f);
	  pied1.render(f);
	  pied4.render(f);
	  pied3.render(f);
	  pied2.render(f);
	  
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
  }

}
