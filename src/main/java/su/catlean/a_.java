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

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/a_.class */
public final class a_ implements class_11280.class_11281 {
    private final float S;
    private final float Z;
    private final float I;
    private final float Q;
    private final float F;

    @NotNull
    private final Color K;

    @NotNull
    private final Color o;
    private final float q;
    private static final String[] b;
    private static final String[] c;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final long a = yz.a(-6363162574684976107L, 5767215486636573369L, MethodHandles.lookup().lookupClass()).a(257746452321548L);
    private static final Map d = new HashMap(13);

    public a_(short a2, float uSizeX, float uSizeY, float uRadius, float uAlpha, float uBorderWidth, int a3, @NotNull Color uColor, @NotNull Color uBorderColor, short a4, float uMix) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter(uColor, (String) a(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4959, 6906655287854464934L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(uBorderColor, (String) a(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30150, 7445293992861079868L ^ j) /* invoke-custom */);
        this.S = uSizeX;
        this.Z = uSizeY;
        this.I = uRadius;
        this.Q = uAlpha;
        this.F = uBorderWidth;
        this.K = uColor;
        this.o = uBorderColor;
        this.q = uMix;
    }

    public final float M() {
        return this.S;
    }

    public final float l() {
        return this.Z;
    }

    public final float Z() {
        return this.I;
    }

    public final float k() {
        return this.Q;
    }

    public final float h() {
        return this.F;
    }

    @NotNull
    public final Color Q() {
        return this.K;
    }

    @NotNull
    public final Color E() {
        return this.o;
    }

    public final float X() {
        return this.q;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00b9: INVOKE (r-1 I:com.mojang.blaze3d.buffers.Std140Builder), (r0 I:float), (r1 I:float), (r2 I:float), (r3 I:float) VIRTUAL call: com.mojang.blaze3d.buffers.Std140Builder.putVec4(float, float, float, float):com.mojang.blaze3d.buffers.Std140Builder
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public void method_71104(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.a_.method_71104(java.nio.ByteBuffer):void");
    }

    public final float U() {
        return this.S;
    }

    public final float n() {
        return this.Z;
    }

    public final float w() {
        return this.I;
    }

    public final float r() {
        return this.Q;
    }

    public final float F() {
        return this.F;
    }

    @NotNull
    public final Color B() {
        return this.K;
    }

    @NotNull
    public final Color m() {
        return this.o;
    }

    public final float S() {
        return this.q;
    }

    @NotNull
    public final a_ b(float uSizeX, float uSizeY, long a2, float uRadius, float uAlpha, float uBorderWidth, @NotNull Color uColor, @NotNull Color uBorderColor, float uMix) {
        long j = a ^ a2;
        long j2 = j ^ 96748643845073L;
        int i = (int) (j >>> 48);
        int i2 = (int) ((j2 << 16) >>> 32);
        int i3 = (int) ((j2 << 48) >>> 48);
        Intrinsics.checkNotNullParameter(uColor, (String) a(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20815, 8555897359802666718L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(uBorderColor, (String) a(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26796, 3704765552561993526L ^ j) /* invoke-custom */);
        return new a_((short) i, uSizeX, uSizeY, uRadius, uAlpha, uBorderWidth, i2, uColor, uBorderColor, (short) i3, uMix);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public static a_ Z(a_ a_Var, long j, float f2, float f3, float f4, float f5, float f6, Color color, Color color2, float f7, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 89131818360695L;
        ?? r0 = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8504367084600138300L, j2) /* invoke-custom */;
        try {
            r0 = i & 1;
            ?? r02 = r0;
            if (r0 == 0) {
                if (r0 != 0) {
                    f2 = a_Var.S;
                }
                r02 = i & 2;
            }
            ?? r1 = r0;
            ?? r03 = r02;
            ?? r04 = r02;
            ?? r12 = r1;
            if (j2 >= 0) {
                if (r1 == 0) {
                    if (r02 != 0) {
                        f3 = a_Var.Z;
                    }
                    r03 = i & 4;
                }
                r12 = r0;
                r04 = r03;
            }
            ?? T = r04;
            ?? r05 = r04;
            ?? r13 = r12;
            if (j2 > 0) {
                if (r12 == 0) {
                    if (r04 != 0) {
                        f4 = a_Var.I;
                    }
                    T = i & (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10205, 1479405512086075631L ^ j2) /* invoke-custom */;
                }
                r13 = r0;
                r05 = T;
            }
            ?? T2 = r05;
            ?? r06 = r05;
            ?? r14 = r13;
            if (j2 >= 0) {
                if (r13 == 0) {
                    if (r05 != 0) {
                        f5 = a_Var.Q;
                    }
                    T2 = i & (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27972, 8033910565267305073L ^ j2) /* invoke-custom */;
                }
                r14 = r0;
                r06 = T2;
            }
            ?? T3 = r06;
            ?? r07 = r06;
            ?? r15 = r14;
            if (j2 >= 0) {
                if (r14 == 0) {
                    if (r06 != 0) {
                        f6 = a_Var.F;
                    }
                    T3 = i & (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6488, 4788752432554837615L ^ j2) /* invoke-custom */;
                }
                r15 = r0;
                r07 = T3;
            }
            ?? T4 = r07;
            ?? T5 = r07;
            ?? r16 = r15;
            if (j2 >= 0) {
                if (r15 == 0) {
                    if (r07 != 0) {
                        color = a_Var.K;
                    }
                    T4 = i & (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21965, 6719105824185338622L ^ j2) /* invoke-custom */;
                }
                r16 = r0;
                T5 = T4;
            }
            if (r16 == 0) {
                if (T5 != 0) {
                    color2 = a_Var.o;
                }
                T5 = i & (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23446, 1959122357781447846L ^ j2) /* invoke-custom */;
            }
            if (T5 != 0) {
                f7 = a_Var.q;
            }
            return a_Var.b(f2, f3, j3, f4, f5, f6, color, color2, f7);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -8513294464179931038L, j2) /* invoke-custom */;
        }
    }

    @NotNull
    public String toString() {
        long j = a ^ 36966515621531L;
        return (String) a(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2805, 8385499547577187399L ^ j) /* invoke-custom */ + this.S + (String) a(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30073, 7112471468436849608L ^ j) /* invoke-custom */ + this.Z + (String) a(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8147, 8686185175577913710L ^ j) /* invoke-custom */ + this.I + (String) a(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28802, 152495662492059197L ^ j) /* invoke-custom */ + this.Q + (String) a(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23745, 6911223106115873405L ^ j) /* invoke-custom */ + this.F + (String) a(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26359, 1060051208771407949L ^ j) /* invoke-custom */ + this.K + (String) a(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22932, 338736592450989869L ^ j) /* invoke-custom */ + this.o + (String) a(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19013, 7219276265820536054L ^ j) /* invoke-custom */ + this.q + ")";
    }

    public int hashCode() {
        long j = a ^ 83923291448417L;
        return (((((((((((((Float.hashCode(this.S) * (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4654, 7816845894958846213L ^ j) /* invoke-custom */) + Float.hashCode(this.Z)) * (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28980, 582715975789867544L ^ j) /* invoke-custom */) + Float.hashCode(this.I)) * (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28980, 582715975789867544L ^ j) /* invoke-custom */) + Float.hashCode(this.Q)) * (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28980, 582715975789867544L ^ j) /* invoke-custom */) + Float.hashCode(this.F)) * (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28980, 582715975789867544L ^ j) /* invoke-custom */) + this.K.hashCode()) * (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28980, 582715975789867544L ^ j) /* invoke-custom */) + this.o.hashCode()) * (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28980, 582715975789867544L ^ j) /* invoke-custom */) + Float.hashCode(this.q);
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
            Method dump skipped, instruction units count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.a_.equals(java.lang.Object):boolean");
    }

    static {
        int i;
        long j = a ^ 118224647653834L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[13];
        int i3 = 0;
        String str = "ZyÛR\\IëgÖ\u0017,\u0093\u0018\u008a½äÝ)§c,GWfl¯å|´´\u0004*\u0010]¨q®ú®\u0081\u0082ö\u00adÃ\u000fa\u0098&ù\u0018\u0013\u007fi\u0098!\u0005uAíÌ/úv\u0003Ò9\u000f\u001a+oº\u0017\u0015\u0083\u0018®lD#Ú\u0089U \\\u009aÐ\u001ao<{ý\u000b\u0007`\u0001>ðg} ¬¸\u0091ã\u0014\u008e¿@FCÃIK>\u0088ñ\u0099:/«\u0085ã¬6BE\u001a*Ë¨#Ç ´Ù\u0001*5@Lsã.c¬>Ö%\r½B[¼z´ËÇ\u0095%ûu\u008b\u009em0\u0018;¹ë=sEp>\u009f¦PD¤ÏäQy¸\u0097O\u009a¶$\u0092 ®¬°Ìw¦Bªxâ\u0092óòk}Òä\u0095V\u0090\u00945»\u0087»\u0083¢Üß\"@\u0099 ÂlX!\u0014¹B0)\t°ÿ\u0003wc\u0086^:\u007f\u0000Úô~\u000b¹\u0099Ì\tOtó\u008b\u0010fàª°{¥\nç\"AÏ\u0097i\u009dUÿ\u0010\u0010\t\u0015ûÎ²>#\b£ í¬\u0083k.";
        int length = "ZyÛR\\IëgÖ\u0017,\u0093\u0018\u008a½äÝ)§c,GWfl¯å|´´\u0004*\u0010]¨q®ú®\u0081\u0082ö\u00adÃ\u000fa\u0098&ù\u0018\u0013\u007fi\u0098!\u0005uAíÌ/úv\u0003Ò9\u000f\u001a+oº\u0017\u0015\u0083\u0018®lD#Ú\u0089U \\\u009aÐ\u001ao<{ý\u000b\u0007`\u0001>ðg} ¬¸\u0091ã\u0014\u008e¿@FCÃIK>\u0088ñ\u0099:/«\u0085ã¬6BE\u001a*Ë¨#Ç ´Ù\u0001*5@Lsã.c¬>Ö%\r½B[¼z´ËÇ\u0095%ûu\u008b\u009em0\u0018;¹ë=sEp>\u009f¦PD¤ÏäQy¸\u0097O\u009a¶$\u0092 ®¬°Ìw¦Bªxâ\u0092óòk}Òä\u0095V\u0090\u00945»\u0087»\u0083¢Üß\"@\u0099 ÂlX!\u0014¹B0)\t°ÿ\u0003wc\u0086^:\u007f\u0000Úô~\u000b¹\u0099Ì\tOtó\u008b\u0010fàª°{¥\nç\"AÏ\u0097i\u009dUÿ\u0010\u0010\t\u0015ûÎ²>#\b£ í¬\u0083k.".length();
        char cCharAt = ' ';
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
                            c = new String[13];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[7];
                            int i9 = 0;
                            String str3 = "©X[êv\u008a3\u0080F\u0096Ð\u0092Í\u0010íìd?\u0091bÆÿM\u0094\u000b'À!ò]ÂhÓ2\u00adô?[Üµ";
                            int length2 = "©X[êv\u008a3\u0080F\u0096Ð\u0092Í\u0010íìd?\u0091bÆÿM\u0094\u000b'À!ò]ÂhÓ2\u00adô?[Üµ".length();
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
                                                f = new Integer[7];
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "þ§\u0013ho\u007f¥Ð\u0086XÞ÷\u001f\u0098\u00ad\u0001";
                                                length2 = "þ§\u0013ho\u007f¥Ð\u0086XÞ÷\u001f\u0098\u00ad\u0001".length();
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
                        str = "ïE\r\u0083Ñ\nGRD'\u0018«e£6Û;\u009bMÝo2\u0012!´*F\u0081\n\u0099\u0012æx¿\u0084ÜË¼\u001bë\u00102Ù7\u0095Ü\u0018/\b\t\u0016¹QOêÜ¤";
                        length = "ïE\r\u0083Ñ\nGRD'\u0018«e£6Û;\u009bMÝo2\u0012!´*F\u0081\n\u0099\u0012æx¿\u0084ÜË¼\u001bë\u00102Ù7\u0095Ü\u0018/\b\t\u0016¹QOêÜ¤".length();
                        cCharAt = '(';
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 30870;
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
                throw new RuntimeException("su/catlean/a_", e2);
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
            java.lang.String r1 = "su/catlean/a_"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.a_.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 6139;
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
                    throw new RuntimeException("su/catlean/a_", e2);
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
            java.lang.String r1 = "su/catlean/a_"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.a_.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
