package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_3965;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/si.class */
public final class si implements Comparator {
    private static String[] m;
    private static final long a = yz.a(-9081064515331713736L, 4874658618522533266L, MethodHandles.lookup().lookupClass()).a(88765670507335L);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.String[]] */
    @Override // java.util.Comparator
    public final int compare(Object a2, Object b) {
        long j = a ^ 40369609254585L;
        long j2 = j ^ 101269883299698L;
        Object objCompareValues = (String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(8445004208019715126L, j) /* invoke-custom */;
        try {
            objCompareValues = ComparisonsKt.compareValues(Double.valueOf(zf.v(j2).method_33571().method_1025(((class_3965) a2).method_17784())), Double.valueOf(zf.v(j2).method_33571().method_1025(((class_3965) b).method_17784())));
            if (objCompareValues != 0) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[4], 8447300921775914759L, j) /* invoke-custom */;
            }
            return objCompareValues;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objCompareValues, 8481706461810153187L, j) /* invoke-custom */;
        }
    }

    public static void C(String[] strArr) {
        m = strArr;
    }

    public static String[] P() {
        return m;
    }

    static {
        long j = a ^ 110299023414125L;
        if ((String[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(String[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4676687440215638498L, j) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new String[1], 4614157110609072144L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
