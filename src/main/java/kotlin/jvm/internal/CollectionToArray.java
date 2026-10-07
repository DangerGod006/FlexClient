package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CollectionToArray.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/jvm/internal/CollectionToArray.class */
@JvmName(name = "CollectionToArray")
public final class CollectionToArray {

    @NotNull
    private static final Object[] EMPTY = new Object[0];
    private static final int MAX_SIZE = 2147483645;

    @JvmName(name = "toArray")
    @NotNull
    @Deprecated(message = "This function will be made internal in a future release")
    @DeprecatedSinceKotlin(warningSince = "1.9", errorSince = "2.1")
    public static final Object[] toArray(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        int size$iv = collection.size();
        if (size$iv == 0) {
            return EMPTY;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return EMPTY;
        }
        Object[] result$iv = new Object[size$iv];
        int i$iv = 0;
        while (true) {
            int i = i$iv;
            i$iv++;
            result$iv[i] = it.next();
            if (i$iv >= result$iv.length) {
                if (!it.hasNext()) {
                    return result$iv;
                }
                int newSize$iv = ((i$iv * 3) + 1) >>> 1;
                if (newSize$iv <= i$iv) {
                    if (i$iv >= MAX_SIZE) {
                        throw new OutOfMemoryError();
                    }
                    newSize$iv = MAX_SIZE;
                }
                Object[] objArrCopyOf = Arrays.copyOf(result$iv, newSize$iv);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                result$iv = objArrCopyOf;
            } else if (!it.hasNext()) {
                Object[] result = result$iv;
                Object[] objArrCopyOf2 = Arrays.copyOf(result, i$iv);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
        }
    }

    @JvmName(name = "toArray")
    @NotNull
    @Deprecated(message = "This function will be made internal in a future release")
    @DeprecatedSinceKotlin(warningSince = "1.9", errorSince = "2.1")
    public static final Object[] toArray(@NotNull Collection<?> collection, @Nullable Object[] a) {
        Object[] objArr;
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (a == null) {
            throw new NullPointerException();
        }
        int size$iv = collection.size();
        if (size$iv == 0) {
            if (a.length > 0) {
                a[0] = null;
            }
            return a;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (a.length > 0) {
                a[0] = null;
            }
            return a;
        }
        if (size$iv <= a.length) {
            objArr = a;
        } else {
            Object objNewInstance = Array.newInstance(a.getClass().getComponentType(), size$iv);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = (Object[]) objNewInstance;
        }
        Object[] result$iv = objArr;
        int i$iv = 0;
        while (true) {
            int i = i$iv;
            i$iv++;
            result$iv[i] = it.next();
            if (i$iv >= result$iv.length) {
                if (!it.hasNext()) {
                    return result$iv;
                }
                int newSize$iv = ((i$iv * 3) + 1) >>> 1;
                if (newSize$iv <= i$iv) {
                    if (i$iv >= MAX_SIZE) {
                        throw new OutOfMemoryError();
                    }
                    newSize$iv = MAX_SIZE;
                }
                Object[] objArrCopyOf = Arrays.copyOf(result$iv, newSize$iv);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                result$iv = objArrCopyOf;
            } else if (!it.hasNext()) {
                Object[] result = result$iv;
                if (result == a) {
                    a[i$iv] = null;
                    return a;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(result, i$iv);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
        }
    }

    private static final Object[] toArrayImpl(Collection<?> collection, Function0<Object[]> empty, Function1<? super Integer, Object[]> alloc, Function2<? super Object[], ? super Integer, Object[]> trim) {
        int size = collection.size();
        if (size == 0) {
            return empty.invoke();
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return empty.invoke();
        }
        Object[] result = alloc.invoke(Integer.valueOf(size));
        int i = 0;
        while (true) {
            int i2 = i;
            i++;
            result[i2] = it.next();
            if (i >= result.length) {
                if (!it.hasNext()) {
                    return result;
                }
                int newSize = ((i * 3) + 1) >>> 1;
                if (newSize <= i) {
                    if (i >= MAX_SIZE) {
                        throw new OutOfMemoryError();
                    }
                    newSize = MAX_SIZE;
                }
                Object[] objArrCopyOf = Arrays.copyOf(result, newSize);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                result = objArrCopyOf;
            } else if (!it.hasNext()) {
                return trim.invoke(result, Integer.valueOf(i));
            }
        }
    }
}
