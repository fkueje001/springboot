package com.example.provider.annotation;

import java.lang.annotation.*;

/**
 * @author : nangua
 * date:   2018-07-02 10:16
 * @description:
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoginUser {
}
