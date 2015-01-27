// Date: 07/10/2014 20:03:23
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.creatopiamods.mod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPlate extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape2;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
  
  public ModelPlate()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Shape1 = new ModelRenderer(this, 10, 38);
      Shape1.addBox(0F, 0F, 0F, 5, 1, 1);
      Shape1.setRotationPoint(0F, 23F, 5F);
      Shape1.setTextureSize(64, 64);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 5, 36);
      Shape3.addBox(0F, 0F, 0F, 3, 1, 1);
      Shape3.setRotationPoint(-2F, 23F, 6F);
      Shape3.setTextureSize(64, 64);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 5, 40);
      Shape4.addBox(0F, 0F, 0F, 3, 1, 1);
      Shape4.setRotationPoint(-2F, 23F, 4F);
      Shape4.setTextureSize(64, 64);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 62);
      Shape2.addBox(0F, 0F, 0F, 7, 1, 1);
      Shape2.setRotationPoint(-2F, 23F, -6F);
      Shape2.setTextureSize(64, 64);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 1, 60);
      Shape5.addBox(0F, 0F, 0F, 3, 1, 1);
      Shape5.setRotationPoint(-1F, 23F, -7F);
      Shape5.setTextureSize(64, 64);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 36, 5);
      Shape6.addBox(0F, 0F, 0F, 4, 1, 4);
      Shape6.setRotationPoint(-1F, 23F, -2F);
      Shape6.setTextureSize(64, 64);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 26, 6);
      Shape7.addBox(0F, 0F, 0F, 4, 1, 1);
      Shape7.setRotationPoint(-1F, 22F, -3F);
      Shape7.setTextureSize(64, 64);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 52, 6);
      Shape8.addBox(0F, 0F, 0F, 4, 1, 1);
      Shape8.setRotationPoint(-1F, 22F, 2F);
      Shape8.setTextureSize(64, 64);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 39, 0);
      Shape9.addBox(0F, 0F, 0F, 1, 1, 4);
      Shape9.setRotationPoint(-2F, 22F, -2F);
      Shape9.setTextureSize(64, 64);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 39, 10);
      Shape10.addBox(0F, 0F, 0F, 1, 1, 4);
      Shape10.setRotationPoint(3F, 22F, -2F);
      Shape10.setTextureSize(64, 64);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5,entity);
    Shape1.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape2.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
  }
  public void renderModel(float f) {
	  Shape1.render(f);
	  Shape2.render(f);
	  Shape3.render(f);
	  Shape4.render(f);
	  Shape4.render(f);
	  Shape5.render(f);
	  Shape6.render(f);
	  Shape7.render(f);
	  Shape8.render(f);
	  Shape9.render(f);
	  Shape10.render(f);
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