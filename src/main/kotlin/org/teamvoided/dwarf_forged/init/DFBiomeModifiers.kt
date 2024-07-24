package org.teamvoided.dwarf_forged.init

import net.fabricmc.fabric.api.biome.v1.BiomeModifications
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors
import net.fabricmc.fabric.api.biome.v1.ModificationPhase
import org.teamvoided.dwarf_forged.DwarfForged.id


object DFBiomeModifiers {
    fun init() {
        BiomeModifications.create(id("add_ruby_ore_medium"))
            .add(ModificationPhase.ADDITIONS, BiomeSelectors.foundInOverworld()) { it  ->
//                it.generationSettings.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, DFPlacedFeatures.ORE_RUBY_MEDIUM)
            }
    }
}