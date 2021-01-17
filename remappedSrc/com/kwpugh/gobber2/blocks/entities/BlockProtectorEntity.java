package com.kwpugh.gobber2.blocks.entities;

import com.kwpugh.gobber2.Gobber2;
import com.kwpugh.gobber2.init.BlockInit;
import com.kwpugh.gobber2.util.BlockEffects;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.Tickable;

public class BlockProtectorEntity extends BlockEntity implements Tickable
{	
	static int attackRadius = Gobber2.CONFIG.GENERAL.attackRadius;
	static float damageAmount = Gobber2.CONFIG.GENERAL.damageAmount;
	
	public BlockProtectorEntity()
	{
		super(BlockInit.BLOCK_PROTECTOR_ENTITY);
	}
   
	@Override
	public void tick()
	{
		if(!world.isClient && world.isReceivingRedstonePower(this.pos))
		{
			BlockEffects.attackMobs(world, pos, attackRadius, damageAmount);
		}
	}
}