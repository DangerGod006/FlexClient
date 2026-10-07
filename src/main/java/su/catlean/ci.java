package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ci.class */
public final class ci implements Runnable {
    final int H;
    final ds q;
    final String[] v;
    private static final long a = yz.a(5319287408544337369L, 1526305187217338417L, MethodHandles.lookup().lookupClass()).a(242160210000506L);

    public ci(int i, ds dsVar, String[] strArr) {
        this.H = i;
        this.q = dsVar;
        this.v = strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        long j = a ^ 21825868370796L;
        long j2 = j ^ 128049193073198L;
        long j3 = j >>> 32;
        int i = (int) (((j ^ 74104062819618L) << 32) >>> 32);
        long j4 = j ^ 128847305529320L;
        Object objC = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8490428410667546365L, j) /* invoke-custom */;
        Thread.sleep(this.H);
        try {
            objC = objC;
            if (objC != 0) {
                try {
                    try {
                        s7 s7Var = s7.r;
                        String strL = this.q.L(j2);
                        Intrinsics.checkNotNull(strL);
                        objC = s7.C(j3, s7Var, strL, i);
                        if (objC == 0 || !s7.F().add(this.q)) {
                            return;
                        }
                        s7.E(j4, s7.r, this.v);
                    } catch (NumberFormatException unused) {
                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objC, 8373284702202068055L, j) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused2) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objC, 8373284702202068055L, j) /* invoke-custom */;
                }
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objC, 8373284702202068055L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
