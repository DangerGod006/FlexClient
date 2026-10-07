package su.catlean;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1297;
import net.minecraft.class_243;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/gd.class */
public final class gd implements Comparator {
    private static int[] A;
    private static final long a = yz.a(509664487931814498L, 1453492134935506192L, MethodHandles.lookup().lookupClass()).a(258674519614279L);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // java.util.Comparator
    public final int compare(Object a2, Object b) {
        long j = a ^ 105774216231178L;
        int i = (int) (j >>> 56);
        long j2 = ((j ^ 7739116972883L) << 8) >>> 8;
        long j3 = j ^ 110245840939858L;
        int[] iArr = (int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(4128906720713863763L, j) /* invoke-custom */;
        class_1297 class_1297Var = (class_1297) a2;
        class_243 class_243VarMethod_33571 = zf.v(j3).method_33571();
        en enVar = en.b;
        Intrinsics.checkNotNull(class_1297Var);
        Double dValueOf = Double.valueOf(class_243VarMethod_33571.method_1025(enVar.J((byte) i, j2, class_1297Var)));
        class_1297 class_1297Var2 = (class_1297) b;
        Object objCompareValues = 0;
        try {
            class_243 class_243VarMethod_335712 = zf.v(j3).method_33571();
            en enVar2 = en.b;
            Intrinsics.checkNotNull(class_1297Var2);
            objCompareValues = ComparisonsKt.compareValues(dValueOf, Double.valueOf(class_243VarMethod_335712.method_1025(enVar2.J((byte) i, j2, class_1297Var2))));
            if (iArr != null) {
                vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new _g[3], 4114864202853397287L, j) /* invoke-custom */;
            }
            return objCompareValues;
        } catch (NumberFormatException unused) {
            throw (NumberFormatException) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(NumberFormatException.class, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(objCompareValues, 4090690585147815978L, j) /* invoke-custom */;
        }
    }

    public static void v(int[] iArr) {
        A = iArr;
    }

    public static int[] v() {
        return A;
    }

    static {
        long j = a ^ 125591526382972L;
        if ((int[]) vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(int[].class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(-7117164314500540891L, j) /* invoke-custom */ != null) {
            vm.a(MethodHandles.lookup(), "Å", MethodType.methodType(Void.TYPE, Object.class, Long.TYPE, Long.TYPE)).dynamicInvoker().invoke(new int[5], -7065510142528239839L, j) /* invoke-custom */;
        }
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
    }
}
