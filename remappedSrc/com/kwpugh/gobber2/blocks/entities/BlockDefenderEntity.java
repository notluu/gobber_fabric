package com.kwpugh.gobber2.blocks.entities;

import com.kwpugh.gobber2.Gobber2;
import com.kwpugh.gobber2.init.BlockInit;
import com.kwpugh.gobber2.util.BlockEffects;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.Tickable;

public class BlockDefenderEntity extends BlockEntity implements Tickable
{	
	static int defenseRadius = Gobber2.CONFIG.GENERAL.defenseRadius;
	static int defenseLevel = Gobber2.CONFIG.GENERAL.defenseLevel;
	
	public BlockDefenderEntity()
	{
		super(BlockInit.BLOCK_DEFENDER_ENTITY);
	}
   
	@Override
	public void tick()
	{
		if(!world.isClient && world.isReceivingRedstonePower(this.pos))
		{
			BlockEffects.giveDefense(world, pos, defenseRadius, defenseLevel);
		}
	}
}