package su.catlean.mixins.accessors;

import net.minecraft.class_2828;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/ServerboundMovePlayerPacketAccessor.class */
@Mixin({class_2828.class})
public interface ServerboundMovePlayerPacketAccessor {
    @Accessor("field_29179")
    @Mutable
    void setGround(boolean z);
}
