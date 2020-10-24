package com.Applhau.BorutoMod.util.handlers;

import com.Applhau.BorutoMod.init.ModBlocks;
import com.Applhau.BorutoMod.init.BorutoItems;
import com.Applhau.BorutoMod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void inItemRegister(RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().registerAll(BorutoItems.ITEMS.toArray(new Item[0]));
	}
	
	
	@SubscribeEvent
	public static void inBlockRegister(RegistryEvent.Register<Block> event) 
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) 
	{
		for(Item item : BorutoItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
		
		
	}
}
