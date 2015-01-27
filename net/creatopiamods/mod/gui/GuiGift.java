package net.creatopiamods.mod.gui;

import org.lwjgl.opengl.GL11;

import net.creatopiamods.mod.creatopiamods;
import net.creatopiamods.mod.container.ContainerNeoFurnace;
import net.creatopiamods.mod.tileEntity.TileEntityNeoFurnace;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiGift  extends GuiContainer{
	public static final ResourceLocation bground = new ResourceLocation(creatopiamods.modid + ":" + "textures/gui/GuiGift.png");
	public TileEntityNeoFurnace neoFurnace;
	
	
	public GuiGift(InventoryPlayer inventoryPlayer, TileEntityNeoFurnace entity) {
		super(new ContainerNeoFurnace(inventoryPlayer, entity));
		
		this.neoFurnace = entity;
		
		this.xSize = 176;
		this.ySize = 166;
	}
	
	
	public void drawGuiContainerForegroundLayer(int par1, int par2) {
		
		String name = "Neo Furnace";
		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 118, this.ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2, int var3) {
		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(bground);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0,xSize, ySize);
		
		if(this.neoFurnace.isBurning()) {
			int k = this.neoFurnace.getBurnTimeRemainingScaled(14);
			int j = 14 - k;
			drawTexturedModalRect(guiLeft + 57, guiTop + 37, 176, 0 , 14, 14 - j);
		}
		
		int k = this.neoFurnace.getCookprogressScaled(24);
		drawTexturedModalRect(guiLeft + 79, guiTop + 34, 176, 10, k + 1 , 16);
	}

}
