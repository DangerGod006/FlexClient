package kotlinx.serialization.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/EnumDescriptor.class */
@PublishedApi
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {

    @NotNull
    private final SerialKind kind;

    @NotNull
    private final Lazy elementDescriptors$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumDescriptor(@NotNull String name, int elementsCount) {
        super(name, null, elementsCount, 2, null);
        Intrinsics.checkNotNullParameter(name, "name");
        this.kind = SerialKind.ENUM.INSTANCE;
        this.elementDescriptors$delegate = LazyKt.lazy(() -> {
            return elementDescriptors_delegate$lambda$0(r1, r2, r3);
        });
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialKind getKind() {
        return this.kind;
    }

    private final SerialDescriptor[] getElementDescriptors() {
        return (SerialDescriptor[]) this.elementDescriptors$delegate.getValue();
    }

    private static final SerialDescriptor[] elementDescriptors_delegate$lambda$0(int $elementsCount, String $name, EnumDescriptor this$0) {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[$elementsCount];
        for (int i = 0; i < $elementsCount; i++) {
            int i2 = i;
            serialDescriptorArr[i2] = SerialDescriptorsKt.buildSerialDescriptor$default($name + '.' + this$0.getElementName(i2), StructureKind.OBJECT.INSTANCE, new SerialDescriptor[0], null, 8, null);
        }
        return serialDescriptorArr;
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor, kotlinx.serialization.descriptors.SerialDescriptor
    @NotNull
    public SerialDescriptor getElementDescriptor(int index) {
        return getElementDescriptors()[index];
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return other != null && (other instanceof SerialDescriptor) && ((SerialDescriptor) other).getKind() == SerialKind.ENUM.INSTANCE && Intrinsics.areEqual(getSerialName(), ((SerialDescriptor) other).getSerialName()) && Intrinsics.areEqual(Platform_commonKt.cachedSerialNames(this), Platform_commonKt.cachedSerialNames((SerialDescriptor) other));
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(SerialDescriptorKt.getElementNames(this), ", ", getSerialName() + '(', ")", 0, null, null, 56, null);
    }

    @Override // kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
    public int hashCode() {
        int result = getSerialName().hashCode();
        int accumulator$iv$iv = 1;
        for (Object element$iv$iv : SerialDescriptorKt.getElementNames(this)) {
            int hash$iv = accumulator$iv$iv;
            String it = (String) element$iv$iv;
            accumulator$iv$iv = (31 * hash$iv) + (it != null ? it.hashCode() : 0);
        }
        int elementsHashCode = accumulator$iv$iv;
        return (31 * result) + elementsHashCode;
    }
}
