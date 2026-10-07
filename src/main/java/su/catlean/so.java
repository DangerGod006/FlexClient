package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/so.class */
public final /* synthetic */ class so {
    public static final int[] U;
    private static String[] z;

    static {
        long jA = yz.a(7094525223541479720L, 2468025852360839364L, MethodHandles.lookup().lookupClass()).a(194185700975916L) ^ 140568423906957L;
        int[] iArr = new int[ar.values().length];
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, -7992705173765562923L, jA) /* invoke-custom */;
        try {
            iArr[ar.SMART.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[ar.CUSTOM.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[ar.OFF.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        U = iArr;
    }

    public static void q(String[] strArr) {
        z = strArr;
    }

    public static String[] D() {
        return z;
    }
}
