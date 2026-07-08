package dev.lvstrng.argon.utils;

import dev.lvstrng.argon.Argon;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.runtime.ObjectMethods;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector4f;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/utils/ProjectionUtils.class */
public final class ProjectionUtils {
    private ProjectionUtils() {
    }

    @Nullable
    public static ProjectedPoint project(class_243 worldPos) {
        class_4184 camera;
        if (Argon.mc.field_1687 == null || Argon.mc.field_1773 == null || (camera = Argon.mc.field_1773.method_19418()) == null) {
            return null;
        }
        int width = Argon.mc.method_22683().method_4486();
        int height = Argon.mc.method_22683().method_4502();
        if (width <= 0 || height <= 0) {
            return null;
        }
        class_243 cameraPos = camera.method_71156();
        Vector4f clip = new Vector4f((float) (worldPos.field_1352 - cameraPos.field_1352), (float) (worldPos.field_1351 - cameraPos.field_1351), (float) (worldPos.field_1350 - cameraPos.field_1350), 1.0f);
        Matrix4f view = new Matrix4f().rotateX((float) Math.toRadians(camera.method_19329())).rotateY((float) Math.toRadians(camera.method_19330() + 180.0f));
        Matrix4f projection = new Matrix4f().setPerspective((float) Math.toRadians(((Integer) Argon.mc.field_1690.method_41808().method_41753()).intValue()), width / height, 0.05f, ((Integer) Argon.mc.field_1690.method_42503().method_41753()).intValue() * 16.0f);
        view.transform(clip);
        projection.transform(clip);
        if (clip.w <= 0.0f) {
            return null;
        }
        float ndcX = clip.x / clip.w;
        float ndcY = clip.y / clip.w;
        float ndcZ = clip.z / clip.w;
        if (ndcZ < -1.0f || ndcZ > 1.0f) {
            return null;
        }
        float screenX = ((ndcX * 0.5f) + 0.5f) * width;
        float screenY = (1.0f - ((ndcY * 0.5f) + 0.5f)) * height;
        return new ProjectedPoint(screenX, screenY, ndcZ);
    }

    /* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/utils/ProjectionUtils$ProjectedPoint.class */
    public static final class ProjectedPoint extends Record {
        private final float x;
        private final float y;
        private final float depth;

        public ProjectedPoint(float x, float y, float depth) {
            this.x = x;
            this.y = y;
            this.depth = depth;
        }

        @Override // java.lang.Record
        public final String toString() {
            return (String) ObjectMethods.bootstrap(MethodHandles.lookup(), "toString", MethodType.methodType(String.class, ProjectedPoint.class), ProjectedPoint.class, "x;y;depth", "FIELD:Ldev/lvstrng/argon/utils/ProjectionUtils$ProjectedPoint;->x:F", "FIELD:Ldev/lvstrng/argon/utils/ProjectionUtils$ProjectedPoint;->y:F", "FIELD:Ldev/lvstrng/argon/utils/ProjectionUtils$ProjectedPoint;->depth:F").dynamicInvoker().invoke(this) /* invoke-custom */;
        }

        @Override // java.lang.Record
        public final int hashCode() {
            return (int) ObjectMethods.bootstrap(MethodHandles.lookup(), "hashCode", MethodType.methodType(Integer.TYPE, ProjectedPoint.class), ProjectedPoint.class, "x;y;depth", "FIELD:Ldev/lvstrng/argon/utils/ProjectionUtils$ProjectedPoint;->x:F", "FIELD:Ldev/lvstrng/argon/utils/ProjectionUtils$ProjectedPoint;->y:F", "FIELD:Ldev/lvstrng/argon/utils/ProjectionUtils$ProjectedPoint;->depth:F").dynamicInvoker().invoke(this) /* invoke-custom */;
        }

        @Override // java.lang.Record
        public final boolean equals(Object o) {
            return (boolean) ObjectMethods.bootstrap(MethodHandles.lookup(), "equals", MethodType.methodType(Boolean.TYPE, ProjectedPoint.class, Object.class), ProjectedPoint.class, "x;y;depth", "FIELD:Ldev/lvstrng/argon/utils/ProjectionUtils$ProjectedPoint;->x:F", "FIELD:Ldev/lvstrng/argon/utils/ProjectionUtils$ProjectedPoint;->y:F", "FIELD:Ldev/lvstrng/argon/utils/ProjectionUtils$ProjectedPoint;->depth:F").dynamicInvoker().invoke(this, o) /* invoke-custom */;
        }

        public float x() {
            return this.x;
        }

        public float y() {
            return this.y;
        }

        public float depth() {
            return this.depth;
        }
    }
}
