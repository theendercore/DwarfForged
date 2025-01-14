package org.teamvoided.dwarf_forged.data.gen

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.minecraft.registry.RegistryKeys
import net.minecraft.registry.RegistrySetBuilder
import org.teamvoided.dwarf_forged.DwarfForged.log
import org.teamvoided.dwarf_forged.data.gen.prov.BlockLootTableProvider
import org.teamvoided.dwarf_forged.data.gen.prov.EnLangProvider
import org.teamvoided.dwarf_forged.data.gen.prov.ModelProviders
import org.teamvoided.dwarf_forged.data.gen.prov.RecipeProvider
import org.teamvoided.dwarf_forged.data.gen.tags.BiomeTagProvider
import org.teamvoided.dwarf_forged.data.gen.tags.BlockTagProvider
import org.teamvoided.dwarf_forged.data.gen.tags.ItemTagProvider
import org.teamvoided.dwarf_forged.data.gen.worldgen.ConfiguredFeaturesCreator
import org.teamvoided.dwarf_forged.data.gen.worldgen.PlacedFeaturesCreator

@Suppress("unused")
class DwarfForgedData : DataGeneratorEntrypoint {
    override fun onInitializeDataGenerator(gen: FabricDataGenerator) {
        log.info("Hello from DataGen")
        val pack = gen.createPack()

        // Tags
        val blockTags = pack.addProvider(::BlockTagProvider)
        pack.addProvider { o, r -> ItemTagProvider(o, r, blockTags) }
        pack.addProvider(::BiomeTagProvider)

        // Assets
        pack.addProvider(::ModelProviders)
        pack.addProvider(::EnLangProvider)

        // The Rest
        pack.addProvider(::BlockLootTableProvider)
        pack.addProvider(::RecipeProvider)
        pack.addProvider(::DynRegProvider)
    }

    override fun buildRegistry(gen: RegistrySetBuilder) {
        gen.add(RegistryKeys.CONFIGURED_FEATURE, ConfiguredFeaturesCreator::boostrap)
        gen.add(RegistryKeys.PLACED_FEATURE, PlacedFeaturesCreator::boostrap)
    }
}
