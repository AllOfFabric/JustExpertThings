package com.shnupbups.justexpertthings;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;

import com.shnupbups.justexpertthings.registry.ModItems;

public class JustExpertThings implements ModInitializer {
	@Override
	public void onInitialize() {
		ModItems.init();
	}
	
	public static Identifier id(String name) {
		return new Identifier("justexpertthings", name);
	}
}
