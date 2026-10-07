package kotlinx.serialization.json.internal;

import java.util.Arrays;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: JsonPath.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/JsonPath.class */
public final class JsonPath {

    @NotNull
    private Object[] currentObjectPath = new Object[8];

    @NotNull
    private int[] indicies;
    private int currentDepth;

    public JsonPath() {
        int[] iArr = new int[8];
        for (int i = 0; i < 8; i++) {
            iArr[i] = -1;
        }
        this.indicies = iArr;
        this.currentDepth = -1;
    }

    /* JADX INFO: compiled from: JsonPath.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/JsonPath$Tombstone.class */
    private static final class Tombstone {

        @NotNull
        public static final Tombstone INSTANCE = new Tombstone();

        private Tombstone() {
        }
    }

    public final void pushDescriptor(@NotNull SerialDescriptor sd) {
        Intrinsics.checkNotNullParameter(sd, "sd");
        this.currentDepth++;
        int depth = this.currentDepth;
        if (depth == this.currentObjectPath.length) {
            resize();
        }
        this.currentObjectPath[depth] = sd;
    }

    public final void updateDescriptorIndex(int index) {
        this.indicies[this.currentDepth] = index;
    }

    public final void updateCurrentMapKey(@Nullable Object key) {
        if (this.indicies[this.currentDepth] != -2) {
            this.currentDepth++;
            if (this.currentDepth == this.currentObjectPath.length) {
                resize();
            }
        }
        this.currentObjectPath[this.currentDepth] = key;
        this.indicies[this.currentDepth] = -2;
    }

    public final void resetCurrentMapKey() {
        if (this.indicies[this.currentDepth] == -2) {
            this.currentObjectPath[this.currentDepth] = Tombstone.INSTANCE;
        }
    }

    public final void popDescriptor() {
        int depth = this.currentDepth;
        if (this.indicies[depth] == -2) {
            this.indicies[depth] = -1;
            this.currentDepth--;
        }
        if (this.currentDepth != -1) {
            this.currentDepth--;
        }
    }

    @NotNull
    public final String getPath() {
        StringBuilder $this$getPath_u24lambda_u241 = new StringBuilder();
        $this$getPath_u24lambda_u241.append("$");
        int i = this.currentDepth + 1;
        for (int i2 = 0; i2 < i; i2++) {
            int it = i2;
            Object element = this.currentObjectPath[it];
            if (element instanceof SerialDescriptor) {
                if (Intrinsics.areEqual(((SerialDescriptor) element).getKind(), StructureKind.LIST.INSTANCE)) {
                    if (this.indicies[it] != -1) {
                        $this$getPath_u24lambda_u241.append("[");
                        $this$getPath_u24lambda_u241.append(this.indicies[it]);
                        $this$getPath_u24lambda_u241.append("]");
                    }
                } else {
                    int idx = this.indicies[it];
                    if (idx >= 0) {
                        $this$getPath_u24lambda_u241.append(".");
                        $this$getPath_u24lambda_u241.append(((SerialDescriptor) element).getElementName(idx));
                    }
                }
            } else if (element != Tombstone.INSTANCE) {
                $this$getPath_u24lambda_u241.append("[");
                $this$getPath_u24lambda_u241.append("'");
                $this$getPath_u24lambda_u241.append(element);
                $this$getPath_u24lambda_u241.append("'");
                $this$getPath_u24lambda_u241.append("]");
            }
        }
        return $this$getPath_u24lambda_u241.toString();
    }

    private final String prettyString(Object it) {
        SerialDescriptor serialDescriptor = it instanceof SerialDescriptor ? (SerialDescriptor) it : null;
        if (serialDescriptor != null) {
            String serialName = serialDescriptor.getSerialName();
            if (serialName != null) {
                return serialName;
            }
        }
        return String.valueOf(it);
    }

    private final void resize() {
        int newSize = this.currentDepth * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.currentObjectPath, newSize);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        this.currentObjectPath = objArrCopyOf;
        int[] newIndices = new int[newSize];
        for (int i = 0; i < newSize; i++) {
            newIndices[i] = -1;
        }
        ArraysKt.copyInto$default(this.indicies, newIndices, 0, 0, 0, 14, (Object) null);
        this.indicies = newIndices;
    }

    @NotNull
    public String toString() {
        return getPath();
    }
}
