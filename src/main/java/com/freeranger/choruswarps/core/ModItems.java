package com.freeranger.choruswarps.core;

import com.freeranger.choruswarps.items.EnchantedGoldenChorusFruitItem;
import com.freeranger.choruswarps.items.GoldenChorusFruitItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> GOLDEN_CHORUS_FRUIT = Registration.ITEMS.register("golden_chorus_fruit", () ->
            new GoldenChorusFruitItem(new Item.Properties().group(ItemGroup.MISC)
                    .food(new Food.Builder()
                            .setAlwaysEdible()
                            .hunger(2)
                            .saturation(2)
                            .build())
            )
    );

    public static final RegistryObject<Item> ENCHANTED_GOLDEN_CHORUS_FRUIT = Registration.ITEMS.register("enchanted_golden_chorus_fruit", () ->
            new EnchantedGoldenChorusFruitItem(new Item.Properties().group(ItemGroup.MISC)
                    .food(new Food.Builder()
                            .setAlwaysEdible()
                            .hunger(2)
                            .saturation(2)
                            .build())
            )
    );

    static void register(){}
}
