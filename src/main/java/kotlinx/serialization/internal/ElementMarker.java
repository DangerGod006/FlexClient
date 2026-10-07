package kotlinx.serialization.internal;

import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ElementMarker.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/ElementMarker.class */
@CoreFriendModuleApi
public final class ElementMarker {

    @NotNull
    private final SerialDescriptor descriptor;

    @NotNull
    private final Function2<SerialDescriptor, Integer, Boolean> readIfAbsent;
    private long lowerMarks;

    @NotNull
    private final long[] highMarksArray;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final long[] EMPTY_HIGH_MARKS = new long[0];

    /* JADX WARN: Multi-variable type inference failed */
    public ElementMarker(@NotNull SerialDescriptor descriptor, @NotNull Function2<? super SerialDescriptor, ? super Integer, Boolean> readIfAbsent) {
        long j;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.descriptor = descriptor;
        this.readIfAbsent = readIfAbsent;
        int elementsCount = this.descriptor.getElementsCount();
        if (elementsCount <= 64) {
            if (elementsCount == 64) {
                j = 0;
            } else {
                j = (-1) << elementsCount;
            }
            this.lowerMarks = j;
            this.highMarksArray = EMPTY_HIGH_MARKS;
            return;
        }
        this.lowerMarks = 0L;
        this.highMarksArray = prepareHighMarksArray(elementsCount);
    }

    /* JADX INFO: compiled from: ElementMarker.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/ElementMarker$Companion.class */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }
    }

    public final void mark(int index) {
        if (index < 64) {
            this.lowerMarks |= 1 << index;
        } else {
            markHigh(index);
        }
    }

    public final int nextUnmarkedIndex() {
        int elementsCount = this.descriptor.getElementsCount();
        while (this.lowerMarks != -1) {
            int index = Long.numberOfTrailingZeros(this.lowerMarks ^ (-1));
            this.lowerMarks |= 1 << index;
            if (this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(index)).booleanValue()) {
                return index;
            }
        }
        if (elementsCount > 64) {
            return nextUnmarkedHighIndex();
        }
        return -1;
    }

    private final long[] prepareHighMarksArray(int elementsCount) {
        int slotsCount = (elementsCount - 1) >>> 6;
        int elementsInLastSlot = elementsCount & 63;
        long[] highMarks = new long[slotsCount];
        if (elementsInLastSlot != 0) {
            highMarks[ArraysKt.getLastIndex(highMarks)] = (-1) << elementsCount;
        }
        return highMarks;
    }

    private final void markHigh(int index) {
        int slot = (index >>> 6) - 1;
        int offsetInSlot = index & 63;
        this.highMarksArray[slot] = this.highMarksArray[slot] | (1 << offsetInSlot);
    }

    private final int nextUnmarkedHighIndex() {
        int length = this.highMarksArray.length;
        for (int slot = 0; slot < length; slot++) {
            int slotOffset = (slot + 1) * 64;
            long slotMarks = this.highMarksArray[slot];
            while (slotMarks != -1) {
                int indexInSlot = Long.numberOfTrailingZeros(slotMarks ^ (-1));
                slotMarks |= 1 << indexInSlot;
                int index = slotOffset + indexInSlot;
                if (this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(index)).booleanValue()) {
                    this.highMarksArray[slot] = slotMarks;
                    return index;
                }
            }
            this.highMarksArray[slot] = slotMarks;
        }
        return -1;
    }
}
