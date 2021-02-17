package com.freeranger.choruswarps;

import com.freeranger.choruswarps.core.Registration;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(com.freeranger.choruswarps.ChorusWarps.MOD_ID)
public class ChorusWarps {
    public static final String MOD_ID = "choruswarps";

    public ChorusWarps() {
        Registration.register();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
