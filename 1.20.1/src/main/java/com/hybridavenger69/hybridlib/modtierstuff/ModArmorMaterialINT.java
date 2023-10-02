package com.hybridavenger69.hybridlib.modtierstuff;

import net.minecraft.world.entity.EquipmentSlot;

public interface ModArmorMaterialINT {
    int getDurabilityForSlot(EquipmentSlot slot);

    int getDefenseForSlot(EquipmentSlot slot);
}
