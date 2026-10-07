package kotlinx.serialization.json.internal;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: ArrayPools.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/json/internal/ArrayPoolsKt.class */
public final class ArrayPoolsKt {
    private static final int MAX_CHARS_IN_POOL;

    static {
        Object objM185constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            objM185constructorimpl = Result.m185constructorimpl(property != null ? StringsKt.toIntOrNull(property) : null);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM185constructorimpl = Result.m185constructorimpl(ResultKt.createFailure(th));
        }
        Object obj = objM185constructorimpl;
        Integer num = (Integer) (Result.m179isFailureimpl(obj) ? null : obj);
        MAX_CHARS_IN_POOL = num != null ? num.intValue() : 2097152;
    }
}
