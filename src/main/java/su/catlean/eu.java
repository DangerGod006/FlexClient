package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2374;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.client.InputEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/eu.class */
public final class eu extends _g {

    @NotNull
    public static final eu a;
    static final KProperty[] w;

    @NotNull
    private static final cq j;

    @NotNull
    private static final cq D;

    @NotNull
    private static final cq F;
    private static final long b = yz.a(-5306137456776108652L, 4681884645453785999L, MethodHandles.lookup().lookupClass()).a(175136623383614L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    /* JADX WARN: Illegal instructions before constructor call */
    private eu(long j2, char c2) {
        long j3 = ((j2 << 16) | ((((long) c2) << 48) >>> 48)) ^ b;
        super((String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(1299, 3267273587792844908L ^ j3) /* invoke-custom */, jt.v(), null, 4, null, j3 ^ 112413503504974L);
    }

    private final boolean l(long j2) {
        return ((Boolean) j.E(this, (b ^ j2) ^ 113489308808741L, w[0])).booleanValue();
    }

    private final boolean n(long j2) {
        return ((Boolean) D.E(this, (b ^ j2) ^ 97133167545737L, w[1])).booleanValue();
    }

    private final boolean W(long j2) {
        return ((Boolean) F.E(this, (b ^ j2) ^ 39086308055569L, w[2])).booleanValue();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x00a7: IPUT (r0 I:net.minecraft.class_239), (r-1 I:net.minecraft.class_310) net.minecraft.class_310.field_1765 net.minecraft.class_239
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    @su.catlean.gofra.Flow
    private final void e(su.catlean.api.event.events.player.UpdateCrosshairTarget r12) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.eu.e(su.catlean.api.event.events.player.UpdateCrosshairTarget):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [net.minecraft.class_243] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, net.minecraft.class_243] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v0, types: [net.minecraft.class_243] */
    private final class_239 H(class_1297 class_1297Var, double d2, long j2, float f) {
        long j3 = b ^ j2;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1084671321848357057L, j3) /* invoke-custom */;
        class_239 class_239VarMethod_5745 = class_1297Var.method_5745(d2, f, false);
        Intrinsics.checkNotNullExpressionValue(class_239VarMethod_5745, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(7927, 2942774451929816885L ^ j3) /* invoke-custom */);
        class_243 class_243VarMethod_5836 = class_1297Var.method_5836(f);
        Intrinsics.checkNotNullExpressionValue(class_243VarMethod_5836, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(13411, 8261999032782992806L ^ j3) /* invoke-custom */);
        ?? Method_17784 = class_239VarMethod_5745.method_17784();
        Intrinsics.checkNotNullExpressionValue(Method_17784, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(9524, 2132762204724667642L ^ j3) /* invoke-custom */);
        try {
            Method_17784 = Method_17784;
            class_243 class_243Var = class_243VarMethod_5836;
            ?? r0 = Method_17784;
            class_243 class_243Var2 = class_243Var;
            if (_gVarArr == null) {
                try {
                    Method_17784 = Method_17784.method_24802((class_2374) class_243Var, d2);
                    if (Method_17784 != 0) {
                        return class_239VarMethod_5745;
                    }
                    class_243 class_243VarMethod_17784 = class_239VarMethod_5745.method_17784();
                    class_243Var2 = class_243VarMethod_17784;
                    r0 = class_243VarMethod_17784;
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_17784, 1095763028108550058L, j3) /* invoke-custom */;
                }
            }
            Intrinsics.checkNotNullExpressionValue(class_243Var2, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23488, 8006498936296167942L ^ j3) /* invoke-custom */);
            ?? r20 = r0;
            class_2350 class_2350VarMethod_10142 = class_2350.method_10142(((class_243) r20).field_1352 - class_243VarMethod_5836.field_1352, ((class_243) r20).field_1351 - class_243VarMethod_5836.field_1351, ((class_243) r20).field_1350 - class_243VarMethod_5836.field_1350);
            Intrinsics.checkNotNullExpressionValue(class_2350VarMethod_10142, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27963, 8621670517039557878L ^ j3) /* invoke-custom */);
            class_239 class_239VarMethod_17778 = class_3965.method_17778((class_243) r20, class_2350VarMethod_10142, class_2338.method_49638((class_2374) r20));
            Intrinsics.checkNotNullExpressionValue(class_239VarMethod_17778, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4656, 8610086391630664688L ^ j3) /* invoke-custom */);
            return class_239VarMethod_17778;
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_17784, 1095763028108550058L, j3) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0083  */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v16, types: [su.catlean.api.event.events.player.AttackEvent] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    @su.catlean.gofra.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(@org.jetbrains.annotations.NotNull su.catlean.api.event.events.player.AttackEvent r10) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.eu.n(su.catlean.api.event.events.player.AttackEvent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v17, types: [net.minecraft.class_746] */
    /* JADX WARN: Type inference failed for: r0v19, types: [su.catlean.api.event.events.client.InputEvent] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [su.catlean.api.event.events.client.InputEvent$Action] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [su.catlean.api.event.events.client.InputEvent] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v40, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v41, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v67, types: [net.minecraft.class_3965] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1, types: [int] */
    /* JADX WARN: Type inference failed for: r36v2, types: [int] */
    @Flow
    public final void A(@NotNull InputEvent e2) {
        ?? r0;
        long j2 = b ^ 74316364215227L;
        long j3 = j2 ^ 99045121564335L;
        int i = (int) (j2 >>> 32);
        long j4 = ((j2 ^ 113440382804358L) << 32) >>> 32;
        long j5 = j2 ^ 127858789024602L;
        long j6 = j2 ^ 29182928391479L;
        long j7 = j2 ^ 103594049640647L;
        long j8 = j2 ^ 132655346789934L;
        long j9 = j2 ^ 36128780019118L;
        long j10 = j2 ^ 134901516963977L;
        ?? W = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4813460778539838720L, j2) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(e2, "e");
        try {
            try {
                try {
                    W = W(j9);
                    if (W != 0) {
                        try {
                            W = zf.F(j3).field_1724;
                            if (W != 0) {
                                InputEvent inputEvent = e2;
                                ?? action = inputEvent;
                                if (W == 0) {
                                    if (inputEvent.getDevice() != InputEvent.Device.Mouse) {
                                        return;
                                    } else {
                                        action = e2;
                                    }
                                }
                                try {
                                    if (W == 0) {
                                        try {
                                            action = action.getAction();
                                            if (action != InputEvent.Action.Press) {
                                                return;
                                            } else {
                                                action = e2;
                                            }
                                        } catch (NumberFormatException unused) {
                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(action, 4824957646259737195L, j2) /* invoke-custom */;
                                        }
                                    }
                                    try {
                                        try {
                                            action = action.getKey();
                                            ?? F2 = action;
                                            if (W == 0) {
                                                if (action != 1) {
                                                    return;
                                                } else {
                                                    F2 = zf.v(j10).method_5715();
                                                }
                                            }
                                            try {
                                                if (F2 == 0) {
                                                    try {
                                                        try {
                                                            F2 = zf.F(j3);
                                                            ?? F3 = F2;
                                                            if (W == 0) {
                                                                if (((class_310) F2).field_1755 != null) {
                                                                    return;
                                                                } else {
                                                                    F3 = zf.F(j3);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    try {
                                                                        F3 = ((class_310) F3).field_1765 instanceof class_3965;
                                                                        ?? r02 = F3;
                                                                        if (W == 0) {
                                                                            if (F3 != 0) {
                                                                                class_638 class_638VarZ = zf.z(j8);
                                                                                class_3965 class_3965Var = zf.F(j3).field_1765;
                                                                                Intrinsics.checkNotNull(class_3965Var, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(8546, 6355197933754805625L ^ j2) /* invoke-custom */);
                                                                                boolean zMethod_31709 = class_638VarZ.method_8320(class_3965Var.method_17777()).method_31709();
                                                                                r02 = zMethod_31709;
                                                                                if (W == 0) {
                                                                                    if (zMethod_31709) {
                                                                                        return;
                                                                                    }
                                                                                    r02 = 1;
                                                                                }
                                                                            } else {
                                                                                r02 = 1;
                                                                            }
                                                                        }
                                                                        ?? r36 = r02;
                                                                        int iMethod_55754 = (int) zf.v(j10).method_55754();
                                                                        if (r36 <= iMethod_55754) {
                                                                            do {
                                                                                class_2338 class_2338VarMethod_49638 = class_2338.method_49638(zf.v(j10).method_33571().method_1019(dm.h.y(dm.h.w(j6), dm.h.U(j5)).method_1021(r36 == true ? 1.0d : 0.0d)));
                                                                                Intrinsics.checkNotNullExpressionValue(class_2338VarMethod_49638, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(30912, 3936206744270877914L ^ j2) /* invoke-custom */);
                                                                                if (zf.z(j8).method_8320(class_2338VarMethod_49638).method_31709()) {
                                                                                    gw gwVar = gw.Y;
                                                                                    class_3959 class_3959Var = new class_3959(zf.v(j10).method_33571(), class_2338VarMethod_49638.method_46558(), class_3959.class_3960.field_17558, class_3959.class_242.field_1348, zf.v(j10));
                                                                                    class_2680 class_2680VarMethod_8320 = zf.z(j8).method_8320(class_2338VarMethod_49638);
                                                                                    Intrinsics.checkNotNullExpressionValue(class_2680VarMethod_8320, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31846, 276134022423490686L ^ j2) /* invoke-custom */);
                                                                                    ?? A = gwVar.A(j7, class_3959Var, class_2338VarMethod_49638, class_2680VarMethod_8320);
                                                                                    try {
                                                                                        zf.Z(i, j4).method_2896(zf.v(j10), class_1268.field_5808, (class_3965) A);
                                                                                        zf.v(j10).method_6104(class_1268.field_5808);
                                                                                        A = W;
                                                                                        if (A == 0) {
                                                                                            return;
                                                                                        } else {
                                                                                            return;
                                                                                        }
                                                                                    } catch (NumberFormatException unused2) {
                                                                                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(A, 4824957646259737195L, j2) /* invoke-custom */;
                                                                                    }
                                                                                }
                                                                                r0 = r36;
                                                                                if (r0 == iMethod_55754) {
                                                                                    return;
                                                                                }
                                                                                try {
                                                                                    r36++;
                                                                                    r0 = W;
                                                                                } catch (NumberFormatException unused3) {
                                                                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 4824957646259737195L, j2) /* invoke-custom */;
                                                                                }
                                                                            } while (r0 == 0);
                                                                            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[3], 4810391706742311164L, j2) /* invoke-custom */;
                                                                        }
                                                                    } catch (NumberFormatException unused4) {
                                                                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F3, 4824957646259737195L, j2) /* invoke-custom */;
                                                                    }
                                                                } catch (NumberFormatException unused5) {
                                                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F3, 4824957646259737195L, j2) /* invoke-custom */;
                                                                }
                                                            } catch (NumberFormatException unused6) {
                                                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F3, 4824957646259737195L, j2) /* invoke-custom */;
                                                            }
                                                        } catch (NumberFormatException unused7) {
                                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F2, 4824957646259737195L, j2) /* invoke-custom */;
                                                        }
                                                    } catch (NumberFormatException unused8) {
                                                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F2, 4824957646259737195L, j2) /* invoke-custom */;
                                                    }
                                                }
                                            } catch (NumberFormatException unused9) {
                                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F2, 4824957646259737195L, j2) /* invoke-custom */;
                                            }
                                        } catch (NumberFormatException unused10) {
                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(action, 4824957646259737195L, j2) /* invoke-custom */;
                                        }
                                    } catch (NumberFormatException unused11) {
                                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(action, 4824957646259737195L, j2) /* invoke-custom */;
                                    }
                                } catch (NumberFormatException unused12) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(action, 4824957646259737195L, j2) /* invoke-custom */;
                                }
                            }
                        } catch (NumberFormatException unused13) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(W, 4824957646259737195L, j2) /* invoke-custom */;
                        }
                    }
                } catch (NumberFormatException unused14) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(W, 4824957646259737195L, j2) /* invoke-custom */;
                }
            } catch (NumberFormatException unused15) {
                W = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(W, 4824957646259737195L, j2) /* invoke-custom */;
                throw W;
            }
        } catch (NumberFormatException unused16) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(W, 4824957646259737195L, j2) /* invoke-custom */;
        }
    }

    static {
        int i;
        long j2 = b ^ 26320959174378L;
        long j3 = j2 >>> 16;
        int i2 = (int) (((j2 ^ 89027838108797L) << 48) >>> 48);
        long j4 = j2 ^ 45373013393509L;
        e = new HashMap(13);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] bArr = new byte[8];
        bArr[0] = (byte) (j2 >>> 56);
        for (int i3 = 1; i3 < 8; i3++) {
            bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
        }
        cipher.init(2, secretKeyFactory.generateSecret(new DESKeySpec(bArr)), new IvParameterSpec(new byte[8]));
        String[] strArr = new String[20];
        int i4 = 0;
        String str = "W\u0003¸¹[\u001b\u0011z\u0095Z²\t\tF[|ENoÌÙ\u0090<Â\u001d\t[Ì\u0014ó[Á÷k,ó\\tÕ,\u0018G\u0013Hdä\u009eò\u0091\u0018¥¸\u0095»¼¬\u008fÆÃT·|°v« \u001f\u0091`\u0082\u0081\u0084\u0090¹×z\u0092îÃC\u00adî8±\u008b-\u0000:C\u0091\u008b\u0000T\u009al\u001c½Ä xR¦Q÷[u \u0006Þ\u0089Ä[\u000f~v§\u001f5Oñ,\u0091ÙW\u0081\fyÌô\u000bÇ N£*NgEM#.§ÒÑî4²è\u0007FÆk\u0080â#üe×a\u0082çªÆè(É©Ù5t¬.)³ïï\u009cdä;W´\u0091¢\u0090>\u001d/`\u0099pà\u0082OÚý\u0090\u0093\u001e*¢þH\u0012E8\u0086ãî\u0095ãf\u001fH\u0018µe\u000bè8JÏ\u000f?2$È\"ÞE\u009fHæ.lm\u0016D\u001a\u0087 i\u0096\u0080)\u0092lt\u008eþ\u001c-þÎ\u0082k\u0019a\u008b >a(3&\u0016õ\u0094Ò\u001b:è\u000475N#\u0094¹&y\u0002¶\u0000¢;7\u0002\u0085û\u0086\u009d0 v¯dÏ\u0004ü\u0003\u0087\u001e\u0018\u0003¯e/\\ÒA¸öË(¦¡º3\u0016\u008càìo\\\u0004©Ó  ñ\u0088ß\u0011Íµ²_6ûYæ\"D\u0001\u008a\u0090w\u0017yü¸\u0081\u0081«\u001cßÇ®üÇ\u0018ö»\u0010uö®¯<HòåÓæÅ\u0099´\u0087\u00862x\u007féÊ¬\u0018èL f±1Å¤÷×n\u0001ÕÛS>ó<8\u009f¯°³\u0087\u0018\u0098\u0086`©^¬d\u008aÕ\u001f\u001dB.Û\u007f\u0080\u0092òî\u00859à÷ö(ûQ2\u008c\u008b¼ÝÎ\u0019Uí±ÇHG\u008eÜåV3%èØå)³©ÕUÕ* \u0007gX7¡ê;°(kÃÌ:\u0019=¡\u009a\u0095á©ù¦+\u0098»Ú\u0018±ø¬ÅÊ&í\u008aòL\u0088\u001cÉåe^O9k\u000eÑ\b(\u0099þ³\u0097;M?{\u0007CÔ\u0097;ô\u009d£r\u0006÷v>Ð\u009cÛ\u0083Ù\u0014¦\u0085\u0004q\u001c¿¢\n\u0091\u0082\u009fï< át¼i\u0018å\u009aÛ\"û´Íææ\u008dî²ä\u0014¦\u0016\u0082ê2pÈ¿;ép\u00950x3Î1RSkþcÓn¼A\u0001t*\u001aá\u0097\u0019$±sg\u0088¯´\u001d¾¢Ë\u001a\b \u0097K¤º_\u008fÅl\u0013d\u0000\u0097\u008c¢\u0007S,'\u0093(\u000e\"Õz¬ãë²o\\Ú\u009e`°\u0091ä\u0093¸jÌ(\u0012pÑÅÙâ\u009aiüL+\u0010'\u008f\u0096ü\u009abÁÎaêo«õ`HÍÙÃFT§Óú¤W'}\u0004\u0084:VPöÂ";
        int length = "W\u0003¸¹[\u001b\u0011z\u0095Z²\t\tF[|ENoÌÙ\u0090<Â\u001d\t[Ì\u0014ó[Á÷k,ó\\tÕ,\u0018G\u0013Hdä\u009eò\u0091\u0018¥¸\u0095»¼¬\u008fÆÃT·|°v« \u001f\u0091`\u0082\u0081\u0084\u0090¹×z\u0092îÃC\u00adî8±\u008b-\u0000:C\u0091\u008b\u0000T\u009al\u001c½Ä xR¦Q÷[u \u0006Þ\u0089Ä[\u000f~v§\u001f5Oñ,\u0091ÙW\u0081\fyÌô\u000bÇ N£*NgEM#.§ÒÑî4²è\u0007FÆk\u0080â#üe×a\u0082çªÆè(É©Ù5t¬.)³ïï\u009cdä;W´\u0091¢\u0090>\u001d/`\u0099pà\u0082OÚý\u0090\u0093\u001e*¢þH\u0012E8\u0086ãî\u0095ãf\u001fH\u0018µe\u000bè8JÏ\u000f?2$È\"ÞE\u009fHæ.lm\u0016D\u001a\u0087 i\u0096\u0080)\u0092lt\u008eþ\u001c-þÎ\u0082k\u0019a\u008b >a(3&\u0016õ\u0094Ò\u001b:è\u000475N#\u0094¹&y\u0002¶\u0000¢;7\u0002\u0085û\u0086\u009d0 v¯dÏ\u0004ü\u0003\u0087\u001e\u0018\u0003¯e/\\ÒA¸öË(¦¡º3\u0016\u008càìo\\\u0004©Ó  ñ\u0088ß\u0011Íµ²_6ûYæ\"D\u0001\u008a\u0090w\u0017yü¸\u0081\u0081«\u001cßÇ®üÇ\u0018ö»\u0010uö®¯<HòåÓæÅ\u0099´\u0087\u00862x\u007féÊ¬\u0018èL f±1Å¤÷×n\u0001ÕÛS>ó<8\u009f¯°³\u0087\u0018\u0098\u0086`©^¬d\u008aÕ\u001f\u001dB.Û\u007f\u0080\u0092òî\u00859à÷ö(ûQ2\u008c\u008b¼ÝÎ\u0019Uí±ÇHG\u008eÜåV3%èØå)³©ÕUÕ* \u0007gX7¡ê;°(kÃÌ:\u0019=¡\u009a\u0095á©ù¦+\u0098»Ú\u0018±ø¬ÅÊ&í\u008aòL\u0088\u001cÉåe^O9k\u000eÑ\b(\u0099þ³\u0097;M?{\u0007CÔ\u0097;ô\u009d£r\u0006÷v>Ð\u009cÛ\u0083Ù\u0014¦\u0085\u0004q\u001c¿¢\n\u0091\u0082\u009fï< át¼i\u0018å\u009aÛ\"û´Íææ\u008dî²ä\u0014¦\u0016\u0082ê2pÈ¿;ép\u00950x3Î1RSkþcÓn¼A\u0001t*\u001aá\u0097\u0019$±sg\u0088¯´\u001d¾¢Ë\u001a\b \u0097K¤º_\u008fÅl\u0013d\u0000\u0097\u008c¢\u0007S,'\u0093(\u000e\"Õz¬ãë²o\\Ú\u009e`°\u0091ä\u0093¸jÌ(\u0012pÑÅÙâ\u009aiüL+\u0010'\u008f\u0096ü\u009abÁÎaêo«õ`HÍÙÃFT§Óú¤W'}\u0004\u0084:VPöÂ".length();
        char cCharAt = '(';
        int i5 = -1;
        while (true) {
            int i6 = i5 + 1;
            String strSubstring = str.substring(i6, i6 + cCharAt);
            byte b2 = -1;
            while (true) {
                String str2 = strSubstring;
                byte b3 = b2;
                String strIntern = b(cipher.doFinal(str2.getBytes("ISO-8859-1"))).intern();
                switch (b3) {
                    case 0:
                        int i7 = i4;
                        i4++;
                        strArr[i7] = strIntern;
                        int i8 = i6 + cCharAt;
                        i = i8;
                        if (i8 >= length) {
                            c = strArr;
                            d = new String[20];
                            Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
                            SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
                            byte[] bArr2 = new byte[8];
                            bArr2[0] = (byte) (j2 >>> 56);
                            for (int i9 = 1; i9 < 8; i9++) {
                                bArr2[i9] = (byte) ((j2 << (i9 * 8)) >>> 56);
                            }
                            cipher2.init(2, secretKeyFactory2.generateSecret(new DESKeySpec(bArr2)), new IvParameterSpec(new byte[8]));
                            long[] jArr = new long[2];
                            int i10 = 0;
                            int length2 = "±\"½iï\u0014·¶\u008b\u00ad¾¥\u0005°\u0099;".length();
                            int i11 = 0;
                            do {
                                int i12 = i11;
                                i11 += 8;
                                byte[] bytes = "±\"½iï\u0014·¶\u008b\u00ad¾¥\u0005°\u0099;".substring(i12, i11).getBytes("ISO-8859-1");
                                i10++;
                                byte[] bArrDoFinal = cipher2.doFinal(new byte[]{(byte) (r2 >>> 56), (byte) (r2 >>> 48), (byte) (r2 >>> 40), (byte) (r2 >>> 32), (byte) (r2 >>> 24), (byte) (r2 >>> 16), (byte) (r2 >>> 8), (byte) (((((long) bytes[0]) & 255) << 56) | ((((long) bytes[1]) & 255) << 48) | ((((long) bytes[2]) & 255) << 40) | ((((long) bytes[3]) & 255) << 32) | ((((long) bytes[4]) & 255) << 24) | ((((long) bytes[5]) & 255) << 16) | ((((long) bytes[6]) & 255) << 8) | (((long) bytes[7]) & 255))});
                                jArr[-1] = ((((long) bArrDoFinal[0]) & 255) << 56) | ((((long) bArrDoFinal[1]) & 255) << 48) | ((((long) bArrDoFinal[2]) & 255) << 40) | ((((long) bArrDoFinal[3]) & 255) << 32) | ((((long) bArrDoFinal[4]) & 255) << 24) | ((((long) bArrDoFinal[5]) & 255) << 16) | ((((long) bArrDoFinal[6]) & 255) << 8) | (((long) bArrDoFinal[7]) & 255);
                            } while (i11 < length2);
                            w = new KProperty[]{Reflection.property1(new PropertyReference1Impl(eu.class, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27253, 8145771893753029412L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(26495, 7475005067271155235L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(eu.class, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(10662, 1315912710003548414L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(20357, 9079987368122844881L ^ j2) /* invoke-custom */, 0)), Reflection.property1(new PropertyReference1Impl(eu.class, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25864, 6951615577616362577L ^ j2) /* invoke-custom */, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(19482, 4343436023090185537L ^ j2) /* invoke-custom */, 0))};
                            a = new eu(j3, (char) i2);
                            j = yp.t(a, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21085, 8550330853285960462L ^ j2) /* invoke-custom */, false, j4, null, null, (int) jArr[1], null);
                            D = yp.t(a, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(23628, 1024775524562605334L ^ j2) /* invoke-custom */, true, j4, null, null, (int) jArr[0], null);
                            F = yp.t(a, (String) b(MethodHandles.lookup(), "j", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2510, 1632686245327454361L ^ j2) /* invoke-custom */, false, j4, null, null, (int) jArr[0], null);
                            return;
                        }
                        cCharAt = str.charAt(i);
                        break;
                        break;
                    default:
                        int i13 = i4;
                        i4++;
                        strArr[i13] = strIntern;
                        int i14 = i6 + cCharAt;
                        i5 = i14;
                        if (i14 < length) {
                        }
                        str = "\u00adÂ²tÛ(lcÅ=\bÒe\u001dN>7m\u0012X\u0001\u0095mPÍ\u0010z\u0091~Í7õ\u0083\u0097M#\\²¹d\u0080¦D\u0000,\u0096/'ðàr\u0001¹\u0091F]Ío5×Þqm{.wf\u0003TÉÎ¿=P\rB\f²<3l¶ðb§½\u0096ï_\u0089\u008dWº\u009f\u0081æ\u0087}Þ\u0010\u0082à¥&Hñ.Õ*_Qk©¯\u009e&Ò\u001dÑ\\oÝB\u0004dèT£\u001dú'²Þ\u007fò\u0084G\u001c]!\u0096$\u000bÁ-\u0007\u00adK¤\u001döOLpt¿\u0089ê\fÙGLÞîÁ\u0083w\u0081D";
                        length = "\u00adÂ²tÛ(lcÅ=\bÒe\u001dN>7m\u0012X\u0001\u0095mPÍ\u0010z\u0091~Í7õ\u0083\u0097M#\\²¹d\u0080¦D\u0000,\u0096/'ðàr\u0001¹\u0091F]Ío5×Þqm{.wf\u0003TÉÎ¿=P\rB\f²<3l¶ðb§½\u0096ï_\u0089\u008dWº\u009f\u0081æ\u0087}Þ\u0010\u0082à¥&Hñ.Õ*_Qk©¯\u009e&Ò\u001dÑ\\oÝB\u0004dèT£\u001dú'²Þ\u007fò\u0084G\u001c]!\u0096$\u000bÁ-\u0007\u00adK¤\u001döOLpt¿\u0089ê\fÙGLÞîÁ\u0083w\u0081D".length();
                        cCharAt = '(';
                        i = -1;
                        break;
                        break;
                }
                i6 = i + 1;
                strSubstring = str.substring(i6, i6 + cCharAt);
                b2 = 0;
            }
            cCharAt = str.charAt(i5);
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }

    private static String b(byte[] bArr) {
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

    private static String b(int i, long j2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j2 & 32767))) ^ 4076;
        if (d[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j2 >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j2 << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i2] = b(((Cipher) objArr[0]).doFinal(c[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/eu", e2);
            }
        }
        return d[i2];
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
            java.lang.String r1 = "su/catlean/eu"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.eu.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
