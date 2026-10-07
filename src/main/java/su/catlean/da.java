package su.catlean;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_243;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/da.class */
public final class da implements Comparator {
    final class_243 n;

    public da(class_243 class_243Var) {
        this.n = class_243Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object a, Object b) {
        return ComparisonsKt.compareValues(Double.valueOf(this.n.method_1022((class_243) a)), Double.valueOf(this.n.method_1022((class_243) b)));
    }
}
