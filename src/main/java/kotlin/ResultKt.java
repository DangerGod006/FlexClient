package kotlin;

import kotlin.Result;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ResultKt.class */
public final class ResultKt {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    public static final Object createFailure(@NotNull Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new Result.Failure(exception);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    public static final void throwOnFailure(@NotNull Object $this$throwOnFailure) throws Throwable {
        if ($this$throwOnFailure instanceof Result.Failure) {
            throw ((Result.Failure) $this$throwOnFailure).exception;
        }
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R> Object runCatching(Function0<? extends R> block) {
        Object objM185constructorimpl;
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.Companion;
            objM185constructorimpl = Result.m185constructorimpl(block.invoke());
        } catch (Throwable e) {
            Result.Companion companion2 = Result.Companion;
            objM185constructorimpl = Result.m185constructorimpl(createFailure(e));
        }
        return objM185constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T, R> Object runCatching(T $this$runCatching, Function1<? super T, ? extends R> block) {
        Object objM185constructorimpl;
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            Result.Companion companion = Result.Companion;
            objM185constructorimpl = Result.m185constructorimpl(block.invoke($this$runCatching));
        } catch (Throwable e) {
            Result.Companion companion2 = Result.Companion;
            objM185constructorimpl = Result.m185constructorimpl(createFailure(e));
        }
        return objM185constructorimpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> T getOrThrow(Object $this$getOrThrow) throws Throwable {
        throwOnFailure($this$getOrThrow);
        return $this$getOrThrow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T extends R> R getOrElse(Object $this$getOrElse, Function1<? super Throwable, ? extends R> onFailure) {
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Throwable exception = Result.m181exceptionOrNullimpl($this$getOrElse);
        return exception == null ? $this$getOrElse : onFailure.invoke(exception);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T extends R> R getOrDefault(Object $this$getOrDefault, R defaultValue) {
        return Result.m179isFailureimpl($this$getOrDefault) ? defaultValue : $this$getOrDefault;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T> R fold(Object $this$fold, Function1<? super T, ? extends R> onSuccess, Function1<? super Throwable, ? extends R> onFailure) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Throwable exception = Result.m181exceptionOrNullimpl($this$fold);
        return exception == null ? onSuccess.invoke($this$fold) : onFailure.invoke(exception);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T> Object map(Object $this$map, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (!Result.m178isSuccessimpl($this$map)) {
            return Result.m185constructorimpl($this$map);
        }
        Result.Companion companion = Result.Companion;
        return Result.m185constructorimpl(transform.invoke($this$map));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T> Object mapCatching(Object $this$mapCatching, Function1<? super T, ? extends R> transform) {
        Object objM185constructorimpl;
        Intrinsics.checkNotNullParameter(transform, "transform");
        if (Result.m178isSuccessimpl($this$mapCatching)) {
            try {
                Result.Companion companion = Result.Companion;
                objM185constructorimpl = Result.m185constructorimpl(transform.invoke($this$mapCatching));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM185constructorimpl = Result.m185constructorimpl(createFailure(th));
            }
            return objM185constructorimpl;
        }
        return Result.m185constructorimpl($this$mapCatching);
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T extends R> Object recover(Object $this$recover, Function1<? super Throwable, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        Throwable exception = Result.m181exceptionOrNullimpl($this$recover);
        if (exception == null) {
            return $this$recover;
        }
        Result.Companion companion = Result.Companion;
        return Result.m185constructorimpl(transform.invoke(exception));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <R, T extends R> Object recoverCatching(Object $this$recoverCatching, Function1<? super Throwable, ? extends R> transform) {
        Object objM185constructorimpl;
        Intrinsics.checkNotNullParameter(transform, "transform");
        Throwable exception = Result.m181exceptionOrNullimpl($this$recoverCatching);
        if (exception == null) {
            return $this$recoverCatching;
        }
        try {
            Result.Companion companion = Result.Companion;
            objM185constructorimpl = Result.m185constructorimpl(transform.invoke(exception));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM185constructorimpl = Result.m185constructorimpl(createFailure(th));
        }
        return objM185constructorimpl;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Object onFailure(Object $this$onFailure, Function1<? super Throwable, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Throwable it = Result.m181exceptionOrNullimpl($this$onFailure);
        if (it != null) {
            action.invoke(it);
        }
        return $this$onFailure;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Object onSuccess(Object $this$onSuccess, Function1<? super T, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (Result.m178isSuccessimpl($this$onSuccess)) {
            action.invoke($this$onSuccess);
        }
        return $this$onSuccess;
    }
}
