package com.hybridavenger69.hybridlib.registry;

import com.hybridavenger69.hybridlib.HybridLib;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.hybridavenger69.hybridlib.registry.BlockRegistry.*;

public class ItemRegistry {

    private static Object HybridLib;
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, com.hybridavenger69.hybridlib.HybridLib.MODID);

    //ORE ITEMS

    public static final RegistryObject<Item> TECH_ORE_ITEM = ITEMS.register("tech_ore", () -> new BlockItem(TECH_ORE.get(), new Item.Properties()));
    public static final RegistryObject<Item> DEEPSLATE_TECH_ORE_ITEM = ITEMS.register("deepslate_tech_ore", () -> new BlockItem(DEEPSLATE_TECH_ORE.get(), new Item.Properties()));

    //ITEMS
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
