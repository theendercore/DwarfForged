package org.teamvoided.dwarf_forged.data.tags

import net.minecraft.item.Item
import net.minecraft.registry.tag.TagKey
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.addAndGet
import org.teamvoided.dwarf_forged.util.itemTag

object DFItemTags {
    val ALL_TAGS = mutableListOf<TagKey<Item>>()

    // Rocks
    val ROCKS = create("rocks")
    val STONES = create("stones")

    val BLUE_SKY = create("blue_sky")
    val GEMS_BLUE_SKY = conventional("gems/blue_sky")

    // MISC
    val COPPER_NUGGETS = conventional("nuggets/copper")


    fun create(name: String): TagKey<Item> = ALL_TAGS.addAndGet(itemTag(id(name)))
    private fun conventional(name: String): TagKey<Item> = ALL_TAGS.addAndGet(itemTag(id("c", name)))
}