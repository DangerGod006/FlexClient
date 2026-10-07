package kotlin.time;

import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/TimeSource.class */
@SinceKotlin(version = "1.9")
@WasExperimental(markerClass = {ExperimentalTime.class})
public interface TimeSource {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: TimeSource.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/TimeSource$WithComparableMarks.class */
    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalTime.class})
    public interface WithComparableMarks extends TimeSource {
        @Override // kotlin.time.TimeSource
        @NotNull
        ComparableTimeMark markNow();
    }

    @NotNull
    TimeMark markNow();

    /* JADX INFO: compiled from: TimeSource.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/TimeSource$Monotonic.class */
    public static final class Monotonic implements WithComparableMarks {

        @NotNull
        public static final Monotonic INSTANCE = new Monotonic();

        private Monotonic() {
        }

        @Override // kotlin.time.TimeSource.WithComparableMarks, kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ ComparableTimeMark markNow() {
            return ValueTimeMark.m1772boximpl(m1755markNowz9LOYto());
        }

        @Override // kotlin.time.TimeSource
        public /* bridge */ /* synthetic */ TimeMark markNow() {
            return ValueTimeMark.m1772boximpl(m1755markNowz9LOYto());
        }

        /* JADX INFO: renamed from: markNow-z9LOYto, reason: not valid java name */
        public long m1755markNowz9LOYto() {
            return MonotonicTimeSource.INSTANCE.m1744markNowz9LOYto();
        }

        @NotNull
        public String toString() {
            return MonotonicTimeSource.INSTANCE.toString();
        }

        /* JADX INFO: compiled from: TimeSource.kt */
        /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/TimeSource$Monotonic$ValueTimeMark.class */
        @SinceKotlin(version = "1.9")
        @JvmInline
        @WasExperimental(markerClass = {ExperimentalTime.class})
        public static final class ValueTimeMark implements ComparableTimeMark {
            private final long reading;

            /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
            public static String m1767toStringimpl(long arg0) {
                return "ValueTimeMark(reading=" + arg0 + ')';
            }

            public String toString() {
                return m1767toStringimpl(this.reading);
            }

            /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
            public static int m1768hashCodeimpl(long arg0) {
                return Long.hashCode(arg0);
            }

            @Override // kotlin.time.ComparableTimeMark
            public int hashCode() {
                return m1768hashCodeimpl(this.reading);
            }

            /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
            public static boolean m1769equalsimpl(long arg0, Object other) {
                return (other instanceof ValueTimeMark) && arg0 == ((ValueTimeMark) other).m1773unboximpl();
            }

            @Override // kotlin.time.ComparableTimeMark
            public boolean equals(Object other) {
                return m1769equalsimpl(this.reading, other);
            }

            /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
            public static long m1771constructorimpl(long reading) {
                return reading;
            }

            /* JADX INFO: renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ ValueTimeMark m1772boximpl(long v) {
                return new ValueTimeMark(v);
            }

            /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ long m1773unboximpl() {
                return this.reading;
            }

            /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m1774equalsimpl0(long p1, long p2) {
                return p1 == p2;
            }

            /* JADX INFO: renamed from: compareTo-impl, reason: not valid java name */
            public static int m1770compareToimpl(long arg0, @NotNull ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m1772boximpl(arg0).compareTo(other);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.lang.Comparable
            public int compareTo(@NotNull ComparableTimeMark other) {
                return ComparableTimeMark.DefaultImpls.compareTo(this, other);
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo1619plusLRDsOJo(long duration) {
                return m1772boximpl(m1759plusLRDsOJo(duration));
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: plus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo1619plusLRDsOJo(long duration) {
                return m1772boximpl(m1759plusLRDsOJo(duration));
            }

            @Override // kotlin.time.ComparableTimeMark, kotlin.time.TimeMark
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ ComparableTimeMark mo1621minusLRDsOJo(long duration) {
                return m1772boximpl(m1761minusLRDsOJo(duration));
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: minus-LRDsOJo */
            public /* bridge */ /* synthetic */ TimeMark mo1621minusLRDsOJo(long duration) {
                return m1772boximpl(m1761minusLRDsOJo(duration));
            }

            private /* synthetic */ ValueTimeMark(long reading) {
                this.reading = reading;
            }

            /* JADX INFO: renamed from: elapsedNow-UwyO8pc, reason: not valid java name */
            public static long m1757elapsedNowUwyO8pc(long arg0) {
                return MonotonicTimeSource.INSTANCE.m1745elapsedFrom6eNON_k(arg0);
            }

            @Override // kotlin.time.TimeMark
            /* JADX INFO: renamed from: elapsedNow-UwyO8pc */
            public long mo1618elapsedNowUwyO8pc() {
                return m1757elapsedNowUwyO8pc(this.reading);
            }

            /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
            public static long m1758plusLRDsOJo(long arg0, long duration) {
                return MonotonicTimeSource.INSTANCE.m1747adjustReading6QKq23U(arg0, duration);
            }

            /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
            public long m1759plusLRDsOJo(long duration) {
                return m1758plusLRDsOJo(this.reading, duration);
            }

            /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
            public static long m1760minusLRDsOJo(long arg0, long duration) {
                return MonotonicTimeSource.INSTANCE.m1747adjustReading6QKq23U(arg0, Duration.m1632unaryMinusUwyO8pc(duration));
            }

            /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
            public long m1761minusLRDsOJo(long duration) {
                return m1760minusLRDsOJo(this.reading, duration);
            }

            /* JADX INFO: renamed from: hasPassedNow-impl, reason: not valid java name */
            public static boolean m1762hasPassedNowimpl(long arg0) {
                return !Duration.m1642isNegativeimpl(m1757elapsedNowUwyO8pc(arg0));
            }

            @Override // kotlin.time.TimeMark
            public boolean hasPassedNow() {
                return m1762hasPassedNowimpl(this.reading);
            }

            /* JADX INFO: renamed from: hasNotPassedNow-impl, reason: not valid java name */
            public static boolean m1763hasNotPassedNowimpl(long arg0) {
                return Duration.m1642isNegativeimpl(m1757elapsedNowUwyO8pc(arg0));
            }

            @Override // kotlin.time.TimeMark
            public boolean hasNotPassedNow() {
                return m1763hasNotPassedNowimpl(this.reading);
            }

            @Override // kotlin.time.ComparableTimeMark
            /* JADX INFO: renamed from: minus-UwyO8pc */
            public long mo1620minusUwyO8pc(@NotNull ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return m1764minusUwyO8pc(this.reading, other);
            }

            /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
            public static long m1764minusUwyO8pc(long arg0, @NotNull ComparableTimeMark other) {
                Intrinsics.checkNotNullParameter(other, "other");
                if (!(other instanceof ValueTimeMark)) {
                    throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) m1767toStringimpl(arg0)) + " and " + other);
                }
                return m1765minus6eNON_k(arg0, ((ValueTimeMark) other).m1773unboximpl());
            }

            /* JADX INFO: renamed from: minus-6eNON_k, reason: not valid java name */
            public static final long m1765minus6eNON_k(long arg0, long other) {
                return MonotonicTimeSource.INSTANCE.m1746differenceBetweenfRLX17w(arg0, other);
            }

            /* JADX INFO: renamed from: compareTo-6eNON_k, reason: not valid java name */
            public static final int m1766compareTo6eNON_k(long arg0, long other) {
                return Duration.m1647compareToLRDsOJo(m1765minus6eNON_k(arg0, other), Duration.Companion.m1679getZEROUwyO8pc());
            }
        }
    }

    /* JADX INFO: compiled from: TimeSource.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/TimeSource$Companion.class */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
