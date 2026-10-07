package kotlin.coroutines.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ContinuationImpl.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/coroutines/jvm/internal/ContinuationImpl.class */
@SinceKotlin(version = "1.3")
public abstract class ContinuationImpl extends BaseContinuationImpl {

    @Nullable
    private final CoroutineContext _context;

    @Nullable
    private transient Continuation<Object> intercepted;

    public ContinuationImpl(@Nullable Continuation<Object> completion, @Nullable CoroutineContext _context) {
        super(completion);
        this._context = _context;
    }

    public ContinuationImpl(@Nullable Continuation<Object> completion) {
        this(completion, completion != null ? completion.getContext() : null);
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.checkNotNull(coroutineContext);
        return coroutineContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.coroutines.Continuation<java.lang.Object> intercepted() {
        /*
            r3 = this;
            r0 = r3
            kotlin.coroutines.Continuation<java.lang.Object> r0 = r0.intercepted
            r1 = r0
            if (r1 != 0) goto L3c
        L9:
            r0 = r3
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            kotlin.coroutines.ContinuationInterceptor$Key r1 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Key r1 = (kotlin.coroutines.CoroutineContext.Key) r1
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            kotlin.coroutines.ContinuationInterceptor r0 = (kotlin.coroutines.ContinuationInterceptor) r0
            r1 = r0
            if (r1 == 0) goto L2c
            r1 = r3
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlin.coroutines.Continuation r0 = r0.interceptContinuation(r1)
            r1 = r0
            if (r1 != 0) goto L31
        L2c:
        L2d:
            r0 = r3
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
        L31:
            r4 = r0
            r0 = r4
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r3
            r1 = r5
            r0.intercepted = r1
            r0 = r4
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.jvm.internal.ContinuationImpl.intercepted():kotlin.coroutines.Continuation");
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    protected void releaseIntercepted() {
        Continuation<?> continuation = this.intercepted;
        if (continuation != null && continuation != this) {
            CoroutineContext.Element element = getContext().get(ContinuationInterceptor.Key);
            Intrinsics.checkNotNull(element);
            ((ContinuationInterceptor) element).releaseInterceptedContinuation(continuation);
        }
        this.intercepted = CompletedContinuation.INSTANCE;
    }
}
