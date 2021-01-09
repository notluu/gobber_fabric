package com.kwpugh.gobber2.util;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class PlayerSpecialAbilities
{
	//Increases the player's food level to max on tick update, based on inputs
	public static void giveHealing(World world, PlayerEntity player, ItemStack itemstack, int amount)
	{
		if(player.age % 180 == 0)
		{
			player.heal(amount);
		}
		
    	return;
	}
		
	//Set player saturation level to max on tick update
	public static void giveSaturationEffect(World world, PlayerEntity player, ItemStack itemstack)
	{
		if(player.age % 180 == 0)
		{
			player.getHungerManager().setFoodLevel(player.getHungerManager().getFoodLevel() + 10);
		}
		
    	return;
	}
	
	//Slower increase of yellow hearts on tick update
	public static void giveSlowAbsorption(World world, PlayerEntity player, ItemStack itemstack)
	{
		float current = player.getAbsorptionAmount();
		
		if(player.getHealth() < 20 || current >= 10)
		{
			return;
		}
		
		if(current >= 9)
		{
			if (player.age % 180 == 0)
			{
				player.setAbsorptionAmount(10);
			} 
			
			
			return;
		}
		if(current < 9)
		{
			if (player.age % 180 == 0)
			{
				player.setAbsorptionAmount(current + 0.33F);
			} 
			
			return;
		}
		
    	return;
	}
	
	//Faster increase of yellow hearts on tick update
	public static void giveFastAbsorption(World world, PlayerEntity player, ItemStack itemstack)
	{
		float current = player.getAbsorptionAmount();
		
		if(player.getHealth() < 20 || current >= 20)
		{
			return;
		}
		
		if(current >= 19)
		{
			if (player.age % 180 == 0)
			{
				player.setAbsorptionAmount(20);
			} 
			
			return;
		}
		if(current < 19)
		{
			if (player.age % 180 == 0)
			{
				player.setAbsorptionAmount(current + 1.0F);
			} 
			
			return;
		}
		
    	return;
	}
	
	public static void givePhoenixEffect(World world, PlayerEntity player)
	{
		if(player.isOnFire())
		{
			StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 8, 0, false, false);
			StatusEffectInstance effect2 = new StatusEffectInstance(StatusEffects.INSTANT_HEALTH, 8, 0, false, false);
			StatusEffectInstance effect3 = new StatusEffectInstance(StatusEffects.SATURATION, 8, 0, false, false);
			
			{
				player.addStatusEffect(effect);
				player.addStatusEffect(effect2);
				player.addStatusEffect(effect3);
			}	
			
			return;
		}
		
		return;
	}
	
	public static void giveWaterBreathing(World world, PlayerEntity player)
	{
		if(player.isSubmergedInWater())
		{
			StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.WATER_BREATHING, 8, 0, false, false);
			
			{
				player.addStatusEffect(effect);
			}
			
			return;
		}
		
		return;
	}
}