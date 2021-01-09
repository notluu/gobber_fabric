package com.kwpugh.gobber2.world;

import com.kwpugh.gobber2.init.BlockInit;

import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class OreGen
{	
	public static ConfiguredFeature<?, ?> ORE_GOBBER_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.GOBBER2_ORE.getDefaultState(),
			  9)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  0, // min y level
			  60))) // max y level
			.spreadHorizontally()
			.repeat(25); // number of veins per chunk	
	
	public static ConfiguredFeature<?, ?> ORE_GOBBER_NETHER = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_NETHER,
			  BlockInit.GOBBER2_ORE_NETHER.getDefaultState(),
			  9)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  0, // min y level
			  120))) // max y level
			.spreadHorizontally()
			.repeat(25); // number of veins per chunk		
	
	public static ConfiguredFeature<?, ?> ORE_GOBBER_THEEND = Feature.ORE
		    .configure(new OreFeatureConfig(
		      new BlockMatchRuleTest(Blocks.END_STONE), // base block is endstone in the end biomes
		      BlockInit.GOBBER2_ORE_END.getDefaultState(),
		      9))
		    .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
		      0,
		      0,
		      180)))
		    .spreadHorizontally()
		    .repeat(25);
	
	public static ConfiguredFeature<?, ?> ORE_LUCKY_BLOCK_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
			  OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
			  BlockInit.GOBBER2_LUCKY_BLOCK.getDefaultState(),
			  4)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
			  0, // bottom offset
			  0, // min y level
			  120))) // max y level
			.spreadHorizontally()
			.repeat(15); // number of veins per chunk	
}
