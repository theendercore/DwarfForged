package org.teamvoided.dwarf_forged

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.minecraft.client.render.RenderLayer
import org.teamvoided.dwarf_forged.client.init.DFClientNetworking
import org.teamvoided.dwarf_forged.client.widgets.WidgetEvents
import org.teamvoided.dwarf_forged.util.datage.CUTOUT_BLOCKS
import org.teamvoided.dwarf_forged.client.widgets.WidgetRenderer
import org.teamvoided.dwarf_forged.client.widgets.WidgetTicker

@Suppress("unused")
object DwarfForgedClient {
    fun init() {
        DFClientNetworking.init()
        WidgetRenderer.init()
        WidgetTicker.init()
        WidgetEvents.init()
        CUTOUT_BLOCKS.forEach { BlockRenderLayerMap.INSTANCE.putBlock(it, RenderLayer.getCutout()) }
    }
}
