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

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/z0.class */
public final class z0 implements class_11280.class_11281 {
    private final float q;
    private final float P;

    @NotNull
    private final Color k;
    private final float p;
    private static final String[] b;
    private static final String[] c;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final long a = yz.a(-6525553850541739973L, -2200340985123166761L, MethodHandles.lookup().lookupClass()).a(63127432282481L);
    private static final Map d = new HashMap(13);

    public z0(float halfTexelSizeX, float halfTexelSizeY, long a2, @NotNull Color color, float lineWidth) {
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27348, 1037147660693151566L ^ (a ^ a2)) /* invoke-custom */);
        this.q = halfTexelSizeX;
        this.P = halfTexelSizeY;
        this.k = color;
        this.p = lineWidth;
    }

    public final float A() {
        return this.q;
    }

    public final float h() {
        return this.P;
    }

    @NotNull
    public final Color W() {
        return this.k;
    }

    public final float v() {
        return this.p;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00ab: INVOKE (r-1 I:com.mojang.blaze3d.buffers.Std140Builder), (r0 I:float), (r1 I:float), (r2 I:float), (r3 I:float) VIRTUAL call: com.mojang.blaze3d.buffers.Std140Builder.putVec4(float, float, float, float):com.mojang.blaze3d.buffers.Std140Builder
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public void method_71104(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r12) {
        /*
            r11 = this;
            long r0 = su.catlean.z0.a
            r1 = 120881921072125(0x6df103f71bfd, double:5.972360440503E-310)
            long r0 = r0 ^ r1
            r13 = r0
            r0 = r13
            r1 = r0; r1 = r0; 
            r2 = 35815211655996(0x2092e0f7e33c, double:1.76950656777606E-310)
            long r1 = r1 ^ r2
            r15 = r1
            r1 = r0; r2 = r0; 
            r2 = 132212822850449(0x783f32573b91, double:6.53218137101014E-310)
            long r1 = r1 ^ r2
            r17 = r1
            r1 = r0; r2 = r0; 
            r2 = 24153619280699(0x15f7b3e5b33b, double:1.1933473509322E-310)
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
            r2 = 15680355147829(0xe42ddffa035, double:7.7471247931322E-311)
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
            r1 = 13522(0x34d2, float:1.8948E-41)
            r2 = 3616359918094774967(0x322fe42f69fff2b7, double:5.914579297002881E-67)
            r3 = r13
            long r2 = r2 ^ r3
            java.lang.String r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/z0;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "a"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r12
            com.mojang.blaze3d.buffers.Std140Builder r0 = com.mojang.blaze3d.buffers.Std140Builder.intoBuffer(r0)
            r1 = r11
            float r1 = r1.q
            r2 = r11
            float r2 = r2.P
            com.mojang.blaze3d.buffers.Std140Builder r0 = r0.putVec2(r1, r2)
            su.catlean.jl r1 = su.catlean.jl.y
            r2 = r11
            java.awt.Color r2 = r2.k
            r3 = r19
            char r3 = (char) r3
            r4 = r20
            short r4 = (short) r4
            r5 = r21
            float r1 = r1.y(r2, r3, r4, r5)
            su.catlean.jl r2 = su.catlean.jl.y
            r3 = r11
            java.awt.Color r3 = r3.k
            r4 = r17
            r5 = r4; r4 = r3; r3 = r5; 
            float r1 = r1.M(r2, r3)
            su.catlean.jl r2 = su.catlean.jl.y
            r3 = r11
            java.awt.Color r3 = r3.k
            r4 = r22
            r5 = r24
            float r2 = r2.r(r3, r4, r5)
            su.catlean.jl r3 = su.catlean.jl.y
            r4 = r11
            java.awt.Color r4 = r4.k
            r5 = r15
            r6 = r5; r5 = r4; r4 = r6; 
            float r3 = r3.G(r4, r5)
            r-1.putVec4(r0, r1, r2, r3)
            r0 = r11
            float r0 = r0.p
            r-1.putFloat(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.z0.method_71104(java.nio.ByteBuffer):void");
    }

    public final float j() {
        return this.q;
    }

    public final float b() {
        return this.P;
    }

    @NotNull
    public final Color Y() {
        return this.k;
    }

    public final float U() {
        return this.p;
    }

    @NotNull
    public final z0 N(float halfTexelSizeX, float halfTexelSizeY, @NotNull Color color, long a2, float lineWidth) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8410, 1351571666145403062L ^ j) /* invoke-custom */);
        return new z0(halfTexelSizeX, halfTexelSizeY, j ^ 49914879175486L, color, lineWidth);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:16:0x004d
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static su.catlean.z0 f(su.catlean.z0 r8, long r9, float r11, float r12, java.awt.Color r13, float r14, int r15, java.lang.Object r16) {
        /*
            long r0 = su.catlean.z0.a
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 58615325697689(0x354f71aaa699, double:2.89598187470237E-310)
            long r1 = r1 ^ r2
            r17 = r1
            r0 = 4204502894525732455(0x3a59651b2d4ed667, double:1.2821171225975285E-27)
            r1 = r9
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r19 = r0
            r0 = r15
            r1 = 1
            r0 = r0 & r1
            r1 = r19
            if (r1 != 0) goto L3c
            if (r0 == 0) goto L38
            goto L33
        L29:
            r1 = 4217246488637688257(0x3a86ab56658349c1, double:9.156052125748587E-27)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L33:
            r0 = r8
            float r0 = r0.q
            r11 = r0
        L38:
            r0 = r15
            r1 = 2
            r0 = r0 & r1
        L3c:
            r1 = r19
            r2 = r9
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L63
            if (r1 != 0) goto L61
            if (r0 == 0) goto L5d
            goto L57
        L4d:
            r1 = 4217246488637688257(0x3a86ab56658349c1, double:9.156052125748587E-27)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L57:
            r0 = r8
            float r0 = r0.P
            r12 = r0
        L5d:
            r0 = r15
            r1 = 4
            r0 = r0 & r1
        L61:
            r1 = r19
        L63:
            if (r1 != 0) goto L8c
            if (r0 == 0) goto L7c
            goto L76
        L6c:
            r1 = 4217246488637688257(0x3a86ab56658349c1, double:9.156052125748587E-27)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L76:
            r0 = r8
            java.awt.Color r0 = r0.k
            r13 = r0
        L7c:
            r0 = r15
            r1 = 10450(0x28d2, float:1.4644E-41)
            r2 = 2881395744458284634(0x27fcc629cdc21e5a, double:4.564183107688672E-116)
            r3 = r9
            long r2 = r2 ^ r3
            int r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/z0;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "l"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r1, r2)
            r0 = r0 & r1
        L8c:
            if (r0 == 0) goto L95
            r0 = r8
            float r0 = r0.p
            r14 = r0
        L95:
            r0 = r8
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r17
            r5 = r14
            su.catlean.z0 r0 = r0.N(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.z0.f(su.catlean.z0, long, float, float, java.awt.Color, float, int, java.lang.Object):su.catlean.z0");
    }

    @NotNull
    public String toString() {
        long j = a ^ 67885645537807L;
        return (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32473, 2077603476970799433L ^ j) /* invoke-custom */ + this.q + (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11781, 7354157288344932758L ^ j) /* invoke-custom */ + this.P + (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26087, 3529615143642438257L ^ j) /* invoke-custom */ + this.k + (String) a(MethodHandles.lookup(), "a", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9969, 4787746366882634083L ^ j) /* invoke-custom */ + this.p + ")";
    }

    public int hashCode() {
        long j = a ^ 107378999226486L;
        return (((((Float.hashCode(this.q) * (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29249, 8467353818098585882L ^ j) /* invoke-custom */) + Float.hashCode(this.P)) * (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15099, 5096590060889348515L ^ j) /* invoke-custom */) + this.k.hashCode()) * (int) b(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15099, 5096590060889348515L ^ j) /* invoke-custom */) + Float.hashCode(this.p);
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
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.z0.equals(java.lang.Object):boolean");
    }

    static {
        int i;
        long j = a ^ 7705093482594L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[7];
        int i3 = 0;
        String str = "¥\u0086çîj\n&0\u0002SÔ¼\u00ad]\u0004v\u0012\u008em\u0081L'ÖG'\u0092¢\u0084»\u0090 \u0003\u0095¢\u009búÃ,Iy \u000f]úr%\u0018b\u0001x\u0090S®$\u0081Ó\\È\u0093\u00854¦°3¢å¼ûÉ4xeÇ\u0010G¬,¤\u0087õ\\¨m¼ÇT\u001eå_'8.Ý\u001föºx,l\u0080c\u0092³8æEÉå\u0001\u0098ûï'¾\u0095?qS{¬å÷mì»>?1ïì£7N+\u001b²? 7Z¥\u0012:\f¹kã\u0010\u0086*Eà¬\u001b\u0014Æ\u0082%Îøë¬à#";
        int length = "¥\u0086çîj\n&0\u0002SÔ¼\u00ad]\u0004v\u0012\u008em\u0081L'ÖG'\u0092¢\u0084»\u0090 \u0003\u0095¢\u009búÃ,Iy \u000f]úr%\u0018b\u0001x\u0090S®$\u0081Ó\\È\u0093\u00854¦°3¢å¼ûÉ4xeÇ\u0010G¬,¤\u0087õ\\¨m¼ÇT\u001eå_'8.Ý\u001föºx,l\u0080c\u0092³8æEÉå\u0001\u0098ûï'¾\u0095?qS{¬å÷mì»>?1ïì£7N+\u001b²? 7Z¥\u0012:\f¹kã\u0010\u0086*Eà¬\u001b\u0014Æ\u0082%Îøë¬à#".length();
        char cCharAt = '(';
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
                        if (i7 >= length) {
                            b = strArr;
                            c = new String[7];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[3];
                            int i9 = 0;
                            int length2 = "B{ë^}/\u001bÂEò\u000b1b\r\u0015\u0096\u0091+:¼á&RÃ".length();
                            int i10 = 0;
                            do {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = "B{ë^}/\u001bÂEò\u000b1b\r\u0015\u0096\u0091+:¼á&RÃ".substring(i11, i10).getBytes("ISO-8859-1");
                                i9++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i10 < length2);
                            e = jArr;
                            f = new Integer[3];
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i12 = i3;
                        i3++;
                        strArr[i12] = strIntern;
                        int i13 = i5 + cCharAt;
                        i4 = i13;
                        if (i13 < length) {
                        }
                        str = "P\u0005\u0014÷Ê®\n\u009dÛ\u001c-\u0088\u009f§jèj\u0083£ª\bî\u0007ê¿«Ú\n¡åá+\u0010S´Wcñ\u0017Ñ åÿ\u0084ÑÁéÅ7";
                        length = "P\u0005\u0014÷Ê®\n\u009dÛ\u001c-\u0088\u009f§jèj\u0083£ª\bî\u0007ê¿«Ú\n¡åá+\u0010S´Wcñ\u0017Ñ åÿ\u0084ÑÁéÅ7".length();
                        cCharAt = ' ';
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 848;
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
                throw new RuntimeException("su/catlean/z0", e2);
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
            r1 = 1065353216(0x3f800000, float:1.0)
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
            java.lang.String r1 = "su/catlean/z0"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.z0.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 3555;
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
                    throw new RuntimeException("su/catlean/z0", e2);
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
            r1 = 1065353216(0x3f800000, float:1.0)
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
            java.lang.String r1 = "su/catlean/z0"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.z0.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
