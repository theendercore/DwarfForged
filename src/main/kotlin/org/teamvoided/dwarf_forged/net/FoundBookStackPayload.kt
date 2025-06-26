package org.teamvoided.dwarf_forged.net

import net.minecraft.item.ItemStack
import net.minecraft.network.RegistryByteBuf
import net.minecraft.network.codec.PacketCodec
import net.minecraft.network.packet.payload.CustomPayload
import org.teamvoided.dwarf_forged.DwarfForged.id

class FoundBookStackPayload(val stack: ItemStack) : CustomPayload {
    constructor(buf: RegistryByteBuf) : this(ItemStack.OPTIONAL_PACKET_CODEC.decode(buf))

    override fun getId() = ID
    fun write(buf: RegistryByteBuf) {
        ItemStack.OPTIONAL_PACKET_CODEC.encode(buf, this.stack)
    }

    companion object {
        val CODEC: PacketCodec<RegistryByteBuf, FoundBookStackPayload> =
            CustomPayload.create<RegistryByteBuf, FoundBookStackPayload>(FoundBookStackPayload::write, ::FoundBookStackPayload)
        val ID = CustomPayload.Id<FoundBookStackPayload>(id("fetch_book_stack_payload"))
    }
}