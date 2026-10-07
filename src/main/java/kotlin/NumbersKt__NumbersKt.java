package kotlin;

import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.CharCompanionObject;

/* JADX INFO: compiled from: Numbers.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/NumbersKt__NumbersKt.class */
class NumbersKt__NumbersKt extends NumbersKt__NumbersJVMKt {
    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countOneBits(byte $this$countOneBits) {
        return Integer.bitCount($this$countOneBits & 255);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countLeadingZeroBits(byte $this$countLeadingZeroBits) {
        return Integer.numberOfLeadingZeros($this$countLeadingZeroBits & 255) - 24;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countTrailingZeroBits(byte $this$countTrailingZeroBits) {
        return Integer.numberOfTrailingZeros($this$countTrailingZeroBits | 256);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final byte takeHighestOneBit(byte $this$takeHighestOneBit) {
        return (byte) Integer.highestOneBit($this$takeHighestOneBit & 255);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final byte takeLowestOneBit(byte $this$takeLowestOneBit) {
        return (byte) Integer.lowestOneBit($this$takeLowestOneBit);
    }

    @SinceKotlin(version = "1.6")
    public static final byte rotateLeft(byte $this$rotateLeft, int bitCount) {
        return (byte) (($this$rotateLeft << (bitCount & 7)) | (($this$rotateLeft & KotlinVersion.MAX_COMPONENT_VALUE) >>> (8 - (bitCount & 7))));
    }

    @SinceKotlin(version = "1.6")
    public static final byte rotateRight(byte $this$rotateRight, int bitCount) {
        return (byte) (($this$rotateRight << (8 - (bitCount & 7))) | (($this$rotateRight & KotlinVersion.MAX_COMPONENT_VALUE) >>> (bitCount & 7)));
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countOneBits(short $this$countOneBits) {
        return Integer.bitCount($this$countOneBits & 65535);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countLeadingZeroBits(short $this$countLeadingZeroBits) {
        return Integer.numberOfLeadingZeros($this$countLeadingZeroBits & 65535) - 16;
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final int countTrailingZeroBits(short $this$countTrailingZeroBits) {
        return Integer.numberOfTrailingZeros($this$countTrailingZeroBits | 65536);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final short takeHighestOneBit(short $this$takeHighestOneBit) {
        return (short) Integer.highestOneBit($this$takeHighestOneBit & 65535);
    }

    @SinceKotlin(version = "1.4")
    @InlineOnly
    private static final short takeLowestOneBit(short $this$takeLowestOneBit) {
        return (short) Integer.lowestOneBit($this$takeLowestOneBit);
    }

    @SinceKotlin(version = "1.6")
    public static final short rotateLeft(short $this$rotateLeft, int bitCount) {
        return (short) (($this$rotateLeft << (bitCount & 15)) | (($this$rotateLeft & CharCompanionObject.MAX_VALUE) >>> (16 - (bitCount & 15))));
    }

    @SinceKotlin(version = "1.6")
    public static final short rotateRight(short $this$rotateRight, int bitCount) {
        return (short) (($this$rotateRight << (16 - (bitCount & 15))) | (($this$rotateRight & CharCompanionObject.MAX_VALUE) >>> (bitCount & 15)));
    }
}
