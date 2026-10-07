package su.catlean;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/ll.class */
public final class ll implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object a, Object b) {
        return ComparisonsKt.compareValues(Integer.valueOf(((Enum) a).name().length()), Integer.valueOf(((Enum) b).name().length()));
    }
}
