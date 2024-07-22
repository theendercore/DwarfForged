package org.teamvoided.dwarf_forged.data.gen.worldgen

import net.minecraft.registry.BootstrapContext
import net.minecraft.registry.RegistryKeys
import net.minecraft.world.gen.YOffset
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier
import net.minecraft.world.gen.feature.PlacedFeature
import net.minecraft.world.gen.feature.util.PlacedFeatureUtil
import org.teamvoided.dwarf_forged.data.worldgen.DFConfiguredFeatures
import org.teamvoided.dwarf_forged.data.worldgen.DFPlacedFeatures
import org.teamvoided.dwarf_forged.util.commonOrePlacementModifiers

object PlacedFeaturesCreator {

    fun boostrap(c: BootstrapContext<PlacedFeature>) {

        val confFeat = c.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE)

        PlacedFeatureUtil.method_39737(
            c,
            DFPlacedFeatures.ORE_RUBY_MEDIUM,
            confFeat.getHolderOrThrow(DFConfiguredFeatures.ORE_RUBY_MEDIUM),
            commonOrePlacementModifiers(
                2, HeightRangePlacementModifier.createUniform(YOffset.fixed(-64), YOffset.fixed(-4))
            )
        )
    }
}