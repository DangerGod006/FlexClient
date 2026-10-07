package su.catlean;

import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/d6.class */
public final class d6 {
    static final d6 k;
    private static final long a = yz.a(-5830574947048430428L, 299825577381671109L, MethodHandles.lookup().lookupClass()).a(69705668784920L);
    private static final String b;

    private d6() {
    }

    @NotNull
    public final KSerializer b(short s, int i, char c) {
        long j = (((((long) s) << 48) | ((((long) i) << 32) >>> 16)) | ((((long) c) << 48) >>> 48)) ^ a;
        return new SealedClassSerializer(b, Reflection.getOrCreateKotlinClass(wl.class), new KClass[]{Reflection.getOrCreateKotlinClass(bp.class), Reflection.getOrCreateKotlinClass(ft.class), Reflection.getOrCreateKotlinClass(nh.class)}, new KSerializer[]{p2.N, ca.N, rg.W}, new Annotation[0]);
    }

    static {
        long j = a ^ 96945866955749L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        b = a(cipher.doFinal("Z\u0004gÄP0íë\u0007Ðª{2AþO".getBytes("ISO-8859-1"))).intern();
        k = new d6();
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
