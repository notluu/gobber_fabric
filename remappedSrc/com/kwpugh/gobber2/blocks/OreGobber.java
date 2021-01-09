package com.kwpugh.gobber2.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;

public class OreGobber  extends Block
{
	public OreGobber(FabricBlockSettings settings) 
	{
		super(settings);
		this.settings.requiresTool();
	}

}
