package su.catlean.mixins.accessors;

import net.minecraft.class_241;
import net.minecraft.class_744;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/ClientInputAccessor.class */
@Mixin({class_744.class})
public interface ClientInputAccessor {
    @Accessor("field_55868")
    void setMoveVector(class_241 class_241Var);
}
