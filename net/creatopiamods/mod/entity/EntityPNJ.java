package net.creatopiamods.mod.entity;

import com.mojang.authlib.GameProfile;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class EntityPNJ extends EntityMob{

public static String TextureName;
public String Name;
public String QuestsName;	
public String QuestsNumber; 

	public EntityPNJ(World par1World) {
		super(par1World);
		// TODO Auto-generated constructor stub
		
	if(this.Name != null){
		this.setCustomNameTag(Name);	
	} else {
		this.setCustomNameTag("Villageois");
	}
		
	}
	
	   public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
	    {
	        super.writeEntityToNBT(par1NBTTagCompound);
	        par1NBTTagCompound.setString("TextureName",TextureName);
	        par1NBTTagCompound.setString("Name",Name);
	        par1NBTTagCompound.setString(QuestsNumber, QuestsNumber);
	        par1NBTTagCompound.setString(QuestsName, QuestsName);
	    }
	    
	   
	    public boolean attackEntityFrom(DamageSource par1DamageSource, float par2)
	    {
	      return false;
	    }

	    protected Entity findPlayerToAttack()
	    {
	       return null;
	    }
	    public boolean interact(EntityPlayer par1EntityPlayer)
	    {
	    	return false;
	    }
	    public void moveEntity(double par1, double par3, double par5)
	    {

	    }
}

	   
