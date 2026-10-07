package su.catlean.mixins.accessors;

import net.minecraft.class_10860;
import net.minecraft.class_10866;
import net.minecraft.class_10867;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/RenderPassAccessor.class */
@Mixin({class_10866.class})
public interface RenderPassAccessor {
    @Accessor("field_57868")
    void setPipeline(class_10867 class_10867Var);

    @Accessor("field_57877")
    class_10860 getEncoder();
}
