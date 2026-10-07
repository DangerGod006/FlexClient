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

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/lc.class */
public final class lc implements class_11280.class_11281 {
    private final float e;
    private final float D;

    @NotNull
    private final Color N;

    @NotNull
    private final Color C;

    @NotNull
    private final Color P;

    @NotNull
    private final Color g;
    private final float Z;
    private final float F;
    private static final String[] b;
    private static final String[] c;
    private static final long[] f;
    private static final Integer[] h;
    private static final Map i;
    private static final long a = yz.a(-3199097495515647968L, -6012671410044015894L, MethodHandles.lookup().lookupClass()).a(24272069776065L);
    private static final Map d = new HashMap(13);

    public lc(byte a2, float halfTexelSizeX, float halfTexelSizeY, @NotNull Color color1, @NotNull Color color2, @NotNull Color color3, long a3, @NotNull Color color4, float lineWidth, float time) {
        long j = ((((long) a2) << 56) | ((a3 << 8) >>> 8)) ^ a;
        Intrinsics.checkNotNullParameter(color1, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11400, 8630042021760776169L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color2, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4784, 94274096983345627L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color3, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23935, 1306067191305324061L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color4, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31226, 1196365297127744146L ^ j) /* invoke-custom */);
        this.e = halfTexelSizeX;
        this.D = halfTexelSizeY;
        this.N = color1;
        this.C = color2;
        this.P = color3;
        this.g = color4;
        this.Z = lineWidth;
        this.F = time;
    }

    public final float U() {
        return this.e;
    }

    public final float o() {
        return this.D;
    }

    @NotNull
    public final Color l() {
        return this.N;
    }

    @NotNull
    public final Color Z() {
        return this.C;
    }

    @NotNull
    public final Color E() {
        return this.P;
    }

    @NotNull
    public final Color B() {
        return this.g;
    }

    public final float j() {
        return this.Z;
    }

    public final float y() {
        return this.F;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00f3: INVOKE (r-2 I:com.mojang.blaze3d.buffers.Std140Builder) = (r-2 I:com.mojang.blaze3d.buffers.Std140Builder), (r-1 I:float), (r0 I:float), (r1 I:float), (r2 I:float) VIRTUAL call: com.mojang.blaze3d.buffers.Std140Builder.putVec4(float, float, float, float):com.mojang.blaze3d.buffers.Std140Builder
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public void method_71104(@org.jetbrains.annotations.NotNull java.nio.ByteBuffer r13) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.lc.method_71104(java.nio.ByteBuffer):void");
    }

    public final float W() {
        return this.e;
    }

    public final float b() {
        return this.D;
    }

    @NotNull
    public final Color s() {
        return this.N;
    }

    @NotNull
    public final Color T() {
        return this.C;
    }

    @NotNull
    public final Color H() {
        return this.P;
    }

    @NotNull
    public final Color P() {
        return this.g;
    }

    public final float e() {
        return this.Z;
    }

    public final float X() {
        return this.F;
    }

    @NotNull
    public final lc Y(float halfTexelSizeX, float halfTexelSizeY, int a2, @NotNull Color color1, int a3, char a4, @NotNull Color color2, @NotNull Color color3, @NotNull Color color4, float lineWidth, float time) {
        long j = (((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a;
        int i2 = (int) (j >>> 56);
        long j2 = ((j ^ 69380126930279L) << 8) >>> 8;
        Intrinsics.checkNotNullParameter(color1, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6216, 2248534000274209139L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color2, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3420, 9199166437090716769L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color3, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1423, 1739271841874699454L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color4, (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11705, 8520125065341848714L ^ j) /* invoke-custom */);
        return new lc((byte) i2, halfTexelSizeX, halfTexelSizeY, color1, color2, color3, j2, color4, lineWidth, time);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v47 */
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
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public static lc P(lc lcVar, float f2, float f3, Color color, char c2, Color color2, Color color3, Color color4, float f4, long j, float f5, int i2, Object obj) {
        long j2 = ((((long) c2) << 48) | ((j << 16) >>> 16)) ^ a;
        long j3 = j2 ^ 101358297704439L;
        int i3 = (int) (j2 >>> 32);
        int i4 = (int) ((j3 << 32) >>> 48);
        int i5 = (int) ((j3 << 48) >>> 48);
        ?? r0 = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2936949807934850300L, j2) /* invoke-custom */;
        try {
            r0 = i2 & 1;
            ?? r02 = r0;
            if (r0 == 0) {
                if (r0 != 0) {
                    f2 = lcVar.e;
                }
                r02 = i2 & 2;
            }
            ?? r1 = r0;
            ?? r03 = r02;
            ?? r04 = r02;
            ?? r12 = r1;
            if (c2 >= 0) {
                if (r1 == 0) {
                    if (r02 != 0) {
                        f3 = lcVar.D;
                    }
                    r03 = i2 & 4;
                }
                r12 = r0;
                r04 = r03;
            }
            ?? M = r04;
            ?? r05 = r04;
            ?? r13 = r12;
            if (c2 >= 0) {
                if (r12 == 0) {
                    if (r04 != 0) {
                        color = lcVar.N;
                    }
                    M = i2 & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13562, 3082434314013086871L ^ j2) /* invoke-custom */;
                }
                r13 = r0;
                r05 = M;
            }
            ?? M2 = r05;
            ?? r06 = r05;
            ?? r14 = r13;
            if (c2 >= 0) {
                if (r13 == 0) {
                    if (r05 != 0) {
                        color2 = lcVar.C;
                    }
                    M2 = i2 & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20929, 2322528970404819373L ^ j2) /* invoke-custom */;
                }
                r14 = r0;
                r06 = M2;
            }
            ?? M3 = r06;
            ?? r07 = r06;
            ?? r15 = r14;
            if (c2 >= 0) {
                if (r14 == 0) {
                    if (r06 != 0) {
                        color3 = lcVar.P;
                    }
                    M3 = i2 & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6416, 7062012997582207352L ^ j2) /* invoke-custom */;
                }
                r15 = r0;
                r07 = M3;
            }
            ?? M4 = r07;
            ?? M5 = r07;
            ?? r16 = r15;
            if (j >= 0) {
                if (r15 == 0) {
                    if (r07 != 0) {
                        color4 = lcVar.g;
                    }
                    M4 = i2 & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31633, 8047036065168940024L ^ j2) /* invoke-custom */;
                }
                r16 = r0;
                M5 = M4;
            }
            if (r16 == 0) {
                if (M5 != 0) {
                    f4 = lcVar.Z;
                }
                M5 = i2 & (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26632, 2667512852978092130L ^ j2) /* invoke-custom */;
            }
            if (M5 != 0) {
                f5 = lcVar.F;
            }
            return lcVar.Y(f2, f3, i3, color, i4, (char) i5, color2, color3, color4, f4, f5);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 2930016883380243834L, j2) /* invoke-custom */;
        }
    }

    @NotNull
    public String toString() {
        long j = a ^ 76111633906941L;
        return (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22249, 7379255274524542250L ^ j) /* invoke-custom */ + this.e + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8413, 6850686083711726361L ^ j) /* invoke-custom */ + this.D + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8709, 253746320565465541L ^ j) /* invoke-custom */ + this.N + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2605, 8461619253108595168L ^ j) /* invoke-custom */ + this.C + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26957, 964456932428135057L ^ j) /* invoke-custom */ + this.P + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6587, 7864479348052052595L ^ j) /* invoke-custom */ + this.g + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10223, 5875164389970310177L ^ j) /* invoke-custom */ + this.Z + (String) a(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4934, 2398690277788106884L ^ j) /* invoke-custom */ + this.F + ")";
    }

    public int hashCode() {
        long j = a ^ 84921920976641L;
        return (((((((((((((Float.hashCode(this.e) * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17073, 3969629916146774808L ^ j) /* invoke-custom */) + Float.hashCode(this.D)) * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9063, 3226104354212991690L ^ j) /* invoke-custom */) + this.N.hashCode()) * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9063, 3226104354212991690L ^ j) /* invoke-custom */) + this.C.hashCode()) * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9063, 3226104354212991690L ^ j) /* invoke-custom */) + this.P.hashCode()) * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9063, 3226104354212991690L ^ j) /* invoke-custom */) + this.g.hashCode()) * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9063, 3226104354212991690L ^ j) /* invoke-custom */) + Float.hashCode(this.Z)) * (int) b(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9063, 3226104354212991690L ^ j) /* invoke-custom */) + Float.hashCode(this.F);
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.lc.equals(java.lang.Object):boolean");
    }

    static {
        int i2;
        long j = a ^ 128876738321384L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[17];
        int i4 = 0;
        String str = "VT\u0084-½A±ü\u008eqW\u0012\u0082_íø T\u0010íé\u008eÊ±x>÷ob¹%¿Â+M¼\u008cyÑÎ\u0014\u0085çµõM\u0010\u0018á\u0018<Ç\u0006êq(ÔRÏ¿ßh*Î\\àÉ\u0007\"ßÏjò(\u0010Àu\u0090\u0012GLÑ°}³>Ò³ú\u0000\u0097\u0018tÃSÓ\u0089âj\u0082\u0086\u001eF&¹G#\u0080Îr\u0090ÔL\u0012\u0014\u0018\u0010\u0007WÌ\u0083Îó¶\bY\u008e[©<D×\u008f\u0010\u001eÃ10 3ôéÆT<ì»¯qÐ\u0010\u0085ûO¼=\u009b>(\u0016ÓBmËk@.(6»\u0007¹4bÈã¯Ä«éôîN\u001eô&\u0088\u009d\u0015¡Åß;\u0090hò`·\u0092ÃÐ\u0097\u001d\u009fÀI\u0018É\u00101\u0004\fÛ]¼.\u001d¸\"-Ù~(Ä\u008b\u0010ô»ÁÿØN{[H\u0086ÝìÐ\u001dE+\u0010I\u0099ª±\u0092ã\u009bMþ\u0007\u008dnÀ¡,7 ;ý2Ô»d\u009a\u0082d\u000eÖ\u0084ô÷2¢Óá\u009eÎ¡À\u0086ke.\u0014\u0094\u0019é\u0016&\u0010/\u0088%\u0001\u0082\u00975\u0018_[\u0001¬\u0002¥öM\u0010ü»u<$ö\u001cô\béjÔ©\u0014\u0095£";
        int length = "VT\u0084-½A±ü\u008eqW\u0012\u0082_íø T\u0010íé\u008eÊ±x>÷ob¹%¿Â+M¼\u008cyÑÎ\u0014\u0085çµõM\u0010\u0018á\u0018<Ç\u0006êq(ÔRÏ¿ßh*Î\\àÉ\u0007\"ßÏjò(\u0010Àu\u0090\u0012GLÑ°}³>Ò³ú\u0000\u0097\u0018tÃSÓ\u0089âj\u0082\u0086\u001eF&¹G#\u0080Îr\u0090ÔL\u0012\u0014\u0018\u0010\u0007WÌ\u0083Îó¶\bY\u008e[©<D×\u008f\u0010\u001eÃ10 3ôéÆT<ì»¯qÐ\u0010\u0085ûO¼=\u009b>(\u0016ÓBmËk@.(6»\u0007¹4bÈã¯Ä«éôîN\u001eô&\u0088\u009d\u0015¡Åß;\u0090hò`·\u0092ÃÐ\u0097\u001d\u009fÀI\u0018É\u00101\u0004\fÛ]¼.\u001d¸\"-Ù~(Ä\u008b\u0010ô»ÁÿØN{[H\u0086ÝìÐ\u001dE+\u0010I\u0099ª±\u0092ã\u009bMþ\u0007\u008dnÀ¡,7 ;ý2Ô»d\u009a\u0082d\u000eÖ\u0084ô÷2¢Óá\u009eÎ¡À\u0086ke.\u0014\u0094\u0019é\u0016&\u0010/\u0088%\u0001\u0082\u00975\u0018_[\u0001¬\u0002¥öM\u0010ü»u<$ö\u001cô\béjÔ©\u0014\u0095£".length();
        char cCharAt = 16;
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
                            c = new String[17];
                            i = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[7];
                            int i10 = 0;
                            String str3 = "S\u008bÉ\u001d\"ËezÜLù2\u00806°\u007fÇ\b\u0097MÅ\u008bê7ÙkOüy3½1¥þ2ç\u000br¹\u008f";
                            int length2 = "S\u008bÉ\u001d\"ËezÜLù2\u00806°\u007fÇ\b\u0097MÅ\u008bê7ÙkOüy3½1¥þ2ç\u000br¹\u008f".length();
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
                                                f = jArr;
                                                h = new Integer[7];
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i11 >= length2) {
                                                str3 = "E\u0098J±\u0088P\rZz\u0098|Imãb±";
                                                length2 = "E\u0098J±\u0088P\rZz\u0098|Imãb±".length();
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
                        str = "\u0085tï¶\u0002\u008bøc(ÆB¿.Õ6\u009b\r\u0011§Oäüê\u009a ØKµÙ\u0098¼´\bEý\u0083³è\u0086mø\u001d±\u0003(n\r\u0014\u0018Á\f½a¶E\u001e\u0011\u008f\u001cñMÈ¯¢yÈZÔ\u0080!lðn";
                        length = "\u0085tï¶\u0002\u008bøc(ÆB¿.Õ6\u009b\r\u0011§Oäüê\u009a ØKµÙ\u0098¼´\bEý\u0083³è\u0086mø\u001d±\u0003(n\r\u0014\u0018Á\f½a¶E\u001e\u0011\u008f\u001cñMÈ¯¢yÈZÔ\u0080!lðn".length();
                        cCharAt = '0';
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 8194;
        if (c[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i3] = a(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/lc", e);
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
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
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
            java.lang.String r1 = "su/catlean/lc"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.lc.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 2457;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/lc", e);
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
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
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
            java.lang.String r1 = "su/catlean/lc"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.lc.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
