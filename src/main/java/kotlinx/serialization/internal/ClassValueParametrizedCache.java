package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/ClassValueParametrizedCache.class */
final class ClassValueParametrizedCache<T> implements ParametrizedSerializerCache<T> {

    @NotNull
    private final Function2<KClass<Object>, List<? extends KType>, KSerializer<T>> compute;

    @NotNull
    private final ClassValueReferences<ParametrizedCacheEntry<T>> classValue;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassValueParametrizedCache(@NotNull Function2<? super KClass<Object>, ? super List<? extends KType>, ? extends KSerializer<T>> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.classValue = new ClassValueReferences<>();
    }

    @Override // kotlinx.serialization.internal.ParametrizedSerializerCache
    @NotNull
    /* JADX INFO: renamed from: get-gIAlu-s, reason: not valid java name */
    public Object mo1817getgIAlus(@NotNull KClass<Object> key, @NotNull List<? extends KType> types) {
        Object objM185constructorimpl;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        ParametrizedCacheEntry<T> parametrizedCacheEntry = this.classValue.get(JvmClassMappingKt.getJavaClass((KClass) key));
        Intrinsics.checkNotNullExpressionValue(parametrizedCacheEntry, "get(...)");
        MutableSoftReference mutableSoftReference = (MutableSoftReference) parametrizedCacheEntry;
        T t = mutableSoftReference.reference.get();
        ParametrizedCacheEntry parametrizedCacheEntry2 = (ParametrizedCacheEntry) (t != null ? t : mutableSoftReference.getOrSetWithLock(new Function0<T>() { // from class: kotlinx.serialization.internal.ClassValueParametrizedCache$get-gIAlu-s$$inlined$getOrSet$1
            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return (T) new ParametrizedCacheEntry();
            }
        }));
        List<? extends KType> list = types;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new KTypeWrapper((KType) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        ConcurrentHashMap concurrentHashMap = parametrizedCacheEntry2.serializers;
        Object objPutIfAbsent = concurrentHashMap.get(arrayList2);
        if (objPutIfAbsent == null) {
            try {
                Result.Companion companion = Result.Companion;
                objM185constructorimpl = Result.m185constructorimpl(this.compute.invoke(key, types));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM185constructorimpl = Result.m185constructorimpl(ResultKt.createFailure(th));
            }
            Result resultM186boximpl = Result.m186boximpl(objM185constructorimpl);
            objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList2, resultM186boximpl);
            if (objPutIfAbsent == null) {
                objPutIfAbsent = resultM186boximpl;
            }
        }
        Intrinsics.checkNotNullExpressionValue(objPutIfAbsent, "getOrPut(...)");
        return ((Result) objPutIfAbsent).m187unboximpl();
    }
}
