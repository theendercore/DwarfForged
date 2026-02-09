package org.teamvoided.dwarf_forged.client.cavenet

import com.mojang.brigadier.Command
import com.mojang.brigadier.arguments.IntegerArgumentType
import com.mojang.brigadier.context.CommandContext
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager.argument
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager.literal
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource
import net.minecraft.text.Text
import net.minecraft.util.math.BlockPos
import org.teamvoided.dwarf_forged.client.cavenet.node.DoorNode
import org.teamvoided.dwarf_forged.client.cavenet.node.INode

object CaveNet {
    val nodes = mutableMapOf<BlockPos, INode>()
    var TicksPerTick = -1
    fun init() {
        CNRenderer.init()
        CNLogic.init()

        ClientCommandRegistrationCallback.EVENT.register { dispatcher, ctx ->
            val root = literal("cavenet").build()
            dispatcher.root.addChild(root)

            val addNode = literal("add_node").executes(::addNode).build()
            root.addChild(addNode)

            val clear = literal("clear").executes(::clearNodes).build()
            root.addChild(clear)

            val ticks = literal("ticks").build()
            root.addChild(ticks)
            val ticksArg = argument("ticks", IntegerArgumentType.integer(-1)).executes {
                TicksPerTick = IntegerArgumentType.getInteger(it, "ticks")
                CNLogic.tickCounter = 0
                0
            }.build()
            ticks.addChild(ticksArg)
        }
    }

    fun addNode(ctx: CommandContext<FabricClientCommandSource>): Int {
        val src = ctx.source ?: return -1
        val player = src.player ?: return -1

        nodes[player.blockPos.up()] = DoorNode(player.horizontalFacing)
        src.sendFeedback(Text.literal("Added Node ${player.blockPos}!"))
        return Command.SINGLE_SUCCESS
    }

    fun clearNodes(ctx: CommandContext<FabricClientCommandSource>): Int {
        val src = ctx.source ?: return -1
        val count = nodes.size
        nodes.clear()
        src.sendFeedback(Text.literal("$count nodes cleared"))
        return Command.SINGLE_SUCCESS
    }
}
