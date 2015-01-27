package net.creatopiamods.mod.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.creatopiamods.mod.creatopiamods;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class TransparentBlock extends BlockBreakable{
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(creatopiamods.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
	
	
	public TransparentBlock(String p_i45411_1_, Material p_i45411_2_, boolean p_i45411_3_) {
		super(p_i45411_1_, p_i45411_2_, p_i45411_3_);
		// TODO Auto-generated constructor stub
	}
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }
    public boolean renderAsNormalBlock()
    {
        return false;
    }


}
