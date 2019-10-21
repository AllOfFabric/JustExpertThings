package com.shnupbups.justexpertthings.tools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class FlintToolMaterial implements ToolMaterial {
	public static FlintToolMaterial FLINT = new FlintToolMaterial();
	
	@Override
	public int getDurability() {
		return 98;
	}
	
	@Override
	public float getMiningSpeed() {
		return 3.0F;
	}
	
	@Override
	public float getAttackDamage() {
		return 0.5F;
	}
	
	@Override
	public int getMiningLevel() {
		return 0;
	}
	
	@Override
	public int getEnchantability() {
		return 8;
	}
	
	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.FLINT);
	}
}
