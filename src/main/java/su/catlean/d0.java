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
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/d0.class */
public final class d0 {
    public static final d0 OFF;
    public static final d0 GRIM;
    public static final d0 NCP_AIR;
    private static final d0[] a;
    private static final EnumEntries V;

    private d0(String str, int i) {
    }

    public static d0[] values() {
        return (d0[]) a.clone();
    }

    public static d0 valueOf(String value) {
        return (d0) Enum.valueOf(d0.class, value);
    }

    @NotNull
    public static EnumEntries v() {
        return V;
    }

    private static final d0[] V() {
        return new d0[]{OFF, GRIM, NCP_AIR};
    }

    static {
        long jA = yz.a(2087021085687116722L, 968470297533653348L, MethodHandles.lookup().lookupClass()).a(188549082100101L) ^ 103339911723419L;
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
        int length = "v&ÓA»è\u0014_\bäÕ\u001dGµ,6È\bpÿéû\u0096ö¯ü".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("v&ÓA»è\u0014_\bäÕ\u001dGµ,6È\bpÿéû\u0096ö¯ü".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                OFF = new d0(strArr[1], 0);
                GRIM = new d0(strArr[0], 1);
                NCP_AIR = new d0(strArr[2], 2);
                a = V();
                V = EnumEntriesKt.enumEntries(a);
                return;
            }
            cCharAt = "v&ÓA»è\u0014_\bäÕ\u001dGµ,6È\bpÿéû\u0096ö¯ü".charAt(i3);
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
