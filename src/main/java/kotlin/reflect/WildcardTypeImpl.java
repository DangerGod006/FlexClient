package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.ExperimentalStdlibApi;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/WildcardTypeImpl.class */
@ExperimentalStdlibApi
final class WildcardTypeImpl implements WildcardType, TypeImpl {

    @Nullable
    private final Type upperBound;

    @Nullable
    private final Type lowerBound;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final WildcardTypeImpl STAR = new WildcardTypeImpl(null, null);

    public WildcardTypeImpl(@Nullable Type upperBound, @Nullable Type lowerBound) {
        this.upperBound = upperBound;
        this.lowerBound = lowerBound;
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public Type[] getUpperBounds() {
        Type[] typeArr = new Type[1];
        Class cls = this.upperBound;
        if (cls == null) {
        }
        typeArr[0] = cls;
        return typeArr;
    }

    @Override // java.lang.reflect.WildcardType
    @NotNull
    public Type[] getLowerBounds() {
        return this.lowerBound == null ? new Type[0] : new Type[]{this.lowerBound};
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.TypeImpl
    @NotNull
    public String getTypeName() {
        if (this.lowerBound != null) {
            return "? super " + TypesJVMKt.typeToString(this.lowerBound);
        }
        if (this.upperBound != null && !Intrinsics.areEqual(this.upperBound, Object.class)) {
            return "? extends " + TypesJVMKt.typeToString(this.upperBound);
        }
        return "?";
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof WildcardType) && Arrays.equals(getUpperBounds(), ((WildcardType) other).getUpperBounds()) && Arrays.equals(getLowerBounds(), ((WildcardType) other).getLowerBounds());
    }

    public int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @NotNull
    public String toString() {
        return getTypeName();
    }

    /* JADX INFO: compiled from: TypesJVM.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/WildcardTypeImpl$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final WildcardTypeImpl getSTAR() {
            return WildcardTypeImpl.STAR;
        }
    }
}
