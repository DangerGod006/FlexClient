package kotlin.collections;

import java.util.Set;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.markers.KMutableSet;

/* JADX INFO: compiled from: AbstractMutableSet.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/AbstractMutableSet.class */
@SinceKotlin(version = "1.1")
public abstract class AbstractMutableSet<E> extends java.util.AbstractSet<E> implements Set<E>, KMutableSet {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean add(E e);

    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return getSize();
    }

    protected AbstractMutableSet() {
    }
}
