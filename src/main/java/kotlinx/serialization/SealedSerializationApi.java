package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.RequiresOptIn;
import kotlin.annotation.MustBeDocumented;

/* JADX INFO: compiled from: ApiLevels.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/SealedSerializationApi.class */
@Target({})
@MustBeDocumented
@kotlin.annotation.Target(allowedTargets = {})
@RequiresOptIn(message = "This class or interface should not be inherited/implemented outside of kotlinx.serialization library. Note it is still permitted to use it directly. Read its documentation about inheritance for details.", level = RequiresOptIn.Level.ERROR)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface SealedSerializationApi {
}
