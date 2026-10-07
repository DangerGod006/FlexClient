package su.catlean.mixins.accessors;

import java.util.Optional;
import net.minecraft.class_243;
import net.minecraft.class_2664;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/ClientboundExplodePacketAccessor.class */
@Mixin({class_2664.class})
public interface ClientboundExplodePacketAccessor {
    @Accessor("comp_2884")
    @Mutable
    void setPlayerKnockback(Optional<class_243> optional);
}
