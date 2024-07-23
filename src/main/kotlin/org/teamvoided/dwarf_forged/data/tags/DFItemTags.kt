package org.teamvoided.dwarf_forged.data.tags

import net.minecraft.item.Item
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.tag.TagKey
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.tag

object DFItemTags {

    val DWARF_FORGED_ORES = create("dwarf_forge/ores")
    val DWARF_FORGED_STORAGE_BLOCKS = create("dwarf_forged/storage_blocks")

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

    val GEMS = create("dwarf_forged/gems")

    val GEMS_RUBY = conventional("gems/ruby")
    val GEMS_SAPPHIRE = conventional("gems/sapphire")
    val GEMS_KYANITE = conventional("gems/kyanite")
    val GEMS_MOONSTONE = conventional("gems/moonstone")
    val GEMS_JADE = conventional("gems/jade")
    val GEMS_SMOKY_QUARTZ = conventional("gems/smoky_quartz")
    val GEMS_EUCLASE = conventional("gems/euclase")
    val GEMS_BORACITE = conventional("gems/boracite")
    val GEMS_TOPAZ = conventional("gems/topaz")
    val GEMS_TOURMALINE = conventional("gems/tourmaline")
    val GEMS_SPINEL = conventional("gems/spinel")
    val GEMS_HEMATITE = conventional("gems/hematite")
    val GEMS_CARNELIAN = conventional("gems/carnelian")

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

    val INGOTS = create("dwarf_forged/ingots")

    fun create(name: String): TagKey<Item> = RegistryKeys.ITEM.tag(id(name))
    fun conventional(name: String): TagKey<Item> = RegistryKeys.ITEM.tag(id("c", name))

    val ALL_TAGS = listOf(
        DWARF_FORGED_ORES,
        GEM_ORES,
        RUBY_ORES,
        SAPPHIRE_ORES,
        KYANITE_ORES,
        MOONSTONE_ORES,
        JADE_ORES,
        SMOKY_QUARTZ_ORES,
        EUCLASE_ORES,
        BORACITE_ORES,
        TOPAZ_ORES,
        TOURMALINE_ORES,
        SPINEL_ORES,
        HEMATITE_ORES,
        CARNELIAN_ORES,
        GEMS,
        GEMS_RUBY,
        GEMS_SAPPHIRE,
        GEMS_KYANITE,
        GEMS_MOONSTONE,
        GEMS_JADE,
        GEMS_SMOKY_QUARTZ,
        GEMS_EUCLASE,
        GEMS_BORACITE,
        GEMS_TOPAZ,
        GEMS_TOURMALINE,
        GEMS_SPINEL,
        GEMS_HEMATITE,
        GEMS_CARNELIAN,
        GEM_BLOCKS,
        RUBY_BLOCK,
        SAPPHIRE_BLOCK,
        KYANITE_BLOCK,
        MOONSTONE_BLOCK,
        JADE_BLOCK,
        SMOKY_QUARTZ_BLOCK,
        EUCLASE_BLOCK,
        BORACITE_BLOCK,
        TOPAZ_BLOCK,
        TOURMALINE_BLOCK,
        SPINEL_BLOCK,
        HEMATITE_BLOCK,
        CARNELIAN_BLOCK
    )
}