package kotlinx.serialization.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Platform.common.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/ParametrizedSerializerCache.class */
public interface ParametrizedSerializerCache<T> {
    @NotNull
    /* JADX INFO: renamed from: get-gIAlu-s */
    Object mo1817getgIAlus(@NotNull KClass<Object> kClass, @NotNull List<? extends KType> list);

    /* JADX INFO: compiled from: Platform.common.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/ParametrizedSerializerCache$DefaultImpls.class */
    public static final class DefaultImpls {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: get-gIAlu-s$default, reason: not valid java name */
    static /* synthetic */ Object m1836getgIAlus$default(ParametrizedSerializerCache parametrizedSerializerCache, KClass kClass, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get-gIAlu-s");
        }
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return parametrizedSerializerCache.mo1817getgIAlus(kClass, list);
    }
}
