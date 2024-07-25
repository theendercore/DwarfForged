package org.teamvoided.dwarf_forged.data.tags

import net.minecraft.item.Item
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.tag.TagKey
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.tag

object DFItemTags {
    val ALL_TAGS = mutableListOf<TagKey<Item>>()

    // Block
    val DWARF_FORGED_ORES = create("dwarf_forged/ores")
    val DWARF_FORGED_STORAGE_BLOCKS = create("dwarf_forged/storage_blocks")

    // Item
    val DWARF_FORGED_GEMS = create("dwarf_forged/gems")
    val DWARF_FORGED_RAW_MATERIALS = create("dwarf_forged/raw_materials")
    val DWARF_FORGED_INGOTS = create("dwarf_forged/ingots")
    val DWARF_FORGED_NUGGETS = create("dwarf_forged/nuggets")

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

    val RUBY_BLOCK = storageBlock("ruby")
    val SAPPHIRE_BLOCK = storageBlock("sapphire")
    val KYANITE_BLOCK = storageBlock("kyanite")
    val MOONSTONE_BLOCK = storageBlock("moonstone")
    val JADE_BLOCK = storageBlock("jade")
    val SMOKY_QUARTZ_BLOCK = storageBlock("smoky_quartz")
    val EUCLASE_BLOCK = storageBlock("euclase")
    val BORACITE_BLOCK = storageBlock("boracite")
    val TOPAZ_BLOCK = storageBlock("topaz")
    val TOURMALINE_BLOCK = storageBlock("tourmaline")
    val SPINEL_BLOCK = storageBlock("spinel")
    val HEMATITE_BLOCK = storageBlock("hematite")
    val CARNELIAN_BLOCK = storageBlock("carnelian")

    val METAL_ORES = create("metal_ores")

    val SILVER_ORES = create("silver_ores")
    val COBALT_ORES = create("cobalt_ores")
    val TUNGSTEN_ORES = create("tungsten_ores")
    val IRIDIUM_ORES = create("iridium_ores")
    val THALLIUM_ORES = create("thallium_ores")
    val BISMUTH_ORES = create("bismuth_ores")
    val PLUTONIUM_ORES = create("plutonium_ores")
    val URANIUM_ORES = create("uranium_ores")
    val LEAD_ORES = create("lead_ores")
    val TIN_ORES = create("tin_ores")
    val PALLADIUM_ORES = create("palladium_ores")
    val ZINC_ORES = create("zinc_ores")
    val NICKEL_ORES = create("nickel_ores")
    val ALUMINIUM_ORES = create("aluminium_ores")
    val PLATINUM_ORES = create("platinum_ores")
    val TITANIUM_ORES = create("titanium_ores")

    val RAW_METAL_STORAGE_BLOCKS = create("raw_metal_storage_blocks")

    val RAW_SILVER_STORAGE_BLOCK = storageBlock("raw_silver")
    val RAW_COBALT_STORAGE_BLOCK = storageBlock("raw_cobalt")
    val RAW_TUNGSTEN_STORAGE_BLOCK = storageBlock("raw_tungsten")
    val RAW_IRIDIUM_STORAGE_BLOCK = storageBlock("raw_iridium")
    val RAW_THALLIUM_STORAGE_BLOCK = storageBlock("raw_thallium")
    val RAW_BISMUTH_STORAGE_BLOCK = storageBlock("raw_bismuth")
    val RAW_PLUTONIUM_STORAGE_BLOCK = storageBlock("raw_plutonium")
    val RAW_URANIUM_STORAGE_BLOCK = storageBlock("raw_uranium")
    val RAW_LEAD_STORAGE_BLOCK = storageBlock("raw_lead")
    val RAW_TIN_STORAGE_BLOCK = storageBlock("raw_tin")
    val RAW_PALLADIUM_STORAGE_BLOCK = storageBlock("raw_palladium")
    val RAW_ZINC_STORAGE_BLOCK = storageBlock("raw_zinc")
    val RAW_NICKEL_STORAGE_BLOCK = storageBlock("raw_nickel")
    val RAW_ALUMINIUM_STORAGE_BLOCK = storageBlock("raw_aluminium")
    val RAW_PLATINUM_STORAGE_BLOCK = storageBlock("raw_platinum")
    val RAW_TITANIUM_STORAGE_BLOCK = storageBlock("raw_titanium")

    val RAW_METAL_MATERIALS = create("raw_metal_materials")

    val RAW_SILVER_MATERIALS = conventional("raw_materials/silver")
    val RAW_COBALT_MATERIALS = conventional("raw_materials/cobalt")
    val RAW_TUNGSTEN_MATERIALS = conventional("raw_materials/tungsten")
    val RAW_IRIDIUM_MATERIALS = conventional("raw_materials/iridium")
    val RAW_THALLIUM_MATERIALS = conventional("raw_materials/thallium")
    val RAW_BISMUTH_MATERIALS = conventional("raw_materials/bismuth")
    val RAW_PLUTONIUM_MATERIALS = conventional("raw_materials/plutonium")
    val RAW_URANIUM_MATERIALS = conventional("raw_materials/uranium")
    val RAW_LEAD_MATERIALS = conventional("raw_materials/lead")
    val RAW_TIN_MATERIALS = conventional("raw_materials/tin")
    val RAW_PALLADIUM_MATERIALS = conventional("raw_materials/palladium")
    val RAW_ZINC_MATERIALS = conventional("raw_materials/zinc")
    val RAW_NICKEL_MATERIALS = conventional("raw_materials/nickel")
    val RAW_ALUMINIUM_MATERIALS = conventional("raw_materials/aluminium")
    val RAW_PLATINUM_MATERIALS = conventional("raw_materials/platinum")
    val RAW_TITANIUM_MATERIALS = conventional("raw_materials/titanium")

    val METAL_BLOCKS = create("metal_blocks")
    val SILVER_BLOCK = storageBlock("silver")

    val SILVER_INGOT = conventional("ingots/silver")

    val SILVER_NUGGETS = conventional("nuggets/silver")

    //  --- HUMANS --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---

    val HUMAN_ORES = create("human_ores")

    val EINSTEINIUM_ORES = create("einsteinium_ores")
    val ASTRALITE_ORES = create("astralite_ores")
    val GRASS_ORES = create("grass_ores")

    val RAW_HUMAN_STORAGE_BLOCKS = create("raw_human_storage_blocks")

    val RAW_EINSTEINIUM_STORAGE_BLOCK = storageBlock("raw_einsteinium")
    val RAW_ASTRALITE_STORAGE_BLOCK = storageBlock("raw_astralite")
    val RAW_GRASS_STORAGE_BLOCK = storageBlock("raw_grass")

    val RAW_HUMAN_MATERIALS = create("raw_human_materials")

    val RAW_EINSTEINIUM_MATERIALS = conventional("raw_materials/einsteinium")
    val RAW_ASTRALITE_MATERIALS = conventional("raw_materials/astralite")
    val RAW_GRASS_MATERIALS = conventional("raw_materials/grass")

    val HUMAN_BLOCKS = create("human_blocks")
    val ASTRALITE_BLOCK = storageBlock("astralite")

    val ASTRALITE_INGOT = conventional("ingots/astralite")
    val ASTRALITE_NUGGETS = conventional("nuggets/astralite")


    //  --- ROCKS --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---
    val ROCKS = create("rocks")
    val STONES = create("stones")
    val COBBLESTONES = create("cobblestones")

    val STONES_OVERWORLD = create("stones/overworld")
    val STONES_NETHER = create("stones/nether")

    // --- CRYSTALS --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---
    val CRYSTAL_BLOCKS = create("crystal_blocks")

    val BLUE_SKY = create("blue_sky")
    val CITRINE = create("citrine")

    val CRYSTALS = create("crystals")
    val GEMS_BLUE_SKY = conventional("gems/blue_sky")
    val GEMS_CITRINE = conventional("gems/citrine")

    // MISC
    val COPPER_NUGGETS = conventional("nuggets/copper")


    fun create(name: String): TagKey<Item> {
        val tag = RegistryKeys.ITEM.tag(id(name))
        ALL_TAGS.add(tag)
        return tag
    }

    fun conventional(name: String): TagKey<Item> {
        val tag = RegistryKeys.ITEM.tag(id("c", name))
        ALL_TAGS.add(tag)
        return tag
    }

    fun storageBlock(name: String): TagKey<Item> = conventional("storage_blocks/$name")
}