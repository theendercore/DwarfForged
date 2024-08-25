package org.teamvoided.dwarf_forged.data.worldgen

import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.world.gen.feature.ConfiguredFeature
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.key

object DFConfiguredFeatures {
    val BLUE_SKY_GEODE = create("blue_sky_geode")

    @Suppress("SameParameterValue")
    private fun create(id: String): RegistryKey<ConfiguredFeature<*, *>> = RegistryKeys.CONFIGURED_FEATURE.key(id(id))
}