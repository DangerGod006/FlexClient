package kotlin.jvm.functions;

import kotlin.Function;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.FunctionBase;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FunctionN.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlin/jvm/functions/FunctionN.class */
@SinceKotlin(version = "1.3")
public interface FunctionN<R> extends Function<R>, FunctionBase<R> {
    R invoke(@NotNull Object... objArr);

    @Override // kotlin.jvm.internal.FunctionBase
    int getArity();
}
