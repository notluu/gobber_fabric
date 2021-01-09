package com.kwpugh.gobber2.lists;

import java.util.function.Supplier;

import com.kwpugh.gobber2.init.ItemInit;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

public enum ToolMaterialList implements ToolMaterial
{
	GOBBER(4, 3800, 9.0F, 1.0F, 20, () -> {
		return Ingredient.ofItems(ItemInit.GOBBER2_INGOT);
		}),
	GOBBER_NETHER(5, 5200, 12.0F, 1.0F, 25, () -> {
		return Ingredient.ofItems(ItemInit.GOBBER2_INGOT_NETHER);
		}),
	GOBBER_END(5, 8000, 14.0F, 1.0F, 30, () -> {
	    return Ingredient.ofItems(ItemInit.GOBBER2_INGOT_END);
	    });
	
   private final int miningLevel;
   private final int itemDurability;
   private final float miningSpeed;
   private final float attackDamage;
   private final int enchantability;
   private final Lazy<Ingredient> repairIngredient;

   private ToolMaterialList(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantibility, Supplier<Ingredient> repairIngredient)
   {
      this.miningLevel = miningLevel;
      this.itemDurability = itemDurability;
      this.miningSpeed = miningSpeed;
      this.attackDamage = attackDamage;
      this.enchantability = enchantibility;
      this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
   }

   public int getDurability()
   {
      return this.itemDurability;
   }

   public float getMiningSpeedMultiplier()
   {
      return this.miningSpeed;
   }

   public float getAttackDamage()
   {
      return this.attackDamage;
   }

   public int getMiningLevel()
   {
      return this.miningLevel;
   }

   public int getEnchantability()
   {
      return this.enchantability;
   }

   public Ingredient getRepairIngredient()
   {
      return (Ingredient)this.repairIngredient.get();
   }
}