package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AssertionsJVM.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/PreconditionsKt__AssertionsJVMKt.class */
class PreconditionsKt__AssertionsJVMKt {
    @InlineOnly
    /* JADX INFO: renamed from: assert, reason: not valid java name */
    private static final void m175assert(boolean value) {
        if (_Assertions.ENABLED && !value) {
            throw new AssertionError("Assertion failed");
        }
    }

    @InlineOnly
    /* JADX INFO: renamed from: assert, reason: not valid java name */
    private static final void m176assert(boolean value, Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (_Assertions.ENABLED && !value) {
            Object message = lazyMessage.invoke();
            throw new AssertionError(message);
        }
    }
}
