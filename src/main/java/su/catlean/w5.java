package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/w5.class */
public final class w5 implements Runnable {
    final int h;
    private static String[] l;
    private static final long a = yz.a(5471893296269150731L, -8535250809707412076L, MethodHandles.lookup().lookupClass()).a(246538749756351L);

    public w5(int $delay) {
        this.h = $delay;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        long j = a ^ 51173781562753L;
        long j2 = j ^ 2398822985505L;
        Thread.sleep(this.h);
        String[] strArr = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3706456673738855756L, j) /* invoke-custom */;
        zf.F(j2).method_40000(x.T);
        Object obj = strArr;
        if (obj == null) {
            try {
                obj = new _g[3];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 3697360733779540338L, j) /* invoke-custom */;
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, 3703846266749565677L, j) /* invoke-custom */;
            }
        }
    }

    public static void E(String[] strArr) {
        l = strArr;
    }

    public static String[] I() {
        return l;
    }

    static {
        long j = a ^ 46117245156032L;
        if ((String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6039610987634161139L, j) /* invoke-custom */ == null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[5], -5986922579806539396L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
