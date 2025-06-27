package org.teamvoided.dwarf_forged.mixin.client;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.client.render.BackgroundRenderer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.CameraSubmersionType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import static org.teamvoided.dwarf_forged.client.util.WidgetHelpersKt.getCustomFogEnd;
import static org.teamvoided.dwarf_forged.client.util.WidgetHelpersKt.getCustomFogStart;

@Mixin(BackgroundRenderer.class)
public abstract class BackgroundRendererMixin {


    @WrapOperation(method = "applyFog", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;setShaderFogStart(F)V", remap = false))
    private static void modifySetShaderFogStart(float original, Operation<Void> originalCall,
                                                @Local(argsOnly = true) Camera camera,
                                                @Local(argsOnly = true, ordinal = 0) float viewDistance,
                                                @Local CameraSubmersionType cameraType) {
        var customFog = getCustomFogStart(original, camera, viewDistance, cameraType);
        originalCall.call((customFog != null) ? customFog : original);
    }

    @WrapOperation(method = "applyFog", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/systems/RenderSystem;setShaderFogEnd(F)V", remap = false))
    private static void modifySetShaderFogEnd(float original, Operation<Void> originalCall,
                                              @Local(argsOnly = true) Camera camera,
                                              @Local(argsOnly = true, ordinal = 0) float viewDistance,
                                              @Local CameraSubmersionType cameraType) {
        var customFog = getCustomFogEnd(original, camera, viewDistance, cameraType);
        originalCall.call((customFog != null) ? customFog : original);
    }

}
