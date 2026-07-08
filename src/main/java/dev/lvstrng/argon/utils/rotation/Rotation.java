package dev.lvstrng.argon.utils.rotation;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/utils/rotation/Rotation.class */
public final class Rotation extends Record {
    private final double yaw;
    private final double pitch;

    public Rotation(double yaw, double pitch) {
        this.yaw = yaw;
        this.pitch = pitch;
    }

    @Override // java.lang.Record
    public final String toString() {
        return (String) ObjectMethods.bootstrap(MethodHandles.lookup(), "toString", MethodType.methodType(String.class, Rotation.class), Rotation.class, "yaw;pitch", "FIELD:Ldev/lvstrng/argon/utils/rotation/Rotation;->yaw:D", "FIELD:Ldev/lvstrng/argon/utils/rotation/Rotation;->pitch:D").dynamicInvoker().invoke(this) /* invoke-custom */;
    }

    @Override // java.lang.Record
    public final int hashCode() {
        return (int) ObjectMethods.bootstrap(MethodHandles.lookup(), "hashCode", MethodType.methodType(Integer.TYPE, Rotation.class), Rotation.class, "yaw;pitch", "FIELD:Ldev/lvstrng/argon/utils/rotation/Rotation;->yaw:D", "FIELD:Ldev/lvstrng/argon/utils/rotation/Rotation;->pitch:D").dynamicInvoker().invoke(this) /* invoke-custom */;
    }

    @Override // java.lang.Record
    public final boolean equals(Object o) {
        return (boolean) ObjectMethods.bootstrap(MethodHandles.lookup(), "equals", MethodType.methodType(Boolean.TYPE, Rotation.class, Object.class), Rotation.class, "yaw;pitch", "FIELD:Ldev/lvstrng/argon/utils/rotation/Rotation;->yaw:D", "FIELD:Ldev/lvstrng/argon/utils/rotation/Rotation;->pitch:D").dynamicInvoker().invoke(this, o) /* invoke-custom */;
    }

    public double yaw() {
        return this.yaw;
    }

    public double pitch() {
        return this.pitch;
    }
}
