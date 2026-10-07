package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/ConcurrentHashMapParametrizedCache.class */
final class ConcurrentHashMapParametrizedCache<T> implements ParametrizedSerializerCache<T> {

    @NotNull
    private final Function2<KClass<Object>, List<? extends KType>, KSerializer<T>> compute;

    @NotNull
    private final ConcurrentHashMap<Class<?>, ParametrizedCacheEntry<T>> cache;

    /* JADX WARN: Multi-variable type inference failed */
    public ConcurrentHashMapParametrizedCache(@NotNull Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    @NotNull
    /* JADX INFO: renamed from: get-gIAlu-s */
    public Object mo1817getgIAlus(@NotNull KClass<Object> key, @NotNull List<? extends KType> types) {
        Object objM185constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ConcurrentMap $this$getOrPut$iv = this.cache;
        Class<?> javaClass = JvmClassMappingKt.getJavaClass((KClass) key);
        ParametrizedCacheEntry<T> parametrizedCacheEntryPutIfAbsent = $this$getOrPut$iv.get(javaClass);
        if (parametrizedCacheEntryPutIfAbsent == null) {
            ParametrizedCacheEntry<T> parametrizedCacheEntry = new ParametrizedCacheEntry<>();
            parametrizedCacheEntryPutIfAbsent = $this$getOrPut$iv.putIfAbsent(javaClass, parametrizedCacheEntry);
            if (parametrizedCacheEntryPutIfAbsent == null) {
                parametrizedCacheEntryPutIfAbsent = parametrizedCacheEntry;
            }
        }
        ParametrizedCacheEntry<T> parametrizedCacheEntry2 = parametrizedCacheEntryPutIfAbsent;
        List<? extends KType> $this$map$iv$iv = types;
        Collection destination$iv$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv$iv, 10));
        for (Object item$iv$iv$iv : $this$map$iv$iv) {
            KType it$iv = (KType) item$iv$iv$iv;
            destination$iv$iv$iv.add(new KTypeWrapper(it$iv));
        }
        ArrayList arrayList = (List) destination$iv$iv$iv;
        ConcurrentMap $this$getOrPut$iv$iv = ((ParametrizedCacheEntry) parametrizedCacheEntry2).serializers;
        Object objPutIfAbsent = $this$getOrPut$iv$iv.get(arrayList);
        if (objPutIfAbsent == null) {
            try {
                Result.Companion companion = Result.Companion;
                objM185constructorimpl = Result.m185constructorimpl(this.compute.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM185constructorimpl = Result.m185constructorimpl(ResultKt.createFailure(th));
            }
            Result resultM186boximpl = Result.m186boximpl(objM185constructorimpl);
            objPutIfAbsent = $this$getOrPut$iv$iv.putIfAbsent(arrayList, resultM186boximpl);
            if (objPutIfAbsent == null) {
                objPutIfAbsent = resultM186boximpl;
            }
        }
        Intrinsics.checkNotNullExpressionValue(objPutIfAbsent, "getOrPut(...)");
        return ((Result) objPutIfAbsent).m187unboximpl();
    }
}
