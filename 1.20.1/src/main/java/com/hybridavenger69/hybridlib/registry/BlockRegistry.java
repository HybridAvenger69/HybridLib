package com.hybridavenger69.hybridlib.registry;

import com.hybridavenger69.hybridlib.HybridLib;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, HybridLib.MODID);

    //Ore
    public static final RegistryObject<DropExperienceBlock> TECH_ORE = BLOCKS.register("tech_ore",
            () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.copy(Blocks.IRON_ORE),
                    UniformInt.of(4, 7)
            ));

    public static final RegistryObject<DropExperienceBlock> DEEPSLATE_TECH_ORE = BLOCKS.register("deepslate_tech_ore",
            () -> new DropExperienceBlock(
                    BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE),
                    UniformInt.of(4, 9)
            ));

    //Blocks
    public static final RegistryObject<Block> NETHER_STAR_BLOCK = BLOCKS.register("nether_star_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));


    //public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));


}
