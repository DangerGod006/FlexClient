package kotlin.jvm.internal;

import java.lang.reflect.Type;
import kotlin.SinceKotlin;
import kotlin.reflect.KType;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KTypeBase.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/jvm/internal/KTypeBase.class */
@SinceKotlin(version = "1.4")
public interface KTypeBase extends KType {
    @Nullable
    Type getJavaType();
}
