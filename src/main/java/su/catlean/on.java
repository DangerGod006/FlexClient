package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/on.class */
public final class on implements Comparator {
    private static final long a = yz.a(-8546052113798930415L, -6499725517617054273L, MethodHandles.lookup().lookupClass()).a(156785441641116L);

    @Override // java.util.Comparator
    public final int compare(Object a2, Object b) {
        long j = (a ^ 12279690019775L) ^ 116219064517050L;
        ds dsVar = (ds) a2;
        s7 s7Var = s7.r;
        Intrinsics.checkNotNull(dsVar);
        Integer numValueOf = Integer.valueOf(s7.C(j, s7Var, dsVar));
        ds dsVar2 = (ds) b;
        s7 s7Var2 = s7.r;
        Intrinsics.checkNotNull(dsVar2);
        return ComparisonsKt.compareValues(numValueOf, Integer.valueOf(s7.C(j, s7Var2, dsVar2)));
    }
}
