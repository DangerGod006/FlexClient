package kotlin.collections;

import java.util.Iterator;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Grouping.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/Grouping.class */
@SinceKotlin(version = "1.1")
public interface Grouping<T, K> {
    @NotNull
    Iterator<T> sourceIterator();

    K keyOf(T t);
}
