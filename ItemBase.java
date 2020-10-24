package com.Applhau.BorutoMod.bases;

import com.Applhau.BorutoMod.Main;
import com.Applhau.BorutoMod.init.BorutoItems;
import com.Applhau.BorutoMod.util.IHasModel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;


public  class ItemBase extends Item implements IHasModel{
	
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.BORUTOMATERIALTAB);
		
		BorutoItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
	}




}
