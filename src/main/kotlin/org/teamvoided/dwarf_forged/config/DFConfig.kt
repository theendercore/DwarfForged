package org.teamvoided.dwarf_forged.config

import me.fzzyhmstrs.fzzy_config.config.Config
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.isDev

class DFConfig : Config(id("client")) {
    var onGroundItem = false
    var chiseledMonocle = false
    var currentBiome = false
    var redstoneInfo = false
    @JvmField
    var paciFist = false
    var speedometer = false
    var armorToughness = false
    var spawnerInfo = false
    var lavaGoogles = false
    var xzCoords = false
    var yCoords = false
    var barometer = false

    @JvmField
    var debug = isDev()
}