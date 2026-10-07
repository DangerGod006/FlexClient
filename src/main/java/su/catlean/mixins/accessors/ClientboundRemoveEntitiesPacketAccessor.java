package su.catlean.mixins.accessors;

import it.unimi.dsi.fastutil.ints.IntList;
import net.minecraft.class_2716;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/ClientboundRemoveEntitiesPacketAccessor.class */
@Mixin({class_2716.class})
public interface ClientboundRemoveEntitiesPacketAccessor {
    @Accessor("field_33690")
    IntList getIds();

    @Accessor("field_33690")
    @Mutable
    void setIds(IntList intList);
}
