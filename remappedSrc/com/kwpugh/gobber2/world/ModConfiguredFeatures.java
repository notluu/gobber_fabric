package com.kwpugh.gobber2.world;

import com.kwpugh.gobber2.Gobber2;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;

public class ModConfiguredFeatures
{		
	public static void Features()
	{
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(Gobber2.MOD_ID, "ore_lucky_block_overworld"), OreGen.ORE_LUCKY_BLOCK_OVERWORLD );
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(Gobber2.MOD_ID, "ore_gobber_overworld"), OreGen.ORE_GOBBER_OVERWORLD );
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(Gobber2.MOD_ID, "ore_gobber_nether"), OreGen.ORE_GOBBER_NETHER );
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(Gobber2.MOD_ID, "ore_gobber_theend"), OreGen.ORE_GOBBER_THEEND );
	}	
}