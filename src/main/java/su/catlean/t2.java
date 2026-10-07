package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.List;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/t2.class */
public final class t2 implements Runnable {
    final int K;
    private static final long a = yz.a(3677195933568187457L, 8375471263312503100L, MethodHandles.lookup().lookupClass()).a(202130605757384L);

    public t2(int $delay) {
        this.K = $delay;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        long j = a ^ 28574787861413L;
        Thread.sleep(this.K);
        List listR = rq.G.r(j ^ 14799253892798L);
        rq.Z().clear();
        rq.Z().addAll(listR);
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1739567320077592299L, j) /* invoke-custom */;
        try {
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1769098512524903965L, j) /* invoke-custom */ != null) {
                iArr = new int[4];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(iArr, -1773439646189639426L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(iArr, -1814935287590928650L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
