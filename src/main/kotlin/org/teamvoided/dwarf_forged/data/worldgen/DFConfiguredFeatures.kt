package org.teamvoided.dwarf_forged.data.worldgen

import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.world.gen.feature.ConfiguredFeature
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.key

object DFConfiguredFeatures {

    val BLUE_SKY_GEODE = create("blue_sky_geode")
    val CITRINE_GEODE = create("citrine_geode")


    val PUMICE = rock("pumice")
    val MARBLE = rock("marble")
    val BLAIRMORITE = rock("blairmorite")
    val PYROXENITE = rock("pyroxenite")
    val ARGILLITE = rock("argillite")
    val MUDROCK = rock("mudrock")
    val BLUE_SCHIST = rock("blue_schist")
    val VARIOLITE = rock("variolite")

//    Pumice (nether)

//    Marble (dark forest & dark grove)
//    Mudrock (lush caves and swamps)

//    Blue schist (everywehre and high)

//    Blairmorite (jungles & lush)
//    Pyroxenite (everywhere)
//    Argillite (cold biomes)
//    Variolite (not cold)



    private fun create(id: String): RegistryKey<ConfiguredFeature<*, *>> = RegistryKeys.CONFIGURED_FEATURE.key(id(id))
    private fun rock(id: String) = create("rock/$id")
}