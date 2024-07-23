package org.teamvoided.dwarf_forged.block

//import net.minecraft.block.Block
//import net.minecraft.block.Blocks
//import net.minecraft.data.server.recipe.RecipeExporter
//import net.minecraft.item.Item
//import net.minecraft.util.StringIdentifiable
//import org.teamvoided.dwarf_forged.init.DFBlocks.copy
//import org.teamvoided.dwarf_forged.init.DFItems.Item

//class MetalBuilder(val name: String) {
//    private val blocks = mutableMapOf<BlockType, Block>()
//    private val items = mutableMapOf<ItemType, Item>()
//
//    fun ore(): MetalBuilder {
//        blocks[BlockType.ORE] = Block(copy(Blocks.IRON_ORE))
//        return this
//    }
//
//    fun deepslateOre(): MetalBuilder {
//        blocks[BlockType.DEEP_SLATE_ORE] = Block(copy(Blocks.DEEPSLATE_IRON_ORE))
//        return this
//    }
//
//    fun netherOre(): MetalBuilder {
//        blocks[BlockType.NETHER_ORE] = Block(copy(Blocks.NETHER_QUARTZ_ORE))
//        return this
//    }
//
//    fun endOre(): MetalBuilder {
//        blocks[BlockType.END_ORE] = Block(copy(Blocks.END_STONE))
//        return this
//    }
//
//    fun rawBlock(): MetalBuilder {
//        blocks[BlockType.RAW_BLOCK] = Block(copy(Blocks.RAW_IRON_BLOCK))
//        return this
//    }
//
//    fun storageBlock(): MetalBuilder {
//        blocks[BlockType.STORAGE_BLOCK] = Block(copy(Blocks.IRON_BLOCK))
//        return this
//    }
//
//    fun rawItem(): MetalBuilder {
//        items[ItemType.RAW_ITEM] = Item()
//        return this
//    }
//
//    fun ingot(): MetalBuilder {
//        items[ItemType.INGOT] = Item()
//        return this
//    }
//
//    fun nugget(): MetalBuilder {
//        items[ItemType.NUGGET] = Item()
//        return this
//    }
//
//    fun build(): Metal = Metal(blocks, items)
//
//    fun vanillaMetal(): MetalBuilder {
//        return this
//            .ore()
//            .deepslateOre()
//            .rawBlock()
//            .rawItem()
//            .storageBlock()
//            .ingot()
//            .nugget()
//    }
//
//    fun rawOre(): MetalBuilder {
//        return this
//            .ore()
//            .deepslateOre()
//            .rawBlock()
//            .rawItem()
//    }
//}
//
//enum class BlockType(private val template: String) : StringIdentifiable {
//    ORE("%s_ore"),
//    DEEP_SLATE_ORE("deepslate_%s_ore"),
//    NETHER_ORE("nether_%s_ore"),
//    END_ORE("end_%s_ore"),
//    RAW_BLOCK("raw_%s"),
//    STORAGE_BLOCK("%s_block");
//
//    override fun asString() = this.template
//}
//
//enum class ItemType(private val template: String) : StringIdentifiable {
//    INGOT("%s_ingot"),
//    NUGGET("%s_nugget"),
//    RAW_ITEM("raw_%s");
//
//    override fun asString() = this.template
//}
//
//data class Metal(val blocks: Map<BlockType, Block>, val items: Map<ItemType, Item>) {
//    fun forAllBlocks(consumer: (type: BlockType, block: Block) -> Unit) =
//        blocks.forEach { consumer(it.key, it.value) }
//
//    fun forAllItems(consumer: (type: ItemType, block: Item) -> Unit) =
//        items.forEach { consumer(it.key, it.value) }
//
//    fun get(type: BlockType): Block? = blocks[type]
//    fun get(type: ItemType): Item? = items[type]
//
//
//    fun getTabItems(): List<Item> {
//        return listOfNotNull(
//            blocks[BlockType.ORE]?.asItem(),
//            blocks[BlockType.DEEP_SLATE_ORE]?.asItem(),
//            blocks[BlockType.NETHER_ORE]?.asItem(),
//            blocks[BlockType.END_ORE]?.asItem(),
//            blocks[BlockType.RAW_BLOCK]?.asItem(),
//            blocks[BlockType.STORAGE_BLOCK]?.asItem(),
//
//            )
//    }
//
//}