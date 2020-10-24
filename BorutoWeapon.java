package com.Applhau.BorutoMod.bases;

import com.Applhau.BorutoMod.Main;
import com.Applhau.BorutoMod.init.BorutoItems;
import com.Applhau.BorutoMod.init.BorutoWeapons;
import com.Applhau.BorutoMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class BorutoWeapon extends ItemSword implements IHasModel
{
	
	public BorutoWeapon(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		BorutoItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
	}

}
