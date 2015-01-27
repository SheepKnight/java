package net.creatopiamods.mod.blocks;

import net.creatopiamods.mod.creatopiamods;
import net.creatopiamods.mod.tileEntity.TileEntityChristmasTreeDown;
import net.creatopiamods.mod.tileEntity.TileEntityChristmasTreeUp;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ChristmasTreeUp extends BlockContainer{
	public ChristmasTreeUp(Material material) {
		super(material);
		this.setHardness(0.0F);
		this.setResistance(0.0F);

		this.setStepSound(soundTypeWood);
		
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
		return new TileEntityChristmasTreeUp();
		
		
	}
}
