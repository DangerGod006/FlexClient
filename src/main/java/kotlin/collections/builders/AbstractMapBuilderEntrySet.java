package kotlin.collections.builders;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MapBuilder.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/builders/AbstractMapBuilderEntrySet.class */
public abstract class AbstractMapBuilderEntrySet<E extends Map.Entry<? extends K, ? extends V>, K, V> extends AbstractMutableSet<E> {
    public abstract boolean containsEntry(@NotNull Map.Entry<? extends K, ? extends V> entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object element) {
        if (element instanceof Map.Entry) {
            return contains((Map.Entry) element);
        }
        return false;
    }

    public /* bridge */ boolean remove(Map.Entry<?, ?> element) {
        return super.remove((Object) element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object element) {
        if (element instanceof Map.Entry) {
            return remove((Map.Entry<?, ?>) element);
        }
        return false;
    }

    public final boolean contains(@NotNull E element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return containsEntry(element);
    }
}
