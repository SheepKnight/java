package net.creatopiamods.mod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.creatopiamods.mod.creatopiamods;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemHoe;

public class CopperHoe extends ItemHoe{

	public CopperHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		this.setCreativeTab(creatopiamods.creatopiamodsTab);
	}
		@SideOnly(Side.CLIENT)
		public void registerIcons(IIconRegister iconRegister) {
			this.itemIcon = iconRegister.registerIcon(creatopiamods.modid+":"+this.getUnlocalizedName().substring(5));
	}


}
