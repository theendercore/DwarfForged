package org.teamvoided.dwarf_forged.data.tags

import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.tag.TagKey
import net.minecraft.world.biome.Biome
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.tag

object DFBiomeTags {

    // Normal Ores
    val HAS_JADE = ore("has_jade")
    val HAS_EUCLASE = ore("has_euclase")
    val HAS_BORACITE = ore("has_boracite")
    val HAS_TOPAZ = ore("has_topaz")
    val HAS_TOURMALINE = ore("has_tourmaline")
    val HAS_SPINEL = ore("has_spinel")
    val HAS_HEMATITE = ore("has_hematite")
    val HAS_CARNELIAN = ore("has_carnelian")
    // Deep Ores
    val HAS_RUBY = ore("has_ruby")
    val HAS_SAPPHIRE = ore("has_sapphire")
    val HAS_KYANITE = ore("has_kyanite")

    // --- METALS ---
    // Normal Ores
    val HAS_COBALT = ore("has_cobalt")
    val HAS_TUNGSTEN = ore("has_tungsten")
    val HAS_URANIUM = ore("has_uranium")
    val HAS_PALLADIUM = ore("has_palladium")
    // Deep Ores
    val HAS_PLUTONIUM = ore("has_plutonium")
    // Shallow Ores
    val HAS_BISMUTH = ore("has_bismuth")
    // Rare Ores
    val HAS_PLATINUM = ore("has_platinum")


    fun ore(name: String): TagKey<Biome> = create("ores/$name")

    fun create(name: String): TagKey<Biome> = RegistryKeys.BIOME.tag(id(name))
}