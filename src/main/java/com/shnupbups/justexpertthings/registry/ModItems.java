package com.shnupbups.justexpertthings.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

import com.shnupbups.justexpertthings.JustExpertThings;
import com.shnupbups.justexpertthings.tools.FlintToolMaterial;
import com.shnupbups.justexpertthings.tools.ModAxeItem;
import com.shnupbups.justexpertthings.tools.ModHoeItem;
import com.shnupbups.justexpertthings.tools.ModPickaxeItem;
import com.shnupbups.justexpertthings.tools.ModShovelItem;
import com.shnupbups.justexpertthings.tools.ModSwordItem;

public class ModItems {
	public static final Item FLINT_SHOVEL = new ModShovelItem(FlintToolMaterial.FLINT, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final Item FLINT_PICKAXE = new ModPickaxeItem(FlintToolMaterial.FLINT, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final Item FLINT_AXE = new ModAxeItem(FlintToolMaterial.FLINT, 6.5F, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final Item FLINT_HOE = new ModHoeItem(FlintToolMaterial.FLINT, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
	public static final Item FLINT_SWORD = new ModSwordItem(FlintToolMaterial.FLINT, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
	
	public static void init() {
		register(FLINT_PICKAXE, "flint_pickaxe");
		register(FLINT_AXE, "flint_axe");
		register(FLINT_SHOVEL, "flint_shovel");
		register(FLINT_HOE, "flint_hoe");
		register(FLINT_SWORD, "flint_sword");
	}
	
	public static <T extends Item> T register(T item, String name) {
		Registry.register(Registry.ITEM, JustExpertThings.id(name), item);
		return item;
	}
}
