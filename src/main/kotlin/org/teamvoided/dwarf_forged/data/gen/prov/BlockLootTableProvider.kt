package org.teamvoided.dwarf_forged.data.gen.prov

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider
import net.minecraft.block.Block
import net.minecraft.enchantment.Enchantments
import net.minecraft.item.Item
import net.minecraft.loot.condition.MatchToolLootCondition
import net.minecraft.loot.entry.ItemEntry
import net.minecraft.loot.function.ApplyBonusLootFunction
import net.minecraft.loot.function.SetCountLootFunction
import net.minecraft.loot.provider.number.ConstantLootNumberProvider
import net.minecraft.predicate.item.ItemPredicate
import net.minecraft.registry.HolderLookup
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.tag.ItemTags
import org.teamvoided.dwarf_forged.init.DFBlocks
import org.teamvoided.dwarf_forged.init.DFItems
import org.teamvoided.dwarf_forged.util.DFBlockLists
import java.util.concurrent.CompletableFuture

class BlockLootTableProvider(o: FabricDataOutput, r: CompletableFuture<HolderLookup.Provider>) :
    FabricBlockLootTableProvider(o, r) {
    val reg = r.join()
    private val dropSelf =
        DFBlockLists.GEM_BLOCKS + DFBlockLists.GEM_BLOCKS + DFBlockLists.RAW_BLOCKS +
                DFBlockLists.METAL_BLOCKS + DFBlockLists.RAW_HUMAN_ORES + DFBlockLists.HUMAN_BLOCKS +
                listOf(DFBlocks.BLUE_SKY_BLOCK, DFBlocks.CITRINE_BLOCK)

    private val ores = mapOf(
        // --- --- --- GEMS --- --- ---
        DFBlocks.RUBY_ORE to DFItems.RUBY,
        DFBlocks.DEEPSLATE_RUBY_ORE to DFItems.RUBY,

        DFBlocks.SAPPHIRE_ORE to DFItems.SAPPHIRE,
        DFBlocks.DEEPSLATE_SAPPHIRE_ORE to DFItems.SAPPHIRE,

        DFBlocks.KYANITE_ORE to DFItems.KYANITE,
        DFBlocks.DEEPSLATE_KYANITE_ORE to DFItems.KYANITE,

        DFBlocks.MOONSTONE_ORE to DFItems.MOONSTONE,
        DFBlocks.DEEPSLATE_MOONSTONE_ORE to DFItems.MOONSTONE,

        DFBlocks.JADE_ORE to DFItems.JADE,
        DFBlocks.DEEPSLATE_JADE_ORE to DFItems.JADE,

        DFBlocks.NETHER_SMOKY_QUARTZ_ORE to DFItems.SMOKY_QUARTZ,

        DFBlocks.EUCLASE_ORE to DFItems.EUCLASE,
        DFBlocks.DEEPSLATE_EUCLASE_ORE to DFItems.EUCLASE,

        DFBlocks.BORACITE_ORE to DFItems.BORACITE,
        DFBlocks.DEEPSLATE_BORACITE_ORE to DFItems.BORACITE,

        DFBlocks.TOPAZ_ORE to DFItems.TOPAZ,
        DFBlocks.DEEPSLATE_TOPAZ_ORE to DFItems.TOPAZ,

        DFBlocks.TOURMALINE_ORE to DFItems.TOURMALINE,
        DFBlocks.DEEPSLATE_TOURMALINE_ORE to DFItems.TOURMALINE,

        DFBlocks.SPINEL_ORE to DFItems.SPINEL,
        DFBlocks.DEEPSLATE_SPINEL_ORE to DFItems.SPINEL,

        DFBlocks.HEMATITE_ORE to DFItems.HEMATITE,
        DFBlocks.DEEPSLATE_HEMATITE_ORE to DFItems.HEMATITE,

        DFBlocks.CARNELIAN_ORE to DFItems.CARNELIAN,
        DFBlocks.DEEPSLATE_CARNELIAN_ORE to DFItems.CARNELIAN,

        // --- --- --- METALS --- --- ---
        DFBlocks.SILVER_ORE to DFItems.RAW_SILVER,
        DFBlocks.DEEPSLATE_SILVER_ORE to DFItems.RAW_SILVER,

        DFBlocks.COBALT_ORE to DFItems.RAW_COBALT,
        DFBlocks.DEEPSLATE_COBALT_ORE to DFItems.RAW_COBALT,

        DFBlocks.TUNGSTEN_ORE to DFItems.RAW_TUNGSTEN,
        DFBlocks.DEEPSLATE_TUNGSTEN_ORE to DFItems.RAW_TUNGSTEN,

        DFBlocks.IRIDIUM_ORE to DFItems.RAW_IRIDIUM,
        DFBlocks.DEEPSLATE_IRIDIUM_ORE to DFItems.RAW_IRIDIUM,

        DFBlocks.THALLIUM_ORE to DFItems.RAW_THALLIUM,
        DFBlocks.DEEPSLATE_THALLIUM_ORE to DFItems.RAW_THALLIUM,

        DFBlocks.BISMUTH_ORE to DFItems.RAW_BISMUTH,
        DFBlocks.DEEPSLATE_BISMUTH_ORE to DFItems.RAW_BISMUTH,

        DFBlocks.PLUTONIUM_ORE to DFItems.RAW_PLUTONIUM,
        DFBlocks.DEEPSLATE_PLUTONIUM_ORE to DFItems.RAW_PLUTONIUM,

        DFBlocks.URANIUM_ORE to DFItems.RAW_URANIUM,
        DFBlocks.DEEPSLATE_URANIUM_ORE to DFItems.RAW_URANIUM,

        DFBlocks.LEAD_ORE to DFItems.RAW_LEAD,
        DFBlocks.DEEPSLATE_LEAD_ORE to DFItems.RAW_LEAD,

        DFBlocks.TIN_ORE to DFItems.RAW_TIN,
        DFBlocks.DEEPSLATE_TIN_ORE to DFItems.RAW_TIN,

        DFBlocks.PALLADIUM_ORE to DFItems.RAW_PALLADIUM,
        DFBlocks.DEEPSLATE_PALLADIUM_ORE to DFItems.RAW_PALLADIUM,

        DFBlocks.ZINC_ORE to DFItems.RAW_ZINC,
        DFBlocks.DEEPSLATE_ZINC_ORE to DFItems.RAW_ZINC,

        DFBlocks.NICKEL_ORE to DFItems.RAW_NICKEL,
        DFBlocks.DEEPSLATE_NICKEL_ORE to DFItems.RAW_NICKEL,

        DFBlocks.ALUMINIUM_ORE to DFItems.RAW_ALUMINIUM,
        DFBlocks.DEEPSLATE_ALUMINIUM_ORE to DFItems.RAW_ALUMINIUM,

        DFBlocks.PLATINUM_ORE to DFItems.RAW_PLATINUM,
        DFBlocks.DEEPSLATE_PLATINUM_ORE to DFItems.RAW_PLATINUM,

        DFBlocks.TITANIUM_ORE to DFItems.RAW_TITANIUM,
        DFBlocks.DEEPSLATE_TITANIUM_ORE to DFItems.RAW_TITANIUM,

        // --- --- --- HUMANS --- --- ---
        DFBlocks.EINSTEINIUM_ORE to DFItems.RAW_EINSTEINIUM,
        DFBlocks.DEEPSLATE_EINSTEINIUM_ORE to DFItems.RAW_EINSTEINIUM,

        DFBlocks.ASTRALITE_ORE to DFItems.RAW_ASTRALITE,
        DFBlocks.DEEPSLATE_ASTRALITE_ORE to DFItems.RAW_ASTRALITE,

        DFBlocks.DEATHL_ORE to DFItems.RAW_DEATHL,
        DFBlocks.DEEPSLATE_DEATHL_ORE to DFItems.RAW_DEATHL,
    )


    private val dropsWithSilkTouch = listOf(
        DFBlocks.LARGE_BLUE_SKY_BUD,
        DFBlocks.MEDIUM_BLUE_SKY_BUD,
        DFBlocks.SMALL_BLUE_SKY_BUD,
        DFBlocks.LARGE_CITRINE_BUD,
        DFBlocks.MEDIUM_CITRINE_BUD,
        DFBlocks.SMALL_CITRINE_BUD,
    )

    override fun generate() {
        dropSelf.forEach(::addDrop)
        ores.forEach { (block, item) -> add(block) { oreDrops(block, item) } }

        crystalDrops(DFBlocks.BLUE_SKY_CLUSTER, DFItems.BLUE_SKY_SHARD)
        crystalDrops(DFBlocks.CITRINE_CLUSTER, DFItems.CITRINE_SHARD)
        dropsWithSilkTouch.forEach(::addDropWithSilkTouch)
    }

    private fun crystalDrops(block: Block, item: Item) {
        val enchants = reg.getLookupOrThrow(RegistryKeys.ENCHANTMENT)
        this.add(block) {
            this.dropsWithSilkTouch(
                it,
                ItemEntry.builder(item)
                    .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(4.0f)))
                    .apply(ApplyBonusLootFunction.method_455(enchants.getHolderOrThrow(Enchantments.FORTUNE)))
                    .conditionally(
                        MatchToolLootCondition.builder(
                            ItemPredicate.Builder.create().tag(ItemTags.CLUSTER_MAX_HARVESTABLES)
                        )
                    )
                    .alternatively(
                        applyExplosionDecay(
                            it, ItemEntry.builder(item)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f)))
                        )
                    )
            )
        }

    }
}