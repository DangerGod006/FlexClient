package su.catlean.mixins.accessors;

import net.minecraft.class_11246;
import net.minecraft.class_332;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/GuiGraphicsAccessor.class */
@Mixin({class_332.class})
public interface GuiGraphicsAccessor {
    @Accessor("field_59826")
    class_11246 getGuiRenderState();

    @Accessor("field_44659")
    class_332.class_8214 getScissorStack();
}
