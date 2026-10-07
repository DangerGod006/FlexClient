package kotlinx.serialization.builtins;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ExperimentalTime;
import kotlin.time.Instant;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.LongSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InstantComponentSerializer.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/builtins/InstantComponentSerializer.class */
@ExperimentalTime
public final class InstantComponentSerializer implements KSerializer<Instant> {

    @NotNull
    public static final InstantComponentSerializer INSTANCE = new InstantComponentSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("kotlinx.serialization.InstantComponentSerializer", new SerialDescriptor[0], InstantComponentSerializer::descriptor$lambda$0);

    private InstantComponentSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    private static final Unit descriptor$lambda$0(ClassSerialDescriptorBuilder buildClassSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
        List<? extends Annotation> listEmptyList = CollectionsKt.emptyList();
        SerialDescriptor descriptor$iv = LongSerializer.INSTANCE.getDescriptor();
        buildClassSerialDescriptor.element("epochSeconds", descriptor$iv, listEmptyList, false);
        List<? extends Annotation> listEmptyList2 = CollectionsKt.emptyList();
        SerialDescriptor descriptor$iv2 = LongSerializer.INSTANCE.getDescriptor();
        buildClassSerialDescriptor.element("nanosecondsOfSecond", descriptor$iv2, listEmptyList2, true);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    /* JADX INFO: renamed from: deserialize */
    public Instant mo1886deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor$iv = getDescriptor();
        CompositeDecoder composite$iv = decoder.beginStructure(descriptor$iv);
        boolean epochSecondsNotSeen = true;
        long epochSeconds = 0;
        int nanosecondsOfSecond = 0;
        while (true) {
            int index = composite$iv.decodeElementIndex(INSTANCE.getDescriptor());
            switch (index) {
                case -1:
                    if (epochSecondsNotSeen) {
                        throw new MissingFieldException("epochSeconds", INSTANCE.getDescriptor().getSerialName());
                    }
                    Instant instantFromEpochSeconds = Instant.Companion.fromEpochSeconds(epochSeconds, nanosecondsOfSecond);
                    composite$iv.endStructure(descriptor$iv);
                    return instantFromEpochSeconds;
                case 0:
                    epochSecondsNotSeen = false;
                    epochSeconds = composite$iv.decodeLongElement(INSTANCE.getDescriptor(), 0);
                    break;
                case 1:
                    nanosecondsOfSecond = composite$iv.decodeIntElement(INSTANCE.getDescriptor(), 1);
                    break;
                default:
                    throw new SerializationException("Unexpected index: " + index);
            }
        }
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull Instant value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor descriptor$iv = getDescriptor();
        CompositeEncoder composite$iv = encoder.beginStructure(descriptor$iv);
        composite$iv.encodeLongElement(INSTANCE.getDescriptor(), 0, value.getEpochSeconds());
        if (value.getNanosecondsOfSecond() != 0 || composite$iv.shouldEncodeElementDefault(INSTANCE.getDescriptor(), 1)) {
            composite$iv.encodeIntElement(INSTANCE.getDescriptor(), 1, value.getNanosecondsOfSecond());
        }
        composite$iv.endStructure(descriptor$iv);
    }
}
