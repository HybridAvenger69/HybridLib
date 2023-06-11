package com.hybridavenger69.hybridlib.registry;

import com.hybridavenger69.hybridlib.HybridLib;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.hybridavenger69.hybridlib.registry.BlockRegistry.NETHER_STAR_BLOCK;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, HybridLib.MOD_ID);


    public static final RegistryObject<Item> NETHER_INGOT = ITEMS.register("nether_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NETHER_BLOCK_ITEM = ITEMS.register("nether_block_item",
            () -> new BlockItem(NETHER_STAR_BLOCK.get(), new Item.Properties()));

    public static final RegistryObject<Item> TECH_INGOT = ITEMS.register("tech_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_TECH = ITEMS.register("raw_tech",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> EUCLASE_GEM = ITEMS.register("euclase_gem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DOUBLE_NETHERITE_INGOT = ITEMS.register("double_netherite_ingot",
            () -> new Item(new Item.Properties()));
}
