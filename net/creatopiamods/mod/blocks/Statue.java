package net.creatopiamods.mod.blocks;

import net.creatopiamods.mod.tileEntity.TileEntityChristmasTreeUp;
import net.creatopiamods.mod.tileEntity.TileEntityStatue;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Statue extends BlockContainer{

	public static String Name;
	
	public Statue(Material p_i45386_1_) {
		super(p_i45386_1_);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityStatue();
		
		
	}
	
	public void onBlockPlacedBy(World world,int x, int y, int z, EntityLivingBase entityplayer, ItemStack itemstack) {

		if(itemstack.hasDisplayName()) {

		Name = itemstack.getUnlocalizedName();
		
		 
			
		
	}else {
		Name = "SK";
	}

	}

	public int getRenderType() {
		return -1;
		
		
	}

	public boolean isOpaqueCube() {
		
		return false;
		
		
	}
	
	public boolean renderAsNormalBlock() {
		
		return false;
	}
	
}
