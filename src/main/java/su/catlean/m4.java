package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/m4.class */
public final /* synthetic */ class m4 {
    public static final int[] A;
    private static String[] m;

    static {
        long jA = yz.a(-8294004098769026650L, -6821158249576863314L, MethodHandles.lookup().lookupClass()).a(226051231569457L) ^ 108101547290346L;
        int[] iArr = new int[ak.values().length];
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(null, 5477317425195937561L, jA) /* invoke-custom */;
        try {
            iArr[ak.GLOBAL.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[ak.LOCAL.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            iArr[ak.WHISPERS.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        try {
            iArr[ak.SILENT.ordinal()] = 4;
        } catch (NoSuchFieldError e4) {
        }
        A = iArr;
    }

    public static void O(String[] strArr) {
        m = strArr;
    }

    public static String[] P() {
        return m;
    }
}
