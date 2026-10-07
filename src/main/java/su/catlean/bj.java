package su.catlean;

import com.github.weisj.jsvg.SVGDocument;
import com.github.weisj.jsvg.attributes.ViewBox;
import com.github.weisj.jsvg.parser.SVGLoader;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.InputStream;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2960;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/bj.class */
public final class bj {

    @NotNull
    private String p;
    private int N;
    private int q;
    private int L;

    @Nullable
    private class_2960 K;
    private static boolean h;
    private static final long a = yz.a(5175348085078378909L, 471373585935156248L, MethodHandles.lookup().lookupClass()).a(90639656104317L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    public bj(@NotNull String name, int width, int height, long a2) {
        Intrinsics.checkNotNullParameter(name, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18329, 6918824430478514906L ^ (a ^ a2)) /* invoke-custom */);
        this.p = name;
        this.N = width;
        this.q = height;
        this.L = -1;
    }

    public bj(String str, int i, int i2, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (a ^ j) ^ 95024453542711L);
    }

    public final int r() {
        return this.N;
    }

    public final void j(int i) {
        this.N = i;
    }

    public final int f() {
        return this.q;
    }

    public final void d(int i) {
        this.q = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [net.minecraft.class_2960] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.bj] */
    private final void T(float f2, float f3, long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 127259870427573L;
        long j4 = j2 ^ 99592464382155L;
        long j5 = j2 ^ 74467293177454L;
        Object obj = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4410946742644328569L, j2) /* invoke-custom */;
        obj = this;
        bj bjVar = obj;
        if (obj != 0) {
            obj = obj.K;
            if (obj != 0) {
                D(j4);
            }
            bjVar = this;
        }
        bjVar.K = l6.m(j3, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12176, 458458507527771130L ^ j2) /* invoke-custom */ + this.p);
        try {
            SVGLoader sVGLoader = new SVGLoader();
            InputStream resourceAsStream = getClass().getResourceAsStream((String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7551, 6615202786772214044L ^ j2) /* invoke-custom */ + this.p + (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8840, 321582751114452705L ^ j2) /* invoke-custom */);
            Intrinsics.checkNotNull(resourceAsStream);
            SVGDocument sVGDocumentLoad = sVGLoader.load(resourceAsStream);
            BufferedImage bufferedImage = new BufferedImage((int) Math.ceil(f2), (int) Math.ceil(f3), 2);
            Graphics2D graphics2DCreateGraphics = bufferedImage.createGraphics();
            graphics2DCreateGraphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            graphics2DCreateGraphics.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
            graphics2DCreateGraphics = obj;
            if (graphics2DCreateGraphics != 0) {
                if (sVGDocumentLoad != null) {
                    sVGDocumentLoad.render(null, graphics2DCreateGraphics, new ViewBox(f2, f3));
                }
            }
            graphics2DCreateGraphics.dispose();
            jl jlVar = jl.y;
            class_2960 class_2960Var = this.K;
            Intrinsics.checkNotNull(class_2960Var);
            jlVar.b(class_2960Var, j5, bufferedImage);
        } catch (Throwable th) {
            this.K = class_2960.method_60656((String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9305, 802275855987300404L ^ j2) /* invoke-custom */);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [su.catlean.bj] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v38, types: [su.catlean.bj] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [int] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45, types: [su.catlean.bj] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50, types: [int] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56, types: [su.catlean.bj] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v60, types: [su.catlean.bj] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r1v67, types: [int] */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    public final void a(short s, @NotNull Matrix3x2f matrix3x2f, double d2, short s2, double d3, float f2, float f3, int i, @NotNull Color color, @NotNull Color color2, float f4) throws Throwable {
        boolean z;
        ?? r0;
        ?? r02;
        ?? r1;
        ?? r03;
        bj bjVar;
        long j = (((((long) s) << 48) | ((((long) s2) << 48) >>> 16)) | ((((long) i) << 32) >>> 32)) ^ a;
        long j2 = j ^ 110804238972982L;
        long j3 = j ^ 13496208487975L;
        int i2 = (int) (j >>> 32);
        int i3 = (int) ((j3 << 32) >>> 48);
        int i4 = (int) ((j3 << 48) >>> 48);
        long j4 = j ^ 19111284578967L;
        long j5 = j ^ 137725042460421L;
        int i5 = (int) (j >>> 48);
        int i6 = (int) ((j5 << 16) >>> 32);
        int i7 = (int) ((j5 << 48) >>> 48);
        boolean z2 = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7314386430107390158L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(matrix3x2f, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10310, 3459308582317362335L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29771, 402670892319428752L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color2, (String) a(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30928, 8884193343249767432L ^ j) /* invoke-custom */);
        double d4 = d2 + ((double) 0.5f);
        double d5 = d3 + ((double) 2.0f);
        int iMethod_4495 = zf.F(j2).method_22683().method_4495();
        ?? r04 = this;
        try {
            try {
                try {
                    if (z2) {
                        try {
                            try {
                                try {
                                    r04 = r04.L;
                                    if (r04 == iMethod_4495) {
                                        bj bjVar2 = this;
                                        z = z2;
                                        bjVar = bjVar2;
                                        r04 = bjVar2;
                                        if (s >= 0) {
                                            if (z) {
                                                if (bjVar2.K == null) {
                                                }
                                                bjVar = this;
                                            }
                                            z = z2;
                                            r04 = bjVar;
                                        }
                                    }
                                    this.L = iMethod_4495;
                                    r04 = this;
                                    r04.T(this.N * this.L, this.q * this.L, j4);
                                    bjVar = this;
                                    z = z2;
                                    r04 = bjVar;
                                } catch (NumberFormatException unused) {
                                    r04 = (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r04, 7227111212980264292L, j) /* invoke-custom */;
                                    throw r04;
                                }
                            } catch (NumberFormatException unused2) {
                                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r04, 7227111212980264292L, j) /* invoke-custom */;
                            }
                        } catch (NumberFormatException unused3) {
                            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r04, 7227111212980264292L, j) /* invoke-custom */;
                        }
                    } else {
                        r04.T(this.N * this.L, this.q * this.L, j4);
                        bjVar = this;
                        z = z2;
                        r04 = bjVar;
                    }
                    if (z) {
                        try {
                            try {
                                r04 = r04.N;
                                if (r04 == ((int) Math.ceil(f2))) {
                                    r04 = this;
                                    boolean z3 = z2;
                                    r03 = r04;
                                    r1 = z3;
                                    if (i > 0) {
                                        r03.T((float) r1, this.q, j4);
                                        r0 = r03;
                                    } else {
                                        if (z3) {
                                            int i8 = r04.q;
                                            r02 = i8;
                                            if (s2 > 0) {
                                                r0 = i8;
                                                if (i8 != ((int) Math.ceil(f3))) {
                                                    this.N = (int) Math.ceil(f2);
                                                    this.q = (int) Math.ceil(f3);
                                                    r04 = this;
                                                }
                                            }
                                        }
                                        r03 = r04;
                                        r1 = this.N;
                                        r03.T((float) r1, this.q, j4);
                                        r0 = r03;
                                    }
                                    try {
                                        jl jlVar = jl.y;
                                        class_2960 class_2960Var = this.K;
                                        Intrinsics.checkNotNull(class_2960Var);
                                        jl.W(jlVar, matrix3x2f, class_2960Var, (float) d4, (float) d5, (float) Math.ceil(f2), (float) Math.ceil(f3), jl.y.p(color, (char) i5, i6, f4 * (color.getAlpha() / 255.0f), (short) i7), jl.y.p(color2, (char) i5, i6, f4 * (color.getAlpha() / 255.0f), (short) i7), i2, jl.y.p(color, (char) i5, i6, f4 * (color.getAlpha() / 255.0f), (short) i7), jl.y.p(color2, (char) i5, i6, f4 * (color.getAlpha() / 255.0f), (short) i7), 0.0f, (char) i3, 0.0f, 0.0f, (short) i4, 0.0f, false, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26728, 9193921378016647337L ^ j) /* invoke-custom */, null);
                                        r02 = z2;
                                    } catch (NumberFormatException unused4) {
                                        throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 7227111212980264292L, j) /* invoke-custom */;
                                    }
                                } else {
                                    this.N = (int) Math.ceil(f2);
                                    this.q = (int) Math.ceil(f3);
                                    r04 = this;
                                    r03 = r04;
                                    r1 = this.N;
                                    r03.T((float) r1, this.q, j4);
                                    r0 = r03;
                                    jl jlVar2 = jl.y;
                                    class_2960 class_2960Var2 = this.K;
                                    Intrinsics.checkNotNull(class_2960Var2);
                                    jl.W(jlVar2, matrix3x2f, class_2960Var2, (float) d4, (float) d5, (float) Math.ceil(f2), (float) Math.ceil(f3), jl.y.p(color, (char) i5, i6, f4 * (color.getAlpha() / 255.0f), (short) i7), jl.y.p(color2, (char) i5, i6, f4 * (color.getAlpha() / 255.0f), (short) i7), i2, jl.y.p(color, (char) i5, i6, f4 * (color.getAlpha() / 255.0f), (short) i7), jl.y.p(color2, (char) i5, i6, f4 * (color.getAlpha() / 255.0f), (short) i7), 0.0f, (char) i3, 0.0f, 0.0f, (short) i4, 0.0f, false, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26728, 9193921378016647337L ^ j) /* invoke-custom */, null);
                                    r02 = z2;
                                }
                            } catch (NumberFormatException unused5) {
                                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r04, 7227111212980264292L, j) /* invoke-custom */;
                            }
                        } catch (NumberFormatException unused6) {
                            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r04, 7227111212980264292L, j) /* invoke-custom */;
                        }
                    } else {
                        r03 = r04;
                        r1 = this.N;
                        r03.T((float) r1, this.q, j4);
                        r0 = r03;
                        jl jlVar22 = jl.y;
                        class_2960 class_2960Var22 = this.K;
                        Intrinsics.checkNotNull(class_2960Var22);
                        jl.W(jlVar22, matrix3x2f, class_2960Var22, (float) d4, (float) d5, (float) Math.ceil(f2), (float) Math.ceil(f3), jl.y.p(color, (char) i5, i6, f4 * (color.getAlpha() / 255.0f), (short) i7), jl.y.p(color2, (char) i5, i6, f4 * (color.getAlpha() / 255.0f), (short) i7), i2, jl.y.p(color, (char) i5, i6, f4 * (color.getAlpha() / 255.0f), (short) i7), jl.y.p(color2, (char) i5, i6, f4 * (color.getAlpha() / 255.0f), (short) i7), 0.0f, (char) i3, 0.0f, 0.0f, (short) i4, 0.0f, false, (int) b(MethodHandles.lookup(), "j", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26728, 9193921378016647337L ^ j) /* invoke-custom */, null);
                        r02 = z2;
                    }
                    int i9 = r02;
                    if (s >= 0) {
                        if (r02 != 0) {
                            return;
                        } else {
                            i9 = 4;
                        }
                    }
                    r0 = new _g[i9];
                    vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 7230756901260652133L, j) /* invoke-custom */;
                } catch (NumberFormatException unused7) {
                    throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r04, 7227111212980264292L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused8) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r04, 7227111212980264292L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused9) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r04, 7227111212980264292L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:16:0x0089
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static void p(su.catlean.bj r15, org.joml.Matrix3x2f r16, double r17, double r19, float r21, float r22, java.awt.Color r23, java.awt.Color r24, float r25, int r26, long r27, java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.bj.p(su.catlean.bj, org.joml.Matrix3x2f, double, double, float, float, java.awt.Color, java.awt.Color, float, int, long, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Type inference failed for: r0v11, types: [net.minecraft.class_2960] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void D(long r8) throws java.lang.Throwable {
        /*
            r7 = this;
            long r0 = su.catlean.bj.a
            r1 = r8
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 51896147483242(0x2f33036f9a6a, double:2.56401036229805E-310)
            long r1 = r1 ^ r2
            r10 = r1
            r0 = 5054539938317201486(0x4625554b366bf04e, double:8.45094282534872E29)
            r1 = r8
            boolean r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Z}
            ).invoke(r0, r1)
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L44
            r0 = r7
            net.minecraft.class_2960 r0 = r0.K     // Catch: java.lang.NumberFormatException -> L29 java.lang.NumberFormatException -> L39
            r1 = r0
            if (r1 == 0) goto L43
            goto L33
        L29:
            r1 = 5050664587973394232(0x461790aee5cc7f38, double:4.6675625438229846E29)
            r2 = r8
            java.lang.Throwable r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Throwable;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L39
            throw r0     // Catch: java.lang.NumberFormatException -> L39
        L33:
            java.lang.String r0 = r0.method_12836()     // Catch: java.lang.NumberFormatException -> L39
            goto L45
        L39:
            r1 = 5050664587973394232(0x461790aee5cc7f38, double:4.6675625438229846E29)
            r2 = r8
            java.lang.Throwable r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Throwable;}
            ).invoke(r0, r1, r2)
            throw r0
        L43:
        L44:
            r0 = 0
        L45:
            r1 = 9569(0x2561, float:1.3409E-41)
            r2 = 6476360774567764968(0x59e0a7cfad62a3e8, double:8.808180842500838E124)
            r3 = r8
            long r2 = r2 ^ r3
            java.lang.String r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/bj;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "f"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r1, r2)     // Catch: java.lang.NumberFormatException -> L61
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)     // Catch: java.lang.NumberFormatException -> L61
            if (r0 == 0) goto L9d
            r0 = r7
            r1 = r12
            if (r1 != 0) goto L9e
            goto L6b
        L61:
            r1 = 5050664587973394232(0x461790aee5cc7f38, double:4.6675625438229846E29)
            r2 = r8
            java.lang.Throwable r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Throwable;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L74
            throw r0     // Catch: java.lang.NumberFormatException -> L74
        L6b:
            net.minecraft.class_2960 r0 = r0.K     // Catch: java.lang.NumberFormatException -> L74 java.lang.NumberFormatException -> L93
            if (r0 == 0) goto L9d
            goto L7e
        L74:
            r1 = 5050664587973394232(0x461790aee5cc7f38, double:4.6675625438229846E29)
            r2 = r8
            java.lang.Throwable r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Throwable;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L93
            throw r0     // Catch: java.lang.NumberFormatException -> L93
        L7e:
            r0 = r10
            net.minecraft.class_310 r0 = su.catlean.zf.F(r0)     // Catch: java.lang.NumberFormatException -> L93
            net.minecraft.class_1060 r0 = r0.method_1531()     // Catch: java.lang.NumberFormatException -> L93
            r1 = r7
            net.minecraft.class_2960 r1 = r1.K     // Catch: java.lang.NumberFormatException -> L93
            r2 = r1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.NumberFormatException -> L93
            r0.method_4615(r1)     // Catch: java.lang.NumberFormatException -> L93
            goto L9d
        L93:
            r1 = 5050664587973394232(0x461790aee5cc7f38, double:4.6675625438229846E29)
            r2 = r8
            java.lang.Throwable r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Throwable;}
            ).invoke(r0, r1, r2)
            throw r0
        L9d:
            r0 = r7
        L9e:
            r1 = 0
            r0.K = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.bj.D(long):void");
    }

    public static void v(boolean z) {
        h = z;
    }

    public static boolean b() {
        return h;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean P() {
        return !b();
    }

    static {
        int i;
        long j = a ^ 125017045715582L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, -8512199149090715364L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[10];
        int i3 = 0;
        String str = "\u0087*µ\u0012\u009b8\u008cCÉ¼YÐGJ2Krb P«ìL9\u009cq@Ù\u007fmù©\u0010^çCEõú^Vf^\u0091ß6,\u001f:\u0010\u0013M\tVÝ\u0085QâÌ=+Ç\u008dTü¿\u0010»Y q$<ª\u001f\u0016ç\u00982\u0004\u0015·\u009a\u0010Í\u0094\u0010\u0091?ÌÂ\u00adÄ\u0093¡\t¯\u009f\n\u000e\u0018Eè&Ú&Ó¨ærë*\u000b8\u0012ºå×$PýCÏúö \u0006Ç%Ì\u0089f£\u008eZã°H\u0005p\u009b÷1\u008e¸\u008c\u0086Äß»´~<´güÊÞ \u008e ´'â\u0019H¬\u0089\u0090\u0097\u0087i\u0013ÈÊ\u0007\u0007U3±\u0082£GúyûZQ0Çv";
        int length = "\u0087*µ\u0012\u009b8\u008cCÉ¼YÐGJ2Krb P«ìL9\u009cq@Ù\u007fmù©\u0010^çCEõú^Vf^\u0091ß6,\u001f:\u0010\u0013M\tVÝ\u0085QâÌ=+Ç\u008dTü¿\u0010»Y q$<ª\u001f\u0016ç\u00982\u0004\u0015·\u009a\u0010Í\u0094\u0010\u0091?ÌÂ\u00adÄ\u0093¡\t¯\u009f\n\u000e\u0018Eè&Ú&Ó¨ærë*\u000b8\u0012ºå×$PýCÏúö \u0006Ç%Ì\u0089f£\u008eZã°H\u0005p\u009b÷1\u008e¸\u008c\u0086Äß»´~<´güÊÞ \u008e ´'â\u0019H¬\u0089\u0090\u0097\u0087i\u0013ÈÊ\u0007\u0007U3±\u0082£GúyûZQ0Çv".length();
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
                            c = new String[10];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[6];
                            int i9 = 0;
                            String str3 = "Eñ\"ï+v¬üì.[\u0005\u009eª%Ã\u0091?¶\u0086æp\bWAð\u00148v% \u0016";
                            int length2 = "Eñ\"ï+v¬üì.[\u0005\u009eª%Ã\u0091?¶\u0086æp\bWAð\u00148v% \u0016".length();
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
                                                f = new Integer[6];
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "u¼\u0095¸³\u0087õ\u009fCDÙ\u0080µØ\u0003\u009e";
                                                length2 = "u¼\u0095¸³\u0087õ\u009fCDÙ\u0080µØ\u0003\u009e".length();
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
                        str = "ú§GQ_xÈmÁ<\u009cD&\u008d3[(5(\rM\u0001Ô\røÝ9\u009f\u001d©ÔózåË¦\u008e\u0084Æ_õgfÍ\u008b\u0095\u0089\u0080\u0014³mN\u009d¤o?Ð";
                        length = "ú§GQ_xÈmÁ<\u009cD&\u008d3[(5(\rM\u0001Ô\røÝ9\u009f\u001d©ÔózåË¦\u008e\u0084Æ_õgfÍ\u008b\u0095\u0089\u0080\u0014³mN\u009d¤o?Ð".length();
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

    private static Throwable a(Throwable th) {
        return th;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 16802;
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
                throw new RuntimeException("su/catlean/bj", e2);
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
            java.lang.String r1 = "su/catlean/bj"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.bj.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 21949;
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
                    throw new RuntimeException("su/catlean/bj", e2);
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
            java.lang.String r1 = "su/catlean/bj"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.bj.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
