package com.freeranger.choruswarps;

import com.freeranger.choruswarps.core.Registration;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(com.freeranger.choruswarps.ChorusWarps.MOD_ID)
public class ChorusWarps {
    public static final String MOD_ID = "choruswarps";

    public ChorusWarps() {
        Registration.register();

        final ClientSideRegistrar clientSideRegistrar =
                new ClientSideRegistrar(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> clientSideRegistrar::registerClientOnlyEvents);
    }
}

