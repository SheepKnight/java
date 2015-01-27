package net.creatopiamods.mod.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.creatopiamods.mod.creatopiamods;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class Light extends Block{
	public Light(Material material) {
		super(material);
		
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(creatopiamods.creatopiamodsTab);
		this.setLightLevel(6);
		

		
	}
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(creatopiamods.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
