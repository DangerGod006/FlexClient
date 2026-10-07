package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SerializersModule.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/modules/SerializersModule.class */
public abstract class SerializersModule {
    @ExperimentalSerializationApi
    @Nullable
    public abstract <T> KSerializer<T> getContextual(@NotNull KClass<T> kClass, @NotNull List<? extends KSerializer<?>> list);

    @ExperimentalSerializationApi
    @Nullable
    public abstract <T> SerializationStrategy<T> getPolymorphic(@NotNull KClass<? super T> kClass, @NotNull T t);

    @ExperimentalSerializationApi
    @Nullable
    public abstract <T> DeserializationStrategy<T> getPolymorphic(@NotNull KClass<? super T> kClass, @Nullable String str);

    @ExperimentalSerializationApi
    public abstract void dumpTo(@NotNull SerializersModuleCollector serializersModuleCollector);

    public abstract boolean getHasInterfaceContextualSerializers$kotlinx_serialization_core();

    @InternalSerializationApi
    public static /* synthetic */ void getHasInterfaceContextualSerializers$kotlinx_serialization_core$annotations() {
    }

    public /* synthetic */ SerializersModule(DefaultConstructorMarker $constructor_marker) {
        this();
    }

    private SerializersModule() {
    }

    @Deprecated(message = "Deprecated in favor of overload with default parameter", replaceWith = @ReplaceWith(expression = "getContextual(kclass)", imports = {}), level = DeprecationLevel.HIDDEN)
    @ExperimentalSerializationApi
    public final /* synthetic */ KSerializer getContextual(KClass kclass) {
        Intrinsics.checkNotNullParameter(kclass, "kclass");
        return getContextual(kclass, CollectionsKt.emptyList());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KSerializer getContextual$default(SerializersModule serializersModule, KClass kClass, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        return serializersModule.getContextual(kClass, list);
    }
}
