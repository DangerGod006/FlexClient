package su.catlean;

import java.lang.invoke.MethodHandles;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/c5.class */
public final /* synthetic */ class c5 {
    public static final int[] g;

    static {
        long jA = yz.a(-2862558352132180264L, -5285812008168105454L, MethodHandles.lookup().lookupClass()).a(242080671434644L) ^ 111695989367662L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (jA >>> 56);
        for (int i = 1; i < 8; i++) {
            bArr[i] = (byte) ((jA << (i * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        long[] jArr = new long[3];
        int i2 = 0;
        int length = "¼\u009cëÍg\u0017ìF0¥·;A2ÓU¾\u0018îá\u0085³kt".length();
        int i3 = 0;
        do {
            int i4 = i3;
            i3 += 8;
            byte[] bytes = "¼\u009cëÍg\u0017ìF0¥·;A2ÓU¾\u0018îá\u0085³kt".substring(i4, i3).getBytes("ISO-8859-1");
            i2++;
            byte[] bArrDoFinal = cipher.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
            jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
        } while (i3 < length);
        int[] iArr = new int[ok.values().length];
        try {
            iArr[ok.FadeOut.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[ok.Size.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[ok.Otkisuli.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            iArr[ok.Insert.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            iArr[ok.Fall.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        try {
            iArr[ok.Rocket.ordinal()] = (int) jArr[1];
        } catch (NoSuchFieldError e6) {
        }
        try {
            iArr[ok.Roll.ordinal()] = (int) jArr[2];
        } catch (NoSuchFieldError e7) {
        }
        try {
            iArr[ok.Off.ordinal()] = (int) jArr[0];
        } catch (NoSuchFieldError e8) {
        }
        g = iArr;
    }
}
