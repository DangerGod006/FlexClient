package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/ComparableTimeMark.class */
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalTime.class})
public interface ComparableTimeMark extends TimeMark, Comparable<ComparableTimeMark> {
    @Override // kotlin.time.TimeMark
    @NotNull
    /* JADX INFO: renamed from: plus-LRDsOJo */
    ComparableTimeMark mo1619plusLRDsOJo(long j);

    @Override // kotlin.time.TimeMark
    @NotNull
    /* JADX INFO: renamed from: minus-LRDsOJo */
    ComparableTimeMark mo1621minusLRDsOJo(long j);

    /* JADX INFO: renamed from: minus-UwyO8pc */
    long mo1620minusUwyO8pc(@NotNull ComparableTimeMark comparableTimeMark);

    int compareTo(@NotNull ComparableTimeMark comparableTimeMark);

    boolean equals(@Nullable Object obj);

    int hashCode();

    /* JADX INFO: compiled from: TimeSource.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/ComparableTimeMark$DefaultImpls.class */
    public static final class DefaultImpls {
        public static boolean hasPassedNow(@NotNull ComparableTimeMark $this) {
            return TimeMark.DefaultImpls.hasPassedNow($this);
        }

        public static boolean hasNotPassedNow(@NotNull ComparableTimeMark $this) {
            return TimeMark.DefaultImpls.hasNotPassedNow($this);
        }

        @NotNull
        /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
        public static ComparableTimeMark m1626minusLRDsOJo(@NotNull ComparableTimeMark $this, long duration) {
            return $this.mo1619plusLRDsOJo(Duration.m1632unaryMinusUwyO8pc(duration));
        }

        public static int compareTo(@NotNull ComparableTimeMark $this, @NotNull ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return Duration.m1647compareToLRDsOJo($this.mo1620minusUwyO8pc(other), Duration.Companion.m1679getZEROUwyO8pc());
        }
    }
}
