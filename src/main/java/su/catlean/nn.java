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
import net.minecraft.class_10014;
import net.minecraft.class_10055;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_591;
import net.minecraft.class_7833;
import net.minecraft.class_892;
import net.minecraft.class_9946;
import org.jetbrains.annotations.NotNull;
import su.catlean.mixins.accessors.EndCrystalRendererAccessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/nn.class */
public final class nn {

    @NotNull
    public static final nn x;
    private static boolean q;
    private static final long a = yz.a(5495117789964301002L, -1040850817570672223L, MethodHandles.lookup().lookupClass()).a(213472768619827L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    private nn() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x01fe, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ff  */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v113, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v114, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v119, types: [int] */
    /* JADX WARN: Type inference failed for: r0v120 */
    /* JADX WARN: Type inference failed for: r0v121 */
    /* JADX WARN: Type inference failed for: r0v122 */
    /* JADX WARN: Type inference failed for: r0v126 */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v133 */
    /* JADX WARN: Type inference failed for: r0v142 */
    /* JADX WARN: Type inference failed for: r0v145 */
    /* JADX WARN: Type inference failed for: r0v146, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v148, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v149, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v151, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v160 */
    /* JADX WARN: Type inference failed for: r0v161 */
    /* JADX WARN: Type inference failed for: r0v162 */
    /* JADX WARN: Type inference failed for: r0v163 */
    /* JADX WARN: Type inference failed for: r0v164 */
    /* JADX WARN: Type inference failed for: r0v165 */
    /* JADX WARN: Type inference failed for: r0v166 */
    /* JADX WARN: Type inference failed for: r0v167 */
    /* JADX WARN: Type inference failed for: r0v168 */
    /* JADX WARN: Type inference failed for: r0v169 */
    /* JADX WARN: Type inference failed for: r0v20, types: [net.minecraft.class_1297] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [net.minecraft.class_1297] */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v88 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v81 */
    /* JADX WARN: Type inference failed for: r61v3 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(int r16, @org.jetbrains.annotations.NotNull net.minecraft.class_4587 r17, byte r18, @org.jetbrains.annotations.NotNull su.catlean.s8 r19, int r20, @org.jetbrains.annotations.NotNull java.awt.Color r21, @org.jetbrains.annotations.NotNull java.awt.Color r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 1325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.nn.w(int, net.minecraft.class_4587, byte, su.catlean.s8, int, java.awt.Color, java.awt.Color, int, int):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:64:0x0277
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final void Z(@org.jetbrains.annotations.NotNull net.minecraft.class_4587 r17, @org.jetbrains.annotations.NotNull su.catlean.s8 r18, @org.jetbrains.annotations.NotNull java.awt.Color r19, @org.jetbrains.annotations.NotNull java.awt.Color r20, @org.jetbrains.annotations.NotNull java.awt.Color r21, @org.jetbrains.annotations.NotNull java.awt.Color r22, long r23, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 1368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.nn.Z(net.minecraft.class_4587, su.catlean.s8, java.awt.Color, java.awt.Color, java.awt.Color, java.awt.Color, long, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x0140, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0315  */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v108, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v110, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v112, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v114, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v117, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v118 */
    /* JADX WARN: Type inference failed for: r0v122 */
    /* JADX WARN: Type inference failed for: r0v126, types: [net.minecraft.class_5498] */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v132, types: [int] */
    /* JADX WARN: Type inference failed for: r0v133 */
    /* JADX WARN: Type inference failed for: r0v134 */
    /* JADX WARN: Type inference failed for: r0v145 */
    /* JADX WARN: Type inference failed for: r0v146 */
    /* JADX WARN: Type inference failed for: r0v147 */
    /* JADX WARN: Type inference failed for: r0v148 */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v150 */
    /* JADX WARN: Type inference failed for: r0v151 */
    /* JADX WARN: Type inference failed for: r0v152 */
    /* JADX WARN: Type inference failed for: r0v153 */
    /* JADX WARN: Type inference failed for: r0v154 */
    /* JADX WARN: Type inference failed for: r0v155 */
    /* JADX WARN: Type inference failed for: r0v156 */
    /* JADX WARN: Type inference failed for: r0v157 */
    /* JADX WARN: Type inference failed for: r0v17, types: [net.minecraft.class_1297] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v41, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r1v31, types: [net.minecraft.class_1297] */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v89 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r2v72 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(@org.jetbrains.annotations.NotNull net.minecraft.class_4587 r16, @org.jetbrains.annotations.NotNull su.catlean.s8 r17, @org.jetbrains.annotations.NotNull java.awt.Color r18, @org.jetbrains.annotations.NotNull java.awt.Color r19, long r20, @org.jetbrains.annotations.NotNull java.util.ArrayList r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 1180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.nn.B(net.minecraft.class_4587, su.catlean.s8, java.awt.Color, java.awt.Color, long, java.util.ArrayList, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01f6  */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void Q(short r10, net.minecraft.class_4587 r11, net.minecraft.class_1297 r12, java.awt.Color r13, su.catlean.s8 r14, su.catlean.g7 r15, float r16, long r17) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.nn.Q(short, net.minecraft.class_4587, net.minecraft.class_1297, java.awt.Color, su.catlean.s8, su.catlean.g7, float, long):void");
    }

    static void z(nn nnVar, class_4587 class_4587Var, class_1297 class_1297Var, Color color, s8 s8Var, g7 g7Var, float f2, int i, Object obj, long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 47566243286211L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j3 << 32) >>> 48);
        int i4 = (int) ((j3 << 48) >>> 48);
        int i5 = (int) (j2 >>> 48);
        long j4 = ((j2 ^ 103221622572685L) << 16) >>> 16;
        if ((i & (int) b(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4847, 847170542697446013L ^ j2) /* invoke-custom */) != 0) {
            f2 = zi.v.n(i2, (char) i3, i4);
        }
        nnVar.Q((short) i5, class_4587Var, class_1297Var, color, s8Var, g7Var, f2, j4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, su.catlean._g[]] */
    public final void h(long a2, @NotNull class_4587 stack, @NotNull class_591 model, @NotNull class_10055 state, @NotNull class_243 pos, @NotNull Color color, @NotNull s8 mode, @NotNull g7 polygon) {
        long j = a ^ a2;
        long j2 = j ^ 52098759450502L;
        long j3 = j >>> 16;
        int i = (int) (((j ^ 60043366368988L) << 48) >>> 48);
        Intrinsics.checkNotNullParameter(stack, (String) a(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21144, 5996103343499980777L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(model, (String) a(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(32073, 2992402957900939304L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(state, (String) a(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20029, 7666396013267923805L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(pos, (String) a(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7612, 1139639903367356628L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(color, (String) a(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20234, 4991177401011548792L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(mode, (String) a(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10994, 7690369327058605961L ^ j) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(polygon, (String) a(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24942, 3940533921984060417L ^ j) /* invoke-custom */);
        a aVar = new a(j ^ 99752721933437L, polygon, mode, color);
        stack.method_22903();
        class_4184 class_4184Var = zf.F(j2).method_1561().field_4686;
        Intrinsics.checkNotNull(class_4184Var);
        class_243 class_243VarMethod_71156 = class_4184Var.method_71156();
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_71156, (String) a(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25758, 151993774526863849L ^ j) /* invoke-custom */);
        double d2 = pos.field_1352 - class_243VarMethod_71156.field_1352;
        double d3 = pos.field_1351 - class_243VarMethod_71156.field_1351;
        double d4 = pos.field_1350 - class_243VarMethod_71156.field_1350;
        class_4184 class_4184VarMethod_19418 = zf.F(j2).field_1773.method_19418();
        Intrinsics.checkNotNullExpressionValue(class_4184VarMethod_19418, (String) a(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22936, 1289639335477093611L ^ j) /* invoke-custom */);
        stack.method_22907(class_7833.field_40716.rotationDegrees((-class_4184VarMethod_19418.method_19330()) + 180.0f));
        Object obj = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(258943050805360387L, j) /* invoke-custom */;
        stack.method_22907(class_7833.field_40714.rotationDegrees(-class_4184VarMethod_19418.method_19329()));
        stack.method_46416((float) d2, (float) d3, (float) d4);
        stack.method_22905(state.field_53453, state.field_53453, state.field_53453);
        kf.G.g(j3, state, (short) i, stack, state.field_53446);
        stack.method_22905(-1.0f, -1.0f, 1.0f);
        stack.method_22905(0.9375f, 0.9375f, 0.9375f);
        try {
            stack.method_46416(0.0f, -1.501f, 0.0f);
            model.method_62110(state);
            model.field_3483.field_3665 = false;
            model.field_3484.field_3665 = false;
            model.field_3486.field_3665 = false;
            model.field_3482.field_3665 = false;
            model.field_3479.field_3665 = false;
            model.field_3394.field_3665 = false;
            model.method_60879(stack, aVar, (int) b(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29778, 4876313219090159577L ^ j) /* invoke-custom */, 0);
            stack.method_22909();
            if (obj == 0) {
                obj = new _g[2];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 281620884326255061L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 238054527204816429L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    private final void I(class_4587 class_4587Var, class_1297 class_1297Var, Color color, s8 s8Var, long j, g7 g7Var, float f2) {
        long j2 = a ^ j;
        Object obj = j2;
        long j3 = obj ^ 71892177972536L;
        long j4 = obj ^ 92400764908907L;
        int i = (int) (obj >>> 32);
        int i2 = (int) ((j4 << 32) >>> 48);
        int i3 = (int) ((j4 << 48) >>> 48);
        long j5 = obj ^ 57973438699203L;
        try {
            obj = class_1297Var instanceof class_1511;
            if (obj == 0) {
                return;
            }
            a aVar = new a(j5, g7Var, s8Var, color);
            class_892 class_892VarMethod_3953 = zf.F(j3).method_1561().method_3953(class_1297Var);
            Intrinsics.checkNotNullExpressionValue(class_892VarMethod_3953, (String) a(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16554, 8030692521740930914L ^ j2) /* invoke-custom */);
            class_9946 model = ((EndCrystalRendererAccessor) class_892VarMethod_3953).getModel();
            class_10014 class_10014VarMethod_62425 = class_892VarMethod_3953.method_62425(class_1297Var, zi.v.n(i, (char) i2, i3));
            Intrinsics.checkNotNullExpressionValue(class_10014VarMethod_62425, (String) a(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4861, 1224880373109316906L ^ j2) /* invoke-custom */);
            class_10014 class_10014Var = class_10014VarMethod_62425;
            class_4184 class_4184Var = zf.F(j3).method_1561().field_4686;
            Intrinsics.checkNotNull(class_4184Var);
            class_243 class_243VarMethod_71156 = class_4184Var.method_71156();
            Intrinsics.checkNotNullExpressionValue(class_243VarMethod_71156, (String) a(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21101, 5863835783818845614L ^ j2) /* invoke-custom */);
            double dMethod_23317 = ((class_1511) class_1297Var).method_23317() - class_243VarMethod_71156.field_1352;
            double dMethod_23318 = ((class_1511) class_1297Var).method_23318() - class_243VarMethod_71156.field_1351;
            double dMethod_23321 = ((class_1511) class_1297Var).method_23321() - class_243VarMethod_71156.field_1350;
            class_4587Var.method_22903();
            class_4184 class_4184VarMethod_19418 = zf.F(j3).field_1773.method_19418();
            Intrinsics.checkNotNullExpressionValue(class_4184VarMethod_19418, (String) a(MethodHandles.lookup(), "l", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16405, 2150050984305233876L ^ j2) /* invoke-custom */);
            class_4587Var.method_22907(class_7833.field_40716.rotationDegrees((-class_4184VarMethod_19418.method_19330()) + 180.0f));
            class_4587Var.method_22907(class_7833.field_40714.rotationDegrees(-class_4184VarMethod_19418.method_19329()));
            class_4587Var.method_22904(dMethod_23317, dMethod_23318, dMethod_23321);
            class_4587Var.method_22905(f2, f2, f2);
            class_4587Var.method_22905(2.0f, 2.0f, 2.0f);
            class_4587Var.method_46416(0.0f, -0.5f, 0.0f);
            model.method_62083(class_10014Var);
            model.method_60879(class_4587Var, aVar, (int) b(MethodHandles.lookup(), "n", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23443, 7215780038426692267L ^ j2) /* invoke-custom */, 0);
            class_4587Var.method_22909();
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 3599452886146303123L, j2) /* invoke-custom */;
        }
    }

    static {
        int i;
        long j = a ^ 133055295838957L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, -6527723093957517531L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[29];
        int i3 = 0;
        String str = "»²è4yËöæ\u0017¶Å\u0000\nâ\u001fØ\u001fë\u0013w\u0005/\u009c¥¢î]\u0016:\u0012ðêï\u0099ÿ\røLay\u0010Ø\u0006-¯JpJ@i¿èH\u008aiË>\u0010Ç\u0012\u00981\u0003£ñÒ\u0004x{¦òÞ×\u0013 \u0090e\nÌ.\u0094ã\u000føIÞ\u0017H\u0097\u001cÜ\u009dÈÚ³\u0091ü¡Ìö\u0004\t\u0093ú\u0094PG +\n\u009f\u0087¢6é0¢MÕTÛh\u0001 Ð\f§îßm\u0080Ïchr\u0098]\u0015¡Ý(Ì\u009f7©,M\nLl3Mño_eôÆc6\u0084%¬Zâ½Ñ'ùÓÈ0Kb~\u0012Ê\u0098Y!±\u0018µFf{ÂEåopËÐ¾U\u0001±g/ï?¹\f\u0094\u0094¡8DåÐÎ6FÂ|P\u0095ÖA}çìØs\u0094º¨\u008dé^\u00adúS»ð\u009b³î\u0097\u007f\f¶ÂYñTz\u0018\u0096\u0084@ï\u0004\u0092\u001bÃGùJR÷2S\u0010Ít\u0088\u0097G\u008e\u008cz\u0096;-ûÂ\u0018¾  )~\u0097¦r\u0081«Ï8\tÍP\u0017\u0011\râ¨@\u0010g«\u009d\u001a\u0017iJr\u009f¸É«.\u009a\u008býî\u0092w2+x\u008cÑBØ¨Ò\rR=\u0083ìQíã®4.Ûc}aÖ±¬\u0092)¼¼Ñì\u0002«[\tàZÈEÃ\u00186z\u0001¦¥\u0004<$\u0097øTìàÞ\u0002X\u0088B7è9/³\u0012\u001dÛ\\Ïa[¶\u000b]\u008b\u009d\u001bZ\u001eJÿj\u0019\u008b\\À>äú©\u000f<\u001f=:5½{vMyÐ\u0007Ý¼Nà,¡Ù\u0081Ê0\t'ú\u0081»iÍ \u0090\u0081\u0016\u0012%\u0095ÊÇÕ^0.qÞ´jJÚæ`\u0007¬éT\tL\u0090¦üÎµ\u008d ô>\u0018\u0080\u0081J1\f1ÄÏà\u001bM\u008dþ\u0015\u0004'EÀ\u008fÏ\u0088\u008dö\u0093búH?^(0\u0087¿|õ\u0094¨Ôc\u008aÜ¥RÐM%Ó8)]\u0005ÇO\u0082e£\u0011>\u009e\u0091Û\u0092 ö±'ünêa |áeN/\u0098ììjØ¿ó\u008cc\u0092ÂmP¾\u0083°D±¿Ü\u0094ý]¶'q\u0082\u0018\rC\u001fâ Âp\u0088°d)\u0002{t|\u0015^\u001b3¯;Æø=\u0010\u007fàM\nGÕ«\u001c=\u0003¿\bÑìµ\u0095 hN.çS£á;®c¨\u001bú\u0004;Ä»\u000bþà¸¹\u0080ßåp\u0091\u0094í\u0012³\u0015 bSï0EI 4ùË?Ã\u00826iç·\u0012Çá\u0006Zí\u0018ð\u0088\u000eK\f`{»\u0010hÆ~\t\b\b\u0005\u0005¨\u0091¬|\u0091\u0095A¶\u0010\u0091>a¹\u008bC³&LÌJ<0ò\u0011^ ñ\u008a\u0015xksÚ7ntÍ»2\u0088¤\u0015·¯ \u008f\u00804ÉBCÍ\u0004.\u0095ËrÕ\u0010\u0004#0\u001dýPÆ×[îk\u0006°×\u0004S0\u0083\u0092Jªa\u0019ÑÊ\u008b\u0019NÇGÀl\u0097Ø¥UÁ)¬\u0019°»YÑ!\u0088;ª\u001fK\u008c-T\u0012\u0099ëCª\u008bÆ\u0015Á,Br\u0010àå\u008d8¾òæò\u0012ÐÆx6\u0095°ÝĀ©õµÀô\u008e´AÚ¯õL\"¸^@4z¸\u000bþ¡Ò\u0017Ã1°!¿êC¥3v³¨\u008eùl\u008acÖ©ä\u0011\u001bþIìë=\tA\u001a±¨N ¼Íã\u0080nÙ±\u008d(\u000fHdÑµ:\u000bú¥=×\u0002Lx%â\u0003ãy\u001a\u000e$|UE\n`Ð°KtD»ô\u008d\u0002\u0094År{\u0085ï\u008bý\u009dÐÔ\u007f\u0004J\u00adG) õnÞ\u0096sÓ\u0006¶\u0081ë\u0011¯\t\fÄD¬Ò\u00069zô$6\u000f±\u0096)\u0097µª\u008eY\u0088\u0015Î\u0088\"\u0005S¨Ì³ä±'Õ\u007fç\u0011\t%\u007fóp3O0\u0097#~\u009fl\u001d\u001f|ÃÓErZ½Ó\u0099|\u0088\\\u0007\u0007ük³û?{ü5H&ò\u0092¾æê,[_\u0082\nëL_Ä.*\u0089\t\u0080¥\u0088ZC¬¯±~uÎ\u001d\u001aúÒ¥4ÙÏÔ\u0095\u0013¨R\u0082Ñ2z ç%¿\u0015£\u009b8Úñí\u0083\u009b-\u001fÏqËK\u009d>¦\u00927I\u0003\u0016]gõ\u009a²\u008d(ÜÂx\u001d\u0019·èËët)ï\u008aW5\u001aõMà\u0089Ã\u009aú/\u0019\u0099\u008f¨|Ú¦¾\u0012\u009c;0\u001d\fRÛ";
        int length = "»²è4yËöæ\u0017¶Å\u0000\nâ\u001fØ\u001fë\u0013w\u0005/\u009c¥¢î]\u0016:\u0012ðêï\u0099ÿ\røLay\u0010Ø\u0006-¯JpJ@i¿èH\u008aiË>\u0010Ç\u0012\u00981\u0003£ñÒ\u0004x{¦òÞ×\u0013 \u0090e\nÌ.\u0094ã\u000føIÞ\u0017H\u0097\u001cÜ\u009dÈÚ³\u0091ü¡Ìö\u0004\t\u0093ú\u0094PG +\n\u009f\u0087¢6é0¢MÕTÛh\u0001 Ð\f§îßm\u0080Ïchr\u0098]\u0015¡Ý(Ì\u009f7©,M\nLl3Mño_eôÆc6\u0084%¬Zâ½Ñ'ùÓÈ0Kb~\u0012Ê\u0098Y!±\u0018µFf{ÂEåopËÐ¾U\u0001±g/ï?¹\f\u0094\u0094¡8DåÐÎ6FÂ|P\u0095ÖA}çìØs\u0094º¨\u008dé^\u00adúS»ð\u009b³î\u0097\u007f\f¶ÂYñTz\u0018\u0096\u0084@ï\u0004\u0092\u001bÃGùJR÷2S\u0010Ít\u0088\u0097G\u008e\u008cz\u0096;-ûÂ\u0018¾  )~\u0097¦r\u0081«Ï8\tÍP\u0017\u0011\râ¨@\u0010g«\u009d\u001a\u0017iJr\u009f¸É«.\u009a\u008býî\u0092w2+x\u008cÑBØ¨Ò\rR=\u0083ìQíã®4.Ûc}aÖ±¬\u0092)¼¼Ñì\u0002«[\tàZÈEÃ\u00186z\u0001¦¥\u0004<$\u0097øTìàÞ\u0002X\u0088B7è9/³\u0012\u001dÛ\\Ïa[¶\u000b]\u008b\u009d\u001bZ\u001eJÿj\u0019\u008b\\À>äú©\u000f<\u001f=:5½{vMyÐ\u0007Ý¼Nà,¡Ù\u0081Ê0\t'ú\u0081»iÍ \u0090\u0081\u0016\u0012%\u0095ÊÇÕ^0.qÞ´jJÚæ`\u0007¬éT\tL\u0090¦üÎµ\u008d ô>\u0018\u0080\u0081J1\f1ÄÏà\u001bM\u008dþ\u0015\u0004'EÀ\u008fÏ\u0088\u008dö\u0093búH?^(0\u0087¿|õ\u0094¨Ôc\u008aÜ¥RÐM%Ó8)]\u0005ÇO\u0082e£\u0011>\u009e\u0091Û\u0092 ö±'ünêa |áeN/\u0098ììjØ¿ó\u008cc\u0092ÂmP¾\u0083°D±¿Ü\u0094ý]¶'q\u0082\u0018\rC\u001fâ Âp\u0088°d)\u0002{t|\u0015^\u001b3¯;Æø=\u0010\u007fàM\nGÕ«\u001c=\u0003¿\bÑìµ\u0095 hN.çS£á;®c¨\u001bú\u0004;Ä»\u000bþà¸¹\u0080ßåp\u0091\u0094í\u0012³\u0015 bSï0EI 4ùË?Ã\u00826iç·\u0012Çá\u0006Zí\u0018ð\u0088\u000eK\f`{»\u0010hÆ~\t\b\b\u0005\u0005¨\u0091¬|\u0091\u0095A¶\u0010\u0091>a¹\u008bC³&LÌJ<0ò\u0011^ ñ\u008a\u0015xksÚ7ntÍ»2\u0088¤\u0015·¯ \u008f\u00804ÉBCÍ\u0004.\u0095ËrÕ\u0010\u0004#0\u001dýPÆ×[îk\u0006°×\u0004S0\u0083\u0092Jªa\u0019ÑÊ\u008b\u0019NÇGÀl\u0097Ø¥UÁ)¬\u0019°»YÑ!\u0088;ª\u001fK\u008c-T\u0012\u0099ëCª\u008bÆ\u0015Á,Br\u0010àå\u008d8¾òæò\u0012ÐÆx6\u0095°ÝĀ©õµÀô\u008e´AÚ¯õL\"¸^@4z¸\u000bþ¡Ò\u0017Ã1°!¿êC¥3v³¨\u008eùl\u008acÖ©ä\u0011\u001bþIìë=\tA\u001a±¨N ¼Íã\u0080nÙ±\u008d(\u000fHdÑµ:\u000bú¥=×\u0002Lx%â\u0003ãy\u001a\u000e$|UE\n`Ð°KtD»ô\u008d\u0002\u0094År{\u0085ï\u008bý\u009dÐÔ\u007f\u0004J\u00adG) õnÞ\u0096sÓ\u0006¶\u0081ë\u0011¯\t\fÄD¬Ò\u00069zô$6\u000f±\u0096)\u0097µª\u008eY\u0088\u0015Î\u0088\"\u0005S¨Ì³ä±'Õ\u007fç\u0011\t%\u007fóp3O0\u0097#~\u009fl\u001d\u001f|ÃÓErZ½Ó\u0099|\u0088\\\u0007\u0007ük³û?{ü5H&ò\u0092¾æê,[_\u0082\nëL_Ä.*\u0089\t\u0080¥\u0088ZC¬¯±~uÎ\u001d\u001aúÒ¥4ÙÏÔ\u0095\u0013¨R\u0082Ñ2z ç%¿\u0015£\u009b8Úñí\u0083\u009b-\u001fÏqËK\u009d>¦\u00927I\u0003\u0016]gõ\u009a²\u008d(ÜÂx\u001d\u0019·èËët)ï\u008aW5\u001aõMà\u0089Ã\u009aú/\u0019\u0099\u008f¨|Ú¦¾\u0012\u009c;0\u001d\fRÛ".length();
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
                        if (i7 < length) {
                            cCharAt = str.charAt(i);
                        } else {
                            b = strArr;
                            c = new String[29];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[11];
                            int i9 = 0;
                            String str3 = "lö\u009e¶\u0011Ò18Á·b#ÔsF¿#\u0081FBÛA\u0092Õ¾r\u0093\u0017%Ðs\u00947\u009f\u0000&ÈH»¼1Àùòk\u001c\u0095\u000b}òUñ#ð?B\u0010`\u0012\u0015åÃ\u0090M $ícs/\t\u009b";
                            int length2 = "lö\u009e¶\u0011Ò18Á·b#ÔsF¿#\u0081FBÛA\u0092Õ¾r\u0093\u0017%Ðs\u00947\u009f\u0000&ÈH»¼1Àùòk\u001c\u0095\u000b}òUñ#ð?B\u0010`\u0012\u0015åÃ\u0090M $ícs/\t\u009b".length();
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
                                                f = new Integer[11];
                                                x = new nn();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i10 >= length2) {
                                                str3 = "Ñ¾ÓIN\u0095EroXû°òly\u0000";
                                                length2 = "Ñ¾ÓIN\u0095EroXû°òly\u0000".length();
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
                        str = "\u0015\u0080êÈ\u0080\u001dP\u00074Ë\u009cw^\"n\u0080\u0010z\u000b\u001c\rßko±e\u000b'=ìo*ë";
                        length = "\u0015\u0080êÈ\u0080\u001dP\u00074Ë\u009cw^\"n\u0080\u0010z\u000b\u001c\rßko±e\u000b'=ìo*ë".length();
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

    public static void B(boolean z) {
        q = z;
    }

    public static boolean J() {
        return q;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean v() {
        return !J();
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 32700;
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
                throw new RuntimeException("su/catlean/nn", e2);
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
            r1 = 2
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
            java.lang.String r1 = "su/catlean/nn"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.nn.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 24897;
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
                    throw new RuntimeException("su/catlean/nn", e2);
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
            r1 = 2
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
            java.lang.String r1 = "su/catlean/nn"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.nn.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
