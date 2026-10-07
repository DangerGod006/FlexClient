package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_1657;
import net.minecraft.class_2338;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/_7.class */
public final class _7 implements Comparator {
    final class_1657 H;
    private static _g[] L;
    private static final long a = yz.a(-3711468906153983158L, -4387807468706797874L, MethodHandles.lookup().lookupClass()).a(130708210504400L);

    public _7(class_1657 class_1657Var) {
        this.H = class_1657Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    @Override // java.util.Comparator
    public final int compare(Object a2, Object b) {
        long j = a ^ 125032682665923L;
        _g[] _gVarArr = (_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(776730510595704524L, j) /* invoke-custom */;
        Object objCompareValues = 0;
        try {
            objCompareValues = ComparisonsKt.compareValues(Double.valueOf(this.H.method_33571().method_1022(((class_2338) a2).method_46558())), Double.valueOf(this.H.method_33571().method_1022(((class_2338) b).method_46558())));
            if (_gVarArr != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[1], 749428133087543387L, j) /* invoke-custom */;
            }
            return objCompareValues;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objCompareValues, 765884065645927250L, j) /* invoke-custom */;
        }
    }

    public static void O(_g[] _gVarArr) {
        L = _gVarArr;
    }

    public static _g[] L() {
        return L;
    }

    static {
        long j = a ^ 42664748420834L;
        if ((_g[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(_g[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(3739913152000557037L, j) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[3], 3740770293838016589L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
