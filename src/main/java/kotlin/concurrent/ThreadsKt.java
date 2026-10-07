package kotlin.concurrent;

import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Thread.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/concurrent/ThreadsKt.class */
@JvmName(name = "ThreadsKt")
public final class ThreadsKt {
    public static /* synthetic */ Thread thread$default(boolean z, boolean z2, ClassLoader classLoader, String str, int i, Function0 function0, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            classLoader = null;
        }
        if ((i2 & 8) != 0) {
            str = null;
        }
        if ((i2 & 16) != 0) {
            i = -1;
        }
        return thread(z, z2, classLoader, str, i, function0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.concurrent.ThreadsKt$thread$thread$1] */
    @NotNull
    public static final Thread thread(boolean start, boolean isDaemon, @Nullable ClassLoader contextClassLoader, @Nullable String name, int priority, @NotNull final Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ?? r0 = new Thread() { // from class: kotlin.concurrent.ThreadsKt$thread$thread$1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                block.invoke();
            }
        };
        if (isDaemon) {
            r0.setDaemon(true);
        }
        if (priority > 0) {
            r0.setPriority(priority);
        }
        if (name != null) {
            r0.setName(name);
        }
        if (contextClassLoader != null) {
            r0.setContextClassLoader(contextClassLoader);
        }
        if (start) {
            r0.start();
        }
        return (Thread) r0;
    }

    @InlineOnly
    private static final <T> T getOrSet(ThreadLocal<T> $this$getOrSet, Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter($this$getOrSet, "<this>");
        Intrinsics.checkNotNullParameter(function0, "default");
        T t = $this$getOrSet.get();
        if (t != null) {
            return t;
        }
        T tInvoke = function0.invoke();
        $this$getOrSet.set(tInvoke);
        return tInvoke;
    }
}
