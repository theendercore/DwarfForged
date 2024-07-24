package org.teamvoided.dwarf_forged.data.worldgen.ore

import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.world.gen.feature.PlacedFeature
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.key

object DFPlacedOres {

    // Normal Ores
    val ORE_JADE_SMALL = create("ore_jade_small")
    val ORE_JADE_MEDIUM = create("ore_jade_medium")

    val ORE_EUCLASE_SMALL = create("ore_euclase_small")
    val ORE_EUCLASE_MEDIUM = create("ore_euclase_medium")

    val ORE_BORACITE_SMALL = create("ore_boracite_small")
    val ORE_BORACITE_MEDIUM = create("ore_boracite_medium")

    val ORE_TOPAZ_SMALL = create("ore_topaz_small")
    val ORE_TOPAZ_MEDIUM = create("ore_topaz_medium")

    val ORE_TOURMALINE_SMALL = create("ore_tourmaline_small")
    val ORE_TOURMALINE_MEDIUM = create("ore_tourmaline_medium")

    val ORE_SPINEL_SMALL = create("ore_spinel_small")
    val ORE_SPINEL_MEDIUM = create("ore_spinel_medium")

    val ORE_HEMATITE_SMALL = create("ore_hematite_small")
    val ORE_HEMATITE_MEDIUM = create("ore_hematite_medium")

    val ORE_CARNELIAN_SMALL = create("ore_carnelian_small")
    val ORE_CARNELIAN_MEDIUM = create("ore_carnelian_medium")


    private fun create(id: String): RegistryKey<PlacedFeature> = RegistryKeys.PLACED_FEATURE.key(id("ore/$id"))
}