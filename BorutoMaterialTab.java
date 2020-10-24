package com.Applhau.BorutoMod.tabs;

import com.Applhau.BorutoMod.init.BorutoItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BorutoMaterialTab extends CreativeTabs
{
	public BorutoMaterialTab(String label) 
	{
		super("borutomaterialtab");
		this.setBackgroundImageName("material.png");
	}
	
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(BorutoItems.STEEL_INGOT);
	}
}
