package net.creatopiamods.mod.armor;

import net.creatopiamods.mod.creatopiamods;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class AmuletArmor extends ItemArmor{

	public AmuletArmor(ArmorMaterial material, int id, int slot, int type) {
		super(material,id, slot);

		this.setCreativeTab(creatopiamods.creatopiamodsTab);
		
	
	if(slot == 1 && type == 1){
		this.setTextureName(creatopiamods.modid + ":NeoAmulet");
	}else if(slot == 1 && type == 2){
		this.setTextureName(creatopiamods.modid + ":HolyAmulet");
	}else if(slot == 1 && type == 3){
		this.setTextureName(creatopiamods.modid + ":DarkIceAmulet");
	}else if(slot == 1 && type == 4){
		this.setTextureName(creatopiamods.modid + ":DarkFireAmulet");
	}
		

		}
	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type){
		if(itemstack.getItem() == creatopiamods.itemNeoAmulet) {
			return creatopiamods.modid + ":textures/model/armor/NeoAmulet.png";
			
		}else if(itemstack.getItem() == creatopiamods.itemHolyAmulet) {
			return creatopiamods.modid + ":textures/model/armor/HolyAmulet.png";
			
		}else { if(itemstack.getItem() == creatopiamods.itemDarkIceAmulet) {
			return creatopiamods.modid + ":textures/model/armor/DarkIceAmulet.png";	
			
		}else if(itemstack.getItem() == creatopiamods.itemDarkFireAmulet) {
			return creatopiamods.modid + ":textures/model/armor/DarkFireAmulet.png";	
			
		}
			return null;
		}
	
	}
}