package org.teamvoided.dwarf_forged.init

import net.fabricmc.fabric.api.biome.v1.BiomeModifications
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext
import net.fabricmc.fabric.api.biome.v1.ModificationPhase
import net.minecraft.registry.RegistryKey
import net.minecraft.world.gen.GenerationStep
import net.minecraft.world.gen.feature.PlacedFeature
import org.teamvoided.dwarf_forged.DwarfForged.id
import java.util.function.Predicate


object DFBiomeModifiers {
    fun init() = Unit
    fun addOre(name: String, ore: RegistryKey<PlacedFeature>, predicate: Predicate<BiomeSelectionContext>) {
        BiomeModifications.create(id(name)).add(ModificationPhase.ADDITIONS, predicate) { it ->
            it.generationSettings.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, ore)
        }
    }
}