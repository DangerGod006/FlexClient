package kotlinx.serialization;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.MustBeDocumented;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Annotations.kt */
/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/EncodeDefault.class */
@Target({})
@MustBeDocumented
@ExperimentalSerializationApi
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.PROPERTY})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface EncodeDefault {

    /* JADX INFO: compiled from: Annotations.kt */
    /* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:kotlinx/serialization/EncodeDefault$Mode.class */
    @ExperimentalSerializationApi
    public enum Mode {
        ALWAYS,
        NEVER;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries($VALUES);

        @NotNull
        public static EnumEntries<Mode> getEntries() {
            return $ENTRIES;
        }
    }

    Mode mode() default Mode.ALWAYS;
}
