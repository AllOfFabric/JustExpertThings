package com.shnupbups.justexpertthings.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.registry.Registry;

import com.shnupbups.justexpertthings.JustExpertThings;
import com.shnupbups.justexpertthings.tools.FlintToolMaterial;
import com.shnupbups.justexpertthings.tools.HammerItem;
import com.shnupbups.justexpertthings.tools.ModAxeItem;
import com.shnupbups.justexpertthings.tools.ModHoeItem;
import com.shnupbups.justexpertthings.tools.ModPickaxeItem;
import com.shnupbups.justexpertthings.tools.ModShovelItem;
import com.shnupbups.justexpertthings.tools.ModSwordItem;

public class ModItems {
	public static final Item WOODEN_HAMMER = new HammerItem(ToolMaterials.WOOD, 5, -3.1F, new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));
	public static final Item STONE_HAMMER = new HammerItem(ToolMaterials.STONE, 6, -3.1F, new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));
	public static final Item IRON_HAMMER = new HammerItem(ToolMaterials.IRON, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));
	public static final Item GOLDEN_HAMMER = new HammerItem(ToolMaterials.GOLD, 5, -3.0F, new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));
	public static final Item DIAMOND_HAMMER = new HammerItem(ToolMaterials.DIAMOND, 4, -2.9F, new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));
	
	public static final Item FLINT_SHOVEL = new ModShovelItem(FlintToolMaterial.FLINT, 1.5F, -3.0F, new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));
	public static final Item FLINT_PICKAXE = new ModPickaxeItem(FlintToolMaterial.FLINT, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));
	public static final Item FLINT_AXE = new ModAxeItem(FlintToolMaterial.FLINT, 6.5F, -3.2F, new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));
	public static final Item FLINT_HOE = new ModHoeItem(FlintToolMaterial.FLINT, -2.8F, new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));
	public static final Item FLINT_SWORD = new ModSwordItem(FlintToolMaterial.FLINT, 3, -2.4F, new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));
	public static final Item FLINT_HAMMER = new HammerItem(FlintToolMaterial.FLINT, 6, -3.1F, new Item.Settings().group(ItemGroup.TOOLS).maxCount(1));
	
	public static final Item PLANT_FIBER = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	
	public static final Item BREAKING_MESH = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(1));
	public static final Item WORN_MESH = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(1).recipeRemainder(BREAKING_MESH));
	public static final Item USED_MESH = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(1).recipeRemainder(WORN_MESH));
	public static final Item MESH = new Item(new Item.Settings().group(ItemGroup.MISC).maxCount(1).recipeRemainder(USED_MESH));
	
	public static void init() {
		register(WOODEN_HAMMER, "wooden_hammer");
		register(STONE_HAMMER, "stone_hammer");
		register(IRON_HAMMER, "iron_hammer");
		register(GOLDEN_HAMMER, "golden_hammer");
		register(DIAMOND_HAMMER, "diamond_hammer");
		
		register(FLINT_PICKAXE, "flint_pickaxe");
		register(FLINT_AXE, "flint_axe");
		register(FLINT_SHOVEL, "flint_shovel");
		register(FLINT_HOE, "flint_hoe");
		register(FLINT_SWORD, "flint_sword");
		register(FLINT_HAMMER, "flint_hammer");
		
		register(PLANT_FIBER, "plant_fiber");
		register(MESH, "mesh");
		register(USED_MESH, "used_mesh");
		register(WORN_MESH, "worn_mesh");
		register(BREAKING_MESH, "breaking_mesh");
	}
	
	public static <T extends Item> T register(T item, String name) {
		Registry.register(Registry.ITEM, JustExpertThings.id(name), item);
		return item;
	}
}
