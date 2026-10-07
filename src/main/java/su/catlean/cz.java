package su.catlean;

import com.mojang.blaze3d.pipeline.RenderPipeline;
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
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_6364;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL32C;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/cz.class */
public final class cz {

    @NotNull
    public static final cz H;

    @NotNull
    private static List u;

    @NotNull
    private static List Y;

    @NotNull
    private static List F;

    @NotNull
    private static List k;

    @NotNull
    private static List n;

    @NotNull
    private static List M;

    @NotNull
    private static List K;

    @Nullable
    private static class_6364 q;

    @Nullable
    private static class_6364 e;
    private static boolean g;
    private static boolean E;
    private static final String[] b;
    private static final String[] c;
    private static final long[] f;
    private static final Integer[] h;
    private static final Map i;
    private static final long a = yz.a(-6327522248767712995L, 7685745101805475913L, MethodHandles.lookup().lookupClass()).a(132900495710087L);
    private static final Map d = new HashMap(13);

    private cz() {
    }

    @NotNull
    public final List F() {
        return u;
    }

    public final void C(@NotNull List list, long a2) {
        Intrinsics.checkNotNullParameter(list, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19741, 1445439906035068777L ^ (a ^ a2)) /* invoke-custom */);
        u = list;
    }

    @NotNull
    public final List a() {
        return Y;
    }

    public final void X(@NotNull List list, long a2) {
        Intrinsics.checkNotNullParameter(list, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19741, 1445445323856829169L ^ (a ^ a2)) /* invoke-custom */);
        Y = list;
    }

    @NotNull
    public final List x() {
        return F;
    }

    public final void w(char a2, @NotNull List list, int a3, short a4) {
        Intrinsics.checkNotNullParameter(list, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6222, 4304144775867229002L ^ ((((((long) a2) << 48) | ((((long) a3) << 32) >>> 16)) | ((((long) a4) << 48) >>> 48)) ^ a)) /* invoke-custom */);
        F = list;
    }

    @NotNull
    public final List O() {
        return k;
    }

    public final void U(long a2, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19741, 1445467673137714790L ^ (a ^ a2)) /* invoke-custom */);
        k = list;
    }

    @NotNull
    public final List h() {
        return n;
    }

    public final void O(long a2, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19741, 1445404856439953445L ^ (a ^ a2)) /* invoke-custom */);
        n = list;
    }

    @NotNull
    public final List V() {
        return M;
    }

    public final void u(@NotNull List list, long a2) {
        Intrinsics.checkNotNullParameter(list, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19741, 1445455110135944419L ^ (a ^ a2)) /* invoke-custom */);
        M = list;
    }

    @NotNull
    public final List N() {
        return K;
    }

    public final void N(long a2, @NotNull List list) {
        Intrinsics.checkNotNullParameter(list, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19741, 1445499763498549847L ^ (a ^ a2)) /* invoke-custom */);
        K = list;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x005c: INVOKE (r-1 I:su.catlean.cz), (r0 I:long), (r1 I:net.minecraft.class_4587) DIRECT call: su.catlean.cz.p(long, net.minecraft.class_4587):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow(priority = -10)
    private final void o(su.catlean.api.event.events.render.Render3DEvent r9) {
        /*
            r8 = this;
            long r0 = su.catlean.cz.a
            r1 = 50331990364337(0x2dc6d46810b1, double:2.48673073258316E-310)
            long r0 = r0 ^ r1
            r10 = r0
            r0 = r10
            r1 = r0; r1 = r0; 
            r2 = 60358961825652(0x36e56a7a8774, double:2.9821289456698E-310)
            long r1 = r1 ^ r2
            r12 = r1
            r1 = r0; r2 = r0; 
            r2 = 56087550190013(0x3302e68161bd, double:2.7710931708282E-310)
            long r1 = r1 ^ r2
            r14 = r1
            r1 = r0; r2 = r0; 
            r2 = 122051805383702(0x6f0166810c16, double:6.0301604052989E-310)
            long r1 = r1 ^ r2
            r16 = r1
            r1 = r0; r2 = r0; 
            r2 = 13642411324438(0xc685f14b416, double:6.7402467618404E-311)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r18 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r19 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r20 = r2
            r1 = r0; r3 = r0; 
            r2 = 77143191392849(0x46294c851251, double:3.8113800677763E-310)
            long r1 = r1 ^ r2
            r21 = r1
            su.catlean.nz r0 = su.catlean.nz.B
            r1 = r9
            net.minecraft.class_4587 r1 = r1.getStack()
            r2 = r21
            r0.k(r1, r2)
            r0 = r8
            r1 = r9
            net.minecraft.class_4587 r1 = r1.getStack()
            r2 = r16
            r3 = r2; r2 = r1; r1 = r3; 
            r-1.p(r0, r1)
            r-1 = r8
            r0 = r9
            net.minecraft.class_4587 r0 = r0.getStack()
            r1 = r12
            r-1.U(r0, r1)
            r-1 = r8
            r0 = r9
            net.minecraft.class_4587 r0 = r0.getStack()
            r1 = r18
            r2 = r0; r0 = r1; r1 = r2; 
            r2 = r19
            short r2 = (short) r2
            r3 = r20
            char r3 = (char) r3
            r-1.Y(r0, r1, r2, r3)
            r-1 = r8
            r0 = r9
            net.minecraft.class_4587 r0 = r0.getStack()
            r1 = r14
            r2 = r1; r1 = r0; r0 = r2; 
            r-2.n(r-1, r0)
            java.util.List r-2 = su.catlean.cz.u
            r-2.clear()
            java.util.List r-2 = su.catlean.cz.Y
            r-2.clear()
            java.util.List r-2 = su.catlean.cz.F
            r-2.clear()
            java.util.List r-2 = su.catlean.cz.k
            r-2.clear()
            java.util.List r-2 = su.catlean.cz.n
            r-2.clear()
            java.util.List r-2 = su.catlean.cz.M
            r-2.clear()
            java.util.List r-2 = su.catlean.cz.K
            r-2.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.cz.o(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    private final void n(long j, class_4587 class_4587Var) {
        ?? r0;
        long j2 = a ^ j;
        long j3 = j2 ^ 105378644063030L;
        long j4 = j2 ^ 57508861559732L;
        long j5 = j2 ^ 22051688200419L;
        long j6 = j2 ^ 10284064319323L;
        ?? IsEmpty = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8079367087143161954L, j2) /* invoke-custom */;
        try {
            IsEmpty = Y.isEmpty();
            ?? r02 = IsEmpty;
            if (IsEmpty != 0) {
                r02 = IsEmpty == 0 ? 1 : 0;
            }
            if (r02 != 0) {
                z(j4);
                VertexFormat vertexFormat = class_290.field_1576;
                Intrinsics.checkNotNullExpressionValue(vertexFormat, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1699, 9129067237783083279L ^ j2) /* invoke-custom */);
                g7 g7Var = new g7(j3, vertexFormat, Y.size() * (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12442, 3371375617026287137L ^ j2) /* invoke-custom */, false, 4, null);
                loop0: for (x9 x9Var : Y) {
                    cz czVar = null;
                    try {
                        czVar = H;
                        czVar.a(j5, g7Var, x9Var.k(), x9Var.Q(), x9Var.Q());
                        do {
                            r0 = IsEmpty;
                            if (j2 < 0) {
                                break loop0;
                            } else if (r0 == 0) {
                                break loop0;
                            } else if (IsEmpty == 0) {
                            }
                        } while (j2 < 0);
                    } catch (NoWhenBranchMatchedException unused) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(czVar, 8212722200671945262L, j2) /* invoke-custom */;
                    }
                }
                RenderPipeline renderPipelineD = b6.R.d();
                class_276 class_276Var = q;
                Intrinsics.checkNotNull(class_276Var);
                g7.R(j6, g7Var, renderPipelineD, class_276Var, null, class_4587Var.method_23760().method_23761(), null, null, (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19824, 4626190254395759572L ^ j2) /* invoke-custom */, null);
                r0 = 1;
                g = r0;
            }
        } catch (NoWhenBranchMatchedException unused2) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(IsEmpty, 8212722200671945262L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void p(long r16, net.minecraft.class_4587 r18) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.cz.p(long, net.minecraft.class_4587):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v27, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [byte] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    private final void Y(int i2, class_4587 class_4587Var, short s, char c2) {
        ?? V;
        long j = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ a;
        long j2 = j ^ 66516164049390L;
        long j3 = j ^ 59583201932016L;
        int i3 = (int) (j >>> 32);
        long j4 = ((j ^ 30887141849518L) << 32) >>> 32;
        int i4 = (int) (j >>> 56);
        long j5 = ((j ^ 138228751309003L) << 8) >>> 8;
        ?? IsEmpty = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6547254617602814252L, j) /* invoke-custom */;
        try {
            IsEmpty = K.isEmpty();
            ?? r0 = IsEmpty;
            if (IsEmpty == 0) {
                r0 = IsEmpty == 0 ? 1 : 0;
            }
            if (r0 != 0) {
                GL32C.glEnable((int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3102, 3183914156798512911L ^ j) /* invoke-custom */);
                GL32C.glHint((int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12934, 2939648967470789017L ^ j) /* invoke-custom */, (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30603, 2320399949978760344L ^ j) /* invoke-custom */);
                VertexFormat vertexFormat = class_290.field_1576;
                Intrinsics.checkNotNullExpressionValue(vertexFormat, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32457, 8446055760842208455L ^ j) /* invoke-custom */);
                g7 g7Var = new g7(i3, j4, vertexFormat, K.size(), true);
                loop0: for (oj ojVar : K) {
                    ?? r02 = 0;
                    try {
                        r02 = (byte) i4;
                        v(r02, H, g7Var, ojVar.D(), ojVar.E(), j5, ojVar.P(), ojVar.c(), false, (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22777, 9013989402540596196L ^ j) /* invoke-custom */, null);
                        do {
                            V = IsEmpty;
                            if (s > 0) {
                                break loop0;
                            } else if (V != 0) {
                                break loop0;
                            } else if (IsEmpty != 0) {
                            }
                        } while (i2 < 0);
                    } catch (NoWhenBranchMatchedException unused) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -6606133871617386619L, j) /* invoke-custom */;
                    }
                }
                RenderPipeline renderPipelineV = b6.R.V();
                class_276 class_276VarMethod_1522 = zf.F(j2).method_1522();
                Intrinsics.checkNotNullExpressionValue(class_276VarMethod_1522, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11880, 1828252923292345447L ^ j) /* invoke-custom */);
                g7.R(j3, g7Var, renderPipelineV, class_276VarMethod_1522, null, class_4587Var.method_23760().method_23761(), null, null, (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8175, 6967631219268492535L ^ j) /* invoke-custom */, null);
                V = (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17519, 7825218328058808180L ^ j) /* invoke-custom */;
                GL32C.glDisable((int) V);
            }
        } catch (NoWhenBranchMatchedException unused2) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(IsEmpty, -6606133871617386619L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8 A[PHI: r0
  0x00e8: PHI (r0v15 ??) = (r0v135 ??), (r0v136 ??) binds: [B:29:0x00d7, B:31:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v121, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v125, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v128 */
    /* JADX WARN: Type inference failed for: r0v129 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v131 */
    /* JADX WARN: Type inference failed for: r0v132 */
    /* JADX WARN: Type inference failed for: r0v133 */
    /* JADX WARN: Type inference failed for: r0v134 */
    /* JADX WARN: Type inference failed for: r0v135 */
    /* JADX WARN: Type inference failed for: r0v136 */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v29, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [su.catlean.lg] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v58, types: [su.catlean.g7] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [su.catlean.lg] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void U(net.minecraft.class_4587 r14, long r15) {
        /*
            Method dump skipped, instruction units count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.cz.U(net.minecraft.class_4587, long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0120: INVOKE 
          (r-1 I:long)
          (r0 I:su.catlean.g7)
          (r1 I:com.mojang.blaze3d.pipeline.RenderPipeline)
          (r2 I:net.minecraft.class_276)
          (r3 I:com.mojang.blaze3d.buffers.GpuBufferSlice)
          (r4 I:org.joml.Matrix4f)
          (r5 I:org.joml.Matrix3x2f)
          (r6 I:java.util.Map)
          (r7 I:int)
          (r8 I:java.lang.Object)
         STATIC call: su.catlean.g7.R(long, su.catlean.g7, com.mojang.blaze3d.pipeline.RenderPipeline, net.minecraft.class_276, com.mojang.blaze3d.buffers.GpuBufferSlice, org.joml.Matrix4f, org.joml.Matrix3x2f, java.util.Map, int, java.lang.Object):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void G(su.catlean.api.event.events.render.Render2DEvent r16) {
        /*
            Method dump skipped, instruction units count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.cz.G(su.catlean.api.event.events.render.Render2DEvent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(su.catlean.g7 r9, net.minecraft.class_243 r10, net.minecraft.class_243 r11, java.awt.Color r12, java.awt.Color r13, boolean r14, long r15) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.cz.d(su.catlean.g7, net.minecraft.class_243, net.minecraft.class_243, java.awt.Color, java.awt.Color, boolean, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [su.catlean.cz] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    static void v(byte b2, cz czVar, g7 g7Var, class_243 class_243Var, class_243 class_243Var2, long j, Color color, Color color2, boolean z, int i2, Object obj) {
        long j2 = ((((long) b2) << 56) | ((j << 8) >>> 8)) ^ a;
        long j3 = j2 ^ 77260635558971L;
        ?? V = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2745187408464645616L, j2) /* invoke-custom */;
        try {
            V = i2 & (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31970, 4780814452335280948L ^ j2) /* invoke-custom */;
            ?? V2 = V;
            if (V == 0) {
                if (V != 0) {
                    color2 = color;
                }
                V2 = i2 & (int) b(MethodHandles.lookup(), "v", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27010, 3580195922388751954L ^ j2) /* invoke-custom */;
            }
            ?? r19 = z;
            ?? r0 = V2;
            if (V != 0) {
                r19 = r0;
            } else if (V2 != 0) {
                r0 = 0;
                r19 = r0;
            }
            czVar.d(g7Var, class_243Var, class_243Var2, color, color2, r19, j3);
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(V, -2840060271094355135L, j2) /* invoke-custom */;
        }
    }

    private final void Z(class_238 class_238Var, g7 g7Var, Color color, Color color2, long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 21214777637333L;
        long j4 = j2 ^ 105057999667003L;
        class_4184 class_4184Var = zf.F(j2 ^ 66851481993711L).method_1561().field_4686;
        Intrinsics.checkNotNull(class_4184Var);
        class_243 class_243VarMethod_71156 = class_4184Var.method_71156();
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_71156, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24485, 4839854716276190639L ^ j2) /* invoke-custom */);
        float fMethod_10216 = (float) (class_238Var.field_1323 - class_243VarMethod_71156.method_10216());
        float fMethod_10214 = (float) (class_238Var.field_1322 - class_243VarMethod_71156.method_10214());
        float fMethod_10215 = (float) (class_238Var.field_1321 - class_243VarMethod_71156.method_10215());
        float fMethod_102162 = (float) (class_238Var.field_1320 - class_243VarMethod_71156.method_10216());
        float fMethod_102142 = (float) (class_238Var.field_1325 - class_243VarMethod_71156.method_10214());
        float fMethod_102152 = (float) (class_238Var.field_1324 - class_243VarMethod_71156.method_10215());
        g7Var.G(fMethod_10216, j3, fMethod_10214, fMethod_10215).n(color, j4);
        g7Var.G(fMethod_10216, j3, fMethod_10214, fMethod_102152).n(color, j4);
        g7Var.G(fMethod_10216, j3, fMethod_10214, fMethod_102152).n(color, j4);
        g7Var.G(fMethod_102162, j3, fMethod_10214, fMethod_102152).n(color, j4);
        g7Var.G(fMethod_102162, j3, fMethod_10214, fMethod_102152).n(color, j4);
        g7Var.G(fMethod_102162, j3, fMethod_10214, fMethod_10215).n(color, j4);
        g7Var.G(fMethod_102162, j3, fMethod_10214, fMethod_10215).n(color, j4);
        g7Var.G(fMethod_10216, j3, fMethod_10214, fMethod_10215).n(color, j4);
        g7Var.G(fMethod_10216, j3, fMethod_102142, fMethod_10215).n(color2, j4);
        g7Var.G(fMethod_10216, j3, fMethod_102142, fMethod_102152).n(color2, j4);
        g7Var.G(fMethod_10216, j3, fMethod_102142, fMethod_102152).n(color2, j4);
        g7Var.G(fMethod_102162, j3, fMethod_102142, fMethod_102152).n(color2, j4);
        g7Var.G(fMethod_102162, j3, fMethod_102142, fMethod_102152).n(color2, j4);
        g7Var.G(fMethod_102162, j3, fMethod_102142, fMethod_10215).n(color2, j4);
        g7Var.G(fMethod_102162, j3, fMethod_102142, fMethod_10215).n(color2, j4);
        g7Var.G(fMethod_10216, j3, fMethod_102142, fMethod_10215).n(color2, j4);
        g7Var.G(fMethod_10216, j3, fMethod_10214, fMethod_10215).n(color, j4);
        g7Var.G(fMethod_10216, j3, fMethod_102142, fMethod_10215).n(color2, j4);
        g7Var.G(fMethod_102162, j3, fMethod_10214, fMethod_10215).n(color, j4);
        g7Var.G(fMethod_102162, j3, fMethod_102142, fMethod_10215).n(color2, j4);
        g7Var.G(fMethod_102162, j3, fMethod_10214, fMethod_102152).n(color, j4);
        g7Var.G(fMethod_102162, j3, fMethod_102142, fMethod_102152).n(color2, j4);
        g7Var.G(fMethod_10216, j3, fMethod_10214, fMethod_102152).n(color, j4);
        g7Var.G(fMethod_10216, j3, fMethod_102142, fMethod_102152).n(color2, j4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [float] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v32 */
    private final void F(long j, class_238 class_238Var, g7 g7Var, Color color, class_2350 class_2350Var) {
        long j2 = a ^ j;
        long j3 = j2 ^ 10924861757896L;
        long j4 = j2 ^ 42235720606194L;
        long j5 = j2 ^ 117295801657116L;
        boolean z = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4249903753627767054L, j2) /* invoke-custom */;
        class_4184 class_4184Var = zf.F(j3).method_1561().field_4686;
        Intrinsics.checkNotNull(class_4184Var);
        class_243 class_243VarMethod_71156 = class_4184Var.method_71156();
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_71156, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7004, 2511940791700500857L ^ j2) /* invoke-custom */);
        float fMethod_10216 = (float) (class_238Var.field_1323 - class_243VarMethod_71156.method_10216());
        float fMethod_10214 = (float) (class_238Var.field_1322 - class_243VarMethod_71156.method_10214());
        float fMethod_10215 = (float) (class_238Var.field_1321 - class_243VarMethod_71156.method_10215());
        float fMethod_102162 = (float) (class_238Var.field_1320 - class_243VarMethod_71156.method_10216());
        float fMethod_102142 = (float) (class_238Var.field_1325 - class_243VarMethod_71156.method_10214());
        Object objMethod_10215 = (float) (class_238Var.field_1324 - class_243VarMethod_71156.method_10215());
        try {
            objMethod_10215 = z;
            if (objMethod_10215 == 0) {
                try {
                    objMethod_10215 = sb.N[class_2350Var.ordinal()];
                    switch (objMethod_10215) {
                        case 1:
                            g7Var.G(fMethod_10216, j4, fMethod_102142, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_102142, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_102142, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_102142, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_102142, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_10216, j4, fMethod_102142, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_10216, j4, fMethod_102142, objMethod_10215).n(color, j5);
                            break;
                        case 2:
                            g7Var.G(fMethod_10216, j4, fMethod_10214, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_10214, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_10214, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_10214, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_10214, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_10216, j4, fMethod_10214, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_10216, j4, fMethod_10214, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_10216, j4, fMethod_10214, fMethod_10215).n(color, j5);
                            return;
                        case 3:
                            g7Var.G(fMethod_10216, j4, fMethod_10214, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_10214, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_10214, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_102142, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_102142, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_10216, j4, fMethod_102142, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_10216, j4, fMethod_102142, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_10216, j4, fMethod_10214, fMethod_10215).n(color, j5);
                            return;
                        case 4:
                            g7Var.G(fMethod_10216, j4, fMethod_10214, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_10214, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_10214, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_102142, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_102142, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_10216, j4, fMethod_102142, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_10216, j4, fMethod_102142, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_10216, j4, fMethod_10214, objMethod_10215).n(color, j5);
                            return;
                        case AbstractJsonLexerKt.TC_COLON /* 5 */:
                            g7Var.G(fMethod_10216, j4, fMethod_10214, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_10216, j4, fMethod_10214, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_10216, j4, fMethod_10214, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_10216, j4, fMethod_102142, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_10216, j4, fMethod_102142, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_10216, j4, fMethod_102142, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_10216, j4, fMethod_102142, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_10216, j4, fMethod_10214, fMethod_10215).n(color, j5);
                            return;
                        case AbstractJsonLexerKt.TC_BEGIN_OBJ /* 6 */:
                            g7Var.G(fMethod_102162, j4, fMethod_10214, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_10214, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_10214, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_102142, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_102142, objMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_102142, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_102142, fMethod_10215).n(color, j5);
                            g7Var.G(fMethod_102162, j4, fMethod_10214, fMethod_10215).n(color, j5);
                            return;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } catch (NoWhenBranchMatchedException unused) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_10215, -4290670755684501597L, j2) /* invoke-custom */;
                }
            }
            g7Var.G(fMethod_10216, j4, fMethod_102142, fMethod_10215).n(color, j5);
        } catch (NoWhenBranchMatchedException unused2) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_10215, -4290670755684501597L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [float] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v33 */
    private final void x(class_238 class_238Var, g7 g7Var, Color color, long j, class_2350 class_2350Var) {
        long j2 = a ^ j;
        long j3 = j2 ^ 39992200927236L;
        long j4 = j2 ^ 115004785745642L;
        class_4184 class_4184Var = zf.F(j2 ^ 13026794184766L).method_1561().field_4686;
        Intrinsics.checkNotNull(class_4184Var);
        class_243 class_243VarMethod_71156 = class_4184Var.method_71156();
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_71156, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24485, 4839866759555239038L ^ j2) /* invoke-custom */);
        float fMethod_10216 = (float) (class_238Var.field_1323 - class_243VarMethod_71156.method_10216());
        float fMethod_10214 = (float) (class_238Var.field_1322 - class_243VarMethod_71156.method_10214());
        float fMethod_10215 = (float) (class_238Var.field_1321 - class_243VarMethod_71156.method_10215());
        boolean z = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8963470867830381593L, j2) /* invoke-custom */;
        float fMethod_102162 = (float) (class_238Var.field_1320 - class_243VarMethod_71156.method_10216());
        float fMethod_102142 = (float) (class_238Var.field_1325 - class_243VarMethod_71156.method_10214());
        Object objMethod_10215 = (float) (class_238Var.field_1324 - class_243VarMethod_71156.method_10215());
        try {
            objMethod_10215 = z;
            if (objMethod_10215 != 0) {
                try {
                    objMethod_10215 = sb.N[class_2350Var.ordinal()];
                    switch (objMethod_10215) {
                        case 1:
                            g7Var.G(fMethod_10216, j3, fMethod_102142, fMethod_10215).n(color, j4);
                            g7Var.G(fMethod_102162, j3, fMethod_102142, fMethod_10215).n(color, j4);
                            g7Var.G(fMethod_102162, j3, fMethod_102142, objMethod_10215).n(color, j4);
                            break;
                        case 2:
                            g7Var.G(fMethod_10216, j3, fMethod_10214, fMethod_10215).n(color, j4);
                            g7Var.G(fMethod_102162, j3, fMethod_10214, fMethod_10215).n(color, j4);
                            g7Var.G(fMethod_102162, j3, fMethod_10214, objMethod_10215).n(color, j4);
                            g7Var.G(fMethod_10216, j3, fMethod_10214, objMethod_10215).n(color, j4);
                            return;
                        case 3:
                            g7Var.G(fMethod_10216, j3, fMethod_10214, fMethod_10215).n(color, j4);
                            g7Var.G(fMethod_102162, j3, fMethod_10214, fMethod_10215).n(color, j4);
                            g7Var.G(fMethod_102162, j3, fMethod_102142, fMethod_10215).n(color, j4);
                            g7Var.G(fMethod_10216, j3, fMethod_102142, fMethod_10215).n(color, j4);
                            return;
                        case 4:
                            g7Var.G(fMethod_10216, j3, fMethod_10214, objMethod_10215).n(color, j4);
                            g7Var.G(fMethod_102162, j3, fMethod_10214, objMethod_10215).n(color, j4);
                            g7Var.G(fMethod_102162, j3, fMethod_102142, objMethod_10215).n(color, j4);
                            g7Var.G(fMethod_10216, j3, fMethod_102142, objMethod_10215).n(color, j4);
                            return;
                        case AbstractJsonLexerKt.TC_COLON /* 5 */:
                            g7Var.G(fMethod_10216, j3, fMethod_10214, fMethod_10215).n(color, j4);
                            g7Var.G(fMethod_10216, j3, fMethod_10214, objMethod_10215).n(color, j4);
                            g7Var.G(fMethod_10216, j3, fMethod_102142, objMethod_10215).n(color, j4);
                            g7Var.G(fMethod_10216, j3, fMethod_102142, fMethod_10215).n(color, j4);
                            return;
                        case AbstractJsonLexerKt.TC_BEGIN_OBJ /* 6 */:
                            g7Var.G(fMethod_102162, j3, fMethod_10214, fMethod_10215).n(color, j4);
                            g7Var.G(fMethod_102162, j3, fMethod_10214, objMethod_10215).n(color, j4);
                            g7Var.G(fMethod_102162, j3, fMethod_102142, objMethod_10215).n(color, j4);
                            g7Var.G(fMethod_102162, j3, fMethod_102142, fMethod_10215).n(color, j4);
                            return;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                } catch (NoWhenBranchMatchedException unused) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_10215, 9043926896939961941L, j2) /* invoke-custom */;
                }
            }
            g7Var.G(fMethod_10216, j3, fMethod_102142, objMethod_10215).n(color, j4);
        } catch (NoWhenBranchMatchedException unused2) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_10215, 9043926896939961941L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    public final void a(long a2, @NotNull g7 polygon, @NotNull class_238 box, @NotNull Color c2, @NotNull Color c1) {
        long j = a ^ a2;
        Object objMethod_23093 = j;
        long j2 = objMethod_23093 ^ 55704089850025L;
        long j3 = objMethod_23093 ^ 32091993688211L;
        long j4 = objMethod_23093 ^ 90057753661053L;
        try {
            Intrinsics.checkNotNullParameter(polygon, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17435, 7502806652567652190L ^ j) /* invoke-custom */);
            Intrinsics.checkNotNullParameter(box, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26027, 7805299897558673129L ^ j) /* invoke-custom */);
            Intrinsics.checkNotNullParameter(c2, "c");
            Intrinsics.checkNotNullParameter(c1, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3667, 7311472730842483992L ^ j) /* invoke-custom */);
            objMethod_23093 = zi.v.K().method_23093(box);
            if (objMethod_23093 == 0) {
                return;
            }
            class_4184 class_4184Var = zf.F(j2).method_1561().field_4686;
            Intrinsics.checkNotNull(class_4184Var);
            class_243 class_243VarMethod_71156 = class_4184Var.method_71156();
            Intrinsics.checkNotNullExpressionValue(class_243VarMethod_71156, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24485, 4839839475524607209L ^ j) /* invoke-custom */);
            float fMethod_10216 = (float) (box.field_1323 - class_243VarMethod_71156.method_10216());
            float fMethod_10214 = (float) (box.field_1322 - class_243VarMethod_71156.method_10214());
            float fMethod_10215 = (float) (box.field_1321 - class_243VarMethod_71156.method_10215());
            float fMethod_102162 = (float) (box.field_1320 - class_243VarMethod_71156.method_10216());
            float fMethod_102142 = (float) (box.field_1325 - class_243VarMethod_71156.method_10214());
            float fMethod_102152 = (float) (box.field_1324 - class_243VarMethod_71156.method_10215());
            polygon.G(fMethod_10216, j3, fMethod_10214, fMethod_10215).n(c2, j4);
            polygon.G(fMethod_10216, j3, fMethod_102142, fMethod_10215).n(c1, j4);
            polygon.G(fMethod_102162, j3, fMethod_102142, fMethod_10215).n(c1, j4);
            polygon.G(fMethod_102162, j3, fMethod_10214, fMethod_10215).n(c2, j4);
            polygon.G(fMethod_102162, j3, fMethod_10214, fMethod_10215).n(c2, j4);
            polygon.G(fMethod_102162, j3, fMethod_102142, fMethod_10215).n(c1, j4);
            polygon.G(fMethod_102162, j3, fMethod_102142, fMethod_102152).n(c1, j4);
            polygon.G(fMethod_102162, j3, fMethod_10214, fMethod_102152).n(c2, j4);
            polygon.G(fMethod_10216, j3, fMethod_10214, fMethod_102152).n(c2, j4);
            polygon.G(fMethod_102162, j3, fMethod_10214, fMethod_102152).n(c2, j4);
            polygon.G(fMethod_102162, j3, fMethod_102142, fMethod_102152).n(c1, j4);
            polygon.G(fMethod_10216, j3, fMethod_102142, fMethod_102152).n(c1, j4);
            polygon.G(fMethod_10216, j3, fMethod_10214, fMethod_10215).n(c2, j4);
            polygon.G(fMethod_10216, j3, fMethod_10214, fMethod_102152).n(c2, j4);
            polygon.G(fMethod_10216, j3, fMethod_102142, fMethod_102152).n(c1, j4);
            polygon.G(fMethod_10216, j3, fMethod_102142, fMethod_10215).n(c1, j4);
            polygon.G(fMethod_10216, j3, fMethod_102142, fMethod_10215).n(c1, j4);
            polygon.G(fMethod_10216, j3, fMethod_102142, fMethod_102152).n(c1, j4);
            polygon.G(fMethod_102162, j3, fMethod_102142, fMethod_102152).n(c1, j4);
            polygon.G(fMethod_102162, j3, fMethod_102142, fMethod_10215).n(c1, j4);
            polygon.G(fMethod_10216, j3, fMethod_10214, fMethod_10215).n(c2, j4);
            polygon.G(fMethod_10216, j3, fMethod_10214, fMethod_102152).n(c2, j4);
            polygon.G(fMethod_102162, j3, fMethod_10214, fMethod_102152).n(c2, j4);
            polygon.G(fMethod_102162, j3, fMethod_10214, fMethod_10215).n(c2, j4);
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_23093, 3248576270513561282L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[PHI: r0 r1
  0x00ac: PHI (r0v16 ??) = (r0v33 ??), (r0v34 ??), (r0v35 ??) binds: [B:14:0x0073, B:16:0x0078, B:21:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x00ac: PHI (r1v12 int) = (r1v11 int), (r1v11 int), (r1v22 int) binds: [B:14:0x0073, B:16:0x0078, B:21:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v10, types: [net.minecraft.class_276] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [net.minecraft.class_6364] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void z(long r8) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.cz.z(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[PHI: r0 r1
  0x00ac: PHI (r0v16 ??) = (r0v33 ??), (r0v34 ??), (r0v35 ??) binds: [B:14:0x0073, B:16:0x0078, B:21:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x00ac: PHI (r1v12 int) = (r1v11 int), (r1v11 int), (r1v22 int) binds: [B:14:0x0073, B:16:0x0078, B:21:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v10, types: [net.minecraft.class_276] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v9, types: [net.minecraft.class_6364] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void X(long r8) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.cz.X(long):void");
    }

    static {
        int i2;
        long j = a ^ 114148618066593L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[13];
        int i4 = 0;
        String str = "\u001a¤\u0013§¦©\u009er&'\u009aâ ¼B§Ê\u0004\u00adÉ9B¯48U\u008eBÙJ\u0089~\u0098§>iqI'D\u0016\u0084>^\u001f`KØ±+\u0000)>'øOÞÂ»þ\u0082éO,én<*äÀm9\u0010\u009f\u0090\u0016\u009d¯yH\u0090\u0010øÞÇ`:ûs\u009c\u00895xu¾ÜÜS Í\u001e\u007f\u0090\u0089\u0093]\u0087n\u0093Îµ\rÀÇ\u0091W\u0092g-\u0098\u0089GÞ\u0000Á³uý¯K\u0018\u0018^R\u001e3ç\u0096³ãä\u007fä±\b!\r\u0083Í\u008f\u0084\u0012÷À5¤\u0010¾\"ëN\u0015KN\u0016¸\u0011\u0083Ø\u001c9ª\u001a\u0010\u0093\u008dæù\u000f\u009fOÉ\u009d\u0003§Íx½\u0001\u000e\u0018ûì\u0082\u0090÷\u0014¡\u008aºI!>\u0091WkX\u0013ï?\u0094»\u0015\u0004r8|)±rÑ½}¸\u0099\u001f²¢³T?öKpß)ò=\\¦á843\u0098}\u0002È\u009b\u009cfÊCh\u0081#ÐÉNó(\u0090$à{\u001e\u0098¤×âÔK ´±ý\u0089¦5ÈØõ¢\u0086¯'\u009dàÆÁí ü+\u001cË¡¦\u0016s\u001cÀ\u0092k\u001e\u0010ù\u0011ïéSÑKã\u0019¬uAôÓì\u001f";
        int length = "\u001a¤\u0013§¦©\u009er&'\u009aâ ¼B§Ê\u0004\u00adÉ9B¯48U\u008eBÙJ\u0089~\u0098§>iqI'D\u0016\u0084>^\u001f`KØ±+\u0000)>'øOÞÂ»þ\u0082éO,én<*äÀm9\u0010\u009f\u0090\u0016\u009d¯yH\u0090\u0010øÞÇ`:ûs\u009c\u00895xu¾ÜÜS Í\u001e\u007f\u0090\u0089\u0093]\u0087n\u0093Îµ\rÀÇ\u0091W\u0092g-\u0098\u0089GÞ\u0000Á³uý¯K\u0018\u0018^R\u001e3ç\u0096³ãä\u007fä±\b!\r\u0083Í\u008f\u0084\u0012÷À5¤\u0010¾\"ëN\u0015KN\u0016¸\u0011\u0083Ø\u001c9ª\u001a\u0010\u0093\u008dæù\u000f\u009fOÉ\u009d\u0003§Íx½\u0001\u000e\u0018ûì\u0082\u0090÷\u0014¡\u008aºI!>\u0091WkX\u0013ï?\u0094»\u0015\u0004r8|)±rÑ½}¸\u0099\u001f²¢³T?öKpß)ò=\\¦á843\u0098}\u0002È\u009b\u009cfÊCh\u0081#ÐÉNó(\u0090$à{\u001e\u0098¤×âÔK ´±ý\u0089¦5ÈØõ¢\u0086¯'\u009dàÆÁí ü+\u001cË¡¦\u0016s\u001cÀ\u0092k\u001e\u0010ù\u0011ïéSÑKã\u0019¬uAôÓì\u001f".length();
        char cCharAt = 24;
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
                            c = new String[13];
                            i = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[19];
                            int i10 = 0;
                            String str3 = "\u0011\u008b!O_ó*eÎ\u0098\u0011Y%B@\u001aÉY\u0005%§üZPÏº\"d\u0090î²6\f\u0088ÈiÇUt\u0095\u0007£6MDì\u009e\u0099z>biØ\u001eT\u0098¬ßþpzôF\u0095r\u008b\u0092D{·ZBÕÝ\"\u009d¯·aÈ\u008eð)\u007fË\u008e\u0011uðµr÷WC©4Òe¼`\u008e1¯©\u0014KsJ(¢\u009fr~æò\u0081!O\u009b¨uñY\u0088\u0017ú\u0093^Xæ4\u001f´wçä";
                            int length2 = "\u0011\u008b!O_ó*eÎ\u0098\u0011Y%B@\u001aÉY\u0005%§üZPÏº\"d\u0090î²6\f\u0088ÈiÇUt\u0095\u0007£6MDì\u009e\u0099z>biØ\u001eT\u0098¬ßþpzôF\u0095r\u008b\u0092D{·ZBÕÝ\"\u009d¯·aÈ\u008eð)\u007fË\u008e\u0011uðµr÷WC©4Òe¼`\u008e1¯©\u0014KsJ(¢\u009fr~æò\u0081!O\u009b¨uñY\u0088\u0017ú\u0093^Xæ4\u001f´wçä".length();
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
                                                h = new Integer[19];
                                                H = new cz();
                                                u = new ArrayList();
                                                Y = new ArrayList();
                                                F = new ArrayList();
                                                k = new ArrayList();
                                                n = new ArrayList();
                                                M = new ArrayList();
                                                K = new ArrayList();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i11 >= length2) {
                                                str3 = "SÿlIÖ*\u008bÎA\u0003,\u001dÞ>ªr";
                                                length2 = "SÿlIÖ*\u008bÎA\u0003,\u001dÞ>ªr".length();
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
                        str = "\u0080õµ\u0090Tî\u008a\u0010Ç\u0098Cê[{0:\u0018=É2ËY\u0091wõÐ¦\u0093¶n4ä¸\u0081\u0015µ®ÇÆÜ\u0011";
                        length = "\u0080õµ\u0090Tî\u008a\u0010Ç\u0098Cê[{0:\u0018=É2ËY\u0091wõÐ¦\u0093¶n4ä¸\u0081\u0015µ®ÇÆÜ\u0011".length();
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

    private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException noWhenBranchMatchedException) {
        return noWhenBranchMatchedException;
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 28320;
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
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/cz", e2);
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
            java.lang.String r1 = "su/catlean/cz"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.cz.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 10170;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/cz", e2);
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
            java.lang.String r1 = "su/catlean/cz"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.cz.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
