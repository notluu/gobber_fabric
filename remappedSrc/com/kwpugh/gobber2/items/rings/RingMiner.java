package com.kwpugh.gobber2.items.rings;

import java.util.ArrayList;
import java.util.List;

import com.kwpugh.gobber2.Gobber2;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GravelBlock;
import net.minecraft.block.SandBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.BlockTags;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RingMiner extends Item 
{
	public RingMiner(Settings settings)
	{
		super(settings);
	}
	
	static int minerCooldown = Gobber2.getConfig().RINGS.ringMinerCooldown;
	
	public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand)
	{
		ItemStack itemStack = player.getStackInHand(hand);
		
		player.getItemCooldownManager().set(this, minerCooldown);
		
		player.setCurrentHand(hand);
		
		BlockPos playerPos = player.getBlockPos();

		Block block;
		List<BlockPos> poslist = new ArrayList<BlockPos>();

		for (int x = -5; x <= 5; x++)
		{
			for (int y = 0; y <= 4; y++)
			{
				for (int z = -5; z <= 5; z++)
				{
					BlockPos pos = player.getBlockPos().add(x, y, z);
					block = world.getBlockState(pos).getBlock();							
			
					if (block == Blocks.STONE ||
	
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
							block == Blocks.NETHERRACK || 
							block == Blocks.NETHER_BRICKS || 
							block == Blocks.NETHER_BRICK_FENCE || 
							block == Blocks.NETHER_BRICK_STAIRS)
					{
						if(player.isSneaking())
						{
							poslist.add(pos);
							world.breakBlock(pos, true, player);	
						}
						
						if(!player.isSneaking())
						{
							poslist.add(pos);
							world.breakBlock(pos, false, player);	
						}		
					}
				}
			}
		}
    
        return TypedActionResult.success(itemStack);
	}
	
	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
	{
		tooltip.add(new TranslatableText("item.gobber2.gobber2_ring_miner.tip1").formatted(Formatting.GREEN));
		tooltip.add(new TranslatableText("item.gobber2.gobber2_ring_miner.tip2").formatted(Formatting.YELLOW));
		tooltip.add(new TranslatableText("item.gobber2.gobber2_ring_miner.tip3").formatted(Formatting.YELLOW));
		tooltip.add(new TranslatableText("item.gobber2.gobber2_ring_miner.tip6").formatted(Formatting.BLUE));

	} 
}
