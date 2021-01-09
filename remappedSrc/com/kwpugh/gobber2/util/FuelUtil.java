package com.kwpugh.gobber2.util;

import com.kwpugh.gobber2.init.ItemInit;

import net.fabricmc.fabric.impl.content.registry.FuelRegistryImpl;

public class FuelUtil 
{
	public static void init() 
	{
		FuelRegistryImpl registry = FuelRegistryImpl.INSTANCE;

		registry.add(ItemInit.GOBBER2_FOO, 12000);
		registry.add(ItemInit.GOBBER2_FOO_NETHER, 24000);
		registry.add(ItemInit.GOBBER2_FOO_END, 32000);
	
	}
}