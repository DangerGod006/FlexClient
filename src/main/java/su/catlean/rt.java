package su.catlean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:su/catlean/rt.class */
public final class rt {
    private rt() {
    }

    @NotNull
    public final KSerializer k() {
        return j();
    }

    private final KSerializer j() {
        return (KSerializer) d1.o().getValue();
    }

    public rt(DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
