package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialKind;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PluginGeneratedSerialDescriptor.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt.class */
public final class PluginGeneratedSerialDescriptorKt {
    public static final /* synthetic */ <SD extends SerialDescriptor> boolean equalsImpl(SD $this$equalsImpl, Object other, Function1<? super SD, Boolean> typeParamsAreEqual) {
        Intrinsics.checkNotNullParameter($this$equalsImpl, "<this>");
        Intrinsics.checkNotNullParameter(typeParamsAreEqual, "typeParamsAreEqual");
        if ($this$equalsImpl == other) {
            return true;
        }
        Intrinsics.reifiedOperationMarker(3, "SD");
        if (!(other instanceof SerialDescriptor) || !Intrinsics.areEqual($this$equalsImpl.getSerialName(), ((SerialDescriptor) other).getSerialName()) || !typeParamsAreEqual.invoke(other).booleanValue() || $this$equalsImpl.getElementsCount() != ((SerialDescriptor) other).getElementsCount()) {
            return false;
        }
        int elementsCount = $this$equalsImpl.getElementsCount();
        for (int index = 0; index < elementsCount; index++) {
            if (!Intrinsics.areEqual($this$equalsImpl.getElementDescriptor(index).getSerialName(), ((SerialDescriptor) other).getElementDescriptor(index).getSerialName()) || !Intrinsics.areEqual($this$equalsImpl.getElementDescriptor(index).getKind(), ((SerialDescriptor) other).getElementDescriptor(index).getKind())) {
                return false;
            }
        }
        return true;
    }

    public static final int hashCodeImpl(@NotNull SerialDescriptor $this$hashCodeImpl, @NotNull SerialDescriptor[] typeParams) {
        Intrinsics.checkNotNullParameter($this$hashCodeImpl, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int result = $this$hashCodeImpl.getSerialName().hashCode();
        int result2 = (31 * result) + Arrays.hashCode(typeParams);
        Iterable<SerialDescriptor> elementDescriptors = SerialDescriptorKt.getElementDescriptors($this$hashCodeImpl);
        int accumulator$iv$iv = 1;
        for (Object element$iv$iv : elementDescriptors) {
            int hash$iv = accumulator$iv$iv;
            int i = 31 * hash$iv;
            SerialDescriptor it = (SerialDescriptor) element$iv$iv;
            String serialName = it.getSerialName();
            accumulator$iv$iv = i + (serialName != null ? serialName.hashCode() : 0);
        }
        int namesHash = accumulator$iv$iv;
        int accumulator$iv$iv2 = 1;
        for (Object element$iv$iv2 : elementDescriptors) {
            int hash$iv2 = accumulator$iv$iv2;
            int i2 = 31 * hash$iv2;
            SerialDescriptor it2 = (SerialDescriptor) element$iv$iv2;
            SerialKind kind = it2.getKind();
            accumulator$iv$iv2 = i2 + (kind != null ? kind.hashCode() : 0);
        }
        int kindHash = accumulator$iv$iv2;
        return (31 * ((31 * result2) + namesHash)) + kindHash;
    }

    @NotNull
    public static final String toStringImpl(@NotNull SerialDescriptor $this$toStringImpl) {
        Intrinsics.checkNotNullParameter($this$toStringImpl, "<this>");
        return CollectionsKt.joinToString$default(RangesKt.until(0, $this$toStringImpl.getElementsCount()), ", ", $this$toStringImpl.getSerialName() + '(', ")", 0, null, (v1) -> {
            return toStringImpl$lambda$2(r6, v1);
        }, 24, null);
    }

    private static final CharSequence toStringImpl$lambda$2(SerialDescriptor $this_toStringImpl, int i) {
        return $this_toStringImpl.getElementName(i) + ": " + $this_toStringImpl.getElementDescriptor(i).getSerialName();
    }
}
