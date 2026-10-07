package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/j4.class */
public final class j4 implements Runnable {
    final int F;
    final boolean M;
    private static int[] k;
    private static final long a = yz.a(7286528217325016279L, 1837187445394322979L, MethodHandles.lookup().lookupClass()).a(143681571296802L);

    public j4(int i, boolean z) {
        this.F = i;
        this.M = z;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        long j = a ^ 18810421632951L;
        long j2 = j ^ 107335372296440L;
        long j3 = j ^ 25343639681938L;
        Thread.sleep(this.F);
        _5 _5 = _5.t;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-5124163538228830354L, j) /* invoke-custom */;
        _5.E(rb.N(ux.X, _5.S(j3, _5.t), j2, this.M));
        Object obj = iArr;
        if (obj != null) {
            try {
                obj = new _g[1];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -5127955807551048984L, j) /* invoke-custom */;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -5148331001244362354L, j) /* invoke-custom */;
            }
        }
    }

    public static void I(int[] iArr) {
        k = iArr;
    }

    public static int[] r() {
        return k;
    }

    static {
        long j = a ^ 121789870549702L;
        if ((int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3633789486420465121L, j) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[1], -3671476817177705947L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
