package com.kwpugh.gobber2.lists;

import java.util.function.Supplier;

import com.kwpugh.gobber2.init.ItemInit;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

public enum ArmorMaterialList implements ArmorMaterial
{
	GOBBER("gobber2", 71, new int[]{6, 9, 11, 6}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.5F, 0.10F, () -> {
		return Ingredient.ofItems(ItemInit.GOBBER2_INGOT);
		}),
	GOBBER_NETHER("gobber2_nether", 83, new int[]{7, 10, 12, 7}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.75F, 0.10F, () -> {
		return Ingredient.ofItems(ItemInit.GOBBER2_INGOT_NETHER);
		}),
	GOBBER_END("gobber2_end", 100, new int[]{8, 11, 13, 8}, 30, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F, 0.30F, () -> {
		return Ingredient.ofItems(ItemInit.GOBBER2_INGOT_END);
		});
	
	private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
	private final String name;
	private final int durabilityMultiplier;
	private final int[] protectionAmounts;
	private final int enchantability;
	private final SoundEvent equipSound;
	private final float toughness;
	private final float knockbackResistance;
	private final Lazy<Ingredient> repairIngredientSupplier;

	private ArmorMaterialList(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> supplier)
	{
		this.name = name;
		this.durabilityMultiplier = durabilityMultiplier;
		this.protectionAmounts = protectionAmounts;
		this.enchantability = enchantability;
		this.equipSound = equipSound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredientSupplier = new Lazy(supplier);
	}

	public int getDurability(EquipmentSlot slot)
	{
		return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
	}

	public int getProtectionAmount(EquipmentSlot slot)
	{
		return this.protectionAmounts[slot.getEntitySlotId()];
	}

	public int getEnchantability()
	{
		return this.enchantability;
	}

	public SoundEvent getEquipSound()
	{
		return this.equipSound;
	}

	public Ingredient getRepairIngredient()
	{
		return (Ingredient)this.repairIngredientSupplier.get();
	}

	@Environment(EnvType.CLIENT)
	public String getName()
	{
		return this.name;
	}

	public float getToughness()
	{
		return this.toughness;
	}

	public float getKnockbackResistance()
	{
		return this.knockbackResistance;
	}    
}