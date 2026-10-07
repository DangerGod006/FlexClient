package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_10209;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3928;
import net.minecraft.class_8671;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.player.FreecamStateEvent;
import su.catlean.api.event.events.player.KeyboardInputEvent;
import su.catlean.api.event.events.player.MoveEvent;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.player.UpdateCrosshairTarget;
import su.catlean.api.event.events.render.SetupTerrainEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ea.class */
public final class ea extends _g {

    @NotNull
    public static final ea D = null;
    static final KProperty[] z = null;

    @NotNull
    private static final ct E = null;

    @NotNull
    private static final ct i = null;

    @NotNull
    private static final cq N = null;
    private static float A;
    private static float K;
    private static float S;
    private static float a;

    @NotNull
    private static class_243 T;

    @NotNull
    private static class_243 h;
    private static float e;
    private static float J;
    private static float c;

    @NotNull
    private static class_243 L;

    @NotNull
    private static _w x;
    private static final long b = 0;
    private static final String[] d = null;
    private static final String[] f = null;
    private static final Map g = null;
    private static final long[] j = null;
    private static final Integer[] k = null;
    private static final Map l = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private ea(int i2, short s, char c2) {
        long j2 = (((((long) i2) << 32) | ((((long) s) << 48) >>> 32)) | ((((long) c2) << 48) >>> 48)) ^ b;
        super((String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7206, 7232713123547876430L ^ j2) /* invoke-custom */, jt.y(), null, 4, null, j2 ^ 91903260316310L);
    }

    private final float x(long j2) {
        return ((Number) E.E(this, (b ^ j2) ^ 90738204511101L, z[0])).floatValue();
    }

    private final float D(long j2) {
        return ((Number) i.E(this, (b ^ j2) ^ 66381748479261L, z[1])).floatValue();
    }

    private final boolean L(long j2) {
        return ((Boolean) N.E(this, (b ^ j2) ^ 24079794346752L, z[2])).booleanValue();
    }

    @Override // su.catlean._g
    public void O(long j2) {
        long j3 = j2 ^ 32978412894279L;
        long j4 = j2 ^ 62698557940930L;
        long j5 = j2 ^ 67464996320865L;
        Object obj = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2597154808533792747L, j2) /* invoke-custom */;
        try {
            try {
                class_310 class_310VarF = zf.F(j3);
                if (obj == null) {
                    obj = class_310VarF.field_1687;
                    if (obj == null) {
                        return;
                    } else {
                        class_310VarF = zf.F(j3);
                    }
                }
                try {
                    class_310VarF = class_310VarF.field_1724;
                    if (obj == null) {
                        if (class_310VarF == null) {
                            return;
                        }
                        zf.F(j3).field_1730 = false;
                        K = zf.v(j5).method_36455();
                        A = zf.v(j5).method_36454();
                        a = K;
                        S = A;
                        T = new class_243(zf.v(j5).method_23317(), zf.v(j5).method_23318() + ((double) zf.v(j5).method_18381(zf.v(j5).method_18376())), zf.v(j5).method_23321());
                        h = new class_243(zf.v(j5).method_23317(), zf.v(j5).method_23318(), zf.v(j5).method_23321());
                        class_310VarF = zf.v(j5);
                    }
                    class_243 class_243VarMethod_18798 = class_310VarF.method_18798();
                    Intrinsics.checkNotNullExpressionValue(class_243VarMethod_18798, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(3623, 4840894563411998979L ^ j2) /* invoke-custom */);
                    L = class_243VarMethod_18798;
                    x = new _w(zf.v(j5).method_36454(), j4, zf.v(j5).method_36455(), false, null, (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19908, 6203530027474687602L ^ j2) /* invoke-custom */, null);
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_310VarF, 2613866198881122005L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2613866198881122005L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 2613866198881122005L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v16, types: [long] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    @Override // su.catlean._g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(long r8) {
        /*
            r7 = this;
            r0 = r8
            r1 = r0; r0 = r0; 
            r2 = 64129331416845(0x3a534604cf0d, double:3.1684099543831E-310)
            long r1 = r1 ^ r2
            r10 = r1
            r1 = r0; r2 = r0; 
            r2 = 60471910827463(0x36ffb6c385c7, double:2.9877093678225E-310)
            long r1 = r1 ^ r2
            r12 = r1
            r1 = r0; r2 = r0; 
            r2 = 65044256163258(0x3b284bc885ba, double:3.21361324295635E-310)
            long r1 = r1 ^ r2
            r14 = r1
            r1 = r0; r2 = r0; 
            r2 = 29647348875563(0x1af6cfb2c12b, double:1.4647736569686E-310)
            long r1 = r1 ^ r2
            r16 = r1
            r0 = 1387343038405902497(0x1340d52499cb80a1, double:6.103571773696954E-216)
            r1 = r8
            int[] r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (J, J)[I}
            ).invoke(r0, r1)
            r18 = r0
            r0 = r7
            r1 = r14
            boolean r0 = r0.S(r1)     // Catch: java.lang.NumberFormatException -> L39
            r1 = r18
            if (r1 != 0) goto L6a
            if (r0 != 0) goto L44
            goto L43
        L39:
            r1 = 1372602659313582495(0x130c76d8a624819f, double:6.4507881261218495E-217)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L43:
            return
        L44:
            r0 = r10
            r1 = r8
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L87
            net.minecraft.class_310 r0 = su.catlean.zf.F(r0)     // Catch: java.lang.NumberFormatException -> L60
            r1 = 1
            r0.field_1730 = r1     // Catch: java.lang.NumberFormatException -> L60
            r0 = r18
            if (r0 != 0) goto L85
            r0 = r7
            r1 = r12
            boolean r0 = r0.L(r1)     // Catch: java.lang.NumberFormatException -> L60
            goto L6a
        L60:
            r1 = 1372602659313582495(0x130c76d8a624819f, double:6.4507881261218495E-217)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L6a:
            if (r0 == 0) goto L9b
            r0 = r16
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)     // Catch: java.lang.NumberFormatException -> L7b
            net.minecraft.class_243 r1 = su.catlean.ea.L     // Catch: java.lang.NumberFormatException -> L7b
            r0.method_18799(r1)     // Catch: java.lang.NumberFormatException -> L7b
            goto L85
        L7b:
            r1 = 1372602659313582495(0x130c76d8a624819f, double:6.4507881261218495E-217)
            r2 = r8
            java.lang.NumberFormatException r0 = call_site(
                {METHOD_HANDLE: INVOKE_STATIC: Lsu/catlean/vm;->a(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;}
                {STRING: "Å"}
                {METHOD_TYPE: (Ljava/lang/Object;, J, J)Ljava/lang/NumberFormatException;}
            ).invoke(r0, r1, r2)
            throw r0
        L85:
            r0 = r16
        L87:
            net.minecraft.class_746 r0 = su.catlean.zf.v(r0)
            su.catlean._w r1 = su.catlean.ea.x
            float r1 = r1.q()
            r2 = 0
            su.catlean._w r3 = su.catlean.ea.x
            float r3 = r3.N()
            r4 = 0
            r0.method_64578(r1, r2, r3, r4)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ea.b(long):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v37, types: [double[]] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [net.minecraft.class_239] */
    /* JADX WARN: Type inference failed for: r0v48, types: [net.minecraft.class_239] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [su.catlean.ea] */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r1v33, types: [double] */
    /* JADX WARN: Type inference failed for: r3v2, types: [double] */
    @Flow(priority = 10)
    private final void O(PlayerUpdateEvent playerUpdateEvent) {
        long j2 = b ^ 98229404994446L;
        long j3 = j2 ^ 945387640384L;
        long j4 = j2 ^ 82535520259319L;
        long j5 = j2 ^ 80713617068492L;
        long j6 = j2 ^ 47782802966445L;
        long j7 = j2 ^ 78660165263205L;
        long j8 = j2 ^ 15606811503511L;
        long j9 = j2 ^ 97010978766064L;
        long j10 = j2 ^ 35706559305830L;
        Object obj = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5336184654488787436L, j2) /* invoke-custom */;
        try {
            obj = obj;
            try {
                if (obj == null) {
                    try {
                        try {
                            obj = zf.F(j3).field_1687;
                            if (obj != null) {
                                class_310 class_310VarF = zf.F(j3);
                                ?? F = class_310VarF;
                                if (obj == null) {
                                    if (class_310VarF.field_1724 != null) {
                                        F = zf.F(j3);
                                    }
                                }
                                try {
                                    try {
                                        F = ((class_310) F).field_1755 instanceof class_3928;
                                        F = F;
                                        if (obj == null) {
                                            if (F == 0) {
                                                F = zf.F(j3).field_1755 instanceof class_8671;
                                                if (F != 0) {
                                                }
                                            }
                                            F = this;
                                            F.d(j8);
                                        } else if (F != 0) {
                                            try {
                                                F = this;
                                                F.d(j8);
                                            } catch (NumberFormatException unused) {
                                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F, 5350641773089577170L, j2) /* invoke-custom */;
                                            }
                                        }
                                        S = A;
                                        a = K;
                                        A = zf.v(j10).method_36454();
                                        K = zf.v(j10).method_36455();
                                        ?? O = dm.O(dm.h, x(j4), false, e, j9, J, 0.0f, (int) c(MethodHandles.lookup(), "y", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9382, 7578712497769812242L ^ j2) /* invoke-custom */, null);
                                        try {
                                            try {
                                                h = T;
                                                class_243 class_243VarMethod_1031 = T.method_1031((double) O[0], c, (double) O[1]);
                                                Intrinsics.checkNotNullExpressionValue(class_243VarMethod_1031, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7471, 4530971240204289027L ^ j2) /* invoke-custom */);
                                                T = class_243VarMethod_1031;
                                                O = zf.F(j3).field_1765;
                                                ?? Y = O;
                                                if (obj == null) {
                                                    if (O == 0) {
                                                        return;
                                                    }
                                                    class_239 class_239Var = zf.F(j3).field_1765;
                                                    Intrinsics.checkNotNull(class_239Var);
                                                    Y = class_239Var;
                                                }
                                                try {
                                                    try {
                                                        if (Y.method_17784() != null) {
                                                            Y = dm.h.Y(j6);
                                                            if (Y == 0) {
                                                                _8 _8 = _8.P;
                                                                ye yeVar = _w.W;
                                                                class_239 class_239Var2 = zf.F(j3).field_1765;
                                                                Intrinsics.checkNotNull(class_239Var2);
                                                                class_243 class_243VarMethod_17784 = class_239Var2.method_17784();
                                                                Intrinsics.checkNotNullExpressionValue(class_243VarMethod_17784, (String) b(MethodHandles.lookup(), "q", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5252, 7626018749360917931L ^ j2) /* invoke-custom */);
                                                                _8.O(j5, yeVar.I(class_243VarMethod_17784, j7), 0);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    } catch (NumberFormatException unused2) {
                                                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Y, 5350641773089577170L, j2) /* invoke-custom */;
                                                    }
                                                } catch (NumberFormatException unused3) {
                                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Y, 5350641773089577170L, j2) /* invoke-custom */;
                                                }
                                            } catch (NumberFormatException unused4) {
                                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(O, 5350641773089577170L, j2) /* invoke-custom */;
                                            }
                                        } catch (NumberFormatException unused5) {
                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(O, 5350641773089577170L, j2) /* invoke-custom */;
                                        }
                                    } catch (NumberFormatException unused6) {
                                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F, 5350641773089577170L, j2) /* invoke-custom */;
                                    }
                                } catch (NumberFormatException unused7) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F, 5350641773089577170L, j2) /* invoke-custom */;
                                }
                            }
                            d(j8);
                        } catch (NumberFormatException unused8) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 5350641773089577170L, j2) /* invoke-custom */;
                        }
                    } catch (NumberFormatException unused9) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 5350641773089577170L, j2) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused10) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 5350641773089577170L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused11) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 5350641773089577170L, j2) /* invoke-custom */;
        }
    }

    @Flow
    private final void G(SetupTerrainEvent setupTerrainEvent) {
        long j2 = b ^ 140263377848723L;
        long j3 = j2 ^ 41898773042269L;
        long j4 = j2 ^ 45041094617482L;
        Object obj = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(581185820018646001L, j2) /* invoke-custom */;
        if (obj == null) {
            try {
                try {
                    try {
                        obj = zf.F(j3).field_1687;
                        if (obj != null && zf.F(j3).field_1724 != null) {
                            setupTerrainEvent.cancel();
                            return;
                        }
                        d(j4);
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 602473619844209359L, j2) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 602473619844209359L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 602473619844209359L, j2) /* invoke-custom */;
            }
        }
    }

    @Flow
    private final void A(FreecamStateEvent freecamStateEvent) {
        long j2 = b ^ 125159272375221L;
        long j3 = j2 ^ 44384801029755L;
        long j4 = j2 ^ 20515918282350L;
        long j5 = j2 ^ 27112058992991L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j5 << 32) >>> 56);
        int i4 = (int) ((j5 << 40) >>> 40);
        long j6 = j2 ^ 43164585511245L;
        long j7 = j2 ^ 118475895853256L;
        long j8 = j2 ^ 15365084643099L;
        long j9 = j2 ^ 42552510530476L;
        Object obj = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6757995207695584809L, j2) /* invoke-custom */;
        if (obj == null) {
            try {
                try {
                    try {
                        obj = zf.F(j3).field_1687;
                        if (obj != null && zf.F(j3).field_1724 != null) {
                            freecamStateEvent.cancel();
                            freecamStateEvent.setX(P(j6));
                            freecamStateEvent.setY(l(j4));
                            freecamStateEvent.setZ(T(i2, (byte) i3, i4));
                            freecamStateEvent.setYaw(G(j7));
                            freecamStateEvent.setPitch(i(j8));
                            return;
                        }
                        d(j9);
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6738963023120289559L, j2) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6738963023120289559L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6738963023120289559L, j2) /* invoke-custom */;
            }
        }
    }

    @Flow
    private final void h(UpdateCrosshairTarget updateCrosshairTarget) {
        long j2 = b ^ 89248321407616L;
        long j3 = j2 ^ 9489525413710L;
        long j4 = j2 ^ 55353194813275L;
        long j5 = j2 ^ 61949855649898L;
        int i2 = (int) (j2 >>> 32);
        int i3 = (int) ((j5 << 32) >>> 56);
        int i4 = (int) ((j5 << 40) >>> 40);
        long j6 = j2 ^ 82736205871613L;
        long j7 = j2 ^ 49504362403374L;
        long j8 = j2 ^ 8509912490104L;
        long j9 = j2 ^ 6926989568665L;
        long j10 = j2 ^ 7701900724535L;
        Object obj = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(5405418886969809122L, j2) /* invoke-custom */;
        try {
            try {
                obj = obj;
                try {
                    if (obj == null) {
                        try {
                            obj = zf.F(j3).field_1687;
                            if (obj != null) {
                                class_310 class_310VarF = zf.F(j3);
                                if (obj == null) {
                                    if (class_310VarF.field_1724 != null) {
                                        class_10209.method_64146().method_15407();
                                        updateCrosshairTarget.cancel();
                                        class_310VarF = zf.F(j3);
                                    }
                                }
                                class_310VarF.field_1765 = dm.h.p(G(j6), i(j7), P(j8), l(j4), T(i2, (byte) i3, i4), j10);
                                return;
                            }
                            d(j9);
                        } catch (NumberFormatException unused) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 5426631025665694172L, j2) /* invoke-custom */;
                        }
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 5426631025665694172L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 5426631025665694172L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 5426631025665694172L, j2) /* invoke-custom */;
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
    @su.catlean.gofra.Flow
    private final void U(su.catlean.api.event.events.client.InputEvent r9) {
        /*
            Method dump skipped, instruction units count: 1366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ea.U(su.catlean.api.event.events.client.InputEvent):void");
    }

    @Flow
    public final void o(@NotNull KeyboardInputEvent e2) {
        Intrinsics.checkNotNullParameter(e2, "e");
        e2.cancel();
    }

    @Flow(priority = -10)
    private final void H(MoveEvent moveEvent) {
        MoveEvent moveEvent2;
        long j2 = b ^ 120205903815380L;
        long j3 = j2 ^ 58108013870874L;
        long j4 = j2 ^ 62077901288912L;
        long j5 = j2 ^ 63999048434381L;
        Object obj = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6676626379829071690L, j2) /* invoke-custom */;
        try {
            try {
                obj = obj;
                if (obj == null) {
                    try {
                        obj = zf.F(j3).field_1687;
                        if (obj != null && (moveEvent2 = zf.F(j3).field_1724) != null) {
                            try {
                                if (L(j4)) {
                                    moveEvent.setX(0.0d);
                                    moveEvent.setY(0.0d);
                                    moveEvent.setZ(0.0d);
                                    moveEvent2 = moveEvent;
                                    moveEvent2.cancel();
                                    return;
                                }
                                return;
                            } catch (NumberFormatException unused) {
                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(moveEvent2, -6693624124559445624L, j2) /* invoke-custom */;
                            }
                        }
                        d(j5);
                    } catch (NumberFormatException unused2) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6693624124559445624L, j2) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6693624124559445624L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -6693624124559445624L, j2) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    /* JADX WARN: Type inference failed for: r0v11, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [net.minecraft.class_638] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void L(su.catlean.api.event.events.network.SendPacket r8) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ea.L(su.catlean.api.event.events.network.SendPacket):void");
    }

    private final float G(long j2) {
        long j3 = b ^ j2;
        return jl.y.B(S, A, zi.v.n((int) (j3 >>> 32), (char) ((r1 << 32) >>> 48), (int) (((j3 ^ 20541654267495L) << 48) >>> 48)));
    }

    private final float i(long j2) {
        long j3 = b ^ j2;
        return jl.y.B(a, K, zi.v.n((int) (j3 >>> 32), (char) ((r1 << 32) >>> 48), (int) (((j3 ^ 128192388520372L) << 48) >>> 48)));
    }

    private final double P(long j2) {
        long j3 = (b ^ j2) ^ 103544722550754L;
        return jl.y.W(h.field_1352, T.field_1352, zi.v.n((int) (r0 >>> 32), (char) ((j3 << 32) >>> 48), (int) ((j3 << 48) >>> 48)));
    }

    private final double l(long j2) {
        long j3 = (b ^ j2) ^ 118501766060225L;
        return jl.y.W(h.field_1351, T.field_1351, zi.v.n((int) (r0 >>> 32), (char) ((j3 << 32) >>> 48), (int) ((j3 << 48) >>> 48)));
    }

    private final double T(int i2, byte b2, int i3) {
        long j2 = ((((((long) i2) << 32) | ((((long) b2) << 56) >>> 32)) | ((((long) i3) << 40) >>> 40)) ^ b) ^ 107507041935344L;
        return jl.y.W(h.field_1350, T.field_1350, zi.v.n((int) (r0 >>> 32), (char) ((j2 << 32) >>> 48), (int) ((j2 << 48) >>> 48)));
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
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 4653;
        if (f[i3] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) g.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i4 = 1; i4 < 8; i4++) {
                    bArr[i4] = (byte) ((j2 << (i4 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                f[i3] = b(((Cipher) objArr[0]).doFinal(d[i3].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/ea", e2);
            }
        }
        return f[i3];
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
            java.lang.String r1 = "su/catlean/ea"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ea.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i2, long j2) {
        int i3 = (i2 ^ ((int) (j2 & 32767))) ^ 32441;
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
                    throw new RuntimeException("su/catlean/ea", e2);
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
            java.lang.String r1 = "su/catlean/ea"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.ea.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
