package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/o.class */
public final class o {

    @NotNull
    public static final o G;

    @NotNull
    private static final List H;
    private static boolean N;
    private static int k;
    private static String[] W;
    private static final long a = yz.a(4960750192193325778L, -3953806531375182387L, MethodHandles.lookup().lookupClass()).a(245530227423405L);

    private o() {
    }

    @NotNull
    public final List z() {
        return H;
    }

    public final boolean F() {
        return N;
    }

    public final void B(boolean z) {
        N = z;
    }

    public final int E() {
        return k;
    }

    public final void Z(int i) {
        k = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    public final void D(long j) {
        long j2 = a ^ j;
        long j3 = j2 ^ 128751665840725L;
        Object obj = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3657958779974103238L, j2) /* invoke-custom */;
        try {
            try {
                obj = N;
                int size = obj;
                if (obj != 0) {
                    if (obj == 0) {
                        return;
                    }
                    i2.g(os.D, ((ov) H.get(k)).o(), j3);
                    size = (k + 1) % H.size();
                }
                k = size;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3653828333888095343L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused2) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -3653828333888095343L, j2) /* invoke-custom */;
        }
    }

    static {
        long j = a ^ 81132619010781L;
        G = new o();
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[5], -3269756968617347209L, j) /* invoke-custom */;
        H = new ArrayList();
    }

    public static void Q(String[] strArr) {
        W = strArr;
    }

    public static String[] h() {
        return W;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
