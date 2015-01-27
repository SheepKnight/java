package net.creatopiamods.mod.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.creatopiamods.mod.creatopiamods;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class MetalFence extends BlockFence{

	
	public MetalFence(String p_i45406_1_, Material p_i45406_2_) {
		super(p_i45406_1_, p_i45406_2_);
		// TODO Auto-generated constructor stub
		this.setCreativeTab(creatopiamods.creatopiamodsTab);
		this.setHarvestLevel("Pickaxe", 3);
		this.setStepSound(soundTypeMetal);
		this.setHardness(7.0F);
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(creatopiamods.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}
