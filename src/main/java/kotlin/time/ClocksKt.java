package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Clocks.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/ClocksKt.class */
public final class ClocksKt {
    @SinceKotlin(version = "2.2")
    @JvmName(name = "fromTimeSource")
    @NotNull
    @ExperimentalTime
    public static final Clock fromTimeSource(@NotNull final TimeSource $this$asClock, @NotNull final Instant origin) {
        Intrinsics.checkNotNullParameter($this$asClock, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        return new Clock($this$asClock, origin) { // from class: kotlin.time.ClocksKt$asClock$1
            private final TimeMark startMark;
            final /* synthetic */ Instant $origin;

            {
                this.$origin = origin;
                this.startMark = $this$asClock.markNow();
            }

            @Override // kotlin.time.Clock
            public Instant now() {
                return this.$origin.m1734plusLRDsOJo(this.startMark.mo1618elapsedNowUwyO8pc());
            }
        };
    }
}
