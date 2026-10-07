package su.catlean;

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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1657;
import net.minecraft.class_2338;
import net.minecraft.class_2680;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/u0.class */
public final class u0 extends _g {

    @NotNull
    public static final u0 a;
    static final KProperty[] U;

    @NotNull
    private static final cq l;

    @NotNull
    private static final cq B;

    @NotNull
    private static final cq P;

    @NotNull
    private static final cq k;

    @NotNull
    private static final cq u;

    @NotNull
    private static final av j;

    @NotNull
    private static final cq D;

    @NotNull
    private static final cq b;

    @NotNull
    private static final cp O;

    @NotNull
    private static final cq L;

    @NotNull
    private static final cq w;

    @NotNull
    private static final cq o;

    @NotNull
    private static final i9 t;

    @NotNull
    private static List E;
    private static final long c = yz.a(4505002095066251631L, -8975444313398476768L, MethodHandles.lookup().lookupClass()).a(114886712624630L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;

    /* JADX WARN: Illegal instructions before constructor call */
    private u0(long j2) {
        long j3 = c ^ j2;
        super((String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23341, 1461384721188198630L ^ j3) /* invoke-custom */, jt.Q(), null, 4, null, j3 ^ 5549277935506L);
    }

    private final boolean F(char c2, int i2, short s) {
        return ((Boolean) l.E(this, ((((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s) << 48) >>> 48)) ^ c) ^ 65940060843680L, U[0])).booleanValue();
    }

    private final boolean P(long j2) {
        return ((Boolean) B.E(this, (c ^ j2) ^ 14665730627272L, U[1])).booleanValue();
    }

    private final boolean V(long j2) {
        return ((Boolean) P.E(this, (c ^ j2) ^ 48232609983859L, U[2])).booleanValue();
    }

    private final boolean L(long j2) {
        return ((Boolean) k.E(this, (c ^ j2) ^ 105749667984440L, U[3])).booleanValue();
    }

    private final boolean t(short s, long j2) {
        return ((Boolean) u.E(this, (((((long) s) << 48) | ((j2 << 16) >>> 16)) ^ c) ^ 40750576816278L, U[4])).booleanValue();
    }

    private final lj a(long j2) {
        return (lj) j.E(this, (c ^ j2) ^ 34254114326158L, U[5]);
    }

    private final boolean z(long j2) {
        long j3 = c ^ j2;
        return ((Boolean) D.E(this, j3 ^ 21661533088427L, U[(int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1593, 1817428160199415596L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean Z(char c2, int i2, int i3) {
        long j2 = (((((long) c2) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) i3) << 48) >>> 48)) ^ c;
        return ((Boolean) b.E(this, j2 ^ 68613048340125L, U[(int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13913, 6044315079986627445L ^ j2) /* invoke-custom */])).booleanValue();
    }

    private final h s(long j2) {
        long j3 = c ^ j2;
        return (h) O.E(this, j3 ^ 63098942127758L, U[(int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26622, 5866581688131642058L ^ j3) /* invoke-custom */]);
    }

    private final boolean E(long j2) {
        long j3 = c ^ j2;
        return ((Boolean) L.E(this, j3 ^ 114999257275809L, U[(int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17690, 1829809583856919298L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean l(long j2) {
        long j3 = c ^ j2;
        return ((Boolean) w.E(this, j3 ^ 99625094791946L, U[(int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4571, 9065924112147163495L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final boolean Q(long j2) {
        long j3 = c ^ j2;
        return ((Boolean) o.E(this, j3 ^ 55845927747987L, U[(int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21346, 6414606823052257624L ^ j3) /* invoke-custom */])).booleanValue();
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: JadxRuntimeException: Failed to decode insn: 0x0D3C: MOVE_MULTI in method: su.catlean.u0.B(su.catlean.api.event.events.player.PlayerUpdateEvent):void, file: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/u0.class
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:175)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:462)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:121)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Failed to decode insn: 0x0D3C: MOVE_MULTI
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:57)
        	at jadx.plugins.input.java.data.code.JavaCodeReader.visitInstructions(JavaCodeReader.java:85)
        	at jadx.core.dex.instructions.InsnDecoder.process(InsnDecoder.java:46)
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:164)
        	... 6 more
        Caused by: java.lang.ArrayIndexOutOfBoundsException: arraycopy: source index -3 out of bounds for object array[12]
        	at jadx.plugins.input.java.data.code.StackState.insert(StackState.java:52)
        	at jadx.plugins.input.java.data.code.CodeDecodeState.insert(CodeDecodeState.java:137)
        	at jadx.plugins.input.java.data.code.JavaInsnsRegister.dup2x1(JavaInsnsRegister.java:304)
        	at jadx.plugins.input.java.data.code.JavaInsnData.decode(JavaInsnData.java:46)
        	at jadx.core.dex.instructions.InsnDecoder.lambda$process$0(InsnDecoder.java:50)
        	... 9 more
        */
    @su.catlean.gofra.Flow
    private final void B(su.catlean.api.event.events.player.PlayerUpdateEvent r1) {
        /*
            Method dump skipped, instruction units count: 6206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u0.B(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x01ce: INVOKE (r-1 I:su.catlean.u0), (r0 I:long), (r1 I:net.minecraft.class_2338) DIRECT call: su.catlean.u0.p(long, net.minecraft.class_2338):net.minecraft.class_2680
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void P(net.minecraft.class_1657 r10, java.util.List r11, java.util.List r12, long r13, boolean r15) {
        /*
            Method dump skipped, instruction units count: 827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u0.P(net.minecraft.class_1657, java.util.List, java.util.List, long, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v8, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r5v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0, types: [su.catlean.u0] */
    static void U(int i2, u0 u0Var, class_1657 class_1657Var, List list, short s, List list2, boolean z, short s2, int i3, Object obj) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) s2) << 48) >>> 48)) ^ c;
        long j3 = j2 ^ 55442656646720L;
        ?? B2 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7745419104253355895L, j2) /* invoke-custom */;
        try {
            B2 = i3 & (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22179, 4595535686312031262L ^ j2) /* invoke-custom */;
            ?? r14 = z;
            ?? r0 = B2;
            if (B2 != 0) {
                r14 = r0;
            } else if (B2 != 0) {
                r0 = 0;
                r14 = r0;
            }
            u0Var.P(class_1657Var, list, list2, j3, r14);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(B2, -7725066361409815821L, j2) /* invoke-custom */;
        }
    }

    private final class_2680 p(long j2, class_2338 class_2338Var) {
        long j3 = c ^ j2;
        class_2680 class_2680VarMethod_8320 = zf.z(j3 ^ 8835710884690L).method_8320(class_2338Var);
        Intrinsics.checkNotNullExpressionValue(class_2680VarMethod_8320, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10760, 2584857144334432289L ^ j3) /* invoke-custom */);
        return class_2680VarMethod_8320;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x029b: INVOKE (r-1 I:su.catlean.u0), (r0 I:long), (r1 I:net.minecraft.class_2338) DIRECT call: su.catlean.u0.p(long, net.minecraft.class_2338):net.minecraft.class_2680
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final boolean O(net.minecraft.class_1657 r10, int r11, java.util.List r12, char r13, int r14) {
        /*
            Method dump skipped, instruction units count: 1273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u0.O(net.minecraft.class_1657, int, java.util.List, char, int):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0115: INVOKE (r-1 I:su.catlean.jl), (r0 I:java.awt.Color), (r1 I:long), (r2 I:java.awt.Color), (r3 I:float) VIRTUAL call: su.catlean.jl.C(java.awt.Color, long, java.awt.Color, float):java.awt.Color
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void O(su.catlean.api.event.events.render.Render3DEvent r17) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u0.O(su.catlean.api.event.events.render.Render3DEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x026e A[PHI: r0
  0x026e: PHI (r0v74 ??) = (r0v58 ??), (r0v91 ??), (r0v94 ??), (r0v97 ??), (r0v100 ??), (r0v102 ??) binds: [B:30:0x0179, B:77:0x0263, B:36:0x01a0, B:45:0x01cf, B:54:0x01fe, B:64:0x022b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0273  */
    /* JADX WARN: Type inference failed for: r0v100, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v110 */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v112 */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, net.minecraft.class_2680] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v81, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v91, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v94, types: [int] */
    /* JADX WARN: Type inference failed for: r0v97, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean w(char r10, short r11, int r12) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u0.w(char, short, int):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce A[EDGE_INSN: B:39:0x00ce->B:29:0x00ce BREAK  A[LOOP:1: B:32:0x005d->B:42:?, LOOP_LABEL: LOOP:0: B:3:0x0047->B:41:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v14, types: [net.minecraft.class_2586] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean i(int r8, int r9, short r10) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u0.i(int, int, short):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa A[EDGE_INSN: B:39:0x00aa->B:30:0x00aa BREAK  A[LOOP:1: B:34:0x003d->B:42:?, LOOP_LABEL: LOOP:0: B:3:0x0027->B:41:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [net.minecraft.class_2586] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v26, types: [int] */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean l(net.minecraft.class_1657 r8, long r9) {
        /*
            r7 = this;
            long r0 = su.catlean.u0.c
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 25635216592929(0x1750a9fa9021, double:1.26654798422657E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 174159712606998113(0x26abd55fc1fce61, double:5.110802345367008E-297)
            r1 = r9
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            su.catlean.nf r1 = su.catlean.nf.Z
            java.util.List r1 = r1.V()
            java.util.Iterator r1 = r1.iterator()
            r14 = r1
            r13 = r0
        L27:
            r0 = r14
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lbc
            r0 = r14
            java.lang.Object r0 = r0.next()
            net.minecraft.class_2586 r0 = (net.minecraft.class_2586) r0
            r15 = r0
        L3d:
            r0 = r8
            net.minecraft.class_243 r0 = r0.method_33571()     // Catch: java.lang.NumberFormatException -> L63
            r1 = r15
            net.minecraft.class_2338 r1 = r1.method_11016()     // Catch: java.lang.NumberFormatException -> L63
            net.minecraft.class_243 r1 = r1.method_46558()     // Catch: java.lang.NumberFormatException -> L63
            double r0 = r0.method_1022(r1)     // Catch: java.lang.NumberFormatException -> L63
            r1 = 4612136378390124954(0x400199999999999a, double:2.2)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = r13
            r2 = r9
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L5d
            if (r1 != 0) goto Lbd
            r1 = r13
        L5d:
            if (r1 != 0) goto L8f
            goto L6d
        L63:
            r1 = 153982324201139227(0x2230e1ba7b2ac1b, double:2.2762803746519408E-298)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L73
            throw r0     // Catch: java.lang.NumberFormatException -> L73
        L6d:
            if (r0 > 0) goto L92
            goto L7d
        L73:
            r1 = 153982324201139227(0x2230e1ba7b2ac1b, double:2.2762803746519408E-298)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L85
            throw r0     // Catch: java.lang.NumberFormatException -> L85
        L7d:
            r0 = r15
            boolean r0 = r0 instanceof net.minecraft.class_2627     // Catch: java.lang.NumberFormatException -> L85
            goto L8f
        L85:
            r1 = 153982324201139227(0x2230e1ba7b2ac1b, double:2.2762803746519408E-298)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L8f:
            if (r0 != 0) goto Laa
        L92:
            r0 = r13
            if (r0 == 0) goto L27
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3d
            goto Laa
        La0:
            r1 = 153982324201139227(0x2230e1ba7b2ac1b, double:2.2762803746519408E-298)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Laa:
            r0 = r7
            r1 = r15
            net.minecraft.class_2627 r1 = (net.minecraft.class_2627) r1
            net.minecraft.class_2338 r1 = r1.method_11016()
            r2 = r11
            r3 = r2; r2 = r1; r1 = r3; 
            r3 = 1
            r0.Z(r1, r2, r3)
        Lbc:
            r0 = 0
        Lbd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u0.l(net.minecraft.class_1657, long):boolean");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:6:0x0058
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final void Z(long r9, net.minecraft.class_2338 r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u0.Z(long, net.minecraft.class_2338, boolean):void");
    }

    public final void g(long j2) {
        t.X((c ^ j2) ^ 63834805147979L);
    }

    private static final boolean H() {
        long j2 = (c ^ 128363496187116L) ^ 11104406070901L;
        return a.Z((char) (r0 >>> 48), (int) ((j2 << 16) >>> 32), (int) ((j2 << 48) >>> 48));
    }

    private static final boolean C() {
        long j2 = (c ^ 33450426091639L) ^ 106428458699502L;
        return a.Z((char) (r0 >>> 48), (int) ((j2 << 16) >>> 32), (int) ((j2 << 48) >>> 48));
    }

    private static final boolean I() {
        long j2 = (c ^ 68401348714526L) ^ 70997565629063L;
        return a.Z((char) (r0 >>> 48), (int) ((j2 << 16) >>> 32), (int) ((j2 << 48) >>> 48));
    }

    private static final boolean n() {
        long j2 = (c ^ 86542905939499L) ^ 52855235990706L;
        return a.Z((char) (r0 >>> 48), (int) ((j2 << 16) >>> 32), (int) ((j2 << 48) >>> 48));
    }

    static {
        int i2;
        long j2 = c ^ 87137208818909L;
        long j3 = j2 ^ 4730319530958L;
        long j4 = j2 ^ 60352184381015L;
        long j5 = j2 ^ 24563131054872L;
        long j6 = j2 ^ 72595768876842L;
        long j7 = j2 ^ 116166300874150L;
        long j8 = j2 ^ 113499149237305L;
        int i3 = (int) (j2 >>> 32);
        int i4 = (int) ((j8 << 32) >>> 48);
        int i5 = (int) ((j8 << 48) >>> 48);
        long j9 = j2 ^ 36381799553166L;
        long j10 = j2 ^ 118168675548054L;
        f = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i6 = 1; i6 < 8; i6++) {
            bArr[i6] = (byte) ((j2 << (i6 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[49];
        int i7 = 0;
        String str = "Ñ}¼ðá]%\u0000?\u0094¶É`ÛÜ\u0082Ê¹à1JÎ2\u001dñ\u001a\u0010M¥¥Ön\u0010\u008eÑÆ¥\u0000î#\u0004;\u000fo\u0083r8\u0092\u0094 \u000bìô l\u008aYHH=*cÂ2@£\u0019\u0097{ï}/ñ\u0018C¬ÃþÖä³ó\u0018ñ6í¨3dº%\u0084¿ b]\r\u0013±þh:ê4\u000bÏ\u0017(}¨\u000f\u0018Xª\u008ba\u007fm\u009b{|\u0006©¶ýôç\u0011\u0010Ã¢Ù*ÍT°.\u0084ü\\¹\u0011ÊÌCaf\u0014 Í'o\u0006&\u009bk\rôôÞºàóÄ\u007f°o\u009e\u0003ª\u0090\t[ò,½4÷\u0086\u008b\u008a ®1|Ìñ.wuáw;\t|¢\u0093i\u0000rr£¯uW\u009b-H\u008c½u%Ô¹\u0018¯\u0013\u009c3\u009eÊAF,mîå\u0010\u009b»uî\u001c!\u0088B\u009b\b 0EF«\u0016ðDôuÄ\u0089Ùñ\\½X\u008eÆ|}½\tÒjA¬\u009e}DJâ]¢Î\u0082Ë1QsÎ1\u008c\u0089¡³\u008aCzG ö÷ÑA\u0094Õ\u0085\u0010\\²sk§?¨\u00835d\u000e\u0096½ç%¾?>ÇÊ\u0095±}c(H\u001b=\u0087\u0097\u001e\u001b^Øw{Z\u001f\u009er\u0092[»×,¾h? ¾ À\u0002\u000e^\u0010²DÎ.Û\u0001\u0098R\u0087 i/m½Ø@°¸\u00828§FzNw³J\u009f=\u000e¡Fñ\u0092Ë\u0098½¹@\u001cX\u0080 *×}\u0001À\u001eas\u001e e=0i /ä®OM^\u001côIQ\u0001A\b\u0098\"\u0089\u0083\u0018wç°`ó\u007fÇNQ\u0096#\u00876\u0099·\u001d\u0012Ó\u000f#ó:\u0013G \u0081*Jÿ¿£Qõ¤\t¶Ú^ruM\u000f£@¸ùÇS@Ääþ\u0011\u0092\u0093\u0018w(\fàú\u009fèzkõïù'¯Q:Ø÷l®Ï\rì\u0018\u008a²:Ù\u0006æ¯h%NºÄEo\u0098v\u001dæ c\u0011ßhz§\u009f\u0087ÐO\u0090ÇÁ\u0014\u0011ÞÒ\u0011}û\b¨k\u001fk©i\u0098ÁA:\u0013(_;}\u008eL¥\u0005@ë\u009eò\u001f·)¯_á\u0095¾{2ð\u0080Ò½<³ÑP\u0005J\u0088ÒEO¿ßXÍM\u0018õ-»ë\u0017¡¶á]Ì\u0086ýËÁZD+r¹\u0092\u0019t¡Þ Öf×[\u0091ú¯çºÀ\u000f%\u000f6ØûWËÇ\u000e\u0013+Ü¼\u0099^TiNÒ)ò(/OÈ\u0016\u0095rµ\u0007fçø¿\u0086áuûy\u0083û\u001cÅpq\u000e+-¯\u0094^Z\u000e\b8\u0093òY\u0015¨\u0019g(\u001d,\u008dv\u0002&¾\u008c\u0086Ó\u0081ª>ñª\u0080Ôî\u0096ËÎt\u0012Í\u0007\u001fU\u0004 (D×rÀH\u008b[A7Ò \u008f;ÉHÖÇp]¨ëû²q)¡\u0083Ï)ß\u0080\u008f÷v&m=ÔÙBýÕ\n ¾Á¯«Ý¬t,c\nr\u009cnÀ\u008ek \u0004&:ý\u0012/Gí\u001aõ_&ñE¦\u0018z\u0090Ç\u008e-g\u0019*plP\u0002§\fWÄuhîS¡åF\u0003 (\u001bÌ¼{?9\u008edÕÂ\u0080/ÐÝ;X\u0018ùú!Óg8n\u0087í\u0092Ø¾ÊF \u0090yhý\u0004V®Ãqä\u009b¥Ñe\u0010YÐ\"\u000efçt\u0093\u0086«\u001bf\b\u0002\u009b\u001d\u0001Xãn©sw#4ð§\u0004²æ\u0084ë\u0000ýÌ4\u0016µÃÁí\u009eDp³¸¯uxÃ¸ª\u0010\u008fÚ\u009cOX\u0080¹ßòºQ}ìûIS(Ðíz/.|Ú/\f\u008euµ\u0014A\u001dþÂT\u001dGé\f©Ö\u00144°{rCé}¿Õ+õ ý\u00022\u0016S»ô³ôY\u0093[E\u0095>¸Ê`qß¹wÛºÚü\u0089\u0000ÐR\u0014W Ê\u0016½!¬¯¡Ì\u00ad\u0006Ìû\u0097%PW\u0003LãÙÐÖÅ'@\u008dB\u000fQå#\u0015\u0018¼ä\u000e¢Bü(!UõíkX\u0082´\\{J\u0091\u009djuÇç C\u0011`Ç\u0012\u0004\u0013\u008f\u008f¬<q¸íÖv²µy¬x[]~9 \fí\u001beVU 7\u0010<)£~ëÆ«î\u0085\u008b£\tz\u000e,-Ü(Å¾\u0015\u0083¼\u0099f7\"m\u0083ð\u0018\u0093\u0019ÞIÉ5Æu8N>\u0082\u0006ñ\u0096\u0002\u0084T&¯0\u008e\"\u0086 K¨v\u009b\u0087Á\b±Ðw@×H\u008eÂ\b#àm\u008b\u0015áÔyÔÇj\u0093Ú\u00129ó 1\u0080Ì3ÃÓpÎFÝfQ\u009b6±êQ=üKð-Ó¹\u0087H(½\u009e\u0014\u008ff \n\u0014.®]¡\u0098\u0005\u008c\t\u0080÷(\u0014þ\u0093\u001b\u0086©¤\u0001ö\u000f\u0018ÉZª}\u0082gT\u008c\u0010FÇ\u000f¦ð`ÔE}3\u001e«¹çäÇ q\u008c±-x40÷ÌÇûV}{tÌ\u0004\u0095{ì/SkÐ=¬p\u0095ùQ\nî(\u0003\u0097Ü\u009dóÒ'§\u0010áø!\u0000$sD\u0095ÚÈx\u000e\u0091lmÔ^?\u0006z\r5÷\u008eP/!ü8\u0016\u0085\u0018y&h\u0018úHJ×îwñ\u0013O7së£óÒÎÝëk·\u0010´f\u0090x\u0088\u008c(\u0018ãEÖ¼î\u0082ÆÛ Eþ\u0015d\u001cJÂtÖ\u0013ÁÖJ\r$çÆêa\u0019¿ê\u0081D´\u009bà\u009f<æ\u0085,(u`þÄÙT\u0000i\u0015\u0007¡Ñ§S¢\u000br-}Ö\u008cæ÷W\u0003É\u0014LäQ\u0089Tx\u001f¥þß&\u0085° UÁÌ\u0012CÜ\u0086×Þ0\u000b5]eÞ\u0080³¾\u0000_\u0015/\u001aÓàHÄ«\u008e.¹®\u0010d}6ä\u001ajúX\u0089²?½ÒÎ5@\u0018ßÿ|Ùðì\u0016\u0011Ùp\u008bs\u009a¬U·nÛ©xX¼\u0014F";
        int length = "Ñ}¼ðá]%\u0000?\u0094¶É`ÛÜ\u0082Ê¹à1JÎ2\u001dñ\u001a\u0010M¥¥Ön\u0010\u008eÑÆ¥\u0000î#\u0004;\u000fo\u0083r8\u0092\u0094 \u000bìô l\u008aYHH=*cÂ2@£\u0019\u0097{ï}/ñ\u0018C¬ÃþÖä³ó\u0018ñ6í¨3dº%\u0084¿ b]\r\u0013±þh:ê4\u000bÏ\u0017(}¨\u000f\u0018Xª\u008ba\u007fm\u009b{|\u0006©¶ýôç\u0011\u0010Ã¢Ù*ÍT°.\u0084ü\\¹\u0011ÊÌCaf\u0014 Í'o\u0006&\u009bk\rôôÞºàóÄ\u007f°o\u009e\u0003ª\u0090\t[ò,½4÷\u0086\u008b\u008a ®1|Ìñ.wuáw;\t|¢\u0093i\u0000rr£¯uW\u009b-H\u008c½u%Ô¹\u0018¯\u0013\u009c3\u009eÊAF,mîå\u0010\u009b»uî\u001c!\u0088B\u009b\b 0EF«\u0016ðDôuÄ\u0089Ùñ\\½X\u008eÆ|}½\tÒjA¬\u009e}DJâ]¢Î\u0082Ë1QsÎ1\u008c\u0089¡³\u008aCzG ö÷ÑA\u0094Õ\u0085\u0010\\²sk§?¨\u00835d\u000e\u0096½ç%¾?>ÇÊ\u0095±}c(H\u001b=\u0087\u0097\u001e\u001b^Øw{Z\u001f\u009er\u0092[»×,¾h? ¾ À\u0002\u000e^\u0010²DÎ.Û\u0001\u0098R\u0087 i/m½Ø@°¸\u00828§FzNw³J\u009f=\u000e¡Fñ\u0092Ë\u0098½¹@\u001cX\u0080 *×}\u0001À\u001eas\u001e e=0i /ä®OM^\u001côIQ\u0001A\b\u0098\"\u0089\u0083\u0018wç°`ó\u007fÇNQ\u0096#\u00876\u0099·\u001d\u0012Ó\u000f#ó:\u0013G \u0081*Jÿ¿£Qõ¤\t¶Ú^ruM\u000f£@¸ùÇS@Ääþ\u0011\u0092\u0093\u0018w(\fàú\u009fèzkõïù'¯Q:Ø÷l®Ï\rì\u0018\u008a²:Ù\u0006æ¯h%NºÄEo\u0098v\u001dæ c\u0011ßhz§\u009f\u0087ÐO\u0090ÇÁ\u0014\u0011ÞÒ\u0011}û\b¨k\u001fk©i\u0098ÁA:\u0013(_;}\u008eL¥\u0005@ë\u009eò\u001f·)¯_á\u0095¾{2ð\u0080Ò½<³ÑP\u0005J\u0088ÒEO¿ßXÍM\u0018õ-»ë\u0017¡¶á]Ì\u0086ýËÁZD+r¹\u0092\u0019t¡Þ Öf×[\u0091ú¯çºÀ\u000f%\u000f6ØûWËÇ\u000e\u0013+Ü¼\u0099^TiNÒ)ò(/OÈ\u0016\u0095rµ\u0007fçø¿\u0086áuûy\u0083û\u001cÅpq\u000e+-¯\u0094^Z\u000e\b8\u0093òY\u0015¨\u0019g(\u001d,\u008dv\u0002&¾\u008c\u0086Ó\u0081ª>ñª\u0080Ôî\u0096ËÎt\u0012Í\u0007\u001fU\u0004 (D×rÀH\u008b[A7Ò \u008f;ÉHÖÇp]¨ëû²q)¡\u0083Ï)ß\u0080\u008f÷v&m=ÔÙBýÕ\n ¾Á¯«Ý¬t,c\nr\u009cnÀ\u008ek \u0004&:ý\u0012/Gí\u001aõ_&ñE¦\u0018z\u0090Ç\u008e-g\u0019*plP\u0002§\fWÄuhîS¡åF\u0003 (\u001bÌ¼{?9\u008edÕÂ\u0080/ÐÝ;X\u0018ùú!Óg8n\u0087í\u0092Ø¾ÊF \u0090yhý\u0004V®Ãqä\u009b¥Ñe\u0010YÐ\"\u000efçt\u0093\u0086«\u001bf\b\u0002\u009b\u001d\u0001Xãn©sw#4ð§\u0004²æ\u0084ë\u0000ýÌ4\u0016µÃÁí\u009eDp³¸¯uxÃ¸ª\u0010\u008fÚ\u009cOX\u0080¹ßòºQ}ìûIS(Ðíz/.|Ú/\f\u008euµ\u0014A\u001dþÂT\u001dGé\f©Ö\u00144°{rCé}¿Õ+õ ý\u00022\u0016S»ô³ôY\u0093[E\u0095>¸Ê`qß¹wÛºÚü\u0089\u0000ÐR\u0014W Ê\u0016½!¬¯¡Ì\u00ad\u0006Ìû\u0097%PW\u0003LãÙÐÖÅ'@\u008dB\u000fQå#\u0015\u0018¼ä\u000e¢Bü(!UõíkX\u0082´\\{J\u0091\u009djuÇç C\u0011`Ç\u0012\u0004\u0013\u008f\u008f¬<q¸íÖv²µy¬x[]~9 \fí\u001beVU 7\u0010<)£~ëÆ«î\u0085\u008b£\tz\u000e,-Ü(Å¾\u0015\u0083¼\u0099f7\"m\u0083ð\u0018\u0093\u0019ÞIÉ5Æu8N>\u0082\u0006ñ\u0096\u0002\u0084T&¯0\u008e\"\u0086 K¨v\u009b\u0087Á\b±Ðw@×H\u008eÂ\b#àm\u008b\u0015áÔyÔÇj\u0093Ú\u00129ó 1\u0080Ì3ÃÓpÎFÝfQ\u009b6±êQ=üKð-Ó¹\u0087H(½\u009e\u0014\u008ff \n\u0014.®]¡\u0098\u0005\u008c\t\u0080÷(\u0014þ\u0093\u001b\u0086©¤\u0001ö\u000f\u0018ÉZª}\u0082gT\u008c\u0010FÇ\u000f¦ð`ÔE}3\u001e«¹çäÇ q\u008c±-x40÷ÌÇûV}{tÌ\u0004\u0095{ì/SkÐ=¬p\u0095ùQ\nî(\u0003\u0097Ü\u009dóÒ'§\u0010áø!\u0000$sD\u0095ÚÈx\u000e\u0091lmÔ^?\u0006z\r5÷\u008eP/!ü8\u0016\u0085\u0018y&h\u0018úHJ×îwñ\u0013O7së£óÒÎÝëk·\u0010´f\u0090x\u0088\u008c(\u0018ãEÖ¼î\u0082ÆÛ Eþ\u0015d\u001cJÂtÖ\u0013ÁÖJ\r$çÆêa\u0019¿ê\u0081D´\u009bà\u009f<æ\u0085,(u`þÄÙT\u0000i\u0015\u0007¡Ñ§S¢\u000br-}Ö\u008cæ÷W\u0003É\u0014LäQ\u0089Tx\u001f¥þß&\u0085° UÁÌ\u0012CÜ\u0086×Þ0\u000b5]eÞ\u0080³¾\u0000_\u0015/\u001aÓàHÄ«\u008e.¹®\u0010d}6ä\u001ajúX\u0089²?½ÒÎ5@\u0018ßÿ|Ùðì\u0016\u0011Ùp\u008bs\u009a¬U·nÛ©xX¼\u0014F".length();
        char cCharAt = ' ';
        int i8 = -1;
        while (true) {
            int i9 = i8 + 1;
            String strSubstring = str.substring(i9, i9 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i10 = i7;
                        i7++;
                        strArr[i10] = strIntern;
                        int i11 = i9 + cCharAt;
                        i2 = i11;
                        if (i11 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            d = strArr;
                            e = new String[49];
                            i = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i12 = 1; i12 < 8; i12++) {
                                bArr2[i12] = (byte) ((j2 << (i12 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[19];
                            int i13 = 0;
                            String str3 = "\u0006\u0089NM$\u0014\u008f ´\u0005ÎÄ@:\u000f\u007f\u007f\u0000\u000e\f£\u0007¨V^\u0004\fÊ¾ª¥äã\f\u001c\u0096Þ¸ÉÄ#\u0001X\u001d\u0000³\\S/\u000fVÔ\f\u009d® \u0001mñçy\f:£õ\t#\u0099¤éÈ\u0088\u008bP\u0016DK\r[|À\u0011P'ß\u001aÎ\u0010´ÄÚÿ§§ß\u000eb\u0086\u0081\u009dÞÓ\"G\u0018lé\u008e\u0090\n±úeX\b¿\u0017¡¼\u001e\u0006\u008cÑQÂÃ{YggS\u0086P7\u0001\u000e";
                            int length2 = "\u0006\u0089NM$\u0014\u008f ´\u0005ÎÄ@:\u000f\u007f\u007f\u0000\u000e\f£\u0007¨V^\u0004\fÊ¾ª¥äã\f\u001c\u0096Þ¸ÉÄ#\u0001X\u001d\u0000³\\S/\u000fVÔ\f\u009d® \u0001mñçy\f:£õ\t#\u0099¤éÈ\u0088\u008bP\u0016DK\r[|À\u0011P'ß\u001aÎ\u0010´ÄÚÿ§§ß\u000eb\u0086\u0081\u009dÞÓ\"G\u0018lé\u008e\u0090\n±úeX\b¿\u0017¡¼\u001e\u0006\u008cÑQÂÃ{YggS\u0086P7\u0001\u000e".length();
                            int i14 = 0;
                            while (true) {
                                int i15 = i14;
                                i14 += 8;
                                byte[] bytes = str3.substring(i15, i14).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i16 = i13;
                                i13++;
                                long j11 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j12 = j11;
                                    int i17 = i16;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j12 >>> 56), (byte) (j12 >>> 48), (byte) (j12 >>> 40), (byte) (j12 >>> 32), (byte) (j12 >>> 24), (byte) (j12 >>> 16), (byte) (j12 >>> 8), (byte) j12});
                                    long j13 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i17) {
                                        case 0:
                                            jArr2[b5] = j13;
                                            if (i14 >= length2) {
                                                g = jArr;
                                                h = new Integer[19];
                                                KProperty[] kPropertyArr = new KProperty[(int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18154, 9059342528264850582L ^ j2) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(u0.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9053, 725963076812438059L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31521, 1278856019583378009L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(u0.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11192, 392776745338794713L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3775, 3298506252926932956L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(u0.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24102, 4600449134625687398L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2404, 1584465733547937827L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.property1(new PropertyReference1Impl(u0.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17423, 6010031148457467214L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28323, 5061584151030020047L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.property1(new PropertyReference1Impl(u0.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29564, 9218127323950557711L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30240, 5449003102243204956L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.property1(new PropertyReference1Impl(u0.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15453, 8099027107354699063L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28230, 3797560408282183473L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(22281, 1079588473890332023L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(u0.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6582, 1092964485174476998L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13833, 3158290026828066634L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20878, 2383157711666109432L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(u0.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18189, 1965349051506433654L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26427, 3595762782255398493L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26622, 5866534333679660426L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(u0.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30438, 1444557495290507159L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26623, 6803373687241686683L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30334, 1139183854582299659L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(u0.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4234, 1301231563100277199L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5212, 7496814112737250622L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7016, 3979031556224192785L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(u0.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31117, 613104627142467780L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13418, 1317629725997624615L ^ j2) /* invoke-custom */, 0));
                                                kPropertyArr[(int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17391, 8986442288217737629L ^ j2) /* invoke-custom */] = Reflection.property1(new PropertyReference1Impl(u0.class, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8725, 245090065463507801L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29154, 2054155227321378966L ^ j2) /* invoke-custom */, 0));
                                                U = kPropertyArr;
                                                a = new u0(j10);
                                                l = yp.t(a, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28389, 4224382234903558028L ^ j2) /* invoke-custom */, true, j5, null, null, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13192, 1100291429959023086L ^ j2) /* invoke-custom */, null);
                                                B = yp.t(a, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24659, 5775582188631111988L ^ j2) /* invoke-custom */, true, j5, null, null, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13192, 1100291429959023086L ^ j2) /* invoke-custom */, null);
                                                P = yp.t(a, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31012, 5624192967264608342L ^ j2) /* invoke-custom */, true, j5, null, null, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13192, 1100291429959023086L ^ j2) /* invoke-custom */, null);
                                                k = yp.t(a, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31365, 2208114592135062504L ^ j2) /* invoke-custom */, false, j5, null, null, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13192, 1100291429959023086L ^ j2) /* invoke-custom */, null);
                                                u = yp.t(a, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1014, 7435428796208274077L ^ j2) /* invoke-custom */, true, j5, null, null, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13192, 1100291429959023086L ^ j2) /* invoke-custom */, null);
                                                j = yp.J(a, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3199, 7368101867656467729L ^ j2) /* invoke-custom */, new lj(0, false, j6, false, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20878, 2383157711666109432L ^ j2) /* invoke-custom */, null), null, i3, null, i4, (char) i5, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13192, 1100291429959023086L ^ j2) /* invoke-custom */, null);
                                                D = yp.t(a, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8441, 3126388138088200583L ^ j2) /* invoke-custom */, false, j5, null, null, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13192, 1100291429959023086L ^ j2) /* invoke-custom */, null);
                                                b = yp.t(a, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13957, 635905767792537550L ^ j2) /* invoke-custom */, true, j5, null, null, (int) c(MethodHandles.lookup(), "b", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13192, 1100291429959023086L ^ j2) /* invoke-custom */, null);
                                                O = yp.h(a, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2341, 4082020830062727248L ^ j2) /* invoke-custom */, j9, w7.BOOLS, u0::H);
                                                L = yp.l(j7, a, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24305, 5172766730038675358L ^ j2) /* invoke-custom */, true, a.s(j4), u0::C);
                                                w = yp.l(j7, a, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27977, 1582361363339883564L ^ j2) /* invoke-custom */, true, a.s(j4), u0::I);
                                                o = yp.l(j7, a, (String) b(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13344, 3278978605089025375L ^ j2) /* invoke-custom */, true, a.s(j4), u0::n);
                                                t = new i9(j3);
                                                E = new ArrayList();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j13;
                                            if (i14 >= length2) {
                                                str3 = "j\u001a¤×>\u0006\u00138!#\u0012ÀZtÖf";
                                                length2 = "j\u001a¤×>\u0006\u00138!#\u0012ÀZtÖf".length();
                                                i14 = 0;
                                            }
                                            break;
                                    }
                                    int i18 = i14;
                                    i14 += 8;
                                    byte[] bytes2 = str3.substring(i18, i14).getBytes("ISO-8859-1");
                                    jArr2 = jArr;
                                    i16 = i13;
                                    i13++;
                                    j11 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b4 = 0;
                                }
                            }
                        }
                        break;
                    default:
                        int i19 = i7;
                        i7++;
                        strArr[i19] = strIntern;
                        int i20 = i9 + cCharAt;
                        i8 = i20;
                        if (i20 < length) {
                        }
                        str = "éçÊèÍ ÕN\u000b?\u0013eç\u00910\u0092\u007fBrH2¿\u008a¾É\u0089\u0094êÊÜF8äQö\u009d\u000eõÀ\u0018\u00182¬ÚÀ2á*¦Õ(\u0090\u008b½/\u0019~*\u0085\"\u0094æ\u0004{Â";
                        length = "éçÊèÍ ÕN\u000b?\u0013eç\u00910\u0092\u007fBrH2¿\u008a¾É\u0089\u0094êÊÜF8äQö\u009d\u000eõÀ\u0018\u00182¬ÚÀ2á*¦Õ(\u0090\u008b½/\u0019~*\u0085\"\u0094æ\u0004{Â".length();
                        cCharAt = '(';
                        i2 = -1;
                        break;
                        break;
                }
                i9 = i2 + 1;
                strSubstring = str.substring(i9, i9 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i8);
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

    private static String b(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 25766;
        if (e[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) f.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                e[i3] = b(((Cipher) objArr[0]).doFinal(d[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/u0", e2);
            }
        }
        return e[i3];
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
            r1 = 5
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
            java.lang.String r1 = "su/catlean/u0"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u0.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 14268;
        if (h[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) g[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) i.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/u0", e2);
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
            r1 = 5
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
            java.lang.String r1 = "su/catlean/u0"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.u0.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
