 package com.Applhau.BorutoMod.init;

import java.util.ArrayList;
import java.util.List;

import com.Applhau.BorutoMod.Main;
import com.Applhau.BorutoMod.bases.BorutoArmor;
import com.Applhau.BorutoMod.bases.BorutoWeapon;
import com.Applhau.BorutoMod.bases.ItemBase;
import com.Applhau.BorutoMod.model.armor.ArmorModel;
import com.Applhau.BorutoMod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemSword;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class BorutoItems 
{

	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	


	
	//Items
	public static final Item WHITE_CLOTH = new ItemBase("white_cloth");
	public static final Item BLACK_CLOTH = new ItemBase("black_cloth");
	public static final Item BLUE_CLOTH = new ItemBase("blue_cloth");
	public static final Item BROWN_CLOTH = new ItemBase("brown_cloth");
	public static final Item GREEN_CLOTH = new ItemBase("green_cloth");
	public static final Item ORANGE_CLOTH = new ItemBase("orange_cloth");
	public static final Item RED_CLOTH = new ItemBase("red_cloth");
	public static final Item YELLOW_CLOTH = new ItemBase("yellow_cloth");
	
	public static final Item BLACK_FABRIC = new ItemBase("black_fabric");
	public static final Item BLUE_FABRIC = new ItemBase("blue_fabric");
	public static final Item BROWN_FABRIC = new ItemBase("brown_fabric");
	public static final Item ORANGE_FABRIC = new ItemBase("orange_fabric");
	public static final Item RED_FABRIC = new ItemBase("red_fabric");
	public static final Item YELLOW_FABRIC = new ItemBase("yellow_fabric");
	
	public static final Item BLACK_ARMOUR_PLATE = new ItemBase("black_armour_plate");
	public static final Item BLUE_ARMOUR_PLATE = new ItemBase("blue_armour_plate");
	public static final Item ORANGE_ARMOUR_PLATE = new ItemBase("orange_armour_plate");
	public static final Item RED_ARMOUR_PLATE = new ItemBase("red_armour_plate");
	public static final Item YELLOW_ARMOUR_PLATE = new ItemBase("yellow_armour_plate");
	
	public static final Item STEEL_INGOT = new ItemBase("steel_ingot");
	
	//Weapon Material
	public static final ToolMaterial KUNAI_MATERIAL = EnumHelper.addToolMaterial("kunai", 0, 500, 0.0F, 1.0F, 4);
	public static final ToolMaterial KUBIKIRIBOCHO_MATERIAL = EnumHelper.addToolMaterial("kubikiribocho", 0, 10000, 5.0F, 13.0F, 4);
	public static final ToolMaterial TRIPLE_BLADED_SCYTHE_MATERIAL = EnumHelper.addToolMaterial("triple_bladed_scythe", 0, 10000, 5.0F, 10.0F, 4);
	public static final ToolMaterial SHURIKEN_MATERIAL = EnumHelper.addToolMaterial("shuriken", 0, 500, -1.0F, 2.0F, 4);
	public static final ToolMaterial CLEAVER_SWORD_MATERIAL = EnumHelper.addToolMaterial("cleaver_sword", 0, 10000, 5.0F, 9.0F, 4);
	public static final ToolMaterial HIRAMEKAREI_MATERIAL = EnumHelper.addToolMaterial("hiramekarei", 0, 10000, 5.0F, 8.0F, 4);
	public static final ToolMaterial GUNBAI_MATERIAL = EnumHelper.addToolMaterial("gunbai", 0, 10000, 5.0F, 6.0F, 4);
	public static final ToolMaterial SHIBUKI_MATERIAL = EnumHelper.addToolMaterial("shibuki", 0, 10000, 5.0F, 7.0F, 4);
	public static final ToolMaterial NUIBARI_MATERIAL = EnumHelper.addToolMaterial("nuibara", 0, 1000000, 5.0F, 11.0F, 4);
	public static final ToolMaterial SAMEHADA_WRAPPED_MATERIAL = EnumHelper.addToolMaterial("samehada_wrapped", 0, 10000, 6.0F, 5.0F, 4);
	public static final ToolMaterial KIBA_MATERIAL = EnumHelper.addToolMaterial("kiba", 0, 10000, 0.0F, 7.0F, 4);
	public static final ToolMaterial GIANT_FOLDING_FAN_MATERIAL = EnumHelper.addToolMaterial("giant_folding_fan", 0, 10000, 0.0F, 3.0F, 4);
	public static final ToolMaterial KATANA_MATERIAL = EnumHelper.addToolMaterial("katana", 0, 7500, 0.0F, 5.0F, 4);
	public static final ToolMaterial SHAKUJO_MATERIAL = EnumHelper.addToolMaterial("shakujo", 0, 10000, 0.0F, 5.0F, 4);
	//Weapons
	public static final ItemSword KUNAI = new BorutoWeapon("kunai", KUNAI_MATERIAL);//good
	public static final ItemSword KUBIKIRIBOCHO = new BorutoWeapon("kubikiribocho", KUBIKIRIBOCHO_MATERIAL);//good
	public static final ItemSword TRIPLE_BLADED_SCYTHE = new BorutoWeapon("triple_bladed_scythe", TRIPLE_BLADED_SCYTHE_MATERIAL);
	public static final ItemSword SHURIKEN = new BorutoWeapon("shuriken", SHURIKEN_MATERIAL);//good
	public static final ItemSword CLEAVER_SWORD = new BorutoWeapon("cleaver_sword", CLEAVER_SWORD_MATERIAL);//good
	public static final ItemSword HIRAMEKAREI = new BorutoWeapon("hiramekarei", HIRAMEKAREI_MATERIAL);
	public static final ItemSword GUNBAI = new BorutoWeapon("gunbai", GUNBAI_MATERIAL);//good
	public static final ItemSword SHIBUKI = new BorutoWeapon("shibuki", SHIBUKI_MATERIAL);//good
	public static final ItemSword NUIBARI = new BorutoWeapon("nuibari", NUIBARI_MATERIAL);//good
	public static final ItemSword SAMEHADA_WRAPPED = new BorutoWeapon("samehada_wrapped", SAMEHADA_WRAPPED_MATERIAL);//good
	public static final ItemSword KIBA = new BorutoWeapon("kiba", KIBA_MATERIAL);//good
	public static final ItemSword GIANT_FOLDING_FAN = new BorutoWeapon("giant_folding_fan", GIANT_FOLDING_FAN_MATERIAL);//good
	public static final ItemSword KATANA = new BorutoWeapon("katana", KATANA_MATERIAL);//good
	public static final ItemSword SHAKUJO = new BorutoWeapon("shakujo", SHAKUJO_MATERIAL);//good
	
	//Armour Materials
	public static final ArmorMaterial CUSTOM_HELMET_MATERIAL = EnumHelper.addArmorMaterial("custom_helmet", Reference.MOD_ID + ":custom_helmet", 20, new int[] {7, 8, 8, 9}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 2.0f);
	
	//Armour
	public static final Item CUSTOM_HELMET = new ArmorModel("custom_helmet", Main.BORUTOMATERIALTAB, CUSTOM_HELMET_MATERIAL, EntityEquipmentSlot.HEAD);
	

	

	

	


	

	



	
	
}
