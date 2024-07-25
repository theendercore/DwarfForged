package org.teamvoided.dwarf_forged.data.tags

import net.minecraft.block.Block
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.tag.TagKey
import org.teamvoided.dwarf_forged.DwarfForged.id
import org.teamvoided.dwarf_forged.util.tag

object DFBlockTags {

    val DWARF_FORGED_ORES = create("dwarf_forged/ores")
    val DWARF_FORGED_STORAGE_BLOCKS = create("dwarf_forged/storage_blocks")


    //  --- GEMS --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---
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


    //  --- METAL ORES --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---
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

    //  --- RAW BLOCKS --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---
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

    //  --- METAL BLOCKS --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---
    val METAL_BLOCKS = create("metal_blocks")
    val SILVER_BLOCK = storageBlock("silver")


    //  --- HUMANS --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---
    // Ores
    val HUMAN_ORES = create("human_ores")

    val EINSTEINIUM_ORES = create("einsteinium_ores")
    val ASTRALITE_ORES = create("astralite_ores")
    val DEATHL_ORES = create("deathl_ores")
    val PETALITATE_ORES = create("petalitate_ores")
    val BLORE_ORES = create("blore_ores")
    val STORMSTONE_ORES = create("stormstone_ores")
    val VOILIT_ORES = create("voilit_ores")
    val JAZIUM_ORES = create("jazium_ores")
    val REPOOKITE_ORES = create("repookite_ores")
    val CACTALINE_ORES = create("cactaline_ores")

    // Raw
    val RAW_HUMAN_STORAGE_BLOCKS = create("raw_human_storage_blocks")

    val RAW_EINSTEINIUM_STORAGE_BLOCK = storageBlock("raw_einsteinium")
    val RAW_ASTRALITE_STORAGE_BLOCK = storageBlock("raw_astralite")
    val RAW_GRASS_STORAGE_BLOCK = storageBlock("raw_grass")

    // Processed
    val HUMAN_BLOCKS = create("human_blocks")

    val ASTRALITE_BLOCK = storageBlock("astralite")

    val PETALITATE_BLOCK = storageBlock("petalitate")
    val BLORE_BLOCK = storageBlock("blore")
    val STORMSTONE_BLOCK = storageBlock("stormstone")
    val VOILIT_BLOCK = storageBlock("voilit")
    val JAZIUM_BLOCK = storageBlock("jazium")
    val REPOOKITE_BLOCK = storageBlock("repookite")
    val CACTALINE_BLOCK = storageBlock("cactaline")

    //  --- ROCKS --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---
    val ROCKS = create("rocks")
    val STONES = create("stones")
    val COBBLESTONES = create("cobblestones")

    val STONES_OVERWORLD = create("stones/overworld")
    val STONES_NETHER = create("stones/nether")


    // --- CRYSTALS --- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---
    val CRYSTALS = create("crystals")

    val BLUE_SKY = create("blue_sky")
    val CITRINE = create("citrine")


    fun create(name: String): TagKey<Block> = RegistryKeys.BLOCK.tag(id(name))
    fun conventional(name: String): TagKey<Block> = RegistryKeys.BLOCK.tag(id("c", name))
    fun storageBlock(name: String): TagKey<Block> = conventional("storage_blocks/$name")

}