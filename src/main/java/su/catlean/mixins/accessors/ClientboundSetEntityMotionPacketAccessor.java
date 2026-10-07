package su.catlean.mixins.accessors;

import net.minecraft.class_243;
import net.minecraft.class_2743;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/ClientboundSetEntityMotionPacketAccessor.class */
@Mixin({class_2743.class})
public interface ClientboundSetEntityMotionPacketAccessor {
    @Accessor("field_61887")
    @Mutable
    void setMovement(class_243 class_243Var);
}
