package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/EnumsKt.class */
public final class EnumsKt {
    @PublishedApi
    @NotNull
    public static final <T extends Enum<T>> KSerializer<T> createSimpleEnumSerializer(@NotNull String serialName, @NotNull T[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        return new EnumSerializer(serialName, values);
    }

    @PublishedApi
    @NotNull
    public static final <T extends Enum<T>> KSerializer<T> createMarkedEnumSerializer(@NotNull String serialName, @NotNull T[] values, @NotNull String[] names, @NotNull Annotation[][] annotations) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        EnumDescriptor descriptor = new EnumDescriptor(serialName, values.length);
        int index$iv = 0;
        for (T t : values) {
            int i = index$iv;
            index$iv++;
            String strName = (String) ArraysKt.getOrNull(names, i);
            if (strName == null) {
                strName = t.name();
            }
            String elementName = strName;
            PluginGeneratedSerialDescriptor.addElement$default(descriptor, elementName, false, 2, null);
            Annotation[] annotationArr = (Annotation[]) ArraysKt.getOrNull(annotations, i);
            if (annotationArr != null) {
                for (Annotation annotation : annotationArr) {
                    descriptor.pushAnnotation(annotation);
                }
            }
        }
        return new EnumSerializer(serialName, values, descriptor);
    }

    @PublishedApi
    @NotNull
    public static final <T extends Enum<T>> KSerializer<T> createAnnotatedEnumSerializer(@NotNull String serialName, @NotNull T[] values, @NotNull String[] names, @NotNull Annotation[][] entryAnnotations, @Nullable Annotation[] classAnnotations) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(entryAnnotations, "entryAnnotations");
        EnumDescriptor descriptor = new EnumDescriptor(serialName, values.length);
        if (classAnnotations != null) {
            for (Annotation annotation : classAnnotations) {
                descriptor.pushClassAnnotation(annotation);
            }
        }
        int index$iv = 0;
        for (T t : values) {
            int i = index$iv;
            index$iv++;
            String strName = (String) ArraysKt.getOrNull(names, i);
            if (strName == null) {
                strName = t.name();
            }
            String elementName = strName;
            PluginGeneratedSerialDescriptor.addElement$default(descriptor, elementName, false, 2, null);
            Annotation[] annotationArr = (Annotation[]) ArraysKt.getOrNull(entryAnnotations, i);
            if (annotationArr != null) {
                for (Annotation annotation2 : annotationArr) {
                    descriptor.pushAnnotation(annotation2);
                }
            }
        }
        return new EnumSerializer(serialName, values, descriptor);
    }
}
