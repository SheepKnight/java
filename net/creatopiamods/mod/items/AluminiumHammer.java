package net.creatopiamods.mod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.creatopiamods.mod.creatopiamods;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class AluminiumHammer extends Item{

	public AluminiumHammer() {
		super();
		this.maxStackSize = 1;
		this.setMaxDamage(64);
		this.setNoRepair();
		this.setCreativeTab(creatopiamods.creatopiamodsTab);
		
		
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(creatopiamods.modid+":"+this.getUnlocalizedName().substring(5));
	}
}
