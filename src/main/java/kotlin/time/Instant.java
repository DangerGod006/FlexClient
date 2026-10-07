package kotlin.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.NotImplementedError;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Instant.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/Instant.class */
@SinceKotlin(version = "2.1")
@ExperimentalTime
public final class Instant implements Comparable<Instant>, Serializable {
    private final long epochSeconds;
    private final int nanosecondsOfSecond;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Instant MIN = new Instant(-31557014167219200L, 0);

    @NotNull
    private static final Instant MAX = new Instant(31556889864403199L, 999999999);

    public Instant(long epochSeconds, int nanosecondsOfSecond) {
        this.epochSeconds = epochSeconds;
        this.nanosecondsOfSecond = nanosecondsOfSecond;
        long j = this.epochSeconds;
        boolean z = -31557014167219200L <= j && j < 31556889864403200L;
        if (z) {
        } else {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant".toString());
        }
    }

    public final long getEpochSeconds() {
        return this.epochSeconds;
    }

    public final int getNanosecondsOfSecond() {
        return this.nanosecondsOfSecond;
    }

    public final long toEpochMilliseconds() {
        long j;
        long j2;
        if (this.epochSeconds >= 0) {
            long a$iv = this.epochSeconds;
            if (1000 == 1) {
                j2 = a$iv;
            } else if (a$iv == 1) {
                j2 = 1000;
            } else if (a$iv == 0 || 1000 == 0) {
                j2 = 0;
            } else {
                long total$iv = a$iv * 1000;
                if (total$iv / 1000 != a$iv || ((a$iv == Long.MIN_VALUE && 1000 == -1) || (1000 == Long.MIN_VALUE && a$iv == -1))) {
                    return LongCompanionObject.MAX_VALUE;
                }
                j2 = total$iv;
            }
            long millis = j2;
            long b$iv = this.nanosecondsOfSecond / DurationKt.NANOS_IN_MILLIS;
            long sum$iv = millis + b$iv;
            if ((millis ^ sum$iv) < 0 && (millis ^ b$iv) >= 0) {
                return LongCompanionObject.MAX_VALUE;
            }
            return sum$iv;
        }
        long a$iv2 = this.epochSeconds + 1;
        if (1000 == 1) {
            j = a$iv2;
        } else if (a$iv2 == 1) {
            j = 1000;
        } else if (a$iv2 == 0 || 1000 == 0) {
            j = 0;
        } else {
            long total$iv2 = a$iv2 * 1000;
            if (total$iv2 / 1000 != a$iv2 || ((a$iv2 == Long.MIN_VALUE && 1000 == -1) || (1000 == Long.MIN_VALUE && a$iv2 == -1))) {
                return Long.MIN_VALUE;
            }
            j = total$iv2;
        }
        long millis2 = j;
        long b$iv2 = (this.nanosecondsOfSecond / DurationKt.NANOS_IN_MILLIS) - 1000;
        long sum$iv2 = millis2 + b$iv2;
        if ((millis2 ^ sum$iv2) < 0 && (millis2 ^ b$iv2) >= 0) {
            return Long.MIN_VALUE;
        }
        return sum$iv2;
    }

    @NotNull
    /* JADX INFO: renamed from: plus-LRDsOJo, reason: not valid java name */
    public final Instant m1734plusLRDsOJo(long duration) {
        long secondsToAdd = Duration.m1663getInWholeSecondsimpl(duration);
        int nanosecondsToAdd = Duration.m1656getNanosecondsComponentimpl(duration);
        if (secondsToAdd == 0 && nanosecondsToAdd == 0) {
            return this;
        }
        long a$iv = this.epochSeconds;
        long sum$iv = a$iv + secondsToAdd;
        if ((a$iv ^ sum$iv) < 0 && (a$iv ^ secondsToAdd) >= 0) {
            return Duration.m1643isPositiveimpl(duration) ? MAX : MIN;
        }
        int nanoAdjustment = this.nanosecondsOfSecond + nanosecondsToAdd;
        return Companion.fromEpochSeconds(sum$iv, nanoAdjustment);
    }

    @NotNull
    /* JADX INFO: renamed from: minus-LRDsOJo, reason: not valid java name */
    public final Instant m1735minusLRDsOJo(long duration) {
        return m1734plusLRDsOJo(Duration.m1632unaryMinusUwyO8pc(duration));
    }

    /* JADX INFO: renamed from: minus-UwyO8pc, reason: not valid java name */
    public final long m1736minusUwyO8pc(@NotNull Instant other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Duration.Companion companion = Duration.Companion;
        long duration = DurationKt.toDuration(this.epochSeconds - other.epochSeconds, DurationUnit.SECONDS);
        Duration.Companion companion2 = Duration.Companion;
        return Duration.m1633plusLRDsOJo(duration, DurationKt.toDuration(this.nanosecondsOfSecond - other.nanosecondsOfSecond, DurationUnit.NANOSECONDS));
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Instant other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int s = Intrinsics.compare(this.epochSeconds, other.epochSeconds);
        if (s != 0) {
            return s;
        }
        return Intrinsics.compare(this.nanosecondsOfSecond, other.nanosecondsOfSecond);
    }

    public boolean equals(@Nullable Object other) {
        return this == other || ((other instanceof Instant) && this.epochSeconds == ((Instant) other).epochSeconds && this.nanosecondsOfSecond == ((Instant) other).nanosecondsOfSecond);
    }

    public int hashCode() {
        return Long.hashCode(this.epochSeconds) + (51 * this.nanosecondsOfSecond);
    }

    @NotNull
    public String toString() {
        return InstantKt.formatIso(this);
    }

    private final Object writeReplace() {
        return InstantJvmKt.serializedInstant(this);
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    /* JADX INFO: compiled from: Instant.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/time/Instant$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        @Deprecated(message = "Use Clock.System.now() instead", replaceWith = @ReplaceWith(expression = "Clock.System.now()", imports = {"kotlin.time.Clock"}), level = DeprecationLevel.ERROR)
        @NotNull
        public final Instant now() {
            throw new NotImplementedError(null, 1, null);
        }

        @NotNull
        public final Instant fromEpochMilliseconds(long epochMilliseconds) {
            long j = epochMilliseconds / 1000;
            if ((epochMilliseconds ^ 1000) < 0 && j * 1000 != epochMilliseconds) {
                j--;
            }
            long epochSeconds = j;
            long j2 = epochMilliseconds % 1000;
            int nanosecondsOfSecond = (int) ((j2 + (1000 & (((j2 ^ 1000) & (j2 | (-j2))) >> 63))) * ((long) DurationKt.NANOS_IN_MILLIS));
            return epochSeconds < -31557014167219200L ? getMIN$kotlin_stdlib() : epochSeconds > 31556889864403199L ? getMAX$kotlin_stdlib() : fromEpochSeconds(epochSeconds, nanosecondsOfSecond);
        }

        public static /* synthetic */ Instant fromEpochSeconds$default(Companion companion, long j, long j2, int i, Object obj) {
            if ((i & 2) != 0) {
                j2 = 0;
            }
            return companion.fromEpochSeconds(j, j2);
        }

        @NotNull
        public final Instant fromEpochSeconds(long epochSeconds, long nanosecondAdjustment) {
            long j = nanosecondAdjustment / 1000000000;
            if ((nanosecondAdjustment ^ 1000000000) < 0 && j * 1000000000 != nanosecondAdjustment) {
                j--;
            }
            long b$iv = j;
            long sum$iv = epochSeconds + b$iv;
            if ((epochSeconds ^ sum$iv) < 0 && (epochSeconds ^ b$iv) >= 0) {
                return epochSeconds > 0 ? Instant.Companion.getMAX$kotlin_stdlib() : Instant.Companion.getMIN$kotlin_stdlib();
            }
            if (sum$iv < -31557014167219200L) {
                return getMIN$kotlin_stdlib();
            }
            if (sum$iv > 31556889864403199L) {
                return getMAX$kotlin_stdlib();
            }
            long j2 = nanosecondAdjustment % 1000000000;
            int nanoseconds = (int) (j2 + (1000000000 & (((j2 ^ 1000000000) & (j2 | (-j2))) >> 63)));
            return new Instant(sum$iv, nanoseconds);
        }

        @NotNull
        public final Instant fromEpochSeconds(long epochSeconds, int nanosecondAdjustment) {
            return fromEpochSeconds(epochSeconds, nanosecondAdjustment);
        }

        @NotNull
        public final Instant parse(@NotNull CharSequence input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return InstantKt.parseIso(input).toInstant();
        }

        @SinceKotlin(version = "2.2")
        @Nullable
        public final Instant parseOrNull(@NotNull CharSequence input) {
            Intrinsics.checkNotNullParameter(input, "input");
            return InstantKt.parseIso(input).toInstantOrNull();
        }

        @NotNull
        public final Instant getDISTANT_PAST() {
            return fromEpochSeconds(-3217862419201L, 999999999);
        }

        @NotNull
        public final Instant getDISTANT_FUTURE() {
            return fromEpochSeconds(3093527980800L, 0);
        }

        @NotNull
        public final Instant getMIN$kotlin_stdlib() {
            return Instant.MIN;
        }

        @NotNull
        public final Instant getMAX$kotlin_stdlib() {
            return Instant.MAX;
        }
    }
}
