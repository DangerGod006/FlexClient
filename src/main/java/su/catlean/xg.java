package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/xg.class */
public final class xg implements Runnable {
    final int D;
    final _g w;
    private static String x;
    private static final long a = yz.a(-1457104587333393916L, 4982747470262936036L, MethodHandles.lookup().lookupClass()).a(208906287101498L);

    public xg(int i, _g _gVar) {
        this.D = i;
        this.w = _gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v42, types: [su.catlean.tw] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        long j = a ^ 38233901256423L;
        long j2 = j ^ 73336865869649L;
        String str = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-472388018478457629L, j) /* invoke-custom */;
        Thread.sleep(this.D);
        Iterator it = fi.P().iterator();
        do {
            ?? HasNext = it.hasNext();
            while (HasNext != 0) {
                ArrayList<tw> arrayListE = ((ry) it.next()).E();
                if (str == null) {
                    return;
                }
                for (tw twVar : arrayListE) {
                    HasNext = str;
                    if (HasNext != 0) {
                        try {
                            HasNext = Intrinsics.areEqual(twVar.K(), this.w);
                            if (str != null) {
                                if (HasNext != 0) {
                                    try {
                                        HasNext = twVar;
                                        HasNext.j(j2);
                                    } catch (NumberFormatException unused) {
                                        throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(HasNext, -432728126854946915L, j) /* invoke-custom */;
                                    }
                                }
                            }
                        } catch (NumberFormatException unused2) {
                            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(HasNext, -432728126854946915L, j) /* invoke-custom */;
                        }
                    }
                    if (str == null) {
                        break;
                    }
                }
            }
            return;
        } while (str != null);
    }

    public static void Y(String str) {
        x = str;
    }

    public static String O() {
        return x;
    }

    static {
        long j = a ^ 86867186354807L;
        if ((String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-4764297825219274637L, j) /* invoke-custom */ == null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("SMzMUb", -4804463187916621635L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
