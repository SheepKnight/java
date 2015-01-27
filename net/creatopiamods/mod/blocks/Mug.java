package net.creatopiamods.mod.blocks;

import net.creatopiamods.mod.creatopiamods;
import net.creatopiamods.mod.tileEntity.TileEntityMug;
import net.creatopiamods.mod.tileEntity.TileEntityTableBasseChene;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Mug extends BlockContainer{

	public Mug(Material material) {
		super(material);
		this.setHardness(0.0F);
		this.setResistance(0.0F);
		this.setCreativeTab(creatopiamods.creatopiamodsTab);
		this.setStepSound(soundTypeStone);
        this.setBlockBounds(0.2F, 0, 0.5F, 0.6F, 0.4F ,0.8F);
		
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
		return new TileEntityMug();
		
		
	}
}

 
