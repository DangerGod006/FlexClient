package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_2338;
import net.minecraft.class_243;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/rh.class */
public final class rh implements Comparator {
    final class_243 U;
    private static String R;
    private static final long a = yz.a(-6313708130230503124L, 7962333429127072206L, MethodHandles.lookup().lookupClass()).a(26767716032862L);

    public rh(class_243 class_243Var) {
        this.U = class_243Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    @Override // java.util.Comparator
    public final int compare(Object a2, Object b) {
        long j = a ^ 36498954575889L;
        (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2182121266847390014L, j) /* invoke-custom */;
        Object objCompareValues = 0;
        try {
            objCompareValues = ComparisonsKt.compareValues(Double.valueOf(((class_2338) a2).method_46558().method_1022(this.U)), Double.valueOf(((class_2338) b).method_46558().method_1022(this.U)));
            if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-2171357203412877492L, j) /* invoke-custom */ != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("V2VCnc", -2200999835961600662L, j) /* invoke-custom */;
            }
            return objCompareValues;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objCompareValues, -2173250816852606939L, j) /* invoke-custom */;
        }
    }

    public static void p(String str) {
        R = str;
    }

    public static String q() {
        return R;
    }

    static {
        long j = a ^ 69636711906990L;
        if ((String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-69645113239963523L, j) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke("mb4Grc", -14808050291323947L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
