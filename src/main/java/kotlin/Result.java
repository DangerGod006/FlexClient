package kotlin;

import java.io.Serializable;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmInline;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/Result.class */
@SinceKotlin(version = "1.3")
@JvmInline
public final class Result<T> implements Serializable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @Nullable
    private final Object value;

    @PublishedApi
    public static /* synthetic */ void getValue$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m183hashCodeimpl(Object arg0) {
        if (arg0 == null) {
            return 0;
        }
        return arg0.hashCode();
    }

    public int hashCode() {
        return m183hashCodeimpl(this.value);
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m184equalsimpl(Object arg0, Object other) {
        return (other instanceof Result) && Intrinsics.areEqual(arg0, ((Result) other).m187unboximpl());
    }

    public boolean equals(Object other) {
        return m184equalsimpl(this.value, other);
    }

    @PublishedApi
    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m185constructorimpl(@Nullable Object value) {
        return value;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Result m186boximpl(Object v) {
        return new Result(v);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m187unboximpl() {
        return this.value;
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m188equalsimpl0(Object p1, Object p2) {
        return Intrinsics.areEqual(p1, p2);
    }

    @PublishedApi
    private /* synthetic */ Result(Object value) {
        this.value = value;
    }

    /* JADX INFO: renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m178isSuccessimpl(Object arg0) {
        return !(arg0 instanceof Failure);
    }

    /* JADX INFO: renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m179isFailureimpl(Object arg0) {
        return arg0 instanceof Failure;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InlineOnly
    /* JADX INFO: renamed from: getOrNull-impl, reason: not valid java name */
    private static final T m180getOrNullimpl(Object arg0) {
        if (m179isFailureimpl(arg0)) {
            return null;
        }
        return arg0;
    }

    @Nullable
    /* JADX INFO: renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m181exceptionOrNullimpl(Object arg0) {
        if (arg0 instanceof Failure) {
            return ((Failure) arg0).exception;
        }
        return null;
    }

    @NotNull
    public String toString() {
        return m182toStringimpl(this.value);
    }

    @NotNull
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m182toStringimpl(Object arg0) {
        return arg0 instanceof Failure ? ((Failure) arg0).toString() : "Success(" + arg0 + ')';
    }

    /* JADX INFO: compiled from: Result.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/Result$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        @InlineOnly
        @JvmName(name = "success")
        private final <T> Object success(T value) {
            return Result.m185constructorimpl(value);
        }

        @InlineOnly
        @JvmName(name = "failure")
        private final <T> Object failure(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            return Result.m185constructorimpl(ResultKt.createFailure(exception));
        }
    }

    /* JADX INFO: compiled from: Result.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/Result$Failure.class */
    public static final class Failure implements Serializable {

        @JvmField
        @NotNull
        public final Throwable exception;

        public Failure(@NotNull Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.exception = exception;
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof Failure) && Intrinsics.areEqual(this.exception, ((Failure) other).exception);
        }

        public int hashCode() {
            return this.exception.hashCode();
        }

        @NotNull
        public String toString() {
            return "Failure(" + this.exception + ')';
        }
    }
}
