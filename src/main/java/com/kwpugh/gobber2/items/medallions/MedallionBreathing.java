package com.kwpugh.gobber2.items.medallions;

import java.util.List;

import com.kwpugh.gobber2.util.PlayerSpecialAbilities;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class MedallionBreathing extends Item
{
	public MedallionBreathing(Settings settings)
	{
		super(settings);
	}
		
	@Override
	public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected)
	{
		PlayerEntity player = (PlayerEntity) entity;
		
		PlayerSpecialAbilities.giveWaterBreathing(world, player);
	}
	
	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext)
	{
		tooltip.add(new TranslatableText("item.gobber2.while_in_inventory").formatted(Formatting.YELLOW));
	} 
}