package com.kwpugh.gobber2.blocks.entities;

import com.kwpugh.gobber2.init.BlockInit;

import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Tickable;

public class BlockTeleporterEntity extends BlockEntity implements Tickable
{		
	public BlockTeleporterEntity()
	{
		super(BlockInit.BLOCK_TELEPORTER_ENTITY);
	}
   
	@Override
	public void tick()
	{
		if(!world.isClient && world.isReceivingRedstonePower(this.pos))
		{
			// TBD
		}
	}
	
	@Override
	public CompoundTag toTag(CompoundTag tagCompound) 
	{
		return super.toTag(tagCompound);



	}
}