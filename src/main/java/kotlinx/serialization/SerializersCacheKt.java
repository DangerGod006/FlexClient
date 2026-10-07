package kotlinx.serialization;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.CachingKt;
import kotlinx.serialization.internal.ParametrizedSerializerCache;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.SerializerCache;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SerializersCache.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/SerializersCacheKt.class */
public final class SerializersCacheKt {

    @NotNull
    private static final SerializerCache<? extends Object> SERIALIZERS_CACHE = CachingKt.createCache(SerializersCacheKt::SERIALIZERS_CACHE$lambda$0);

    @NotNull
    private static final SerializerCache<Object> SERIALIZERS_CACHE_NULLABLE = CachingKt.createCache(SerializersCacheKt::SERIALIZERS_CACHE_NULLABLE$lambda$1);

    @NotNull
    private static final ParametrizedSerializerCache<? extends Object> PARAMETRIZED_SERIALIZERS_CACHE = CachingKt.createParametrizedCache(SerializersCacheKt::PARAMETRIZED_SERIALIZERS_CACHE$lambda$3);

    @NotNull
    private static final ParametrizedSerializerCache<Object> PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE = CachingKt.createParametrizedCache(SerializersCacheKt::PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5);

    public static /* synthetic */ void getSERIALIZERS_CACHE$annotations() {
    }

    private static /* synthetic */ void getSERIALIZERS_CACHE_NULLABLE$annotations() {
    }

    private static /* synthetic */ void getPARAMETRIZED_SERIALIZERS_CACHE$annotations() {
    }

    private static /* synthetic */ void getPARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$annotations() {
    }

    @NotNull
    public static final SerializerCache<? extends Object> getSERIALIZERS_CACHE() {
        return SERIALIZERS_CACHE;
    }

    private static final KSerializer SERIALIZERS_CACHE$lambda$0(KClass it) {
        Intrinsics.checkNotNullParameter(it, "it");
        KSerializer kSerializerSerializerOrNull = SerializersKt.serializerOrNull(it);
        if (kSerializerSerializerOrNull != null) {
            return kSerializerSerializerOrNull;
        }
        return PlatformKt.isInterface(it) ? new PolymorphicSerializer(it) : null;
    }

    private static final KSerializer SERIALIZERS_CACHE_NULLABLE$lambda$1(KClass it) {
        KSerializer $this$cast$iv;
        Intrinsics.checkNotNullParameter(it, "it");
        PolymorphicSerializer polymorphicSerializerSerializerOrNull = SerializersKt.serializerOrNull(it);
        if (polymorphicSerializerSerializerOrNull == null) {
            polymorphicSerializerSerializerOrNull = PlatformKt.isInterface(it) ? new PolymorphicSerializer(it) : null;
        }
        if (polymorphicSerializerSerializerOrNull == null || ($this$cast$iv = BuiltinSerializersKt.getNullable(polymorphicSerializerSerializerOrNull)) == null) {
            return null;
        }
        return $this$cast$iv;
    }

    private static final KSerializer PARAMETRIZED_SERIALIZERS_CACHE$lambda$3(KClass clazz, List types) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        List<KSerializer<Object>> listSerializersForParameters = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), types, true);
        Intrinsics.checkNotNull(listSerializersForParameters);
        return SerializersKt.parametrizedSerializerOrNull(clazz, listSerializersForParameters, () -> {
            return PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2(r2);
        });
    }

    private static final KClassifier PARAMETRIZED_SERIALIZERS_CACHE$lambda$3$lambda$2(List $types) {
        return ((KType) $types.get(0)).getClassifier();
    }

    private static final KSerializer PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5(KClass clazz, List types) {
        KSerializer $this$cast$iv;
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        List<KSerializer<Object>> listSerializersForParameters = SerializersKt.serializersForParameters(SerializersModuleBuildersKt.EmptySerializersModule(), types, true);
        Intrinsics.checkNotNull(listSerializersForParameters);
        KSerializer<? extends Object> kSerializerParametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(clazz, listSerializersForParameters, () -> {
            return PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4(r2);
        });
        if (kSerializerParametrizedSerializerOrNull == null || ($this$cast$iv = BuiltinSerializersKt.getNullable(kSerializerParametrizedSerializerOrNull)) == null) {
            return null;
        }
        return $this$cast$iv;
    }

    private static final KClassifier PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE$lambda$5$lambda$4(List $types) {
        return ((KType) $types.get(0)).getClassifier();
    }

    @Nullable
    public static final KSerializer<Object> findCachedSerializer(@NotNull KClass<Object> clazz, boolean isNullable) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!isNullable) {
            KSerializer<? extends Object> kSerializer = SERIALIZERS_CACHE.get(clazz);
            if (kSerializer != null) {
                return kSerializer;
            }
            return null;
        }
        return SERIALIZERS_CACHE_NULLABLE.get(clazz);
    }

    @NotNull
    public static final Object findParametrizedCachedSerializer(@NotNull KClass<Object> clazz, @NotNull List<? extends KType> types, boolean isNullable) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(types, "types");
        if (!isNullable) {
            return PARAMETRIZED_SERIALIZERS_CACHE.mo1817getgIAlus(clazz, types);
        }
        return PARAMETRIZED_SERIALIZERS_CACHE_NULLABLE.mo1817getgIAlus(clazz, types);
    }

    @Nullable
    public static final PolymorphicSerializer<? extends Object> polymorphicIfInterface(@NotNull KClass<?> $this$polymorphicIfInterface) {
        Intrinsics.checkNotNullParameter($this$polymorphicIfInterface, "<this>");
        if (PlatformKt.isInterface($this$polymorphicIfInterface)) {
            return new PolymorphicSerializer<>($this$polymorphicIfInterface);
        }
        return null;
    }
}
