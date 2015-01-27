package net.creatopiamods.mod.armor;

import net.creatopiamods.mod.creatopiamods;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CopperArmor extends ItemArmor{

	public CopperArmor(ArmorMaterial material, int id,
			int slot) {
		super(material,id, slot);

		this.setCreativeTab(creatopiamods.creatopiamodsTab);
		
	if(slot ==0) {
		this.setTextureName(creatopiamods.modid + ":CopperHelmet");
	}else if(slot == 1){
		this.setTextureName(creatopiamods.modid + ":CopperChestplate");
	}else if(slot == 2){
		this.setTextureName(creatopiamods.modid + ":CopperLeggings");
	}else if(slot == 3){
		this.setTextureName(creatopiamods.modid + ":CopperBoots");
	}
		

		}
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
		if(itemstack.getItem() == creatopiamods.armorCopperHelm  || itemstack.getItem() == creatopiamods.armorCopperChest || itemstack.getItem() == creatopiamods.armorCopperBoots) {
			return creatopiamods.modid + ":textures/model/armor/copperLayer_1.png";

	}else if(itemstack.getItem() == creatopiamods.armorCopperLegs) {
			return creatopiamods.modid + ":textures/model/armor/copperLayer_2.png";
		}else{
			return null;
		}
	
	}
	
}