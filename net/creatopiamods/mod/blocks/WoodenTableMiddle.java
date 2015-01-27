package net.creatopiamods.mod.blocks;

import net.creatopiamods.mod.creatopiamods;
import net.creatopiamods.mod.tileEntity.TileEntityTableMiddle;
import net.creatopiamods.mod.tileEntity.TileEntityWoodenTable;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class WoodenTableMiddle  extends BlockContainer{

	public WoodenTableMiddle(Material material) {
		super(material);
		this.setHardness(0.0F);
		this.setResistance(0.0F);
		this.setCreativeTab(creatopiamods.creatopiamodsTab);
		this.setStepSound(soundTypeWood);
        this.setBlockBounds(0, 0.875F, 0, 1, 1, 1);
		
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
		return new TileEntityTableMiddle();
		
		
	}{
	}
}
