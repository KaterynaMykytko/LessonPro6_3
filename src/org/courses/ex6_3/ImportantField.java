package org.courses.ex6_3;

import java.lang.annotation.*;

@Documented
@Inherited
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ImportantField {

    int priority() default 4;

}
