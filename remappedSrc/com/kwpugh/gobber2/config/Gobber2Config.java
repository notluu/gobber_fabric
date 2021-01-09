package com.kwpugh.gobber2.config;

import com.kwpugh.gobber2.Gobber2;
import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

@Config(name=Gobber2.MOD_ID)
public class Gobber2Config implements ConfigData
{	
	public Rings RINGS = new Rings();
	public Staffs STAFFS = new Staffs();
	public Tools TOOLS = new Tools();
	
	public static class Rings
	{
		public int ringAttractionRange = 8;
		public int ringMinerCooldown = 30;
		public int ringBlinkDistance = 100;
		public int ringBlinkCooldown = 30;
	}
	
	public static class Staffs
	{
		public int staffClearingRange = 11;
		public int staffSniperCooldown = 30;
	}
	
	public static class Tools
	{
		public int swordSniperCooldoown = 30;
	}
}