package com.zyqunix.pickaxes.blocks;

import com.zyqunix.pickaxes.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class RubyOre extends BlockBase {
    public RubyOre(String name, Material material) {
        super(name, material);

        setSoundType(SoundType.STONE);
        setHardness(3.0f);
        setResistance(3.0f);
        setHarvestLevel("pickaxe", 2);
        setLightLevel(5.0f);
    }

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
}
