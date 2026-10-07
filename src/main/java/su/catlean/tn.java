package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/tn.class */
public final /* synthetic */ class tn {
    public static final int[] t;
    private static boolean T;

    static {
        long jA = yz.a(-3957160002670670851L, -3286444797927844794L, MethodHandles.lookup().lookupClass()).a(13055167878322L) ^ 140213059710862L;
        int[] iArr = new int[lw.values().length];
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, 3238675305508099914L, jA) /* invoke-custom */;
        try {
            iArr[lw.GLOBAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[lw.LOCAL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[lw.WHISPERS.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        t = iArr;
    }

    public static void O(boolean z) {
        T = z;
    }

    public static boolean v() {
        return T;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean n() {
        return !v();
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
