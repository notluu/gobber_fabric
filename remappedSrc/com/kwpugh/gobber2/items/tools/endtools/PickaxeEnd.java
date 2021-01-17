package com.kwpugh.gobber2.items.tools.endtools;

import com.kwpugh.gobber2.items.tools.basetools.ModPickaxe;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class PickaxeEnd extends ModPickaxe
{
	public PickaxeEnd(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings)
	{
		super(material, attackDamage, attackSpeed, settings);
	}
	
	@Override
	public void onCraft(ItemStack stack, World world, PlayerEntity player) 
	{
		stack.getOrCreateTag().putBoolean("Unbreakable", true);
	}
}