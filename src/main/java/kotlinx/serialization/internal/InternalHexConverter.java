package kotlinx.serialization.internal;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Platform.common.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/InternalHexConverter.class */
public final class InternalHexConverter {

    @NotNull
    public static final InternalHexConverter INSTANCE = new InternalHexConverter();

    @NotNull
    private static final String hexCode = "0123456789ABCDEF";

    private InternalHexConverter() {
    }

    @NotNull
    public final byte[] parseHexBinary(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        int len = s.length();
        if (!(len % 2 == 0)) {
            throw new IllegalArgumentException("HexBinary string must be even length".toString());
        }
        byte[] bytes = new byte[len / 2];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < len) {
                int h = hexToInt(s.charAt(i2));
                int l = hexToInt(s.charAt(i2 + 1));
                if (!((h == -1 || l == -1) ? false : true)) {
                    throw new IllegalArgumentException(("Invalid hex chars: " + s.charAt(i2) + s.charAt(i2 + 1)).toString());
                }
                bytes[i2 / 2] = (byte) ((h << 4) + l);
                i = i2 + 2;
            } else {
                return bytes;
            }
        }
    }

    private final int hexToInt(char ch) {
        boolean z = '0' <= ch && ch < ':';
        if (z) {
            return ch - '0';
        }
        boolean z2 = 'A' <= ch && ch < 'G';
        if (z2) {
            return (ch - 'A') + 10;
        }
        boolean z3 = 'a' <= ch && ch < 'g';
        if (z3) {
            return (ch - 'a') + 10;
        }
        return -1;
    }

    public static /* synthetic */ String printHexBinary$default(InternalHexConverter internalHexConverter, byte[] bArr, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return internalHexConverter.printHexBinary(bArr, z);
    }

    @NotNull
    public final String printHexBinary(@NotNull byte[] data, boolean lowerCase) {
        Intrinsics.checkNotNullParameter(data, "data");
        StringBuilder r = new StringBuilder(data.length * 2);
        for (byte b : data) {
            r.append(hexCode.charAt((b >> 4) & 15));
            r.append(hexCode.charAt(b & 15));
        }
        if (!lowerCase) {
            String string = r.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        String string2 = r.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        String lowerCase2 = string2.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        return lowerCase2;
    }

    @NotNull
    public final String toHexString(int n) {
        byte[] arr = new byte[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = (byte) (n >> (24 - (i * 8)));
        }
        String it = StringsKt.trimStart(printHexBinary(arr, true), '0');
        String str = it.length() > 0 ? it : null;
        return str == null ? "0" : str;
    }
}
