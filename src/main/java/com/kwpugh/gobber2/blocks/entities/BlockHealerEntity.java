package com.kwpugh.gobber2.blocks.entities;

//import com.kwpugh.gobber2.Gobber2;
//import com.kwpugh.gobber2.init.BlockInit;
//import com.kwpugh.gobber2.util.BlockEffects;
//
//import net.minecraft.block.BlockState;
//import net.minecraft.block.entity.BlockEntity;
//import net.minecraft.util.Tickable;
//import net.minecraft.util.math.BlockPos;
//
//public class BlockHealerEntity extends BlockEntity implements Tickable
//{
//	static int healthRadius = Gobber2.CONFIG.GENERAL.healthRadius;
//	static int healthLevel = Gobber2.CONFIG.GENERAL.healthLevel;
//	static float healthYellowHearts = Gobber2.CONFIG.GENERAL.healthYellowHearts;
//	
//	public BlockHealerEntity(BlockState state, BlockPos pos)
//	{
//		//super(BlockInit.BLOCK_HEALER_ENTITY);
//		super(BlockInit.BLOCK_HEALER_ENTITY, pos, state);
//	}
//	        
//	@Override
//	public void tick()
//	{
//		if(!world.isClient && world.isReceivingRedstonePower(this.pos))
//		{
//			{
//				BlockEffects.giveHealth(world, pos, healthRadius, healthLevel, healthYellowHearts);
//			}
//		}		
//	}
//}