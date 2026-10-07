package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/MapLikeDescriptor.class */
public abstract class MapLikeDescriptor implements SerialDescriptor {

    @NotNull
    private final String serialName;

    @NotNull
    private final SerialDescriptor keyDescriptor;

    @NotNull
    private final SerialDescriptor valueDescriptor;
    private final int elementsCount;

    public /* synthetic */ MapLikeDescriptor(String serialName, SerialDescriptor keyDescriptor, SerialDescriptor valueDescriptor, DefaultConstructorMarker $constructor_marker) {
        this(serialName, keyDescriptor, valueDescriptor);
    }

    private MapLikeDescriptor(String serialName, SerialDescriptor keyDescriptor, SerialDescriptor valueDescriptor) {
        this.serialName = serialName;
        this.keyDescriptor = keyDescriptor;
        this.valueDescriptor = valueDescriptor;
        this.elementsCount = 2;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isNullable() {
        return super.isNullable();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isInline() {
        return super.isInline();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getAnnotations() {
        return super.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getSerialName() {
        return this.serialName;
    }

    @NotNull
    public final SerialDescriptor getKeyDescriptor() {
        return this.keyDescriptor;
    }

    @NotNull
    public final SerialDescriptor getValueDescriptor() {
        return this.valueDescriptor;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialKind getKind() {
        return StructureKind.MAP.INSTANCE;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public String getElementName(int index) {
        return String.valueOf(index);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public int getElementIndex(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public boolean isElementOptional(int index) {
        if (!(index >= 0)) {
            throw new IllegalArgumentException(("Illegal index " + index + ", " + getSerialName() + " expects only non-negative indices").toString());
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public List<Annotation> getElementAnnotations(int index) {
        if (!(index >= 0)) {
            throw new IllegalArgumentException(("Illegal index " + index + ", " + getSerialName() + " expects only non-negative indices").toString());
        }
        return CollectionsKt.emptyList();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int index) {
        if (!(index >= 0)) {
            throw new IllegalArgumentException(("Illegal index " + index + ", " + getSerialName() + " expects only non-negative indices").toString());
        }
        switch (index % 2) {
            case 0:
                return this.keyDescriptor;
            case 1:
                return this.valueDescriptor;
            default:
                throw new IllegalStateException("Unreached".toString());
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MapLikeDescriptor) && Intrinsics.areEqual(getSerialName(), ((MapLikeDescriptor) other).getSerialName()) && Intrinsics.areEqual(this.keyDescriptor, ((MapLikeDescriptor) other).keyDescriptor) && Intrinsics.areEqual(this.valueDescriptor, ((MapLikeDescriptor) other).valueDescriptor);
    }

    public int hashCode() {
        int result = getSerialName().hashCode();
        return (31 * ((31 * result) + this.keyDescriptor.hashCode())) + this.valueDescriptor.hashCode();
    }

    @NotNull
    public String toString() {
        return getSerialName() + '(' + this.keyDescriptor + ", " + this.valueDescriptor + ')';
    }
}
