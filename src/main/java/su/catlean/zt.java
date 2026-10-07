package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.collections.Grouping;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/zt.class */
public final class zt implements Grouping {
    final Iterable b;
    private static final long a = yz.a(2033904172459930695L, -1541671367760256798L, MethodHandles.lookup().lookupClass()).a(149816205595117L);
    private static final String c;

    public zt(Iterable $receiver) {
        this.b = $receiver;
    }

    @Override // kotlin.collections.Grouping
    public Iterator sourceIterator() {
        return this.b.iterator();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x002d: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2561) STATIC call: su.catlean.r5.D(long, net.minecraft.class_2561):java.lang.String
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @Override // kotlin.collections.Grouping
    public java.lang.Object keyOf(java.lang.Object r8) {
        /*
            r7 = this;
            long r0 = su.catlean.zt.a
            r1 = 123655482202778(0x7076c9175a9a, double:6.10939256763263E-310)
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 95467880940274(0x56d3d92182f2, double:4.71674002538517E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = r8
            net.minecraft.class_1542 r0 = (net.minecraft.class_1542) r0
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r13
            net.minecraft.class_1799 r0 = r0.method_6983()
            net.minecraft.class_2561 r0 = r0.method_7964()
            r1 = r0
            java.lang.String r2 = su.catlean.zt.c
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r1 = r11
            r2 = r1; r1 = r0; r0 = r2; 
            su.catlean.r5.D(r-1, r0)
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zt.keyOf(java.lang.Object):java.lang.Object");
    }

    static {
        long j = a ^ 11615863201496L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((j << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        c = a(cipher.doFinal("\u0012À.Ñÿ£\u0089\r¨u\u001cï\u0016q\u001aÎO\u001dó©A]ð*".getBytes("ISO-8859-1"))).intern();
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
