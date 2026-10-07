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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/b2.class */
public final class b2 {
    public static final b2 HANDSHAKE;
    public static final b2 FRAME;
    public static final b2 CLOSE;
    public static final b2 PING;
    public static final b2 PONG;
    private static final /* synthetic */ b2[] A;
    private static final /* synthetic */ EnumEntries V;

    private b2(String str, int i) {
    }

    public static b2[] values() {
        return (b2[]) A.clone();
    }

    public static b2 valueOf(String value) {
        return (b2) Enum.valueOf(b2.class, value);
    }

    @NotNull
    public static EnumEntries w() {
        return V;
    }

    private static final /* synthetic */ b2[] T() {
        return new b2[]{HANDSHAKE, FRAME, CLOSE, PING, PONG};
    }

    static {
        int i;
        long jA = yz.a(-6139529863262926312L, 6885743977374080854L, MethodHandles.lookup().lookupClass()).a(122662632911943L) ^ 121650478318488L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((jA << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[5];
        int i3 = 0;
        String str = "îV\f]ç\u009e|uQ41\u001dl\u009cuH\bÆ\u0012`\u001a¶\u009c§-\bN.òX\u0096HB³";
        int length = "îV\f]ç\u009e|uQ41\u001dl\u009cuH\bÆ\u0012`\u001a¶\u009c§-\bN.òX\u0096HB³".length();
        char cCharAt = 16;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 >= length) {
                            HANDSHAKE = new b2(strArr[0], 0);
                            FRAME = new b2(strArr[1], 1);
                            CLOSE = new b2(strArr[4], 2);
                            PING = new b2(strArr[2], 3);
                            PONG = new b2(strArr[3], 4);
                            A = T();
                            V = EnumEntriesKt.enumEntries(A);
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i8 = i3;
                        i3++;
                        strArr[i8] = strIntern;
                        int i9 = i5 + cCharAt;
                        i4 = i9;
                        if (i9 < length) {
                        }
                        str = "Z\u0086\u008eoÜ¯á\u0099\b½D¥ö9ýÿò";
                        length = "Z\u0086\u008eoÜ¯á\u0099\b½D¥ö9ýÿò".length();
                        cCharAt = '\b';
                        i = -1;
                        break;
                        break;
                }
                i5 = i + 1;
                strSubstring = str.substring(i5, i5 + cCharAt);
                b = 0;
            }
            cCharAt = str.charAt(i4);
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
