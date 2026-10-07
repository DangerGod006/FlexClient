package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/bg.class */
public final class bg {
    private long C;
    private static boolean B;
    private static final long a = yz.a(1087004212696968314L, -4002072988966639041L, MethodHandles.lookup().lookupClass()).a(104254268490845L);

    public bg() {
        l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean, int] */
    public final boolean c(int ms, long a2) {
        long j = a ^ a2;
        Object obj = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8389279173404472996L, j) /* invoke-custom */;
        try {
            obj = ((zf.A() - this.C) > ms ? 1 : ((zf.A() - this.C) == ms ? 0 : -1));
            return obj == 0 ? obj >= 0 : obj;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -8477025956541852762L, j) /* invoke-custom */;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.NumberFormatException, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    public final boolean q(int i, long j) {
        long j2 = a ^ j;
        ?? r0 = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1719427643451135252L, j2) /* invoke-custom */;
        try {
            r0 = ((zf.A() - this.C) > i ? 1 : ((zf.A() - this.C) == i ? 0 : -1));
            ?? r02 = r0;
            if (r0 == 0) {
                r02 = r0 >= 0 ? 1 : 0;
            }
            ?? r12 = r02;
            try {
                boolean z = r12 == true ? 1 : 0;
                ?? r03 = z;
                if (j2 >= 0) {
                    r03 = z;
                    if (r0 == 0) {
                        if (z) {
                            l();
                        }
                        r03 = r12 == true ? 1 : 0;
                    }
                }
                try {
                    try {
                        if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1613265139541608691L, j2) /* invoke-custom */ != null) {
                            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0 == 0, -1635585072518727449L, j2) /* invoke-custom */;
                        }
                        return r03;
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r03, -1591007142164172778L, j2) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused2) {
                    r03 = (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r03, -1591007142164172778L, j2) /* invoke-custom */;
                    throw r03;
                }
            } catch (NumberFormatException unused3) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, -1591007142164172778L, j2) /* invoke-custom */;
            }
        } catch (NumberFormatException unused4) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r0, -1591007142164172778L, j2) /* invoke-custom */;
        }
    }

    public final void G(int ms) {
        this.C = System.currentTimeMillis() - ((long) ms);
    }

    public final long N() {
        return zf.A() - this.C;
    }

    public final void l() {
        this.C = zf.A();
    }

    public static void Z(boolean z) {
        B = z;
    }

    public static boolean B() {
        return B;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean n() {
        return !B();
    }

    static {
        long j = a ^ 116174915347367L;
        if ((boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-8985240176519696958L, j) /* invoke-custom */) {
            return;
        }
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, -8942724556566785457L, j) /* invoke-custom */;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
