package org.teamvoided.dwarf_forged.data.worldgen.ore

import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.world.gen.feature.ConfiguredFeature
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.key

object DFCfgOres {

    val ORE_RUBY_SMALL = create("ore_ruby_small")
    val ORE_RUBY_MEDIUM = create("ore_ruby_medium")
    val ORE_RUBY_LARGE = create("ore_ruby_large")
    val ORE_RUBY_BURIED = create("ore_ruby_buried")

//    val ORE_DIAMOND_SMALL = ConfiguredFeatureUtil.getRegistryKey("ore_diamond_small")
//    val ORE_DIAMOND_MEDIUM = ConfiguredFeatureUtil.getRegistryKey("ore_diamond_medium")
//    val ORE_DIAMOND_LARGE = ConfiguredFeatureUtil.getRegistryKey("ore_diamond_large")
//    val ORE_DIAMOND_BURIED = ConfiguredFeatureUtil.getRegistryKey("ore_diamond_buried")

    private fun create(id: String): RegistryKey<ConfiguredFeature<*, *>> = RegistryKeys.CONFIGURED_FEATURE.key(id(id))
}