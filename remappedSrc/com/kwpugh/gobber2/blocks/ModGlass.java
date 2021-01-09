package com.kwpugh.gobber2.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.AbstractGlassBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class ModGlass extends AbstractGlassBlock 
{
	public ModGlass(AbstractBlock.Settings settings) 
	{
		super(settings);
	}
   
	@Deprecated
	@Override
    public int getOpacity(BlockState state, BlockView view, BlockPos pos)
	{
        return super.getOpacity(state, view, pos);
    }
}
