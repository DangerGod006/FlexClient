package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ArrayDeque.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/ArrayDeque.class */
@SinceKotlin(version = "1.4")
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    private int head;

    @NotNull
    private Object[] elementData;
    private int size;
    private static final int defaultMinCapacity = 10;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    private static final Object[] emptyElementData = new Object[0];

    @Override // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.size;
    }

    public ArrayDeque(int initialCapacity) {
        Object[] objArr;
        if (initialCapacity == 0) {
            objArr = emptyElementData;
        } else {
            if (initialCapacity <= 0) {
                throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
            }
            objArr = new Object[initialCapacity];
        }
        this.elementData = objArr;
    }

    public ArrayDeque() {
        this.elementData = emptyElementData;
    }

    public ArrayDeque(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.elementData = elements.toArray(new Object[0]);
        this.size = this.elementData.length;
        if (this.elementData.length == 0) {
            this.elementData = emptyElementData;
        }
    }

    private final void ensureCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        if (minCapacity <= this.elementData.length) {
            return;
        }
        if (this.elementData == emptyElementData) {
            this.elementData = new Object[RangesKt.coerceAtLeast(minCapacity, 10)];
        } else {
            int newCapacity = AbstractList.Companion.newCapacity$kotlin_stdlib(this.elementData.length, minCapacity);
            copyElements(newCapacity);
        }
    }

    private final void copyElements(int newCapacity) {
        Object[] newElements = new Object[newCapacity];
        ArraysKt.copyInto(this.elementData, newElements, 0, this.head, this.elementData.length);
        ArraysKt.copyInto(this.elementData, newElements, this.elementData.length - this.head, 0, this.head);
        this.head = 0;
        this.elementData = newElements;
    }

    @InlineOnly
    private final E internalGet(int i) {
        return (E) this.elementData[i];
    }

    private final int positiveMod(int index) {
        return index >= this.elementData.length ? index - this.elementData.length : index;
    }

    private final int negativeMod(int index) {
        return index < 0 ? index + this.elementData.length : index;
    }

    @InlineOnly
    private final int internalIndex(int index) {
        return positiveMod(this.head + index);
    }

    private final int incremented(int index) {
        if (index == ArraysKt.getLastIndex(this.elementData)) {
            return 0;
        }
        return index + 1;
    }

    private final int decremented(int index) {
        return index == 0 ? ArraysKt.getLastIndex(this.elementData) : index - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final E first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[this.head];
    }

    @Nullable
    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[this.head];
    }

    public final E last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.elementData[positiveMod(this.head + CollectionsKt.getLastIndex(this))];
    }

    @Nullable
    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.elementData[positiveMod(this.head + CollectionsKt.getLastIndex(this))];
    }

    public final void addFirst(E element) {
        registerModification();
        ensureCapacity(size() + 1);
        this.head = decremented(this.head);
        this.elementData[this.head] = element;
        this.size = size() + 1;
    }

    public final void addLast(E element) {
        registerModification();
        ensureCapacity(size() + 1);
        this.elementData[positiveMod(this.head + size())] = element;
        this.size = size() + 1;
    }

    public final E removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        E e = (E) this.elementData[this.head];
        this.elementData[this.head] = null;
        this.head = incremented(this.head);
        this.size = size() - 1;
        return e;
    }

    @Nullable
    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        registerModification();
        int iPositiveMod = positiveMod(this.head + CollectionsKt.getLastIndex(this));
        E e = (E) this.elementData[iPositiveMod];
        this.elementData[iPositiveMod] = null;
        this.size = size() - 1;
        return e;
    }

    @Nullable
    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        addLast(element);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, size());
        if (index == size()) {
            addLast(element);
            return;
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        registerModification();
        ensureCapacity(size() + 1);
        int internalIndex = positiveMod(this.head + index);
        if (index < ((size() + 1) >> 1)) {
            int decrementedInternalIndex = decremented(internalIndex);
            int decrementedHead = decremented(this.head);
            if (decrementedInternalIndex >= this.head) {
                this.elementData[decrementedHead] = this.elementData[this.head];
                ArraysKt.copyInto(this.elementData, this.elementData, this.head, this.head + 1, decrementedInternalIndex + 1);
            } else {
                ArraysKt.copyInto(this.elementData, this.elementData, this.head - 1, this.head, this.elementData.length);
                this.elementData[this.elementData.length - 1] = this.elementData[0];
                ArraysKt.copyInto(this.elementData, this.elementData, 0, 1, decrementedInternalIndex + 1);
            }
            this.elementData[decrementedInternalIndex] = element;
            this.head = decrementedHead;
        } else {
            int tail = positiveMod(this.head + size());
            if (internalIndex < tail) {
                ArraysKt.copyInto(this.elementData, this.elementData, internalIndex + 1, internalIndex, tail);
            } else {
                ArraysKt.copyInto(this.elementData, this.elementData, 1, 0, tail);
                this.elementData[0] = this.elementData[this.elementData.length - 1];
                ArraysKt.copyInto(this.elementData, this.elementData, internalIndex + 1, internalIndex, this.elementData.length - 1);
            }
            this.elementData[internalIndex] = element;
        }
        this.size = size() + 1;
    }

    private final void copyCollectionElements(int internalIndex, Collection<? extends E> elements) {
        Iterator<? extends E> it = elements.iterator();
        int length = this.elementData.length;
        for (int index = internalIndex; index < length && it.hasNext(); index++) {
            this.elementData[index] = it.next();
        }
        int i = this.head;
        for (int index2 = 0; index2 < i && it.hasNext(); index2++) {
            this.elementData[index2] = it.next();
        }
        this.size = size() + elements.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        registerModification();
        ensureCapacity(size() + elements.size());
        copyCollectionElements(positiveMod(this.head + size()), elements);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, @NotNull Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (index == size()) {
            return addAll(elements);
        }
        registerModification();
        ensureCapacity(size() + elements.size());
        int tail = positiveMod(this.head + size());
        int internalIndex = positiveMod(this.head + index);
        int elementsSize = elements.size();
        if (index < ((size() + 1) >> 1)) {
            int shiftedHead = this.head - elementsSize;
            if (internalIndex >= this.head) {
                if (shiftedHead >= 0) {
                    ArraysKt.copyInto(this.elementData, this.elementData, shiftedHead, this.head, internalIndex);
                } else {
                    shiftedHead += this.elementData.length;
                    int elementsToShift = internalIndex - this.head;
                    int shiftToBack = this.elementData.length - shiftedHead;
                    if (shiftToBack >= elementsToShift) {
                        ArraysKt.copyInto(this.elementData, this.elementData, shiftedHead, this.head, internalIndex);
                    } else {
                        ArraysKt.copyInto(this.elementData, this.elementData, shiftedHead, this.head, this.head + shiftToBack);
                        ArraysKt.copyInto(this.elementData, this.elementData, 0, this.head + shiftToBack, internalIndex);
                    }
                }
            } else {
                ArraysKt.copyInto(this.elementData, this.elementData, shiftedHead, this.head, this.elementData.length);
                if (elementsSize >= internalIndex) {
                    ArraysKt.copyInto(this.elementData, this.elementData, this.elementData.length - elementsSize, 0, internalIndex);
                } else {
                    ArraysKt.copyInto(this.elementData, this.elementData, this.elementData.length - elementsSize, 0, elementsSize);
                    ArraysKt.copyInto(this.elementData, this.elementData, 0, elementsSize, internalIndex);
                }
            }
            this.head = shiftedHead;
            copyCollectionElements(negativeMod(internalIndex - elementsSize), elements);
            return true;
        }
        int shiftedInternalIndex = internalIndex + elementsSize;
        if (internalIndex >= tail) {
            ArraysKt.copyInto(this.elementData, this.elementData, elementsSize, 0, tail);
            if (shiftedInternalIndex >= this.elementData.length) {
                ArraysKt.copyInto(this.elementData, this.elementData, shiftedInternalIndex - this.elementData.length, internalIndex, this.elementData.length);
            } else {
                ArraysKt.copyInto(this.elementData, this.elementData, 0, this.elementData.length - elementsSize, this.elementData.length);
                ArraysKt.copyInto(this.elementData, this.elementData, shiftedInternalIndex, internalIndex, this.elementData.length - elementsSize);
            }
        } else if (tail + elementsSize <= this.elementData.length) {
            ArraysKt.copyInto(this.elementData, this.elementData, shiftedInternalIndex, internalIndex, tail);
        } else if (shiftedInternalIndex >= this.elementData.length) {
            ArraysKt.copyInto(this.elementData, this.elementData, shiftedInternalIndex - this.elementData.length, internalIndex, tail);
        } else {
            int shiftToFront = (tail + elementsSize) - this.elementData.length;
            ArraysKt.copyInto(this.elementData, this.elementData, 0, tail - shiftToFront, tail);
            ArraysKt.copyInto(this.elementData, this.elementData, shiftedInternalIndex, internalIndex, tail - shiftToFront);
        }
        copyCollectionElements(internalIndex, elements);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        return (E) this.elementData[positiveMod(this.head + i)];
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public E set(int i, E e) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        int iPositiveMod = positiveMod(this.head + i);
        E e2 = (E) this.elementData[iPositiveMod];
        this.elementData[iPositiveMod] = e;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object element) {
        int tail = positiveMod(this.head + size());
        if (this.head >= tail) {
            if (this.head >= tail) {
                int length = this.elementData.length;
                for (int index = this.head; index < length; index++) {
                    if (Intrinsics.areEqual(element, this.elementData[index])) {
                        return index - this.head;
                    }
                }
                for (int index2 = 0; index2 < tail; index2++) {
                    if (Intrinsics.areEqual(element, this.elementData[index2])) {
                        return (index2 + this.elementData.length) - this.head;
                    }
                }
                return -1;
            }
            return -1;
        }
        for (int index3 = this.head; index3 < tail; index3++) {
            if (Intrinsics.areEqual(element, this.elementData[index3])) {
                return index3 - this.head;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object element) {
        int tail = positiveMod(this.head + size());
        if (this.head >= tail) {
            if (this.head > tail) {
                for (int index = tail - 1; -1 < index; index--) {
                    if (Intrinsics.areEqual(element, this.elementData[index])) {
                        return (index + this.elementData.length) - this.head;
                    }
                }
                int index2 = ArraysKt.getLastIndex(this.elementData);
                int i = this.head;
                if (i <= index2) {
                    while (!Intrinsics.areEqual(element, this.elementData[index2])) {
                        if (index2 == i) {
                            return -1;
                        }
                        index2--;
                    }
                    return index2 - this.head;
                }
                return -1;
            }
            return -1;
        }
        int index3 = tail - 1;
        int i2 = this.head;
        if (i2 <= index3) {
            while (!Intrinsics.areEqual(element, this.elementData[index3])) {
                if (index3 == i2) {
                    return -1;
                }
                index3--;
            }
            return index3 - this.head;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object element) {
        int index = indexOf(element);
        if (index == -1) {
            return false;
        }
        removeAt(index);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList
    public E removeAt(int i) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(i, size());
        if (i == CollectionsKt.getLastIndex(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        registerModification();
        int iPositiveMod = positiveMod(this.head + i);
        E e = (E) this.elementData[iPositiveMod];
        if (i < (size() >> 1)) {
            if (iPositiveMod >= this.head) {
                ArraysKt.copyInto(this.elementData, this.elementData, this.head + 1, this.head, iPositiveMod);
            } else {
                ArraysKt.copyInto(this.elementData, this.elementData, 1, 0, iPositiveMod);
                this.elementData[0] = this.elementData[this.elementData.length - 1];
                ArraysKt.copyInto(this.elementData, this.elementData, this.head + 1, this.head, this.elementData.length - 1);
            }
            this.elementData[this.head] = null;
            this.head = incremented(this.head);
        } else {
            int iPositiveMod2 = positiveMod(this.head + CollectionsKt.getLastIndex(this));
            if (iPositiveMod <= iPositiveMod2) {
                ArraysKt.copyInto(this.elementData, this.elementData, iPositiveMod, iPositiveMod + 1, iPositiveMod2 + 1);
            } else {
                ArraysKt.copyInto(this.elementData, this.elementData, iPositiveMod, iPositiveMod + 1, this.elementData.length);
                this.elementData[this.elementData.length - 1] = this.elementData[0];
                ArraysKt.copyInto(this.elementData, this.elementData, 0, 1, iPositiveMod2 + 1);
            }
            this.elementData[iPositiveMod2] = null;
        }
        this.size = size() - 1;
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!isEmpty()) {
            if (!(this.elementData.length == 0)) {
                int tail$iv = positiveMod(this.head + size());
                int newTail$iv = this.head;
                boolean modified$iv = false;
                if (this.head < tail$iv) {
                    for (int index$iv = this.head; index$iv < tail$iv; index$iv++) {
                        Object element$iv = this.elementData[index$iv];
                        if (!elements.contains(element$iv)) {
                            int i = newTail$iv;
                            newTail$iv++;
                            this.elementData[i] = element$iv;
                        } else {
                            modified$iv = true;
                        }
                    }
                    ArraysKt.fill(this.elementData, (Object) null, newTail$iv, tail$iv);
                } else {
                    int length = this.elementData.length;
                    for (int index$iv2 = this.head; index$iv2 < length; index$iv2++) {
                        Object element$iv2 = this.elementData[index$iv2];
                        this.elementData[index$iv2] = null;
                        if (!elements.contains(element$iv2)) {
                            int i2 = newTail$iv;
                            newTail$iv++;
                            this.elementData[i2] = element$iv2;
                        } else {
                            modified$iv = true;
                        }
                    }
                    newTail$iv = positiveMod(newTail$iv);
                    for (int index$iv3 = 0; index$iv3 < tail$iv; index$iv3++) {
                        Object element$iv3 = this.elementData[index$iv3];
                        this.elementData[index$iv3] = null;
                        if (!elements.contains(element$iv3)) {
                            this.elementData[newTail$iv] = element$iv3;
                            newTail$iv = incremented(newTail$iv);
                        } else {
                            modified$iv = true;
                        }
                    }
                }
                if (modified$iv) {
                    registerModification();
                    this.size = negativeMod(newTail$iv - this.head);
                }
                return modified$iv;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@NotNull Collection<?> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!isEmpty()) {
            if (!(this.elementData.length == 0)) {
                int tail$iv = positiveMod(this.head + size());
                int newTail$iv = this.head;
                boolean modified$iv = false;
                if (this.head < tail$iv) {
                    for (int index$iv = this.head; index$iv < tail$iv; index$iv++) {
                        Object element$iv = this.elementData[index$iv];
                        if (elements.contains(element$iv)) {
                            int i = newTail$iv;
                            newTail$iv++;
                            this.elementData[i] = element$iv;
                        } else {
                            modified$iv = true;
                        }
                    }
                    ArraysKt.fill(this.elementData, (Object) null, newTail$iv, tail$iv);
                } else {
                    int length = this.elementData.length;
                    for (int index$iv2 = this.head; index$iv2 < length; index$iv2++) {
                        Object element$iv2 = this.elementData[index$iv2];
                        this.elementData[index$iv2] = null;
                        if (elements.contains(element$iv2)) {
                            int i2 = newTail$iv;
                            newTail$iv++;
                            this.elementData[i2] = element$iv2;
                        } else {
                            modified$iv = true;
                        }
                    }
                    newTail$iv = positiveMod(newTail$iv);
                    for (int index$iv3 = 0; index$iv3 < tail$iv; index$iv3++) {
                        Object element$iv3 = this.elementData[index$iv3];
                        this.elementData[index$iv3] = null;
                        if (elements.contains(element$iv3)) {
                            this.elementData[newTail$iv] = element$iv3;
                            newTail$iv = incremented(newTail$iv);
                        } else {
                            modified$iv = true;
                        }
                    }
                }
                if (modified$iv) {
                    registerModification();
                    this.size = negativeMod(newTail$iv - this.head);
                }
                return modified$iv;
            }
        }
        return false;
    }

    private final boolean filterInPlace(Function1<? super E, Boolean> predicate) {
        if (!isEmpty()) {
            if (this.elementData.length == 0) {
                return false;
            }
            int tail = positiveMod(this.head + size());
            int newTail = this.head;
            boolean modified = false;
            if (this.head < tail) {
                for (int index = this.head; index < tail; index++) {
                    Object element = this.elementData[index];
                    if (predicate.invoke(element).booleanValue()) {
                        int i = newTail;
                        newTail++;
                        this.elementData[i] = element;
                    } else {
                        modified = true;
                    }
                }
                ArraysKt.fill(this.elementData, (Object) null, newTail, tail);
            } else {
                int length = this.elementData.length;
                for (int index2 = this.head; index2 < length; index2++) {
                    Object element2 = this.elementData[index2];
                    this.elementData[index2] = null;
                    if (predicate.invoke(element2).booleanValue()) {
                        int i2 = newTail;
                        newTail++;
                        this.elementData[i2] = element2;
                    } else {
                        modified = true;
                    }
                }
                newTail = positiveMod(newTail);
                for (int index3 = 0; index3 < tail; index3++) {
                    Object element3 = this.elementData[index3];
                    this.elementData[index3] = null;
                    if (predicate.invoke(element3).booleanValue()) {
                        this.elementData[newTail] = element3;
                        newTail = incremented(newTail);
                    } else {
                        modified = true;
                    }
                }
            }
            if (modified) {
                registerModification();
                this.size = negativeMod(newTail - this.head);
            }
            return modified;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            registerModification();
            int tail = positiveMod(this.head + size());
            nullifyNonEmpty(this.head, tail);
        }
        this.head = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public <T> T[] toArray(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        Object[] objArrArrayOfNulls = array.length >= size() ? array : ArraysKt.arrayOfNulls(array, size());
        int iPositiveMod = positiveMod(this.head + size());
        if (this.head < iPositiveMod) {
            ArraysKt.copyInto$default(this.elementData, objArrArrayOfNulls, 0, this.head, iPositiveMod, 2, (Object) null);
        } else {
            if (!isEmpty()) {
                ArraysKt.copyInto(this.elementData, objArrArrayOfNulls, 0, this.head, this.elementData.length);
                ArraysKt.copyInto(this.elementData, objArrArrayOfNulls, this.elementData.length - this.head, 0, iPositiveMod);
            }
        }
        return (T[]) CollectionsKt.terminateCollectionToArray(size(), objArrArrayOfNulls);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // java.util.AbstractList
    protected void removeRange(int fromIndex, int toIndex) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, size());
        int length = toIndex - fromIndex;
        if (length == 0) {
            return;
        }
        if (length == size()) {
            clear();
            return;
        }
        if (length == 1) {
            removeAt(fromIndex);
            return;
        }
        registerModification();
        if (fromIndex < size() - toIndex) {
            removeRangeShiftPreceding(fromIndex, toIndex);
            int newHead = positiveMod(this.head + length);
            nullifyNonEmpty(this.head, newHead);
            this.head = newHead;
        } else {
            removeRangeShiftSucceeding(fromIndex, toIndex);
            int tail = positiveMod(this.head + size());
            nullifyNonEmpty(negativeMod(tail - length), tail);
        }
        this.size = size() - length;
    }

    private final void removeRangeShiftPreceding(int fromIndex, int toIndex) {
        int copyFromIndex = positiveMod(this.head + (fromIndex - 1));
        int copyToIndex = positiveMod(this.head + (toIndex - 1));
        int i = fromIndex;
        while (true) {
            int copyCount = i;
            if (copyCount > 0) {
                int segmentLength = Math.min(copyCount, Math.min(copyFromIndex + 1, copyToIndex + 1));
                ArraysKt.copyInto(this.elementData, this.elementData, (copyToIndex - segmentLength) + 1, (copyFromIndex - segmentLength) + 1, copyFromIndex + 1);
                copyFromIndex = negativeMod(copyFromIndex - segmentLength);
                copyToIndex = negativeMod(copyToIndex - segmentLength);
                i = copyCount - segmentLength;
            } else {
                return;
            }
        }
    }

    private final void removeRangeShiftSucceeding(int fromIndex, int toIndex) {
        int copyFromIndex = positiveMod(this.head + toIndex);
        int copyToIndex = positiveMod(this.head + fromIndex);
        int size = size();
        int i = toIndex;
        while (true) {
            int copyCount = size - i;
            if (copyCount > 0) {
                int segmentLength = Math.min(copyCount, Math.min(this.elementData.length - copyFromIndex, this.elementData.length - copyToIndex));
                ArraysKt.copyInto(this.elementData, this.elementData, copyToIndex, copyFromIndex, copyFromIndex + segmentLength);
                copyFromIndex = positiveMod(copyFromIndex + segmentLength);
                copyToIndex = positiveMod(copyToIndex + segmentLength);
                size = copyCount;
                i = segmentLength;
            } else {
                return;
            }
        }
    }

    private final void nullifyNonEmpty(int internalFromIndex, int internalToIndex) {
        if (internalFromIndex < internalToIndex) {
            ArraysKt.fill(this.elementData, (Object) null, internalFromIndex, internalToIndex);
        } else {
            ArraysKt.fill(this.elementData, (Object) null, internalFromIndex, this.elementData.length);
            ArraysKt.fill(this.elementData, (Object) null, 0, internalToIndex);
        }
    }

    private final void registerModification() {
        this.modCount++;
    }

    @NotNull
    public final <T> T[] testToArray$kotlin_stdlib(@NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) toArray(array);
    }

    @NotNull
    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    public final void testRemoveRange$kotlin_stdlib(int fromIndex, int toIndex) {
        removeRange(fromIndex, toIndex);
    }

    /* JADX INFO: compiled from: ArrayDeque.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/ArrayDeque$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }
    }

    public final void internalStructure$kotlin_stdlib(@NotNull Function2<? super Integer, ? super Object[], Unit> structure) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        int tail = positiveMod(this.head + size());
        int head = (isEmpty() || this.head < tail) ? this.head : this.head - this.elementData.length;
        structure.invoke(Integer.valueOf(head), toArray());
    }
}
