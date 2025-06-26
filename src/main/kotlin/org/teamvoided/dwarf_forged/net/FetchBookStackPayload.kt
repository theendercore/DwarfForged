package org.teamvoided.dwarf_forged.net

import net.minecraft.network.PacketByteBuf
import net.minecraft.network.codec.PacketCodec
import net.minecraft.network.packet.payload.CustomPayload
import net.minecraft.util.math.BlockPos
import org.teamvoided.dwarf_forged.DwarfForged.id

class FetchBookStackPayload(val pos: BlockPos, val slot: Int) : CustomPayload {
    constructor(buf: PacketByteBuf) : this(buf.readPos(), buf.readInt())

    override fun getId() = ID
    fun write(buf: PacketByteBuf) {
        buf.writePos(pos)
        buf.writeInt(slot)
    }

    companion object {
        val CODEC: PacketCodec<PacketByteBuf, FetchBookStackPayload> =
            CustomPayload.create(FetchBookStackPayload::write, ::FetchBookStackPayload)
        val ID = CustomPayload.Id<FetchBookStackPayload>(id("fetch_book_stack_payload"))
    }
}