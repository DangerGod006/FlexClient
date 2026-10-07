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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.world.WorldUpdateEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_9.class */
public final class _9 extends _3 {

    @NotNull
    public static final _9 i;
    static final KProperty[] n;

    @NotNull
    private static final cq c;

    @NotNull
    private static final cq O;

    @NotNull
    private static final c8 B;

    @NotNull
    private static final az y;

    @NotNull
    private static final cw S;

    @NotNull
    private static final cq l;
    private static boolean w;

    @NotNull
    private static bg t;

    @NotNull
    private static bg F;
    private static final long h = yz.a(-3998563069585926341L, -7283649374402881105L, MethodHandles.lookup().lookupClass()).a(78911273403758L);
    private static final String[] m;
    private static final String[] o;
    private static final Map I;
    private static final long[] W;
    private static final Integer[] ob;
    private static final Map pb;

    /* JADX WARN: Illegal instructions before constructor call */
    private _9(long j) {
        long j2 = h ^ j;
        super((String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26281, 4777986949163901185L ^ j2) /* invoke-custom */, jt.n(), (int) f(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24933, 6699377559088633368L ^ j2) /* invoke-custom */, j2 ^ 84218364635439L, false);
    }

    private final boolean t(long j) {
        return ((Boolean) c.E(this, (h ^ j) ^ 104014170157544L, n[0])).booleanValue();
    }

    private final boolean F(long j) {
        return ((Boolean) O.E(this, (h ^ j) ^ 9925248084199L, n[1])).booleanValue();
    }

    private final int I(long j) {
        return ((Number) B.E(this, (h ^ j) ^ 40318073089650L, n[2])).intValue();
    }

    private final dg T(long j) {
        return (dg) y.E(this, (h ^ j) ^ 70862933657038L, n[3]);
    }

    private final void n(dg dgVar, long j) {
        y.b(this, (h ^ j) ^ 108600879521554L, n[3], dgVar);
    }

    private final rs l(long j) {
        return (rs) S.E(this, (h ^ j) ^ 47581684756831L, n[4]);
    }

    private final void P(rs rsVar, long j) {
        S.b(this, (h ^ j) ^ 99601498572948L, n[4], rsVar);
    }

    private final boolean V(long j) {
        return ((Boolean) l.E(this, (h ^ j) ^ 75725695932183L, n[5])).booleanValue();
    }

    private final void a(boolean z, long j) {
        l.b(this, (h ^ j) ^ 75155286823341L, n[5], Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010c A[Catch: NumberFormatException -> 0x0115, NumberFormatException -> 0x012a, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x0115, blocks: (B:25:0x0101, B:27:0x010c), top: B:51:0x0101, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0147 A[PHI: r0
  0x0147: PHI (r0v41 ??) = (r0v81 ??), (r0v82 ??) binds: [B:26:0x0109, B:36:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017e A[Catch: NumberFormatException -> 0x018f, TryCatch #2 {NumberFormatException -> 0x018f, blocks: (B:39:0x014f, B:41:0x017e), top: B:55:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [kotlin.ranges.ClosedFloatingPointRange] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [su.catlean.rs] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [su.catlean.rs] */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v80 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r30v0, types: [double] */
    /* JADX WARN: Type inference failed for: r32v0, types: [double] */
    @Override // su.catlean._g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void O(long r15) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._9.O(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v20, types: [int] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void X(su.catlean.api.event.events.client.TickEvent r8) {
        /*
            r7 = this;
            long r0 = su.catlean._9.h
            r1 = 129584442385127(0x75db3aa822e7, double:6.40232212179856E-310)
            long r0 = r0 ^ r1
            r9 = r0
            r0 = r9
            r1 = r0; r1 = r0; 
            r2 = 91853807119660(0x538a618b6d2c, double:4.5381810537552E-310)
            long r1 = r1 ^ r2
            r11 = r1
            r1 = r0; r2 = r0; 
            r2 = 118206826290955(0x6b822be41f0b, double:5.84019319742847E-310)
            long r1 = r1 ^ r2
            r13 = r1
            r1 = r0; r2 = r0; 
            r2 = 102700226269435(0x5d67c28150fb, double:5.07406536198506E-310)
            long r1 = r1 ^ r2
            r15 = r1
            r1 = r0; r2 = r0; 
            r2 = 126649596994314(0x732fe83d630a, double:6.25732149345293E-310)
            long r1 = r1 ^ r2
            r17 = r1
            r0 = -5665923587747727829(0xb15e98842bca362b, double:-6.926636126047425E-71)
            r1 = r9
            java.lang.String r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)Ljava/lang/String;}
            ).invoke(r0, r1)
            r19 = r0
            r0 = r11
            net.minecraft.class_310 r0 = su.catlean.zf.F(r0)     // Catch: java.lang.NumberFormatException -> L44
            net.minecraft.class_746 r0 = r0.field_1724     // Catch: java.lang.NumberFormatException -> L44
            r1 = r19
            if (r1 != 0) goto L60
            if (r0 == 0) goto Lb6
            goto L4e
        L44:
            r1 = -5676744430706463973(0xb138270457106b1b, double:-1.3669779606879832E-71)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L56
            throw r0     // Catch: java.lang.NumberFormatException -> L56
        L4e:
            r0 = r17
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)     // Catch: java.lang.NumberFormatException -> L56
            goto L60
        L56:
            r1 = -5676744430706463973(0xb138270457106b1b, double:-1.3669779606879832E-71)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L60:
            double r0 = r0.method_23318()     // Catch: java.lang.NumberFormatException -> L7e
            r1 = r17
            net.minecraft.class_746 r1 = su.catlean.zf.v(r1)     // Catch: java.lang.NumberFormatException -> L7e
            double r1 = r1.field_6036     // Catch: java.lang.NumberFormatException -> L7e
            double r1 = java.lang.Math.floor(r1)     // Catch: java.lang.NumberFormatException -> L7e
            r2 = 1063675494(0x3f666666, float:0.9)
            double r2 = (double) r2     // Catch: java.lang.NumberFormatException -> L7e
            double r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = r19
            if (r1 != 0) goto Lad
            if (r0 <= 0) goto Lb6
            goto L88
        L7e:
            r1 = -5676744430706463973(0xb138270457106b1b, double:-1.3669779606879832E-71)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> L91
            throw r0     // Catch: java.lang.NumberFormatException -> L91
        L88:
            r0 = r7
            r1 = r19
            if (r1 != 0) goto Lb1
            goto L9b
        L91:
            r1 = -5676744430706463973(0xb138270457106b1b, double:-1.3669779606879832E-71)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)     // Catch: java.lang.NumberFormatException -> La3
            throw r0     // Catch: java.lang.NumberFormatException -> La3
        L9b:
            r1 = r13
            boolean r0 = r0.t(r1)     // Catch: java.lang.NumberFormatException -> La3
            goto Lad
        La3:
            r1 = -5676744430706463973(0xb138270457106b1b, double:-1.3669779606879832E-71)
            r2 = r9
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        Lad:
            if (r0 == 0) goto Lb6
            r0 = r7
        Lb1:
            r1 = r15
            r0.d(r1)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._9.X(su.catlean.api.event.events.client.TickEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [su.catlean._3] */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @Flow
    private final void p(WorldUpdateEvent worldUpdateEvent) {
        double dFloor;
        long j = h ^ 127490611608637L;
        long j2 = j ^ 73316760992103L;
        long j3 = j ^ 25942912441931L;
        long j4 = j ^ 64003075922142L;
        long j5 = j ^ 20572174264240L;
        long j6 = j ^ 4486523044864L;
        long j7 = j >>> 16;
        int i2 = (int) (((j ^ 140055520425772L) << 48) >>> 48);
        long j8 = j ^ 61705493162114L;
        long j9 = j ^ 128674704178640L;
        ?? F2 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8035722099559491825L, j) /* invoke-custom */;
        try {
            try {
                F2 = F(j4);
                _9 _9C = F2;
                if (F2 == 0) {
                    if (F2 == 0) {
                        return;
                    } else {
                        _9C = t.q(I(j3), j5);
                    }
                }
                try {
                    if (F2 == 0) {
                        if (_9C == 0) {
                            return;
                        } else {
                            _9C = F.c((int) Math.ceil(((double) nf.f(nf.Z, null, j7, 1, (char) i2, null)) * 1.5d), j6);
                        }
                    }
                    try {
                        try {
                            if (_9C != 0) {
                                try {
                                    _9C = this;
                                    double dMethod_23317 = zf.v(j9).method_23317();
                                    double dMethod_23318 = zf.v(j9).method_23318() - Math.floor(zf.v(j9).method_23318());
                                    if (F2 != 0) {
                                        dFloor = Math.floor(dMethod_23318);
                                    } else if (dMethod_23318 > 0.8d) {
                                        dFloor = Math.floor(zf.v(j9).method_23318()) + 1.0d;
                                    } else {
                                        dMethod_23318 = zf.v(j9).method_23318();
                                        dFloor = Math.floor(dMethod_23318);
                                    }
                                    class_2338 class_2338VarMethod_49637 = class_2338.method_49637(dMethod_23317, dFloor, zf.v(j9).method_23321());
                                    Intrinsics.checkNotNullExpressionValue(class_2338VarMethod_49637, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18442, 8465111471387183917L ^ j) /* invoke-custom */);
                                    _3.s(_9C, y(class_2338VarMethod_49637, j2, new ArrayList()), true, false, null, false, (int) f(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(779, 2368813206268719347L ^ j) /* invoke-custom */, j8, null);
                                    w = true;
                                } catch (NumberFormatException unused) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_9C, 8062042759384905153L, j) /* invoke-custom */;
                                }
                            }
                        } catch (NumberFormatException unused2) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_9C, 8062042759384905153L, j) /* invoke-custom */;
                        }
                    } catch (NumberFormatException unused3) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_9C, 8062042759384905153L, j) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused4) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_9C, 8062042759384905153L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused5) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F2, 8062042759384905153L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused6) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F2, 8062042759384905153L, j) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x021d: INVOKE (r-1 I:long), (r0 I:net.minecraft.class_2596) STATIC call: su.catlean._r.a(long, net.minecraft.class_2596):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow(priority = 10)
    private final void k(su.catlean.api.event.events.network.AfterReceivePacket r13) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._9.k(su.catlean.api.event.events.network.AfterReceivePacket):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [su.catlean._3] */
    /* JADX WARN: Type inference failed for: r0v18, types: [su.catlean.bg] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Flow
    private final void z(PlayerUpdateEvent playerUpdateEvent) {
        double dFloor;
        long j = h ^ 136475425634224L;
        long j2 = j ^ 84947786314474L;
        long j3 = j ^ 61516814361359L;
        long j4 = j ^ 135151813572189L;
        _9 _9 = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7208452385736352636L, j) /* invoke-custom */;
        try {
            _9 = w;
            boolean z = _9;
            if (_9 == 0) {
                if (_9 == 0) {
                    try {
                        try {
                            _9 = this;
                            double dMethod_23317 = zf.v(j4).method_23317();
                            double dMethod_23318 = zf.v(j4).method_23318() - Math.floor(zf.v(j4).method_23318());
                            if (_9 != 0) {
                                dFloor = Math.floor(dMethod_23318);
                            } else if (dMethod_23318 > 0.8d) {
                                dFloor = Math.floor(zf.v(j4).method_23318()) + 1.0d;
                            } else {
                                dMethod_23318 = zf.v(j4).method_23318();
                                dFloor = Math.floor(dMethod_23318);
                            }
                            try {
                                class_2338 class_2338VarMethod_49637 = class_2338.method_49637(dMethod_23317, dFloor, zf.v(j4).method_23321());
                                Intrinsics.checkNotNullExpressionValue(class_2338VarMethod_49637, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(18442, 8465098122387783840L ^ j) /* invoke-custom */);
                                if (_3.s(_9, y(class_2338VarMethod_49637, j2, new ArrayList()), false, false, null, false, (int) f(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28898, 4925616340143425692L ^ j) /* invoke-custom */, j3, null)) {
                                    _9 = F;
                                    _9.l();
                                    return;
                                }
                                return;
                            } catch (NumberFormatException unused) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_9, 7237054531681107532L, j) /* invoke-custom */;
                            }
                        } catch (NumberFormatException unused2) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_9, 7237054531681107532L, j) /* invoke-custom */;
                        }
                    } catch (NumberFormatException unused3) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_9, 7237054531681107532L, j) /* invoke-custom */;
                    }
                }
                z = 0;
            }
            w = z;
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_9, 7237054531681107532L, j) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x021d: INVOKE 
          (r-1 I:su.catlean.gw)
          (r0 I:net.minecraft.class_2338)
          (r1 I:int)
          (r2 I:su.catlean.xx)
          (r3 I:su.catlean.zr)
          (r4 I:su.catlean.y4)
          (r5 I:float)
          (r6 I:float)
          (r7 I:int)
          (r8 I:long)
          (r9 I:su.catlean.yi)
          (r10 I:java.util.List)
          (r11 I:boolean)
          (r12 I:int)
          (r13 I:java.lang.Object)
         STATIC call: su.catlean.gw.P(su.catlean.gw, net.minecraft.class_2338, int, su.catlean.xx, su.catlean.zr, su.catlean.y4, float, float, int, long, su.catlean.yi, java.util.List, boolean, int, java.lang.Object):su.catlean.t5
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final java.util.List y(net.minecraft.class_2338 r21, long r22, java.util.List r24) {
        /*
            Method dump skipped, instruction units count: 1002
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._9.y(net.minecraft.class_2338, long, java.util.List):java.util.List");
    }

    @Override // su.catlean._3
    @NotNull
    protected List R(long j) {
        return T(j ^ 59067967019128L).e();
    }

    private static final boolean Z() {
        return i.F((h ^ 92015106966443L) ^ 29041357023048L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    /* JADX WARN: Type inference failed for: r0v6, types: [su.catlean.rs] */
    private static final boolean i() {
        long j = h ^ 58663851538270L;
        Object objL = j;
        try {
            objL = i.l(objL ^ 104301024709125L);
            return objL != rs.OFF;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objL, -6592874555013824862L, j) /* invoke-custom */;
        }
    }

    static {
        int i2;
        long j = h ^ 97641888017991L;
        long j2 = j ^ 98580927363607L;
        long j3 = j ^ 129806897297265L;
        long j4 = j ^ 9282649146481L;
        long j5 = j ^ 13295008605154L;
        long j6 = j ^ 69432182637670L;
        long j7 = j ^ 27303502741667L;
        I = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[27];
        int i4 = 0;
        String str = "¡+ÿÐî\u009b\u0084\u0090\nÅI\u0086\u0092\u0092sbx\u0019ÃôÃ¦áÂ2`u\u0019Cö\u0002\u0082¹3\u0007þ\u001f{7)\u0018ÎN,\u0006KØcôÜi OBþ\u008ff%=\u0014\u0096©\t\u008d\u0089 ÿé\u009b\"D5ñûõö\u0084NÏÁ´TÈ\\¡¦³\u0080ù\u0098T]5Á\u0089¢a¶ c-<¨Fh~w}§Ô`åH¿¾/\u009cÑ¦Þ\u0005\u009bµ¨±\u001dE\u009fv\u001aV8ZXÐ\u001f*Ú\u0082Ïo\u001d#;\u0084J\u0017T9\u0098/çUyE´éòlh{ \"p\u0000à_\u0084{\u0095Z²\u0012\u0000\u0014\u001d°\u0099ÃäZ\u0014\u009aîèzU\u0092\u0018§»\u0013ÔÃ\u00822ßÚ\\dÏqp;BÕ§(Ü/, Z(#\u000b}Û;©-ØlÐì°\u0005\u008aY ã\u0092\u0011N¡Ø\u001f\u0016\u0084ì>ü°r\u001cl÷?ñÔâ\u008f'ò\u0010\u0091Ghr\b\u0092ä\u0003\\\u0006P\u0086¯±\u0005Ã \u0098\u0003\u001dvÎ^Õ\u0095\u0098ùé\u0013¸è]c÷\u0096¾^O;9Þ?Nß\u009e\nºÑ«\u0018P&Ê\\\u0018Ar\u009b?EÞùÙ¾îô»>·\u001f76\u00ad*\u0018¶HSÊ\u0005¼ýE\u0018#\bå\u008bæ\u009ePE qÂdá!À\u0010Ò¾;)\u00011é\u0093èMÖïq\u0085uØ V²ºô=v\u0094²[\u0018²a\u0012Ó\u008bú¨k\u009e6R\u000bYÜqI\u0006c!@Û¹(,]¯È½§z¦\u0088]\u0017\u001c)~kÝ\u0083\u008c\u0083i´QNédWu\u009d¡°3Ô~a\u0091ªþ´oä\u0010\u0011Zbú+í7â\u008a%ö¥\u0097ù\u0006\u0098\u0010\u000bù\u001c\u0093ÀckR\u0012Lth×ºfA\u0018úKQ¦/Onh0Ôè}óTãÈ»X\u0095ÔÝÃ\u001c\u0094 a²\u0097\u0006D/7Ê'Ç¯ÙÈ}rÓ¾¬\u0089Ì\u001a\fÅ\r;C8\u009a\u008d@\tk \u0012\u0015«ø\u0081ÈÔb\u0097 9øé8LÇóÐ|®\u0082Øë\u0085z\u000e®y]hD¸\u0018\u0085î\u008cT\u008e\u0080LÓÏZ\u009cÁ\u0090¬#\u0005\u0090\u0090\u0082Rp\u001ah§ \t¬ëªÆteA¸?¬æâF\u0015Tô\u0085ÁÁù\u007f@í\u001eÉ\u0097fZ¥\u0016\u0094\u0010\tP}ß\u0010j|ëé[ò»!&R9 ô\n\u008bÝG\u0083,ð\u007fÚ\u0016\u001dåR·è\u0017\u0083\u008fL5uÄ-\u0011þÆ´ÉÜ#\u009e@\u0094(gÌé\u0016â\u0099\u0018}\u0088\u001c¾õ\u008cë(<Î\u0090où\bz\u0086\u0017\u0017{Ã\u00812àµËz\u0017 ;\n-YU\\{»\u001fð\u0015#n\u0082O[a¬_âªZ\u009b´DÀÅ Õ(\u0089ýcþJ\u009a#Uµ\u0098Ü±\u001dXü¨¾\u0087>\bèt\bÝ\\¿\u00948xÕ";
        int length = "¡+ÿÐî\u009b\u0084\u0090\nÅI\u0086\u0092\u0092sbx\u0019ÃôÃ¦áÂ2`u\u0019Cö\u0002\u0082¹3\u0007þ\u001f{7)\u0018ÎN,\u0006KØcôÜi OBþ\u008ff%=\u0014\u0096©\t\u008d\u0089 ÿé\u009b\"D5ñûõö\u0084NÏÁ´TÈ\\¡¦³\u0080ù\u0098T]5Á\u0089¢a¶ c-<¨Fh~w}§Ô`åH¿¾/\u009cÑ¦Þ\u0005\u009bµ¨±\u001dE\u009fv\u001aV8ZXÐ\u001f*Ú\u0082Ïo\u001d#;\u0084J\u0017T9\u0098/çUyE´éòlh{ \"p\u0000à_\u0084{\u0095Z²\u0012\u0000\u0014\u001d°\u0099ÃäZ\u0014\u009aîèzU\u0092\u0018§»\u0013ÔÃ\u00822ßÚ\\dÏqp;BÕ§(Ü/, Z(#\u000b}Û;©-ØlÐì°\u0005\u008aY ã\u0092\u0011N¡Ø\u001f\u0016\u0084ì>ü°r\u001cl÷?ñÔâ\u008f'ò\u0010\u0091Ghr\b\u0092ä\u0003\\\u0006P\u0086¯±\u0005Ã \u0098\u0003\u001dvÎ^Õ\u0095\u0098ùé\u0013¸è]c÷\u0096¾^O;9Þ?Nß\u009e\nºÑ«\u0018P&Ê\\\u0018Ar\u009b?EÞùÙ¾îô»>·\u001f76\u00ad*\u0018¶HSÊ\u0005¼ýE\u0018#\bå\u008bæ\u009ePE qÂdá!À\u0010Ò¾;)\u00011é\u0093èMÖïq\u0085uØ V²ºô=v\u0094²[\u0018²a\u0012Ó\u008bú¨k\u009e6R\u000bYÜqI\u0006c!@Û¹(,]¯È½§z¦\u0088]\u0017\u001c)~kÝ\u0083\u008c\u0083i´QNédWu\u009d¡°3Ô~a\u0091ªþ´oä\u0010\u0011Zbú+í7â\u008a%ö¥\u0097ù\u0006\u0098\u0010\u000bù\u001c\u0093ÀckR\u0012Lth×ºfA\u0018úKQ¦/Onh0Ôè}óTãÈ»X\u0095ÔÝÃ\u001c\u0094 a²\u0097\u0006D/7Ê'Ç¯ÙÈ}rÓ¾¬\u0089Ì\u001a\fÅ\r;C8\u009a\u008d@\tk \u0012\u0015«ø\u0081ÈÔb\u0097 9øé8LÇóÐ|®\u0082Øë\u0085z\u000e®y]hD¸\u0018\u0085î\u008cT\u008e\u0080LÓÏZ\u009cÁ\u0090¬#\u0005\u0090\u0090\u0082Rp\u001ah§ \t¬ëªÆteA¸?¬æâF\u0015Tô\u0085ÁÁù\u007f@í\u001eÉ\u0097fZ¥\u0016\u0094\u0010\tP}ß\u0010j|ëé[ò»!&R9 ô\n\u008bÝG\u0083,ð\u007fÚ\u0016\u001dåR·è\u0017\u0083\u008fL5uÄ-\u0011þÆ´ÉÜ#\u009e@\u0094(gÌé\u0016â\u0099\u0018}\u0088\u001c¾õ\u008cë(<Î\u0090où\bz\u0086\u0017\u0017{Ã\u00812àµËz\u0017 ;\n-YU\\{»\u001fð\u0015#n\u0082O[a¬_âªZ\u009b´DÀÅ Õ(\u0089ýcþJ\u009a#Uµ\u0098Ü±\u001dXü¨¾\u0087>\bèt\bÝ\\¿\u00948xÕ".length();
        char cCharAt = '(';
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b = -1;
            while (true) {
                String str2 = strSubstring;
                byte b2 = b;
                String strIntern = c(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b2) {
                    case 0:
                        int i7 = i4;
                        i4++;
                        strArr[i7] = strIntern;
                        int i8 = i6 + cCharAt;
                        i2 = i8;
                        if (i8 < length) {
                            cCharAt = str.charAt(i2);
                        } else {
                            m = strArr;
                            o = new String[27];
                            pb = new HashMap(13);
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[11];
                            int i10 = 0;
                            String str3 = "åõà\u0007+\u0099¾ÿV\u009f\u0014»´0J\u0080)(½i\u0097\u0094N0*A¸Â\b¯t\u008d@:îêd\u00911\bÃÓYÝ.ü\u001d\u008c\u0091\u0092\\\u0087Ò\u009c\b\u00adT4º\u0088\u0089óx£í6|\u0019\u0090\u0085\u0002í";
                            int length2 = "åõà\u0007+\u0099¾ÿV\u009f\u0014»´0J\u0080)(½i\u0097\u0094N0*A¸Â\b¯t\u008d@:îêd\u00911\bÃÓYÝ.ü\u001d\u008c\u0091\u0092\\\u0087Ò\u009c\b\u00adT4º\u0088\u0089óx£í6|\u0019\u0090\u0085\u0002í".length();
                            int i11 = 0;
                            while (true) {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = str3.substring(i12, i11).getBytes("ISO-8859-1");
                                long[] jArr2 = jArr;
                                int i13 = i10;
                                i10++;
                                long j8 = ((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255);
                                byte b3 = -1;
                                while (true) {
                                    byte b4 = b3;
                                    long j9 = j8;
                                    int i14 = i13;
                                    byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (j9 >>> 56), (byte) (j9 >>> 48), (byte) (j9 >>> 40), (byte) (j9 >>> 32), (byte) (j9 >>> 24), (byte) (j9 >>> 16), (byte) (j9 >>> 8), (byte) j9});
                                    long j10 = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                                    switch (i14) {
                                        case 0:
                                            jArr2[b4] = j10;
                                            if (i11 >= length2) {
                                                W = jArr;
                                                ob = new Integer[11];
                                                KProperty[] kPropertyArr = new KProperty[(int) f(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19403, 4727778602339330628L ^ j) /* invoke-custom */];
                                                kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(_9.class, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14914, 5586098537665817366L ^ j) /* invoke-custom */, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29681, 3623112063300018864L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[1] = Reflection.property1(new PropertyReference1Impl(_9.class, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24316, 2043814533648748478L ^ j) /* invoke-custom */, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(28552, 3666804710736314053L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[2] = Reflection.property1(new PropertyReference1Impl(_9.class, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(16748, 4891387560495779880L ^ j) /* invoke-custom */, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3627, 821164717488725882L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[3] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(_9.class, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1547, 5223791637848905541L ^ j) /* invoke-custom */, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14131, 282559085125002867L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[4] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(_9.class, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15755, 691205195839859922L ^ j) /* invoke-custom */, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6829, 171271861423623166L ^ j) /* invoke-custom */, 0));
                                                kPropertyArr[5] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(_9.class, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9333, 5391687905780036906L ^ j) /* invoke-custom */, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14668, 7977604586242697243L ^ j) /* invoke-custom */, 0));
                                                n = kPropertyArr;
                                                i = new _9(j4);
                                                c = yp.t(i, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3420, 7219244840954649631L ^ j) /* invoke-custom */, true, j2, null, null, (int) f(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(15785, 6433085594801019938L ^ j) /* invoke-custom */, null);
                                                O = yp.t(i, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7663, 1333841854452812983L ^ j) /* invoke-custom */, true, j2, null, null, (int) f(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5103, 6649081278223725159L ^ j) /* invoke-custom */, null);
                                                B = yp.L(i, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9032, 1797994040622182938L ^ j) /* invoke-custom */, 0, new IntRange(0, (int) f(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31497, 3186474882682673797L ^ j) /* invoke-custom */), j3, null, _9::Z, (int) f(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31181, 1703291141743564876L ^ j) /* invoke-custom */, null);
                                                _9 _9 = i;
                                                String strS = (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13580, 414955321292973136L ^ j) /* invoke-custom */;
                                                class_2248 class_2248Var = class_2246.field_10540;
                                                Intrinsics.checkNotNullExpressionValue(class_2248Var, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1328, 3349445517965087861L ^ j) /* invoke-custom */);
                                                class_2248 class_2248Var2 = class_2246.field_10443;
                                                Intrinsics.checkNotNullExpressionValue(class_2248Var2, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2788, 6933023987705174946L ^ j) /* invoke-custom */);
                                                class_2248 class_2248Var3 = class_2246.field_22108;
                                                Intrinsics.checkNotNullExpressionValue(class_2248Var3, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19031, 5588544663858518800L ^ j) /* invoke-custom */);
                                                y = yp.y(_9, strS, j6, new dg(CollectionsKt.mutableListOf(class_2248Var, class_2248Var2, class_2248Var3), j5), (h) null, (Function0) null, (int) f(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5103, 6649081278223725159L ^ j) /* invoke-custom */, (Object) null);
                                                S = yp.L(i, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4182, 1226908964708827398L ^ j) /* invoke-custom */, rs.OFF, null, null, (int) f(MethodHandles.lookup(), "k", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5103, 6649081278223725159L ^ j) /* invoke-custom */, null, j7);
                                                l = yp.t(i, (String) c(MethodHandles.lookup(), "s", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4543, 8853942321217028329L ^ j) /* invoke-custom */, false, j2, null, _9::i, 4, null);
                                                t = new bg();
                                                F = new bg();
                                                return;
                                            }
                                            break;
                                            break;
                                        default:
                                            jArr2[b4] = j10;
                                            if (i11 >= length2) {
                                                str3 = "@«¸_\u0013ÌY¨P³;\u009f\u001bÉb}";
                                                length2 = "@«¸_\u0013ÌY¨P³;\u009f\u001bÉb}".length();
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
                                    j8 = ((((long) bytes2[0]) & 255) << 56) | ((((long) bytes2[1]) & 255) << 48) | ((((long) bytes2[2]) & 255) << 40) | ((((long) bytes2[3]) & 255) << 32) | ((((long) bytes2[4]) & 255) << 24) | ((((long) bytes2[5]) & 255) << 16) | ((((long) bytes2[6]) & 255) << 8) | (((long) bytes2[7]) & 255);
                                    b3 = 0;
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
                        str = "áC¨üIü·3w\u0082ç4\u009a\u0096Å&÷30þËíú= \rÊ7´Û÷\u009f_j\nÂ\u0016;Ôø]Gß:\u0082\u008e9ÿIÉó\u0089\u0089±¦;¶";
                        length = "áC¨üIü·3w\u0082ç4\u009a\u0096Å&÷30þËíú= \rÊ7´Û÷\u009f_j\nÂ\u0016;Ôø]Gß:\u0082\u008e9ÿIÉó\u0089\u0089±¦;¶".length();
                        cCharAt = 24;
                        i2 = -1;
                        break;
                        break;
                }
                i6 = i2 + 1;
                strSubstring = str.substring(i6, i6 + cCharAt);
                b = 0;
            }
            cCharAt = str.charAt(i5);
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String c(byte[] bArr) {
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

    private static String c(int i2, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 11666;
        if (o[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) I.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    I.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                o[i3] = c(((Cipher) objArr[0]).doFinal(m[i3].getBytes("ISO-8859-1")));
            } catch (Exception e) {
                throw new RuntimeException("su/catlean/_9", e);
            }
        }
        return o[i3];
    }

    private static Object c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        String strC = c(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(String.class, strC), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return strC;
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
            r1 = 3
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
            java.lang.String r1 = "su/catlean/_9"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._9.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int f(int i2, long j) {
        int i3 = (i2 ^ ((int) (j & 32767))) ^ 23885;
        if (ob[i3] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) W[i3]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) pb.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    pb.put(lValueOf, objArr);
                } catch (Exception e) {
                    throw new RuntimeException("su/catlean/_9", e);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            ob[i3] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return ob[i3].intValue();
    }

    private static int f(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String str, Object[] objArr) {
        int iF = f(((Integer) objArr[0]).intValue(), ((Long) objArr[1]).longValue());
        mutableCallSite.setTarget(MethodHandles.dropArguments(MethodHandles.constant(Integer.TYPE, Integer.valueOf(iF)), 0, (Class<?>[]) new Class[]{Integer.TYPE, Long.TYPE}));
        return iF;
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
    private static java.lang.invoke.CallSite f(java.lang.invoke.MethodHandles.Lookup r8, java.lang.String r9, java.lang.invoke.MethodType r10) {
        /*
            java.lang.invoke.MutableCallSite r0 = new java.lang.invoke.MutableCallSite
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r11 = r0
            r0 = r11
            // decode failed: Unsupported constant type: METHOD_HANDLE
            r1 = 3
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
            java.lang.String r1 = "su/catlean/_9"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean._9.f(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
