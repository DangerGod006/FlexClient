package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/m9.class */
public final class m9 extends Thread {
    private static boolean O;
    private static final long a = yz.a(451139238856524211L, -3838081566582568328L, MethodHandles.lookup().lookupClass()).a(6182769701399L);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, su.catlean._g[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Exception {
        long j = a ^ 103999022855761L;
        long j2 = j ^ 121598259981976L;
        long j3 = j ^ 34935375162106L;
        Object obj = (boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7049084273088424021L, j) /* invoke-custom */;
        yl.g.q(j2);
        try {
            os.D.s(j3);
            super.run();
            if (obj == 0) {
                obj = new _g[5];
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -7045891301473479670L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(obj, -7010032527601815334L, j) /* invoke-custom */;
        }
    }

    public static void F(boolean z) {
        O = z;
    }

    public static boolean G() {
        return O;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static boolean q() {
        return !G();
    }

    static {
        long j = a ^ 105519581765941L;
        if ((boolean) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-3942727348823670577L, j) /* invoke-custom */) {
            return;
        }
        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Boolean.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(true, -3893814835103631333L, j) /* invoke-custom */;
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
