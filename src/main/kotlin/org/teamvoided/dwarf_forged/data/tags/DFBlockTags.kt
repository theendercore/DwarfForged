package org.teamvoided.dwarf_forged.data.tags

import net.minecraft.block.Block
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.tag.TagKey
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.tag

object DFBlockTags {

    val GEM_ORES = create("gem_ores")

    val RUBY_ORES = create("ruby_ores")
    val SAPPHIRE_ORES = create("sapphire_ores")
    val KYANITE_ORES = create("kyanite_ores")
    val MOONSTONE_ORES = create("moonstone_ores")
    val JADE_ORES = create("jade_ores")
    val SMOKY_QUARTZ_ORES = create("smoky_quartz_ores")
    val EUCLASE_ORES = create("euclase_ores")
    val BORACITE_ORES = create("boracite_ores")
    val TOPAZ_ORES = create("topaz_ores")
    val TOURMALINE_ORES = create("tourmaline_ores")
    val SPINEL_ORES = create("spinel_ores")
    val HEMATITE_ORES = create("hematite_ores")
    val CARNELIAN_ORES = create("carnelian_ores")


    fun create(name: String): TagKey<Block> = RegistryKeys.BLOCK.tag(id(name))
}