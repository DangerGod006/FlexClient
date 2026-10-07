package kotlin.experimental;

import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;

/* JADX INFO: compiled from: bitwiseOperations.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/experimental/BitwiseOperationsKt.class */
public final class BitwiseOperationsKt {
    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte and(byte $this$and, byte other) {
        return (byte) ($this$and & other);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte or(byte $this$or, byte other) {
        return (byte) ($this$or | other);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte xor(byte $this$xor, byte other) {
        return (byte) ($this$xor ^ other);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final byte inv(byte $this$inv) {
        return (byte) ($this$inv ^ (-1));
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short and(short $this$and, short other) {
        return (short) ($this$and & other);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short or(short $this$or, short other) {
        return (short) ($this$or | other);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short xor(short $this$xor, short other) {
        return (short) ($this$xor ^ other);
    }

    @SinceKotlin(version = "1.1")
    @InlineOnly
    private static final short inv(short $this$inv) {
        return (short) ($this$inv ^ (-1));
    }
}
