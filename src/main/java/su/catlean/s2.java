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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/s2.class */
final class s2 {
    public static final s2 Legit;
    public static final s2 Rage;
    public static final s2 Off;
    private static final s2[] C;
    private static final EnumEntries p;

    private s2(String str, int i) {
    }

    public static s2[] values() {
        return (s2[]) C.clone();
    }

    public static s2 valueOf(String value) {
        return (s2) Enum.valueOf(s2.class, value);
    }

    @NotNull
    public static EnumEntries H() {
        return p;
    }

    private static final s2[] P() {
        return new s2[]{Legit, Rage, Off};
    }

    static {
        long jA = yz.a(6362029337161130347L, -7113961842237310374L, MethodHandles.lookup().lookupClass()).a(240304548608274L) ^ 125734435700603L;
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
        int length = "rTIK\u0019\\1ü\bc\u007fMxÙô¬s\bOë\u0006X-\u0094ó\u0081".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("rTIK\u0019\\1ü\bc\u007fMxÙô¬s\bOë\u0006X-\u0094ó\u0081".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                Legit = new s2(strArr[0], 0);
                Rage = new s2(strArr[1], 1);
                Off = new s2(strArr[2], 2);
                C = P();
                p = EnumEntriesKt.enumEntries(C);
                return;
            }
            cCharAt = "rTIK\u0019\\1ü\bc\u007fMxÙô¬s\bOë\u0006X-\u0094ó\u0081".charAt(i3);
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
