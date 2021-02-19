package com.freeranger.choruswarps;

import net.minecraftforge.eventbus.api.IEventBus;

class ClientSideRegistrar {
    private final IEventBus eventBus;

    public ClientSideRegistrar(IEventBus eventBus) {
        this.eventBus = eventBus;
    }

    public void registerClientOnlyEvents() {
        eventBus.register(StartupClientOnly.class);
    }
}
