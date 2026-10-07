package su.catlean;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;
import net.minecraft.class_2248;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/q.class */
public final class q implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object a, Object b) {
        return ComparisonsKt.compareValues(((class_2248) a).method_9518().getString(), ((class_2248) b).method_9518().getString());
    }
}
