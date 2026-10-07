package kotlin.coroutines.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RunSuspend.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/coroutines/jvm/internal/RunSuspendKt.class */
public final class RunSuspendKt {
    @SinceKotlin(version = "1.3")
    public static final void runSuspend(@NotNull Function1<? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        RunSuspend run = new RunSuspend();
        ContinuationKt.startCoroutine(block, run);
        run.await();
    }
}
