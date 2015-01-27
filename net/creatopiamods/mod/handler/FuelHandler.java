package net.creatopiamods.mod.handler;

import net.creatopiamods.mod.creatopiamods;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		
		if(fuel.getItem() == creatopiamods.itemHolyCoal) return 2400;
		if(fuel.getItem() == creatopiamods.itemNeoCoal) return 2400;
			
		return 0;
	}

}
