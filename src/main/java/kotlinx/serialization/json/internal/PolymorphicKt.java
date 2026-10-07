package kotlinx.serialization.json.internal;

import java.lang.annotation.Annotation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.JsonInternalDependenciesKt;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonClassDiscriminator;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonEncoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Polymorphic.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/PolymorphicKt.class */
public final class PolymorphicKt {

    /* JADX INFO: compiled from: Polymorphic.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/PolymorphicKt$WhenMappings.class */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClassDiscriminatorMode.values().length];
            try {
                iArr[ClassDiscriminatorMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[ClassDiscriminatorMode.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[ClassDiscriminatorMode.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void encodePolymorphically(@NotNull JsonEncoder $this$encodePolymorphically, @NotNull SerializationStrategy<? super T> serializer, T value, @NotNull Function2<? super String, ? super String, Unit> ifPolymorphic) {
        boolean z;
        SerializationStrategy<? super T> serializationStrategy;
        Intrinsics.checkNotNullParameter($this$encodePolymorphically, "<this>");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(ifPolymorphic, "ifPolymorphic");
        if ($this$encodePolymorphically.getJson().getConfiguration().getUseArrayPolymorphism()) {
            serializer.serialize($this$encodePolymorphically, value);
            return;
        }
        boolean isPolymorphicSerializer = serializer instanceof AbstractPolymorphicSerializer;
        if (isPolymorphicSerializer) {
            z = $this$encodePolymorphically.getJson().getConfiguration().getClassDiscriminatorMode() != ClassDiscriminatorMode.NONE;
        } else {
            switch (WhenMappings.$EnumSwitchMapping$0[$this$encodePolymorphically.getJson().getConfiguration().getClassDiscriminatorMode().ordinal()]) {
                case 1:
                case 2:
                    z = false;
                    break;
                case 3:
                    SerialKind it = serializer.getDescriptor().getKind();
                    z = Intrinsics.areEqual(it, StructureKind.CLASS.INSTANCE) || Intrinsics.areEqual(it, StructureKind.OBJECT.INSTANCE);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        boolean needDiscriminator = z;
        String baseClassDiscriminator = needDiscriminator ? classDiscriminator(serializer.getDescriptor(), $this$encodePolymorphically.getJson()) : null;
        if (isPolymorphicSerializer) {
            AbstractPolymorphicSerializer casted = (AbstractPolymorphicSerializer) serializer;
            if (value == 0) {
                throw new IllegalArgumentException(("Value for serializer " + ((AbstractPolymorphicSerializer) serializer).getDescriptor() + " should always be non-null. Please report issue to the kotlinx.serialization tracker.").toString());
            }
            SerializationStrategy<? super T> serializationStrategyFindPolymorphicSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(casted, $this$encodePolymorphically, value);
            if (baseClassDiscriminator != null) {
                validateIfSealed(serializer, serializationStrategyFindPolymorphicSerializer, baseClassDiscriminator);
                checkKind(serializationStrategyFindPolymorphicSerializer.getDescriptor().getKind());
            }
            Intrinsics.checkNotNull(serializationStrategyFindPolymorphicSerializer, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>");
            serializationStrategy = serializationStrategyFindPolymorphicSerializer;
        } else {
            serializationStrategy = serializer;
        }
        SerializationStrategy<? super T> serializationStrategy2 = serializationStrategy;
        if (baseClassDiscriminator != null) {
            ifPolymorphic.invoke(baseClassDiscriminator, serializationStrategy2.getDescriptor().getSerialName());
        }
        serializationStrategy2.serialize($this$encodePolymorphically, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void validateIfSealed(SerializationStrategy<?> serializer, SerializationStrategy<?> actualSerializer, String classDiscriminator) {
        if ((serializer instanceof SealedClassSerializer) && JsonInternalDependenciesKt.jsonCachedSerialNames(actualSerializer.getDescriptor()).contains(classDiscriminator)) {
            String baseName = ((SealedClassSerializer) serializer).getDescriptor().getSerialName();
            String actualName = actualSerializer.getDescriptor().getSerialName();
            throw new IllegalStateException(("Sealed class '" + actualName + "' cannot be serialized as base class '" + baseName + "' because it has property name that conflicts with JSON class discriminator '" + classDiscriminator + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }

    public static final void checkKind(@NotNull SerialKind kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind instanceof SerialKind.ENUM) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (kind instanceof PrimitiveKind) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (kind instanceof PolymorphicKind) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> T decodeSerializableValuePolymorphic(@org.jetbrains.annotations.NotNull kotlinx.serialization.json.JsonDecoder r5, @org.jetbrains.annotations.NotNull kotlinx.serialization.DeserializationStrategy<? extends T> r6, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.String> r7) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic(kotlinx.serialization.json.JsonDecoder, kotlinx.serialization.DeserializationStrategy, kotlin.jvm.functions.Function0):java.lang.Object");
    }

    @NotNull
    public static final String classDiscriminator(@NotNull SerialDescriptor $this$classDiscriminator, @NotNull Json json) {
        Intrinsics.checkNotNullParameter($this$classDiscriminator, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : $this$classDiscriminator.getAnnotations()) {
            if (annotation instanceof JsonClassDiscriminator) {
                return ((JsonClassDiscriminator) annotation).discriminator();
            }
        }
        return json.getConfiguration().getClassDiscriminator();
    }

    @NotNull
    public static final Void throwJsonElementPolymorphicException(@Nullable String serialName, @NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        throw new JsonEncodingException("Class with serial name " + serialName + " cannot be serialized polymorphically because it is represented as " + Reflection.getOrCreateKotlinClass(element.getClass()).getSimpleName() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }
}
