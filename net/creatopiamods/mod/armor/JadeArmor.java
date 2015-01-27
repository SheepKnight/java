package net.creatopiamods.mod.armor;

import net.creatopiamods.mod.creatopiamods;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class JadeArmor extends ItemArmor{

	public JadeArmor(ArmorMaterial material, int id,
			int slot) {
		super(material,id, slot);

		this.setCreativeTab(creatopiamods.creatopiamodsTab);
		
	if(slot ==0) {
		this.setTextureName(creatopiamods.modid + ":JadeHelmet");
	}else if(slot == 1){
		this.setTextureName(creatopiamods.modid + ":JadeChestplate");
	}else if(slot == 2){
		this.setTextureName(creatopiamods.modid + ":JadeLeggings");
	}else if(slot == 3){
		this.setTextureName(creatopiamods.modid + ":JadeBoots");
	}
		

		}
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
		if(itemstack.getItem() == creatopiamods.armorJadeHelm  || itemstack.getItem() == creatopiamods.armorJadeChest || itemstack.getItem() == creatopiamods.armorJadeBoots) {
			return creatopiamods.modid + ":textures/model/armor/JadeLayer_1.png";

	}else if(itemstack.getItem() == creatopiamods.armorJadeLegs) {
			return creatopiamods.modid + ":textures/model/armor/JadeLayer_2.png";
		}else{
			return null;
		}
	
	}
}
