package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/lv.class */
public final class lv implements Runnable {
    final int g;
    private static String r;
    private static final long a = yz.a(1552214561807891309L, 4600427558378185114L, MethodHandles.lookup().lookupClass()).a(174544275208148L);

    public lv(int $delay) {
        this.g = $delay;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        long j = a ^ 112290697253278L;
        long j2 = j ^ 2671112020613L;
        Thread.sleep(this.g);
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7125193071416075819L, j) /* invoke-custom */;
        e3.j.r(j2);
        Object obj = str;
        if (obj != null) {
            try {
                obj = new _g[4];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 7084066922205177970L, j) /* invoke-custom */;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 7096743894267456098L, j) /* invoke-custom */;
            }
        }
    }

    public static void X(String str) {
        r = str;
    }

    public static String P() {
        return r;
    }

    static {
        long j = a ^ 49278283054391L;
        if ((String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(1029230471676234370L, j) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("JKG3G", 1058994448930089210L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
