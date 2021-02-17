package com.freeranger.choruswarps.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EnchantedGoldenChorusFruitItem extends GoldenChorusFruitItem{
    public EnchantedGoldenChorusFruitItem(Properties builder) {
        super(builder);
    }

    @Override
    ItemStack returnIfTeleportSuccessful(LivingEntity entityLiving, World worldIn, ItemStack stack){
        return stack;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
}
