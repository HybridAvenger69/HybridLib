package com.hybridavenger69.lib.main;

import com.hybridavenger69.lib.Lib;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Lib.MOD_ID);

    public static final RegistryObject<Item> NETHER_INGOT = ITEMS.register("nether_ingot",
            () -> new Item(new Item.Properties().tab(MtGroup.MT_TAB)));


    public static final RegistryObject<Item> TECH_INGOT = ITEMS.register("tech_ingot",
            () -> new Item(new Item.Properties().tab(MtGroup.MT_TAB)));

    public static final RegistryObject<Item> EUCLASE_GEM = ITEMS.register("euclase_gem",
            () -> new Item(new Item.Properties().tab(MtGroup.MT_TAB)));

    public static void register(IEventBus eventbus){

        ITEMS.register(eventbus);
    }
}
