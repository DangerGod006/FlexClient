package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.RestrictsSuspension;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeepRecursive.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/DeepRecursiveScope.class */
@RestrictsSuspension
@SinceKotlin(version = "1.7")
@WasExperimental(markerClass = {ExperimentalStdlibApi.class})
public abstract class DeepRecursiveScope<T, R> {
    @Nullable
    public abstract Object callRecursive(T t, @NotNull Continuation<? super R> continuation);

    @Nullable
    public abstract <U, S> Object callRecursive(@NotNull DeepRecursiveFunction<U, S> deepRecursiveFunction, U u, @NotNull Continuation<? super S> continuation);

    public /* synthetic */ DeepRecursiveScope(DefaultConstructorMarker $constructor_marker) {
        this();
    }

    private DeepRecursiveScope() {
    }

    @Deprecated(message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @ReplaceWith(expression = "this.callRecursive(value)", imports = {}), level = DeprecationLevel.ERROR)
    @NotNull
    public final Void invoke(@NotNull DeepRecursiveFunction<?, ?> $this$invoke, @Nullable Object value) {
        Intrinsics.checkNotNullParameter($this$invoke, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }
}
