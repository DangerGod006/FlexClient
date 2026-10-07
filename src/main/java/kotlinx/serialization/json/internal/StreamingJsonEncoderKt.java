package kotlinx.serialization.json.internal;

import java.util.Set;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElementKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StreamingJsonEncoder.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/StreamingJsonEncoderKt.class */
public final class StreamingJsonEncoderKt {

    @NotNull
    private static final Set<SerialDescriptor> unsignedNumberDescriptors = SetsKt.setOf((Object[]) new SerialDescriptor[]{BuiltinSerializersKt.serializer(UInt.Companion).getDescriptor(), BuiltinSerializersKt.serializer(ULong.Companion).getDescriptor(), BuiltinSerializersKt.serializer(UByte.Companion).getDescriptor(), BuiltinSerializersKt.serializer(UShort.Companion).getDescriptor()});

    public static final boolean isUnsignedNumber(@NotNull SerialDescriptor $this$isUnsignedNumber) {
        Intrinsics.checkNotNullParameter($this$isUnsignedNumber, "<this>");
        return $this$isUnsignedNumber.isInline() && unsignedNumberDescriptors.contains($this$isUnsignedNumber);
    }

    public static final boolean isUnquotedLiteral(@NotNull SerialDescriptor $this$isUnquotedLiteral) {
        Intrinsics.checkNotNullParameter($this$isUnquotedLiteral, "<this>");
        return $this$isUnquotedLiteral.isInline() && Intrinsics.areEqual($this$isUnquotedLiteral, JsonElementKt.getJsonUnquotedLiteralDescriptor());
    }
}
