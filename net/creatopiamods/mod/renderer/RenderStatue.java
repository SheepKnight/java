package net.creatopiamods.mod.renderer;

import net.creatopiamods.mod.creatopiamods;
import net.creatopiamods.mod.blocks.Statue;
import net.creatopiamods.mod.model.ModelNeoAltar;
import net.creatopiamods.mod.model.ModelStatue;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;

import org.lwjgl.opengl.GL11;

public class RenderStatue extends TileEntitySpecialRenderer{

	public static String Name;
	
	private static final ResourceLocation texture = new ResourceLocation(creatopiamods.modid + ":textures/model/statue/" + Statue.Name);	
	
	private ModelStatue model;
	

	public RenderStatue() {
		this.model = new ModelStatue();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {
		GL11.glPushMatrix();
			GL11.glTranslatef((float)x + 0.5F,(float) y + 1.5F, (float) z + 0.5F);
			GL11.glRotatef(180, 0F, 0F, 1F);
			
			this.bindTexture(texture);
			
			GL11.glPushMatrix();
				this.model.renderModel(0.0625F);
			
			GL11.glPopMatrix();	
				
		GL11.glPopMatrix();
	}
}