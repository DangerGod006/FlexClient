package org.intellij.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.jetbrains.annotations.NonNls;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:org/intellij/lang/annotations/Language.class */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.CLASS)
public @interface Language {
    @NonNls
    String value();

    @NonNls
    String prefix() default "";

    @NonNls
    String suffix() default "";
}
