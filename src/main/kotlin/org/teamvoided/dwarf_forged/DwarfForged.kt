package org.teamvoided.dwarf_forged

import net.minecraft.util.Identifier
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.teamvoided.dwarf_forged.init.DFBlocks
import org.teamvoided.dwarf_forged.init.DFItems

@Suppress("unused")
object DwarfForged {
    const val MODID = "dwarf_forged"

    @JvmField
    val log: Logger = LoggerFactory.getLogger(DwarfForged::class.simpleName)

    fun init() {
        log.info("Hello from Common")
        DFBlocks.init()
        DFItems.init()
    }

    fun id(path: String) = Identifier.of(MODID, path)
}
