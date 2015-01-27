package net.creatopiamods.mod.renderer;

import net.creatopiamods.mod.creatopiamods;
import net.creatopiamods.mod.entity.EntityAndroid;
import net.creatopiamods.mod.model.ModelAndroid;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderAndroid extends RenderLiving {

	private static final ResourceLocation texture = new ResourceLocation(creatopiamods.modid +":"+"textures/model/android.png");
	
	protected ModelAndroid modelEntity;
	
	public RenderAndroid(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		
		modelEntity = ((ModelAndroid)mainModel);
	}
	
	
	public void renderAndroid(EntityAndroid entity, final double x, final double y, final double z, final float u,final float v){
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving entityLiving, double x, double y, double z, float u, float v){
		renderAndroid((EntityAndroid)entityLiving, x,y,z,u,v);
	}
	
	public void doRender(Entity entity, double x, double y, double z, float u, float v){
		renderAndroid((EntityAndroid)entity,x,y,z,u,v);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return texture;
	}


}
