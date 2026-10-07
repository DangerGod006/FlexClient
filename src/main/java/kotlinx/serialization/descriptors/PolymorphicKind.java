package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.ExperimentalSerializationApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SerialKinds.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/PolymorphicKind.class */
@ExperimentalSerializationApi
public abstract class PolymorphicKind extends SerialKind {
    public /* synthetic */ PolymorphicKind(DefaultConstructorMarker $constructor_marker) {
        this();
    }

    private PolymorphicKind() {
        super(null);
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/PolymorphicKind$SEALED.class */
    public static final class SEALED extends PolymorphicKind {

        @NotNull
        public static final SEALED INSTANCE = new SEALED();

        private SEALED() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/PolymorphicKind$OPEN.class */
    public static final class OPEN extends PolymorphicKind {

        @NotNull
        public static final OPEN INSTANCE = new OPEN();

        private OPEN() {
            super(null);
        }
    }
}
