package net.creatopiamods.mod;


import net.creatopiamods.mod.armor.AdamantineArmor;
import net.creatopiamods.mod.armor.AluminiumArmor;
import net.creatopiamods.mod.armor.AmuletArmor;
import net.creatopiamods.mod.armor.CopperArmor;
import net.creatopiamods.mod.armor.JadeArmor;
import net.creatopiamods.mod.blocks.*;
import net.creatopiamods.mod.entity.EntityAndroid;
import net.creatopiamods.mod.entity.EntityLavaBoat;
import net.creatopiamods.mod.entity.EntityNewArt;
import net.creatopiamods.mod.entity.EntityPNJ;
import net.creatopiamods.mod.items.*;
import net.creatopiamods.mod.proxy.CommonProxy;
import net.creatopiamods.mod.tileEntity.TileEntityNeoFurnace;
import net.creatopiamods.mod.worldgen.creatopiamodsWorldGen;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBucketMilk;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemHangingEntity;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.creatopiamods.mod.handler.*;



@Mod(modid = creatopiamods.modid, version = creatopiamods.version)
public class creatopiamods {
//nom du mod
	public static final String modid = "creatopiamods";
//version du mod
	public static final String version = "Alpha v0.2";
//la déclaration de l'onglet en mode créatif
	public static CreativeTabs creatopiamodsTab;
	public static CreativeTabs ParticlesTab;
	public static CreativeTabs waffelsTab;
	

	public static ArmorMaterial CopperArmorMaterial = EnumHelper.addArmorMaterial("CopperArmor", 10, new int[] {2, 5, 4 ,1}, 10);
	public static ArmorMaterial AluminiumArmorMaterial = EnumHelper.addArmorMaterial("AluminiumArmor", 10, new int[] {3, 7, 5 ,3}, 7);
	public static ArmorMaterial AdamantineArmorMaterial = EnumHelper.addArmorMaterial("AdamantineArmor", 10, new int[] {3, 6, 4 ,2}, 12);
	public static ArmorMaterial AmuletArmorMaterial = EnumHelper.addArmorMaterial("AmuletArmor", 10, new int[] {0, 2, 0 ,0}, 12);
	public static ArmorMaterial JadeArmorMaterial = EnumHelper.addArmorMaterial("JadeArmor", 10, new int[] {3, 7, 5 ,3}, 8);
	
	@Instance(modid)
	public static creatopiamods instance;
	public static Block blockChristmasTreeUp;
	public static Block blockChristmasTreeDown;
	public static Block blockGift;
	
	public static Block blockCopperShelf;
	public static Block blockAluminiumShelf;
	
	public static Item foodWaffel;
	public static Item foodMilkBottle;
	public static Item foodButter;
	public static Item foodFlour;
	public static Item foodBeer;
	
	public static Block blockCopperBrick;
	public static Block blockAdamantineBrick;
	public static Item itemCitrine;
	public static Item itemCitrineChunck;
	
	public static Block blockCitrineBrick;
	public static Block blockMythrilBrick;
	
	public static Block blockAdamantineTrapDoor; 
	public static Block blockCopperTrapDoor;
	public static Block blockAluminiumTrapDoor; 
	
	public static Block blockCopperFence;
	public static Block blockAdamantineFence;
	public static Block blockAluminiumFence;
	public static Block blockIronFence;
	
	public static Block blockOakTableMiddle;
	
	public static int armorCopperHelmID;
	public static int armorCopperChestID;
	public static int armorCopperLegsID;
	public static int armorCopperBootsID;
	
	public static Item armorCopperHelm;
	public static Item armorCopperChest;
	public static Item armorCopperLegs;
	public static Item armorCopperBoots;
	
	public static int armorJadeHelmID;
	public static int armorJadeChestID;
	public static int armorJadeLegsID;
	public static int armorJadeBootsID;
	
	public static Item armorJadeHelm;
	public static Item armorJadeChest;
	public static Item armorJadeLegs;
	public static Item armorJadeBoots;
	
	public static Block blockPlate;

	public static Block blockStatue;
	
	public static int armorAluminiumHelmID;
	public static int armorAluminiumChestID;
	public static int armorAluminiumLegsID;
	public static int armorAluminiumBootsID;
	
	
	public static Item armorAluminiumHelm;
	public static Item armorAluminiumChest;
	public static Item armorAluminiumLegs;
	public static Item armorAluminiumBoots;
	
	public static int armorAdamantineHelmID;
	public static int armorAdamantineChestID;
	public static int armorAdamantineLegsID;
	public static int armorAdamantineBootsID;
	
	public static Item armorAdamantineHelm;
	public static Item armorAdamantineChest;
	public static Item armorAdamantineLegs;
	public static Item armorAdamantineBoots;
	
	public static Block oreAdamantineOre;
	public static Item itemAdamantineIngot;
	
	public static Block blockDecorativePortal;
	
//la déclaration de l'item lingot de cuivre
	public static Item itemCopperIngot;
//la déclaration de l'item lingot d' étain
	public static Item itemTinIngot;
//la déclaration de l'item lingot de zinc
	public static Item itemZincIngot;
//la déclaration de l'item lingot d' aluminium
	public static Item itemAluminiumIngot;
//la déclaration de l'item minerai de cuivre
	public static Block oreCopperOre;
//la déclaration du bloc de cuivre
	public static Block blockCopperBlock;
//la déclaration du bloc de Zinc
	public static Block blockZincBlock;
//la déclaration du bloc de étain
	public static Block blockTinBlock;
//la déclaration du bloc d' aluminium
	public static Block blockAluminiumBlock;
//la déclaration du bloc d' Adamantine
	public static Block blockAdamantineBlock;
//la déclaration de l'engrenage de cuivre
	public static Item itemCopperCog;
	
	public static Block blockAdamantineStairs;
	public static Block blockCopperStairs;
	public static Block blockMythrilStairs;
	public static Block blockCitrineStairs;
	public static Block blockCitrineBlock;
	
	public static Item itemAdamantineBow;
	public static Block blockRoadBlock;
	 
	
	public static Item itemHolyCoal;
	public static Item itemNeoCoal;
	
	public static Item itemMythrilIngot;
	public static Block blockMythrilBlock;
	
	public static Item itemPaintig;
	
	public static Item itemNeoAmulet;
	public static Item itemHolyAmulet;
	public static Item itemDarkIceAmulet;
	public static Item itemDarkFireAmulet;
	
	public static Item itemAdamantineNugget;
	
	public static Item itemIronWasher;
	public static Item itemIronDisc;
	public static Item itemAluminiumHammer;
	public static Item itemIronPunch;
	
	public static Block blockStoneSlab;
	
	public static ToolMaterial CopperMaterial = EnumHelper.addToolMaterial("CopperMaterial", 2, 507, 7.0F, 2.0F, 7);
	public static Item itemCopperSword;
	public static Item itemCopperPickaxe;
	public static Item itemCopperShovel;
	public static Item itemCopperAxe;
	public static Item itemCopperHoe;
	public static ToolMaterial AluminiumMaterial = EnumHelper.addToolMaterial("AluminiumMaterial", 2, 756, 7.0F, 2.0F, 7);
	public static Item itemAluminiumSword;
	public static Item itemAluminiumPickaxe;
	public static Item itemAluminiumShovel;
	public static Item itemAluminiumAxe;
	public static Item itemAluminiumHoe;
	
	public static ToolMaterial TinMaterial = EnumHelper.addToolMaterial("TinMaterial", 2, 274, 7.0F, 2.0F, 7);
	public static Item itemTinSword;
	public static Item itemTinPickaxe;
	public static Item itemTinShovel;
	public static Item itemTinAxe;
	public static Item itemTinHoe;
	
	public static Item itemGlassBowl;
	public static Item itemWaffelBowl;
	
	public static ToolMaterial AdamantineMaterial = EnumHelper.addToolMaterial("AdamantineMaterial", 2, 590, 7.0F, 2.0F, 7);
	public static Item itemAdamantineSword;
	public static Item itemAdamantinePickaxe;
	public static Item itemAdamantineShovel;
	public static Item itemAdamantineAxe;
	public static Item itemAdamantineHoe;
	
	public static ToolMaterial ZincMaterial = EnumHelper.addToolMaterial("ZincMaterial", 2, 298, 7.0F, 2.0F, 7);
	public static Item itemZincSword;
	public static Item itemZincPickaxe;
	public static Item itemZincShovel;
	public static Item itemZincAxe;
	public static Item itemZincHoe;
	
	public static Block blockJadeLamp;
	public static Block blockNeoAltarBlock;
	
	public static Block oreMythrilOre;
	
	public static Item itemJade;
	
	public static Item itemCreaMonnaie;
	
	public static Block oreJadeOre;
	
	public static Block blockCloseableGlassClosed;
	public static Block blockCloseableGlassOpened;
	
	public static Block blockFireParticleBlock;
	public static Block blockSmokeParticleBlock;
	public static Block blockHeartParticleBlock;
	
	public static Item foodSugarWaffel;
	
	public static Block blockTableBasseChene;
	
	public static Block blockMug;
	public static Block blockOakWoodTable;	
	
	public static Block blockNeoFurnaceActive;
	public static Block blockNeoAltar;
	public static Block blockNeoFurnaceIdle;
	public static final int guiIDNeoFurnace = 0;
	public static final int guiCompagnons = 1;
	public static final int guiIDYou = 3;
	
	public static Item itemCard;
	
	public static Block blockStoneStairs;
	
	public static Block blockCeticBlock;
	
	
//la génération des minerais/...
	creatopiamodsWorldGen eventworldGen = new creatopiamodsWorldGen();
	
	
	

	
//la déclaration du minerai d'étain
	public static Block oreTinOre;
//la déclaration du minerai de zinc
	public static Block oreZincOre;
//la déclaration du minerai d' aluminium
	public static Block oreAluminiumOre;
	
//la déclaration de la pépite de cuivre
	public static Item itemCopperNugget;
//la déclaration de la pépite d' étain
	public static Item itemTinNugget;
//la déclaration de la pépite de zinc
	public static Item itemZincNugget;
//la déclaration de la pépite d' aluminium
	public static Item itemAluminiumNugget;
			
	
	@SidedProxy(clientSide = "net.creatopiamods.mod.proxy.ClientProxy", serverSide = "net.creatopiamods.mod.proxy.CommonProxy")
	public static CommonProxy creatopiamodsProxy;
	
	@EventHandler
	public void PreInit(FMLPreInitializationEvent preEvent){

		
		
//l'onglet créatif
		creatopiamodsTab = new CreativeTabs("creatopiamods") {
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem(){
				return Item.getItemFromBlock(creatopiamods.oreCopperOre);
			}
		};
		ParticlesTab = new CreativeTabs("particle") {
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem(){
				return Item.getItemFromBlock(Blocks.fire);
			}
		};
		waffelsTab = new CreativeTabs("Waffels") {
			@SideOnly(Side.CLIENT)
			public Item getTabIconItem(){
				return creatopiamods.foodWaffel;
			}
		};
		

		//LES ITEMS
		//LES LINGOtS
//le lingot de cuivre		
		itemCopperIngot = new NCItems().setUnlocalizedName("CopperIngot");
		GameRegistry.registerItem(itemCopperIngot, "CopperIngot");
//le lingot d'étain		
		itemTinIngot = new NCItems().setUnlocalizedName("TinIngot");
		GameRegistry.registerItem(itemTinIngot, "TinIngot");
//le lingot de zinc		
		itemZincIngot = new NCItems().setUnlocalizedName("ZincIngot");
		GameRegistry.registerItem(itemZincIngot, "ZincIngot");
//le lingot de aluminium	
		itemAluminiumIngot = new NCItems().setUnlocalizedName("AluminiumIngot");
		GameRegistry.registerItem(itemAluminiumIngot, "AluminiumIngot");

		itemMythrilIngot = new NCItems().setUnlocalizedName("MythrilIngot");
		GameRegistry.registerItem(itemMythrilIngot, "MythrilIngot");
		
//le lingot d Adamantine
		itemAdamantineIngot = new NCItems().setUnlocalizedName("AdamantineIngot");
		GameRegistry.registerItem(itemAdamantineIngot, "AdamantineIngot");
		
		//LES PEPITES
//la pépite de cuivre		
		itemCopperNugget = new NCItems().setUnlocalizedName("CopperNugget");
		GameRegistry.registerItem(itemCopperNugget, "CopperNugget");
		
//la pépite d'étain		
		itemTinNugget = new NCItems().setUnlocalizedName("TinNugget");
		GameRegistry.registerItem(itemTinNugget, "TinNugget");
		
//la pépite de zinc		
		itemZincNugget = new NCItems().setUnlocalizedName("ZincNugget");
		GameRegistry.registerItem(itemZincNugget, "ZincNugget");
				
//la pépite d'aluminium	
		itemAluminiumNugget = new NCItems().setUnlocalizedName("AluminiumNugget");
		GameRegistry.registerItem(itemAluminiumNugget, "AluminiumNugget");
		
		itemJade = new NCItems().setUnlocalizedName("Jade");
		GameRegistry.registerItem(itemJade, "Jade");
		
		itemCitrine = new NCItems().setUnlocalizedName("Citrine");
		GameRegistry.registerItem(itemCitrine, "Citrine");
		
		itemAdamantineNugget = new NCItems().setUnlocalizedName("AdamantineNugget");
		GameRegistry.registerItem(itemAdamantineNugget, "AdamantineNugget");
	
		itemCard = new Card().setUnlocalizedName("Card");
		GameRegistry.registerItem(itemCard, "Card");
		
		//LES "AUTRES"
		
		itemCopperCog = new NCItems().setUnlocalizedName("CopperCog");
		GameRegistry.registerItem(itemCopperCog, "CopperCog");
		
		itemHolyCoal = new NCItems().setUnlocalizedName("HolyCoal");
		GameRegistry.registerItem(itemHolyCoal, "Holy Coal");
		
		itemNeoCoal = new NCItems().setUnlocalizedName("NeoCoal");
		GameRegistry.registerItem(itemNeoCoal, "Neo Coal");
		
		itemIronWasher = new NCItems().setUnlocalizedName("IronWasher");
		GameRegistry.registerItem(itemIronWasher, "IronWasher");
		itemIronDisc = new NCItems().setUnlocalizedName("IronDisc");
		GameRegistry.registerItem(itemIronDisc, "IronDisc");
		itemAluminiumHammer = new AluminiumHammer().setUnlocalizedName("AluminiumHammer");
		GameRegistry.registerItem(itemAluminiumHammer, "AluminiumHammer");
		itemIronPunch = new IronPunch().setUnlocalizedName("IronPunch");
		GameRegistry.registerItem(itemIronPunch, "IronPunch");
		
		itemCreaMonnaie = new NCItems().setUnlocalizedName("CreaMonnaie");
		GameRegistry.registerItem(itemCreaMonnaie, "CreaMonnaie");
		
		
		//food
		
		foodWaffel = new ItemFood(6, 0.6F, false).setUnlocalizedName("Waffel").setCreativeTab(creatopiamods.waffelsTab).setTextureName(creatopiamods.modid + ":Waffel");
		GameRegistry.registerItem(foodWaffel, "Waffel");
		
		foodMilkBottle = new NCItems().setUnlocalizedName("MilkBottle");
		GameRegistry.registerItem(foodMilkBottle, "MilkBottle");
		
		foodButter = new NCItems().setUnlocalizedName("Butter");
		GameRegistry.registerItem(foodButter, "Butter");
		
		foodFlour = new NCItems().setUnlocalizedName("Flour");
		GameRegistry.registerItem(foodFlour, "Flour");
		
		foodBeer = new FoodBeer(0, 0, false).setUnlocalizedName("Beer");
		GameRegistry.registerItem(foodBeer, "Beer");
		
		itemGlassBowl = new NCItems().setUnlocalizedName("GlassBowl");
		GameRegistry.registerItem(itemGlassBowl, "GlassBowl");
		
		itemWaffelBowl = new NCItems().setUnlocalizedName("WaffelBowl");
		GameRegistry.registerItem(itemWaffelBowl, "WaffelBowl");
		
		foodSugarWaffel = new ItemFood(7, 0.7F , false).setUnlocalizedName("SugarWaffel").setCreativeTab(creatopiamods.waffelsTab).setTextureName(creatopiamods.modid + ":SugarWaffel");
		GameRegistry.registerItem(foodSugarWaffel, "SugarWaffel");
		
		//LES ARMES ET OUTILS
		
		itemCopperSword = new CopperSword(CopperMaterial).setUnlocalizedName("CopperSword");
		GameRegistry.registerItem(itemCopperSword, "CopperSword");
		
		itemCopperPickaxe = new CopperPickaxe(CopperMaterial).setUnlocalizedName("CopperPickaxe");
		GameRegistry.registerItem(itemCopperPickaxe, "CopperPickaxe");
		
		itemCopperShovel = new CopperShovel(CopperMaterial).setUnlocalizedName("CopperShovel");
		GameRegistry.registerItem(itemCopperShovel, "CopperShovel");
		
		itemCopperAxe = new CopperAxe(CopperMaterial).setUnlocalizedName("CopperAxe");
		GameRegistry.registerItem(itemCopperAxe, "CopperAxe");
		
		itemCopperHoe = new CopperHoe(CopperMaterial).setUnlocalizedName("CopperHoe");
		GameRegistry.registerItem(itemCopperHoe, "CopperHoe");
		
		
		itemZincSword = new CopperSword(ZincMaterial).setUnlocalizedName("ZincSword");
		GameRegistry.registerItem(itemZincSword, "ZincSword");
		
		itemZincPickaxe = new CopperPickaxe(ZincMaterial).setUnlocalizedName("ZincPickaxe");
		GameRegistry.registerItem(itemZincPickaxe, "ZincPickaxe");
		
		itemZincShovel = new CopperShovel(ZincMaterial).setUnlocalizedName("ZincShovel");
		GameRegistry.registerItem(itemZincShovel, "ZincShovel");
		
		itemZincAxe = new CopperAxe(ZincMaterial).setUnlocalizedName("ZincAxe");
		GameRegistry.registerItem(itemZincAxe, "ZincAxe");
		
		itemZincHoe = new CopperHoe(ZincMaterial).setUnlocalizedName("ZincHoe");
		GameRegistry.registerItem(itemZincHoe, "ZincHoe");
		
		
		itemAluminiumSword = new CopperSword(AluminiumMaterial).setUnlocalizedName("AluminiumSword");
		GameRegistry.registerItem(itemAluminiumSword, "AluminiumSword");
		
		itemAluminiumPickaxe = new CopperPickaxe(AluminiumMaterial).setUnlocalizedName("AluminiumPickaxe");
		GameRegistry.registerItem(itemAluminiumPickaxe, "AluminiumPickaxe");
		
		itemAluminiumShovel = new CopperShovel(AluminiumMaterial).setUnlocalizedName("AluminiumShovel");
		GameRegistry.registerItem(itemAluminiumShovel, "AluminiumShovel");
		
		itemAluminiumAxe = new CopperAxe(AluminiumMaterial).setUnlocalizedName("AluminiumAxe");
		GameRegistry.registerItem(itemAluminiumAxe, "AluminiumAxe");
		
		itemAluminiumHoe = new CopperHoe(AluminiumMaterial).setUnlocalizedName("AluminiumHoe");
		GameRegistry.registerItem(itemAluminiumHoe, "AluminiumHoe");
		
		
		
		itemTinSword = new CopperSword(TinMaterial).setUnlocalizedName("TinSword");
		GameRegistry.registerItem(itemTinSword, "TinSword");
		
		itemTinPickaxe = new CopperPickaxe(TinMaterial).setUnlocalizedName("TinPickaxe");
		GameRegistry.registerItem(itemTinPickaxe, "TinPickaxe");
		
		itemTinShovel = new CopperShovel(TinMaterial).setUnlocalizedName("TinShovel");
		GameRegistry.registerItem(itemTinShovel, "TinShovel");
		
		itemTinAxe = new CopperAxe(TinMaterial).setUnlocalizedName("TinAxe");
		GameRegistry.registerItem(itemTinAxe, "TinAxe");
		
		itemTinHoe = new CopperHoe(TinMaterial).setUnlocalizedName("TinHoe");
		GameRegistry.registerItem(itemTinHoe, "TinHoe");
		
		itemAdamantineSword = new CopperSword(AdamantineMaterial).setUnlocalizedName("AdamantineSword");
		GameRegistry.registerItem(itemAdamantineSword, "AdamantineSword");
		
		itemAdamantinePickaxe = new CopperPickaxe(AdamantineMaterial).setUnlocalizedName("AdamantinePickaxe");
		GameRegistry.registerItem(itemAdamantinePickaxe, "AdamantinePickaxe");
		
		itemAdamantineShovel = new CopperShovel(AdamantineMaterial).setUnlocalizedName("AdamantineShovel");
		GameRegistry.registerItem(itemAdamantineShovel, "AdamantineShovel");
		
		itemAdamantineAxe = new CopperAxe(AdamantineMaterial).setUnlocalizedName("AdamantineAxe");
		GameRegistry.registerItem(itemAdamantineAxe, "AdamantineAxe");
		
		itemAdamantineHoe = new CopperHoe(AdamantineMaterial).setUnlocalizedName("AdamantineHoe");
		GameRegistry.registerItem(itemAdamantineHoe, "AdamantineHoe");
		
		itemAdamantineBow = new AdamantineBow().setUnlocalizedName("AdamantineBow").setCreativeTab(creatopiamodsTab);
		GameRegistry.registerItem(itemAdamantineBow, "AdamantineBow");
		
		
		
		itemHolyAmulet = new AmuletArmor(AmuletArmorMaterial, 1, 1, 2).setUnlocalizedName("HolyAmulet");
		GameRegistry.registerItem(itemHolyAmulet, "HolyAmulet");
		
		itemDarkFireAmulet = new AmuletArmor(AmuletArmorMaterial, 1, 1, 4).setUnlocalizedName("DarkFireAmulet");
		GameRegistry.registerItem(itemDarkFireAmulet, "DarkFireAmulet");
		
		itemDarkIceAmulet = new AmuletArmor(AmuletArmorMaterial, 1, 1, 3).setUnlocalizedName("DarkIceAmulet");
		GameRegistry.registerItem(itemDarkIceAmulet, "DarkIceAmulet");
		
		itemNeoAmulet = new AmuletArmor(AmuletArmorMaterial, 1, 1, 1).setUnlocalizedName("NeoAmulet");
		GameRegistry.registerItem(itemNeoAmulet, "NeoAmulet");

		//les armures
		
		armorCopperHelm = new CopperArmor(CopperArmorMaterial ,armorCopperHelmID,0).setUnlocalizedName("CopperHelmet");
		armorCopperChest = new CopperArmor(CopperArmorMaterial,armorCopperChestID,1).setUnlocalizedName("CopperChestplate");
		armorCopperLegs = new CopperArmor(CopperArmorMaterial,armorCopperLegsID,2).setUnlocalizedName("CopperLeggings");
		armorCopperBoots = new CopperArmor(CopperArmorMaterial,armorCopperBootsID ,3).setUnlocalizedName("CopperBoots");
		
		GameRegistry.registerItem(armorCopperHelm,"CopperHelm");
		GameRegistry.registerItem(armorCopperChest,"CopperChest");
		GameRegistry.registerItem(armorCopperLegs,"CopperLegs");
		GameRegistry.registerItem(armorCopperBoots,"CopperBoots");
		
		armorJadeHelm = new JadeArmor(JadeArmorMaterial ,armorJadeHelmID,0).setUnlocalizedName("JadeHelmet");
		armorJadeChest = new JadeArmor(CopperArmorMaterial,armorJadeChestID,1).setUnlocalizedName("JadeChestplate");
		armorJadeLegs = new JadeArmor(JadeArmorMaterial,armorJadeLegsID,2).setUnlocalizedName("JadeLeggings");
		armorJadeBoots = new JadeArmor(JadeArmorMaterial,armorJadeBootsID ,3).setUnlocalizedName("JadeBoots");
		
		GameRegistry.registerItem(armorJadeHelm,"JadeHelm");
		GameRegistry.registerItem(armorJadeChest,"JadeChest");
		GameRegistry.registerItem(armorJadeLegs,"JadeLegs");
		GameRegistry.registerItem(armorJadeBoots,"JadeBoots");
		
		armorAluminiumHelm = new AluminiumArmor(AluminiumArmorMaterial ,armorAluminiumHelmID,0).setUnlocalizedName("AluminiumHelmet");
		armorAluminiumChest = new AluminiumArmor(AluminiumArmorMaterial,armorAluminiumChestID,1).setUnlocalizedName("AluminiumChestplate");
		armorAluminiumLegs = new AluminiumArmor(AluminiumArmorMaterial,armorAluminiumLegsID,2).setUnlocalizedName("AluminiumLeggings");
		armorAluminiumBoots = new AluminiumArmor(AluminiumArmorMaterial,armorAluminiumBootsID ,3).setUnlocalizedName("AluminiumBoots");
		
		GameRegistry.registerItem(armorAluminiumHelm,"AluminiumHelm");
		GameRegistry.registerItem(armorAluminiumChest,"AluminiumChest");
		GameRegistry.registerItem(armorAluminiumLegs,"AluminiumLegs");
		GameRegistry.registerItem(armorAluminiumBoots,"AluminiumBoots");
		
		armorAdamantineHelm = new AdamantineArmor(AdamantineArmorMaterial ,armorAdamantineHelmID,0).setUnlocalizedName("AdamantineHelmet");
		armorAdamantineChest = new AdamantineArmor(AdamantineArmorMaterial,armorAdamantineChestID,1).setUnlocalizedName("AdamantineChestplate");
		armorAdamantineLegs = new AdamantineArmor(AdamantineArmorMaterial,armorAdamantineLegsID,2).setUnlocalizedName("AdamantineLeggings");
		armorAdamantineBoots = new AdamantineArmor(AdamantineArmorMaterial,armorAdamantineBootsID ,3).setUnlocalizedName("AdamantineBoots");
		
		GameRegistry.registerItem(armorAdamantineHelm,"AdamantineHelm");
		GameRegistry.registerItem(armorAdamantineChest,"AdamantineChest");
		GameRegistry.registerItem(armorAdamantineLegs,"AdamantineLegs");
		GameRegistry.registerItem(armorAdamantineBoots,"AdamantineBoots");
		//LES RENDUS
		
		creatopiamodsProxy.registerRenderThings();
		
		
		//LES BLOCS
		//LES MINERAIS
		
//le minerai de cuivre		
		oreCopperOre = new OreBlock(Material.rock).setBlockName("CopperOre");
		GameRegistry.registerBlock(oreCopperOre, "CopperOre");
		
//le minerai d'étain		 
		oreTinOre = new OreBlock(Material.rock).setBlockName("TinOre");
		GameRegistry.registerBlock(oreTinOre, "TinOre");
		
//le minerai de zinc		
		oreZincOre = new OreBlock(Material.rock).setBlockName("ZincOre");
		GameRegistry.registerBlock(oreZincOre, "ZincOre");
//le minerai d'aluminium		
		oreAluminiumOre = new OreBlock(Material.rock).setBlockName("AluminiumOre");
		GameRegistry.registerBlock(oreAluminiumOre, "AluminiumOre");
		
		oreMythrilOre = new OreBlock(Material.rock).setBlockName("MythrilOre");
		GameRegistry.registerBlock(oreMythrilOre, "MythrilOre");
		
		oreJadeOre = new OreBlock(Material.rock).setBlockName("JadeOre");
		GameRegistry.registerBlock(oreJadeOre , "JadeOre");
		
		oreAdamantineOre = new OreBlock(Material.rock).setBlockName("AdamantineOre");
		GameRegistry.registerBlock(oreAdamantineOre , "AdamantineOre");

		
		blockCopperBrick = new OreBlock(Material.rock).setBlockName("CopperBrick");
		GameRegistry.registerBlock(blockCopperBrick, "CopperBrick");
		
		blockAdamantineBrick = new OreBlock(Material.rock).setBlockName("AdamantineBrick");
		GameRegistry.registerBlock(blockAdamantineBrick, "AdamantineBrick");

		blockCitrineBrick = new OreBlock(Material.rock).setBlockName("CitrineBrick");
		GameRegistry.registerBlock(blockCitrineBrick, "CitrineBrick");
		
		blockMythrilBrick = new OreBlock(Material.rock).setBlockName("MythrilBrick");
		GameRegistry.registerBlock(blockMythrilBrick, "MythrilBrick");
		
		//LES MACHINES
		
		blockNeoFurnaceIdle = new NeoFurnace(false).setBlockName("NeoFurnaceIdle").setCreativeTab(creatopiamodsTab);
		GameRegistry.registerBlock(blockNeoFurnaceIdle, "NeoFurnaceIdle");
		
		blockNeoFurnaceActive = new NeoFurnace(true).setBlockName("NeoFurnace").setLightLevel(0.625F);
		GameRegistry.registerBlock(blockNeoFurnaceActive, "NeoFurnaceActive");
		
		blockCloseableGlassOpened = new CloseableGlass(false).setBlockName("Closeable Glass");
		GameRegistry.registerBlock(blockCloseableGlassOpened, "Closeable Glass");
		
		blockCloseableGlassClosed = new CloseableGlass(true).setBlockName("Closeable Glass closed");
		GameRegistry.registerBlock(blockCloseableGlassClosed, "Closeable Glass Closed");
		
		blockStoneSlab = new Slab (false, Material.clay).setBlockName("StoneSlab").setCreativeTab(creatopiamodsTab);
		GameRegistry.registerBlock(blockStoneSlab, "StoneSlab");
		
		//LES BLOCS DE METAUX
		
		
	blockCopperShelf = new TransparentBlock("CopperShelf",Material.iron,true).setBlockName("CopperShelf").setCreativeTab(creatopiamodsTab);
	GameRegistry.registerBlock(blockCopperShelf, "CopperShelf");	
	
	blockAluminiumShelf = new TransparentBlock("AluminiumShelf",Material.iron,true).setBlockName("AluminiumShelf").setCreativeTab(creatopiamodsTab);
	GameRegistry.registerBlock(blockAluminiumShelf, "AluminiumShelf");
		
//le bloc de cuivre		
	blockCopperBlock = new MetalBlock(Material.iron).setBlockName("CopperBlock");
	GameRegistry.registerBlock(blockCopperBlock, "CopperBlock");

//le bloc de Adamantine		
	blockAdamantineBlock = new MetalBlock(Material.iron).setBlockName("AdamantineBlock");
	GameRegistry.registerBlock(blockAdamantineBlock, "AdamantineBlock");
	
	blockCitrineBlock = new MetalBlock(Material.iron).setBlockName("CitrineBlock");
	GameRegistry.registerBlock(blockCitrineBlock, "CitrineBlock");

//le bloc d'étain
	blockTinBlock = new MetalBlock(Material.iron).setBlockName("TinBlock");
	GameRegistry.registerBlock(blockTinBlock, "TinBlock");
//le bloc de Zinc
	blockZincBlock = new MetalBlock(Material.iron).setBlockName("ZincBlock");
	GameRegistry.registerBlock(blockZincBlock, "ZincBlock");
//le bloc d' aluminium
	blockAluminiumBlock = new MetalBlock(Material.iron).setBlockName("AluminiumBlock");
	GameRegistry.registerBlock(blockAluminiumBlock, "AluminiumBlock");
	
	blockMythrilBlock = new MetalBlock(Material.iron).setBlockName("MythrilBlock");
	GameRegistry.registerBlock(blockMythrilBlock, "MythrilBlock");
	
	blockJadeLamp = new Light(Material.rock).setBlockName("JadeLamp");
	GameRegistry.registerBlock(blockJadeLamp, "JadeLamp");
	
	blockCeticBlock = new MetalBlock(Material.iron).setBlockName("CeticBlock");
	GameRegistry.registerBlock(blockCeticBlock, "CeticBlock");
	
	blockCopperFence = new MetalFence("CopperFence", Material.iron).setBlockName("CopperFence");
	GameRegistry.registerBlock(blockCopperFence, "CopperFence");
	
	blockAdamantineFence = new MetalFence("AdamantineFence", Material.iron).setBlockName("AdamantineFence");
	GameRegistry.registerBlock(blockAdamantineFence, "AdamantineFence");
	
	blockAluminiumFence = new MetalFence("AluminiumFence", Material.iron).setBlockName("AluminiumFence");
	GameRegistry.registerBlock(blockAluminiumFence, "AluminiumFence");
	
	blockIronFence = new MetalFence("IronFence", Material.iron).setBlockName("IronFence");
	GameRegistry.registerBlock(blockIronFence, "IronFence");
	
	blockCopperTrapDoor = new MetalicTrapDoor(Material.iron).setBlockName("CopperTrapDoor");
	GameRegistry.registerBlock(blockCopperTrapDoor, "CopperTrapDoor");

	blockAdamantineTrapDoor = new MetalicTrapDoor(Material.iron).setBlockName("AdamantineTrapDoor");
	GameRegistry.registerBlock(blockAdamantineTrapDoor, "AdamantineTrapDoor");

	blockAluminiumTrapDoor = new MetalicTrapDoor(Material.iron).setBlockName("AluminiumTrapDoor");
	GameRegistry.registerBlock(blockAluminiumTrapDoor, "AluminiumTrapDoor");
	
		//LES BLOCS CUSTOMS
	
	blockTableBasseChene = new TableBasse(Material.wood).setBlockName("TableBasseChene");
		GameRegistry.registerBlock(blockTableBasseChene, "TableBasseChene");
		
	blockNeoAltar = new NeoAltar(Material.iron).setBlockName("NeoAltar");
		GameRegistry.registerBlock(blockNeoAltar, "NeoAltar");
		
	blockMug = new Mug(Material.rock).setBlockName("Mug").setBlockTextureName("Mug");
		GameRegistry.registerBlock(blockMug, "Mug");
	
	blockGift = new Gift(Material.rock).setBlockName("Gift").setBlockTextureName("Gift");
		GameRegistry.registerBlock(blockGift, "Gift");
			
		
	blockChristmasTreeDown = new ChristmasTreeDown(Material.rock).setBlockName("ChristmasTreeDown");
		GameRegistry.registerBlock(blockChristmasTreeDown, "ChristmasTreeDown");
			
	blockChristmasTreeUp = new ChristmasTreeUp(Material.rock).setBlockName("ChristmasTreeUp");
		GameRegistry.registerBlock(blockChristmasTreeUp, "ChristmasTreeUp");
				
		
	blockOakWoodTable = new WoodenTable(Material.rock, 1).setBlockName("OakWoodTable").setBlockTextureName("OakWoodTable");
		GameRegistry.registerBlock(blockOakWoodTable, "OakWoodTable");
	blockOakTableMiddle = new WoodenTableMiddle(Material.rock).setBlockName("OakTableMiddle").setBlockTextureName("OakTableMiddle");
		GameRegistry.registerBlock(blockOakTableMiddle, "OakTableMiddle");
	blockPlate = new Plate(Material.rock).setBlockName("Plate").setBlockTextureName("Plate");
		GameRegistry.registerBlock(blockPlate, "Plate");
		
	blockFireParticleBlock = new FireParticleBlock(Material.rock).setBlockName("FireParticleBlock");
		GameRegistry.registerBlock(blockFireParticleBlock, "FireParticleBlock");
	blockSmokeParticleBlock = new SmokeParticleBlock(Material.rock).setBlockName("SmokeParticleBlock").setBlockTextureName("noTexture");
		GameRegistry.registerBlock(blockSmokeParticleBlock, "SmokeParticleBlock");
	blockHeartParticleBlock = new HeartParticleBlock(Material.rock).setBlockName("HeartParticleBlock").setBlockTextureName("noTexture");
		GameRegistry.registerBlock(blockHeartParticleBlock, "HeartParticleBlock");
		
	blockDecorativePortal = new DecorativePortal().setBlockName("DecorativePortal").setBlockTextureName("portal").setCreativeTab(creatopiamodsTab);
		GameRegistry.registerBlock(blockDecorativePortal, "DecorativePortal");
	
	blockRoadBlock = new RoadBlock(Material.rock).setBlockName("RoadBlock").setCreativeTab(creatopiamodsTab);
		GameRegistry.registerBlock(blockRoadBlock, "RoadBlock");
	
	blockStoneStairs = new Stairs(Blocks.stone, 3) .setBlockName("StoneStairs").setCreativeTab(creatopiamodsTab);
		GameRegistry.registerBlock(blockStoneStairs, "StoneStairs");
		
	blockAdamantineStairs = new Stairs(creatopiamods.blockAdamantineBlock, 3) .setBlockName("AdamantineStairs").setCreativeTab(creatopiamodsTab);
		GameRegistry.registerBlock(blockAdamantineStairs, "AdamantineStairs");
		
	blockCopperStairs = new Stairs(creatopiamods.blockCopperBlock, 3) .setBlockName("CopperStairs").setCreativeTab(creatopiamodsTab);
		GameRegistry.registerBlock(blockCopperStairs, "CopperStairs");
		
	blockMythrilStairs = new Stairs(creatopiamods.blockMythrilBlock, 3) .setBlockName("MythrilStairs").setCreativeTab(creatopiamodsTab);
		GameRegistry.registerBlock(blockMythrilStairs, "MythrilStairs");
		
	blockCitrineStairs = new Stairs(creatopiamods.blockCitrineBlock, 3) .setBlockName("CitrineStairs").setCreativeTab(creatopiamodsTab);
		GameRegistry.registerBlock(blockCitrineStairs, "CitrineStairs");
		
	blockStatue = new Statue(Material.rock).setBlockName("Statue");
		GameRegistry.registerBlock(blockStatue, "Statue");
		
	//les entités
		
	itemPaintig = new ItemHangingEntity(EntityNewArt.class).setUnlocalizedName("NewArt").setCreativeTab(creatopiamodsTab);
		GameRegistry.registerItem(itemPaintig, "NewArt");
	
		//LES GENERATIONS
	GameRegistry.registerWorldGenerator(eventworldGen, 0);
		
	}
	

	@EventHandler
	public void Init(FMLInitializationEvent event){
//les recettes avec un four	
		GameRegistry.addSmelting(oreCopperOre, new ItemStack(itemCopperIngot, 1), 0);
		GameRegistry.addSmelting(oreTinOre, new ItemStack(itemTinIngot, 1), 0);
		GameRegistry.addSmelting(oreAluminiumOre, new ItemStack(itemAluminiumIngot, 1), 0);
		GameRegistry.addSmelting(oreZincOre, new ItemStack(itemZincIngot, 1), 0);
		GameRegistry.addSmelting(oreAdamantineOre, new ItemStack(itemAdamantineIngot, 1), 0);
		GameRegistry.addSmelting(itemWaffelBowl, new ItemStack(foodWaffel, 4), 0);
		
		
		GameRegistry.registerFuelHandler(new FuelHandler());

		
		
		GameRegistry.registerTileEntity(TileEntityNeoFurnace.class, "NeoFurnace");
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		
		//RECETTE AVEC DES OBJETS
		
	FMLCommonHandler.instance().bus().register(new CraftingHandler());
		
		
//les recettes "classiques"	
		
		GameRegistry.addRecipe(new ItemStack(blockCopperBlock), new Object[]{"CCC", "CCC", "CCC",  'C',itemCopperIngot});
		GameRegistry.addRecipe(new ItemStack(blockTinBlock), new Object[]{"CCC", "CCC", "CCC",  'C',itemTinIngot});
		GameRegistry.addRecipe(new ItemStack(blockZincBlock), new Object[]{"CCC", "CCC", "CCC",  'C',itemZincIngot});
		GameRegistry.addRecipe(new ItemStack(blockAluminiumBlock), new Object[]{"CCC", "CCC", "CCC",  'C',itemAluminiumIngot});
		GameRegistry.addRecipe(new ItemStack(blockAdamantineBlock), new Object[]{"CCC", "CCC", "CCC",  'C',itemAdamantineIngot});

		GameRegistry.addRecipe(new ItemStack(armorAdamantineBoots), new Object[]{"I I", "I I", "   ",  'I',itemAdamantineIngot});
		GameRegistry.addRecipe(new ItemStack(armorAdamantineBoots), new Object[]{"   ", "I I", "I I",  'I',itemAdamantineIngot});
		GameRegistry.addRecipe(new ItemStack(armorAdamantineLegs), new Object[]{"III", "I I", "I I",  'I',itemAdamantineIngot});
		GameRegistry.addRecipe(new ItemStack(armorAdamantineChest), new Object[]{"I I", "III", "III",  'I',itemAdamantineIngot});
		GameRegistry.addRecipe(new ItemStack(armorAdamantineHelm), new Object[]{"III", "I I", "   ",  'I',itemAdamantineIngot});
		GameRegistry.addRecipe(new ItemStack(armorAdamantineHelm), new Object[]{"   ", "III", "I I",  'I',itemAdamantineIngot});
		
		GameRegistry.addRecipe(new ItemStack(armorCopperBoots), new Object[]{"I I", "I I", "   ",  'I',itemCopperIngot});
		GameRegistry.addRecipe(new ItemStack(armorCopperBoots), new Object[]{"   ", "I I", "I I",  'I',itemCopperIngot});
		GameRegistry.addRecipe(new ItemStack(armorCopperLegs), new Object[]{"III", "I I", "I I",  'I',itemCopperIngot});
		GameRegistry.addRecipe(new ItemStack(armorCopperChest), new Object[]{"I I", "III", "III",  'I',itemCopperIngot});
		GameRegistry.addRecipe(new ItemStack(armorCopperHelm), new Object[]{"III", "I I", "   ",  'I',itemCopperIngot});
		GameRegistry.addRecipe(new ItemStack(armorCopperHelm), new Object[]{"   ", "III", "I I",  'I',itemCopperIngot});
		
		GameRegistry.addRecipe(new ItemStack(armorAluminiumBoots), new Object[]{"I I", "I I", "   ",  'I',itemAluminiumIngot});
		GameRegistry.addRecipe(new ItemStack(armorAluminiumBoots), new Object[]{"   ", "I I", "I I",  'I',itemAluminiumIngot});
		GameRegistry.addRecipe(new ItemStack(armorAluminiumLegs), new Object[]{"III", "I I", "I I",  'I',itemAluminiumIngot});
		GameRegistry.addRecipe(new ItemStack(armorAluminiumChest), new Object[]{"I I", "III", "III",  'I',itemAluminiumIngot});
		GameRegistry.addRecipe(new ItemStack(armorAluminiumHelm), new Object[]{"III", "I I", "   ",  'I',itemAluminiumIngot});
		GameRegistry.addRecipe(new ItemStack(armorAluminiumHelm), new Object[]{"   ", "III", "I I",  'I',itemAluminiumIngot});
		
		GameRegistry.addRecipe(new ItemStack(itemCopperIngot), new Object[]{"CCC", "CCC", "CCC",  'C',itemCopperNugget});
		GameRegistry.addRecipe(new ItemStack(itemTinIngot), new Object[]{"CCC", "CCC", "CCC",  'C',itemTinNugget});
		GameRegistry.addRecipe(new ItemStack(itemZincIngot), new Object[]{"CCC", "CCC", "CCC",  'C',itemZincNugget});
		GameRegistry.addRecipe(new ItemStack(itemAluminiumIngot), new Object[]{"CCC", "CCC", "CCC",  'C',itemAluminiumNugget});
		GameRegistry.addRecipe(new ItemStack(itemAluminiumHammer), new Object[]{" A ", " SA", "S  ",  'A',itemAluminiumIngot, 'S',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(itemCopperCog, 2),new Object[]{" X ", "XVX", " X ", 'X', itemCopperIngot,'V', itemCopperNugget});
		
		GameRegistry.addRecipe(new ItemStack(itemIronDisc, 3), new Object[]{"IH",'I',Items.iron_ingot, 'H', new ItemStack(itemAluminiumHammer, 1, OreDictionary.WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(itemIronWasher), new Object[]{"DP", 'D',itemIronDisc,'P',new ItemStack(itemIronPunch,1 , OreDictionary.WILDCARD_VALUE)});
		GameRegistry.addRecipe(new ItemStack(itemIronPunch), new Object[]{" C ", " CC", "C  ",  'C',Items.iron_ingot});
		
		GameRegistry.addRecipe(new ItemStack(itemCopperSword), new Object[]{"C", "C", "S",'C',itemCopperIngot ,'S' ,Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemCopperShovel), new Object[]{"J","S","S",'J',itemCopperIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemCopperPickaxe), new Object[]{"JJJ"," S "," S ",'J',itemCopperIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemCopperHoe), new Object[]{" JJ"," S "," S ",'J',itemCopperIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemCopperHoe), new Object[]{"JJ "," S "," S ",'J',itemCopperIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemCopperAxe), new Object[]{" JJ"," SJ"," S ",'J',itemCopperIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemCopperAxe), new Object[]{"JJ ","JS "," S ",'J',itemCopperIngot,'S',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(itemAluminiumSword), new Object[]{"C", "C", "S",'C',itemAluminiumIngot ,'S' ,Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemAluminiumShovel), new Object[]{"J","S","S",'J',itemAluminiumIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemAluminiumPickaxe), new Object[]{"JJJ"," S "," S ",'J',itemAluminiumIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemAluminiumHoe), new Object[]{" JJ"," S "," S ",'J',itemAluminiumIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemAluminiumHoe), new Object[]{"JJ "," S "," S ",'J',itemAluminiumIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemAluminiumAxe), new Object[]{" JJ"," SJ"," S ",'J',itemAluminiumIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemAluminiumAxe), new Object[]{"JJ ","JS "," S ",'J',itemAluminiumIngot,'S',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(itemAdamantineSword), new Object[]{"C", "C", "S",'C',itemAdamantineIngot ,'S' ,Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemAdamantineShovel), new Object[]{"J","S","S",'J',itemAdamantineIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemAdamantinePickaxe), new Object[]{"JJJ"," S "," S ",'J',itemAdamantineIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemAdamantineHoe), new Object[]{" JJ"," S "," S ",'J',itemAdamantineIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemAdamantineHoe), new Object[]{"JJ "," S "," S ",'J',itemAdamantineIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemAdamantineAxe), new Object[]{" JJ"," SJ"," S ",'J',itemAdamantineIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemAdamantineAxe), new Object[]{"JJ ","JS "," S ",'J',itemAdamantineIngot,'S',Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(itemTinSword), new Object[]{"C", "C", "S",'C',itemTinIngot ,'S' ,Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemTinShovel), new Object[]{"J","S","S",'J',itemTinIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemTinPickaxe), new Object[]{"JJJ"," S "," S ",'J',itemTinIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemTinHoe), new Object[]{" JJ"," S "," S ",'J',itemTinIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemTinHoe), new Object[]{"JJ "," S "," S ",'J',itemTinIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemTinAxe), new Object[]{" JJ"," SJ"," S ",'J',itemTinIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(itemTinAxe), new Object[]{"JJ ","JS "," S ",'J',itemTinIngot,'S',Items.stick});
		GameRegistry.addRecipe(new ItemStack(blockJadeLamp), new Object[]{"JJJ","JGJ","JJJ",'J',itemJade,'G',Blocks.glowstone});
		GameRegistry.addRecipe(new ItemStack(blockNeoFurnaceIdle), new Object []{"CCC","CFC","CCC",'C',itemCopperIngot, 'F',Blocks.furnace});
		
		GameRegistry.addRecipe(new ItemStack(blockCopperBrick, 9), new Object []{"III","III","III",'I', blockCopperBlock});
		GameRegistry.addRecipe(new ItemStack(blockAdamantineBrick, 9), new Object []{"III","III","III",'I', blockAdamantineBlock});

//les recettes "shapeless"		
		GameRegistry.addShapelessRecipe(new ItemStack(itemCopperIngot, 9),new Object []{blockCopperBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(itemTinIngot, 9),new Object []{blockTinBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(itemZincIngot, 9),new Object []{blockZincBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(itemAluminiumIngot, 9),new Object []{blockAluminiumBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(itemAdamantineIngot, 9),new Object []{blockAdamantineBlock});
		
		GameRegistry.addShapelessRecipe(new ItemStack(itemAdamantineNugget, 9),new Object [] {itemAdamantineIngot});
		GameRegistry.addShapelessRecipe(new ItemStack(itemCopperNugget, 9),new Object [] {itemCopperIngot});
		GameRegistry.addShapelessRecipe(new ItemStack(itemZincNugget, 9),new Object [] {itemZincIngot});
		GameRegistry.addShapelessRecipe(new ItemStack(itemAluminiumNugget, 9),new Object [] {itemAluminiumIngot});
		
		GameRegistry.addRecipe(new ItemStack(itemCopperIngot), new Object[]{"CCC", "CCC", "CCC",  'C',itemCopperNugget});
		GameRegistry.addRecipe(new ItemStack(itemTinIngot), new Object[]{"CCC", "CCC", "CCC",  'C',itemTinNugget});
		GameRegistry.addRecipe(new ItemStack(itemZincIngot), new Object[]{"CCC", "CCC", "CCC",  'C',itemZincNugget});
		GameRegistry.addRecipe(new ItemStack(itemAluminiumIngot), new Object[]{"CCC", "CCC", "CCC",  'C',itemAluminiumNugget});
		
		GameRegistry.addShapelessRecipe(new ItemStack(foodMilkBottle), new Object[]{Items.milk_bucket, Items.glass_bottle});
		GameRegistry.addShapelessRecipe(new ItemStack(foodButter, 3),new Object []{foodMilkBottle});
		GameRegistry.addShapelessRecipe(new ItemStack(foodFlour, 2),new Object []{Items.wheat});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.bread),new Object []{foodFlour,foodFlour,foodFlour});
		GameRegistry.addShapelessRecipe(new ItemStack(itemWaffelBowl),new Object []{foodFlour, foodButter, foodBeer, itemGlassBowl,Items.egg});
	GameRegistry.addShapelessRecipe(new ItemStack(foodSugarWaffel), new  Object []{foodWaffel, Items.sugar});
	
		
		//entities
		EntityHandler.registerMonsters(EntityAndroid.class, "Android");
		//EntityHandler.registerMonsters(EntityPNJ.class, "PNJ");
		EntityHandler.registerMonsters(EntityLavaBoat.class, "LavaBoat");
		
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent postEvent){
		
	}
	
}
