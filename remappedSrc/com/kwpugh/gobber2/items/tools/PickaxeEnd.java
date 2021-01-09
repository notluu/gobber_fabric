package com.kwpugh.gobber2.items.tools;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class PickaxeEnd extends PickaxeItem
{
	public PickaxeEnd(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings)
	{
		super(material, attackDamage, attackSpeed, settings);
	}

	@Override
	public float getMiningSpeedMultiplier(ItemStack stack, BlockState state)
	{
		String enchantments = stack.getEnchantments().toString();

		if(enchantments.contains("faster_obsidian"))
		{
			if (state.isOf(Blocks.OBSIDIAN)  || state.isOf(Blocks.CRYING_OBSIDIAN))
			{
				return 100.0F;
			}
		}

		Material material = state.getMaterial();
		return material != Material.METAL && material != Material.REPAIR_STATION && material != Material.STONE ? super.getMiningSpeedMultiplier(stack, state) : this.miningSpeed;
	}
	
	@Override
	public void onCraft(ItemStack stack, World world, PlayerEntity player) 
	{
		stack.getOrCreateTag().putBoolean("Unbreakable", true);
	}
}