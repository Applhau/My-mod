package com.Applhau.BorutoMod.bases;

import com.Applhau.BorutoMod.Main;
import com.Applhau.BorutoMod.init.BorutoItems;
import com.Applhau.BorutoMod.util.IHasModel;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class BorutoArmor extends ItemArmor implements IHasModel
	{
		public BorutoArmor(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) 
		{
			super(materialIn, renderIndexIn, equipmentSlotIn);
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

