package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/l8.class */
public final class l8 {
    public static final l8 Distance;
    public static final l8 Health;
    public static final l8 FOV;
    private static final /* synthetic */ l8[] o;
    private static final /* synthetic */ EnumEntries k;

    private l8(String str, int i) {
    }

    public static l8[] values() {
        return (l8[]) o.clone();
    }

    public static l8 valueOf(String value) {
        return (l8) Enum.valueOf(l8.class, value);
    }

    @NotNull
    public static EnumEntries j() {
        return k;
    }

    private static final /* synthetic */ l8[] D() {
        return new l8[]{Distance, Health, FOV};
    }

    static {
        long jA = yz.a(8721996444822398110L, 4843903816121879210L, MethodHandles.lookup().lookupClass()).a(60272656428260L) ^ 76973136817225L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((jA << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[3];
        int i2 = 0;
        int length = "]\u0013¹çjÉ²èMP¾:]lpJ\b£\u009e\u0089ä<6\u001e?\bçD0¢\u0016\u009bu×".length();
        char cCharAt = 16;
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("]\u0013¹çjÉ²èMP¾:]lpJ\b£\u009e\u0089ä<6\u001e?\bçD0¢\u0016\u009bu×".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                Distance = new l8(strArr[0], 0);
                Health = new l8(strArr[2], 1);
                FOV = new l8(strArr[1], 2);
                o = D();
                k = EnumEntriesKt.enumEntries(o);
                return;
            }
            cCharAt = "]\u0013¹çjÉ²èMP¾:]lpJ\b£\u009e\u0089ä<6\u001e?\bçD0¢\u0016\u009bu×".charAt(i3);
        }
    }

    private static String a(byte[] bArr) {
        int i = 0;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i2 = 0;
        while (i2 < length) {
            int i3 = 255 & bArr[i2];
            if (i3 < 192) {
                int i4 = i;
                i++;
                cArr[i4] = (char) i3;
            } else if (i3 < 224) {
                i2++;
                int i5 = i;
                i++;
                cArr[i5] = (char) (((char) (((char) (i3 & 31)) << 6)) | ((char) (bArr[i2] & 63)));
            } else if (i2 < length - 2) {
                int i6 = i2 + 1;
                char c = (char) (((char) (((char) (i3 & 15)) << '\f')) | (((char) (bArr[i6] & 63)) << 6));
                i2 = i6 + 1;
                int i7 = i;
                i++;
                cArr[i7] = (char) (c | ((char) (bArr[i2] & 63)));
            }
            i2++;
        }
        return new String(cArr, 0, i);
    }
}
