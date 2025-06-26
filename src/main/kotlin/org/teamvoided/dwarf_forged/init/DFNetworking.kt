package org.teamvoided.dwarf_forged.init

import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking
import net.minecraft.block.entity.ChiseledBookshelfBlockEntity
import org.teamvoided.dwarf_forged.net.FetchBookStackPayload
import org.teamvoided.dwarf_forged.net.FoundBookStackPayload

object DFNetworking {
    fun init() {
        // Packets
        PayloadTypeRegistry.playC2S().register(FetchBookStackPayload.ID, FetchBookStackPayload.CODEC)
        PayloadTypeRegistry.playS2C().register(FoundBookStackPayload.ID, FoundBookStackPayload.CODEC)

        // Listeners
        ServerPlayNetworking.registerGlobalReceiver(FetchBookStackPayload.ID, ::fetchBook)
    }

    fun fetchBook(packet: FetchBookStackPayload, ctx: ServerPlayNetworking.Context) {
        val world = ctx.player().world ?: return
        val bookshelf = world.getBlockEntity(packet.pos) ?: return
        if (bookshelf !is ChiseledBookshelfBlockEntity) return

        val stack = bookshelf.getStack(packet.slot)
        if (stack.isEmpty) return

        ServerPlayNetworking.send(ctx.player(), FoundBookStackPayload(stack))
    }
}
