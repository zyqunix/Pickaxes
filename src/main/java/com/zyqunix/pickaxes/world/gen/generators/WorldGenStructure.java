package com.zyqunix.pickaxes.world.gen.generators;

import com.zyqunix.pickaxes.util.IStructure;
import com.zyqunix.pickaxes.util.Reference;
import net.minecraft.block.state.IBlockState;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

import java.util.Random;

public class WorldGenStructure extends WorldGenerator implements IStructure {
    public static String structureName;

    public WorldGenStructure(String name) {
        this.structureName = name;
    }

    @Override
    public boolean generate(World worldIn, Random random, BlockPos position) {
        this.generateStructure(worldIn, position);
        return false;
    }

    public static void generateStructure(World world, BlockPos pos) {
        MinecraftServer mcServer = world.getMinecraftServer();
        TemplateManager manager = worldServer.getStructureTemplateManager();
        ResourceLocation location = new ResourceLocation(Reference.MOD_ID, structureName);
        Template template = manager.get(mcServer, location);

        if (template != null) {
            IBlockState state = world.getBlockState(pos);
            world.notifyBlockUpdate(pos, state, state, 3);
            template.addBlocksToWorld(world, pos, settings);
        }
    }
}