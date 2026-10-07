package su.catlean;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
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
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_290;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4604;
import net.minecraft.class_591;
import net.minecraft.class_742;
import org.jetbrains.annotations.NotNull;
import org.joml.Math;
import org.joml.Matrix4f;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL32C;
import su.catlean.api.event.GofraState;
import su.catlean.api.event.events.render.FrustrumEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/zi.class */
public final class zi {

    @NotNull
    public static final zi v;

    @NotNull
    private static Matrix4f t;

    @NotNull
    private static class_4604 m;
    private static float o;
    private static float Z;
    private static float c;
    private static int N;
    private static final long a = yz.a(-4174707533709301951L, 9017164347033285973L, MethodHandles.lookup().lookupClass()).a(19905865458321L);
    private static final String[] b;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    private zi() {
    }

    @NotNull
    public final Matrix4f s() {
        return t;
    }

    public final void H(int a2, char a3, short a4, @NotNull Matrix4f matrix4f) {
        Intrinsics.checkNotNullParameter(matrix4f, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30126, 747195667638112551L ^ ((((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a)) /* invoke-custom */);
        t = matrix4f;
    }

    @NotNull
    public final class_4604 K() {
        return m;
    }

    public final void J(@NotNull class_4604 class_4604Var, long a2) {
        Intrinsics.checkNotNullParameter(class_4604Var, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18458, 6172863861180606483L ^ (a ^ a2)) /* invoke-custom */);
        m = class_4604Var;
    }

    public final float x() {
        return o;
    }

    public final void E(float f2) {
        o = f2;
    }

    public final float b() {
        return Z;
    }

    public final void G(float f2) {
        Z = f2;
    }

    public final float F() {
        return c;
    }

    public final void j(float f2) {
        c = f2;
    }

    @Flow
    private final void Q(FrustrumEvent frustrumEvent) {
        m = frustrumEvent.getFrustrum();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [long] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow(priority = 20)
    private final void p(Render3DEvent render3DEvent) {
        long j = a ^ 49177084550140L;
        long j2 = j ^ 5355276310440L;
        long j3 = j ^ 39660684172088L;
        class_4184 class_4184VarMethod_19418 = zf.F(j2).field_1773.method_19418();
        Intrinsics.checkNotNullExpressionValue(class_4184VarMethod_19418, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25836, 6947468910626674427L ^ j) /* invoke-custom */);
        o = Math.toRadians(class_4184VarMethod_19418.method_19330());
        Z = Math.toRadians(class_4184VarMethod_19418.method_19330() + 180.0f);
        c = Math.toRadians(class_4184VarMethod_19418.method_19329());
        Object objA = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5452201619691578795L, j) /* invoke-custom */;
        GofraState.INSTANCE.setModifyBuffer(false);
        try {
            try {
                jl.y.b().set(RenderSystem.getModelViewMatrix());
                jl.y.m().set(render3DEvent.getStack().method_23760().method_23761());
                int iT = (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10870, 2909859863333772313L ^ j) /* invoke-custom */;
                ?? V = iT;
                if (objA == null) {
                    GL32C.glGetIntegerv(iT, jl.y.u());
                    t = render3DEvent.getProjection();
                    jh.f.P(j3);
                    objA = w8.T.a();
                    if (objA != null) {
                        return;
                    } else {
                        V = fi.C.V();
                    }
                }
                ?? Method_4490 = V;
                if (objA == null) {
                    if (V == 0) {
                        return;
                    } else {
                        Method_4490 = GLFW.glfwGetPlatform();
                    }
                }
                try {
                    if (Method_4490 != (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21485, 4277866405938685342L ^ j) /* invoke-custom */) {
                        Method_4490 = zf.F(j2).method_22683().method_4490();
                        GLFW.glfwSetCursor((long) Method_4490, GLFW.glfwCreateStandardCursor((int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28929, 3167872138082830184L ^ j) /* invoke-custom */));
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_4490, 5439369684692683628L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objA, 5439369684692683628L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objA, 5439369684692683628L, j) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0183: INVOKE 
          (r-1 I:su.catlean.c6)
          (r0 I:org.joml.Matrix3x2fStack)
          (r1 I:java.lang.String)
          (r2 I:float)
          (r3 I:float)
          (r4 I:long)
          (r5 I:java.awt.Color)
         VIRTUAL call: su.catlean.c6.U(org.joml.Matrix3x2fStack, java.lang.String, float, float, long, java.awt.Color):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final void y(int r15, byte r16, @org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull net.minecraft.class_243 r18, @org.jetbrains.annotations.NotNull java.awt.Color r19, float r20, int r21, float r22, boolean r23, @org.jetbrains.annotations.NotNull su.catlean.c6 r24) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zi.y(int, byte, java.lang.String, net.minecraft.class_243, java.awt.Color, float, int, float, boolean, su.catlean.c6):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:16:0x0084
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static void h(su.catlean.zi r12, long r13, java.lang.String r15, net.minecraft.class_243 r16, java.awt.Color r17, float r18, float r19, boolean r20, su.catlean.c6 r21, int r22, java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zi.h(su.catlean.zi, long, java.lang.String, net.minecraft.class_243, java.awt.Color, float, float, boolean, su.catlean.c6, int, java.lang.Object):void");
    }

    public final float n(int i, char c2, int i2) {
        return zf.F(((((((long) i) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) i2) << 48) >>> 48)) ^ a) ^ 36136573897038L).method_61966().method_60637(true);
    }

    public final boolean Q(short a2, char a3, @NotNull class_238 box, int a4, @NotNull Color color, @NotNull Color color2) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 48) >>> 16)) | ((((long) a4) << 32) >>> 32)) ^ a;
        long j2 = j ^ 14250967117543L;
        Intrinsics.checkNotNullParameter(box, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25235, 3767035662539926465L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27188, 3515741348500054851L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color2, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5475, 1647972678821731389L ^ j) /* invoke-custom */);
        return cz.H.a().add(new x9(box, j2, color, color2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public static boolean g(zi ziVar, class_238 class_238Var, long j, Color color, Color color2, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 45246712640059L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j3 << 16) >>> 48);
        int i4 = (int) ((j3 << 32) >>> 32);
        Object obj2 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7784685457948377610L, j2) /* invoke-custom */;
        try {
            obj2 = i & 4;
            if (obj2 != 0) {
                return obj2;
            }
            if (obj2 != 0) {
                color2 = color;
            }
            return ziVar.Q((short) i2, (char) i3, class_238Var, i4, color, color2);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj2, -7844808452706528463L, j2) /* invoke-custom */;
        }
    }

    public final boolean F(@NotNull class_238 box, @NotNull Color color, long a2, @NotNull Color color2) {
        long j = a ^ a2;
        long j2 = j ^ 100610304407891L;
        Intrinsics.checkNotNullParameter(box, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8486, 2735373846111371256L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7900, 429837257357197318L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color2, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32384, 5056039973304754260L ^ j) /* invoke-custom */);
        return cz.H.F().add(new x9(box, j2, color, color2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public static boolean E(long j, zi ziVar, class_238 class_238Var, Color color, Color color2, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 45805509473194L;
        Object obj2 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4192171569284240429L, j2) /* invoke-custom */;
        try {
            obj2 = i & 4;
            if (obj2 != 0) {
                return obj2;
            }
            if (obj2 != 0) {
                color2 = color;
            }
            return ziVar.F(class_238Var, color, j3, color2);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj2, -4250004144435870444L, j2) /* invoke-custom */;
        }
    }

    public final boolean q(long a2, short a3, @NotNull class_238 box, @NotNull Color color, @NotNull Color color2) {
        long j = ((a2 << 16) | ((((long) a3) << 48) >>> 48)) ^ a;
        long j2 = j ^ 110330311035655L;
        Intrinsics.checkNotNullParameter(box, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25235, 3767078945992855073L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27188, 3515627472925607587L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color2, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5475, 1647946678044309981L ^ j) /* invoke-custom */);
        return cz.H.x().add(new x9(box, j2, color, color2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public static boolean x(zi ziVar, long j, class_238 class_238Var, Color color, Color color2, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 >>> 16;
        int i2 = (int) (((j2 ^ 7726524993970L) << 48) >>> 48);
        Object obj2 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1557818157475888031L, j2) /* invoke-custom */;
        try {
            obj2 = i & 4;
            if (obj2 != 0) {
                return obj2;
            }
            if (obj2 != 0) {
                color2 = color;
            }
            return ziVar.q(j3, (short) i2, class_238Var, color, color2);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj2, 1533725026013189464L, j2) /* invoke-custom */;
        }
    }

    public final boolean S(@NotNull class_238 box, @NotNull class_2350 side, long a2, @NotNull Color color) {
        long j = a ^ a2;
        int i = (int) (j >>> 48);
        long j2 = ((j ^ 88768033569183L) << 16) >>> 16;
        Intrinsics.checkNotNullParameter(box, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25235, 3767102850326666200L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(side, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9720, 1265298044039486623L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27188, 3515673920147624794L ^ j) /* invoke-custom */);
        return cz.H.O().add(new to(box, (char) i, color, side, j2));
    }

    public final boolean c(char a2, @NotNull class_238 box, int a3, short a4, @NotNull class_2350 side, @NotNull Color color) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ a;
        int i = (int) (j >>> 48);
        long j2 = ((j ^ 105513010138653L) << 16) >>> 16;
        Intrinsics.checkNotNullParameter(box, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25235, 3767119629662792794L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(side, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28582, 6092412085568905582L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27188, 3515659296898000088L ^ j) /* invoke-custom */);
        return cz.H.h().add(new to(box, (char) i, color, side, j2));
    }

    public final boolean T(@NotNull class_243 start, @NotNull class_243 end, @NotNull Color startColor, @NotNull Color endColor, long a2, boolean ignoreFrustrum) {
        long j = a ^ a2;
        long j2 = j ^ 71752019206572L;
        Intrinsics.checkNotNullParameter(start, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8353, 5503162730599837844L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(end, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7716, 2920879958989098557L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(startColor, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19250, 3161789600019061506L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(endColor, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10593, 3487417123322984768L ^ j) /* invoke-custom */);
        return cz.H.V().add(new oj(start, end, startColor, endColor, ignoreFrustrum, j2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v8, types: [su.catlean._g[]] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public static boolean L(zi ziVar, short s, class_243 class_243Var, class_243 class_243Var2, Color color, Color color2, boolean z, int i, char c2, int i2, Object obj) {
        long j = (((((long) s) << 48) | ((((long) i) << 32) >>> 16)) | ((((long) c2) << 48) >>> 48)) ^ a;
        long j2 = j ^ 102564888195235L;
        Object objT = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5200378155913553450L, j) /* invoke-custom */;
        try {
            objT = i2 & (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8302, 7530280599135065482L ^ j) /* invoke-custom */;
            boolean zT = objT;
            if (objT == 0) {
                if (objT != 0) {
                    color2 = color;
                }
                zT = i2 & (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2189, 6518150480732601696L ^ j) /* invoke-custom */;
            }
            if (objT != 0) {
                return zT;
            }
            if (zT != 0) {
                z = false;
            }
            return ziVar.T(class_243Var, class_243Var2, color, color2, j2, z);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objT, 5259621580577294573L, j) /* invoke-custom */;
        }
    }

    public final boolean t(@NotNull class_243 start, @NotNull class_243 end, @NotNull Color startColor, @NotNull Color endColor, long a2) {
        long j = a ^ a2;
        long j2 = j ^ 24588818667846L;
        Intrinsics.checkNotNullParameter(start, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13011, 4430049478997959767L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(end, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1856, 6968595462481433031L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(startColor, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29638, 7101692584838309205L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(endColor, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30926, 8128028820734717550L ^ j) /* invoke-custom */);
        return cz.H.N().add(new oj(start, end, startColor, endColor, false, j2, (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2189, 6518209844064229986L ^ j) /* invoke-custom */, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [su.catlean._g[]] */
    public static boolean C(zi ziVar, int i, byte b2, class_243 class_243Var, class_243 class_243Var2, Color color, int i2, Color color2, int i3, Object obj) {
        long j = (((((long) i) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i2) << 40) >>> 40)) ^ a;
        long j2 = j ^ 110931939881423L;
        Object objT = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8071735650843926022L, j) /* invoke-custom */;
        try {
            objT = i3 & (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8302, 7530288088309617242L ^ j) /* invoke-custom */;
            if (objT != 0) {
                return objT;
            }
            if (objT != 0) {
                color2 = color;
            }
            return ziVar.t(class_243Var, class_243Var2, color, color2, j2);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objT, -8129570560830927043L, j) /* invoke-custom */;
        }
    }

    @NotNull
    public final class_238 r(@NotNull class_238 from, @NotNull class_238 to, long a2, float delta) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(from, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31834, 5102539692015479415L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(to, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22929, 6105391959150579636L ^ j) /* invoke-custom */);
        return new class_238(jl.y.a(from.field_1323, to.field_1323, delta), jl.y.a(from.field_1322, to.field_1322, delta), jl.y.a(from.field_1321, to.field_1321, delta), jl.y.a(from.field_1320, to.field_1320, delta), jl.y.a(from.field_1325, to.field_1325, delta), jl.y.a(from.field_1324, to.field_1324, delta));
    }

    public static class_238 h(int i, zi ziVar, class_238 class_238Var, class_238 class_238Var2, float f2, int i2, short s, short s2, Object obj) {
        long j = (((((long) i) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ a;
        long j2 = j ^ 55485315902734L;
        int i3 = (int) (j >>> 32);
        int i4 = (int) ((j2 << 32) >>> 48);
        int i5 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 87866977851367L;
        if ((i2 & 4) != 0) {
            f2 = ziVar.n(i3, (char) i4, i5);
        }
        return ziVar.r(class_238Var, class_238Var2, j3, f2);
    }

    @NotNull
    public final class_243 q(long a2, @NotNull class_243 from, @NotNull class_243 to, float delta) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(from, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7915, 2603498067896173614L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(to, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17510, 178408748477210299L ^ j) /* invoke-custom */);
        return new class_243(jl.y.W(from.field_1352, to.field_1352, delta), jl.y.W(from.field_1351, to.field_1351, delta), jl.y.W(from.field_1350, to.field_1350, delta));
    }

    public static class_243 n(int i, zi ziVar, class_243 class_243Var, class_243 class_243Var2, float f2, int i2, byte b2, Object obj, int i3) {
        long j = (((((long) i) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i3) << 40) >>> 40)) ^ a;
        long j2 = j ^ 89054059048595L;
        int i4 = (int) (j >>> 32);
        int i5 = (int) ((j2 << 32) >>> 48);
        int i6 = (int) ((j2 << 48) >>> 48);
        long j3 = j ^ 72900528134307L;
        if ((i2 & 4) != 0) {
            f2 = ziVar.n(i4, (char) i5, i6);
        }
        return ziVar.q(j3, class_243Var, class_243Var2, f2);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [long, su.catlean.jl] */
    /* JADX WARN: Type inference failed for: r0v6, types: [long, su.catlean.jl] */
    /* JADX WARN: Type inference failed for: r0v9, types: [long, su.catlean.jl] */
    /* JADX WARN: Type inference failed for: r1v7, types: [long, su.catlean.jl] */
    private final class_238 l(byte b2, class_1297 class_1297Var, long j) {
        ?? r1 = (((((long) b2) << 56) | ((j << 8) >>> 8)) ^ a) ^ 71696625411859L;
        double dB = r1.b(jl.y, class_1297Var.field_6014, class_1297Var.method_23317());
        double dB2 = r1.b(jl.y, class_1297Var.field_6036, class_1297Var.method_23318());
        double dB3 = r1.b(jl.y, class_1297Var.field_5969, class_1297Var.method_23321());
        class_238 class_238VarMethod_5829 = class_1297Var.method_5829();
        return new class_238(((class_238VarMethod_5829.field_1323 - class_1297Var.method_23317()) + dB) - 0.05d, (class_238VarMethod_5829.field_1322 - class_1297Var.method_23318()) + dB2, ((class_238VarMethod_5829.field_1321 - class_1297Var.method_23321()) + dB3) - 0.05d, (class_238VarMethod_5829.field_1320 - class_1297Var.method_23317()) + dB + 0.05d, (class_238VarMethod_5829.field_1325 - class_1297Var.method_23318()) + dB2 + 0.15d, (class_238VarMethod_5829.field_1324 - class_1297Var.method_23321()) + dB3 + 0.05d);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:19:0x013d
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final void f(@org.jetbrains.annotations.NotNull net.minecraft.class_2960 r14, @org.jetbrains.annotations.NotNull net.minecraft.class_243 r15, float r16, float r17, long r18, float r20, float r21, @org.jetbrains.annotations.NotNull java.awt.Color r22, boolean r23, @org.jetbrains.annotations.Nullable su.catlean.g7 r24, float r25, float r26, float r27, float r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 1160
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zi.f(net.minecraft.class_2960, net.minecraft.class_243, float, float, long, float, float, java.awt.Color, boolean, su.catlean.g7, float, float, float, float, boolean):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:16:0x006b
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static void e(su.catlean.zi r18, net.minecraft.class_2960 r19, net.minecraft.class_243 r20, float r21, float r22, float r23, float r24, long r25, java.awt.Color r27, boolean r28, su.catlean.g7 r29, float r30, float r31, float r32, float r33, boolean r34, int r35, java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zi.e(su.catlean.zi, net.minecraft.class_2960, net.minecraft.class_243, float, float, float, float, long, java.awt.Color, boolean, su.catlean.g7, float, float, float, float, boolean, int, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.awt.Color] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v39, types: [double] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [su.catlean.g7] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r49v0, types: [java.awt.Color] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public final void D(@NotNull class_4587 class_4587Var, @NotNull class_243 class_243Var, @NotNull class_1657 class_1657Var, long j, float f2, boolean z) {
        ?? P;
        long j2 = a ^ j;
        long j3 = j2 ^ 57611794277199L;
        long j4 = j2 ^ 115066803108924L;
        long j5 = j2 ^ 36347300969244L;
        int i = (int) (j2 >>> 32);
        int i2 = (int) ((j5 << 32) >>> 48);
        int i3 = (int) ((j5 << 48) >>> 48);
        long j6 = j2 ^ 57691186797662L;
        long j7 = j2 ^ 68350131169361L;
        long j8 = j2 >>> 16;
        int i4 = (int) (((j2 ^ 50148390648341L) << 48) >>> 48);
        long j9 = j2 ^ 50447779781756L;
        int i5 = (int) (j2 >>> 48);
        int i6 = (int) ((j9 << 16) >>> 32);
        int i7 = (int) ((j9 << 48) >>> 48);
        Intrinsics.checkNotNullParameter(class_4587Var, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9998, 3079808149485494729L ^ j2) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(class_243Var, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10904, 8094149555127069778L ^ j2) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(class_1657Var, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25367, 1024238266618242513L ^ j2) /* invoke-custom */);
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4662020804364906164L, j2) /* invoke-custom */;
        GpuTextureView gpuTextureViewMethod_71659 = zf.F(j3).method_1531().method_4619(((class_742) class_1657Var).method_52814().comp_1626().comp_3627()).method_71659();
        Intrinsics.checkNotNullExpressionValue(gpuTextureViewMethod_71659, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22556, 8303026383531466485L ^ j2) /* invoke-custom */);
        int i8 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
        ?? color = i8;
        if (_gVarArr == null) {
            color = i8 == 0 ? 1 : 0;
        }
        if (color != 0) {
            try {
                color = new Color(0.8f, 0.8f, 0.8f, f2);
                P = color;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(color, -4639915619364552821L, j2) /* invoke-custom */;
            }
        } else {
            P = jl.y.p(jh.f.t(), (char) i5, i6, f2, (short) i7);
        }
        ?? r49 = P;
        VertexFormat vertexFormat = class_290.field_1575;
        Intrinsics.checkNotNullExpressionValue(vertexFormat, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8324, 212981386828949063L ^ j2) /* invoke-custom */);
        g7 g7Var = new g7(j4, vertexFormat, (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12003, 6827109497846918252L ^ j2) /* invoke-custom */, false, 4, null);
        sp spVar = new sp(g7Var, r49, j6);
        class_1007 class_1007VarMethod_3953 = zf.F(j3).method_1561().method_3953((class_1297) class_1657Var);
        Intrinsics.checkNotNull(class_1007VarMethod_3953, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21915, 3721587553514050391L ^ j2) /* invoke-custom */);
        class_591 class_591VarMethod_4038 = class_1007VarMethod_3953.method_4038();
        Intrinsics.checkNotNullExpressionValue(class_591VarMethod_4038, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16289, 9030459240411019600L ^ j2) /* invoke-custom */);
        class_591 class_591Var = class_591VarMethod_4038;
        class_10055 class_10055VarMethod_62425 = zf.F(j3).method_1561().method_3953((class_1297) class_1657Var).method_62425((class_1297) class_1657Var, n(i, (char) i2, i3));
        Intrinsics.checkNotNull(class_10055VarMethod_62425, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8165, 1108814715563120900L ^ j2) /* invoke-custom */);
        class_10055 class_10055Var = class_10055VarMethod_62425;
        class_4587Var.method_22903();
        double d2 = class_243Var.field_1352;
        class_4184 class_4184Var = zf.F(j3).method_1561().field_4686;
        Intrinsics.checkNotNull(class_4184Var);
        double dMethod_10216 = d2 - class_4184Var.method_71156().method_10216();
        double d3 = class_243Var.field_1351;
        class_4184 class_4184Var2 = zf.F(j3).method_1561().field_4686;
        Intrinsics.checkNotNull(class_4184Var2);
        double dMethod_10214 = d3 - class_4184Var2.method_71156().method_10214();
        double d4 = class_243Var.field_1350;
        class_4184 class_4184Var3 = zf.F(j3).method_1561().field_4686;
        Intrinsics.checkNotNull(class_4184Var3);
        ?? Method_10215 = d4 - class_4184Var3.method_71156().method_10215();
        try {
            class_4587Var.method_46416((float) dMethod_10216, (float) dMethod_10214, (float) Method_10215);
            class_4587Var.method_22905(class_10055Var.field_53453, class_10055Var.field_53453, class_10055Var.field_53453);
            kf.G.g(j8, class_10055Var, (short) i4, class_4587Var, class_10055Var.field_53446);
            class_4587Var.method_22905(-1.0f, -1.0f, 1.0f);
            class_4587Var.method_22905(0.9375f, 0.9375f, 0.9375f);
            class_4587Var.method_46416(0.0f, -1.501f, 0.0f);
            class_591Var.method_62110(class_10055Var);
            class_591Var.method_62100(class_4587Var, spVar, (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2220, 882758722365835818L ^ j2) /* invoke-custom */, 0, r49.getRGB());
            Method_10215 = g7Var;
            try {
                g7.R(j7, Method_10215, z ? b6.R.m() : b6.R.J(), null, null, new class_4587().method_23760().method_23761(), null, MapsKt.mapOf(TuplesKt.to((String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14344, 8612002275887955702L ^ j2) /* invoke-custom */, gpuTextureViewMethod_71659)), (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13061, 5925875356444520840L ^ j2) /* invoke-custom */, null);
                class_4587Var.method_22909();
                _g[] _gVarArr2 = _gVarArr;
                Method_10215 = _gVarArr2;
                if (j2 >= 0) {
                    if (_gVarArr2 == null) {
                        return;
                    } else {
                        Method_10215 = new _g[5];
                    }
                }
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_10215, -4674279341832686308L, j2) /* invoke-custom */;
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_10215, -4639915619364552821L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_10215, -4639915619364552821L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0, types: [su.catlean.zi] */
    public static void Q(zi ziVar, class_4587 class_4587Var, class_243 class_243Var, class_1657 class_1657Var, float f2, boolean z, int i, Object obj, long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 23026865700239L;
        ?? T = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6043564070553501150L, j2) /* invoke-custom */;
        try {
            T = i & (int) b(MethodHandles.lookup(), "t", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2189, 6518228950761711252L ^ j2) /* invoke-custom */;
            ?? r14 = z;
            ?? r0 = T;
            if (T != 0) {
                r14 = r0;
            } else if (T != 0) {
                r0 = 0;
                r14 = r0;
            }
            ziVar.D(class_4587Var, class_243Var, class_1657Var, j3, f2, r14);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(T, 5983476394381005593L, j2) /* invoke-custom */;
        }
    }

    @NotNull
    public final class_238 S(@NotNull class_1297 $this$interpolatedBox, long a2) {
        long j = a ^ a2;
        int i = (int) (j >>> 56);
        long j2 = ((j ^ 67536027187511L) << 8) >>> 8;
        Intrinsics.checkNotNullParameter($this$interpolatedBox, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13738, 6140045520351466941L ^ j) /* invoke-custom */);
        return l((byte) i, $this$interpolatedBox, j2);
    }

    @NotNull
    public final class_243 Q(long a2, @NotNull class_1657 entity, float factor) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(entity, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25463, 2339524926321238911L ^ j) /* invoke-custom */);
        class_4184 class_4184Var = zf.F(j ^ 87819611710880L).method_1561().field_4686;
        Intrinsics.checkNotNull(class_4184Var);
        class_243 class_243VarMethod_71156 = class_4184Var.method_71156();
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_71156, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27903, 1685724731792010456L ^ j) /* invoke-custom */);
        return new class_243((entity.field_6014 + ((entity.method_23317() - entity.field_6014) * ((double) factor))) - class_243VarMethod_71156.field_1352, (entity.field_6036 + ((entity.method_23318() - entity.field_6036) * ((double) factor))) - class_243VarMethod_71156.field_1351, (entity.field_5969 + ((entity.method_23321() - entity.field_5969) * ((double) factor))) - class_243VarMethod_71156.field_1350);
    }

    public static class_243 I(long j, byte b2, zi ziVar, class_1657 class_1657Var, float f2, int i, Object obj) {
        long j2 = ((j << 8) | ((((long) b2) << 56) >>> 56)) ^ a;
        long j3 = j2 ^ 132474409112281L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j3 << 32) >>> 48);
        int i4 = (int) ((j3 << 48) >>> 48);
        long j4 = j2 ^ 25832911076919L;
        if ((i & 2) != 0) {
            f2 = ziVar.n(i2, (char) i3, i4);
        }
        return ziVar.Q(j4, class_1657Var, f2);
    }

    static {
        int i;
        long j = a ^ 6478026844419L;
        e = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(0, -5046523004156509534L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[47];
        int i3 = 0;
        String str = "\u0093\u0014Î×_©k¼Äm~ÝPÁ\u009d{r\u008a\u0011Q]\u0088\u008c\u00ad¯æ-\u0081D«Ó(ÜG¹\u0097?â\u0013ªd ¡[XÑ\u0014\u009c\u009d®¯§úx\u0011\u007f )ØðÆ\u0015¤G¦c\u001e\u0013Ä÷ç\u008c\u0098\u008cæìU4gÇÃ£ã\u008eÏ\u0082ÛOy\u0010W\u0003\u009d²\rq|)ég=\u0089 6yö\u0010%?\u0096N\u0084ãÖ\u0086\u0093}\u009a\u0087E \u000f\u0081\u0010\u0015*³\"Èøq¡zº¤D\u00972\u0018n ×y\r±µ;\u0093÷<@Ñ÷\u0014\u0099\u0091\u0082\u009cÉÌí«nbôj¹©)Ý/ë=\u0089wKÆ57,ÀNµ\u0002\u009bàr©aWÛgyÕôlüh,NU\u00adô'\u0085\u008f§àãéG\u00ad\u001aû½î}üÇËçLÞ\u0081\u0092µâAÅÇXÑü\u009d\tÎö©]=¨¾°Å\u0090>nmÝ(\tP\u0005\u001bÍ¼\u0085 #¿¹\u008bÅ\u0013\u0004r°4K\u0098$¾ûY\u009e¦F\u0097Î\u0094\u0089\u008c[\b\u009a½\u0091¤à»\u0088F¸Ç'`o(\u0094½Ô\u0010(@´gép¨\u008cÝçL·\u0002M³ó\u0010È\u0080|ÑÅ*IUª\u00033Ï£ÅxÍ\u0010GìÕ\u0006g7\u001a-7\u0007\u0001ºq\u0014\u0016^\u0010G©\u008aÜ $.\u0096Nî¥F\u0014kë\u0017\u0010×\u0006¡2Ù\u0081ô\u0099ÙÖI`¡Ñ\u0081\"\u0010ÉË\u008b\u0096\u008eÅ\u009aÂ\u001dÇ/úq\u0004U³ ¿èÞÚt$}\u008eáf\u0099Íè\u0010A\u0099t\u0085ý\u0098þ\u0093cÔXúÆ£\u0092' â(\u008e¬8\u0083}Q\u009b45IÈØAd[ä`\u008dB\u0098\u0098eh]¿µÛ{\u0087ñÿPÃFõ6 Úúü(v|Âä5\u0082~F\u0003\u0007\u009cèë\u009a\u001f\u0082îÇÏtß\u0081Jêl\u0090*~N%3`¤ÖÛ\u0006\u00027jÈ\u0010/l\r¾3Za×é\u001f«ÔñÀPÍ\u0010Fs³&=\u0019:þ\u000f\u0010\u0085À\bÃ|>\u0010e\u0012gkç³\u0091\u0088 \u0011>yn\u001cÌp\u0010·qþ\u009d\u0091ÒB\r\u0006éÀ·±ó\u0084\u001b E\u00017c\u0095üàÛZÐé\u0081f\u008b¸FÌ\u000e{yÙ\u0081o\u0004\t±z\u0084CP\u001dé(\u001bjK\u001ch\u0094¼uHï\u0087µÐuÀ=\u0011z\u0096Êb\"?8\u0016EÔ\u0014\u009dË\u0091çº÷\u009a)&ñ\u00adw\u0018(\u001f×o\u001dí\u0080\u0000{ÿõÌÈ WñKç]\f²;ðA\u0010Â,Åð\u0016\u0080v\fò/WhxF05(ä¦z¨mf´ÈèðÜõ\\¶\u001a:â³´46$m\u008eT?·4wÅz\u008d*\u0084\u009aì\u0085é\u0014¥\u0010Î*³ÒÕ\u009cá2F4mðbJyg\u0010A,Í\u000eÙðDYÔ\u0013S\u0011A÷\u008a÷ S\u008a¦f~\u0080ìA®}§\t\u008d\u008a\u0098§\u00ad-ÙX{\u000e/Q\u008b\u000b\u0082mM\nâc Å-Ï¤0ñød\u000biOHÓ8À·¨\u0083\u008e\u0081p*l,Ì°=\u0005 ¯\u0080\u001f\u0010\t<\u0090d\u0012U¯P}§jÒT¯Í\u0003 ²aÊ1wLnÿz\u009a\u000f\u0091xY#µç²ùÇÜ>ñt3b\f\u0013\"UAü\u0010ÀË¿ra\u008cø\u009cr\u009f÷B\u0013\b7@\u0018 \u009fÒKÿäyÎe\u0015dMt\u008b\u0094C'/>SiP\u0086\u001a \u0002Of\u008d\u009fÓÖpoï³¨\bxIn\u0097u\u009d/u\u0001øN\u001fj\u009fauæÓ^\u0010.¾8'Drì\u0097«\u0011$\u00961ðh\u001c\u0010¹~}ß\u008d\u0097\u0082`!«\u0088Ìl\r´\u0082\u0010_K\u001c7Ý\u0011Q\u001bo\u009d@Nÿ®\n\u0001(¶¡\u0006õp$âøë\u0094\u001dà>ö÷H\u0001n®Ò¨\fqFÄ³\u000f\u008d\u0094×Y\u0001Þaì7QGMÛ\u0010wªB\u0090Ô\u0006£¹O\u0015G\u009b\tn\u0088ã\u0010Û!Ü¯o\u007fb°Ôß*\u008e(ïm\u009f(Àu,\u0089y\u0011/¯\u0093îÿÅ\r\n\u0016\u0019r>\u008b\u008aÕIé\u0014à¬\u0099«®r\u00863\u000e£ÐTÌG±\u001cø\u000b,\u00ad(Í6´Å2m!©\u0093\"»sªÃßXûÊ\u009exL\u0010óÄÙ\u001b\u0019ùaZHþgi\u0087\u0086eLq»½õ\u0091kXçÑp!\u001a\f\u009eÇ+\u0091\bß\u0001\u0086R\u0019ö\u0003ëf2\u0092h\ff³¹¢\u0089\u00adîO\u008b\u009ce÷\u0006\u008cv%ß\rÚÌ\u0017ÿã´E7\u0010s ^~\u008a\u0081Ò¹\u00880]P½W\u0087©!;ßá²¯¢w>ÖA³,d\u007f\u008dç1´Ê\u0083\u009dîû¤Ä[÷Z\nÑÀ\u00159#E±U¦\u0088U\u0015»;\u0089&zæÓ\u009fBÖ{þ.MÉº\u0088\u001d\u009fñ(Äº¤²¢Ú\nQ\t7½\u0088ä\u0015¡¬°\u0016¾ÀÈÐlS,Z©·íß \u0016P§Qõb\u008ar\u001bxë\u009a\u0012V§\u009dñR\bí\u008fhØ±]ÚbD´P·F\u0092\u0094§î`L\u0010mHâÓ\u009bl}ïC\u009fç8wç\u0012j\u0010}\u0093\u0001®z^££à±#\u000bO»)'\u0010º\u0093\u001bêF\u0005¼>èªÚÎ/=àÀ ÙòfÎNÁM\u008c\u0000\u0018¸DãU\u0093^\u0015Ti[ZÙ¸»Ø6z³@\tZ\u0013";
        int length = "\u0093\u0014Î×_©k¼Äm~ÝPÁ\u009d{r\u008a\u0011Q]\u0088\u008c\u00ad¯æ-\u0081D«Ó(ÜG¹\u0097?â\u0013ªd ¡[XÑ\u0014\u009c\u009d®¯§úx\u0011\u007f )ØðÆ\u0015¤G¦c\u001e\u0013Ä÷ç\u008c\u0098\u008cæìU4gÇÃ£ã\u008eÏ\u0082ÛOy\u0010W\u0003\u009d²\rq|)ég=\u0089 6yö\u0010%?\u0096N\u0084ãÖ\u0086\u0093}\u009a\u0087E \u000f\u0081\u0010\u0015*³\"Èøq¡zº¤D\u00972\u0018n ×y\r±µ;\u0093÷<@Ñ÷\u0014\u0099\u0091\u0082\u009cÉÌí«nbôj¹©)Ý/ë=\u0089wKÆ57,ÀNµ\u0002\u009bàr©aWÛgyÕôlüh,NU\u00adô'\u0085\u008f§àãéG\u00ad\u001aû½î}üÇËçLÞ\u0081\u0092µâAÅÇXÑü\u009d\tÎö©]=¨¾°Å\u0090>nmÝ(\tP\u0005\u001bÍ¼\u0085 #¿¹\u008bÅ\u0013\u0004r°4K\u0098$¾ûY\u009e¦F\u0097Î\u0094\u0089\u008c[\b\u009a½\u0091¤à»\u0088F¸Ç'`o(\u0094½Ô\u0010(@´gép¨\u008cÝçL·\u0002M³ó\u0010È\u0080|ÑÅ*IUª\u00033Ï£ÅxÍ\u0010GìÕ\u0006g7\u001a-7\u0007\u0001ºq\u0014\u0016^\u0010G©\u008aÜ $.\u0096Nî¥F\u0014kë\u0017\u0010×\u0006¡2Ù\u0081ô\u0099ÙÖI`¡Ñ\u0081\"\u0010ÉË\u008b\u0096\u008eÅ\u009aÂ\u001dÇ/úq\u0004U³ ¿èÞÚt$}\u008eáf\u0099Íè\u0010A\u0099t\u0085ý\u0098þ\u0093cÔXúÆ£\u0092' â(\u008e¬8\u0083}Q\u009b45IÈØAd[ä`\u008dB\u0098\u0098eh]¿µÛ{\u0087ñÿPÃFõ6 Úúü(v|Âä5\u0082~F\u0003\u0007\u009cèë\u009a\u001f\u0082îÇÏtß\u0081Jêl\u0090*~N%3`¤ÖÛ\u0006\u00027jÈ\u0010/l\r¾3Za×é\u001f«ÔñÀPÍ\u0010Fs³&=\u0019:þ\u000f\u0010\u0085À\bÃ|>\u0010e\u0012gkç³\u0091\u0088 \u0011>yn\u001cÌp\u0010·qþ\u009d\u0091ÒB\r\u0006éÀ·±ó\u0084\u001b E\u00017c\u0095üàÛZÐé\u0081f\u008b¸FÌ\u000e{yÙ\u0081o\u0004\t±z\u0084CP\u001dé(\u001bjK\u001ch\u0094¼uHï\u0087µÐuÀ=\u0011z\u0096Êb\"?8\u0016EÔ\u0014\u009dË\u0091çº÷\u009a)&ñ\u00adw\u0018(\u001f×o\u001dí\u0080\u0000{ÿõÌÈ WñKç]\f²;ðA\u0010Â,Åð\u0016\u0080v\fò/WhxF05(ä¦z¨mf´ÈèðÜõ\\¶\u001a:â³´46$m\u008eT?·4wÅz\u008d*\u0084\u009aì\u0085é\u0014¥\u0010Î*³ÒÕ\u009cá2F4mðbJyg\u0010A,Í\u000eÙðDYÔ\u0013S\u0011A÷\u008a÷ S\u008a¦f~\u0080ìA®}§\t\u008d\u008a\u0098§\u00ad-ÙX{\u000e/Q\u008b\u000b\u0082mM\nâc Å-Ï¤0ñød\u000biOHÓ8À·¨\u0083\u008e\u0081p*l,Ì°=\u0005 ¯\u0080\u001f\u0010\t<\u0090d\u0012U¯P}§jÒT¯Í\u0003 ²aÊ1wLnÿz\u009a\u000f\u0091xY#µç²ùÇÜ>ñt3b\f\u0013\"UAü\u0010ÀË¿ra\u008cø\u009cr\u009f÷B\u0013\b7@\u0018 \u009fÒKÿäyÎe\u0015dMt\u008b\u0094C'/>SiP\u0086\u001a \u0002Of\u008d\u009fÓÖpoï³¨\bxIn\u0097u\u009d/u\u0001øN\u001fj\u009fauæÓ^\u0010.¾8'Drì\u0097«\u0011$\u00961ðh\u001c\u0010¹~}ß\u008d\u0097\u0082`!«\u0088Ìl\r´\u0082\u0010_K\u001c7Ý\u0011Q\u001bo\u009d@Nÿ®\n\u0001(¶¡\u0006õp$âøë\u0094\u001dà>ö÷H\u0001n®Ò¨\fqFÄ³\u000f\u008d\u0094×Y\u0001Þaì7QGMÛ\u0010wªB\u0090Ô\u0006£¹O\u0015G\u009b\tn\u0088ã\u0010Û!Ü¯o\u007fb°Ôß*\u008e(ïm\u009f(Àu,\u0089y\u0011/¯\u0093îÿÅ\r\n\u0016\u0019r>\u008b\u008aÕIé\u0014à¬\u0099«®r\u00863\u000e£ÐTÌG±\u001cø\u000b,\u00ad(Í6´Å2m!©\u0093\"»sªÃßXûÊ\u009exL\u0010óÄÙ\u001b\u0019ùaZHþgi\u0087\u0086eLq»½õ\u0091kXçÑp!\u001a\f\u009eÇ+\u0091\bß\u0001\u0086R\u0019ö\u0003ëf2\u0092h\ff³¹¢\u0089\u00adîO\u008b\u009ce÷\u0006\u008cv%ß\rÚÌ\u0017ÿã´E7\u0010s ^~\u008a\u0081Ò¹\u00880]P½W\u0087©!;ßá²¯¢w>ÖA³,d\u007f\u008dç1´Ê\u0083\u009dîû¤Ä[÷Z\nÑÀ\u00159#E±U¦\u0088U\u0015»;\u0089&zæÓ\u009fBÖ{þ.MÉº\u0088\u001d\u009fñ(Äº¤²¢Ú\nQ\t7½\u0088ä\u0015¡¬°\u0016¾ÀÈÐlS,Z©·íß \u0016P§Qõb\u008ar\u001bxë\u009a\u0012V§\u009dñR\bí\u008fhØ±]ÚbD´P·F\u0092\u0094§î`L\u0010mHâÓ\u009bl}ïC\u009fç8wç\u0012j\u0010}\u0093\u0001®z^££à±#\u000bO»)'\u0010º\u0093\u001bêF\u0005¼>èªÚÎ/=àÀ ÙòfÎNÁM\u008c\u0000\u0018¸DãU\u0093^\u0015Ti[ZÙ¸»Ø6z³@\tZ\u0013".length();
        char cCharAt = '8';
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
                            d = new String[47];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[21];
                            int i9 = 0;
                            String str3 = "`.KK\u0086Aù©Ú\u0094f\u00ad\u008d\u0011E\\2p\u008d$÷]\bÁ÷\u008d\u009eäïLE£ÀÞc\u0085\u0007\u0099-ÁOWH\u009f\u008cu§\u0081Çõé²Ã\u0088\u0099È«½YÂ÷çñ9\u00865\"{»W\n\u009d¬\u0014@ÌIa\u0011V-äÏ\u001euõ´Ùkå8\u0016Î\b\u008ctôQ}5=-ê¦\u008c\u0018\u0081C¼ý×Aî.\"p\u000f1ß{`íø-\u0001\fYý\u0017½Q\u0094¹[ý>g©=áâîä\r»\u0011fÉ³6\u0099ù";
                            int length2 = "`.KK\u0086Aù©Ú\u0094f\u00ad\u008d\u0011E\\2p\u008d$÷]\bÁ÷\u008d\u009eäïLE£ÀÞc\u0085\u0007\u0099-ÁOWH\u009f\u008cu§\u0081Çõé²Ã\u0088\u0099È«½YÂ÷çñ9\u00865\"{»W\n\u009d¬\u0014@ÌIa\u0011V-äÏ\u001euõ´Ùkå8\u0016Î\b\u008ctôQ}5=-ê¦\u008c\u0018\u0081C¼ý×Aî.\"p\u000f1ß{`íø-\u0001\fYý\u0017½Q\u0094¹[ý>g©=áâîä\r»\u0011fÉ³6\u0099ù".length();
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
                                                f = jArr;
                                                g = new Integer[21];
                                                v = new zi();
                                                t = new Matrix4f();
                                                m = new class_4604(new Matrix4f(), new Matrix4f());
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "Kà]\u00899\u0094\u0086ëp4à\u009eÿ»àÖ";
                                                length2 = "Kà]\u00899\u0094\u0086ëp4à\u009eÿ»àÖ".length();
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
                        str = "W\u0092Äßü\u0018£Ô\u0091,*k¸\u0081!\u008f\u0010º\u0082C©R«|Yí'\u000fV²hð¢";
                        length = "W\u0092Äßü\u0018£Ô\u0091,*k¸\u0081!\u008f\u0010º\u0082C©R«|Yí'\u000fV²hð¢".length();
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

    public static void h(int i) {
        N = i;
    }

    public static int r() {
        return N;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int A() {
        return r() == 0 ? 28 : 0;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 14562;
        if (d[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i2] = a(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/zi", e2);
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
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
            r1 = 11446(0x2cb6, float:1.6039E-41)
            r2 = -1
            r0[r1] = r2
            java.lang.invoke.MethodHandle r-3 = r-3.asCollector(r-2, r-1)
            r-2 = 0
            r-1 = 3
            java.lang.Object[] r-1 = new java.lang.Object[r-1]
            r0 = r-1
            r1 = 0
            r2 = r8
            r0[r1] = r2
            r0 = r-1
            r1 = 1
            r2 = r11
            r0[r1] = r2
            r0 = r-1
            r1 = 2
            r2 = r9
            r0[r1] = r2
            java.lang.invoke.MethodHandle r-3 = java.lang.invoke.MethodHandles.insertArguments(r-3, r-2, r-1)
            r-2 = r10
            java.lang.invoke.MethodHandle r-3 = java.lang.invoke.MethodHandles.explicitCastArguments(r-3, r-2)
            r-4.setTarget(r-3)
            goto L62
            r12 = r-5
            java.lang.RuntimeException r-5 = new java.lang.RuntimeException
            r-4 = r-5
            java.lang.StringBuilder r-3 = new java.lang.StringBuilder
            r-2 = r-3
            r-2.<init>()
            java.lang.String r-2 = "su/catlean/zi"
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            java.lang.String r-2 = " : "
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            r-2 = r9
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            java.lang.String r-2 = " : "
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            r-2 = r10
            java.lang.String r-2 = r-2.toString()
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            java.lang.String r-3 = r-3.toString()
            r-2 = r12
            r-4.<init>(r-3, r-2)
            throw r-5
            r-4 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zi.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 31874;
        if (g[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/zi", e2);
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
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
            r1 = 11446(0x2cb6, float:1.6039E-41)
            r2 = -1
            r0[r1] = r2
            java.lang.invoke.MethodHandle r-3 = r-3.asCollector(r-2, r-1)
            r-2 = 0
            r-1 = 3
            java.lang.Object[] r-1 = new java.lang.Object[r-1]
            r0 = r-1
            r1 = 0
            r2 = r8
            r0[r1] = r2
            r0 = r-1
            r1 = 1
            r2 = r11
            r0[r1] = r2
            r0 = r-1
            r1 = 2
            r2 = r9
            r0[r1] = r2
            java.lang.invoke.MethodHandle r-3 = java.lang.invoke.MethodHandles.insertArguments(r-3, r-2, r-1)
            r-2 = r10
            java.lang.invoke.MethodHandle r-3 = java.lang.invoke.MethodHandles.explicitCastArguments(r-3, r-2)
            r-4.setTarget(r-3)
            goto L62
            r12 = r-5
            java.lang.RuntimeException r-5 = new java.lang.RuntimeException
            r-4 = r-5
            java.lang.StringBuilder r-3 = new java.lang.StringBuilder
            r-2 = r-3
            r-2.<init>()
            java.lang.String r-2 = "su/catlean/zi"
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            java.lang.String r-2 = " : "
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            r-2 = r9
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            java.lang.String r-2 = " : "
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            r-2 = r10
            java.lang.String r-2 = r-2.toString()
            java.lang.StringBuilder r-3 = r-3.append(r-2)
            java.lang.String r-3 = r-3.toString()
            r-2 = r12
            r-4.<init>(r-3, r-2)
            throw r-5
            r-4 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.zi.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
