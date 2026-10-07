package su.catlean;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import net.minecraft.class_10444;
import net.minecraft.class_11566;
import net.minecraft.class_1297;
import net.minecraft.class_1799;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_4608;
import net.minecraft.class_811;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix3x2fc;
import org.joml.Matrix4f;
import org.joml.Vector4d;
import su.catlean.api.event.events.client.TickEvent;
import su.catlean.api.event.events.render.FlipFrameEvent;
import su.catlean.api.event.events.render.Render2DEvent;
import su.catlean.api.event.events.render.RenderScreenEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/jl.class */
public final class jl {

    @NotNull
    public static final jl y;

    @NotNull
    private static final CopyOnWriteArrayList E;
    private static boolean d;

    @NotNull
    private static final Matrix4f r;

    @NotNull
    private static final Matrix4f V;

    @NotNull
    private static int[] M;
    private static int w;
    private static float X;
    private static _g[] v;
    private static final long a = yz.a(-9195116701774200179L, -3824621880647670146L, MethodHandles.lookup().lookupClass()).a(20721331819440L);
    private static final String[] b;
    private static final String[] c;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;

    private jl() {
    }

    public final boolean V() {
        return d;
    }

    public final void h(boolean z) {
        d = z;
    }

    @NotNull
    public final Matrix4f b() {
        return r;
    }

    @NotNull
    public final Matrix4f m() {
        return V;
    }

    @NotNull
    public final int[] u() {
        return M;
    }

    public final void p(@NotNull int[] iArr, long a2) {
        Intrinsics.checkNotNullParameter(iArr, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31528, 7794673325750588666L ^ (a ^ a2)) /* invoke-custom */);
        M = iArr;
    }

    public final float t() {
        return X;
    }

    public final void m(float f2) {
        X = f2;
    }

    @Flow
    private final void C(TickEvent tickEvent) throws Throwable {
        long j = a ^ 30812656593507L;
        long j2 = j ^ 32550830443343L;
        long j3 = j ^ 68266025662056L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6290689994637883724L, j) /* invoke-custom */;
        int iMethod_4495 = zf.F(j2).method_22683().method_4495();
        if (iMethod_4495 != w) {
            for (c6 c6Var : b8.b()) {
                _g[] _gVarArr2 = null;
                try {
                    c6Var.close();
                    c6Var.F(j3);
                    _gVarArr2 = _gVarArr;
                    if (_gVarArr2 != null || _gVarArr != null) {
                        break;
                    }
                } catch (IllegalArgumentException unused) {
                    throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr2, 6265130041185779681L, j) /* invoke-custom */;
                }
            }
            w = iMethod_4495;
        }
    }

    @Flow(priority = 20)
    private final void u(Render2DEvent render2DEvent) throws Throwable {
        long j = a ^ 71672542602841L;
        dv.D.n(j ^ 103257683097578L);
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1979147394704274806L, j) /* invoke-custom */;
        Iterator it = E.iterator();
        while (it.hasNext()) {
            _g[] _gVarArr2 = null;
            try {
                ((Function0) it.next()).invoke();
                _gVarArr2 = _gVarArr;
                if (_gVarArr2 != null) {
                    return;
                }
                if (_gVarArr != null) {
                    break;
                }
            } catch (IllegalArgumentException unused) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr2, 1929910902531027931L, j) /* invoke-custom */;
            }
        }
        E.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    @Flow(priority = -20)
    private final void U(RenderScreenEvent renderScreenEvent) throws Throwable {
        long j = a ^ 13158949910938L;
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4272769489461499211L, j) /* invoke-custom */;
        try {
            try {
                obj = d;
                boolean z = obj;
                if (obj == 0) {
                    if (obj == 0) {
                        return;
                    }
                    GlStateManager._glBindFramebuffer((int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17770, 8051368906331934495L ^ j) /* invoke-custom */, 0);
                    z = 0;
                }
                d = z;
            } catch (IllegalArgumentException unused) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -4248265101532320744L, j) /* invoke-custom */;
            }
        } catch (IllegalArgumentException unused2) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -4248265101532320744L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [su.catlean.fi] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    @Flow
    private final void k(RenderScreenEvent renderScreenEvent) throws Throwable {
        long j = a ^ 30623706240338L;
        long j2 = j ^ 28891556951166L;
        long j3 = j ^ 13978561069988L;
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1694476179506198915L, j) /* invoke-custom */;
        try {
            try {
                try {
                    if (zf.F(j2).field_1755 instanceof fi) {
                        obj = fi.C;
                        fi fiVar = obj;
                        if (obj == 0) {
                            if (obj.F() != null) {
                                return;
                            } else {
                                fiVar = fi.C;
                            }
                        }
                        fiVar.v(renderScreenEvent.getContext(), j3);
                    }
                } catch (IllegalArgumentException unused) {
                    throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -1602382856790540080L, j) /* invoke-custom */;
                }
            } catch (IllegalArgumentException unused2) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -1602382856790540080L, j) /* invoke-custom */;
            }
        } catch (IllegalArgumentException unused3) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -1602382856790540080L, j) /* invoke-custom */;
        }
    }

    @Flow
    private final void i(FlipFrameEvent flipFrameEvent) {
        z5.B.R().method_71100();
        ba.A.n().method_71100();
        jb.p.v().method_71100();
        wt.N.z().method_71100();
        cf.O.P().method_71100();
        xc.I.V().method_71100();
        j5.r.W().method_71100();
        o9.R.Z().method_71100();
        u.I.E().method_71100();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.g7] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.g7] */
    /* JADX WARN: Type inference failed for: r0v25, types: [su.catlean.g7] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    public final void q(@NotNull g7 polygon, float x, float y2, float w2, float h2, long a2, @NotNull Color[] colors) throws Throwable {
        Color color;
        Color color2;
        Color color3;
        long j = a ^ a2;
        long j2 = j ^ 28341076931746L;
        long j3 = j ^ 76780912890825L;
        Object objJ = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1618026080123615349L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(polygon, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31150, 5628738034949459764L ^ j) /* invoke-custom */);
        try {
            try {
                Intrinsics.checkNotNullParameter(colors, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21277, 8816570234539517371L ^ j) /* invoke-custom */);
                objJ = g7.j(g7.j(polygon, x, y2 + h2, 0.0f, 4, j3, null).n(colors[0], j2), x + w2, y2 + h2, 0.0f, 4, j3, null);
                Color[] colorArr = colors;
                if (objJ != 0) {
                    color = colorArr[0];
                } else if (colorArr.length > 1) {
                    color = colors[1];
                } else {
                    colorArr = colors;
                    color = colorArr[0];
                }
                try {
                    try {
                        objJ = g7.j(objJ.n(color, j2), x + w2, y2, 0.0f, 4, j3, null);
                        Color[] colorArr2 = colors;
                        if (objJ != 0) {
                            color2 = colorArr2[0];
                        } else if (colorArr2.length > 1) {
                            color2 = colors[2];
                        } else {
                            colorArr2 = colors;
                            color2 = colorArr2[0];
                        }
                        try {
                            try {
                                objJ = g7.j(objJ.n(color2, j2), x, y2, 0.0f, 4, j3, null);
                                Color[] colorArr3 = colors;
                                if (objJ != 0) {
                                    color3 = colorArr3[0];
                                } else if (colorArr3.length > 1) {
                                    color3 = colors[3];
                                } else {
                                    colorArr3 = colors;
                                    color3 = colorArr3[0];
                                }
                                objJ.n(color3, j2);
                            } catch (IllegalArgumentException unused) {
                                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objJ, 1714553735317487320L, j) /* invoke-custom */;
                            }
                        } catch (IllegalArgumentException unused2) {
                            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objJ, 1714553735317487320L, j) /* invoke-custom */;
                        }
                    } catch (IllegalArgumentException unused3) {
                        throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objJ, 1714553735317487320L, j) /* invoke-custom */;
                    }
                } catch (IllegalArgumentException unused4) {
                    throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objJ, 1714553735317487320L, j) /* invoke-custom */;
                }
            } catch (IllegalArgumentException unused5) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objJ, 1714553735317487320L, j) /* invoke-custom */;
            }
        } catch (IllegalArgumentException unused6) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objJ, 1714553735317487320L, j) /* invoke-custom */;
        }
    }

    public final void P(@NotNull Matrix3x2fStack matrices, float x, float y2, float w2, float h2, @NotNull Color[] colors, long a2) throws Throwable {
        Color color;
        Color color2;
        Color color3;
        long j = a ^ a2;
        long j2 = j ^ 24881693598635L;
        long j3 = j ^ 45227279680012L;
        long j4 = j ^ 70558429968326L;
        long j5 = j ^ 128849340523879L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2367295544347840219L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(matrices, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9993, 3579372016943785776L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(colors, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28628, 6585302474317606871L ^ j) /* invoke-custom */);
        VertexFormat vertexFormat = class_290.field_1576;
        Intrinsics.checkNotNullExpressionValue(vertexFormat, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20505, 8210348355821834295L ^ j) /* invoke-custom */);
        g7 g7VarJ = g7.j(g7.j(new g7(j2, vertexFormat, 0, false, (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30831, 4011477412606711418L ^ j) /* invoke-custom */, null), x, y2 + h2, 0.0f, 4, j5, null).n(colors[0], j3), x + w2, y2 + h2, 0.0f, 4, j5, null);
        Color[] colorArr = colors;
        if (_gVarArr == null) {
            try {
                if (colorArr.length > 1) {
                    color = colors[1];
                } else {
                    colorArr = colors;
                    color = colorArr[0];
                }
            } catch (IllegalArgumentException unused) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(g7VarJ, 2406436697312643190L, j) /* invoke-custom */;
            }
        } else {
            color = colorArr[0];
        }
        try {
            try {
                g7VarJ = g7.j(g7VarJ.n(color, j3), x + w2, y2, 0.0f, 4, j5, null);
                Color[] colorArr2 = colors;
                if (_gVarArr != null) {
                    color2 = colorArr2[0];
                } else if (colorArr2.length > 1) {
                    color2 = colors[2];
                } else {
                    colorArr2 = colors;
                    color2 = colorArr2[0];
                }
                try {
                    try {
                        g7VarJ = g7.j(g7VarJ.n(color2, j3), x, y2, 0.0f, 4, j5, null);
                        Color[] colorArr3 = colors;
                        if (_gVarArr != null) {
                            color3 = colorArr3[0];
                        } else if (colorArr3.length > 1) {
                            color3 = colors[3];
                        } else {
                            colorArr3 = colors;
                            color3 = colorArr3[0];
                        }
                        g7.R(j4, g7VarJ.n(color3, j3), b6.R.Z(), null, null, null, new Matrix3x2f((Matrix3x2fc) matrices), null, (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29700, 926253197872929304L ^ j) /* invoke-custom */, null);
                    } catch (IllegalArgumentException unused2) {
                        throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(g7VarJ, 2406436697312643190L, j) /* invoke-custom */;
                    }
                } catch (IllegalArgumentException unused3) {
                    throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(g7VarJ, 2406436697312643190L, j) /* invoke-custom */;
                }
            } catch (IllegalArgumentException unused4) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(g7VarJ, 2406436697312643190L, j) /* invoke-custom */;
            }
        } catch (IllegalArgumentException unused5) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(g7VarJ, 2406436697312643190L, j) /* invoke-custom */;
        }
    }

    public final void Y(@Nullable Matrix3x2fStack matrices, float x, float y2, float width, float height, long a2, @NotNull Color c2) {
        long j = a ^ a2;
        long j2 = j ^ 76224818822008L;
        long j3 = j ^ 48778361458354L;
        int i = (int) (j >>> 32);
        long j4 = ((j ^ 7123914425836L) << 32) >>> 32;
        long j5 = j ^ 27767532215315L;
        Intrinsics.checkNotNullParameter(c2, "c");
        VertexFormat vertexFormat = class_290.field_1576;
        Intrinsics.checkNotNullExpressionValue(vertexFormat, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6676, 5714630924513895276L ^ j) /* invoke-custom */);
        g7.R(j3, g7.j(g7.j(g7.j(g7.j(g7.j(g7.j(g7.j(g7.j(new g7(i, j4, vertexFormat, 4, true), x, y2, 0.0f, 4, j5, null).n(c2, j2), x, y2 + height, 0.0f, 4, j5, null).n(c2, j2), x, y2 + height, 0.0f, 4, j5, null).n(c2, j2), x + width, y2 + height, 0.0f, 4, j5, null).n(c2, j2), x + width, y2 + height, 0.0f, 4, j5, null).n(c2, j2), x + width, y2, 0.0f, 4, j5, null).n(c2, j2), x + width, y2, 0.0f, 4, j5, null).n(c2, j2), x, y2, 0.0f, 4, j5, null).n(c2, j2), b6.R.w(), null, null, null, new Matrix3x2f((Matrix3x2fc) matrices), null, (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22086, 4007002595066773805L ^ j) /* invoke-custom */, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00aa: INVOKE (r-1 I:su.catlean.a8), (r0 I:long), (r1 I:su.catlean.o7) VIRTUAL call: su.catlean.a8.I(long, su.catlean.o7):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final void j(long r9, @org.jetbrains.annotations.NotNull net.minecraft.class_332 r11, @org.jetbrains.annotations.NotNull su.catlean.o7 r12) {
        /*
            r8 = this;
            long r0 = su.catlean.jl.a
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 62581087897527(0x38eacb8387b7, double:3.09191656095395E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = r11
            r1 = 767(0x2ff, float:1.075E-42)
            r2 = 2489605466204409130(0x228cdafb23fc0d2a, double:2.9578699640476014E-142)
            r3 = r9
            long r2 = r2 ^ r3
            java.lang.String r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/jl;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "u"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r0 = r12
            r1 = 25208(0x6278, float:3.5324E-41)
            r2 = 5364131099923082629(0x4a7138d0a38a6d85, double:4.027181459071989E50)
            r3 = r9
            long r2 = r2 ^ r3
            java.lang.String r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/jl;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "u"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            org.joml.Vector2f r0 = new org.joml.Vector2f
            r1 = r0
            r1.<init>()
            r15 = r0
            org.joml.Vector2f r0 = new org.joml.Vector2f
            r1 = r0
            r1.<init>()
            r16 = r0
            r0 = r11
            org.joml.Matrix3x2fStack r0 = r0.method_51448()
            r1 = r12
            float r1 = r1.R()
            r2 = r12
            float r2 = r2.w()
            r3 = r15
            org.joml.Vector2f r0 = r0.transformPosition(r1, r2, r3)
            r0 = r11
            org.joml.Matrix3x2fStack r0 = r0.method_51448()
            r1 = r12
            float r1 = r1.t()
            r2 = r12
            float r2 = r2.O()
            r3 = r16
            org.joml.Vector2f r0 = r0.transformPosition(r1, r2, r3)
            r0 = r11
            r1 = r15
            float r1 = r1.x
            int r1 = (int) r1
            r2 = r15
            float r2 = r2.y
            int r2 = (int) r2
            r3 = r16
            float r3 = r3.x
            int r3 = (int) r3
            r4 = r16
            float r4 = r4.y
            int r4 = (int) r4
            r0.method_44379(r1, r2, r3, r4)
            su.catlean.a8 r0 = su.catlean.a8.k
            su.catlean.o7 r1 = new su.catlean.o7
            r2 = r1
            r3 = r15
            float r3 = r3.x
            r4 = r15
            float r4 = r4.y
            r5 = r16
            float r5 = r5.x
            r6 = r16
            float r6 = r6.y
            r2.<init>(r3, r4, r5, r6)
            r2 = r13
            r3 = r2; r2 = r1; r1 = r3; 
            r-1.I(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jl.j(long, net.minecraft.class_332, su.catlean.o7):void");
    }

    public final void W(long a2, @NotNull class_332 context) {
        long j = a ^ a2;
        long j2 = j ^ 54673236196363L;
        Intrinsics.checkNotNullParameter(context, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12985, 3312639027547118397L ^ j) /* invoke-custom */);
        context.method_44380();
        a8.k.y((int) (j >>> 32), (char) ((j2 << 32) >>> 48), (short) ((j2 << 48) >>> 48));
    }

    private final void O(long j, g7 g7Var, float f2, float f3, float f4, float f5, Color color) {
        long j2 = a ^ j;
        long j3 = j2 ^ 38005549578521L;
        long j4 = j2 ^ 121320222294007L;
        g7Var.G(f2, j3, f3, 0.0f).n(color, j4);
        g7Var.G(f2, j3, f5, 0.0f).n(color, j4);
        g7Var.G(f4, j3, f5, 0.0f).n(color, j4);
        g7Var.G(f4, j3, f3, 0.0f).n(color, j4);
    }

    public final void s(@NotNull Matrix3x2f matrices, @NotNull class_2960 id, float x, float y2, float width, float height, @NotNull Color color1, @NotNull Color color2, @NotNull Color color3, @NotNull Color color4, float uStart, float vStart, float uEnd, float vEnd, boolean altBlend, long a2) throws Throwable {
        long j = a ^ a2;
        long j2 = j ^ 70197628914598L;
        long j3 = j ^ 108967377802453L;
        long j4 = j ^ 101814391944562L;
        long j5 = j ^ 58926473003192L;
        long j6 = j ^ 600665313817L;
        long j7 = j ^ 14945938001993L;
        Intrinsics.checkNotNullParameter(matrices, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31290, 9114384936725777760L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5591, 3924592605001736879L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color1, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28310, 8923792601537059304L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color2, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15895, 5292792733580970312L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color3, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29607, 654732053224228076L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color4, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9461, 8737270848844551072L ^ j) /* invoke-custom */);
        GpuTextureView gpuTextureViewMethod_71659 = zf.F(j2).method_1531().method_4619(id).method_71659();
        Intrinsics.checkNotNullExpressionValue(gpuTextureViewMethod_71659, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4708, 6619696273180091701L ^ j) /* invoke-custom */);
        VertexFormat vertexFormat = class_290.field_1575;
        Intrinsics.checkNotNullExpressionValue(vertexFormat, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3238, 6115330523883699157L ^ j) /* invoke-custom */);
        g7 g7Var = new g7(j3, vertexFormat, 0, false, (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26960, 1738100815095377955L ^ j) /* invoke-custom */, null);
        try {
            g7.j(g7Var, x + 0, y2 + height, 0.0f, 4, j6, null).j(uStart, j7, vEnd).n(color1, j4);
            g7.j(g7Var, x + width, y2 + height, 0.0f, 4, j6, null).j(uEnd, j7, vEnd).n(color2, j4);
            g7.j(g7Var, x + width, y2 + 0, 0.0f, 4, j6, null).j(uEnd, j7, vStart).n(color3, j4);
            g7.j(g7Var, x + 0, y2 + 0, 0.0f, 4, j6, null).j(uStart, j7, vStart).n(color4, j4);
            g7Var = g7Var;
            RenderPipeline renderPipelineS = altBlend ? b6.R.S() : b6.R.O();
            class_276 class_276VarMethod_1522 = zf.F(j2).method_1522();
            Intrinsics.checkNotNullExpressionValue(class_276VarMethod_1522, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10858, 7564099160067661073L ^ j) /* invoke-custom */);
            g7.R(j5, g7Var, renderPipelineS, class_276VarMethod_1522, null, null, matrices, MapsKt.mapOf(TuplesKt.to((String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7549, 7033565301878417973L ^ j) /* invoke-custom */, gpuTextureViewMethod_71659)), (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13540, 4461898433025109378L ^ j) /* invoke-custom */, null);
        } catch (IllegalArgumentException unused) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(g7Var, -7630482230324592888L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:84:0x01dc
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static void W(su.catlean.jl r19, org.joml.Matrix3x2f r20, net.minecraft.class_2960 r21, float r22, float r23, float r24, float r25, java.awt.Color r26, java.awt.Color r27, int r28, java.awt.Color r29, java.awt.Color r30, float r31, char r32, float r33, float r34, short r35, float r36, boolean r37, int r38, java.lang.Object r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jl.W(su.catlean.jl, org.joml.Matrix3x2f, net.minecraft.class_2960, float, float, float, float, java.awt.Color, java.awt.Color, int, java.awt.Color, java.awt.Color, float, char, float, float, short, float, boolean, int, java.lang.Object):void");
    }

    public final void j(@NotNull g7 polygon, float x, float y2, float width, float height, @NotNull Color color1, @NotNull Color color2, @NotNull Color color3, @NotNull Color color4, long a2, float uStart, float vStart, float uEnd, float vEnd) {
        long j = a ^ a2;
        long j2 = j ^ 104657526358364L;
        long j3 = j ^ 3561106040375L;
        long j4 = j ^ 15535556781159L;
        Intrinsics.checkNotNullParameter(polygon, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31150, 5628669963219286730L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color1, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(305, 9196820542922998379L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color2, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27319, 5412743305168628184L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color3, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26767, 6219224609832315877L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color4, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27387, 6488163499459488141L ^ j) /* invoke-custom */);
        g7.j(polygon, x + 0, y2 + height, 0.0f, 4, j3, null).j(uStart, j4, vEnd).n(color1, j2);
        g7.j(polygon, x + width, y2 + height, 0.0f, 4, j3, null).j(uEnd, j4, vEnd).n(color2, j2);
        g7.j(polygon, x + width, y2 + 0, 0.0f, 4, j3, null).j(uEnd, j4, vStart).n(color3, j2);
        g7.j(polygon, x + 0, y2 + 0, 0.0f, 4, j3, null).j(uStart, j4, vStart).n(color4, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
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
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public static void R(jl jlVar, g7 g7Var, float f2, float f3, float f4, float f5, Color color, Color color2, Color color3, Color color4, float f6, float f7, float f8, long j, float f9, int i, Object obj) throws Throwable {
        long j2 = a ^ j;
        long j3 = j2 ^ 87030724620126L;
        ?? Y = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1102968877069820240L, j2) /* invoke-custom */;
        try {
            Y = i & (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2441, 2237666179874633715L ^ j2) /* invoke-custom */;
            ?? Y2 = Y;
            if (Y == 0) {
                if (Y != 0) {
                    Color color5 = Color.WHITE;
                    Intrinsics.checkNotNullExpressionValue(color5, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7819, 5382335038219783884L ^ j2) /* invoke-custom */);
                    color = color5;
                }
                Y2 = i & (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2475, 7823208138556913625L ^ j2) /* invoke-custom */;
            }
            ?? r1 = Y;
            ?? Y3 = Y2;
            ?? r0 = Y2;
            ?? r12 = r1;
            if (j2 > 0) {
                if (r1 == 0) {
                    if (Y2 != 0) {
                        color2 = color;
                    }
                    Y3 = i & (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1453, 5304291394854403022L ^ j2) /* invoke-custom */;
                }
                r12 = Y;
                r0 = Y3;
            }
            ?? Y4 = r0;
            ?? r02 = r0;
            ?? r13 = r12;
            if (j2 >= 0) {
                if (r12 == 0) {
                    if (r0 != 0) {
                        color3 = color2;
                    }
                    Y4 = i & (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16873, 5959117307730132870L ^ j2) /* invoke-custom */;
                }
                r13 = Y;
                r02 = Y4;
            }
            ?? Y5 = r02;
            ?? r03 = r02;
            ?? r14 = r13;
            if (j2 >= 0) {
                if (r13 == 0) {
                    if (r02 != 0) {
                        color4 = color3;
                    }
                    Y5 = i & (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13952, 6935917363247155433L ^ j2) /* invoke-custom */;
                }
                r14 = Y;
                r03 = Y5;
            }
            ?? Y6 = r03;
            ?? r04 = r03;
            ?? r15 = r14;
            if (j2 >= 0) {
                if (r14 == 0) {
                    if (r03 != 0) {
                        f6 = 0.0f;
                    }
                    Y6 = i & (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30700, 5819236590232750481L ^ j2) /* invoke-custom */;
                }
                r15 = Y;
                r04 = Y6;
            }
            ?? Y7 = r04;
            ?? Y8 = r04;
            ?? r16 = r15;
            if (j2 >= 0) {
                if (r15 == 0) {
                    if (r04 != 0) {
                        f7 = 0.0f;
                    }
                    Y7 = i & (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11242, 796358854778885526L ^ j2) /* invoke-custom */;
                }
                r16 = Y;
                Y8 = Y7;
            }
            if (r16 == 0) {
                if (Y8 != 0) {
                    f8 = 1.0f;
                }
                Y8 = i & (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7881, 570764744805687473L ^ j2) /* invoke-custom */;
            }
            if (Y8 != 0) {
                f9 = 1.0f;
            }
            jlVar.j(g7Var, f2, f3, f4, f5, color, color2, color3, color4, j3, f6, f7, f8, f9);
        } catch (IllegalArgumentException unused) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Y, -1076848451136907235L, j2) /* invoke-custom */;
        }
    }

    public final void D(@NotNull Matrix4f matrices, @NotNull class_2960 id, float x, float y2, float width, float height, @NotNull Color color1, @NotNull Color color2, @NotNull Color color3, @NotNull Color color4, boolean altBlend, float uStart, float vStart, float uEnd, long a2, float vEnd) throws Throwable {
        long j = a ^ a2;
        long j2 = j ^ 81866690003324L;
        long j3 = j ^ 24978651012623L;
        long j4 = j ^ 45306417545128L;
        long j5 = j ^ 70621496838754L;
        long j6 = j ^ 128809830914243L;
        long j7 = j ^ 132194346801811L;
        Intrinsics.checkNotNullParameter(matrices, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9993, 3579372093499021972L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(id, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23209, 6300272345558247207L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color1, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(305, 9196875547457764511L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color2, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27319, 5412653028206565164L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color3, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26767, 6219305948959134993L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color4, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27387, 6488244815031097209L ^ j) /* invoke-custom */);
        float f2 = height / 2.0f;
        float f3 = width / 2.0f;
        GpuTextureView gpuTextureViewMethod_71659 = zf.F(j2).method_1531().method_4619(id).method_71659();
        Intrinsics.checkNotNullExpressionValue(gpuTextureViewMethod_71659, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15083, 7169752286584276831L ^ j) /* invoke-custom */);
        VertexFormat vertexFormat = class_290.field_1575;
        Intrinsics.checkNotNullExpressionValue(vertexFormat, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22455, 7240279838387071521L ^ j) /* invoke-custom */);
        g7 g7Var = new g7(j3, vertexFormat, 0, false, (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30831, 4011477348434176990L ^ j) /* invoke-custom */, null);
        try {
            g7.j(g7Var, x - f2, y2 + f2, 0.0f, 4, j6, null).j(uStart, j7, vEnd).n(color1, j4);
            g7.j(g7Var, x + f3, y2 + f2, 0.0f, 4, j6, null).j(uEnd, j7, vEnd).n(color2, j4);
            g7.j(g7Var, x + f3, y2 - f2, 0.0f, 4, j6, null).j(uEnd, j7, vStart).n(color3, j4);
            g7.j(g7Var, x - f3, y2 - f2, 0.0f, 4, j6, null).j(uStart, j7, vStart).n(color4, j4);
            g7Var = g7Var;
            RenderPipeline renderPipelineS = altBlend ? b6.R.S() : b6.R.O();
            class_276 class_276VarMethod_1522 = zf.F(j2).method_1522();
            Intrinsics.checkNotNullExpressionValue(class_276VarMethod_1522, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23067, 4950858501852096438L ^ j) /* invoke-custom */);
            g7.R(j5, g7Var, renderPipelineS, class_276VarMethod_1522, null, matrices, new Matrix3x2fStack(), MapsKt.mapOf(TuplesKt.to((String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8718, 7712243459239255995L ^ j) /* invoke-custom */, gpuTextureViewMethod_71659)), 4, null);
        } catch (IllegalArgumentException unused) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(g7Var, -2539641530347145774L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
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
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public static void n(jl jlVar, Matrix4f matrix4f, class_2960 class_2960Var, float f2, float f3, float f4, long j, float f5, Color color, Color color2, Color color3, Color color4, boolean z, float f6, float f7, float f8, float f9, int i, Object obj) throws Throwable {
        long j2 = a ^ j;
        long j3 = j2 ^ 90989169007172L;
        ?? Y = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4278169351745951070L, j2) /* invoke-custom */;
        try {
            Y = i & (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23733, 316089317259651391L ^ j2) /* invoke-custom */;
            ?? Y2 = Y;
            if (Y == 0) {
                if (Y != 0) {
                    Color color5 = Color.WHITE;
                    Intrinsics.checkNotNullExpressionValue(color5, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8403, 1623046690603400059L ^ j2) /* invoke-custom */);
                    color = color5;
                }
                Y2 = i & (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2597, 1979090164644282286L ^ j2) /* invoke-custom */;
            }
            ?? r1 = Y;
            ?? Y3 = Y2;
            ?? r0 = Y2;
            ?? r12 = r1;
            if (j2 > 0) {
                if (r1 == 0) {
                    if (Y2 != 0) {
                        color2 = color;
                    }
                    Y3 = i & (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4408, 6836305434916152495L ^ j2) /* invoke-custom */;
                }
                r12 = Y;
                r0 = Y3;
            }
            ?? Y4 = r0;
            ?? r02 = r0;
            ?? r13 = r12;
            if (j2 >= 0) {
                if (r12 == 0) {
                    if (r0 != 0) {
                        color3 = color2;
                    }
                    Y4 = i & (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30957, 1676649613732973938L ^ j2) /* invoke-custom */;
                }
                r13 = Y;
                r02 = Y4;
            }
            ?? Y5 = r02;
            ?? r03 = r02;
            ?? r14 = r13;
            if (j2 >= 0) {
                if (r13 == 0) {
                    if (r02 != 0) {
                        color4 = color3;
                    }
                    Y5 = i & (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3554, 4181618143542933601L ^ j2) /* invoke-custom */;
                }
                r14 = Y;
                r03 = Y5;
            }
            ?? Y6 = r03;
            ?? r04 = r03;
            ?? r15 = r14;
            if (j2 >= 0) {
                if (r14 == 0) {
                    if (r03 != 0) {
                        z = false;
                    }
                    Y6 = i & (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28013, 8982334188993321187L ^ j2) /* invoke-custom */;
                }
                r15 = Y;
                r04 = Y6;
            }
            ?? Y7 = r04;
            ?? r05 = r04;
            ?? r16 = r15;
            if (j2 >= 0) {
                if (r15 == 0) {
                    if (r04 != 0) {
                        f6 = 0.0f;
                    }
                    Y7 = i & (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23570, 4484370084484884867L ^ j2) /* invoke-custom */;
                }
                r16 = Y;
                r05 = Y7;
            }
            ?? Y8 = r05;
            ?? Y9 = r05;
            ?? r17 = r16;
            if (j2 >= 0) {
                if (r16 == 0) {
                    if (r05 != 0) {
                        f7 = 0.0f;
                    }
                    Y8 = i & (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29626, 3189156858183157254L ^ j2) /* invoke-custom */;
                }
                r17 = Y;
                Y9 = Y8;
            }
            if (r17 == 0) {
                if (Y9 != 0) {
                    f8 = 1.0f;
                }
                Y9 = i & (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10627, 879973472431627267L ^ j2) /* invoke-custom */;
            }
            if (Y9 != 0) {
                f9 = 1.0f;
            }
            jlVar.D(matrix4f, class_2960Var, f2, f3, f4, f5, color, color2, color3, color4, z, f6, f7, f8, j3, f9);
        } catch (IllegalArgumentException unused) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Y, 4242443589993944051L, j2) /* invoke-custom */;
        }
    }

    public final void h(@NotNull Matrix3x2fStack matrices, float x, float y2, float x1, long a2, float y1, @NotNull Color color, int a3, @NotNull Color color2) {
        long j = ((a2 << 32) | ((((long) a3) << 32) >>> 32)) ^ a;
        long j2 = j ^ 53690727342618L;
        long j3 = j ^ 119599813117297L;
        Intrinsics.checkNotNullParameter(matrices, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9993, 3579343642019743526L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20066, 6587514800623595081L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color2, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27319, 5412625951125572254L ^ j) /* invoke-custom */);
        VertexFormat vertexFormat = class_290.field_1576;
        Intrinsics.checkNotNullExpressionValue(vertexFormat, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6676, 5714512724354431502L ^ j) /* invoke-custom */);
        g7.R(j ^ 98795948660688L, g7.j(g7.j(new g7(j ^ 16869218681789L, vertexFormat, 0, true, 2, null), x, y2, 0.0f, 4, j3, null).n(color, j2), x1, y1, 0.0f, 4, j3, null).n(color2, j2), b6.R.w(), null, null, null, new Matrix3x2f((Matrix3x2fc) matrices), null, (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22086, 4007022960182466639L ^ j) /* invoke-custom */, null);
    }

    public static void a(long j, jl jlVar, Matrix3x2fStack matrix3x2fStack, float f2, float f3, int i, float f4, float f5, Color color, Color color2, int i2, Object obj) {
        long j2 = ((j << 32) | ((((long) i) << 32) >>> 32)) ^ a;
        long j3 = j2 >>> 32;
        int i3 = (int) (((j2 ^ 120944539417446L) << 32) >>> 32);
        if ((i2 & (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23733, 316060466504668591L ^ j2) /* invoke-custom */) != 0) {
            color2 = color;
        }
        jlVar.h(matrix3x2fStack, f2, f3, f4, j3, f5, color, i3, color2);
    }

    private final int q(int i, int i2, float f2) {
        return MathKt.roundToInt(i + ((i2 - i) * f2));
    }

    public final double a(double oldValue, double newValue, float interpolationValue) {
        return oldValue + ((newValue - oldValue) * ((double) interpolationValue));
    }

    public final double W(double oldValue, double newValue, double interpolationValue) {
        return oldValue + ((newValue - oldValue) * interpolationValue);
    }

    public final float B(float oldValue, float newValue, float interpolationValue) {
        return oldValue + ((newValue - oldValue) * interpolationValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.minecraft.class_4184] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r18v0, types: [net.minecraft.class_243] */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v39 */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final net.minecraft.class_243 i(@org.jetbrains.annotations.NotNull net.minecraft.class_243 r10, long r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jl.i(net.minecraft.class_243, long):net.minecraft.class_243");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    public final void z(long a2, @NotNull class_4587 matrices, @NotNull class_1799 stack) {
        long j = a ^ a2;
        long j2 = j ^ 18145436690997L;
        long j3 = j ^ 55191803386548L;
        Object objMethod_7960 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3906600146013509686L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(matrices, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9993, 3579272094803849693L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(stack, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14405, 3417258737426722463L ^ j) /* invoke-custom */);
        if (objMethod_7960 == 0) {
            objMethod_7960 = stack.method_7960();
            if (objMethod_7960 != 0) {
                return;
            }
            matrices.method_22903();
            matrices.method_46416(8.0f, 8.0f, 150.0f);
            try {
                matrices.method_22905(16.0f, -16.0f, 16.0f);
            } catch (Throwable th) {
            }
        }
        class_10444 class_10444Var = new class_10444();
        zf.F(j2).method_65386().method_65598(class_10444Var, stack, class_811.field_4317, zf.z(j3), (class_11566) null, 0);
        class_10444Var.method_65604(matrices, zf.F(j2).field_1773.method_72910(), (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15637, 842563703567238642L ^ j) /* invoke-custom */, class_4608.field_21444, 0);
        matrices.method_22909();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [net.minecraft.class_1060] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    public final void b(@NotNull class_2960 i, long a2, @NotNull BufferedImage bi) throws Throwable {
        long j = a ^ a2;
        Object objMethod_1531 = j;
        long j2 = objMethod_1531 ^ 4625263590026L;
        long j3 = objMethod_1531 ^ 69605941582585L;
        long j4 = objMethod_1531 ^ 117864164784116L;
        int i2 = (int) (objMethod_1531 >>> 32);
        int i3 = (int) ((j4 << 32) >>> 48);
        int i4 = (int) ((j4 << 48) >>> 48);
        try {
            Intrinsics.checkNotNullParameter(i, "i");
            Intrinsics.checkNotNullParameter(bi, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4563, 2697503449940252585L ^ j) /* invoke-custom */);
            if (RenderSystem.isOnRenderThread()) {
                objMethod_1531 = zf.F(j2).method_1531();
                objMethod_1531.method_4616(i, o(bi, j3));
            } else {
                d(i2, (short) i3, () -> {
                    return f(r1, r2);
                }, (char) i4);
            }
        } catch (IllegalArgumentException unused) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_1531, -6397592818912637404L, j) /* invoke-custom */;
        }
    }

    public final boolean d(int a2, short a3, @NotNull Function0 function, char a4) {
        Intrinsics.checkNotNullParameter(function, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28391, 7385731648841016095L ^ ((((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a)) /* invoke-custom */);
        return E.add(function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[LOOP:0: B:16:0x00eb->B:34:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v69, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.Object] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final net.minecraft.class_1043 o(@org.jetbrains.annotations.NotNull java.awt.image.BufferedImage r10, long r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jl.o(java.awt.image.BufferedImage, long):net.minecraft.class_1043");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [double, long] */
    @Nullable
    public final Vector4d t(short a2, int a3, @NotNull class_1297 ent, float offset, int a4) {
        long j = (((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ a;
        int i = (int) (((j ^ 10969104086586L) << 56) >>> 56);
        long j2 = j ^ 24460228998550L;
        Intrinsics.checkNotNullParameter(ent, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17536, 6527042597519563239L ^ j) /* invoke-custom */);
        return S(a(ent.field_6014, ent.method_23317(), K(j2)), j >>> 8, a(ent.field_6036, ent.method_23318(), K(j2)) + ((double) ent.method_18381(ent.method_18376())) + ((double) offset), a(ent.field_5969, ent.method_23321(), K(j2)), (byte) i);
    }

    public static Vector4d i(long j, jl jlVar, class_1297 class_1297Var, float f2, int i, Object obj) {
        long j2 = a ^ j;
        long j3 = j2 ^ 45104453747386L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j3 << 16) >>> 32);
        int i4 = (int) ((j3 << 48) >>> 48);
        if ((i & 2) != 0) {
            f2 = 0.4f;
        }
        return jlVar.t((short) i2, i3, class_1297Var, f2, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [double, long] */
    @Nullable
    public final Vector4d t(long a2, @NotNull class_243 pos) {
        long j = a ^ a2;
        int i = (int) (((j ^ 44010186601569L) << 56) >>> 56);
        Intrinsics.checkNotNullParameter(pos, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21045, 5311499625526856983L ^ j) /* invoke-custom */);
        return S(pos.field_1352, j >>> 8, pos.field_1351, pos.field_1350, (byte) i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v8, types: [net.minecraft.class_243] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.joml.Vector4d S(double r12, double r14, long r16, double r18, byte r20) throws java.lang.Throwable {
        /*
            r11 = this;
            r0 = r16
            r1 = 8
            long r0 = r0 << r1
            r1 = r20
            long r1 = (long) r1
            r2 = 56
            long r1 = r1 << r2
            r2 = 56
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            long r1 = su.catlean.jl.a
            long r0 = r0 ^ r1
            r21 = r0
            r0 = r21
            r1 = r0; r1 = r0; 
            r2 = 94831402140794(0x563fa809c47a, double:4.68529379447224E-310)
            long r1 = r1 ^ r2
            r23 = r1
            r0 = -585948958672872993(0xf7de4a86cdcb19df, double:-2.500411366285789E269)
            r1 = r21
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r1 = 0
            r26 = r1
            r25 = r0
            r0 = r11
            net.minecraft.class_243 r1 = new net.minecraft.class_243
            r2 = r1
            r3 = r12
            r4 = r14
            r5 = r18
            r2.<init>(r3, r4, r5)
            r2 = r23
            net.minecraft.class_243 r0 = r0.i(r1, r2)
            r27 = r0
            r0 = r27
            double r0 = r0.field_1350     // Catch: java.lang.IllegalArgumentException -> L53
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = r25
            if (r1 != 0) goto L73
            if (r0 <= 0) goto L97
            goto L5e
        L53:
            r1 = -693139643537547406(0xf661792aa7341f72, double:-1.7194175299243542E262)
            r2 = r21
            java.lang.Throwable r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Throwable;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.IllegalArgumentException -> L68
            throw r0     // Catch: java.lang.IllegalArgumentException -> L68
        L5e:
            r0 = r27
            double r0 = r0.field_1350     // Catch: java.lang.IllegalArgumentException -> L68
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            goto L73
        L68:
            r1 = -693139643537547406(0xf661792aa7341f72, double:-1.7194175299243542E262)
            r2 = r21
            java.lang.Throwable r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/Throwable;}
            ).invoke(r0, r1, r2)
            throw r0
        L73:
            if (r0 >= 0) goto L97
            org.joml.Vector4d r0 = new org.joml.Vector4d
            r1 = r0
            r2 = r27
            double r2 = r2.field_1352
            r3 = r27
            double r3 = r3.field_1351
            r4 = r27
            double r4 = r4.field_1352
            r5 = r27
            double r5 = r5.field_1350
            double r4 = java.lang.Math.max(r4, r5)
            r5 = 0
            r1.<init>(r2, r3, r4, r5)
            r26 = r0
        L97:
            r0 = r26
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jl.S(double, double, long, double, byte):org.joml.Vector4d");
    }

    @NotNull
    public final Color p(@NotNull Color $this$withAlpha, char a2, int a3, float alpha, short a4) {
        Intrinsics.checkNotNullParameter($this$withAlpha, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16051, 8809214358239707446L ^ ((((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ a)) /* invoke-custom */);
        return new Color($this$withAlpha.getRed(), $this$withAlpha.getGreen(), $this$withAlpha.getBlue(), (int) (255.0f * Math.clamp(alpha, 0.0f, 1.0f)));
    }

    @NotNull
    public final Color C(@NotNull Color $this$mix, long a2, @NotNull Color end, float value) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter($this$mix, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16051, 8809217112280247384L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(end, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30264, 595406341939225833L ^ j) /* invoke-custom */);
        float fClamp = Math.clamp(value, 0.0f, 1.0f);
        return new Color(q($this$mix.getRed(), end.getRed(), fClamp), q($this$mix.getGreen(), end.getGreen(), fClamp), q($this$mix.getBlue(), end.getBlue(), fClamp), q($this$mix.getAlpha(), end.getAlpha(), fClamp));
    }

    public final float y(@NotNull Color $this$glRed, char a2, short a3, int a4) {
        Intrinsics.checkNotNullParameter($this$glRed, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16012, 2743523194087085394L ^ ((((((long) a2) << 48) | ((((long) a3) << 48) >>> 16)) | ((((long) a4) << 32) >>> 32)) ^ a)) /* invoke-custom */);
        return $this$glRed.getRed() / 255.0f;
    }

    public final float M(long a2, @NotNull Color $this$glGreen) {
        Intrinsics.checkNotNullParameter($this$glGreen, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16051, 8809217966621105644L ^ (a ^ a2)) /* invoke-custom */);
        return $this$glGreen.getGreen() / 255.0f;
    }

    public final float r(@NotNull Color $this$glBlue, long a2, int a3) {
        Intrinsics.checkNotNullParameter($this$glBlue, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16051, 8809277732926522952L ^ (((a2 << 32) | ((((long) a3) << 32) >>> 32)) ^ a)) /* invoke-custom */);
        return $this$glBlue.getBlue() / 255.0f;
    }

    public final float G(long a2, @NotNull Color $this$glAlpha) {
        Intrinsics.checkNotNullParameter($this$glAlpha, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16051, 8809315459465758017L ^ (a ^ a2)) /* invoke-custom */);
        return $this$glAlpha.getAlpha() / 255.0f;
    }

    public final float K(long j) {
        return zf.F((a ^ j) ^ 85635303336048L).method_61966().method_60637(true);
    }

    public final float T(float oldValue, float newValue, long a2) {
        return B(oldValue, newValue, K((a ^ a2) ^ 39852224653919L));
    }

    public final double b(long a2, double oldValue, double newValue) {
        return a(oldValue, newValue, K((a ^ a2) ^ 111887318442712L));
    }

    @NotNull
    public final class_243[] L(long a2, @NotNull class_1297 ent) {
        long j = a ^ a2;
        Intrinsics.checkNotNullParameter(ent, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30464, 5084466647000124404L ^ j) /* invoke-custom */);
        class_238 class_238VarS = zi.v.S(ent, j ^ 119445293864069L);
        class_243[] class_243VarArr = new class_243[(int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17993, 3357590210550830232L ^ j) /* invoke-custom */];
        class_243VarArr[0] = new class_243(class_238VarS.field_1323, class_238VarS.field_1322, class_238VarS.field_1321);
        class_243VarArr[1] = new class_243(class_238VarS.field_1323, class_238VarS.field_1325, class_238VarS.field_1321);
        class_243VarArr[2] = new class_243(class_238VarS.field_1320, class_238VarS.field_1322, class_238VarS.field_1321);
        class_243VarArr[3] = new class_243(class_238VarS.field_1320, class_238VarS.field_1325, class_238VarS.field_1321);
        class_243VarArr[4] = new class_243(class_238VarS.field_1323, class_238VarS.field_1322, class_238VarS.field_1324);
        class_243VarArr[5] = new class_243(class_238VarS.field_1323, class_238VarS.field_1325, class_238VarS.field_1324);
        class_243VarArr[(int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30831, 4011532764288658091L ^ j) /* invoke-custom */] = new class_243(class_238VarS.field_1320, class_238VarS.field_1322, class_238VarS.field_1324);
        class_243VarArr[(int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25239, 7655531764313665605L ^ j) /* invoke-custom */] = new class_243(class_238VarS.field_1320, class_238VarS.field_1325, class_238VarS.field_1324);
        return class_243VarArr;
    }

    public final void P(@NotNull g7 polygon, float posX, long a2, float posY, float endPosX, float endPosY, @NotNull Color color) {
        long j = a ^ a2;
        long j2 = j ^ 66504412789263L;
        Intrinsics.checkNotNullParameter(polygon, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23594, 2073565596155160451L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20292, 8082995580676551932L ^ j) /* invoke-custom */);
        Color color2 = Color.BLACK;
        Intrinsics.checkNotNull(color2);
        O(j2, polygon, posX - 1.0f, posY, posX + 0.5f, endPosY + 0.5f, color2);
        O(j2, polygon, posX - 1.0f, posY - 0.5f, endPosX + 0.5f, posY + 1.0f, color2);
        O(j2, polygon, endPosX - 1.0f, posY, endPosX + 0.5f, endPosY + 0.5f, color2);
        O(j2, polygon, posX - 1.0f, endPosY - 1.0f, endPosX + 0.5f, endPosY + 0.5f, color2);
        O(j2, polygon, posX - 0.5f, posY, posX, endPosY, color);
        O(j2, polygon, posX, endPosY - 0.5f, endPosX, endPosY, color);
        O(j2, polygon, posX - 0.5f, posY, endPosX, posY + 0.5f, color);
        O(j2, polygon, endPosX - 0.5f, posY, endPosX, endPosY, color);
    }

    @NotNull
    public final Color q(int speed, int index, long a2, char a3, float saturation, float brightness) {
        long j = ((a2 << 16) | ((((long) a3) << 48) >>> 48)) ^ a;
        Color color = new Color(Color.HSBtoRGB(((int) (((zf.A() / ((long) speed)) + ((long) index)) % ((long) (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14038, 8203555188871718319L ^ j) /* invoke-custom */))) / 360.0f, saturation, brightness));
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4485, 6427966836364329702L ^ j) /* invoke-custom */);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @NotNull
    public final Color N(int i, int i2, long j) throws Throwable {
        float f2;
        long j2 = a ^ j;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4406743120763933479L, j2) /* invoke-custom */;
        ?? A = ((int) (((zf.A() / ((long) i)) + ((long) i2)) % ((long) (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15657, 116149968378933563L ^ j2) /* invoke-custom */))) % (int) b(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14038, 8203519213830191817L ^ j2) /* invoke-custom */;
        try {
            try {
                A = (((float) (((double) r1) / 360.0d)) > 0.5d ? 1 : (((float) (((double) r1) / 360.0d)) == 0.5d ? 0 : -1));
                ?? r0 = A;
                if (_gVarArr != null) {
                    f2 = (float) (((double) r0) / 360.0d);
                } else if (A < 0) {
                    f2 = -((float) (((double) A) / 360.0d));
                } else {
                    r0 = A;
                    f2 = (float) (((double) r0) / 360.0d);
                }
                Color hSBColor = Color.getHSBColor(f2, 0.5f, 1.0f);
                Intrinsics.checkNotNullExpressionValue(hSBColor, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25091, 7299555933545283647L ^ j2) /* invoke-custom */);
                return hSBColor;
            } catch (IllegalArgumentException unused) {
                throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(A, -4366475311718126988L, j2) /* invoke-custom */;
            }
        } catch (IllegalArgumentException unused2) {
            throw (Throwable) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Throwable.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(A, -4366475311718126988L, j2) /* invoke-custom */;
        }
    }

    private final boolean Y(long j) {
        long j2 = a ^ j;
        String vendor = RenderSystem.getDevice().getVendor();
        Intrinsics.checkNotNullExpressionValue(vendor, (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30285, 1465893766506746550L ^ j2) /* invoke-custom */);
        return StringsKt.contains$default((CharSequence) vendor, (CharSequence) (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24804, 5099271497719284782L ^ j2) /* invoke-custom */, false, 2, (Object) null);
    }

    private static final Unit f(class_2960 class_2960Var, BufferedImage bufferedImage) {
        long j = a ^ 37935547833666L;
        zf.F(j ^ 38605230095470L).method_1531().method_4616(class_2960Var, y.o(bufferedImage, j ^ 26830549277725L));
        return Unit.INSTANCE;
    }

    private static final String e(BufferedImage bufferedImage) {
        long j = a ^ 73331487135642L;
        return (String) a(MethodHandles.lookup(), "u", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29763, 2202909384324578845L ^ j) /* invoke-custom */ + bufferedImage.hashCode();
    }

    static {
        int i;
        long j = a ^ 70019816432172L;
        e = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, 2257768033377332706L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[51];
        int i3 = 0;
        String str = "¸ç£\u0096\u001civ\u00115¾¾+d\n;i\u0010\u00837eo\u0005ÿ5p\u009eæCôj\u0081¬\u0018\u0010ÄW©áÁV\u0087\u0095\u007fR+\u0086Ð\u0088\u000fé \u0097Ì\u008e¶\u001eößn¦ã\u0011\u0018wÄðìMcfõï+\u0088L`\u008cûÉJsMr\u0018½§hq¶\u0001IÕ\u0097ì\u0097\u000eó:¢\u009eì\u00adGÒ\u0089\u0017PV\u0010î\u001aO\u0011Ëú°B¤ö\u008b\bë\u008bq\u0083\u0010Ë\u009d\u0017ùZHI-}÷\u008czß¡bÎ\u0010åÄ\u009eØqZVÃ\u000b\u009b«\u0083ïüòÈ\u0010°t/þJ~Ê-\u0098PBG%\u0089XÞ\u0010ÿ\u009e{\"\u0092,\u008d\u0093Oïî\u0003à}\r@\u0010T\u0005¡Ó\u0003Ûaº\u0003Ãg×jÇÕ¦\u0010\u008b\u0090B°ë¼*B`÷lyÕÀõ·\u0010¬\u0088k02à8;È6×¶V\u009cãÛ\u0010Í\b\u007f\u0087¦>Ý2\u0084%DäúD\\\u001a DÖ\u0011á\u0019\u00adày¬\u001e¿ÔúWAë\u0017¯Ó\"gÆm¶hh»³¨\u0012ë30ÿÁ\u0010XÐÕ@@ \u0097\b?û[è\u0094\u001fËú\u0081Èµf\u0088P¾ü_è,6\u0093·äÿÃr¶\u0019NÖh \u0011£p3² \u0011\u008c=\u009b \u009a00VíktØÆT\u0099rÏ\u008d\u009b¹èçÁ¶ÍO`\u0092Qú\u009a\u0010§ÄÀW\u009e»Y\u0083.\u0003Z\u0081°ÉM6(\u0005Ú¨]Ä ZgÁ$øù\u0098\u0081¬ë\u001a\u00107ß\u0001]pl 7\u0003Å¶\u008e\u0002ÙA9Ýj\u0002c«\u001b\u0010³\u001b £á¡ÛÊ==ú\u0010çÞ\u0085:\u0010Ï\u0004Üí»\u0091÷Ç·%\u0019ë\u0095V\u0090?\u0010)i³sÆ\nâ\u000e\u0094:\u000e\u0089c©ü\u000f\u0018Zù4Ë¥\u001as~|0æK\u00ad;\nx,Sä÷ÜÌ\u001cu\u0010´\u0083ôn)\u008d:ô\u0098k\u000b²xD\u0007\u001a\u00109O\u000bò\u000e·nF\u0095 h¾Axa\u0006 ±\u001c?p¢\u0013\u0004\t\u0018ø¿Í\u0016#¥1u\u0015MHQ·«ãqâW@+wæN\u0010\u0097£ÉÄôdY½Èlá,Tµ\u0002×\u0018«p½\u008dus(#ZSí\u0097\u000eµ\u0096¦\u0006\u0088u\u009d]V}8\u0010Ùp±I<ÓøjËG¬½ÊCí\u001c\u0010\u0094¯'\\z2j\u009aâ\u0017üØ\u0091óXP(mI\u0080vÚ\u0010B*¹Zã±\u008e«ÊJèaÀ\u001bêNA\u00adU \u001bÄY\u0013áwè¯ñØð\f\fÅ\u0010\u001f{\u0005uÒP1#i\u001fË\u0018UX\u0007ò\u0010X4\u00004W\u009e\u0094\u009eg°I\u0091>\u009a0·\u0010h:WÐÕ¤öÏp×}]\u008báðÙ0Zig\\>AçK\u0091\u0091\u009c\u0014Ic^\nß°ÉBhå\u0087:êpÒ«ýÏ3zÜ*\u0095Ýñc,{\u0013#Ú«*ì\u0001¿\u0010\u0082×\be³\u0088ìfÉìj\u0081\u0095ä\u001c\u0002\u0010qA\u0090¨\u0002\u0007\u0099{\u0010ÖZÒoad¡8`;\u0092u\u001f¯\u00998\u001bR\bú!7WLvè\\$ùTò\u00155ß7E\u008e\u007fg1§.\u0088PÁ\fÇà5|Î À\u0095\u008bíò³ªü%®(È\u0010Õ\u0019Ï~ä¼\tZñÚ+&ðÜ)Ý\u0010RR!Kû\u008fs³J¶fWÒÚOÑ\u0010\u0097 \u009c\u001a±H2%\u0012ü\u0094£\u008fgDø0X\u001f¸-pG¤Òy\u009fuK\u0011¿Ñ4\u0093ZÓ\u0005\u0095pÛiüþ\u001dõ 08Ð~\u0080\u0000N\u001b\u009d|¼¯Çg\u001dt(ÉÏ\u0010uDèÒ\u0010\u0085é¿\u0007-£¦®ú»â\u0010cSá(·âò\u0080ü4^¶ºf\rø\u0018j$U¸[\u001bDx6\"\u009c\u0096¹\u009b\u0085É\u009d}»¦\u001eW[A(xØSÂö ¤GK\u001e\u0004{\u000e\u001f\u001e\u0080ù\u0092#\u0081&ÿnG\u0095D#\u009e}Ç\u0015r×\u000bóÔ\u0092EãÜ\u0010r¢ÈìuÒ\u007fi&âZWÒÝ\u0015\u0010\u0010<ê5¨n\u001fù°Ð\u0098ï\u001fÕñË\u008c(-h\u001boÖÇ£\u0084/,7¡è+Ç\u008aÀê+í\u008dÛ¹T,ÁøÈþm[ì¼øTkÀ\u0019ó\u0001";
        int length = "¸ç£\u0096\u001civ\u00115¾¾+d\n;i\u0010\u00837eo\u0005ÿ5p\u009eæCôj\u0081¬\u0018\u0010ÄW©áÁV\u0087\u0095\u007fR+\u0086Ð\u0088\u000fé \u0097Ì\u008e¶\u001eößn¦ã\u0011\u0018wÄðìMcfõï+\u0088L`\u008cûÉJsMr\u0018½§hq¶\u0001IÕ\u0097ì\u0097\u000eó:¢\u009eì\u00adGÒ\u0089\u0017PV\u0010î\u001aO\u0011Ëú°B¤ö\u008b\bë\u008bq\u0083\u0010Ë\u009d\u0017ùZHI-}÷\u008czß¡bÎ\u0010åÄ\u009eØqZVÃ\u000b\u009b«\u0083ïüòÈ\u0010°t/þJ~Ê-\u0098PBG%\u0089XÞ\u0010ÿ\u009e{\"\u0092,\u008d\u0093Oïî\u0003à}\r@\u0010T\u0005¡Ó\u0003Ûaº\u0003Ãg×jÇÕ¦\u0010\u008b\u0090B°ë¼*B`÷lyÕÀõ·\u0010¬\u0088k02à8;È6×¶V\u009cãÛ\u0010Í\b\u007f\u0087¦>Ý2\u0084%DäúD\\\u001a DÖ\u0011á\u0019\u00adày¬\u001e¿ÔúWAë\u0017¯Ó\"gÆm¶hh»³¨\u0012ë30ÿÁ\u0010XÐÕ@@ \u0097\b?û[è\u0094\u001fËú\u0081Èµf\u0088P¾ü_è,6\u0093·äÿÃr¶\u0019NÖh \u0011£p3² \u0011\u008c=\u009b \u009a00VíktØÆT\u0099rÏ\u008d\u009b¹èçÁ¶ÍO`\u0092Qú\u009a\u0010§ÄÀW\u009e»Y\u0083.\u0003Z\u0081°ÉM6(\u0005Ú¨]Ä ZgÁ$øù\u0098\u0081¬ë\u001a\u00107ß\u0001]pl 7\u0003Å¶\u008e\u0002ÙA9Ýj\u0002c«\u001b\u0010³\u001b £á¡ÛÊ==ú\u0010çÞ\u0085:\u0010Ï\u0004Üí»\u0091÷Ç·%\u0019ë\u0095V\u0090?\u0010)i³sÆ\nâ\u000e\u0094:\u000e\u0089c©ü\u000f\u0018Zù4Ë¥\u001as~|0æK\u00ad;\nx,Sä÷ÜÌ\u001cu\u0010´\u0083ôn)\u008d:ô\u0098k\u000b²xD\u0007\u001a\u00109O\u000bò\u000e·nF\u0095 h¾Axa\u0006 ±\u001c?p¢\u0013\u0004\t\u0018ø¿Í\u0016#¥1u\u0015MHQ·«ãqâW@+wæN\u0010\u0097£ÉÄôdY½Èlá,Tµ\u0002×\u0018«p½\u008dus(#ZSí\u0097\u000eµ\u0096¦\u0006\u0088u\u009d]V}8\u0010Ùp±I<ÓøjËG¬½ÊCí\u001c\u0010\u0094¯'\\z2j\u009aâ\u0017üØ\u0091óXP(mI\u0080vÚ\u0010B*¹Zã±\u008e«ÊJèaÀ\u001bêNA\u00adU \u001bÄY\u0013áwè¯ñØð\f\fÅ\u0010\u001f{\u0005uÒP1#i\u001fË\u0018UX\u0007ò\u0010X4\u00004W\u009e\u0094\u009eg°I\u0091>\u009a0·\u0010h:WÐÕ¤öÏp×}]\u008báðÙ0Zig\\>AçK\u0091\u0091\u009c\u0014Ic^\nß°ÉBhå\u0087:êpÒ«ýÏ3zÜ*\u0095Ýñc,{\u0013#Ú«*ì\u0001¿\u0010\u0082×\be³\u0088ìfÉìj\u0081\u0095ä\u001c\u0002\u0010qA\u0090¨\u0002\u0007\u0099{\u0010ÖZÒoad¡8`;\u0092u\u001f¯\u00998\u001bR\bú!7WLvè\\$ùTò\u00155ß7E\u008e\u007fg1§.\u0088PÁ\fÇà5|Î À\u0095\u008bíò³ªü%®(È\u0010Õ\u0019Ï~ä¼\tZñÚ+&ðÜ)Ý\u0010RR!Kû\u008fs³J¶fWÒÚOÑ\u0010\u0097 \u009c\u001a±H2%\u0012ü\u0094£\u008fgDø0X\u001f¸-pG¤Òy\u009fuK\u0011¿Ñ4\u0093ZÓ\u0005\u0095pÛiüþ\u001dõ 08Ð~\u0080\u0000N\u001b\u009d|¼¯Çg\u001dt(ÉÏ\u0010uDèÒ\u0010\u0085é¿\u0007-£¦®ú»â\u0010cSá(·âò\u0080ü4^¶ºf\rø\u0018j$U¸[\u001bDx6\"\u009c\u0096¹\u009b\u0085É\u009d}»¦\u001eW[A(xØSÂö ¤GK\u001e\u0004{\u000e\u001f\u001e\u0080ù\u0092#\u0081&ÿnG\u0095D#\u009e}Ç\u0015r×\u000bóÔ\u0092EãÜ\u0010r¢ÈìuÒ\u007fi&âZWÒÝ\u0015\u0010\u0010<ê5¨n\u001fù°Ð\u0098ï\u001fÕñË\u008c(-h\u001boÖÇ£\u0084/,7¡è+Ç\u008aÀê+í\u008dÛ¹T,ÁøÈþm[ì¼øTkÀ\u0019ó\u0001".length();
        char cCharAt = 16;
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
                            c = new String[51];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[34];
                            int i9 = 0;
                            String str3 = "©v1\u001fr[;\u0093¶Å(\u0088O\u0091Þ¼\u0099õi+Ö\u000eT`\u001b>G,ÿü\u008f\u000eW\n3\u0090XÒê\u0014Ì\u0003_\u0017 \u0087È,\u008fé]\\\u0097s\u009a\u008e)Ê²\u0097¨ºVM\u000f\u009e\u008bÁx\u007fþLà;a²j\u0091\b>Ê\u0093ÀOuÛ(ô5\u0013ß1\f!&lp\u0093³LÅÎñ0Ät_\u0002Ùo©4^}\u009eºy!\u008c\u001fg\rÞñÔXðøwNfVu ØBP JgË%6\u0014v\u001b\u0012®þV\fª¢\u000fT¶Þ\u0098\u0005Ow_\u0006Jcn£½\u0000\u0095Ñ3ûï9°Â§é5Øé-\u009e2\u008dµÝ\u0080ÓÐ}7¶m\u000f\u001dÄ¼\b\u008e\u0019\u0097f³g\u001c\u008eñæ\u000fÐ\u0091\u0086?\u0086-è\u0006<wÁiJ^ÅÙ\u0012\u0084ÕXÖ\u0003G\u0005Ë\u0082\u0003\u0082þ\u001eD°\u0095\u0004\u009a\u0004Ó½\u001f\u0096ïËÞ¢\u000f";
                            int length2 = "©v1\u001fr[;\u0093¶Å(\u0088O\u0091Þ¼\u0099õi+Ö\u000eT`\u001b>G,ÿü\u008f\u000eW\n3\u0090XÒê\u0014Ì\u0003_\u0017 \u0087È,\u008fé]\\\u0097s\u009a\u008e)Ê²\u0097¨ºVM\u000f\u009e\u008bÁx\u007fþLà;a²j\u0091\b>Ê\u0093ÀOuÛ(ô5\u0013ß1\f!&lp\u0093³LÅÎñ0Ät_\u0002Ùo©4^}\u009eºy!\u008c\u001fg\rÞñÔXðøwNfVu ØBP JgË%6\u0014v\u001b\u0012®þV\fª¢\u000fT¶Þ\u0098\u0005Ow_\u0006Jcn£½\u0000\u0095Ñ3ûï9°Â§é5Øé-\u009e2\u008dµÝ\u0080ÓÐ}7¶m\u000f\u001dÄ¼\b\u008e\u0019\u0097f³g\u001c\u008eñæ\u000fÐ\u0091\u0086?\u0086-è\u0006<wÁiJ^ÅÙ\u0012\u0084ÕXÖ\u0003G\u0005Ë\u0082\u0003\u0082þ\u001eD°\u0095\u0004\u009a\u0004Ó½\u001f\u0096ïËÞ¢\u000f".length();
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
                                                g = new Integer[34];
                                                y = new jl();
                                                E = new CopyOnWriteArrayList();
                                                r = new Matrix4f();
                                                V = new Matrix4f();
                                                M = new int[4];
                                                w = -1;
                                                X = 1.0f;
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "z¥Ä×£u2ú±Ò´Ñ1hö.";
                                                length2 = "z¥Ä×£u2ú±Ò´Ñ1hö.".length();
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
                        str = "°\n:È5,\f©Ã\u0001}*Ùïâ2h+ÔTÙ^Å\u0091\u000fvuc\u009dó\b\u0086\u0010À-ì¶×S^Ð¨H]Ç+VÒl";
                        length = "°\n:È5,\f©Ã\u0001}*Ùïâ2h+ÔTÙ^Å\u0091\u000fvuc\u009dó\b\u0086\u0010À-ì¶×S^Ð¨H]Ç+VÒl".length();
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

    public static void u(_g[] _gVarArr) {
        v = _gVarArr;
    }

    public static _g[] n() {
        return v;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 25009;
        if (c[i2] == null) {
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
                c[i2] = a(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/jl", e2);
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
            r1 = r52
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
            java.lang.String r0 = "su/catlean/jl"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jl.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 20360;
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
                    throw new RuntimeException("su/catlean/jl", e2);
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
            r1 = r52
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
            java.lang.String r0 = "su/catlean/jl"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.jl.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
