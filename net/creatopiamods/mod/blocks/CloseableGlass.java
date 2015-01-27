package net.creatopiamods.mod.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.creatopiamods.mod.creatopiamods;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class CloseableGlass extends Block{

	private final boolean isOn;
	
	public CloseableGlass(boolean isOn) {
		super(Material.glass);
		this.setStepSound(soundTypeGlass);

		if(this.isOn == false){
			this.setCreativeTab(creatopiamods.creatopiamodsTab);
		}
		
		
		
		
		this.isOn = isOn;
		
		if(isOn){
			this.isOpaqueCube();
		}
	}
	
	public void onBlockAdded(World world, int x, int y, int z){
		if(!world.isRemote){
			if(this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)){
				world.scheduleBlockUpdate(x, y, z, this, 4);
			}
			else if(!this.isOn && world.isBlockIndirectlyGettingPowered(x, y, z)){
				world.setBlock(x, y, z, creatopiamods.blockCloseableGlassOpened, 0, 2);
			}
		}
	}
	
	public void onNeighborBlockChange(World world, int x,int y,int z){
		if(!world.isRemote){
			if(this.isOn && !world.isBlockIndirectlyGettingPowered(x, y, z)){
				world.scheduleBlockUpdate(x, y, z, this, 4);
			}
			else if(!this.isOn && world.isBlockIndirectlyGettingPowered(x, y, z)){
				world.setBlock(x, y, z, creatopiamods.blockCloseableGlassOpened, 0, 2);
			}
		}
	}
	
	public void updateTick(World world, int x, int y, int z, Random random){
		
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		
		if(isOn){
			this.blockIcon = iconRegister.registerIcon(creatopiamods.modid + ":" + "ClosedGlassOpen");	
		}else{
			this.blockIcon = iconRegister.registerIcon(creatopiamods.modid + ":" + "ClosedGlassClosed");	
		}
		
	}
	
	
}