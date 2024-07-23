package org.teamvoided.dwarf_forged

import net.fabricmc.loader.api.FabricLoader
import net.minecraft.util.Identifier
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.teamvoided.dwarf_forged.init.*

@Suppress("unused")
object DwarfForged {
    const val MODID = "dwarf_forged"

    @JvmField
    val log: Logger = LoggerFactory.getLogger(DwarfForged::class.simpleName)

    fun init() {
        log.info("Hello from Common")
        DFItems.init()
        DFBlocks.init()
        DFTabs.init()
        DFBiomeModifiers.init()
    }

    fun id(path: String) = Identifier.of(MODID, path)
    fun id(namespace: String,path: String) = Identifier.of(namespace, path)

    fun isDev(): Boolean = FabricLoader.getInstance().isDevelopmentEnvironment
}
