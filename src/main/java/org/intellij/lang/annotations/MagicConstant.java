package org.intellij.lang.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: CatLean-Client-Mod-Fabric-1.21.11.jar:org/intellij/lang/annotations/MagicConstant.class */
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
public @interface MagicConstant {
    long[] intValues() default {};

    String[] stringValues() default {};

    long[] flags() default {};

    Class valuesFromClass() default void.class;

    Class flagsFromClass() default void.class;
}
