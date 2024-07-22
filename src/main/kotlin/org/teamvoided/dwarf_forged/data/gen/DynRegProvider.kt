package org.teamvoided.dwarf_forged.data.gen

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider
import net.minecraft.registry.HolderLookup
import net.minecraft.registry.RegistryKeys
import java.util.concurrent.CompletableFuture

class DynRegProvider(o: FabricDataOutput, r: CompletableFuture<HolderLookup.Provider>) :
    FabricDynamicRegistryProvider(o, r) {

    override fun getName(): String = "dwarf_forged/worldgen"

    override fun configure(reg: HolderLookup.Provider, entries: Entries) {
        entries.addAll(reg.getLookupOrThrow(RegistryKeys.CONFIGURED_FEATURE))
        entries.addAll(reg.getLookupOrThrow(RegistryKeys.PLACED_FEATURE))
    }
}