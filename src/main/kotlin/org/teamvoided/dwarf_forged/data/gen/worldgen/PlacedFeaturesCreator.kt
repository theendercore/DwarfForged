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


        normalOres(c)
        deepOres(c)

        c.register(
            DFPlacedOres.ORE_SMOKY_QUARTZ, cfgFeat.getHolderOrThrow(DFCfgOres.ORE_SMOKY_QUARTZ),
            commonOrePlacementModifiers(16, PlacedFeatureUtil.FOUR_ABOVE_AND_BELOW_RANGE)
        )
        c.register(
            DFPlacedOres.ORE_SMOKY_QUARTZ_DELTA, cfgFeat.getHolderOrThrow(DFCfgOres.ORE_SMOKY_QUARTZ),
            commonOrePlacementModifiers(48, PlacedFeatureUtil.FOUR_ABOVE_AND_BELOW_RANGE)
        )

        c.register(
            DFPlacedOres.ORE_MOONSTONE_SMALL, cfgFeat.getHolderOrThrow(DFCfgOres.ORE_MOONSTONE_SMALL),
            commonOrePlacementModifiers(
                6, HeightRangePlacementModifier.createUniform(YOffset.fixed(35), YOffset.fixed(100))
            )
        )
        c.register(
            DFPlacedOres.ORE_MOONSTONE_MEDIUM, cfgFeat.getHolderOrThrow(DFCfgOres.ORE_MOONSTONE_MEDIUM),
            commonOrePlacementModifiers(
                3, HeightRangePlacementModifier.createUniform(YOffset.fixed(40), YOffset.fixed(90))
            )
        )
        c.register(
            DFPlacedOres.ORE_MOONSTONE_DEEP, cfgFeat.getHolderOrThrow(DFCfgOres.ORE_MOONSTONE_SMALL),
            commonOrePlacementModifiers(
                6, HeightRangePlacementModifier.createUniform(YOffset.fixed(-15), YOffset.fixed(-5))
            )
        )
    }

    private fun normalOres(c: BootstrapContext<PlacedFeature>) {
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

    private fun deepOres(c: BootstrapContext<PlacedFeature>) {
        c.makeDeepOre(
            DFPlacedOres.ORE_RUBY_SMALL, DFCfgOres.ORE_RUBY_SMALL,
            DFPlacedOres.ORE_RUBY_LARGE, DFCfgOres.ORE_RUBY_LARGE
        )
        c.makeDeepOre(
            DFPlacedOres.ORE_SAPPHIRE_SMALL, DFCfgOres.ORE_SAPPHIRE_SMALL,
            DFPlacedOres.ORE_SAPPHIRE_LARGE, DFCfgOres.ORE_SAPPHIRE_LARGE
        )
        c.makeDeepOre(
            DFPlacedOres.ORE_KYANITE_SMALL, DFCfgOres.ORE_KYANITE_SMALL,
            DFPlacedOres.ORE_KYANITE_LARGE, DFCfgOres.ORE_KYANITE_LARGE
        )
    }

    private fun BootstrapContext<PlacedFeature>.makeOre(
        placedSmall: RegistryKey<PlacedFeature>, cfgSmall: RegistryKey<ConfiguredFeature<*, *>>,
        placedMedium: RegistryKey<PlacedFeature>, cfgMedium: RegistryKey<ConfiguredFeature<*, *>>,
    ) {
        this.register(
            placedSmall, cfgFeat.getHolderOrThrow(cfgSmall), commonOrePlacementModifiers(
                7, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-60), YOffset.aboveBottom(24))
            )
        )
        this.register(
            placedMedium, cfgFeat.getHolderOrThrow(cfgMedium), commonOrePlacementModifiers(
                2, HeightRangePlacementModifier.createUniform(YOffset.fixed(-64), YOffset.fixed(0))
            )
        )
    }

    private fun BootstrapContext<PlacedFeature>.makeDeepOre(
        placedSmall: RegistryKey<PlacedFeature>, cfgSmall: RegistryKey<ConfiguredFeature<*, *>>,
        placedLarge: RegistryKey<PlacedFeature>, cfgLarge: RegistryKey<ConfiguredFeature<*, *>>,
    ) {
        this.register(
            placedSmall, cfgFeat.getHolderOrThrow(cfgSmall), commonOrePlacementModifiers(
                6, HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-50), YOffset.aboveBottom(10))
            )
        )
        this.register(
            placedLarge, cfgFeat.getHolderOrThrow(cfgLarge), commonOrePlacementModifiers(
                4, HeightRangePlacementModifier.createUniform(YOffset.fixed(-64), YOffset.fixed(-16))
            )
        )
    }

    fun BootstrapContext<PlacedFeature>.register(
        registryKey: RegistryKey<PlacedFeature>, feature: Holder<ConfiguredFeature<*, *>>, coll: List<PlacementModifier>
    ) = PlacedFeatureUtil.method_39737(this, registryKey, feature, coll)

}
