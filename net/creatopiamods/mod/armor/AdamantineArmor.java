package net.creatopiamods.mod.armor;

import net.creatopiamods.mod.creatopiamods;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class AdamantineArmor extends ItemArmor{

	public AdamantineArmor(ArmorMaterial material, int id,
			int slot) {
		super(material,id, slot);

		this.setCreativeTab(creatopiamods.creatopiamodsTab);
		
	if(slot ==0) {
		this.setTextureName(creatopiamods.modid + ":AdamantineHelmet");
	}else if(slot == 1){
		this.setTextureName(creatopiamods.modid + ":AdamantineChestplate");
	}else if(slot == 2){
		this.setTextureName(creatopiamods.modid + ":AdamantineLeggings");
	}else if(slot == 3){
		this.setTextureName(creatopiamods.modid + ":AdamantineBoots");
	}
		

		}
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
		if(itemstack.getItem() == creatopiamods.armorAdamantineHelm  || itemstack.getItem() == creatopiamods.armorAdamantineChest || itemstack.getItem() == creatopiamods.armorAdamantineBoots) {
			return creatopiamods.modid + ":textures/model/armor/AdamantineLayer_1.png";

	}else if(itemstack.getItem() == creatopiamods.armorAdamantineLegs) {
			return creatopiamods.modid + ":textures/model/armor/AdamantineLayer_2.png";
		}else{
			return null;
		}
	
	}
}