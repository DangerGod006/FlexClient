package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/yy.class */
public final class yy implements Runnable {
    final int n;
    private static final long a = yz.a(3670996963746500995L, 5886809280182922498L, MethodHandles.lookup().lookupClass()).a(18885287829215L);

    public yy(int $delay) {
        this.n = $delay;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        long j = a ^ 68944781373424L;
        long j2 = j ^ 90262946084212L;
        Thread.sleep(this.n);
        String[] strArr = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6252497612302250215L, j) /* invoke-custom */;
        try {
            zf.F(j2).method_40000(mc.J);
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6238365652055377923L, j) /* invoke-custom */ != null) {
                strArr = new String[1];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(strArr, -6197380934390008728L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(strArr, -6226033348057529200L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
