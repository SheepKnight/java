package net.creatopiamods.mod.blocks;

import net.creatopiamods.mod.creatopiamods;
import net.creatopiamods.mod.tileEntity.TileEntityNeoAltar;
import net.creatopiamods.mod.tileEntity.TileEntityTableBasseChene;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class NeoAltar extends BlockContainer{

	public NeoAltar(Material material) {
		super(material);
		this.setHardness(0.10F);
		this.setResistance(0.10F);
		this.setCreativeTab(creatopiamods.creatopiamodsTab);
		this.setStepSound(soundTypeAnvil);

		
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
		return new TileEntityNeoAltar();
		
		
	}
}
