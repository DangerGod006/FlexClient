package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SerialKinds.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/StructureKind.class */
public abstract class StructureKind extends SerialKind {
    public /* synthetic */ StructureKind(DefaultConstructorMarker $constructor_marker) {
        this();
    }

    private StructureKind() {
        super(null);
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/StructureKind$CLASS.class */
    public static final class CLASS extends StructureKind {

        @NotNull
        public static final CLASS INSTANCE = new CLASS();

        private CLASS() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/StructureKind$LIST.class */
    public static final class LIST extends StructureKind {

        @NotNull
        public static final LIST INSTANCE = new LIST();

        private LIST() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/StructureKind$MAP.class */
    public static final class MAP extends StructureKind {

        @NotNull
        public static final MAP INSTANCE = new MAP();

        private MAP() {
            super(null);
        }
    }

    /* JADX INFO: compiled from: SerialKinds.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/descriptors/StructureKind$OBJECT.class */
    public static final class OBJECT extends StructureKind {

        @NotNull
        public static final OBJECT INSTANCE = new OBJECT();

        private OBJECT() {
            super(null);
        }
    }
}
