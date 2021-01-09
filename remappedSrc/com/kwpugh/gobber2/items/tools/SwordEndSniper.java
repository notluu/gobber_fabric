package com.kwpugh.gobber2.items.tools;

import java.util.List;

import com.kwpugh.gobber2.Gobber2;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class SwordEndSniper extends SwordItem
{
	public SwordEndSniper(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings)
	{
		super(toolMaterial, attackDamage, attackSpeed, settings);
	}
	
	static int cooldown = Gobber2.getConfig().TOOLS.swordSniperCooldoown;
	
	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand)
	{
		ItemStack stack = player.getStackInHand(hand);

		player.getItemCooldownManager().set(this, cooldown);
		
        if (!world.isClient)
        {			
            ArrowItem itemarrow = (ArrowItem)Items.ARROW;
            PersistentProjectileEntity persistentProjectileEntity = itemarrow.createArrow(world, new ItemStack(Items.ARROW), player);
            float arrowVelocity = 60.0F;
            persistentProjectileEntity.setProperties(player, player.pitch, player.yaw, 0.0F, arrowVelocity, 0.0F);
            persistentProjectileEntity.setDamage(1);
            world.spawnEntity(persistentProjectileEntity);
            persistentProjectileEntity.pickupType = persistentProjectileEntity.pickupType.DISALLOWED;
        }
		
		return TypedActionResult.success(stack);
	}
	
	@Override
	public void onCraft(ItemStack stack, World world, PlayerEntity player) 
	{
		stack.getOrCreateTag().putBoolean("Unbreakable", true);
	}
	
	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) 
	{
	    tooltip.add(new TranslatableText("item.gobber2.gobber2_staff_sniper.tip1").formatted(Formatting.GREEN));
	}  
}