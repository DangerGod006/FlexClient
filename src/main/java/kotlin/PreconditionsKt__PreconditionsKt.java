package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Preconditions.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/PreconditionsKt__PreconditionsKt.class */
class PreconditionsKt__PreconditionsKt extends PreconditionsKt__AssertionsJVMKt {
    @InlineOnly
    private static final void require(boolean value) {
        if (!value) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @InlineOnly
    private static final void require(boolean value, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (!value) {
            Object message = lazyMessage.invoke();
            throw new IllegalArgumentException(message.toString());
        }
    }

    @InlineOnly
    private static final <T> T requireNotNull(T value) {
        if (value == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        return value;
    }

    @InlineOnly
    private static final <T> T requireNotNull(T value, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (value == null) {
            Object message = lazyMessage.invoke();
            throw new IllegalArgumentException(message.toString());
        }
        return value;
    }

    @InlineOnly
    private static final void check(boolean value) {
        if (!value) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @InlineOnly
    private static final void check(boolean value, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (!value) {
            Object message = lazyMessage.invoke();
            throw new IllegalStateException(message.toString());
        }
    }

    @InlineOnly
    private static final <T> T checkNotNull(T value) {
        if (value == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        return value;
    }

    @InlineOnly
    private static final <T> T checkNotNull(T value, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (value == null) {
            Object message = lazyMessage.invoke();
            throw new IllegalStateException(message.toString());
        }
        return value;
    }

    @InlineOnly
    private static final Void error(Object message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new IllegalStateException(message.toString());
    }
}
