package su.catlean;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_742;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix3x2f;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/pc.class */
public final class pc extends gf {

    @NotNull
    public static final pc m;
    private static final long a = yz.a(-247199576849033109L, 1780895264669328685L, MethodHandles.lookup().lookupClass()).a(9484570757181L);
    private static final String[] b;
    private static final String[] c;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;

    /* JADX WARN: Illegal instructions before constructor call */
    private pc(long j) {
        long j2 = a ^ j;
        super((char) (j2 >>> 48), (int) (((j2 ^ 37655777733509L) << 16) >>> 32), (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17616, 6702328070289348114L ^ j2) /* invoke-custom */, (char) ((r1 << 48) >>> 48));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0269: INVOKE 
          (r-1 I:su.catlean.pc)
          (r0 I:net.minecraft.class_332)
          (r1 I:java.lang.String)
          (r2 I:float)
          (r3 I:long)
          (r4 I:float)
          (r5 I:java.awt.Color)
         VIRTUAL call: su.catlean.pc.Z(net.minecraft.class_332, java.lang.String, float, long, float, java.awt.Color):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @Override // su.catlean.gf
    public void h(long r21, @org.jetbrains.annotations.NotNull net.minecraft.class_332 r23) {
        /*
            Method dump skipped, instruction units count: 922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.pc.h(long, net.minecraft.class_332):void");
    }

    @Override // su.catlean.gf
    public void H(@NotNull class_332 context, long a2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5060, 322064073410053173L ^ a2) /* invoke-custom */);
        b8.t(a2 ^ 84319185194541L).A(context, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19474, 222958622367308783L ^ a2) /* invoke-custom */, a2 ^ 127062392772158L, p(a2 ^ 98664999447709L) + 33.0f, V(a2 ^ 118901760466898L) + 0.5f, (int) d(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4185, 7680753218634665265L ^ a2) /* invoke-custom */);
    }

    private final void P(class_332 class_332Var, float f2, long j) throws Throwable {
        long j2 = a ^ j;
        long j3 = j2 ^ 66412303464127L;
        long j4 = j2 ^ 63390873886211L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j4 << 32) >>> 48);
        int i4 = (int) ((j4 << 48) >>> 48);
        long j5 = j2 ^ 124803508395572L;
        class_332Var.method_51448().pushMatrix();
        jl jlVar = jl.y;
        Matrix3x2f matrix3x2fMethod_51448 = class_332Var.method_51448();
        Intrinsics.checkNotNullExpressionValue(matrix3x2fMethod_51448, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25961, 4751133479447845878L ^ j2) /* invoke-custom */);
        class_742 class_742VarV = zf.v(j5);
        Intrinsics.checkNotNull(class_742VarV, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25051, 7695038686074003270L ^ j2) /* invoke-custom */);
        class_2960 class_2960VarComp_3627 = class_742VarV.method_52814().comp_1626().comp_3627();
        Intrinsics.checkNotNullExpressionValue(class_2960VarComp_3627, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27559, 2283515080168854841L ^ j2) /* invoke-custom */);
        float fV = V(j3) + 1.0f;
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18946, 1218259470757459092L ^ j2) /* invoke-custom */);
        jl.W(jlVar, matrix3x2fMethod_51448, class_2960VarComp_3627, f2 + 3.0f, fV, 24.0f, 24.0f, color, null, i2, null, null, 0.125f, (char) i3, 0.125f, 0.25f, (short) i4, 0.25f, false, (int) d(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21882, 968498601775964541L ^ j2) /* invoke-custom */, null);
        jl jlVar2 = jl.y;
        Matrix3x2f matrix3x2fMethod_514482 = class_332Var.method_51448();
        Intrinsics.checkNotNullExpressionValue(matrix3x2fMethod_514482, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20477, 153468972921090415L ^ j2) /* invoke-custom */);
        class_742 class_742VarV2 = zf.v(j5);
        Intrinsics.checkNotNull(class_742VarV2, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14675, 5098172346962872265L ^ j2) /* invoke-custom */);
        class_2960 class_2960VarComp_36272 = class_742VarV2.method_52814().comp_1626().comp_3627();
        Intrinsics.checkNotNullExpressionValue(class_2960VarComp_36272, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18997, 925592867840062628L ^ j2) /* invoke-custom */);
        float fV2 = V(j3) - 1.0f;
        Color color2 = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color2, (String) b(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10282, 7831596968840206009L ^ j2) /* invoke-custom */);
        jl.W(jlVar2, matrix3x2fMethod_514482, class_2960VarComp_36272, f2 + 1.0f, fV2, 28.0f, 28.0f, color2, null, i2, null, null, 0.625f, (char) i3, 0.125f, 0.75f, (short) i4, 0.25f, false, (int) d(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5803, 2861018402086150826L ^ j2) /* invoke-custom */, null);
        class_332Var.method_51448().popMatrix();
    }

    static {
        int i2;
        long j = (a ^ 46744505311324L) ^ 90243623698770L;
        f = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (r0 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((r0 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[15];
        int i4 = 0;
        String str = "Ü¬5ø\"£OÖÆ\u0080\u0010Ü¸ÖÅ¤§P\u0015b*\"íÕç\u0092ö0O\u008fl6÷ctù\u0087\u0010í>ÊÅ5gÉ:Oh\u009c óÓÃ?0D©\u0014Â\u0010\u0015%N\u001dÇZ\u0092bucðxb\u008c\u001d\u008eü\u0089\u008cDa\u0093+Ö¨á<\u008eÞèB\u008a¾Ø¼\u0099û´y\u0099\u0098\u00167wû\u0095Ïä\u009f-Ì0¤ÊÝx¡¦?Âñwöðc\u0093;\u008f6Ê^ÈC)×áÉòàª\u0096\u0010ÿÌ íÄ¼\u001dä.\u0081\u008fzÒ\u0082\u001b°|©æ\u0090L=-ãy\u009bwËs»eYmë\u001d\u0010ïÙÌ]Ø\u008f\u0012\u0096²\u009c¿Á¶\u007fA\u0094 £á¨j\u000f\u0096¸Úòû\u008e5ãÊY\u0005á´L×¯é\bWê$¶\u0005J\u0007Q,(MÔñý\u009dk¹\"TüÐb\u0002jó²VÛà4»KKøÑAX\t\u000f \u0091MIVÖbÕ\u0097V1 e\u008düwA\\¿¤\u0097=TZóæñ\u0095¶ý~{\u000eGË\"Æ¤\u0095å+\u0015£>\u0010©t>stØ\u0089¢$!\u0002\u0017þA\u0014m\u0080\u001ch\u0086òwÆ¿4_à6\u0081¥Ða/\u0094g$\u0017Aw.P'\u000eß \u001ar\u009aÕª;»\u001cþ\u009fEÝ©\u0000\u0090ù\u0017½ÁÌ[D\u001e\u0005\u0006\u0019\u0094ö ²zþí^ßðiÊ\u008anø'óÝé\u009d\u0098\u0097Ô§EÂ\u0089)2¦H!Ï¨7$\u000f\u001e,0E»\u0085cý´ï\u0085·îCI\u0081uä-\u0019/Ú6±\u0017ú#\u001e\u008ds&\u001dKè\nþ9\u0018Ú\u009a+tou\u0091:º\u009bÖ{©³´µ&Ì\u0099æc\u0015U%\u0010»:-\u009f®ê«´Ý55\u001e#\u0004À[\u0010?$\u001a¨yªàpRÄ°¥Á\r0#(\u000b\u0080Û?öH¿¦õ\u000fò\u0083ª¤ÏýÉ\ri'\u000bì£p8+aoB:Û×\u0099Ë\u009b\u0097Ø5\u001fk\u0010êeêE\u0017\u008dàv{é!_\u0090v\u00866";
        int length = "Ü¬5ø\"£OÖÆ\u0080\u0010Ü¸ÖÅ¤§P\u0015b*\"íÕç\u0092ö0O\u008fl6÷ctù\u0087\u0010í>ÊÅ5gÉ:Oh\u009c óÓÃ?0D©\u0014Â\u0010\u0015%N\u001dÇZ\u0092bucðxb\u008c\u001d\u008eü\u0089\u008cDa\u0093+Ö¨á<\u008eÞèB\u008a¾Ø¼\u0099û´y\u0099\u0098\u00167wû\u0095Ïä\u009f-Ì0¤ÊÝx¡¦?Âñwöðc\u0093;\u008f6Ê^ÈC)×áÉòàª\u0096\u0010ÿÌ íÄ¼\u001dä.\u0081\u008fzÒ\u0082\u001b°|©æ\u0090L=-ãy\u009bwËs»eYmë\u001d\u0010ïÙÌ]Ø\u008f\u0012\u0096²\u009c¿Á¶\u007fA\u0094 £á¨j\u000f\u0096¸Úòû\u008e5ãÊY\u0005á´L×¯é\bWê$¶\u0005J\u0007Q,(MÔñý\u009dk¹\"TüÐb\u0002jó²VÛà4»KKøÑAX\t\u000f \u0091MIVÖbÕ\u0097V1 e\u008düwA\\¿¤\u0097=TZóæñ\u0095¶ý~{\u000eGË\"Æ¤\u0095å+\u0015£>\u0010©t>stØ\u0089¢$!\u0002\u0017þA\u0014m\u0080\u001ch\u0086òwÆ¿4_à6\u0081¥Ða/\u0094g$\u0017Aw.P'\u000eß \u001ar\u009aÕª;»\u001cþ\u009fEÝ©\u0000\u0090ù\u0017½ÁÌ[D\u001e\u0005\u0006\u0019\u0094ö ²zþí^ßðiÊ\u008anø'óÝé\u009d\u0098\u0097Ô§EÂ\u0089)2¦H!Ï¨7$\u000f\u001e,0E»\u0085cý´ï\u0085·îCI\u0081uä-\u0019/Ú6±\u0017ú#\u001e\u008ds&\u001dKè\nþ9\u0018Ú\u009a+tou\u0091:º\u009bÖ{©³´µ&Ì\u0099æc\u0015U%\u0010»:-\u009f®ê«´Ý55\u001e#\u0004À[\u0010?$\u001a¨yªàpRÄ°¥Á\r0#(\u000b\u0080Û?öH¿¦õ\u000fò\u0083ª¤ÏýÉ\ri'\u000bì£p8+aoB:Û×\u0099Ë\u009b\u0097Ø5\u001fk\u0010êeêE\u0017\u008dàv{é!_\u0090v\u00866".length();
        char cCharAt = 144;
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i7 = i4;
                        i4++;
                        strArr[i7] = strIntern;
                        int i8 = i6 + cCharAt;
                        i2 = i8;
                        if (i8 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            b = strArr;
                            c = new String[15];
                            i = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (r0 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((r0 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[5];
                            int i10 = 0;
                            String str3 = "»\u0094ü-¯E\"\u008at¿Ö£>~iáØ\u000f\u000bq2Qá6";
                            int length2 = "»\u0094ü-¯E\"\u008at¿Ö£>~iáØ\u000f\u000bq2Qá6".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j3 = j2;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                                    long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j4;
                                            if (i11 >= length2) {
                                                g = jArr;
                                                h = new Integer[5];
                                                m = new pc(j);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i11 >= length2) {
                                                str3 = "jVÍ\u0098nwÈôG^\u0005\u0094ößØ&";
                                                length2 = "jVÍ\u0098nwÈôG^\u0005\u0094ößØ&".length();
                                                i11 = 0;
                                            }
                                            break;
                                    }
                                    int i15 = i11;
                                    i11 += 8;
                                    byte[] bytes2 = str3.substring(i15, i11).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i13 = i10;
                                    i10++;
                                    j2 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i16 = i4;
                        i4++;
                        strArr[i16] = strIntern;
                        int i17 = i6 + cCharAt;
                        i5 = i17;
                        if (i17 < length) {
                        }
                        str = "df'B\"\u008bmHû\u009cµÝ\u0002÷ªà¦P\u001aÛÈÈù²¿âÑ×¶Ö@S\u0082M|UPd{e\u0010\u0016\"+\t¹\u008b\u0085=\u009d\nXR\u0082nS\u001a";
                        length = "df'B\"\u008bmHû\u009cµÝ\u0002÷ªà¦P\u001aÛÈÈù²¿âÑ×¶Ö@S\u0082M|UPd{e\u0010\u0016\"+\t¹\u008b\u0085=\u009d\nXR\u0082nS\u001a".length();
                        cCharAt = '(';
                        i2 = -1;
                        break;
                        break;
                }
                i6 = i2 + 1;
                strSubstring = str.substring(i6, i6 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i5);
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String b(byte[] bArr) {
        int i2 = 0;
        int length = bArr.length;
        char[] cArr = new char[length];
        int i3 = 0;
        while (i3 < length) {
            int i4 = 255 & bArr[i3];
            if (i4 < 192) {
                int i5 = i2;
                i2++;
                cArr[i5] = (char) i4;
            } else if (i4 < 224) {
                i3++;
                int i6 = i2;
                i2++;
                cArr[i6] = (char) (((char) (((char) (i4 & 31)) << 6)) | ((char) (bArr[i3] & 63)));
            } else if (i3 < length - 2) {
                int i7 = i3 + 1;
                char c2 = (char) (((char) (((char) (i4 & 15)) << '\f')) | (((char) (bArr[i7] & 63)) << 6));
                i3 = i7 + 1;
                int i8 = i2;
                i2++;
                cArr[i8] = (char) (c2 | ((char) (bArr[i3] & 63)));
            }
            i3++;
        }
        return new String(cArr, 0, i2);
    }

    private static String b(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 13249;
        if (c[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/pc", e);
            }
        }
        return c[i3];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strB), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strB;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: ArrayIndexOutOfBoundsException: null in method: su.catlean.pc.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/pc.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: ArrayIndexOutOfBoundsException: null in method: su.catlean.pc.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/pc.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.pc.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int d(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 31070;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/pc", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            h[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return h[i3].intValue();
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iD = d(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iD)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iD;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: ArrayIndexOutOfBoundsException: null in method: su.catlean.pc.d(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/pc.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup r0, java.lang.String r1, java.lang.invoke.MethodType r2) {
        /*
        // Can't load method instructions: Load method exception: ArrayIndexOutOfBoundsException: null in method: su.catlean.pc.d(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/pc.class
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.pc.d(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
