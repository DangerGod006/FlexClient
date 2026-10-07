package su.catlean.mixins.accessors;

import net.minecraft.class_4597;
import net.minecraft.class_4603;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/ScreenEffectRendererAccessor.class */
@Mixin({class_4603.class})
public interface ScreenEffectRendererAccessor {
    @Accessor("field_59971")
    class_4597 getVertexConsumerProvider();
}
