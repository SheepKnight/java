package net.creatopiamods.mod.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.creatopiamods.mod.creatopiamods;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;

public class DiscoBlock extends Block{

	public int ColorGeneral;
	
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(creatopiamods.modid + ":DiscoBlock" + ColorGeneral +".pnj");
	}
	
	
	protected DiscoBlock(Material p_i45394_1, int Color) {
		super(p_i45394_1);
		// TODO Auto-generated constructor stub
		ColorGeneral = Color;

	}

}
