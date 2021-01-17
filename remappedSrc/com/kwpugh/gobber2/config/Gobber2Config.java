package com.kwpugh.gobber2.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.serializer.PartitioningSerializer;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;

@Config(name = "gobber2")
public class Gobber2Config extends PartitioningSerializer.GlobalData 
{
    public Ores ORES = new Ores();
    public General GENERAL = new General();
    
    @Config(name = "ores")
    public static class Ores implements ConfigData 
    {
	    @Comment("***********************"
	    		+"\nGobber Ore"
	    		+"\n***********************") 
	    public boolean gobberEnable = true;
	    public int gobberVeinSize = 4;
    	public int gobberMinLevel = 0;
    	public int gobberMaxLevel = 30;
    	public int gobberPerChunk = 20;
    	
        @Comment("***********************"
	    		+"\nNether Gobber Ore"
	    		+"\n***********************") 
	    public boolean netherGobberEnable = true;
	    public int netherGobberVeinSize = 9;
    	public int netherGobberMinLevel = 0;
    	public int netherGobberMaxLevel = 120;
    	public int netherGobberPerChunk = 25;
    	
        @Comment("***********************"
 	    		+"\nEnd Gobber Ore"
 	    		+"\n***********************") 
 	    public boolean endGobberEnable = true;
 	    public int endGobberVeinSize = 9;
     	public int endGobberMinLevel = 0;
     	public int endGobberMaxLevel = 180;
     	public int endGobberPerChunk = 25;
     	
        @Comment("***********************"
 	    		+"\nLucky Block"
 	    		+"\n***********************") 
 	    public boolean luckyEnable = true;
 	    public int luckyVeinSize = 4;
     	public int luckyMinLevel = 0;
     	public int luckyMaxLevel = 120;
     	public int luckyPerChunk = 15;
    }
    
    @Config(name = "general")
    public static class General implements ConfigData 
    {
    	 @Comment("***********************"
 	    		+"\nRings"
 	    		+"\n***********************") 
 		public int ringAttractionRange = 8;
 		public int ringMinerCooldown = 120;
 		public int ringMinerRange = 5;
 		public int ringMinerVerticalRange = 4;
 		public boolean ringMinerDelayedBreak = false;
 		public int ringBlinkDistance = 100;
 		public int ringBlinkCooldown = 120;
 		public int ringExplorerCooldown = 240;
 		public int ringExplorerMin = 5000;
		public int ringExplorerMax = 20000;
 		public int ringFarmerRange = 10;
 		public int ringFarmerInterval = 180;
 		public int ringAboveCooldown = 120;
 		public int ringRepairInterval = 120;
 		public double ringDismissalRange = 8;
 		public double ringDismissalVelocity = 0.2D;
 		public double ringDismissalLift = 1.5D;
 		public double ringTravelerLaunch = 3.0;
 		public double ringTravelerCruising = 0.2;
 		
 		 @Comment("***********************"
  	    		+"\nMedallions"
  	    		+"\n***********************") 
 		public int medallionExpMultiplier = 5;
		
 		 @Comment("***********************"
   	    		+"\nStaffs"
   	    		+"\n***********************") 	 
 		public int staffClearingRange = 11;
 		public int staffSniperCooldown = 240;
 		public int staffFarmerRange = 10;
 		public int staffFarmerInterval = 180;
 		public boolean staffFarmerReplant = true;
 		public boolean staffEnsnarementHotileMobs = false;
 		
 		@Comment("***********************"
	    		+"\nDefender"
	    		+"\n***********************") 
 		public int defenseRadius = 16;
		public int defenseLevel = 1;
		
		@Comment("***********************"
 	    		+"\nProtector"
 	    		+"\n***********************") 
		public int attackRadius = 16;
		public int damageAmount = 3;
		
		@Comment("***********************"
 	    		+"\nHealer"
 	    		+"\n***********************") 		
		public int healthRadius = 16;
		public int healthLevel = 0;
		public float healthYellowHearts = 20;
		
		@Comment("***********************"
 	    		+"\nGrowth"
 	    		+"\n***********************") 	
		public int growthInterval = 360;
		public int growthRange = 16;
		
		@Comment("***********************"
 	    		+"\nTools"
 	    		+"\n***********************")	
		public int swordSniperCooldoown = 240;
		public boolean enableEndHammer5x5 = true;
		public boolean enableEndExcavator5x5 = true;
		public boolean enableTreeAxe = true;
		public int treeAxeDelayTick = 3;
		public boolean enableHammers = true;
		public boolean enableExcavators = true;
		public boolean enablePaxels = true;
		
		@Comment("***********************"
 	    		+"\nArmors"
 	    		+"\n***********************")	
		public boolean enableGobberPerks = true;
		public boolean enableNetherPerks = true;
		public boolean enableEndPerks = true;
		public boolean enablePhantomProtection = true;
		
		@Comment("***********************"
 	    		+"\nEnchantments"
 	    		+"\n***********************")	
		public boolean enableSmithblade = true;
		public int smithbladeAttackAmount = 2 ;
		public int smithbladeMaxLevel = 5;
		public boolean enableRebuffing = true;
		public int rebuffingMaxLevel = 3;
		public boolean enableFasterObsidian = true;
		public boolean enableUntouchable = true;
		public int untouchableDamage = 8;
		public int untouchableMaxLevel = 3;
		public boolean enableQuickUse = true;

		@Comment("***********************"
 	    		+"\nStatus Effects"
 	    		+"\n***********************")	
		public int KnowledgeBoostXPPerTick = 1 ;
	
		@Comment("***********************"
 	    		+"\nLoot Chests"
 	    		+"\n***********************")
		public boolean lootEnable = true;
		public float lootChance = .04F;

		@Comment("***********************"
 	    		+"\nLucky Block Extra"
 	    		+"\n***********************")
		public boolean enableExtraLoot = false;
		public boolean enableFortune = false;
		
		@Comment("***********************"
 	    		+"\nSpecial Item"
 	    		+"\n***********************")
		public boolean enableSpecialItem = true;
	    
		@Comment("Item provides a one-time random teleport"
	            +"\nand is consumed after successful teleport."
	            +"\nMin/Max range from world spawn to search"
		    	+"\nItem does NOT have a standard recipe") 
		public int specialItemMin = 20000;
		public int specialItemMax = 75000;
    }
}