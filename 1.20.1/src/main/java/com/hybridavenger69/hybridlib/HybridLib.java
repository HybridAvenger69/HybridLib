package com.hybridavenger69.hybridlib;

import com.hybridavenger69.hybridlib.registry.BlockRegistry;
import com.hybridavenger69.hybridlib.registry.ItemRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.hybridavenger69.hybridlib.registry.ItemRegistry.*;
import static com.hybridavenger69.hybridlib.registry.ItemRegistry.NETHER_BLOCK_ITEM;

@Mod(HybridLib.MODID)
public class HybridLib {
    public static final String MODID = "hybridlib";

    public HybridLib() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

       ItemRegistry.ITEMS.register(bus);
       BlockRegistry.BLOCKS.register(bus);
        CREATIVE_MODE_TABS.register(bus);

    }

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);
    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab
    public static final RegistryObject<CreativeModeTab> hybrid_tab = CREATIVE_MODE_TABS.register("hybrid_tab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> NETHER_INGOT.get().getDefaultInstance())
            .title(Component.translatable("item_group." + MODID + ".hybrid_tab"))
            .displayItems((parameters, output) -> {
                output.accept(NETHER_INGOT.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event
                output.accept(TECH_INGOT.get());
                output.accept(RAW_TECH.get());
                output.accept(EUCLASE_GEM.get());
                output.accept(DOUBLE_NETHERITE_INGOT.get());
                output.accept(NETHER_BLOCK_ITEM.get());
                output.accept(TECH_ORE_ITEM.get());
                output.accept(DEEPSLATE_TECH_ORE_ITEM.get());

            }).build());
}