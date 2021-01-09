package com.kwpugh.gobber2.items.tools;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class AxeEnd extends AxeItem
{
	public AxeEnd(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings)
	{
		super(material, attackDamage, attackSpeed, settings);
	}

	@Override
	public void onCraft(ItemStack stack, World world, PlayerEntity player) 
	{
		stack.getOrCreateTag().putBoolean("Unbreakable", true);
	}
}