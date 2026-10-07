package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ml.class */
public final /* synthetic */ class ml {
    public static final int[] L;
    private static _g[] c;

    static {
        long jA = yz.a(-5232878641821488569L, 4003668326182994273L, MethodHandles.lookup().lookupClass()).a(148165987628268L) ^ 29385291322856L;
        int[] iArr = new int[ta.values().length];
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[4], 702317868093189318L, jA) /* invoke-custom */;
        try {
            iArr[ta.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            iArr[ta.WHITE_LIST.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        L = iArr;
    }

    public static void S(_g[] _gVarArr) {
        c = _gVarArr;
    }

    public static _g[] z() {
        return c;
    }
}
