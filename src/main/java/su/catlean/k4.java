package su.catlean;

import com.mojang.blaze3d.vertex.VertexFormat;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import net.minecraft.class_10055;
import net.minecraft.class_1007;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_2663;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_591;
import net.minecraft.class_742;
import org.jetbrains.annotations.NotNull;
import su.catlean.api.event.events.network.ReceivePacket;
import su.catlean.api.event.events.player.PlayerUpdateEvent;
import su.catlean.api.event.events.render.Render3DEvent;
import su.catlean.gofra.Flow;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/k4.class */
public final class k4 extends _g {

    @NotNull
    public static final k4 A = null;
    static final KProperty[] t = null;

    @NotNull
    private static final cw l = null;

    @NotNull
    private static final c8 K = null;

    @NotNull
    private static final ct N = null;

    @NotNull
    private static final ct c = null;

    @NotNull
    private static final CopyOnWriteArrayList F = null;
    private static final long a = 0;
    private static final String[] b = null;
    private static final String[] d = null;
    private static final Map e = null;
    private static final long[] f = null;
    private static final Integer[] g = null;
    private static final Map h = null;

    /* JADX WARN: Illegal instructions before constructor call */
    private k4(long j, char c2) {
        long j2 = ((j << 16) | ((((long) c2) << 48) >>> 48)) ^ a;
        super((String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(25592, 4328651258134531300L ^ j2) /* invoke-custom */, jt.F(), null, 4, null, j2 ^ 28545929437629L);
    }

    private final as g(long j) {
        return (as) l.E(this, (a ^ j) ^ 92064546683064L, t[0]);
    }

    private final int P(long j) {
        return ((Number) K.E(this, (a ^ j) ^ 100927173346411L, t[1])).intValue();
    }

    private final float h(short s, int i, char c2) {
        return ((Number) N.E(this, ((((((long) s) << 48) | ((((long) i) << 32) >>> 16)) | ((((long) c2) << 48) >>> 48)) ^ a) ^ 73505396030907L, t[2])).floatValue();
    }

    private final float V(long j) {
        return ((Number) c.E(this, (a ^ j) ^ 132814910861057L, t[3])).floatValue();
    }

    @Flow
    private final void m(PlayerUpdateEvent playerUpdateEvent) {
        CopyOnWriteArrayList copyOnWriteArrayList = F;
        Function1 function1 = k4::Q;
        copyOnWriteArrayList.removeIf((v1) -> {
            return n(r1, v1);
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70 */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v73 */
    /* JADX WARN: Type inference failed for: r0v74 */
    @Flow
    private final void r(Render3DEvent render3DEvent) {
        long j = a ^ 138549526598736L;
        long j2 = j ^ 70348927954044L;
        long j3 = j ^ 80976303746633L;
        int i = (int) (j >>> 32);
        int i2 = (int) ((j3 << 32) >>> 48);
        int i3 = (int) ((j3 << 48) >>> 48);
        long j4 = j ^ 115957414049809L;
        int i4 = (int) (j >>> 32);
        long j5 = ((j ^ 74018442113871L) << 32) >>> 32;
        long j6 = j ^ 120368055263468L;
        long j7 = j ^ 122514123854398L;
        long j8 = j ^ 75153139157347L;
        long j9 = j ^ 114522617553732L;
        long j10 = j ^ 134955267951676L;
        int i5 = (int) (j >>> 48);
        int i6 = (int) ((j10 << 16) >>> 32);
        int i7 = (int) ((j10 << 48) >>> 48);
        ?? IsEmpty = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8050762825900973766L, j) /* invoke-custom */;
        try {
            try {
                if (g(j6) == as.DEFAULT) {
                    IsEmpty = F.isEmpty();
                    ?? r0 = IsEmpty;
                    if (IsEmpty != 0) {
                        r0 = IsEmpty == 0 ? 1 : 0;
                    }
                    if (r0 == 0) {
                        return;
                    }
                    VertexFormat vertexFormat = class_290.field_1576;
                    Intrinsics.checkNotNullExpressionValue(vertexFormat, (String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27138, 6165009513401768507L ^ j) /* invoke-custom */);
                    g7 g7Var = new g7(j2, vertexFormat, F.size() * (int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(24648, 442134038601555266L ^ j) /* invoke-custom */, false, 4, null);
                    CopyOnWriteArrayList<tk> copyOnWriteArrayList = F;
                    for (tk tkVar : copyOnWriteArrayList) {
                        ?? r02 = 0;
                        try {
                            nn.x.h(j7, render3DEvent.getStack(), tkVar.D(), tkVar.z(), tkVar.C(j8), jl.y.p(jh.f.t(), (char) i5, i6, tkVar.p(j9), (short) i7), s8.FILL, g7Var);
                            r02 = IsEmpty;
                            if (r02 != 0) {
                                if (IsEmpty == 0) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } catch (NumberFormatException unused) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 8047191962602653349L, j) /* invoke-custom */;
                        }
                    }
                    g7.R(j4, g7Var, b6.R.Z(), null, null, render3DEvent.getStack().method_23760().method_23761(), null, null, (int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(2377, 608200559610934347L ^ j) /* invoke-custom */, null);
                    VertexFormat vertexFormat2 = class_290.field_1576;
                    Intrinsics.checkNotNullExpressionValue(vertexFormat2, (String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(31136, 4215411483870677392L ^ j) /* invoke-custom */);
                    g7Var = new g7(i4, j5, vertexFormat2, F.size() * (int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27484, 6359944450439075410L ^ j) /* invoke-custom */, true);
                    copyOnWriteArrayList = F;
                    for (tk tkVar2 : copyOnWriteArrayList) {
                        ?? r03 = 0;
                        try {
                            nn.x.h(j7, render3DEvent.getStack(), tkVar2.D(), tkVar2.z(), tkVar2.C(j8), jl.y.p(jh.f.t(), (char) i5, i6, tkVar2.p(j9) * 2.0f, (short) i7), s8.OUTLINE, g7Var);
                            r03 = IsEmpty;
                            if (r03 != 0) {
                                if (IsEmpty == 0) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } catch (NumberFormatException unused2) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r03, 8047191962602653349L, j) /* invoke-custom */;
                        }
                    }
                    g7.R(j4, g7Var, b6.R.w(), null, null, render3DEvent.getStack().method_23760().method_23761(), null, null, (int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(29971, 391686898154817555L ^ j) /* invoke-custom */, null);
                    if (IsEmpty != 0) {
                        return;
                    }
                }
                for (tk tkVar3 : F) {
                    ?? r04 = 0;
                    try {
                        k4 k4Var = A;
                        class_4587 stack = render3DEvent.getStack();
                        Intrinsics.checkNotNull(tkVar3);
                        k4Var.V(stack, i, (short) i2, tkVar3, (char) i3);
                        r04 = IsEmpty;
                        if (r04 != 0 && IsEmpty != 0) {
                        }
                        return;
                    } catch (NumberFormatException unused3) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r04, 8047191962602653349L, j) /* invoke-custom */;
                    }
                }
            } catch (NumberFormatException unused4) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(IsEmpty, 8047191962602653349L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused5) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(IsEmpty, 8047191962602653349L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v114 */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v128 */
    /* JADX WARN: Type inference failed for: r0v129 */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v131 */
    /* JADX WARN: Type inference failed for: r0v132 */
    /* JADX WARN: Type inference failed for: r0v133 */
    /* JADX WARN: Type inference failed for: r0v134 */
    /* JADX WARN: Type inference failed for: r0v19, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [net.minecraft.class_4184] */
    /* JADX WARN: Type inference failed for: r0v27, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v28, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v36, types: [int] */
    /* JADX WARN: Type inference failed for: r0v38, types: [net.minecraft.class_2596] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v53, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v54, types: [net.minecraft.class_310] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v65, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 4 */
    @Flow
    public final void k(@NotNull ReceivePacket receivePacket) {
        ?? AreEqual;
        long j = a ^ 71372649480027L;
        long j2 = j ^ 103159032879108L;
        int i = (int) (j >>> 56);
        long j3 = ((j ^ 33236189845027L) << 8) >>> 8;
        long j4 = j ^ 62372687530287L;
        long j5 = j ^ 79962039943255L;
        int i2 = (int) (j >>> 32);
        int i3 = (int) ((j5 << 32) >>> 48);
        int i4 = (int) ((j5 << 48) >>> 48);
        long j6 = j ^ 101034607130420L;
        long j7 = j ^ 140050597259397L;
        long j8 = j ^ 137950527788578L;
        Object objMethod_1560 = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4949791107560338893L, j) /* invoke-custom */;
        Intrinsics.checkNotNullParameter(receivePacket, (String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(27898, 1003310342736213955L ^ j) /* invoke-custom */);
        try {
            try {
                class_310 class_310VarF = zf.F(j2);
                class_310 class_310VarF2 = class_310VarF;
                if (objMethod_1560 != null) {
                    objMethod_1560 = class_310VarF.method_1560();
                    if (objMethod_1560 == null) {
                        return;
                    } else {
                        class_310VarF2 = zf.F(j2);
                    }
                }
                ?? Method_19418 = class_310VarF2;
                if (objMethod_1560 != null) {
                    try {
                        try {
                            class_310VarF2 = class_310VarF2.field_1724;
                            if (class_310VarF2 == null) {
                                return;
                            } else {
                                Method_19418 = zf.F(j2);
                            }
                        } catch (NumberFormatException unused) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_310VarF2, 4946747478548770222L, j) /* invoke-custom */;
                        }
                    } catch (NumberFormatException unused2) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(class_310VarF2, 4946747478548770222L, j) /* invoke-custom */;
                    }
                }
                try {
                    if (objMethod_1560 != null) {
                        try {
                            Method_19418 = ((class_310) Method_19418).field_1773.method_19418();
                            if (Method_19418 == 0) {
                                return;
                            } else {
                                Method_19418 = zf.F(j2);
                            }
                        } catch (NumberFormatException unused3) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_19418, 4946747478548770222L, j) /* invoke-custom */;
                        }
                    }
                    try {
                        try {
                            if (((class_310) Method_19418).field_1687 != null) {
                                Method_19418 = zf.v(j8).field_6012;
                                if (Method_19418 < (int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(4226, 6432213830636013189L ^ j) /* invoke-custom */) {
                                    return;
                                }
                                ?? packet = receivePacket.getPacket();
                                try {
                                    try {
                                        packet = packet instanceof class_2663;
                                        ?? F2 = packet;
                                        if (objMethod_1560 != null) {
                                            if (packet == 0) {
                                                return;
                                            } else {
                                                F2 = ((class_2663) packet).method_11470();
                                            }
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (F2 == (int) c(MethodHandles.lookup(), "i", MethodType.methodType(Integer.TYPE, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(14134, 2017432160312402229L ^ j) /* invoke-custom */) {
                                                        F2 = zf.F(j2);
                                                        ?? F3 = F2;
                                                        if (objMethod_1560 != null) {
                                                            if (F2.method_1560() == null) {
                                                                return;
                                                            } else {
                                                                F3 = zf.F(j2);
                                                            }
                                                        }
                                                        if (((class_310) F3).field_1773.method_19418() != null) {
                                                            class_1297 class_1297VarMethod_11469 = ((class_2663) packet).method_11469(zf.z(j7));
                                                            ?? r0 = class_1297VarMethod_11469;
                                                            ?? r02 = r0;
                                                            if (objMethod_1560 != null) {
                                                                try {
                                                                    try {
                                                                        r0 = r0 instanceof class_1657;
                                                                        if (r0 != 0) {
                                                                            r02 = class_1297VarMethod_11469;
                                                                            AreEqual = (class_1657) r02;
                                                                        } else {
                                                                            AreEqual = 0;
                                                                        }
                                                                    } catch (NumberFormatException unused4) {
                                                                        r0 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 4946747478548770222L, j) /* invoke-custom */;
                                                                        throw r0;
                                                                    }
                                                                } catch (NumberFormatException unused5) {
                                                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, 4946747478548770222L, j) /* invoke-custom */;
                                                                }
                                                            } else {
                                                                AreEqual = (class_1657) r02;
                                                            }
                                                            if (AreEqual == 0) {
                                                                return;
                                                            }
                                                            ?? r33 = AreEqual;
                                                            try {
                                                                AreEqual = Intrinsics.areEqual((Object) r33, zf.F(j2).field_1724);
                                                                if (AreEqual != 0) {
                                                                    return;
                                                                }
                                                                class_1007 class_1007VarMethod_3953 = zf.F(j2).method_1561().method_3953((class_1297) r33);
                                                                Intrinsics.checkNotNull(class_1007VarMethod_3953, (String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(21394, 6178568443332577446L ^ j) /* invoke-custom */);
                                                                class_591 class_591VarMethod_4038 = class_1007VarMethod_3953.method_4038();
                                                                Intrinsics.checkNotNullExpressionValue(class_591VarMethod_4038, (String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(17214, 5699063571063855106L ^ j) /* invoke-custom */);
                                                                class_591 class_591Var = class_591VarMethod_4038;
                                                                class_10055 class_10055VarMethod_62425 = zf.F(j2).method_1561().method_3953((class_1297) r33).method_62425((class_1297) r33, zi.v.n(i2, (char) i3, i4));
                                                                Intrinsics.checkNotNull(class_10055VarMethod_62425, (String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(6053, 3163987277630868626L ^ j) /* invoke-custom */);
                                                                class_10055 class_10055Var = class_10055VarMethod_62425;
                                                                class_10055 class_10055Var2 = new class_10055();
                                                                class_10055Var2.field_53536 = class_10055Var.field_53536;
                                                                class_10055Var2.field_53537 = class_10055Var.field_53537;
                                                                class_10055Var2.field_53538 = class_10055Var.field_53538;
                                                                class_10055Var2.field_53325 = class_10055Var.field_53325;
                                                                class_10055Var2.field_53326 = class_10055Var.field_53326;
                                                                class_10055Var2.field_53327 = class_10055Var.field_53327;
                                                                class_10055Var2.field_53446 = class_10055Var.field_53446;
                                                                class_10055Var2.field_53447 = class_10055Var.field_53447;
                                                                class_10055Var2.field_53448 = class_10055Var.field_53448;
                                                                class_10055Var2.field_63604 = class_10055Var.field_63604;
                                                                class_10055Var2.field_53521 = class_10055Var.field_53521;
                                                                class_10055Var2.field_53328 = class_10055Var.field_53328;
                                                                class_10055Var2.field_53451 = class_10055Var.field_53451;
                                                                class_10055Var2.field_53405 = class_10055Var.field_53405;
                                                                class_10055Var2.field_53450 = class_10055Var.field_53450;
                                                                class_591Var.method_62110(class_10055Var);
                                                                class_243 class_243VarJ = J((byte) i, j3, (class_1297) r33);
                                                                class_2960 class_2960VarComp_3627 = ((class_742) r33).method_52814().comp_1626().comp_3627();
                                                                Intrinsics.checkNotNullExpressionValue(class_2960VarComp_3627, (String) b(MethodHandles.lookup(), "c", MethodType.methodType(String.class, Integer.TYPE, Long.TYPE)).dynamicInvoker().invoke(5603, 3764335180690853584L ^ j) /* invoke-custom */);
                                                                F.add(new tk(class_591Var, class_10055Var2, class_243VarJ, class_2960VarComp_3627, P(j6), j4));
                                                                return;
                                                            } catch (NumberFormatException unused6) {
                                                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(AreEqual, 4946747478548770222L, j) /* invoke-custom */;
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                } catch (NumberFormatException unused7) {
                                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F2, 4946747478548770222L, j) /* invoke-custom */;
                                                }
                                            } catch (NumberFormatException unused8) {
                                                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F2, 4946747478548770222L, j) /* invoke-custom */;
                                            }
                                        } catch (NumberFormatException unused9) {
                                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(F2, 4946747478548770222L, j) /* invoke-custom */;
                                        }
                                    } catch (NumberFormatException unused10) {
                                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(packet, 4946747478548770222L, j) /* invoke-custom */;
                                    }
                                } catch (NumberFormatException unused11) {
                                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(packet, 4946747478548770222L, j) /* invoke-custom */;
                                }
                            }
                            return;
                        } catch (NumberFormatException unused12) {
                            Method_19418 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_19418, 4946747478548770222L, j) /* invoke-custom */;
                            throw Method_19418;
                        }
                    } catch (NumberFormatException unused13) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_19418, 4946747478548770222L, j) /* invoke-custom */;
                    }
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_19418, 4946747478548770222L, j) /* invoke-custom */;
                } catch (NumberFormatException unused14) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(Method_19418, 4946747478548770222L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused15) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_1560, 4946747478548770222L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused16) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objMethod_1560, 4946747478548770222L, j) /* invoke-custom */;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CheckCode
        jadx.core.utils.exceptions.JadxRuntimeException: Incorrect negative register number in instruction: 0x01b3: INVOKE 
          (r-1 I:su.catlean.kf)
          (r0 I:long)
          (r1 I:net.minecraft.class_10055)
          (r2 I:short)
          (r3 I:net.minecraft.class_4587)
          (r4 I:float)
         VIRTUAL call: su.catlean.kf.g(long, net.minecraft.class_10055, short, net.minecraft.class_4587, float):void
        	at jadx.core.dex.visitors.CheckCode.checkInstructions(CheckCode.java:76)
        	at jadx.core.dex.visitors.CheckCode.visit(CheckCode.java:33)
        */
    private final void V(net.minecraft.class_4587 r16, int r17, short r18, su.catlean.tk r19, char r20) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k4.V(net.minecraft.class_4587, int, short, su.catlean.tk, char):void");
    }

    private static final boolean Q(tk tkVar) {
        long j = a ^ 72440387382162L;
        long j2 = j ^ 74735223282221L;
        return tkVar.W(A.V(j ^ 134043932706967L), A.h((short) (j >>> 48), (int) ((j2 << 16) >>> 32), (char) ((int) ((j2 << 48) >>> 48))), j ^ 16383454395442L);
    }

    private static final boolean n(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
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

    private static String b(int i, long j) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i2 = (i ^ ((int) (j & 32767))) ^ 24186;
        if (d[i2] == null) {
            try {
                Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
                Object[] objArr = (Object[]) e.get(lValueOf);
                if (objArr == null) {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(lValueOf, objArr);
                }
                byte[] bArr = new byte[8];
                bArr[0] = (byte) (j >>> 56);
                for (int i3 = 1; i3 < 8; i3++) {
                    bArr[i3] = (byte) ((j << (i3 * 8)) >>> 56);
                }
                ((Cipher) objArr[0]).init(2, ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr)), (IvParameterSpec) objArr[2]);
                d[i2] = b(((Cipher) objArr[0]).doFinal(b[i2].getBytes("ISO-8859-1")));
            } catch (Exception e2) {
                throw new RuntimeException("su/catlean/k4", e2);
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
            r1 = -1
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
            java.lang.String r1 = "su/catlean/k4"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k4.b(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }

    private static int c(int i, long j) {
        int i2 = (i ^ ((int) (j & 32767))) ^ 21326;
        if (g[i2] == null) {
            byte[] bArr = {(byte) (j >>> 56), (byte) (j >>> 48), (byte) (j >>> 40), (byte) (j >>> 32), (byte) (j >>> 24), (byte) (j >>> 16), (byte) (j >>> 8), (byte) j};
            byte[] bArr2 = {(byte) (r0 >>> 56), (byte) (r0 >>> 48), (byte) (r0 >>> 40), (byte) (r0 >>> 32), (byte) (r0 >>> 24), (byte) (r0 >>> 16), (byte) (r0 >>> 8), (byte) f[i2]};
            Long lValueOf = Long.valueOf(Thread.currentThread().threadId());
            Object[] objArr = (Object[]) h.get(lValueOf);
            if (objArr == null) {
                try {
                    objArr = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(lValueOf, objArr);
                } catch (Exception e2) {
                    throw new RuntimeException("su/catlean/k4", e2);
                }
            }
            SecretKey secretKeyGenerateSecret = ((SecretKeyFactory) objArr[1]).generateSecret(new DESKeySpec(bArr));
            Cipher cipher = (Cipher) objArr[0];
            cipher.init(2, secretKeyGenerateSecret, (IvParameterSpec) objArr[2]);
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            g[i2] = Integer.valueOf(((bArrDoFinal[4] & 255) << 24) | ((bArrDoFinal[5] & 255) << 16) | ((bArrDoFinal[6] & 255) << 8) | (bArrDoFinal[7] & 255));
        }
        return g[i2].intValue();
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
            r1 = -1
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
            java.lang.String r1 = "su/catlean/k4"
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
        throw new UnsupportedOperationException("Method not decompiled: su.catlean.k4.c(java.lang.invoke.MethodHandles$Lookup, java.lang.String, java.lang.invoke.MethodType):java.lang.invoke.CallSite");
    }
}
