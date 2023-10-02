package com.hybridavenger69.hybridlib.modtierstuff;

import com.hybridavenger69.hybridlib.registry.ItemRegistry;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

public class ModToolTiers {

    public static class ToolTiers {

        public static final Tier TECH = new ForgeTier(
                2,
                700,
                4.5f,
                3,
                350,
                Tags.Blocks.NEEDS_GOLD_TOOL,
                () -> Ingredient.of(ItemRegistry.TECH_INGOT.get()));

        public static final Tier EUCLASE = new ForgeTier(
                3,
                900,
                8f,
                5,
                700,
                Tags.Blocks.NEEDS_GOLD_TOOL,
                () -> Ingredient.of(ItemRegistry.EUCLASE_GEM.get()));

        public static final Tier ICARUS = new ForgeTier(
                4,
                1800,
                10f,
                8,
                1400,

                Tags.Blocks.NEEDS_GOLD_TOOL,
                () -> Ingredient.of(ItemRegistry.NETHER_INGOT.get()));

        public static final Tier ICARUS2 = new ForgeTier(
                4,
                25000,
                12f,
                10,
                2800,
                Tags.Blocks.NEEDS_GOLD_TOOL,
                () -> Ingredient.of(ItemRegistry.DOUBLE_NETHERITE_INGOT.get()));
    }

    public static class ArmorTiers {
        public static final ArmorMaterial TECH = new ModArmorMaterial(
                "tech",
                500,
                new int[]{20, 40, 50, 10},
                300,
                SoundEvents.ARMOR_EQUIP_DIAMOND,
                0.0f,
                0.0f,
                () -> Ingredient.of(ItemRegistry.TECH_INGOT.get()));

        public static final ArmorMaterial EUCLASE = new ModArmorMaterial(
                "euclase",
                1000,
                new int[]{30, 50, 60, 20},
                600,
                SoundEvents.ARMOR_EQUIP_DIAMOND,
                0.0f,
                0.0f,
                () -> Ingredient.of(ItemRegistry.EUCLASE_GEM.get()));

        public static final ArmorMaterial ICARUS = new ModArmorMaterial(
                "icarus",
                5500,
                new int[]{40, 60, 70, 30},
                1200,
                SoundEvents.ARMOR_EQUIP_DIAMOND,
                0.0f,
                0.0f,
                () -> Ingredient.of(ItemRegistry.NETHER_INGOT.get()));
    }

    public static class WeaponTiers {

        public static final Tier TECH = new ForgeTier(
                2,
                700,
                1.0f,
                5,
                350,
                Tags.Blocks.NEEDS_GOLD_TOOL,
                () -> Ingredient.of(ItemRegistry.TECH_INGOT.get()));

        public static final Tier EUCLASE = new ForgeTier(
                3,
                900,
                1.5f,
                8,
                700,
                Tags.Blocks.NEEDS_GOLD_TOOL,
                () -> Ingredient.of(ItemRegistry.EUCLASE_GEM.get()));

        public static final Tier ICARUS = new ForgeTier(
                4,
                1800,
                2.0f,
                8,
                1400,

                Tags.Blocks.NEEDS_GOLD_TOOL,
                () -> Ingredient.of(ItemRegistry.NETHER_INGOT.get()));

        public static final Tier ICARUS2 = new ForgeTier(
                4,
                25000,
                2.5f,
                10,
                2800,
                Tags.Blocks.NEEDS_GOLD_TOOL,
                () -> Ingredient.of(ItemRegistry.DOUBLE_NETHERITE_INGOT.get()));
    }


}
