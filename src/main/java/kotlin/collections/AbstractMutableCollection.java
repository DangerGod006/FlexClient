package kotlin.collections;

import java.util.Collection;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.markers.KMutableCollection;

/* JADX INFO: compiled from: AbstractMutableCollection.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/AbstractMutableCollection.class */
@SinceKotlin(version = "1.1")
public abstract class AbstractMutableCollection<E> extends java.util.AbstractCollection<E> implements Collection<E>, KMutableCollection {
    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean add(E e);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    protected AbstractMutableCollection() {
    }
}
