package org.teamvoided.dwarf_forged.data.gen

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
import net.minecraft.registry.RegistrySetBuilder
import org.teamvoided.dwarf_forged.DwarfForged.log
import org.teamvoided.dwarf_forged.data.gen.prov.EnLangProvider
import org.teamvoided.dwarf_forged.data.gen.prov.ModelProviders

@Suppress("unused")
class DwarfForgedData : DataGeneratorEntrypoint {
    override fun onInitializeDataGenerator(gen: FabricDataGenerator) {
        log.info("Hello from DataGen")
        val pack = gen.createPack()

        pack.addProvider(::ModelProviders)
        pack.addProvider(::EnLangProvider)
    }

    override fun buildRegistry(gen: RegistrySetBuilder) {
//        gen.add(RegistryKeys.BIOME, TemplateBiomes::boostrap)
    }
}
