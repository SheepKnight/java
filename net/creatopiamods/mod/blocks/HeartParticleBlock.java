package net.creatopiamods.mod.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.creatopiamods.mod.creatopiamods;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class HeartParticleBlock extends Block{
	public HeartParticleBlock(Material material) {
		super(material);
				
				this.setStepSound(soundTypeStone);
				this.setCreativeTab(creatopiamods.ParticlesTab);
				this.isOpaqueCube();				

		
	}
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
	public int getRenderType() {
		return -1;
	}
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random random) {
			
			float x1 = (float)x + random.nextFloat();
			float y1 = (float)y + 0.5F + random.nextFloat();
			float z1 = (float)z + random.nextFloat();
		
		world.spawnParticle("heart", (double)(x1), (double)(y1), (double)(z1), 0D, 0.7F, 0D);
		
	}
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(creatopiamods.modid + ":" +"noTexture");
	}
	 @SideOnly(Side.CLIENT)
	 public int getRenderBlockPass()
    {
        return 0;
    }
}
