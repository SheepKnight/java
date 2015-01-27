package net.creatopiamods.mod.blocks;

import net.creatopiamods.mod.creatopiamods;
import net.creatopiamods.mod.tileEntity.TileEntityNeoFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class NeoFurnace extends BlockContainer{
	 
	private final boolean isActive;
	
	
	
	@SideOnly(Side.CLIENT)
	private IIcon iconFront;
	
	@SideOnly(Side.CLIENT)
	private IIcon iconTop;
	
	private static boolean keepInventory;
	
	public NeoFurnace(boolean isActive) {
		super(Material.iron);
		
		this.isActive = isActive;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		
		this.blockIcon = iconRegister.registerIcon(creatopiamods.modid +":"+"NeoFurnaceSide");
		this.iconFront = iconRegister.registerIcon(creatopiamods.modid +":"+(this.isActive ? "NeoFurnaceFrontActive" : "NeoFurnaceFrontIdle"));
		this.iconTop = iconRegister.registerIcon(creatopiamods.modid+":"+"NeoFurnaceTop");
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
		//return metadata == 0 && side == 3 ? this.iconFront : (side == metadata ? this.iconFront : this.blockIcon);
		return side == 1 ? this.iconTop : (side == 0 ? this.iconTop : ( side !=metadata ? this.blockIcon : this.iconFront));
	}
	
	public Item getItemDropped(World world, int x, int y, int z){
		return Item.getItemFromBlock(creatopiamods.blockNeoFurnaceIdle);
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

	public boolean onBlockActivated(World world,int x,int y,int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
		if (!world.isRemote) {
			FMLNetworkHandler.openGui(player, creatopiamods.instance, creatopiamods.guiIDNeoFurnace, world, x, y, z);
		}	
		return true;
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int i) {
		return new TileEntityNeoFurnace();
	}
	//TODO randomDisplayTick
	
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

	public static void updateNeoFurnaceBlockState(boolean active, World worldObj,int xCoord, int yCoord, int zCoord) {
		int i =worldObj.getBlockMetadata(xCoord, yCoord, zCoord);
		
		TileEntity tileentity = worldObj.getTileEntity(xCoord, yCoord, zCoord);
		keepInventory = true;
		if(active) {
			worldObj.setBlock(xCoord, yCoord, zCoord, creatopiamods.blockNeoFurnaceActive);
		
		}else{	
			worldObj.setBlock(xCoord, yCoord, zCoord, creatopiamods.blockNeoFurnaceIdle);
		}
		
		
		keepInventory = false;
		
		worldObj.setBlockMetadataWithNotify(xCoord, zCoord, zCoord, i, 2);
		
		if(tileentity != null) {
			tileentity.validate();
			worldObj.setTileEntity(xCoord, yCoord, zCoord, tileentity);
		}
	}
}