package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ik.class */
public final class ik {
    public static final ik Packet;
    public static final ik Motion;
    private static final ik[] N;
    private static final EnumEntries O;
    private static String k;

    private ik(String str, int i) {
    }

    public static ik[] values() {
        return (ik[]) N.clone();
    }

    public static ik valueOf(String value) {
        return (ik) Enum.valueOf(ik.class, value);
    }

    @NotNull
    public static EnumEntries H() {
        return O;
    }

    private static final ik[] N() {
        return new ik[]{Packet, Motion};
    }

    static {
        long jA = yz.a(393082867867123630L, -8635098697841574814L, MethodHandles.lookup().lookupClass()).a(67191362617707L) ^ 9075559747763L;
        if ((String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(9209672757930849177L, jA) /* invoke-custom */ == null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("aLQaM", 9170967814230923650L, jA) /* invoke-custom */;
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((jA << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[2];
        int i2 = 0;
        int length = "äMé§ñ\u0083á×\b\u0014ÊÕ2S´\u001b ".length();
        char cCharAt = '\b';
        int i3 = -1;
        while (true) {
            int i4 = i3 + 1;
            int i5 = i2;
            i2++;
            strArr[i5] = a(cipher.doFinal("äMé§ñ\u0083á×\b\u0014ÊÕ2S´\u001b ".substring(i4, i4 + cCharAt).getBytes("ISO-8859-1"))).intern();
            int i6 = i4 + cCharAt;
            i3 = i6;
            if (i6 >= length) {
                Packet = new ik(strArr[1], 0);
                Motion = new ik(strArr[0], 1);
                N = N();
                O = EnumEntriesKt.enumEntries(N);
                return;
            }
            cCharAt = "äMé§ñ\u0083á×\b\u0014ÊÕ2S´\u001b ".charAt(i3);
        }
    }

    public static void v(String str) {
        k = str;
    }

    public static String I() {
        return k;
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
