package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/TimeMark.class */
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalTime.class})
public interface TimeMark {
    /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
    long mo1618elapsedNowUwyO8pc();

    @NotNull
    /* JADX INFO: renamed from: plus-LRDsOJo */
    TimeMark mo1619plusLRDsOJo(long j);

    @NotNull
    /* JADX INFO: renamed from: minus-LRDsOJo */
    TimeMark mo1621minusLRDsOJo(long j);

    boolean hasPassedNow();

    boolean hasNotPassedNow();

    /* JADX INFO: compiled from: TimeSource.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/TimeMark$DefaultImpls.class */
    public static final class DefaultImpls {
        @NotNull
        /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
        public static TimeMark m1751plusLRDsOJo(@NotNull TimeMark $this, long duration) {
            return new AdjustedTimeMark($this, duration, null);
        }

        @NotNull
        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public static TimeMark m1752minusLRDsOJo(@NotNull TimeMark $this, long duration) {
            return $this.mo1619plusLRDsOJo(Duration.m1632unaryMinusUwyO8pc(duration));
        }

        public static boolean hasPassedNow(@NotNull TimeMark $this) {
            return !Duration.m1642isNegativeimpl($this.mo1618elapsedNowUwyO8pc());
        }

        public static boolean hasNotPassedNow(@NotNull TimeMark $this) {
            return Duration.m1642isNegativeimpl($this.mo1618elapsedNowUwyO8pc());
        }
    }
}
