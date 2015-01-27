package net.creatopiamods.mod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.creatopiamods.mod.creatopiamods;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemFood;

public class FoodBeer extends ItemFood{

	public FoodBeer(int heal, float saturation, boolean wolfmeat) {
		super(heal, saturation, wolfmeat);

		
		this.setPotionEffect(9, 35, 1, 1F);
		this.setCreativeTab(creatopiamods.creatopiamodsTab);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(creatopiamods.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}
