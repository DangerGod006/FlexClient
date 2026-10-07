package kotlin.reflect;

import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KProperty.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/KProperty.class */
public interface KProperty<V> extends KCallable<V> {

    /* JADX INFO: compiled from: KProperty.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/KProperty$Accessor.class */
    public interface Accessor<V> {
        @NotNull
        KProperty<V> getProperty();
    }

    /* JADX INFO: compiled from: KProperty.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/KProperty$DefaultImpls.class */
    public static final class DefaultImpls {
        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isLateinit$annotations() {
        }

        @SinceKotlin(version = "1.1")
        public static /* synthetic */ void isConst$annotations() {
        }
    }

    /* JADX INFO: compiled from: KProperty.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/KProperty$Getter.class */
    public interface Getter<V> extends Accessor<V>, KFunction<V> {
    }

    boolean isLateinit();

    boolean isConst();

    @NotNull
    Getter<V> getGetter();
}
