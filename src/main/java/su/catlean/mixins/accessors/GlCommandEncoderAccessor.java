package su.catlean.mixins.accessors;

import net.minecraft.class_10860;
import net.minecraft.class_10865;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/GlCommandEncoderAccessor.class */
@Mixin({class_10860.class})
public interface GlCommandEncoderAccessor {
    @Accessor("field_57844")
    class_10865 getBackendCatlean();
}
