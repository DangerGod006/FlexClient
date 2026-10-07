package kotlin;

import kotlin.internal.InlineOnly;

/* JADX INFO: compiled from: UInt.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/UIntKt.class */
public final class UIntKt {
    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int toUInt(byte $this$toUInt) {
        return UInt.m326constructorimpl($this$toUInt);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int toUInt(short $this$toUInt) {
        return UInt.m326constructorimpl($this$toUInt);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int toUInt(int $this$toUInt) {
        return UInt.m326constructorimpl($this$toUInt);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int toUInt(long $this$toUInt) {
        return UInt.m326constructorimpl((int) $this$toUInt);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int toUInt(float $this$toUInt) {
        return UnsignedKt.doubleToUInt($this$toUInt);
    }

    @SinceKotlin(version = "1.5")
    @InlineOnly
    private static final int toUInt(double $this$toUInt) {
        return UnsignedKt.doubleToUInt($this$toUInt);
    }
}
