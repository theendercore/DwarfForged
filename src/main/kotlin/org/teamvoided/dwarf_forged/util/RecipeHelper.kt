package org.teamvoided.dwarf_forged.util

import net.minecraft.data.server.RecipesProvider.*
import net.minecraft.data.server.recipe.*
import net.minecraft.item.Item
import net.minecraft.item.ItemConvertible
import net.minecraft.recipe.*
import net.minecraft.registry.tag.TagKey
import net.minecraft.util.Identifier
import org.teamvoided.dwarf_forged.DwarfForged.id

// Reverse Compacting 3x3
fun RecipeExporter.revCompacting3x3(item: ItemConvertible, block: ItemConvertible) {
    this.compact9To1(RecipeCategory.MISC, block, item)
    this.uncompact1To9(RecipeCategory.MISC, item, block)
}

fun RecipeExporter.metalCompacting(nugget: ItemConvertible, ingot: ItemConvertible, block: ItemConvertible) {
    this.compact9To1(RecipeCategory.MISC, block, ingot)
    this.uncompact1To9(RecipeCategory.MISC, nugget, ingot)

    this.compact9To1(RecipeCategory.MISC, ingot, nugget, ingot.toId().path, ingot from nugget)
    this.uncompact1To9(RecipeCategory.MISC, ingot, block, ingot.toId().path, ingot from block)
}

infix fun ItemConvertible.from(item: ItemConvertible): String = "${this.toId().path}_from_${item.toId().path}"

fun RecipeExporter.compact9To1(
    category: RecipeCategory, result: ItemConvertible, input: ItemConvertible,
    group: String = "", id: String = result.toId().path
) = ShapedRecipeJsonFactory.create(category, result)
    .pattern("###")
    .pattern("###")
    .pattern("###")
    .ingredient('#', input)
    .group(group)
    .itemCriterion(input)
    .itemCriterion(result)
    .offerTo(this, id)

fun RecipeExporter.uncompact1To9(
    category: RecipeCategory, result: ItemConvertible, input: ItemConvertible,
    group: String = "", id: String = result.toId().path
) = ShapelessRecipeJsonFactory.create(category, result, 9)
    .ingredient(input)
    .group(group)
    .itemCriterion(input)
    .itemCriterion(result)
    .offerTo(this, id)

// Compacting 2x2
fun RecipeExporter.compacting2x2(item: ItemConvertible, block: ItemConvertible) =
    offerTwoByTwoCompactingRecipe(this, RecipeCategory.BUILDING_BLOCKS, block, item)

// Smelting and Blasting Ore
fun RecipeExporter.smeltAndBlastOre(oreTag: TagKey<Item>, output: ItemConvertible) {
    this.smelting(
        RecipeCategory.MISC,
        output,
        oreTag,
        1f,
        200,
        output.toId().path,
        id("smelting/${output.toId().path}")
    )
    this.blasting(
        RecipeCategory.MISC,
        output,
        oreTag,
        1f,
        100,
        output.toId().path,
        id("blasting/${output.toId().path}")
    )
}


fun RecipeExporter.blasting(
    category: RecipeCategory, output: ItemConvertible, inout: ItemConvertible,
    experience: Float, cookingTime: Int, group: String = "", id: Identifier = id(getBlastingItemPath(output))
) = genericSmelting(
    ::BlastingRecipe, RecipeSerializer.BLASTING, category, inout, output, experience, cookingTime, group, id
)

fun RecipeExporter.blasting(
    category: RecipeCategory, output: ItemConvertible, inout: TagKey<Item>,
    experience: Float, cookingTime: Int, group: String = "", id: Identifier = id(getBlastingItemPath(output))
) = genericSmelting(
    ::BlastingRecipe, RecipeSerializer.BLASTING, category, inout, output, experience, cookingTime, group, id
)

fun RecipeExporter.smelting(
    category: RecipeCategory, output: ItemConvertible, inout: ItemConvertible,
    experience: Float, cookingTime: Int, group: String = "", id: Identifier = id(getSmeltingItemPath(output))
) = genericSmelting(
    ::SmeltingRecipe, RecipeSerializer.SMELTING, category, inout, output, experience, cookingTime, group, id
)

fun RecipeExporter.smelting(
    category: RecipeCategory, output: ItemConvertible, inout: TagKey<Item>,
    experience: Float, cookingTime: Int, group: String = "", id: Identifier = id(getSmeltingItemPath(output))
) = genericSmelting(
    ::SmeltingRecipe, RecipeSerializer.SMELTING, category, inout, output, experience, cookingTime, group, id
)


fun <T : AbstractCookingRecipe> RecipeExporter.genericSmelting(
    recipe: AbstractCookingRecipe.Factory<T>,
    serializer: RecipeSerializer<T>,
    category: RecipeCategory,
    inputs: ItemConvertible,
    output: ItemConvertible,
    experience: Float,
    cookingTime: Int,
    group: String,
    id: Identifier
) = CookingRecipeJsonFactory
    .create(Ingredient.ofItems(inputs), category, output, experience, cookingTime, serializer, recipe)
    .group(group)
    .itemCriterion(inputs)
    .itemCriterion(output)
    .offerTo(this, id)

fun <T : AbstractCookingRecipe> RecipeExporter.genericSmelting(
    recipe: AbstractCookingRecipe.Factory<T>,
    serializer: RecipeSerializer<T>,
    category: RecipeCategory,
    inputs: TagKey<Item>,
    output: ItemConvertible,
    experience: Float,
    cookingTime: Int,
    group: String,
    id: Identifier
) = CookingRecipeJsonFactory
    .create(Ingredient.ofTag(inputs), category, output, experience, cookingTime, serializer, recipe)
    .group(group)
    .tagCriterion(inputs)
    .itemCriterion(output)
    .offerTo(this, id)


fun RecipeJsonFactory.itemCriterion(item: ItemConvertible): RecipeJsonFactory =
    this.criterion(hasItem(item), conditionsFromItem(item))

fun RecipeJsonFactory.tagCriterion(tag: TagKey<Item>): RecipeJsonFactory =
    this.criterion("has_${tag.path}", conditionsFromTag(tag))



