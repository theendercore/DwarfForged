package org.teamvoided.dwarf_forged.data.worldgen.ore

import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.world.gen.feature.PlacedFeature
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.key

object DFPlacedOres {

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

    // Deep Ores
    val ORE_RUBY_SMALL = ore("ore_ruby_small")
    val ORE_RUBY_LARGE = ore("ore_ruby_large")

    val ORE_SAPPHIRE_SMALL = ore("ore_sapphire_small")
    val ORE_SAPPHIRE_LARGE = ore("ore_sapphire_large")

    val ORE_KYANITE_SMALL = ore("ore_kyanite_small")
    val ORE_KYANITE_LARGE = ore("ore_kyanite_large")

    // Quartz
    val ORE_SMOKY_QUARTZ = ore("ore_smoky_quartz")
    val ORE_SMOKY_QUARTZ_DELTA = ore("ore_smoky_quartz_delta")

    // Surface
    val ORE_MOONSTONE_SMALL = ore("ore_moonstone_small")
    val ORE_MOONSTONE_MEDIUM = ore("ore_moonstone_medium")
    val ORE_MOONSTONE_DEEP = ore("ore_moonstone_deep")
    
    private fun ore(id: String): RegistryKey<PlacedFeature> = RegistryKeys.PLACED_FEATURE.key(id("ore/$id"))
}