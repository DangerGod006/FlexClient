package kotlinx.serialization.json.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WriteMode.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/WriteModeKt.class */
public final class WriteModeKt {
    @NotNull
    public static final WriteMode switchMode(@NotNull Json $this$switchMode, @NotNull SerialDescriptor desc) {
        Intrinsics.checkNotNullParameter($this$switchMode, "<this>");
        Intrinsics.checkNotNullParameter(desc, "desc");
        SerialKind kind = desc.getKind();
        if (kind instanceof PolymorphicKind) {
            return WriteMode.POLY_OBJ;
        }
        if (Intrinsics.areEqual(kind, StructureKind.LIST.INSTANCE)) {
            return WriteMode.LIST;
        }
        if (!Intrinsics.areEqual(kind, StructureKind.MAP.INSTANCE)) {
            return WriteMode.OBJ;
        }
        SerialDescriptor keyDescriptor$iv = carrierDescriptor(desc.getElementDescriptor(0), $this$switchMode.getSerializersModule());
        SerialKind keyKind$iv = keyDescriptor$iv.getKind();
        if ((keyKind$iv instanceof PrimitiveKind) || Intrinsics.areEqual(keyKind$iv, SerialKind.ENUM.INSTANCE)) {
            return WriteMode.MAP;
        }
        if ($this$switchMode.getConfiguration().getAllowStructuredMapKeys()) {
            return WriteMode.LIST;
        }
        throw JsonExceptionsKt.InvalidKeyKindException(keyDescriptor$iv);
    }

    public static final <T, R1 extends T, R2 extends T> T selectMapMode(@NotNull Json json, @NotNull SerialDescriptor mapDescriptor, @NotNull Function0<? extends R1> ifMap, @NotNull Function0<? extends R2> ifList) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        Intrinsics.checkNotNullParameter(mapDescriptor, "mapDescriptor");
        Intrinsics.checkNotNullParameter(ifMap, "ifMap");
        Intrinsics.checkNotNullParameter(ifList, "ifList");
        SerialDescriptor serialDescriptorCarrierDescriptor = carrierDescriptor(mapDescriptor.getElementDescriptor(0), json.getSerializersModule());
        SerialKind kind = serialDescriptorCarrierDescriptor.getKind();
        if ((kind instanceof PrimitiveKind) || Intrinsics.areEqual(kind, SerialKind.ENUM.INSTANCE)) {
            return ifMap.invoke();
        }
        if (json.getConfiguration().getAllowStructuredMapKeys()) {
            return ifList.invoke();
        }
        throw JsonExceptionsKt.InvalidKeyKindException(serialDescriptorCarrierDescriptor);
    }

    @NotNull
    public static final SerialDescriptor carrierDescriptor(@NotNull SerialDescriptor $this$carrierDescriptor, @NotNull SerializersModule module) {
        Intrinsics.checkNotNullParameter($this$carrierDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(module, "module");
        if (!Intrinsics.areEqual($this$carrierDescriptor.getKind(), SerialKind.CONTEXTUAL.INSTANCE)) {
            return $this$carrierDescriptor.isInline() ? carrierDescriptor($this$carrierDescriptor.getElementDescriptor(0), module) : $this$carrierDescriptor;
        }
        SerialDescriptor contextualDescriptor = ContextAwareKt.getContextualDescriptor(module, $this$carrierDescriptor);
        if (contextualDescriptor != null) {
            SerialDescriptor serialDescriptorCarrierDescriptor = carrierDescriptor(contextualDescriptor, module);
            if (serialDescriptorCarrierDescriptor != null) {
                return serialDescriptorCarrierDescriptor;
            }
        }
        return $this$carrierDescriptor;
    }
}
