package su.catlean;

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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1304;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2404;
import net.minecraft.class_2848;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.network.AfterSendPacket;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.AfterElytraEvent;
import su.catlean.api.event.events.player.PreElytraEvent;
import su.catlean.api.event.events.player.SetPoseEvent;
import su.catlean.api.event.events.world.FireWorkVelocityEvent;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/m1.class */
public final class m1 implements jr {

    @NotNull
    public static final m1 L;
    private static boolean o;
    private static boolean E;
    private static float W;

    @Nullable
    private static class_1799 G;

    @Nullable
    private static class_1799 z;

    @NotNull
    private static class_1792 a;

    @NotNull
    private static class_1792 m;
    private static int x;
    private static int l;
    private static long b;
    private static final long c = yz.a(-7776498086378487126L, 8067530436925902127L, MethodHandles.lookup().lookupClass()).a(239646615889226L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;

    private m1() {
    }

    public final boolean v() {
        return o;
    }

    public final void H(boolean z2) {
        o = z2;
    }

    public final boolean B() {
        return E;
    }

    public final void Z(boolean z2) {
        E = z2;
    }

    public final float F() {
        return W;
    }

    public final void o(float f2) {
        W = f2;
    }

    @Nullable
    public final class_1799 W() {
        return G;
    }

    public final void v(@Nullable class_1799 class_1799Var) {
        G = class_1799Var;
    }

    @Nullable
    public final class_1799 t() {
        return z;
    }

    public final void z(@Nullable class_1799 class_1799Var) {
        z = class_1799Var;
    }

    @NotNull
    public final class_1792 f() {
        return a;
    }

    public final void X(@NotNull class_1792 class_1792Var, long a2) {
        Intrinsics.checkNotNullParameter(class_1792Var, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27448, 563319415547990239L ^ (c ^ a2)) /* invoke-custom */);
        a = class_1792Var;
    }

    @NotNull
    public final class_1792 q() {
        return m;
    }

    public final void D(long a2, @NotNull class_1792 class_1792Var) {
        Intrinsics.checkNotNullParameter(class_1792Var, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11305, 4567161618141475362L ^ (c ^ a2)) /* invoke-custom */);
        m = class_1792Var;
    }

    public final int U() {
        return x;
    }

    public final void g(int i2) {
        x = i2;
    }

    public final int S() {
        return l;
    }

    public final void Z(int i2) {
        l = i2;
    }

    public final long Z() {
        return b;
    }

    public final void f(long j) {
        b = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0252 A[PHI: r0
  0x0252: PHI (r0v34 ??) = (r0v22 ??), (r0v46 ??), (r0v51 ??), (r0v54 ??), (r0v55 ??) binds: [B:72:0x019d, B:108:0x024c, B:78:0x01c0, B:87:0x01ea, B:97:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0298 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010c A[PHI: r0
  0x010c: PHI (r0v67 ??) = (r0v64 ??), (r0v88 ??), (r0v91 ??), (r0v92 ??) binds: [B:10:0x0072, B:40:0x00fe, B:19:0x009c, B:29:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015a A[PHI: r0
  0x015a: PHI (r0v69 ??) = (r0v97 ??), (r0v98 ??) binds: [B:58:0x0151, B:60:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015d  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [int] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v92, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v50 */
    /* JADX WARN: Type inference failed for: r1v58 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Override // su.catlean.jr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(long r9, @org.jetbrains.annotations.NotNull su.catlean.api.event.events.player.PreSyncEvent r11) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.m1.w(long, su.catlean.api.event.events.player.PreSyncEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // su.catlean.jr
    public void y(@NotNull PreElytraEvent e2, long a2) {
        long j = a2 ^ 79805115683167L;
        String[] strArr = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8985903558872163436L, a2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(e2, "e");
        Object objZ = strArr;
        if (objZ == 0) {
            try {
                try {
                    objZ = dm.h.Z();
                    if (objZ >= 4) {
                        return;
                    } else {
                        ut.D.Y(zf.v(j).method_36455());
                    }
                } catch (NoWhenBranchMatchedException unused) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, -8956199612054186954L, a2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused2) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, -8956199612054186954L, a2) /* invoke-custom */;
            }
        }
        zf.v(j).method_36457(-45.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // su.catlean.jr
    public void b(long a2, @NotNull AfterElytraEvent e2) {
        class_746 class_746VarV = a2;
        long j = a2 ^ 18213801518595L;
        try {
            Intrinsics.checkNotNullParameter(e2, "e");
            if (dm.h.Z() < 4) {
                class_746VarV = zf.v(j);
                class_746VarV.method_36457(ut.D.i());
            }
        } catch (NoWhenBranchMatchedException unused) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_746VarV, -5410661664582409366L, a2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:178:0x0507
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @Override // su.catlean.jr
    public void h(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.player.MoveEvent r12, long r13) {
        /*
            Method dump skipped, instruction units count: 1357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.m1.h(su.catlean.api.event.events.player.MoveEvent, long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [long] */
    /* JADX WARN: Type inference failed for: r0v13, types: [su.catlean.dz] */
    @Override // su.catlean.jr
    public void j(long a2, @NotNull AfterSendPacket event) {
        Object objFX = a2;
        long j = a2 ^ 100112727355052L;
        long j2 = objFX ^ 36138565521496L;
        try {
            try {
                try {
                    Intrinsics.checkNotNullParameter(event, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27358, 8371663258893474295L ^ a2) /* invoke-custom */);
                    if (event.getPacket() instanceof class_2848) {
                        objFX = ut.D.FX(j2);
                        if (objFX == dz.FIRE_WORK && event.getPacket().method_12365() == class_2848.class_2849.field_12982) {
                            S(j, false);
                        }
                    }
                } catch (NoWhenBranchMatchedException unused) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, -600863486213119958L, a2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused2) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, -600863486213119958L, a2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused3) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objFX, -600863486213119958L, a2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void S(long r12, boolean r14) {
        /*
            Method dump skipped, instruction units count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.m1.S(long, boolean):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0109: INVOKE (r-1 I:su.catlean.ut), (r0 I:long), (r1 I:java.lang.String) VIRTUAL call: su.catlean.ut.f(long, java.lang.String):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @Override // su.catlean.jr
    public void A(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.network.ReceivePacket r10, long r11, char r13) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.m1.A(su.catlean.api.event.events.network.ReceivePacket, long, char):void");
    }

    /*  JADX ERROR: Failed to decode insn: 0x02CB: MOVE_MULTI
        java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -1 out of bounds for object array[8]
        	at java.base/java.lang.System.arraycopy(Native Method)
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:313)
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
    @Override // su.catlean.jr
    public void P(int r9, @org.jetbrains.annotations.NotNull su.catlean.api.event.events.player.PlayerUpdateEvent r10, char r11, char r12) {
        /*
            Method dump skipped, instruction units count: 785
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.m1.P(int, su.catlean.api.event.events.player.PlayerUpdateEvent, char, char):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015a A[PHI: r0
  0x015a: PHI (r0v28 ??) = (r0v26 ??), (r0v53 ??), (r0v59 ??) binds: [B:4:0x00c4, B:33:0x0153, B:10:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v49, types: [int] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v53, types: [int] */
    /* JADX WARN: Type inference failed for: r0v59, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Override // su.catlean.jr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(char r10, int r11, short r12) {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.m1.m(char, int, short):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    @Override // su.catlean.jr
    public void b(long j) {
        long j2 = j ^ 115322306114422L;
        long j3 = j ^ 85510088156605L;
        String[] strArr = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4010927170984488822L, j) /* invoke-custom */;
        E = false;
        Object objH = strArr;
        if (objH == 0) {
            try {
                try {
                    objH = ut.D.H(j2);
                    if (objH != 0) {
                        return;
                    }
                    zf.v(j3).method_18800(0.0d, zf.v(j3).method_18798().method_10214(), 0.0d);
                    new Thread(m1::k).start();
                } catch (NoWhenBranchMatchedException unused) {
                    objH = (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 3987702964553474260L, j) /* invoke-custom */;
                    throw objH;
                }
            } catch (NoWhenBranchMatchedException unused2) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objH, 3987702964553474260L, j) /* invoke-custom */;
            }
        }
    }

    @Override // su.catlean.jr
    public void U(long a2, @NotNull FireWorkVelocityEvent e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
    }

    @Override // su.catlean.jr
    public void s(@NotNull SetPoseEvent e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
    }

    @Override // su.catlean.jr
    public void k(long a2, @NotNull ReceivePacket e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
    }

    private final int j(long j, boolean z2) {
        long j2 = c ^ j;
        long j3 = j2 ^ 23207976449418L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j3 << 32) >>> 48);
        int i4 = (int) ((j3 << 48) >>> 48);
        int i5 = (int) (j2 >>> 48);
        long j4 = ((j2 ^ 7552621302773L) << 16) >>> 16;
        if (z2) {
            gg ggVar = gg.P;
            class_1792 class_1792Var = class_1802.field_8639;
            Intrinsics.checkNotNullExpressionValue(class_1792Var, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28366, 7344450740018069814L ^ j2) /* invoke-custom */);
            return ggVar.Y(i2, new class_1792[]{class_1792Var}, i3, (char) i4).a();
        }
        gg ggVar2 = gg.P;
        class_1792 class_1792Var2 = class_1802.field_8639;
        Intrinsics.checkNotNullExpressionValue(class_1792Var2, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30877, 4281941895537874786L ^ j2) /* invoke-custom */);
        return ggVar2.o(new class_1792[]{class_1792Var2}, (char) i5, j4).a();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x006e: INVOKE (r-1 I:su.catlean.ut), (r0 I:long), (r1 I:java.lang.String) VIRTUAL call: su.catlean.ut.f(long, java.lang.String):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void i(short r10, char r11, int r12) {
        /*
            r9 = this;
            r0 = r10
            long r0 = (long) r0
            r1 = 48
            long r0 = r0 << r1
            r1 = r11
            long r1 = (long) r1
            r2 = 48
            long r1 = r1 << r2
            r2 = 16
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            r1 = r12
            long r1 = (long) r1
            r2 = 32
            long r1 = r1 << r2
            r2 = 32
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            long r1 = su.catlean.m1.c
            long r0 = r0 ^ r1
            r13 = r0
            r0 = r13
            r1 = r0; r1 = r0; 
            r2 = 48256899219106(0x2be3af55fea2, double:2.38420760789836E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r15 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r16 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r17 = r2
            r1 = r0; r3 = r0; 
            r2 = 134251963491113(0x7a19f8982329, double:6.6329283047692E-310)
            long r1 = r1 ^ r2
            r18 = r1
            su.catlean.ut r0 = su.catlean.ut.D
            su.catlean.i4 r1 = su.catlean.i4.h
            r2 = r15
            r3 = 6955(0x1b2b, float:9.746E-42)
            r4 = 4532507326378692150(0x3ee6b3662aa84e36, double:1.08245743222552E-5)
            r5 = r13
            long r4 = r4 ^ r5
            java.lang.String r3 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/m1;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "n"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r3, r4)
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = r16
            r6 = r4; r4 = r5; r5 = r6; 
            r6 = r17
            java.lang.String r1 = r1.E(r2, r3, r4, r5, r6)
            r2 = r18
            r3 = r2; r2 = r1; r1 = r3; 
            r-1.f(r0, r1)
            r-1 = 0
            su.catlean.m1.o = r-1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.m1.i(short, char, int):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0053: INVOKE (r-1 I:su.catlean.ut), (r0 I:long), (r1 I:java.lang.String) VIRTUAL call: su.catlean.ut.f(long, java.lang.String):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void p(long r10) {
        /*
            r9 = this;
            long r0 = su.catlean.m1.c
            r1 = r10
            long r0 = r0 ^ r1
            r10 = r0
            r0 = r10
            r1 = r0; r1 = r0; 
            r2 = 97776969684344(0x58ed798b9578, double:4.83082416754954E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 32
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r12 = r2
            r2 = r1; r3 = r0; 
            r3 = 32
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r13 = r2
            r2 = r1; r3 = r0; 
            r3 = 48
            long r2 = r2 << r3
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r14 = r2
            r1 = r0; r3 = r0; 
            r2 = 9995165255923(0x9172e4648f3, double:4.9382677774576E-311)
            long r1 = r1 ^ r2
            r15 = r1
            su.catlean.ut r0 = su.catlean.ut.D
            su.catlean.i4 r1 = su.catlean.i4.h
            r2 = r12
            r3 = 19568(0x4c70, float:2.742E-41)
            r4 = 3913581992065495733(0x364fd616346df2b5, double:4.356652843241672E-47)
            r5 = r10
            long r4 = r4 ^ r5
            java.lang.String r3 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/m1;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "n"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r3, r4)
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = r13
            r6 = r4; r4 = r5; r5 = r6; 
            r6 = r14
            java.lang.String r1 = r1.E(r2, r3, r4, r5, r6)
            r2 = r15
            r3 = r2; r2 = r1; r1 = r3; 
            r-1.f(r0, r1)
            r-1 = 0
            su.catlean.m1.o = r-1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.m1.p(long):void");
    }

    private final void G(long j, int i2) {
        long j2 = c ^ j;
        long j3 = j2 ^ 57346796374358L;
        long j4 = j2 ^ 135963285199478L;
        ag.e(i2, j3, 0, null, false, (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23879, 3182889289433345501L ^ j2) /* invoke-custom */, null);
        ag.e((ut.D.kQ((char) (j2 >>> 48), (int) ((j4 << 16) >>> 32), (int) ((j4 << 48) >>> 48)) - 1) + (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16259, 6221635125639253778L ^ j2) /* invoke-custom */, j3, 0, null, false, (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7133, 3397116518884191053L ^ j2) /* invoke-custom */, null);
        ag.e(i2, j3, 0, null, true, (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10299, 6825727591371446445L ^ j2) /* invoke-custom */, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14, types: [net.minecraft.class_1799] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [int] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v40, types: [int] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private final void K(long j) {
        int i2;
        long j2 = c ^ j;
        long j3 = j2 ^ 120871694897274L;
        long j4 = j2 ^ 1227432981570L;
        long j5 = j2 ^ 86439245686626L;
        int i3 = (int) (j2 >>> 48);
        int i4 = (int) ((j5 << 16) >>> 32);
        int i5 = (int) ((j5 << 48) >>> 48);
        ?? r0 = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-440030528213556933L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    r0 = l;
                    if (r0 != -1) {
                        try {
                            r0 = z;
                            if (r0 != 0) {
                                boolean zAreEqual = Intrinsics.areEqual(m, class_1802.field_8639);
                                ?? r1 = r0;
                                boolean zAreEqual2 = zAreEqual;
                                ?? L2 = zAreEqual;
                                ?? r12 = r1;
                                if (j2 > 0) {
                                    if (r1 == 0) {
                                        if (zAreEqual) {
                                            return;
                                        } else {
                                            zAreEqual2 = Intrinsics.areEqual(m, class_1802.field_8162);
                                        }
                                    }
                                    r12 = r0;
                                    L2 = zAreEqual2;
                                }
                                if (r12 == 0) {
                                    if (L2 != 0) {
                                        return;
                                    } else {
                                        L2 = l(z, m, j3);
                                    }
                                }
                                ?? r23 = L2;
                                try {
                                    try {
                                        L2 = r23 == true ? 1 : 0;
                                        int iW = (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17898, 4331882157333465190L ^ j2) /* invoke-custom */;
                                        ?? r2 = r0;
                                        try {
                                            if (j2 > 0) {
                                                if (r2 == 0) {
                                                    if (L2 < iW) {
                                                        L2 = r23 == true ? 1 : 0;
                                                        iW = -1;
                                                    }
                                                    i2 = r23 == true ? 1 : 0;
                                                    int i6 = i2;
                                                    ag.e(i6 == true ? 1 : 0, j4, 0, null, false, (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7133, 3397066846760703577L ^ j2) /* invoke-custom */, null);
                                                    ag.e((ut.D.kQ((char) i3, i4, i5) - 1) + (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4665, 5215383691471658934L ^ j2) /* invoke-custom */, j4, 0, null, false, (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7133, 3397066846760703577L ^ j2) /* invoke-custom */, null);
                                                    ag.e(i6 == true ? 1 : 0, j4, 0, null, false, (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7133, 3397066846760703577L ^ j2) /* invoke-custom */, null);
                                                }
                                                r2 = r0;
                                            }
                                            if (r2 == 0) {
                                                if (L2 != iW) {
                                                    L2 = r23 == true ? 1 : 0;
                                                    iW = (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4665, 5215383691471658934L ^ j2) /* invoke-custom */;
                                                }
                                                i2 = r23 == true ? 1 : 0;
                                                int i62 = i2;
                                                ag.e(i62 == true ? 1 : 0, j4, 0, null, false, (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7133, 3397066846760703577L ^ j2) /* invoke-custom */, null);
                                                ag.e((ut.D.kQ((char) i3, i4, i5) - 1) + (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4665, 5215383691471658934L ^ j2) /* invoke-custom */, j4, 0, null, false, (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7133, 3397066846760703577L ^ j2) /* invoke-custom */, null);
                                                ag.e(i62 == true ? 1 : 0, j4, 0, null, false, (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7133, 3397066846760703577L ^ j2) /* invoke-custom */, null);
                                            }
                                            i2 = L2 + iW;
                                            int i622 = i2;
                                            ag.e(i622 == true ? 1 : 0, j4, 0, null, false, (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7133, 3397066846760703577L ^ j2) /* invoke-custom */, null);
                                            ag.e((ut.D.kQ((char) i3, i4, i5) - 1) + (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4665, 5215383691471658934L ^ j2) /* invoke-custom */, j4, 0, null, false, (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7133, 3397066846760703577L ^ j2) /* invoke-custom */, null);
                                            ag.e(i622 == true ? 1 : 0, j4, 0, null, false, (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7133, 3397066846760703577L ^ j2) /* invoke-custom */, null);
                                        } catch (NoWhenBranchMatchedException unused) {
                                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(L2, -497026372317368679L, j2) /* invoke-custom */;
                                        }
                                    } catch (NoWhenBranchMatchedException unused2) {
                                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(L2, -497026372317368679L, j2) /* invoke-custom */;
                                    }
                                } catch (NoWhenBranchMatchedException unused3) {
                                    L2 = (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(L2, -497026372317368679L, j2) /* invoke-custom */;
                                    throw L2;
                                }
                            }
                        } catch (NoWhenBranchMatchedException unused4) {
                            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -497026372317368679L, j2) /* invoke-custom */;
                        }
                    }
                } catch (NoWhenBranchMatchedException unused5) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -497026372317368679L, j2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused6) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -497026372317368679L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused7) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -497026372317368679L, j2) /* invoke-custom */;
        }
    }

    private final void D(long j) {
        long j2 = c ^ j;
        x = -1;
        class_1792 class_1792Var = class_1802.field_8162;
        Intrinsics.checkNotNullExpressionValue(class_1792Var, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25405, 2518151150786653488L ^ j2) /* invoke-custom */);
        a = class_1792Var;
        G = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    private final int l(class_1799 class_1799Var, class_1792 class_1792Var, long j) {
        long j2 = c ^ j;
        long j3 = j2 ^ 111983606663119L;
        String[] strArr = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(6186684880089992452L, j2) /* invoke-custom */;
        if (class_1799Var == null) {
            return -1;
        }
        int i2 = 0;
        while (i2 < (int) b(MethodHandles.lookup(), "w", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15679, 5533909578057063553L ^ j2) /* invoke-custom */) {
            class_1799 class_1799VarMethod_5438 = zf.v(j3).method_31548().method_5438(i2);
            Intrinsics.checkNotNullExpressionValue(class_1799VarMethod_5438, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29684, 4510801249608983122L ^ j2) /* invoke-custom */);
            ?? Method_7984 = strArr;
            if (j2 >= 0) {
                if (Method_7984 == 0) {
                    try {
                        try {
                            Method_7984 = class_1799.method_7984(class_1799VarMethod_5438, class_1799Var);
                            if (strArr != null) {
                                return Method_7984;
                            }
                            if (Method_7984 != 0) {
                                try {
                                    try {
                                        boolean zAreEqual = Intrinsics.areEqual(class_1799VarMethod_5438.method_7909(), class_1792Var);
                                        if (strArr != null) {
                                            return zAreEqual ? 1 : 0;
                                        }
                                        if (zAreEqual || j2 < 0) {
                                            return i2;
                                        }
                                    } catch (NoWhenBranchMatchedException unused) {
                                        throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_7984, 6135313003082285734L, j2) /* invoke-custom */;
                                    }
                                } catch (NoWhenBranchMatchedException unused2) {
                                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_7984, 6135313003082285734L, j2) /* invoke-custom */;
                                }
                            }
                            i2++;
                        } catch (NoWhenBranchMatchedException unused3) {
                            Method_7984 = (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_7984, 6135313003082285734L, j2) /* invoke-custom */;
                            throw Method_7984;
                        }
                    } catch (NoWhenBranchMatchedException unused4) {
                        Method_7984 = (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_7984, 6135313003082285734L, j2) /* invoke-custom */;
                        throw Method_7984;
                    }
                }
                Method_7984 = strArr;
            }
            if (Method_7984 != 0) {
                break;
            }
        }
        return -1;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x01c2: INVOKE (r-1 I:su.catlean.ut), (r0 I:long), (r1 I:java.lang.String) VIRTUAL call: su.catlean.ut.f(long, java.lang.String):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final int n(short r10, long r11) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.m1.n(short, long):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final boolean J(int r9, short r10, char r11) {
        /*
            r8 = this;
            r0 = r9
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r10
            long r1 = (long) r1
            r2 = 48
            long r1 = r1 << r2
            r2 = 32
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            r1 = r11
            long r1 = (long) r1
            r2 = 48
            long r1 = r1 << r2
            r2 = 48
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            long r1 = su.catlean.m1.c
            long r0 = r0 ^ r1
            r12 = r0
            r0 = r12
            r1 = r0; r1 = r0; 
            r2 = 94812638680079(0x563b49a6140f, double:4.6843667563386E-310)
            long r1 = r1 ^ r2
            r14 = r1
            r1 = r0; r2 = r0; 
            r2 = 58944421679561(0x359c1150d1c9, double:2.9122413765851E-310)
            long r1 = r1 ^ r2
            r2 = r1; r2 = r0; 
            r3 = 48
            long r2 = r2 >>> r3
            int r2 = (int) r2
            r16 = r2
            r2 = r1; r3 = r0; 
            r3 = 16
            long r2 = r2 << r3
            r3 = 16
            long r2 = r2 >>> r3
            r17 = r2
            r0 = 5071286692040761023(0x4660d460a9415ebf, double:1.066702622779871E31)
            r1 = r12
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r19 = r0
            r0 = r8
            r1 = r14
            boolean r0 = r0.e(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L5a
            r1 = r19
            if (r1 != 0) goto L7b
            if (r0 == 0) goto L72
            goto L65
        L5a:
            r1 = 5088596805831364893(0x469e53d598c4111d, double:1.5377858264698752E32)
            r2 = r12
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L67
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L67
        L65:
            r0 = 0
            return r0
        L67:
            r1 = 5088596805831364893(0x469e53d598c4111d, double:1.5377858264698752E32)
            r2 = r12
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L72:
            r0 = r8
            r1 = r16
            short r1 = (short) r1
            r2 = r17
            int r0 = r0.n(r1, r2)
        L7b:
            r1 = r19
            if (r1 != 0) goto La1
            r1 = -1
            if (r0 == r1) goto La4
            goto L92
        L87:
            r1 = 5088596805831364893(0x469e53d598c4111d, double:1.5377858264698752E32)
            r2 = r12
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L96
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L96
        L92:
            r0 = 1
            goto La1
        L96:
            r1 = 5088596805831364893(0x469e53d598c4111d, double:1.5377858264698752E32)
            r2 = r12
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        La1:
            goto La5
        La4:
            r0 = 0
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.m1.J(int, short, char):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    private final boolean e(long j) {
        long j2 = c ^ j;
        long j3 = j2 ^ 61155935346905L;
        long j4 = j2 ^ 62657500494910L;
        Object objAreEqual = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1284976995375188235L, j2) /* invoke-custom */;
        class_1799 class_1799VarMethod_6118 = zf.v(j4).method_6118(class_1304.field_6174);
        Intrinsics.checkNotNullExpressionValue(class_1799VarMethod_6118, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2006, 8213273033129864583L ^ j2) /* invoke-custom */);
        try {
            try {
                try {
                    objAreEqual = Intrinsics.areEqual(class_1799VarMethod_6118.method_7909(), class_1802.field_8833);
                    if (objAreEqual != 0) {
                        return objAreEqual;
                    }
                    if (objAreEqual != 0) {
                        boolean zY = ut.D.Y(j3, class_1799VarMethod_6118);
                        if (objAreEqual != 0) {
                            return zY;
                        }
                        if (zY) {
                            return false;
                        }
                    }
                    return true;
                } catch (NoWhenBranchMatchedException unused) {
                    throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -1237258933465663145L, j2) /* invoke-custom */;
                }
            } catch (NoWhenBranchMatchedException unused2) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -1237258933465663145L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused3) {
            throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, -1237258933465663145L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:32:0x00bb
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void r(long r13) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.m1.r(long):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:94:0x024a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void R(long r13) {
        /*
            Method dump skipped, instruction units count: 836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.m1.R(long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 6082997622362932200L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0065, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        if (r0 == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
        ).invoke(r0, 6082997622362932200L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        r13 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        r0 = (r0 > 0 ? 1 : (r0 == 0 ? 0 : -1));
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0084, code lost:
    
        if (r0 < 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0087, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0037, code lost:
    
        if (r0 < r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
    
        r0 = su.catlean.zf.v(r1).method_31548().method_5438(r13).method_7960();
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x004e, code lost:
    
        if (r0 < 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0051, code lost:
    
        if (r1 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
    
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:25:0x003a, B:21:0x0081], limit reached: 34 */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Type inference failed for: r0v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007e -> B:21:0x0081). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int M(long r8) {
        /*
            r7 = this;
            long r0 = su.catlean.m1.c
            r1 = r8
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 71921172186753(0x416973eb8681, double:3.55337803861076E-310)
            long r1 = r1 ^ r2
            r10 = r1
            r0 = 6094955443505351754(0x5495a1aef3f84c4a, double:2.9571049932976076E99)
            r1 = r8
            java.lang.String[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Ljava/lang/String;}
            ).invoke(r0, r1)
            r1 = 17898(0x45ea, float:2.508E-41)
            r2 = 4331896459844543767(0x3c1dfce0fcce6517, double:4.0641058277479984E-19)
            r3 = r8
            long r2 = r2 ^ r3
            int r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/m1;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "w"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r1, r2)
            r13 = r1
            r12 = r0
        L28:
            r0 = r13
            r1 = 26308(0x66c4, float:3.6865E-41)
            r2 = 4185503169431225912(0x3a15e4f4f4384638, double:6.908642711871888E-29)
            r3 = r8
            long r2 = r2 ^ r3
            int r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/m1;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "w"}
                {METHOD_TYPE: (I, J)I}
            ).invoke(r1, r2)
            if (r0 >= r1) goto L81
        L3a:
            r0 = r10
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)     // Catch: kotlin.NoWhenBranchMatchedException -> L5c
            net.minecraft.class_1661 r0 = r0.method_31548()     // Catch: kotlin.NoWhenBranchMatchedException -> L5c
            r1 = r13
            net.minecraft.class_1799 r0 = r0.method_5438(r1)     // Catch: kotlin.NoWhenBranchMatchedException -> L5c
            boolean r0 = r0.method_7960()     // Catch: kotlin.NoWhenBranchMatchedException -> L5c
            r1 = r12
            r2 = r8
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L56
            if (r1 != 0) goto L88
            r1 = r12
        L56:
            if (r1 != 0) goto L78
            goto L66
        L5c:
            r1 = 6082997622362932200(0x546b261bc27d03e8, double:4.639169224502805E98)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)     // Catch: kotlin.NoWhenBranchMatchedException -> L6c
            throw r0     // Catch: kotlin.NoWhenBranchMatchedException -> L6c
        L66:
            if (r0 == 0) goto L79
            goto L76
        L6c:
            r1 = 6082997622362932200(0x546b261bc27d03e8, double:4.639169224502805E98)
            r2 = r8
            kotlin.NoWhenBranchMatchedException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Lkotlin/NoWhenBranchMatchedException;}
            ).invoke(r0, r1, r2)
            throw r0
        L76:
            r0 = r13
        L78:
            return r0
        L79:
            int r13 = r13 + 1
            r0 = r12
            if (r0 == 0) goto L28
        L81:
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3a
            r0 = -1
        L88:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.m1.M(long):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Throwable, kotlin.NoWhenBranchMatchedException] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public final boolean C(long j) {
        long j2 = c ^ j;
        long j3 = j2 ^ 12994280684882L;
        long j4 = j2 ^ 10748043903989L;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1288567163090962750L, j2) /* invoke-custom */;
        try {
            try {
                obj = (zf.v(j4).method_23318() > 0.0d ? 1 : (zf.v(j4).method_23318() == 0.0d ? 0 : -1));
                boolean zHasNext = obj;
                if (obj == 0) {
                    if (obj < 0) {
                        return false;
                    }
                    zHasNext = zf.z(j3).method_20812(zf.v(j4), zf.v(j4).method_5829().method_989(0.0d, -3.0d, 0.0d)).iterator().hasNext();
                }
                return obj == 0 ? zHasNext == 0 : zHasNext;
            } catch (NoWhenBranchMatchedException unused) {
                throw (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1233826545664018076L, j2) /* invoke-custom */;
            }
        } catch (NoWhenBranchMatchedException unused2) {
            obj = (NoWhenBranchMatchedException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NoWhenBranchMatchedException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 1233826545664018076L, j2) /* invoke-custom */;
            throw obj;
        }
    }

    public final boolean c(long j) {
        long j2 = c ^ j;
        long j3 = j2 ^ 16402466884503L;
        return zf.z(j2 ^ 14284811367728L).method_8320(class_2338.method_49637(zf.v(j3).method_23317(), zf.v(j3).method_23318() - 0.1d, zf.v(j3).method_23321())).method_26204() instanceof class_2404;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0045: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final void k() {
        /*
            long r0 = su.catlean.m1.c
            r1 = 16978699096355(0xf7129541123, double:8.388591934585E-311)
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 105906517436860(0x60524859e9bc, double:5.23247719362395E-310)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 109781165393328(0x63d86b5dc5b0, double:5.42391023812593E-310)
            long r1 = r1 ^ r2
            r12 = r1
            r1 = r0; r2 = r0; 
            r2 = 114585755109964(0x6837133aca4c, double:5.66128851026113E-310)
            long r1 = r1 ^ r2
            r14 = r1
            r1 = r0; r2 = r0; 
            r2 = 38995048634921(0x23773e059a29, double:1.9266113888423E-310)
            long r1 = r1 ^ r2
            r16 = r1
            r1 = r0; r2 = r0; 
            r2 = 114786711993865(0x6865dd317e09, double:5.6712170995242E-310)
            long r1 = r1 ^ r2
            r18 = r1
            net.minecraft.class_2848 r0 = new net.minecraft.class_2848
            r1 = r0
            r2 = r18
            net.minecraft.class_746 r2 = su.catlean.zf.v(r2)
            net.minecraft.class_1297 r2 = (net.minecraft.class_1297) r2
            net.minecraft.class_2848$class_2849 r3 = net.minecraft.class_2848.class_2849.field_12982
            r1.<init>(r2, r3)
            net.minecraft.class_2596 r0 = (net.minecraft.class_2596) r0
            r1 = r14
            r2 = r1; r1 = r0; r0 = r2; 
            su.catlean._r.a(r-1, r0)
            su.catlean.m1 r-1 = su.catlean.m1.L
            r0 = r10
            r-1.K(r0)
            su.catlean.m1 r-1 = su.catlean.m1.L
            r-1 = -1
            su.catlean.m1.l = r-1
            su.catlean.m1 r-1 = su.catlean.m1.L
            net.minecraft.class_1792 r-1 = net.minecraft.class_1802.field_8162
            r0 = r-1
            r1 = 956(0x3bc, float:1.34E-42)
            r2 = 1709527805723536336(0x17b9767b59cdebd0, double:2.180064306058443E-194)
            r3 = r8
            long r2 = r2 ^ r3
            java.lang.String r1 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/m1;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "n"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            su.catlean.m1.m = r-1
            su.catlean.m1 r-1 = su.catlean.m1.L
            r-1 = 0
            su.catlean.m1.z = r-1
            su.catlean.m1 r-1 = su.catlean.m1.L
            r0 = r12
            r-1.R(r0)
            su.catlean.m1 r-1 = su.catlean.m1.L
            r0 = r16
            r-1.D(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.m1.k():void");
    }

    static {
        int i2;
        long j = c ^ 137547252340825L;
        f = new HashMap(13);
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
        String str = "´¸!xÍ\u001d\u009a¥7ÞY\u0095p\"ï\bx\u0085Èï\f¬×õ³\u0019Æ]âó«\u009d\u0091\u000f\u008dµXC\u001eyÏr·3wÌ;¢üúàl\u000eK\u0081ý\u0010ÔÀ#\u008fóf$\u001b-áa\u0015\u0017¦\u009e÷0\u008c\u001eo\u0088V\u0088;&\u0011%\u0091»2¥\u0082º7\u0005rg¯'\u0083Î7X\u0014ï°]\u008c\u001e\u0088\u0015fý§ï\u008c\u0017Ev)\u0089¡\u001dM¯ \u0095ç¡\b7(</ïC\u0083\u0090ø\n\u00026\u0087î\u009c¹\u0082PUÞMBñ\\\u0013w0\r \u0089\txc¶á|N.\u0095l<4÷çJÝç[\u0013\u009bÕÈ\u0003_\u0085Ïu\u0019ÓÇ\u0011\u0088\u0082Ø9\u0002\u0015åô\u0093ètªXÈ¥ú \u001b\u001e\u0086ã\bn\n(ùVf<yô\"vú1sNÕîÒ BÞ\u001f\u0096<\u0084 h\u009cA\u000f\u0082â\u0018³É÷üà\u0096{øï»\u008d^Eã)[OLb\u0005\u0092¿\u009fL§\u0019f `WT2\fº5\u00ad\u0085\b¹Þ§ü.+zE\u009b±\u0098Ì\bÃ\u001f§0\u001d®1³F\u00913ñ®ÊjyÁ\\\u00980\u0003_r\u008fÕ\u008eM<I\u0004\u001f\u0010¦¼\"ø\u0097bOçKkQ¼^Üó=(\u000eµ§L\u000b¦&ðå\u0081X\u001b\u008d>«\u0005\u0083jI&\u0004zlo\u009c3\u0004¾~Ñüû8þíZYsx-8Z>³\u00001®Û¸°ü\f\u0096Âî\u0005æ\b\u0016\u001cÈRFãÌ\u008aáÞC\u0017+U·]\u0094!1öÈB\u008bò}£ËøÄþ\u001cÔkV\u007f°Õ\u0081Ê\u0088ä)è&2,ÚøÓ·÷\u0086P¨TR}F{ \u0081\u009d5~Ú¹\f[\u008e«;x+\u0084©X3;rö\\L\u0097\u009d²wa÷¡8øÊ\u0018Ös\u0089¿Ë½V\u0081>QâÃG\u0006â\u0002®\u009a\u0011Oñ%¸99¾\u0090:ç\r\u001d\u009cxPÄP\u001ek\u0084H:J}så´#\u00972\u001bz:Ô©Ï\u0005\u0082\u0097¥\u0089\bE#»· \u0093YÄÕ5C\u00adúß\u001e»Á\u009bä4¨\b \u001dE.×8\u0084\u0086C¶\u008aÅ\u008bP.¸o8\u009d\u0014ë$>È×\u0003\u0098· Ó`»µ(\u009fkÛ\u000e*\u0097\u009aZó6âödÜmWúÙ+9\u0097¼\\ª&b\u0018Æ\t\u0096UU÷]\u0083©R×.ï\u0010n/\u0088ùÚ\u0002ð§ï\u008d\u0018_pn\u00177 4dÑ¶N7\u0089òê¦ìWÎ|pgÉ\u008csî;Àv¹QD_áÉ¢1m\u0010øT\u009d³±¥¤ö\u0081#\u008c\u0003{Yø¢";
        int length = "´¸!xÍ\u001d\u009a¥7ÞY\u0095p\"ï\bx\u0085Èï\f¬×õ³\u0019Æ]âó«\u009d\u0091\u000f\u008dµXC\u001eyÏr·3wÌ;¢üúàl\u000eK\u0081ý\u0010ÔÀ#\u008fóf$\u001b-áa\u0015\u0017¦\u009e÷0\u008c\u001eo\u0088V\u0088;&\u0011%\u0091»2¥\u0082º7\u0005rg¯'\u0083Î7X\u0014ï°]\u008c\u001e\u0088\u0015fý§ï\u008c\u0017Ev)\u0089¡\u001dM¯ \u0095ç¡\b7(</ïC\u0083\u0090ø\n\u00026\u0087î\u009c¹\u0082PUÞMBñ\\\u0013w0\r \u0089\txc¶á|N.\u0095l<4÷çJÝç[\u0013\u009bÕÈ\u0003_\u0085Ïu\u0019ÓÇ\u0011\u0088\u0082Ø9\u0002\u0015åô\u0093ètªXÈ¥ú \u001b\u001e\u0086ã\bn\n(ùVf<yô\"vú1sNÕîÒ BÞ\u001f\u0096<\u0084 h\u009cA\u000f\u0082â\u0018³É÷üà\u0096{øï»\u008d^Eã)[OLb\u0005\u0092¿\u009fL§\u0019f `WT2\fº5\u00ad\u0085\b¹Þ§ü.+zE\u009b±\u0098Ì\bÃ\u001f§0\u001d®1³F\u00913ñ®ÊjyÁ\\\u00980\u0003_r\u008fÕ\u008eM<I\u0004\u001f\u0010¦¼\"ø\u0097bOçKkQ¼^Üó=(\u000eµ§L\u000b¦&ðå\u0081X\u001b\u008d>«\u0005\u0083jI&\u0004zlo\u009c3\u0004¾~Ñüû8þíZYsx-8Z>³\u00001®Û¸°ü\f\u0096Âî\u0005æ\b\u0016\u001cÈRFãÌ\u008aáÞC\u0017+U·]\u0094!1öÈB\u008bò}£ËøÄþ\u001cÔkV\u007f°Õ\u0081Ê\u0088ä)è&2,ÚøÓ·÷\u0086P¨TR}F{ \u0081\u009d5~Ú¹\f[\u008e«;x+\u0084©X3;rö\\L\u0097\u009d²wa÷¡8øÊ\u0018Ös\u0089¿Ë½V\u0081>QâÃG\u0006â\u0002®\u009a\u0011Oñ%¸99¾\u0090:ç\r\u001d\u009cxPÄP\u001ek\u0084H:J}så´#\u00972\u001bz:Ô©Ï\u0005\u0082\u0097¥\u0089\bE#»· \u0093YÄÕ5C\u00adúß\u001e»Á\u009bä4¨\b \u001dE.×8\u0084\u0086C¶\u008aÅ\u008bP.¸o8\u009d\u0014ë$>È×\u0003\u0098· Ó`»µ(\u009fkÛ\u000e*\u0097\u009aZó6âödÜmWúÙ+9\u0097¼\\ª&b\u0018Æ\t\u0096UU÷]\u0083©R×.ï\u0010n/\u0088ùÚ\u0002ð§ï\u008d\u0018_pn\u00177 4dÑ¶N7\u0089òê¦ìWÎ|pgÉ\u008csî;Àv¹QD_áÉ¢1m\u0010øT\u009d³±¥¤ö\u0081#\u008c\u0003{Yø¢".length();
        char cCharAt = '8';
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
                            d = strArr;
                            e = new String[17];
                            i = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[12];
                            int i10 = 0;
                            String str3 = "|:f;Q±(³¹\u00951\nûÎÎPëéá\u00128Zÿ\t®ô3Ò\u0099]Û|q\n§i\u001e\u0095\u0018:\u001a!-Q¾/ævÄp\u001a&Îh³=\u0013\u008fÓ\u0012\u0085¡w#\u0088Zsðïb\u0015\u0016ï¨Ä\u0016ù¥vÜ";
                            int length2 = "|:f;Q±(³¹\u00951\nûÎÎPëéá\u00128Zÿ\t®ô3Ò\u0099]Û|q\n§i\u001e\u0095\u0018:\u001a!-Q¾/ævÄp\u001a&Îh³=\u0013\u008fÓ\u0012\u0085¡w#\u0088Zsðïb\u0015\u0016ï¨Ä\u0016ù¥vÜ".length();
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
                                                g = jArr;
                                                h = new Integer[12];
                                                L = new m1();
                                                class_1792 class_1792Var = class_1802.field_8162;
                                                Intrinsics.checkNotNullExpressionValue(class_1792Var, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25405, 2518161309834838566L ^ j) /* invoke-custom */);
                                                a = class_1792Var;
                                                class_1792 class_1792Var2 = class_1802.field_8162;
                                                Intrinsics.checkNotNullExpressionValue(class_1792Var2, (String) a(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25405, 2518161309834838566L ^ j) /* invoke-custom */);
                                                m = class_1792Var2;
                                                x = -1;
                                                l = -1;
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j4;
                                            if (i11 >= length2) {
                                                str3 = "¤§âZ\u0086Z>¯\u009a7gºIéîÙ";
                                                length2 = "¤§âZ\u0086Z>¯\u009a7gºIéîÙ".length();
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
                        str = "Æ\u009b\u008fÏçWð.r´fÀgRi6öÅÅ<Ã$J\u00130\u0093ü6\u0098D\u0004\u009cMPWÖ\u0007Ã2;W¨Ûp>èÿ_\u0010Ám©¶Su\u0006ôØï\u001c7\u0007ÞK\u0017";
                        length = "Æ\u009b\u008fÏçWð.r´fÀgRi6öÅÅ<Ã$J\u00130\u0093ü6\u0098D\u0004\u009cMPWÖ\u0007Ã2;W¨Ûp>èÿ_\u0010Ám©¶Su\u0006ôØï\u001c7\u0007ÞK\u0017".length();
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 17675;
        if (e[i3] == null) {
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
                e[i3] = a(((Cipher) objArr[0]).doFinal(d[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/m1", e2);
            }
        }
        return e[i3];
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
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
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
            java.lang.String r1 = "su/catlean/m1"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.m1.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 29976;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/m1", e2);
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
            java.lang.String r1 = "su/catlean/m1"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.m1.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
