// Date: 30/11/2014 19:29:03
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.creatopiamods.mod.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ExoChestplate extends ModelBiped
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape5;
    ModelRenderer Shape4;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape20;
  
  public ExoChestplate()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1.mirror = true;
      Shape1 = new ModelRenderer(this, 58, 0);
      Shape1.addBox(0F, 0F, 0F, 2, 14, 1);
      Shape1.setRotationPoint(5F, -1F, 2F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape1.mirror = false;
  	  this.bipedLeftArm.addChild(Shape1);
      Shape2 = new ModelRenderer(this, 58, 0);
      Shape2.addBox(0F, 0F, 0F, 2, 14, 1);
      Shape2.setRotationPoint(-7F, -1F, 2F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
  	  this.bipedRightArm.addChild(Shape2);
      Shape3.mirror = true;
      Shape3 = new ModelRenderer(this, 0, 27);
      Shape3.addBox(0F, 0F, 0F, 4, 1, 4);
      Shape3.setRotationPoint(4F, -1F, -2F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape3.mirror = false;
  	  this.bipedLeftArm.addChild(Shape3);
      Shape5.mirror = true;
      Shape5 = new ModelRenderer(this, 0, 24);
      Shape5.addBox(0F, 0F, 0F, 2, 2, 1);
      Shape5.setRotationPoint(3F, 0F, 2F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape5.mirror = false;
  	  this.bipedBody.addChild(Shape5);
      Shape4 = new ModelRenderer(this, 0, 27);
      Shape4.addBox(0F, 0F, 0F, 4, 1, 4);
      Shape4.setRotationPoint(-8F, -1F, -2F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
  	  this.bipedRightArm.addChild(Shape4);
      Shape6 = new ModelRenderer(this, 0, 24);
      Shape6.addBox(0F, 0F, 0F, 2, 2, 1);
      Shape6.setRotationPoint(-5F, 0F, 2F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
  	  this.bipedBody.addChild(Shape6);
      Shape7 = new ModelRenderer(this, 42, 4);
      Shape7.addBox(0F, 0F, 0F, 6, 9, 2);
      Shape7.setRotationPoint(-3F, 0F, 2F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
  	  this.bipedBody.addChild(Shape7);
      Shape8 = new ModelRenderer(this, 26, 10);
      Shape8.addBox(0F, 0F, 0F, 6, 4, 2);
      Shape8.setRotationPoint(-3F, 0F, 4F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
  	  this.bipedBody.addChild(Shape8);
      Shape9.mirror = true;
      Shape9 = new ModelRenderer(this, 10, 20);
      Shape9.addBox(0F, 0F, 0F, 1, 4, 2);
      Shape9.setRotationPoint(2F, 4F, 4F);
      Shape9.setTextureSize(64, 32);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape9.mirror = false;
  	  this.bipedBody.addChild(Shape9);
      Shape10 = new ModelRenderer(this, 10, 20);
      Shape10.addBox(0F, 0F, 0F, 1, 4, 2);
      Shape10.setRotationPoint(-3F, 4F, 4F);
      Shape10.setTextureSize(64, 32);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
  	  this.bipedBody.addChild(Shape10);
      Shape11 = new ModelRenderer(this, 26, 7);
      Shape11.addBox(0F, 0F, 0F, 6, 1, 2);
      Shape11.setRotationPoint(-3F, 8F, 4F);
      Shape11.setTextureSize(64, 32);
      Shape11.mirror = true;
      setRotation(Shape11, 0F, 0F, 0F);
  	  this.bipedBody.addChild(Shape11);
      Shape12.mirror = true;
      Shape12 = new ModelRenderer(this, 0, 21);
      Shape12.addBox(0F, 0F, 0F, 1, 1, 2);
      Shape12.setRotationPoint(1F, 4F, 4F);
      Shape12.setTextureSize(64, 32);
      Shape12.mirror = true;
      setRotation(Shape12, 0F, 0F, 0F);
      Shape12.mirror = false;
  	  this.bipedBody.addChild(Shape12);
      Shape13 = new ModelRenderer(this, 0, 21);
      Shape13.addBox(0F, 0F, 0F, 1, 1, 2);
      Shape13.setRotationPoint(-2F, 4F, 4F);
      Shape13.setTextureSize(64, 32);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0F, 0F);
  	  this.bipedBody.addChild(Shape13);
      Shape14 = new ModelRenderer(this, 6, 25);
      Shape14.addBox(0F, 0F, 0F, 2, 2, 0);
      Shape14.setRotationPoint(-1F, 6F, 5F);
      Shape14.setTextureSize(64, 32);
      Shape14.mirror = true;
      setRotation(Shape14, 0F, 0F, 0F);
  	  this.bipedBody.addChild(Shape14);
      Shape15 = new ModelRenderer(this, 18, 10);
      Shape15.addBox(0F, 0F, 0F, 0, 2, 4);
      Shape15.setRotationPoint(4F, 3F, -2F);
      Shape15.setTextureSize(64, 32);
      Shape15.mirror = true;
      setRotation(Shape15, 0F, 0F, 0F);
  	  this.bipedBody.addChild(Shape15);
      Shape16 = new ModelRenderer(this, 18, 10);
      Shape16.addBox(0F, 0F, 0F, 0, 2, 4);
      Shape16.setRotationPoint(-4F, 3F, -2F);
      Shape16.setTextureSize(64, 32);
      Shape16.mirror = true;
      setRotation(Shape16, 0F, 0F, 0F);
  	  this.bipedBody.addChild(Shape16);
      Shape17 = new ModelRenderer(this, 0, 18);
      Shape17.addBox(0F, 0F, 0F, 1, 2, 1);
      Shape17.setRotationPoint(-4F, 3F, 2F);
      Shape17.setTextureSize(64, 32);
      Shape17.mirror = true;
      setRotation(Shape17, 0F, 0F, 0F);
  	  this.bipedBody.addChild(Shape17);
      Shape18 = new ModelRenderer(this, 0, 18);
      Shape18.addBox(0F, 0F, 0F, 1, 2, 1);
      Shape18.setRotationPoint(3F, 3F, 2F);
      Shape18.setTextureSize(64, 32);
      Shape18.mirror = true;
      setRotation(Shape18, 0F, 0F, 0F);
  	  this.bipedBody.addChild(Shape18);
      Shape19 = new ModelRenderer(this, 0, 0);
      Shape19.addBox(0F, 0F, 0F, 8, 12, 1);
      Shape19.setRotationPoint(-4F, 0F, -3F);
      Shape19.setTextureSize(64, 32);
      Shape19.mirror = true;
      setRotation(Shape19, 0F, 0F, 0F);
  	  this.bipedBody.addChild(Shape19);
      Shape20 = new ModelRenderer(this, 52, 0);
      Shape20.addBox(0F, 0F, 0F, 2, 2, 1);
      Shape20.setRotationPoint(-1F, 5F, -4F);
      Shape20.setTextureSize(64, 32);
      Shape20.mirror = true;
      setRotation(Shape20, 0F, 0F, 0F);
  	  this.bipedBody.addChild(Shape20);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape5.render(f5);
    Shape4.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    Shape12.render(f5);
    Shape13.render(f5);
    Shape14.render(f5);
    Shape15.render(f5);
    Shape16.render(f5);
    Shape17.render(f5);
    Shape18.render(f5);
    Shape19.render(f5);
    Shape20.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }

}
