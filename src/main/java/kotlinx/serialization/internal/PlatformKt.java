package kotlinx.serialization.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import kotlin.time.Instant;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Platform.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/PlatformKt.class */
public final class PlatformKt {
    public static final <T> T getChecked(@NotNull T[] $this$getChecked, int index) {
        Intrinsics.checkNotNullParameter($this$getChecked, "<this>");
        return $this$getChecked[index];
    }

    public static final boolean getChecked(@NotNull boolean[] $this$getChecked, int index) {
        Intrinsics.checkNotNullParameter($this$getChecked, "<this>");
        return $this$getChecked[index];
    }

    public static final <T> boolean isInterface(@NotNull KClass<T> $this$isInterface) {
        Intrinsics.checkNotNullParameter($this$isInterface, "<this>");
        return JvmClassMappingKt.getJavaClass((KClass) $this$isInterface).isInterface();
    }

    @Nullable
    public static final <T> KSerializer<T> compiledSerializerImpl(@NotNull KClass<T> $this$compiledSerializerImpl) {
        Intrinsics.checkNotNullParameter($this$compiledSerializerImpl, "<this>");
        return constructSerializerForGivenTypeArgs($this$compiledSerializerImpl, (KSerializer<Object>[]) new KSerializer[0]);
    }

    @NotNull
    public static final <T, E extends T> E[] toNativeArrayImpl(@NotNull ArrayList<E> arrayList, @NotNull KClass<T> eClass) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) JvmClassMappingKt.getJavaClass((KClass) eClass), arrayList.size());
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] eArr = (E[]) arrayList.toArray((Object[]) objNewInstance);
        Intrinsics.checkNotNullExpressionValue(eArr, "toArray(...)");
        return eArr;
    }

    @NotNull
    public static final Void platformSpecificSerializerNotRegistered(@NotNull KClass<?> $this$platformSpecificSerializerNotRegistered) {
        Intrinsics.checkNotNullParameter($this$platformSpecificSerializerNotRegistered, "<this>");
        Platform_commonKt.serializerNotRegistered($this$platformSpecificSerializerNotRegistered);
        throw new KotlinNothingValueException();
    }

    @NotNull
    public static final Void serializerNotRegistered(@NotNull Class<?> $this$serializerNotRegistered) {
        Intrinsics.checkNotNullParameter($this$serializerNotRegistered, "<this>");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage((KClass<?>) JvmClassMappingKt.getKotlinClass($this$serializerNotRegistered)));
    }

    @Nullable
    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(@NotNull KClass<T> $this$constructSerializerForGivenTypeArgs, @NotNull KSerializer<Object>... args) {
        Intrinsics.checkNotNullParameter($this$constructSerializerForGivenTypeArgs, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return constructSerializerForGivenTypeArgs(JvmClassMappingKt.getJavaClass((KClass) $this$constructSerializerForGivenTypeArgs), (KSerializer<Object>[]) Arrays.copyOf(args, args.length));
    }

    @Nullable
    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(@NotNull Class<T> $this$constructSerializerForGivenTypeArgs, @NotNull KSerializer<Object>... args) {
        Intrinsics.checkNotNullParameter($this$constructSerializerForGivenTypeArgs, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        if ($this$constructSerializerForGivenTypeArgs.isEnum() && isNotAnnotated($this$constructSerializerForGivenTypeArgs)) {
            return createEnumSerializer($this$constructSerializerForGivenTypeArgs);
        }
        KSerializer<T> kSerializerInvokeSerializerOnDefaultCompanion = invokeSerializerOnDefaultCompanion($this$constructSerializerForGivenTypeArgs, (KSerializer[]) Arrays.copyOf(args, args.length));
        if (kSerializerInvokeSerializerOnDefaultCompanion != null) {
            return kSerializerInvokeSerializerOnDefaultCompanion;
        }
        KSerializer<T> kSerializerFindObjectSerializer = findObjectSerializer($this$constructSerializerForGivenTypeArgs);
        if (kSerializerFindObjectSerializer != null) {
            return kSerializerFindObjectSerializer;
        }
        KSerializer<T> kSerializerFindInNamedCompanion = findInNamedCompanion($this$constructSerializerForGivenTypeArgs, (KSerializer[]) Arrays.copyOf(args, args.length));
        if (kSerializerFindInNamedCompanion != null) {
            return kSerializerFindInNamedCompanion;
        }
        if (isPolymorphicSerializer($this$constructSerializerForGivenTypeArgs)) {
            return new PolymorphicSerializer(JvmClassMappingKt.getKotlinClass($this$constructSerializerForGivenTypeArgs));
        }
        return null;
    }

    private static final <T> KSerializer<T> findInNamedCompanion(Class<T> $this$findInNamedCompanion, KSerializer<Object>... args) {
        KSerializer<T> kSerializer;
        Object obj;
        Field field;
        KSerializer<T> kSerializerInvokeSerializerOnCompanion;
        Object namedCompanion = findNamedCompanionByAnnotation($this$findInNamedCompanion);
        if (namedCompanion != null && (kSerializerInvokeSerializerOnCompanion = invokeSerializerOnCompanion(namedCompanion, (KSerializer[]) Arrays.copyOf(args, args.length))) != null) {
            return kSerializerInvokeSerializerOnCompanion;
        }
        try {
            Object[] declaredClasses = $this$findInNamedCompanion.getDeclaredClasses();
            Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
            Object[] $this$singleOrNull$iv = declaredClasses;
            Object single$iv = null;
            boolean found$iv = false;
            int i = 0;
            int length = $this$singleOrNull$iv.length;
            while (true) {
                if (i < length) {
                    Object element$iv = $this$singleOrNull$iv[i];
                    if (Intrinsics.areEqual(((Class) element$iv).getSimpleName(), "$serializer")) {
                        if (found$iv) {
                            obj = null;
                            break;
                        }
                        single$iv = element$iv;
                        found$iv = true;
                    }
                    i++;
                } else {
                    obj = !found$iv ? null : single$iv;
                }
            }
            Class<?> cls = (Class) obj;
            Object obj2 = (cls == null || (field = cls.getField("INSTANCE")) == null) ? null : field.get(null);
            kSerializer = obj2 instanceof KSerializer ? (KSerializer) obj2 : null;
        } catch (NoSuchFieldException e) {
            kSerializer = null;
        }
        return kSerializer;
    }

    private static final <T> Object findNamedCompanionByAnnotation(Class<T> $this$findNamedCompanionByAnnotation) {
        Object obj;
        Object[] declaredClasses = $this$findNamedCompanionByAnnotation.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        Object[] $this$firstOrNull$iv = declaredClasses;
        int i = 0;
        int length = $this$firstOrNull$iv.length;
        while (true) {
            if (i < length) {
                Object element$iv = $this$firstOrNull$iv[i];
                if (((Class) element$iv).getAnnotation(NamedCompanion.class) != null) {
                    obj = element$iv;
                    break;
                }
                i++;
            } else {
                obj = null;
                break;
            }
        }
        Class<?> cls = (Class) obj;
        if (cls != null) {
            String simpleName = cls.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            return companionOrNull($this$findNamedCompanionByAnnotation, simpleName);
        }
        return null;
    }

    private static final <T> boolean isNotAnnotated(Class<T> $this$isNotAnnotated) {
        return $this$isNotAnnotated.getAnnotation(Serializable.class) == null && $this$isNotAnnotated.getAnnotation(Polymorphic.class) == null;
    }

    private static final <T> boolean isPolymorphicSerializer(Class<T> $this$isPolymorphicSerializer) {
        if ($this$isPolymorphicSerializer.getAnnotation(Polymorphic.class) != null) {
            return true;
        }
        Serializable serializable = (Serializable) $this$isPolymorphicSerializer.getAnnotation(Serializable.class);
        if (serializable != null && Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(serializable.with()), Reflection.getOrCreateKotlinClass(PolymorphicSerializer.class))) {
            return true;
        }
        return false;
    }

    private static final <T> KSerializer<T> invokeSerializerOnDefaultCompanion(Class<?> jClass, KSerializer<Object>... args) {
        Object companion = companionOrNull(jClass, "Companion");
        if (companion == null) {
            return null;
        }
        return invokeSerializerOnCompanion(companion, (KSerializer[]) Arrays.copyOf(args, args.length));
    }

    private static final <T> KSerializer<T> invokeSerializerOnCompanion(Object companion, KSerializer<Object>... args) throws IllegalAccessException, InvocationTargetException {
        KSerializer<T> kSerializer;
        Class[] clsArr;
        try {
            if (args.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = args.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Class[] types = clsArr;
            Object objInvoke = companion.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(types, types.length)).invoke(companion, Arrays.copyOf(args, args.length));
            kSerializer = objInvoke instanceof KSerializer ? (KSerializer) objInvoke : null;
        } catch (NoSuchMethodException e) {
            kSerializer = null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw e2;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e2.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
        return kSerializer;
    }

    private static final Object companionOrNull(Class<?> $this$companionOrNull, String companionName) {
        Object obj;
        try {
            Field companion = $this$companionOrNull.getDeclaredField(companionName);
            companion.setAccessible(true);
            obj = companion.get(null);
        } catch (Throwable th) {
            obj = null;
        }
        return obj;
    }

    private static final <T> KSerializer<T> createEnumSerializer(Class<T> $this$createEnumSerializer) {
        Object[] constants = $this$createEnumSerializer.getEnumConstants();
        String canonicalName = $this$createEnumSerializer.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
        Intrinsics.checkNotNull(constants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new EnumSerializer(canonicalName, (Enum[]) constants);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final <T> kotlinx.serialization.KSerializer<T> findObjectSerializer(java.lang.Class<T> r6) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.PlatformKt.findObjectSerializer(java.lang.Class):kotlinx.serialization.KSerializer");
    }

    public static final boolean isReferenceArray(@NotNull KClass<Object> rootClass) {
        Intrinsics.checkNotNullParameter(rootClass, "rootClass");
        return JvmClassMappingKt.getJavaClass((KClass) rootClass).isArray();
    }

    @NotNull
    public static final Map<KClass<?>, KSerializer<?>> initBuiltins() {
        Map $this$initBuiltins_u24lambda_u2415 = MapsKt.createMapBuilder();
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(String.class), BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE));
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(Character.TYPE), BuiltinSerializersKt.serializer(CharCompanionObject.INSTANCE));
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(char[].class), BuiltinSerializersKt.CharArraySerializer());
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(Double.TYPE), BuiltinSerializersKt.serializer(DoubleCompanionObject.INSTANCE));
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(double[].class), BuiltinSerializersKt.DoubleArraySerializer());
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(Float.TYPE), BuiltinSerializersKt.serializer(FloatCompanionObject.INSTANCE));
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(float[].class), BuiltinSerializersKt.FloatArraySerializer());
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(Long.TYPE), BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE));
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(long[].class), BuiltinSerializersKt.LongArraySerializer());
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(ULong.class), BuiltinSerializersKt.serializer(ULong.Companion));
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(Integer.TYPE), BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE));
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(int[].class), BuiltinSerializersKt.IntArraySerializer());
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(UInt.class), BuiltinSerializersKt.serializer(UInt.Companion));
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(Short.TYPE), BuiltinSerializersKt.serializer(ShortCompanionObject.INSTANCE));
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(short[].class), BuiltinSerializersKt.ShortArraySerializer());
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(UShort.class), BuiltinSerializersKt.serializer(UShort.Companion));
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(Byte.TYPE), BuiltinSerializersKt.serializer(ByteCompanionObject.INSTANCE));
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(byte[].class), BuiltinSerializersKt.ByteArraySerializer());
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(UByte.class), BuiltinSerializersKt.serializer(UByte.Companion));
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(Boolean.TYPE), BuiltinSerializersKt.serializer(BooleanCompanionObject.INSTANCE));
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(boolean[].class), BuiltinSerializersKt.BooleanArraySerializer());
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(Unit.class), BuiltinSerializersKt.serializer(Unit.INSTANCE));
        $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(Void.class), BuiltinSerializersKt.NothingSerializer());
        try {
            $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(Duration.class), BuiltinSerializersKt.serializer(Duration.Companion));
        } catch (ClassNotFoundException e) {
        } catch (NoClassDefFoundError e2) {
        }
        try {
            $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(ULongArray.class), BuiltinSerializersKt.ULongArraySerializer());
        } catch (ClassNotFoundException e3) {
        } catch (NoClassDefFoundError e4) {
        }
        try {
            $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(UIntArray.class), BuiltinSerializersKt.UIntArraySerializer());
        } catch (ClassNotFoundException e5) {
        } catch (NoClassDefFoundError e6) {
        }
        try {
            $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(UShortArray.class), BuiltinSerializersKt.UShortArraySerializer());
        } catch (ClassNotFoundException e7) {
        } catch (NoClassDefFoundError e8) {
        }
        try {
            $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(UByteArray.class), BuiltinSerializersKt.UByteArraySerializer());
        } catch (ClassNotFoundException e9) {
        } catch (NoClassDefFoundError e10) {
        }
        try {
            $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(Uuid.class), BuiltinSerializersKt.serializer(Uuid.Companion));
        } catch (ClassNotFoundException e11) {
        } catch (NoClassDefFoundError e12) {
        }
        try {
            $this$initBuiltins_u24lambda_u2415.put(Reflection.getOrCreateKotlinClass(Instant.class), BuiltinSerializersKt.serializer(Instant.Companion));
        } catch (ClassNotFoundException e13) {
        } catch (NoClassDefFoundError e14) {
        }
        return MapsKt.build($this$initBuiltins_u24lambda_u2415);
    }

    private static final void loadSafe(Function0<Unit> block) {
        try {
            block.invoke();
        } catch (ClassNotFoundException e) {
        } catch (NoClassDefFoundError e2) {
        }
    }
}
