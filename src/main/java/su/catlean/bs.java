package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_3965;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/bs.class */
public final class bs implements Comparator {
    private static int[] h;
    private static final long a = yz.a(5923240106666421228L, -7850087669393763421L, MethodHandles.lookup().lookupClass()).a(22166380070477L);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    @Override // java.util.Comparator
    public final int compare(Object a2, Object b) {
        long j = a ^ 118981396709369L;
        long j2 = j ^ 118834235281728L;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4854265350987475786L, j) /* invoke-custom */;
        Object objCompareValues = 0;
        try {
            objCompareValues = ComparisonsKt.compareValues(Double.valueOf(zf.v(j2).method_33571().method_1025(((class_3965) a2).method_17784())), Double.valueOf(zf.v(j2).method_33571().method_1025(((class_3965) b).method_17784())));
            if (iArr != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[3], 4830365000835156277L, j) /* invoke-custom */;
            }
            return objCompareValues;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objCompareValues, 4850385320323569150L, j) /* invoke-custom */;
        }
    }

    public static void W(int[] iArr) {
        h = iArr;
    }

    public static int[] E() {
        return h;
    }

    static {
        long j = a ^ 11330182221913L;
        if ((int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(7853634426906232042L, j) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[1], 7836431248691393615L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
