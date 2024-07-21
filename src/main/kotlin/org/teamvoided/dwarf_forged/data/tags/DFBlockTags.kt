package org.teamvoided.dwarf_forged.data.tags

import net.minecraft.block.Block
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.tag.TagKey
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.tag

object DFBlockTags {

    val RUBY_ORE = create("ruby_ore")
    val SAPPHIRE_ORE = create("sapphire_ore")
    val KYANITE_ORE = create("kyanite_ore")
    val MOONSTONE_ORE = create("moonstone_ore")
    val JADE_ORE = create("jade_ore")
    val SMOKY_QUARTZ_ORE = create("smoky_quartz_ore")
    val EUCLASE_ORE = create("euclase_ore")
    val BORACITE_ORE = create("boracite_ore")
    val TOPAZ_ORE = create("topaz_ore")
    val TOURMALINE_ORE = create("tourmaline_ore")
    val SPINEL_ORE = create("spinel_ore")
    val HEMATITE_ORE = create("hematite_ore")
    val CARNELIAN_ORE = create("carnelian_ore")


    fun create(name: String): TagKey<Block> = RegistryKeys.BLOCK.tag(id(name))
}