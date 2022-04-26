package com.hybridavenger69.lib.main;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class MtGroup {

    public static  final ItemGroup MT_GROUP = new ItemGroup("mtTab") {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ItemRegistry.NETHER_INGOT.get());
        }
    };


}
