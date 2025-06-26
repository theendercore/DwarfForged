package org.teamvoided.dwarf_forged.client.init

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking
import org.teamvoided.dwarf_forged.client.widgets.WidgetRenderer
import org.teamvoided.dwarf_forged.net.FoundBookStackPayload

object DFClientNetworking {
    fun init() {
        ClientPlayNetworking.registerGlobalReceiver(FoundBookStackPayload.ID, ::fetchBook)
    }

    fun fetchBook(packet: FoundBookStackPayload, ctx: ClientPlayNetworking.Context) {
        WidgetRenderer.Data.bookshelfStack = packet.stack
    }
}
