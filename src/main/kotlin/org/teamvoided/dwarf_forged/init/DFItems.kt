package org.teamvoided.dwarf_forged.init

import net.minecraft.item.Item
import net.minecraft.registry.Registries
import org.teamvoided.dwarf_forged.util.register

object DFItems {
    val tabItems = mutableListOf<Item>()
    fun init() = Unit

    val COPPER_NUGGET = register("copper_nugget", Item())

    // --- --- --- GEMS --- --- ---
    val RUBY = register("ruby", Item())
    val SAPPHIRE = register("sapphire", Item())
    val KYANITE = register("kyanite", Item())
    val MOONSTONE = register("moonstone", Item())
    val JADE = register("jade", Item())
    val SMOKY_QUARTZ = register("smoky_quartz", Item())
    val EUCLASE = register("euclase", Item())
    val BORACITE = register("boracite", Item())
    val TOPAZ = register("topaz", Item())
    val TOURMALINE = register("tourmaline", Item())
    val SPINEL = register("spinel", Item())
    val HEMATITE = register("hematite", Item())
    val CARNELIAN = register("carnelian", Item())

    // --- --- --- RAW METALS --- --- ---
    val RAW_SILVER = register("raw_silver", Item())
    val RAW_COBALT = register("raw_cobalt", Item())
    val RAW_TUNGSTEN = register("raw_tungsten", Item())
    val RAW_IRIDIUM = register("raw_iridium", Item())
    val RAW_THALLIUM = register("raw_thallium", Item())
    val RAW_BISMUTH = register("raw_bismuth", Item())
    val RAW_PLUTONIUM = register("raw_plutonium", Item())
    val RAW_URANIUM = register("raw_uranium", Item())
    val RAW_LEAD = register("raw_lead", Item())
    val RAW_TIN = register("raw_tin", Item())
    val RAW_PALLADIUM = register("raw_palladium", Item())
    val RAW_ZINC = register("raw_zinc", Item())
    val RAW_NICKEL = register("raw_nickel", Item())
    val RAW_ALUMINIUM = register("raw_aluminium", Item())
    val RAW_PLATINUM = register("raw_platinum", Item())
    val RAW_TITANIUM = register("raw_titanium", Item())

    // --- --- --- RAW HUMAN ORES --- --- ---
    val RAW_EINSTEINIUM = register("raw_einsteinium", Item())
    val RAW_ASTRALITE = register("raw_astralite", Item())
    val RAW_DEATHL = register("raw_deathl", Item())

    // --- --- --- INGOTS --- --- ---
    val SILVER_INGOT = register("silver_ingot", Item())

    // --- --- --- HUMAN INGOTS --- --- ---
    val ASTRALITE_INGOT = register("astralite_ingot", Item())
    val VOILIT_INGOT = register("voilit_ingot", Item())

    // --- --- --- NUGGETS --- --- ---
    val SILVER_NUGGET = register("silver_nugget", Item())

    // --- --- --- HUMAN NUGGETS --- --- ---
    val ASTRALITE_NUGGET = register("astralite_nugget", Item())

    // -- --- --- HUMAN SCRAP --- --- ---
    val VOILIT_SCRAP = register("voilit_scrap", Item())

    // --- --- --- HUMAN GEMS --- --- ---
    val PETALITATE = register("petalitate", Item())
    val BLORE = register("blore", Item())
    val STORMSTONE = register("stormstone", Item())
    val JAZIUM = register("jazium", Item())
    val REPOOKITE = register("repookite", Item())
    val CACTALINE = register("cactaline", Item())


    // --- --- --- ROCKS --- --- ---

    val TEKTITE = register("tektite", Item())

    // --- --- --- CRYSTALS --- --- ---
    val BLUE_SKY_SHARD = register("blue_sky_shard", Item())
    val CITRINE_SHARD = register("citrine_shard", Item())

    fun <T : Item> register(name: String, item: T): Item {
        val regItem = registerNoTab(name, item)
        tabItems.add(regItem)
        return regItem
    }

    fun <T : Item> registerNoTab(name: String, item: T): Item = Registries.ITEM.register(name, item)

    fun Item() = Item(Item.Settings())
}
