package net.creatopiamods.mod.handler;

import net.creatopiamods.mod.creatopiamods;
import net.creatopiamods.mod.container.ContainerNeoFurnace;
import net.creatopiamods.mod.gui.GuiNeoFurnace;
import net.creatopiamods.mod.tileEntity.TileEntityNeoFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		if(entity != null)
			switch(ID) {
			case creatopiamods.guiIDNeoFurnace:
				if (entity instanceof TileEntityNeoFurnace) {
					return new ContainerNeoFurnace(player.inventory, (TileEntityNeoFurnace) entity);
				}
				return null;
			}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		if(entity != null)
			switch(ID) {
			case creatopiamods.guiIDNeoFurnace:
				if (entity instanceof TileEntityNeoFurnace) {
					return new GuiNeoFurnace(player.inventory, (TileEntityNeoFurnace) entity);
				}
				return null;
			}
		return null;
	}

}
