package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/sequences/SequencesKt__SequencesKt$sequenceOf$1$1.class */
public final class SequencesKt__SequencesKt$sequenceOf$1$1<T> implements Iterator<T>, KMappedMarker {
    private boolean _hasNext = true;
    final /* synthetic */ T $element;

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    SequencesKt__SequencesKt$sequenceOf$1$1(T $element) {
        this.$element = $element;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this._hasNext) {
            throw new NoSuchElementException();
        }
        this._hasNext = false;
        return this.$element;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this._hasNext;
    }
}
