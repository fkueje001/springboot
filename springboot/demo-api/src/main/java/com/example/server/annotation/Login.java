package com.example.server.annotation;

import java.lang.annotation.*;

/**
 * @author : nangua
 * date:   2018-07-02 09:56
 * @description:
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Login {
    int type() default 1;
}
