package com.zyqunix.pickaxes.init;

import com.zyqunix.pickaxes.blocks.RubyOre;
import com.zyqunix.pickaxes.blocks.CobaltOre;

import com.zyqunix.pickaxes.blocks.RubyBlock;
import com.zyqunix.pickaxes.blocks.CobaltBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    // Ores
    public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
    public static final Block COBALT_ORE = new CobaltOre("cobalt_ore", Material.ROCK);

    // Blocks
    public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
    public static final Block COBALT_BLOCK = new CobaltBlock("cobalt_block", Material.IRON);
}
