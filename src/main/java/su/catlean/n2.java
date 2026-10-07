package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_742;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/n2.class */
public final class n2 implements Comparator {
    private static final long a = yz.a(-8398062320906324946L, 4923199049222960135L, MethodHandles.lookup().lookupClass()).a(52478358323778L);

    @Override // java.util.Comparator
    public final int compare(Object a2, Object b) {
        long j = (a ^ 96618736135604L) ^ 72641914058855L;
        return ComparisonsKt.compareValues(Float.valueOf(zf.v(j).method_5739((class_742) a2)), Float.valueOf(zf.v(j).method_5739((class_742) b)));
    }
}
