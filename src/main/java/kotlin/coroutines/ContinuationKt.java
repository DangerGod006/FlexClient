package kotlin.coroutines;

import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Continuation.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/coroutines/ContinuationKt.class */
public final class ContinuationKt {
    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> void resume(Continuation<? super T> $this$resume, T value) {
        Intrinsics.checkNotNullParameter($this$resume, "<this>");
        Result.Companion companion = Result.Companion;
        $this$resume.resumeWith(Result.m185constructorimpl(value));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> void resumeWithException(Continuation<? super T> $this$resumeWithException, Throwable exception) {
        Intrinsics.checkNotNullParameter($this$resumeWithException, "<this>");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Result.Companion companion = Result.Companion;
        $this$resumeWithException.resumeWith(Result.m185constructorimpl(ResultKt.createFailure(exception)));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Continuation<T> Continuation(final CoroutineContext context, final Function1<? super Result<? extends T>, Unit> resumeWith) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resumeWith, "resumeWith");
        return new Continuation<T>() { // from class: kotlin.coroutines.ContinuationKt.Continuation.1
            @Override // kotlin.coroutines.Continuation
            public CoroutineContext getContext() {
                return context;
            }

            @Override // kotlin.coroutines.Continuation
            public void resumeWith(Object result) {
                resumeWith.invoke(Result.m186boximpl(result));
            }
        };
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> Continuation<Unit> createCoroutine(@NotNull Function1<? super Continuation<? super T>, ? extends Object> $this$createCoroutine, @NotNull Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter($this$createCoroutine, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new SafeContinuation(IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted($this$createCoroutine, completion)), IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <R, T> Continuation<Unit> createCoroutine(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> $this$createCoroutine, R receiver, @NotNull Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter($this$createCoroutine, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new SafeContinuation(IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted($this$createCoroutine, receiver, completion)), IntrinsicsKt.getCOROUTINE_SUSPENDED());
    }

    @SinceKotlin(version = "1.3")
    public static final <T> void startCoroutine(@NotNull Function1<? super Continuation<? super T>, ? extends Object> $this$startCoroutine, @NotNull Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter($this$startCoroutine, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Continuation continuationIntercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted($this$startCoroutine, completion));
        Unit unit = Unit.INSTANCE;
        Result.Companion companion = Result.Companion;
        continuationIntercepted.resumeWith(Result.m185constructorimpl(unit));
    }

    @SinceKotlin(version = "1.3")
    public static final <R, T> void startCoroutine(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> $this$startCoroutine, R receiver, @NotNull Continuation<? super T> completion) {
        Intrinsics.checkNotNullParameter($this$startCoroutine, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        Continuation continuationIntercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted($this$startCoroutine, receiver, completion));
        Unit unit = Unit.INSTANCE;
        Result.Companion companion = Result.Companion;
        continuationIntercepted.resumeWith(Result.m185constructorimpl(unit));
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Object suspendCoroutine(Function1<? super Continuation<? super T>, Unit> block, Continuation<? super T> $completion) throws Throwable {
        InlineMarker.mark(0);
        SafeContinuation safe = new SafeContinuation(IntrinsicsKt.intercepted($completion));
        block.invoke(safe);
        Object orThrow = safe.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended($completion);
        }
        InlineMarker.mark(1);
        return orThrow;
    }

    private static final CoroutineContext getCoroutineContext() {
        throw new NotImplementedError("Implemented as intrinsic");
    }
}
