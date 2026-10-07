package su.catlean;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/fm.class */
public final class fm implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object a, Object b) {
        return ComparisonsKt.compareValues(Integer.valueOf(((a1) a).Q().length()), Integer.valueOf(((a1) b).Q().length()));
    }
}
