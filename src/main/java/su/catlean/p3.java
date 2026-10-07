package su.catlean;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1802;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_332;
import net.minecraft.class_742;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/p3.class */
public final class p3 extends gf {

    @NotNull
    public static final p3 Y;

    @NotNull
    private static final List i;

    @Nullable
    private static class_1309 B;

    @NotNull
    private static final fd K;

    @NotNull
    private static final fd O;
    private static int Q;
    private static final long a = yz.a(-7957233438780448904L, 6258790527258338699L, MethodHandles.lookup().lookupClass()).a(108401461291289L);
    private static final String[] b;
    private static final String[] c;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map k;

    /* JADX WARN: Illegal instructions before constructor call */
    private p3(long j) {
        long j2 = a ^ j;
        super((char) (j2 >>> 48), (int) (((j2 ^ 13325641196433L) << 16) >>> 32), (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18689, 1268051633365095318L ^ j2) /* invoke-custom */, (char) ((r1 << 48) >>> 48));
    }

    @Nullable
    public final class_1309 H() {
        return B;
    }

    public final void S(@Nullable class_1309 class_1309Var) {
        B = class_1309Var;
    }

    @NotNull
    public final fd O() {
        return K;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected missing predecessor for block: B:52:0x0109
        	at jadx.core.dex.visitors.blocks.BlockSplitter.addTempConnectionsForExcHandlers(BlockSplitter.java:280)
        	at jadx.core.dex.visitors.blocks.BlockSplitter.visit(BlockSplitter.java:79)
        */
    @Override // su.catlean.gf
    public void w(long r20) {
        /*
            Method dump skipped, instruction units count: 1000
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.p3.w(long):void");
    }

    @Override // su.catlean.gf
    public void h(long a2, @NotNull class_332 context) {
        Intrinsics.checkNotNullParameter(context, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9167, 5363588852203896123L ^ a2) /* invoke-custom */);
        Z(context, false, a2 ^ 50709462495480L);
    }

    @Override // su.catlean.gf
    public void H(@NotNull class_332 context, long a2) {
        Intrinsics.checkNotNullParameter(context, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9361, 5027907674965881637L ^ a2) /* invoke-custom */);
        Z(context, true, a2 ^ 119229165910437L);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0688: INVOKE (r-1 I:su.catlean.p3), (r0 I:long), (r1 I:net.minecraft.class_332), (r2 I:net.minecraft.class_1309) DIRECT call: su.catlean.p3.r(long, net.minecraft.class_332, net.minecraft.class_1309):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void Z(net.minecraft.class_332 r18, boolean r19, long r20) {
        /*
            Method dump skipped, instruction units count: 1777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.p3.Z(net.minecraft.class_332, boolean, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v17, types: [su.catlean.c6] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r34v0 */
    private final void d(class_332 class_332Var, class_1657 class_1657Var, byte b2, long j) throws Throwable {
        String str;
        long j2 = ((((long) b2) << 56) | ((j << 8) >>> 8)) ^ a;
        long j3 = j2 ^ 94895415769754L;
        long j4 = j2 ^ 64938885471287L;
        long j5 = j2 ^ 75491076022175L;
        long j6 = j2 ^ 80670638519260L;
        long j7 = j2 ^ 24807341893189L;
        long j8 = j2 ^ 16011742883704L;
        ?? r0 = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1845360959170297902L, j2) /* invoke-custom */;
        try {
            r0 = Q;
            ?? K2 = r0;
            if (r0 == 0) {
                if (r0 > 0) {
                    return;
                }
                class_332Var.method_51448().pushMatrix();
                class_332Var.method_51448().translate(p(j8) + 83.0f, V(j4) + 3.5f);
                class_332Var.method_51448().scale(0.8f, 0.8f);
                class_332Var.method_51427(class_1657Var.method_6047(), 0, 0);
                class_332Var.method_51431(zf.F(j3).field_1772, class_1657Var.method_6047(), 0, 0);
                class_332Var.method_51427(class_1657Var.method_6079(), (int) d(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28999, 6031922713560354701L ^ j2) /* invoke-custom */, 0);
                class_332Var.method_51431(zf.F(j3).field_1772, class_1657Var.method_6079(), (int) d(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5307, 3067556174476503657L ^ j2) /* invoke-custom */, 0);
                class_332Var.method_51427(class_1802.field_8288.method_7854(), 0, (int) d(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24528, 4664156023630962971L ^ j2) /* invoke-custom */);
                class_332Var.method_51448().popMatrix();
                K2 = dx.K.j(class_1657Var, j5);
            }
            ?? r34 = K2;
            try {
                try {
                    K2 = b8.k(j6);
                    boolean z = r34 == true ? 1 : 0;
                    boolean z2 = z;
                    if (r0 != 0) {
                        str = "-" + z2;
                    } else if (z) {
                        z2 = r34 == true ? 1 : 0;
                        str = "-" + z2;
                    } else {
                        str = "-";
                    }
                    float fP = p(j8) + 105.0f;
                    float fV = V(j4) + 28.5f;
                    Color color = Color.white;
                    Intrinsics.checkNotNullExpressionValue(color, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26515, 4722416445737710536L ^ j2) /* invoke-custom */);
                    K2.I(class_332Var, str, fP, fV, color, j7);
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(K2, -1822271830669099653L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                K2 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(K2, -1822271830669099653L, j2) /* invoke-custom */;
                throw K2;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -1822271830669099653L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9 */
    private final void K(class_332 class_332Var, char c2, char c3, int i2, class_1309 class_1309Var) throws Throwable {
        long j = (((((long) c2) << 48) | ((((long) c3) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ a;
        long j2 = j ^ 114306130396911L;
        long j3 = j ^ 65107965548956L;
        long j4 = j ^ 50973348626895L;
        int i3 = (int) (j >>> 32);
        int i4 = (int) ((j4 << 32) >>> 48);
        int i5 = (int) ((j4 << 48) >>> 48);
        long j5 = j ^ 95066644807473L;
        long j6 = j ^ 54395406979714L;
        long j7 = j ^ 79708603320650L;
        long j8 = j ^ 109855207296126L;
        Object obj = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4999775627018489361L, j) /* invoke-custom */;
        if (obj != 0) {
            try {
                try {
                    obj = class_1309Var instanceof class_1657;
                    if (obj == 0) {
                        return;
                    } else {
                        class_332Var.method_51448().pushMatrix();
                    }
                } catch (NumberFormatException unused) {
                    obj = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 5022516431168790141L, j) /* invoke-custom */;
                    throw obj;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 5022516431168790141L, j) /* invoke-custom */;
            }
        }
        float fClamp = (10.0f - Math.clamp(O.a(), 0.0f, 10.0f)) / 2.0f;
        float fSin = fClamp * ((float) Math.sin(class_1309Var.field_6012 + zi.v.n(i3, (char) i4, i5)));
        float fCos = fClamp * ((float) Math.cos(class_1309Var.field_6012 + zi.v.n(i3, (char) i4, i5)));
        float f2 = fClamp * fSin;
        class_332Var.method_51448().translate(p(j8) + 46.0f + 14.0f + f2, ((V(j5) + 7.0f) + 14.0f) - fCos);
        class_332Var.method_51448().rotate((float) Math.toRadians(fSin));
        class_332Var.method_51448().scale(1.0f - (class_1309Var.field_6235 / 100.0f), 1.0f - (class_1309Var.field_6235 / 100.0f));
        class_332Var.method_51448().translate(-(p(j8) + 46.0f + 14.0f + f2), -(((V(j5) + 7.0f) + 14.0f) - fCos));
        VertexFormat vertexFormat = class_290.field_1575;
        Intrinsics.checkNotNullExpressionValue(vertexFormat, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26067, 5272065634471645826L ^ j) /* invoke-custom */);
        g7 g7Var = new g7(j2, vertexFormat, 2, false, 4, null);
        GpuTextureView gpuTextureViewMethod_71659 = zf.F(j3).method_1531().method_4619(((class_742) class_1309Var).method_52814().comp_1626().comp_3627()).method_71659();
        Intrinsics.checkNotNullExpressionValue(gpuTextureViewMethod_71659, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30020, 3788960488688714249L ^ j) /* invoke-custom */);
        jl jlVar = jl.y;
        float fP = p(j8) + 46.0f;
        float fV = V(j5) + 7.0f;
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2251, 8497649774294892416L ^ j) /* invoke-custom */);
        jl.R(jlVar, g7Var, fP, fV, 28.0f, 28.0f, color, null, null, null, 0.125f, 0.125f, 0.25f, j7, 0.25f, (int) d(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25677, 6310867537412602247L ^ j) /* invoke-custom */, null);
        jl jlVar2 = jl.y;
        float fP2 = p(j8) + 44.0f;
        float fV2 = V(j5) + 5.0f;
        Color color2 = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color2, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2251, 8497649774294892416L ^ j) /* invoke-custom */);
        jl.R(jlVar2, g7Var, fP2, fV2, 32.0f, 32.0f, color2, null, null, null, 0.625f, 0.125f, 0.75f, j7, 0.25f, (int) d(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25677, 6310867537412602247L ^ j) /* invoke-custom */, null);
        RenderPipeline renderPipelineO = b6.R.O();
        class_276 class_276VarMethod_1522 = zf.F(j3).method_1522();
        Intrinsics.checkNotNullExpressionValue(class_276VarMethod_1522, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11209, 3003090339033603200L ^ j) /* invoke-custom */);
        g7.R(j6, g7Var, renderPipelineO, class_276VarMethod_1522, null, null, class_332Var.method_51448(), MapsKt.mapOf(TuplesKt.to((String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27285, 3118611172629913034L ^ j) /* invoke-custom */, gpuTextureViewMethod_71659)), (int) d(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3089, 3178686855741166035L ^ j) /* invoke-custom */, null);
        class_332Var.method_51448().scale(1.0f, 1.0f);
        class_332Var.method_51448().popMatrix();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v108, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v109, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v111, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r52v1 */
    /* JADX WARN: Type inference failed for: r52v3 */
    private final void I(int i2, short s, short s2, class_332 class_332Var) throws Throwable {
        ?? H;
        ?? H2;
        long j = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ a;
        long j2 = j ^ 28183940163014L;
        long j3 = j ^ 14057910566293L;
        int i3 = (int) (j >>> 32);
        int i4 = (int) ((j3 << 32) >>> 48);
        int i5 = (int) ((j3 << 48) >>> 48);
        long j4 = j ^ 21912360873688L;
        long j5 = j ^ 117560476038416L;
        long j6 = j ^ 163591215861L;
        int i6 = (int) (j >>> 48);
        int i7 = (int) ((j6 << 16) >>> 32);
        int i8 = (int) ((j6 << 48) >>> 48);
        VertexFormat vertexFormat = class_290.field_1575;
        Intrinsics.checkNotNullExpressionValue(vertexFormat, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11134, 1553554957058482290L ^ j) /* invoke-custom */);
        g7 g7Var = new g7(j ^ 76282055965365L, vertexFormat, i.size(), false, 4, null);
        GpuTextureView gpuTextureViewMethod_71659 = zf.F(j2).method_1531().method_4619(n1.o()).method_71659();
        Intrinsics.checkNotNullExpressionValue(gpuTextureViewMethod_71659, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30344, 561164177160306057L ^ j) /* invoke-custom */);
        boolean z = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4125220363732148366L, j) /* invoke-custom */;
        Iterable<p0> iterable = i;
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            p0 p0Var = (p0) obj;
            H2 = s2;
            if (H2 >= 0) {
                break;
            }
            try {
                try {
                    H2 = p0Var.H();
                    if (z) {
                        break;
                    }
                    if (!z) {
                        if (H2 != 0) {
                            arrayList.add(obj);
                        } else {
                            continue;
                        }
                    }
                    if (z) {
                        break;
                    }
                } catch (NumberFormatException unused) {
                    H2 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(H2, 4173062794087080487L, j) /* invoke-custom */;
                    throw H2;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(H2, 4173062794087080487L, j) /* invoke-custom */;
            }
        }
        iterable = arrayList;
        if (s2 < 0) {
            H2 = 0;
        }
        loop1: for (p0 p0Var2 : iterable) {
            jl jlVarP = jl.y.p(jh.f.t(), (char) i6, i7, (1.0f - ((p0Var2.T() + zi.v.n(i3, (char) i4, i5)) / 10.0f)) * 0.8f, (short) i8);
            try {
                jlVarP = jl.y;
                jl.R(jlVarP, g7Var, jl.y.B(p0Var2.V(), p0Var2.Z(), zi.v.n(i3, (char) i4, i5)), jl.y.B(p0Var2.t(), p0Var2.e(), zi.v.n(i3, (char) i4, i5)), 10.0f, 10.0f, jlVarP, null, null, null, gi.FIREFLY_ALT.o(), gi.FIREFLY_ALT.v(), gi.FIREFLY_ALT.L(), j5, gi.FIREFLY_ALT.w(), (int) d(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6314, 3320563657985669428L ^ j) /* invoke-custom */, null);
                do {
                    boolean z2 = z;
                    if (i2 >= 0) {
                        if (z2) {
                            break loop1;
                        } else {
                            z2 = z;
                        }
                    }
                    if (z2) {
                    }
                } while (s2 > 0);
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(jlVarP, 4173062794087080487L, j) /* invoke-custom */;
            }
        }
        iterable = i;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : iterable) {
            p0 p0Var3 = (p0) obj2;
            H = i2;
            if (H < 0) {
                break;
            }
            try {
                try {
                    H = p0Var3.H();
                    if (z) {
                        break;
                    }
                    ?? r0 = H;
                    if (!z) {
                        r0 = H == 0 ? 1 : 0;
                    }
                    if (r0 != 0) {
                        arrayList2.add(obj2);
                        if (z) {
                            break;
                        }
                    }
                } catch (NumberFormatException unused4) {
                    H = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(H, 4173062794087080487L, j) /* invoke-custom */;
                    throw H;
                }
            } catch (NumberFormatException unused5) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(H, 4173062794087080487L, j) /* invoke-custom */;
            }
        }
        iterable = arrayList2;
        if (i2 >= 0) {
            H = 0;
        }
        loop4: for (p0 p0Var4 : iterable) {
            jl jlVar = null;
            try {
                jlVar = jl.y;
                float fB = jl.y.B(p0Var4.V(), p0Var4.Z(), zi.v.n(i3, (char) i4, i5));
                float fB2 = jl.y.B(p0Var4.t(), p0Var4.e(), zi.v.n(i3, (char) i4, i5));
                jl jlVar2 = jl.y;
                Color color = Color.WHITE;
                Intrinsics.checkNotNullExpressionValue(color, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6667, 7887511921486663949L ^ j) /* invoke-custom */);
                jl.R(jlVar, g7Var, fB, fB2, 6.0f, 6.0f, jlVar2.p(color, (char) i6, i7, 1.0f - ((p0Var4.T() + zi.v.n(i3, (char) i4, i5)) / 60.0f), (short) i8), null, null, null, gi.DROP.o(), gi.DROP.v(), gi.DROP.L(), j5, gi.DROP.w(), (int) d(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25677, 6310833921585104349L ^ j) /* invoke-custom */, null);
                do {
                    boolean z3 = z;
                    if (s2 <= 0) {
                        if (z3) {
                            return;
                        } else {
                            z3 = z;
                        }
                    }
                    if (z3) {
                    }
                } while (s2 > 0);
            } catch (NumberFormatException unused6) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(jlVar, 4173062794087080487L, j) /* invoke-custom */;
            }
        }
        RenderPipeline renderPipelineS = b6.R.S();
        class_276 class_276VarMethod_1522 = zf.F(j2).method_1522();
        Intrinsics.checkNotNullExpressionValue(class_276VarMethod_1522, (String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31493, 4571716425002905615L ^ j) /* invoke-custom */);
        g7.R(j4, g7Var, renderPipelineS, class_276VarMethod_1522, null, null, class_332Var.method_51448(), MapsKt.mapOf(TuplesKt.to((String) b(MethodHandles.lookup(), "f", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23563, 5056935316940347139L ^ j) /* invoke-custom */, gpuTextureViewMethod_71659)), (int) d(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28214, 228242006098136994L ^ j) /* invoke-custom */, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x010d: INVOKE (r-1 I:su.catlean.fd), (r0 I:long), (r1 I:float) VIRTUAL call: su.catlean.fd.B(long, float):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void r(long r24, net.minecraft.class_332 r26, net.minecraft.class_1309 r27) {
        /*
            Method dump skipped, instruction units count: 994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.p3.r(long, net.minecraft.class_332, net.minecraft.class_1309):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0261: INVOKE (r-1 I:su.catlean.jl), (r0 I:java.awt.Color), (r1 I:long), (r2 I:java.awt.Color), (r3 I:float) VIRTUAL call: su.catlean.jl.C(java.awt.Color, long, java.awt.Color, float):java.awt.Color
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void Y(net.minecraft.class_332 r21, java.util.List r22, long r23, boolean r25) {
        /*
            Method dump skipped, instruction units count: 918
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.p3.Y(net.minecraft.class_332, java.util.List, long, boolean):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private static final boolean p(su.catlean.p0 r7) {
        /*
            Method dump skipped, instruction units count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.p3.p(su.catlean.p0):boolean");
    }

    private static final boolean h(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    static {
        int i2;
        long j = a ^ 53823310052456L;
        long j2 = j ^ 94372120415699L;
        long j3 = j ^ 112436683986290L;
        f = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[23];
        int i4 = 0;
        String str = "\u0003ßUA ©7ÈDñßÿTîbÐ\u009c5.G\u0080\u0090yÖ\t%\u007f\u0010\u009bíð\u0010xÇVõêÛy\u0018-þ\u0007V Ý:<êÆ\u0006_ô\u009efèñí½\u0006é²\u0081å\u0005ñV°7÷ä\u0080T³ÌÄ?¹8\u0010\u009b yA\"§0vm\u009b:S²\u0081.ÙEò`ø\u0001\u00820\u0085\u009a{\r/7*\u008c+â+þÇ\u001c?E¤í¸Kq¶tÆo$d\u0088\u0095¨\u0011#Z\u0012\u0003g6¦\u001eÿjÔq¿ø\b\u0017\u007fµe\u0010\u0099C\u00946¸sF\u0083B3\u001fûÃ'\u001a8\u0010r\u0000ëÊÐhïäß¤ºxmç¦\u009a0bAh\u0089oÏfNÅ÷\u008dz>¬\u008fËFÅ(kÑ;¯\u0019ðªEéÏiGþñ\rf\u0095ª ¬\u0003\u0003TLò`\u0006\u0081\u0094\u0010ì+e§I\u0002CW½\u00167\u0011âUVB\u0010áZ\u008amé\\[>'\u001c_¥@Ô`y\u0018¯2êÁ\u0083x·C°5k8S¹Ãäúú<ÆÿJ\u0090\u0018\u0010\u009f!ÐfKNxðt¾d×\f5Ym(9þuß\f4\u0088\u001aA\u0089á.@TcH|ö_4H\u0007qÒmqo2\u0083\u00870ËG£7~\u0001þâÍ\u0018úWÐÁäÄS¼µ]¢ý%\u001aN²\u0085_í¦\fó\u0091i\u0018\u0004sÑ. \u0093Oå\u001a\u0003Éò^¾ó?s\u0002G¤\u0006}?l\u0010\u009a,ïÂ\u009a¹±b°\u00adå§ÒnÔ©\u0018Õ\u0011\u000e?AÔô\u0010\u008f\u0007ì\u008a«k°½vN\u009cíè£]û(\u0082\u0098\b\u0080\u001b\u008e1^\u0085ü§\u0014ê\u0080çmm]ô\u0011üCwú\u0082àRu>`ßbH,`]ªúï\r8nÿ{\u001d¥ÎÄÆc\u009c½d[È4\u0003ãmÁúóºK1\u0016=µ½VØ\u008f\u0086õ3\u0003\u000e\u008e×¬DÄñW+_\u0089Î.\u000b¶SkÍh\u0013æp\u0000\u009e¶%(Q·»G\u009eLoä¸PpÄ3Â\"\fjzynØùm\u0085\u0019~\u001e Á-\u001dºx\u0096\u009eKã<}¤Nk°ýRrË\u0082£Â<ô\u0015\u0010tMÿ\u0001ÛÙºøÁGL\u0091\u009dúð=<¡`÷V\u000eªQ=Qµ\u0010Ûî\u008cè\u009cáµf\u009f\u0016*ä%uð\u009f[\u008bYÁâº4Øé\u0018m\u0094^6èÏÍ{gë\u0091ôÛ©X´\u008bÖþßR¬È\u0094(ý\u0080»ÙÞÁê9\u001b\u00825Ñõ\u0086Ë\u0017\u0005\u009dÕ\u008aÓ\u0010\u008b\u0085\u0098Å\u0014/ºóÄ\"kð^/s?\u0092ë\u0010ö\u001fUÇ\u008b¿Õ¬ÓVº²_/n´\u0010ºÒ_°L·e¹\u008cRÏ\u0018ÍßF:";
        int length = "\u0003ßUA ©7ÈDñßÿTîbÐ\u009c5.G\u0080\u0090yÖ\t%\u007f\u0010\u009bíð\u0010xÇVõêÛy\u0018-þ\u0007V Ý:<êÆ\u0006_ô\u009efèñí½\u0006é²\u0081å\u0005ñV°7÷ä\u0080T³ÌÄ?¹8\u0010\u009b yA\"§0vm\u009b:S²\u0081.ÙEò`ø\u0001\u00820\u0085\u009a{\r/7*\u008c+â+þÇ\u001c?E¤í¸Kq¶tÆo$d\u0088\u0095¨\u0011#Z\u0012\u0003g6¦\u001eÿjÔq¿ø\b\u0017\u007fµe\u0010\u0099C\u00946¸sF\u0083B3\u001fûÃ'\u001a8\u0010r\u0000ëÊÐhïäß¤ºxmç¦\u009a0bAh\u0089oÏfNÅ÷\u008dz>¬\u008fËFÅ(kÑ;¯\u0019ðªEéÏiGþñ\rf\u0095ª ¬\u0003\u0003TLò`\u0006\u0081\u0094\u0010ì+e§I\u0002CW½\u00167\u0011âUVB\u0010áZ\u008amé\\[>'\u001c_¥@Ô`y\u0018¯2êÁ\u0083x·C°5k8S¹Ãäúú<ÆÿJ\u0090\u0018\u0010\u009f!ÐfKNxðt¾d×\f5Ym(9þuß\f4\u0088\u001aA\u0089á.@TcH|ö_4H\u0007qÒmqo2\u0083\u00870ËG£7~\u0001þâÍ\u0018úWÐÁäÄS¼µ]¢ý%\u001aN²\u0085_í¦\fó\u0091i\u0018\u0004sÑ. \u0093Oå\u001a\u0003Éò^¾ó?s\u0002G¤\u0006}?l\u0010\u009a,ïÂ\u009a¹±b°\u00adå§ÒnÔ©\u0018Õ\u0011\u000e?AÔô\u0010\u008f\u0007ì\u008a«k°½vN\u009cíè£]û(\u0082\u0098\b\u0080\u001b\u008e1^\u0085ü§\u0014ê\u0080çmm]ô\u0011üCwú\u0082àRu>`ßbH,`]ªúï\r8nÿ{\u001d¥ÎÄÆc\u009c½d[È4\u0003ãmÁúóºK1\u0016=µ½VØ\u008f\u0086õ3\u0003\u000e\u008e×¬DÄñW+_\u0089Î.\u000b¶SkÍh\u0013æp\u0000\u009e¶%(Q·»G\u009eLoä¸PpÄ3Â\"\fjzynØùm\u0085\u0019~\u001e Á-\u001dºx\u0096\u009eKã<}¤Nk°ýRrË\u0082£Â<ô\u0015\u0010tMÿ\u0001ÛÙºøÁGL\u0091\u009dúð=<¡`÷V\u000eªQ=Qµ\u0010Ûî\u008cè\u009cáµf\u009f\u0016*ä%uð\u009f[\u008bYÁâº4Øé\u0018m\u0094^6èÏÍ{gë\u0091ôÛ©X´\u008bÖþßR¬È\u0094(ý\u0080»ÙÞÁê9\u001b\u00825Ñõ\u0086Ë\u0017\u0005\u009dÕ\u008aÓ\u0010\u008b\u0085\u0098Å\u0014/ºóÄ\"kð^/s?\u0092ë\u0010ö\u001fUÇ\u008b¿Õ¬ÓVº²_/n´\u0010ºÒ_°L·e¹\u008cRÏ\u0018ÍßF:".length();
        char cCharAt = ' ';
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
                            c = new String[23];
                            k = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[35];
                            int i10 = 0;
                            String str3 = "ÜÅ¡Ï\u009b:p-[\u001e#\u008b\u001e7\u000eÔ\u0010\u0092u\u0087Å\u001bÝì\u0095\u000bð÷RÞwµ»\u001c\u0084H\u008aDàf?<\u008cW\bÍ¼Ék__\u0005ï\u0011\u009f \u009bI\u009c4ëíØÎ\u0093kYk¼röGÁ+(\u008b\u0099(ÀH*>\u0095ex\u009aÙ¾ít\\3Ug\u0098Ì\\4V(Ç#\u0093\u0007!ô.l-ú±b\u0087@a!`}\u0003\u0016\u000b\"®ñ\u001f\u001b(\u0096û\u001e\u0007îäk6éj\u0098#ëy\u0099\u001a³m\u008c\u0004ëÑ\u008d´|äÍ½\u0012M-?ÜucÂé\u0096¤pñ8\u0013K#\u0011\u0010\u0012' E©X\\H\u009dy8¦\u0093\u000e^ºÈýç¡å\u0082ø<<TÜ/7¡Äùéø`\t¨kÛ÷t\u0094÷\u0000\u008d\u008aå¼\u009b~\u001bù\u0081åähG\u0007¸ GïúVÌ\u007f'\u0004¢ /\u001fÍôäGÄ\u0093û©\u0015\u008f\u0088\u0004êQ·~C\u00ad";
                            int length2 = "ÜÅ¡Ï\u009b:p-[\u001e#\u008b\u001e7\u000eÔ\u0010\u0092u\u0087Å\u001bÝì\u0095\u000bð÷RÞwµ»\u001c\u0084H\u008aDàf?<\u008cW\bÍ¼Ék__\u0005ï\u0011\u009f \u009bI\u009c4ëíØÎ\u0093kYk¼röGÁ+(\u008b\u0099(ÀH*>\u0095ex\u009aÙ¾ít\\3Ug\u0098Ì\\4V(Ç#\u0093\u0007!ô.l-ú±b\u0087@a!`}\u0003\u0016\u000b\"®ñ\u001f\u001b(\u0096û\u001e\u0007îäk6éj\u0098#ëy\u0099\u001a³m\u008c\u0004ëÑ\u008d´|äÍ½\u0012M-?ÜucÂé\u0096¤pñ8\u0013K#\u0011\u0010\u0012' E©X\\H\u009dy8¦\u0093\u000e^ºÈýç¡å\u0082ø<<TÜ/7¡Äùéø`\t¨kÛ÷t\u0094÷\u0000\u008d\u008aå¼\u009b~\u001bù\u0081åähG\u0007¸ GïúVÌ\u007f'\u0004¢ /\u001fÍôäGÄ\u0093û©\u0015\u008f\u0088\u0004êQ·~C\u00ad".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j4 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j5 = j4;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j5 >>> 56), (byte) (j5 >>> 48), (byte) (j5 >>> 40), (byte) (j5 >>> 32), (byte) (j5 >>> 24), (byte) (j5 >>> 16), (byte) (j5 >>> 8), (byte) j5});
                                    long j6 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j6;
                                            if (i11 >= length2) {
                                                g = jArr;
                                                h = new Integer[35];
                                                Cipher cipher3 = Cipher.getInstance("DES/CBC/NoPadding");
                                                SecretKeyFactory secretKeyFactory3 = SecretKeyFactory.getInstance("DES");
                                                byte[] bArr3 = new byte[8];
                                                bArr3[0] = (byte) (j >>> 56);
                                                for (int i15 = 1; i15 < 8; i15++) {
                                                    bArr3[i15] = (byte) ((j << (i15 * 8)) >>> 56);
                                                }
                                                cipher3.init(2, secretKeyFactory3.generateSecret(new DESKeySpec(bArr3)), new IvParameterSpec(new byte[8]));
                                                long[] jArr3 = new long[2];
                                                int i16 = 0;
                                                int length3 = "sã\u009e\u0093\u0095\u0089:êsã\u009e\u0093\u0095\u0089:ê".length();
                                                int i17 = 0;
                                                do {
                                                    int i18 = i17;
                                                    i17 += 8;
                                                    byte[] bytes2 = "sã\u009e\u0093\u0095\u0089:êsã\u009e\u0093\u0095\u0089:ê".substring(i18, i17).getBytes("ISO-8859-1");
                                                    i16++;
                                                    byte[] bArrDoFinal2 = cipher3.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255))});
                                                    jArr3[-1] = ((((long) bArrDoFinal2[0]) & 255) << 56) | ((((long) bArrDoFinal2[1]) & 255) << 48) | ((((long) bArrDoFinal2[2]) & 255) << 40) | ((((long) bArrDoFinal2[3]) & 255) << 32) | ((((long) bArrDoFinal2[4]) & 255) << 24) | ((((long) bArrDoFinal2[5]) & 255) << 16) | ((((long) bArrDoFinal2[6]) & 255) << 8) | (((long) bArrDoFinal2[7]) & 255);
                                                } while (i17 < length3);
                                                Y = new p3(j3);
                                                i = new ArrayList();
                                                K = new fd(_s.OUT_BACK, jArr3[1], j2);
                                                O = new fd(_s.OUT_QUINT, jArr3[0], j2);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j6;
                                            if (i11 >= length2) {
                                                str3 = "\u009bÈ÷þ-\u0002?Á\u0004\u0017W)7\u001e³·";
                                                length2 = "\u009bÈ÷þ-\u0002?Á\u0004\u0017W)7\u001e³·".length();
                                                i11 = 0;
                                            }
                                            break;
                                    }
                                    int i19 = i11;
                                    i11 += 8;
                                    byte[] bytes3 = str3.substring(i19, i11).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i13 = i10;
                                    i10++;
                                    j4 = ((((long) bytes3[0]) & 255) << 56) | ((((long) bytes3[1]) & 255) << 48) | ((((long) bytes3[2]) & 255) << 40) | ((((long) bytes3[3]) & 255) << 32) | ((((long) bytes3[4]) & 255) << 24) | ((((long) bytes3[5]) & 255) << 16) | ((((long) bytes3[6]) & 255) << 8) | (((long) bytes3[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i20 = i4;
                        i4++;
                        strArr[i20] = strIntern;
                        int i21 = i6 + cCharAt;
                        i5 = i21;
                        if (i21 < length) {
                        }
                        str = "\u0085òW'\u0095\u0088#@íI§p\u0094\u0082\u0081·8Ð¯d\u0082Dqp\u008d4ßÊA\u009f\u0094¢\u0098R\u0000\u0085\nv-3\u0093\u0083\u0006J\u007fwW¶È}\u0014´;fù=\u00175\u008a]\u0010\u0017Ób%x¸úÆ@(4U";
                        length = "\u0085òW'\u0095\u0088#@íI§p\u0094\u0082\u0081·8Ð¯d\u0082Dqp\u008d4ßÊA\u009f\u0094¢\u0098R\u0000\u0085\nv-3\u0093\u0083\u0006J\u007fwW¶È}\u0014´;fù=\u00175\u008a]\u0010\u0017Ób%x¸úÆ@(4U".length();
                        cCharAt = 16;
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 13194;
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
                throw new RuntimeException("su/catlean/p3", e);
            }
        }
        return c[i3];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strB), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strB;
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
            r-1 = r-1[r0]
            r0 = r10
            int r0 = r0.parameterCount()
            java.lang.invoke.MethodHandle r-2 = r-2.asCollector(r-1, r0)
            r-1 = 0
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = 0
            r3 = r8
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r11
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = r9
            r1[r2] = r3
            java.lang.invoke.MethodHandle r-2 = java.lang.invoke.MethodHandles.insertArguments(r-2, r-1, r0)
            r-1 = r10
            java.lang.invoke.MethodHandle r-2 = java.lang.invoke.MethodHandles.explicitCastArguments(r-2, r-1)
            r-3.setTarget(r-2)
            goto L62
            r12 = r-4
            java.lang.RuntimeException r-4 = new java.lang.RuntimeException
            r-3 = r-4
            java.lang.StringBuilder r-2 = new java.lang.StringBuilder
            r-1 = r-2
            r-1.<init>()
            java.lang.String r-1 = "su/catlean/p3"
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-1 = " : "
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            r-1 = r9
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-1 = " : "
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            r-1 = r10
            r-1.toString()
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-2 = r-2.toString()
            r-1 = r12
            r-3.<init>(r-2, r-1)
            throw r-4
            r-3 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.p3.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int d(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 6422;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) k.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/p3", e);
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
    private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r-1 = r-1[r0]
            r0 = r10
            int r0 = r0.parameterCount()
            java.lang.invoke.MethodHandle r-2 = r-2.asCollector(r-1, r0)
            r-1 = 0
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = 0
            r3 = r8
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r11
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = r9
            r1[r2] = r3
            java.lang.invoke.MethodHandle r-2 = java.lang.invoke.MethodHandles.insertArguments(r-2, r-1, r0)
            r-1 = r10
            java.lang.invoke.MethodHandle r-2 = java.lang.invoke.MethodHandles.explicitCastArguments(r-2, r-1)
            r-3.setTarget(r-2)
            goto L62
            r12 = r-4
            java.lang.RuntimeException r-4 = new java.lang.RuntimeException
            r-3 = r-4
            java.lang.StringBuilder r-2 = new java.lang.StringBuilder
            r-1 = r-2
            r-1.<init>()
            java.lang.String r-1 = "su/catlean/p3"
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-1 = " : "
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            r-1 = r9
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-1 = " : "
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            r-1 = r10
            r-1.toString()
            java.lang.StringBuilder r-2 = r-2.append(r-1)
            java.lang.String r-2 = r-2.toString()
            r-1 = r12
            r-3.<init>(r-2, r-1)
            throw r-4
            r-3 = r11
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.p3.d(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
