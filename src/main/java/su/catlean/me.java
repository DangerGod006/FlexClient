package su.catlean;

import java.lang.invoke.MethodHandles;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_2338;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/me.class */
public final class me implements Comparator {
    final double[] s;
    private static final long a = yz.a(2162100038635540272L, -2305859575058774886L, MethodHandles.lookup().lookupClass()).a(235743095427625L);

    public me(double[] dArr) {
        this.s = dArr;
    }

    @Override // java.util.Comparator
    public final int compare(Object a2, Object b) {
        long j = (a ^ 118911429089929L) ^ 94459462929367L;
        return ComparisonsKt.compareValues(Double.valueOf(((class_2338) a2).method_46558().method_1028(zf.v(j).method_23317() + this.s[0], zf.v(j).method_23318(), zf.v(j).method_23321() + this.s[1])), Double.valueOf(((class_2338) b).method_46558().method_1028(zf.v(j).method_23317() + this.s[0], zf.v(j).method_23318(), zf.v(j).method_23321() + this.s[1])));
    }
}
