package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/x8.class */
public final /* synthetic */ class x8 {
    public static final int[] v;
    public static final int[] a;
    private static _g[] S;

    static {
        long jA = yz.a(7985256281696422549L, -2604575219532910221L, MethodHandles.lookup().lookupClass()).a(35608222560684L) ^ 3578463180061L;
        int[] iArr = new int[w4.values().length];
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, 6687404575770027715L, jA) /* invoke-custom */;
        try {
            iArr[w4.OFF.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[w4.CRYSTAL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[w4.GAPPLE.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        v = iArr;
        int[] iArr2 = new int[b0.values().length];
        try {
            iArr2[b0.BALL_SHIELD.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
        }
        try {
            iArr2[b0.GAPPLE_BALL.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
        }
        try {
            iArr2[b0.GAPPLE_SHIELD.ordinal()] = 3;
        } catch (NoSuchFieldError e6) {
        }
        try {
            iArr2[b0.BALL_TOTEM.ordinal()] = 4;
        } catch (NoSuchFieldError e7) {
        }
        try {
            iArr2[b0.TOTEM_TOTEM.ordinal()] = 5;
        } catch (NoSuchFieldError e8) {
        }
        a = iArr2;
    }

    public static void K(_g[] _gVarArr) {
        S = _gVarArr;
    }

    public static _g[] B() {
        return S;
    }
}
