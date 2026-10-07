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
import net.minecraft.class_4587;
import net.minecraft.class_630;
import net.minecraft.class_7833;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/lt.class */
public final class lt {

    @NotNull
    public static final lt o;
    private static final String[] b;
    private static final String[] c;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final long a = yz.a(3667303866055336807L, 2436327542982929003L, MethodHandles.lookup().lookupClass()).a(92525562334414L);
    private static final Map d = new HashMap(13);

    private lt() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x05e5: INVOKE (r-1 I:su.catlean.g7), (r0 I:org.joml.Matrix4f), (r1 I:float), (r2 I:long), (r3 I:float), (r4 I:float) VIRTUAL call: su.catlean.g7.O(org.joml.Matrix4f, float, long, float, float):su.catlean.g7
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final void Y(@org.jetbrains.annotations.NotNull net.minecraft.class_4587 r16, @org.jetbrains.annotations.NotNull java.awt.Color r17, long r18, @org.jetbrains.annotations.NotNull java.awt.Color r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 2861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.lt.Y(net.minecraft.class_4587, java.awt.Color, long, java.awt.Color, boolean):void");
    }

    private final void V(class_630 class_630Var, float f2, long j, class_4587 class_4587Var, Color color, g7 g7Var) {
        long j2 = a ^ j;
        long j3 = j2 ^ 117018389532544L;
        long j4 = j2 ^ 34241099381480L;
        m(class_4587Var, class_630Var, j2 ^ 87669790822224L);
        Matrix4f matrix4fMethod_23761 = class_4587Var.method_23760().method_23761();
        Intrinsics.checkNotNullExpressionValue(matrix4fMethod_23761, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4259, 3663885410575586012L ^ j2) /* invoke-custom */);
        g7 g7VarN = g7Var.O(matrix4fMethod_23761, 0.0f, j4, 0.0f, 0.0f).n(color, j3);
        Matrix4f matrix4fMethod_237612 = class_4587Var.method_23760().method_23761();
        Intrinsics.checkNotNullExpressionValue(matrix4fMethod_237612, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5455, 6913525408231724849L ^ j2) /* invoke-custom */);
        g7VarN.O(matrix4fMethod_237612, 0.0f, j4, f2, 0.0f).n(color, j3);
        class_4587Var.method_22909();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [net.minecraft.class_4587] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [net.minecraft.class_4587] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [int] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.minecraft.class_4587] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    private final void m(class_4587 class_4587Var, class_630 class_630Var, long j) {
        long j2 = a ^ j;
        ?? r0 = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5183244362157552506L, j2) /* invoke-custom */;
        try {
            r0 = (class_630Var.field_3674 > 0.0f ? 1 : (class_630Var.field_3674 == 0.0f ? 0 : -1));
            ?? r02 = r0;
            if (r0 != 0) {
                r02 = r0 == 0 ? 1 : 0;
            }
            ?? r03 = r02;
            ?? r04 = r02;
            if (j2 >= 0) {
                if (r02 == 0) {
                    try {
                        r02 = class_4587Var;
                        r02.method_22907(class_7833.field_40718.rotation(class_630Var.field_3674));
                        r03 = r02;
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 5179509805078214564L, j2) /* invoke-custom */;
                    }
                }
                try {
                    r03 = (class_630Var.field_3675 > 0.0f ? 1 : (class_630Var.field_3675 == 0.0f ? 0 : -1));
                    r04 = r03;
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r03, 5179509805078214564L, j2) /* invoke-custom */;
                }
            }
            ?? r05 = r04;
            if (r0 != 0) {
                r05 = r04 == 0 ? 1 : 0;
            }
            ?? r06 = r05;
            ?? r07 = r05;
            if (j2 > 0) {
                if (r05 == 0) {
                    try {
                        r05 = class_4587Var;
                        r05.method_22907(class_7833.field_40715.rotation(class_630Var.field_3675));
                        r06 = r05;
                    } catch (NumberFormatException unused3) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r05, 5179509805078214564L, j2) /* invoke-custom */;
                    }
                }
                try {
                    r06 = (class_630Var.field_3654 > 0.0f ? 1 : (class_630Var.field_3654 == 0.0f ? 0 : -1));
                    r07 = r06;
                } catch (NumberFormatException unused4) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r06, 5179509805078214564L, j2) /* invoke-custom */;
                }
            }
            ?? r08 = r07;
            if (r0 != 0) {
                r08 = r07 == 0 ? 1 : 0;
            }
            if (r08 == 0) {
                try {
                    r08 = class_4587Var;
                    r08.method_22907(class_7833.field_40713.rotation(class_630Var.field_3654));
                } catch (NumberFormatException unused5) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r08, 5179509805078214564L, j2) /* invoke-custom */;
                }
            }
        } catch (NumberFormatException unused6) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 5179509805078214564L, j2) /* invoke-custom */;
        }
    }

    static {
        int i;
        long j = a ^ 140611028640746L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[16];
        int i3 = 0;
        String str = "\u0006\u0091ìªá\u000e¸«h+Ò/-ð\u0015ç×/h\u001d¬?E=\u0006\u0015#k°@/\nt¾É<\u0088E\u0014Ô®¹\u0000½¨ÑºÝ)rÀý;\u0088\u0089¹\u00ad;\u008aÅ\u007fÄ\u009d\u0002¯\u0081\u0001\u0086+4F\u00869¥\u0011U«Ñ¼Âõj1§Påç\u0003&«ÖÇ\u0006zñîy\u009c4à[Ï¤Lµ3ä@\u0014\u0089\u001c\u0011\nÓ¹\u0089Ë\u0096\u0010%\u0085¤\f¶\u0082\u008f£\u0012oA«Ú\u0000Ä¾\u0085û!£?Që}\u0014\u001a»z0-ü ¹Ý\u008b«°7}8Ìek¦\u0084È\u0090F\\\u001a%hÙYÿ4\u0084\u009b·\u009d\u0005®ØØÍ£\u0014¹h\u0093D,\u0016#Ñ\u001d\u0099r\u0000>Ü)ðõë±=4\u0096\u001fØ\f§ÇÎ0\u0096<ÀcÅO\u0014ñ\u007f¸YØ\u0083¿1?ð\u0092Ú\u0098\u0083\u001dbbv\u0003&{Á\u0089³ä\tXI´¦I 0! Z\u0006\u000bþ\\\u000e×\u0096üÝÙ\u009e´î\u0015·¤!rºOi88_\u009aÂ\bÀß\u001bÍ \u00078ÃA5\\ê×0kø\u001a@\u00adØæ³\u0005%Ûx@Ï\u0006Lñ-@÷\nàg t\u0094jg|Ýå%J²å\u0095\u0011¯¶\u0084ôJFAåO»Tk\nk\u0002\u0007É\u0090×\u0018\u0099ÄÈ£ôÿNÖE\u001d\u0005¹\u0016ª\u0097\u0096\u009fZC0Ä¸Ã\u0097 AÕE\u001e\u0018á´\u000eUt\u001e\u009dÕ3àPT@/>\u0089ÒÛÉàºò\r¸}ú´\u0010\u001c\t7+\u0013\u00890Êî\u0012·\u009bA|ú 8=¬iïárS\u008aã\t°\u00ad\nÛ¼\u008d¦yr\u0002ií\u0098Rrµ>ãÙÜ\u009a^v\u009cæc¦¾éRSÑ\u0087\"\u0006ÊÊ\u0080Ë\u0088\u001a²ïÌÀ¾\u0010\u001e3Õ\u0080gFã\u0083ØR!RÅhsÿ\u0018^ã\u0085f\u008aõ\u0016\rÍU´óvd:\u000e\u0014zº \u001c11k\u0018\u001eÅ\u0085\u0007©(\u008fl¹\u0091\r(%ñÃ=Ó>ÍK\u007f¢tù(G\u0087¬§\u0007·¥R=§VL0§e\\\u008eñ\rEä~`nñ&¿\"«\u0011g´\u0094öÆy\u0086\u0013ìy\u0010\u001d\u0007Ú×¤YZ(\u009e\u009a[ÏnÌ=[ \u0097$vXðAá\u0006¨¦°D7én\u000f\f\u000bih°åR\u000e\u0006LK¿]\u0089¤ ";
        int length = "\u0006\u0091ìªá\u000e¸«h+Ò/-ð\u0015ç×/h\u001d¬?E=\u0006\u0015#k°@/\nt¾É<\u0088E\u0014Ô®¹\u0000½¨ÑºÝ)rÀý;\u0088\u0089¹\u00ad;\u008aÅ\u007fÄ\u009d\u0002¯\u0081\u0001\u0086+4F\u00869¥\u0011U«Ñ¼Âõj1§Påç\u0003&«ÖÇ\u0006zñîy\u009c4à[Ï¤Lµ3ä@\u0014\u0089\u001c\u0011\nÓ¹\u0089Ë\u0096\u0010%\u0085¤\f¶\u0082\u008f£\u0012oA«Ú\u0000Ä¾\u0085û!£?Që}\u0014\u001a»z0-ü ¹Ý\u008b«°7}8Ìek¦\u0084È\u0090F\\\u001a%hÙYÿ4\u0084\u009b·\u009d\u0005®ØØÍ£\u0014¹h\u0093D,\u0016#Ñ\u001d\u0099r\u0000>Ü)ðõë±=4\u0096\u001fØ\f§ÇÎ0\u0096<ÀcÅO\u0014ñ\u007f¸YØ\u0083¿1?ð\u0092Ú\u0098\u0083\u001dbbv\u0003&{Á\u0089³ä\tXI´¦I 0! Z\u0006\u000bþ\\\u000e×\u0096üÝÙ\u009e´î\u0015·¤!rºOi88_\u009aÂ\bÀß\u001bÍ \u00078ÃA5\\ê×0kø\u001a@\u00adØæ³\u0005%Ûx@Ï\u0006Lñ-@÷\nàg t\u0094jg|Ýå%J²å\u0095\u0011¯¶\u0084ôJFAåO»Tk\nk\u0002\u0007É\u0090×\u0018\u0099ÄÈ£ôÿNÖE\u001d\u0005¹\u0016ª\u0097\u0096\u009fZC0Ä¸Ã\u0097 AÕE\u001e\u0018á´\u000eUt\u001e\u009dÕ3àPT@/>\u0089ÒÛÉàºò\r¸}ú´\u0010\u001c\t7+\u0013\u00890Êî\u0012·\u009bA|ú 8=¬iïárS\u008aã\t°\u00ad\nÛ¼\u008d¦yr\u0002ií\u0098Rrµ>ãÙÜ\u009a^v\u009cæc¦¾éRSÑ\u0087\"\u0006ÊÊ\u0080Ë\u0088\u001a²ïÌÀ¾\u0010\u001e3Õ\u0080gFã\u0083ØR!RÅhsÿ\u0018^ã\u0085f\u008aõ\u0016\rÍU´óvd:\u000e\u0014zº \u001c11k\u0018\u001eÅ\u0085\u0007©(\u008fl¹\u0091\r(%ñÃ=Ó>ÍK\u007f¢tù(G\u0087¬§\u0007·¥R=§VL0§e\\\u008eñ\rEä~`nñ&¿\"«\u0011g´\u0094öÆy\u0086\u0013ìy\u0010\u001d\u0007Ú×¤YZ(\u009e\u009a[ÏnÌ=[ \u0097$vXðAá\u0006¨¦°D7én\u000f\f\u000bih°åR\u000e\u0006LK¿]\u0089¤ ".length();
        char cCharAt = 256;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            b = strArr;
                            c = new String[16];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[10];
                            int i9 = 0;
                            String str3 = "í\f\u0003\u0017gå@\u00022·Ú}\u0085Ü\\\u009cU\u001dÓF®\tIÀ@Ðo(°\u007fÇ¿¬Ë\u0082CîV\u0086µ9\u0095\u0019V®ì&µ,Ç\u008aÏ«\u001e3=Cïè\u000e\u0096Ìæ\u0089";
                            int length2 = "í\f\u0003\u0017gå@\u00022·Ú}\u0085Ü\\\u009cU\u001dÓF®\tIÀ@Ðo(°\u007fÇ¿¬Ë\u0082CîV\u0086µ9\u0095\u0019V®ì&µ,Ç\u008aÏ«\u001e3=Cïè\u000e\u0096Ìæ\u0089".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j2 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j3 = j2;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j3 >>> 56), (byte) (j3 >>> 48), (byte) (j3 >>> 40), (byte) (j3 >>> 32), (byte) (j3 >>> 24), (byte) (j3 >>> 16), (byte) (j3 >>> 8), (byte) j3});
                                    long j4 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                e = jArr;
                                                f = new Integer[10];
                                                o = new lt();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "\u0083\u0099\u009f'òùX\u0099d\r^×\u0092\bæÀ";
                                                length2 = "\u0083\u0099\u009f'òùX\u0099d\r^×\u0092\bæÀ".length();
                                                i10 = 0;
                                            }
                                            break;
                                    }
                                    int i14 = i10;
                                    i10 += 8;
                                    byte[] bytes2 = str3.substring(i14, i10).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i12 = i9;
                                    i9++;
                                    j2 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i15 = i3;
                        i3++;
                        strArr[i15] = strIntern;
                        int i16 = i5 + cCharAt;
                        i4 = i16;
                        if (i16 < length) {
                        }
                        str = "Ã\u009b\u0088\u0085Ö\u0010mo\u001cRþ\u0012ÀóÐ¶\u0098NQ²,çJca\u001d\u0004Nô=õÝF0<\u0012\u00adjâ\u008f\t\u009dc²\u0088\u009dx_æ\u001c\u001bÃ¾ÔÙù\u0093»OB0úþ×8ðë%ûß\u001f \u008e\u001eL\u0012HT\u0016(\u0004ÌíU54\u0095j\u0007Vkã\u0019¤\u0096aÎþ\u0092Ü§Õ\u0094\bIÈ³ø\u0084\u0007n\u0011ý½dÃ¼ö·¾\u0080ôIÖicSÚæ\u0098\u0010Åò\u008b`µÆìÐ®~vä\u001b³SyxÃ\u008eíÏBÊ4Fª+n\u0096\u008b\u009c\u0015Bä;\u0006\u0003]";
                        length = "Ã\u009b\u0088\u0085Ö\u0010mo\u001cRþ\u0012ÀóÐ¶\u0098NQ²,çJca\u001d\u0004Nô=õÝF0<\u0012\u00adjâ\u008f\t\u009dc²\u0088\u009dx_æ\u001c\u001bÃ¾ÔÙù\u0093»OB0úþ×8ðë%ûß\u001f \u008e\u001eL\u0012HT\u0016(\u0004ÌíU54\u0095j\u0007Vkã\u0019¤\u0096aÎþ\u0092Ü§Õ\u0094\bIÈ³ø\u0084\u0007n\u0011ý½dÃ¼ö·¾\u0080ôIÖicSÚæ\u0098\u0010Åò\u008b`µÆìÐ®~vä\u001b³SyxÃ\u008eíÏBÊ4Fª+n\u0096\u008b\u009c\u0015Bä;\u0006\u0003]".length();
                        cCharAt = 16;
                        i = -1;
                        break;
                        break;
                }
                i5 = i + 1;
                strSubstring = str.substring(i5, i5 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i4);
        }
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

    private static String a(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 28257;
        if (c[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i2] = a(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/lt", e2);
            }
        }
        return c[i2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strA = a(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strA), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strA;
    }

    /*  JADX ERROR: Failed to decode insn: 0x000A: CONST
        jadx.plugins.input.java.utils.JavaClassParseException: Unsupported constant type: METHOD_HANDLE
        	at jadx.plugins.input.java.data.code.decoders.LoadConstDecoder.decode(LoadConstDecoder.java:65)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = 44
            int r1 = r1.parameterCount()
            r-1.asCollector(r0, r1)
            r0 = 0
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r11
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r9
            r2[r3] = r4
            java.lang.invoke.MethodHandles.insertArguments(r-1, r0, r1)
            r0 = r10
            java.lang.invoke.MethodHandles.explicitCastArguments(r-1, r0)
            r-2.setTarget(r-1)
            goto L62
            r12 = r-3
            java.lang.RuntimeException r-3 = new java.lang.RuntimeException
            r-2 = r-3
            java.lang.StringBuilder r-1 = new java.lang.StringBuilder
            r0 = r-1
            r0.<init>()
            java.lang.String r0 = "su/catlean/lt"
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r9
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r10
            java.lang.String r0 = r0.toString()
            r-1.append(r0)
            r-1.toString()
            r0 = r12
            r-2.<init>(r-1, r0)
            throw r-3
            r-2 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.lt.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 2381;
        if (f[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) g.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/lt", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            f[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return f[i2].intValue();
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iB)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iB;
    }

    /*  JADX ERROR: Failed to decode insn: 0x000A: CONST
        jadx.plugins.input.java.utils.JavaClassParseException: Unsupported constant type: METHOD_HANDLE
        	at jadx.plugins.input.java.data.code.decoders.LoadConstDecoder.decode(LoadConstDecoder.java:65)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = 44
            int r1 = r1.parameterCount()
            r-1.asCollector(r0, r1)
            r0 = 0
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r8
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r11
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r9
            r2[r3] = r4
            java.lang.invoke.MethodHandles.insertArguments(r-1, r0, r1)
            r0 = r10
            java.lang.invoke.MethodHandles.explicitCastArguments(r-1, r0)
            r-2.setTarget(r-1)
            goto L62
            r12 = r-3
            java.lang.RuntimeException r-3 = new java.lang.RuntimeException
            r-2 = r-3
            java.lang.StringBuilder r-1 = new java.lang.StringBuilder
            r0 = r-1
            r0.<init>()
            java.lang.String r0 = "su/catlean/lt"
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r9
            r-1.append(r0)
            java.lang.String r0 = " : "
            r-1.append(r0)
            r0 = r10
            java.lang.String r0 = r0.toString()
            r-1.append(r0)
            r-1.toString()
            r0 = r12
            r-2.<init>(r-1, r0)
            throw r-3
            r-2 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.lt.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
