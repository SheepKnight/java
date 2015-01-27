package net.creatopiamods.mod.blocks;

import java.util.ArrayList;

import net.creatopiamods.mod.creatopiamods;
import net.creatopiamods.mod.tileEntity.TileEntityChristmasTreeDown;
import net.creatopiamods.mod.tileEntity.TileEntityMug;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ChristmasTreeDown extends BlockContainer{
	public ChristmasTreeDown(Material material) {
		super(material);
		this.setHardness(0.0F);
		this.setResistance(0.0F);
		this.setCreativeTab(creatopiamods.creatopiamodsTab);
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
		return new TileEntityChristmasTreeDown();
		
		
	}



}
