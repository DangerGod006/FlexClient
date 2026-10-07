package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/rv.class */
public final /* synthetic */ class rv {
    public static final int[] u;
    private static boolean n;

    static {
        long jA = yz.a(9011180962554359920L, 6156531790283830354L, MethodHandles.lookup().lookupClass()).a(88503043084977L) ^ 46913168465745L;
        int[] iArr = new int[xn.values().length];
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, 6911923896606059493L, jA) /* invoke-custom */;
        try {
            iArr[xn.FLAT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[xn.BOX.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[xn.WIRE_FRAME.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            iArr[xn.CROSS.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        u = iArr;
    }

    public static void K(boolean z) {
        n = z;
    }

    public static boolean Q() {
        return n;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean x() {
        return !Q();
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
