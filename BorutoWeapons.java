package com.Applhau.BorutoMod.init;

import java.util.ArrayList;
import java.util.List;

import com.Applhau.BorutoMod.bases.BorutoWeapon;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class BorutoWeapons 
{
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial KUNAI_MATERIAL = EnumHelper.addToolMaterial("kunai", 0, 500, 3.0F, 5.0F, 4);
	
	//Weapons
	public static final ItemSword KUNAI = new BorutoWeapon("kunai", KUNAI_MATERIAL);

}
