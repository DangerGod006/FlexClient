package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1268;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/na.class */
public final class na implements b4 {

    @NotNull
    public static final na F;
    private static boolean M;
    private static final String a;

    private na() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0115 A[PHI: r0 r1
  0x0115: PHI (r0v30 ??) = (r0v42 ??), (r0v43 ??), (r0v44 ??) binds: [B:23:0x00d0, B:25:0x00d5, B:33:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x0115: PHI (r1v25 su.catlean.mt) = (r1v24 su.catlean.mt), (r1v24 su.catlean.mt), (r1v32 su.catlean.mt) binds: [B:23:0x00d0, B:25:0x00d5, B:33:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v29, types: [su.catlean.mt] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    @Override // su.catlean.b4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void Q(int r9, long r10) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.na.Q(int, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.mt] */
    /* JADX WARN: Type inference failed for: r0v5, types: [long] */
    @Override // su.catlean.b4
    public void P(@NotNull _w rotation, short a2, int a3, int a4) {
        long j = (((long) a2) << 48) | ((((long) a3) << 32) >>> 16) | ((((long) a4) << 48) >>> 48);
        Object objB9 = j;
        long j2 = objB9 ^ 100624651377200L;
        long j3 = objB9 ^ 66102524677371L;
        int i = (int) (objB9 >>> 32);
        int i2 = (int) ((j3 << 32) >>> 56);
        int i3 = (int) ((j3 << 40) >>> 40);
        try {
            try {
                Intrinsics.checkNotNullParameter(rotation, a);
                if (M) {
                    objB9 = um.E.B9(i, (byte) i2, i3);
                    if (objB9 == mt.UNPRESS) {
                        ag.x(class_1268.field_5810, rotation.q(), j2, rotation.N());
                    }
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objB9, -2782100315421280528L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objB9, -2782100315421280528L, j) /* invoke-custom */;
        }
    }

    @Override // su.catlean.b4
    public void n(long j) {
    }

    static {
        long jA = yz.a(202333040935328619L, 652114779646073318L, MethodHandles.lookup().lookupClass()).a(257937556679860L) ^ 12462863488478L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((jA << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        a = a(cipher.doFinal("w\bBk2¹´\u0095×Q8U¢hcÐ".getBytes("ISO-8859-1"))).intern();
        F = new na();
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
