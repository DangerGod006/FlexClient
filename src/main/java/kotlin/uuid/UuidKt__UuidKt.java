package kotlin.uuid;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.HexExtensionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Uuid.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/uuid/UuidKt__UuidKt.class */
class UuidKt__UuidKt extends UuidKt__UuidJVMKt {
    @ExperimentalUuidApi
    @NotNull
    public static final Uuid uuidFromRandomBytes(@NotNull byte[] randomBytes) {
        Intrinsics.checkNotNullParameter(randomBytes, "randomBytes");
        randomBytes[6] = (byte) (randomBytes[6] & 15);
        randomBytes[6] = (byte) (randomBytes[6] | 64);
        randomBytes[8] = (byte) (randomBytes[8] & 63);
        randomBytes[8] = (byte) (randomBytes[8] | 128);
        return Uuid.Companion.fromByteArray(randomBytes);
    }

    public static final long getLongAtCommonImpl(@NotNull byte[] $this$getLongAtCommonImpl, int index) {
        Intrinsics.checkNotNullParameter($this$getLongAtCommonImpl, "<this>");
        return ((((long) $this$getLongAtCommonImpl[index + 0]) & 255) << 56) | ((((long) $this$getLongAtCommonImpl[index + 1]) & 255) << 48) | ((((long) $this$getLongAtCommonImpl[index + 2]) & 255) << 40) | ((((long) $this$getLongAtCommonImpl[index + 3]) & 255) << 32) | ((((long) $this$getLongAtCommonImpl[index + 4]) & 255) << 24) | ((((long) $this$getLongAtCommonImpl[index + 5]) & 255) << 16) | ((((long) $this$getLongAtCommonImpl[index + 6]) & 255) << 8) | (((long) $this$getLongAtCommonImpl[index + 7]) & 255);
    }

    @ExperimentalUuidApi
    public static final void formatBytesIntoCommonImpl(long $this$formatBytesIntoCommonImpl, @NotNull byte[] dst, int dstOffset, int startIndex, int endIndex) {
        Intrinsics.checkNotNullParameter(dst, "dst");
        int dstIndex = dstOffset;
        int reversedIndex = 7 - startIndex;
        int i = 8 - endIndex;
        if (i > reversedIndex) {
            return;
        }
        while (true) {
            int shift = reversedIndex << 3;
            int byteDigits = HexExtensionsKt.getBYTE_TO_LOWER_CASE_HEX_DIGITS()[(int) (($this$formatBytesIntoCommonImpl >> shift) & 255)];
            int i2 = dstIndex;
            int dstIndex2 = dstIndex + 1;
            dst[i2] = (byte) (byteDigits >> 8);
            dstIndex = dstIndex2 + 1;
            dst[dstIndex2] = (byte) byteDigits;
            if (reversedIndex == i) {
                return;
            } else {
                reversedIndex--;
            }
        }
    }

    public static final void checkHyphenAt(@NotNull String $this$checkHyphenAt, int index) {
        Intrinsics.checkNotNullParameter($this$checkHyphenAt, "<this>");
        if (!($this$checkHyphenAt.charAt(index) == '-')) {
            throw new IllegalArgumentException(("Expected '-' (hyphen) at index " + index + ", but was '" + $this$checkHyphenAt.charAt(index) + '\'').toString());
        }
    }

    public static final void setLongAtCommonImpl(@NotNull byte[] $this$setLongAtCommonImpl, int index, long value) {
        Intrinsics.checkNotNullParameter($this$setLongAtCommonImpl, "<this>");
        int i = index;
        for (int reversedIndex = 7; -1 < reversedIndex; reversedIndex--) {
            int shift = reversedIndex << 3;
            int i2 = i;
            i++;
            $this$setLongAtCommonImpl[i2] = (byte) (value >> shift);
        }
    }

    @ExperimentalUuidApi
    @NotNull
    public static final Uuid uuidParseHexDashCommonImpl(@NotNull String hexDashString) {
        Intrinsics.checkNotNullParameter(hexDashString, "hexDashString");
        long part1 = HexExtensionsKt.hexToLong$default(hexDashString, 0, 8, null, 4, null);
        UuidKt.checkHyphenAt(hexDashString, 8);
        long part2 = HexExtensionsKt.hexToLong$default(hexDashString, 9, 13, null, 4, null);
        UuidKt.checkHyphenAt(hexDashString, 13);
        long part3 = HexExtensionsKt.hexToLong$default(hexDashString, 14, 18, null, 4, null);
        UuidKt.checkHyphenAt(hexDashString, 18);
        long part4 = HexExtensionsKt.hexToLong$default(hexDashString, 19, 23, null, 4, null);
        UuidKt.checkHyphenAt(hexDashString, 23);
        long part5 = HexExtensionsKt.hexToLong$default(hexDashString, 24, 36, null, 4, null);
        long msb = (part1 << 32) | (part2 << 16) | part3;
        long lsb = (part4 << 48) | part5;
        return Uuid.Companion.fromLongs(msb, lsb);
    }

    @ExperimentalUuidApi
    @NotNull
    public static final Uuid uuidParseHexCommonImpl(@NotNull String hexString) {
        Intrinsics.checkNotNullParameter(hexString, "hexString");
        long msb = HexExtensionsKt.hexToLong$default(hexString, 0, 16, null, 4, null);
        long lsb = HexExtensionsKt.hexToLong$default(hexString, 16, 32, null, 4, null);
        return Uuid.Companion.fromLongs(msb, lsb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String truncateForErrorMessage$UuidKt__UuidKt(String $this$truncateForErrorMessage, int maxLength) {
        if ($this$truncateForErrorMessage.length() <= maxLength) {
            return $this$truncateForErrorMessage;
        }
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNull($this$truncateForErrorMessage, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = $this$truncateForErrorMessage.substring(0, maxLength);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return sb.append(strSubstring).append("...").toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String truncateForErrorMessage$UuidKt__UuidKt(byte[] $this$truncateForErrorMessage, int maxSize) {
        return ArraysKt.joinToString$default($this$truncateForErrorMessage, (CharSequence) null, (CharSequence) "[", (CharSequence) "]", maxSize, (CharSequence) null, (Function1) null, 49, (Object) null);
    }
}
