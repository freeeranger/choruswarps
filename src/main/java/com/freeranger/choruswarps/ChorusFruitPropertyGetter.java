package com.freeranger.choruswarps;

import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.IItemPropertyGetter;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class ChorusFruitPropertyGetter implements IItemPropertyGetter {

    @Override
    public float call(ItemStack stack, @Nullable ClientWorld worldIn, @Nullable LivingEntity entityIn)
    {
        if(stack.getTag() == null){
            return 0f;
        }
        return stack.getTag().contains("linked_x") ? 1f : 0f;
    }
}
