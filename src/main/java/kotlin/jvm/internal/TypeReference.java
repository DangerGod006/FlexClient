package kotlin.jvm.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlinx.serialization.internal.CollectionDescriptorsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypeReference.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/jvm/internal/TypeReference.class */
@SinceKotlin(version = "1.4")
public final class TypeReference implements KType {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private final KClassifier classifier;

    @NotNull
    private final List<KTypeProjection> arguments;

    @Nullable
    private final KType platformTypeUpperBound;
    private final int flags;
    public static final int IS_MARKED_NULLABLE = 1;
    public static final int IS_MUTABLE_COLLECTION_TYPE = 2;
    public static final int IS_NOTHING_TYPE = 4;

    /* JADX INFO: compiled from: TypeReference.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/jvm/internal/TypeReference$WhenMappings.class */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[KVariance.IN.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @SinceKotlin(version = "1.6")
    public static /* synthetic */ void getPlatformTypeUpperBound$kotlin_stdlib$annotations() {
    }

    @SinceKotlin(version = "1.6")
    public static /* synthetic */ void getFlags$kotlin_stdlib$annotations() {
    }

    @SinceKotlin(version = "1.6")
    public TypeReference(@NotNull KClassifier classifier, @NotNull List<KTypeProjection> arguments, @Nullable KType platformTypeUpperBound, int flags) {
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.classifier = classifier;
        this.arguments = arguments;
        this.platformTypeUpperBound = platformTypeUpperBound;
        this.flags = flags;
    }

    @Override // kotlin.reflect.KType
    @NotNull
    public KClassifier getClassifier() {
        return this.classifier;
    }

    @Override // kotlin.reflect.KType
    @NotNull
    public List<KTypeProjection> getArguments() {
        return this.arguments;
    }

    @Nullable
    public final KType getPlatformTypeUpperBound$kotlin_stdlib() {
        return this.platformTypeUpperBound;
    }

    public final int getFlags$kotlin_stdlib() {
        return this.flags;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TypeReference(@NotNull KClassifier classifier, @NotNull List<KTypeProjection> arguments, boolean isMarkedNullable) {
        this(classifier, arguments, null, isMarkedNullable ? 1 : 0);
        Intrinsics.checkNotNullParameter(classifier, "classifier");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return (this.flags & 1) != 0;
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof TypeReference) && Intrinsics.areEqual(getClassifier(), ((TypeReference) other).getClassifier()) && Intrinsics.areEqual(getArguments(), ((TypeReference) other).getArguments()) && Intrinsics.areEqual(this.platformTypeUpperBound, ((TypeReference) other).platformTypeUpperBound) && this.flags == ((TypeReference) other).flags;
    }

    public int hashCode() {
        return (((getClassifier().hashCode() * 31) + getArguments().hashCode()) * 31) + Integer.hashCode(this.flags);
    }

    @NotNull
    public String toString() {
        return asString(false) + " (Kotlin reflection is not available)";
    }

    private final String asString(boolean convertPrimitiveToWrapper) {
        String name;
        KClassifier classifier = getClassifier();
        KClass kClass = classifier instanceof KClass ? (KClass) classifier : null;
        Class<?> javaClass = kClass != null ? JvmClassMappingKt.getJavaClass(kClass) : null;
        if (javaClass == null) {
            name = getClassifier().toString();
        } else if ((this.flags & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (javaClass.isArray()) {
            name = getArrayClassName(javaClass);
        } else if (convertPrimitiveToWrapper && javaClass.isPrimitive()) {
            KClassifier classifier2 = getClassifier();
            Intrinsics.checkNotNull(classifier2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = JvmClassMappingKt.getJavaObjectType((KClass) classifier2).getName();
        } else {
            name = javaClass.getName();
        }
        String klass = name;
        String args = getArguments().isEmpty() ? "" : CollectionsKt.joinToString$default(getArguments(), ", ", "<", ">", 0, null, (v1) -> {
            return asString$lambda$0(r6, v1);
        }, 24, null);
        String nullable = isMarkedNullable() ? "?" : "";
        String result = klass + args + nullable;
        KType upper = this.platformTypeUpperBound;
        if (upper instanceof TypeReference) {
            String renderedUpper = ((TypeReference) upper).asString(true);
            if (Intrinsics.areEqual(renderedUpper, result)) {
                return result;
            }
            return Intrinsics.areEqual(renderedUpper, new StringBuilder().append(result).append('?').toString()) ? result + '!' : '(' + result + ".." + renderedUpper + ')';
        }
        return result;
    }

    private static final CharSequence asString$lambda$0(TypeReference this$0, KTypeProjection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this$0.asString(it);
    }

    private final String getArrayClassName(Class<?> $this$arrayClassName) {
        return Intrinsics.areEqual($this$arrayClassName, boolean[].class) ? "kotlin.BooleanArray" : Intrinsics.areEqual($this$arrayClassName, char[].class) ? "kotlin.CharArray" : Intrinsics.areEqual($this$arrayClassName, byte[].class) ? "kotlin.ByteArray" : Intrinsics.areEqual($this$arrayClassName, short[].class) ? "kotlin.ShortArray" : Intrinsics.areEqual($this$arrayClassName, int[].class) ? "kotlin.IntArray" : Intrinsics.areEqual($this$arrayClassName, float[].class) ? "kotlin.FloatArray" : Intrinsics.areEqual($this$arrayClassName, long[].class) ? "kotlin.LongArray" : Intrinsics.areEqual($this$arrayClassName, double[].class) ? "kotlin.DoubleArray" : CollectionDescriptorsKt.ARRAY_NAME;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String asString(kotlin.reflect.KTypeProjection r4) {
        /*
            r3 = this;
            r0 = r4
            kotlin.reflect.KVariance r0 = r0.getVariance()
            if (r0 != 0) goto Lb
            java.lang.String r0 = "*"
            return r0
        Lb:
            r0 = r4
            kotlin.reflect.KType r0 = r0.getType()
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof kotlin.jvm.internal.TypeReference
            if (r0 == 0) goto L1e
            r0 = r6
            kotlin.jvm.internal.TypeReference r0 = (kotlin.jvm.internal.TypeReference) r0
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r1 = r0
            if (r1 == 0) goto L2b
            r1 = 1
            java.lang.String r0 = r0.asString(r1)
            r1 = r0
            if (r1 != 0) goto L33
        L2b:
        L2c:
            r0 = r4
            kotlin.reflect.KType r0 = r0.getType()
            java.lang.String r0 = java.lang.String.valueOf(r0)
        L33:
            r5 = r0
            r0 = r4
            kotlin.reflect.KVariance r0 = r0.getVariance()
            r1 = r0
            if (r1 != 0) goto L41
        L3d:
            r0 = -1
            goto L49
        L41:
            int[] r1 = kotlin.jvm.internal.TypeReference.WhenMappings.$EnumSwitchMapping$0
            r2 = r0; r0 = r1; r1 = r2; 
            int r1 = r1.ordinal()
            r0 = r0[r1]
        L49:
            switch(r0) {
                case 1: goto L64;
                case 2: goto L68;
                case 3: goto L7f;
                default: goto L96;
            }
        L64:
            r0 = r5
            goto L9e
        L68:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "in "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L9e
        L7f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "out "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L9e
        L96:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r1 = r0
            r1.<init>()
            throw r0
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.TypeReference.asString(kotlin.reflect.KTypeProjection):java.lang.String");
    }

    /* JADX INFO: compiled from: TypeReference.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/jvm/internal/TypeReference$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }
    }
}
