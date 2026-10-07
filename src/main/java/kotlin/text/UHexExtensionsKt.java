package kotlin.text;

import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: UHexExtensions.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/text/UHexExtensionsKt.class */
public final class UHexExtensionsKt {
    /* JADX INFO: renamed from: toHexString-zHuV2wU$default, reason: not valid java name */
    static /* synthetic */ String m1603toHexStringzHuV2wU$default(byte[] toHexString, HexFormat format, int i, Object obj) {
        if ((i & 1) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(toHexString, format);
    }

    @SinceKotlin(version = "2.2")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* JADX INFO: renamed from: toHexString-zHuV2wU, reason: not valid java name */
    private static final String m1602toHexStringzHuV2wU(byte[] toHexString, HexFormat format) {
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(toHexString, format);
    }

    /* JADX INFO: renamed from: toHexString-lZCiFrA$default, reason: not valid java name */
    static /* synthetic */ String m1605toHexStringlZCiFrA$default(byte[] toHexString, int startIndex, int endIndex, HexFormat format, int i, Object obj) {
        if ((i & 1) != 0) {
            startIndex = 0;
        }
        if ((i & 2) != 0) {
            endIndex = UByteArray.m254getSizeimpl(toHexString);
        }
        if ((i & 4) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(toHexString, startIndex, endIndex, format);
    }

    @SinceKotlin(version = "2.2")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* JADX INFO: renamed from: toHexString-lZCiFrA, reason: not valid java name */
    private static final String m1604toHexStringlZCiFrA(byte[] toHexString, int startIndex, int endIndex, HexFormat format) {
        Intrinsics.checkNotNullParameter(toHexString, "$this$toHexString");
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString(toHexString, startIndex, endIndex, format);
    }

    static /* synthetic */ byte[] hexToUByteArray$default(String $this$hexToUByteArray_u24default, HexFormat format, int i, Object obj) {
        if ((i & 1) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter($this$hexToUByteArray_u24default, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByteArray.m264constructorimpl(HexExtensionsKt.hexToByteArray($this$hexToUByteArray_u24default, format));
    }

    @SinceKotlin(version = "2.2")
    @ExperimentalUnsignedTypes
    @InlineOnly
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    private static final byte[] hexToUByteArray(String $this$hexToUByteArray, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToUByteArray, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByteArray.m264constructorimpl(HexExtensionsKt.hexToByteArray($this$hexToUByteArray, format));
    }

    /* JADX INFO: renamed from: toHexString-ZQbaR00$default, reason: not valid java name */
    static /* synthetic */ String m1607toHexStringZQbaR00$default(byte $this$toHexString_u2dZQbaR00_u24default, HexFormat format, int i, Object obj) {
        if ((i & 1) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2dZQbaR00_u24default, format);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: toHexString-ZQbaR00, reason: not valid java name */
    private static final String m1606toHexStringZQbaR00(byte $this$toHexString_u2dZQbaR00, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2dZQbaR00, format);
    }

    static /* synthetic */ byte hexToUByte$default(String $this$hexToUByte_u24default, HexFormat format, int i, Object obj) {
        if ((i & 1) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter($this$hexToUByte_u24default, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByte.m246constructorimpl(HexExtensionsKt.hexToByte($this$hexToUByte_u24default, format));
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final byte hexToUByte(String $this$hexToUByte, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToUByte, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UByte.m246constructorimpl(HexExtensionsKt.hexToByte($this$hexToUByte, format));
    }

    /* JADX INFO: renamed from: toHexString-r3ox_E0$default, reason: not valid java name */
    static /* synthetic */ String m1609toHexStringr3ox_E0$default(short $this$toHexString_u2dr3ox_E0_u24default, HexFormat format, int i, Object obj) {
        if ((i & 1) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2dr3ox_E0_u24default, format);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: toHexString-r3ox_E0, reason: not valid java name */
    private static final String m1608toHexStringr3ox_E0(short $this$toHexString_u2dr3ox_E0, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2dr3ox_E0, format);
    }

    static /* synthetic */ short hexToUShort$default(String $this$hexToUShort_u24default, HexFormat format, int i, Object obj) {
        if ((i & 1) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter($this$hexToUShort_u24default, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UShort.m513constructorimpl(HexExtensionsKt.hexToShort($this$hexToUShort_u24default, format));
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final short hexToUShort(String $this$hexToUShort, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToUShort, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UShort.m513constructorimpl(HexExtensionsKt.hexToShort($this$hexToUShort, format));
    }

    /* JADX INFO: renamed from: toHexString-8M7LxHw$default, reason: not valid java name */
    static /* synthetic */ String m1611toHexString8M7LxHw$default(int $this$toHexString_u2d8M7LxHw_u24default, HexFormat format, int i, Object obj) {
        if ((i & 1) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2d8M7LxHw_u24default, format);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: toHexString-8M7LxHw, reason: not valid java name */
    private static final String m1610toHexString8M7LxHw(int $this$toHexString_u2d8M7LxHw, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2d8M7LxHw, format);
    }

    static /* synthetic */ int hexToUInt$default(String $this$hexToUInt_u24default, HexFormat format, int i, Object obj) {
        if ((i & 1) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter($this$hexToUInt_u24default, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UInt.m326constructorimpl(HexExtensionsKt.hexToInt($this$hexToUInt_u24default, format));
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final int hexToUInt(String $this$hexToUInt, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToUInt, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return UInt.m326constructorimpl(HexExtensionsKt.hexToInt($this$hexToUInt, format));
    }

    /* JADX INFO: renamed from: toHexString-8UJCm-I$default, reason: not valid java name */
    static /* synthetic */ String m1613toHexString8UJCmI$default(long $this$toHexString_u2d8UJCm_u2dI_u24default, HexFormat format, int i, Object obj) {
        if ((i & 1) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2d8UJCm_u2dI_u24default, format);
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    /* JADX INFO: renamed from: toHexString-8UJCm-I, reason: not valid java name */
    private static final String m1612toHexString8UJCmI(long $this$toHexString_u2d8UJCm_u2dI, HexFormat format) {
        Intrinsics.checkNotNullParameter(format, "format");
        return HexExtensionsKt.toHexString($this$toHexString_u2d8UJCm_u2dI, format);
    }

    static /* synthetic */ long hexToULong$default(String $this$hexToULong_u24default, HexFormat format, int i, Object obj) {
        if ((i & 1) != 0) {
            format = HexFormat.Companion.getDefault();
        }
        Intrinsics.checkNotNullParameter($this$hexToULong_u24default, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return ULong.m406constructorimpl(HexExtensionsKt.hexToLong($this$hexToULong_u24default, format));
    }

    @SinceKotlin(version = "2.2")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final long hexToULong(String $this$hexToULong, HexFormat format) {
        Intrinsics.checkNotNullParameter($this$hexToULong, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        return ULong.m406constructorimpl(HexExtensionsKt.hexToLong($this$hexToULong, format));
    }
}
