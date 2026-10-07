package su.catlean.mixins.accessors;

import net.minecraft.class_746;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mixins/accessors/LocalPlayerAccessor.class */
@Mixin({class_746.class})
public interface LocalPlayerAccessor {
    @Invoker("method_3136")
    void iSendMovementPackets();

    @Accessor("field_3941")
    float getLastYaw();

    @Accessor("field_3925")
    float getLastPitch();

    @Accessor("field_3941")
    void setLastYaw(float f);

    @Accessor("field_3925")
    void setLastPitch(float f);

    @Accessor("field_3926")
    double getLastX();

    @Accessor("field_3940")
    double getLastBaseY();

    @Accessor("field_3924")
    double getLastZ();

    @Accessor("field_3922")
    void setJumpRidingScale(float f);
}
