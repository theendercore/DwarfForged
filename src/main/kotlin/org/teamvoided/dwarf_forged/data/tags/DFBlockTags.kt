package org.teamvoided.dwarf_forged.data.tags

import net.minecraft.block.Block
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.tag.TagKey
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.tag

object DFBlockTags {
    // Rocks
    val ROCKS = create("rocks")
    val STONES = create("stones")

    val BLUE_SKY = create("blue_sky")

    fun create(name: String): TagKey<Block> = RegistryKeys.BLOCK.tag(id(name))
}
