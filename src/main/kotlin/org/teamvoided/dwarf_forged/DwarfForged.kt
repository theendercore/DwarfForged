package org.teamvoided.dwarf_forged

import net.minecraft.util.Identifier
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.teamvoided.dwarf_forged.init.DFNetworking

@Suppress("unused")
object DwarfForged {
    const val MODID = "dwarf_forged"

    @JvmField
    val log: Logger = LoggerFactory.getLogger(DwarfForged::class.simpleName)
    fun init() {
        DFNetworking.init()
    }

    fun id(path: String) = id(MODID, path)
    fun id(namespace: String, path: String): Identifier = Identifier.of(namespace, path)
    fun mc(path: String): Identifier = Identifier.ofDefault(path)
}
