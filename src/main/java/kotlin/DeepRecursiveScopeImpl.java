package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DeepRecursive.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/DeepRecursiveScopeImpl.class */
final class DeepRecursiveScopeImpl<T, R> extends DeepRecursiveScope<T, R> implements Continuation<R> {

    @NotNull
    private Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> function;

    @Nullable
    private Object value;

    @Nullable
    private Continuation<Object> cont;

    @NotNull
    private Object result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeepRecursiveScopeImpl(@NotNull Function3<? super DeepRecursiveScope<T, R>, ? super T, ? super Continuation<? super R>, ? extends Object> block, T value) {
        super(null);
        Intrinsics.checkNotNullParameter(block, "block");
        this.function = block;
        this.value = value;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.cont = this;
        this.result = DeepRecursiveKt.UNDEFINED_RESULT;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object result) {
        this.cont = null;
        this.result = result;
    }

    @Override // kotlin.DeepRecursiveScope
    @Nullable
    public Object callRecursive(T value, @NotNull Continuation<? super R> $completion) {
        Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.cont = $completion;
        this.value = value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended($completion);
        }
        return coroutine_suspended;
    }

    @Override // kotlin.DeepRecursiveScope
    @Nullable
    public <U, S> Object callRecursive(@NotNull DeepRecursiveFunction<U, S> $this$callRecursive, U value, @NotNull Continuation<? super S> $completion) {
        Function3<DeepRecursiveScope<U, S>, U, Continuation<? super S>, Object> block$kotlin_stdlib = $this$callRecursive.getBlock$kotlin_stdlib();
        Intrinsics.checkNotNull(block$kotlin_stdlib, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>");
        DeepRecursiveScopeImpl<T, R> deepRecursiveScopeImpl = this;
        Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> function3 = deepRecursiveScopeImpl.function;
        if (block$kotlin_stdlib == function3) {
            Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            deepRecursiveScopeImpl.cont = $completion;
        } else {
            deepRecursiveScopeImpl.function = block$kotlin_stdlib;
            Intrinsics.checkNotNull($completion, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            deepRecursiveScopeImpl.cont = deepRecursiveScopeImpl.crossFunctionCompletion(function3, $completion);
        }
        deepRecursiveScopeImpl.value = value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended($completion);
        }
        return coroutine_suspended;
    }

    private final Continuation<Object> crossFunctionCompletion(final Function3<? super DeepRecursiveScope<?, ?>, Object, ? super Continuation<Object>, ? extends Object> currentFunction, final Continuation<Object> cont) {
        final EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        return new Continuation<Object>() { // from class: kotlin.DeepRecursiveScopeImpl$crossFunctionCompletion$$inlined$Continuation$1
            @Override // kotlin.coroutines.Continuation
            public CoroutineContext getContext() {
                return emptyCoroutineContext;
            }

            @Override // kotlin.coroutines.Continuation
            public void resumeWith(Object result) {
                this.function = currentFunction;
                this.cont = cont;
                this.result = result;
            }
        };
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:8:0x0025
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    public final R runCallLoop() {
        /*
            r5 = this;
        L0:
            r0 = r5
            java.lang.Object r0 = r0.result
            r6 = r0
            r0 = r5
            kotlin.coroutines.Continuation<java.lang.Object> r0 = r0.cont
            r1 = r0
            if (r1 != 0) goto L1a
        Lf:
            r0 = r6
            r9 = r0
            r0 = r9
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r9
            return r0
        L1a:
            r7 = r0
            java.lang.Object r0 = kotlin.DeepRecursiveKt.access$getUNDEFINED_RESULT$p()
            r1 = r6
            boolean r0 = kotlin.Result.m188equalsimpl0(r0, r1)
            if (r0 == 0) goto L97
        L26:
            r0 = r5
            kotlin.jvm.functions.Function3<? super kotlin.DeepRecursiveScope<?, ?>, java.lang.Object, ? super kotlin.coroutines.Continuation<java.lang.Object>, ? extends java.lang.Object> r0 = r0.function     // Catch: java.lang.Throwable -> L5d
            r9 = r0
            r0 = r5
            java.lang.Object r0 = r0.value     // Catch: java.lang.Throwable -> L5d
            r10 = r0
            r0 = r9
            boolean r0 = r0 instanceof kotlin.coroutines.jvm.internal.BaseContinuationImpl     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L46
            r0 = r9
            r1 = r5
            r2 = r10
            r3 = r7
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.wrapWithContinuationImpl(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L5d
            goto L58
        L46:
            r0 = r9
            r1 = 3
            java.lang.Object r0 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r0, r1)     // Catch: java.lang.Throwable -> L5d
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0     // Catch: java.lang.Throwable -> L5d
            r1 = r5
            r2 = r10
            r3 = r7
            java.lang.Object r0 = r0.invoke(r1, r2, r3)     // Catch: java.lang.Throwable -> L5d
        L58:
            r9 = r0
            goto L74
        L5d:
            r10 = move-exception
            r0 = r7
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            r1 = r10
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m185constructorimpl(r1)
            r0.resumeWith(r1)
            goto L0
        L74:
            r0 = r9
            r8 = r0
            r0 = r8
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 == r1) goto L0
            r0 = r7
            r9 = r0
            r0 = r8
            r10 = r0
            r0 = r9
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            r1 = r10
            java.lang.Object r1 = kotlin.Result.m185constructorimpl(r1)
            r0.resumeWith(r1)
            goto L0
        L97:
            r0 = r5
            java.lang.Object r1 = kotlin.DeepRecursiveKt.access$getUNDEFINED_RESULT$p()
            r0.result = r1
            r0 = r7
            r1 = r6
            r0.resumeWith(r1)
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DeepRecursiveScopeImpl.runCallLoop():java.lang.Object");
    }
}
