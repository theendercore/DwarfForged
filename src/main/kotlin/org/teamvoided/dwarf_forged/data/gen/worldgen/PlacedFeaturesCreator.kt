package org.teamvoided.dwarf_forged.data.gen.worldgen

import net.minecraft.registry.BootstrapContext
import net.minecraft.registry.HolderProvider
import net.minecraft.registry.RegistryKeys
import net.minecraft.world.gen.feature.ConfiguredFeature
import net.minecraft.world.gen.feature.PlacedFeature

object PlacedFeaturesCreator {
    private lateinit var cfgFeat: HolderProvider<ConfiguredFeature<*, *>>

    fun boostrap(c: BootstrapContext<PlacedFeature>) {
        cfgFeat = c.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE)
    }
}
