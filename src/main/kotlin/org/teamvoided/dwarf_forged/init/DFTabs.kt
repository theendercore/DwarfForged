package org.teamvoided.dwarf_forged.init

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemConvertible
import net.minecraft.item.ItemGroup
import net.minecraft.registry.Holder
import net.minecraft.registry.Registries
import org.teamvoided.dwarf_forged.DwarfForged.MODID
import org.teamvoided.dwarf_forged.DwarfForged.isDev
import org.teamvoided.dwarf_forged.util.registerHolder
import org.teamvoided.dwarf_forged.util.text

object DFTabs {
    fun init() {}
    val DF_TAB = register("dwarf_forged",
        FabricItemGroup.builder()
            .icon { DFItems.BLUE_SKY_SHARD.defaultStack }
            .name("itemGroup.$MODID.dwarfForged".text())
            .entries { _, entries ->
                if (isDev()) {
                    entries.addStacks(DFItems.tabItems.map { it.defaultStack })
                } else {
                    entries.addItems(
                        // Metals
                        DFBlocks.SILVER_ORE,
                        DFBlocks.DEEPSLATE_SILVER_ORE,
                        DFBlocks.COBALT_ORE,
                        DFBlocks.DEEPSLATE_COBALT_ORE,
                        DFBlocks.TUNGSTEN_ORE,
                        DFBlocks.DEEPSLATE_TUNGSTEN_ORE,
                        DFBlocks.IRIDIUM_ORE,
                        DFBlocks.DEEPSLATE_IRIDIUM_ORE,
                        DFBlocks.THALLIUM_ORE,
                        DFBlocks.DEEPSLATE_THALLIUM_ORE,

                        // Crystals
                        DFBlocks.BLUE_SKY_BLOCK,
                        DFBlocks.BUDDING_BLUE_SKY,
                        DFBlocks.BLUE_SKY_CRYSTAL,
                        DFBlocks.LARGE_BLUE_SKY_BUD,
                        DFBlocks.MEDIUM_BLUE_SKY_BUD,
                        DFBlocks.SMALL_BLUE_SKY_BUD,
                        DFItems.BLUE_SKY_SHARD,

                        DFBlocks.CITRINE_BLOCK,
                        DFBlocks.BUDDING_CITRINE,
                        DFBlocks.CITRINE_CRYSTAL,
                        DFBlocks.LARGE_CITRINE_BUD,
                        DFBlocks.MEDIUM_CITRINE_BUD,
                        DFBlocks.SMALL_CITRINE_BUD,
                        DFItems.CITRINE_SHARD,
                    )
                }
            }
    )

    private fun register(name: String, builder: ItemGroup.Builder): Holder<ItemGroup> =
        Registries.ITEM_GROUP.registerHolder(name, builder.build())

    fun ItemGroup.ItemStackCollector.addItems(vararg items: ItemConvertible): ItemGroup.ItemStackCollector {
        items.forEach { this.addItem(it) }
        return this
    }
}