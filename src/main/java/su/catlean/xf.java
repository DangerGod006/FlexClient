package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_3965;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/xf.class */
public final class xf implements Comparator {
    private static final long a = yz.a(7040518653584201961L, -5907578590386348756L, MethodHandles.lookup().lookupClass()).a(191752529576189L);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // java.util.Comparator
    public final int compare(Object a2, Object b) {
        long j = a ^ 35516109807865L;
        long j2 = j ^ 111757679916052L;
        int i = (int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(2774019941161862514L, j) /* invoke-custom */;
        Object objCompareValues = 0;
        try {
            objCompareValues = ComparisonsKt.compareValues(Double.valueOf(zf.v(j2).method_33571().method_1025(((class_3965) a2).method_17784())), Double.valueOf(zf.v(j2).method_33571().method_1025(((class_3965) b).method_17784())));
            if (i == 0) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[5], 2764346852293487713L, j) /* invoke-custom */;
            }
            return objCompareValues;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objCompareValues, 2752954395106238557L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
