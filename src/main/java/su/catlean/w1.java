package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/w1.class */
public final class w1 {
    private final float r;
    private final float v;
    private final float w;
    private int e;

    @NotNull
    private final Color P;
    private static final long a = yz.a(3872253167715393531L, 5390006120305610838L, MethodHandles.lookup().lookupClass()).a(12828209212602L);
    private static final String b;

    public w1(float posX, float posY, float posZ, short a2, int age, @NotNull Color color, long a3) {
        long j = ((((long) a2) << 48) | ((a3 << 16) >>> 16)) ^ a;
        (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4869464287066375372L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(color, b);
        this.r = posX;
        this.v = posY;
        this.w = posZ;
        this.e = age;
        this.P = color;
        if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4885278609586937178L, j) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[4], 4831673250781811244L, j) /* invoke-custom */;
        }
    }

    public final float u() {
        return this.r;
    }

    public final float G() {
        return this.v;
    }

    public final float d() {
        return this.w;
    }

    public final int H() {
        return this.e;
    }

    public final void W(int i) {
        this.e = i;
    }

    @NotNull
    public final Color z() {
        return this.P;
    }

    static {
        long j = a ^ 136908613634178L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        b = a(cipher.doFinal("\u001déçL\u0015$æQ".getBytes("ISO-8859-1"))).intern();
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
