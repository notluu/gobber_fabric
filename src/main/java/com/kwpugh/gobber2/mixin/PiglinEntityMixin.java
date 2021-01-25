package com.kwpugh.gobber2.mixin;

import org.eclipse.jdt.annotation.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.kwpugh.gobber2.world.Gobber2Dimension;

import net.minecraft.entity.CrossbowUser;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.AbstractPiglinEntity;
import net.minecraft.entity.mob.PiglinEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.LocalDifficulty;
import net.minecraft.world.ServerWorldAccess;
import net.minecraft.world.World;

@Mixin(PiglinEntity.class)
public abstract class PiglinEntityMixin extends AbstractPiglinEntity implements CrossbowUser
{
	public PiglinEntityMixin(EntityType<? extends AbstractPiglinEntity> entityType, World world) 
	{
		super(entityType, world);
	}
  
	@Inject(method="initEquipment",at=@At("TAIL"),cancellable = true)
    private void gobberInitEquipment(LocalDifficulty difficulty, CallbackInfo ci)
    {    	
		RegistryKey<World> registryKey = world.getRegistryKey();
		if(registryKey == Gobber2Dimension.GOBBER_WORLD_KEY2)
		{
		 	this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(Items.GOLDEN_SWORD));
	    	this.equipStack(EquipmentSlot.HEAD, new ItemStack(Items.GOLDEN_HELMET));
	    	this.equipStack(EquipmentSlot.CHEST, new ItemStack(Items.GOLDEN_CHESTPLATE));
	    	this.equipStack(EquipmentSlot.LEGS, new ItemStack(Items.GOLDEN_LEGGINGS));
	    	this.equipStack(EquipmentSlot.FEET, new ItemStack(Items.GOLDEN_BOOTS));	
		}
    }
	    	    
    @Nullable
    @Inject(method="initialize",at=@At("TAIL"),cancellable = true)
    public EntityData initialize(ServerWorldAccess world, LocalDifficulty difficulty, SpawnReason spawnReason, @Nullable EntityData entityData, @Nullable CompoundTag entityTag, CallbackInfoReturnable<EntityData> cir) 
    {
    	this.gobberApplyAttributeModifiers();
    	this.updateEnchantments(difficulty);
    	
    	return super.initialize(world, difficulty, spawnReason, entityData, entityTag);
    }
    
    private void gobberApplyAttributeModifiers() 
    {
		RegistryKey<World> registryKey = world.getRegistryKey();
		if(registryKey == Gobber2Dimension.GOBBER_WORLD_KEY2)
		{
	        this.getAttributeInstance(EntityAttributes.GENERIC_MAX_HEALTH).addPersistentModifier(new EntityAttributeModifier("Gobber Health Bonus", 40.0D, EntityAttributeModifier.Operation.ADDITION));
	        this.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE).addPersistentModifier(new EntityAttributeModifier("Gobber Attack Bonus", 20.0D, EntityAttributeModifier.Operation.ADDITION));
	        this.getAttributeInstance(EntityAttributes.GENERIC_ARMOR).addPersistentModifier(new EntityAttributeModifier("Gobber Armor Bonus", 20.0D, EntityAttributeModifier.Operation.ADDITION));
	        this.getAttributeInstance(EntityAttributes.GENERIC_MOVEMENT_SPEED).addPersistentModifier(new EntityAttributeModifier("Gobber Movement Bonus", 0.05D, EntityAttributeModifier.Operation.ADDITION));
		}     
    }
}