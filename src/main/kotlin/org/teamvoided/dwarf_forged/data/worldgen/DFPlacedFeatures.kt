package org.teamvoided.dwarf_forged.data.worldgen

import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.world.gen.feature.PlacedFeature
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.key

object DFPlacedFeatures {

    val BLUE_SKY_GEODE = create("blue_sky_geode")
    val CITRINE_GEODE = create("citrine_geode")



    val PUMICE = rock("pumice")

    // Shallow
    val MARBLE_UPPER = rock("marble_upper")
    val MARBLE_LOWER = rock("marble_lower")

    val MUDROCK_UPPER = rock("mudrock_upper")
    val MUDROCK_LOWER = rock("mudrock_lower")

    // High
    val BLUE_SCHIST_UPPER = rock("blue_schist_upper")
    val BLUE_SCHIST_LOWER = rock("blue_schist_lower")

    // Normal
    val BLAIRMORITE_UPPER = rock("blairmorite_upper")
    val BLAIRMORITE_LOWER = rock("blairmorite_lower")

    val PYROXENITE_UPPER = rock("pyroxenite_upper")
    val PYROXENITE_LOWER = rock("pyroxenite_lower")

    val ARGILLITE_UPPER = rock("argillite_upper")
    val ARGILLITE_LOWER = rock("argillite_lower")

    val VARIOLITE_UPPER = rock("variolite_upper")
    val VARIOLITE_LOWER = rock("variolite_lower")

    private fun create(id: String): RegistryKey<PlacedFeature> = RegistryKeys.PLACED_FEATURE.key(id(id))
    private fun rock(id: String) = create("rock/$id")

}