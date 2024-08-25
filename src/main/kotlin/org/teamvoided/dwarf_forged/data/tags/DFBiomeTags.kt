package org.teamvoided.dwarf_forged.data.tags

import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.tag.TagKey
import net.minecraft.world.biome.Biome
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.tag

@Suppress("SameParameterValue")
object DFBiomeTags {
    val HAS_BLUE_SKY_GEODE = has("blue_sky_geode")


    private fun has(name: String) = create("has_$name")
    fun create(name: String): TagKey<Biome> = RegistryKeys.BIOME.tag(id(name))
}