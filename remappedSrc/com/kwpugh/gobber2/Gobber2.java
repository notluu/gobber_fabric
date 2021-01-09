package com.kwpugh.gobber2;

import com.kwpugh.gobber2.config.Gobber2Config;
import com.kwpugh.gobber2.init.BlockInit;
import com.kwpugh.gobber2.init.ItemInit;
import com.kwpugh.gobber2.util.FuelUtil;
import com.kwpugh.gobber2.world.ModConfiguredFeatures;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.GsonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotTypeInfo;
import top.theillusivec4.curios.api.SlotTypePreset;

public class Gobber2 implements ModInitializer
{
	public static final String MOD_ID = "gobber2";
	public static final Gobber2 INSTANCE = new Gobber2();
	public static final ItemGroup GOBBER2_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "gobber2_group"), () -> new ItemStack(ItemInit.GOBBER2_SWORD_NETHER));
	  
    @Override
    public void onInitialize()
    {
    	AutoConfig.register(Gobber2Config.class, GsonConfigSerializer::new);

    	BlockInit.registerBlocks();
    	BlockInit.registerBlockItems();

    	ItemInit.registerItems();

    	ModConfiguredFeatures.Features();
    	
    	FuelUtil.init();
	
    	CuriosApi.enqueueSlotType(SlotTypeInfo.BuildScheme.REGISTER, SlotTypePreset.RING.getInfoBuilder().size(4).build());
    	CuriosApi.enqueueSlotType(SlotTypeInfo.BuildScheme.REGISTER, SlotTypePreset.BELT.getInfoBuilder().size(2).build());
    }

    public static Gobber2Config getConfig()
    {
        return AutoConfig.getConfigHolder(Gobber2Config.class).getConfig();
    }
}