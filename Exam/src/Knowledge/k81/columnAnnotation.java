package Knowledge.k81;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface columnAnnotation {
    String columnName() default "";
    String type() default "";
    int length() default 0;
}