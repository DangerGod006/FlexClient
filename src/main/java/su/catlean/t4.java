package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_2338;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/t4.class */
public final class t4 implements Comparator {
    private static final long a = yz.a(-4165720267587765446L, 5979288400800260635L, MethodHandles.lookup().lookupClass()).a(203553888226240L);

    @Override // java.util.Comparator
    public final int compare(Object a2, Object b) {
        long j = (a ^ 1109940010376L) ^ 118476870886674L;
        return ComparisonsKt.compareValues(Double.valueOf(zf.v(j).method_33571().method_1022(((class_2338) b).method_46558())), Double.valueOf(zf.v(j).method_33571().method_1022(((class_2338) a2).method_46558())));
    }
}
