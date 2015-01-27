package net.creatopiamods.mod.blocks;

import java.util.Random;

import net.creatopiamods.mod.tileEntity.TileEntityNeoFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class DecorativePortal extends BlockPortal{
	
	
	 public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
	    {
		 
	    }
	    public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_)
	    {
	    	
	    }
	    public int quantityDropped(Random p_149745_1_)
	    {
	        return 1;
	    }
	    
	    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
	    {
	    	
	    }
		private void setDefaultDirection(World world, int x, int y, int z) {
			if(!world.isRemote) {
				Block b1 = world.getBlock(x, y, z - 1);
				Block b2 = world.getBlock(x, y, z - +1);
				Block b3 = world.getBlock(x -1, y, z);
				Block b4 = world.getBlock(x +1, y, z);
				
				byte b0 = 3;
				
				if(b1.func_149730_j() && !b2.func_149730_j()) {
					b0 = 3;
				}
				if(b2.func_149730_j() && !b1.func_149730_j()) {
					b0 = 2;
				}
				if(b3.func_149730_j() && !b4.func_149730_j()) {
					b0 = 5;
				}
				if(b4.func_149730_j() && !b3.func_149730_j()) {
					b0 = 4;
				}
				
				world.setBlockMetadataWithNotify(x, y, z, b0, 2);
			}
		}
		public void onBlockPlacedBy(World world,int x, int y, int z, EntityLivingBase entityplayer, ItemStack itemstack) {
			int l = MathHelper.floor_double((double)(entityplayer.rotationYaw * 4.0F / 360F) + 0.5D) & 3;
			
			if(l == 0) {
				world.setBlockMetadataWithNotify(x, y, z, 2, 2);
				
			}
			if(l == 1) {
				world.setBlockMetadataWithNotify(x, y, z, 5, 2);
				
			}
			if(l == 2) {
				world.setBlockMetadataWithNotify(x, y, z, 3, 2);
				
			}
			if(l == 3) {
				world.setBlockMetadataWithNotify(x, y, z, 4, 2);
				
			}
			
			if(itemstack.hasDisplayName()) {
				((TileEntityNeoFurnace)world.getTileEntity(x,y,z)).setGuiDisplayName(itemstack.getDisplayName());
			}
		}
}
