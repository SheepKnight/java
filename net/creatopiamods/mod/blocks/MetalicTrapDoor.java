package net.creatopiamods.mod.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.creatopiamods.mod.creatopiamods;
import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class MetalicTrapDoor extends BlockTrapDoor{
	public MetalicTrapDoor(Material material) {
		super(material);
		this.setStepSound(soundTypeMetal);
		this.setCreativeTab(creatopiamods.creatopiamodsTab);
		this.setHardness(6.5F);
		
		
		
	}
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(creatopiamods.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
}
