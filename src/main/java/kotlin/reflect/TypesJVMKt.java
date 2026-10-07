package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.NoWhenBranchMatchedException;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeBase;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/TypesJVMKt.class */
public final class TypesJVMKt {

    /* JADX INFO: compiled from: TypesJVM.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/TypesJVMKt$WhenMappings.class */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @LowPriorityInOverloadResolution
    @SinceKotlin(version = "1.4")
    @ExperimentalStdlibApi
    public static /* synthetic */ void getJavaType$annotations(KType kType) {
    }

    @ExperimentalStdlibApi
    private static /* synthetic */ void getJavaType$annotations(KTypeProjection kTypeProjection) {
    }

    @NotNull
    public static final Type getJavaType(@NotNull KType $this$javaType) {
        Type it;
        Intrinsics.checkNotNullParameter($this$javaType, "<this>");
        if (($this$javaType instanceof KTypeBase) && (it = ((KTypeBase) $this$javaType).getJavaType()) != null) {
            return it;
        }
        return computeJavaType$default($this$javaType, false, 1, null);
    }

    static /* synthetic */ Type computeJavaType$default(KType kType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return computeJavaType(kType, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalStdlibApi
    public static final Type computeJavaType(KType $this$computeJavaType, boolean forceWrapper) {
        KClassifier classifier = $this$computeJavaType.getClassifier();
        if (classifier instanceof KTypeParameter) {
            return new TypeVariableImpl((KTypeParameter) classifier);
        }
        if (classifier instanceof KClass) {
            Class jClass = forceWrapper ? JvmClassMappingKt.getJavaObjectType((KClass) classifier) : JvmClassMappingKt.getJavaClass((KClass) classifier);
            List<KTypeProjection> arguments = $this$computeJavaType.getArguments();
            if (arguments.isEmpty()) {
                return jClass;
            }
            if (jClass.isArray()) {
                if (jClass.getComponentType().isPrimitive()) {
                    return jClass;
                }
                KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.singleOrNull((List) arguments);
                if (kTypeProjection != null) {
                    KVariance variance = kTypeProjection.component1();
                    KType elementType = kTypeProjection.component2();
                    switch (variance == null ? -1 : WhenMappings.$EnumSwitchMapping$0[variance.ordinal()]) {
                        case -1:
                        case 1:
                            return jClass;
                        case 0:
                        default:
                            throw new NoWhenBranchMatchedException();
                        case 2:
                        case 3:
                            Intrinsics.checkNotNull(elementType);
                            Type javaElementType = computeJavaType$default(elementType, false, 1, null);
                            return javaElementType instanceof Class ? jClass : new GenericArrayTypeImpl(javaElementType);
                    }
                }
                throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + $this$computeJavaType);
            }
            return createPossiblyInnerType(jClass, arguments);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + $this$computeJavaType);
    }

    @ExperimentalStdlibApi
    private static final Type createPossiblyInnerType(Class<?> jClass, List<KTypeProjection> arguments) {
        Class<?> declaringClass = jClass.getDeclaringClass();
        if (declaringClass != null) {
            if (Modifier.isStatic(jClass.getModifiers())) {
                Class<?> cls = declaringClass;
                List<KTypeProjection> $this$map$iv = arguments;
                Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
                for (Object item$iv$iv : $this$map$iv) {
                    KTypeProjection p0 = (KTypeProjection) item$iv$iv;
                    destination$iv$iv.add(getJavaType(p0));
                }
                return new ParameterizedTypeImpl(jClass, cls, (List) destination$iv$iv);
            }
            int n = jClass.getTypeParameters().length;
            Type typeCreatePossiblyInnerType = createPossiblyInnerType(declaringClass, arguments.subList(n, arguments.size()));
            Iterable $this$map$iv2 = arguments.subList(0, n);
            Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv2, 10));
            for (Object item$iv$iv2 : $this$map$iv2) {
                KTypeProjection p02 = (KTypeProjection) item$iv$iv2;
                destination$iv$iv2.add(getJavaType(p02));
            }
            return new ParameterizedTypeImpl(jClass, typeCreatePossiblyInnerType, (List) destination$iv$iv2);
        }
        List<KTypeProjection> $this$map$iv3 = arguments;
        Collection destination$iv$iv3 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv3, 10));
        for (Object item$iv$iv3 : $this$map$iv3) {
            KTypeProjection p03 = (KTypeProjection) item$iv$iv3;
            destination$iv$iv3.add(getJavaType(p03));
        }
        return new ParameterizedTypeImpl(jClass, null, (List) destination$iv$iv3);
    }

    private static final Type getJavaType(KTypeProjection $this$javaType) {
        KVariance variance = $this$javaType.getVariance();
        if (variance == null) {
            return WildcardTypeImpl.Companion.getSTAR();
        }
        KType type = $this$javaType.getType();
        Intrinsics.checkNotNull(type);
        switch (WhenMappings.$EnumSwitchMapping$0[variance.ordinal()]) {
            case 1:
                return new WildcardTypeImpl(null, computeJavaType(type, true));
            case 2:
                return computeJavaType(type, true);
            case 3:
                return new WildcardTypeImpl(computeJavaType(type, true), null);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String typeToString(Type type) {
        if (type instanceof Class) {
            if (((Class) type).isArray()) {
                Sequence unwrap = SequencesKt.generateSequence(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
                return ((Class) SequencesKt.last(unwrap)).getName() + StringsKt.repeat("[]", SequencesKt.count(unwrap));
            }
            String name = ((Class) type).getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }
        return type.toString();
    }
}
