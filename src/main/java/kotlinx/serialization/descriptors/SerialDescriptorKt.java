package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SerialDescriptor.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/SerialDescriptorKt.class */
public final class SerialDescriptorKt {
    @NotNull
    public static final Iterable<SerialDescriptor> getElementDescriptors(@NotNull SerialDescriptor $this$elementDescriptors) {
        Intrinsics.checkNotNullParameter($this$elementDescriptors, "<this>");
        return new SerialDescriptorKt$special$$inlined$Iterable$1($this$elementDescriptors);
    }

    @NotNull
    public static final Iterable<String> getElementNames(@NotNull SerialDescriptor $this$elementNames) {
        Intrinsics.checkNotNullParameter($this$elementNames, "<this>");
        return new SerialDescriptorKt$special$$inlined$Iterable$2($this$elementNames);
    }
}
