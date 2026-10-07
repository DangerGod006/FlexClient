package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_2338;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/te.class */
public final class te implements Comparator {
    final double[] F;
    private static final long a = yz.a(5160970768762988838L, 1526931674224405926L, MethodHandles.lookup().lookupClass()).a(251757663716269L);

    public te(double[] dArr) {
        this.F = dArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.String] */
    @Override // java.util.Comparator
    public final int compare(Object a2, Object b) {
        long j = a ^ 55316339069706L;
        long j2 = j ^ 80298344807022L;
        Object objCompareValues = (String) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-6324563866371608753L, j) /* invoke-custom */;
        try {
            objCompareValues = ComparisonsKt.compareValues(Double.valueOf(((class_2338) a2).method_46558().method_1028(zf.v(j2).method_23317() + this.F[0], zf.v(j2).method_23318(), zf.v(j2).method_23321() + this.F[1])), Double.valueOf(((class_2338) b).method_46558().method_1028(zf.v(j2).method_23317() + this.F[0], zf.v(j2).method_23318(), zf.v(j2).method_23321() + this.F[1])));
            if (objCompareValues != 0) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[3], -6330158424622194149L, j) /* invoke-custom */;
            }
            return objCompareValues;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objCompareValues, -6272813408038230894L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
