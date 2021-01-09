package com.kwpugh.more_gems.init;

import com.kwpugh.more_gems.enchantments.PoisonBladeEnchantment;
import com.kwpugh.more_gems.enchantments.RazorSharpnessEnchantment;
import com.kwpugh.more_gems.enchantments.UntouchableEnchantment;

import net.minecraft.enchantment.DamageEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.ThornsEnchantment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEnchantmentsInit
{
	public static final DamageEnchantment RAZOR_SHARPNESS = new RazorSharpnessEnchantment(Enchantment.Rarity.COMMON, 0, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final DamageEnchantment POISON_BLADE = new PoisonBladeEnchantment(Enchantment.Rarity.COMMON, 0, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
	public static final ThornsEnchantment UNTOUCHABLE = new UntouchableEnchantment(Enchantment.Rarity.COMMON, new EquipmentSlot[]{EquipmentSlot.CHEST});

	public static void registerEnchantments()
	{
		Registry.register(Registry.ENCHANTMENT, new Identifier("more_gems", "razor_sharpness"), RAZOR_SHARPNESS);
		Registry.register(Registry.ENCHANTMENT, new Identifier("more_gems", "poison_blade"), POISON_BLADE);
		Registry.register(Registry.ENCHANTMENT, new Identifier("more_gems", "untouchable"), UNTOUCHABLE);
	}
}
