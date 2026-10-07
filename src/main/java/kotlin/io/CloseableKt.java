package kotlin.io;

import java.io.Closeable;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Closeable.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/io/CloseableKt.class */
@JvmName(name = "CloseableKt")
public final class CloseableKt {
    @InlineOnly
    private static final <T extends Closeable, R> R use(T $this$use, Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Throwable exception = null;
        try {
            try {
                R rInvoke = block.invoke($this$use);
                InlineMarker.finallyStart(1);
                closeFinally($this$use, null);
                InlineMarker.finallyEnd(1);
                return rInvoke;
            } finally {
            }
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            closeFinally($this$use, exception);
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }

    @SinceKotlin(version = "1.1")
    @PublishedApi
    public static final void closeFinally(@Nullable Closeable $this$closeFinally, @Nullable Throwable cause) {
        if ($this$closeFinally != null) {
            if (cause == null) {
                $this$closeFinally.close();
                return;
            }
            try {
                $this$closeFinally.close();
            } catch (Throwable closeException) {
                kotlin.ExceptionsKt.addSuppressed(cause, closeException);
            }
        }
    }
}
