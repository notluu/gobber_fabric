package com.kwpugh.gobber2.init;

import com.kwpugh.gobber2.Gobber2;

import net.kyrptonaught.customportalapi.CustomPortalApiRegistry;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;

public class PortalInit
{
    public static void registerPortal()   
    {
    	//  50, 133, 168 = light blue portal color
    	// 13, 130, 21 = green portal
    	
    	CustomPortalApiRegistry.addPortal(Blocks.COBBLESTONE, new Identifier(Gobber2.MOD_ID, "mining"), 50, 133, 168);
    	CustomPortalApiRegistry.addPortal(Blocks.OAK_LOG, new Identifier(Gobber2.MOD_ID, "hunting"), 13, 130, 21);
    }	
}