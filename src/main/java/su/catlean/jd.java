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
import net.minecraft.class_11280;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/jd.class */
public final class jd implements class_11280.class_11281 {
    private final float h;
    private final float S;
    private final float b;
    private final float i;

    @NotNull
    private final Color A;
    private static final String[] c;
    private static final String[] d;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map j;
    private static final long a = yz.a(-5614685526224578887L, -1720000299022954843L, MethodHandles.lookup().lookupClass()).a(166248311084952L);
    private static final Map e = new HashMap(13);

    public jd(float uSizeX, float uSizeY, float radius, float uBorderWidth, long a2, @NotNull Color uBorderColor) {
        Intrinsics.checkNotNullParameter(uBorderColor, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13388, 4592726704147917935L ^ (a ^ a2)) /* invoke-custom */);
        this.h = uSizeX;
        this.S = uSizeY;
        this.b = radius;
        this.i = uBorderWidth;
        this.A = uBorderColor;
    }

    public final float s() {
        return this.h;
    }

    public final float E() {
        return this.S;
    }

    public final float m() {
        return this.b;
    }

    public final float M() {
        return this.i;
    }

    @NotNull
    public final Color u() {
        return this.A;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00b9: INVOKE (r-1 I:com.mojang.blaze3d.buffers.Std140Builder), (r0 I:float), (r1 I:float), (r2 I:float), (r3 I:float) VIRTUAL call: com.mojang.blaze3d.buffers.Std140Builder.putVec4(float, float, float, float):com.mojang.blaze3d.buffers.Std140Builder
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public void method_71104(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r12) {
        /*
            r11 = this;
            long r0 = su.catlean.jd.a
            r1 = 88786892832246(0x50c04f353df6, double:4.3866553549401E-310)
            long r0 = r0 ^ r1
            r13 = r0
            r0 = r13
            r1 = r0; r1 = r0; 
            r2 = 87322427401472(0x4f6b56442500, double:4.31430114905336E-310)
            long r1 = r1 ^ r2
            r15 = r1
            r1 = r0; r2 = r0; 
            r2 = 26141400563117(0x17c684e4fdad, double:1.2915567952411E-310)
            long r1 = r1 ^ r2
            r17 = r1
            r1 = r0; r2 = r0; 
            r2 = 134200637682951(0x7a0e05567507, double:6.63039247291343E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r19 = r2
            r2 = r1; r3 = r0; 
            r3 = 16
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r20 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r21 = r2
            r1 = r0; r3 = r0; 
            r2 = 107457586947593(0x61bb6b4c6609, double:5.30911020958044E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            r22 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r24 = r2
            r0 = r12
            r1 = 5770(0x168a, float:8.085E-42)
            r2 = 6244151683664831950(0x56a7aedf947fe5ce, double:2.781038331867114E109)
            r3 = r13
            long r2 = r2 ^ r3
            java.lang.String r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/jd;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "q"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r12
            com.mojang.blaze3d.buffers.Std140Builder r0 = com.mojang.blaze3d.buffers.Std140Builder.intoBuffer(r0)
            r1 = r11
            float r1 = r1.h
            r2 = r11
            float r2 = r2.S
            com.mojang.blaze3d.buffers.Std140Builder r0 = r0.putVec2(r1, r2)
            r1 = r11
            float r1 = r1.b
            com.mojang.blaze3d.buffers.Std140Builder r0 = r0.putFloat(r1)
            r1 = r11
            float r1 = r1.i
            com.mojang.blaze3d.buffers.Std140Builder r0 = r0.putFloat(r1)
            su.catlean.jl r1 = su.catlean.jl.y
            r2 = r11
            java.awt.Color r2 = r2.A
            r3 = r19
            char r3 = (char) r3
            r4 = r20
            short r4 = (short) r4
            r5 = r21
            float r1 = r1.y(r2, r3, r4, r5)
            su.catlean.jl r2 = su.catlean.jl.y
            r3 = r11
            java.awt.Color r3 = r3.A
            r4 = r17
            r5 = r4; r4 = r3; r3 = r5; 
            float r1 = r1.M(r2, r3)
            su.catlean.jl r2 = su.catlean.jl.y
            r3 = r11
            java.awt.Color r3 = r3.A
            r4 = r22
            r5 = r24
            float r2 = r2.r(r3, r4, r5)
            su.catlean.jl r3 = su.catlean.jl.y
            r4 = r11
            java.awt.Color r4 = r4.A
            r5 = r15
            r6 = r5; r5 = r4; r4 = r6; 
            float r3 = r3.G(r4, r5)
            r-1.putVec4(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jd.method_71104(java.nio.ByteBuffer):void");
    }

    public final float W() {
        return this.h;
    }

    public final float f() {
        return this.S;
    }

    public final float T() {
        return this.b;
    }

    public final float P() {
        return this.i;
    }

    @NotNull
    public final Color H() {
        return this.A;
    }

    @NotNull
    public final jd V(float uSizeX, float uSizeY, float radius, float uBorderWidth, long a2, @NotNull Color uBorderColor) {
        long j2 = a ^ a2;
        Intrinsics.checkNotNullParameter(uBorderColor, (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19393, 3077206140846680634L ^ j2) /* invoke-custom */);
        return new jd(uSizeX, uSizeY, radius, uBorderWidth, j2 ^ 52538219104036L, uBorderColor);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:16:0x0053
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static su.catlean.jd u(su.catlean.jd r9, float r10, float r11, float r12, float r13, long r14, java.awt.Color r16, int r17, java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jd.u(su.catlean.jd, float, float, float, float, long, java.awt.Color, int, java.lang.Object):su.catlean.jd");
    }

    @NotNull
    public String toString() {
        long j2 = a ^ 112360686389350L;
        return (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3513, 7027220030342613866L ^ j2) /* invoke-custom */ + this.h + (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1222, 3921026399455691281L ^ j2) /* invoke-custom */ + this.S + (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9882, 5250194042742956111L ^ j2) /* invoke-custom */ + this.b + (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32597, 4644136214576052613L ^ j2) /* invoke-custom */ + this.i + (String) a(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17710, 552232320433947644L ^ j2) /* invoke-custom */ + this.A + ")";
    }

    public int hashCode() {
        long j2 = a ^ 28222578574188L;
        return (((((((Float.hashCode(this.h) * (int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5228, 7686400749737233441L ^ j2) /* invoke-custom */) + Float.hashCode(this.S)) * (int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8806, 1870291388131539497L ^ j2) /* invoke-custom */) + Float.hashCode(this.b)) * (int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8806, 1870291388131539497L ^ j2) /* invoke-custom */) + Float.hashCode(this.i)) * (int) b(MethodHandles.lookup(), "f", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8806, 1870291388131539497L ^ j2) /* invoke-custom */) + this.A.hashCode();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jd.equals(java.lang.Object):boolean");
    }

    static {
        int i;
        long j2 = a ^ 8468846406543L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j2 << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[8];
        int i3 = 0;
        String str = "\u009a¢\u009cX\u001bµ¡ü\u0019â¼\u008b-áß\u0010 ¥.Ü¶\u0088á\u009eYÆc¦«vU\u000f#s\u0005×p\u009c\r\u009daG^Ê\u001c\u0011÷\u0010Y \u009a\u0016\u0088YPú\u009dB,½³+ÁÌ\u0004\u0001\rFKëmGß\u0002~°Ãht\u000elM \u0087A¹\u000f\u0095s\u0013·òÍ\u0086iôº½\u0097\u00adÉ\u0095à\u0087\u008fÓo¨\t\u008d\u0086³íÜ¢ \u0001+¡Æì×-ºhî)ÂÝ²»²à7Ccñh\u008c° ¦çE3º}È ¼\u009d¹\u008bý\u0093H T\u000fy¸ÃiËá\u000e¿'\u008fAF¬\u008cBa\u001a\u0018ÆdB6";
        int length = "\u009a¢\u009cX\u001bµ¡ü\u0019â¼\u008b-áß\u0010 ¥.Ü¶\u0088á\u009eYÆc¦«vU\u000f#s\u0005×p\u009c\r\u009daG^Ê\u001c\u0011÷\u0010Y \u009a\u0016\u0088YPú\u009dB,½³+ÁÌ\u0004\u0001\rFKëmGß\u0002~°Ãht\u000elM \u0087A¹\u000f\u0095s\u0013·òÍ\u0086iôº½\u0097\u00adÉ\u0095à\u0087\u008fÓo¨\t\u008d\u0086³íÜ¢ \u0001+¡Æì×-ºhî)ÂÝ²»²à7Ccñh\u008c° ¦çE3º}È ¼\u009d¹\u008bý\u0093H T\u000fy¸ÃiËá\u000e¿'\u008fAF¬\u008cBa\u001a\u0018ÆdB6".length();
        char cCharAt = 16;
        int i4 = -1;
        while (true) {
            int i5 = i4 + 1;
            String strSubstring = str.substring(i5, i5 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i6 = i3;
                        i3++;
                        strArr[i6] = strIntern;
                        int i7 = i5 + cCharAt;
                        i = i7;
                        if (i7 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            c = strArr;
                            d = new String[8];
                            j = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j2 << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[4];
                            int i9 = 0;
                            String str3 = "ßà\u00adsÎµ\u0003¨û.K4\u0098WúÌ";
                            int length2 = "ßà\u00adsÎµ\u0003¨û.K4\u0098WúÌ".length();
                            int i10 = 0;
                            while (true) {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = str3.substring(i11, i10).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i12 = i9;
                                i9++;
                                long j3 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b3 = -1;
                                while (true) {
                                    byte b4 = b3;
                                    long j4 = j3;
                                    int i13 = i12;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j4 >>> 56), (byte) (j4 >>> 48), (byte) (j4 >>> 40), (byte) (j4 >>> 32), (byte) (j4 >>> 24), (byte) (j4 >>> 16), (byte) (j4 >>> 8), (byte) j4});
                                    long j5 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i13) {
                                        case 0:
                                            jArr2[b4] = j5;
                                            if (i10 >= length2) {
                                                f = jArr;
                                                g = new Integer[4];
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b4] = j5;
                                            if (i10 >= length2) {
                                                str3 = "çEÐ©\u0088>ìcÙê`d?Õ¹Ü";
                                                length2 = "çEÐ©\u0088>ìcÙê`d?Õ¹Ü".length();
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
                                    j3 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b3 = 0;
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
                        str = "ÈÜ_\u0016æ\tÓj\u0007\u0082qËl#¬M\n\u0083õ|u\u009aªÛaÕi\"Þ\u0098[0(Tµ¾iÄ\u007f¯5NP^\u0092,\u000eç\u00adÙü\u0000\\:äW>ä½ãf\u0091º\u0014lë$÷0\tíº\u0098";
                        length = "ÈÜ_\u0016æ\tÓj\u0007\u0082qËl#¬M\n\u0083õ|u\u009aªÛaÕi\"Þ\u0098[0(Tµ¾iÄ\u007f¯5NP^\u0092,\u000eç\u00adÙü\u0000\\:äW>ä½ãf\u0091º\u0014lë$÷0\tíº\u0098".length();
                        cCharAt = ' ';
                        i = -1;
                        break;
                        break;
                }
                i5 = i + 1;
                strSubstring = str.substring(i5, i5 + cCharAt);
                b = 0;
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

    private static String a(int i, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j2 & 32767))) ^ 28745;
        if (d[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i2] = a(((Cipher) objArr[0]).doFinal(c[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/jd", e2);
            }
        }
        return d[i2];
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
            r1 = 0
            r2 = r10
            int r2 = r2.parameterCount()
            java.lang.invoke.MethodHandle r0 = r0.asCollector(r1, r2)
            r1 = 0
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r11
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r9
            r3[r4] = r5
            java.lang.invoke.MethodHandle r0 = java.lang.invoke.MethodHandles.insertArguments(r0, r1, r2)
            r1 = r10
            java.lang.invoke.MethodHandle r0 = java.lang.invoke.MethodHandles.explicitCastArguments(r0, r1)
            r-1.setTarget(r0)
            goto L62
            r12 = r-2
            java.lang.RuntimeException r-2 = new java.lang.RuntimeException
            r-1 = r-2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "su/catlean/jd"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " : "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " : "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r12
            r-1.<init>(r0, r1)
            throw r-2
            r-1 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jd.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j2) {
        int i2 = (i ^ ((int) (j2 & 32767))) ^ 9691;
        if (g[i2] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) j.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/jd", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            g[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return g[i2].intValue();
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
            r1 = 0
            r2 = r10
            int r2 = r2.parameterCount()
            java.lang.invoke.MethodHandle r0 = r0.asCollector(r1, r2)
            r1 = 0
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r11
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r9
            r3[r4] = r5
            java.lang.invoke.MethodHandle r0 = java.lang.invoke.MethodHandles.insertArguments(r0, r1, r2)
            r1 = r10
            java.lang.invoke.MethodHandle r0 = java.lang.invoke.MethodHandles.explicitCastArguments(r0, r1)
            r-1.setTarget(r0)
            goto L62
            r12 = r-2
            java.lang.RuntimeException r-2 = new java.lang.RuntimeException
            r-1 = r-2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "su/catlean/jd"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " : "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " : "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r12
            r-1.<init>(r0, r1)
            throw r-2
            r-1 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jd.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
