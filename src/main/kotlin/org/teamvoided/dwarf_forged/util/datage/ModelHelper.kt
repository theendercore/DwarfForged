package org.teamvoided.dwarf_forged.util.datage


import net.minecraft.block.Block
import net.minecraft.data.client.model.*
import net.minecraft.data.client.model.VariantSettings.Rotation
import net.minecraft.data.family.BlockFamily
import net.minecraft.state.property.Properties
import net.minecraft.util.Identifier
import org.teamvoided.dwarf_forged.DwarfForged.log
import java.util.*
import kotlin.jvm.optionals.getOrNull


val BARS: TextureKey = TextureKey.of("bars")
fun Block.model(): Identifier = ModelIds.getBlockModelId(this)
fun Block.model(str: String) = this.model().suffix(str)
fun Identifier.suffix(str: String) = Identifier.of(this.namespace, "${this.path}$str")

fun Identifier.toVariant(): BlockStateVariant = BlockStateVariant.create().put(VariantSettings.MODEL, this)
fun BlockStateModelGenerator.fence(fenceBlock: Block, reference: Block) {
    val texture = Texture.texture(reference)
    val post = Models.FENCE_POST.upload(fenceBlock, texture, this.modelCollector)
    val side = Models.FENCE_SIDE.upload(fenceBlock, texture, this.modelCollector)
    val inventory = Models.FENCE_INVENTORY.upload(fenceBlock, texture, this.modelCollector)
    this.blockStateCollector.accept(BlockStateModelGenerator.createFenceBlockState(fenceBlock, post, side))
    this.registerParentedItemModel(fenceBlock, inventory)
}


// shamelessly stolen from ~~voidUtils~~ dusk :)
// then stolen from dnd and then stolen from voided variance  ender :)


// slab
fun BlockStateModelGenerator.slab(
    slab: Block, doubleSlab: Block,
    texture: Block = doubleSlab, bottom: Block = texture, side: Block = texture, top: Block = texture
) = slab(slab, doubleSlab.model(), texture.model(), bottom.model(), side.model(), top.model())

fun BlockStateModelGenerator.slab(
    slab: Block, doubleSlab: Identifier, texture: Identifier,
    bottom: Identifier = texture, side: Identifier = texture, top: Identifier = texture,
) {
    val textureObj = Texture.texture(texture)
        .put(TextureKey.BOTTOM, bottom)
        .put(TextureKey.SIDE, side)
        .put(TextureKey.TOP, top)

    val id = Models.SLAB.upload(slab, textureObj, this.modelCollector)
    val id2 = Models.SLAB_TOP.upload(slab, textureObj, this.modelCollector)
    this.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(slab, id, id2, doubleSlab))
    this.registerParentedItemModel(slab, id)
}

// Sided Slab
fun BlockStateModelGenerator.sidedSlab(slab: Block, endTexture: Block) = sidedSlab(slab, endTexture.model())
fun BlockStateModelGenerator.sidedSlab(slab: Block, endTexture: Identifier, sideTexture: Identifier = slab.model()) {
    val columnTexture = Texture.texture(sideTexture)
        .put(TextureKey.END, endTexture)
        .put(TextureKey.SIDE, sideTexture)
    val doubleSlab = Models.CUBE_COLUMN.upload(slab.model().suffix("_full"), columnTexture, this.modelCollector)
    slab(slab, doubleSlab, endTexture, side = sideTexture)
}


// stairs
fun BlockStateModelGenerator.stairs(
    stairs: Block,
    texture: Block, bottomTexture: Block = texture, sideTexture: Block = texture, topTexture: Block = texture,
) = stairs(stairs, texture.model(), bottomTexture.model(), sideTexture.model(), topTexture.model())

fun BlockStateModelGenerator.stairs(
    stairs: Block,
    texture: Identifier = stairs.model(),
    bottom: Identifier = texture,
    side: Identifier = texture,
    top: Identifier = texture,
) {
    val textureObj: Texture = Texture.texture(texture)
        .put(TextureKey.BOTTOM, bottom)
        .put(TextureKey.SIDE, side)
        .put(TextureKey.TOP, top)
    val id: Identifier = Models.INNER_STAIRS.upload(stairs, textureObj, this.modelCollector)
    val id2: Identifier = Models.STAIRS.upload(stairs, textureObj, this.modelCollector)
    val id3: Identifier = Models.OUTER_STAIRS.upload(stairs, textureObj, this.modelCollector)

    this.blockStateCollector.accept(BlockStateModelGenerator.createStairsBlockState(stairs, id, id2, id3))
    this.registerParentedItemModel(stairs, id2)
}

// wall
fun BlockStateModelGenerator.wall(block: Block, texture: Block) = wall(block, texture.model())
fun BlockStateModelGenerator.wall(wall: Block, texture: Identifier = wall.model()) {
    val textureObj = Texture.texture(texture).put(TextureKey.WALL, texture)
    val id = Models.TEMPLATE_WALL_POST.upload(wall, textureObj, this.modelCollector)
    val id2 = Models.TEMPLATE_WALL_SIDE.upload(wall, textureObj, this.modelCollector)
    val id3 = Models.TEMPLATE_WALL_SIDE_TALL.upload(wall, textureObj, this.modelCollector)
    this.blockStateCollector.accept(BlockStateModelGenerator.createWallBlockState(wall, id, id2, id3))
    this.registerParentedItemModel(wall, Models.WALL_INVENTORY.upload(wall, textureObj, this.modelCollector))
}

// offset wall
fun BlockStateModelGenerator.wallOffset(wall: Block, texture: Block) = wallOffset(wall, texture.model())
fun BlockStateModelGenerator.wallOffset(wall: Block, texture: Identifier = wall.model()) {
    val textureObj = Texture.texture(texture).put(TextureKey.WALL, texture)
    val id = OFFSET_WALL_POST.upload(wall, textureObj, this.modelCollector)
    val id2 = Models.TEMPLATE_WALL_SIDE.upload(wall, textureObj, this.modelCollector)
    val id3 = Models.TEMPLATE_WALL_SIDE_TALL.upload(wall, textureObj, this.modelCollector)
    this.blockStateCollector.accept(BlockStateModelGenerator.createWallBlockState(wall, id, id2, id3))
    this.registerParentedItemModel(wall, OFFSET_WALL_INVENTORY.upload(wall, textureObj, this.modelCollector))
}

val OFFSET_WALL_POST = voidedBlockModel("template/offset_wall_post", "_post", TextureKey.WALL)
val OFFSET_WALL_INVENTORY = voidedBlockModel("template/offset_wall_inventory", "_inventory", TextureKey.WALL)

// Bars

val BARS_POST_ENDS = vanillaBlockModel("iron_bars_post_ends", myb(), TextureKey.PARTICLE, BARS, TextureKey.EDGE)
val BARS_POST = vanillaBlockModel("iron_bars_post", myb(), TextureKey.PARTICLE, BARS, TextureKey.EDGE)
val BARS_CAP = vanillaBlockModel("iron_bars_cap", myb(), TextureKey.PARTICLE, BARS, TextureKey.EDGE)
val BARS_CAP_ALT = vanillaBlockModel("iron_bars_cap_alt", myb(), TextureKey.PARTICLE, BARS, TextureKey.EDGE)
val BARS_SIDE = vanillaBlockModel("iron_bars_side", myb(), TextureKey.PARTICLE, BARS, TextureKey.EDGE)
val BARS_SIDE_ALT = vanillaBlockModel("iron_bars_side_alt", myb(), TextureKey.PARTICLE, BARS, TextureKey.EDGE)

fun BlockStateModelGenerator.bars(bars: Block) {
    val texture = Texture.texture(bars.model())
        .put(TextureKey.PARTICLE, bars.model())
        .put(BARS, bars.model())
        .put(TextureKey.EDGE, bars.model())
    val postEnds = BARS_POST_ENDS.upload(bars, "_post_ends", texture, this.modelCollector)
    val post = BARS_POST.upload(bars, "_post", texture, this.modelCollector)
    val cap = BARS_CAP.upload(bars, "_cap", texture, this.modelCollector)
    val capAlt = BARS_CAP_ALT.upload(bars,"_cap_alt", texture, this.modelCollector)
    val side = BARS_SIDE.upload(bars, "_side", texture, this.modelCollector)
    val sideAlt = BARS_SIDE_ALT.upload(bars, "_side_alt", texture, this.modelCollector)
    this.blockStateCollector.accept(
        MultipartBlockStateSupplier.create(bars)
            .with(BlockStateVariant.create().put(VariantSettings.MODEL, postEnds))
            .with(
                When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, false).set(
                    Properties.WEST, false
                ), BlockStateVariant.create().put(VariantSettings.MODEL, post)
            )
            .with(
                When.create().set(Properties.NORTH, true).set(Properties.EAST, false).set(Properties.SOUTH, false).set(
                    Properties.WEST, false
                ), BlockStateVariant.create().put(VariantSettings.MODEL, cap)
            )
            .with(
                When.create().set(Properties.NORTH, false).set(Properties.EAST, true).set(Properties.SOUTH, false).set(
                    Properties.WEST, false
                ),
                BlockStateVariant.create().put(VariantSettings.MODEL, cap).put(VariantSettings.Y, Rotation.R90)
            )
            .with(
                When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, true).set(
                    Properties.WEST, false
                ), BlockStateVariant.create().put(VariantSettings.MODEL, capAlt)
            )
            .with(
                When.create().set(Properties.NORTH, false).set(Properties.EAST, false).set(Properties.SOUTH, false).set(
                    Properties.WEST, true
                ),
                BlockStateVariant.create().put(VariantSettings.MODEL, capAlt).put(VariantSettings.Y, Rotation.R90)
            )
            .with(
                When.create().set(Properties.NORTH, true),
                BlockStateVariant.create().put(VariantSettings.MODEL, side)
            )
            .with(
                When.create().set(Properties.EAST, true),
                BlockStateVariant.create().put(VariantSettings.MODEL, side).put(VariantSettings.Y, Rotation.R90)
            )
            .with(
                When.create().set(Properties.SOUTH, true),
                BlockStateVariant.create().put(VariantSettings.MODEL, sideAlt)
            )
            .with(
                When.create().set(Properties.WEST, true),
                BlockStateVariant.create().put(VariantSettings.MODEL, sideAlt).put(VariantSettings.Y, Rotation.R90)
            )
    )
    this.registerItemModel(bars)
}

fun BlockStateModelGenerator.chain(chain: Block, texture: Identifier = chain.model()) {
    val textureObj = Texture.texture(texture)
        .put(TextureKey.PARTICLE, texture)
        .put(TextureKey.ALL, texture)
    val model = CHAIN.upload(chain, textureObj, this.modelCollector)
    this.registerAxisRotated(chain, model)
    this.registerItemModel(chain.asItem())
}

val CHAIN = vanillaBlockModel("chain", myb(), TextureKey.PARTICLE, TextureKey.ALL)

fun <K, V> MutableMap<K, V>.put2(key: K, value: V): MutableMap<K, V> {
    this[key] = value
    return this
}

val ISOLATED_MAP: Map<BlockFamily.Variant, BlockStateModelGenerator.(Block, Block) -> Unit> = mutableMapOf(
    BlockFamily.Variant.BUTTON to BlockStateModelGenerator::empty,
    BlockFamily.Variant.DOOR to BlockStateModelGenerator::empty,
    BlockFamily.Variant.CHISELED to BlockStateModelGenerator::empty,
    BlockFamily.Variant.CRACKED to BlockStateModelGenerator::empty,
    BlockFamily.Variant.CUSTOM_FENCE to BlockStateModelGenerator::empty,
    BlockFamily.Variant.FENCE to BlockStateModelGenerator::empty,
    BlockFamily.Variant.CUSTOM_FENCE_GATE to BlockStateModelGenerator::empty,
    BlockFamily.Variant.FENCE_GATE to BlockStateModelGenerator::empty,
    BlockFamily.Variant.SIGN to BlockStateModelGenerator::empty,
    BlockFamily.Variant.SLAB to BlockStateModelGenerator::slab,
    BlockFamily.Variant.STAIRS to BlockStateModelGenerator::stairs,
    BlockFamily.Variant.PRESSURE_PLATE to BlockStateModelGenerator::empty,
    BlockFamily.Variant.TRAPDOOR to { trapdoor, _ -> registerTrapdoor(trapdoor) },
    BlockFamily.Variant.WALL to BlockStateModelGenerator::wall,
)
val FANCY_MAP: Map<BlockFamily.Variant, BlockStateModelGenerator.(Block, Block) -> Unit> = mutableMapOf(
    BlockFamily.Variant.SLAB to BlockStateModelGenerator::sidedSlab,
    BlockFamily.Variant.STAIRS to BlockStateModelGenerator::stairs,
    BlockFamily.Variant.WALL to BlockStateModelGenerator::wall,
)

fun BlockStateModelGenerator.empty(b: Block, r: Block) {
    log.info("No function for $b in $r")
}

fun BlockStateModelGenerator.registerIsolatedBlockFamily(family: BlockFamily) {
    val root = family.baseBlock
    val mapType = if (family.group.getOrNull() == "fancy") FANCY_MAP else ISOLATED_MAP
    family.variants.forEach { (variant, block) ->
        val func = mapType[variant]
        if (func != null) func.invoke(this, block, root)
        else log.info("Not found function for $variant in $root")
    }
}


fun voidedBlockModel(parent: String, variant: String, vararg requiredTextures: TextureKey): Model =
    voidedModel("block/$parent", variant.myb(), *requiredTextures)

fun voidedModel(path: String, variant: Optional<String>, vararg requiredTextures: TextureKey): Model =
    Model(Identifier.of("voided", path).myb(), variant, *requiredTextures)

fun vanillaBlockModel(parent: String, variant: Optional<String>, vararg requiredTextures: TextureKey): Model =
    vanillaModel("block/$parent", variant, *requiredTextures)

fun vanillaModel(path: String, variant: Optional<String>, vararg requiredTextures: TextureKey): Model =
    Model(Identifier.ofDefault(path).myb(), variant, *requiredTextures)

fun <T : Any> T.myb() = Optional.of(this)
fun <T : Any> myb() = Optional.empty<T>()