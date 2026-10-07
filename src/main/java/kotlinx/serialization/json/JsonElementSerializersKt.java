package kotlinx.serialization.json;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/JsonElementSerializersKt.class */
public final class JsonElementSerializersKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void verify(Encoder encoder) {
        asJsonEncoder(encoder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void verify(Decoder decoder) {
        asJsonDecoder(decoder);
    }

    @NotNull
    public static final JsonDecoder asJsonDecoder(@NotNull Decoder $this$asJsonDecoder) {
        Intrinsics.checkNotNullParameter($this$asJsonDecoder, "<this>");
        JsonDecoder jsonDecoder = $this$asJsonDecoder instanceof JsonDecoder ? (JsonDecoder) $this$asJsonDecoder : null;
        if (jsonDecoder == null) {
            throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + Reflection.getOrCreateKotlinClass($this$asJsonDecoder.getClass()));
        }
        return jsonDecoder;
    }

    @NotNull
    public static final JsonEncoder asJsonEncoder(@NotNull Encoder $this$asJsonEncoder) {
        Intrinsics.checkNotNullParameter($this$asJsonEncoder, "<this>");
        JsonEncoder jsonEncoder = $this$asJsonEncoder instanceof JsonEncoder ? (JsonEncoder) $this$asJsonEncoder : null;
        if (jsonEncoder == null) {
            throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + Reflection.getOrCreateKotlinClass($this$asJsonEncoder.getClass()));
        }
        return jsonEncoder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SerialDescriptor defer(Function0<? extends SerialDescriptor> deferred) {
        return new SerialDescriptor(deferred) { // from class: kotlinx.serialization.json.JsonElementSerializersKt.defer.1
            private final Lazy original$delegate;

            {
                this.original$delegate = LazyKt.lazy(deferred);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public boolean isNullable() {
                return super.isNullable();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public boolean isInline() {
                return super.isInline();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public List<Annotation> getAnnotations() {
                return super.getAnnotations();
            }

            private final SerialDescriptor getOriginal() {
                return (SerialDescriptor) this.original$delegate.getValue();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public String getSerialName() {
                return getOriginal().getSerialName();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public SerialKind getKind() {
                return getOriginal().getKind();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public int getElementsCount() {
                return getOriginal().getElementsCount();
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public String getElementName(int index) {
                return getOriginal().getElementName(index);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public int getElementIndex(String name) {
                Intrinsics.checkNotNullParameter(name, "name");
                return getOriginal().getElementIndex(name);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public List<Annotation> getElementAnnotations(int index) {
                return getOriginal().getElementAnnotations(index);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public SerialDescriptor getElementDescriptor(int index) {
                return getOriginal().getElementDescriptor(index);
            }

            @Override // kotlinx.serialization.descriptors.SerialDescriptor
            public boolean isElementOptional(int index) {
                return getOriginal().isElementOptional(index);
            }
        };
    }
}
