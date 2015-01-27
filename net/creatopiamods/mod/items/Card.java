package net.creatopiamods.mod.items;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import net.creatopiamods.mod.creatopiamods;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Card extends Item{

    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (par3EntityPlayer.capabilities.isCreativeMode)
        {
            return par1ItemStack;
        }
        else
        {
            --par1ItemStack.stackSize;
            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

            if (!par2World.isRemote)
            {
    			FMLNetworkHandler.openGui(par3EntityPlayer, creatopiamods.instance, creatopiamods.guiIDNeoFurnace, par2World, 0, 100, 0);
            }

            return par1ItemStack;
        }
    }
}
