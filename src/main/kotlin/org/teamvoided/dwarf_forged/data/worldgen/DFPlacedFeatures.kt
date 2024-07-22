package org.teamvoided.dwarf_forged.data.worldgen

import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.world.gen.feature.ConfiguredFeature
import net.minecraft.world.gen.feature.PlacedFeature
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.key

object DFPlacedFeatures {

    val BLUE_SKY_GEODE = create("blue_sky_geode")

    val ORE_RUBY_SMALL = create("ore_ruby_small")
    val ORE_RUBY_MEDIUM = create("ore_ruby_medium")
    val ORE_RUBY_LARGE = create("ore_ruby_large")
    val ORE_RUBY_BURIED = create("ore_ruby_buried")

    private fun create(id: String): RegistryKey<PlacedFeature> = RegistryKeys.PLACED_FEATURE.key(id(id))
}