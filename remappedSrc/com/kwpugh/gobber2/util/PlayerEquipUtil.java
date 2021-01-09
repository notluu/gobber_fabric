package com.kwpugh.gobber2.util;

import com.kwpugh.gobber2.init.ItemInit;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;

import net.minecraft.item.ItemStack;

public final class PlayerEquipUtil
{
    public static <T> T _null() 
    {
        return null;
    }
  
    public static boolean isPlayerWearingGobberArmor(PlayerEntity player)
    { 
    	ItemStack head = player.getEquippedStack(EquipmentSlot.HEAD);
		ItemStack chest = player.getEquippedStack(EquipmentSlot.CHEST);
		ItemStack legs = player.getEquippedStack(EquipmentSlot.LEGS);
	    ItemStack feet = player.getEquippedStack(EquipmentSlot.FEET);
			
	    //Full Set or token
    	if(		(head.getItem() == ItemInit.GOBBER2_HELMET && 
    			chest.getItem() == ItemInit.GOBBER2_CHESTPLATE && 
    			legs.getItem() == ItemInit.GOBBER2_LEGGINGS && 
    			feet.getItem() == ItemInit.GOBBER2_BOOTS)    )
	      	{
	      		return true;  		
	      	}
		return false;
    } 
    

} 