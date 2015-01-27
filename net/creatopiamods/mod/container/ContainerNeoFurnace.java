package net.creatopiamods.mod.container;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.creatopiamods.mod.tileEntity.TileEntityNeoFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnace;

public class ContainerNeoFurnace extends Container{

	private TileEntityNeoFurnace neoFurnace;
	
		public int lastburnTime;
		public int lastcurrentItemBurnTime;
		public int lastcookTime;
	
	public ContainerNeoFurnace(InventoryPlayer inventory, TileEntityNeoFurnace tileentity) {
		this.neoFurnace = tileentity;
		this.addSlotToContainer(new Slot(tileentity, 0 ,56 ,17));
		this.addSlotToContainer(new Slot(tileentity, 1 ,56 ,53));
		this.addSlotToContainer(new SlotFurnace(inventory.player, tileentity,2 ,116 , 35));
		
		for(int i = 0;i < 3; i++) {
			for(int j = 0; j< 9; j++) {
				this.addSlotToContainer(new Slot (inventory, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
			}
		}
		
		for(int i = 0; i< 9; i++) {
			this.addSlotToContainer(new Slot(inventory, i, 8 + i * 18, 142));
		}
	}
	
	public void addCraftingToCrafters(ICrafting icrafting) {
		super.addCraftingToCrafters(icrafting);
		icrafting.sendProgressBarUpdate(this, 0, this.neoFurnace.cookTime);
		icrafting.sendProgressBarUpdate(this, 1, this.neoFurnace.burnTime);
		icrafting.sendProgressBarUpdate(this, 2, this.neoFurnace.currentItemBurnTime);
	}
	
	public void detectAndSendChanges(){
		super.detectAndSendChanges();
		for(int i =0; i < this.crafters.size(); i++) {
			ICrafting icrafting = (ICrafting) this.crafters.get(i);
			
			if(this.lastcookTime != this.neoFurnace.cookTime) {
				icrafting.sendProgressBarUpdate(this, 0, this.neoFurnace.cookTime);
			}if(this.lastburnTime != this.neoFurnace.burnTime) {
				icrafting.sendProgressBarUpdate(this, 1, this.neoFurnace.burnTime);
			}if(this.lastcurrentItemBurnTime != this.neoFurnace.currentItemBurnTime) {
				icrafting.sendProgressBarUpdate(this, 2, this.neoFurnace.currentItemBurnTime);
			}
		}
		this.lastcookTime = this.neoFurnace.cookTime;
		this.lastburnTime = this.neoFurnace.burnTime;
		this.lastcurrentItemBurnTime = this.neoFurnace.currentItemBurnTime;
	}
	
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int slot, int newValue) {
		
	}


	public boolean canInteractWith(EntityPlayer var1) {
		return true;
	}

}
