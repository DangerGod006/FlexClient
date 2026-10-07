package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Decoding.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/encoding/CompositeDecoder.class */
public interface CompositeDecoder {

    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int DECODE_DONE = -1;
    public static final int UNKNOWN_NAME = -3;

    @NotNull
    SerializersModule getSerializersModule();

    void endStructure(@NotNull SerialDescriptor serialDescriptor);

    int decodeElementIndex(@NotNull SerialDescriptor serialDescriptor);

    boolean decodeBooleanElement(@NotNull SerialDescriptor serialDescriptor, int i);

    byte decodeByteElement(@NotNull SerialDescriptor serialDescriptor, int i);

    char decodeCharElement(@NotNull SerialDescriptor serialDescriptor, int i);

    short decodeShortElement(@NotNull SerialDescriptor serialDescriptor, int i);

    int decodeIntElement(@NotNull SerialDescriptor serialDescriptor, int i);

    long decodeLongElement(@NotNull SerialDescriptor serialDescriptor, int i);

    float decodeFloatElement(@NotNull SerialDescriptor serialDescriptor, int i);

    double decodeDoubleElement(@NotNull SerialDescriptor serialDescriptor, int i);

    @NotNull
    String decodeStringElement(@NotNull SerialDescriptor serialDescriptor, int i);

    @NotNull
    Decoder decodeInlineElement(@NotNull SerialDescriptor serialDescriptor, int i);

    <T> T decodeSerializableElement(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull DeserializationStrategy<? extends T> deserializationStrategy, @Nullable T t);

    @ExperimentalSerializationApi
    @Nullable
    <T> T decodeNullableSerializableElement(@NotNull SerialDescriptor serialDescriptor, int i, @NotNull DeserializationStrategy<? extends T> deserializationStrategy, @Nullable T t);

    /* JADX INFO: compiled from: Decoding.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/encoding/CompositeDecoder$Companion.class */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DECODE_DONE = -1;
        public static final int UNKNOWN_NAME = -3;

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: Decoding.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/encoding/CompositeDecoder$DefaultImpls.class */
    public static final class DefaultImpls {
        @ExperimentalSerializationApi
        @Deprecated
        public static boolean decodeSequentially(@NotNull CompositeDecoder $this) {
            return $this.decodeSequentially();
        }

        @Deprecated
        public static int decodeCollectionSize(@NotNull CompositeDecoder $this, @NotNull SerialDescriptor descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return $this.decodeCollectionSize(descriptor);
        }
    }

    @ExperimentalSerializationApi
    default boolean decodeSequentially() {
        return false;
    }

    default int decodeCollectionSize(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return -1;
    }

    static /* synthetic */ Object decodeSerializableElement$default(CompositeDecoder compositeDecoder, SerialDescriptor serialDescriptor, int i, DeserializationStrategy deserializationStrategy, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
        }
        if ((i2 & 8) != 0) {
            obj = null;
        }
        return compositeDecoder.decodeSerializableElement(serialDescriptor, i, deserializationStrategy, obj);
    }

    static /* synthetic */ Object decodeNullableSerializableElement$default(CompositeDecoder compositeDecoder, SerialDescriptor serialDescriptor, int i, DeserializationStrategy deserializationStrategy, Object obj, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeNullableSerializableElement");
        }
        if ((i2 & 8) != 0) {
            obj = null;
        }
        return compositeDecoder.decodeNullableSerializableElement(serialDescriptor, i, deserializationStrategy, obj);
    }
}
