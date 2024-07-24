package org.teamvoided.dwarf_forged.init

import net.fabricmc.fabric.api.biome.v1.BiomeModifications
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors
import net.fabricmc.fabric.api.biome.v1.ModificationPhase
import net.minecraft.registry.RegistryKey
import net.minecraft.world.gen.GenerationStep
import net.minecraft.world.gen.feature.PlacedFeature
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.data.tags.DFBiomeTags
import org.teamvoided.dwarf_forged.data.worldgen.ore.DFPlacedOres
import java.util.function.Predicate


object DFBiomeModifiers {
    fun init() {

        // Normal Ores
        addOre("add_ore_jade_small", DFPlacedOres.ORE_JADE_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_JADE))
        addOre("add_ore_jade_medium", DFPlacedOres.ORE_JADE_MEDIUM, BiomeSelectors.tag(DFBiomeTags.HAS_JADE))

        addOre("add_ore_euclase_small", DFPlacedOres.ORE_EUCLASE_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_EUCLASE))
        addOre("add_ore_euclase_medium", DFPlacedOres.ORE_EUCLASE_MEDIUM, BiomeSelectors.tag(DFBiomeTags.HAS_EUCLASE))

        addOre("add_ore_boracite_small", DFPlacedOres.ORE_BORACITE_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_BORACITE))
        addOre("add_ore_boracite_medium", DFPlacedOres.ORE_BORACITE_MEDIUM, BiomeSelectors.tag(DFBiomeTags.HAS_BORACITE))

        addOre("add_ore_topaz_small", DFPlacedOres.ORE_TOPAZ_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_TOPAZ))
        addOre("add_ore_topaz_medium", DFPlacedOres.ORE_TOPAZ_MEDIUM, BiomeSelectors.tag(DFBiomeTags.HAS_TOPAZ))

        addOre("add_ore_tourmaline_small", DFPlacedOres.ORE_TOURMALINE_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_TOURMALINE))
        addOre("add_ore_tourmaline_medium", DFPlacedOres.ORE_TOURMALINE_MEDIUM, BiomeSelectors.tag(DFBiomeTags.HAS_TOURMALINE))

        addOre("add_ore_spinel_small", DFPlacedOres.ORE_SPINEL_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_SPINEL))
        addOre("add_ore_spinel_medium", DFPlacedOres.ORE_SPINEL_MEDIUM, BiomeSelectors.tag(DFBiomeTags.HAS_SPINEL))

        addOre("add_ore_hematite_small", DFPlacedOres.ORE_HEMATITE_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_HEMATITE))
        addOre("add_ore_hematite_medium", DFPlacedOres.ORE_HEMATITE_MEDIUM, BiomeSelectors.tag(DFBiomeTags.HAS_HEMATITE))

        addOre("add_ore_carnelian_small", DFPlacedOres.ORE_CARNELIAN_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_CARNELIAN))
        addOre("add_ore_carnelian_medium", DFPlacedOres.ORE_CARNELIAN_MEDIUM, BiomeSelectors.tag(DFBiomeTags.HAS_CARNELIAN))



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
    }

    fun addOre(name: String, ore: RegistryKey<PlacedFeature>, predicate: Predicate<BiomeSelectionContext>) {
        BiomeModifications.create(id(name)).add(ModificationPhase.ADDITIONS, predicate) { it ->
            it.generationSettings.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, ore)
        }
    }
}