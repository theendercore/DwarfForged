package org.teamvoided.dwarf_forged.data.tags

import net.minecraft.block.Block
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.tag.TagKey
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.tag

object DFBlockTags {

    val DWARF_FORGED_ORES = create("dwarf_forged_ores")
    val DWARF_FORGED_STORAGE_BLOCKS = create("dwarf_forged_storage_blocks")

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

    val GEM_BLOCKS = create("gem_blocks")

    val RUBY_BLOCK = conventional("storage_blocks/ruby")
    val SAPPHIRE_BLOCK = conventional("storage_blocks/sapphire")
    val KYANITE_BLOCK = conventional("storage_blocks/kyanite")
    val MOONSTONE_BLOCK = conventional("storage_blocks/moonstone")
    val JADE_BLOCK = conventional("storage_blocks/jade")
    val SMOKY_QUARTZ_BLOCK = conventional("storage_blocks/smoky_quartz")
    val EUCLASE_BLOCK = conventional("storage_blocks/euclase")
    val BORACITE_BLOCK = conventional("storage_blocks/boracite")
    val TOPAZ_BLOCK = conventional("storage_blocks/topaz")
    val TOURMALINE_BLOCK = conventional("storage_blocks/tourmaline")
    val SPINEL_BLOCK = conventional("storage_blocks/spinel")
    val HEMATITE_BLOCK = conventional("storage_blocks/hematite")
    val CARNELIAN_BLOCK = conventional("storage_blocks/carnelian")

    val METAL_ORES = create("metal_ores")
    val SILVER_ORES = create("silver_ores")


    val HUMAN_ORES = create("human_ores")
    val EINSTEINIUM_ORES = create("einsteinium_ores")
    val ASTRALITE_ORES = create("astralite_ores")
    val GRASS_ORES = create("grass_ores")


    val METAL_BLOCKS = create("metal_blocks")
    val SILVER_BLOCK = conventional("storage_blocks/silver")


    val HUMAN_BLOCKS = create("human_blocks")
    val ASTRALITE_BLOCK = conventional("storage_blocks/astralite")


    fun create(name: String): TagKey<Block> = RegistryKeys.BLOCK.tag(id(name))
    fun conventional(name: String): TagKey<Block> = RegistryKeys.BLOCK.tag(id("c", name))

}