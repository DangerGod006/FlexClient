package kotlin.collections;

import java.util.List;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.markers.KMutableList;

/* JADX INFO: compiled from: AbstractMutableList.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/AbstractMutableList.class */
@SinceKotlin(version = "1.1")
public abstract class AbstractMutableList<E> extends java.util.AbstractList<E> implements List<E>, KMutableList {
    @Override // java.util.AbstractList, java.util.List
    public abstract E set(int i, E e);

    public abstract E removeAt(int i);

    @Override // java.util.AbstractList, java.util.List
    public abstract void add(int i, E e);

    public abstract int getSize();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ E remove(int index) {
        return removeAt(index);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    protected AbstractMutableList() {
    }
}
