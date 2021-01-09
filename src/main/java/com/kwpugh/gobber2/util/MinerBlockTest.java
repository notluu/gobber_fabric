package com.kwpugh.gobber2.util;

import com.kwpugh.gobber2.init.BlockInit;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GravelBlock;
import net.minecraft.block.SandBlock;
import net.minecraft.tag.BlockTags;

public class MinerBlockTest 
{
	public static boolean canBreak(Block block)
	{
		if (block == Blocks.STONE ||
				block.isIn(BlockInit.cobblestone) ||
				block.isIn(BlockInit.dirt) ||
				block.isIn(BlockInit.netherrack) ||
				block.isIn(BlockInit.sand) ||
				block.isIn(BlockInit.sandstone) ||
				block.isIn(BlockInit.soul_ground) ||
				block.isIn(BlockInit.stone) ||
				block.isIn(BlockInit.end_stones) ||
				block.isIn(BlockTags.BASE_STONE_OVERWORLD) ||
				block.isIn(BlockTags.BASE_STONE_NETHER) ||							
				block instanceof GravelBlock ||
				block instanceof SandBlock ||
				block == Blocks.DIRT || 
				block == Blocks.GRASS_PATH || 
				block == Blocks.SAND  || 
				block == Blocks.RED_SAND  || 
				block == Blocks.SANDSTONE || 
				block == Blocks.RED_SANDSTONE || 
				block == Blocks.GRAVEL || 
				block == Blocks.GRASS_BLOCK ||
				block == Blocks.COARSE_DIRT ||
				block == Blocks.PODZOL ||
				block == Blocks.MYCELIUM ||
				block == Blocks.GRANITE || 
				block == Blocks.ANDESITE || 
				block == Blocks.DIORITE  || 
				block == Blocks.DIORITE || 
				block == Blocks.SOUL_SAND || 
				block == Blocks.MOSSY_COBBLESTONE || 
				block == Blocks.MOSSY_COBBLESTONE_SLAB || 
				block == Blocks.MOSSY_COBBLESTONE_STAIRS ||
				block == Blocks.MOSSY_STONE_BRICKS || 
				block == Blocks.MOSSY_STONE_BRICK_STAIRS || 
				block == Blocks.MOSSY_STONE_BRICK_SLAB || 
				block == Blocks.STONE_BRICKS || 
				block == Blocks.STONE_BRICK_STAIRS || 
				block == Blocks.STONE_BRICK_SLAB || 
				block == Blocks.CRACKED_STONE_BRICKS || 
				block == Blocks.INFESTED_CRACKED_STONE_BRICKS || 
				block == Blocks.INFESTED_CHISELED_STONE_BRICKS|| 
				block == Blocks.INFESTED_COBBLESTONE || 
				block == Blocks.INFESTED_MOSSY_STONE_BRICKS || 
				block == Blocks.END_STONE || 
				block == Blocks.MYCELIUM ||
				block == Blocks.NETHER_WART_BLOCK ||
				block == Blocks.NETHERRACK || 
				block == Blocks.NETHER_BRICKS || 
				block == Blocks.NETHER_BRICK_FENCE || 
				block == Blocks.NETHER_BRICK_STAIRS)
		{
			return true;
		}
		
		return false;
	}
}
