package net.creatopiamods.mod.proxy;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.creatopiamods.mod.creatopiamods;
import net.creatopiamods.mod.blocks.Statue;
import net.creatopiamods.mod.entity.EntityAndroid;
import net.creatopiamods.mod.entity.EntityPNJ;
import net.creatopiamods.mod.model.ModelAndroid;
import net.creatopiamods.mod.model.ModelHuman;
import net.creatopiamods.mod.renderer.ItemRenderMug;
import net.creatopiamods.mod.renderer.ItemRenderTableBasseChene;
import net.creatopiamods.mod.renderer.RenderAndroid;
import net.creatopiamods.mod.renderer.RenderChristmasTreeDown;
import net.creatopiamods.mod.renderer.RenderChristmasTreeUp;
import net.creatopiamods.mod.renderer.RenderGift;
import net.creatopiamods.mod.renderer.RenderHuman;
import net.creatopiamods.mod.renderer.RenderMug;
import net.creatopiamods.mod.renderer.RenderNeoAltar;
import net.creatopiamods.mod.renderer.RenderPlate;
import net.creatopiamods.mod.renderer.RenderStatue;
import net.creatopiamods.mod.renderer.RenderTable;
import net.creatopiamods.mod.renderer.RenderTableBasseChene;
import net.creatopiamods.mod.renderer.RenderTableMiddle;
import net.creatopiamods.mod.tileEntity.TileEntityChristmasTreeDown;
import net.creatopiamods.mod.tileEntity.TileEntityChristmasTreeUp;
import net.creatopiamods.mod.tileEntity.TileEntityGift;
import net.creatopiamods.mod.tileEntity.TileEntityMug;
import net.creatopiamods.mod.tileEntity.TileEntityNeoAltar;
import net.creatopiamods.mod.tileEntity.TileEntityPlate;
import net.creatopiamods.mod.tileEntity.TileEntityStatue;
import net.creatopiamods.mod.tileEntity.TileEntityTableBasseChene;
import net.creatopiamods.mod.tileEntity.TileEntityTableMiddle;
import net.creatopiamods.mod.tileEntity.TileEntityWoodenTable;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
	public void registerRenderThings() {
		//TableBasseChene
		TileEntitySpecialRenderer renderTableBasseChene = new RenderTableBasseChene();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTableBasseChene.class, renderTableBasseChene);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(creatopiamods.blockTableBasseChene), new ItemRenderTableBasseChene(renderTableBasseChene, new TileEntityTableBasseChene()));
		//Mug
		TileEntitySpecialRenderer renderMug = new RenderMug();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMug.class, renderMug);
		//OakWoodTable
		TileEntitySpecialRenderer renderTable = new RenderTable();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWoodenTable.class, renderTable);
		//NeoAltar
		TileEntitySpecialRenderer renderNeoAltar = new RenderNeoAltar();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityNeoAltar.class, renderNeoAltar);
		//TableMiddle
		TileEntitySpecialRenderer renderTableMiddle = new RenderTableMiddle();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTableMiddle.class, renderTableMiddle);
		//ChristmasTreeDown
		TileEntitySpecialRenderer renderChristmasTreeDown = new RenderChristmasTreeDown();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChristmasTreeDown.class, renderChristmasTreeDown);
		//ChristmasTreeUp
		TileEntitySpecialRenderer renderChristmasTreeUp = new RenderChristmasTreeUp();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityChristmasTreeUp.class, renderChristmasTreeUp);
		//Plate
		TileEntitySpecialRenderer renderPlate = new RenderPlate();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPlate.class, renderPlate);
		//Gift
		TileEntitySpecialRenderer renderGift = new RenderGift();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGift.class, renderGift);

		//Statue
		TileEntitySpecialRenderer renderStatue = new RenderStatue();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStatue.class, renderStatue);

		
		//Entities
		RenderingRegistry.registerEntityRenderingHandler(EntityAndroid.class, new RenderAndroid(new ModelAndroid(), 0.3F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPNJ.class, new RenderHuman(new ModelHuman(), 0.3F,EntityPNJ.TextureName));

		
		//ITEMS Blocs
		
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(creatopiamods.blockMug), new ItemRenderMug(renderMug, new TileEntityMug()));
	}
}
