package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ij.class */
public final /* synthetic */ class ij {
    public static final int[] a;
    private static int[] W;

    static {
        long jA = yz.a(4177637233814730235L, -8839912655941682496L, MethodHandles.lookup().lookupClass()).a(16335986938190L) ^ 7246113452827L;
        int[] iArr = new int[c4.values().length];
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, -5013277013829771549L, jA) /* invoke-custom */;
        try {
            iArr[c4.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[c4.GROW.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[c4.SHRINK.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            iArr[c4.FILL.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        try {
            iArr[c4.EMPTY.ordinal()] = 5;
        } catch (NoSuchFieldError e5) {
        }
        a = iArr;
    }

    public static void x(int[] iArr) {
        W = iArr;
    }

    public static int[] E() {
        return W;
    }
}
