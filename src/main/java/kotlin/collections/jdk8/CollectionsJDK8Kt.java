package kotlin.collections.jdk8;

import java.util.Map;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/collections/jdk8/CollectionsJDK8Kt.class */
@JvmName(name = "CollectionsJDK8Kt")
public final class CollectionsJDK8Kt {
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final <K, V> V getOrDefault(Map<? extends K, ? extends V> $this$getOrDefault, K key, V defaultValue) {
        Intrinsics.checkNotNullParameter($this$getOrDefault, "<this>");
        return $this$getOrDefault.getOrDefault(key, defaultValue);
    }

    @SinceKotlin(version = "1.2")
    @InlineOnly
    private static final <K, V> boolean remove(Map<? extends K, ? extends V> $this$remove, K key, V value) {
        Intrinsics.checkNotNullParameter($this$remove, "<this>");
        return TypeIntrinsics.asMutableMap($this$remove).remove(key, value);
    }
}
