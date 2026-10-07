package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SequenceBuilder.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/sequences/SequenceBuilderIterator.class */
final class SequenceBuilderIterator<T> extends SequenceScope<T> implements Iterator<T>, Continuation<Unit>, KMappedMarker {
    private int state;

    @Nullable
    private T nextValue;

    @Nullable
    private Iterator<? extends T> nextIterator;

    @Nullable
    private Continuation<? super Unit> nextStep;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Nullable
    public final Continuation<Unit> getNextStep() {
        return this.nextStep;
    }

    public final void setNextStep(@Nullable Continuation<? super Unit> continuation) {
        this.nextStep = continuation;
    }

    @Override // java.util.Iterator
    public boolean hasNext() throws Throwable {
        while (true) {
            switch (this.state) {
                case 0:
                    break;
                case 1:
                    Iterator<? extends T> it = this.nextIterator;
                    Intrinsics.checkNotNull(it);
                    if (it.hasNext()) {
                        this.state = 2;
                        return true;
                    }
                    this.nextIterator = null;
                    break;
                    break;
                case 2:
                case 3:
                    return true;
                case 4:
                    return false;
                default:
                    throw exceptionalState();
            }
            this.state = 5;
            Continuation<? super Unit> continuation = this.nextStep;
            Intrinsics.checkNotNull(continuation);
            this.nextStep = null;
            Unit unit = Unit.INSTANCE;
            Result.Companion companion = Result.Companion;
            continuation.resumeWith(Result.m185constructorimpl(unit));
        }
    }

    @Override // java.util.Iterator
    public T next() throws Throwable {
        switch (this.state) {
            case 0:
            case 1:
                return nextNotReady();
            case 2:
                this.state = 1;
                Iterator<? extends T> it = this.nextIterator;
                Intrinsics.checkNotNull(it);
                return it.next();
            case 3:
                this.state = 0;
                T t = this.nextValue;
                this.nextValue = null;
                return t;
            default:
                throw exceptionalState();
        }
    }

    private final T nextNotReady() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    private final Throwable exceptionalState() {
        switch (this.state) {
            case 4:
                return new NoSuchElementException();
            case AbstractJsonLexerKt.TC_COLON /* 5 */:
                return new IllegalStateException("Iterator has failed.");
            default:
                return new IllegalStateException("Unexpected state of the iterator: " + this.state);
        }
    }

    @Override // kotlin.sequences.SequenceScope
    @Nullable
    public Object yield(T value, @NotNull Continuation<? super Unit> $completion) {
        this.nextValue = value;
        this.state = 3;
        this.nextStep = $completion;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended($completion);
        }
        return coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : Unit.INSTANCE;
    }

    @Override // kotlin.sequences.SequenceScope
    @Nullable
    public Object yieldAll(@NotNull Iterator<? extends T> iterator, @NotNull Continuation<? super Unit> $completion) {
        if (!iterator.hasNext()) {
            return Unit.INSTANCE;
        }
        this.nextIterator = iterator;
        this.state = 2;
        this.nextStep = $completion;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended($completion);
        }
        return coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object result) throws Throwable {
        ResultKt.throwOnFailure(result);
        this.state = 4;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }
}
