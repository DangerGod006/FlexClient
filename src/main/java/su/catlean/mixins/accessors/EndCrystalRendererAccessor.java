package su.catlean.mixins.accessors;

import net.minecraft.class_892;
import net.minecraft.class_9946;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/EndCrystalRendererAccessor.class */
@Mixin({class_892.class})
public interface EndCrystalRendererAccessor {
    @Accessor("field_53187")
    class_9946 getModel();
}
