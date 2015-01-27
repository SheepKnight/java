package net.creatopiamods.mod.blocks;

import net.creatopiamods.mod.creatopiamods;
import net.creatopiamods.mod.tileEntity.TileEntityMug;
import net.creatopiamods.mod.tileEntity.TileEntityPlate;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class Plate extends BlockContainer{
	public Plate(Material material) {
		super(material);
		this.setHardness(0.0F);
		this.setResistance(0.0F);
		this.setCreativeTab(creatopiamods.creatopiamodsTab);
		this.setStepSound(soundTypeStone);
		this.setBlockBounds(0, 0, 0, 1, 0.1F, 1);
		
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
	
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityPlate();
		
		
	}
	public void onBlockAdded(World world,int x,int y,int z){
		super.onBlockAdded(world, x, y, z);
		this.setDefaultDirection(world,x ,y ,z );
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
		
	}
    public boolean func_149851_a(World p_149851_1_, int p_149851_2_, int p_149851_3_, int p_149851_4_, boolean p_149851_5_)
    {
        return true;
    }
}
