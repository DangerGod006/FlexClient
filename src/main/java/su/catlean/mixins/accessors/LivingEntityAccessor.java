package su.catlean.mixins.accessors;

import net.minecraft.class_1309;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/LivingEntityAccessor.class */
@Mixin({class_1309.class})
public interface LivingEntityAccessor {
    @Accessor("field_6273")
    int getLastAttackedTicks();

    @Accessor("field_6228")
    int getLastJumpCooldown();

    @Accessor("field_6228")
    void setLastJumpCooldown(int i);
}
