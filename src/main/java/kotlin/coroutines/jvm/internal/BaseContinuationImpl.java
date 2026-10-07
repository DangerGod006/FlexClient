package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/coroutines/jvm/internal/BaseContinuationImpl.class */
@SinceKotlin(version = "1.3")
public abstract class BaseContinuationImpl implements Continuation<Object>, CoroutineStackFrame, Serializable {

    @Nullable
    private final Continuation<Object> completion;

    @Nullable
    protected abstract Object invokeSuspend(@NotNull Object obj);

    public BaseContinuationImpl(@Nullable Continuation<Object> completion) {
        this.completion = completion;
    }

    @Nullable
    public final Continuation<Object> getCompletion() {
        return this.completion;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(@NotNull Object result) {
        Object objM185constructorimpl;
        Object outcome;
        Object current = this;
        Object obj = result;
        while (true) {
            Object param = obj;
            DebugProbesKt.probeCoroutineResumed((Continuation) current);
            BaseContinuationImpl $this$resumeWith_u24lambda_u240 = (BaseContinuationImpl) current;
            Continuation<Object> continuation = $this$resumeWith_u24lambda_u240.completion;
            Intrinsics.checkNotNull(continuation);
            try {
                outcome = $this$resumeWith_u24lambda_u240.invokeSuspend(param);
            } catch (Throwable exception) {
                Result.Companion companion = Result.Companion;
                objM185constructorimpl = Result.m185constructorimpl(ResultKt.createFailure(exception));
            }
            if (outcome == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return;
            }
            Result.Companion companion2 = Result.Companion;
            objM185constructorimpl = Result.m185constructorimpl(outcome);
            Object outcome2 = objM185constructorimpl;
            $this$resumeWith_u24lambda_u240.releaseIntercepted();
            if (continuation instanceof BaseContinuationImpl) {
                current = continuation;
                obj = outcome2;
            } else {
                continuation.resumeWith(outcome2);
                return;
            }
        }
    }

    protected void releaseIntercepted() {
    }

    @NotNull
    public Continuation<Unit> create(@NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @NotNull
    public Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @NotNull
    public String toString() {
        StringBuilder sbAppend = new StringBuilder().append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        return sbAppend.append(stackTraceElement).toString();
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<Object> continuation = this.completion;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return DebugMetadataKt.getStackTraceElement(this);
    }
}
