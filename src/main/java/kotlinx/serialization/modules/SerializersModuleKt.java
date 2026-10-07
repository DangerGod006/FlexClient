package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.modules.ContextualProvider;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/modules/SerializersModuleKt.class */
public final class SerializersModuleKt {

    @NotNull
    private static final SerializersModule EmptySerializersModule = new SerialModuleImpl(MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), MapsKt.emptyMap(), false);

    @Deprecated(message = "Deprecated in the favour of 'EmptySerializersModule()'", replaceWith = @ReplaceWith(expression = "EmptySerializersModule()", imports = {}), level = DeprecationLevel.WARNING)
    public static /* synthetic */ void getEmptySerializersModule$annotations() {
    }

    @NotNull
    public static final SerializersModule getEmptySerializersModule() {
        return EmptySerializersModule;
    }

    @NotNull
    public static final SerializersModule plus(@NotNull SerializersModule $this$plus, @NotNull SerializersModule other) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        SerializersModuleBuilder builder$iv = new SerializersModuleBuilder();
        builder$iv.include($this$plus);
        builder$iv.include(other);
        return builder$iv.build();
    }

    @NotNull
    public static final SerializersModule overwriteWith(@NotNull SerializersModule $this$overwriteWith, @NotNull SerializersModule other) {
        Intrinsics.checkNotNullParameter($this$overwriteWith, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        final SerializersModuleBuilder builder$iv = new SerializersModuleBuilder();
        builder$iv.include($this$overwriteWith);
        other.dumpTo(new SerializersModuleCollector() { // from class: kotlinx.serialization.modules.SerializersModuleKt$overwriteWith$1$1
            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            @Deprecated(message = "Deprecated in favor of function with more precise name: polymorphicDefaultDeserializer", replaceWith = @ReplaceWith(expression = "polymorphicDefaultDeserializer(baseClass, defaultDeserializerProvider)", imports = {}), level = DeprecationLevel.WARNING)
            public <Base> void polymorphicDefault(KClass<Base> baseClass, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
                super.polymorphicDefault(baseClass, defaultDeserializerProvider);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <T> void contextual(KClass<T> kClass, KSerializer<T> serializer) {
                Intrinsics.checkNotNullParameter(kClass, "kClass");
                Intrinsics.checkNotNullParameter(serializer, "serializer");
                builder$iv.registerSerializer(kClass, new ContextualProvider.Argless(serializer), true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <T> void contextual(KClass<T> kClass, Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
                Intrinsics.checkNotNullParameter(kClass, "kClass");
                Intrinsics.checkNotNullParameter(provider, "provider");
                builder$iv.registerSerializer(kClass, new ContextualProvider.WithTypeArguments(provider), true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <Base, Sub extends Base> void polymorphic(KClass<Base> baseClass, KClass<Sub> actualClass, KSerializer<Sub> actualSerializer) {
                Intrinsics.checkNotNullParameter(baseClass, "baseClass");
                Intrinsics.checkNotNullParameter(actualClass, "actualClass");
                Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
                builder$iv.registerPolymorphicSerializer(baseClass, actualClass, actualSerializer, true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <Base> void polymorphicDefaultSerializer(KClass<Base> baseClass, Function1<? super Base, ? extends SerializationStrategy<? super Base>> defaultSerializerProvider) {
                Intrinsics.checkNotNullParameter(baseClass, "baseClass");
                Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
                builder$iv.registerDefaultPolymorphicSerializer(baseClass, defaultSerializerProvider, true);
            }

            @Override // kotlinx.serialization.modules.SerializersModuleCollector
            public <Base> void polymorphicDefaultDeserializer(KClass<Base> baseClass, Function1<? super String, ? extends DeserializationStrategy<? extends Base>> defaultDeserializerProvider) {
                Intrinsics.checkNotNullParameter(baseClass, "baseClass");
                Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
                builder$iv.registerDefaultPolymorphicDeserializer(baseClass, defaultDeserializerProvider, true);
            }
        });
        return builder$iv.build();
    }
}
