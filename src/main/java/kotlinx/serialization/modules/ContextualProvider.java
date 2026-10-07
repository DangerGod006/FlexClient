package kotlinx.serialization.modules;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/modules/ContextualProvider.class */
public abstract class ContextualProvider {
    @NotNull
    public abstract KSerializer<?> invoke(@NotNull List<? extends KSerializer<?>> list);

    public /* synthetic */ ContextualProvider(DefaultConstructorMarker $constructor_marker) {
        this();
    }

    private ContextualProvider() {
    }

    /* JADX INFO: compiled from: SerializersModule.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/modules/ContextualProvider$Argless.class */
    public static final class Argless extends ContextualProvider {

        @NotNull
        private final KSerializer<?> serializer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Argless(@NotNull KSerializer<?> serializer) {
            super(null);
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            this.serializer = serializer;
        }

        @NotNull
        public final KSerializer<?> getSerializer() {
            return this.serializer;
        }

        @Override // kotlinx.serialization.modules.ContextualProvider
        @NotNull
        public KSerializer<?> invoke(@NotNull List<? extends KSerializer<?>> typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.serializer;
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof Argless) && Intrinsics.areEqual(((Argless) other).serializer, this.serializer);
        }

        public int hashCode() {
            return this.serializer.hashCode();
        }
    }

    /* JADX INFO: compiled from: SerializersModule.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/modules/ContextualProvider$WithTypeArguments.class */
    public static final class WithTypeArguments extends ContextualProvider {

        @NotNull
        private final Function1<List<? extends KSerializer<?>>, KSerializer<?>> provider;

        @NotNull
        public final Function1<List<? extends KSerializer<?>>, KSerializer<?>> getProvider() {
            return this.provider;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public WithTypeArguments(@NotNull Function1<? super List<? extends KSerializer<?>>, ? extends KSerializer<?>> provider) {
            super(null);
            Intrinsics.checkNotNullParameter(provider, "provider");
            this.provider = provider;
        }

        @Override // kotlinx.serialization.modules.ContextualProvider
        @NotNull
        public KSerializer<?> invoke(@NotNull List<? extends KSerializer<?>> typeArgumentsSerializers) {
            Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.provider.invoke(typeArgumentsSerializers);
        }
    }
}
