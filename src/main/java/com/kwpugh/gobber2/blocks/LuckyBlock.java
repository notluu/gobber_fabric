package com.kwpugh.gobber2.blocks;

import java.util.List;
import java.util.Random;

import com.kwpugh.gobber2.Gobber2;
import com.kwpugh.gobber2.init.ItemInit;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class LuckyBlock  extends OreBlock
{
	public LuckyBlock(FabricBlockSettings settings) 
	{
		super(settings);
		this.settings.requiresTool();
	}

	static boolean enableExtraLoot = Gobber2.CONFIG.GENERAL.enableExtraLoot;
	static boolean enableFortune = Gobber2.CONFIG.GENERAL.enableFortune;
	
	@Override
	public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player)
	{
		if(world.isClient) return;
		
		int tries = 1;  // Default value if Fortune not enabled
		
		if(enableFortune)
		{
			ItemStack stack2 = player.getMainHandStack();
			boolean enchanted = player.getMainHandStack().hasEnchantments();	
			boolean hasFortune = stack2.getEnchantments().toString().contains("fortune");
			int level = EnchantmentHelper.getLevel(Enchantments.FORTUNE, stack2);
						
			if(enchanted && hasFortune)
			{
				tries = level + 1;
			}
			else
			{
				tries = 1;
			}			
		}
	
		if(enableExtraLoot)
		{			
			for(int i = 1; i < (tries + 1); i++)
			{
				Random random = new Random();
				double r = random.nextDouble();  //generate a random double between 0 and 1

				if(r >= .20)  // nothing above .20
				{
					// No Op
				}
				else if(r >= .10 && r < .20) // Common
				{
					ItemStack stack = ItemInit.common_loot.getRandom(random).getDefaultStack();
					dropStack(world, pos, stack); 

				}
				else if(r >= .04 && r < .10)  //Uncommon
				{
					ItemStack stack = ItemInit.uncommon_loot.getRandom(random).getDefaultStack();
					dropStack(world, pos, stack); 
				}
				else if(r >= .01 && r < .04)  //Rare
				{
					ItemStack stack = ItemInit.rare_loot.getRandom(random).getDefaultStack();
					dropStack(world, pos, stack); 
				}
				else if(r < .01)  //Very Rare
				{
					ItemStack stack = ItemInit.very_rare_loot.getRandom(random).getDefaultStack();
					dropStack(world, pos, stack); 
				}	
			}			
		}
	}
	
	@Environment(EnvType.CLIENT)
	public void appendTooltip(ItemStack stack, BlockView world, List<Text> tooltip, TooltipContext options)
	{
		tooltip.add(new TranslatableText("item.gobber2.gobber2_lucky_block.tip1").formatted(Formatting.YELLOW));
	}
	  
}