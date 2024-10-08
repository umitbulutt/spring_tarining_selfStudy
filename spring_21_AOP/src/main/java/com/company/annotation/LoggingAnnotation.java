package com.company.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD})       // it is meaning I can put this annotation top of the method
@Retention(RetentionPolicy.RUNTIME)
public @interface LoggingAnnotation{
}
