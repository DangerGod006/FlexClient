package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/g5.class */
public final /* synthetic */ class g5 {
    public static final int[] o;
    private static String[] N;

    static {
        long jA = yz.a(8225791897810224488L, 3182479557769148131L, MethodHandles.lookup().lookupClass()).a(155962638002754L) ^ 32990988215643L;
        int[] iArr = new int[ne.values().length];
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, -5047445844435204881L, jA) /* invoke-custom */;
        try {
            iArr[ne.GHOST.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[ne.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        o = iArr;
    }

    public static void E(String[] strArr) {
        N = strArr;
    }

    public static String[] l() {
        return N;
    }
}
