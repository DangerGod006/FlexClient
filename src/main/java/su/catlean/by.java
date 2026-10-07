package su.catlean;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/by.class */
public final class by implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object a, Object b) {
        return ComparisonsKt.compareValues((String) a, (String) b);
    }
}
