package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/KTypeWrapper.class */
final class KTypeWrapper implements KType {

    @NotNull
    private final KType origin;

    public KTypeWrapper(@NotNull KType origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.origin = origin;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        return this.origin.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    @NotNull
    public List<KTypeProjection> getArguments() {
        return this.origin.getArguments();
    }

    @Override // kotlin.reflect.KType
    @Nullable
    public KClassifier getClassifier() {
        return this.origin.getClassifier();
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return this.origin.isMarkedNullable();
    }

    public boolean equals(@Nullable Object other) {
        if (other == null) {
            return false;
        }
        KType kType = this.origin;
        KTypeWrapper kTypeWrapper = other instanceof KTypeWrapper ? (KTypeWrapper) other : null;
        if (!Intrinsics.areEqual(kType, kTypeWrapper != null ? kTypeWrapper.origin : null)) {
            return false;
        }
        KClassifier kClassifier = getClassifier();
        if (kClassifier instanceof KClass) {
            KType kType2 = other instanceof KType ? (KType) other : null;
            KClassifier otherClassifier = kType2 != null ? kType2.getClassifier() : null;
            if (otherClassifier == null || !(otherClassifier instanceof KClass)) {
                return false;
            }
            return Intrinsics.areEqual(JvmClassMappingKt.getJavaClass((KClass) kClassifier), JvmClassMappingKt.getJavaClass((KClass) otherClassifier));
        }
        return false;
    }

    public int hashCode() {
        return this.origin.hashCode();
    }

    @NotNull
    public String toString() {
        return "KTypeWrapper: " + this.origin;
    }
}
