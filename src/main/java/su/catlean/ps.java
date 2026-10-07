package su.catlean;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1799;
import net.minecraft.class_276;
import net.minecraft.class_290;
import net.minecraft.class_308;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_6364;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import su.catlean.api.event.GofraState;
import su.catlean.mixins.accessors.GameRendererAccessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ps.class */
public final class ps extends gf {

    @NotNull
    public static final ps b = null;

    @Nullable
    private static class_6364 a;
    private static boolean I;
    private static long c;
    private static final long f = 0;
    private static final String[] g = null;
    private static final String[] h = null;
    private static final Map i = null;
    private static final long[] k = null;
    private static final Integer[] l = null;
    private static final Map m = null;
    private static final long n = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    private ps(long j) {
        long j2 = f ^ j;
        super((char) (j2 >>> 48), (int) (((j2 ^ 70039035886126L) << 16) >>> 32), (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17150, 4003030041659312281L ^ j2) /* invoke-custom */, (char) ((r1 << 48) >>> 48));
    }

    @Nullable
    public final class_6364 k() {
        return a;
    }

    public final void F(@Nullable class_6364 class_6364Var) {
        a = class_6364Var;
    }

    public final boolean a() {
        return I;
    }

    public final void b(boolean z) {
        I = z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x025b: INVOKE_CUSTOM (r-1 I:int), (r0 I:long)
         call-site: 
          {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ps;->d(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
          {STRING: "n"}
          {METHOD_TYPE: (I, J)I}
        
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @Override // su.catlean.gf
    public void h(long r18, @org.jetbrains.annotations.NotNull net.minecraft.class_332 r20) {
        /*
            Method dump skipped, instruction units count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ps.h(long, net.minecraft.class_332):void");
    }

    @Override // su.catlean.gf
    public void H(@NotNull class_332 context, long a2) throws Throwable {
        Intrinsics.checkNotNullParameter(context, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31928, 2823044793650176589L ^ a2) /* invoke-custom */);
        j(a2 ^ 99437811927052L);
        L(context, a2 ^ 96852611647315L, p(a2 ^ 98664999447709L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v64, types: [int, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    private final void t(class_332 class_332Var, long j, float f2) {
        ?? r0;
        boolean z;
        ?? r02;
        long j2 = f ^ j;
        long j3 = j2 ^ 130835104867013L;
        long j4 = j2 ^ 30507812013160L;
        long j5 = j2 ^ 134362771879061L;
        long j6 = j2 ^ 94952638196963L;
        ?? r03 = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-126992162813859955L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    r03 = ((zf.A() - c) > n ? 1 : ((zf.A() - c) == n ? 0 : -1));
                    ?? r04 = r03;
                    if (r03 != 0) {
                        I = r04;
                        r0 = 3532;
                        CommandEncoder commandEncoderCreateCommandEncoder = RenderSystem.getDevice().createCommandEncoder();
                        class_6364 class_6364Var = a;
                        Intrinsics.checkNotNull(class_6364Var);
                        GpuTexture gpuTextureMethod_30277 = class_6364Var.method_30277();
                        Intrinsics.checkNotNull(gpuTextureMethod_30277);
                        class_6364 class_6364Var2 = a;
                        Intrinsics.checkNotNull(class_6364Var2);
                        GpuTexture gpuTextureMethod_30278 = class_6364Var2.method_30278();
                        Intrinsics.checkNotNull(gpuTextureMethod_30278);
                        commandEncoderCreateCommandEncoder.clearColorAndDepthTextures(gpuTextureMethod_30277, 0, gpuTextureMethod_30278, 1.0d);
                    } else if (r03 < 0) {
                        boolean zAreEqual = Intrinsics.areEqual(w8.T.q(), this);
                        r0 = zAreEqual;
                        if (j2 > 0) {
                            r04 = zAreEqual;
                            if (r03 == 0) {
                                if (!zAreEqual) {
                                    return;
                                }
                                c = zf.A();
                                GofraState.INSTANCE.setModifyBuffer(true);
                                r04 = 1;
                            }
                            I = r04;
                            r0 = 3532;
                            CommandEncoder commandEncoderCreateCommandEncoder2 = RenderSystem.getDevice().createCommandEncoder();
                            class_6364 class_6364Var3 = a;
                            Intrinsics.checkNotNull(class_6364Var3);
                            GpuTexture gpuTextureMethod_302772 = class_6364Var3.method_30277();
                            Intrinsics.checkNotNull(gpuTextureMethod_302772);
                            class_6364 class_6364Var22 = a;
                            Intrinsics.checkNotNull(class_6364Var22);
                            GpuTexture gpuTextureMethod_302782 = class_6364Var22.method_30278();
                            Intrinsics.checkNotNull(gpuTextureMethod_302782);
                            commandEncoderCreateCommandEncoder2.clearColorAndDepthTextures(gpuTextureMethod_302772, 0, gpuTextureMethod_302782, 1.0d);
                        }
                    } else {
                        c = zf.A();
                        GofraState.INSTANCE.setModifyBuffer(true);
                        r04 = 1;
                        I = r04;
                        r0 = 3532;
                        CommandEncoder commandEncoderCreateCommandEncoder22 = RenderSystem.getDevice().createCommandEncoder();
                        class_6364 class_6364Var32 = a;
                        Intrinsics.checkNotNull(class_6364Var32);
                        GpuTexture gpuTextureMethod_3027722 = class_6364Var32.method_30277();
                        Intrinsics.checkNotNull(gpuTextureMethod_3027722);
                        class_6364 class_6364Var222 = a;
                        Intrinsics.checkNotNull(class_6364Var222);
                        GpuTexture gpuTextureMethod_3027822 = class_6364Var222.method_30278();
                        Intrinsics.checkNotNull(gpuTextureMethod_3027822);
                        commandEncoderCreateCommandEncoder22.clearColorAndDepthTextures(gpuTextureMethod_3027722, 0, gpuTextureMethod_3027822, 1.0d);
                    }
                    class_4587 class_4587Var = new class_4587();
                    RenderSystem.backupProjectionMatrix();
                    GameRendererAccessor gameRendererAccessor = zf.F(j3).field_1773;
                    Intrinsics.checkNotNull(gameRendererAccessor, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11735, 7988476116776052886L ^ j2) /* invoke-custom */);
                    RenderSystem.setProjectionMatrix(gameRendererAccessor.getLevelProjectionMatrixBuffer().method_71123(new Matrix4f().identity().setOrtho(0.0f, zf.F(j3).method_22683().method_4486(), zf.F(j3).method_22683().method_4502(), 0.0f, -160.0f, 160.0f)), RenderSystem.getProjectionType());
                    zf.F(j3).field_1773.method_71114().method_71034(class_308.class_11274.field_60026);
                    ?? N = (int) d(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 7939000931965772181L ^ j2) /* invoke-custom */;
                    int i2 = 0;
                    while (i2 < 3) {
                        float fV = b.V(j4) + (i2 * (int) d(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26023, 7836540928256559611L ^ j2) /* invoke-custom */) + (int) d(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30820, 3367737170163291191L ^ j2) /* invoke-custom */;
                        int iN = (int) d(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3532, 7939000931965772181L ^ j2) /* invoke-custom */;
                        if (j2 < 0) {
                            return;
                        }
                        z = false;
                        if (r03 != 0) {
                            break;
                        }
                        int i3 = 0;
                        while (i3 < iN) {
                            class_1799 class_1799VarMethod_5438 = zf.v(j6).method_31548().method_5438(N == true ? 1 : 0 ? 1 : 0);
                            Intrinsics.checkNotNullExpressionValue(class_1799VarMethod_5438, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20379, 4757985544739031768L ^ j2) /* invoke-custom */);
                            class_4587Var.method_22903();
                            class_4587Var.method_46416(f2 + 2.5f + (i3 * (int) d(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14813, 153794838957036936L ^ j2) /* invoke-custom */), fV + 2.5f, 0.0f);
                            class_4587Var.method_22905(0.75f, 0.75f, 1.0f);
                            jl.y.z(j5, class_4587Var, class_1799VarMethod_5438);
                            class_4587Var.method_22909();
                            ?? r05 = (N == true ? 1 : 0 ? 1 : 0) + 1;
                            N = r05;
                            try {
                                i3++;
                                do {
                                    r02 = r03;
                                    if (j2 < 0) {
                                        break;
                                    } else if (r02 != 0) {
                                        break;
                                    } else if (r03 != 0) {
                                    }
                                } while (j2 < 0);
                            } catch (NumberFormatException unused) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r05, -86639878209547665L, j2) /* invoke-custom */;
                            }
                        }
                        i2++;
                        r02 = r03;
                        if (r02 != 0) {
                            break;
                        }
                    }
                    zf.F(j3).field_1773.method_72911().method_73002();
                    zf.F(j3).method_22940().method_23000().method_22993();
                    zf.F(j3).field_1773.method_72910().method_72953();
                    RenderSystem.restoreProjectionMatrix();
                    if (j2 >= 0) {
                        z = false;
                        I = z;
                        GofraState.INSTANCE.setModifyBuffer(false);
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r03, -86639878209547665L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r03, -86639878209547665L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r03, -86639878209547665L, j2) /* invoke-custom */;
        }
    }

    private final void j(long j) {
        long j2 = f ^ j;
        long j3 = j2 ^ 1404232457863L;
        long j4 = j2 ^ 102822249103860L;
        long j5 = j2 ^ 107783694360659L;
        long j6 = j2 ^ 12134239393177L;
        long j7 = j2 ^ 68259916007224L;
        long j8 = j2 ^ 56113834345832L;
        float fMethod_4486 = zf.F(j3).method_22683().method_4486();
        float fMethod_4502 = zf.F(j3).method_22683().method_4502();
        VertexFormat vertexFormat = class_290.field_1575;
        Intrinsics.checkNotNullExpressionValue(vertexFormat, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29500, 538816103658048052L ^ j2) /* invoke-custom */);
        g7 g7Var = new g7(j4, vertexFormat, 0, false, (int) d(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23428, 8401792052032768913L ^ j2) /* invoke-custom */, null);
        g7 g7VarJ = g7.j(g7Var, 0.0f, fMethod_4502, 0.0f, 4, j7, null).j(0.0f, j8, 0.0f);
        Color color = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7458, 6947452951425754151L ^ j2) /* invoke-custom */);
        g7VarJ.n(color, j5);
        g7 g7VarJ2 = g7.j(g7Var, fMethod_4486, fMethod_4502, 0.0f, 4, j7, null).j(1.0f, j8, 0.0f);
        Color color2 = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color2, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22948, 6279463443593388192L ^ j2) /* invoke-custom */);
        g7VarJ2.n(color2, j5);
        g7 g7VarJ3 = g7.j(g7Var, fMethod_4486, 0.0f, 0.0f, 4, j7, null).j(1.0f, j8, 1.0f);
        Color color3 = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color3, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22948, 6279463443593388192L ^ j2) /* invoke-custom */);
        g7VarJ3.n(color3, j5);
        g7 g7VarJ4 = g7.j(g7Var, 0.0f, 0.0f, 0.0f, 4, j7, null).j(0.0f, j8, 1.0f);
        Color color4 = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue(color4, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22948, 6279463443593388192L ^ j2) /* invoke-custom */);
        g7VarJ4.n(color4, j5);
        RenderPipeline renderPipelineO = b6.R.O();
        class_276 class_276VarMethod_1522 = zf.F(j3).method_1522();
        Intrinsics.checkNotNullExpressionValue(class_276VarMethod_1522, (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21052, 4838925888475786037L ^ j2) /* invoke-custom */);
        String strK = (String) b(MethodHandles.lookup(), "k", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18437, 7039245626236858631L ^ j2) /* invoke-custom */;
        class_6364 class_6364Var = a;
        Intrinsics.checkNotNull(class_6364Var);
        GpuTextureView gpuTextureViewMethod_71639 = class_6364Var.method_71639();
        Intrinsics.checkNotNull(gpuTextureViewMethod_71639);
        g7.R(j6, g7Var, renderPipelineO, class_276VarMethod_1522, null, null, null, MapsKt.mapOf(TuplesKt.to(strK, gpuTextureViewMethod_71639)), (int) d(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1358, 7660399718385145181L ^ j2) /* invoke-custom */, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019a A[EDGE_INSN: B:41:0x019a->B:31:0x019a BREAK  A[LOOP:1: B:4:0x006c->B:44:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v31, types: [int, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r40v0 */
    /* JADX WARN: Type inference failed for: r40v1 */
    /* JADX WARN: Type inference failed for: r40v2 */
    /* JADX WARN: Type inference failed for: r40v3, types: [int] */
    /* JADX WARN: Type inference failed for: r40v4, types: [int] */
    /* JADX WARN: Type inference failed for: r40v5 */
    /* JADX WARN: Type inference failed for: r40v6 */
    /* JADX WARN: Type inference failed for: r40v7 */
    /* JADX WARN: Type inference failed for: r40v8 */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0197 -> B:13:0x00c7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void L(net.minecraft.class_332 r17, long r18, float r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ps.L(net.minecraft.class_332, long, float):void");
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 15050;
        if (h[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) i.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                h[i3] = b(((Cipher) objArr[0]).doFinal(g[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/ps", e);
            }
        }
        return h[i3];
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
            java.lang.String r0 = "su/catlean/ps"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ps.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int d(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 21456;
        if (l[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) k[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) m.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    m.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/ps", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            l[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return l[i3].intValue();
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
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
            java.lang.String r0 = "su/catlean/ps"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ps.d(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
