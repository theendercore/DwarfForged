package org.teamvoided.dwarf_forged.client.cavenet

import com.mojang.brigadier.Command
import com.mojang.brigadier.context.CommandContext
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager.literal
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.minecraft.client.world.ClientWorld
import net.minecraft.text.Text
import net.minecraft.util.math.BlockPos

object CaveNet {
    val nodes = mutableListOf<BlockPos>()
    fun init() {
        CNRenderer.init()
        ClientTickEvents.END_WORLD_TICK.register(::worldTick)

        ClientCommandRegistrationCallback.EVENT.register { dispatcher, ctx ->
            val root = literal("cavenet").build()
            dispatcher.root.addChild(root)

            val addNode = literal("add_node").executes(::addNode).build()
            root.addChild(addNode)
        }
    }

    fun addNode(ctx: CommandContext<FabricClientCommandSource>): Int {
        val src = ctx.source ?: return -1
        val player = src.player ?: return -1
        nodes.add(player.blockPos)
        src.sendFeedback(Text.literal("Added Node ${player.blockPos}!"))
        return Command.SINGLE_SUCCESS
    }

    fun worldTick(world: ClientWorld) {

    }
}
