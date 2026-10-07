package kotlin.time;

import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InstantJvm.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/InstantJvmKt.class */
public final class InstantJvmKt {

    @NotNull
    private static final Clock systemClock = PlatformImplementationsKt.IMPLEMENTATIONS.getSystemClock();

    @ExperimentalTime
    private static /* synthetic */ void getSystemClock$annotations() {
    }

    @ExperimentalTime
    @NotNull
    public static final Instant systemClockNow() {
        return systemClock.now();
    }

    @ExperimentalTime
    @NotNull
    public static final Object serializedInstant(@NotNull Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "instant");
        return new InstantSerialized(instant.getEpochSeconds(), instant.getNanosecondsOfSecond());
    }
}
