package net.creatopiamods.mod.gui;

import org.lwjgl.opengl.GL11;

import net.creatopiamods.mod.creatopiamods;
import net.creatopiamods.mod.container.ContainerNeoFurnace;
import net.creatopiamods.mod.container.ContainerYou;
import net.creatopiamods.mod.tileEntity.TileEntityNeoFurnace;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiPeople extends GuiContainer{
	public static final ResourceLocation bground = new ResourceLocation(creatopiamods.modid + ":" + "textures/gui/GuiPeople.png");

	public GuiPeople(Container par1Container) {
		super(new ContainerYou());
		
		String name = "You";
		this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
		this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 118, this.ySize - 96 + 2, 4210752);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float var1, int var2,int var3) {
		GL11.glColor4f(1F, 1F, 1F, 1F);
		
		Minecraft.getMinecraft().getTextureManager().bindTexture(bground);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0,xSize, ySize);
		
	}
}
