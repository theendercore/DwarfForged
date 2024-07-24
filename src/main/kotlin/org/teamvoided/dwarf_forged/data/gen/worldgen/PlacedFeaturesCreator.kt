package org.teamvoided.dwarf_forged.data.gen.worldgen

import net.minecraft.registry.*
import net.minecraft.world.gen.YOffset
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier
import net.minecraft.world.gen.feature.ConfiguredFeature
import net.minecraft.world.gen.feature.PlacedFeature
import net.minecraft.world.gen.feature.PlacementModifier
import net.minecraft.world.gen.feature.util.PlacedFeatureUtil
import org.teamvoided.dwarf_forged.data.worldgen.ore.DFCfgOres
import org.teamvoided.dwarf_forged.data.worldgen.ore.DFPlacedOres
import org.teamvoided.dwarf_forged.util.commonOrePlacementModifiers

object PlacedFeaturesCreator {
    private lateinit var cfgFeat: HolderProvider<ConfiguredFeature<*, *>>

    fun boostrap(c: BootstrapContext<PlacedFeature>) {
        cfgFeat = c.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE)

        c.makeOre(
            DFPlacedOres.ORE_JADE_SMALL, DFCfgOres.ORE_JADE_SMALL,
            DFPlacedOres.ORE_JADE_MEDIUM, DFCfgOres.ORE_JADE_MEDIUM
        )
        c.makeOre(
            DFPlacedOres.ORE_EUCLASE_SMALL, DFCfgOres.ORE_EUCLASE_SMALL,
            DFPlacedOres.ORE_EUCLASE_MEDIUM, DFCfgOres.ORE_EUCLASE_MEDIUM
        )
        c.makeOre(
            DFPlacedOres.ORE_BORACITE_SMALL, DFCfgOres.ORE_BORACITE_SMALL,
            DFPlacedOres.ORE_BORACITE_MEDIUM, DFCfgOres.ORE_BORACITE_MEDIUM
        )
        c.makeOre(
            DFPlacedOres.ORE_TOPAZ_SMALL, DFCfgOres.ORE_TOPAZ_SMALL,
            DFPlacedOres.ORE_TOPAZ_MEDIUM, DFCfgOres.ORE_TOPAZ_MEDIUM
        )
        c.makeOre(
            DFPlacedOres.ORE_TOURMALINE_SMALL, DFCfgOres.ORE_TOURMALINE_SMALL,
            DFPlacedOres.ORE_TOURMALINE_MEDIUM, DFCfgOres.ORE_TOURMALINE_MEDIUM
        )
        c.makeOre(
            DFPlacedOres.ORE_SPINEL_SMALL, DFCfgOres.ORE_SPINEL_SMALL,
            DFPlacedOres.ORE_SPINEL_MEDIUM, DFCfgOres.ORE_SPINEL_MEDIUM
        )
        c.makeOre(
            DFPlacedOres.ORE_HEMATITE_SMALL, DFCfgOres.ORE_HEMATITE_SMALL,
            DFPlacedOres.ORE_HEMATITE_MEDIUM, DFCfgOres.ORE_HEMATITE_MEDIUM
        )
        c.makeOre(
            DFPlacedOres.ORE_CARNELIAN_SMALL, DFCfgOres.ORE_CARNELIAN_SMALL,
            DFPlacedOres.ORE_CARNELIAN_MEDIUM, DFCfgOres.ORE_CARNELIAN_MEDIUM
        )


    }


    private fun BootstrapContext<PlacedFeature>.makeOre(
        placedSmall: RegistryKey<PlacedFeature>, cfgSmall: RegistryKey<ConfiguredFeature<*, *>>,
        placedMedium: RegistryKey<PlacedFeature>, cfgMedium: RegistryKey<ConfiguredFeature<*, *>>,
    ) {
        this.register(
            placedSmall, cfgFeat.getHolderOrThrow(cfgSmall), commonOrePlacementModifiers(
                7, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))
            )
        )
        this.register(
            placedMedium, cfgFeat.getHolderOrThrow(cfgMedium), commonOrePlacementModifiers(
                2, HeightRangePlacementModifier.createUniform(YOffset.fixed(-64), YOffset.fixed(-4))
            )
        )
    }

    fun BootstrapContext<PlacedFeature>.register(
        registryKey: RegistryKey<PlacedFeature>, feature: Holder<ConfiguredFeature<*, *>>, coll: List<PlacementModifier>
    ) = PlacedFeatureUtil.method_39737(this, registryKey, feature, coll)

}