package kotlin.text;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: Char.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/CharsKt__CharKt.class */
public class CharsKt__CharKt extends CharsKt__CharJVMKt {
    @SinceKotlin(version = "1.5")
    public static final int digitToInt(char $this$digitToInt) {
        int it = CharsKt.digitOf($this$digitToInt, 10);
        if (it < 0) {
            throw new IllegalArgumentException("Char " + $this$digitToInt + " is not a decimal digit");
        }
        return it;
    }

    @SinceKotlin(version = "1.5")
    public static final int digitToInt(char $this$digitToInt, int radix) {
        Integer numDigitToIntOrNull = CharsKt.digitToIntOrNull($this$digitToInt, radix);
        if (numDigitToIntOrNull != null) {
            return numDigitToIntOrNull.intValue();
        }
        throw new IllegalArgumentException("Char " + $this$digitToInt + " is not a digit in the given radix=" + radix);
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final Integer digitToIntOrNull(char $this$digitToIntOrNull) {
        Integer numValueOf = Integer.valueOf(CharsKt.digitOf($this$digitToIntOrNull, 10));
        int it = numValueOf.intValue();
        if (it >= 0) {
            return numValueOf;
        }
        return null;
    }

    @SinceKotlin(version = "1.5")
    @Nullable
    public static final Integer digitToIntOrNull(char $this$digitToIntOrNull, int radix) {
        CharsKt.checkRadix(radix);
        Integer numValueOf = Integer.valueOf(CharsKt.digitOf($this$digitToIntOrNull, radix));
        int it = numValueOf.intValue();
        if (it >= 0) {
            return numValueOf;
        }
        return null;
    }

    @SinceKotlin(version = "1.5")
    public static final char digitToChar(int $this$digitToChar) {
        boolean z = 0 <= $this$digitToChar && $this$digitToChar < 10;
        if (z) {
            return (char) (48 + $this$digitToChar);
        }
        throw new IllegalArgumentException("Int " + $this$digitToChar + " is not a decimal digit");
    }

    @SinceKotlin(version = "1.5")
    public static final char digitToChar(int $this$digitToChar, int radix) {
        boolean z = 2 <= radix && radix < 37;
        if (!z) {
            throw new IllegalArgumentException("Invalid radix: " + radix + ". Valid radix values are in range 2..36");
        }
        if ($this$digitToChar < 0 || $this$digitToChar >= radix) {
            throw new IllegalArgumentException("Digit " + $this$digitToChar + " does not represent a valid digit in radix " + radix);
        }
        if ($this$digitToChar < 10) {
            return (char) (48 + $this$digitToChar);
        }
        return (char) (((char) (65 + $this$digitToChar)) - '\n');
    }

    @SinceKotlin(version = "1.5")
    @NotNull
    public static final String titlecase(char $this$titlecase) {
        return _OneToManyTitlecaseMappingsKt.titlecaseImpl($this$titlecase);
    }

    @InlineOnly
    private static final String plus(char $this$plus, String other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return $this$plus + other;
    }

    public static /* synthetic */ boolean equals$default(char c, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return CharsKt.equals(c, c2, z);
    }

    public static final boolean equals(char $this$equals, char other, boolean ignoreCase) {
        if ($this$equals == other) {
            return true;
        }
        if (!ignoreCase) {
            return false;
        }
        char thisUpper = Character.toUpperCase($this$equals);
        char otherUpper = Character.toUpperCase(other);
        return thisUpper == otherUpper || Character.toLowerCase(thisUpper) == Character.toLowerCase(otherUpper);
    }

    public static final boolean isSurrogate(char $this$isSurrogate) {
        return 55296 <= $this$isSurrogate && $this$isSurrogate < 57344;
    }
}
