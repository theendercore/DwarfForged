package org.teamvoided.dwarf_forged.data.gen.worldgen

import net.minecraft.registry.*
import net.minecraft.world.gen.YOffset
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier
import net.minecraft.world.gen.feature.ConfiguredFeature
import net.minecraft.world.gen.feature.PlacedFeature
import net.minecraft.world.gen.feature.PlacementModifier
import net.minecraft.world.gen.feature.util.PlacedFeatureUtil
import org.teamvoided.dwarf_forged.data.worldgen.DFConfiguredFeatures
import org.teamvoided.dwarf_forged.data.worldgen.DFPlacedFeatures
import org.teamvoided.dwarf_forged.data.worldgen.ore.DFCfgOres
import org.teamvoided.dwarf_forged.data.worldgen.ore.DFPlacedOres
import org.teamvoided.dwarf_forged.util.commonOrePlacementModifiers
import org.teamvoided.dwarf_forged.util.rareOrePlacementModifiers

object PlacedFeaturesCreator {
    private lateinit var cfgFeat: HolderProvider<ConfiguredFeature<*, *>>

    fun boostrap(c: BootstrapContext<PlacedFeature>) {
        cfgFeat = c.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE)

        normalGems(c)
        deepGems(c)
        miscGems(c)

        normalMetals(c)
        deepMetals(c)
        miscMetals(c)

        rocks(c)
    }

    private fun normalGems(c: BootstrapContext<PlacedFeature>) {
        c.makeGem(
            DFPlacedOres.ORE_JADE_SMALL, DFCfgOres.ORE_JADE_SMALL,
            DFPlacedOres.ORE_JADE_MEDIUM, DFCfgOres.ORE_JADE_MEDIUM
        )
        c.makeGem(
            DFPlacedOres.ORE_EUCLASE_SMALL, DFCfgOres.ORE_EUCLASE_SMALL,
            DFPlacedOres.ORE_EUCLASE_MEDIUM, DFCfgOres.ORE_EUCLASE_MEDIUM
        )
        c.makeGem(
            DFPlacedOres.ORE_BORACITE_SMALL, DFCfgOres.ORE_BORACITE_SMALL,
            DFPlacedOres.ORE_BORACITE_MEDIUM, DFCfgOres.ORE_BORACITE_MEDIUM
        )
        c.makeGem(
            DFPlacedOres.ORE_TOPAZ_SMALL, DFCfgOres.ORE_TOPAZ_SMALL,
            DFPlacedOres.ORE_TOPAZ_MEDIUM, DFCfgOres.ORE_TOPAZ_MEDIUM
        )
        c.makeGem(
            DFPlacedOres.ORE_TOURMALINE_SMALL, DFCfgOres.ORE_TOURMALINE_SMALL,
            DFPlacedOres.ORE_TOURMALINE_MEDIUM, DFCfgOres.ORE_TOURMALINE_MEDIUM
        )
        c.makeGem(
            DFPlacedOres.ORE_SPINEL_SMALL, DFCfgOres.ORE_SPINEL_SMALL,
            DFPlacedOres.ORE_SPINEL_MEDIUM, DFCfgOres.ORE_SPINEL_MEDIUM
        )
        c.makeGem(
            DFPlacedOres.ORE_HEMATITE_SMALL, DFCfgOres.ORE_HEMATITE_SMALL,
            DFPlacedOres.ORE_HEMATITE_MEDIUM, DFCfgOres.ORE_HEMATITE_MEDIUM
        )
        c.makeGem(
            DFPlacedOres.ORE_CARNELIAN_SMALL, DFCfgOres.ORE_CARNELIAN_SMALL,
            DFPlacedOres.ORE_CARNELIAN_MEDIUM, DFCfgOres.ORE_CARNELIAN_MEDIUM
        )
    }

    private fun deepGems(c: BootstrapContext<PlacedFeature>) {
        c.makeDeepGem(
            DFPlacedOres.ORE_RUBY_SMALL, DFCfgOres.ORE_RUBY_SMALL,
            DFPlacedOres.ORE_RUBY_LARGE, DFCfgOres.ORE_RUBY_LARGE
        )
        c.makeDeepGem(
            DFPlacedOres.ORE_SAPPHIRE_SMALL, DFCfgOres.ORE_SAPPHIRE_SMALL,
            DFPlacedOres.ORE_SAPPHIRE_LARGE, DFCfgOres.ORE_SAPPHIRE_LARGE
        )
        c.makeDeepGem(
            DFPlacedOres.ORE_KYANITE_SMALL, DFCfgOres.ORE_KYANITE_SMALL,
            DFPlacedOres.ORE_KYANITE_LARGE, DFCfgOres.ORE_KYANITE_LARGE
        )
    }

    private fun miscGems(c: BootstrapContext<PlacedFeature>) {
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

    private fun normalMetals(c: BootstrapContext<PlacedFeature>) {
        c.makeNormalMetal(
            DFPlacedOres.ORE_SILVER_SMALL, DFCfgOres.ORE_SILVER_SMALL,
            DFPlacedOres.ORE_SILVER, DFCfgOres.ORE_SILVER
        )
        c.makeNormalMetal(
            DFPlacedOres.ORE_COBALT_SMALL, DFCfgOres.ORE_COBALT_SMALL,
            DFPlacedOres.ORE_COBALT, DFCfgOres.ORE_COBALT, -60,
            6, 9
        )
        c.makeNormalMetal(
            DFPlacedOres.ORE_TUNGSTEN_SMALL, DFCfgOres.ORE_TUNGSTEN_SMALL,
            DFPlacedOres.ORE_TUNGSTEN, DFCfgOres.ORE_TUNGSTEN, -58,
            11, 14
        )
        c.makeNormalMetal(
            DFPlacedOres.ORE_URANIUM_SMALL, DFCfgOres.ORE_URANIUM_SMALL,
            DFPlacedOres.ORE_URANIUM, DFCfgOres.ORE_URANIUM, -80,
            7, 9
        )
        c.makeNormalMetal(
            DFPlacedOres.ORE_LEAD_SMALL, DFCfgOres.ORE_LEAD_SMALL,
            DFPlacedOres.ORE_LEAD, DFCfgOres.ORE_LEAD, -40,
            8, 10
        )
        c.makeNormalMetal(
            DFPlacedOres.ORE_TIN_SMALL, DFCfgOres.ORE_TIN_SMALL,
            DFPlacedOres.ORE_TIN, DFCfgOres.ORE_TIN, -15,
            9, 7
        )
        c.makeNormalMetal(
            DFPlacedOres.ORE_PALLADIUM_SMALL, DFCfgOres.ORE_PALLADIUM_SMALL,
            DFPlacedOres.ORE_PALLADIUM, DFCfgOres.ORE_PALLADIUM, -45,
            5, 7
        )
        c.makeNormalMetal(
            DFPlacedOres.ORE_ZINC_SMALL, DFCfgOres.ORE_ZINC_SMALL,
            DFPlacedOres.ORE_ZINC, DFCfgOres.ORE_ZINC, -32,
            9, 9
        )
        c.makeNormalMetal(
            DFPlacedOres.ORE_NICKEL_SMALL, DFCfgOres.ORE_NICKEL_SMALL,
            DFPlacedOres.ORE_NICKEL, DFCfgOres.ORE_NICKEL, -35
        )
        c.makeNormalMetal(
            DFPlacedOres.ORE_ALUMINIUM_SMALL, DFCfgOres.ORE_ALUMINIUM_SMALL,
            DFPlacedOres.ORE_ALUMINIUM, DFCfgOres.ORE_ALUMINIUM, 10,
            9, 11
        )
    }

    private fun deepMetals(c: BootstrapContext<PlacedFeature>) {
        c.makeDeepMetal(
            DFPlacedOres.ORE_TITANIUM_SMALL, DFCfgOres.ORE_TITANIUM_SMALL,
            DFPlacedOres.ORE_TITANIUM, DFCfgOres.ORE_TITANIUM
        )
        c.makeDeepMetal(
            DFPlacedOres.ORE_PLUTONIUM_SMALL, DFCfgOres.ORE_PLUTONIUM_SMALL,
            DFPlacedOres.ORE_PLUTONIUM, DFCfgOres.ORE_PLUTONIUM,
            12, 14
        )
    }

    private fun miscMetals(c: BootstrapContext<PlacedFeature>) {
        c.makeShallowMetal(
            DFPlacedOres.ORE_THALLIUM_SMALL, DFCfgOres.ORE_THALLIUM_SMALL,
            DFPlacedOres.ORE_THALLIUM, DFCfgOres.ORE_THALLIUM, 4
        )
        c.makeShallowMetal(
            DFPlacedOres.ORE_BISMUTH_SMALL, DFCfgOres.ORE_BISMUTH_SMALL,
            DFPlacedOres.ORE_BISMUTH, DFCfgOres.ORE_BISMUTH
        )

        c.register(
            DFPlacedOres.ORE_PLATINUM,
            cfgFeat.getHolderOrThrow(DFCfgOres.ORE_PLATINUM),
            commonOrePlacementModifiers(
                4,
                HeightRangePlacementModifier.trapezoid(YOffset.fixed(-17), YOffset.fixed(32))
            )
        )
        c.register(
            DFPlacedOres.ORE_PLATINUM_SMALL,
            cfgFeat.getHolderOrThrow(DFCfgOres.ORE_PLATINUM_SMALL),
            commonOrePlacementModifiers(
                5,
                HeightRangePlacementModifier.createUniform(YOffset.getBottom(), YOffset.fixed(40))
            )
        )


        c.register(
            DFPlacedOres.ORE_IRIDIUM,
            cfgFeat.getHolderOrThrow(DFCfgOres.ORE_IRIDIUM),
            commonOrePlacementModifiers(
                2,
                HeightRangePlacementModifier.trapezoid(YOffset.getBottom(), YOffset.fixed(7))
            )
        )

    }


    private fun rocks(c: BootstrapContext<PlacedFeature>) {

        c.register(
            DFPlacedFeatures.PUMICE,
            cfgFeat.getHolderOrThrow(DFConfiguredFeatures.PUMICE),
            commonOrePlacementModifiers(
                2,
                HeightRangePlacementModifier.createUniform(YOffset.fixed(0), YOffset.fixed(64))
            )
        )


        // Shallow
        c.makeRock(DFPlacedFeatures.MARBLE_LOWER, DFPlacedFeatures.MARBLE_UPPER, DFConfiguredFeatures.MARBLE)
        c.makeRock(DFPlacedFeatures.MUDROCK_LOWER, DFPlacedFeatures.MUDROCK_UPPER, DFConfiguredFeatures.MUDROCK)

        // High
        c.makeRock(
            DFPlacedFeatures.BLUE_SCHIST_LOWER, DFPlacedFeatures.BLUE_SCHIST_UPPER, DFConfiguredFeatures.BLUE_SCHIST,
            10, 4,
            64, 320,
            32, 70
        )

        // Normal
        c.makeNormalRock(
            DFPlacedFeatures.BLAIRMORITE_LOWER, DFPlacedFeatures.BLAIRMORITE_UPPER, DFConfiguredFeatures.BLAIRMORITE
        )
        c.makeNormalRock(
            DFPlacedFeatures.PYROXENITE_LOWER, DFPlacedFeatures.PYROXENITE_UPPER, DFConfiguredFeatures.PYROXENITE
        )
        c.makeNormalRock(
            DFPlacedFeatures.ARGILLITE_LOWER, DFPlacedFeatures.ARGILLITE_UPPER, DFConfiguredFeatures.ARGILLITE
        )
        c.makeNormalRock(
            DFPlacedFeatures.VARIOLITE_LOWER, DFPlacedFeatures.VARIOLITE_UPPER, DFConfiguredFeatures.VARIOLITE
        )

    }

    private fun BootstrapContext<PlacedFeature>.makeDeepMetal(
        placedSmall: RegistryKey<PlacedFeature>, cfgSmall: RegistryKey<ConfiguredFeature<*, *>>,
        placed: RegistryKey<PlacedFeature>, cfg: RegistryKey<ConfiguredFeature<*, *>>,
        amount: Int = 8, smallAmount: Int = 1
    ) {
        this.register(
            placed,
            cfgFeat.getHolderOrThrow(cfg),
            commonOrePlacementModifiers(
                amount,
                HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-25), YOffset.fixed(0))
            )
        )
        this.register(
            placedSmall,
            cfgFeat.getHolderOrThrow(cfgSmall),
            commonOrePlacementModifiers(
                smallAmount,
                HeightRangePlacementModifier.createUniform(YOffset.getBottom(), YOffset.fixed(5))
            )
        )
    }

    private fun BootstrapContext<PlacedFeature>.makeNormalMetal(
        placedSmall: RegistryKey<PlacedFeature>, cfgSmall: RegistryKey<ConfiguredFeature<*, *>>,
        placed: RegistryKey<PlacedFeature>, cfg: RegistryKey<ConfiguredFeature<*, *>>,
        peak: Int = -32, amount: Int = 10, amountSmall: Int = 10
    ) {
        this.register(
            placed,
            cfgFeat.getHolderOrThrow(cfg),
            commonOrePlacementModifiers(
                amount,
                HeightRangePlacementModifier.trapezoid(YOffset.fixed(peak), YOffset.fixed(44))
            )
        )
        this.register(
            placedSmall,
            cfgFeat.getHolderOrThrow(cfgSmall),
            commonOrePlacementModifiers(
                amountSmall,
                HeightRangePlacementModifier.createUniform(YOffset.getBottom(), YOffset.fixed(56))
            )
        )
    }

    private fun BootstrapContext<PlacedFeature>.makeShallowMetal(
        placedSmall: RegistryKey<PlacedFeature>, cfgSmall: RegistryKey<ConfiguredFeature<*, *>>,
        placed: RegistryKey<PlacedFeature>, cfg: RegistryKey<ConfiguredFeature<*, *>>,
        peak: Int = 10
    ) {
        this.register(
            placed,
            cfgFeat.getHolderOrThrow(cfg),
            commonOrePlacementModifiers(
                6,
                HeightRangePlacementModifier.trapezoid(YOffset.fixed(peak), YOffset.fixed(44))
            )
        )
        this.register(
            placedSmall,
            cfgFeat.getHolderOrThrow(cfgSmall),
            commonOrePlacementModifiers(
                6,
                HeightRangePlacementModifier.createUniform(YOffset.fixed(-10), YOffset.fixed(60))
            )
        )
    }

    private fun BootstrapContext<PlacedFeature>.makeGem(
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

    private fun BootstrapContext<PlacedFeature>.makeDeepGem(
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


    private fun BootstrapContext<PlacedFeature>.makeNormalRock(
        lower: RegistryKey<PlacedFeature>, upper: RegistryKey<PlacedFeature>, cfg: RegistryKey<ConfiguredFeature<*, *>>,
        upperChance: Int = 6, lowerChance: Int = 2,
    ) = this.makeRock(lower, upper, cfg, upperChance, lowerChance, 0, 64, -64, 0)

    private fun BootstrapContext<PlacedFeature>.makeRock(
        lower: RegistryKey<PlacedFeature>, upper: RegistryKey<PlacedFeature>, cfg: RegistryKey<ConfiguredFeature<*, *>>,
        upperChance: Int = 6, lowerChance: Int = 2,
        upperMin: Int = 64, upperMax: Int = 128,
        lowerMin: Int = 0, lowerMax: Int = 60
    ) {
        this.register(
            upper, cfgFeat.getHolderOrThrow(cfg), rareOrePlacementModifiers(
                upperChance,
                HeightRangePlacementModifier.createUniform(YOffset.fixed(upperMin), YOffset.fixed(upperMax))
            )
        )
        this.register(
            lower, cfgFeat.getHolderOrThrow(cfg), commonOrePlacementModifiers(
                lowerChance,
                HeightRangePlacementModifier.createUniform(YOffset.fixed(lowerMin), YOffset.fixed(lowerMax))
            )
        )
    }


    private fun BootstrapContext<PlacedFeature>.register(
        registryKey: RegistryKey<PlacedFeature>, feature: Holder<ConfiguredFeature<*, *>>, coll: List<PlacementModifier>
    ) = PlacedFeatureUtil.method_39737(this, registryKey, feature, coll)

}
