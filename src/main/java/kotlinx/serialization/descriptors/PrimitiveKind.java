package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SerialKinds.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/PrimitiveKind.class */
public abstract class PrimitiveKind extends SerialKind {
    public /* synthetic */ PrimitiveKind(DefaultConstructorMarker $constructor_marker) {
        this();
    }

    private PrimitiveKind() {
        super(null);
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/PrimitiveKind$BOOLEAN.class */
    public static final class BOOLEAN extends PrimitiveKind {

        @NotNull
        public static final BOOLEAN INSTANCE = new BOOLEAN();

        private BOOLEAN() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/PrimitiveKind$BYTE.class */
    public static final class BYTE extends PrimitiveKind {

        @NotNull
        public static final BYTE INSTANCE = new BYTE();

        private BYTE() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/PrimitiveKind$CHAR.class */
    public static final class CHAR extends PrimitiveKind {

        @NotNull
        public static final CHAR INSTANCE = new CHAR();

        private CHAR() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/PrimitiveKind$SHORT.class */
    public static final class SHORT extends PrimitiveKind {

        @NotNull
        public static final SHORT INSTANCE = new SHORT();

        private SHORT() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/PrimitiveKind$INT.class */
    public static final class INT extends PrimitiveKind {

        @NotNull
        public static final INT INSTANCE = new INT();

        private INT() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/PrimitiveKind$LONG.class */
    public static final class LONG extends PrimitiveKind {

        @NotNull
        public static final LONG INSTANCE = new LONG();

        private LONG() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/PrimitiveKind$FLOAT.class */
    public static final class FLOAT extends PrimitiveKind {

        @NotNull
        public static final FLOAT INSTANCE = new FLOAT();

        private FLOAT() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/PrimitiveKind$DOUBLE.class */
    public static final class DOUBLE extends PrimitiveKind {

        @NotNull
        public static final DOUBLE INSTANCE = new DOUBLE();

        private DOUBLE() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/PrimitiveKind$STRING.class */
    public static final class STRING extends PrimitiveKind {

        @NotNull
        public static final STRING INSTANCE = new STRING();

        private STRING() {
            super(null);
        }
    }
}
