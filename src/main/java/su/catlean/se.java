package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/se.class */
public final /* synthetic */ class se {
    public static final int[] O;
    private static String[] W;

    static {
        long jA = yz.a(2051992107460895125L, -5479819645875781613L, MethodHandles.lookup().lookupClass()).a(28055980419419L) ^ 54381099156216L;
        int[] iArr = new int[w0.values().length];
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[4], 5930243009857504690L, jA) /* invoke-custom */;
        try {
            iArr[w0.BREACH.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[w0.DENSITY.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        O = iArr;
    }

    public static void z(String[] strArr) {
        W = strArr;
    }

    public static String[] m() {
        return W;
    }
}
