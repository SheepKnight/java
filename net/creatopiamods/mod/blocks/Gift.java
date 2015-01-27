package net.creatopiamods.mod.blocks;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.creatopiamods.mod.creatopiamods;
import net.creatopiamods.mod.tileEntity.TileEntityGift;
import net.creatopiamods.mod.tileEntity.TileEntityMug;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Gift extends BlockContainer{

	public Gift(Material material) {
		super(material);
		this.setHardness(0.0F);
		this.setResistance(0.0F);
		this.setCreativeTab(creatopiamods.creatopiamodsTab);
		this.setStepSound(soundTypeSnow);

		
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
		return new TileEntityGift();
		
		
	}
	public boolean onBlockActivated(World world,int x,int y,int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ){
		if (!world.isRemote) {
			FMLNetworkHandler.openGui(player, creatopiamods.instance, creatopiamods.guiIDNeoFurnace, world, x, y, z);
		}	
		return true;
	}
}

 

