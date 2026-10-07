package kotlinx.serialization.internal;

import java.lang.Enum;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.PublishedApi;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Enums.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/internal/EnumSerializer.class */
@PublishedApi
public final class EnumSerializer<T extends Enum<T>> implements KSerializer<T> {

    @NotNull
    private final T[] values;

    @Nullable
    private SerialDescriptor overriddenDescriptor;

    @NotNull
    private final Lazy descriptor$delegate;

    public EnumSerializer(@NotNull String serialName, @NotNull T[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = values;
        this.descriptor$delegate = LazyKt.lazy(() -> {
            return descriptor_delegate$lambda$0(r1, r2);
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumSerializer(@NotNull String serialName, @NotNull T[] values, @NotNull SerialDescriptor descriptor) {
        this(serialName, values);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.overriddenDescriptor = descriptor;
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    @NotNull
    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor$delegate.getValue();
    }

    private static final SerialDescriptor descriptor_delegate$lambda$0(EnumSerializer this$0, String $serialName) {
        SerialDescriptor serialDescriptor = this$0.overriddenDescriptor;
        return serialDescriptor == null ? this$0.createUnmarkedDescriptor($serialName) : serialDescriptor;
    }

    private final SerialDescriptor createUnmarkedDescriptor(String serialName) {
        EnumDescriptor d = new EnumDescriptor(serialName, this.values.length);
        for (T t : this.values) {
            PluginGeneratedSerialDescriptor.addElement$default(d, t.name(), false, 2, null);
        }
        return d;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public void serialize(@NotNull Encoder encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        int index = ArraysKt.indexOf(this.values, value);
        if (index == -1) {
            StringBuilder sbAppend = new StringBuilder().append(value).append(" is not a valid enum ").append(getDescriptor().getSerialName()).append(", must be one of ");
            String string = Arrays.toString(this.values);
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            throw new SerializationException(sbAppend.append(string).toString());
        }
        encoder.encodeEnum(getDescriptor(), index);
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    @NotNull
    /* JADX INFO: renamed from: deserialize */
    public T mo1886deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int index = decoder.decodeEnum(getDescriptor());
        boolean z = 0 <= index && index < this.values.length;
        if (!z) {
            throw new SerializationException(index + " is not among valid " + getDescriptor().getSerialName() + " enum values, values size is " + this.values.length);
        }
        return this.values[index];
    }

    @NotNull
    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().getSerialName() + '>';
    }
}
