package su.catlean.mixins.accessors;

import net.minecraft.class_11910;
import net.minecraft.class_312;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/MouseHandlerAccessor.class */
@Mixin({class_312.class})
public interface MouseHandlerAccessor {
    @Invoker("method_1601")
    void iMouseClick(long j, class_11910 class_11910Var, int i);
}
