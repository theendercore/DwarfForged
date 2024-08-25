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
import org.teamvoided.dwarf_forged.util.datage.SILK_TOUCH_OR_NOTHING
import java.util.concurrent.CompletableFuture

class BlockLootTableProvider(o: FabricDataOutput, r: CompletableFuture<HolderLookup.Provider>) :
    FabricBlockLootTableProvider(o, r) {
    private val reg: HolderLookup.Provider = r.join()


    override fun generate() {
        DFBlocks.BLOCKS.forEach(::addDrop)

        crystalDrops(DFBlocks.BLUE_SKY_CLUSTER, DFItems.BLUE_SKY_SHARD)
        SILK_TOUCH_OR_NOTHING.forEach(::addDropWithSilkTouch)
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