package kotlinx.serialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.internal.InternalHexConverter;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SerialFormat.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/SerialFormatKt.class */
public final class SerialFormatKt {
    public static final /* synthetic */ <T> String encodeToString(StringFormat $this$encodeToString, T value) {
        Intrinsics.checkNotNullParameter($this$encodeToString, "<this>");
        SerializersModule serializersModule = $this$encodeToString.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return $this$encodeToString.encodeToString(SerializersKt.serializer(serializersModule, (KType) null), value);
    }

    public static final /* synthetic */ <T> T decodeFromString(StringFormat stringFormat, String string) {
        Intrinsics.checkNotNullParameter(stringFormat, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        SerializersModule serializersModule = stringFormat.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) stringFormat.decodeFromString(SerializersKt.serializer(serializersModule, (KType) null), string);
    }

    @NotNull
    public static final <T> String encodeToHexString(@NotNull BinaryFormat $this$encodeToHexString, @NotNull SerializationStrategy<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter($this$encodeToHexString, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        return InternalHexConverter.INSTANCE.printHexBinary($this$encodeToHexString.encodeToByteArray(serializer, value), true);
    }

    public static final <T> T decodeFromHexString(@NotNull BinaryFormat binaryFormat, @NotNull DeserializationStrategy<? extends T> deserializer, @NotNull String hex) {
        Intrinsics.checkNotNullParameter(binaryFormat, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(hex, "hex");
        return (T) binaryFormat.decodeFromByteArray(deserializer, InternalHexConverter.INSTANCE.parseHexBinary(hex));
    }

    public static final /* synthetic */ <T> String encodeToHexString(BinaryFormat $this$encodeToHexString, T value) {
        Intrinsics.checkNotNullParameter($this$encodeToHexString, "<this>");
        SerializersModule serializersModule = $this$encodeToHexString.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return encodeToHexString($this$encodeToHexString, SerializersKt.serializer(serializersModule, (KType) null), value);
    }

    public static final /* synthetic */ <T> T decodeFromHexString(BinaryFormat binaryFormat, String hex) {
        Intrinsics.checkNotNullParameter(binaryFormat, "<this>");
        Intrinsics.checkNotNullParameter(hex, "hex");
        SerializersModule serializersModule = binaryFormat.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) decodeFromHexString(binaryFormat, SerializersKt.serializer(serializersModule, (KType) null), hex);
    }

    public static final /* synthetic */ <T> byte[] encodeToByteArray(BinaryFormat $this$encodeToByteArray, T value) {
        Intrinsics.checkNotNullParameter($this$encodeToByteArray, "<this>");
        SerializersModule serializersModule = $this$encodeToByteArray.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return $this$encodeToByteArray.encodeToByteArray(SerializersKt.serializer(serializersModule, (KType) null), value);
    }

    public static final /* synthetic */ <T> T decodeFromByteArray(BinaryFormat binaryFormat, byte[] bytes) {
        Intrinsics.checkNotNullParameter(binaryFormat, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        SerializersModule serializersModule = binaryFormat.getSerializersModule();
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall("kotlinx.serialization.serializer.withModule");
        return (T) binaryFormat.decodeFromByteArray(SerializersKt.serializer(serializersModule, (KType) null), bytes);
    }
}
