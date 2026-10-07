package kotlinx.serialization.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Platform.common.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/Platform_commonKt.class */
public final class Platform_commonKt {

    @NotNull
    private static final SerialDescriptor[] EMPTY_DESCRIPTOR_ARRAY = new SerialDescriptor[0];

    @NotNull
    public static final Set<String> cachedSerialNames(@NotNull SerialDescriptor $this$cachedSerialNames) {
        Intrinsics.checkNotNullParameter($this$cachedSerialNames, "<this>");
        if ($this$cachedSerialNames instanceof CachedNames) {
            return ((CachedNames) $this$cachedSerialNames).getSerialNames();
        }
        HashSet result = new HashSet($this$cachedSerialNames.getElementsCount());
        int elementsCount = $this$cachedSerialNames.getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            result.add($this$cachedSerialNames.getElementName(i));
        }
        return result;
    }

    @NotNull
    public static final SerialDescriptor[] compactArray(@Nullable List<? extends SerialDescriptor> $this$compactArray) {
        List<? extends SerialDescriptor> list = $this$compactArray;
        Collection collection = !(list == null || list.isEmpty()) ? $this$compactArray : null;
        if (collection != null) {
            Collection $this$toTypedArray$iv = collection;
            SerialDescriptor[] serialDescriptorArr = (SerialDescriptor[]) $this$toTypedArray$iv.toArray(new SerialDescriptor[0]);
            if (serialDescriptorArr != null) {
                return serialDescriptorArr;
            }
        }
        return EMPTY_DESCRIPTOR_ARRAY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @PublishedApi
    @NotNull
    public static final <T> KSerializer<T> cast(@NotNull KSerializer<?> $this$cast) {
        Intrinsics.checkNotNullParameter($this$cast, "<this>");
        return $this$cast;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @PublishedApi
    @NotNull
    public static final <T> SerializationStrategy<T> cast(@NotNull SerializationStrategy<?> $this$cast) {
        Intrinsics.checkNotNullParameter($this$cast, "<this>");
        return $this$cast;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @PublishedApi
    @NotNull
    public static final <T> DeserializationStrategy<T> cast(@NotNull DeserializationStrategy<?> $this$cast) {
        Intrinsics.checkNotNullParameter($this$cast, "<this>");
        return $this$cast;
    }

    @NotNull
    public static final Void serializerNotRegistered(@NotNull KClass<?> $this$serializerNotRegistered) {
        Intrinsics.checkNotNullParameter($this$serializerNotRegistered, "<this>");
        throw new SerializationException(notRegisteredMessage($this$serializerNotRegistered));
    }

    @NotNull
    public static final String notRegisteredMessage(@NotNull KClass<?> $this$notRegisteredMessage) {
        Intrinsics.checkNotNullParameter($this$notRegisteredMessage, "<this>");
        String simpleName = $this$notRegisteredMessage.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return notRegisteredMessage(simpleName);
    }

    @NotNull
    public static final String notRegisteredMessage(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    @NotNull
    public static final KClass<Object> kclass(@NotNull KType $this$kclass) {
        Intrinsics.checkNotNullParameter($this$kclass, "<this>");
        KClassifier t = $this$kclass.getClassifier();
        if (t instanceof KClass) {
            return (KClass) t;
        }
        if (t instanceof KTypeParameter) {
            throw new IllegalArgumentException("Captured type parameter " + t + " from generic non-reified function. Such functionality cannot be supported because " + t + " is erased, either specify serializer explicitly or make calling function inline with reified " + t + '.');
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + t);
    }

    @NotNull
    public static final KType typeOrThrow(@NotNull KTypeProjection $this$typeOrThrow) {
        Intrinsics.checkNotNullParameter($this$typeOrThrow, "<this>");
        KType type = $this$typeOrThrow.getType();
        if (type == null) {
            throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + $this$typeOrThrow.getType()).toString());
        }
        return type;
    }

    public static final <T, K> int elementsHashCodeBy(@NotNull Iterable<? extends T> $this$elementsHashCodeBy, @NotNull Function1<? super T, ? extends K> selector) {
        Intrinsics.checkNotNullParameter($this$elementsHashCodeBy, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        int accumulator$iv = 1;
        for (Object element$iv : $this$elementsHashCodeBy) {
            int hash = accumulator$iv;
            int i = 31 * hash;
            K kInvoke = selector.invoke(element$iv);
            accumulator$iv = i + (kInvoke != null ? kInvoke.hashCode() : 0);
        }
        return accumulator$iv;
    }
}
