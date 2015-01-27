package net.creatopiamods.mod.renderer;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.creatopiamods.mod.creatopiamods;
import net.creatopiamods.mod.entity.EntityAndroid;
import net.creatopiamods.mod.entity.EntityPNJ;
import net.creatopiamods.mod.model.ModelAndroid;
import net.creatopiamods.mod.model.ModelHuman;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderHuman  extends RenderLiving {

	public ResourceLocation texture;
	
	protected ModelHuman modelEntity;
	
	public RenderHuman(ModelBase par1ModelBase, float par2, String TextureName) {
		super(par1ModelBase, par2);
		if(this.texture!=null){
			 texture = new ResourceLocation(creatopiamods.modid +":"+"textures/model/NPC/"+TextureName+".png");
		}
		else {
			 texture = new ResourceLocation(creatopiamods.modid +":"+"textures/model/NPC/Villager1.png");	
		}
		modelEntity = ((ModelHuman)mainModel);
	}
	
	public void renderHuman(EntityPNJ entity, final double x, final double y, final double z, final float u,final float v){
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityPNJ entityLiving, double x, double y, double z, float u, float v){
		renderHuman((EntityPNJ)entityLiving, x,y,z,u,v);
	}
	
	public void doRender(Entity entity, double x, double y, double z, float u, float v){
		renderHuman((EntityPNJ)entity,x,y,z,u,v);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return texture;
	}
    @SideOnly(Side.CLIENT)
    public boolean getAlwaysRenderNameTagForRender()
    {
        return this.getAlwaysRenderNameTagForRender();
    }
}
