package kotlin.reflect;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KClassesImpl.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/KClassesImplKt.class */
public final class KClassesImplKt {
    @Nullable
    public static final String getQualifiedOrSimpleName(@NotNull KClass<?> $this$qualifiedOrSimpleName) {
        Intrinsics.checkNotNullParameter($this$qualifiedOrSimpleName, "<this>");
        return $this$qualifiedOrSimpleName.getQualifiedName();
    }
}
