package kotlin;

import kotlin.internal.InlineOnly;

/* JADX INFO: compiled from: HashCode.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/HashCodeKt.class */
public final class HashCodeKt {
    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final int hashCode(Object $this$hashCode) {
        if ($this$hashCode != null) {
            return $this$hashCode.hashCode();
        }
        return 0;
    }
}
