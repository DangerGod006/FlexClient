package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/yk.class */
public final class yk implements ym {

    @NotNull
    public static final yk l;

    @NotNull
    private static final ConcurrentHashMap v;

    @NotNull
    private static final ConcurrentHashMap n;

    @NotNull
    private static final ConcurrentHashMap K;

    @NotNull
    private static final ConcurrentHashMap g;
    private static _g[] x;
    private static final long a = yz.a(4988672442325891873L, -3532439275496439958L, MethodHandles.lookup().lookupClass()).a(14824217492474L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Long[] f;
    private static final Map h;

    private yk() {
    }

    @NotNull
    public final ConcurrentHashMap A() {
        return g;
    }

    public final void I(long a2, @NotNull Pair crystal) {
        Intrinsics.checkNotNullParameter(crystal, (String) a(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23078, 5158292978347028430L ^ (a ^ a2)) /* invoke-custom */);
        n(((Number) crystal.getFirst()).intValue(), zf.A());
        O(crystal);
    }

    public final void o() {
        v.clear();
        n.clear();
        K.clear();
    }

    public final void u(int i, char c2, char c3) {
        long j = (((((long) i) << 32) | ((((long) c2) << 48) >>> 32)) | ((((long) c3) << 48) >>> 48)) ^ a;
        long j2 = j >>> 16;
        int i2 = (int) (((j ^ 2275764462666L) << 48) >>> 48);
        long jA = zf.A();
        long jF = ((long) nf.f(nf.Z, null, j2, 1, (char) i2, null)) * (long) b(MethodHandles.lookup(), "q", MethodType.methodType(Long.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4020, 3345681685980772609L ^ j) /* invoke-custom */;
        Set setEntrySet = v.entrySet();
        Function1 function1 = (v2) -> {
            return y(r1, r2, v2);
        };
        setEntrySet.removeIf((v1) -> {
            return e(r1, v1);
        });
        Set setEntrySet2 = n.entrySet();
        Function1 function12 = yk::V;
        setEntrySet2.removeIf((v1) -> {
            return b(r1, v1);
        });
        Set setEntrySet3 = K.entrySet();
        Function1 function13 = yk::h;
        setEntrySet3.removeIf((v1) -> {
            return D(r1, v1);
        });
        Set setEntrySet4 = g.entrySet();
        Function1 function14 = yk::a;
        setEntrySet4.removeIf((v1) -> {
            return R(r1, v1);
        });
    }

    public final boolean d(int id) {
        return v.containsKey(Integer.valueOf(id));
    }

    public final long Z(int id, long a2) {
        long j = a ^ a2;
        Object orDefault = v.getOrDefault(Integer.valueOf(id), Long.valueOf((long) b(MethodHandles.lookup(), "q", MethodType.methodType(Long.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2718, 8167347269938607353L ^ j) /* invoke-custom */));
        Intrinsics.checkNotNullExpressionValue(orDefault, (String) a(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(11701, 598790620748176008L ^ j) /* invoke-custom */);
        return ((Number) orDefault).longValue();
    }

    @Nullable
    public final Long n(int id, long deathTime) {
        return (Long) v.putIfAbsent(Integer.valueOf(id), Long.valueOf(deathTime));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean L(int r8, long r9) {
        /*
            r7 = this;
            long r0 = su.catlean.yk.a
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 94799336257729(0x563830c338c1, double:4.68370952934964E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -5086418146132331157(0xb96969a524ae756b, double:-3.915442715076633E-32)
            r1 = r9
            su.catlean._g[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[Lsu/catlean/_g;}
            ).invoke(r0, r1)
            r13 = r0
            java.util.concurrent.ConcurrentHashMap r0 = su.catlean.yk.n     // Catch: java.lang.NumberFormatException -> L2f
            r1 = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L2f
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.NumberFormatException -> L2f
            r1 = r13
            if (r1 == 0) goto L5c
            if (r0 == 0) goto L75
            goto L39
        L2f:
            r1 = -5080833848037512077(0xb97d4088dcf16c73, double:-9.013995666742238E-32)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L52
            throw r0     // Catch: java.lang.NumberFormatException -> L52
        L39:
            java.util.concurrent.ConcurrentHashMap r0 = su.catlean.yk.n     // Catch: java.lang.NumberFormatException -> L52
            r1 = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L52
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.NumberFormatException -> L52
            r1 = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.NumberFormatException -> L52
            su.catlean.je r0 = (su.catlean.je) r0     // Catch: java.lang.NumberFormatException -> L52
            r1 = r11
            boolean r0 = r0.N(r1)     // Catch: java.lang.NumberFormatException -> L52
            goto L5c
        L52:
            r1 = -5080833848037512077(0xb97d4088dcf16c73, double:-9.013995666742238E-32)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L5c:
            r1 = r13
            if (r1 == 0) goto L72
            if (r0 == 0) goto L75
            goto L71
        L67:
            r1 = -5080833848037512077(0xb97d4088dcf16c73, double:-9.013995666742238E-32)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L71:
            r0 = 1
        L72:
            goto L76
        L75:
            r0 = 0
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.yk.L(int, long):boolean");
    }

    private final void O(Pair pair) {
        ConcurrentHashMap concurrentHashMap = n;
        Object first = pair.getFirst();
        Function2 function2 = (v1, v2) -> {
            return C(r2, v1, v2);
        };
        concurrentHashMap.compute(first, (v1, v2) -> {
            return U(r2, v1, v2);
        });
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0087: INVOKE (r-1 I:su.catlean.ux), (r0 I:net.minecraft.class_2338), (r1 I:long), (r2 I:java.util.ArrayList) VIRTUAL call: su.catlean.ux.E(net.minecraft.class_2338, long, java.util.ArrayList):boolean
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    public final void E(short r18, short r19, @org.jetbrains.annotations.NotNull net.minecraft.class_2338 r20, int r21) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.yk.E(short, short, net.minecraft.class_2338, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v8, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Z(@org.jetbrains.annotations.NotNull net.minecraft.class_2338 r19, short r20, short r21, int r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.yk.Z(net.minecraft.class_2338, short, short, int, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0107 A[PHI: r0 r1
  0x0107: PHI (r0v23 ??) = (r0v16 ??), (r0v39 ??) binds: [B:34:0x0169, B:16:0x00e6] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r1v11 ??) = (r1v6 ??), (r1v21 ??) binds: [B:34:0x0169, B:16:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x015f A[PHI: r0
  0x015f: PHI (r0v26 ??) = (r0v57 ??), (r0v35 ??) binds: [B:19:0x0121, B:31:0x015d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, su.catlean.je] */
    /* JADX WARN: Type inference failed for: r0v22, types: [su.catlean.je] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0169 -> B:17:0x0107). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final su.catlean.je E(@org.jetbrains.annotations.NotNull net.minecraft.class_243 r9, long r10) {
        /*
            Method dump skipped, instruction units count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.yk.E(net.minecraft.class_243, long):su.catlean.je");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.je] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    public final boolean z(long a2, @NotNull class_2338 bp) {
        long j = a ^ a2;
        long j2 = j ^ 9215982980735L;
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3470243428786699307L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(bp, (String) a(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1170, 6561048820442138702L ^ j) /* invoke-custom */);
        try {
            try {
                obj = obj;
                if (obj != 0) {
                    try {
                        try {
                            obj = (je) K.get(bp);
                            if (obj != 0) {
                                boolean zN = obj.N(j2);
                                return obj != 0 ? zN : zN;
                            }
                        } catch (NumberFormatException unused) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3475900603608720691L, j) /* invoke-custom */;
                        }
                    } catch (NumberFormatException unused2) {
                        obj = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3475900603608720691L, j) /* invoke-custom */;
                        throw obj;
                    }
                }
                return false;
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3475900603608720691L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3475900603608720691L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
    private static final boolean y(long j, long j2, Map.Entry entry) {
        long j3 = a ^ 17584832544276L;
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4826690284137123578L, j3) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(entry, (String) a(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20146, 4079790048782430396L ^ j3) /* invoke-custom */);
        try {
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, (String) a(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14599, 4405977021093791490L ^ j3) /* invoke-custom */);
            obj = ((j - ((Number) value).longValue()) > j2 ? 1 : ((j - ((Number) value).longValue()) == j2 ? 0 : -1));
            return obj != 0 ? obj > 0 : obj;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -4823337679234897890L, j3) /* invoke-custom */;
        }
    }

    private static final boolean e(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    private static final boolean V(Map.Entry entry) {
        long j = a ^ 36112878394863L;
        long j2 = j ^ 75795524297058L;
        int i = (int) (j >>> 32);
        int i2 = (int) ((j2 << 32) >>> 48);
        int i3 = (int) ((j2 << 48) >>> 48);
        Intrinsics.checkNotNullParameter(entry, (String) a(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18391, 2285924288796367392L ^ j) /* invoke-custom */);
        return ((je) entry.getValue()).f(i, (short) i2, i3);
    }

    private static final boolean b(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    private static final boolean h(Map.Entry entry) {
        long j = a ^ 53726267800015L;
        long j2 = j ^ 93367037822274L;
        int i = (int) (j >>> 32);
        int i2 = (int) ((j2 << 32) >>> 48);
        int i3 = (int) ((j2 << 48) >>> 48);
        Intrinsics.checkNotNullParameter(entry, (String) a(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18391, 2285906675946208768L ^ j) /* invoke-custom */);
        return ((je) entry.getValue()).f(i, (short) i2, i3);
    }

    private static final boolean D(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    private static final boolean a(Map.Entry entry) {
        long j = a ^ 93136657310777L;
        long j2 = j >>> 16;
        int i = (int) (((j ^ 76071895662477L) << 48) >>> 48);
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2821924669790153515L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(entry, (String) a(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18391, 2285937909178770422L ^ j) /* invoke-custom */);
        try {
            long jA = zf.A();
            Intrinsics.checkNotNullExpressionValue(entry.getValue(), (String) a(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9132, 199394577416701830L ^ j) /* invoke-custom */);
            obj = ((jA - ((Number) r1).longValue()) > Math.max(((double) nf.f(nf.Z, null, j2, 1, (char) i, null)) * 1.5d, 50.0d) ? 1 : ((jA - ((Number) r1).longValue()) == Math.max(((double) nf.f(nf.Z, null, j2, 1, (char) i, null)) * 1.5d, 50.0d) ? 0 : -1));
            return obj != 0 ? obj > 0 : obj;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2827509207859720755L, j) /* invoke-custom */;
        }
    }

    private static final boolean R(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private static final je C(Pair pair, int i, je jeVar) {
        long j = a ^ 28261173846239L;
        int i2 = (int) (j >>> 32);
        long j2 = ((j ^ 88608504703563L) << 32) >>> 32;
        long j3 = j ^ 117222459808220L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6643037563774472243L, j) /* invoke-custom */;
        try {
            if (_gVarArr == null) {
                return jeVar;
            }
            if (jeVar == null) {
                return new je(zf.A(), j3, 1, (class_243) pair.getSecond(), false);
            }
            jeVar.t(i2, j2);
            return jeVar;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr, -6639685025711622443L, j) /* invoke-custom */;
        }
    }

    private static final je U(Function2 function2, Object obj, Object obj2) {
        return (je) function2.invoke(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private static final je l(class_2338 class_2338Var, boolean z, class_2338 class_2338Var2, je jeVar) {
        long j = a ^ 88679262104322L;
        int i = (int) (j >>> 32);
        long j2 = ((j ^ 28062924317078L) << 32) >>> 32;
        long j3 = j ^ 39100673643009L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7499190036612883472L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(class_2338Var2, (String) a(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23147, 6267120165345325435L ^ j) /* invoke-custom */);
        try {
            if (_gVarArr == null) {
                return jeVar;
            }
            if (jeVar == null) {
                long jA = zf.A();
                class_243 class_243VarMethod_46558 = class_2338Var.method_46558();
                Intrinsics.checkNotNullExpressionValue(class_243VarMethod_46558, (String) a(MethodHandles.lookup(), "z", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9180, 2403525243325515970L ^ j) /* invoke-custom */);
                return new je(jA, j3, 1, class_243VarMethod_46558, true);
            }
            je jeVar2 = z;
            if (jeVar2 == 0) {
                try {
                    jeVar2 = jeVar;
                    jeVar2.t(i, j2);
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(jeVar2, 7495767376230268168L, j) /* invoke-custom */;
                }
            }
            return jeVar;
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr, 7495767376230268168L, j) /* invoke-custom */;
        }
    }

    private static final je l(Function2 function2, Object obj, Object obj2) {
        return (je) function2.invoke(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
    private static final boolean D(class_243 class_243Var, class_2338 class_2338Var) {
        long j = a ^ 100537618070549L;
        Object obj = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4541161470445875975L, j) /* invoke-custom */;
        try {
            obj = (class_243Var.method_1025(class_2338Var.method_46558()) > 0.3d ? 1 : (class_243Var.method_1025(class_2338Var.method_46558()) == 0.3d ? 0 : -1));
            return obj != 0 ? obj < 0 : obj;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 4544513974951143967L, j) /* invoke-custom */;
        }
    }

    private static final boolean O(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    static {
        int i;
        long j = a ^ 44824922767073L;
        d = new HashMap(13);
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[3], -180682762765912595L, j) /* invoke-custom */;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i2 = 1; i2 < 8; i2++) {
            bArr[i2] = (byte) ((j << (i2 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[19];
        int i3 = 0;
        String str = "óN\u008eÌÞrÆ\u001dìÁD\u0097{VVß \u0092\u0088°à=ÅxonÝ$+sy¥]\u00ad-\u008fZ7#©Õ7»^y±\u0019 Å\u00104èpf%yâ\u0086Ze\u00839\u00ad\u00adM\u0017\u0010V\u0014Ô'lVâ(\u0088Íé¿hÚÔz mïl\u0086-ÓÆ\u009b\u0088&\u001cykXÉ\u0092[\u0000B0×\b½©\u0098²`³ eZ\r ßG\u0001ÜSiXòºÍk\u0082) ¡\u009cæ\u008eîÕ½Ä\u0005ÿ\u0001ûhùJ\u009d\u0018[\u0018ûsæ%a\u0018NÆuSt\u001buW/\u008b\u0092\u0086Kpsl´G Üj\u0002Ë\u0016ñGfC\u009eO$\u0012?Ïkr\u0082\u0085\u0088r¶ó\u008e\u0088ÛÜ\u009e\f\u0002Ü\u0011(C\u009c3\u0093½½Ã+\u0003\u0006\u008e\u009f\u0001a\u0098Ã\u008c\u0081Ä^å@ÐtS\u0083\u00919\u00adÏ°zËäâß\u0013\u0081$¹(e¿\\m\u001fcpüch}Ð\u001d]\u007fÂ\u0015Eï©S¾Ô Áì\u000fÔ\u0016ãÏ\u0016\u0000¤'BáK\u0094\u0092 Í¬X\fÌãÍg·1S§0\u0087û#Ã¿Â\u0083ü\u0004%ö\u0090O½×\u008dÕ\u001bñ(Ö\u0016\u008cÙ\u008fèÎp=\u0019×R~¾¹j|R(\u008ae\u001bdÞ\u0080Á.ÌÚ>\u0013n\"\u008c}Ê+ã\u0000Ê _¤Oö\u001e4\u0007jýt\u0086Ã*\u0093\u0014¨ðz+ X©ñF\nÒÿ\u000bQÅ\u0001\u001a\u0010\u00881\u000fÐ½D\rä\u0010Bµr%ú5b\u0010\u0084c]a\u0001\u0004üwu\u001f\u00912Õ\\>Q(Ã\nÀ¡\foÔ¾µw(f¥ç\u000e©µãìÇG9'¯<c\u009f8\u0004ã-)@º\u0007\u001cuYÎ\u0095\u0018Åø\u001d\u001b\u009f\u0091A\u000b×\u0096l\u0083\u0092\r×a>É R\u0089n\u008f\n";
        int length = "óN\u008eÌÞrÆ\u001dìÁD\u0097{VVß \u0092\u0088°à=ÅxonÝ$+sy¥]\u00ad-\u008fZ7#©Õ7»^y±\u0019 Å\u00104èpf%yâ\u0086Ze\u00839\u00ad\u00adM\u0017\u0010V\u0014Ô'lVâ(\u0088Íé¿hÚÔz mïl\u0086-ÓÆ\u009b\u0088&\u001cykXÉ\u0092[\u0000B0×\b½©\u0098²`³ eZ\r ßG\u0001ÜSiXòºÍk\u0082) ¡\u009cæ\u008eîÕ½Ä\u0005ÿ\u0001ûhùJ\u009d\u0018[\u0018ûsæ%a\u0018NÆuSt\u001buW/\u008b\u0092\u0086Kpsl´G Üj\u0002Ë\u0016ñGfC\u009eO$\u0012?Ïkr\u0082\u0085\u0088r¶ó\u008e\u0088ÛÜ\u009e\f\u0002Ü\u0011(C\u009c3\u0093½½Ã+\u0003\u0006\u008e\u009f\u0001a\u0098Ã\u008c\u0081Ä^å@ÐtS\u0083\u00919\u00adÏ°zËäâß\u0013\u0081$¹(e¿\\m\u001fcpüch}Ð\u001d]\u007fÂ\u0015Eï©S¾Ô Áì\u000fÔ\u0016ãÏ\u0016\u0000¤'BáK\u0094\u0092 Í¬X\fÌãÍg·1S§0\u0087û#Ã¿Â\u0083ü\u0004%ö\u0090O½×\u008dÕ\u001bñ(Ö\u0016\u008cÙ\u008fèÎp=\u0019×R~¾¹j|R(\u008ae\u001bdÞ\u0080Á.ÌÚ>\u0013n\"\u008c}Ê+ã\u0000Ê _¤Oö\u001e4\u0007jýt\u0086Ã*\u0093\u0014¨ðz+ X©ñF\nÒÿ\u000bQÅ\u0001\u001a\u0010\u00881\u000fÐ½D\rä\u0010Bµr%ú5b\u0010\u0084c]a\u0001\u0004üwu\u001f\u00912Õ\\>Q(Ã\nÀ¡\foÔ¾µw(f¥ç\u000e©µãìÇG9'¯<c\u009f8\u0004ã-)@º\u0007\u001cuYÎ\u0095\u0018Åø\u001d\u001b\u009f\u0091A\u000b×\u0096l\u0083\u0092\r×a>É R\u0089n\u008f\n".length();
        char cCharAt = 16;
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
                            c = new String[19];
                            h = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i8 = 1; i8 < 8; i8++) {
                                bArr2[i8] = (byte) ((j << (i8 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[2];
                            int i9 = 0;
                            int length2 = "k\u009a  ì\u009bÏ]}«\u008b¸¹«DÝ".length();
                            int i10 = 0;
                            do {
                                int i11 = i10;
                                i10 += 8;
                                byte[] bytes = "k\u009a  ì\u009bÏ]}«\u008b¸¹«DÝ".substring(i11, i10).getBytes("ISO-8859-1");
                                i9++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i10 < length2);
                            e = jArr;
                            f = new Long[2];
                            l = new yk();
                            v = new ConcurrentHashMap();
                            n = new ConcurrentHashMap();
                            K = new ConcurrentHashMap();
                            g = new ConcurrentHashMap();
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
                        str = "å\u009f\u0018×Î-$U\u009eÖ\n\u0081óQÚ\u009e\u009c8\u000fXþ¯\u008d\\Ìöþ?\u0095\nð< ô\u009fPV.\u00150[©Y¦@¹¦;:ßF\u0010Ý,Z¬Ç\u001c¤IOùý\u0087\u0012";
                        length = "å\u009f\u0018×Î-$U\u009eÖ\n\u0081óQÚ\u009e\u009c8\u000fXþ¯\u008d\\Ìöþ?\u0095\nð< ô\u009fPV.\u00150[©Y¦@¹¦;:ßF\u0010Ý,Z¬Ç\u001c¤IOùý\u0087\u0012".length();
                        cCharAt = ' ';
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

    public static void f(_g[] _gVarArr) {
        x = _gVarArr;
    }

    public static _g[] N() {
        return x;
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
        int i2 = (i ^ ((int) (j & 32767))) ^ 16959;
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
                throw new RuntimeException("su/catlean/yk", e2);
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
            java.lang.String r1 = "su/catlean/yk"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.yk.a(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static long b(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 19309;
        if (f[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) e[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/yk", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            f[i2] = Long.valueOf(((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255));
        }
        return f[i2].longValue();
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        long jB = b(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Long.TYPE, Long.valueOf(jB)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return jB;
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
            java.lang.String r1 = "su/catlean/yk"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.yk.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
