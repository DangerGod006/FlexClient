package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonEncoder;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.PolymorphicKt;
import kotlinx.serialization.modules.SerializersModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StreamingJsonEncoder.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/StreamingJsonEncoder.class */
public final class StreamingJsonEncoder extends AbstractEncoder implements JsonEncoder {

    @NotNull
    private final Composer composer;

    @NotNull
    private final Json json;

    @NotNull
    private final WriteMode mode;

    @Nullable
    private final JsonEncoder[] modeReuseCache;

    @NotNull
    private final SerializersModule serializersModule;

    @NotNull
    private final JsonConfiguration configuration;
    private boolean forceQuoting;

    @Nullable
    private String polymorphicDiscriminator;

    @Nullable
    private String polymorphicSerialName;

    /* JADX INFO: compiled from: StreamingJsonEncoder.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/StreamingJsonEncoder$WhenMappings.class */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WriteMode.values().length];
            try {
                iArr[WriteMode.LIST.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[WriteMode.MAP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[WriteMode.POLY_OBJ.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    @NotNull
    public Json getJson() {
        return this.json;
    }

    public StreamingJsonEncoder(@NotNull Composer composer, @NotNull Json json, @NotNull WriteMode mode, @Nullable JsonEncoder[] modeReuseCache) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.composer = composer;
        this.json = json;
        this.mode = mode;
        this.modeReuseCache = modeReuseCache;
        this.serializersModule = getJson().getSerializersModule();
        this.configuration = getJson().getConfiguration();
        int i = this.mode.ordinal();
        if (this.modeReuseCache == null) {
            return;
        }
        if (this.modeReuseCache[i] == null && this.modeReuseCache[i] == this) {
            return;
        }
        this.modeReuseCache[i] = this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StreamingJsonEncoder(@NotNull InternalJsonWriter output, @NotNull Json json, @NotNull WriteMode mode, @NotNull JsonEncoder[] modeReuseCache) {
        this(ComposersKt.Composer(output, json), json, mode, modeReuseCache);
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
    }

    @Override // kotlinx.serialization.encoding.Encoder, kotlinx.serialization.encoding.CompositeEncoder
    @NotNull
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }

    @Override // kotlinx.serialization.json.JsonEncoder
    public void encodeJsonElement(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        if (this.polymorphicDiscriminator != null && !(element instanceof JsonObject)) {
            PolymorphicKt.throwJsonElementPolymorphicException(this.polymorphicSerialName, element);
            throw new KotlinNothingValueException();
        }
        encodeSerializableValue(JsonElementSerializer.INSTANCE, element);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public boolean shouldEncodeElementDefault(@NotNull SerialDescriptor descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public <T> void encodeSerializableValue(@NotNull SerializationStrategy<? super T> serializer, T value) {
        boolean z;
        SerializationStrategy<? super T> serializationStrategy;
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        StreamingJsonEncoder $this$encodePolymorphically$iv = this;
        if ($this$encodePolymorphically$iv.getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize($this$encodePolymorphically$iv, value);
            return;
        }
        boolean isPolymorphicSerializer$iv = serializer instanceof AbstractPolymorphicSerializer;
        if (isPolymorphicSerializer$iv) {
            z = $this$encodePolymorphically$iv.getJson().getConfiguration().getClassDiscriminatorMode() != ClassDiscriminatorMode.NONE;
        } else {
            switch (PolymorphicKt.WhenMappings.$EnumSwitchMapping$0[$this$encodePolymorphically$iv.getJson().getConfiguration().getClassDiscriminatorMode().ordinal()]) {
                case 1:
                case 2:
                    z = false;
                    break;
                case 3:
                    SerialKind it$iv = serializer.getDescriptor().getKind();
                    z = Intrinsics.areEqual(it$iv, StructureKind.CLASS.INSTANCE) || Intrinsics.areEqual(it$iv, StructureKind.OBJECT.INSTANCE);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        boolean needDiscriminator$iv = z;
        String baseClassDiscriminator$iv = needDiscriminator$iv ? PolymorphicKt.classDiscriminator(serializer.getDescriptor(), $this$encodePolymorphically$iv.getJson()) : null;
        if (isPolymorphicSerializer$iv) {
            AbstractPolymorphicSerializer casted$iv = (AbstractPolymorphicSerializer) serializer;
            if (value == 0) {
                throw new IllegalArgumentException(("Value for serializer " + ((AbstractPolymorphicSerializer) serializer).getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            SerializationStrategy<? super T> serializationStrategyFindPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(casted$iv, $this$encodePolymorphically$iv, value);
            if (baseClassDiscriminator$iv != null) {
                PolymorphicKt.validateIfSealed(serializer, serializationStrategyFindPolymorphicSerializer, baseClassDiscriminator$iv);
                PolymorphicKt.checkKind(serializationStrategyFindPolymorphicSerializer.getDescriptor().getKind());
            }
            Intrinsics.checkNotNull(serializationStrategyFindPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializationStrategy = serializationStrategyFindPolymorphicSerializer;
        } else {
            serializationStrategy = serializer;
        }
        SerializationStrategy<? super T> serializationStrategy2 = serializationStrategy;
        if (baseClassDiscriminator$iv != null) {
            String serialName = serializationStrategy2.getDescriptor().getSerialName();
            this.polymorphicDiscriminator = baseClassDiscriminator$iv;
            this.polymorphicSerialName = serialName;
        }
        serializationStrategy2.serialize($this$encodePolymorphically$iv, value);
    }

    private final void encodeTypeInfo(String discriminator, String serialName) {
        this.composer.nextItem();
        encodeString(discriminator);
        this.composer.print(':');
        this.composer.space();
        encodeString(serialName);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    @NotNull
    public CompositeEncoder beginStructure(@NotNull SerialDescriptor descriptor) {
        JsonEncoder jsonEncoder;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        WriteMode newMode = WriteModeKt.switchMode(getJson(), descriptor);
        if (newMode.begin != 0) {
            this.composer.print(newMode.begin);
            this.composer.indent();
        }
        String discriminator = this.polymorphicDiscriminator;
        if (discriminator != null) {
            String serialName = this.polymorphicSerialName;
            if (serialName == null) {
                serialName = descriptor.getSerialName();
            }
            encodeTypeInfo(discriminator, serialName);
            this.polymorphicDiscriminator = null;
            this.polymorphicSerialName = null;
        }
        if (this.mode == newMode) {
            return this;
        }
        JsonEncoder[] jsonEncoderArr = this.modeReuseCache;
        return (jsonEncoderArr == null || (jsonEncoder = jsonEncoderArr[newMode.ordinal()]) == null) ? new StreamingJsonEncoder(this.composer, getJson(), newMode, this.modeReuseCache) : jsonEncoder;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public void endStructure(@NotNull SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.mode.end != 0) {
            this.composer.unIndent();
            this.composer.nextItemIfNotFirst();
            this.composer.print(this.mode.end);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder
    public boolean encodeElement(@NotNull SerialDescriptor descriptor, int index) {
        boolean z;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        switch (WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()]) {
            case 1:
                if (!this.composer.getWritingFirst()) {
                    this.composer.print(',');
                }
                this.composer.nextItem();
                break;
            case 2:
                if (!this.composer.getWritingFirst()) {
                    if (index % 2 == 0) {
                        this.composer.print(',');
                        this.composer.nextItem();
                        z = true;
                    } else {
                        this.composer.print(':');
                        this.composer.space();
                        z = false;
                    }
                    this.forceQuoting = z;
                } else {
                    this.forceQuoting = true;
                    this.composer.nextItem();
                }
                break;
            case 3:
                if (index == 0) {
                    this.forceQuoting = true;
                }
                if (index == 1) {
                    this.composer.print(',');
                    this.composer.space();
                    this.forceQuoting = false;
                }
                break;
            default:
                if (!this.composer.getWritingFirst()) {
                    this.composer.print(',');
                }
                this.composer.nextItem();
                encodeString(JsonNamesMapKt.getJsonElementName(descriptor, getJson(), index));
                this.composer.print(':');
                this.composer.space();
                break;
        }
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.CompositeEncoder
    public <T> void encodeNullableSerializableElement(@NotNull SerialDescriptor descriptor, int index, @NotNull SerializationStrategy<? super T> serializer, @Nullable T value) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (value != null || this.configuration.getExplicitNulls()) {
            super.encodeNullableSerializableElement(descriptor, index, serializer, value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    @NotNull
    public Encoder encodeInline(@NotNull SerialDescriptor descriptor) {
        ComposerForUnquotedLiterals composerForUnquotedLiterals;
        ComposerForUnsignedNumbers composerForUnsignedNumbers;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!StreamingJsonEncoderKt.isUnsignedNumber(descriptor)) {
            if (!StreamingJsonEncoderKt.isUnquotedLiteral(descriptor)) {
                if (this.polymorphicDiscriminator != null) {
                    StreamingJsonEncoder $this$encodeInline_u24lambda_u242 = this;
                    $this$encodeInline_u24lambda_u242.polymorphicSerialName = descriptor.getSerialName();
                    return this;
                }
                return super.encodeInline(descriptor);
            }
            if (this.composer instanceof ComposerForUnquotedLiterals) {
                composerForUnquotedLiterals = this.composer;
            } else {
                InternalJsonWriter p0 = this.composer.writer;
                boolean p1 = this.forceQuoting;
                composerForUnquotedLiterals = new ComposerForUnquotedLiterals(p0, p1);
            }
            return new StreamingJsonEncoder(composerForUnquotedLiterals, getJson(), this.mode, (JsonEncoder[]) null);
        }
        if (this.composer instanceof ComposerForUnsignedNumbers) {
            composerForUnsignedNumbers = this.composer;
        } else {
            InternalJsonWriter p02 = this.composer.writer;
            boolean p12 = this.forceQuoting;
            composerForUnsignedNumbers = new ComposerForUnsignedNumbers(p02, p12);
        }
        return new StreamingJsonEncoder(composerForUnsignedNumbers, getJson(), this.mode, (JsonEncoder[]) null);
    }

    private final /* synthetic */ <T extends Composer> T composerAs(Function2<? super InternalJsonWriter, ? super Boolean, ? extends T> function2) {
        Composer composer = this.composer;
        Intrinsics.reifiedOperationMarker(3, "T");
        return composer instanceof Composer ? (T) this.composer : function2.invoke(this.composer.writer, Boolean.valueOf(this.forceQuoting));
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeNull() {
        this.composer.print(AbstractJsonLexerKt.NULL);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeBoolean(boolean value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf((int) value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeShort(short value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf((int) value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeInt(int value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeLong(long value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.print(value);
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeFloat(float value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.print(value);
        }
        if (!this.configuration.getAllowSpecialFloatingPointValues()) {
            if (!(Math.abs(value) <= Float.MAX_VALUE)) {
                throw JsonExceptionsKt.InvalidFloatingPointEncoded(Float.valueOf(value), this.composer.writer.toString());
            }
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeDouble(double value) {
        if (this.forceQuoting) {
            encodeString(String.valueOf(value));
        } else {
            this.composer.print(value);
        }
        if (!this.configuration.getAllowSpecialFloatingPointValues()) {
            if (!(Math.abs(value) <= Double.MAX_VALUE)) {
                throw JsonExceptionsKt.InvalidFloatingPointEncoded(Double.valueOf(value), this.composer.writer.toString());
            }
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeChar(char value) {
        encodeString(String.valueOf(value));
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeString(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.composer.printQuoted(value);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeEnum(@NotNull SerialDescriptor enumDescriptor, int index) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        encodeString(enumDescriptor.getElementName(index));
    }
}
