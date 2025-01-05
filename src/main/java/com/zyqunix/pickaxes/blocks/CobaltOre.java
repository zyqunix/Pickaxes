package com.zyqunix.pickaxes.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class CobaltOre extends BlockBase {
    public CobaltOre(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.STONE);
        setHardness(3.0f);
        setResistance(3.0f);
        setHarvestLevel("pickaxe", 3);
    }

    /*
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return ModItems.RUBY;
    }

    @Override
    public int quantityDropped(Random rand) {
        int max = 2;
        int min = 1;
        return rand.nextInt(max)+min;
    }
     */
}
