package org.teamvoided.dwarf_forged.client.widgets

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.minecraft.client.MinecraftClient

object WidgetTicker {
    fun init() = ClientTickEvents.END_CLIENT_TICK.register(::tick)
    fun tick(client: MinecraftClient) {

    }
}