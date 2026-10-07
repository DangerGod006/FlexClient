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
import net.minecraft.class_241;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/i6.class */
public final class i6 implements class_11280.class_11281 {
    private final float U;

    @NotNull
    private final Color M;

    @NotNull
    private final Color s;
    private final int d;
    private final int G;
    private final float X;
    private final float f;
    private final int m;
    private final float D;

    @NotNull
    private final class_241 Z;
    private final float J;
    private final float j;
    private static final String[] b;
    private static final String[] c;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;
    private static final long a = yz.a(8216273370705814828L, -8309457020984873276L, MethodHandles.lookup().lookupClass()).a(155671392935085L);
    private static final Map e = new HashMap(13);

    public i6(float time, @NotNull Color color, @NotNull Color color2, int colorMode, int glowQuality, float glowRadius, float glowAlphaMult, int glowThinOutline, float fillAlphaMult, @NotNull class_241 uHalfTexelSize, float uSaturation, long a2, float uBrightness) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20733, 4492393169420941122L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color2, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32218, 1970212930300336744L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(uHalfTexelSize, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17885, 5025955835917099619L ^ j) /* invoke-custom */);
        this.U = time;
        this.M = color;
        this.s = color2;
        this.d = colorMode;
        this.G = glowQuality;
        this.X = glowRadius;
        this.f = glowAlphaMult;
        this.m = glowThinOutline;
        this.D = fillAlphaMult;
        this.Z = uHalfTexelSize;
        this.J = uSaturation;
        this.j = uBrightness;
    }

    public final float n() {
        return this.U;
    }

    @NotNull
    public final Color u() {
        return this.M;
    }

    @NotNull
    public final Color O() {
        return this.s;
    }

    public final int k() {
        return this.d;
    }

    public final int Z() {
        return this.G;
    }

    public final float A() {
        return this.X;
    }

    public final float w() {
        return this.f;
    }

    public final int m() {
        return this.m;
    }

    public final float t() {
        return this.D;
    }

    @NotNull
    public final class_241 H() {
        return this.Z;
    }

    public final float l() {
        return this.J;
    }

    public final float T() {
        return this.j;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00a7: INVOKE (r-1 I:com.mojang.blaze3d.buffers.Std140Builder), (r0 I:float), (r1 I:float), (r2 I:float), (r3 I:float) VIRTUAL call: com.mojang.blaze3d.buffers.Std140Builder.putVec4(float, float, float, float):com.mojang.blaze3d.buffers.Std140Builder
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public void method_71104(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.i6.method_71104(java.nio.ByteBuffer):void");
    }

    public final float e() {
        return this.U;
    }

    @NotNull
    public final Color r() {
        return this.M;
    }

    @NotNull
    public final Color i() {
        return this.s;
    }

    public final int d() {
        return this.d;
    }

    public final int M() {
        return this.G;
    }

    public final float P() {
        return this.X;
    }

    public final float q() {
        return this.f;
    }

    public final int Y() {
        return this.m;
    }

    public final float X() {
        return this.D;
    }

    @NotNull
    public final class_241 x() {
        return this.Z;
    }

    public final float c() {
        return this.J;
    }

    public final float S() {
        return this.j;
    }

    @NotNull
    public final i6 O(long a2, float time, @NotNull Color color, @NotNull Color color2, int colorMode, int glowQuality, float glowRadius, float glowAlphaMult, char a3, int glowThinOutline, float fillAlphaMult, @NotNull class_241 uHalfTexelSize, float uSaturation, float uBrightness) {
        long j = ((a2 << 16) | ((((long) a3) << 48) >>> 48)) ^ a;
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10758, 6081899003034293104L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color2, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3365, 8948822259528823894L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(uHalfTexelSize, (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23638, 4910406629906392361L ^ j) /* invoke-custom */);
        return new i6(time, color, color2, colorMode, glowQuality, glowRadius, glowAlphaMult, glowThinOutline, fillAlphaMult, uHalfTexelSize, uSaturation, j ^ 14243538785817L, uBrightness);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:36:0x00bb
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static su.catlean.i6 c(su.catlean.i6 r17, float r18, java.awt.Color r19, java.awt.Color r20, long r21, int r23, int r24, float r25, float r26, int r27, float r28, net.minecraft.class_241 r29, float r30, float r31, int r32, java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.i6.c(su.catlean.i6, float, java.awt.Color, java.awt.Color, long, int, int, float, float, int, float, net.minecraft.class_241, float, float, int, java.lang.Object):su.catlean.i6");
    }

    @NotNull
    public String toString() {
        long j = a ^ 112551529884007L;
        return (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11229, 7020572574263454573L ^ j) /* invoke-custom */ + this.U + (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22793, 7357226646551320998L ^ j) /* invoke-custom */ + this.M + (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2236, 1100988372318259224L ^ j) /* invoke-custom */ + this.s + (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9454, 7210375081685951552L ^ j) /* invoke-custom */ + this.d + (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31726, 5615308081095736141L ^ j) /* invoke-custom */ + this.G + (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7706, 4678603195603590825L ^ j) /* invoke-custom */ + this.X + (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20288, 5262887421572534252L ^ j) /* invoke-custom */ + this.f + (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23162, 5507573687138179805L ^ j) /* invoke-custom */ + this.m + (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8956, 7065334684674761310L ^ j) /* invoke-custom */ + this.D + (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25159, 3802176292681179894L ^ j) /* invoke-custom */ + this.Z + (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3641, 511132436349980304L ^ j) /* invoke-custom */ + this.J + (String) a(MethodHandles.lookup(), "y", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23009, 8698570144120002881L ^ j) /* invoke-custom */ + this.j + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    public int hashCode() {
        long j = a ^ 10352253748229L;
        int iHashCode = (((Float.hashCode(this.U) * (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13600, 3585719215027136577L ^ j) /* invoke-custom */) + this.M.hashCode()) * (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18011, 2502751667045849904L ^ j) /* invoke-custom */) + this.s.hashCode();
        (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5612708263600431578L, j) /* invoke-custom */;
        Object objV = (((((((((((((((((iHashCode * (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18011, 2502751667045849904L ^ j) /* invoke-custom */) + Integer.hashCode(this.d)) * (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18011, 2502751667045849904L ^ j) /* invoke-custom */) + Integer.hashCode(this.G)) * (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18011, 2502751667045849904L ^ j) /* invoke-custom */) + Float.hashCode(this.X)) * (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18011, 2502751667045849904L ^ j) /* invoke-custom */) + Float.hashCode(this.f)) * (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18011, 2502751667045849904L ^ j) /* invoke-custom */) + Integer.hashCode(this.m)) * (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18011, 2502751667045849904L ^ j) /* invoke-custom */) + Float.hashCode(this.D)) * (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18011, 2502751667045849904L ^ j) /* invoke-custom */) + this.Z.hashCode()) * (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18011, 2502751667045849904L ^ j) /* invoke-custom */) + Float.hashCode(this.J)) * (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18011, 2502751667045849904L ^ j) /* invoke-custom */) + Float.hashCode(this.j);
        try {
            objV = objV;
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5586593437435319062L, j) /* invoke-custom */ != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[2], 5493489362575141690L, j) /* invoke-custom */;
            }
            return objV;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objV, 5608910536504879396L, j) /* invoke-custom */;
        }
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
            Method dump skipped, instruction units count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.i6.equals(java.lang.Object):boolean");
    }

    static {
        int i2;
        long j = a ^ 5298140722440L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[19];
        int i4 = 0;
        String str = "èé\u009a\u001b(\u0086á\u009e\u0085·å\u001e\u0083f \u000f\u001d\u0019k\u0016Ö\u0089J\u0089¶Õum\u0018\u009b¢\u0090\u0018\u0016UÒ\u009f)¦\u0086\u0086\u0086EêÚlT\u000fñng\u0099þP}#i 8\u001b\u009d¤Dj\u0019Z\u0000\u0097\u000eÏ¯\u0090J§¾»jN[Lxr·ýFvJðñ\u0014(öÖº²\u00182qj9[*æ£<2tßt×à\u0094²=\u0011\u0082S%_\u008a¼\u0007Ã\u001fµ\rgd»\u0016ã\u0010Ï\u0003\n@Þ\u0012ó\u0081Q\u0017Á¦!\u0093»\t\u0018°\u0006G¤ãÙ«híÀÄ\tá!¯ô÷¿§yJ¦I\u0011(úÏ³Ëa®\u0000Ä\u0011vN\u0092Å\u001dû\u008b§n¡5Ñ;0Ú_x_iD»[x\r\u001fÈ*¯\u0089½9\u0010ª\u0019)Â¨F\u009a\u000fß\u001bï>\u009cÅ@¿ 3\u000få£`e!ñý(Ä\u0002¯-jö0¨\u0019gmD\u0095ûÑé\u000e>vï.Ø\u0010\u0010\u0080\u000b®rp\u0016u>ÏQ·\u00920\u0019\u0005\u0010;Afn\u008a!ÐÝre\u001f6Yý\u0095\\\u0018~:\u0006\u0016\u0007Èý°\u007fd\u008c\u0081±Y^Òø¼Ö4\u000b\u0085#È\u0010\u0089(4\nJX\u0094UEò\u001b2 µ\tk(\u008f\\ì¸\u008cz\u001dT=÷}sÉ\u008fyþ\u000f\u0016ST»\u0095\u001e\u0097×\u0090P×\u0090Ë\u0082\u0080\u0099&e´îJÁT\u0018\u0088_Ì\u0000\u0011\u0081\u0099R\u0089ÏOú>\u009f\u0094PÍÛ\u008bt\u0090µ % E³ÍÍ\bÒÿð5Â\u001b}ô3ã£\u009cr\u0010£2ÆQ8*ßî\u0099\u001f¦¢Í(\u0016\u0006*¼Ýd\u0005\u009eÿ â\u008dtöYs1\u0088WÚ<ÐÊH\u0086\u0098eñZ·ïd÷brÒ/4µô";
        int length = "èé\u009a\u001b(\u0086á\u009e\u0085·å\u001e\u0083f \u000f\u001d\u0019k\u0016Ö\u0089J\u0089¶Õum\u0018\u009b¢\u0090\u0018\u0016UÒ\u009f)¦\u0086\u0086\u0086EêÚlT\u000fñng\u0099þP}#i 8\u001b\u009d¤Dj\u0019Z\u0000\u0097\u000eÏ¯\u0090J§¾»jN[Lxr·ýFvJðñ\u0014(öÖº²\u00182qj9[*æ£<2tßt×à\u0094²=\u0011\u0082S%_\u008a¼\u0007Ã\u001fµ\rgd»\u0016ã\u0010Ï\u0003\n@Þ\u0012ó\u0081Q\u0017Á¦!\u0093»\t\u0018°\u0006G¤ãÙ«híÀÄ\tá!¯ô÷¿§yJ¦I\u0011(úÏ³Ëa®\u0000Ä\u0011vN\u0092Å\u001dû\u008b§n¡5Ñ;0Ú_x_iD»[x\r\u001fÈ*¯\u0089½9\u0010ª\u0019)Â¨F\u009a\u000fß\u001bï>\u009cÅ@¿ 3\u000få£`e!ñý(Ä\u0002¯-jö0¨\u0019gmD\u0095ûÑé\u000e>vï.Ø\u0010\u0010\u0080\u000b®rp\u0016u>ÏQ·\u00920\u0019\u0005\u0010;Afn\u008a!ÐÝre\u001f6Yý\u0095\\\u0018~:\u0006\u0016\u0007Èý°\u007fd\u008c\u0081±Y^Òø¼Ö4\u000b\u0085#È\u0010\u0089(4\nJX\u0094UEò\u001b2 µ\tk(\u008f\\ì¸\u008cz\u001dT=÷}sÉ\u008fyþ\u000f\u0016ST»\u0095\u001e\u0097×\u0090P×\u0090Ë\u0082\u0080\u0099&e´îJÁT\u0018\u0088_Ì\u0000\u0011\u0081\u0099R\u0089ÏOú>\u009f\u0094PÍÛ\u008bt\u0090µ % E³ÍÍ\bÒÿð5Â\u001b}ô3ã£\u009cr\u0010£2ÆQ8*ßî\u0099\u001f¦¢Í(\u0016\u0006*¼Ýd\u0005\u009eÿ â\u008dtöYs1\u0088WÚ<ÐÊH\u0086\u0098eñZ·ïd÷brÒ/4µô".length();
        char cCharAt = ' ';
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = a(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
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
                            c = new String[19];
                            i = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[11];
                            int i10 = 0;
                            String str3 = "^LRMáVmû·\u0087²´\u008c¯\u0002W;üÏô,\fßÏÛÓ(\u0098Ì\u0012ðW{¾Þº\u001dotÚÆ©Ø^:`\"%\u008c\u0006H²\f(w\u009dF\u0005a\u008cÛ-\u0085apna\u0000D\rØÞ";
                            int length2 = "^LRMáVmû·\u0087²´\u008c¯\u0002W;üÏô,\fßÏÛÓ(\u0098Ì\u0012ðW{¾Þº\u001dotÚÆ©Ø^:`\"%\u008c\u0006H²\f(w\u009dF\u0005a\u008cÛ-\u0085apna\u0000D\rØÞ".length();
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
                                                h = new Integer[11];
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i11 >= length2) {
                                                str3 = "\u008e\u0098\u0093\u0093Îö»¶ÅöæMÃ7!Ô";
                                                length2 = "\u008e\u0098\u0093\u0093Îö»¶ÅöæMÃ7!Ô".length();
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
                        str = "&ß\u0017ùÐvBåwÏ<ëUu¢,Ø-a\u000b\u0094Î=hÆ¸²Í\u001d0ñÊlÞt¤²Í~E\u0018\u0018\u001am<·6øû'\u0090øÐ1@ )\u0017ËìA\u0083\u0090Ð\u0013";
                        length = "&ß\u0017ùÐvBåwÏ<ëUu¢,Ø-a\u000b\u0094Î=hÆ¸²Í\u001d0ñÊlÞt¤²Í~E\u0018\u0018\u001am<·6øû'\u0090øÐ1@ )\u0017ËìA\u0083\u0090Ð\u0013".length();
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

    private static String a(byte[] bArr) {
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

    private static String a(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 8469;
        if (c[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i3] = a(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/i6", e2);
            }
        }
        return c[i3];
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
            r1 = 1
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
            java.lang.String r1 = "su/catlean/i6"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.i6.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 20917;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/i6", e2);
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
            r1 = 1
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
            java.lang.String r1 = "su/catlean/i6"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.i6.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
