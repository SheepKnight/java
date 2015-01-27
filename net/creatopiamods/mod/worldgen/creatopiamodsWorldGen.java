package net.creatopiamods.mod.worldgen;

import java.util.Random;

import net.creatopiamods.mod.creatopiamods;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class creatopiamodsWorldGen implements IWorldGenerator {
	
	

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
	
		switch(world.provider.dimensionId) {
		case -1 :
			//genere le nether
			generateNether(world, random, chunkX*16, chunkZ*16);
		case 0 :
			//genere l'overworld
			generateSurface(world, random, chunkX*16, chunkZ*16);
		case 1 :
			//genere l'end
			generateEnd(world, random, chunkX*16, chunkZ*16);
		}
	}

	
	private void generateSurface(World world, Random random, int x, int z) {
		//this.addOreSpawn(creatopiamods.ore,world,random,x=blockXpos, z=blockZpos, maxX, maxZ, MaxVeinSize, ChanceToSpawn, minY, MaxY
		this.addOreSpawn(creatopiamods.oreCopperOre, world, random, x, z, 16, 16, 4+random.nextInt(6), 22, 18, 45);
		this.addOreSpawn(creatopiamods.oreTinOre, world, random ,x, z, 16, 16, 4+random.nextInt(6), 29, 18, 45);
		this.addOreSpawn(creatopiamods.oreZincOre, world, random,x , z, 16, 16, 4+random.nextInt(6), 30, 18, 45);
		this.addOreSpawn(creatopiamods.oreAluminiumOre, world, random,x , z, 16, 16, 4+random.nextInt(6), 18, 18, 45);
		this.addOreSpawn(creatopiamods.oreJadeOre, world, random,x , z, 16, 16, 4+random.nextInt(6), 18, 18, 22);
		this.addOreSpawn(creatopiamods.oreMythrilOre, world, random,x , z, 16, 16, 4+random.nextInt(6), 18, 18, 45);
		
	}

	





	private void generateNether(World world, Random random, int x, int z) {
		this.addNetherOreSpawn(creatopiamods.oreAdamantineOre, world, random,x , z, 16, 16, 4+random.nextInt(6), 42, 2, 124);
		
	}

	
	private void generateEnd(World world, Random random, int x, int z) {
	
		
	}
	private void addOreSpawn(Block block, World world, Random random,int blockXPos, int blockZPos, int maxX, int maxZ, int MaxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for(int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, MaxVeinSize)).generate(world, random, posX, posY, posZ);
		}
		
	}	
	
	private void addNetherOreSpawn(Block block, World world, Random random,int blockXPos, int blockZPos, int maxX, int maxZ, int MaxVeinSize, int chanceToSpawn, int minY, int maxY) {
		for(int i = 0; i < chanceToSpawn; i++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenNetherMinable(block, MaxVeinSize)).generate(world, random, posX, posY, posZ);
		}
		
	}	
}
	
	
			


	

	

