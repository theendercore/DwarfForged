package org.teamvoided.dwarf_forged.data.worldgen.ore

import net.minecraft.registry.RegistryKey
import net.minecraft.registry.RegistryKeys
import net.minecraft.world.gen.feature.ConfiguredFeature
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.key

object DFCfgOres {


    // Normal Ores
    val ORE_JADE_SMALL = ore("ore_jade_small")
    val ORE_JADE_MEDIUM = ore("ore_jade_medium")

    val ORE_EUCLASE_SMALL = ore("ore_euclase_small")
    val ORE_EUCLASE_MEDIUM = ore("ore_euclase_medium")

    val ORE_BORACITE_SMALL = ore("ore_boracite_small")
    val ORE_BORACITE_MEDIUM = ore("ore_boracite_medium")

    val ORE_TOPAZ_SMALL = ore("ore_topaz_small")
    val ORE_TOPAZ_MEDIUM = ore("ore_topaz_medium")

    val ORE_TOURMALINE_SMALL = ore("ore_tourmaline_small")
    val ORE_TOURMALINE_MEDIUM = ore("ore_tourmaline_medium")

    val ORE_SPINEL_SMALL = ore("ore_spinel_small")
    val ORE_SPINEL_MEDIUM = ore("ore_spinel_medium")

    val ORE_HEMATITE_SMALL = ore("ore_hematite_small")
    val ORE_HEMATITE_MEDIUM = ore("ore_hematite_medium")

    val ORE_CARNELIAN_SMALL = ore("ore_carnelian_small")
    val ORE_CARNELIAN_MEDIUM = ore("ore_carnelian_medium")

    // Deep Ores
    val ORE_RUBY_SMALL = ore("ore_ruby_small")
    val ORE_RUBY_LARGE = ore("ore_ruby_large")

    val ORE_SAPPHIRE_SMALL = ore("ore_sapphire_small")
    val ORE_SAPPHIRE_LARGE = ore("ore_sapphire_large")

    val ORE_KYANITE_SMALL = ore("ore_kyanite_small")
    val ORE_KYANITE_LARGE = ore("ore_kyanite_large")

    // Quartz
    val ORE_SMOKY_QUARTZ = ore("ore_smoky_quartz")

    // Surface
    val ORE_MOONSTONE_SMALL = ore("ore_moonstone_small")
    val ORE_MOONSTONE_MEDIUM = ore("ore_moonstone_medium")

    // --- METALS ---

    // Normal Ores
    val ORE_SILVER_SMALL = ore("ore_silver_small")
    val ORE_SILVER = ore("ore_silver")

    val ORE_COBALT_SMALL = ore("ore_cobalt_small")
    val ORE_COBALT = ore("ore_cobalt")

    val ORE_TUNGSTEN_SMALL = ore("ore_tungsten_small")
    val ORE_TUNGSTEN = ore("ore_tungsten")

    val ORE_URANIUM_SMALL = ore("ore_uranium_small")
    val ORE_URANIUM = ore("ore_uranium")

    val ORE_LEAD_SMALL = ore("ore_lead_small")
    val ORE_LEAD = ore("ore_lead")

    val ORE_TIN_SMALL = ore("ore_tin_small")
    val ORE_TIN = ore("ore_tin")

    val ORE_PALLADIUM_SMALL = ore("ore_palladium_small")
    val ORE_PALLADIUM = ore("ore_palladium")

    val ORE_ZINC_SMALL = ore("ore_zinc_small")
    val ORE_ZINC = ore("ore_zinc")

    val ORE_NICKEL_SMALL = ore("ore_nickel_small")
    val ORE_NICKEL = ore("ore_nickel")

    val ORE_ALUMINIUM_SMALL = ore("ore_aluminium_small")
    val ORE_ALUMINIUM = ore("ore_aluminium")


    // Deep Ores
    val ORE_TITANIUM_SMALL = ore("ore_titanium_small")
    val ORE_TITANIUM = ore("ore_titanium")

    val ORE_PLUTONIUM_SMALL = ore("ore_plutonium_small")
    val ORE_PLUTONIUM = ore("ore_plutonium")


    // Shallow Ores
    val ORE_THALLIUM_SMALL = ore("ore_thallium_small")
    val ORE_THALLIUM = ore("ore_thallium")

    val ORE_BISMUTH_SMALL = ore("ore_bismuth_small")
    val ORE_BISMUTH = ore("ore_bismuth")

    // Rare Ores
    val ORE_PLATINUM_SMALL = ore("ore_platinum_small")
    val ORE_PLATINUM = ore("ore_platinum")

    val ORE_IRIDIUM = ore("ore_iridium")

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

        //small, large (max lvl 10)
        Ruby (low down in dry biomes)
        Sapphire (low down in cold biomes)
        Kyanite (low in mountains)

        // same as quartz
        Smoky quartz (all nether)

        // small, medium (max lvl 100, min lvl 35)
        Moonstone (surface level all biomes)


 // --- METALS ---
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

    // --- HUMAN ORES ---

    val ORE_EINSTEINIUM = ore("ore_einsteinium")
    val ORE_PETALITATE = ore("ore_petalitate")
    val ORE_CACTALINE = ore("ore_cactaline")
    val ORE_BLORE = ore("ore_blore")

    val ORE_JAZIUM = ore("ore_jazium")
    val ORE_ASTRALITE = ore("ore_astralite")
    val ORE_REPOOKITE = ore("ore_repookite")

    val ORE_DEATHL = ore("ore_deathl")

    val ORE_STORMSTONE = ore("ore_stormstone")

    //Einsteinium [warm shallow]
    //Petalitate (Leah) [floral biomes shallow]
    //cactaline (cactus ore) [desrt shallow]
    //Blore (Blur) [ , shallow]

    //jazium (Jaiz) [savana, deep]
    //Astralite (astra) [everywhere deep]
    //repookite (Repook) [forstest deep]

    //Deathl (deathlord) [plains normal]

    //Stormstone (dusk) [dusk biomes square]
    private fun ore(id: String): RegistryKey<ConfiguredFeature<*, *>> =
        RegistryKeys.CONFIGURED_FEATURE.key(id("ore/$id"))
}