package ge.agrotech.apiutils;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Required {
    MapElement[] value() default {};
    @interface MapElement {
        RequestMethodType key() default RequestMethodType.GET;
        String[] fields() default {};
    }
}
