package net.creatopiamods.mod.armor;

import net.creatopiamods.mod.creatopiamods;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class AluminiumArmor extends ItemArmor{

	public AluminiumArmor(ArmorMaterial material, int id,
			int slot) {
		super(material,id, slot);

		this.setCreativeTab(creatopiamods.creatopiamodsTab);
		
	if(slot ==0) {
		this.setTextureName(creatopiamods.modid + ":AluminiumHelmet");
	}else if(slot == 1){
		this.setTextureName(creatopiamods.modid + ":AluminiumChestplate");
	}else if(slot == 2){
		this.setTextureName(creatopiamods.modid + ":AluminiumLeggings");
	}else if(slot == 3){
		this.setTextureName(creatopiamods.modid + ":AluminiumBoots");
	}
		

		}
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
		if(itemstack.getItem() == creatopiamods.armorAluminiumHelm  || itemstack.getItem() == creatopiamods.armorAluminiumChest || itemstack.getItem() == creatopiamods.armorAluminiumBoots) {
			return creatopiamods.modid + ":textures/model/armor/AluminiumLayer_1.png";

	}else if(itemstack.getItem() == creatopiamods.armorAluminiumLegs) {
			return creatopiamods.modid + ":textures/model/armor/AluminiumLayer_2.png";
		}else{
			return null;
		}
	
	}
}