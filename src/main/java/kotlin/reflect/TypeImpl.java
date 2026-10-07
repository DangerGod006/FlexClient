package kotlin.reflect;

import java.lang.reflect.Type;
import kotlin.ExperimentalStdlibApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/reflect/TypeImpl.class */
@ExperimentalStdlibApi
interface TypeImpl extends Type {
    @NotNull
    String getTypeName();
}
