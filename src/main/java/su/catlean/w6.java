package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_3965;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/w6.class */
public final class w6 implements Comparator {
    private static int t;
    private static final long a = yz.a(-8395517365974704207L, 6048797387394052316L, MethodHandles.lookup().lookupClass()).a(269779843598329L);

    @Override // java.util.Comparator
    public final int compare(Object a2, Object b) {
        long j = (a ^ 38367674170905L) ^ 71163624465187L;
        return ComparisonsKt.compareValues(Double.valueOf(zf.v(j).method_33571().method_1025(((class_3965) a2).method_17784())), Double.valueOf(zf.v(j).method_33571().method_1025(((class_3965) b).method_17784())));
    }

    public static void g(int i) {
        t = i;
    }

    public static int K() {
        return t;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static int c() {
        return K() == 0 ? 6 : 0;
    }

    static {
        long j = a ^ 31485649511408L;
        if ((int) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-1395738571072188500L, j) /* invoke-custom */ == 0) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(14, -1347383232212776940L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
