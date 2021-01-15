package com.kwpugh.gobber2.events;

import net.fabricmc.fabric.api.client.item.v1.ItemTooltipCallback;
import net.minecraft.item.Items;
import net.minecraft.text.TranslatableText;

public class ToolTips
{
	public static void init()
	{
	  	ItemTooltipCallback.EVENT.register((itemstack, context, lines) -> {
            if (itemstack.getItem() == Items.EXPERIENCE_BOTTLE) {
                lines.add(new TranslatableText("Rythm is the Bomb!"));
            }
        });
	  	
	  	ItemTooltipCallback.EVENT.register((itemstack, context, lines) -> {
            if (itemstack.getItem() == Items.BAKED_POTATO) {
                lines.add(new TranslatableText("#BLAMECLEGG"));
            }
        });
	}
}
