package org.teamvoided.dwarf_forged.init

import net.fabricmc.fabric.api.biome.v1.BiomeModifications
import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors
import net.fabricmc.fabric.api.biome.v1.ModificationPhase
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBiomeTags
import net.minecraft.registry.RegistryKey
import net.minecraft.world.biome.Biomes
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
        addOre(
            "add_ore_boracite_medium",
            DFPlacedOres.ORE_BORACITE_MEDIUM,
            BiomeSelectors.tag(DFBiomeTags.HAS_BORACITE)
        )

        addOre("add_ore_topaz_small", DFPlacedOres.ORE_TOPAZ_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_TOPAZ))
        addOre("add_ore_topaz_medium", DFPlacedOres.ORE_TOPAZ_MEDIUM, BiomeSelectors.tag(DFBiomeTags.HAS_TOPAZ))

        addOre(
            "add_ore_tourmaline_small",
            DFPlacedOres.ORE_TOURMALINE_SMALL,
            BiomeSelectors.tag(DFBiomeTags.HAS_TOURMALINE)
        )
        addOre(
            "add_ore_tourmaline_medium",
            DFPlacedOres.ORE_TOURMALINE_MEDIUM,
            BiomeSelectors.tag(DFBiomeTags.HAS_TOURMALINE)
        )

        addOre("add_ore_spinel_small", DFPlacedOres.ORE_SPINEL_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_SPINEL))
        addOre("add_ore_spinel_medium", DFPlacedOres.ORE_SPINEL_MEDIUM, BiomeSelectors.tag(DFBiomeTags.HAS_SPINEL))

        addOre("add_ore_hematite_small", DFPlacedOres.ORE_HEMATITE_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_HEMATITE))
        addOre(
            "add_ore_hematite_medium",
            DFPlacedOres.ORE_HEMATITE_MEDIUM,
            BiomeSelectors.tag(DFBiomeTags.HAS_HEMATITE)
        )

        addOre(
            "add_ore_carnelian_small",
            DFPlacedOres.ORE_CARNELIAN_SMALL,
            BiomeSelectors.tag(DFBiomeTags.HAS_CARNELIAN)
        )
        addOre(
            "add_ore_carnelian_medium",
            DFPlacedOres.ORE_CARNELIAN_MEDIUM,
            BiomeSelectors.tag(DFBiomeTags.HAS_CARNELIAN)
        )

        // Deep Ores
        addOre("add_ruby_small", DFPlacedOres.ORE_RUBY_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_RUBY))
        addOre("add_ruby_large", DFPlacedOres.ORE_RUBY_LARGE, BiomeSelectors.tag(DFBiomeTags.HAS_RUBY))

        addOre("add_sapphire_small", DFPlacedOres.ORE_SAPPHIRE_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_SAPPHIRE))
        addOre("add_sapphire_large", DFPlacedOres.ORE_SAPPHIRE_LARGE, BiomeSelectors.tag(DFBiomeTags.HAS_SAPPHIRE))

        addOre("add_kyanite_small", DFPlacedOres.ORE_KYANITE_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_KYANITE))
        addOre("add_kyanite_large", DFPlacedOres.ORE_KYANITE_LARGE, BiomeSelectors.tag(DFBiomeTags.HAS_KYANITE))

        // Quartz
        addOre("add_smoky_quartz", DFPlacedOres.ORE_SMOKY_QUARTZ, BiomeSelectors.foundInTheNether())
        addOre(
            "add_smoky_quartz_delta",
            DFPlacedOres.ORE_SMOKY_QUARTZ_DELTA,
            BiomeSelectors.includeByKey(Biomes.BASALT_DELTAS)
        )

        // Surface
        addOre("add_moonstone_small", DFPlacedOres.ORE_MOONSTONE_SMALL, BiomeSelectors.foundInOverworld())
        addOre("add_moonstone_medium", DFPlacedOres.ORE_MOONSTONE_MEDIUM, BiomeSelectors.foundInOverworld())

        // --- METALS ---
        // Normal Ores
        addOre("add_silver_small", DFPlacedOres.ORE_SILVER_SMALL, BiomeSelectors.foundInOverworld())
        addOre("add_silver", DFPlacedOres.ORE_SILVER, BiomeSelectors.foundInOverworld())

        addOre("add_cobalt_small", DFPlacedOres.ORE_COBALT_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_COBALT))
        addOre("add_cobalt", DFPlacedOres.ORE_COBALT, BiomeSelectors.tag(DFBiomeTags.HAS_COBALT))

        addOre("add_tungsten_small", DFPlacedOres.ORE_TUNGSTEN_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_TUNGSTEN))
        addOre("add_tungsten", DFPlacedOres.ORE_TUNGSTEN, BiomeSelectors.tag(DFBiomeTags.HAS_TUNGSTEN))

        addOre("add_uranium_small", DFPlacedOres.ORE_URANIUM_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_URANIUM))
        addOre("add_uranium", DFPlacedOres.ORE_URANIUM, BiomeSelectors.tag(DFBiomeTags.HAS_URANIUM))

        addOre("add_lead_small", DFPlacedOres.ORE_LEAD_SMALL, BiomeSelectors.foundInOverworld())
        addOre("add_lead", DFPlacedOres.ORE_LEAD, BiomeSelectors.foundInOverworld())

        addOre("add_tin_small", DFPlacedOres.ORE_TIN_SMALL, BiomeSelectors.foundInOverworld())
        addOre("add_tin", DFPlacedOres.ORE_TIN, BiomeSelectors.foundInOverworld())

        addOre("add_palladium_small", DFPlacedOres.ORE_PALLADIUM_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_PALLADIUM))
        addOre("add_palladium", DFPlacedOres.ORE_PALLADIUM, BiomeSelectors.tag(DFBiomeTags.HAS_PALLADIUM))

        addOre("add_zinc_small", DFPlacedOres.ORE_ZINC_SMALL, BiomeSelectors.foundInOverworld())
        addOre("add_zinc", DFPlacedOres.ORE_ZINC, BiomeSelectors.foundInOverworld())

        addOre("add_nickel_small", DFPlacedOres.ORE_NICKEL_SMALL, BiomeSelectors.foundInOverworld())
        addOre("add_nickel", DFPlacedOres.ORE_NICKEL, BiomeSelectors.foundInOverworld())

        addOre("add_aluminium_small", DFPlacedOres.ORE_ALUMINIUM_SMALL, BiomeSelectors.foundInOverworld())
        addOre("add_aluminium", DFPlacedOres.ORE_ALUMINIUM, BiomeSelectors.foundInOverworld())

        // Deep Ores
        addOre("add_titanium_small", DFPlacedOres.ORE_TITANIUM_SMALL, BiomeSelectors.foundInOverworld())
        addOre("add_titanium", DFPlacedOres.ORE_TITANIUM, BiomeSelectors.foundInOverworld())

        addOre("add_plutonium_small", DFPlacedOres.ORE_PLUTONIUM_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_PLUTONIUM))
        addOre("add_plutonium", DFPlacedOres.ORE_PLUTONIUM, BiomeSelectors.tag(DFBiomeTags.HAS_PLUTONIUM))

        // Shallow Ores
        addOre(
            "add_thallium_small", DFPlacedOres.ORE_THALLIUM_SMALL,
            BiomeSelectors.tag(ConventionalBiomeTags.IS_OCEAN).negate()
        )
        addOre("add_thallium", DFPlacedOres.ORE_THALLIUM, BiomeSelectors.tag(ConventionalBiomeTags.IS_OCEAN).negate())

        addOre("add_bismuth_small", DFPlacedOres.ORE_BISMUTH_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_BISMUTH))
        addOre("add_bismuth", DFPlacedOres.ORE_BISMUTH, BiomeSelectors.tag(DFBiomeTags.HAS_BISMUTH))

        // Rare Ores
        addOre("add_platinum_small", DFPlacedOres.ORE_PLATINUM_SMALL, BiomeSelectors.tag(DFBiomeTags.HAS_PLATINUM))
        addOre("add_platinum", DFPlacedOres.ORE_PLATINUM, BiomeSelectors.tag(DFBiomeTags.HAS_PLATINUM))

        addOre("add_iridium_small", DFPlacedOres.ORE_IRIDIUM, BiomeSelectors.foundInOverworld())
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


         // normal ores
            Silver (all owerwold)
            Cobalt (snowy)
            Tungsten ( deep dark)
            Uranium (desserts)
            Lead (everywhere)
            Tin (everywhere)
            Palladium (drip & messa)
            Zinc (everywhere)
            Nickel (everywhere)
            Aluminium (everywhere)

            Titanium (deep and everywehre)
            Plutonium (floral deep)

            Thallium (shallow everywhere, but ocean)
            Bismuth (ocean and sahores (shallow))

            Platinum (sawmps only, rare)

            Iridium (everywhere but its supper rare)
        */
    }

    fun addOre(name: String, ore: RegistryKey<PlacedFeature>, predicate: Predicate<BiomeSelectionContext>) {
        BiomeModifications.create(id(name)).add(ModificationPhase.ADDITIONS, predicate) { it ->
            it.generationSettings.addFeature(GenerationStep.Feature.UNDERGROUND_ORES, ore)
        }
    }
}