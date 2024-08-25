package org.teamvoided.dwarf_forged

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap
import net.minecraft.client.render.RenderLayer
import org.teamvoided.dwarf_forged.util.datage.CUTOUT_BLOCKS

@Suppress("unused")
object DwarfForgedClient{
    fun init() {
        CUTOUT_BLOCKS.forEach{ BlockRenderLayerMap.INSTANCE.putBlock(it, RenderLayer.getCutout()) }
    }
}
