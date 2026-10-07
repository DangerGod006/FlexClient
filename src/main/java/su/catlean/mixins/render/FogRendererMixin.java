package su.catlean.mixins.render;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.minecraft.class_758;
import org.joml.Vector4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import su.catlean.api.event.GetFogBufferEvent;
import su.catlean.api.event.events.world.ApplyFogEvent;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/render/FogRendererMixin.class */
@Mixin({class_758.class})
public abstract class FogRendererMixin {
    @ModifyVariable(method = {"method_71110(Ljava/nio/ByteBuffer;ILorg/joml/Vector4f;FFFFFF)V"}, at = @At("HEAD"), argsOnly = true)
    private Vector4f applyFogHook(Vector4f original) {
        if (original.w != 0.0f && ApplyFogEvent.INSTANCE.call()) {
            return ApplyFogEvent.INSTANCE.getColorVec();
        }
        return original;
    }

    @ModifyVariable(method = {"method_71110(Ljava/nio/ByteBuffer;ILorg/joml/Vector4f;FFFFFF)V"}, at = @At("HEAD"), argsOnly = true, index = 4)
    private float modifyEnvironmentalStart(float value) {
        if (ApplyFogEvent.INSTANCE.call()) {
            return ApplyFogEvent.INSTANCE.getEStart();
        }
        return value;
    }

    @ModifyVariable(method = {"method_71110(Ljava/nio/ByteBuffer;ILorg/joml/Vector4f;FFFFFF)V"}, at = @At("HEAD"), argsOnly = true, index = AbstractJsonLexerKt.TC_COLON)
    private float envEndHook(float value) {
        if (ApplyFogEvent.INSTANCE.call()) {
            return ApplyFogEvent.INSTANCE.getEEnd();
        }
        return value;
    }

    @ModifyVariable(method = {"method_71110(Ljava/nio/ByteBuffer;ILorg/joml/Vector4f;FFFFFF)V"}, at = @At("HEAD"), argsOnly = true, index = AbstractJsonLexerKt.TC_BEGIN_OBJ)
    private float renderStartHook(float value) {
        if (ApplyFogEvent.INSTANCE.call()) {
            return ApplyFogEvent.INSTANCE.getRStart();
        }
        return value;
    }

    @ModifyVariable(method = {"method_71110(Ljava/nio/ByteBuffer;ILorg/joml/Vector4f;FFFFFF)V"}, at = @At("HEAD"), argsOnly = true, index = AbstractJsonLexerKt.TC_END_OBJ)
    private float renderEndHook(float value) {
        if (ApplyFogEvent.INSTANCE.call()) {
            return ApplyFogEvent.INSTANCE.getREnd();
        }
        return value;
    }

    @ModifyExpressionValue(method = {"method_71109"}, at = {@At(value = "FIELD", target = "Lnet/minecraft/class_758;field_54018:Z")})
    private boolean getFogBufferHook(boolean value) {
        if (GetFogBufferEvent.INSTANCE.call()) {
            return false;
        }
        return value;
    }
}
