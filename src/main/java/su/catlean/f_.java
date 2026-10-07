package su.catlean;

import java.io.File;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/f_.class */
public final class f_ implements Runnable {
    final int i;
    private static final long a = yz.a(-2108138520625534466L, 4052978590936760661L, MethodHandles.lookup().lookupClass()).a(182986827396611L);

    public f_(int $delay) {
        this.i = $delay;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        long j = a ^ 26435369947813L;
        long j2 = j ^ 6936458700984L;
        long j3 = j ^ 6936458700984L;
        Thread.sleep(this.i);
        yl.g.q(j ^ 23853214097953L);
        File[] fileArrL = mj.l();
        int i = 0;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7863723769970437098L, j) /* invoke-custom */;
        int length = fileArrL.length;
        while (i < length) {
            File file = fileArrL[i];
            _g[] _gVarArr2 = null;
            try {
                file.mkdirs();
                i++;
                _gVarArr2 = _gVarArr;
                if (_gVarArr2 == null) {
                    return;
                }
                if (_gVarArr == null) {
                    break;
                }
            } catch (NumberFormatException unused) {
                throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(_gVarArr2, -7901222470498213064L, j) /* invoke-custom */;
            }
        }
        yl.g.l().w(j3);
        yl.g.d().w(j2);
        ir.r.D();
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
