package su.catlean;

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
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.minecraft.class_10442;
import net.minecraft.class_10444;
import net.minecraft.class_1059;
import net.minecraft.class_11566;
import net.minecraft.class_1799;
import net.minecraft.class_290;
import net.minecraft.class_4587;
import net.minecraft.class_4597;
import net.minecraft.class_4608;
import net.minecraft.class_7833;
import net.minecraft.class_811;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix3x2fStack;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.ItemCommandEvent;
import su.catlean.api.event.events.render.RenderFloatingItemEvent;
import su.catlean.api.event.events.render.ShowFloatingItemEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ki.class */
public final class ki extends _g {

    @NotNull
    public static final ki I;
    static final KProperty[] U;

    @NotNull
    private static final cw g;

    @NotNull
    private static final c8 j;

    @Nullable
    private static class_1799 V;
    private static int G;

    @Nullable
    private static class_4597 l;
    private static final long a = yz.a(4589183338756116592L, -88129097220505376L, MethodHandles.lookup().lookupClass()).a(39078240765253L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map h;

    /* JADX WARN: Illegal instructions before constructor call */
    private ki(int i, short s, char c2) {
        long j2 = (((((long) i) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ a;
        super((String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16284, 7674363821613690627L ^ j2) /* invoke-custom */, jt.F(), null, 4, null, j2 ^ 64922900937045L);
    }

    private final ok E(long j2) {
        return (ok) g.E(this, (a ^ j2) ^ 13808655134915L, U[0]);
    }

    private final int Q(long j2) {
        return ((Number) j.E(this, (a ^ j2) ^ 79502554742459L, U[1])).intValue();
    }

    @Flow
    private final void D(ShowFloatingItemEvent showFloatingItemEvent) {
        long j2 = (a ^ 75872045983029L) ^ 90102202555995L;
        V = showFloatingItemEvent.getItem();
        G = t(j2);
        showFloatingItemEvent.cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Flow
    private final void k(PlayerUpdateEvent playerUpdateEvent) {
        long j2 = a ^ 5815000851908L;
        ?? r0 = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5558637116452582212L, j2) /* invoke-custom */;
        try {
            try {
                r0 = G;
                ?? r02 = r0;
                if (r0 == 0) {
                    if (r0 <= 0) {
                        return;
                    }
                    G--;
                    int i = G;
                    r02 = G;
                }
                if (r02 == 0) {
                    try {
                        r02 = 0;
                        V = null;
                    } catch (NoWhenBranchMatchedException unused) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -5598425328817356433L, j2) /* invoke-custom */;
                    }
                }
            } catch (NoWhenBranchMatchedException unused2) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -5598425328817356433L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused3) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -5598425328817356433L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v142, types: [float] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v62, types: [float] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v99 */
    @Flow
    private final void x(RenderFloatingItemEvent renderFloatingItemEvent) {
        long j2 = a ^ 91729698866862L;
        long j3 = j2 ^ 124639497473376L;
        long j4 = j2 ^ 50136186884627L;
        long j5 = j2 ^ 78746740751808L;
        long j6 = j2 ^ 94772257468820L;
        long j7 = j2 ^ 135326621845118L;
        long j8 = j2 ^ 92261859982817L;
        long j9 = j2 ^ 36232878430581L;
        long j10 = j2 ^ 34234396047977L;
        long j11 = j2 ^ 115310871900755L;
        int i = (int) (j2 >>> 48);
        int i2 = (int) ((j11 << 16) >>> 32);
        int i3 = (int) ((j11 << 48) >>> 48);
        long j12 = j2 >>> 8;
        int i4 = (int) (((j2 ^ 96980197135258L) << 56) >>> 56);
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1274966035851145174L, j2) /* invoke-custom */;
        try {
            try {
                if (V != null) {
                    obj = G;
                    if (obj <= 0 || E(j10) == ok.Off) {
                        return;
                    }
                    int iMethod_4486 = zf.F(j3).method_22683().method_4486();
                    int iMethod_4502 = zf.F(j3).method_22683().method_4502();
                    int iT = t(j5) - G;
                    float fK = (iT + jl.y.K(j9)) / t(j5);
                    float f2 = fK * fK;
                    float f3 = fK * f2;
                    float f4 = ((((((10.25f * f3) * f2) - ((24.95f * f2) * f2)) + (25.5f * f3)) - (13.8f * f2)) + (4.0f * fK)) * 3.1415927f;
                    class_4587 class_4587Var = new class_4587();
                    class_4587Var.method_22903();
                    float fK2 = iT + jl.y.K(j9);
                    float fSin = 50.0f + (175.0f * ((float) Math.sin(f4)));
                    Object objPow = c5.g[E(j10).ordinal()];
                    try {
                        try {
                            switch (objPow) {
                                case 1:
                                    float fSin2 = (float) (Math.sin((fK2 * (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19331, 3610031225533652943L ^ j2) /* invoke-custom */) / 180.0f) * ((double) (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11790, 9107154368324221514L ^ j2) /* invoke-custom */));
                                    objPow = (float) (Math.cos((fK2 * (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10577, 1594824938538482945L ^ j2) /* invoke-custom */) / 180.0f) * ((double) (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1978, 5912888651577594879L ^ j2) /* invoke-custom */));
                                    try {
                                        try {
                                            class_4587Var.method_46416((iMethod_4486 / 2) + fSin2, (iMethod_4502 / 2) + objPow, -50.0f);
                                            class_4587Var.method_22905(fSin, -fSin, fSin);
                                            if (obj != 0) {
                                            }
                                            VertexFormat vertexFormat = class_290.field_1575;
                                            Intrinsics.checkNotNullExpressionValue(vertexFormat, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5653, 8064673714124226341L ^ j2) /* invoke-custom */);
                                            g7 g7Var = new g7(j4, vertexFormat, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22354, 3244522469997298452L ^ j2) /* invoke-custom */, false, 4, null);
                                            jl jlVar = jl.y;
                                            Color color = Color.WHITE;
                                            Intrinsics.checkNotNullExpressionValue(color, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15028, 8179180239660733318L ^ j2) /* invoke-custom */);
                                            Color colorDarker = jlVar.p(color, (char) i, i2, 1.0f - fK, (short) i3).darker();
                                            Intrinsics.checkNotNullExpressionValue(colorDarker, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2580, 5505253872041878319L ^ j2) /* invoke-custom */);
                                            l = new j7(new wf(j12, (byte) i4, g7Var, colorDarker), j6);
                                            class_10444 class_10444Var = new class_10444();
                                            class_10442 class_10442VarMethod_65386 = zf.F(j3).method_65386();
                                            class_1799 class_1799Var = V;
                                            Intrinsics.checkNotNull(class_1799Var);
                                            class_10442VarMethod_65386.method_65598(class_10444Var, class_1799Var.method_7909().method_7854(), class_811.field_4319, zf.z(j8), (class_11566) null, 0);
                                            class_10444Var.method_65604(class_4587Var, zf.F(j3).field_1773.method_72910(), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13997, 2182395064085684973L ^ j2) /* invoke-custom */, class_4608.field_21444, 0);
                                            zf.F(j3).field_1773.method_72911().method_73002();
                                            zf.F(j3).field_1773.method_72910().method_72953();
                                            GpuTextureView gpuTextureViewMethod_71659 = zf.F(j3).method_1531().method_4619(class_1059.field_64467).method_71659();
                                            Intrinsics.checkNotNullExpressionValue(gpuTextureViewMethod_71659, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4205, 3745449767210809692L ^ j2) /* invoke-custom */);
                                            g7.R(j7, g7Var, b6.R.O(), null, null, new class_4587().method_23760().method_23761(), new Matrix3x2fStack(), MapsKt.mapOf(TuplesKt.to((String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27515, 4066915953542693452L ^ j2) /* invoke-custom */, gpuTextureViewMethod_71659)), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1269, 2217814937011589310L ^ j2) /* invoke-custom */, null);
                                            l = null;
                                            class_4587Var.method_22909();
                                            return;
                                        } catch (NoWhenBranchMatchedException unused) {
                                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objPow, 1235169336630993413L, j2) /* invoke-custom */;
                                        }
                                    } catch (NoWhenBranchMatchedException unused2) {
                                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objPow, 1235169336630993413L, j2) /* invoke-custom */;
                                    }
                                case 2:
                                    class_4587Var.method_46416(iMethod_4486 / 2, iMethod_4502 / 2, -50.0f);
                                    class_4587Var.method_22905(fSin, -fSin, fSin);
                                    objPow = obj;
                                    if (objPow != 0) {
                                        break;
                                    }
                                    VertexFormat vertexFormat2 = class_290.field_1575;
                                    Intrinsics.checkNotNullExpressionValue(vertexFormat2, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5653, 8064673714124226341L ^ j2) /* invoke-custom */);
                                    g7 g7Var2 = new g7(j4, vertexFormat2, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22354, 3244522469997298452L ^ j2) /* invoke-custom */, false, 4, null);
                                    jl jlVar2 = jl.y;
                                    Color color2 = Color.WHITE;
                                    Intrinsics.checkNotNullExpressionValue(color2, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15028, 8179180239660733318L ^ j2) /* invoke-custom */);
                                    Color colorDarker2 = jlVar2.p(color2, (char) i, i2, 1.0f - fK, (short) i3).darker();
                                    Intrinsics.checkNotNullExpressionValue(colorDarker2, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2580, 5505253872041878319L ^ j2) /* invoke-custom */);
                                    l = new j7(new wf(j12, (byte) i4, g7Var2, colorDarker2), j6);
                                    class_10444 class_10444Var2 = new class_10444();
                                    class_10442 class_10442VarMethod_653862 = zf.F(j3).method_65386();
                                    class_1799 class_1799Var2 = V;
                                    Intrinsics.checkNotNull(class_1799Var2);
                                    class_10442VarMethod_653862.method_65598(class_10444Var2, class_1799Var2.method_7909().method_7854(), class_811.field_4319, zf.z(j8), (class_11566) null, 0);
                                    class_10444Var2.method_65604(class_4587Var, zf.F(j3).field_1773.method_72910(), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13997, 2182395064085684973L ^ j2) /* invoke-custom */, class_4608.field_21444, 0);
                                    zf.F(j3).field_1773.method_72911().method_73002();
                                    zf.F(j3).field_1773.method_72910().method_72953();
                                    GpuTextureView gpuTextureViewMethod_716592 = zf.F(j3).method_1531().method_4619(class_1059.field_64467).method_71659();
                                    Intrinsics.checkNotNullExpressionValue(gpuTextureViewMethod_716592, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4205, 3745449767210809692L ^ j2) /* invoke-custom */);
                                    g7.R(j7, g7Var2, b6.R.O(), null, null, new class_4587().method_23760().method_23761(), new Matrix3x2fStack(), MapsKt.mapOf(TuplesKt.to((String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27515, 4066915953542693452L ^ j2) /* invoke-custom */, gpuTextureViewMethod_716592)), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1269, 2217814937011589310L ^ j2) /* invoke-custom */, null);
                                    l = null;
                                    class_4587Var.method_22909();
                                    return;
                                case 3:
                                    class_4587Var.method_46416(iMethod_4486 / 2, iMethod_4502 / 2, -50.0f);
                                    class_4587Var.method_22907(class_7833.field_40714.rotationDegrees(fK2 * 2));
                                    class_4587Var.method_22907(class_7833.field_40718.rotationDegrees(fK2 * 2));
                                    class_4587Var.method_22905((int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7199, 5342741395474745422L ^ j2) /* invoke-custom */ - (fK2 * 1.5f), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23107, 8698235820695670284L ^ j2) /* invoke-custom */ + (fK2 * 1.5f), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15638, 8348529922887985496L ^ j2) /* invoke-custom */ - (fK2 * 1.5f));
                                    if (obj != 0) {
                                        break;
                                    }
                                    VertexFormat vertexFormat22 = class_290.field_1575;
                                    Intrinsics.checkNotNullExpressionValue(vertexFormat22, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5653, 8064673714124226341L ^ j2) /* invoke-custom */);
                                    g7 g7Var22 = new g7(j4, vertexFormat22, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22354, 3244522469997298452L ^ j2) /* invoke-custom */, false, 4, null);
                                    jl jlVar22 = jl.y;
                                    Color color22 = Color.WHITE;
                                    Intrinsics.checkNotNullExpressionValue(color22, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15028, 8179180239660733318L ^ j2) /* invoke-custom */);
                                    Color colorDarker22 = jlVar22.p(color22, (char) i, i2, 1.0f - fK, (short) i3).darker();
                                    Intrinsics.checkNotNullExpressionValue(colorDarker22, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2580, 5505253872041878319L ^ j2) /* invoke-custom */);
                                    l = new j7(new wf(j12, (byte) i4, g7Var22, colorDarker22), j6);
                                    class_10444 class_10444Var22 = new class_10444();
                                    class_10442 class_10442VarMethod_6538622 = zf.F(j3).method_65386();
                                    class_1799 class_1799Var22 = V;
                                    Intrinsics.checkNotNull(class_1799Var22);
                                    class_10442VarMethod_6538622.method_65598(class_10444Var22, class_1799Var22.method_7909().method_7854(), class_811.field_4319, zf.z(j8), (class_11566) null, 0);
                                    class_10444Var22.method_65604(class_4587Var, zf.F(j3).field_1773.method_72910(), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13997, 2182395064085684973L ^ j2) /* invoke-custom */, class_4608.field_21444, 0);
                                    zf.F(j3).field_1773.method_72911().method_73002();
                                    zf.F(j3).field_1773.method_72910().method_72953();
                                    GpuTextureView gpuTextureViewMethod_7165922 = zf.F(j3).method_1531().method_4619(class_1059.field_64467).method_71659();
                                    Intrinsics.checkNotNullExpressionValue(gpuTextureViewMethod_7165922, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4205, 3745449767210809692L ^ j2) /* invoke-custom */);
                                    g7.R(j7, g7Var22, b6.R.O(), null, null, new class_4587().method_23760().method_23761(), new Matrix3x2fStack(), MapsKt.mapOf(TuplesKt.to((String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27515, 4066915953542693452L ^ j2) /* invoke-custom */, gpuTextureViewMethod_7165922)), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1269, 2217814937011589310L ^ j2) /* invoke-custom */, null);
                                    l = null;
                                    class_4587Var.method_22909();
                                    return;
                                case 4:
                                    class_4587Var.method_46416(iMethod_4486 / 2, iMethod_4502 / 2, -50.0f);
                                    class_4587Var.method_22907(class_7833.field_40714.rotationDegrees(fK2 * 3));
                                    class_4587Var.method_22905((int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15638, 8348529922887985496L ^ j2) /* invoke-custom */ - (fK2 * 1.5f), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23666, 7426210407008061499L ^ j2) /* invoke-custom */ + (fK2 * 1.5f), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15638, 8348529922887985496L ^ j2) /* invoke-custom */ - (fK2 * 1.5f));
                                    if (obj != 0) {
                                        break;
                                    }
                                    VertexFormat vertexFormat222 = class_290.field_1575;
                                    Intrinsics.checkNotNullExpressionValue(vertexFormat222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5653, 8064673714124226341L ^ j2) /* invoke-custom */);
                                    g7 g7Var222 = new g7(j4, vertexFormat222, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22354, 3244522469997298452L ^ j2) /* invoke-custom */, false, 4, null);
                                    jl jlVar222 = jl.y;
                                    Color color222 = Color.WHITE;
                                    Intrinsics.checkNotNullExpressionValue(color222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15028, 8179180239660733318L ^ j2) /* invoke-custom */);
                                    Color colorDarker222 = jlVar222.p(color222, (char) i, i2, 1.0f - fK, (short) i3).darker();
                                    Intrinsics.checkNotNullExpressionValue(colorDarker222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2580, 5505253872041878319L ^ j2) /* invoke-custom */);
                                    l = new j7(new wf(j12, (byte) i4, g7Var222, colorDarker222), j6);
                                    class_10444 class_10444Var222 = new class_10444();
                                    class_10442 class_10442VarMethod_65386222 = zf.F(j3).method_65386();
                                    class_1799 class_1799Var222 = V;
                                    Intrinsics.checkNotNull(class_1799Var222);
                                    class_10442VarMethod_65386222.method_65598(class_10444Var222, class_1799Var222.method_7909().method_7854(), class_811.field_4319, zf.z(j8), (class_11566) null, 0);
                                    class_10444Var222.method_65604(class_4587Var, zf.F(j3).field_1773.method_72910(), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13997, 2182395064085684973L ^ j2) /* invoke-custom */, class_4608.field_21444, 0);
                                    zf.F(j3).field_1773.method_72911().method_73002();
                                    zf.F(j3).field_1773.method_72910().method_72953();
                                    GpuTextureView gpuTextureViewMethod_71659222 = zf.F(j3).method_1531().method_4619(class_1059.field_64467).method_71659();
                                    Intrinsics.checkNotNullExpressionValue(gpuTextureViewMethod_71659222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4205, 3745449767210809692L ^ j2) /* invoke-custom */);
                                    g7.R(j7, g7Var222, b6.R.O(), null, null, new class_4587().method_23760().method_23761(), new Matrix3x2fStack(), MapsKt.mapOf(TuplesKt.to((String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27515, 4066915953542693452L ^ j2) /* invoke-custom */, gpuTextureViewMethod_71659222)), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1269, 2217814937011589310L ^ j2) /* invoke-custom */, null);
                                    l = null;
                                    class_4587Var.method_22909();
                                    return;
                                case AbstractJsonLexerKt.TC_COLON /* 5 */:
                                    class_4587Var.method_46416(iMethod_4486 / 2, (iMethod_4502 / 2) + ((float) (Math.pow(fK2, 3.0d) * ((double) 0.2f))), -50.0f);
                                    class_4587Var.method_22907(class_7833.field_40718.rotationDegrees(fK2 * 5));
                                    class_4587Var.method_22905((int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15638, 8348529922887985496L ^ j2) /* invoke-custom */ - (fK2 * 1.5f), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23666, 7426210407008061499L ^ j2) /* invoke-custom */ + (fK2 * 1.5f), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15638, 8348529922887985496L ^ j2) /* invoke-custom */ - (fK2 * 1.5f));
                                    if (obj != 0) {
                                    }
                                    VertexFormat vertexFormat2222 = class_290.field_1575;
                                    Intrinsics.checkNotNullExpressionValue(vertexFormat2222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5653, 8064673714124226341L ^ j2) /* invoke-custom */);
                                    g7 g7Var2222 = new g7(j4, vertexFormat2222, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22354, 3244522469997298452L ^ j2) /* invoke-custom */, false, 4, null);
                                    jl jlVar2222 = jl.y;
                                    Color color2222 = Color.WHITE;
                                    Intrinsics.checkNotNullExpressionValue(color2222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15028, 8179180239660733318L ^ j2) /* invoke-custom */);
                                    Color colorDarker2222 = jlVar2222.p(color2222, (char) i, i2, 1.0f - fK, (short) i3).darker();
                                    Intrinsics.checkNotNullExpressionValue(colorDarker2222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2580, 5505253872041878319L ^ j2) /* invoke-custom */);
                                    l = new j7(new wf(j12, (byte) i4, g7Var2222, colorDarker2222), j6);
                                    class_10444 class_10444Var2222 = new class_10444();
                                    class_10442 class_10442VarMethod_653862222 = zf.F(j3).method_65386();
                                    class_1799 class_1799Var2222 = V;
                                    Intrinsics.checkNotNull(class_1799Var2222);
                                    class_10442VarMethod_653862222.method_65598(class_10444Var2222, class_1799Var2222.method_7909().method_7854(), class_811.field_4319, zf.z(j8), (class_11566) null, 0);
                                    class_10444Var2222.method_65604(class_4587Var, zf.F(j3).field_1773.method_72910(), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13997, 2182395064085684973L ^ j2) /* invoke-custom */, class_4608.field_21444, 0);
                                    zf.F(j3).field_1773.method_72911().method_73002();
                                    zf.F(j3).field_1773.method_72910().method_72953();
                                    GpuTextureView gpuTextureViewMethod_716592222 = zf.F(j3).method_1531().method_4619(class_1059.field_64467).method_71659();
                                    Intrinsics.checkNotNullExpressionValue(gpuTextureViewMethod_716592222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4205, 3745449767210809692L ^ j2) /* invoke-custom */);
                                    g7.R(j7, g7Var2222, b6.R.O(), null, null, new class_4587().method_23760().method_23761(), new Matrix3x2fStack(), MapsKt.mapOf(TuplesKt.to((String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27515, 4066915953542693452L ^ j2) /* invoke-custom */, gpuTextureViewMethod_716592222)), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1269, 2217814937011589310L ^ j2) /* invoke-custom */, null);
                                    l = null;
                                    class_4587Var.method_22909();
                                    return;
                                case AbstractJsonLexerKt.TC_BEGIN_OBJ /* 6 */:
                                    class_4587Var.method_46416(iMethod_4486 / 2, (iMethod_4502 / 2) - (((float) (Math.pow(fK2, 3.0d) * ((double) 0.2f))) - (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15523, 5326013954695014626L ^ j2) /* invoke-custom */), -50.0f);
                                    class_4587Var.method_22907(class_7833.field_40716.rotationDegrees(fK2 * G * 2));
                                    class_4587Var.method_22905((int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15638, 8348529922887985496L ^ j2) /* invoke-custom */ - (fK2 * 1.5f), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23666, 7426210407008061499L ^ j2) /* invoke-custom */ + (fK2 * 1.5f), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15638, 8348529922887985496L ^ j2) /* invoke-custom */ - (fK2 * 1.5f));
                                    if (obj != 0) {
                                    }
                                    VertexFormat vertexFormat22222 = class_290.field_1575;
                                    Intrinsics.checkNotNullExpressionValue(vertexFormat22222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5653, 8064673714124226341L ^ j2) /* invoke-custom */);
                                    g7 g7Var22222 = new g7(j4, vertexFormat22222, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22354, 3244522469997298452L ^ j2) /* invoke-custom */, false, 4, null);
                                    jl jlVar22222 = jl.y;
                                    Color color22222 = Color.WHITE;
                                    Intrinsics.checkNotNullExpressionValue(color22222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15028, 8179180239660733318L ^ j2) /* invoke-custom */);
                                    Color colorDarker22222 = jlVar22222.p(color22222, (char) i, i2, 1.0f - fK, (short) i3).darker();
                                    Intrinsics.checkNotNullExpressionValue(colorDarker22222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2580, 5505253872041878319L ^ j2) /* invoke-custom */);
                                    l = new j7(new wf(j12, (byte) i4, g7Var22222, colorDarker22222), j6);
                                    class_10444 class_10444Var22222 = new class_10444();
                                    class_10442 class_10442VarMethod_6538622222 = zf.F(j3).method_65386();
                                    class_1799 class_1799Var22222 = V;
                                    Intrinsics.checkNotNull(class_1799Var22222);
                                    class_10442VarMethod_6538622222.method_65598(class_10444Var22222, class_1799Var22222.method_7909().method_7854(), class_811.field_4319, zf.z(j8), (class_11566) null, 0);
                                    class_10444Var22222.method_65604(class_4587Var, zf.F(j3).field_1773.method_72910(), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13997, 2182395064085684973L ^ j2) /* invoke-custom */, class_4608.field_21444, 0);
                                    zf.F(j3).field_1773.method_72911().method_73002();
                                    zf.F(j3).field_1773.method_72910().method_72953();
                                    GpuTextureView gpuTextureViewMethod_7165922222 = zf.F(j3).method_1531().method_4619(class_1059.field_64467).method_71659();
                                    Intrinsics.checkNotNullExpressionValue(gpuTextureViewMethod_7165922222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4205, 3745449767210809692L ^ j2) /* invoke-custom */);
                                    g7.R(j7, g7Var22222, b6.R.O(), null, null, new class_4587().method_23760().method_23761(), new Matrix3x2fStack(), MapsKt.mapOf(TuplesKt.to((String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27515, 4066915953542693452L ^ j2) /* invoke-custom */, gpuTextureViewMethod_7165922222)), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1269, 2217814937011589310L ^ j2) /* invoke-custom */, null);
                                    l = null;
                                    class_4587Var.method_22909();
                                    return;
                                case AbstractJsonLexerKt.TC_END_OBJ /* 7 */:
                                    objPow = (float) (Math.pow(fK2, 2.0d) * ((double) 4.5f));
                                    try {
                                        class_4587Var.method_46416((iMethod_4486 / 2) + objPow, iMethod_4502 / 2, -50.0f);
                                        class_4587Var.method_22907(class_7833.field_40718.rotationDegrees(fK2 * (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31418, 7923997260602928882L ^ j2) /* invoke-custom */));
                                        class_4587Var.method_22905((int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15638, 8348529922887985496L ^ j2) /* invoke-custom */ - (fK2 * 1.5f), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23666, 7426210407008061499L ^ j2) /* invoke-custom */ + (fK2 * 1.5f), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15638, 8348529922887985496L ^ j2) /* invoke-custom */ - (fK2 * 1.5f));
                                        objPow = obj;
                                        if (objPow != 0) {
                                        }
                                        VertexFormat vertexFormat222222 = class_290.field_1575;
                                        Intrinsics.checkNotNullExpressionValue(vertexFormat222222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5653, 8064673714124226341L ^ j2) /* invoke-custom */);
                                        g7 g7Var222222 = new g7(j4, vertexFormat222222, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22354, 3244522469997298452L ^ j2) /* invoke-custom */, false, 4, null);
                                        jl jlVar222222 = jl.y;
                                        Color color222222 = Color.WHITE;
                                        Intrinsics.checkNotNullExpressionValue(color222222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15028, 8179180239660733318L ^ j2) /* invoke-custom */);
                                        Color colorDarker222222 = jlVar222222.p(color222222, (char) i, i2, 1.0f - fK, (short) i3).darker();
                                        Intrinsics.checkNotNullExpressionValue(colorDarker222222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2580, 5505253872041878319L ^ j2) /* invoke-custom */);
                                        l = new j7(new wf(j12, (byte) i4, g7Var222222, colorDarker222222), j6);
                                        class_10444 class_10444Var222222 = new class_10444();
                                        class_10442 class_10442VarMethod_65386222222 = zf.F(j3).method_65386();
                                        class_1799 class_1799Var222222 = V;
                                        Intrinsics.checkNotNull(class_1799Var222222);
                                        class_10442VarMethod_65386222222.method_65598(class_10444Var222222, class_1799Var222222.method_7909().method_7854(), class_811.field_4319, zf.z(j8), (class_11566) null, 0);
                                        class_10444Var222222.method_65604(class_4587Var, zf.F(j3).field_1773.method_72910(), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13997, 2182395064085684973L ^ j2) /* invoke-custom */, class_4608.field_21444, 0);
                                        zf.F(j3).field_1773.method_72911().method_73002();
                                        zf.F(j3).field_1773.method_72910().method_72953();
                                        GpuTextureView gpuTextureViewMethod_71659222222 = zf.F(j3).method_1531().method_4619(class_1059.field_64467).method_71659();
                                        Intrinsics.checkNotNullExpressionValue(gpuTextureViewMethod_71659222222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4205, 3745449767210809692L ^ j2) /* invoke-custom */);
                                        g7.R(j7, g7Var222222, b6.R.O(), null, null, new class_4587().method_23760().method_23761(), new Matrix3x2fStack(), MapsKt.mapOf(TuplesKt.to((String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27515, 4066915953542693452L ^ j2) /* invoke-custom */, gpuTextureViewMethod_71659222222)), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1269, 2217814937011589310L ^ j2) /* invoke-custom */, null);
                                        l = null;
                                        class_4587Var.method_22909();
                                        return;
                                    } catch (NoWhenBranchMatchedException unused3) {
                                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objPow, 1235169336630993413L, j2) /* invoke-custom */;
                                    }
                                case 8:
                                    if (obj != 0) {
                                        break;
                                    }
                                    VertexFormat vertexFormat2222222 = class_290.field_1575;
                                    Intrinsics.checkNotNullExpressionValue(vertexFormat2222222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5653, 8064673714124226341L ^ j2) /* invoke-custom */);
                                    g7 g7Var2222222 = new g7(j4, vertexFormat2222222, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22354, 3244522469997298452L ^ j2) /* invoke-custom */, false, 4, null);
                                    jl jlVar2222222 = jl.y;
                                    Color color2222222 = Color.WHITE;
                                    Intrinsics.checkNotNullExpressionValue(color2222222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15028, 8179180239660733318L ^ j2) /* invoke-custom */);
                                    Color colorDarker2222222 = jlVar2222222.p(color2222222, (char) i, i2, 1.0f - fK, (short) i3).darker();
                                    Intrinsics.checkNotNullExpressionValue(colorDarker2222222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2580, 5505253872041878319L ^ j2) /* invoke-custom */);
                                    l = new j7(new wf(j12, (byte) i4, g7Var2222222, colorDarker2222222), j6);
                                    class_10444 class_10444Var2222222 = new class_10444();
                                    class_10442 class_10442VarMethod_653862222222 = zf.F(j3).method_65386();
                                    class_1799 class_1799Var2222222 = V;
                                    Intrinsics.checkNotNull(class_1799Var2222222);
                                    class_10442VarMethod_653862222222.method_65598(class_10444Var2222222, class_1799Var2222222.method_7909().method_7854(), class_811.field_4319, zf.z(j8), (class_11566) null, 0);
                                    class_10444Var2222222.method_65604(class_4587Var, zf.F(j3).field_1773.method_72910(), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13997, 2182395064085684973L ^ j2) /* invoke-custom */, class_4608.field_21444, 0);
                                    zf.F(j3).field_1773.method_72911().method_73002();
                                    zf.F(j3).field_1773.method_72910().method_72953();
                                    GpuTextureView gpuTextureViewMethod_716592222222 = zf.F(j3).method_1531().method_4619(class_1059.field_64467).method_71659();
                                    Intrinsics.checkNotNullExpressionValue(gpuTextureViewMethod_716592222222, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4205, 3745449767210809692L ^ j2) /* invoke-custom */);
                                    g7.R(j7, g7Var2222222, b6.R.O(), null, null, new class_4587().method_23760().method_23761(), new Matrix3x2fStack(), MapsKt.mapOf(TuplesKt.to((String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27515, 4066915953542693452L ^ j2) /* invoke-custom */, gpuTextureViewMethod_716592222222)), (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1269, 2217814937011589310L ^ j2) /* invoke-custom */, null);
                                    l = null;
                                    class_4587Var.method_22909();
                                    return;
                                default:
                                    throw new NoWhenBranchMatchedException();
                            }
                        } catch (NoWhenBranchMatchedException unused4) {
                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objPow, 1235169336630993413L, j2) /* invoke-custom */;
                        }
                    } catch (NoWhenBranchMatchedException unused5) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objPow, 1235169336630993413L, j2) /* invoke-custom */;
                    }
                }
            } catch (NoWhenBranchMatchedException unused6) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1235169336630993413L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused7) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1235169336630993413L, j2) /* invoke-custom */;
        }
    }

    @Flow
    private final void M(ItemCommandEvent itemCommandEvent) {
        long j2 = a ^ 23687492799509L;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2663087271051418259L, j2) /* invoke-custom */;
        if (obj == null) {
            try {
                try {
                    obj = l;
                    if (obj == null) {
                        return;
                    } else {
                        itemCommandEvent.setProvider(l);
                    }
                } catch (NoWhenBranchMatchedException unused) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -2621247738005837634L, j2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused2) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -2621247738005837634L, j2) /* invoke-custom */;
            }
        }
        itemCommandEvent.cancel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    private final int t(long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 113642239185198L;
        long j5 = j3 ^ 39147943173974L;
        Object objE = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4974526352526424943L, j3) /* invoke-custom */;
        int iL = (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4522, 7398148195583241903L ^ j3) /* invoke-custom */ - Q(j5);
        try {
            try {
                objE = E(j4);
                ok okVar = ok.FadeOut;
                Object obj = objE;
                if (objE == null) {
                    if (objE == okVar) {
                        return iL / 4;
                    }
                    ok okVarE = E(j4);
                    okVar = ok.Insert;
                    obj = okVarE;
                }
                if (obj != okVar) {
                    return iL;
                }
                try {
                    obj = iL / 2;
                    return obj;
                } catch (NoWhenBranchMatchedException unused) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -5016082486181508798L, j3) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused2) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objE, -5016082486181508798L, j3) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused3) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objE, -5016082486181508798L, j3) /* invoke-custom */;
        }
    }

    static {
        int i;
        long j2 = a ^ 120499116154764L;
        long j3 = j2 ^ 131591829550592L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j3 << 32) >>> 48);
        int i4 = (int) ((j3 << 48) >>> 48);
        long j4 = j2 ^ 78276329046719L;
        long j5 = j2 ^ 46090122179949L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i5 = 1; i5 < 8; i5++) {
            bArr[i5] = (byte) ((j2 << (i5 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[12];
        int i6 = 0;
        String str = "\u00adfmDI&W&ðé/\u001dÿ\u001e\u0081#0äÍ\u0081j\u0082tå\"\u0090 AW4gbÐ-ë\u0089~×!6(4ì\u0095}b$¯ö*Ó/\u008e¼³kÀjKNa«\u0085Ñ¬tÑé§O\u009b©ÝÛC\u0012¾*\u0099¦¸\u0010àO®\u0098ÝÍÁXIøË)=òZ\u00980\bÓ?\u008c\u0090n\u0097\u009c`\u009cO\u0089Í3ñ¯KD*{ÍG£@\u0080?5ÕÊýP\n¹/Y±\u008c0\u008cÈ÷WXÓÉ)g÷ ÉÝ\u0095»Ç\u007fÙîôý\"åõ\u0095J\u0013n§~.>\u001f\u0090{X\u0010ÇõÿÕöT\u0010\u000eº6µ\u008aÏ\u0012ã?Í\u0095Q\u0003éÇ(\u0010\u001fqË¦fñ\u0093÷\u008eEü\u000b\u0093ú'÷\u0018¡¨V·Z,WÆìÅÜgXsqiÝ©ª#*\bE\\\u0010;-â\\Þ[>»(\u0015K\u0086\t¢Ì\u0019\u0010É \u008c\u0014eYé\u0080\u008f\u0004qG;cQD";
        int length = "\u00adfmDI&W&ðé/\u001dÿ\u001e\u0081#0äÍ\u0081j\u0082tå\"\u0090 AW4gbÐ-ë\u0089~×!6(4ì\u0095}b$¯ö*Ó/\u008e¼³kÀjKNa«\u0085Ñ¬tÑé§O\u009b©ÝÛC\u0012¾*\u0099¦¸\u0010àO®\u0098ÝÍÁXIøË)=òZ\u00980\bÓ?\u008c\u0090n\u0097\u009c`\u009cO\u0089Í3ñ¯KD*{ÍG£@\u0080?5ÕÊýP\n¹/Y±\u008c0\u008cÈ÷WXÓÉ)g÷ ÉÝ\u0095»Ç\u007fÙîôý\"åõ\u0095J\u0013n§~.>\u001f\u0090{X\u0010ÇõÿÕöT\u0010\u000eº6µ\u008aÏ\u0012ã?Í\u0095Q\u0003éÇ(\u0010\u001fqË¦fñ\u0093÷\u008eEü\u000b\u0093ú'÷\u0018¡¨V·Z,WÆìÅÜgXsqiÝ©ª#*\bE\\\u0010;-â\\Þ[>»(\u0015K\u0086\t¢Ì\u0019\u0010É \u008c\u0014eYé\u0080\u008f\u0004qG;cQD".length();
        char cCharAt = '(';
        int i7 = -1;
        while (true) {
            int i8 = i7 + 1;
            String strSubstring = str.substring(i8, i8 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i9 = i6;
                        i6++;
                        strArr[i9] = strIntern;
                        int i10 = i8 + cCharAt;
                        i = i10;
                        if (i10 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            b = strArr;
                            c = new String[12];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i11 = 1; i11 < 8; i11++) {
                                bArr2[i11] = (byte) ((j2 << (i11 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[18];
                            int i12 = 0;
                            String str3 = "ó\u009d³\u0007d°\u008aá\u0091×\b-)\u001då`|Ö\u0094[|Ë¼Ééõñ~þ\u001a\u0096a6¼\u009dY\u0093\nÈ\u000f\u001a\u0092«\u0010½rlç¦ñ\u0019\u0090=\t\fè¦Áû²ûÞð£Ì\u001c\u0003\u008d£\u0092ã\u001dL\u000f\u0005¾_ÛýVZ6^\u0094¥\u001e.\u0013:\u008f ÏQõäûÂÜ#\u009b\u008ejÐ$\u008bMâï\u008c\u0090ú\u0011&ÓTíS4Q\u008dM<ùq_¼êk";
                            int length2 = "ó\u009d³\u0007d°\u008aá\u0091×\b-)\u001då`|Ö\u0094[|Ë¼Ééõñ~þ\u001a\u0096a6¼\u009dY\u0093\nÈ\u000f\u001a\u0092«\u0010½rlç¦ñ\u0019\u0090=\t\fè¦Áû²ûÞð£Ì\u001c\u0003\u008d£\u0092ã\u001dL\u000f\u0005¾_ÛýVZ6^\u0094¥\u001e.\u0013:\u008f ÏQõäûÂÜ#\u009b\u008ejÐ$\u008bMâï\u008c\u0090ú\u0011&ÓTíS4Q\u008dM<ùq_¼êk".length();
                            int i13 = 0;
                            while (true) {
                                int i14 = i13;
                                i13 += 8;
                                byte[] bytes = str3.substring(i14, i13).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i15 = i12;
                                i12++;
                                long j6 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j7 = j6;
                                    int i16 = i15;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j7 >>> 56), (byte) (j7 >>> 48), (byte) (j7 >>> 40), (byte) (j7 >>> 32), (byte) (j7 >>> 24), (byte) (j7 >>> 16), (byte) (j7 >>> 8), (byte) j7});
                                    long j8 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i16) {
                                        case 0:
                                            jArr2[b5] = j8;
                                            if (i13 >= length2) {
                                                e = jArr;
                                                f = new Integer[18];
                                                U = new KProperty[]{Reflection.property1(new PropertyReference1Impl(ki.class, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22089, 3013850781785122397L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10488, 8869284516620376297L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(ki.class, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6520, 4382134524244175203L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26890, 411904142409980188L ^ j2) /* invoke-custom */, 0))};
                                                I = new ki(i2, (short) i3, (char) i4);
                                                g = yp.L(I, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5901, 8799336774643001111L ^ j2) /* invoke-custom */, ok.FadeOut, null, null, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29155, 7488326978682993803L ^ j2) /* invoke-custom */, null, j5);
                                                j = yp.L(I, (String) b(MethodHandles.lookup(), "b", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8863, 5636345740677681800L ^ j2) /* invoke-custom */, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24610, 2588822703448862029L ^ j2) /* invoke-custom */, new IntRange(1, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29837, 5591367744798964204L ^ j2) /* invoke-custom */), j4, null, null, (int) c(MethodHandles.lookup(), "l", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15408, 1207740252423647573L ^ j2) /* invoke-custom */, null);
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j8;
                                            if (i13 >= length2) {
                                                str3 = "\u0018`~\u00adðrí\u0005qÂ\u009föåO~¬";
                                                length2 = "\u0018`~\u00adðrí\u0005qÂ\u009föåO~¬".length();
                                                i13 = 0;
                                            }
                                            break;
                                    }
                                    int i17 = i13;
                                    i13 += 8;
                                    byte[] bytes2 = str3.substring(i17, i13).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i15 = i12;
                                    i12++;
                                    j6 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i18 = i6;
                        i6++;
                        strArr[i18] = strIntern;
                        int i19 = i8 + cCharAt;
                        i7 = i19;
                        if (i19 < length) {
                        }
                        str = "î\u0093$N¦Ú\u000fë\u008aSÂ\u0099\u0088¡-OÖ§Ñp\u009cðàó \u0018\u0088.f8â\u0081+\r\u0015õM\u0011\u0089«°\u0013\u0014°}\u0004\u0001s\u0097Zl}·àªN\b";
                        length = "î\u0093$N¦Ú\u000fë\u008aSÂ\u0099\u0088¡-OÖ§Ñp\u009cðàó \u0018\u0088.f8â\u0081+\r\u0015õM\u0011\u0089«°\u0013\u0014°}\u0004\u0001s\u0097Zl}·àªN\b".length();
                        cCharAt = 24;
                        i = -1;
                        break;
                        break;
                }
                i8 = i + 1;
                strSubstring = str.substring(i8, i8 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i7);
        }
    }

    private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException noWhenBranchMatchedException) {
        return noWhenBranchMatchedException;
    }

    private static String b(byte[] bArr) {
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

    private static String b(int i, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j2 & 32767))) ^ 31001;
        if (c[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i2] = b(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/ki", e2);
            }
        }
        return c[i2];
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
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
            java.lang.String r1 = "su/catlean/ki"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ki.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j2) {
        int i2 = (i ^ ((int) (j2 & 32767))) ^ 1129;
        if (f[i2] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/ki", e2);
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

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iC)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iC;
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */
    private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
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
            java.lang.String r1 = "su/catlean/ki"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ki.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
