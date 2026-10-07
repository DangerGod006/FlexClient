package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_3965;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_t.class */
public final class _t implements Comparator {
    private static final long a = yz.a(-2090984215748182622L, -5200576937610715304L, MethodHandles.lookup().lookupClass()).a(126835002431466L);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    @Override // java.util.Comparator
    public final int compare(Object a2, Object b) {
        long j = a ^ 56682974102382L;
        long j2 = j ^ 68766843788099L;
        int i = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(719931592166766050L, j) /* invoke-custom */;
        Object objCompareValues = 0;
        try {
            objCompareValues = ComparisonsKt.compareValues(Double.valueOf(zf.v(j2).method_33571().method_1025(((class_3965) a2).method_17784())), Double.valueOf(zf.v(j2).method_33571().method_1025(((class_3965) b).method_17784())));
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(683864641215272940L, j) /* invoke-custom */ != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(i + 1, 631738025734581661L, j) /* invoke-custom */;
            }
            return objCompareValues;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objCompareValues, 680731273420385268L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
