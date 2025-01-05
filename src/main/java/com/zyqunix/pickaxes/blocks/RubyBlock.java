package com.zyqunix.pickaxes.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends BlockBase {
    public RubyBlock(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.STONE);
        setHardness(5.0f);
        setResistance(6.0f);
        setHarvestLevel("pickaxe", 2);

        /*
        setLightOpacity(0);
        setBlockUnbreakable();
         */
    }
}
