package org.teamvoided.dwarf_forged.data.worldgen.ore

import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.world.gen.feature.ConfiguredFeature
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.key

object DFCfgOres {


    // Normal Ores
    val ORE_JADE_SMALL = ore("ore_jade_small")
    val ORE_JADE_MEDIUM = ore("ore_jade_medium")

    val ORE_EUCLASE_SMALL = ore("ore_euclase_small")
    val ORE_EUCLASE_MEDIUM = ore("ore_euclase_medium")

    val ORE_BORACITE_SMALL = ore("ore_boracite_small")
    val ORE_BORACITE_MEDIUM = ore("ore_boracite_medium")

    val ORE_TOPAZ_SMALL = ore("ore_topaz_small")
    val ORE_TOPAZ_MEDIUM = ore("ore_topaz_medium")

    val ORE_TOURMALINE_SMALL = ore("ore_tourmaline_small")
    val ORE_TOURMALINE_MEDIUM = ore("ore_tourmaline_medium")

    val ORE_SPINEL_SMALL = ore("ore_spinel_small")
    val ORE_SPINEL_MEDIUM = ore("ore_spinel_medium")

    val ORE_HEMATITE_SMALL = ore("ore_hematite_small")
    val ORE_HEMATITE_MEDIUM = ore("ore_hematite_medium")

    val ORE_CARNELIAN_SMALL = ore("ore_carnelian_small")
    val ORE_CARNELIAN_MEDIUM = ore("ore_carnelian_medium")


    /*

        // Small, medium (max lvl 24)
        Jade (in jungles & lush caves)
        Euclase (all taigas)
        Boracite (plains & forest)
        Topaz (warm biomes)
        Tourmaline (cold biomes)
        spinel (chery grove & mushroom islands)
        Hematite (deep dark & deep ocean)
        Carnelian (dropstone caves)

        //small, large (mas lvl 10)
        Ruby (low down in dry biomes)
        Sapphire (low down in cold biomes)
        Kyanite (low in mountains)

        // same as quartz
        Smoky quartz (all nether)

        // small, medium (max lvl 100, min lvl 35)
        Moonstone (surface level all biomes)
     */

    private fun ore(id: String): RegistryKey<ConfiguredFeature<*, *>> =
        RegistryKeys.CONFIGURED_FEATURE.key(id("ore/$id"))
}