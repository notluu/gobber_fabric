package com.kwpugh.gobber2.init;

import com.kwpugh.gobber2.Gobber2;
import com.kwpugh.gobber2.blocks.ModGlass;
import com.kwpugh.gobber2.blocks.OreGobber;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricMaterialBuilder;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.MaterialColor;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockInit
{
	public static final Block GOBBER2_LUCKY_BLOCK = new OreBlock(FabricBlockSettings.of(new FabricMaterialBuilder(MaterialColor.STONE).build()).breakByTool(FabricToolTags.PICKAXES, 2).strength(1.0F, 1.0F));
	
	public static final Block GOBBER2_ORE = new OreGobber(FabricBlockSettings.of(new FabricMaterialBuilder(MaterialColor.STONE).build()).breakByTool(FabricToolTags.PICKAXES, 3).strength(2.0F, 2.0F));	
	public static final Block GOBBER2_ORE_NETHER = new OreBlock(FabricBlockSettings.of(new FabricMaterialBuilder(MaterialColor.STONE).build()).breakByTool(FabricToolTags.PICKAXES, 4).strength(2.0F, 2.0F));
	public static final Block GOBBER2_ORE_END = new OreBlock(FabricBlockSettings.of(new FabricMaterialBuilder(MaterialColor.STONE).build()).breakByTool(FabricToolTags.PICKAXES, 5).strength(2.0F, 2.0F));
	
	public static final Block GOBBER2_BLOCK = new Block(FabricBlockSettings.of(new FabricMaterialBuilder(MaterialColor.STONE).build()).strength(2.0F, 2.0F));
	public static final Block GOBBER2_BLOCK_NETHER = new Block(FabricBlockSettings.of(new FabricMaterialBuilder(MaterialColor.STONE).build()).strength(2.0F, 2.0F));
	public static final Block GOBBER2_BLOCK_END = new Block(FabricBlockSettings.of(new FabricMaterialBuilder(MaterialColor.STONE).build()).strength(2.0F, 2.0F));
	
	public static final Block GOBBER2_GLASS = new ModGlass(FabricBlockSettings.of(new FabricMaterialBuilder(MaterialColor.STONE).build()).luminance(15).nonOpaque().strength(2.0F, 2.0F));
	public static final Block GOBBER2_GLASS_NETHER = new ModGlass(FabricBlockSettings.of(new FabricMaterialBuilder(MaterialColor.STONE).build()).luminance(15).nonOpaque().strength(2.0F, 2.0F));
	public static final Block GOBBER2_GLASS_END = new ModGlass(FabricBlockSettings.of(new FabricMaterialBuilder(MaterialColor.STONE).build()).luminance(15).nonOpaque().strength(2.0F, 2.0F));
	
	public static void registerBlocks()
	{
		{
			Registry.register(Registry.BLOCK, new Identifier(Gobber2.MOD_ID, "gobber2_lucky_block"), GOBBER2_LUCKY_BLOCK);
			
			Registry.register(Registry.BLOCK, new Identifier(Gobber2.MOD_ID, "gobber2_ore"), GOBBER2_ORE);
			Registry.register(Registry.BLOCK, new Identifier(Gobber2.MOD_ID, "gobber2_ore_nether"), GOBBER2_ORE_NETHER);
			Registry.register(Registry.BLOCK, new Identifier(Gobber2.MOD_ID, "gobber2_ore_end"), GOBBER2_ORE_END);
			
			Registry.register(Registry.BLOCK, new Identifier(Gobber2.MOD_ID, "gobber2_block"), GOBBER2_BLOCK);
			Registry.register(Registry.BLOCK, new Identifier(Gobber2.MOD_ID, "gobber2_block_nether"), GOBBER2_BLOCK_NETHER);
			Registry.register(Registry.BLOCK, new Identifier(Gobber2.MOD_ID, "gobber2_block_end"), GOBBER2_BLOCK_END);
			
			Registry.register(Registry.BLOCK, new Identifier(Gobber2.MOD_ID, "gobber2_glass"), GOBBER2_GLASS);
			Registry.register(Registry.BLOCK, new Identifier(Gobber2.MOD_ID, "gobber2_glass_nether"), GOBBER2_GLASS_NETHER);
			Registry.register(Registry.BLOCK, new Identifier(Gobber2.MOD_ID, "gobber2_glass_end"), GOBBER2_GLASS_END);
		}
	}
	
	public static void registerBlockItems()
	{
		{
			Registry.register(Registry.ITEM, new Identifier(Gobber2.MOD_ID, "gobber2_lucky_block"), new BlockItem(GOBBER2_LUCKY_BLOCK, new Item.Settings().group(Gobber2.GOBBER2_GROUP)));
			
			Registry.register(Registry.ITEM, new Identifier(Gobber2.MOD_ID, "gobber2_ore"), new BlockItem(GOBBER2_ORE, new Item.Settings().group(Gobber2.GOBBER2_GROUP)));
			Registry.register(Registry.ITEM, new Identifier(Gobber2.MOD_ID, "gobber2_ore_nether"), new BlockItem(GOBBER2_ORE_NETHER, new Item.Settings().group(Gobber2.GOBBER2_GROUP)));
			Registry.register(Registry.ITEM, new Identifier(Gobber2.MOD_ID, "gobber2_ore_end"), new BlockItem(GOBBER2_ORE_END, new Item.Settings().group(Gobber2.GOBBER2_GROUP)));
			
			Registry.register(Registry.ITEM, new Identifier(Gobber2.MOD_ID, "gobber2_block"), new BlockItem(GOBBER2_BLOCK, new Item.Settings().group(Gobber2.GOBBER2_GROUP)));
			Registry.register(Registry.ITEM, new Identifier(Gobber2.MOD_ID, "gobber2_block_nether"), new BlockItem(GOBBER2_BLOCK_NETHER, new Item.Settings().group(Gobber2.GOBBER2_GROUP)));
			Registry.register(Registry.ITEM, new Identifier(Gobber2.MOD_ID, "gobber2_block_end"), new BlockItem(GOBBER2_BLOCK_END, new Item.Settings().group(Gobber2.GOBBER2_GROUP)));
			
			Registry.register(Registry.ITEM, new Identifier(Gobber2.MOD_ID, "gobber2_glass"), new BlockItem(GOBBER2_GLASS, new Item.Settings().group(Gobber2.GOBBER2_GROUP)));
			Registry.register(Registry.ITEM, new Identifier(Gobber2.MOD_ID, "gobber2_glass_nether"), new BlockItem(GOBBER2_GLASS_NETHER, new Item.Settings().group(Gobber2.GOBBER2_GROUP)));
			Registry.register(Registry.ITEM, new Identifier(Gobber2.MOD_ID, "gobber2_glass_end"), new BlockItem(GOBBER2_GLASS_END, new Item.Settings().group(Gobber2.GOBBER2_GROUP)));
		}
	}
	
	public static void registerBlockEntities()
	{
		// Register block entities here
	}
}
