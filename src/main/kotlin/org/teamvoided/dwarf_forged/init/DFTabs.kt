package org.teamvoided.dwarf_forged.init

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup
import net.minecraft.item.ItemGroup
import net.minecraft.item.ItemGroups
import net.minecraft.item.Items
import net.minecraft.registry.Holder
import net.minecraft.registry.Registries
import org.teamvoided.dwarf_forged.DwarfForged.MODID
import org.teamvoided.dwarf_forged.util.*

object DFTabs {
    val DF_TAB = register("dwarf_forged",
        FabricItemGroup.builder()
            .icon { DFItems.BLUE_SKY_SHARD.defaultStack }
            .name("itemGroup.$MODID.dwarfForged".text())
            .entries { _, entries ->
                if (isDev()) {
                    entries.addStacks(DFItems.ITEMS.map { it.defaultStack })
                } else {
                    entries.addItem(
                        // Crystals
                        DFBlocks.BLUE_SKY_BLOCK,
                        DFBlocks.BUDDING_BLUE_SKY,
                        DFBlocks.BLUE_SKY_CLUSTER,
                        DFBlocks.LARGE_BLUE_SKY_BUD,
                        DFBlocks.MEDIUM_BLUE_SKY_BUD,
                        DFBlocks.SMALL_BLUE_SKY_BUD,
                        DFItems.BLUE_SKY_SHARD,
                        // Rocks
                        DFBlocks.ORBITAL_GRANITE,
                        DFBlocks.MUDROCK,
                    )
                }
            }
    )

    fun init() {
        addToTab(ItemGroups.INGREDIENTS) {
            it.addAfter(Items.IRON_NUGGET, DFItems.COPPER_NUGGET)
        }
    }

    @Suppress("SameParameterValue")
    private fun register(name: String, builder: ItemGroup.Builder): Holder<ItemGroup> =
        Registries.ITEM_GROUP.registerHolder(name, builder.build())

}
