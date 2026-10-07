package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/zo.class */
final class zo {

    @NotNull
    private final class_2338 d;
    private float u;
    private float B;
    private static final long a = yz.a(-5474669734960199274L, -8774629665145894539L, MethodHandles.lookup().lookupClass()).a(146412538928237L);
    private static final String b;

    public zo(long a2, @NotNull class_2338 pos, float progress, float prevProgress) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(pos, b);
        this.d = pos;
        this.u = progress;
        this.B = prevProgress;
    }

    public zo(long j, class_2338 class_2338Var, float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((a ^ j) ^ 116639749730339L, class_2338Var, (i & 2) != 0 ? 0.0f : f, (i & 4) != 0 ? 0.0f : f2);
    }

    @NotNull
    public final class_2338 g() {
        return this.d;
    }

    public final float K() {
        return this.u;
    }

    public final void w(float f) {
        this.u = f;
    }

    public final float w() {
        return this.B;
    }

    public final void U(float f) {
        this.B = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public final boolean o(long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 16006240157178L;
        this.B = this.u;
        ?? Method_22347 = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3362763977366067105L, j2) /* invoke-custom */;
        this.u += 0.025f;
        try {
            try {
                Method_22347 = zf.z(j3).method_22347(this.d);
                ?? r0 = Method_22347;
                if (Method_22347 == 0) {
                    if (Method_22347 != 0) {
                        return true;
                    }
                    r0 = (this.u > 2.0f ? 1 : (this.u == 2.0f ? 0 : -1));
                }
                ?? r02 = r0;
                if (Method_22347 == 0) {
                    r02 = r0 > 0 ? 1 : 0;
                }
                if (j2 >= 0) {
                    try {
                        if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3358663505792020494L, j2) /* invoke-custom */ != null) {
                            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[2], -3367252450618444341L, j2) /* invoke-custom */;
                        }
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -3363798988963646476L, j2) /* invoke-custom */;
                    }
                }
                return r02;
            } catch (NumberFormatException unused2) {
                Method_22347 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_22347, -3363798988963646476L, j2) /* invoke-custom */;
                throw Method_22347;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_22347, -3363798988963646476L, j2) /* invoke-custom */;
        }
    }

    static {
        long j = a ^ 134727285253647L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        b = a(cipher.doFinal(".Q¼^+åq\u007f".getBytes("ISO-8859-1"))).intern();
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
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
