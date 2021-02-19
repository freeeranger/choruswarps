package com.freeranger.choruswarps;

import com.freeranger.choruswarps.core.ModItems;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class StartupClientOnly {
    @SubscribeEvent
    public static void onClientSetupEvent(FMLClientSetupEvent event) {
        event.enqueueWork(StartupClientOnly::registerPropertyOverride);
    }

    public static void registerPropertyOverride() {
        ItemModelsProperties.registerProperty(ModItems.GOLDEN_CHORUS_FRUIT.get(),
                new ResourceLocation("choruswarps:linked"), new ChorusFruitPropertyGetter());
        ItemModelsProperties.registerProperty(ModItems.ENCHANTED_GOLDEN_CHORUS_FRUIT.get(),
                new ResourceLocation("choruswarps:linked"), new ChorusFruitPropertyGetter());
    }
}
