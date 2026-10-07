package su.catlean.mixins.accessors;

import net.minecraft.class_10182;
import net.minecraft.class_2708;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/ClientboundPlayerPositionPacketAccessor.class */
@Mixin({class_2708.class})
public interface ClientboundPlayerPositionPacketAccessor {
    @Accessor("comp_3228")
    @Mutable
    void setChange(class_10182 class_10182Var);
}
