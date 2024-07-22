package org.teamvoided.dwarf_forged.init

import net.fabricmc.fabric.api.biome.v1.BiomeModifications
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors
import net.fabricmc.fabric.api.biome.v1.ModificationPhase
import net.minecraft.world.gen.GenerationStep
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.data.worldgen.DFPlacedFeatures


object DFBiomeModifiers {
    fun init() {
        BiomeModifications.create(id("add_ruby_ore_medium"))
            .add(ModificationPhase.ADDITIONS, BiomeSelectors.foundInOverworld()) { it  ->
                it.generationSettings.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, DFPlacedFeatures.ORE_RUBY_MEDIUM)
            }
    }
}