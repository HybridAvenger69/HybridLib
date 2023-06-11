package com.hybridavenger69.hybridlib.registry;

import com.hybridavenger69.hybridlib.HybridLib;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.hybridavenger69.hybridlib.HybridLib.ITEMS;
import static net.minecraft.world.item.Items.registerBlock;


public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, HybridLib.MOD_ID);

    public static final RegistryObject<Block> NETHER_STAR_BLOCK = BLOCKS.register("nether_star_block",
            () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.STONE)));

}
