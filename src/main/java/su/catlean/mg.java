package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import net.minecraft.class_2350;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/mg.class */
public final /* synthetic */ class mg {
    public static final int[] F;
    private static boolean L;

    static {
        long jA = yz.a(3184539057178708915L, 7545630833672240559L, MethodHandles.lookup().lookupClass()).a(78132414378253L) ^ 91594282834130L;
        int[] iArr = new int[class_2350.values().length];
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, 1428327288083525750L, jA) /* invoke-custom */;
        try {
            iArr[class_2350.field_11034.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[class_2350.field_11043.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[class_2350.field_11035.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            iArr[class_2350.field_11039.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        F = iArr;
    }

    public static void f(boolean z) {
        L = z;
    }

    public static boolean I() {
        return L;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean m() {
        return !I();
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
