package org.teamvoided.dwarf_forged

import me.fzzyhmstrs.fzzy_config.api.ConfigApi
import org.teamvoided.dwarf_forged.client.init.DFClientNetworking
import org.teamvoided.dwarf_forged.client.widgets.WidgetEvents
import org.teamvoided.dwarf_forged.client.widgets.WidgetRenderer
import org.teamvoided.dwarf_forged.client.widgets.WidgetTicker
import org.teamvoided.dwarf_forged.config.DFConfig

@Suppress("unused")
object DwarfForgedClient {
    @JvmField
    var config = ConfigApi.registerAndLoadConfig(::DFConfig)
    fun init() {
        DFClientNetworking.init()
        WidgetRenderer.init()
        WidgetTicker.init()
        WidgetEvents.init()
    }
}
