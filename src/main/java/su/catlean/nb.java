package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/nb.class */
public final class nb implements Runnable {
    final int p;
    private static String W;
    private static final long a = yz.a(-1144173234703483777L, 2499100012809533188L, MethodHandles.lookup().lookupClass()).a(103773081018879L);

    public nb(int $delay) {
        this.p = $delay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.String] */
    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        long j = a ^ 45619879420453L;
        long j2 = j ^ 103103850120730L;
        int i = (int) (j >>> 56);
        long j3 = ((j ^ 98473431858756L) << 8) >>> 8;
        long j4 = j ^ 104831690665181L;
        Thread.sleep(this.p);
        uy uyVar = uy.U;
        ?? O = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(991220255159768976L, j) /* invoke-custom */;
        uy.l(false);
        sg.H.t(true);
        us.z.d(j4);
        try {
            try {
                uy uyVar2 = uy.U;
                uy.m(false);
                ?? r0 = O;
                ?? r02 = r0;
                if (r0 != 0) {
                    O = uy.O(uy.U, j2);
                    if (O != 0) {
                        us.z.o((byte) i, j3);
                        uy uyVar3 = uy.U;
                        uy.m(true);
                    }
                    sg sgVar = sg.H;
                    sgVar.t(false);
                    r02 = sgVar;
                }
                try {
                    if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(942058125568971651L, j) /* invoke-custom */ != null) {
                        r02 = "cJOfJ";
                        vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("cJOfJ", 988909728669763588L, j) /* invoke-custom */;
                    }
                } catch (NumberFormatException unused) {
                    throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(r02, 980124615500404845L, j) /* invoke-custom */;
                }
            } catch (NumberFormatException unused2) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(O, 980124615500404845L, j) /* invoke-custom */;
            }
        } catch (NumberFormatException unused3) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(O, 980124615500404845L, j) /* invoke-custom */;
        }
    }

    public static void Q(String str) {
        W = str;
    }

    public static String D() {
        return W;
    }

    static {
        long j = a ^ 96256076865392L;
        if ((String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1110986797195089211L, j) /* invoke-custom */ == null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("dTk9e", -1086441877781351087L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
