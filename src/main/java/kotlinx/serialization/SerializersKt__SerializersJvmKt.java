package kotlinx.serialization;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SerializersJvm.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/SerializersKt__SerializersJvmKt.class */
final /* synthetic */ class SerializersKt__SerializersJvmKt {
    @NotNull
    public static final KSerializer<Object> serializer(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    @Nullable
    public static final KSerializer<Object> serializerOrNull(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    @NotNull
    public static final KSerializer<Object> serializer(@NotNull SerializersModule $this$serializer, @NotNull Type type) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        KSerializer<Object> kSerializerSerializerByJavaTypeImpl$SerializersKt__SerializersJvmKt = serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt($this$serializer, type, true);
        if (kSerializerSerializerByJavaTypeImpl$SerializersKt__SerializersJvmKt != null) {
            return kSerializerSerializerByJavaTypeImpl$SerializersKt__SerializersJvmKt;
        }
        PlatformKt.serializerNotRegistered(prettyClass$SerializersKt__SerializersJvmKt(type));
        throw new KotlinNothingValueException();
    }

    @Nullable
    public static final KSerializer<Object> serializerOrNull(@NotNull SerializersModule $this$serializerOrNull, @NotNull Type type) {
        Intrinsics.checkNotNullParameter($this$serializerOrNull, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt($this$serializerOrNull, type, false);
    }

    static /* synthetic */ KSerializer serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default(SerializersModule serializersModule, Type type, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(serializersModule, type, z);
    }

    private static final KSerializer<Object> serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(SerializersModule $this$serializerByJavaTypeImpl, Type type, boolean failOnMissingTypeArgSerializer) {
        List list;
        if (type instanceof GenericArrayType) {
            return genericArraySerializer$SerializersKt__SerializersJvmKt($this$serializerByJavaTypeImpl, (GenericArrayType) type, failOnMissingTypeArgSerializer);
        }
        if (type instanceof Class) {
            return typeSerializer$SerializersKt__SerializersJvmKt($this$serializerByJavaTypeImpl, (Class) type, failOnMissingTypeArgSerializer);
        }
        if (!(type instanceof ParameterizedType)) {
            if (!(type instanceof WildcardType)) {
                throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + type + " has type " + Reflection.getOrCreateKotlinClass(type.getClass()));
            }
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            Object objFirst = ArraysKt.first(upperBounds);
            Intrinsics.checkNotNullExpressionValue(objFirst, "first(...)");
            return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default($this$serializerByJavaTypeImpl, (Type) objFirst, false, 2, null);
        }
        Type rawType = ((ParameterizedType) type).getRawType();
        Intrinsics.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
        Class rootClass = (Class) rawType;
        Type[] args = ((ParameterizedType) type).getActualTypeArguments();
        if (failOnMissingTypeArgSerializer) {
            Intrinsics.checkNotNull(args);
            Collection destination$iv$iv = new ArrayList(args.length);
            for (Type type2 : args) {
                Intrinsics.checkNotNull(type2);
                destination$iv$iv.add(SerializersKt.serializer($this$serializerByJavaTypeImpl, type2));
            }
            list = (List) destination$iv$iv;
        } else {
            Intrinsics.checkNotNull(args);
            Collection destination$iv$iv2 = new ArrayList(args.length);
            for (Type type3 : args) {
                Intrinsics.checkNotNull(type3);
                KSerializer<Object> kSerializerSerializerOrNull = SerializersKt.serializerOrNull($this$serializerByJavaTypeImpl, type3);
                if (kSerializerSerializerOrNull == null) {
                    return null;
                }
                destination$iv$iv2.add(kSerializerSerializerOrNull);
            }
            list = (List) destination$iv$iv2;
        }
        List argsSerializers = list;
        if (Set.class.isAssignableFrom(rootClass)) {
            KSerializer<Object> kSerializerSetSerializer = BuiltinSerializersKt.SetSerializer((KSerializer) argsSerializers.get(0));
            Intrinsics.checkNotNull(kSerializerSetSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerSetSerializer;
        }
        if (List.class.isAssignableFrom(rootClass) || Collection.class.isAssignableFrom(rootClass)) {
            KSerializer<Object> kSerializerListSerializer = BuiltinSerializersKt.ListSerializer((KSerializer) argsSerializers.get(0));
            Intrinsics.checkNotNull(kSerializerListSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerListSerializer;
        }
        if (Map.class.isAssignableFrom(rootClass)) {
            KSerializer<Object> kSerializerMapSerializer = BuiltinSerializersKt.MapSerializer((KSerializer) argsSerializers.get(0), (KSerializer) argsSerializers.get(1));
            Intrinsics.checkNotNull(kSerializerMapSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerMapSerializer;
        }
        if (Map.Entry.class.isAssignableFrom(rootClass)) {
            KSerializer<Object> kSerializerMapEntrySerializer = BuiltinSerializersKt.MapEntrySerializer((KSerializer) argsSerializers.get(0), (KSerializer) argsSerializers.get(1));
            Intrinsics.checkNotNull(kSerializerMapEntrySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerMapEntrySerializer;
        }
        if (Pair.class.isAssignableFrom(rootClass)) {
            KSerializer<Object> kSerializerPairSerializer = BuiltinSerializersKt.PairSerializer((KSerializer) argsSerializers.get(0), (KSerializer) argsSerializers.get(1));
            Intrinsics.checkNotNull(kSerializerPairSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerPairSerializer;
        }
        if (Triple.class.isAssignableFrom(rootClass)) {
            KSerializer<Object> kSerializerTripleSerializer = BuiltinSerializersKt.TripleSerializer((KSerializer) argsSerializers.get(0), (KSerializer) argsSerializers.get(1), (KSerializer) argsSerializers.get(2));
            Intrinsics.checkNotNull(kSerializerTripleSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerTripleSerializer;
        }
        List $this$map$iv = argsSerializers;
        Collection destination$iv$iv3 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (Object item$iv$iv : $this$map$iv) {
            KSerializer it = (KSerializer) item$iv$iv;
            Intrinsics.checkNotNull(it, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            destination$iv$iv3.add(it);
        }
        List varargs = (List) destination$iv$iv3;
        return reflectiveOrContextual$SerializersKt__SerializersJvmKt($this$serializerByJavaTypeImpl, rootClass, varargs);
    }

    private static final KSerializer<Object> typeSerializer$SerializersKt__SerializersJvmKt(SerializersModule $this$typeSerializer, Class<?> type, boolean failOnMissingTypeArgSerializer) {
        KSerializer<Object> kSerializerSerializerOrNull;
        if (type.isArray() && !type.getComponentType().isPrimitive()) {
            Class<?> componentType = type.getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
            if (failOnMissingTypeArgSerializer) {
                kSerializerSerializerOrNull = SerializersKt.serializer($this$typeSerializer, componentType);
            } else {
                kSerializerSerializerOrNull = SerializersKt.serializerOrNull($this$typeSerializer, componentType);
                if (kSerializerSerializerOrNull == null) {
                    return null;
                }
            }
            KSerializer<Object> kSerializer = kSerializerSerializerOrNull;
            KClass kotlinClass = JvmClassMappingKt.getKotlinClass(componentType);
            Intrinsics.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            KSerializer<Object> kSerializerArraySerializer = BuiltinSerializersKt.ArraySerializer(kotlinClass, kSerializer);
            Intrinsics.checkNotNull(kSerializerArraySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
            return kSerializerArraySerializer;
        }
        Intrinsics.checkNotNull(type, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
        return reflectiveOrContextual$SerializersKt__SerializersJvmKt($this$typeSerializer, type, CollectionsKt.emptyList());
    }

    private static final <T> KSerializer<T> reflectiveOrContextual$SerializersKt__SerializersJvmKt(SerializersModule $this$reflectiveOrContextual, Class<T> jClass, List<? extends KSerializer<Object>> typeArgumentsSerializers) {
        List<? extends KSerializer<Object>> $this$toTypedArray$iv = typeArgumentsSerializers;
        KSerializer[] kSerializerArr = (KSerializer[]) $this$toTypedArray$iv.toArray(new KSerializer[0]);
        KSerializer<T> kSerializerConstructSerializerForGivenTypeArgs = PlatformKt.constructSerializerForGivenTypeArgs(jClass, (KSerializer<Object>[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerConstructSerializerForGivenTypeArgs != null) {
            return kSerializerConstructSerializerForGivenTypeArgs;
        }
        KClass<T> kotlinClass = JvmClassMappingKt.getKotlinClass(jClass);
        KSerializer<T> kSerializerBuiltinSerializerOrNull = PrimitivesKt.builtinSerializerOrNull(kotlinClass);
        if (kSerializerBuiltinSerializerOrNull != null) {
            return kSerializerBuiltinSerializerOrNull;
        }
        KSerializer<T> contextual = $this$reflectiveOrContextual.getContextual(kotlinClass, typeArgumentsSerializers);
        if (contextual != null) {
            return contextual;
        }
        if (jClass.isInterface()) {
            return new PolymorphicSerializer(JvmClassMappingKt.getKotlinClass(jClass));
        }
        return null;
    }

    private static final KSerializer<Object> genericArraySerializer$SerializersKt__SerializersJvmKt(SerializersModule $this$genericArraySerializer, GenericArrayType type, boolean failOnMissingTypeArgSerializer) {
        Type type2;
        KSerializer<Object> kSerializerSerializerOrNull;
        KClass kotlinClass;
        Type it = type.getGenericComponentType();
        if (it instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) it).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            type2 = (Type) ArraysKt.first(upperBounds);
        } else {
            type2 = it;
        }
        Type eType = type2;
        if (failOnMissingTypeArgSerializer) {
            Intrinsics.checkNotNull(eType);
            kSerializerSerializerOrNull = SerializersKt.serializer($this$genericArraySerializer, eType);
        } else {
            Intrinsics.checkNotNull(eType);
            kSerializerSerializerOrNull = SerializersKt.serializerOrNull($this$genericArraySerializer, eType);
            if (kSerializerSerializerOrNull == null) {
                return null;
            }
        }
        KSerializer<Object> kSerializer = kSerializerSerializerOrNull;
        if (eType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) eType).getRawType();
            Intrinsics.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            kotlinClass = JvmClassMappingKt.getKotlinClass((Class) rawType);
        } else {
            if (!(eType instanceof KClass)) {
                throw new IllegalStateException("unsupported type in GenericArray: " + Reflection.getOrCreateKotlinClass(eType.getClass()));
            }
            kotlinClass = (KClass) eType;
        }
        KClass kclass = kotlinClass;
        Intrinsics.checkNotNull(kclass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer<Object> kSerializerArraySerializer = BuiltinSerializersKt.ArraySerializer(kclass, kSerializer);
        Intrinsics.checkNotNull(kSerializerArraySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return kSerializerArraySerializer;
    }

    private static final Class<?> prettyClass$SerializersKt__SerializersJvmKt(Type $this$prettyClass) {
        if ($this$prettyClass instanceof Class) {
            return (Class) $this$prettyClass;
        }
        if ($this$prettyClass instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) $this$prettyClass).getRawType();
            Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
            return prettyClass$SerializersKt__SerializersJvmKt(rawType);
        }
        if ($this$prettyClass instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) $this$prettyClass).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            Object objFirst = ArraysKt.first(upperBounds);
            Intrinsics.checkNotNullExpressionValue(objFirst, "first(...)");
            return prettyClass$SerializersKt__SerializersJvmKt((Type) objFirst);
        }
        if ($this$prettyClass instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) $this$prettyClass).getGenericComponentType();
            Intrinsics.checkNotNullExpressionValue(genericComponentType, "getGenericComponentType(...)");
            return prettyClass$SerializersKt__SerializersJvmKt(genericComponentType);
        }
        throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + $this$prettyClass + " has type " + Reflection.getOrCreateKotlinClass($this$prettyClass.getClass()));
    }
}
