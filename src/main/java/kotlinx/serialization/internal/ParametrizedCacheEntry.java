package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/ParametrizedCacheEntry.class */
final class ParametrizedCacheEntry<T> {

    @NotNull
    private final ConcurrentHashMap<List<KTypeWrapper>, Result<KSerializer<T>>> serializers = new ConcurrentHashMap<>();

    @NotNull
    /* JADX INFO: renamed from: computeIfAbsent-gIAlu-s, reason: not valid java name */
    public final Object m1835computeIfAbsentgIAlus(@NotNull List<? extends KType> types, @NotNull Function0<? extends KSerializer<T>> producer) {
        Object objM185constructorimpl;
        Intrinsics.checkNotNullParameter(types, "types");
        Intrinsics.checkNotNullParameter(producer, "producer");
        List<? extends KType> $this$map$iv = types;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            KType it = (KType) item$iv$iv;
            destination$iv$iv.add(new KTypeWrapper(it));
        }
        ArrayList arrayList = (List) destination$iv$iv;
        ConcurrentMap $this$getOrPut$iv = this.serializers;
        Object objPutIfAbsent = $this$getOrPut$iv.get(arrayList);
        if (objPutIfAbsent == null) {
            try {
                Result.Companion companion = Result.Companion;
                objM185constructorimpl = Result.m185constructorimpl(producer.invoke());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM185constructorimpl = Result.m185constructorimpl(ResultKt.createFailure(th));
            }
            Result resultM186boximpl = Result.m186boximpl(objM185constructorimpl);
            objPutIfAbsent = $this$getOrPut$iv.putIfAbsent(arrayList, resultM186boximpl);
            if (objPutIfAbsent == null) {
                objPutIfAbsent = resultM186boximpl;
            }
        }
        Intrinsics.checkNotNullExpressionValue(objPutIfAbsent, "getOrPut(...)");
        return ((Result) objPutIfAbsent).m187unboximpl();
    }
}
