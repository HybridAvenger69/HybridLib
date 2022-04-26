package com.hybridavenger69.lib.main;


import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MtGroup {

    public static final CreativeModeTab MT_TAB = new CreativeModeTab("mt_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemRegistry.NETHER_INGOT.get());
        }
    };
}




