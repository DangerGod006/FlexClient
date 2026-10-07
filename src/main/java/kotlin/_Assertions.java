package kotlin;

import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AssertionsJVM.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/_Assertions.class */
@PublishedApi
public final class _Assertions {

    @NotNull
    public static final _Assertions INSTANCE = new _Assertions();

    @JvmField
    public static final boolean ENABLED = INSTANCE.getClass().desiredAssertionStatus();

    @PublishedApi
    public static /* synthetic */ void getENABLED$annotations() {
    }

    private _Assertions() {
    }
}
