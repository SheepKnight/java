package net.creatopiamods.mod.entity;

import net.minecraft.entity.item.EntityBoat;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityLavaBoat extends EntityBoat{

	public EntityLavaBoat(World par1World) {
		super(par1World);
		// TODO Auto-generated constructor stub
	}
	  protected void setOnFireFromLava()
	    {
	        if (!this.isImmuneToFire)
	        {
	            this.attackEntityFrom(DamageSource.lava, 4.0F);
	            this.setFire(0);
	        }
	    }
}
