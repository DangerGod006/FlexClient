package su.catlean;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import net.minecraft.class_10017;
import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_1060;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_290;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_591;
import net.minecraft.class_745;
import net.minecraft.class_7833;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/kf.class */
public final class kf extends _g {

    @NotNull
    public static final kf G = null;
    static final KProperty[] j = null;

    @NotNull
    private static final cw u = null;

    @NotNull
    private static final cs K = null;

    @NotNull
    private static final cq m = null;

    @NotNull
    private static final c8 c = null;

    @NotNull
    private static final c8 g = null;

    @NotNull
    private static final cq i = null;

    @NotNull
    private static final ct F = null;

    @NotNull
    private static final Map h = null;

    @NotNull
    private static final ArrayList z = null;

    @NotNull
    private static final bj S = null;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] d = null;
    private static final Map e = null;
    private static final long[] f = null;
    private static final Integer[] k = null;
    private static final Map l = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private kf(byte b2, long j2) {
        long j3 = ((((long) b2) << 56) | ((j2 << 8) >>> 8)) ^ a;
        super((String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18309, 151104026495773960L ^ j3) /* invoke-custom */, jt.z(), null, 4, null, j3 ^ 70989945924969L);
    }

    private final ne T(long j2) {
        return (ne) u.E(this, (a ^ j2) ^ 20500436405970L, j[0]);
    }

    private final Color q(long j2) {
        return (Color) K.E(this, (a ^ j2) ^ 114214922878025L, j[1]);
    }

    private final boolean i(long j2) {
        return ((Boolean) m.E(this, (a ^ j2) ^ 32241560005420L, j[2])).booleanValue();
    }

    private final int n(long j2) {
        return ((Number) c.E(this, (a ^ j2) ^ 46482634714816L, j[3])).intValue();
    }

    private final void x(int i2, long j2) {
        c.b(this, (a ^ j2) ^ 59730835536434L, j[3], Integer.valueOf(i2));
    }

    private final int C(int i2, char c2, int i3) {
        return ((Number) g.E(this, ((((((long) i2) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) i3) << 48) >>> 48)) ^ a) ^ 138883316283628L, j[4])).intValue();
    }

    private final void A(int i2, long j2) {
        g.b(this, (a ^ j2) ^ 22138225784391L, j[4], Integer.valueOf(i2));
    }

    private final boolean w(long j2) {
        return ((Boolean) i.E(this, (a ^ j2) ^ 77498786607273L, j[5])).booleanValue();
    }

    private final float H(long j2, short s) {
        long j3 = ((j2 << 16) | ((((long) s) << 48) >>> 48)) ^ a;
        return ((Number) F.E(this, j3 ^ 79714463306227L, j[(int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29073, 8522817208076462705L ^ j3) /* invoke-custom */])).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02df A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0136 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [net.minecraft.class_2596] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v44, types: [su.catlean.kf] */
    /* JADX WARN: Type inference failed for: r0v45, types: [su.catlean._g] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [su.catlean._g] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [net.minecraft.class_2703] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v78, types: [net.minecraft.class_2703] */
    /* JADX WARN: Type inference failed for: r0v85, types: [net.minecraft.class_2703$class_2705] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void q(su.catlean.api.event.events.network.ReceivePacket r15) {
        /*
            Method dump skipped, instruction units count: 736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kf.q(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    @Override // su.catlean._g
    public void O(long j2) {
        h.clear();
        z.clear();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void L(su.catlean.api.event.events.player.PlayerUpdateEvent r9) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kf.L(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01fb A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v29, types: [su.catlean.nn] */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean.kf] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void K(su.catlean.api.event.events.render.Render3DEvent r14) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kf.K(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x03d0: INVOKE 
          (r-1 I:su.catlean.bj)
          (r0 I:org.joml.Matrix3x2f)
          (r1 I:double)
          (r2 I:double)
          (r3 I:float)
          (r4 I:float)
          (r5 I:java.awt.Color)
          (r6 I:java.awt.Color)
          (r7 I:float)
          (r8 I:int)
          (r9 I:long)
          (r10 I:java.lang.Object)
         STATIC call: su.catlean.bj.p(su.catlean.bj, org.joml.Matrix3x2f, double, double, float, float, java.awt.Color, java.awt.Color, float, int, long, java.lang.Object):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void e(su.catlean.api.event.events.render.Render2DEvent r24) {
        /*
            Method dump skipped, instruction units count: 1061
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kf.e(su.catlean.api.event.events.render.Render2DEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    private final boolean s(class_1657 class_1657Var, long j2) {
        long j3 = a ^ j2;
        Object objContains$default = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6249459457322854053L, j3) /* invoke-custom */;
        try {
            try {
                try {
                    String strName = class_1657Var.method_7334().name();
                    Intrinsics.checkNotNullExpressionValue(strName, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24776, 2349632314214522985L ^ j3) /* invoke-custom */);
                    objContains$default = StringsKt.contains$default((CharSequence) strName, (CharSequence) "-", false, 2, (Object) null);
                    if (objContains$default != 0) {
                        return objContains$default;
                    }
                    if (objContains$default == 0) {
                        String strName2 = class_1657Var.method_7334().name();
                        Intrinsics.checkNotNullExpressionValue(strName2, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27883, 438183036606033004L ^ j3) /* invoke-custom */);
                        boolean zContains$default = StringsKt.contains$default((CharSequence) strName2, (CharSequence) "_", false, 2, (Object) null);
                        if (objContains$default != 0) {
                            return zContains$default;
                        }
                        if (!zContains$default) {
                            return false;
                        }
                    }
                    return true;
                } catch (NoWhenBranchMatchedException unused) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContains$default, 6205325888275186881L, j3) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused2) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContains$default, 6205325888275186881L, j3) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused3) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objContains$default, 6205325888275186881L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v25, types: [su.catlean.kf] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void t(short s, int i2, class_4587 class_4587Var, int i3) {
        long j2 = (((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ a;
        long j3 = j2 >>> 16;
        int i4 = (int) (((j2 ^ 30585964528122L) << 48) >>> 48);
        long j4 = j2 ^ 23994747887776L;
        long j5 = j2 ^ 96743381803975L;
        String[] strArr = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5594077610592648638L, j2) /* invoke-custom */;
        ArrayList<gt> arrayListNewArrayList = Lists.newArrayList(z);
        Intrinsics.checkNotNullExpressionValue(arrayListNewArrayList, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25362, 2351910304189892424L ^ j2) /* invoke-custom */);
        for (gt gtVar : arrayListNewArrayList) {
            Object obj = strArr;
            if (obj != 0) {
                return;
            }
            try {
                try {
                    obj = G;
                    Intrinsics.checkNotNull(gtVar);
                    obj.x(class_4587Var, gtVar, G.w(j4) ? 1.0f - ((zf.A() - gtVar.x()) / (G.H(j3, (short) i4) * 1000.0f)) : Math.max(0.4f, 1.0f - ((zf.A() - gtVar.x()) / 800.0f)), j5);
                    if (strArr != null) {
                        break;
                    }
                } catch (NoWhenBranchMatchedException unused) {
                    obj = (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -5549862688438722522L, j2) /* invoke-custom */;
                    throw obj;
                }
            } catch (NoWhenBranchMatchedException unused2) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -5549862688438722522L, j2) /* invoke-custom */;
            }
        }
        if (i3 >= 0) {
        }
    }

    private final void x(class_4587 class_4587Var, gt gtVar, float f2, long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 98145487610499L;
        long j5 = j3 ^ 6054285426160L;
        int i2 = (int) (j3 >>> 56);
        long j6 = ((j3 ^ 29324764015780L) << 8) >>> 8;
        long j7 = j3 ^ 91313373276573L;
        long j8 = j3 >>> 16;
        int i3 = (int) (((j3 ^ 71170181708761L) << 48) >>> 48);
        int i4 = (int) (((j3 ^ 71224610446768L) << 16) >>> 32);
        class_745 class_745VarG = gtVar.g();
        class_1007 class_1007VarMethod_3953 = zf.F(j4).method_1561().method_3953((class_1297) class_745VarG);
        Intrinsics.checkNotNull(class_1007VarMethod_3953, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24990, 8209623609621563757L ^ j3) /* invoke-custom */);
        class_591 class_591VarMethod_4038 = class_1007VarMethod_3953.method_4038();
        Intrinsics.checkNotNullExpressionValue(class_591VarMethod_4038, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18414, 8612791160857128724L ^ j3) /* invoke-custom */);
        class_591 class_591Var = class_591VarMethod_4038;
        class_10017 class_10017VarMethod_62425 = zf.F(j4).method_1561().method_3953((class_1297) class_745VarG).method_62425((class_1297) class_745VarG, 1.0f);
        Intrinsics.checkNotNull(class_10017VarMethod_62425, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27851, 2980989504792904754L ^ j3) /* invoke-custom */);
        class_10055 class_10055Var = (class_10055) class_10017VarMethod_62425;
        class_1060 class_1060VarMethod_1531 = zf.F(j4).method_1531();
        Intrinsics.checkNotNull(class_745VarG, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28655, 8646081540443850523L ^ j3) /* invoke-custom */);
        GpuTextureView gpuTextureViewMethod_71659 = class_1060VarMethod_1531.method_4619(class_745VarG.method_52814().comp_1626().comp_3627()).method_71659();
        Intrinsics.checkNotNullExpressionValue(gpuTextureViewMethod_71659, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15879, 7276530346718926566L ^ j3) /* invoke-custom */);
        VertexFormat vertexFormat = class_290.field_1575;
        Intrinsics.checkNotNullExpressionValue(vertexFormat, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28455, 1281561173913520112L ^ j3) /* invoke-custom */);
        g7 g7Var = new g7(j5, vertexFormat, (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23215, 7989322862220501877L ^ j3) /* invoke-custom */, false, 4, null);
        sp spVar = new sp(g7Var, jl.y.p(jh.f.t(), (char) (j3 >>> 48), i4, f2, (short) ((r1 << 48) >>> 48)), j3 ^ 98263664860562L);
        class_4587Var.method_22903();
        class_243 class_243VarJ = J((byte) i2, j6, (class_1297) class_745VarG);
        double d2 = class_243VarJ.field_1352;
        class_4184 class_4184Var = zf.F(j4).method_1561().field_4686;
        Intrinsics.checkNotNull(class_4184Var);
        double dMethod_10216 = d2 - class_4184Var.method_71156().method_10216();
        double d3 = class_243VarJ.field_1351;
        class_4184 class_4184Var2 = zf.F(j4).method_1561().field_4686;
        Intrinsics.checkNotNull(class_4184Var2);
        double dMethod_10214 = d3 - class_4184Var2.method_71156().method_10214();
        double d4 = class_243VarJ.field_1350;
        class_4184 class_4184Var3 = zf.F(j4).method_1561().field_4686;
        Intrinsics.checkNotNull(class_4184Var3);
        class_4587Var.method_46416((float) dMethod_10216, (float) dMethod_10214, (float) (d4 - class_4184Var3.method_71156().method_10215()));
        class_4587Var.method_22905(class_10055Var.field_53453, class_10055Var.field_53453, class_10055Var.field_53453);
        g(j8, class_10055Var, (short) i3, class_4587Var, class_10055Var.field_53446);
        class_4587Var.method_22905(-1.0f, -1.0f, 1.0f);
        class_4587Var.method_22905(0.9375f, 0.9375f, 0.9375f);
        class_4587Var.method_46416(0.0f, -1.501f, 0.0f);
        class_591Var.method_62110(class_10055Var);
        class_591Var.method_62100(class_4587Var, spVar, (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20895, 2897783625765447759L ^ j3) /* invoke-custom */, 0, jh.f.t().getRGB());
        g7.R(j7, g7Var, b6.R.J(), null, null, new class_4587().method_23760().method_23761(), null, MapsKt.mapOf(TuplesKt.to((String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30320, 5985182268454428328L ^ j3) /* invoke-custom */, gpuTextureViewMethod_71659)), (int) c(MethodHandles.lookup(), "m", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6662, 1857433082246505438L ^ j3) /* invoke-custom */, null);
        class_4587Var.method_22909();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [net.minecraft.class_4587] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [net.minecraft.class_4587] */
    /* JADX WARN: Type inference failed for: r0v40, types: [int] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    public final void g(long j2, @NotNull class_10055 class_10055Var, short s, @NotNull class_4587 class_4587Var, float f2) {
        long j3 = ((j2 << 16) | ((((long) s) << 48) >>> 48)) ^ a;
        ?? r0 = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6177866342572041636L, j3) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(class_10055Var, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16444, 3613117395977862262L ^ j3) /* invoke-custom */);
        Intrinsics.checkNotNullParameter(class_4587Var, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11504, 8525723868800422069L ^ j3) /* invoke-custom */);
        try {
            try {
                try {
                    r0 = class_10055Var.field_53411;
                    try {
                        if (r0 == 0) {
                            if (r0 != 0) {
                                class_4587Var.method_22907(class_7833.field_40716.rotationDegrees(180.0f - f2));
                                boolean z2 = class_10055Var.field_53459;
                                ?? r02 = z2;
                                if (s > 0) {
                                    r02 = z2;
                                    if (r0 == 0) {
                                        if (!z2) {
                                            class_4587Var.method_22907(class_7833.field_40714.rotationDegrees(class_10055Var.method_64259() * ((-90.0f) - class_10055Var.field_53448)));
                                        }
                                        r02 = class_10055Var.field_53535;
                                    }
                                }
                                if (r02 == 0) {
                                    return;
                                }
                                try {
                                    try {
                                        class_4587Var.method_22907(class_7833.field_40716.rotation(class_10055Var.field_53521));
                                        r02 = r0;
                                        if (r02 == 0) {
                                            return;
                                        } else {
                                            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[1], -6175137923115540368L, j3) /* invoke-custom */;
                                        }
                                    } catch (NoWhenBranchMatchedException unused) {
                                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -6132501861969397704L, j3) /* invoke-custom */;
                                    }
                                } catch (NoWhenBranchMatchedException unused2) {
                                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -6132501861969397704L, j3) /* invoke-custom */;
                                }
                            }
                            r0 = (class_10055Var.field_53403 > 0.0f ? 1 : (class_10055Var.field_53403 == 0.0f ? 0 : -1));
                        }
                        try {
                            if (r0 > 0) {
                                try {
                                    class_4587Var.method_22907(class_7833.field_40716.rotationDegrees(180.0f - f2));
                                    r0 = class_4587Var;
                                    try {
                                        try {
                                            r0.method_22907(class_7833.field_40714.rotationDegrees(class_3532.method_16439(class_10055Var.field_53403, 0.0f, class_10055Var.field_53458 ? (-90.0f) - class_10055Var.field_53448 : -90.0f)));
                                            ?? r03 = r0;
                                            r0 = r03;
                                            if (j2 >= 0) {
                                                if (r03 == 0) {
                                                    r0 = class_10055Var.field_53412;
                                                    if (r0 == 0) {
                                                        return;
                                                    } else {
                                                        class_4587Var.method_46416(0.0f, -1.0f, 0.3f);
                                                    }
                                                }
                                                if (s >= 0) {
                                                    r0 = r0;
                                                }
                                            }
                                            if (r0 == 0) {
                                                return;
                                            }
                                            try {
                                                r0 = class_4587Var;
                                                r0.method_22907(class_7833.field_40716.rotationDegrees(180.0f - f2));
                                            } catch (NoWhenBranchMatchedException unused3) {
                                                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6132501861969397704L, j3) /* invoke-custom */;
                                            }
                                        } catch (NoWhenBranchMatchedException unused4) {
                                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6132501861969397704L, j3) /* invoke-custom */;
                                        }
                                    } catch (NoWhenBranchMatchedException unused5) {
                                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6132501861969397704L, j3) /* invoke-custom */;
                                    }
                                } catch (NoWhenBranchMatchedException unused6) {
                                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6132501861969397704L, j3) /* invoke-custom */;
                                }
                            } else {
                                r0 = class_4587Var;
                                r0.method_22907(class_7833.field_40716.rotationDegrees(180.0f - f2));
                            }
                        } catch (NoWhenBranchMatchedException unused7) {
                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6132501861969397704L, j3) /* invoke-custom */;
                        }
                    } catch (NoWhenBranchMatchedException unused8) {
                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6132501861969397704L, j3) /* invoke-custom */;
                    }
                } catch (NoWhenBranchMatchedException unused9) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6132501861969397704L, j3) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused10) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6132501861969397704L, j3) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused11) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -6132501861969397704L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean B(net.minecraft.class_2703.class_2705 r14, su.catlean.gt r15) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kf.B(net.minecraft.class_2703$class_2705, su.catlean.gt):boolean");
    }

    private static final boolean P(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    private static NoWhenBranchMatchedException a(NoWhenBranchMatchedException noWhenBranchMatchedException) {
        return noWhenBranchMatchedException;
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

    private static String b(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 5946;
        if (d[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/kf", e2);
            }
        }
        return d[i3];
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
            r1 = r10
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
            java.lang.String r1 = "su/catlean/kf"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kf.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 1559;
        if (k[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) l.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/kf", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            k[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return k[i3].intValue();
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
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
            r1 = r10
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
            java.lang.String r1 = "su/catlean/kf"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.kf.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
