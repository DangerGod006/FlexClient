package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/m2.class */
public final /* synthetic */ class m2 {
    public static final int[] y;
    private static String m;

    static {
        long jA = yz.a(8489111107365677733L, -3521827521182079485L, MethodHandles.lookup().lookupClass()).a(274547483648350L) ^ 59612630181785L;
        int[] iArr = new int[pv.values().length];
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, 7000012258261979677L, jA) /* invoke-custom */;
        try {
            iArr[pv.Command.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[pv.Leave.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[pv.None.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        y = iArr;
    }

    public static void o(String str) {
        m = str;
    }

    public static String o() {
        return m;
    }
}
