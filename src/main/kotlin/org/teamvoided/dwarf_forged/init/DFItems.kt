package org.teamvoided.dwarf_forged.init

import net.minecraft.item.Item
import net.minecraft.registry.Registries
import org.teamvoided.dwarf_forged.util.register

object DFItems {
    val tabItems = mutableListOf<Item>()
    fun init() {}

    val BLUE_SKY_SHARD = register("blue_sky_shard", Item())
    val CITRINE_SHARD = register("citrine_shard", Item())

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

    fun <T : Item> register(name: String, item: T): Item {
        val regItem = registerNoTab(name, item)
        tabItems.add(regItem)
        return regItem
    }

    fun <T : Item> registerNoTab(name: String, item: T): Item = Registries.ITEM.register(name, item)

    fun Item() = Item(Item.Settings())
}
