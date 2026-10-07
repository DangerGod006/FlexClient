package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_1684;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2374;
import net.minecraft.class_2404;
import net.minecraft.class_243;
import net.minecraft.class_742;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import su.catlean.api.event.events.world.AfterEntitySpawn;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ez.class */
public final class ez extends _g {

    @NotNull
    public static final ez W = null;
    static final KProperty[] F = null;

    @NotNull
    private static final cq d = null;

    @NotNull
    private static final cw E = null;

    @NotNull
    private static final bg m = null;

    @Nullable
    private static class_2338 G;
    private static int k;
    private static int C;

    @NotNull
    private static final HashMap X = null;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] c = null;
    private static final Map e = null;
    private static final long[] f = null;
    private static final Integer[] g = null;
    private static final Map h = null;
    private static final long i = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    private ez(long j) {
        long j2 = a ^ j;
        super((String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30753, 7096170806511143874L ^ j2) /* invoke-custom */, jt.y(), null, 4, null, j2 ^ 81790947333050L);
    }

    private final boolean r(long j) {
        return ((Boolean) d.E(this, (a ^ j) ^ 103622055176113L, F[0])).booleanValue();
    }

    private final f9 K(long j) {
        return (f9) E.E(this, (a ^ j) ^ 114491933943326L, F[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.Optional] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    @Flow
    private final void j(AfterEntitySpawn afterEntitySpawn) {
        long j = a ^ 139406696834518L;
        Object objMin = j;
        long j2 = objMin ^ 38345459101211L;
        try {
            if (afterEntitySpawn.getEntity() instanceof class_1684) {
                Stream stream = zf.z(j2).method_18456().stream();
                Function1 function1 = (v1) -> {
                    return G(r1, v1);
                };
                objMin = stream.min(Comparator.comparingDouble((v1) -> {
                    return P(r1, v1);
                }));
                Function1 function12 = (v1) -> {
                    return J(r1, v1);
                };
                objMin.ifPresent((v1) -> {
                    k(r1, v1);
                });
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMin, 194775354487980413L, j) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x070f: MOVE (r50 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r-1 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY])
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow(priority = -10)
    private final void I(su.catlean.api.event.events.player.PlayerUpdateEvent r15) {
        /*
            Method dump skipped, instruction units count: 1861
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ez.I(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final float H(long r12, net.minecraft.class_2338 r14, float r15) {
        /*
            Method dump skipped, instruction units count: 673
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ez.H(long, net.minecraft.class_2338, float):float");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x005e: INVOKE (r-1 I:su.catlean.ez), (r0 I:long), (r1 I:net.minecraft.class_243), (r2 I:net.minecraft.class_243) DIRECT call: su.catlean.ez.P(long, net.minecraft.class_243, net.minecraft.class_243):net.minecraft.class_2338
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final net.minecraft.class_2338 a(int r10, char r11, char r12, float r13, float r14) {
        /*
            r9 = this;
            r0 = r10
            long r0 = (long) r0
            r1 = 32
            long r0 = r0 << r1
            r1 = r11
            long r1 = (long) r1
            r2 = 48
            long r1 = r1 << r2
            r2 = 32
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            r1 = r12
            long r1 = (long) r1
            r2 = 48
            long r1 = r1 << r2
            r2 = 48
            long r1 = r1 >>> r2
            long r0 = r0 | r1
            long r1 = su.catlean.ez.a
            long r0 = r0 ^ r1
            r15 = r0
            r0 = r15
            r1 = r0; r1 = r0; 
            r2 = 56681216114169(0x338d1fc07df9, double:2.8004241646514E-310)
            long r1 = r1 ^ r2
            r17 = r1
            r1 = r0; r2 = r0; 
            r2 = 38641189816411(0x2324da64885b, double:1.90912844027193E-310)
            long r1 = r1 ^ r2
            r19 = r1
            r1 = r0; r2 = r0; 
            r2 = 137557233324298(0x7d1b8a07510a, double:6.79623033225043E-310)
            long r1 = r1 ^ r2
            r21 = r1
            r0 = r9
            r1 = r21
            net.minecraft.class_746 r1 = su.catlean.zf.v(r1)
            net.minecraft.class_243 r1 = r1.method_33571()
            r2 = r1
            r3 = 11241(0x2be9, float:1.5752E-41)
            r4 = 1014671412495358216(0xe14d64611879908, double:7.81229812481275E-241)
            r5 = r15
            long r4 = r4 ^ r5
            java.lang.String r3 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ez;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "n"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r3, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r2 = r9
            r3 = r17
            r4 = r14
            r5 = r13
            net.minecraft.class_243 r2 = r2.T(r3, r4, r5)
            r3 = r19
            r4 = r3; r3 = r2; r2 = r1; r1 = r4; 
            r-1.P(r0, r1, r2)
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ez.a(int, char, char, float, float):net.minecraft.class_2338");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: net.minecraft.class_3965 */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e5, code lost:
    
        return r0.method_17777();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x015c, code lost:
    
        if (r0 != 0) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x015f, code lost:
    
        r0 = r24.method_1019(r23);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ez;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "n"}
            {METHOD_TYPE: (I, J)Ljava/lang/String;}
        ).invoke(8049, 9134143059674416092L ^ r0));
        r0 = r0.method_5829().method_992(r24, r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/ez;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "n"}
            {METHOD_TYPE: (I, J)Ljava/lang/String;}
        ).invoke(24860, 8459063667438403006L ^ r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x019c, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a0, code lost:
    
        if (r0 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a3, code lost:
    
        r0 = r0.isEmpty();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a6, code lost:
    
        if (r0 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ac, code lost:
    
        r0 = call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -1343226461806907755L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01b5, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b8, code lost:
    
        if (r0 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01be, code lost:
    
        if (r0 < 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01cd, code lost:
    
        throw call_site(
            {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
            {STRING: "Å"}
            {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
        ).invoke(r0, -1343226461806907755L, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ce, code lost:
    
        r0 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01d9, code lost:
    
        return net.minecraft.class_2338.method_49638((net.minecraft.class_2374) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01fd, code lost:
    
        if (r0 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f5, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f5, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v41, types: [int] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.util.Optional] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v55, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0203 -> B:7:0x0082). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final net.minecraft.class_2338 P(long r11, net.minecraft.class_243 r13, net.minecraft.class_243 r14) throws net.minecraft.class_3965 {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ez.P(long, net.minecraft.class_243, net.minecraft.class_243):net.minecraft.class_2338");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [net.minecraft.class_243] */
    private final class_243 Z(class_243 class_243Var, long j, char c2, class_243 class_243Var2) {
        long j2 = ((j << 16) | ((((long) c2) << 48) >>> 48)) ^ a;
        Object obj = j2;
        long j3 = obj ^ 134854372721615L;
        try {
            obj = class_243Var;
            class_243 class_243VarMethod_1021 = obj.method_1021(zf.z(j3).method_8320(class_2338.method_49638((class_2374) class_243Var2)).method_26204() instanceof class_2404 ? 0.8d : 0.99d);
            Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1021, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(813, 5829425783047282110L ^ j2) /* invoke-custom */);
            return class_243VarMethod_1021;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 8027564488738581673L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [double] */
    /* JADX WARN: Type inference failed for: r0v26, types: [net.minecraft.class_243] */
    private final class_243 T(long j, float f2, float f3) {
        double d2;
        long j2 = a ^ j;
        long j3 = j2 ^ 50441180662518L;
        String[] strArr = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1783847072302046983L, j2) /* invoke-custom */;
        double dCos = (-Math.sin(((double) f3) * 0.017453292519943295d)) * Math.cos(((double) f2) * 0.017453292519943295d);
        double d3 = -Math.sin(((double) f2) * 0.017453292519943295d);
        Object objCos = Math.cos(((double) f3) * 0.017453292519943295d) * Math.cos(((double) f2) * 0.017453292519943295d);
        try {
            try {
                objCos = new class_243(dCos, d3, (double) objCos).method_1021(1.5d);
                double d4 = zf.v(j3).method_60478().field_1352;
                class_746 class_746VarV = zf.v(j3);
                if (strArr != null) {
                    d2 = class_746VarV.method_60478().field_1351;
                } else if (class_746VarV.method_24828()) {
                    d2 = 0.0d;
                } else {
                    class_746VarV = zf.v(j3);
                    d2 = class_746VarV.method_60478().field_1351;
                }
                class_243 class_243VarMethod_1031 = objCos.method_1031(d4, d2, zf.v(j3).method_60478().field_1350);
                Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1031, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20796, 4188171506339969059L ^ j2) /* invoke-custom */);
                return class_243VarMethod_1031;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objCos, 1799740072925125431L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objCos, 1799740072925125431L, j2) /* invoke-custom */;
        }
    }

    private static final double G(AfterEntitySpawn afterEntitySpawn, class_742 class_742Var) {
        return class_742Var.method_5707(W.J((byte) (r0 >>> 56), (((a ^ 81452585774563L) ^ 131232808589448L) << 8) >>> 8, afterEntitySpawn.getEntity()));
    }

    private static final double P(Function1 function1, Object obj) {
        return ((Number) function1.invoke(obj)).doubleValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    private static final Unit J(AfterEntitySpawn afterEntitySpawn, class_742 class_742Var) {
        long j = a ^ 105319887316638L;
        long j2 = j ^ 1973093307380L;
        Object objAreEqual = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4738722892409095685L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(class_742Var, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31176, 1803097192412449238L ^ j) /* invoke-custom */);
        try {
            try {
                objAreEqual = Intrinsics.areEqual(class_742Var, zf.v(j2));
                int iMethod_5628 = objAreEqual;
                if (objAreEqual != 0) {
                    C = iMethod_5628;
                } else if (objAreEqual != 0) {
                    ez ezVar = W;
                    iMethod_5628 = afterEntitySpawn.getEntity().method_5628();
                    C = iMethod_5628;
                }
                return Unit.INSTANCE;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, 4754633682786812469L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objAreEqual, 4754633682786812469L, j) /* invoke-custom */;
        }
    }

    private static final void k(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x003a: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private static final kotlin.Unit c(su.catlean._w r8) {
        /*
            long r0 = su.catlean.ez.a
            r1 = 123831625964764(0x709fcc13dcdc, double:6.1180952257853E-310)
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 66812753885566(0x3cc40e76397e, double:3.30098863989044E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 51470181752307(0x2ecfd5e65df3, double:2.542964858902E-310)
            long r1 = r1 ^ r2
            r13 = r1
            net.minecraft.class_1268 r0 = net.minecraft.class_1268.field_5808
            r1 = r8
            float r1 = r1.q()
            r2 = r8
            float r2 = r2.N()
            r3 = r11
            r4 = r3; r3 = r2; r2 = r4; 
            net.minecraft.class_1269 r0 = su.catlean.ag.x(r0, r1, r2, r3)
            net.minecraft.class_2879 r0 = new net.minecraft.class_2879
            r1 = r0
            net.minecraft.class_1268 r2 = net.minecraft.class_1268.field_5808
            r1.<init>(r2)
            net.minecraft.class_2596 r0 = (net.minecraft.class_2596) r0
            r1 = r13
            r2 = r1; r1 = r0; r0 = r2; 
            su.catlean._r.a(r-1, r0)
            kotlin.Unit r-1 = kotlin.Unit.INSTANCE
            return r-1
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ez.c(su.catlean._w):kotlin.Unit");
    }

    private static final Unit v(_w _wVar) {
        long j = a ^ 17403693178154L;
        long j2 = j ^ 138797139506862L;
        long j3 = j ^ 43111155480368L;
        gg ggVar = gg.P;
        class_1792 class_1792Var = class_1802.field_8634;
        Intrinsics.checkNotNullExpressionValue(class_1792Var, (String) b(MethodHandles.lookup(), "n", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7633, 119157030464378478L ^ j) /* invoke-custom */);
        ggVar.S(class_1792Var, W.K(j3), j2, () -> {
            return c(r3);
        });
        return Unit.INSTANCE;
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
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 12435;
        if (c[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                c[i3] = b(((Cipher) objArr[0]).doFinal(b[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/ez", e2);
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
            java.lang.String r1 = "su/catlean/ez"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ez.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 5206;
        if (g[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/ez", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            g[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return g[i3].intValue();
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
            java.lang.String r1 = "su/catlean/ez"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ez.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
