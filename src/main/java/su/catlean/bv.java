package su.catlean;

import com.google.common.collect.Queues;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/bv.class */
public final class bv {

    @NotNull
    public static final bv n;

    @NotNull
    private static final ConcurrentLinkedQueue u;

    @NotNull
    private static final ConcurrentLinkedQueue s;

    @Nullable
    private static class_1657 S;

    @Nullable
    private static class_243 r;

    @Nullable
    private static class_243 R;
    private static long U;
    private static final long a = yz.a(170663042456987575L, -7070276741611711763L, MethodHandles.lookup().lookupClass()).a(209365014410064L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    private bv() {
    }

    @Nullable
    public final class_1657 S() {
        return S;
    }

    public final void k(@Nullable class_1657 class_1657Var) {
        S = class_1657Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Type inference failed for: r0v10, types: [net.minecraft.class_243] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13, types: [net.minecraft.class_243] */
    /* JADX WARN: Type inference failed for: r0v14, types: [net.minecraft.class_243] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(long r11, @org.jetbrains.annotations.NotNull su.catlean.api.event.events.render.Render3DEvent r13) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.bv.X(long, su.catlean.api.event.events.render.Render3DEvent):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:64:0x013f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final void M(long r11, @org.jetbrains.annotations.NotNull su.catlean.api.event.events.network.ReceivePacket r13) {
        /*
            Method dump skipped, instruction units count: 1280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.bv.M(long, su.catlean.api.event.events.network.ReceivePacket):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f A[PHI: r0 r1
  0x008f: PHI (r0v18 ??) = (r0v15 ??), (r0v26 ??) binds: [B:14:0x0064, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE]
  0x008f: PHI (r1v14 ??) = (r1v12 ??), (r1v17 ??) binds: [B:14:0x0064, B:23:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [su.catlean.um] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.minecraft.class_1297] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, net.minecraft.class_1297] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.minecraft.class_1297] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v42, types: [net.minecraft.class_1657] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(long r9) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.bv.t(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ec A[PHI: r0
  0x00ec: PHI (r0v39 ??) = (r0v44 ??), (r0v45 ??) binds: [B:37:0x00db, B:39:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [net.minecraft.class_638] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, net.minecraft.class_1657] */
    /* JADX WARN: Type inference failed for: r0v33, types: [net.minecraft.class_1657] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43, types: [net.minecraft.class_1657] */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(int r8, short r9, int r10) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.bv.Z(int, short, int):void");
    }

    public final void q(boolean clear) {
        ConcurrentLinkedQueue concurrentLinkedQueue = u;
        Function1 function1 = (v1) -> {
            return W(r1, v1);
        };
        concurrentLinkedQueue.removeIf((v1) -> {
            return J(r1, v1);
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v0, types: [su.catlean.bv] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static void S(bv bvVar, boolean z, long j, int i, Object obj) {
        long j2 = a ^ j;
        ?? r0 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4436040484472832881L, j2) /* invoke-custom */;
        try {
            r0 = i & 1;
            ?? r7 = z;
            ?? r02 = r0;
            if (r0 != 0) {
                r7 = r02;
            } else if (r0 != 0) {
                r02 = 0;
                r7 = r02;
            }
            bvVar.q(r7);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 4408084196438253015L, j2) /* invoke-custom */;
        }
    }

    public final void i() {
        ConcurrentLinkedQueue concurrentLinkedQueue = u;
        Function1 function1 = bv::Q;
        concurrentLinkedQueue.removeIf((v1) -> {
            return M(r1, v1);
        });
        S = null;
        r = null;
    }

    private static final boolean R(class_2596 class_2596Var) {
        long j = a ^ 26284119663826L;
        long j2 = j ^ 53117310466903L;
        bv bvVar = n;
        try {
            Result.Companion companion = Result.Companion;
            Intrinsics.checkNotNull(class_2596Var, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6966, 2156052413840150729L ^ j) /* invoke-custom */);
            class_2596Var.method_65081(zf.k(j2));
            Result.m185constructorimpl(Unit.INSTANCE);
            return true;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m185constructorimpl(ResultKt.createFailure(th));
            return true;
        }
    }

    private static final boolean f(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:7:0x0028
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private static final boolean W(boolean r8, su.catlean.d r9) {
        /*
            long r0 = su.catlean.bv.a
            r1 = 48237524535280(0x2bdf2c83c7f0, double:2.3832503713306E-310)
            long r0 = r0 ^ r1
            r10 = r0
            r0 = r10
            r1 = r0; r1 = r0; 
            r2 = 23400582388069(0x15485f669965, double:1.15614238506226E-310)
            long r1 = r1 ^ r2
            r12 = r1
            r0 = 5582566558457430014(0x4d7942b50bd47ffe, double:1.6626556543464648E65)
            r1 = r10
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r14 = r0
            r0 = r8
            r1 = r14
            if (r1 == 0) goto L67
            if (r0 != 0) goto L66
            goto L32
        L28:
            r1 = 5575421299761048996(0x4d5fe021dd676da4, double:5.245130805728529E64)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L4c
            throw r0     // Catch: java.lang.NumberFormatException -> L4c
        L32:
            r0 = r9
            long r0 = r0.d()     // Catch: java.lang.NumberFormatException -> L4c java.lang.NumberFormatException -> L5c
            long r1 = su.catlean.zf.A()     // Catch: java.lang.NumberFormatException -> L4c java.lang.NumberFormatException -> L5c
            su.catlean.um r2 = su.catlean.um.E     // Catch: java.lang.NumberFormatException -> L4c java.lang.NumberFormatException -> L5c
            r3 = r12
            int r2 = r2.A(r3)     // Catch: java.lang.NumberFormatException -> L4c java.lang.NumberFormatException -> L5c
            long r2 = (long) r2     // Catch: java.lang.NumberFormatException -> L4c java.lang.NumberFormatException -> L5c
            long r1 = r1 - r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = r14
            if (r1 == 0) goto L67
            goto L56
        L4c:
            r1 = 5575421299761048996(0x4d5fe021dd676da4, double:5.245130805728529E64)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L5c
            throw r0     // Catch: java.lang.NumberFormatException -> L5c
        L56:
            if (r0 > 0) goto L6a
            goto L66
        L5c:
            r1 = 5575421299761048996(0x4d5fe021dd676da4, double:5.245130805728529E64)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L66:
            r0 = 1
        L67:
            goto L6b
        L6a:
            r0 = 0
        L6b:
            r15 = r0
            r0 = r15
            r16 = r0
            r0 = 0
            r17 = r0
            r0 = r16
            r1 = r14
            if (r1 == 0) goto La6
            if (r0 == 0) goto La3
            goto L8b
        L81:
            r1 = 5575421299761048996(0x4d5fe021dd676da4, double:5.245130805728529E64)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L99
            throw r0     // Catch: java.lang.NumberFormatException -> L99
        L8b:
            java.util.concurrent.ConcurrentLinkedQueue r0 = su.catlean.bv.s     // Catch: java.lang.NumberFormatException -> L99
            r1 = r9
            net.minecraft.class_2596 r1 = r1.f()     // Catch: java.lang.NumberFormatException -> L99
            boolean r0 = r0.add(r1)     // Catch: java.lang.NumberFormatException -> L99
            goto La3
        L99:
            r1 = 5575421299761048996(0x4d5fe021dd676da4, double:5.245130805728529E64)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        La3:
            r0 = r15
        La6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.bv.W(boolean, su.catlean.d):boolean");
    }

    private static final boolean J(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    private static final boolean Q(d dVar) {
        long j = a ^ 35584092814521L;
        long j2 = j ^ 8753021739836L;
        bv bvVar = n;
        try {
            Result.Companion companion = Result.Companion;
            class_2596 class_2596VarF = dVar.f();
            Intrinsics.checkNotNull(class_2596VarF, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4713, 7704413136613786108L ^ j) /* invoke-custom */);
            class_2596VarF.method_65081(zf.k(j2));
            Result.m185constructorimpl(Unit.INSTANCE);
            return true;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m185constructorimpl(ResultKt.createFailure(th));
            return true;
        }
    }

    private static final boolean M(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    static {
        int i;
        long j = a ^ 13446951276270L;
        d = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[6];
        int i3 = 0;
        String str = "æViUÉöa£\u001c¯¬\u001c¼xÙ\u00ad¨\u0081jx!ÈÐ\t\u0089d°bäi\u0080×\u0090ì±û[CxÆ7]?v¢\u001cJ/8¨\u0005ó\u0005c\u0095_}1p×\u007fJ´avË0\u001e\u0014£Û´õúÞ9§ìTï\u0019\u0014E¬\u0083÷mÙ\bQ¥5,\u0017p\u001d7à-rØuQøªàfeZ\u008e\u0083ñãj*®\u0088íZR¡»mÇ\u009fõ¦bCj¦ôÀ\u0087\u0017N\u0092©æè\u0005|öÝø\u008c°GüªÚ\u0085\u001cÐ$\f\u0097j\fB\u008bÑC\"r\u008f1÷¡¡Rk&^\u0018/!j²Í-¤Õ]Dú\u009ff#Ãé\u008e#Ñ¢Ï3pZ4ã\u0080\u0098_[TÆ¤Ç\u0080iVb\u0005ÖÌc2jvX\\p\u0016%\u0012\tô\u009b¤\u0089\u0084ñ\u001dÒÀDlµ2\u008bí&îëdw¸À>¶\u0081\u0080}BéÈ\u00865:¹dÏ\u0094\u000e¬$9Ø$3ÓôI¿yÑM+\u008a\n±\u0096\u001c\u0095¨OVU]âÕ\u0002Zx;!w¹ã\u0017\u009b¹»è\u000bE\u0088\u00846FV\u0016\u001dPÕ«s\u0012:\u0093\u001f/\u0004\u0019Åù/\u000b\u009bàR\u009aÞ\u0004P?\u0080ðº\u009a3ÿ\u00976¯Ø\u0012 Û\u008b²éìÁæÖ®\u0085w\u0019´\u0015\u0003\u0099\u0006A!I\u008a\"ÑQ\u001aø\u008dó\nÐ7\u0003\u0006,\u0081´\u009e+\u0003øLWÙÄ\u0093P¯[à+k\u00ad¦¨cJ\u0098U\u0016\u001eÚó\u0090ë\u0081wWRz ¡á\u001e7¦\u0099ÜKe7pO\u0095p\u001f\u001a\u0089ó\u008dJÇPWôäeX\n,ÌÍ°(Y9\u001f´¨±¤p5\u0007ö\u008a±\u000bå©£ÚX\u0002\u008fw¤y\r¥k\u001d\u008f{\u0086B\tOM\u0097»\u0089ÆB±«;\u009f!Ä9»Z{\u0092È.j5¦\u0013¿£N\u0084Ó\t\u0011·#\u0087\u0005¢zÒidÅ)ÔkTþ\u0081ù\u0017º\u000f)\u0016á#ÔU\u0087ÿ(¹\u0010%IñF:NG+";
        int length = "æViUÉöa£\u001c¯¬\u001c¼xÙ\u00ad¨\u0081jx!ÈÐ\t\u0089d°bäi\u0080×\u0090ì±û[CxÆ7]?v¢\u001cJ/8¨\u0005ó\u0005c\u0095_}1p×\u007fJ´avË0\u001e\u0014£Û´õúÞ9§ìTï\u0019\u0014E¬\u0083÷mÙ\bQ¥5,\u0017p\u001d7à-rØuQøªàfeZ\u008e\u0083ñãj*®\u0088íZR¡»mÇ\u009fõ¦bCj¦ôÀ\u0087\u0017N\u0092©æè\u0005|öÝø\u008c°GüªÚ\u0085\u001cÐ$\f\u0097j\fB\u008bÑC\"r\u008f1÷¡¡Rk&^\u0018/!j²Í-¤Õ]Dú\u009ff#Ãé\u008e#Ñ¢Ï3pZ4ã\u0080\u0098_[TÆ¤Ç\u0080iVb\u0005ÖÌc2jvX\\p\u0016%\u0012\tô\u009b¤\u0089\u0084ñ\u001dÒÀDlµ2\u008bí&îëdw¸À>¶\u0081\u0080}BéÈ\u00865:¹dÏ\u0094\u000e¬$9Ø$3ÓôI¿yÑM+\u008a\n±\u0096\u001c\u0095¨OVU]âÕ\u0002Zx;!w¹ã\u0017\u009b¹»è\u000bE\u0088\u00846FV\u0016\u001dPÕ«s\u0012:\u0093\u001f/\u0004\u0019Åù/\u000b\u009bàR\u009aÞ\u0004P?\u0080ðº\u009a3ÿ\u00976¯Ø\u0012 Û\u008b²éìÁæÖ®\u0085w\u0019´\u0015\u0003\u0099\u0006A!I\u008a\"ÑQ\u001aø\u008dó\nÐ7\u0003\u0006,\u0081´\u009e+\u0003øLWÙÄ\u0093P¯[à+k\u00ad¦¨cJ\u0098U\u0016\u001eÚó\u0090ë\u0081wWRz ¡á\u001e7¦\u0099ÜKe7pO\u0095p\u001f\u001a\u0089ó\u008dJÇPWôäeX\n,ÌÍ°(Y9\u001f´¨±¤p5\u0007ö\u008a±\u000bå©£ÚX\u0002\u008fw¤y\r¥k\u001d\u008f{\u0086B\tOM\u0097»\u0089ÆB±«;\u009f!Ä9»Z{\u0092È.j5¦\u0013¿£N\u0084Ó\t\u0011·#\u0087\u0005¢zÒidÅ)ÔkTþ\u0081ù\u0017º\u000f)\u0016á#ÔU\u0087ÿ(¹\u0010%IñF:NG+".length();
        char cCharAt = '0';
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
                        if (i7 >= length) {
                            b = strArr;
                            c = new String[6];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[3];
                            int i9 = 0;
                            int length2 = "xÍ¢$\u0084\u0088Ó´Éæ\u0094Ø-ÊX\u0085§\u0087'\u0001\u0001F¶Â".length();
                            int i10 = 0;
                            do {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = "xÍ¢$\u0084\u0088Ó´Éæ\u0094Ø-ÊX\u0085§\u0087'\u0001\u0001F¶Â".substring(i11, i10).getBytes("ISO-8859-1");
                                i9++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i10 < length2);
                            e = jArr;
                            f = new Integer[3];
                            n = new bv();
                            ConcurrentLinkedQueue concurrentLinkedQueueNewConcurrentLinkedQueue = Queues.newConcurrentLinkedQueue();
                            Intrinsics.checkNotNullExpressionValue(concurrentLinkedQueueNewConcurrentLinkedQueue, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1851, 5067219818830358266L ^ j) /* invoke-custom */);
                            u = concurrentLinkedQueueNewConcurrentLinkedQueue;
                            ConcurrentLinkedQueue concurrentLinkedQueueNewConcurrentLinkedQueue2 = Queues.newConcurrentLinkedQueue();
                            Intrinsics.checkNotNullExpressionValue(concurrentLinkedQueueNewConcurrentLinkedQueue2, (String) a(MethodHandles.lookup(), "i", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14421, 6632717539217365397L ^ j) /* invoke-custom */);
                            s = concurrentLinkedQueueNewConcurrentLinkedQueue2;
                            U = zf.A();
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i12 = i3;
                        i3++;
                        strArr[i12] = strIntern;
                        int i13 = i5 + cCharAt;
                        i4 = i13;
                        if (i13 < length) {
                        }
                        str = "QµÛ¯77ÜÞÝù{l\u0001úÌHx×ºfÒ\"Úu\t\u0001ÖÄÛw\u0080åÂ\n\u0005ÃJLIéw\u0018\u0000<[\u0085ÝI\u0001»Bøí\u0004-\u001c©xÖ\u0089Ær(¥ÏÁóª0ì\"\u0080âÈùY\u0007\u007f\u008fâE\n\u00163Äú\u0011C\u0081ð\u00104SñçÙÓ\u0089\u0096S\u0086\u007f>\u0002\u0014yÆW\u0084éW\u0094%Z\bø\u0090é5Ü*\u008aÊãÈïtØ÷Z¡¿fÅ¦\u0018n";
                        length = "QµÛ¯77ÜÞÝù{l\u0001úÌHx×ºfÒ\"Úu\t\u0001ÖÄÛw\u0080åÂ\n\u0005ÃJLIéw\u0018\u0000<[\u0085ÝI\u0001»Bøí\u0004-\u001c©xÖ\u0089Ær(¥ÏÁóª0ì\"\u0080âÈùY\u0007\u007f\u008fâE\n\u00163Äú\u0011C\u0081ð\u00104SñçÙÓ\u0089\u0096S\u0086\u007f>\u0002\u0014yÆW\u0084éW\u0094%Z\bø\u0090é5Ü*\u008aÊãÈïtØ÷Z¡¿fÅ¦\u0018n".length();
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 25697;
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
                throw new RuntimeException("su/catlean/bv", e2);
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
            java.lang.String r1 = "su/catlean/bv"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.bv.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 5785;
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
                    throw new RuntimeException("su/catlean/bv", e2);
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
            java.lang.String r1 = "su/catlean/bv"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.bv.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
