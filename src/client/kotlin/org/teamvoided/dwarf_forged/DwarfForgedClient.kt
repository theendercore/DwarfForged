package org.teamvoided.dwarf_forged

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.minecraft.client.render.RenderLayer
import org.teamvoided.dwarf_forged.DwarfForged.log
import org.teamvoided.dwarf_forged.util.DFBlockLists.CRYSTALS

@Suppress("unused")
object DwarfForgedClient{
    fun init() {
        log.info("Hello from Client")
        CRYSTALS.forEach{ BlockRenderLayerMap.INSTANCE.putBlock(it, RenderLayer.getCutout()) }
    }
}
