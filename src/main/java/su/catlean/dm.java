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
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1675;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2848;
import net.minecraft.class_304;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.player.StopUsingItemEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.KeyMappingAccessor;
import su.catlean.mixins.accessors.LocalPlayerAccessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/dm.class */
public final class dm {

    @NotNull
    public static final dm h;
    private static int H;
    private static float R;
    private static float K;
    private static boolean Q;
    private static boolean w;
    private static long i;
    private static long z;
    private static long u;
    private static double S;
    private static boolean M;
    private static _g[] n;
    private static final long a = yz.a(-265864172261133626L, 338618076458484166L, MethodHandles.lookup().lookupClass()).a(220459146735406L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final long[] j;
    private static final Long[] k;
    private static final Map l;

    private dm() {
    }

    public final int Z() {
        return H;
    }

    public final void I(int i2) {
        H = i2;
    }

    public final float r() {
        return R;
    }

    public final void X(float f2) {
        R = f2;
    }

    public final float H() {
        return K;
    }

    public final void Q(float f2) {
        K = f2;
    }

    public final boolean J() {
        return Q;
    }

    public final void E(boolean z2) {
        Q = z2;
    }

    public final boolean I() {
        return w;
    }

    public final void V(boolean z2) {
        w = z2;
    }

    public final long L() {
        return i;
    }

    public final void c(long j2) {
        i = j2;
    }

    public final long A() {
        return z;
    }

    public final void y(long j2) {
        z = j2;
    }

    public final long q() {
        return u;
    }

    public final void R(long j2) {
        u = j2;
    }

    public final double o() {
        return S;
    }

    public final void c(double d2) {
        S = d2;
    }

    public final boolean W() {
        return M;
    }

    public final void r(boolean z2) {
        M = z2;
    }

    public final float U(long j2) {
        long j3 = a ^ j2;
        LocalPlayerAccessor localPlayerAccessorV = zf.v(j3 ^ 26846181185767L);
        Intrinsics.checkNotNull(localPlayerAccessorV, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12117, 8137856535093275613L ^ j3) /* invoke-custom */);
        return localPlayerAccessorV.getLastYaw();
    }

    public final float w(long j2) {
        long j3 = a ^ j2;
        LocalPlayerAccessor localPlayerAccessorV = zf.v(j3 ^ 130469340436106L);
        Intrinsics.checkNotNull(localPlayerAccessorV, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28670, 1212775109831238912L ^ j3) /* invoke-custom */);
        return localPlayerAccessorV.getLastPitch();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final net.minecraft.class_243 S(long r8) {
        /*
            r7 = this;
            long r0 = su.catlean.dm.a
            r1 = r8
            long r0 = r0 ^ r1
            r8 = r0
            r0 = r8
            r1 = r0; r1 = r0; 
            r2 = 5680393519727(0x52a91d6826f, double:2.8064872929564E-311)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 105460485472641(0x5fea6ec64181, double:5.2104402865772E-310)
            long r1 = r1 ^ r2
            r12 = r1
            r1 = r0; r2 = r0; 
            r2 = 66913392022751(0x3cdb7cf654df, double:3.3059608245149E-310)
            long r1 = r1 ^ r2
            r14 = r1
            r0 = -8720713708772821247(0x86f9cd1610b77701, double:-4.657603299586174E-275)
            r1 = r8
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r16 = r0
            su.catlean.us r0 = su.catlean.us.z     // Catch: java.lang.NumberFormatException -> L3a
            r1 = r16
            if (r1 != 0) goto L54
            r1 = r12
            boolean r0 = r0.f(r1)     // Catch: java.lang.NumberFormatException -> L3a java.lang.NumberFormatException -> L4a
            if (r0 == 0) goto L86
            goto L44
        L3a:
            r1 = -8758298552144775192(0x867445deca97b7e8, double:-1.429553930479616E-277)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L4a
            throw r0     // Catch: java.lang.NumberFormatException -> L4a
        L44:
            su.catlean.us r0 = su.catlean.us.z     // Catch: java.lang.NumberFormatException -> L4a
            goto L54
        L4a:
            r1 = -8758298552144775192(0x867445deca97b7e8, double:-1.429553930479616E-277)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L54:
            net.minecraft.class_243 r0 = r0.l()     // Catch: java.lang.NumberFormatException -> L62
            r1 = r16
            if (r1 != 0) goto L83
            if (r0 == 0) goto L86
            goto L6c
        L62:
            r1 = -8758298552144775192(0x867445deca97b7e8, double:-1.429553930479616E-277)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L79
            throw r0     // Catch: java.lang.NumberFormatException -> L79
        L6c:
            su.catlean.us r0 = su.catlean.us.z     // Catch: java.lang.NumberFormatException -> L79
            net.minecraft.class_243 r0 = r0.l()     // Catch: java.lang.NumberFormatException -> L79
            r1 = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.NumberFormatException -> L79
            goto L83
        L79:
            r1 = -8758298552144775192(0x867445deca97b7e8, double:-1.429553930479616E-277)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L83:
            goto L94
        L86:
            r0 = r14
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)
            r1 = r10
            r2 = r1; r1 = r0; r0 = r2; 
            net.minecraft.class_1297 r1 = (net.minecraft.class_1297) r1
            net.minecraft.class_243 r0 = su.catlean.p4.K(r0, r1)
        L94:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dm.S(long):net.minecraft.class_243");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:46:0x00ea
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void i(su.catlean.api.event.events.network.SendPacket r8) {
        /*
            Method dump skipped, instruction units count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dm.i(su.catlean.api.event.events.network.SendPacket):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [long] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    @Flow
    private final void h(StopUsingItemEvent stopUsingItemEvent) {
        long j2 = a ^ 44350552975456L;
        Object objA = j2;
        try {
            if (Intrinsics.areEqual(zf.v(objA ^ 4058478915643L).method_6030().method_7909(), class_1802.field_8233)) {
                objA = zf.A();
                u = objA;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objA, 7102311531350610700L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:26:0x00a9
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void J(su.catlean.api.event.events.network.ReceivePacket r9) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dm.J(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ad, code lost:
    
        if (r0 != 0) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01be A[PHI: r0
  0x01be: PHI (r0v55 ??) = (r0v79 ??), (r0v63 ??), (r0v80 ??) binds: [B:47:0x0153, B:64:0x01b0, B:53:0x017c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [su.catlean.api.event.GofraState] */
    /* JADX WARN: Type inference failed for: r0v36, types: [double] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v69, types: [int] */
    /* JADX WARN: Type inference failed for: r0v70, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v9, types: [net.minecraft.class_746] */
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
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void k(su.catlean.api.event.events.client.TickEvent r8) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dm.k(su.catlean.api.event.events.client.TickEvent):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:25:0x0081
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void V(su.catlean.api.event.events.player.MoveEvent r8) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dm.V(su.catlean.api.event.events.player.MoveEvent):void");
    }

    public final long K() {
        return System.currentTimeMillis() - i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (r0 == 0) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053 A[Catch: NumberFormatException -> 0x006b, NumberFormatException -> 0x007b, TRY_ENTER, TryCatch #5 {NumberFormatException -> 0x006b, blocks: (B:13:0x004d, B:15:0x0053), top: B:57:0x004d, outer: #4 }] */
    /* JADX WARN: Type inference failed for: r0v11, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v34, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Y(long r8) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dm.Y(long):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @org.jetbrains.annotations.NotNull
    public final double[] F(int r8, float r9, boolean r10, float r11, long r12, float r14, float r15) {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dm.F(int, float, boolean, float, long, float, float):double[]");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:16:0x0066
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public static double[] O(su.catlean.dm r10, float r11, boolean r12, float r13, long r14, float r16, float r17, int r18, java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dm.O(su.catlean.dm, float, boolean, float, long, float, float, int, java.lang.Object):double[]");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final void Y(int r9, short r10, @org.jetbrains.annotations.NotNull su.catlean.api.event.events.player.MoveEvent r11, char r12, double r13) {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dm.Y(int, short, su.catlean.api.event.events.player.MoveEvent, char, double):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    public final float b(int r8, long r9) {
        /*
            Method dump skipped, instruction units count: 805
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dm.b(int, long):float");
    }

    @NotNull
    public final double[] H(char a2, short a3, double d2, int a4) {
        class_746 class_746Var = zf.F(((((((long) a2) << 48) | ((((long) a3) << 48) >>> 16)) | ((((long) a4) << 32) >>> 32)) ^ a) ^ 105006746069620L).field_1724;
        Intrinsics.checkNotNull(class_746Var);
        float fMethod_36454 = class_746Var.method_36454();
        return new double[]{d2 * Math.cos(Math.toRadians(fMethod_36454 + 90.0f)), d2 * Math.sin(Math.toRadians(fMethod_36454 + 90.0f))};
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v45, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    @Nullable
    public final class_1297 N(float yaw, float pitch, long a2, float distance, boolean ignoreWalls, boolean onlyLiving) {
        long j2 = a ^ a2;
        long j3 = j2 ^ 26870522113002L;
        long j4 = j2 ^ 53460783544142L;
        long j5 = j2 ^ 36840800009562L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1189847173365424508L, j2) /* invoke-custom */;
        class_239 class_239VarR = ignoreWalls ? null : r(distance, yaw, j4, pitch);
        class_243 class_243VarMethod_1031 = p4.K(j3, zf.v(j5)).method_1031(0.0d, zf.v(j5).method_18381(zf.v(j5).method_18376()), 0.0d);
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1031, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18236, 2488127476830070274L ^ j2) /* invoke-custom */);
        double dPow = (float) Math.pow(distance, 2);
        class_239 class_239Var = class_239VarR;
        if (_gVarArr != null) {
            dPow = class_239Var.method_17784().method_1025(class_243VarMethod_1031);
        } else if (class_239Var != null) {
            class_239Var = class_239VarR;
            dPow = class_239Var.method_17784().method_1025(class_243VarMethod_1031);
        }
        class_243 class_243VarY = y(pitch, yaw);
        class_243 class_243VarMethod_10312 = class_243VarMethod_1031.method_1031(class_243VarY.field_1352 * ((double) distance), class_243VarY.field_1351 * ((double) distance), class_243VarY.field_1350 * ((double) distance));
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_10312, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9058, 1726623941813568083L ^ j2) /* invoke-custom */);
        class_238 class_238VarMethod_1009 = zf.v(j5).method_5829().method_18804(class_243VarY.method_1021(distance)).method_1009(1.0d, 1.0d, 1.0d);
        Intrinsics.checkNotNullExpressionValue(class_238VarMethod_1009, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24193, 260100016325885873L ^ j2) /* invoke-custom */);
        class_3966 class_3966VarMethod_18075 = class_1675.method_18075(zf.v(j5), class_243VarMethod_1031, class_243VarMethod_10312, class_238VarMethod_1009, (v1) -> {
            return k(r4, v1);
        }, dPow);
        Object obj = class_3966VarMethod_18075;
        if (obj == 0) {
            return null;
        }
        try {
            try {
                try {
                    obj = (class_243VarMethod_1031.method_1025(class_3966VarMethod_18075.method_17784()) > dPow ? 1 : (class_243VarMethod_1031.method_1025(class_3966VarMethod_18075.method_17784()) == dPow ? 0 : -1));
                    if (obj >= 0 && class_239VarR != null) {
                        return null;
                    }
                    return class_3966VarMethod_18075.method_17782();
                } catch (NumberFormatException unused) {
                    obj = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -1157046304817422739L, j2) /* invoke-custom */;
                    throw obj;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -1157046304817422739L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -1157046304817422739L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v0, types: [su.catlean.dm] */
    public static class_1297 y(dm dmVar, float f2, float f3, float f4, boolean z2, boolean z3, int i2, Object obj, long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 55974029079886L;
        ?? P = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7996435573859917570L, j3) /* invoke-custom */;
        try {
            P = i2 & (int) b(MethodHandles.lookup(), "p", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9672, 8317204683013441727L ^ j3) /* invoke-custom */;
            ?? r14 = z3;
            ?? r0 = P;
            if (P != 0) {
                r14 = r0;
            } else if (P != 0) {
                r0 = 1;
                r14 = r0;
            }
            return dmVar.N(f2, f3, j4, f4, z2, r14);
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(P, -7959130482914320361L, j3) /* invoke-custom */;
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
    @org.jetbrains.annotations.NotNull
    public final net.minecraft.class_239 p(float r18, float r19, double r20, double r22, double r24, long r26) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dm.p(float, float, double, double, double, long):net.minecraft.class_239");
    }

    @NotNull
    public final class_243 y(float yaw, float pitch) {
        return new class_243(((float) Math.sin((-pitch) * 0.017453292f)) * ((float) Math.cos(yaw * 0.017453292f)), -((float) Math.sin(yaw * 0.017453292f)), ((float) Math.cos((-pitch) * 0.017453292f)) * ((float) Math.cos(yaw * 0.017453292f)));
    }

    @NotNull
    public final class_239 r(float dst, float yaw, long a2, float pitch) {
        long j2 = a ^ a2;
        long j3 = j2 ^ 6164145897351L;
        long j4 = j2 ^ 8298909974816L;
        class_243 class_243VarMethod_5836 = zf.v(j4).method_5836(1.0f);
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_5836, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13627, 2300074394705225834L ^ j2) /* invoke-custom */);
        class_243 class_243VarY = y(pitch, yaw);
        class_243 class_243VarMethod_1031 = class_243VarMethod_5836.method_1031(class_243VarY.field_1352 * ((double) dst), class_243VarY.field_1351 * ((double) dst), class_243VarY.field_1350 * ((double) dst));
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1031, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9058, 1726591001405128233L ^ j2) /* invoke-custom */);
        class_239 class_239VarMethod_17742 = zf.z(j3).method_17742(new class_3959(class_243VarMethod_5836, class_243VarMethod_1031, class_3959.class_3960.field_17559, class_3959.class_242.field_1348, zf.v(j4)));
        Intrinsics.checkNotNullExpressionValue(class_239VarMethod_17742, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16076, 7827038894946476928L ^ j2) /* invoke-custom */);
        return class_239VarMethod_17742;
    }

    private final class_239 b(float f2, float f3, float f4, float f5, byte b2, int i2, int i3, float f6, float f7) {
        long j2 = (((((long) b2) << 56) | ((((long) i2) << 32) >>> 8)) | ((((long) i3) << 40) >>> 40)) ^ a;
        long j3 = j2 ^ 41375312819669L;
        long j4 = j2 ^ 43664768207730L;
        class_243 class_243Var = new class_243(f5, f6, f7);
        class_243 class_243VarY = y(f4, f3);
        class_243 class_243VarMethod_1031 = class_243Var.method_1031(class_243VarY.field_1352 * ((double) f2), class_243VarY.field_1351 * ((double) f2), class_243VarY.field_1350 * ((double) f2));
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1031, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9058, 1726626212572836987L ^ j2) /* invoke-custom */);
        class_239 class_239VarMethod_17742 = zf.z(j3).method_17742(new class_3959(class_243Var, class_243VarMethod_1031, class_3959.class_3960.field_17559, class_3959.class_242.field_1348, zf.v(j4)));
        Intrinsics.checkNotNullExpressionValue(class_239VarMethod_17742, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4200, 4779945619934512994L ^ j2) /* invoke-custom */);
        return class_239VarMethod_17742;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v13, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public final double a(long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 133008104238515L;
        long j5 = j3 ^ 97160036623253L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1030293450689806261L, j3) /* invoke-custom */;
        Object obj = 4598847156609680094;
        Object obj2 = 4598847156609680094;
        double dMethod_5578 = 0.2873d;
        try {
            try {
                obj = zf.F(j4).field_1724;
                Object objMethod_6059 = obj;
                if (_gVarArr == null) {
                    if (obj == 0) {
                        return 0.0d;
                    }
                    objMethod_6059 = zf.v(j5);
                }
                try {
                    objMethod_6059 = objMethod_6059.method_6059(class_1294.field_5904);
                    _g[] _gVarArr2 = _gVarArr;
                    ?? Method_6059 = objMethod_6059;
                    int iMethod_5578 = objMethod_6059;
                    if (j3 > 0) {
                        if (_gVarArr2 == null) {
                            if (objMethod_6059 != 0) {
                                class_1293 class_1293VarMethod_6112 = zf.v(j5).method_6112(class_1294.field_5904);
                                Intrinsics.checkNotNull(class_1293VarMethod_6112);
                                dMethod_5578 = 0.2873d * (1.0d + (0.2d * ((double) (class_1293VarMethod_6112.method_5578() + 1))));
                            }
                            Method_6059 = zf.v(j5).method_6059(class_1294.field_5913);
                        }
                        _gVarArr2 = _gVarArr;
                        iMethod_5578 = Method_6059;
                    }
                    try {
                        if (j3 > 0) {
                            if (_gVarArr2 == null) {
                                if (iMethod_5578 != 0) {
                                    class_1293 class_1293VarMethod_61122 = zf.v(j5).method_6112(class_1294.field_5913);
                                    Intrinsics.checkNotNull(class_1293VarMethod_61122);
                                    dMethod_5578 /= 1.0d + (0.2d * ((double) (class_1293VarMethod_61122.method_5578() + 1)));
                                }
                                iMethod_5578 = zf.v(j5).method_6059(class_1294.field_5909);
                            }
                            _gVarArr2 = _gVarArr;
                        }
                        if (_gVarArr2 != null) {
                            dMethod_5578 /= 1.0d + (0.2d * ((double) ((iMethod_5578 == true ? 1 : 0) + 1)));
                        } else if (iMethod_5578 != 0) {
                            class_1293 class_1293VarMethod_61123 = zf.v(j5).method_6112(class_1294.field_5909);
                            Intrinsics.checkNotNull(class_1293VarMethod_61123);
                            iMethod_5578 = class_1293VarMethod_61123.method_5578();
                            dMethod_5578 /= 1.0d + (0.2d * ((double) ((iMethod_5578 == true ? 1 : 0) + 1)));
                        }
                        return dMethod_5578;
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(iMethod_5578, -1063375798509387614L, j3) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_6059, -1063375798509387614L, j3) /* invoke-custom */;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj2, -1063375798509387614L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            obj2 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -1063375798509387614L, j3) /* invoke-custom */;
            throw obj2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    public final double n(long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 48748507381691L;
        Object objMethod_6059 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1324659056359105435L, j3) /* invoke-custom */;
        double d2 = 0.3999999463558197d;
        try {
            try {
                objMethod_6059 = zf.v(j4).method_6059(class_1294.field_5913);
                int iMethod_5578 = objMethod_6059;
                if (objMethod_6059 != 0) {
                    d2 = 0.3999999463558197d + ((((double) iMethod_5578) + 1.0d) * 0.1d);
                } else if (objMethod_6059 != 0) {
                    class_1293 class_1293VarMethod_6112 = zf.v(j4).method_6112(class_1294.field_5913);
                    Intrinsics.checkNotNull(class_1293VarMethod_6112);
                    iMethod_5578 = class_1293VarMethod_6112.method_5578();
                    d2 = 0.3999999463558197d + ((((double) iMethod_5578) + 1.0d) * 0.1d);
                }
                return d2;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_6059, -1364496869654864756L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_6059, -1364496869654864756L, j3) /* invoke-custom */;
        }
    }

    public final float Y(long a2, @NotNull class_1799 stack, char a3) {
        Intrinsics.checkNotNullParameter(stack, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25189, 6588134762159985949L ^ (((a2 << 16) | ((((long) a3) << 48) >>> 48)) ^ a)) /* invoke-custom */);
        return ((stack.method_7936() - stack.method_7919()) / stack.method_7936()) * 100.0f;
    }

    public final float z(short a2, char a3, int a4, @NotNull class_243 targetPos) {
        Intrinsics.checkNotNullParameter(targetPos, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25641, 3475958471925826006L ^ ((((((long) a2) << 48) | ((((long) a3) << 48) >>> 16)) | ((((long) a4) << 32) >>> 32)) ^ a)) /* invoke-custom */);
        return (float) Math.sqrt(R(r0 ^ 19083956094594L, targetPos));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: net.minecraft.class_243 */
    public final float R(long a2, @NotNull class_243 targetPos) throws class_243 {
        long j2 = a ^ a2;
        long j3 = j2 ^ 70686247303682L;
        long j4 = j2 ^ 125552787407374L;
        int i2 = (int) (j2 >>> 48);
        int i3 = (int) ((j4 << 16) >>> 32);
        int i4 = (int) ((j4 << 48) >>> 48);
        long j5 = j2 ^ 106568425092132L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1872774923955595270L, j2) /* invoke-custom */;
        class_243 class_243VarA = targetPos;
        if (_gVarArr == null) {
            try {
                try {
                    Intrinsics.checkNotNullParameter(class_243VarA, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28955, 4084409891415021890L ^ j2) /* invoke-custom */);
                    class_243VarA = zf.F(j3).field_1724;
                    if (class_243VarA == null) {
                        return 0.0f;
                    }
                    class_243VarA = gw.Y.a((short) i2, i3, (char) i4, (class_1297) zf.v(j5));
                } catch (NumberFormatException unused) {
                    class_243VarA = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_243VarA, -1833218031250122989L, j2) /* invoke-custom */;
                    throw class_243VarA;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_243VarA, -1833218031250122989L, j2) /* invoke-custom */;
            }
        }
        class_243 class_243Var = class_243VarA;
        double d2 = targetPos.field_1352 - class_243Var.field_1352;
        double d3 = targetPos.field_1351 - class_243Var.field_1351;
        double d4 = targetPos.field_1350 - class_243Var.field_1350;
        return (float) ((d2 * d2) + (d3 * d3) + (d4 * d4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [float] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean, int] */
    public final boolean v(long a2, @NotNull class_243 pos, int fov) {
        long j2 = a ^ a2;
        long j3 = j2 ^ 36948538128910L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6480977890936989706L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(pos, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20978, 1986761339123579305L ^ j2) /* invoke-custom */);
        Object objMethod_15393 = class_3532.method_15393(((float) class_3532.method_15338(Math.toDegrees(Math.atan2(pos.method_10215() - zf.F(j3).field_1773.method_19418().method_71156().field_1350, pos.method_10216() - zf.F(j3).field_1773.method_19418().method_71156().field_1352)) - 90.0d)) - class_3532.method_15393(zf.F(j3).field_1773.method_19418().method_19330()));
        try {
            objMethod_15393 = (Math.abs((double) objMethod_15393) > fov ? 1 : (Math.abs((double) objMethod_15393) == fov ? 0 : -1));
            return _gVarArr == null ? objMethod_15393 <= 0 : objMethod_15393;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_15393, -6448178046671612129L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v12, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(long r8) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dm.k(long):boolean");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Nullable
    public final class_243 J(float yaw, float pitch, float distance, long a2) {
        long j2 = a ^ a2;
        long j3 = j2 ^ 16943809744865L;
        long j4 = j2 ^ 24453083043703L;
        long j5 = j2 ^ 52555374969287L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1432670256319816217L, j2) /* invoke-custom */;
        class_1297 class_1297Var = zf.F(j3).field_1724;
        Intrinsics.checkNotNull(class_1297Var);
        class_243 class_243VarMethod_1031 = p4.K(j4, class_1297Var).method_1031(0.0d, zf.v(j5).method_18381(zf.v(j5).method_18376()), 0.0d);
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1031, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9058, 1726634708663762638L ^ j2) /* invoke-custom */);
        float fPow = (float) Math.pow(distance, 2.0f);
        class_243 class_243VarY = y(pitch, yaw);
        class_243 class_243VarMethod_10312 = class_243VarMethod_1031.method_1031(class_243VarY.field_1352 * ((double) distance), class_243VarY.field_1351 * ((double) distance), class_243VarY.field_1350 * ((double) distance));
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_10312, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9058, 1726634708663762638L ^ j2) /* invoke-custom */);
        class_238 class_238VarMethod_1009 = zf.v(j5).method_5829().method_18804(class_243VarY.method_1021(distance)).method_1009(1.0d, 1.0d, 1.0d);
        Intrinsics.checkNotNullExpressionValue(class_238VarMethod_1009, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4602, 6352820842224438346L ^ j2) /* invoke-custom */);
        class_3966 class_3966VarMethod_18075 = class_1675.method_18075(zf.v(j5), class_243VarMethod_1031, class_243VarMethod_10312, class_238VarMethod_1009, dm::p, fPow);
        try {
            if (_gVarArr != null || class_3966VarMethod_18075 == null) {
                return null;
            }
            return class_3966VarMethod_18075.method_17784();
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_3966VarMethod_18075, 1399589006401151728L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v15, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v8, types: [su.catlean._g[]] */
    public final float e(int i2, double d2, byte b2, int i3, double d3) {
        long j2 = (((((long) i2) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i3) << 40) >>> 40)) ^ a;
        long j3 = j2 ^ 17388817031171L;
        long j4 = j2 ^ 52180362276389L;
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-287141068230357509L, j2) /* invoke-custom */;
        try {
            try {
                obj = zf.F(j3).field_1724;
                class_746 class_746VarV = obj;
                if (obj == 0) {
                    if (obj == 0) {
                        return 0.0f;
                    }
                    class_746VarV = zf.v(j4);
                }
                double dMethod_23317 = class_746VarV.method_23317() - d2;
                double dMethod_23321 = zf.v(j4).method_23321() - d3;
                return (float) ((dMethod_23317 * dMethod_23317) + (dMethod_23321 * dMethod_23321));
            } catch (NumberFormatException unused) {
                obj = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -248165887845806830L, j2) /* invoke-custom */;
                throw obj;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -248165887845806830L, j2) /* invoke-custom */;
        }
    }

    public final float r(int a2, int a3, double x, int a4, double z2) {
        long j2 = ((((((long) a2) << 32) | ((((long) a3) << 48) >>> 32)) | ((((long) a4) << 48) >>> 48)) ^ a) ^ 55979578331739L;
        return (float) Math.sqrt(e((int) (r0 >>> 32), x, (byte) ((j2 << 32) >>> 56), (int) ((j2 << 40) >>> 40), z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final void f(long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 57461778194438L;
        long j5 = j3 ^ 124937412257698L;
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8468034401485358204L, j3) /* invoke-custom */;
        if (obj == 0) {
            try {
                try {
                    obj = Q;
                    if (obj == 0) {
                        return;
                    }
                    zf.k(j4).method_52787(new class_2848(zf.v(j5), class_2848.class_2849.field_12985));
                    zf.v(j5).method_5728(false);
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8433281281796752533L, j3) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8433281281796752533L, j3) /* invoke-custom */;
            }
        }
        zf.v(j5).field_3919 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v35, types: [net.minecraft.class_239, net.minecraft.class_3966] */
    /* JADX WARN: Type inference failed for: r0v42, types: [int] */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final net.minecraft.class_239 l(double r11, double r13, float r15, long r16, float r18) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dm.l(double, double, float, long, float):net.minecraft.class_239");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v5, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [net.minecraft.class_243] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v0, types: [net.minecraft.class_243] */
    private final class_239 i(long j2, class_239 class_239Var, char c2, class_243 class_243Var, double d2) {
        long j3 = ((j2 << 16) | ((((long) c2) << 48) >>> 48)) ^ a;
        ?? Method_24802 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7043508201507295303L, j3) /* invoke-custom */;
        class_243 class_243VarMethod_17784 = class_239Var.method_17784();
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_17784, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8452, 8447127575319973604L ^ j3) /* invoke-custom */);
        try {
            Method_24802 = class_243VarMethod_17784;
            class_243 class_243Var2 = class_243Var;
            ?? r0 = Method_24802;
            class_243 class_243Var3 = class_243Var2;
            if (Method_24802 == 0) {
                try {
                    Method_24802 = Method_24802.method_24802((class_2374) class_243Var2, d2);
                    if (Method_24802 != 0) {
                        return class_239Var;
                    }
                    class_243 class_243VarMethod_177842 = class_239Var.method_17784();
                    class_243Var3 = class_243VarMethod_177842;
                    r0 = class_243VarMethod_177842;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_24802, 7003688601221615790L, j3) /* invoke-custom */;
                }
            }
            Intrinsics.checkNotNullExpressionValue(class_243Var3, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8452, 8447127575319973604L ^ j3) /* invoke-custom */);
            ?? r21 = r0;
            class_2350 class_2350VarMethod_10142 = class_2350.method_10142(((class_243) r21).field_1352 - class_243Var.field_1352, ((class_243) r21).field_1351 - class_243Var.field_1351, ((class_243) r21).field_1350 - class_243Var.field_1350);
            Intrinsics.checkNotNullExpressionValue(class_2350VarMethod_10142, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8540, 4832566439702171317L ^ j3) /* invoke-custom */);
            class_239 class_239VarMethod_17778 = class_3965.method_17778((class_243) r21, class_2350VarMethod_10142, class_2338.method_49638((class_2374) r21));
            Intrinsics.checkNotNullExpressionValue(class_239VarMethod_17778, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31042, 4861563854944818869L ^ j3) /* invoke-custom */);
            return class_239VarMethod_17778;
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_24802, 7003688601221615790L, j3) /* invoke-custom */;
        }
    }

    @NotNull
    public final class_239 x(double l2, long a2, float yaw, float pitch) {
        long j2 = a ^ a2;
        long j3 = j2 ^ 56112936799585L;
        long j4 = j2 ^ 54012460626886L;
        class_243 class_243VarMethod_1021 = y(pitch, yaw).method_1021(l2);
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1021, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20815, 1679193923648634620L ^ j2) /* invoke-custom */);
        class_239 class_239VarMethod_17742 = zf.z(j3).method_17742(new class_3959(zf.v(j4).method_33571(), zf.v(j4).method_33571().method_1019(class_243VarMethod_1021), class_3959.class_3960.field_17559, class_3959.class_242.field_1348, zf.v(j4)));
        Intrinsics.checkNotNullExpressionValue(class_239VarMethod_17742, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16076, 7826988920249307494L ^ j2) /* invoke-custom */);
        return class_239VarMethod_17742;
    }

    public final void D(long j2) {
        long j3 = (a ^ j2) ^ 32225418198409L;
        zf.F(j3).field_1690.field_1894.method_23481(false);
        zf.F(j3).field_1690.field_1881.method_23481(false);
        zf.F(j3).field_1690.field_1913.method_23481(false);
        zf.F(j3).field_1690.field_1849.method_23481(false);
        zf.F(j3).field_1690.field_1903.method_23481(false);
        zf.F(j3).field_1690.field_1832.method_23481(false);
    }

    public final void F(long j2) {
        long j3 = a ^ j2;
        long j4 = j3 ^ 89256188261323L;
        long j5 = j3 ^ 74171733175777L;
        int i2 = (int) (j3 >>> 48);
        int i3 = (int) ((j5 << 16) >>> 32);
        int i4 = (int) ((j5 << 48) >>> 48);
        class_304 class_304Var = zf.F(j4).field_1690.field_1894;
        KeyMappingAccessor keyMappingAccessor = zf.F(j4).field_1690.field_1894;
        Intrinsics.checkNotNull(keyMappingAccessor, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30069, 9019427036763968743L ^ j3) /* invoke-custom */);
        class_304Var.method_23481(bx.k((short) i2, i3, (char) i4, keyMappingAccessor.getKey().method_1444()));
        class_304 class_304Var2 = zf.F(j4).field_1690.field_1881;
        KeyMappingAccessor keyMappingAccessor2 = zf.F(j4).field_1690.field_1881;
        Intrinsics.checkNotNull(keyMappingAccessor2, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2304, 8374258782213023895L ^ j3) /* invoke-custom */);
        class_304Var2.method_23481(bx.k((short) i2, i3, (char) i4, keyMappingAccessor2.getKey().method_1444()));
        class_304 class_304Var3 = zf.F(j4).field_1690.field_1913;
        KeyMappingAccessor keyMappingAccessor3 = zf.F(j4).field_1690.field_1913;
        Intrinsics.checkNotNull(keyMappingAccessor3, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2304, 8374258782213023895L ^ j3) /* invoke-custom */);
        class_304Var3.method_23481(bx.k((short) i2, i3, (char) i4, keyMappingAccessor3.getKey().method_1444()));
        class_304 class_304Var4 = zf.F(j4).field_1690.field_1849;
        KeyMappingAccessor keyMappingAccessor4 = zf.F(j4).field_1690.field_1849;
        Intrinsics.checkNotNull(keyMappingAccessor4, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2304, 8374258782213023895L ^ j3) /* invoke-custom */);
        class_304Var4.method_23481(bx.k((short) i2, i3, (char) i4, keyMappingAccessor4.getKey().method_1444()));
        class_304 class_304Var5 = zf.F(j4).field_1690.field_1903;
        KeyMappingAccessor keyMappingAccessor5 = zf.F(j4).field_1690.field_1903;
        Intrinsics.checkNotNull(keyMappingAccessor5, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2304, 8374258782213023895L ^ j3) /* invoke-custom */);
        class_304Var5.method_23481(bx.k((short) i2, i3, (char) i4, keyMappingAccessor5.getKey().method_1444()));
        class_304 class_304Var6 = zf.F(j4).field_1690.field_1832;
        KeyMappingAccessor keyMappingAccessor6 = zf.F(j4).field_1690.field_1832;
        Intrinsics.checkNotNull(keyMappingAccessor6, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2304, 8374258782213023895L ^ j3) /* invoke-custom */);
        class_304Var6.method_23481(bx.k((short) i2, i3, (char) i4, keyMappingAccessor6.getKey().method_1444()));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private static final boolean k(boolean r8, net.minecraft.class_1297 r9) {
        /*
            long r0 = su.catlean.dm.a
            r1 = 117177641086611(0x6a928bac2e93, double:5.78934469216103E-310)
            long r0 = r0 ^ r1
            r10 = r0
            r0 = -1950427278963370730(0xe4eeb0b93d281516, double:-1.554565279708602E178)
            r1 = r10
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r1 = r9
            r2 = 20288(0x4f40, float:2.843E-41)
            r3 = 133482634811237886(0x1da39bfc79b65fe, double:9.790152836974009E-300)
            r4 = r10
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/dm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "x"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r12 = r0
            r0 = r9
            boolean r0 = r0.method_7325()     // Catch: java.lang.NumberFormatException -> L33
            r1 = r12
            if (r1 != 0) goto L4e
            if (r0 != 0) goto Lb0
            goto L3d
        L33:
            r1 = -1989684548509051393(0xe4633871e708d5ff, double:-3.8030488135883725E175)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L44
            throw r0     // Catch: java.lang.NumberFormatException -> L44
        L3d:
            r0 = r9
            boolean r0 = r0.method_5863()     // Catch: java.lang.NumberFormatException -> L44
            goto L4e
        L44:
            r1 = -1989684548509051393(0xe4633871e708d5ff, double:-3.8030488135883725E175)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L4e:
            r1 = r12
            if (r1 != 0) goto L74
            if (r0 == 0) goto Lb0
            goto L63
        L59:
            r1 = -1989684548509051393(0xe4633871e708d5ff, double:-3.8030488135883725E175)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L6a
            throw r0     // Catch: java.lang.NumberFormatException -> L6a
        L63:
            r0 = r9
            boolean r0 = r0 instanceof net.minecraft.class_1309     // Catch: java.lang.NumberFormatException -> L6a
            goto L74
        L6a:
            r1 = -1989684548509051393(0xe4633871e708d5ff, double:-3.8030488135883725E175)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L74:
            r1 = r12
            if (r1 != 0) goto Lad
            if (r0 != 0) goto Lac
            goto L89
        L7f:
            r1 = -1989684548509051393(0xe4633871e708d5ff, double:-3.8030488135883725E175)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L92
            throw r0     // Catch: java.lang.NumberFormatException -> L92
        L89:
            r0 = r8
            r1 = r12
            if (r1 != 0) goto Lad
            goto L9c
        L92:
            r1 = -1989684548509051393(0xe4633871e708d5ff, double:-3.8030488135883725E175)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> La2
            throw r0     // Catch: java.lang.NumberFormatException -> La2
        L9c:
            if (r0 != 0) goto Lb0
            goto Lac
        La2:
            r1 = -1989684548509051393(0xe4633871e708d5ff, double:-3.8030488135883725E175)
            r2 = r10
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lac:
            r0 = 1
        Lad:
            goto Lb1
        Lb0:
            r0 = 0
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dm.k(boolean, net.minecraft.class_1297):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean I(net.minecraft.class_1297 r8) {
        /*
            long r0 = su.catlean.dm.a
            r1 = 82790738034927(0x4b4c388800ef, double:4.09040594568997E-310)
            long r0 = r0 ^ r1
            r9 = r0
            r0 = -3849854857497527446(0xca9291678e0c3b6a, double:-1.73677711901364E51)
            r1 = r9
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r1 = r8
            r2 = 20288(0x4f40, float:2.843E-41)
            r3 = 133445945810439042(0x1da186174bf4b82, double:9.741494146180341E-300)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/dm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "x"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r11 = r0
            r0 = r8
            boolean r0 = r0.method_7325()     // Catch: java.lang.NumberFormatException -> L31
            r1 = r11
            if (r1 != 0) goto L4c
            if (r0 != 0) goto L64
            goto L3b
        L31:
            r1 = -3882356112947872893(0xca1f19af542cfb83, double:-1.1363296372419272E49)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L42
            throw r0     // Catch: java.lang.NumberFormatException -> L42
        L3b:
            r0 = r8
            boolean r0 = r0.method_5863()     // Catch: java.lang.NumberFormatException -> L42
            goto L4c
        L42:
            r1 = -3882356112947872893(0xca1f19af542cfb83, double:-1.1363296372419272E49)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L4c:
            r1 = r11
            if (r1 != 0) goto L61
            if (r0 == 0) goto L64
            goto L60
        L56:
            r1 = -3882356112947872893(0xca1f19af542cfb83, double:-1.1363296372419272E49)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L60:
            r0 = 1
        L61:
            goto L65
        L64:
            r0 = 0
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dm.I(net.minecraft.class_1297):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    private static final boolean p(class_1297 class_1297Var) {
        long j2 = a ^ 128579933037388L;
        Object objMethod_7325 = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2968345884762298569L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(class_1297Var, (String) a(MethodHandles.lookup(), "x", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7173, 7649450371091266414L ^ j2) /* invoke-custom */);
        try {
            objMethod_7325 = class_1297Var.method_7325();
            return objMethod_7325 == 0 ? objMethod_7325 == 0 : objMethod_7325;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_7325, 3007320510827534368L, j2) /* invoke-custom */;
        }
    }

    static {
        int i2;
        long j2 = a ^ 26301898346218L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, 327542255580015407L, j2) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[25];
        int i4 = 0;
        String str = "ÂåØ<\u0004¼\u0092Í\u009c\u000eKÑÃ\u0094\u0018Ý \u0087\u0017nLS\u0084a\"¤\u008depBZ\u00940ýñÉâ¼Å\u001a\u001dKc\u0092\u0017,Yöe \u000f\u0017þüO\u0001\u000eþ]\u009d¼\u0001íÑßxCÂáá¹cÚIÐÖ\u0016\u001a7l?©\u0090¨\u008f½Ds\u001e3¢Ú#È¥t\rq\u0081\u0081\\\u009b^±\u0003\u008f3²u4ìÑþ\r\u0082þ(ÇPs%¤k\u0002ã´;\u0011\u0095\u009eZæá:ç8È,Ç\u0090c§\f/\u001cÈ\u009dP\n!iµ\u0095\t\u009c\u009b\u009f\u0013{îj=x\u001dQøëÖ»W`5zÛ\u00058þ c¼\u0015\u000fèQ\u0093¾\u0002î\tÒÛá§\u0099jÜ¾0\u0084\u0004\u0088\rC)cY\u0097~Ö\u008daÍ¬6\rbvs×\u008fA¡Bp¼\u0099¬ \u0090\u0002ã¤Ç÷ë\u0000\u0003Ï;\u001fð®Áî²\u009aûèÿ\u008bú>ÑõY\u0090ú\u0099ÎÁ(G\u0018¬_§\u009d\u0019\u009cÂ¨í,£O[2\u0095áâ\u008cÝ8^\u0000o¶Øß\u001f¡ÜºÖð\u0085*´) Ó\u0088\u0010\u001d\u0091û\u00057\u000epÜU\u008dÈ\u0016\u009fZ\u009aÛ\u0018iËX\u0016\u007f\f\u0015½X=>¹9\\ Þ\u0015óíÝ\u0016«è´N9\\ÞÁR\u0094_#@ø\u0002z\u000be\u001e®¸Õ9ÁD¸÷ar\u0001\u0088\u000e\u0010\rø¾¥\u0083×s[}\u000e\u001a·9ý\u0080ºÍ!\u0004ã(Û+R\u00151!\u008a\u0090Õ¼\u0082`E\u0011ã÷IË\t¾-\u0019y\u008aË\u0086\u0091;\u009eUPñ,´µ;(\u0094ÞóÒ]÷(g5ñßL%#\u0090$ë\u0010\u0090çE²µm¢Ú\u0006rä\u0090bôÙAïÜ(\u001e²ÏÁ0f\\[\u0002`\u0088Ð³vÌ\u0014\u0003&#}I\u0086\"¿\u000f\u0087òn\u0083\u009e°jB\u008a\r\u0090\u0080ÖÖ0!+@ÖF#û²_r\b\u0007Ò\u0001x\u0098,ÏÔXéu=BÉ\t¿\u009b±v7¨é\u009f^\u0013Î£LÇ\u008d\u0019\u0015ÄI-%\u0006¡å¿?\u0081^\u001eÝ\u001a×Å\u0094£NÛe³1#Y¥íÐ\t¶ \u008c\u0093\u008aÍ\u009b\u008dç*\u0096\u0084\u0087¤\u009d*Ôæ!C\u0082åÏÿÍP\u0090g»Ò\u0005WVQ\u0091 ó%´öÈ$1\u0000d\u00adû×\u0001M9Ë\u001bó¢)\u0003O\u0096\u0016³º¿\u0099£ìM\u0004\u0010Ï±¸§+\u0016SÞ25%à\f5.Î I(¡kÂß²\u0087¢æëe\u0091[g\u009cHåH\u0089k}\u009a\u00045\u001b\u00812ÔOëÌ8ðiÍ±\u001fíË\u001f\n¢Z\u0013?Q¢+¸\u0085¥ú¶/\u0092W&¹Wè¼\u0099¬>>\u0014\u001bxAÊ§|W}to´\u009fp åáIY¦\u0093E<(9X\u0083§h\u0006Å¿ßÂn*\u0094/ö\u0000\u009dÞcH\u0007\u0006\u00ad\u0012¥\f\u0013´ì\rÊ\u0018¦%¬|Ø+ùÍ\u0010,\u0090çäL¾\u001a\\¶0´ÜÞYÈ\u0081\u0010ÌbÅ\u0091\u000ed8'¥pwbå\"áö\u0018\u0019í\u0017Ñ¢`\r{\u0086Å\u0017\u0097Fe\u0018ÝØýú¥gû2µ \u00adWSW\u0097_ÜêO\u0015GEä)'ë\u009b¾ì±X\u0089Æ§Ù©Z\u0004\u0095¬¯_ ¹$\u0018{ý\u008b\u0000¸\u0012%f-U\u0015äÊ\u0017Ç\u0000 QPb\r²ç7\u0096\u0012XÈü\u0088óÜ1tÎ©ÕBôê\u0096)\u009b\u0014ö\u0082Õ\u001f¥D\u008a\u0089K(¸`c\u001eóÙ\u0004\u007fú?Q¦<J\u001e\u000e¸·\u0082C\u00104ÅU\u0088\u0012f;\u0093ÿÔ\u007f¤}Ù#¼Ü9CÛ\u0006á\u000f\nA\u0019Î\u0004)\u0088é\u0085\\m±¾\u001dÉf\u0092:\u0010£ÇÚ\u0080l}ú£ý Íq-9ä\u009c\u007fAÚû\u009eölâ®©}°ðt\u001b£\u0004´\u0005QÒ)\u0090¢:o$º\u001a`v\u000bB(\u009f§\u0015\u0095ÏNVq\u0099u\u0012\u001d\u000bpHg\u008adVwÑ\u001cÈ\u0084ÿ_\u0088òÓvwOV\u008c\u00855\u0003\u001eÕJ\u0010\u0087åÓ:N\u0015ç\u001e§\u000bÑ3Ðå%J ?!5´AÖ;!gÞI\rù\u000fî¾\u0007ãÊ\u0017B\u0089KH\u0090¤ËÍ:ªI\u0086";
        int length = "ÂåØ<\u0004¼\u0092Í\u009c\u000eKÑÃ\u0094\u0018Ý \u0087\u0017nLS\u0084a\"¤\u008depBZ\u00940ýñÉâ¼Å\u001a\u001dKc\u0092\u0017,Yöe \u000f\u0017þüO\u0001\u000eþ]\u009d¼\u0001íÑßxCÂáá¹cÚIÐÖ\u0016\u001a7l?©\u0090¨\u008f½Ds\u001e3¢Ú#È¥t\rq\u0081\u0081\\\u009b^±\u0003\u008f3²u4ìÑþ\r\u0082þ(ÇPs%¤k\u0002ã´;\u0011\u0095\u009eZæá:ç8È,Ç\u0090c§\f/\u001cÈ\u009dP\n!iµ\u0095\t\u009c\u009b\u009f\u0013{îj=x\u001dQøëÖ»W`5zÛ\u00058þ c¼\u0015\u000fèQ\u0093¾\u0002î\tÒÛá§\u0099jÜ¾0\u0084\u0004\u0088\rC)cY\u0097~Ö\u008daÍ¬6\rbvs×\u008fA¡Bp¼\u0099¬ \u0090\u0002ã¤Ç÷ë\u0000\u0003Ï;\u001fð®Áî²\u009aûèÿ\u008bú>ÑõY\u0090ú\u0099ÎÁ(G\u0018¬_§\u009d\u0019\u009cÂ¨í,£O[2\u0095áâ\u008cÝ8^\u0000o¶Øß\u001f¡ÜºÖð\u0085*´) Ó\u0088\u0010\u001d\u0091û\u00057\u000epÜU\u008dÈ\u0016\u009fZ\u009aÛ\u0018iËX\u0016\u007f\f\u0015½X=>¹9\\ Þ\u0015óíÝ\u0016«è´N9\\ÞÁR\u0094_#@ø\u0002z\u000be\u001e®¸Õ9ÁD¸÷ar\u0001\u0088\u000e\u0010\rø¾¥\u0083×s[}\u000e\u001a·9ý\u0080ºÍ!\u0004ã(Û+R\u00151!\u008a\u0090Õ¼\u0082`E\u0011ã÷IË\t¾-\u0019y\u008aË\u0086\u0091;\u009eUPñ,´µ;(\u0094ÞóÒ]÷(g5ñßL%#\u0090$ë\u0010\u0090çE²µm¢Ú\u0006rä\u0090bôÙAïÜ(\u001e²ÏÁ0f\\[\u0002`\u0088Ð³vÌ\u0014\u0003&#}I\u0086\"¿\u000f\u0087òn\u0083\u009e°jB\u008a\r\u0090\u0080ÖÖ0!+@ÖF#û²_r\b\u0007Ò\u0001x\u0098,ÏÔXéu=BÉ\t¿\u009b±v7¨é\u009f^\u0013Î£LÇ\u008d\u0019\u0015ÄI-%\u0006¡å¿?\u0081^\u001eÝ\u001a×Å\u0094£NÛe³1#Y¥íÐ\t¶ \u008c\u0093\u008aÍ\u009b\u008dç*\u0096\u0084\u0087¤\u009d*Ôæ!C\u0082åÏÿÍP\u0090g»Ò\u0005WVQ\u0091 ó%´öÈ$1\u0000d\u00adû×\u0001M9Ë\u001bó¢)\u0003O\u0096\u0016³º¿\u0099£ìM\u0004\u0010Ï±¸§+\u0016SÞ25%à\f5.Î I(¡kÂß²\u0087¢æëe\u0091[g\u009cHåH\u0089k}\u009a\u00045\u001b\u00812ÔOëÌ8ðiÍ±\u001fíË\u001f\n¢Z\u0013?Q¢+¸\u0085¥ú¶/\u0092W&¹Wè¼\u0099¬>>\u0014\u001bxAÊ§|W}to´\u009fp åáIY¦\u0093E<(9X\u0083§h\u0006Å¿ßÂn*\u0094/ö\u0000\u009dÞcH\u0007\u0006\u00ad\u0012¥\f\u0013´ì\rÊ\u0018¦%¬|Ø+ùÍ\u0010,\u0090çäL¾\u001a\\¶0´ÜÞYÈ\u0081\u0010ÌbÅ\u0091\u000ed8'¥pwbå\"áö\u0018\u0019í\u0017Ñ¢`\r{\u0086Å\u0017\u0097Fe\u0018ÝØýú¥gû2µ \u00adWSW\u0097_ÜêO\u0015GEä)'ë\u009b¾ì±X\u0089Æ§Ù©Z\u0004\u0095¬¯_ ¹$\u0018{ý\u008b\u0000¸\u0012%f-U\u0015äÊ\u0017Ç\u0000 QPb\r²ç7\u0096\u0012XÈü\u0088óÜ1tÎ©ÕBôê\u0096)\u009b\u0014ö\u0082Õ\u001f¥D\u008a\u0089K(¸`c\u001eóÙ\u0004\u007fú?Q¦<J\u001e\u000e¸·\u0082C\u00104ÅU\u0088\u0012f;\u0093ÿÔ\u007f¤}Ù#¼Ü9CÛ\u0006á\u000f\nA\u0019Î\u0004)\u0088é\u0085\\m±¾\u001dÉf\u0092:\u0010£ÇÚ\u0080l}ú£ý Íq-9ä\u009c\u007fAÚû\u009eölâ®©}°ðt\u001b£\u0004´\u0005QÒ)\u0090¢:o$º\u001a`v\u000bB(\u009f§\u0015\u0095ÏNVq\u0099u\u0012\u001d\u000bpHg\u008adVwÑ\u001cÈ\u0084ÿ_\u0088òÓvwOV\u008c\u00855\u0003\u001eÕJ\u0010\u0087åÓ:N\u0015ç\u001e§\u000bÑ3Ðå%J ?!5´AÖ;!gÞI\rù\u000fî¾\u0007ãÊ\u0017B\u0089KH\u0090¤ËÍ:ªI\u0086".length();
        char cCharAt = 16;
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
                            c = new String[25];
                            g = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[8];
                            int i10 = 0;
                            String str3 = "\u009c\u008bM/ùR¬Fÿ\u0091\u0015Vd.\u0017uÍã(\u0093¿\u0081\u0089ñÿ¶UÒ\u0099Y#\u0082\u0013hU^ÇÈn¾\u009b´NMru\u0017¡";
                            int length2 = "\u009c\u008bM/ùR¬Fÿ\u0091\u0015Vd.\u0017uÍã(\u0093¿\u0081\u0089ñÿ¶UÒ\u0099Y#\u0082\u0013hU^ÇÈn¾\u009b´NMru\u0017¡".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j3 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b4 = -1;
                                while (true) {
                                    byte b5 = b4;
                                    long j4 = j3;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j4 >>> 56), (byte) (j4 >>> 48), (byte) (j4 >>> 40), (byte) (j4 >>> 32), (byte) (j4 >>> 24), (byte) (j4 >>> 16), (byte) (j4 >>> 8), (byte) j4});
                                    long j5 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b5] = j5;
                                            if (i11 >= length2) {
                                                e = jArr;
                                                f = new Integer[8];
                                                l = new HashMap(13);
                                                Cipher cipher3 = Cipher.getInstance("DES/CBC/NoPadding");
                                                SecretKeyFactory secretKeyFactory3 = SecretKeyFactory.getInstance("DES");
                                                byte[] bArr3 = new byte[8];
                                                bArr3[0] = (byte) (j2 >>> 56);
                                                for (int i15 = 1; i15 < 8; i15++) {
                                                    bArr3[i15] = (byte) ((j2 << (i15 * 8)) >>> 56);
                                                }
                                                cipher3.init(2, secretKeyFactory3.generateSecret(new DESKeySpec(bArr3)), new IvParameterSpec(new byte[8]));
                                                long[] jArr3 = new long[3];
                                                int i16 = 0;
                                                int length3 = "Í\u0001·cÀ´î\u0007£[aë\u001bG\u009c\u008cé\u0019q\u00adÝ³\u0013\u0094".length();
                                                int i17 = 0;
                                                do {
                                                    int i18 = i17;
                                                    i17 += 8;
                                                    byte[] bytes2 = "Í\u0001·cÀ´î\u0007£[aë\u001bG\u009c\u008cé\u0019q\u00adÝ³\u0013\u0094".substring(i18, i17).getBytes("ISO-8859-1");
                                                    i16++;
                                                    byte[] bArrDoFinal2 = cipher3.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255))});
                                                    jArr3[-1] = ((((long) bArrDoFinal2[0]) & 255) << 56) | ((((long) bArrDoFinal2[1]) & 255) << 48) | ((((long) bArrDoFinal2[2]) & 255) << 40) | ((((long) bArrDoFinal2[3]) & 255) << 32) | ((((long) bArrDoFinal2[4]) & 255) << 24) | ((((long) bArrDoFinal2[5]) & 255) << 16) | ((((long) bArrDoFinal2[6]) & 255) << 8) | (((long) bArrDoFinal2[7]) & 255);
                                                } while (i17 < length3);
                                                j = jArr3;
                                                k = new Long[3];
                                                h = new dm();
                                                i = (long) c(MethodHandles.lookup(), "a", MethodType.methodType(Long.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28210, 3215941172036643116L ^ j2) /* invoke-custom */;
                                                z = (long) c(MethodHandles.lookup(), "a", MethodType.methodType(Long.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19653, 9169977205806992344L ^ j2) /* invoke-custom */;
                                                u = (long) c(MethodHandles.lookup(), "a", MethodType.methodType(Long.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19653, 9169977205806992344L ^ j2) /* invoke-custom */;
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b5] = j5;
                                            if (i11 >= length2) {
                                                str3 = ">¹49Dn\u0082ù\u00116ÓñÏ\u0085/Á";
                                                length2 = ">¹49Dn\u0082ù\u00116ÓñÏ\u0085/Á".length();
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
                                    j3 = ((((long) bytes3[0]) & 255) << 56) | ((((long) bytes3[1]) & 255) << 48) | ((((long) bytes3[2]) & 255) << 40) | ((((long) bytes3[3]) & 255) << 32) | ((((long) bytes3[4]) & 255) << 24) | ((((long) bytes3[5]) & 255) << 16) | ((((long) bytes3[6]) & 255) << 8) | (((long) bytes3[7]) & 255);
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
                        str = "c\u0081\u008a\u00171ÙYÖ\u009b\u000bÂ0Ï\u001c@D\u0098\u0010ëì/Íµ\u0086cfÃ\u0092\u008fÃ6\u008a \u00127ËU\u0013 ÷6kHVû\u0015íðÕY\u0002¿&e´ô\u0092m\u0089\u0086_\u0000\u009eK?";
                        length = "c\u0081\u008a\u00171ÙYÖ\u009b\u000bÂ0Ï\u001c@D\u0098\u0010ëì/Íµ\u0086cfÃ\u0092\u008fÃ6\u008a \u00127ËU\u0013 ÷6kHVû\u0015íðÕY\u0002¿&e´ô\u0092m\u0089\u0086_\u0000\u009eK?".length();
                        cCharAt = ' ';
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

    public static void k(_g[] _gVarArr) {
        n = _gVarArr;
    }

    public static _g[] e() {
        return n;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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

    private static String a(int i2, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 20243;
        if (c[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) d.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i3] = a(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/dm", e2);
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
            java.lang.String r1 = "java/lang/RuntimeException"
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
            java.lang.String r0 = "su/catlean/dm"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dm.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 32060;
        if (f[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) g.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/dm", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            f[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return f[i3].intValue();
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
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
    private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            java.lang.String r1 = "java/lang/RuntimeException"
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
            java.lang.String r0 = "su/catlean/dm"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dm.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static long d(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 17089;
        if (k[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) j[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) l.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    l.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/dm", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            k[i3] = Long.valueOf(((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255));
        }
        return k[i3].longValue();
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        long jD = d(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Long.TYPE, Long.valueOf(jD)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return jD;
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
            java.lang.String r1 = "java/lang/RuntimeException"
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
            java.lang.String r0 = "su/catlean/dm"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.dm.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
