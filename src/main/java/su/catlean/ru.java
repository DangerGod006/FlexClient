package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_332;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ru.class */
public abstract class ru {

    @NotNull
    private final a1 i;
    private float L;
    private float A;
    private float w;
    private float M;
    private static boolean c;
    private static final long a = yz.a(-700852211368038802L, -3026040840279007935L, MethodHandles.lookup().lookupClass()).a(269491494342262L);
    private static final String j;

    public ru(long a2, @NotNull a1 setting) {
        long j2 = a ^ a2;
        Intrinsics.checkNotNullParameter(setting, j);
        this.i = setting;
        this.w = 116.0f;
        this.M = 13.0f;
    }

    @NotNull
    public a1 A() {
        return this.i;
    }

    public final float x() {
        return this.L;
    }

    public final void V(float f) {
        this.L = f;
    }

    public final float R() {
        return this.A;
    }

    public final void S(float f) {
        this.A = f;
    }

    public final float F() {
        return this.w;
    }

    public final void h(float f) {
        this.w = f;
    }

    public final float d() {
        return this.M;
    }

    public final void m(float f) {
        this.M = f;
    }

    public abstract void r(@NotNull class_332 class_332Var, int i, int i2, long j2, float f);

    public abstract void W(long j2, double d, double d2, int i);

    public abstract void U(double d, double d2, int i);

    public abstract void V(int i, short s, int i2, char c2);

    public abstract void T(char c2, long j2);

    public abstract boolean S(byte b, double d, double d2, double d3, long j2);

    public abstract void L();

    public static void O(boolean z) {
        c = z;
    }

    public static boolean z() {
        return c;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean e() {
        return !z();
    }

    static {
        long j2 = a ^ 127949377976144L;
        if ((boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2514945100849049314L, j2) /* invoke-custom */) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, 2492724231543726443L, j2) /* invoke-custom */;
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j2 << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        j = a(cipher.doFinal(" öQ\u0001\u001b\u001fÒC".getBytes("ISO-8859-1"))).intern();
    }

    private static NumberFormatException b(NumberFormatException numberFormatException) {
        return numberFormatException;
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
                char c2 = (char) (((char) (((char) (i3 & 15)) << '\f')) | (((char) (bArr[i6] & 63)) << 6));
                i2 = i6 + 1;
                int i7 = i;
                i++;
                cArr[i7] = (char) (c2 | ((char) (bArr[i2] & 63)));
            }
            i2++;
        }
        return new String(cArr, 0, i);
    }
}
