package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/x5.class */
public final /* synthetic */ class x5 {
    public static final int[] p;
    private static boolean B;

    static {
        long jA = yz.a(-8748202399386563053L, 3396528333513052542L, MethodHandles.lookup().lookupClass()).a(15596453794262L) ^ 53890766856175L;
        int[] iArr = new int[be.values().length];
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, 2847341247724774947L, jA) /* invoke-custom */;
        try {
            iArr[be.Vanilla.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[be.GRIM_GLIDE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        p = iArr;
    }

    public static void Y(boolean z) {
        B = z;
    }

    public static boolean J() {
        return B;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean t() {
        return !J();
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
