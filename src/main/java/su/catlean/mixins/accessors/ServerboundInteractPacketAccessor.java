package su.catlean.mixins.accessors;

import net.minecraft.class_2824;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/ServerboundInteractPacketAccessor.class */
@Mixin({class_2824.class})
public interface ServerboundInteractPacketAccessor {
    @Accessor("field_12870")
    @Mutable
    void setEntityId(int i);
}
