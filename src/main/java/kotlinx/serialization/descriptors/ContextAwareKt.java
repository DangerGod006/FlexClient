package kotlinx.serialization.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerialDescriptorForNullable;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/ContextAwareKt.class */
public final class ContextAwareKt {
    @ExperimentalSerializationApi
    public static /* synthetic */ void getCapturedKClass$annotations(SerialDescriptor serialDescriptor) {
    }

    @Nullable
    public static final KClass<?> getCapturedKClass(@NotNull SerialDescriptor $this$capturedKClass) {
        Intrinsics.checkNotNullParameter($this$capturedKClass, "<this>");
        if ($this$capturedKClass instanceof ContextDescriptor) {
            return ((ContextDescriptor) $this$capturedKClass).kClass;
        }
        if ($this$capturedKClass instanceof SerialDescriptorForNullable) {
            return getCapturedKClass(((SerialDescriptorForNullable) $this$capturedKClass).getOriginal$kotlinx_serialization_core());
        }
        return null;
    }

    @ExperimentalSerializationApi
    @Nullable
    public static final SerialDescriptor getContextualDescriptor(@NotNull SerializersModule $this$getContextualDescriptor, @NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter($this$getContextualDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        KClass<?> capturedKClass = getCapturedKClass(descriptor);
        if (capturedKClass == null) {
            return null;
        }
        KSerializer contextual$default = SerializersModule.getContextual$default($this$getContextualDescriptor, capturedKClass, null, 2, null);
        if (contextual$default != null) {
            return contextual$default.getDescriptor();
        }
        return null;
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final List<SerialDescriptor> getPolymorphicDescriptors(@NotNull SerializersModule $this$getPolymorphicDescriptors, @NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter($this$getPolymorphicDescriptors, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        KClass<?> capturedKClass = getCapturedKClass(descriptor);
        if (capturedKClass == null) {
            return CollectionsKt.emptyList();
        }
        Map<KClass<?>, KSerializer<?>> map = ((SerialModuleImpl) $this$getPolymorphicDescriptors).polyBase2Serializers.get(capturedKClass);
        Iterable iterableValues = map != null ? map.values() : null;
        if (iterableValues == null) {
            iterableValues = CollectionsKt.emptyList();
        }
        Iterable $this$map$iv = iterableValues;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            KSerializer it = (KSerializer) item$iv$iv;
            destination$iv$iv.add(it.getDescriptor());
        }
        return (List) destination$iv$iv;
    }

    @NotNull
    public static final SerialDescriptor withContext(@NotNull SerialDescriptor $this$withContext, @NotNull KClass<?> context) {
        Intrinsics.checkNotNullParameter($this$withContext, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new ContextDescriptor($this$withContext, context);
    }
}
