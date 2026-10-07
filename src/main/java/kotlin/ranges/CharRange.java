package kotlin.ranges;

import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PrimitiveRanges.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/CharRange.class */
public final class CharRange extends CharProgression implements ClosedRange<Character>, OpenEndRange<Character> {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final CharRange EMPTY = new CharRange(1, 0);

    @Deprecated(message = "Can throw an exception when it's impossible to represent the value with Char type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    @SinceKotlin(version = "1.9")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static /* synthetic */ void getEndExclusive$annotations() {
    }

    public CharRange(char start, char endInclusive) {
        super(start, endInclusive, 1);
    }

    @Override // kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public /* bridge */ /* synthetic */ boolean contains(Comparable value) {
        return contains(((Character) value).charValue());
    }

    @Override // kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    @NotNull
    public Character getStart() {
        return Character.valueOf(getFirst());
    }

    @Override // kotlin.ranges.ClosedRange
    @NotNull
    public Character getEndInclusive() {
        return Character.valueOf(getLast());
    }

    @Override // kotlin.ranges.OpenEndRange
    @NotNull
    public Character getEndExclusive() {
        if (getLast() == 65535) {
            throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString());
        }
        return Character.valueOf((char) (getLast() + 1));
    }

    public boolean contains(char value) {
        return Intrinsics.compare((int) getFirst(), (int) value) <= 0 && Intrinsics.compare((int) value, (int) getLast()) <= 0;
    }

    @Override // kotlin.ranges.CharProgression, kotlin.ranges.ClosedRange, kotlin.ranges.OpenEndRange
    public boolean isEmpty() {
        return Intrinsics.compare((int) getFirst(), (int) getLast()) > 0;
    }

    @Override // kotlin.ranges.CharProgression
    public boolean equals(@Nullable Object other) {
        return (other instanceof CharRange) && ((isEmpty() && ((CharRange) other).isEmpty()) || (getFirst() == ((CharRange) other).getFirst() && getLast() == ((CharRange) other).getLast()));
    }

    @Override // kotlin.ranges.CharProgression
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (31 * getFirst()) + getLast();
    }

    @Override // kotlin.ranges.CharProgression
    @NotNull
    public String toString() {
        return getFirst() + ".." + getLast();
    }

    /* JADX INFO: compiled from: PrimitiveRanges.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/ranges/CharRange$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final CharRange getEMPTY() {
            return CharRange.EMPTY;
        }
    }
}
