package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TreeJsonEncoder.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/TreeJsonEncoderKt.class */
public final class TreeJsonEncoderKt {

    @NotNull
    public static final String PRIMITIVE_TAG = "primitive";

    @JsonFriendModuleApi
    @NotNull
    public static final <T> JsonElement writeJson(@NotNull Json json, T t, @NotNull SerializationStrategy<? super T> serializer) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        new JsonTreeEncoder(json, (v1) -> {
            return writeJson$lambda$0(r3, v1);
        }).encodeSerializableValue(serializer, t);
        if (objectRef.element != null) {
            return (JsonElement) objectRef.element;
        }
        Intrinsics.throwUninitializedPropertyAccessException("result");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Unit writeJson$lambda$0(Ref.ObjectRef $result, JsonElement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $result.element = it;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getRequiresTopLevelTag(SerialDescriptor $this$requiresTopLevelTag) {
        return ($this$requiresTopLevelTag.getKind() instanceof PrimitiveKind) || $this$requiresTopLevelTag.getKind() == SerialKind.ENUM.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T extends JsonElement> T cast(JsonElement value, String serialName, Function0<String> path) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.reifiedOperationMarker(3, "T");
        if (!(value instanceof JsonElement)) {
            StringBuilder sbAppend = new StringBuilder().append("Expected ");
            Intrinsics.reifiedOperationMarker(4, "T");
            throw JsonExceptionsKt.JsonDecodingException(-1, sbAppend.append(Reflection.getOrCreateKotlinClass(JsonElement.class).getSimpleName()).append(", but had ").append(Reflection.getOrCreateKotlinClass(value.getClass()).getSimpleName()).append(" as the serialized body of ").append(serialName).append(" at element: ").append(path.invoke()).toString(), value.toString());
        }
        return value;
    }
}
