package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_4050;
import net.minecraft.class_6373;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.EventPlayerTravel;
import su.catlean.api.event.events.player.EventPostPlayerTravel;
import su.catlean.api.event.events.player.FallFlyingEvent;
import su.catlean.api.event.events.player.JumpEvent;
import su.catlean.api.event.events.player.SetPoseEvent;
import su.catlean.api.event.events.player.ShouldStopSprintingEvent;
import su.catlean.gofra.Flow;
import su.catlean.mixins.accessors.KeyMappingAccessor;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_0.class */
public final class _0 extends _g {

    @NotNull
    public static final _0 D = null;
    static final KProperty[] c = null;

    @NotNull
    private static final cq F = null;

    @NotNull
    private static final cq d = null;

    @NotNull
    private static final cw k = null;

    @NotNull
    private static final cq g = null;

    @NotNull
    private static final cq x = null;

    @NotNull
    private static final ct y = null;

    @NotNull
    private static final cq m = null;
    private static float j;
    private static float a;
    private static float T;
    private static float w;
    private static float A;
    private static boolean V;
    private static boolean L;
    private static boolean f;
    private static boolean K;
    private static int b;

    @NotNull
    private static final Queue l = null;

    @NotNull
    private static final Queue O = null;

    @NotNull
    private static final LinkedList C = null;

    @NotNull
    private static final LinkedList N = null;
    private static boolean B;
    private static double G;
    private static final long e = 0;
    private static final String[] h = null;
    private static final String[] i = null;
    private static final Map n = null;
    private static final long[] o = null;
    private static final Integer[] t = null;
    private static final Map u = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private _0(long j2) {
        long j3 = e ^ j2;
        super((String) b(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8068, 571813488924792248L ^ j3) /* invoke-custom */, jt.c(), null, 4, null, j3 ^ 101967666279694L);
    }

    private final boolean p(long j2) {
        return ((Boolean) F.E(this, (e ^ j2) ^ 35200148290181L, c[0])).booleanValue();
    }

    private final void l(char c2, boolean z, char c3, int i2) {
        F.b(this, ((((((long) c2) << 48) | ((((long) c3) << 48) >>> 16)) | ((((long) i2) << 32) >>> 32)) ^ e) ^ 44082406872135L, c[0], Boolean.valueOf(z));
    }

    private final boolean l(char c2, long j2) {
        return ((Boolean) d.E(this, (((((long) c2) << 48) | ((j2 << 16) >>> 16)) ^ e) ^ 30333207193660L, c[1])).booleanValue();
    }

    private final void d(boolean z, long j2) {
        d.b(this, (e ^ j2) ^ 28497877041986L, c[1], Boolean.valueOf(z));
    }

    private final t6 Y(long j2, int i2) {
        return (t6) k.E(this, (((j2 << 32) | ((((long) i2) << 32) >>> 32)) ^ e) ^ 82596213978587L, c[2]);
    }

    private final void x(long j2, t6 t6Var) {
        k.b(this, (e ^ j2) ^ 43718322939023L, c[2], t6Var);
    }

    private final boolean Z(long j2) {
        return ((Boolean) g.E(this, (e ^ j2) ^ 91686431574529L, c[3])).booleanValue();
    }

    private final void r(boolean z, short s, int i2, short s2) {
        g.b(this, ((((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s2) << 48) >>> 48)) ^ e) ^ 46477705900884L, c[3], Boolean.valueOf(z));
    }

    private final boolean H(long j2) {
        return ((Boolean) x.E(this, (e ^ j2) ^ 99979009782857L, c[4])).booleanValue();
    }

    private final void k(boolean z, byte b2, long j2) {
        x.b(this, (((((long) b2) << 56) | ((j2 << 8) >>> 8)) ^ e) ^ 14890692903957L, c[4], Boolean.valueOf(z));
    }

    private final float V(long j2) {
        return ((Number) y.E(this, (e ^ j2) ^ 138818102280744L, c[5])).floatValue();
    }

    private final void w(float f2, short s, int i2, short s2) {
        y.b(this, ((((((long) s) << 48) | ((((long) i2) << 32) >>> 16)) | ((((long) s2) << 48) >>> 48)) ^ e) ^ 59771863550855L, c[5], Float.valueOf(f2));
    }

    private final boolean Q(long j2) {
        long j3 = e ^ j2;
        return ((Boolean) m.E(this, j3 ^ 119816712820515L, c[(int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7455, 7081334068889765098L ^ j3) /* invoke-custom */])).booleanValue();
    }

    private final void H(boolean z, long j2) {
        long j3 = e ^ j2;
        m.b(this, j3 ^ 21850746122919L, c[(int) c(MethodHandles.lookup(), "g", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21493, 3832395207604329L ^ j3) /* invoke-custom */], Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    @Override // su.catlean._g
    public void O(long j2) {
        long j3 = j2 ^ 32978412894279L;
        long j4 = j2 ^ 67464996320865L;
        Object obj = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2646257265504916477L, j2) /* invoke-custom */;
        K = false;
        try {
            try {
                b = 0;
                if (obj == 0) {
                    obj = zf.F(j3).field_1724;
                    if (obj != 0) {
                        A = zf.v(j4).method_36454();
                    }
                    C.clear();
                    N.clear();
                }
                Object obj2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                if (obj2 >= 0) {
                    try {
                        if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2620972475537570510L, j2) /* invoke-custom */ == null) {
                            return;
                        }
                        obj2 = obj + 1;
                        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj2, 2737517070520783029L, j2) /* invoke-custom */;
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj2, 2623007067860359779L, j2) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2623007067860359779L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2623007067860359779L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @su.catlean.gofra.Flow(priority = -10)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void n(su.catlean.api.event.events.player.PreElytraEvent r8) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._0.n(su.catlean.api.event.events.player.PreElytraEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v24, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    @su.catlean.gofra.Flow(priority = -10)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void l(su.catlean.api.event.events.player.AfterElytraEvent r8) {
        /*
            r7 = this;
            long r0 = su.catlean._0.e
            r1 = 79521828697491(0x48531e59f593, double:3.9289003653903E-310)
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 90699204709854(0x527d8de0cdde, double:4.48113611522614E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 44599157031698(0x28900ce98312, double:2.2034911322841E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r1 = r0; r2 = r0; 
            r2 = 11000237892921(0xa013145a539, double:5.4348396389734E-311)
            long r1 = r1 ^ r2
            r15 = r1
            r0 = 8593932486650903074(0x7743c81062843a22, double:3.189226768295872E266)
            r1 = r9
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r17 = r0
            r0 = r7
            r1 = r11
            boolean r0 = r0.H(r1)     // Catch: java.lang.NumberFormatException -> L3b
            r1 = r17
            if (r1 == 0) goto L94
            if (r0 != 0) goto L6d
            goto L45
        L3b:
            r1 = 8592582616258021691(0x773efc5d3141893b, double:2.497806869462129E266)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L53
            throw r0     // Catch: java.lang.NumberFormatException -> L53
        L45:
            r0 = r7
            r1 = r13
            boolean r0 = r0.p(r1)     // Catch: java.lang.NumberFormatException -> L53 java.lang.NumberFormatException -> L63
            r1 = r17
            if (r1 == 0) goto L94
            goto L5d
        L53:
            r1 = 8592582616258021691(0x773efc5d3141893b, double:2.497806869462129E266)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L63
            throw r0     // Catch: java.lang.NumberFormatException -> L63
        L5d:
            if (r0 == 0) goto Lba
            goto L6d
        L63:
            r1 = 8592582616258021691(0x773efc5d3141893b, double:2.497806869462129E266)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L7a
            throw r0     // Catch: java.lang.NumberFormatException -> L7a
        L6d:
            r0 = r15
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)     // Catch: java.lang.NumberFormatException -> L7a java.lang.NumberFormatException -> L8a
            r1 = r17
            if (r1 == 0) goto Lb4
            goto L84
        L7a:
            r1 = 8592582616258021691(0x773efc5d3141893b, double:2.497806869462129E266)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L8a
            throw r0     // Catch: java.lang.NumberFormatException -> L8a
        L84:
            boolean r0 = r0.method_6128()     // Catch: java.lang.NumberFormatException -> L8a
            goto L94
        L8a:
            r1 = 8592582616258021691(0x773efc5d3141893b, double:2.497806869462129E266)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L94:
            if (r0 == 0) goto Lba
            r0 = r15
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)     // Catch: java.lang.NumberFormatException -> Laa
            float r1 = su.catlean._0.j     // Catch: java.lang.NumberFormatException -> Laa
            r0.method_36457(r1)     // Catch: java.lang.NumberFormatException -> Laa
            r0 = r15
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)     // Catch: java.lang.NumberFormatException -> Laa
            goto Lb4
        Laa:
            r1 = 8592582616258021691(0x773efc5d3141893b, double:2.497806869462129E266)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lb4:
            float r1 = su.catlean._0.a
            r0.method_36456(r1)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._0.l(su.catlean.api.event.events.player.AfterElytraEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    @Flow
    public final void m(@NotNull EventPlayerTravel e2) {
        long j2 = e ^ 59848246308468L;
        long j3 = j2 ^ 94429856676431L;
        long j4 = j2 ^ 95303508580597L;
        long j5 = j2 ^ 9823198322776L;
        long j6 = j2 ^ 127803973074654L;
        Object objP = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6006475694359715387L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(e2, "e");
        try {
            try {
                objP = p(j4);
                class_746 class_746VarV = objP;
                if (objP != 0) {
                    if (objP == 0) {
                        return;
                    } else {
                        class_746VarV = S(j3);
                    }
                }
                if (class_746VarV != 0) {
                    try {
                        T = zf.v(j6).method_36454();
                        w = zf.v(j6).method_36455();
                        zf.v(j6).method_36457(V(j5));
                        class_746VarV = zf.v(j6);
                        class_746VarV.method_36456(A);
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_746VarV, -5991614477484797220L, j2) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objP, -5991614477484797220L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objP, -5991614477484797220L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    @Flow
    public final void s(@NotNull EventPostPlayerTravel e2) {
        long j2 = e ^ 101729907286875L;
        long j3 = j2 ^ 69309994547040L;
        long j4 = j2 ^ 66274638747098L;
        long j5 = j2 ^ 33912959071217L;
        Object objP = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2417268370830355690L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(e2, "e");
        try {
            try {
                objP = p(j4);
                class_746 class_746VarV = objP;
                if (objP != 0) {
                    if (objP == 0) {
                        return;
                    } else {
                        class_746VarV = S(j3);
                    }
                }
                if (class_746VarV != 0) {
                    try {
                        zf.v(j5).method_36456(T);
                        class_746VarV = zf.v(j5);
                        class_746VarV.method_36457(w);
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_746VarV, 2447399135413067763L, j2) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objP, 2447399135413067763L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objP, 2447399135413067763L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Flow(priority = -10)
    private final void O(JumpEvent jumpEvent) {
        long j2 = e ^ 93962758164533L;
        long j3 = j2 ^ 59057853621940L;
        Object objP = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1317107774036550915L, j2) /* invoke-custom */;
        try {
            objP = objP;
            if (objP == 0) {
                try {
                    objP = p(j3);
                    if (objP == 0) {
                        return;
                    } else {
                        jumpEvent.setYaw(A);
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objP, 1340068808744430749L, j2) /* invoke-custom */;
                }
            }
            jumpEvent.cancel();
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objP, 1340068808744430749L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r18v0 */
    @Flow
    private final void p(FallFlyingEvent fallFlyingEvent) {
        long j2 = e ^ 106649191671103L;
        long j3 = j2 ^ 258262111166L;
        int i2 = (int) (j2 >>> 32);
        long j4 = ((j2 ^ 112503142666330L) << 32) >>> 32;
        ?? P = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1733920232114574706L, j2) /* invoke-custom */;
        try {
            try {
                try {
                    try {
                        P = p(j3);
                        ?? value = P;
                        if (P != 0) {
                            if (P != 0) {
                                if (!V) {
                                    return;
                                }
                                fallFlyingEvent.setValue(true);
                                fallFlyingEvent.cancel();
                                if (P != 0) {
                                    return;
                                }
                            }
                            value = fallFlyingEvent.getValue();
                        }
                        ?? r18 = value;
                        try {
                            try {
                                try {
                                    value = V;
                                    try {
                                        if (P != 0) {
                                            if (value != 0) {
                                                value = r18 == true ? 1 : 0;
                                                if (P != 0) {
                                                    if (value == 0) {
                                                        fallFlyingEvent.setValue(E(i2, j4));
                                                        fallFlyingEvent.cancel();
                                                    }
                                                    value = r18 == true ? 1 : 0;
                                                }
                                            } else {
                                                value = r18 == true ? 1 : 0;
                                            }
                                        }
                                        V = value;
                                    } catch (NumberFormatException unused) {
                                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(value, -1760110372322862697L, j2) /* invoke-custom */;
                                    }
                                } catch (NumberFormatException unused2) {
                                    value = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(value, -1760110372322862697L, j2) /* invoke-custom */;
                                    throw value;
                                }
                            } catch (NumberFormatException unused3) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(value, -1760110372322862697L, j2) /* invoke-custom */;
                            }
                        } catch (NumberFormatException unused4) {
                            value = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(value, -1760110372322862697L, j2) /* invoke-custom */;
                            throw value;
                        }
                    } catch (NumberFormatException unused5) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(P, -1760110372322862697L, j2) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused6) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(P, -1760110372322862697L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused7) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(P, -1760110372322862697L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused8) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(P, -1760110372322862697L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v7, types: [su.catlean.api.event.events.player.ShouldStopSprintingEvent] */
    @Flow
    private final void Z(ShouldStopSprintingEvent shouldStopSprintingEvent) {
        long j2 = e ^ 5867244881290L;
        Object obj = j2;
        try {
            if (A(obj ^ 64084835149669L)) {
                obj = shouldStopSprintingEvent;
                obj.cancel();
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -8707796361974351582L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow
    private final void d(SetPoseEvent setPoseEvent) {
        long j2 = e ^ 132612869980929L;
        long j3 = j2 ^ 117920487736580L;
        long j4 = j2 ^ 78626588172782L;
        long j5 = j2 ^ 26797470283136L;
        Object objA = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-9118835539522734537L, j2) /* invoke-custom */;
        try {
            try {
                objA = A(j4);
                SetPoseEvent setPoseEventP = objA;
                if (objA == 0) {
                    if (objA == 0) {
                        return;
                    } else {
                        setPoseEventP = Z(j3);
                    }
                }
                try {
                    if (objA == 0) {
                        if (setPoseEventP == 0) {
                            return;
                        } else {
                            setPoseEventP = p(j5);
                        }
                    }
                    if (setPoseEventP != 0) {
                        try {
                            setPoseEvent.cancel();
                            setPoseEventP = setPoseEvent;
                            setPoseEventP.setPose(class_4050.field_18076);
                        } catch (NumberFormatException unused) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(setPoseEventP, -9102675817370320983L, j2) /* invoke-custom */;
                        }
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(setPoseEventP, -9102675817370320983L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objA, -9102675817370320983L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objA, -9102675817370320983L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:95:0x02f5
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void B(su.catlean.api.event.events.player.PlayerUpdateEvent r16) {
        /*
            Method dump skipped, instruction units count: 1047
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._0.B(su.catlean.api.event.events.player.PlayerUpdateEvent):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:70:0x0185
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void U(su.catlean.api.event.events.network.ReceivePacket r10) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._0.U(su.catlean.api.event.events.network.ReceivePacket):void");
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:101:0x022f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:132)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    @su.catlean.gofra.Flow
    private final void J(su.catlean.api.event.events.network.SendPacket r10) {
        /*
            Method dump skipped, instruction units count: 1447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._0.J(su.catlean.api.event.events.network.SendPacket):void");
    }

    private final double t(double d2) {
        return d2 - Math.floor(d2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Override // su.catlean._g
    public void b(long j2) {
        ?? r0;
        long j3 = j2 ^ 64129331416845L;
        long j4 = j2 ^ 73907896531847L;
        long j5 = j2 ^ 29281619393040L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j5 << 32) >>> 48);
        int i4 = (int) ((j5 << 48) >>> 48);
        long j6 = j2 ^ 43815837977696L;
        long j7 = j2 ^ 114558609552098L;
        long j8 = j2 ^ 44030506242343L;
        int i5 = (int) (j2 >>> 48);
        int i6 = (int) ((j8 << 16) >>> 32);
        int i7 = (int) ((j8 << 48) >>> 48);
        ?? K2 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1392132249108045360L, j2) /* invoke-custom */;
        try {
            try {
                KeyMappingAccessor keyMappingAccessor = zf.F(j3).field_1690.field_1894;
                Intrinsics.checkNotNull(keyMappingAccessor, (String) b(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(12502, 393905644906351986L ^ j2) /* invoke-custom */);
                K2 = bx.k((short) i5, i6, (char) i7, keyMappingAccessor.getKey().method_1444());
                ?? K3 = K2;
                if (K2 != 0) {
                    if (K2 == 0) {
                        zf.F(j3).field_1690.field_1894.method_23481(false);
                    }
                    KeyMappingAccessor keyMappingAccessor2 = zf.F(j3).field_1690.field_1903;
                    Intrinsics.checkNotNull(keyMappingAccessor2, (String) b(MethodHandles.lookup(), "v", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8060, 3947833979797873361L ^ j2) /* invoke-custom */);
                    K3 = bx.k((short) i5, i6, (char) i7, keyMappingAccessor2.getKey().method_1444());
                }
                try {
                    if (j2 > 0) {
                        r0 = K3;
                        if (K2 != 0) {
                            if (K3 == 0) {
                                zf.F(j3).field_1690.field_1903.method_23481(false);
                            }
                            V = false;
                            r0 = 0;
                        }
                        try {
                            L = r0;
                            h(j4);
                            R(j7);
                            i(i2, i3, i4);
                            w(j6);
                            K3 = K2;
                        } catch (NumberFormatException unused) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 1381739404069367081L, j2) /* invoke-custom */;
                        }
                    }
                    int i8 = K3;
                    if (j2 > 0) {
                        if (K3 != 0) {
                            return;
                        } else {
                            i8 = 5;
                        }
                    }
                    r0 = new _g[i8];
                    vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 1397120299992947038L, j2) /* invoke-custom */;
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(K3, 1381739404069367081L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(K2, 1381739404069367081L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(K2, 1381739404069367081L, j2) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x01ae: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final boolean E(int r13, long r14) {
        /*
            Method dump skipped, instruction units count: 1134
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._0.E(int, long):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:380)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:50)
        */
    private final boolean A(long r9) {
        /*
            Method dump skipped, instruction units count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._0.A(long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean B(@org.jetbrains.annotations.NotNull net.minecraft.class_1799 r7, long r8) {
        /*
            r6 = this;
            long r0 = su.catlean._0.e
            r1 = r8
            long r0 = r0 ^ r1
            r8 = r0
            r0 = 1487997676124611554(0x14a66e00b003a3e2, double:3.411272774859314E-209)
            r1 = r8
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r1 = r7
            java.lang.String r2 = "s"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            r10 = r0
            r0 = r7
            int r0 = r0.method_7919()     // Catch: java.lang.NumberFormatException -> L2c
            r1 = r10
            if (r1 != 0) goto L4a
            r1 = r7
            int r1 = r1.method_7936()     // Catch: java.lang.NumberFormatException -> L2c java.lang.NumberFormatException -> L40
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto L63
            goto L36
        L2c:
            r1 = 1475423594804931196(0x1479c1f13d93ea7c, double:4.8967531962253595E-210)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L40
            throw r0     // Catch: java.lang.NumberFormatException -> L40
        L36:
            r0 = r7
            net.minecraft.class_9331 r1 = net.minecraft.class_9334.field_54197     // Catch: java.lang.NumberFormatException -> L40
            boolean r0 = r0.method_57826(r1)     // Catch: java.lang.NumberFormatException -> L40
            goto L4a
        L40:
            r1 = 1475423594804931196(0x1479c1f13d93ea7c, double:4.8967531962253595E-210)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L4a:
            r1 = r10
            if (r1 != 0) goto L60
            if (r0 == 0) goto L63
            goto L5f
        L55:
            r1 = 1475423594804931196(0x1479c1f13d93ea7c, double:4.8967531962253595E-210)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L5f:
            r0 = 1
        L60:
            goto L64
        L63:
            r0 = 0
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._0.B(net.minecraft.class_1799, long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    private final boolean v(long j2) {
        long j3 = e ^ j2;
        long j4 = j3 ^ 5101046411102L;
        int i2 = (int) (j3 >>> 48);
        long j5 = ((j3 ^ 83933444853091L) << 16) >>> 16;
        Object objZ = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3137767879497770730L, j3) /* invoke-custom */;
        try {
            try {
                try {
                    objZ = Z(j4);
                    if (objZ == 0) {
                        return objZ;
                    }
                    if (objZ == 0) {
                        boolean zL = l((char) i2, j5);
                        if (objZ == 0) {
                            return zL;
                        }
                        if (!zL) {
                            return false;
                        }
                    }
                    return true;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, 3167898669883971059L, j3) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, 3167898669883971059L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objZ, 3167898669883971059L, j3) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x0047: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void h(long r9) {
        /*
            r8 = this;
            long r0 = su.catlean._0.e
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 42581007322412(0x26ba29d0cd2c, double:2.10378128833183E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = -6119295707546720654(0xab13e4f9b41ae672, double:-3.55298258751246E-101)
            r1 = r9
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r1 = 1
            su.catlean._0.K = r1
            r13 = r0
        L1d:
            java.util.Queue r0 = su.catlean._0.l
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6d
            java.util.Queue r0 = su.catlean._0.l     // Catch: java.lang.NumberFormatException -> L63
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.NumberFormatException -> L63
            r1 = r0
            r2 = 25150(0x623e, float:3.5243E-41)
            r3 = 4412437062607857609(0x3d3c20215e8267c9, double:9.992188116299178E-14)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/_0;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "v"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)     // Catch: java.lang.NumberFormatException -> L63
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.NumberFormatException -> L63
            net.minecraft.class_2596 r0 = (net.minecraft.class_2596) r0     // Catch: java.lang.NumberFormatException -> L63
            r1 = r11
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.NumberFormatException -> L63
            su.catlean._r.a(r-1, r0)     // Catch: java.lang.NumberFormatException -> L63
        L4a:
            r0 = r13
            r1 = r9
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L57
            if (r0 == 0) goto L71
            r0 = r13
        L57:
            if (r0 != 0) goto L1d
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L4a
            goto L6d
        L63:
            r1 = -6093703770382838421(0xab6ed0b4e7df556b, double:-1.761072704968481E-99)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6d:
            r0 = 0
            su.catlean._0.K = r0
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._0.h(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    private final void R(long j2) {
        long j3 = e ^ j2;
        long j4 = j3 ^ 49777240456746L;
        long j5 = j3 ^ 79180909328296L;
        ?? Method_18854 = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2128285137999515881L, j3) /* invoke-custom */;
        try {
            try {
                Method_18854 = zf.F(j4).method_18854();
                ?? IsEmpty = Method_18854;
                if (Method_18854 != 0) {
                    if (Method_18854 == 0) {
                        return;
                    } else {
                        IsEmpty = O.isEmpty();
                    }
                }
                while (true) {
                    ?? r0 = IsEmpty;
                    if (j3 >= 0) {
                        if (IsEmpty != 0) {
                            return;
                        }
                        try {
                            ((class_6373) O.poll()).method_36949(zf.k(j5));
                            IsEmpty = Method_18854;
                            r0 = IsEmpty;
                        } catch (NumberFormatException unused) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(IsEmpty, -2158354810933470194L, j3) /* invoke-custom */;
                        }
                    }
                    if (r0 == 0) {
                        if (j3 >= 0) {
                        }
                        return;
                    }
                    IsEmpty = O.isEmpty();
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_18854, -2158354810933470194L, j3) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_18854, -2158354810933470194L, j3) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x004a: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void w(long r9) {
        /*
            r8 = this;
            long r0 = su.catlean._0.e
            r1 = r9
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 72960879540939(0x425b874ebacb, double:3.60474640715394E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 72607651401358(0x420949450e8e, double:3.5872946182628E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r0 = -2525252650035539563(0xdcf480181a849195, double:-6.103228896535462E139)
            r1 = r9
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r1 = 1
            su.catlean._0.K = r1
            r15 = r0
        L24:
            java.util.LinkedList r0 = su.catlean._0.C
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L70
            java.util.LinkedList r0 = su.catlean._0.C     // Catch: java.lang.NumberFormatException -> L66
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.NumberFormatException -> L66
            r1 = r0
            r2 = 23656(0x5c68, float:3.3149E-41)
            r3 = 6842555531877723762(0x5ef5a400b974ae72, double:2.767119328443293E149)
            r4 = r9
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/_0;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "v"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)     // Catch: java.lang.NumberFormatException -> L66
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.NumberFormatException -> L66
            net.minecraft.class_2596 r0 = (net.minecraft.class_2596) r0     // Catch: java.lang.NumberFormatException -> L66
            r1 = r11
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.NumberFormatException -> L66
            su.catlean._r.a(r-1, r0)     // Catch: java.lang.NumberFormatException -> L66
        L4d:
            r0 = r15
            r1 = r9
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L5a
            if (r0 == 0) goto L7f
            r0 = r15
        L5a:
            if (r0 != 0) goto L24
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L4d
            goto L70
        L66:
            r1 = -2555313035161820532(0xdc89b4554941228c, double:-5.978551189345824E137)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L70:
            r0 = 0
            su.catlean._0.K = r0
            r0 = r13
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)
            float r0 = r0.method_36454()
            su.catlean._0.A = r0
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._0.w(long):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x005f: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void i(int r9, int r10, int r11) {
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
            long r1 = su.catlean._0.e
            long r0 = r0 ^ r1
            r12 = r0
            r0 = r12
            r1 = r0; r1 = r0; 
            r2 = 139790527646907(0x7f2384be4cbb, double:6.90656973243577E-310)
            long r1 = r1 ^ r2
            r14 = r1
            r0 = 3063781866960349157(0x2a84bd60197467e5, double:7.234274297398136E-104)
            r1 = r12
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r1 = 1
            su.catlean._0.K = r1
            r16 = r0
        L37:
            java.util.LinkedList r0 = su.catlean._0.N
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L82
            java.util.LinkedList r0 = su.catlean._0.N     // Catch: java.lang.NumberFormatException -> L77
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.NumberFormatException -> L77
            r1 = r0
            r2 = 25150(0x623e, float:3.5243E-41)
            r3 = 4412535570189575774(0x3d3c79b8f3ece65e, double:1.0116522164435697E-13)
            r4 = r12
            long r3 = r3 ^ r4
            java.lang.String r2 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/_0;->b(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "v"}
                {METHOD_TYPE: (I, J)Ljava/lang/String;}
            ).invoke(r2, r3)     // Catch: java.lang.NumberFormatException -> L77
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.NumberFormatException -> L77
            net.minecraft.class_2596 r0 = (net.minecraft.class_2596) r0     // Catch: java.lang.NumberFormatException -> L77
            r1 = r14
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.NumberFormatException -> L77
            su.catlean._r.a(r-1, r0)     // Catch: java.lang.NumberFormatException -> L77
        L62:
            r0 = r16
            r1 = r10
            if (r1 < 0) goto L6d
            if (r0 == 0) goto L86
            r0 = r16
        L6d:
            if (r0 != 0) goto L37
            r0 = r11
            if (r0 <= 0) goto L62
            goto L82
        L77:
            r1 = 3096657046413628668(0x2af9892d4ab1d4fc, double:1.140123107190626E-101)
            r2 = r12
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L82:
            r0 = 0
            su.catlean._0.K = r0
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._0.i(int, int, int):void");
    }

    private static final boolean L() {
        return D.p((e ^ 108595566679710L) ^ 2231010943007L);
    }

    private static final boolean z() {
        return D.p((e ^ 125518608939522L) ^ 20802785856643L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean F() {
        long j2 = e ^ 76208398332400L;
        long j3 = j2 ^ 41286248859505L;
        Object objP = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8295847172610408001L, j2) /* invoke-custom */;
        try {
            objP = D.p(j3);
            return objP != 0 ? objP == 0 : objP;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objP, 8313065750979579224L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean n() {
        /*
            long r0 = su.catlean._0.e
            r1 = 99033186959069(0x5a11f5edfedd, double:4.89288954746493E-310)
            long r0 = r0 ^ r1
            r7 = r0
            r0 = r7
            r1 = r0; r1 = r0; 
            r2 = 70641043949200(0x403f6654c690, double:3.49013130016614E-310)
            long r1 = r1 ^ r2
            r9 = r1
            r1 = r0; r2 = r0; 
            r2 = 64677499209820(0x3ad2e75d885c, double:3.19549304184964E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r0 = 8984472273551739883(0x7caf41ee5765cbeb, double:3.8990665249004313E292)
            r1 = r7
            int r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)I}
            ).invoke(r0, r1)
            r13 = r0
            su.catlean._0 r0 = su.catlean._0.D     // Catch: java.lang.NumberFormatException -> L34
            r1 = r9
            boolean r0 = r0.H(r1)     // Catch: java.lang.NumberFormatException -> L34
            r1 = r13
            if (r1 != 0) goto L53
            if (r0 == 0) goto L6c
            goto L3e
        L34:
            r1 = 8966928678679577205(0x7c70ee1fdaf58275, double:2.639837723850184E291)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L49
            throw r0     // Catch: java.lang.NumberFormatException -> L49
        L3e:
            su.catlean._0 r0 = su.catlean._0.D     // Catch: java.lang.NumberFormatException -> L49
            r1 = r11
            boolean r0 = r0.p(r1)     // Catch: java.lang.NumberFormatException -> L49
            goto L53
        L49:
            r1 = 8966928678679577205(0x7c70ee1fdaf58275, double:2.639837723850184E291)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L53:
            r1 = r13
            if (r1 != 0) goto L69
            if (r0 != 0) goto L6c
            goto L68
        L5e:
            r1 = 8966928678679577205(0x7c70ee1fdaf58275, double:2.639837723850184E291)
            r2 = r7
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L68:
            r0 = 1
        L69:
            goto L6d
        L6c:
            r0 = 0
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._0.n():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    private static final boolean B() {
        long j2 = e ^ 20024847512480L;
        long j3 = j2 ^ 126398595089697L;
        Object objP = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5633429421648771434L, j2) /* invoke-custom */;
        try {
            objP = D.p(j3);
            return objP == 0 ? objP == 0 : objP;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objP, -5688707993593164024L, j2) /* invoke-custom */;
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 12265;
        if (i[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) n.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    n.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                i[i3] = b(((Cipher) objArr[0]).doFinal(h[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/_0", e2);
            }
        }
        return i[i3];
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
            r1 = 1
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
            java.lang.String r1 = "su/catlean/_0"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._0.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 727;
        if (t[i3] == null) {
            byte[] bArr = {(byte) (j2 >>> 56), (byte) (j2 >>> 48), (byte) (j2 >>> 40), (byte) (j2 >>> 32), (byte) (j2 >>> 24), (byte) (j2 >>> 16), (byte) (j2 >>> 8), (byte) j2};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) o[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) u.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    u.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/_0", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            t[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return t[i3].intValue();
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
            r1 = 1
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
            java.lang.String r1 = "su/catlean/_0"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._0.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
