package kotlinx.serialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Serializers.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/SerializersKt__SerializersKt.class */
final /* synthetic */ class SerializersKt__SerializersKt {
    public static final /* synthetic */ <T> KSerializer<T> serializer() {
        Intrinsics.reifiedOperationMarker(6, "T");
        KSerializer $this$cast$iv = SerializersKt.serializer((KType) null);
        Intrinsics.checkNotNull($this$cast$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return $this$cast$iv;
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer(SerializersModule $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        Intrinsics.reifiedOperationMarker(6, "T");
        KSerializer $this$cast$iv = SerializersKt.serializer($this$serializer, (KType) null);
        Intrinsics.checkNotNull($this$cast$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return $this$cast$iv;
    }

    @NotNull
    public static final KSerializer<Object> serializer(@NotNull KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer<Object> serializer(@NotNull KClass<?> kClass, @NotNull List<? extends KSerializer<?>> typeArgumentsSerializers, boolean isNullable) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), kClass, typeArgumentsSerializers, isNullable);
    }

    @Nullable
    public static final KSerializer<Object> serializerOrNull(@NotNull KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    @NotNull
    public static final KSerializer<Object> serializer(@NotNull SerializersModule $this$serializer, @NotNull KType type) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        KSerializer<Object> kSerializerSerializerByKTypeImpl$SerializersKt__SerializersKt = serializerByKTypeImpl$SerializersKt__SerializersKt($this$serializer, type, true);
        if (kSerializerSerializerByKTypeImpl$SerializersKt__SerializersKt != null) {
            return kSerializerSerializerByKTypeImpl$SerializersKt__SerializersKt;
        }
        PlatformKt.platformSpecificSerializerNotRegistered(Platform_commonKt.kclass(type));
        throw new KotlinNothingValueException();
    }

    @ExperimentalSerializationApi
    @NotNull
    public static final KSerializer<Object> serializer(@NotNull SerializersModule $this$serializer, @NotNull KClass<?> kClass, @NotNull List<? extends KSerializer<?>> typeArgumentsSerializers, boolean isNullable) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        KSerializer<Object> kSerializerSerializerByKClassImpl$SerializersKt__SerializersKt = serializerByKClassImpl$SerializersKt__SerializersKt($this$serializer, kClass, typeArgumentsSerializers, isNullable);
        if (kSerializerSerializerByKClassImpl$SerializersKt__SerializersKt != null) {
            return kSerializerSerializerByKClassImpl$SerializersKt__SerializersKt;
        }
        PlatformKt.platformSpecificSerializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    @Nullable
    public static final KSerializer<Object> serializerOrNull(@NotNull SerializersModule $this$serializerOrNull, @NotNull KType type) {
        Intrinsics.checkNotNullParameter($this$serializerOrNull, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return serializerByKTypeImpl$SerializersKt__SerializersKt($this$serializerOrNull, type, false);
    }

    private static final KSerializer<Object> serializerByKTypeImpl$SerializersKt__SerializersKt(SerializersModule $this$serializerByKTypeImpl, KType type, boolean failOnMissingTypeArgSerializer) {
        KSerializer<Object> kSerializerFindCachedSerializer;
        PolymorphicSerializer polymorphicSerializerParametrizedSerializerOrNull;
        KClass<Object> kclass = Platform_commonKt.kclass(type);
        boolean isNullable = type.isMarkedNullable();
        Iterable $this$map$iv = type.getArguments();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            KTypeProjection p0 = (KTypeProjection) item$iv$iv;
            destination$iv$iv.add(Platform_commonKt.typeOrThrow(p0));
        }
        List typeArguments = (List) destination$iv$iv;
        if (typeArguments.isEmpty()) {
            if (PlatformKt.isInterface(kclass) && SerializersModule.getContextual$default($this$serializerByKTypeImpl, kclass, null, 2, null) != null) {
                kSerializerFindCachedSerializer = null;
            } else {
                kSerializerFindCachedSerializer = SerializersCacheKt.findCachedSerializer(kclass, isNullable);
            }
        } else if ($this$serializerByKTypeImpl.getHasInterfaceContextualSerializers$kotlinx_serialization_core()) {
            kSerializerFindCachedSerializer = null;
        } else {
            Object objFindParametrizedCachedSerializer = SerializersCacheKt.findParametrizedCachedSerializer(kclass, typeArguments, isNullable);
            kSerializerFindCachedSerializer = (KSerializer) (Result.m179isFailureimpl(objFindParametrizedCachedSerializer) ? null : objFindParametrizedCachedSerializer);
        }
        KSerializer<Object> kSerializer = kSerializerFindCachedSerializer;
        if (kSerializer == null) {
            if (typeArguments.isEmpty()) {
                polymorphicSerializerParametrizedSerializerOrNull = SerializersKt.serializerOrNull(kclass);
                if (polymorphicSerializerParametrizedSerializerOrNull == null) {
                    polymorphicSerializerParametrizedSerializerOrNull = SerializersModule.getContextual$default($this$serializerByKTypeImpl, kclass, null, 2, null);
                    if (polymorphicSerializerParametrizedSerializerOrNull == null) {
                        polymorphicSerializerParametrizedSerializerOrNull = PlatformKt.isInterface(kclass) ? new PolymorphicSerializer(kclass) : null;
                    }
                }
            } else {
                List<KSerializer<Object>> listSerializersForParameters = SerializersKt.serializersForParameters($this$serializerByKTypeImpl, typeArguments, failOnMissingTypeArgSerializer);
                if (listSerializersForParameters == null) {
                    return null;
                }
                polymorphicSerializerParametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(kclass, listSerializersForParameters, () -> {
                    return serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt(r2);
                });
                if (polymorphicSerializerParametrizedSerializerOrNull == null) {
                    polymorphicSerializerParametrizedSerializerOrNull = $this$serializerByKTypeImpl.getContextual(kclass, listSerializersForParameters);
                    if (polymorphicSerializerParametrizedSerializerOrNull == null) {
                        polymorphicSerializerParametrizedSerializerOrNull = PlatformKt.isInterface(kclass) ? new PolymorphicSerializer(kclass) : null;
                    }
                }
            }
            KSerializer<? extends Object> kSerializer2 = polymorphicSerializerParametrizedSerializerOrNull;
            if (kSerializer2 != null) {
                return nullable$SerializersKt__SerializersKt(kSerializer2, isNullable);
            }
            return null;
        }
        return kSerializer;
    }

    private static final KClassifier serializerByKTypeImpl$lambda$0$SerializersKt__SerializersKt(List $typeArguments) {
        return ((KType) $typeArguments.get(0)).getClassifier();
    }

    private static final KSerializer<Object> serializerByKClassImpl$SerializersKt__SerializersKt(SerializersModule $this$serializerByKClassImpl, KClass<Object> rootClass, List<? extends KSerializer<Object>> typeArgumentsSerializers, boolean isNullable) {
        KSerializer<? extends Object> kSerializerSerializerOrNull;
        if (typeArgumentsSerializers.isEmpty()) {
            kSerializerSerializerOrNull = SerializersKt.serializerOrNull(rootClass);
            if (kSerializerSerializerOrNull == null) {
                kSerializerSerializerOrNull = SerializersModule.getContextual$default($this$serializerByKClassImpl, rootClass, null, 2, null);
            }
        } else {
            try {
                KSerializer<? extends Object> kSerializerParametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(rootClass, typeArgumentsSerializers, SerializersKt__SerializersKt::serializerByKClassImpl$lambda$1$SerializersKt__SerializersKt);
                if (kSerializerParametrizedSerializerOrNull == null) {
                    kSerializerParametrizedSerializerOrNull = $this$serializerByKClassImpl.getContextual(rootClass, typeArgumentsSerializers);
                }
                kSerializerSerializerOrNull = kSerializerParametrizedSerializerOrNull;
            } catch (IndexOutOfBoundsException e) {
                throw new SerializationException("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", e);
            }
        }
        KSerializer<? extends Object> kSerializer = kSerializerSerializerOrNull;
        if (kSerializer != null) {
            return nullable$SerializersKt__SerializersKt(kSerializer, isNullable);
        }
        return null;
    }

    private static final KClassifier serializerByKClassImpl$lambda$1$SerializersKt__SerializersKt() {
        throw new SerializationException("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
    }

    @Nullable
    public static final List<KSerializer<Object>> serializersForParameters(@NotNull SerializersModule $this$serializersForParameters, @NotNull List<? extends KType> typeArguments, boolean failOnMissingTypeArgSerializer) {
        List list;
        Intrinsics.checkNotNullParameter($this$serializersForParameters, "<this>");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (failOnMissingTypeArgSerializer) {
            List<? extends KType> $this$map$iv = typeArguments;
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (Object item$iv$iv : $this$map$iv) {
                KType it = (KType) item$iv$iv;
                destination$iv$iv.add(SerializersKt.serializer($this$serializersForParameters, it));
            }
            list = (List) destination$iv$iv;
        } else {
            List<? extends KType> $this$map$iv2 = typeArguments;
            Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv2, 10));
            for (Object item$iv$iv2 : $this$map$iv2) {
                KType it2 = (KType) item$iv$iv2;
                KSerializer<Object> kSerializerSerializerOrNull = SerializersKt.serializerOrNull($this$serializersForParameters, it2);
                if (kSerializerSerializerOrNull == null) {
                    return null;
                }
                destination$iv$iv2.add(kSerializerSerializerOrNull);
            }
            list = (List) destination$iv$iv2;
        }
        List serializers = list;
        return serializers;
    }

    @InternalSerializationApi
    @NotNull
    public static final <T> KSerializer<T> serializer(@NotNull KClass<T> $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        KSerializer<T> kSerializerSerializerOrNull = SerializersKt.serializerOrNull($this$serializer);
        if (kSerializerSerializerOrNull != null) {
            return kSerializerSerializerOrNull;
        }
        Platform_commonKt.serializerNotRegistered($this$serializer);
        throw new KotlinNothingValueException();
    }

    @InternalSerializationApi
    @Nullable
    public static final <T> KSerializer<T> serializerOrNull(@NotNull KClass<T> $this$serializerOrNull) {
        Intrinsics.checkNotNullParameter($this$serializerOrNull, "<this>");
        KSerializer<T> kSerializerCompiledSerializerImpl = PlatformKt.compiledSerializerImpl($this$serializerOrNull);
        return kSerializerCompiledSerializerImpl == null ? PrimitivesKt.builtinSerializerOrNull($this$serializerOrNull) : kSerializerCompiledSerializerImpl;
    }

    @Nullable
    public static final KSerializer<? extends Object> parametrizedSerializerOrNull(@NotNull KClass<Object> $this$parametrizedSerializerOrNull, @NotNull List<? extends KSerializer<Object>> serializers, @NotNull Function0<? extends KClassifier> elementClassifierIfArray) {
        Intrinsics.checkNotNullParameter($this$parametrizedSerializerOrNull, "<this>");
        Intrinsics.checkNotNullParameter(serializers, "serializers");
        Intrinsics.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
        KSerializer<? extends Object> kSerializerBuiltinParametrizedSerializer$SerializersKt__SerializersKt = builtinParametrizedSerializer$SerializersKt__SerializersKt($this$parametrizedSerializerOrNull, serializers, elementClassifierIfArray);
        return kSerializerBuiltinParametrizedSerializer$SerializersKt__SerializersKt == null ? compiledParametrizedSerializer$SerializersKt__SerializersKt($this$parametrizedSerializerOrNull, serializers) : kSerializerBuiltinParametrizedSerializer$SerializersKt__SerializersKt;
    }

    private static final KSerializer<? extends Object> compiledParametrizedSerializer$SerializersKt__SerializersKt(KClass<Object> $this$compiledParametrizedSerializer, List<? extends KSerializer<Object>> serializers) {
        List<? extends KSerializer<Object>> $this$toTypedArray$iv = serializers;
        KSerializer[] kSerializerArr = (KSerializer[]) $this$toTypedArray$iv.toArray(new KSerializer[0]);
        return PlatformKt.constructSerializerForGivenTypeArgs($this$compiledParametrizedSerializer, (KSerializer<Object>[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    private static final KSerializer<? extends Object> builtinParametrizedSerializer$SerializersKt__SerializersKt(KClass<Object> $this$builtinParametrizedSerializer, List<? extends KSerializer<Object>> serializers, Function0<? extends KClassifier> elementClassifierIfArray) {
        if (Intrinsics.areEqual($this$builtinParametrizedSerializer, Reflection.getOrCreateKotlinClass(Collection.class)) || Intrinsics.areEqual($this$builtinParametrizedSerializer, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual($this$builtinParametrizedSerializer, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual($this$builtinParametrizedSerializer, Reflection.getOrCreateKotlinClass(ArrayList.class))) {
            return new ArrayListSerializer(serializers.get(0));
        }
        if (Intrinsics.areEqual($this$builtinParametrizedSerializer, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            return new HashSetSerializer(serializers.get(0));
        }
        if (Intrinsics.areEqual($this$builtinParametrizedSerializer, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual($this$builtinParametrizedSerializer, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual($this$builtinParametrizedSerializer, Reflection.getOrCreateKotlinClass(LinkedHashSet.class))) {
            return new LinkedHashSetSerializer(serializers.get(0));
        }
        if (Intrinsics.areEqual($this$builtinParametrizedSerializer, Reflection.getOrCreateKotlinClass(HashMap.class))) {
            return new HashMapSerializer(serializers.get(0), serializers.get(1));
        }
        if (Intrinsics.areEqual($this$builtinParametrizedSerializer, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual($this$builtinParametrizedSerializer, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual($this$builtinParametrizedSerializer, Reflection.getOrCreateKotlinClass(LinkedHashMap.class))) {
            return new LinkedHashMapSerializer(serializers.get(0), serializers.get(1));
        }
        if (Intrinsics.areEqual($this$builtinParametrizedSerializer, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
            return BuiltinSerializersKt.MapEntrySerializer(serializers.get(0), serializers.get(1));
        }
        if (Intrinsics.areEqual($this$builtinParametrizedSerializer, Reflection.getOrCreateKotlinClass(Pair.class))) {
            return BuiltinSerializersKt.PairSerializer(serializers.get(0), serializers.get(1));
        }
        if (Intrinsics.areEqual($this$builtinParametrizedSerializer, Reflection.getOrCreateKotlinClass(Triple.class))) {
            return BuiltinSerializersKt.TripleSerializer(serializers.get(0), serializers.get(1), serializers.get(2));
        }
        if (PlatformKt.isReferenceArray($this$builtinParametrizedSerializer)) {
            KClassifier kClassifierInvoke = elementClassifierIfArray.invoke();
            Intrinsics.checkNotNull(kClassifierInvoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            return BuiltinSerializersKt.ArraySerializer((KClass) kClassifierInvoke, serializers.get(0));
        }
        return null;
    }

    private static final <T> KSerializer<T> nullable$SerializersKt__SerializersKt(KSerializer<T> $this$nullable, boolean shouldBeNullable) {
        if (shouldBeNullable) {
            return BuiltinSerializersKt.getNullable($this$nullable);
        }
        Intrinsics.checkNotNull($this$nullable, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return $this$nullable;
    }

    @PublishedApi
    @NotNull
    public static final KSerializer<?> noCompiledSerializer(@NotNull String forClass) {
        Intrinsics.checkNotNullParameter(forClass, "forClass");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage(forClass));
    }

    @PublishedApi
    @NotNull
    public static final KSerializer<?> noCompiledSerializer(@NotNull SerializersModule module, @NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        KSerializer<?> contextual$default = SerializersModule.getContextual$default(module, kClass, null, 2, null);
        if (contextual$default != null) {
            return contextual$default;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    @PublishedApi
    @NotNull
    public static final KSerializer<?> noCompiledSerializer(@NotNull SerializersModule module, @NotNull KClass<?> kClass, @NotNull KSerializer<?>[] argSerializers) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(argSerializers, "argSerializers");
        KSerializer<?> contextual = module.getContextual(kClass, ArraysKt.asList(argSerializers));
        if (contextual != null) {
            return contextual;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    @PublishedApi
    @NotNull
    public static final KSerializer<?> moduleThenPolymorphic(@NotNull SerializersModule module, @NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        KSerializer<?> contextual$default = SerializersModule.getContextual$default(module, kClass, null, 2, null);
        return contextual$default == null ? new PolymorphicSerializer(kClass) : contextual$default;
    }

    @PublishedApi
    @NotNull
    public static final KSerializer<?> moduleThenPolymorphic(@NotNull SerializersModule module, @NotNull KClass<?> kClass, @NotNull KSerializer<?>[] argSerializers) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(argSerializers, "argSerializers");
        KSerializer<?> contextual = module.getContextual(kClass, ArraysKt.asList(argSerializers));
        return contextual == null ? new PolymorphicSerializer(kClass) : contextual;
    }
}
