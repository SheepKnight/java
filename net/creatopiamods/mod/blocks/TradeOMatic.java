package net.creatopiamods.mod.blocks;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.creatopiamods.mod.creatopiamods;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class TradeOMatic extends BlockContainer{
	
	
	@SideOnly(Side.CLIENT)
	private IIcon iconFront;
	
	@SideOnly(Side.CLIENT)
	private IIcon iconTop;
	
	private static boolean keepInventory;
	protected TradeOMatic(Material p_i45386_1_) {
		super(p_i45386_1_);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean onBlockActivated(World world,int x,int y,int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
		if (!world.isRemote) {
			FMLNetworkHandler.openGui(player, creatopiamods.instance, creatopiamods.guiIDNeoFurnace, world, x, y, z);
		}	
		return true;
	}
}
