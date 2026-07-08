package dev.lvstrng.argon.imixin;

import net.minecraft.class_2382;
import org.joml.Vector3d;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/imixin/IVec3d.class */
public interface IVec3d {
    void set(double d, double d2, double d3);

    void setXZ(double d, double d2);

    void setY(double d);

    default void set(class_2382 vec) {
        set(vec.method_10263(), vec.method_10264(), vec.method_10260());
    }

    default void set(Vector3d vec) {
        set(vec.x, vec.y, vec.z);
    }
}
