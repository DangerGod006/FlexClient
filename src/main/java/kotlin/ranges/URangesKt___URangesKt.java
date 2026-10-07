package kotlin.ranges;

import java.util.NoSuchElementException;
import kotlin.KotlinVersion;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.random.URandomKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _URanges.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/URangesKt___URangesKt.class */
public class URangesKt___URangesKt {
    @SinceKotlin(version = "1.7")
    public static final int first(@NotNull UIntProgression $this$first) {
        Intrinsics.checkNotNullParameter($this$first, "<this>");
        if ($this$first.isEmpty()) {
            throw new NoSuchElementException("Progression " + $this$first + " is empty.");
        }
        return $this$first.m1492getFirstpVg5ArA();
    }

    @SinceKotlin(version = "1.7")
    public static final long first(@NotNull ULongProgression $this$first) {
        Intrinsics.checkNotNullParameter($this$first, "<this>");
        if ($this$first.isEmpty()) {
            throw new NoSuchElementException("Progression " + $this$first + " is empty.");
        }
        return $this$first.m1503getFirstsVKNKU();
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final UInt firstOrNull(@NotNull UIntProgression $this$firstOrNull) {
        Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
        if ($this$firstOrNull.isEmpty()) {
            return null;
        }
        return UInt.m327boximpl($this$firstOrNull.m1492getFirstpVg5ArA());
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final ULong firstOrNull(@NotNull ULongProgression $this$firstOrNull) {
        Intrinsics.checkNotNullParameter($this$firstOrNull, "<this>");
        if ($this$firstOrNull.isEmpty()) {
            return null;
        }
        return ULong.m407boximpl($this$firstOrNull.m1503getFirstsVKNKU());
    }

    @SinceKotlin(version = "1.7")
    public static final int last(@NotNull UIntProgression $this$last) {
        Intrinsics.checkNotNullParameter($this$last, "<this>");
        if ($this$last.isEmpty()) {
            throw new NoSuchElementException("Progression " + $this$last + " is empty.");
        }
        return $this$last.m1493getLastpVg5ArA();
    }

    @SinceKotlin(version = "1.7")
    public static final long last(@NotNull ULongProgression $this$last) {
        Intrinsics.checkNotNullParameter($this$last, "<this>");
        if ($this$last.isEmpty()) {
            throw new NoSuchElementException("Progression " + $this$last + " is empty.");
        }
        return $this$last.m1504getLastsVKNKU();
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final UInt lastOrNull(@NotNull UIntProgression $this$lastOrNull) {
        Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
        if ($this$lastOrNull.isEmpty()) {
            return null;
        }
        return UInt.m327boximpl($this$lastOrNull.m1493getLastpVg5ArA());
    }

    @SinceKotlin(version = "1.7")
    @Nullable
    public static final ULong lastOrNull(@NotNull ULongProgression $this$lastOrNull) {
        Intrinsics.checkNotNullParameter($this$lastOrNull, "<this>");
        if ($this$lastOrNull.isEmpty()) {
            return null;
        }
        return ULong.m407boximpl($this$lastOrNull.m1504getLastsVKNKU());
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int random(UIntRange $this$random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        return URangesKt.random($this$random, Random.Default);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final long random(ULongRange $this$random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        return URangesKt.random($this$random, Random.Default);
    }

    @SinceKotlin(version = "1.5")
    public static final int random(@NotNull UIntRange $this$random, @NotNull Random random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return URandomKt.nextUInt(random, $this$random);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @SinceKotlin(version = "1.5")
    public static final long random(@NotNull ULongRange $this$random, @NotNull Random random) {
        Intrinsics.checkNotNullParameter($this$random, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            return URandomKt.nextULong(random, $this$random);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final UInt randomOrNull(UIntRange $this$randomOrNull) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        return URangesKt.randomOrNull($this$randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final ULong randomOrNull(ULongRange $this$randomOrNull) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        return URangesKt.randomOrNull($this$randomOrNull, Random.Default);
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final UInt randomOrNull(@NotNull UIntRange $this$randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if ($this$randomOrNull.isEmpty()) {
            return null;
        }
        return UInt.m327boximpl(URandomKt.nextUInt(random, $this$randomOrNull));
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final ULong randomOrNull(@NotNull ULongRange $this$randomOrNull, @NotNull Random random) {
        Intrinsics.checkNotNullParameter($this$randomOrNull, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        if ($this$randomOrNull.isEmpty()) {
            return null;
        }
        return ULong.m407boximpl(URandomKt.nextULong(random, $this$randomOrNull));
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: contains-biwQdVI, reason: not valid java name */
    private static final boolean m1514containsbiwQdVI(UIntRange contains, UInt element) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return element != null && contains.m1501containsWZ4Q5Ns(element.m328unboximpl());
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    /* JADX INFO: renamed from: contains-GYNo2lE, reason: not valid java name */
    private static final boolean m1515containsGYNo2lE(ULongRange contains, ULong element) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return element != null && contains.m1512containsVKZWuLQ(element.m408unboximpl());
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: contains-68kG9v0, reason: not valid java name */
    public static final boolean m1516contains68kG9v0(@NotNull UIntRange contains, byte value) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1501containsWZ4Q5Ns(UInt.m326constructorimpl(value & 255));
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: contains-ULb-yJY, reason: not valid java name */
    public static final boolean m1517containsULbyJY(@NotNull ULongRange contains, byte value) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1512containsVKZWuLQ(ULong.m406constructorimpl(((long) value) & 255));
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: contains-Gab390E, reason: not valid java name */
    public static final boolean m1518containsGab390E(@NotNull ULongRange contains, int value) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1512containsVKZWuLQ(ULong.m406constructorimpl(((long) value) & 4294967295L));
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: contains-fz5IDCE, reason: not valid java name */
    public static final boolean m1519containsfz5IDCE(@NotNull UIntRange contains, long value) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return ULong.m406constructorimpl(value >>> 32) == 0 && contains.m1501containsWZ4Q5Ns(UInt.m326constructorimpl((int) value));
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: contains-ZsK3CEQ, reason: not valid java name */
    public static final boolean m1520containsZsK3CEQ(@NotNull UIntRange contains, short value) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1501containsWZ4Q5Ns(UInt.m326constructorimpl(value & 65535));
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: contains-uhHAxoY, reason: not valid java name */
    public static final boolean m1521containsuhHAxoY(@NotNull ULongRange contains, short value) {
        Intrinsics.checkNotNullParameter(contains, "$this$contains");
        return contains.m1512containsVKZWuLQ(ULong.m406constructorimpl(((long) value) & 65535));
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* JADX INFO: renamed from: downTo-Kr8caGY, reason: not valid java name */
    public static final UIntProgression m1522downToKr8caGY(byte $this$downTo_u2dKr8caGY, byte to) {
        return UIntProgression.Companion.m1495fromClosedRangeNkh28Cs(UInt.m326constructorimpl($this$downTo_u2dKr8caGY & 255), UInt.m326constructorimpl(to & 255), -1);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* JADX INFO: renamed from: downTo-J1ME1BU, reason: not valid java name */
    public static final UIntProgression m1523downToJ1ME1BU(int $this$downTo_u2dJ1ME1BU, int to) {
        return UIntProgression.Companion.m1495fromClosedRangeNkh28Cs($this$downTo_u2dJ1ME1BU, to, -1);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* JADX INFO: renamed from: downTo-eb3DHEI, reason: not valid java name */
    public static final ULongProgression m1524downToeb3DHEI(long $this$downTo_u2deb3DHEI, long to) {
        return ULongProgression.Companion.m1506fromClosedRange7ftBX0g($this$downTo_u2deb3DHEI, to, -1L);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* JADX INFO: renamed from: downTo-5PvTz6A, reason: not valid java name */
    public static final UIntProgression m1525downTo5PvTz6A(short $this$downTo_u2d5PvTz6A, short to) {
        return UIntProgression.Companion.m1495fromClosedRangeNkh28Cs(UInt.m326constructorimpl($this$downTo_u2d5PvTz6A & 65535), UInt.m326constructorimpl(to & 65535), -1);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static final UIntProgression reversed(@NotNull UIntProgression $this$reversed) {
        Intrinsics.checkNotNullParameter($this$reversed, "<this>");
        return UIntProgression.Companion.m1495fromClosedRangeNkh28Cs($this$reversed.m1493getLastpVg5ArA(), $this$reversed.m1492getFirstpVg5ArA(), -$this$reversed.getStep());
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static final ULongProgression reversed(@NotNull ULongProgression $this$reversed) {
        Intrinsics.checkNotNullParameter($this$reversed, "<this>");
        return ULongProgression.Companion.m1506fromClosedRange7ftBX0g($this$reversed.m1504getLastsVKNKU(), $this$reversed.m1503getFirstsVKNKU(), -$this$reversed.getStep());
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static final UIntProgression step(@NotNull UIntProgression $this$step, int step) {
        Intrinsics.checkNotNullParameter($this$step, "<this>");
        RangesKt.checkStepIsPositive(step > 0, Integer.valueOf(step));
        return UIntProgression.Companion.m1495fromClosedRangeNkh28Cs($this$step.m1492getFirstpVg5ArA(), $this$step.m1493getLastpVg5ArA(), $this$step.getStep() > 0 ? step : -step);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static final ULongProgression step(@NotNull ULongProgression $this$step, long step) {
        Intrinsics.checkNotNullParameter($this$step, "<this>");
        RangesKt.checkStepIsPositive(step > 0, Long.valueOf(step));
        return ULongProgression.Companion.m1506fromClosedRange7ftBX0g($this$step.m1503getFirstsVKNKU(), $this$step.m1504getLastsVKNKU(), $this$step.getStep() > 0 ? step : -step);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* JADX INFO: renamed from: until-Kr8caGY, reason: not valid java name */
    public static final UIntRange m1526untilKr8caGY(byte $this$until_u2dKr8caGY, byte to) {
        return Intrinsics.compare(to & 255, 0 & KotlinVersion.MAX_COMPONENT_VALUE) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(UInt.m326constructorimpl($this$until_u2dKr8caGY & 255), UInt.m326constructorimpl(UInt.m326constructorimpl(to & 255) - 1), null);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* JADX INFO: renamed from: until-J1ME1BU, reason: not valid java name */
    public static final UIntRange m1527untilJ1ME1BU(int $this$until_u2dJ1ME1BU, int to) {
        return Integer.compareUnsigned(to, 0) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange($this$until_u2dJ1ME1BU, UInt.m326constructorimpl(to - 1), null);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* JADX INFO: renamed from: until-eb3DHEI, reason: not valid java name */
    public static final ULongRange m1528untileb3DHEI(long $this$until_u2deb3DHEI, long to) {
        return Long.compareUnsigned(to, 0L) <= 0 ? ULongRange.Companion.getEMPTY() : new ULongRange($this$until_u2deb3DHEI, ULong.m406constructorimpl(to - ULong.m406constructorimpl(((long) 1) & 4294967295L)), null);
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    /* JADX INFO: renamed from: until-5PvTz6A, reason: not valid java name */
    public static final UIntRange m1529until5PvTz6A(short $this$until_u2d5PvTz6A, short to) {
        return Intrinsics.compare(to & 65535, 0 & CharCompanionObject.MAX_VALUE) <= 0 ? UIntRange.Companion.getEMPTY() : new UIntRange(UInt.m326constructorimpl($this$until_u2d5PvTz6A & 65535), UInt.m326constructorimpl(UInt.m326constructorimpl(to & 65535) - 1), null);
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: coerceAtLeast-J1ME1BU, reason: not valid java name */
    public static final int m1530coerceAtLeastJ1ME1BU(int $this$coerceAtLeast_u2dJ1ME1BU, int minimumValue) {
        return Integer.compareUnsigned($this$coerceAtLeast_u2dJ1ME1BU, minimumValue) < 0 ? minimumValue : $this$coerceAtLeast_u2dJ1ME1BU;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: coerceAtLeast-eb3DHEI, reason: not valid java name */
    public static final long m1531coerceAtLeasteb3DHEI(long $this$coerceAtLeast_u2deb3DHEI, long minimumValue) {
        return Long.compareUnsigned($this$coerceAtLeast_u2deb3DHEI, minimumValue) < 0 ? minimumValue : $this$coerceAtLeast_u2deb3DHEI;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: coerceAtLeast-Kr8caGY, reason: not valid java name */
    public static final byte m1532coerceAtLeastKr8caGY(byte $this$coerceAtLeast_u2dKr8caGY, byte minimumValue) {
        return Intrinsics.compare($this$coerceAtLeast_u2dKr8caGY & 255, minimumValue & 255) < 0 ? minimumValue : $this$coerceAtLeast_u2dKr8caGY;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: coerceAtLeast-5PvTz6A, reason: not valid java name */
    public static final short m1533coerceAtLeast5PvTz6A(short $this$coerceAtLeast_u2d5PvTz6A, short minimumValue) {
        return Intrinsics.compare($this$coerceAtLeast_u2d5PvTz6A & 65535, minimumValue & 65535) < 0 ? minimumValue : $this$coerceAtLeast_u2d5PvTz6A;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: coerceAtMost-J1ME1BU, reason: not valid java name */
    public static final int m1534coerceAtMostJ1ME1BU(int $this$coerceAtMost_u2dJ1ME1BU, int maximumValue) {
        return Integer.compareUnsigned($this$coerceAtMost_u2dJ1ME1BU, maximumValue) > 0 ? maximumValue : $this$coerceAtMost_u2dJ1ME1BU;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: coerceAtMost-eb3DHEI, reason: not valid java name */
    public static final long m1535coerceAtMosteb3DHEI(long $this$coerceAtMost_u2deb3DHEI, long maximumValue) {
        return Long.compareUnsigned($this$coerceAtMost_u2deb3DHEI, maximumValue) > 0 ? maximumValue : $this$coerceAtMost_u2deb3DHEI;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: coerceAtMost-Kr8caGY, reason: not valid java name */
    public static final byte m1536coerceAtMostKr8caGY(byte $this$coerceAtMost_u2dKr8caGY, byte maximumValue) {
        return Intrinsics.compare($this$coerceAtMost_u2dKr8caGY & 255, maximumValue & 255) > 0 ? maximumValue : $this$coerceAtMost_u2dKr8caGY;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: coerceAtMost-5PvTz6A, reason: not valid java name */
    public static final short m1537coerceAtMost5PvTz6A(short $this$coerceAtMost_u2d5PvTz6A, short maximumValue) {
        return Intrinsics.compare($this$coerceAtMost_u2d5PvTz6A & 65535, maximumValue & 65535) > 0 ? maximumValue : $this$coerceAtMost_u2d5PvTz6A;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: coerceIn-WZ9TVnA, reason: not valid java name */
    public static final int m1538coerceInWZ9TVnA(int $this$coerceIn_u2dWZ9TVnA, int minimumValue, int maximumValue) {
        if (Integer.compareUnsigned(minimumValue, maximumValue) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UInt.m323toStringimpl(maximumValue)) + " is less than minimum " + ((Object) UInt.m323toStringimpl(minimumValue)) + '.');
        }
        return Integer.compareUnsigned($this$coerceIn_u2dWZ9TVnA, minimumValue) < 0 ? minimumValue : Integer.compareUnsigned($this$coerceIn_u2dWZ9TVnA, maximumValue) > 0 ? maximumValue : $this$coerceIn_u2dWZ9TVnA;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: coerceIn-sambcqE, reason: not valid java name */
    public static final long m1539coerceInsambcqE(long $this$coerceIn_u2dsambcqE, long minimumValue, long maximumValue) {
        if (Long.compareUnsigned(minimumValue, maximumValue) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) ULong.m403toStringimpl(maximumValue)) + " is less than minimum " + ((Object) ULong.m403toStringimpl(minimumValue)) + '.');
        }
        return Long.compareUnsigned($this$coerceIn_u2dsambcqE, minimumValue) < 0 ? minimumValue : Long.compareUnsigned($this$coerceIn_u2dsambcqE, maximumValue) > 0 ? maximumValue : $this$coerceIn_u2dsambcqE;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: coerceIn-b33U2AM, reason: not valid java name */
    public static final byte m1540coerceInb33U2AM(byte $this$coerceIn_u2db33U2AM, byte minimumValue, byte maximumValue) {
        if (Intrinsics.compare(minimumValue & 255, maximumValue & 255) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UByte.m243toStringimpl(maximumValue)) + " is less than minimum " + ((Object) UByte.m243toStringimpl(minimumValue)) + '.');
        }
        return Intrinsics.compare($this$coerceIn_u2db33U2AM & 255, minimumValue & 255) < 0 ? minimumValue : Intrinsics.compare($this$coerceIn_u2db33U2AM & 255, maximumValue & 255) > 0 ? maximumValue : $this$coerceIn_u2db33U2AM;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: coerceIn-VKSA0NQ, reason: not valid java name */
    public static final short m1541coerceInVKSA0NQ(short $this$coerceIn_u2dVKSA0NQ, short minimumValue, short maximumValue) {
        if (Intrinsics.compare(minimumValue & 65535, maximumValue & 65535) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) UShort.m510toStringimpl(maximumValue)) + " is less than minimum " + ((Object) UShort.m510toStringimpl(minimumValue)) + '.');
        }
        return Intrinsics.compare($this$coerceIn_u2dVKSA0NQ & 65535, minimumValue & 65535) < 0 ? minimumValue : Intrinsics.compare($this$coerceIn_u2dVKSA0NQ & 65535, maximumValue & 65535) > 0 ? maximumValue : $this$coerceIn_u2dVKSA0NQ;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: coerceIn-wuiCnnA, reason: not valid java name */
    public static final int m1542coerceInwuiCnnA(int $this$coerceIn_u2dwuiCnnA, @NotNull ClosedRange<UInt> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((UInt) RangesKt.coerceIn(UInt.m327boximpl($this$coerceIn_u2dwuiCnnA), (ClosedFloatingPointRange<UInt>) range)).m328unboximpl();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return Integer.compareUnsigned($this$coerceIn_u2dwuiCnnA, ((UInt) range.getStart()).m328unboximpl()) < 0 ? ((UInt) range.getStart()).m328unboximpl() : Integer.compareUnsigned($this$coerceIn_u2dwuiCnnA, ((UInt) range.getEndInclusive()).m328unboximpl()) > 0 ? ((UInt) range.getEndInclusive()).m328unboximpl() : $this$coerceIn_u2dwuiCnnA;
    }

    @SinceKotlin(version = "1.5")
    /* JADX INFO: renamed from: coerceIn-JPwROB0, reason: not valid java name */
    public static final long m1543coerceInJPwROB0(long $this$coerceIn_u2dJPwROB0, @NotNull ClosedRange<ULong> range) {
        Intrinsics.checkNotNullParameter(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return ((ULong) RangesKt.coerceIn(ULong.m407boximpl($this$coerceIn_u2dJPwROB0), (ClosedFloatingPointRange<ULong>) range)).m408unboximpl();
        }
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + '.');
        }
        return Long.compareUnsigned($this$coerceIn_u2dJPwROB0, ((ULong) range.getStart()).m408unboximpl()) < 0 ? ((ULong) range.getStart()).m408unboximpl() : Long.compareUnsigned($this$coerceIn_u2dJPwROB0, ((ULong) range.getEndInclusive()).m408unboximpl()) > 0 ? ((ULong) range.getEndInclusive()).m408unboximpl() : $this$coerceIn_u2dJPwROB0;
    }
}
